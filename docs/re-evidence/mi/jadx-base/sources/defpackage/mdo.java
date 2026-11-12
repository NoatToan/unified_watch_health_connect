package defpackage;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public class mdo implements c5q<mdo> {
    protected r4q _customIdResolver;
    protected Class<?> _defaultImpl;
    protected JsonTypeInfo.Id _idType;
    protected JsonTypeInfo.As _includeAs;
    protected boolean _typeIdVisible = false;
    protected String _typeProperty;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f26045b;

        static {
            int[] iArr = new int[JsonTypeInfo.Id.values().length];
            f26045b = iArr;
            try {
                iArr[JsonTypeInfo.Id.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26045b[JsonTypeInfo.Id.MINIMAL_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26045b[JsonTypeInfo.Id.NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26045b[JsonTypeInfo.Id.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26045b[JsonTypeInfo.Id.CUSTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[JsonTypeInfo.As.values().length];
            f26044a = iArr2;
            try {
                iArr2[JsonTypeInfo.As.WRAPPER_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26044a[JsonTypeInfo.As.PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26044a[JsonTypeInfo.As.WRAPPER_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26044a[JsonTypeInfo.As.EXTERNAL_PROPERTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f26044a[JsonTypeInfo.As.EXISTING_PROPERTY.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public mdo() {
    }

    public static mdo noTypeInfoBuilder() {
        return new mdo().init(JsonTypeInfo.Id.NONE, (r4q) null);
    }

    @Override // defpackage.c5q
    public q4q buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection) {
        if (this._idType == JsonTypeInfo.Id.NONE || javaType.isPrimitive()) {
            return null;
        }
        r4q r4qVarIdResolver = idResolver(deserializationConfig, javaType, collection, false, true);
        JavaType javaTypeDefineDefaultImpl = defineDefaultImpl(deserializationConfig, javaType);
        int i = a.f26044a[this._includeAs.ordinal()];
        if (i == 1) {
            return new AsArrayTypeDeserializer(javaType, r4qVarIdResolver, this._typeProperty, this._typeIdVisible, javaTypeDefineDefaultImpl);
        }
        if (i != 2) {
            if (i == 3) {
                return new AsWrapperTypeDeserializer(javaType, r4qVarIdResolver, this._typeProperty, this._typeIdVisible, javaTypeDefineDefaultImpl);
            }
            if (i == 4) {
                return new AsExternalTypeDeserializer(javaType, r4qVarIdResolver, this._typeProperty, this._typeIdVisible, javaTypeDefineDefaultImpl);
            }
            if (i != 5) {
                throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this._includeAs);
            }
        }
        return new AsPropertyTypeDeserializer(javaType, r4qVarIdResolver, this._typeProperty, this._typeIdVisible, javaTypeDefineDefaultImpl, this._includeAs);
    }

    @Override // defpackage.c5q
    public e5q buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection) {
        if (this._idType == JsonTypeInfo.Id.NONE || javaType.isPrimitive()) {
            return null;
        }
        r4q r4qVarIdResolver = idResolver(serializationConfig, javaType, collection, true, false);
        int i = a.f26044a[this._includeAs.ordinal()];
        if (i == 1) {
            return new ak1(r4qVarIdResolver, null);
        }
        if (i == 2) {
            return new dk1(r4qVarIdResolver, null, this._typeProperty);
        }
        if (i == 3) {
            return new ek1(r4qVarIdResolver, null);
        }
        if (i == 4) {
            return new ck1(r4qVarIdResolver, null, this._typeProperty);
        }
        if (i == 5) {
            return new bk1(r4qVarIdResolver, null, this._typeProperty);
        }
        throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this._includeAs);
    }

    @Override // defpackage.c5q
    public /* bridge */ /* synthetic */ c5q defaultImpl(Class cls) {
        return defaultImpl((Class<?>) cls);
    }

    public JavaType defineDefaultImpl(DeserializationConfig deserializationConfig, JavaType javaType) {
        Class<?> cls = this._defaultImpl;
        if (cls == null) {
            if (deserializationConfig.isEnabled(MapperFeature.USE_BASE_TYPE_AS_DEFAULT_IMPL) && !javaType.isAbstract()) {
                return javaType;
            }
        } else {
            if (cls == Void.class || cls == lug.class) {
                return deserializationConfig.getTypeFactory().constructType(this._defaultImpl);
            }
            if (javaType.hasRawClass(cls)) {
                return javaType;
            }
            if (javaType.isTypeOrSuperTypeOf(this._defaultImpl)) {
                return deserializationConfig.getTypeFactory().constructSpecializedType(javaType, this._defaultImpl);
            }
        }
        return null;
    }

    @Override // defpackage.c5q
    public Class<?> getDefaultImpl() {
        return this._defaultImpl;
    }

    public String getTypeProperty() {
        return this._typeProperty;
    }

    public r4q idResolver(MapperConfig<?> mapperConfig, JavaType javaType, Collection<NamedType> collection, boolean z, boolean z2) {
        r4q r4qVar = this._customIdResolver;
        if (r4qVar != null) {
            return r4qVar;
        }
        JsonTypeInfo.Id id = this._idType;
        if (id == null) {
            throw new IllegalStateException("Cannot build, 'init()' not yet called");
        }
        int i = a.f26045b[id.ordinal()];
        if (i == 1) {
            return new zz3(javaType, mapperConfig.getTypeFactory());
        }
        if (i == 2) {
            return new z4g(javaType, mapperConfig.getTypeFactory());
        }
        if (i == 3) {
            return v4q.i(mapperConfig, javaType, collection, z, z2);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Do not know how to construct standard type id resolver for idType: " + this._idType);
    }

    @Override // defpackage.c5q
    public mdo inclusion(JsonTypeInfo.As as) {
        if (as == null) {
            throw new IllegalArgumentException("includeAs cannot be null");
        }
        this._includeAs = as;
        return this;
    }

    @Override // defpackage.c5q
    public mdo init(JsonTypeInfo.Id id, r4q r4qVar) {
        if (id == null) {
            throw new IllegalArgumentException("idType cannot be null");
        }
        this._idType = id;
        this._customIdResolver = r4qVar;
        this._typeProperty = id.getDefaultPropertyName();
        return this;
    }

    public boolean isTypeIdVisible() {
        return this._typeIdVisible;
    }

    @Override // defpackage.c5q
    public mdo typeProperty(String str) {
        if (str == null || str.length() == 0) {
            str = this._idType.getDefaultPropertyName();
        }
        this._typeProperty = str;
        return this;
    }

    @Override // defpackage.c5q
    public mdo defaultImpl(Class<?> cls) {
        this._defaultImpl = cls;
        return this;
    }

    @Override // defpackage.c5q
    public mdo typeIdVisibility(boolean z) {
        this._typeIdVisible = z;
        return this;
    }

    public mdo(JsonTypeInfo.Id id, JsonTypeInfo.As as, String str) {
        this._idType = id;
        this._includeAs = as;
        this._typeProperty = str;
    }
}
