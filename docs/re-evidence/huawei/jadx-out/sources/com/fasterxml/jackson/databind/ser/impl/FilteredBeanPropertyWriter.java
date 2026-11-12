package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.util.NameTransformer;
import defpackage.aez;
import defpackage.ym;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public abstract class FilteredBeanPropertyWriter {
    public static aez constructViewBased(aez aezVar, Class<?>[] clsArr) {
        if (clsArr.length == 1) {
            return new a(aezVar, clsArr[0]);
        }
        return new e(aezVar, clsArr);
    }

    static final class a extends aez implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final aez f4183a;
        protected final Class<?> d;

        protected a(aez aezVar, Class<?> cls) {
            super(aezVar);
            this.f4183a = aezVar;
            this.d = cls;
        }

        @Override // defpackage.aez
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a rename(NameTransformer nameTransformer) {
            return new a(this.f4183a.rename(nameTransformer), this.d);
        }

        @Override // defpackage.aez
        public void assignSerializer(JsonSerializer<Object> jsonSerializer) {
            this.f4183a.assignSerializer(jsonSerializer);
        }

        @Override // defpackage.aez
        public void assignNullSerializer(JsonSerializer<Object> jsonSerializer) {
            this.f4183a.assignNullSerializer(jsonSerializer);
        }

        @Override // defpackage.aez, com.fasterxml.jackson.databind.ser.PropertyWriter
        public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
            Class<?> activeView = serializerProvider.getActiveView();
            if (activeView == null || this.d.isAssignableFrom(activeView)) {
                this.f4183a.serializeAsField(obj, jsonGenerator, serializerProvider);
            } else {
                this.f4183a.serializeAsOmittedField(obj, jsonGenerator, serializerProvider);
            }
        }

        @Override // defpackage.aez, com.fasterxml.jackson.databind.ser.PropertyWriter
        public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
            Class<?> activeView = serializerProvider.getActiveView();
            if (activeView == null || this.d.isAssignableFrom(activeView)) {
                this.f4183a.serializeAsElement(obj, jsonGenerator, serializerProvider);
            } else {
                this.f4183a.serializeAsPlaceholder(obj, jsonGenerator, serializerProvider);
            }
        }

        @Override // defpackage.aez, com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
        public void depositSchemaProperty(JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) throws ym {
            Class<?> activeView = serializerProvider.getActiveView();
            if (activeView == null || this.d.isAssignableFrom(activeView)) {
                super.depositSchemaProperty(jsonObjectFormatVisitor, serializerProvider);
            }
        }
    }

    static final class e extends aez implements Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final aez f4184b;
        protected final Class<?>[] e;

        protected e(aez aezVar, Class<?>[] clsArr) {
            super(aezVar);
            this.f4184b = aezVar;
            this.e = clsArr;
        }

        @Override // defpackage.aez
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e rename(NameTransformer nameTransformer) {
            return new e(this.f4184b.rename(nameTransformer), this.e);
        }

        @Override // defpackage.aez
        public void assignSerializer(JsonSerializer<Object> jsonSerializer) {
            this.f4184b.assignSerializer(jsonSerializer);
        }

        @Override // defpackage.aez
        public void assignNullSerializer(JsonSerializer<Object> jsonSerializer) {
            this.f4184b.assignNullSerializer(jsonSerializer);
        }

        @Override // defpackage.aez, com.fasterxml.jackson.databind.ser.PropertyWriter
        public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
            if (b(serializerProvider.getActiveView())) {
                this.f4184b.serializeAsField(obj, jsonGenerator, serializerProvider);
            } else {
                this.f4184b.serializeAsOmittedField(obj, jsonGenerator, serializerProvider);
            }
        }

        @Override // defpackage.aez, com.fasterxml.jackson.databind.ser.PropertyWriter
        public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
            if (b(serializerProvider.getActiveView())) {
                this.f4184b.serializeAsElement(obj, jsonGenerator, serializerProvider);
            } else {
                this.f4184b.serializeAsPlaceholder(obj, jsonGenerator, serializerProvider);
            }
        }

        @Override // defpackage.aez, com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
        public void depositSchemaProperty(JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) throws ym {
            if (b(serializerProvider.getActiveView())) {
                super.depositSchemaProperty(jsonObjectFormatVisitor, serializerProvider);
            }
        }

        private final boolean b(Class<?> cls) {
            if (cls == null) {
                return true;
            }
            int length = this.e.length;
            for (int i = 0; i < length; i++) {
                if (this.e[i].isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }
    }
}
