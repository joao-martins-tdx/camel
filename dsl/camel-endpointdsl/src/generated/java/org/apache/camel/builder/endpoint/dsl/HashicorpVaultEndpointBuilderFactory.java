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
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Manage secrets in Hashicorp Vault Service
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface HashicorpVaultEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Hashicorp Vault component.
     */
    public interface HashicorpVaultEndpointBuilder
            extends
                EndpointProducerBuilder {
        /**
         * Hashicorp Vault instance host to be used.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param host the value to set
         * @return the dsl builder
         */
        default HashicorpVaultEndpointBuilder host(String host) {
            doSetProperty("host", host);
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
        default HashicorpVaultEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default HashicorpVaultEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Operation to be performed.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.hashicorp.vault.HashicorpVaultOperation&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default HashicorpVaultEndpointBuilder operation(
                org.apache.camel.component.hashicorp.vault.HashicorpVaultOperation operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Operation to be performed.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.hashicorp.vault.HashicorpVaultOperation&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default HashicorpVaultEndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Hashicorp Vault instance port to be used.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: 8200
         * Group: producer
         * 
         * @param port the value to set
         * @return the dsl builder
         */
        default HashicorpVaultEndpointBuilder port(String port) {
            doSetProperty("port", port);
            return this;
        }
        /**
         * Hashicorp Vault instance scheme to be used.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: https
         * Group: producer
         * 
         * @param scheme the value to set
         * @return the dsl builder
         */
        default HashicorpVaultEndpointBuilder scheme(String scheme) {
            doSetProperty("scheme", scheme);
            return this;
        }
        /**
         * Hashicorp Vault instance secret Path to be used.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param secretPath the value to set
         * @return the dsl builder
         */
        default HashicorpVaultEndpointBuilder secretPath(String secretPath) {
            doSetProperty("secretPath", secretPath);
            return this;
        }
        /**
         * Instance of Vault template.
         * 
         * The option is a:
         * &lt;code&gt;org.springframework.vault.core.VaultTemplate&lt;/code&gt;
         * type.
         * 
         * Group: producer
         * 
         * @param vaultTemplate the value to set
         * @return the dsl builder
         */
        default HashicorpVaultEndpointBuilder vaultTemplate(
                org.springframework.vault.core.VaultTemplate vaultTemplate) {
            doSetProperty("vaultTemplate", vaultTemplate);
            return this;
        }
        /**
         * Instance of Vault template.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.springframework.vault.core.VaultTemplate&lt;/code&gt;
         * type.
         * 
         * Group: producer
         * 
         * @param vaultTemplate the value to set
         * @return the dsl builder
         */
        default HashicorpVaultEndpointBuilder vaultTemplate(String vaultTemplate) {
            doSetProperty("vaultTemplate", vaultTemplate);
            return this;
        }
        /**
         * Token to be used.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param token the value to set
         * @return the dsl builder
         */
        default HashicorpVaultEndpointBuilder token(String token) {
            doSetProperty("token", token);
            return this;
        }
    }

    public interface HashicorpVaultBuilders {
        /**
         * Hashicorp Vault (camel-hashicorp-vault)
         * Manage secrets in Hashicorp Vault Service
         * 
         * Category: cloud,cloud
         * Since: 3.18
         * Maven coordinates: org.apache.camel:camel-hashicorp-vault
         * 
         * Syntax: <code>hashicorp-vault:vaultName</code>
         * 
         * Path parameter: secretsEngine
         * Vault Name to be used
         * 
         * @param path vaultName
         * @return the dsl builder
         */
        default HashicorpVaultEndpointBuilder hashicorpVault(String path) {
            return HashicorpVaultEndpointBuilderFactory.endpointBuilder("hashicorp-vault", path);
        }
        /**
         * Hashicorp Vault (camel-hashicorp-vault)
         * Manage secrets in Hashicorp Vault Service
         * 
         * Category: cloud,cloud
         * Since: 3.18
         * Maven coordinates: org.apache.camel:camel-hashicorp-vault
         * 
         * Syntax: <code>hashicorp-vault:vaultName</code>
         * 
         * Path parameter: secretsEngine
         * Vault Name to be used
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path vaultName
         * @return the dsl builder
         */
        default HashicorpVaultEndpointBuilder hashicorpVault(
                String componentName,
                String path) {
            return HashicorpVaultEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static HashicorpVaultEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class HashicorpVaultEndpointBuilderImpl extends AbstractEndpointBuilder implements HashicorpVaultEndpointBuilder {
            public HashicorpVaultEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new HashicorpVaultEndpointBuilderImpl(path);
    }
}