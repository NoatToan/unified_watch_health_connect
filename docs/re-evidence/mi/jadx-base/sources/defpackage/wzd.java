package defpackage;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;

/* JADX INFO: loaded from: classes4.dex */
public interface wzd {
    vzd findKeyDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, fh2 fh2Var) throws JsonMappingException;
}
