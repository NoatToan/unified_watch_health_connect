package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
@JacksonStdImpl
public class abu extends StdDeserializer<Object> implements ResolvableDeserializer, ContextualDeserializer {
    protected static final Object[] e = new Object[0];
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected JsonDeserializer<Object> f230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected JavaType f231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected JavaType f232c;
    protected JsonDeserializer<Object> d;
    protected final boolean f;
    protected JsonDeserializer<Object> g;
    protected JsonDeserializer<Object> i;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(yi yiVar) {
        return null;
    }

    @Deprecated
    public abu() {
        this((JavaType) null, (JavaType) null);
    }

    public abu(JavaType javaType, JavaType javaType2) {
        super((Class<?>) Object.class);
        this.f232c = javaType;
        this.f231b = javaType2;
        this.f = false;
    }

    protected abu(abu abuVar, boolean z) {
        super((Class<?>) Object.class);
        this.d = abuVar.d;
        this.f230a = abuVar.f230a;
        this.g = abuVar.g;
        this.i = abuVar.i;
        this.f232c = abuVar.f232c;
        this.f231b = abuVar.f231b;
        this.f = z;
    }

    @Override // com.fasterxml.jackson.databind.deser.ResolvableDeserializer
    public void resolve(DeserializationContext deserializationContext) throws ym {
        JavaType javaTypeConstructType = deserializationContext.constructType(Object.class);
        JavaType javaTypeConstructType2 = deserializationContext.constructType(String.class);
        ahp typeFactory = deserializationContext.getTypeFactory();
        JavaType javaType = this.f232c;
        if (javaType == null) {
            this.f230a = c(b(deserializationContext, typeFactory.b(List.class, javaTypeConstructType)));
        } else {
            this.f230a = b(deserializationContext, javaType);
        }
        JavaType javaType2 = this.f231b;
        if (javaType2 == null) {
            this.d = c(b(deserializationContext, typeFactory.c(Map.class, javaTypeConstructType2, javaTypeConstructType)));
        } else {
            this.d = b(deserializationContext, javaType2);
        }
        this.g = c(b(deserializationContext, javaTypeConstructType2));
        this.i = c(b(deserializationContext, typeFactory.b(Number.class)));
        JavaType javaTypeC = ahp.c();
        this.d = deserializationContext.handleSecondaryContextualization(this.d, null, javaTypeC);
        this.f230a = deserializationContext.handleSecondaryContextualization(this.f230a, null, javaTypeC);
        this.g = deserializationContext.handleSecondaryContextualization(this.g, null, javaTypeC);
        this.i = deserializationContext.handleSecondaryContextualization(this.i, null, javaTypeC);
    }

    protected JsonDeserializer<Object> b(DeserializationContext deserializationContext, JavaType javaType) throws ym {
        return deserializationContext.findNonContextualValueDeserializer(javaType);
    }

    protected JsonDeserializer<Object> c(JsonDeserializer<Object> jsonDeserializer) {
        if (ahw.c(jsonDeserializer)) {
            return null;
        }
        return jsonDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws ym {
        boolean z = beanProperty == null && Boolean.FALSE.equals(deserializationContext.getConfig().getDefaultMergeable(Object.class));
        if (this.g == null && this.i == null && this.d == null && this.f230a == null && getClass() == abu.class) {
            return e.a(z);
        }
        return z != this.f ? new abu(this, z) : this;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Untyped;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        switch (jsonParser.currentTokenId()) {
            case 1:
            case 2:
            case 5:
                JsonDeserializer<Object> jsonDeserializer = this.d;
                if (jsonDeserializer != null) {
                    return jsonDeserializer.deserialize(jsonParser, deserializationContext);
                }
                return d(jsonParser, deserializationContext);
            case 3:
                if (deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                    return b(jsonParser, deserializationContext);
                }
                JsonDeserializer<Object> jsonDeserializer2 = this.f230a;
                if (jsonDeserializer2 != null) {
                    return jsonDeserializer2.deserialize(jsonParser, deserializationContext);
                }
                return a(jsonParser, deserializationContext);
            case 4:
            default:
                return deserializationContext.handleUnexpectedToken(Object.class, jsonParser);
            case 6:
                JsonDeserializer<Object> jsonDeserializer3 = this.g;
                if (jsonDeserializer3 != null) {
                    return jsonDeserializer3.deserialize(jsonParser, deserializationContext);
                }
                return jsonParser.getText();
            case 7:
                JsonDeserializer<Object> jsonDeserializer4 = this.i;
                if (jsonDeserializer4 != null) {
                    return jsonDeserializer4.deserialize(jsonParser, deserializationContext);
                }
                if (deserializationContext.hasSomeOfFeatures(F_MASK_INT_COERCIONS)) {
                    return _coerceIntegral(jsonParser, deserializationContext);
                }
                return jsonParser.getNumberValue();
            case 8:
                JsonDeserializer<Object> jsonDeserializer5 = this.i;
                if (jsonDeserializer5 != null) {
                    return jsonDeserializer5.deserialize(jsonParser, deserializationContext);
                }
                if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                    return jsonParser.getDecimalValue();
                }
                return jsonParser.getNumberValue();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jsonParser.getEmbeddedObject();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        int iCurrentTokenId = jsonParser.currentTokenId();
        if (iCurrentTokenId != 1 && iCurrentTokenId != 3) {
            switch (iCurrentTokenId) {
                case 5:
                    break;
                case 6:
                    JsonDeserializer<Object> jsonDeserializer = this.g;
                    if (jsonDeserializer != null) {
                        return jsonDeserializer.deserialize(jsonParser, deserializationContext);
                    }
                    return jsonParser.getText();
                case 7:
                    JsonDeserializer<Object> jsonDeserializer2 = this.i;
                    if (jsonDeserializer2 != null) {
                        return jsonDeserializer2.deserialize(jsonParser, deserializationContext);
                    }
                    if (deserializationContext.hasSomeOfFeatures(F_MASK_INT_COERCIONS)) {
                        return _coerceIntegral(jsonParser, deserializationContext);
                    }
                    return jsonParser.getNumberValue();
                case 8:
                    JsonDeserializer<Object> jsonDeserializer3 = this.i;
                    if (jsonDeserializer3 != null) {
                        return jsonDeserializer3.deserialize(jsonParser, deserializationContext);
                    }
                    if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                        return jsonParser.getDecimalValue();
                    }
                    return jsonParser.getNumberValue();
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return jsonParser.getEmbeddedObject();
                default:
                    return deserializationContext.handleUnexpectedToken(Object.class, jsonParser);
            }
        }
        return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (this.f) {
            return deserialize(jsonParser, deserializationContext);
        }
        switch (jsonParser.currentTokenId()) {
            case 1:
            case 2:
            case 5:
                JsonDeserializer<Object> jsonDeserializer = this.d;
                if (jsonDeserializer != null) {
                    return jsonDeserializer.deserialize(jsonParser, deserializationContext, obj);
                }
                if (obj instanceof Map) {
                    return b(jsonParser, deserializationContext, (Map) obj);
                }
                return d(jsonParser, deserializationContext);
            case 3:
                JsonDeserializer<Object> jsonDeserializer2 = this.f230a;
                if (jsonDeserializer2 != null) {
                    return jsonDeserializer2.deserialize(jsonParser, deserializationContext, obj);
                }
                if (obj instanceof Collection) {
                    return c(jsonParser, deserializationContext, (Collection) obj);
                }
                if (deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                    return b(jsonParser, deserializationContext);
                }
                return a(jsonParser, deserializationContext);
            case 4:
            default:
                return deserialize(jsonParser, deserializationContext);
            case 6:
                JsonDeserializer<Object> jsonDeserializer3 = this.g;
                if (jsonDeserializer3 != null) {
                    return jsonDeserializer3.deserialize(jsonParser, deserializationContext, obj);
                }
                return jsonParser.getText();
            case 7:
                JsonDeserializer<Object> jsonDeserializer4 = this.i;
                if (jsonDeserializer4 != null) {
                    return jsonDeserializer4.deserialize(jsonParser, deserializationContext, obj);
                }
                if (deserializationContext.hasSomeOfFeatures(F_MASK_INT_COERCIONS)) {
                    return _coerceIntegral(jsonParser, deserializationContext);
                }
                return jsonParser.getNumberValue();
            case 8:
                JsonDeserializer<Object> jsonDeserializer5 = this.i;
                if (jsonDeserializer5 != null) {
                    return jsonDeserializer5.deserialize(jsonParser, deserializationContext, obj);
                }
                if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                    return jsonParser.getDecimalValue();
                }
                return jsonParser.getNumberValue();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jsonParser.getEmbeddedObject();
        }
    }

    protected Object a(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int i = 2;
        if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
            return new ArrayList(2);
        }
        Object objDeserialize = deserialize(jsonParser, deserializationContext);
        if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(objDeserialize);
            return arrayList;
        }
        Object objDeserialize2 = deserialize(jsonParser, deserializationContext);
        if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(objDeserialize);
            arrayList2.add(objDeserialize2);
            return arrayList2;
        }
        aib aibVarLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] objArrD = aibVarLeaseObjectBuffer.d();
        objArrD[0] = objDeserialize;
        objArrD[1] = objDeserialize2;
        int i2 = 2;
        while (true) {
            Object objDeserialize3 = deserialize(jsonParser, deserializationContext);
            i++;
            if (i2 >= objArrD.length) {
                objArrD = aibVarLeaseObjectBuffer.d(objArrD);
                i2 = 0;
            }
            int i3 = i2 + 1;
            objArrD[i2] = objDeserialize3;
            if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
                ArrayList arrayList3 = new ArrayList(i);
                aibVarLeaseObjectBuffer.d(objArrD, i3, arrayList3);
                return arrayList3;
            }
            i2 = i3;
        }
    }

    protected Object c(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            collection.add(deserialize(jsonParser, deserializationContext));
        }
        return collection;
    }

    protected Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strCurrentName;
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken == JsonToken.START_OBJECT) {
            strCurrentName = jsonParser.nextFieldName();
        } else if (jsonTokenCurrentToken == JsonToken.FIELD_NAME) {
            strCurrentName = jsonParser.currentName();
        } else {
            if (jsonTokenCurrentToken != JsonToken.END_OBJECT) {
                return deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
            }
            strCurrentName = null;
        }
        String str = strCurrentName;
        if (str == null) {
            return new LinkedHashMap(2);
        }
        jsonParser.nextToken();
        Object objDeserialize = deserialize(jsonParser, deserializationContext);
        String strNextFieldName = jsonParser.nextFieldName();
        if (strNextFieldName == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(2);
            linkedHashMap.put(str, objDeserialize);
            return linkedHashMap;
        }
        jsonParser.nextToken();
        Object objDeserialize2 = deserialize(jsonParser, deserializationContext);
        String strNextFieldName2 = jsonParser.nextFieldName();
        if (strNextFieldName2 == null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(4);
            linkedHashMap2.put(str, objDeserialize);
            return linkedHashMap2.put(strNextFieldName, objDeserialize2) != null ? a(jsonParser, deserializationContext, linkedHashMap2, str, objDeserialize, objDeserialize2, strNextFieldName2) : linkedHashMap2;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(str, objDeserialize);
        if (linkedHashMap3.put(strNextFieldName, objDeserialize2) != null) {
            return a(jsonParser, deserializationContext, linkedHashMap3, str, objDeserialize, objDeserialize2, strNextFieldName2);
        }
        do {
            jsonParser.nextToken();
            Object objDeserialize3 = deserialize(jsonParser, deserializationContext);
            Object objPut = linkedHashMap3.put(strNextFieldName2, objDeserialize3);
            if (objPut != null) {
                return a(jsonParser, deserializationContext, linkedHashMap3, strNextFieldName2, objPut, objDeserialize3, jsonParser.nextFieldName());
            }
            strNextFieldName2 = jsonParser.nextFieldName();
        } while (strNextFieldName2 != null);
        return linkedHashMap3;
    }

    protected Object a(JsonParser jsonParser, DeserializationContext deserializationContext, Map<String, Object> map, String str, Object obj, Object obj2, String str2) throws IOException {
        boolean zIsEnabled = deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES);
        if (zIsEnabled) {
            c(map, str, obj, obj2);
        }
        while (str2 != null) {
            jsonParser.nextToken();
            Object objDeserialize = deserialize(jsonParser, deserializationContext);
            Object objPut = map.put(str2, objDeserialize);
            if (objPut != null && zIsEnabled) {
                c(map, str, objPut, objDeserialize);
            }
            str2 = jsonParser.nextFieldName();
        }
        return map;
    }

    private void c(Map<String, Object> map, String str, Object obj, Object obj2) {
        if (obj instanceof List) {
            ((List) obj).add(obj2);
            map.put(str, obj);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            arrayList.add(obj2);
            map.put(str, arrayList);
        }
    }

    protected Object[] b(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
            return e;
        }
        aib aibVarLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] objArrD = aibVarLeaseObjectBuffer.d();
        int i = 0;
        while (true) {
            Object objDeserialize = deserialize(jsonParser, deserializationContext);
            if (i >= objArrD.length) {
                objArrD = aibVarLeaseObjectBuffer.d(objArrD);
                i = 0;
            }
            int i2 = i + 1;
            objArrD[i] = objDeserialize;
            if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
                return aibVarLeaseObjectBuffer.c(objArrD, i2);
            }
            i = i2;
        }
    }

    protected Object b(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        Object objDeserialize;
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken == JsonToken.START_OBJECT) {
            jsonTokenCurrentToken = jsonParser.nextToken();
        }
        if (jsonTokenCurrentToken != JsonToken.END_OBJECT) {
            String strCurrentName = jsonParser.currentName();
            do {
                jsonParser.nextToken();
                Object obj = map.get(strCurrentName);
                if (obj != null) {
                    objDeserialize = deserialize(jsonParser, deserializationContext, obj);
                } else {
                    objDeserialize = deserialize(jsonParser, deserializationContext);
                }
                if (objDeserialize != obj) {
                    map.put(strCurrentName, objDeserialize);
                }
                strCurrentName = jsonParser.nextFieldName();
            } while (strCurrentName != null);
        }
        return map;
    }

    @JacksonStdImpl
    public static class e extends StdDeserializer<Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f233c = new e();
        private static final long serialVersionUID = 1;
        protected final boolean d;

        public e() {
            this(false);
        }

        protected e(boolean z) {
            super((Class<?>) Object.class);
            this.d = z;
        }

        public static e a(boolean z) {
            if (z) {
                return new e(true);
            }
            return f233c;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public LogicalType logicalType() {
            return LogicalType.Untyped;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Boolean supportsUpdate(yi yiVar) {
            if (this.d) {
                return Boolean.FALSE;
            }
            return null;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return c(jsonParser, deserializationContext, 0);
        }

        private Object c(JsonParser jsonParser, DeserializationContext deserializationContext, int i) throws IOException {
            switch (jsonParser.currentTokenId()) {
                case 1:
                    if (jsonParser.nextToken() == JsonToken.END_OBJECT) {
                        return new LinkedHashMap(2);
                    }
                    break;
                case 2:
                    return new LinkedHashMap(2);
                case 3:
                    if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
                        if (deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                            return abu.e;
                        }
                        return new ArrayList(2);
                    }
                    if (i > 1000) {
                        throw new wn(jsonParser, "JSON is too deeply nested.");
                    }
                    if (deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                        return b(jsonParser, deserializationContext, i);
                    }
                    return d(jsonParser, deserializationContext, i);
                case 4:
                default:
                    return deserializationContext.handleUnexpectedToken(Object.class, jsonParser);
                case 5:
                    break;
                case 6:
                    return jsonParser.getText();
                case 7:
                    if (deserializationContext.hasSomeOfFeatures(F_MASK_INT_COERCIONS)) {
                        return _coerceIntegral(jsonParser, deserializationContext);
                    }
                    return jsonParser.getNumberValue();
                case 8:
                    if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                        return jsonParser.getDecimalValue();
                    }
                    return jsonParser.getNumberValue();
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return jsonParser.getEmbeddedObject();
            }
            if (i > 1000) {
                throw new wn(jsonParser, "JSON is too deeply nested.");
            }
            return a(jsonParser, deserializationContext, i);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
            int iCurrentTokenId = jsonParser.currentTokenId();
            if (iCurrentTokenId != 1 && iCurrentTokenId != 3) {
                switch (iCurrentTokenId) {
                    case 5:
                        break;
                    case 6:
                        return jsonParser.getText();
                    case 7:
                        if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
                            return jsonParser.getBigIntegerValue();
                        }
                        return jsonParser.getNumberValue();
                    case 8:
                        if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                            return jsonParser.getDecimalValue();
                        }
                        return jsonParser.getNumberValue();
                    case 9:
                        return Boolean.TRUE;
                    case 10:
                        return Boolean.FALSE;
                    case 11:
                        return null;
                    case 12:
                        return jsonParser.getEmbeddedObject();
                    default:
                        return deserializationContext.handleUnexpectedToken(Object.class, jsonParser);
                }
            }
            return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0046  */
        /* JADX WARN: Code duplicated, block: B:31:0x004a  */
        /* JADX WARN: Code duplicated, block: B:34:0x005a  */
        /* JADX WARN: Code duplicated, block: B:35:0x005f  */
        /* JADX WARN: Code duplicated, block: B:37:0x0065  */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
            Map map;
            String strCurrentName;
            Object obj2;
            Object objDeserialize;
            if (this.d) {
                return deserialize(jsonParser, deserializationContext);
            }
            int iCurrentTokenId = jsonParser.currentTokenId();
            if (iCurrentTokenId == 1) {
                if (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                    if (obj instanceof Map) {
                        map = (Map) obj;
                        strCurrentName = jsonParser.currentName();
                        do {
                            jsonParser.nextToken();
                            obj2 = map.get(strCurrentName);
                            if (obj2 != null) {
                                objDeserialize = deserialize(jsonParser, deserializationContext, obj2);
                            } else {
                                objDeserialize = deserialize(jsonParser, deserializationContext);
                            }
                            if (objDeserialize != obj2) {
                                map.put(strCurrentName, objDeserialize);
                            }
                            strCurrentName = jsonParser.nextFieldName();
                        } while (strCurrentName != null);
                    }
                    return deserialize(jsonParser, deserializationContext);
                }
                return obj;
            }
            if (iCurrentTokenId != 2) {
                if (iCurrentTokenId != 3) {
                    if (iCurrentTokenId != 4) {
                        if (iCurrentTokenId == 5) {
                            if (obj instanceof Map) {
                                map = (Map) obj;
                                strCurrentName = jsonParser.currentName();
                                do {
                                    jsonParser.nextToken();
                                    obj2 = map.get(strCurrentName);
                                    if (obj2 != null) {
                                        objDeserialize = deserialize(jsonParser, deserializationContext, obj2);
                                    } else {
                                        objDeserialize = deserialize(jsonParser, deserializationContext);
                                    }
                                    if (objDeserialize != obj2) {
                                        map.put(strCurrentName, objDeserialize);
                                    }
                                    strCurrentName = jsonParser.nextFieldName();
                                } while (strCurrentName != null);
                            }
                        }
                        return deserialize(jsonParser, deserializationContext);
                    }
                } else if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    if (obj instanceof Collection) {
                        Collection collection = (Collection) obj;
                        do {
                            collection.add(deserialize(jsonParser, deserializationContext));
                        } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
                    }
                    return deserialize(jsonParser, deserializationContext);
                }
            }
            return obj;
        }

        protected Object d(JsonParser jsonParser, DeserializationContext deserializationContext, int i) throws IOException {
            int i2 = i + 1;
            Object objC = c(jsonParser, deserializationContext, i2);
            int i3 = 2;
            if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(objC);
                return arrayList;
            }
            Object objC2 = c(jsonParser, deserializationContext, i2);
            if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
                ArrayList arrayList2 = new ArrayList(2);
                arrayList2.add(objC);
                arrayList2.add(objC2);
                return arrayList2;
            }
            aib aibVarLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
            Object[] objArrD = aibVarLeaseObjectBuffer.d();
            objArrD[0] = objC;
            objArrD[1] = objC2;
            int i4 = 2;
            while (true) {
                Object objC3 = c(jsonParser, deserializationContext, i2);
                i3++;
                if (i4 >= objArrD.length) {
                    objArrD = aibVarLeaseObjectBuffer.d(objArrD);
                    i4 = 0;
                }
                int i5 = i4 + 1;
                objArrD[i4] = objC3;
                if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
                    ArrayList arrayList3 = new ArrayList(i3);
                    aibVarLeaseObjectBuffer.d(objArrD, i5, arrayList3);
                    return arrayList3;
                }
                i4 = i5;
            }
        }

        protected Object[] b(JsonParser jsonParser, DeserializationContext deserializationContext, int i) throws IOException {
            aib aibVarLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
            Object[] objArrD = aibVarLeaseObjectBuffer.d();
            int i2 = 0;
            while (true) {
                Object objC = c(jsonParser, deserializationContext, i + 1);
                if (i2 >= objArrD.length) {
                    objArrD = aibVarLeaseObjectBuffer.d(objArrD);
                    i2 = 0;
                }
                int i3 = i2 + 1;
                objArrD[i2] = objC;
                if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
                    return aibVarLeaseObjectBuffer.c(objArrD, i3);
                }
                i2 = i3;
            }
        }

        protected Object a(JsonParser jsonParser, DeserializationContext deserializationContext, int i) throws IOException {
            int i2 = i + 1;
            String text = jsonParser.getText();
            jsonParser.nextToken();
            Object objC = c(jsonParser, deserializationContext, i2);
            String strNextFieldName = jsonParser.nextFieldName();
            if (strNextFieldName == null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(2);
                linkedHashMap.put(text, objC);
                return linkedHashMap;
            }
            jsonParser.nextToken();
            Object objC2 = c(jsonParser, deserializationContext, i2);
            String strNextFieldName2 = jsonParser.nextFieldName();
            if (strNextFieldName2 == null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(4);
                linkedHashMap2.put(text, objC);
                return linkedHashMap2.put(strNextFieldName, objC2) != null ? d(jsonParser, deserializationContext, linkedHashMap2, text, objC, objC2, strNextFieldName2) : linkedHashMap2;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put(text, objC);
            if (linkedHashMap3.put(strNextFieldName, objC2) != null) {
                return d(jsonParser, deserializationContext, linkedHashMap3, text, objC, objC2, strNextFieldName2);
            }
            String strNextFieldName3 = strNextFieldName2;
            do {
                jsonParser.nextToken();
                Object objC3 = c(jsonParser, deserializationContext, i2);
                Object objPut = linkedHashMap3.put(strNextFieldName3, objC3);
                if (objPut != null) {
                    return d(jsonParser, deserializationContext, linkedHashMap3, strNextFieldName3, objPut, objC3, jsonParser.nextFieldName());
                }
                strNextFieldName3 = jsonParser.nextFieldName();
            } while (strNextFieldName3 != null);
            return linkedHashMap3;
        }

        protected Object d(JsonParser jsonParser, DeserializationContext deserializationContext, Map<String, Object> map, String str, Object obj, Object obj2, String str2) throws IOException {
            boolean zIsEnabled = deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES);
            if (zIsEnabled) {
                b(map, str, obj, obj2);
            }
            while (str2 != null) {
                jsonParser.nextToken();
                Object objDeserialize = deserialize(jsonParser, deserializationContext);
                Object objPut = map.put(str2, objDeserialize);
                if (objPut != null && zIsEnabled) {
                    b(map, str2, objPut, objDeserialize);
                }
                str2 = jsonParser.nextFieldName();
            }
            return map;
        }

        private void b(Map<String, Object> map, String str, Object obj, Object obj2) {
            if (obj instanceof List) {
                ((List) obj).add(obj2);
                map.put(str, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(obj);
                arrayList.add(obj2);
                map.put(str, arrayList);
            }
        }
    }
}
