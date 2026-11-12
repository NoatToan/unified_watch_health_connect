package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import defpackage.yj;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public abstract class TypeSerializer {
    public abstract TypeSerializer forProperty(BeanProperty beanProperty);

    public abstract String getPropertyName();

    public abstract TypeIdResolver getTypeIdResolver();

    public abstract JsonTypeInfo.As getTypeInclusion();

    public abstract WritableTypeId writeTypePrefix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException;

    public abstract WritableTypeId writeTypeSuffix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.jsontype.TypeSerializer$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f4176b;

        static {
            int[] iArr = new int[JsonTypeInfo.As.values().length];
            f4176b = iArr;
            try {
                iArr[JsonTypeInfo.As.EXISTING_PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4176b[JsonTypeInfo.As.EXTERNAL_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4176b[JsonTypeInfo.As.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4176b[JsonTypeInfo.As.WRAPPER_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4176b[JsonTypeInfo.As.WRAPPER_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public WritableTypeId typeId(Object obj, JsonToken jsonToken) {
        WritableTypeId writableTypeId = new WritableTypeId(obj, jsonToken);
        int i = AnonymousClass4.f4176b[getTypeInclusion().ordinal()];
        if (i == 1) {
            writableTypeId.e = WritableTypeId.Inclusion.PAYLOAD_PROPERTY;
            writableTypeId.d = getPropertyName();
            return writableTypeId;
        }
        if (i == 2) {
            writableTypeId.e = WritableTypeId.Inclusion.PARENT_PROPERTY;
            writableTypeId.d = getPropertyName();
            return writableTypeId;
        }
        if (i == 3) {
            writableTypeId.e = WritableTypeId.Inclusion.METADATA_PROPERTY;
            writableTypeId.d = getPropertyName();
            return writableTypeId;
        }
        if (i == 4) {
            writableTypeId.e = WritableTypeId.Inclusion.WRAPPER_ARRAY;
            return writableTypeId;
        }
        if (i == 5) {
            writableTypeId.e = WritableTypeId.Inclusion.WRAPPER_OBJECT;
            return writableTypeId;
        }
        yj.d();
        return writableTypeId;
    }

    public WritableTypeId typeId(Object obj, JsonToken jsonToken, Object obj2) {
        WritableTypeId writableTypeIdTypeId = typeId(obj, jsonToken);
        writableTypeIdTypeId.f4082b = obj2;
        return writableTypeIdTypeId;
    }

    public WritableTypeId typeId(Object obj, Class<?> cls, JsonToken jsonToken) {
        WritableTypeId writableTypeIdTypeId = typeId(obj, jsonToken);
        writableTypeIdTypeId.f4083c = cls;
        return writableTypeIdTypeId;
    }

    @Deprecated
    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator) throws IOException {
        writeTypePrefix(jsonGenerator, typeId(obj, JsonToken.VALUE_STRING));
    }

    @Deprecated
    public void writeTypePrefixForObject(Object obj, JsonGenerator jsonGenerator) throws IOException {
        writeTypePrefix(jsonGenerator, typeId(obj, JsonToken.START_OBJECT));
    }

    @Deprecated
    public void writeTypePrefixForArray(Object obj, JsonGenerator jsonGenerator) throws IOException {
        writeTypePrefix(jsonGenerator, typeId(obj, JsonToken.START_ARRAY));
    }

    @Deprecated
    public void writeTypeSuffixForScalar(Object obj, JsonGenerator jsonGenerator) throws IOException {
        _writeLegacySuffix(jsonGenerator, typeId(obj, JsonToken.VALUE_STRING));
    }

    @Deprecated
    public void writeTypeSuffixForObject(Object obj, JsonGenerator jsonGenerator) throws IOException {
        _writeLegacySuffix(jsonGenerator, typeId(obj, JsonToken.START_OBJECT));
    }

    @Deprecated
    public void writeTypeSuffixForArray(Object obj, JsonGenerator jsonGenerator) throws IOException {
        _writeLegacySuffix(jsonGenerator, typeId(obj, JsonToken.START_ARRAY));
    }

    @Deprecated
    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator, Class<?> cls) throws IOException {
        writeTypePrefix(jsonGenerator, typeId(obj, cls, JsonToken.VALUE_STRING));
    }

    @Deprecated
    public void writeTypePrefixForObject(Object obj, JsonGenerator jsonGenerator, Class<?> cls) throws IOException {
        writeTypePrefix(jsonGenerator, typeId(obj, cls, JsonToken.START_OBJECT));
    }

    @Deprecated
    public void writeTypePrefixForArray(Object obj, JsonGenerator jsonGenerator, Class<?> cls) throws IOException {
        writeTypePrefix(jsonGenerator, typeId(obj, cls, JsonToken.START_ARRAY));
    }

    @Deprecated
    public void writeCustomTypePrefixForScalar(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
        writeTypePrefix(jsonGenerator, typeId(obj, JsonToken.VALUE_STRING, str));
    }

    @Deprecated
    public void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
        writeTypePrefix(jsonGenerator, typeId(obj, JsonToken.START_OBJECT, str));
    }

    @Deprecated
    public void writeCustomTypePrefixForArray(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
        writeTypePrefix(jsonGenerator, typeId(obj, JsonToken.START_ARRAY, str));
    }

    @Deprecated
    public void writeCustomTypeSuffixForScalar(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
        _writeLegacySuffix(jsonGenerator, typeId(obj, JsonToken.VALUE_STRING, str));
    }

    @Deprecated
    public void writeCustomTypeSuffixForObject(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
        _writeLegacySuffix(jsonGenerator, typeId(obj, JsonToken.START_OBJECT, str));
    }

    @Deprecated
    public void writeCustomTypeSuffixForArray(Object obj, JsonGenerator jsonGenerator, String str) throws IOException {
        _writeLegacySuffix(jsonGenerator, typeId(obj, JsonToken.START_ARRAY, str));
    }

    protected final void _writeLegacySuffix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
        writableTypeId.h = !jsonGenerator.canWriteTypeId();
        writeTypeSuffix(jsonGenerator, writableTypeId);
    }
}
