package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import defpackage.ym;
import java.util.Arrays;

/* JADX INFO: loaded from: classes21.dex */
public abstract class PropertySerializerMap {
    protected final boolean _resetWhenFull;

    public abstract PropertySerializerMap newWith(Class<?> cls, JsonSerializer<Object> jsonSerializer);

    public abstract JsonSerializer<Object> serializerFor(Class<?> cls);

    protected PropertySerializerMap(boolean z) {
        this._resetWhenFull = z;
    }

    protected PropertySerializerMap(PropertySerializerMap propertySerializerMap) {
        this._resetWhenFull = propertySerializerMap._resetWhenFull;
    }

    public final d findAndAddPrimarySerializer(Class<?> cls, SerializerProvider serializerProvider, BeanProperty beanProperty) throws ym {
        JsonSerializer<Object> jsonSerializerFindPrimaryPropertySerializer = serializerProvider.findPrimaryPropertySerializer(cls, beanProperty);
        return new d(jsonSerializerFindPrimaryPropertySerializer, newWith(cls, jsonSerializerFindPrimaryPropertySerializer));
    }

    public final d findAndAddPrimarySerializer(JavaType javaType, SerializerProvider serializerProvider, BeanProperty beanProperty) throws ym {
        JsonSerializer<Object> jsonSerializerFindPrimaryPropertySerializer = serializerProvider.findPrimaryPropertySerializer(javaType, beanProperty);
        return new d(jsonSerializerFindPrimaryPropertySerializer, newWith(javaType.getRawClass(), jsonSerializerFindPrimaryPropertySerializer));
    }

    public final d findAndAddSecondarySerializer(Class<?> cls, SerializerProvider serializerProvider, BeanProperty beanProperty) throws ym {
        JsonSerializer<Object> jsonSerializerFindContentValueSerializer = serializerProvider.findContentValueSerializer(cls, beanProperty);
        return new d(jsonSerializerFindContentValueSerializer, newWith(cls, jsonSerializerFindContentValueSerializer));
    }

    public final d findAndAddSecondarySerializer(JavaType javaType, SerializerProvider serializerProvider, BeanProperty beanProperty) throws ym {
        JsonSerializer<Object> jsonSerializerFindContentValueSerializer = serializerProvider.findContentValueSerializer(javaType, beanProperty);
        return new d(jsonSerializerFindContentValueSerializer, newWith(javaType.getRawClass(), jsonSerializerFindContentValueSerializer));
    }

    public final d findAndAddRootValueSerializer(Class<?> cls, SerializerProvider serializerProvider) throws ym {
        JsonSerializer<Object> jsonSerializerFindTypedValueSerializer = serializerProvider.findTypedValueSerializer(cls, false, (BeanProperty) null);
        return new d(jsonSerializerFindTypedValueSerializer, newWith(cls, jsonSerializerFindTypedValueSerializer));
    }

    public final d findAndAddRootValueSerializer(JavaType javaType, SerializerProvider serializerProvider) throws ym {
        JsonSerializer<Object> jsonSerializerFindTypedValueSerializer = serializerProvider.findTypedValueSerializer(javaType, false, (BeanProperty) null);
        return new d(jsonSerializerFindTypedValueSerializer, newWith(javaType.getRawClass(), jsonSerializerFindTypedValueSerializer));
    }

    public final d findAndAddKeySerializer(Class<?> cls, SerializerProvider serializerProvider, BeanProperty beanProperty) throws ym {
        JsonSerializer<Object> jsonSerializerFindKeySerializer = serializerProvider.findKeySerializer(cls, beanProperty);
        return new d(jsonSerializerFindKeySerializer, newWith(cls, jsonSerializerFindKeySerializer));
    }

    public final d addSerializer(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
        return new d(jsonSerializer, newWith(cls, jsonSerializer));
    }

    public final d addSerializer(JavaType javaType, JsonSerializer<Object> jsonSerializer) {
        return new d(jsonSerializer, newWith(javaType.getRawClass(), jsonSerializer));
    }

    public static PropertySerializerMap emptyForProperties() {
        return c.f4188a;
    }

    public static PropertySerializerMap emptyForRootValues() {
        return c.f4189b;
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PropertySerializerMap f4190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final JsonSerializer<Object> f4191b;

        public d(JsonSerializer<Object> jsonSerializer, PropertySerializerMap propertySerializerMap) {
            this.f4191b = jsonSerializer;
            this.f4190a = propertySerializerMap;
        }
    }

    static final class f {
        public final Class<?> d;
        public final JsonSerializer<Object> e;

        public f(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            this.d = cls;
            this.e = jsonSerializer;
        }
    }

    static final class c extends PropertySerializerMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f4188a = new c(false);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f4189b = new c(true);

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public JsonSerializer<Object> serializerFor(Class<?> cls) {
            return null;
        }

        protected c(boolean z) {
            super(z);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public PropertySerializerMap newWith(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            return new e(this, cls, jsonSerializer);
        }
    }

    static final class e extends PropertySerializerMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<?> f4192a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final JsonSerializer<Object> f4193c;

        public e(PropertySerializerMap propertySerializerMap, Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            super(propertySerializerMap);
            this.f4192a = cls;
            this.f4193c = jsonSerializer;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public JsonSerializer<Object> serializerFor(Class<?> cls) {
            if (cls == this.f4192a) {
                return this.f4193c;
            }
            return null;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public PropertySerializerMap newWith(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            return new b(this, this.f4192a, this.f4193c, cls, jsonSerializer);
        }
    }

    static final class b extends PropertySerializerMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final JsonSerializer<Object> f4186a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class<?> f4187c;
        private final JsonSerializer<Object> d;
        private final Class<?> e;

        public b(PropertySerializerMap propertySerializerMap, Class<?> cls, JsonSerializer<Object> jsonSerializer, Class<?> cls2, JsonSerializer<Object> jsonSerializer2) {
            super(propertySerializerMap);
            this.f4187c = cls;
            this.d = jsonSerializer;
            this.e = cls2;
            this.f4186a = jsonSerializer2;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public JsonSerializer<Object> serializerFor(Class<?> cls) {
            if (cls == this.f4187c) {
                return this.d;
            }
            if (cls == this.e) {
                return this.f4186a;
            }
            return null;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public PropertySerializerMap newWith(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            return new a(this, new f[]{new f(this.f4187c, this.d), new f(this.e, this.f4186a), new f(cls, jsonSerializer)});
        }
    }

    static final class a extends PropertySerializerMap {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f[] f4185b;

        public a(PropertySerializerMap propertySerializerMap, f[] fVarArr) {
            super(propertySerializerMap);
            this.f4185b = fVarArr;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public JsonSerializer<Object> serializerFor(Class<?> cls) {
            f fVar = this.f4185b[0];
            if (fVar.d == cls) {
                return fVar.e;
            }
            f fVar2 = this.f4185b[1];
            if (fVar2.d == cls) {
                return fVar2.e;
            }
            f fVar3 = this.f4185b[2];
            if (fVar3.d == cls) {
                return fVar3.e;
            }
            f[] fVarArr = this.f4185b;
            switch (fVarArr.length) {
                case 8:
                    f fVar4 = fVarArr[7];
                    if (fVar4.d == cls) {
                        return fVar4.e;
                    }
                case 7:
                    f fVar5 = this.f4185b[6];
                    if (fVar5.d == cls) {
                        return fVar5.e;
                    }
                case 6:
                    f fVar6 = this.f4185b[5];
                    if (fVar6.d == cls) {
                        return fVar6.e;
                    }
                case 5:
                    f fVar7 = this.f4185b[4];
                    if (fVar7.d == cls) {
                        return fVar7.e;
                    }
                case 4:
                    f fVar8 = this.f4185b[3];
                    if (fVar8.d == cls) {
                        return fVar8.e;
                    }
                    return null;
                default:
                    return null;
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap
        public PropertySerializerMap newWith(Class<?> cls, JsonSerializer<Object> jsonSerializer) {
            f[] fVarArr = this.f4185b;
            int length = fVarArr.length;
            if (length == 8) {
                return this._resetWhenFull ? new e(this, cls, jsonSerializer) : this;
            }
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, length + 1);
            fVarArr2[length] = new f(cls, jsonSerializer);
            return new a(this, fVarArr2);
        }
    }
}
