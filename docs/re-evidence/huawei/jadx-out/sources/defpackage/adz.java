package defpackage;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.Serializers;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
public class adz extends Serializers.e implements Serializable {
    private static final long serialVersionUID = 3;
    protected HashMap<ahd, JsonSerializer<?>> d = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected HashMap<ahd, JsonSerializer<?>> f313b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f312a = false;

    public void c(JsonSerializer<?> jsonSerializer) {
        Class<?> clsHandledType = jsonSerializer.handledType();
        if (clsHandledType == null || clsHandledType == Object.class) {
            throw new IllegalArgumentException("JsonSerializer of type " + jsonSerializer.getClass().getName() + " does not define valid handledType() -- must either register with method that takes type argument  or make serializer extend 'com.fasterxml.jackson.databind.ser.std.StdSerializer'");
        }
        c(clsHandledType, jsonSerializer);
    }

    @Override // com.fasterxml.jackson.databind.ser.Serializers.e, com.fasterxml.jackson.databind.ser.Serializers
    public JsonSerializer<?> findSerializer(yt ytVar, JavaType javaType, BeanDescription beanDescription) {
        JsonSerializer<?> jsonSerializerE;
        JsonSerializer<?> jsonSerializer;
        Class<?> rawClass = javaType.getRawClass();
        ahd ahdVar = new ahd(rawClass);
        if (rawClass.isInterface()) {
            HashMap<ahd, JsonSerializer<?>> map = this.f313b;
            if (map != null && (jsonSerializer = map.get(ahdVar)) != null) {
                return jsonSerializer;
            }
        } else {
            HashMap<ahd, JsonSerializer<?>> map2 = this.d;
            if (map2 != null) {
                JsonSerializer<?> jsonSerializer2 = map2.get(ahdVar);
                if (jsonSerializer2 != null) {
                    return jsonSerializer2;
                }
                if (this.f312a && javaType.isEnumType()) {
                    ahdVar.a(Enum.class);
                    JsonSerializer<?> jsonSerializer3 = this.d.get(ahdVar);
                    if (jsonSerializer3 != null) {
                        return jsonSerializer3;
                    }
                }
                for (Class<?> superclass = rawClass; superclass != null; superclass = superclass.getSuperclass()) {
                    ahdVar.a(superclass);
                    JsonSerializer<?> jsonSerializer4 = this.d.get(ahdVar);
                    if (jsonSerializer4 != null) {
                        return jsonSerializer4;
                    }
                }
            }
        }
        if (this.f313b == null) {
            return null;
        }
        JsonSerializer<?> jsonSerializerE2 = e(rawClass, ahdVar);
        if (jsonSerializerE2 != null) {
            return jsonSerializerE2;
        }
        if (rawClass.isInterface()) {
            return null;
        }
        do {
            rawClass = rawClass.getSuperclass();
            if (rawClass == null) {
                return null;
            }
            jsonSerializerE = e(rawClass, ahdVar);
        } while (jsonSerializerE == null);
        return jsonSerializerE;
    }

    @Override // com.fasterxml.jackson.databind.ser.Serializers.e, com.fasterxml.jackson.databind.ser.Serializers
    public JsonSerializer<?> findArraySerializer(yt ytVar, ahe aheVar, BeanDescription beanDescription, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        return findSerializer(ytVar, aheVar, beanDescription);
    }

    @Override // com.fasterxml.jackson.databind.ser.Serializers.e, com.fasterxml.jackson.databind.ser.Serializers
    public JsonSerializer<?> findCollectionSerializer(yt ytVar, ahg ahgVar, BeanDescription beanDescription, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        return findSerializer(ytVar, ahgVar, beanDescription);
    }

    @Override // com.fasterxml.jackson.databind.ser.Serializers.e, com.fasterxml.jackson.databind.ser.Serializers
    public JsonSerializer<?> findCollectionLikeSerializer(yt ytVar, ahb ahbVar, BeanDescription beanDescription, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        return findSerializer(ytVar, ahbVar, beanDescription);
    }

    @Override // com.fasterxml.jackson.databind.ser.Serializers.e, com.fasterxml.jackson.databind.ser.Serializers
    public JsonSerializer<?> findMapSerializer(yt ytVar, ahh ahhVar, BeanDescription beanDescription, JsonSerializer<Object> jsonSerializer, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer2) {
        return findSerializer(ytVar, ahhVar, beanDescription);
    }

    @Override // com.fasterxml.jackson.databind.ser.Serializers.e, com.fasterxml.jackson.databind.ser.Serializers
    public JsonSerializer<?> findMapLikeSerializer(yt ytVar, ahk ahkVar, BeanDescription beanDescription, JsonSerializer<Object> jsonSerializer, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer2) {
        return findSerializer(ytVar, ahkVar, beanDescription);
    }

    protected JsonSerializer<?> e(Class<?> cls, ahd ahdVar) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            ahdVar.a(cls2);
            JsonSerializer<?> jsonSerializer = this.f313b.get(ahdVar);
            if (jsonSerializer != null) {
                return jsonSerializer;
            }
            JsonSerializer<?> jsonSerializerE = e(cls2, ahdVar);
            if (jsonSerializerE != null) {
                return jsonSerializerE;
            }
        }
        return null;
    }

    protected void c(Class<?> cls, JsonSerializer<?> jsonSerializer) {
        ahd ahdVar = new ahd(cls);
        if (cls.isInterface()) {
            if (this.f313b == null) {
                this.f313b = new HashMap<>();
            }
            this.f313b.put(ahdVar, jsonSerializer);
        } else {
            if (this.d == null) {
                this.d = new HashMap<>();
            }
            this.d.put(ahdVar, jsonSerializer);
            if (cls == Enum.class) {
                this.f312a = true;
            }
        }
    }
}
