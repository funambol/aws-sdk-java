/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetCrawler" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCrawlerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The metadata for the specified <code>Crawler</code>.
     * </p>
     */
    private Crawler crawler;

    /**
     * <p>
     * The metadata for the specified <code>Crawler</code>.
     * </p>
     * 
     * @param crawler
     *        The metadata for the specified <code>Crawler</code>.
     */

    public void setCrawler(Crawler crawler) {
        this.crawler = crawler;
    }

    /**
     * <p>
     * The metadata for the specified <code>Crawler</code>.
     * </p>
     * 
     * @return The metadata for the specified <code>Crawler</code>.
     */

    public Crawler getCrawler() {
        return this.crawler;
    }

    /**
     * <p>
     * The metadata for the specified <code>Crawler</code>.
     * </p>
     * 
     * @param crawler
     *        The metadata for the specified <code>Crawler</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCrawlerResult withCrawler(Crawler crawler) {
        setCrawler(crawler);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCrawler() != null)
            sb.append("Crawler: ").append(getCrawler());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCrawlerResult == false)
            return false;
        GetCrawlerResult other = (GetCrawlerResult) obj;
        if (other.getCrawler() == null ^ this.getCrawler() == null)
            return false;
        if (other.getCrawler() != null && other.getCrawler().equals(this.getCrawler()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrawler() == null) ? 0 : getCrawler().hashCode());
        return hashCode;
    }

    @Override
    public GetCrawlerResult clone() {
        try {
            return (GetCrawlerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}