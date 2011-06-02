/*
 *  Copyright 2001-2011 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.beans;

import java.util.Map;

import org.joda.beans.impl.direct.DirectBean;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 * Mock JavaBean, used for testing.
 * This tests a generic ? property.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition
public class DocumentationHolder<T> extends DirectBean {

    /** The documentation. */
    @PropertyDefinition
    private Documentation<?> documentation;

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code DocumentationHolder}.
     * @param <R>  the bean's generic type
     * @return the meta-bean, not null
     */
    @SuppressWarnings("unchecked")
    public static <R> DocumentationHolder.Meta<R> meta() {
        return DocumentationHolder.Meta.INSTANCE;
    }

    @SuppressWarnings("unchecked")
    @Override
    public DocumentationHolder.Meta<T> metaBean() {
        return DocumentationHolder.Meta.INSTANCE;
    }

    @Override
    protected Object propertyGet(String propertyName) {
        switch (propertyName.hashCode()) {
            case 1587405498:  // documentation
                return getDocumentation();
        }
        return super.propertyGet(propertyName);
    }

    @Override
    protected void propertySet(String propertyName, Object newValue) {
        switch (propertyName.hashCode()) {
            case 1587405498:  // documentation
                setDocumentation((Documentation<?>) newValue);
                return;
        }
        super.propertySet(propertyName, newValue);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the documentation.
     * @return the value of the property
     */
    public Documentation<?> getDocumentation() {
        return documentation;
    }

    /**
     * Sets the documentation.
     * @param documentation  the new value of the property
     */
    public void setDocumentation(Documentation<?> documentation) {
        this.documentation = documentation;
    }

    /**
     * Gets the the {@code documentation} property.
     * @return the property, not null
     */
    public final Property<Documentation<?>> documentation() {
        return metaBean().documentation().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code DocumentationHolder}.
     */
    public static class Meta<T> extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        @SuppressWarnings("rawtypes")
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code documentation} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<Documentation<?>> documentation = DirectMetaProperty.ofReadWrite(this, "documentation", (Class) Documentation.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<Object>> map = new DirectMetaPropertyMap(
            this, null,
            "documentation");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 1587405498:  // documentation
                    return documentation;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public DocumentationHolder<T> createBean() {
            return new DocumentationHolder<T>();
        }

        @SuppressWarnings({"unchecked", "rawtypes" })
        @Override
        public Class<? extends DocumentationHolder<T>> beanType() {
            return (Class) DocumentationHolder.class;
        }

        @Override
        public Map<String, MetaProperty<Object>> metaPropertyMap() {
            return map;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code documentation} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Documentation<?>> documentation() {
            return documentation;
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
