package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import defpackage.c4h;
import defpackage.itd;
import defpackage.jh2;
import defpackage.odi;
import defpackage.wwl;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class SimpleBeanPropertyFilter implements jh2, odi {

    public static class FilterExceptFilter extends SimpleBeanPropertyFilter implements Serializable {
        private static final long serialVersionUID = 1;
        protected final Set<String> _propertiesToInclude;

        public FilterExceptFilter(Set<String> set) {
            this._propertiesToInclude = set;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter
        public boolean include(BeanPropertyWriter beanPropertyWriter) {
            return this._propertiesToInclude.contains(beanPropertyWriter.getName());
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter
        public boolean include(PropertyWriter propertyWriter) {
            return this._propertiesToInclude.contains(propertyWriter.getName());
        }
    }

    public static class SerializeExceptFilter extends SimpleBeanPropertyFilter implements Serializable {
        static final SerializeExceptFilter INCLUDE_ALL = new SerializeExceptFilter();
        private static final long serialVersionUID = 1;
        protected final Set<String> _propertiesToExclude;

        public SerializeExceptFilter() {
            this._propertiesToExclude = Collections.emptySet();
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter
        public boolean include(BeanPropertyWriter beanPropertyWriter) {
            return !this._propertiesToExclude.contains(beanPropertyWriter.getName());
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter
        public boolean include(PropertyWriter propertyWriter) {
            return !this._propertiesToExclude.contains(propertyWriter.getName());
        }

        public SerializeExceptFilter(Set<String> set) {
            this._propertiesToExclude = set;
        }
    }

    public static class a implements odi {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ jh2 f7694a;

        public a(jh2 jh2Var) {
            this.f7694a = jh2Var;
        }

        @Override // defpackage.odi
        public void depositSchemaProperty(PropertyWriter propertyWriter, c4h c4hVar, wwl wwlVar) throws JsonMappingException {
            this.f7694a.depositSchemaProperty((BeanPropertyWriter) propertyWriter, c4hVar, wwlVar);
        }

        @Override // defpackage.odi
        public void serializeAsField(Object obj, JsonGenerator jsonGenerator, wwl wwlVar, PropertyWriter propertyWriter) throws Exception {
            this.f7694a.serializeAsField(obj, jsonGenerator, wwlVar, (BeanPropertyWriter) propertyWriter);
        }
    }

    public static SimpleBeanPropertyFilter filterOutAllExcept(Set<String> set) {
        return new FilterExceptFilter(set);
    }

    public static odi from(jh2 jh2Var) {
        return new a(jh2Var);
    }

    public static SimpleBeanPropertyFilter serializeAll() {
        return SerializeExceptFilter.INCLUDE_ALL;
    }

    public static SimpleBeanPropertyFilter serializeAllExcept(Set<String> set) {
        return new SerializeExceptFilter(set);
    }

    @Override // defpackage.jh2
    @Deprecated
    public void depositSchemaProperty(BeanPropertyWriter beanPropertyWriter, c4h c4hVar, wwl wwlVar) throws JsonMappingException {
        if (include(beanPropertyWriter)) {
            beanPropertyWriter.depositSchemaProperty(c4hVar, wwlVar);
        }
    }

    public boolean include(BeanPropertyWriter beanPropertyWriter) {
        return true;
    }

    public boolean includeElement(Object obj) {
        return true;
    }

    public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, wwl wwlVar, PropertyWriter propertyWriter) throws Exception {
        if (includeElement(obj)) {
            propertyWriter.serializeAsElement(obj, jsonGenerator, wwlVar);
        }
    }

    @Override // defpackage.jh2
    @Deprecated
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, wwl wwlVar, BeanPropertyWriter beanPropertyWriter) throws Exception {
        if (include(beanPropertyWriter)) {
            beanPropertyWriter.serializeAsField(obj, jsonGenerator, wwlVar);
        } else {
            if (jsonGenerator.l()) {
                return;
            }
            beanPropertyWriter.serializeAsOmittedField(obj, jsonGenerator, wwlVar);
        }
    }

    public static SimpleBeanPropertyFilter filterOutAllExcept(String... strArr) {
        HashSet hashSet = new HashSet(strArr.length);
        Collections.addAll(hashSet, strArr);
        return new FilterExceptFilter(hashSet);
    }

    @Deprecated
    public static SimpleBeanPropertyFilter serializeAll(Set<String> set) {
        return new FilterExceptFilter(set);
    }

    public static SimpleBeanPropertyFilter serializeAllExcept(String... strArr) {
        HashSet hashSet = new HashSet(strArr.length);
        Collections.addAll(hashSet, strArr);
        return new SerializeExceptFilter(hashSet);
    }

    public boolean include(PropertyWriter propertyWriter) {
        return true;
    }

    @Deprecated
    public void depositSchemaProperty(BeanPropertyWriter beanPropertyWriter, itd itdVar, wwl wwlVar) throws JsonMappingException {
        if (include(beanPropertyWriter)) {
            beanPropertyWriter.depositSchemaProperty(itdVar, wwlVar);
        }
    }

    @Override // defpackage.odi
    @Deprecated
    public void depositSchemaProperty(PropertyWriter propertyWriter, c4h c4hVar, wwl wwlVar) throws JsonMappingException {
        if (include(propertyWriter)) {
            propertyWriter.depositSchemaProperty(c4hVar, wwlVar);
        }
    }

    @Override // defpackage.odi
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, wwl wwlVar, PropertyWriter propertyWriter) throws Exception {
        if (include(propertyWriter)) {
            propertyWriter.serializeAsField(obj, jsonGenerator, wwlVar);
        } else {
            if (jsonGenerator.l()) {
                return;
            }
            propertyWriter.serializeAsOmittedField(obj, jsonGenerator, wwlVar);
        }
    }

    public void depositSchemaProperty(PropertyWriter propertyWriter, itd itdVar, wwl wwlVar) throws JsonMappingException {
        if (include(propertyWriter)) {
            propertyWriter.depositSchemaProperty(itdVar, wwlVar);
        }
    }
}
