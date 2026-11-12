package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.io.Serializable;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public class afv extends BeanSerializerBase implements Serializable {
    private static final long serialVersionUID = 1;
    protected final NameTransformer d;

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase asArraySerializer() {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isUnwrappingSerializer() {
        return true;
    }

    public afv(BeanSerializerBase beanSerializerBase, NameTransformer nameTransformer) {
        super(beanSerializerBase, nameTransformer);
        this.d = nameTransformer;
    }

    public afv(afv afvVar, afj afjVar) {
        super(afvVar, afjVar);
        this.d = afvVar.d;
    }

    public afv(afv afvVar, afj afjVar, Object obj) {
        super(afvVar, afjVar, obj);
        this.d = afvVar.d;
    }

    protected afv(afv afvVar, Set<String> set, Set<String> set2) {
        super(afvVar, set, set2);
        this.d = afvVar.d;
    }

    protected afv(afv afvVar, aez[] aezVarArr, aez[] aezVarArr2) {
        super(afvVar, aezVarArr, aezVarArr2);
        this.d = afvVar.d;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public JsonSerializer<Object> unwrappingSerializer(NameTransformer nameTransformer) {
        return new afv(this, nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase withObjectIdWriter(afj afjVar) {
        return new afv(this, afjVar);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.JsonSerializer
    public BeanSerializerBase withFilterId(Object obj) {
        return new afv(this, this._objectIdWriter, obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase withByNameInclusion(Set<String> set, Set<String> set2) {
        return new afv(this, set, set2);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase withProperties(aez[] aezVarArr, aez[] aezVarArr2) {
        return new afv(this, aezVarArr, aezVarArr2);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.setCurrentValue(obj);
        if (this._objectIdWriter != null) {
            _serializeWithObjectId(obj, jsonGenerator, serializerProvider, false);
        } else if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, serializerProvider);
        } else {
            serializeFields(obj, jsonGenerator, serializerProvider);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        if (serializerProvider.isEnabled(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS)) {
            serializerProvider.reportBadDefinition(handledType(), "Unwrapped property requires use of type information: cannot serialize without disabling `SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS`");
        }
        jsonGenerator.setCurrentValue(obj);
        if (this._objectIdWriter != null) {
            _serializeWithObjectId(obj, jsonGenerator, serializerProvider, typeSerializer);
        } else if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, serializerProvider);
        } else {
            serializeFields(obj, jsonGenerator, serializerProvider);
        }
    }

    public String toString() {
        return "UnwrappingBeanSerializer for " + handledType().getName();
    }
}
