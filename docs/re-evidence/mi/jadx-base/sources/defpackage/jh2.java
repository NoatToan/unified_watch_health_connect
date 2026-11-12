package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface jh2 {
    @Deprecated
    void depositSchemaProperty(BeanPropertyWriter beanPropertyWriter, c4h c4hVar, wwl wwlVar) throws JsonMappingException;

    void serializeAsField(Object obj, JsonGenerator jsonGenerator, wwl wwlVar, BeanPropertyWriter beanPropertyWriter) throws Exception;
}
