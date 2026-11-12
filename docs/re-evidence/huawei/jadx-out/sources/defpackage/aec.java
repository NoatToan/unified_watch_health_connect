package defpackage;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
public class aec extends Deserializers.Base implements Serializable {
    private static final long serialVersionUID = 1;
    protected HashMap<ahd, JsonDeserializer<?>> e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f318a = false;

    public <T> void e(Class<T> cls, JsonDeserializer<? extends T> jsonDeserializer) {
        ahd ahdVar = new ahd(cls);
        if (this.e == null) {
            this.e = new HashMap<>();
        }
        this.e.put(ahdVar, jsonDeserializer);
        if (cls == Enum.class) {
            this.f318a = true;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.Deserializers.Base, com.fasterxml.jackson.databind.deser.Deserializers
    public JsonDeserializer<?> findArrayDeserializer(ahe aheVar, yi yiVar, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws ym {
        return e(aheVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.Deserializers.Base, com.fasterxml.jackson.databind.deser.Deserializers
    public JsonDeserializer<?> findBeanDeserializer(JavaType javaType, yi yiVar, BeanDescription beanDescription) throws ym {
        return e(javaType);
    }

    @Override // com.fasterxml.jackson.databind.deser.Deserializers.Base, com.fasterxml.jackson.databind.deser.Deserializers
    public JsonDeserializer<?> findCollectionDeserializer(ahg ahgVar, yi yiVar, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws ym {
        return e(ahgVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.Deserializers.Base, com.fasterxml.jackson.databind.deser.Deserializers
    public JsonDeserializer<?> findCollectionLikeDeserializer(ahb ahbVar, yi yiVar, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws ym {
        return e(ahbVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.Deserializers.Base, com.fasterxml.jackson.databind.deser.Deserializers
    public JsonDeserializer<?> findEnumDeserializer(Class<?> cls, yi yiVar, BeanDescription beanDescription) throws ym {
        HashMap<ahd, JsonDeserializer<?>> map = this.e;
        if (map == null) {
            return null;
        }
        JsonDeserializer<?> jsonDeserializer = map.get(new ahd(cls));
        return (jsonDeserializer == null && this.f318a && cls.isEnum()) ? this.e.get(new ahd(Enum.class)) : jsonDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.Deserializers.Base, com.fasterxml.jackson.databind.deser.Deserializers
    public JsonDeserializer<?> findTreeNodeDeserializer(Class<? extends JsonNode> cls, yi yiVar, BeanDescription beanDescription) throws ym {
        HashMap<ahd, JsonDeserializer<?>> map = this.e;
        if (map == null) {
            return null;
        }
        return map.get(new ahd(cls));
    }

    @Override // com.fasterxml.jackson.databind.deser.Deserializers.Base, com.fasterxml.jackson.databind.deser.Deserializers
    public JsonDeserializer<?> findReferenceDeserializer(ahi ahiVar, yi yiVar, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws ym {
        return e(ahiVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.Deserializers.Base, com.fasterxml.jackson.databind.deser.Deserializers
    public JsonDeserializer<?> findMapDeserializer(ahh ahhVar, yi yiVar, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws ym {
        return e(ahhVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.Deserializers.Base, com.fasterxml.jackson.databind.deser.Deserializers
    public JsonDeserializer<?> findMapLikeDeserializer(ahk ahkVar, yi yiVar, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws ym {
        return e(ahkVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.Deserializers.Base
    public boolean hasDeserializerFor(yi yiVar, Class<?> cls) {
        HashMap<ahd, JsonDeserializer<?>> map = this.e;
        return map != null && map.containsKey(new ahd(cls));
    }

    private final JsonDeserializer<?> e(JavaType javaType) {
        HashMap<ahd, JsonDeserializer<?>> map = this.e;
        if (map == null) {
            return null;
        }
        return map.get(new ahd(javaType.getRawClass()));
    }
}
