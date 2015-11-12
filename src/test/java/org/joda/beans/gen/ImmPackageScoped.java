/*
 *  Copyright 2001-2014 Stephen Colebourne
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
package org.joda.beans.gen;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanDefinition;
import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 * Mock immutable package scoped bean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition(constructorScope = "package")
final class ImmPackageScoped implements ImmutableBean {

    @PropertyDefinition(validate = "notNull")
    private final String name;

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code ImmPackageScoped}.
     * @return the meta-bean, not null
     */
    public static ImmPackageScoped.Meta meta() {
        return ImmPackageScoped.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(ImmPackageScoped.Meta.INSTANCE);
    }

    /**
     * Returns a builder used to create an instance of the bean.
     * @return the builder, not null
     */
    public static ImmPackageScoped.Builder builder() {
        return new ImmPackageScoped.Builder();
    }

    /**
     * Creates an instance.
     * @param name  the value of the property, not null
     */
    ImmPackageScoped(
            String name) {
        JodaBeanUtils.notNull(name, "name");
        this.name = name;
    }

    @Override
    public ImmPackageScoped.Meta metaBean() {
        return ImmPackageScoped.Meta.INSTANCE;
    }

    @Override
    public <R> Property<R> property(String propertyName) {
        return metaBean().<R>metaProperty(propertyName).createProperty(this);
    }

    @Override
    public Set<String> propertyNames() {
        return metaBean().metaPropertyMap().keySet();
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the name.
     * @return the value of the property, not null
     */
    public String getName() {
        return name;
    }

    //-----------------------------------------------------------------------
    /**
     * Returns a builder that allows this bean to be mutated.
     * @return the mutable builder, not null
     */
    public Builder toBuilder() {
        return new Builder(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            ImmPackageScoped other = (ImmPackageScoped) obj;
            return JodaBeanUtils.equal(name, other.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(name);
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(64);
        buf.append("ImmPackageScoped{");
        buf.append("name").append('=').append(JodaBeanUtils.toString(name));
        buf.append('}');
        return buf.toString();
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code ImmPackageScoped}.
     */
    public static final class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code name} property.
         */
        private final MetaProperty<String> name = DirectMetaProperty.ofImmutable(
                this, "name", ImmPackageScoped.class, String.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "name");

        /**
         * Restricted constructor.
         */
        private Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 3373707:  // name
                    return name;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public ImmPackageScoped.Builder builder() {
            return new ImmPackageScoped.Builder();
        }

        @Override
        public Class<? extends ImmPackageScoped> beanType() {
            return ImmPackageScoped.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code name} property.
         * @return the meta-property, not null
         */
        public MetaProperty<String> name() {
            return name;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3373707:  // name
                    return ((ImmPackageScoped) bean).getName();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            metaProperty(propertyName);
            if (quiet) {
                return;
            }
            throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
        }

    }

    //-----------------------------------------------------------------------
    /**
     * The bean-builder for {@code ImmPackageScoped}.
     */
    public static final class Builder extends DirectFieldsBeanBuilder<ImmPackageScoped> {

        private String name;

        /**
         * Restricted constructor.
         */
        private Builder() {
        }

        /**
         * Restricted copy constructor.
         * @param beanToCopy  the bean to copy from, not null
         */
        private Builder(ImmPackageScoped beanToCopy) {
            this.name = beanToCopy.getName();
        }

        //-----------------------------------------------------------------------
        @Override
        public Object get(String propertyName) {
            switch (propertyName.hashCode()) {
                case 3373707:  // name
                    return name;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
        }

        @Override
        public Builder set(String propertyName, Object newValue) {
            switch (propertyName.hashCode()) {
                case 3373707:  // name
                    this.name = (String) newValue;
                    break;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
            return this;
        }

        @Override
        public Builder set(MetaProperty<?> property, Object value) {
            super.set(property, value);
            return this;
        }

        @Override
        public Builder setString(String propertyName, String value) {
            setString(meta().metaProperty(propertyName), value);
            return this;
        }

        @Override
        public Builder setString(MetaProperty<?> property, String value) {
            super.setString(property, value);
            return this;
        }

        @Override
        public Builder setAll(Map<String, ? extends Object> propertyValueMap) {
            super.setAll(propertyValueMap);
            return this;
        }

        @Override
        public ImmPackageScoped build() {
            return new ImmPackageScoped(
                    name);
        }

        //-----------------------------------------------------------------------
        /**
         * Sets the name.
         * @param name  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder name(String name) {
            JodaBeanUtils.notNull(name, "name");
            this.name = name;
            return this;
        }

        //-----------------------------------------------------------------------
        @Override
        public String toString() {
            StringBuilder buf = new StringBuilder(64);
            buf.append("ImmPackageScoped.Builder{");
            buf.append("name").append('=').append(JodaBeanUtils.toString(name));
            buf.append('}');
            return buf.toString();
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
