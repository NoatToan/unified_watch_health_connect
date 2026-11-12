package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.PropertyWriter;

/* JADX INFO: loaded from: classes4.dex */
public interface odi {
    @Deprecated
    void depositSchemaProperty(PropertyWriter propertyWriter, c4h c4hVar, wwl wwlVar) throws JsonMappingException;

    void serializeAsField(Object obj, JsonGenerator jsonGenerator, wwl wwlVar, PropertyWriter propertyWriter) throws Exception;
}
