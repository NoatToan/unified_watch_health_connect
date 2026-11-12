package defpackage;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import defpackage.c5q;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public interface c5q<T extends c5q<T>> {
    q4q buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection);

    e5q buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection);

    T defaultImpl(Class<?> cls);

    Class<?> getDefaultImpl();

    T inclusion(JsonTypeInfo.As as);

    T init(JsonTypeInfo.Id id, r4q r4qVar);

    T typeIdVisibility(boolean z);

    T typeProperty(String str);
}
