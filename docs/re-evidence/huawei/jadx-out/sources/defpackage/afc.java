package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public class afc extends BeanSerializerBase {
    private static final long serialVersionUID = 29;

    public afc(JavaType javaType, afa afaVar, aez[] aezVarArr, aez[] aezVarArr2) {
        super(javaType, afaVar, aezVarArr, aezVarArr2);
    }

    protected afc(BeanSerializerBase beanSerializerBase, afj afjVar, Object obj) {
        super(beanSerializerBase, afjVar, obj);
    }

    protected afc(BeanSerializerBase beanSerializerBase, Set<String> set, Set<String> set2) {
        super(beanSerializerBase, set, set2);
    }

    protected afc(BeanSerializerBase beanSerializerBase, aez[] aezVarArr, aez[] aezVarArr2) {
        super(beanSerializerBase, aezVarArr, aezVarArr2);
    }

    public static afc c(JavaType javaType, afa afaVar) {
        return new afc(javaType, afaVar, NO_PROPS, null);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public JsonSerializer<Object> unwrappingSerializer(NameTransformer nameTransformer) {
        return new afv(this, nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase withObjectIdWriter(afj afjVar) {
        return new afc(this, afjVar, this._propertyFilterId);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.JsonSerializer
    public BeanSerializerBase withFilterId(Object obj) {
        return new afc(this, this._objectIdWriter, obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase withByNameInclusion(Set<String> set, Set<String> set2) {
        return new afc(this, set, set2);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase withProperties(aez[] aezVarArr, aez[] aezVarArr2) {
        return new afc(this, aezVarArr, aezVarArr2);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase asArraySerializer() {
        return (this._objectIdWriter == null && this._anyGetterWriter == null && this._propertyFilterId == null) ? new afd(this) : this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (this._objectIdWriter != null) {
            jsonGenerator.setCurrentValue(obj);
            _serializeWithObjectId(obj, jsonGenerator, serializerProvider, true);
            return;
        }
        jsonGenerator.writeStartObject(obj);
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, serializerProvider);
        } else {
            serializeFields(obj, jsonGenerator, serializerProvider);
        }
        jsonGenerator.writeEndObject();
    }

    public String toString() {
        return "BeanSerializer for " + handledType().getName();
    }
}
