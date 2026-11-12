package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationConfig;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vwl {
    public abstract eud<Object> createKeySerializer(SerializationConfig serializationConfig, JavaType javaType, eud<Object> eudVar) throws JsonMappingException;

    public abstract eud<Object> createSerializer(wwl wwlVar, JavaType javaType) throws JsonMappingException;

    public abstract e5q createTypeSerializer(SerializationConfig serializationConfig, JavaType javaType) throws JsonMappingException;

    public abstract vwl withAdditionalKeySerializers(xwl xwlVar);

    public abstract vwl withAdditionalSerializers(xwl xwlVar);

    public abstract vwl withSerializerModifier(lh2 lh2Var);
}
