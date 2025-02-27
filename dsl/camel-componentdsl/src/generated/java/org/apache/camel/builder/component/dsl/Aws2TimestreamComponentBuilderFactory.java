/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.processing.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.aws2.timestream.Timestream2Component;

/**
 * A Camel Amazon Web Services TimeStream component
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface Aws2TimestreamComponentBuilderFactory {

    /**
     * AWS Timestream (camel-aws2-timestream)
     * A Camel Amazon Web Services TimeStream component
     * 
     * Category: cloud,database
     * Since: 4.1
     * Maven coordinates: org.apache.camel:camel-aws2-timestream
     * 
     * @return the dsl builder
     */
    static Aws2TimestreamComponentBuilder aws2Timestream() {
        return new Aws2TimestreamComponentBuilderImpl();
    }

    /**
     * Builder for the AWS Timestream component.
     */
    interface Aws2TimestreamComponentBuilder
            extends
                ComponentBuilder<Timestream2Component> {
        /**
         * Component configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws2.timestream.Timestream2Configuration&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default Aws2TimestreamComponentBuilder configuration(
                org.apache.camel.component.aws2.timestream.Timestream2Configuration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default Aws2TimestreamComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The operation to perform. It can be
         * describeEndpoints,createBatchLoadTask,describeBatchLoadTask,
         * resumeBatchLoadTask,listBatchLoadTasks,createDatabase,deleteDatabase,describeDatabase,updateDatabase, listDatabases,createTable,deleteTable,describeTable,updateTable,listTables,writeRecords, createScheduledQuery,deleteScheduledQuery,executeScheduledQuery,updateScheduledQuery, describeScheduledQuery,listScheduledQueries,prepareQuery,query,cancelQuery.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws2.timestream.Timestream2Operations&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default Aws2TimestreamComponentBuilder operation(
                org.apache.camel.component.aws2.timestream.Timestream2Operations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Set the need for overidding the endpoint. This option needs to be
         * used in combination with uriEndpointOverride option.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param overrideEndpoint the value to set
         * @return the dsl builder
         */
        default Aws2TimestreamComponentBuilder overrideEndpoint(
                boolean overrideEndpoint) {
            doSetProperty("overrideEndpoint", overrideEndpoint);
            return this;
        }
        /**
         * If we want to use a POJO request as body or not.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param pojoRequest the value to set
         * @return the dsl builder
         */
        default Aws2TimestreamComponentBuilder pojoRequest(boolean pojoRequest) {
            doSetProperty("pojoRequest", pojoRequest);
            return this;
        }
        /**
         * If using a profile credentials provider this parameter will set the
         * profile name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param profileCredentialsName the value to set
         * @return the dsl builder
         */
        default Aws2TimestreamComponentBuilder profileCredentialsName(
                java.lang.String profileCredentialsName) {
            doSetProperty("profileCredentialsName", profileCredentialsName);
            return this;
        }
        /**
         * The region in which Timestream client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default Aws2TimestreamComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default Aws2TimestreamComponentBuilder trustAllCertificates(
                boolean trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * Set the overriding uri endpoint. This option needs to be used in
         * combination with overrideEndpoint option.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param uriEndpointOverride the value to set
         * @return the dsl builder
         */
        default Aws2TimestreamComponentBuilder uriEndpointOverride(
                java.lang.String uriEndpointOverride) {
            doSetProperty("uriEndpointOverride", uriEndpointOverride);
            return this;
        }
        /**
         * Set whether the Timestream client should expect to load credentials
         * through a default credentials provider or to expect static
         * credentials to be passed in.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default Aws2TimestreamComponentBuilder useDefaultCredentialsProvider(
                boolean useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
        /**
         * Set whether the Timestream client should expect to load credentials
         * through a profile credentials provider.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useProfileCredentialsProvider the value to set
         * @return the dsl builder
         */
        default Aws2TimestreamComponentBuilder useProfileCredentialsProvider(
                boolean useProfileCredentialsProvider) {
            doSetProperty("useProfileCredentialsProvider", useProfileCredentialsProvider);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default Aws2TimestreamComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * To use a existing configured AwsTimestreamQueryClient as client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.services.timestreamquery.TimestreamQueryClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param awsTimestreamQueryClient the value to set
         * @return the dsl builder
         */
        default Aws2TimestreamComponentBuilder awsTimestreamQueryClient(
                software.amazon.awssdk.services.timestreamquery.TimestreamQueryClient awsTimestreamQueryClient) {
            doSetProperty("awsTimestreamQueryClient", awsTimestreamQueryClient);
            return this;
        }
        /**
         * To use a existing configured AwsTimestreamWriteClient as client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.services.timestreamwrite.TimestreamWriteClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param awsTimestreamWriteClient the value to set
         * @return the dsl builder
         */
        default Aws2TimestreamComponentBuilder awsTimestreamWriteClient(
                software.amazon.awssdk.services.timestreamwrite.TimestreamWriteClient awsTimestreamWriteClient) {
            doSetProperty("awsTimestreamWriteClient", awsTimestreamWriteClient);
            return this;
        }
        /**
         * Used for enabling or disabling all consumer based health checks from
         * this component.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: health
         * 
         * @param healthCheckConsumerEnabled the value to set
         * @return the dsl builder
         */
        default Aws2TimestreamComponentBuilder healthCheckConsumerEnabled(
                boolean healthCheckConsumerEnabled) {
            doSetProperty("healthCheckConsumerEnabled", healthCheckConsumerEnabled);
            return this;
        }
        /**
         * Used for enabling or disabling all producer based health checks from
         * this component. Notice: Camel has by default disabled all producer
         * based health-checks. You can turn on producer checks globally by
         * setting camel.health.producersEnabled=true.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: health
         * 
         * @param healthCheckProducerEnabled the value to set
         * @return the dsl builder
         */
        default Aws2TimestreamComponentBuilder healthCheckProducerEnabled(
                boolean healthCheckProducerEnabled) {
            doSetProperty("healthCheckProducerEnabled", healthCheckProducerEnabled);
            return this;
        }
        /**
         * To define a proxy host when instantiating the Timestream client.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default Aws2TimestreamComponentBuilder proxyHost(
                java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Timestream client.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default Aws2TimestreamComponentBuilder proxyPort(
                java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the Timestream client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.core.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: proxy
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default Aws2TimestreamComponentBuilder proxyProtocol(
                software.amazon.awssdk.core.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param accessKey the value to set
         * @return the dsl builder
         */
        default Aws2TimestreamComponentBuilder accessKey(
                java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default Aws2TimestreamComponentBuilder secretKey(
                java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    class Aws2TimestreamComponentBuilderImpl
            extends
                AbstractComponentBuilder<Timestream2Component>
            implements
                Aws2TimestreamComponentBuilder {
        @Override
        protected Timestream2Component buildConcreteComponent() {
            return new Timestream2Component();
        }
        private org.apache.camel.component.aws2.timestream.Timestream2Configuration getOrCreateConfiguration(
                org.apache.camel.component.aws2.timestream.Timestream2Component component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws2.timestream.Timestream2Configuration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "configuration": ((Timestream2Component) component).setConfiguration((org.apache.camel.component.aws2.timestream.Timestream2Configuration) value); return true;
            case "lazyStartProducer": ((Timestream2Component) component).setLazyStartProducer((boolean) value); return true;
            case "operation": getOrCreateConfiguration((Timestream2Component) component).setOperation((org.apache.camel.component.aws2.timestream.Timestream2Operations) value); return true;
            case "overrideEndpoint": getOrCreateConfiguration((Timestream2Component) component).setOverrideEndpoint((boolean) value); return true;
            case "pojoRequest": getOrCreateConfiguration((Timestream2Component) component).setPojoRequest((boolean) value); return true;
            case "profileCredentialsName": getOrCreateConfiguration((Timestream2Component) component).setProfileCredentialsName((java.lang.String) value); return true;
            case "region": getOrCreateConfiguration((Timestream2Component) component).setRegion((java.lang.String) value); return true;
            case "trustAllCertificates": getOrCreateConfiguration((Timestream2Component) component).setTrustAllCertificates((boolean) value); return true;
            case "uriEndpointOverride": getOrCreateConfiguration((Timestream2Component) component).setUriEndpointOverride((java.lang.String) value); return true;
            case "useDefaultCredentialsProvider": getOrCreateConfiguration((Timestream2Component) component).setUseDefaultCredentialsProvider((boolean) value); return true;
            case "useProfileCredentialsProvider": getOrCreateConfiguration((Timestream2Component) component).setUseProfileCredentialsProvider((boolean) value); return true;
            case "autowiredEnabled": ((Timestream2Component) component).setAutowiredEnabled((boolean) value); return true;
            case "awsTimestreamQueryClient": getOrCreateConfiguration((Timestream2Component) component).setAwsTimestreamQueryClient((software.amazon.awssdk.services.timestreamquery.TimestreamQueryClient) value); return true;
            case "awsTimestreamWriteClient": getOrCreateConfiguration((Timestream2Component) component).setAwsTimestreamWriteClient((software.amazon.awssdk.services.timestreamwrite.TimestreamWriteClient) value); return true;
            case "healthCheckConsumerEnabled": ((Timestream2Component) component).setHealthCheckConsumerEnabled((boolean) value); return true;
            case "healthCheckProducerEnabled": ((Timestream2Component) component).setHealthCheckProducerEnabled((boolean) value); return true;
            case "proxyHost": getOrCreateConfiguration((Timestream2Component) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((Timestream2Component) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((Timestream2Component) component).setProxyProtocol((software.amazon.awssdk.core.Protocol) value); return true;
            case "accessKey": getOrCreateConfiguration((Timestream2Component) component).setAccessKey((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((Timestream2Component) component).setSecretKey((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}