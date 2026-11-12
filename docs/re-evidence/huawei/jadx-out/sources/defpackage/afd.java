package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public class afd extends BeanSerializerBase {
    private static final long serialVersionUID = 1;
    protected final BeanSerializerBase e;

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase asArraySerializer() {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isUnwrappingSerializer() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase withProperties(aez[] aezVarArr, aez[] aezVarArr2) {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afd(BeanSerializerBase beanSerializerBase) {
        super(beanSerializerBase, (afj) null);
        this.e = beanSerializerBase;
    }

    protected afd(BeanSerializerBase beanSerializerBase, Set<String> set, Set<String> set2) {
        super(beanSerializerBase, set, set2);
        this.e = beanSerializerBase;
    }

    protected afd(BeanSerializerBase beanSerializerBase, afj afjVar, Object obj) {
        super(beanSerializerBase, afjVar, obj);
        this.e = beanSerializerBase;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public JsonSerializer<Object> unwrappingSerializer(NameTransformer nameTransformer) {
        return this.e.unwrappingSerializer(nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    public BeanSerializerBase withObjectIdWriter(afj afjVar) {
        return this.e.withObjectIdWriter(afjVar);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.JsonSerializer
    public BeanSerializerBase withFilterId(Object obj) {
        return new afd(this, this._objectIdWriter, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public afd withByNameInclusion(Set<String> set, Set<String> set2) {
        return new afd(this, set, set2);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        if (this._objectIdWriter != null) {
            _serializeWithObjectId(obj, jsonGenerator, serializerProvider, typeSerializer);
            return;
        }
        WritableTypeId writableTypeId_typeIdDef = _typeIdDef(typeSerializer, obj, JsonToken.START_ARRAY);
        typeSerializer.writeTypePrefix(jsonGenerator, writableTypeId_typeIdDef);
        jsonGenerator.setCurrentValue(obj);
        c(obj, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffix(jsonGenerator, writableTypeId_typeIdDef);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && b(serializerProvider)) {
            c(obj, jsonGenerator, serializerProvider);
            return;
        }
        jsonGenerator.writeStartArray(obj);
        c(obj, jsonGenerator, serializerProvider);
        jsonGenerator.writeEndArray();
    }

    private boolean b(SerializerProvider serializerProvider) {
        aez[] aezVarArr;
        if (this._filteredProps != null && serializerProvider.getActiveView() != null) {
            aezVarArr = this._filteredProps;
        } else {
            aezVarArr = this._props;
        }
        return aezVarArr.length == 1;
    }

    protected final void c(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        aez[] aezVarArr;
        if (this._filteredProps != null && serializerProvider.getActiveView() != null) {
            aezVarArr = this._filteredProps;
        } else {
            aezVarArr = this._props;
        }
        int i = 0;
        try {
            int length = aezVarArr.length;
            while (i < length) {
                aez aezVar = aezVarArr[i];
                if (aezVar == null) {
                    jsonGenerator.writeNull();
                } else {
                    aezVar.serializeAsElement(obj, jsonGenerator, serializerProvider);
                }
                i++;
            }
        } catch (Exception e) {
            wrapAndThrow(serializerProvider, e, obj, i != aezVarArr.length ? aezVarArr[i].getName() : "[anySetter]");
        } catch (StackOverflowError e2) {
            ym ymVarFrom = ym.from(jsonGenerator, "Infinite recursion (StackOverflowError)", e2);
            ymVarFrom.prependPath(new ym.e(obj, i != aezVarArr.length ? aezVarArr[i].getName() : "[anySetter]"));
            throw ymVarFrom;
        }
    }

    public String toString() {
        return "BeanAsArraySerializer for " + handledType().getName();
    }
}
