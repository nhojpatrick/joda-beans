/*
 *  Copyright 2001-present Stephen Colebourne
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
package org.joda.beans.sample;

import java.io.Serializable;
import java.util.Currency;
import java.util.List;
import java.util.NoSuchElementException;

import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.gen.BeanDefinition;
import org.joda.beans.gen.DerivedProperty;
import org.joda.beans.gen.PropertyDefinition;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.MinimalMetaBean;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;

/**
 * Mock minimal bean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition(style = "minimal", constructorScope = "package")
public final class MinimalImmutable implements ImmutableBean, Serializable {

    /**
     * The number.
     */
    @PropertyDefinition
    private final int number;
    /**
     * The number.
     */
    @PropertyDefinition
    private final boolean flag;
    /**
     * The street.
     */
    @PropertyDefinition(validate = "notNull", get = "field")
    private final String street;
    /**
     * The town.
     */
    @PropertyDefinition(get = "optionalGuava")
    private final String town;
    /**
     * The city.
     */
    @PropertyDefinition(validate = "notNull", alias = "place")
    private final String city;
    /**
     * The owner.
     */
    @PropertyDefinition(validate = "notNull")
    private final ImmPerson owner;
    /**
     * The list.
     */
    @PropertyDefinition(validate = "notNull")
    private final ImmutableList<String> list;
    /**
     * The currency.
     */
    @PropertyDefinition(get = "optionalGuava")
    private final Currency currency;

    //-----------------------------------------------------------------------
    // manual getter with a different name
    public String getStreetName() {
        return street;
    }

    // derived
    @DerivedProperty
    public String getAddress() {
        return number + " " + street + " " + city;
    }

    //------------------------- AUTOGENERATED START -------------------------
    /**
     * The meta-bean for {@code MinimalImmutable}.
     */
    private static final TypedMetaBean<MinimalImmutable> META_BEAN =
            MinimalMetaBean.of(
                    MinimalImmutable.class,
                    new String[] {
                            "number",
                            "flag",
                            "street",
                            "town",
                            "city",
                            "owner",
                            "list",
                            "currency"},
                    () -> new MinimalImmutable.Builder(),
                    b -> b.getNumber(),
                    b -> b.isFlag(),
                    b -> b.street,
                    b -> b.town,
                    b -> b.getCity(),
                    b -> b.getOwner(),
                    b -> b.getList(),
                    b -> b.currency)
                    .withAlias("place", "city");

    /**
     * The meta-bean for {@code MinimalImmutable}.
     * @return the meta-bean, not null
     */
    public static TypedMetaBean<MinimalImmutable> meta() {
        return META_BEAN;
    }

    static {
        MetaBean.register(META_BEAN);
    }

    /**
     * The serialization version id.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Returns a builder used to create an instance of the bean.
     * @return the builder, not null
     */
    public static MinimalImmutable.Builder builder() {
        return new MinimalImmutable.Builder();
    }

    /**
     * Creates an instance.
     * @param number  the value of the property
     * @param flag  the value of the property
     * @param street  the value of the property, not null
     * @param town  the value of the property
     * @param city  the value of the property, not null
     * @param owner  the value of the property, not null
     * @param list  the value of the property, not null
     * @param currency  the value of the property
     */
    MinimalImmutable(
            int number,
            boolean flag,
            String street,
            String town,
            String city,
            ImmPerson owner,
            List<String> list,
            Currency currency) {
        JodaBeanUtils.notNull(street, "street");
        JodaBeanUtils.notNull(city, "city");
        JodaBeanUtils.notNull(owner, "owner");
        JodaBeanUtils.notNull(list, "list");
        this.number = number;
        this.flag = flag;
        this.street = street;
        this.town = town;
        this.city = city;
        this.owner = owner;
        this.list = ImmutableList.copyOf(list);
        this.currency = currency;
    }

    @Override
    public TypedMetaBean<MinimalImmutable> metaBean() {
        return META_BEAN;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the number.
     * @return the value of the property
     */
    public int getNumber() {
        return number;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the number.
     * @return the value of the property
     */
    public boolean isFlag() {
        return flag;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the town.
     * @return the optional value of the property, not null
     */
    public Optional<String> getTown() {
        return Optional.fromNullable(town);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the city.
     * @return the value of the property, not null
     */
    public String getCity() {
        return city;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the owner.
     * @return the value of the property, not null
     */
    public ImmPerson getOwner() {
        return owner;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the list.
     * @return the value of the property, not null
     */
    public ImmutableList<String> getList() {
        return list;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the currency.
     * @return the optional value of the property, not null
     */
    public Optional<Currency> getCurrency() {
        return Optional.fromNullable(currency);
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
            MinimalImmutable other = (MinimalImmutable) obj;
            return (number == other.number) &&
                    (flag == other.flag) &&
                    JodaBeanUtils.equal(street, other.street) &&
                    JodaBeanUtils.equal(town, other.town) &&
                    JodaBeanUtils.equal(city, other.city) &&
                    JodaBeanUtils.equal(owner, other.owner) &&
                    JodaBeanUtils.equal(list, other.list) &&
                    JodaBeanUtils.equal(currency, other.currency);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(number);
        hash = hash * 31 + JodaBeanUtils.hashCode(flag);
        hash = hash * 31 + JodaBeanUtils.hashCode(street);
        hash = hash * 31 + JodaBeanUtils.hashCode(town);
        hash = hash * 31 + JodaBeanUtils.hashCode(city);
        hash = hash * 31 + JodaBeanUtils.hashCode(owner);
        hash = hash * 31 + JodaBeanUtils.hashCode(list);
        hash = hash * 31 + JodaBeanUtils.hashCode(currency);
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(320);
        buf.append("MinimalImmutable{");
        buf.append("number").append('=').append(JodaBeanUtils.toString(number)).append(',').append(' ');
        buf.append("flag").append('=').append(JodaBeanUtils.toString(flag)).append(',').append(' ');
        buf.append("street").append('=').append(JodaBeanUtils.toString(street)).append(',').append(' ');
        buf.append("town").append('=').append(JodaBeanUtils.toString(town)).append(',').append(' ');
        buf.append("city").append('=').append(JodaBeanUtils.toString(city)).append(',').append(' ');
        buf.append("owner").append('=').append(JodaBeanUtils.toString(owner)).append(',').append(' ');
        buf.append("list").append('=').append(JodaBeanUtils.toString(list)).append(',').append(' ');
        buf.append("currency").append('=').append(JodaBeanUtils.toString(currency)).append(',').append(' ');
        buf.append("address").append('=').append(JodaBeanUtils.toString(getAddress()));
        buf.append('}');
        return buf.toString();
    }

    //-----------------------------------------------------------------------
    /**
     * The bean-builder for {@code MinimalImmutable}.
     */
    public static final class Builder extends DirectFieldsBeanBuilder<MinimalImmutable> {

        private int number;
        private boolean flag;
        private String street;
        private String town;
        private String city;
        private ImmPerson owner;
        private List<String> list = ImmutableList.of();
        private Currency currency;

        /**
         * Restricted constructor.
         */
        private Builder() {
        }

        /**
         * Restricted copy constructor.
         * @param beanToCopy  the bean to copy from, not null
         */
        private Builder(MinimalImmutable beanToCopy) {
            this.number = beanToCopy.getNumber();
            this.flag = beanToCopy.isFlag();
            this.street = beanToCopy.street;
            this.town = beanToCopy.town;
            this.city = beanToCopy.getCity();
            this.owner = beanToCopy.getOwner();
            this.list = beanToCopy.getList();
            this.currency = beanToCopy.currency;
        }

        //-----------------------------------------------------------------------
        @Override
        public Object get(String propertyName) {
            switch (propertyName.hashCode()) {
                case -1034364087:  // number
                    return number;
                case 3145580:  // flag
                    return flag;
                case -891990013:  // street
                    return street;
                case 3566226:  // town
                    return town;
                case 3053931:  // city
                case 106748167:  // place (alias)
                    return city;
                case 106164915:  // owner
                    return owner;
                case 3322014:  // list
                    return list;
                case 575402001:  // currency
                    return currency;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
        }

        @SuppressWarnings("unchecked")
        @Override
        public Builder set(String propertyName, Object newValue) {
            switch (propertyName.hashCode()) {
                case -1034364087:  // number
                    this.number = (Integer) newValue;
                    break;
                case 3145580:  // flag
                    this.flag = (Boolean) newValue;
                    break;
                case -891990013:  // street
                    this.street = (String) newValue;
                    break;
                case 3566226:  // town
                    this.town = (String) newValue;
                    break;
                case 3053931:  // city
                case 106748167:  // place (alias)
                    this.city = (String) newValue;
                    break;
                case 106164915:  // owner
                    this.owner = (ImmPerson) newValue;
                    break;
                case 3322014:  // list
                    this.list = (List<String>) newValue;
                    break;
                case 575402001:  // currency
                    this.currency = (Currency) newValue;
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
        public MinimalImmutable build() {
            return new MinimalImmutable(
                    number,
                    flag,
                    street,
                    town,
                    city,
                    owner,
                    list,
                    currency);
        }

        //-----------------------------------------------------------------------
        /**
         * Sets the number.
         * @param number  the new value
         * @return this, for chaining, not null
         */
        public Builder number(int number) {
            this.number = number;
            return this;
        }

        /**
         * Sets the number.
         * @param flag  the new value
         * @return this, for chaining, not null
         */
        public Builder flag(boolean flag) {
            this.flag = flag;
            return this;
        }

        /**
         * Sets the street.
         * @param street  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder street(String street) {
            JodaBeanUtils.notNull(street, "street");
            this.street = street;
            return this;
        }

        /**
         * Sets the town.
         * @param town  the new value
         * @return this, for chaining, not null
         */
        public Builder town(String town) {
            this.town = town;
            return this;
        }

        /**
         * Sets the city.
         * @param city  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder city(String city) {
            JodaBeanUtils.notNull(city, "city");
            this.city = city;
            return this;
        }

        /**
         * Sets the owner.
         * @param owner  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder owner(ImmPerson owner) {
            JodaBeanUtils.notNull(owner, "owner");
            this.owner = owner;
            return this;
        }

        /**
         * Sets the list.
         * @param list  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder list(List<String> list) {
            JodaBeanUtils.notNull(list, "list");
            this.list = list;
            return this;
        }

        /**
         * Sets the {@code list} property in the builder
         * from an array of objects.
         * @param list  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder list(String... list) {
            return list(ImmutableList.copyOf(list));
        }

        /**
         * Sets the currency.
         * @param currency  the new value
         * @return this, for chaining, not null
         */
        public Builder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        //-----------------------------------------------------------------------
        @Override
        public String toString() {
            StringBuilder buf = new StringBuilder(320);
            buf.append("MinimalImmutable.Builder{");
            buf.append("number").append('=').append(JodaBeanUtils.toString(number)).append(',').append(' ');
            buf.append("flag").append('=').append(JodaBeanUtils.toString(flag)).append(',').append(' ');
            buf.append("street").append('=').append(JodaBeanUtils.toString(street)).append(',').append(' ');
            buf.append("town").append('=').append(JodaBeanUtils.toString(town)).append(',').append(' ');
            buf.append("city").append('=').append(JodaBeanUtils.toString(city)).append(',').append(' ');
            buf.append("owner").append('=').append(JodaBeanUtils.toString(owner)).append(',').append(' ');
            buf.append("list").append('=').append(JodaBeanUtils.toString(list)).append(',').append(' ');
            buf.append("currency").append('=').append(JodaBeanUtils.toString(currency)).append(',').append(' ');
            buf.append("address").append('=').append(JodaBeanUtils.toString(null));
            buf.append('}');
            return buf.toString();
        }

    }

    //-------------------------- AUTOGENERATED END --------------------------
}
