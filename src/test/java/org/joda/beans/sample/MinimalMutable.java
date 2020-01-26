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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

import org.joda.beans.Bean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaBean;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.gen.BeanDefinition;
import org.joda.beans.gen.DerivedProperty;
import org.joda.beans.gen.PropertyDefinition;
import org.joda.beans.impl.BasicBeanBuilder;
import org.joda.beans.impl.direct.MinimalMetaBean;

import com.google.common.base.Optional;

/**
 * Mock minimal bean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition(style = "minimal")
public final class MinimalMutable implements Bean, Serializable {

    /**
     * The number.
     */
    @PropertyDefinition
    private int number;
    /**
     * The number.
     */
    @PropertyDefinition
    private boolean flag;
    /**
     * The street.
     */
    @PropertyDefinition(validate = "notNull", get = "field")
    private String street;
    /**
     * The text.
     */
    @PropertyDefinition(get = "optionalGuava")
    private String town;
    /**
     * The city.
     */
    @PropertyDefinition(validate = "notNull", alias = "place")
    private String city;
    /**
     * The list.
     */
    @PropertyDefinition(validate = "notNull")
    private final List<String> list = new ArrayList<>();
    /**
     * The currency.
     */
    @PropertyDefinition(get = "optionalGuava")
    private Currency currency;

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
     * The meta-bean for {@code MinimalMutable}.
     */
    @SuppressWarnings("unchecked")
    private static final TypedMetaBean<MinimalMutable> META_BEAN =
            MinimalMetaBean.of(
                    MinimalMutable.class,
                    new String[] {
                            "number",
                            "flag",
                            "street",
                            "town",
                            "city",
                            "list",
                            "currency"},
                    () -> new BasicBeanBuilder<>(new MinimalMutable()),
                    Arrays.<Function<MinimalMutable, Object>>asList(
                            b -> b.getNumber(),
                            b -> b.isFlag(),
                            b -> b.street,
                            b -> b.town,
                            b -> b.getCity(),
                            b -> b.getList(),
                            b -> b.currency),
                    Arrays.<BiConsumer<MinimalMutable, Object>>asList(
                            (b, v) -> b.setNumber((Integer) v),
                            (b, v) -> b.setFlag((Boolean) v),
                            (b, v) -> b.setStreet((String) v),
                            (b, v) -> b.setTown((String) v),
                            (b, v) -> b.setCity((String) v),
                            (b, v) -> b.setList((List<String>) v),
                            (b, v) -> b.setCurrency((Currency) v)))
                    .withAlias("place", "city");

    /**
     * The meta-bean for {@code MinimalMutable}.
     * @return the meta-bean, not null
     */
    public static TypedMetaBean<MinimalMutable> meta() {
        return META_BEAN;
    }

    static {
        MetaBean.register(META_BEAN);
    }

    /**
     * The serialization version id.
     */
    private static final long serialVersionUID = 1L;

    @Override
    public TypedMetaBean<MinimalMutable> metaBean() {
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

    /**
     * Sets the number.
     * @param number  the new value of the property
     */
    public void setNumber(int number) {
        this.number = number;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the number.
     * @return the value of the property
     */
    public boolean isFlag() {
        return flag;
    }

    /**
     * Sets the number.
     * @param flag  the new value of the property
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    //-----------------------------------------------------------------------
    /**
     * Sets the street.
     * @param street  the new value of the property, not null
     */
    public void setStreet(String street) {
        JodaBeanUtils.notNull(street, "street");
        this.street = street;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the text.
     * @return the optional value of the property, not null
     */
    public Optional<String> getTown() {
        return Optional.fromNullable(town);
    }

    /**
     * Sets the text.
     * @param town  the new value of the property
     */
    public void setTown(String town) {
        this.town = town;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the city.
     * @return the value of the property, not null
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city.
     * @param city  the new value of the property, not null
     */
    public void setCity(String city) {
        JodaBeanUtils.notNull(city, "city");
        this.city = city;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the list.
     * @return the value of the property, not null
     */
    public List<String> getList() {
        return list;
    }

    /**
     * Sets the list.
     * @param list  the new value of the property, not null
     */
    public void setList(List<String> list) {
        JodaBeanUtils.notNull(list, "list");
        this.list.clear();
        this.list.addAll(list);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the currency.
     * @return the optional value of the property, not null
     */
    public Optional<Currency> getCurrency() {
        return Optional.fromNullable(currency);
    }

    /**
     * Sets the currency.
     * @param currency  the new value of the property
     */
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    //-----------------------------------------------------------------------
    @Override
    public MinimalMutable clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            MinimalMutable other = (MinimalMutable) obj;
            return (getNumber() == other.getNumber()) &&
                    (isFlag() == other.isFlag()) &&
                    JodaBeanUtils.equal(street, other.street) &&
                    JodaBeanUtils.equal(town, other.town) &&
                    JodaBeanUtils.equal(getCity(), other.getCity()) &&
                    JodaBeanUtils.equal(getList(), other.getList()) &&
                    JodaBeanUtils.equal(currency, other.currency);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getNumber());
        hash = hash * 31 + JodaBeanUtils.hashCode(isFlag());
        hash = hash * 31 + JodaBeanUtils.hashCode(street);
        hash = hash * 31 + JodaBeanUtils.hashCode(town);
        hash = hash * 31 + JodaBeanUtils.hashCode(getCity());
        hash = hash * 31 + JodaBeanUtils.hashCode(getList());
        hash = hash * 31 + JodaBeanUtils.hashCode(currency);
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(288);
        buf.append("MinimalMutable{");
        buf.append("number").append('=').append(JodaBeanUtils.toString(getNumber())).append(',').append(' ');
        buf.append("flag").append('=').append(JodaBeanUtils.toString(isFlag())).append(',').append(' ');
        buf.append("street").append('=').append(JodaBeanUtils.toString(street)).append(',').append(' ');
        buf.append("town").append('=').append(JodaBeanUtils.toString(town)).append(',').append(' ');
        buf.append("city").append('=').append(JodaBeanUtils.toString(getCity())).append(',').append(' ');
        buf.append("list").append('=').append(JodaBeanUtils.toString(getList())).append(',').append(' ');
        buf.append("currency").append('=').append(JodaBeanUtils.toString(currency)).append(',').append(' ');
        buf.append("address").append('=').append(JodaBeanUtils.toString(getAddress()));
        buf.append('}');
        return buf.toString();
    }

    //-------------------------- AUTOGENERATED END --------------------------
}
