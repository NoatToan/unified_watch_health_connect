package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eud<T> {

    public static abstract class a extends eud<Object> {
    }

    public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
        ksdVar.k(javaType);
    }

    public eud<?> getDelegatee() {
        return null;
    }

    public Class<T> handledType() {
        return null;
    }

    public boolean isEmpty(wwl wwlVar, T t) {
        return t == null;
    }

    public boolean isUnwrappingSerializer() {
        return false;
    }

    public Iterator<PropertyWriter> properties() {
        return h04.m();
    }

    public eud<T> replaceDelegatee(eud<?> eudVar) {
        throw new UnsupportedOperationException();
    }

    public abstract void serialize(T t, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException;

    /* JADX WARN: Multi-variable type inference failed */
    public void serializeWithType(T t, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        Class clsHandledType = handledType();
        if (clsHandledType == null) {
            clsHandledType = t.getClass();
        }
        wwlVar.reportBadDefinition((Class<?>) clsHandledType, String.format("Type id handling not implemented for type %s (by serializer of type %s)", clsHandledType.getName(), getClass().getName()));
    }

    public eud<T> unwrappingSerializer(NameTransformer nameTransformer) {
        return this;
    }

    public boolean usesObjectId() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public eud<?> withFilterId(Object obj) {
        return this;
    }

    @Deprecated
    public boolean isEmpty(T t) {
        return isEmpty(null, t);
    }
}
