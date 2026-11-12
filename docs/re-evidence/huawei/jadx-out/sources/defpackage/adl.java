package defpackage;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class adl extends adf {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f301a;
    protected final JsonTypeInfo.As e;

    public adl(JavaType javaType, TypeIdResolver typeIdResolver, String str, boolean z, JavaType javaType2, JsonTypeInfo.As as) {
        String str2;
        super(javaType, typeIdResolver, str, z, javaType2);
        if (this._property == null) {
            str2 = String.format("missing type id property '%s'", this._typePropertyName);
        } else {
            str2 = String.format("missing type id property '%s' (for POJO property '%s')", this._typePropertyName, this._property.getName());
        }
        this.f301a = str2;
        this.e = as;
    }

    public adl(adl adlVar, BeanProperty beanProperty) {
        String str;
        super(adlVar, beanProperty);
        if (this._property == null) {
            str = String.format("missing type id property '%s'", this._typePropertyName);
        } else {
            str = String.format("missing type id property '%s' (for POJO property '%s')", this._typePropertyName, this._property.getName());
        }
        this.f301a = str;
        this.e = adlVar.e;
    }

    @Override // defpackage.adf, com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public TypeDeserializer forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new adl(this, beanProperty);
    }

    @Override // defpackage.adf, com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public JsonTypeInfo.As getTypeInclusion() {
        return this.e;
    }

    @Override // defpackage.adf, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object typeId;
        if (jsonParser.canReadTypeId() && (typeId = jsonParser.getTypeId()) != null) {
            return _deserializeWithNativeTypeId(jsonParser, deserializationContext, typeId);
        }
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        aii aiiVar = null;
        if (jsonTokenCurrentToken == JsonToken.START_OBJECT) {
            jsonTokenCurrentToken = jsonParser.nextToken();
        } else if (jsonTokenCurrentToken != JsonToken.FIELD_NAME) {
            return a(jsonParser, deserializationContext, null, this.f301a);
        }
        boolean zIsEnabled = deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        while (jsonTokenCurrentToken == JsonToken.FIELD_NAME) {
            String strCurrentName = jsonParser.currentName();
            jsonParser.nextToken();
            if (strCurrentName.equals(this._typePropertyName) || (zIsEnabled && strCurrentName.equalsIgnoreCase(this._typePropertyName))) {
                return d(jsonParser, deserializationContext, aiiVar, jsonParser.getText());
            }
            if (aiiVar == null) {
                aiiVar = new aii(jsonParser, deserializationContext);
            }
            aiiVar.writeFieldName(strCurrentName);
            aiiVar.copyCurrentStructure(jsonParser);
            jsonTokenCurrentToken = jsonParser.nextToken();
        }
        return a(jsonParser, deserializationContext, aiiVar, this.f301a);
    }

    protected Object d(JsonParser jsonParser, DeserializationContext deserializationContext, aii aiiVar, String str) throws IOException {
        JsonDeserializer<Object> jsonDeserializer_findDeserializer = _findDeserializer(deserializationContext, str);
        if (this._typeIdVisible) {
            if (aiiVar == null) {
                aiiVar = new aii(jsonParser, deserializationContext);
            }
            aiiVar.writeFieldName(jsonParser.currentName());
            aiiVar.writeString(str);
        }
        if (aiiVar != null) {
            jsonParser.clearCurrentToken();
            jsonParser = yc.d(false, aiiVar.a(jsonParser), jsonParser);
        }
        if (jsonParser.currentToken() != JsonToken.END_OBJECT) {
            jsonParser.nextToken();
        }
        return jsonDeserializer_findDeserializer.deserialize(jsonParser, deserializationContext);
    }

    protected Object a(JsonParser jsonParser, DeserializationContext deserializationContext, aii aiiVar, String str) throws IOException {
        if (!hasDefaultImpl()) {
            Object objDeserializeIfNatural = TypeDeserializer.deserializeIfNatural(jsonParser, deserializationContext, this._baseType);
            if (objDeserializeIfNatural != null) {
                return objDeserializeIfNatural;
            }
            if (jsonParser.isExpectedStartArrayToken()) {
                return super.deserializeTypedFromAny(jsonParser, deserializationContext);
            }
            if (jsonParser.hasToken(JsonToken.VALUE_STRING) && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.getText().trim().isEmpty()) {
                return null;
            }
        }
        JsonDeserializer<Object> jsonDeserializer_findDefaultImplDeserializer = _findDefaultImplDeserializer(deserializationContext);
        if (jsonDeserializer_findDefaultImplDeserializer == null) {
            JavaType javaType_handleMissingTypeId = _handleMissingTypeId(deserializationContext, str);
            if (javaType_handleMissingTypeId == null) {
                return null;
            }
            jsonDeserializer_findDefaultImplDeserializer = deserializationContext.findContextualValueDeserializer(javaType_handleMissingTypeId, this._property);
        }
        if (aiiVar != null) {
            aiiVar.writeEndObject();
            jsonParser = aiiVar.a(jsonParser);
            jsonParser.nextToken();
        }
        return jsonDeserializer_findDefaultImplDeserializer.deserialize(jsonParser, deserializationContext);
    }

    @Override // defpackage.adf, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromAny(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.hasToken(JsonToken.START_ARRAY)) {
            return super.deserializeTypedFromArray(jsonParser, deserializationContext);
        }
        return deserializeTypedFromObject(jsonParser, deserializationContext);
    }
}
