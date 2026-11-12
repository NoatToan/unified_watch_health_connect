package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.TypeFactory;
import defpackage.aj4;
import defpackage.bqk;
import defpackage.esd;
import defpackage.h04;
import defpackage.q4q;
import defpackage.qqd;
import defpackage.u3h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public class UntypedObjectDeserializer extends StdDeserializer<Object> implements bqk, aj4 {
    protected static final Object[] NO_OBJECTS = new Object[0];
    private static final long serialVersionUID = 1;
    protected esd<Object> _listDeserializer;
    protected JavaType _listType;
    protected esd<Object> _mapDeserializer;
    protected JavaType _mapType;
    protected final boolean _nonMerging;
    protected esd<Object> _numberDeserializer;
    protected esd<Object> _stringDeserializer;

    @qqd
    public static class Vanilla extends StdDeserializer<Object> {
        private static final long serialVersionUID = 1;
        public static final Vanilla std = new Vanilla();
        protected final boolean _nonMerging;

        public Vanilla() {
            this(false);
        }

        public static Vanilla instance(boolean z) {
            return z ? new Vanilla(true) : std;
        }

        @Override // defpackage.esd
        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            switch (jsonParser.M()) {
                case 1:
                    if (jsonParser.G0() == JsonToken.END_OBJECT) {
                        return new LinkedHashMap(2);
                    }
                    break;
                case 2:
                    return new LinkedHashMap(2);
                case 3:
                    if (jsonParser.G0() == JsonToken.END_ARRAY) {
                        return deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY) ? UntypedObjectDeserializer.NO_OBJECTS : new ArrayList(2);
                    }
                    return deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY) ? mapArrayToArray(jsonParser, deserializationContext) : mapArray(jsonParser, deserializationContext);
                case 4:
                default:
                    return deserializationContext.handleUnexpectedToken(Object.class, jsonParser);
                case 5:
                    break;
                case 6:
                    return jsonParser.d0();
                case 7:
                    return deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS) ? _coerceIntegral(jsonParser, deserializationContext) : jsonParser.U();
                case 8:
                    return deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.N() : jsonParser.U();
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return jsonParser.P();
            }
            return mapObject(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, defpackage.esd
        public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
            int iM = jsonParser.M();
            if (iM != 1 && iM != 3) {
                switch (iM) {
                    case 5:
                        break;
                    case 6:
                        return jsonParser.d0();
                    case 7:
                        return deserializationContext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS) ? jsonParser.o() : jsonParser.U();
                    case 8:
                        return deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.N() : jsonParser.U();
                    case 9:
                        return Boolean.TRUE;
                    case 10:
                        return Boolean.FALSE;
                    case 11:
                        return null;
                    case 12:
                        return jsonParser.P();
                    default:
                        return deserializationContext.handleUnexpectedToken(Object.class, jsonParser);
                }
            }
            return q4qVar.deserializeTypedFromAny(jsonParser, deserializationContext);
        }

        public Object mapArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            Object objDeserialize = deserialize(jsonParser, deserializationContext);
            JsonToken jsonTokenG0 = jsonParser.G0();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            int i = 2;
            if (jsonTokenG0 == jsonToken) {
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(objDeserialize);
                return arrayList;
            }
            Object objDeserialize2 = deserialize(jsonParser, deserializationContext);
            if (jsonParser.G0() == jsonToken) {
                ArrayList arrayList2 = new ArrayList(2);
                arrayList2.add(objDeserialize);
                arrayList2.add(objDeserialize2);
                return arrayList2;
            }
            u3h u3hVarLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
            Object[] objArrI = u3hVarLeaseObjectBuffer.i();
            objArrI[0] = objDeserialize;
            objArrI[1] = objDeserialize2;
            int i2 = 2;
            while (true) {
                Object objDeserialize3 = deserialize(jsonParser, deserializationContext);
                i++;
                if (i2 >= objArrI.length) {
                    objArrI = u3hVarLeaseObjectBuffer.c(objArrI);
                    i2 = 0;
                }
                int i3 = i2 + 1;
                objArrI[i2] = objDeserialize3;
                if (jsonParser.G0() == JsonToken.END_ARRAY) {
                    ArrayList arrayList3 = new ArrayList(i);
                    u3hVarLeaseObjectBuffer.e(objArrI, i3, arrayList3);
                    return arrayList3;
                }
                i2 = i3;
            }
        }

        public Object[] mapArrayToArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            u3h u3hVarLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
            Object[] objArrI = u3hVarLeaseObjectBuffer.i();
            int i = 0;
            while (true) {
                Object objDeserialize = deserialize(jsonParser, deserializationContext);
                if (i >= objArrI.length) {
                    objArrI = u3hVarLeaseObjectBuffer.c(objArrI);
                    i = 0;
                }
                int i2 = i + 1;
                objArrI[i] = objDeserialize;
                if (jsonParser.G0() == JsonToken.END_ARRAY) {
                    return u3hVarLeaseObjectBuffer.f(objArrI, i2);
                }
                i = i2;
            }
        }

        public Object mapObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strD0 = jsonParser.d0();
            jsonParser.G0();
            Object objDeserialize = deserialize(jsonParser, deserializationContext);
            String strE0 = jsonParser.E0();
            if (strE0 == null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(2);
                linkedHashMap.put(strD0, objDeserialize);
                return linkedHashMap;
            }
            jsonParser.G0();
            Object objDeserialize2 = deserialize(jsonParser, deserializationContext);
            String strE1 = jsonParser.E0();
            if (strE1 == null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(4);
                linkedHashMap2.put(strD0, objDeserialize);
                linkedHashMap2.put(strE0, objDeserialize2);
                return linkedHashMap2;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put(strD0, objDeserialize);
            linkedHashMap3.put(strE0, objDeserialize2);
            do {
                jsonParser.G0();
                linkedHashMap3.put(strE1, deserialize(jsonParser, deserializationContext));
                strE1 = jsonParser.E0();
            } while (strE1 != null);
            return linkedHashMap3;
        }

        @Override // defpackage.esd
        public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
            if (this._nonMerging) {
                return Boolean.FALSE;
            }
            return null;
        }

        public Vanilla(boolean z) {
            super((Class<?>) Object.class);
            this._nonMerging = z;
        }

        @Override // defpackage.esd
        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
            Object objDeserialize;
            if (this._nonMerging) {
                return deserialize(jsonParser, deserializationContext);
            }
            int iM = jsonParser.M();
            if (iM != 1) {
                if (iM != 2) {
                    if (iM == 3) {
                        if (jsonParser.G0() == JsonToken.END_ARRAY) {
                            return obj;
                        }
                        if (obj instanceof Collection) {
                            Collection collection = (Collection) obj;
                            do {
                                collection.add(deserialize(jsonParser, deserializationContext));
                            } while (jsonParser.G0() != JsonToken.END_ARRAY);
                        }
                        return deserialize(jsonParser, deserializationContext);
                    }
                    if (iM != 4) {
                        if (iM == 5) {
                        }
                        return deserialize(jsonParser, deserializationContext);
                    }
                }
                return obj;
            }
            if (jsonParser.G0() == JsonToken.END_OBJECT) {
                return obj;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                String strJ = jsonParser.J();
                do {
                    jsonParser.G0();
                    Object obj2 = map.get(strJ);
                    if (obj2 != null) {
                        objDeserialize = deserialize(jsonParser, deserializationContext, obj2);
                    } else {
                        objDeserialize = deserialize(jsonParser, deserializationContext);
                    }
                    if (objDeserialize != obj2) {
                        map.put(strJ, objDeserialize);
                    }
                    strJ = jsonParser.E0();
                } while (strJ != null);
                return obj;
            }
            return deserialize(jsonParser, deserializationContext);
        }
    }

    @Deprecated
    public UntypedObjectDeserializer() {
        this((JavaType) null, (JavaType) null);
    }

    public esd<Object> _clearIfStdImpl(esd<Object> esdVar) {
        if (h04.N(esdVar)) {
            return null;
        }
        return esdVar;
    }

    public esd<Object> _findCustomDeser(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        return deserializationContext.findNonContextualValueDeserializer(javaType);
    }

    @Override // defpackage.aj4
    public esd<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        boolean z = beanProperty == null && Boolean.FALSE.equals(deserializationContext.getConfig().getDefaultMergeable(Object.class));
        if (this._stringDeserializer == null && this._numberDeserializer == null && this._mapDeserializer == null && this._listDeserializer == null && getClass() == UntypedObjectDeserializer.class) {
            return Vanilla.instance(z);
        }
        return z != this._nonMerging ? new UntypedObjectDeserializer(this, z) : this;
    }

    @Override // defpackage.esd
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        switch (jsonParser.M()) {
            case 1:
            case 2:
            case 5:
                esd<Object> esdVar = this._mapDeserializer;
                return esdVar != null ? esdVar.deserialize(jsonParser, deserializationContext) : mapObject(jsonParser, deserializationContext);
            case 3:
                if (deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                    return mapArrayToArray(jsonParser, deserializationContext);
                }
                esd<Object> esdVar2 = this._listDeserializer;
                return esdVar2 != null ? esdVar2.deserialize(jsonParser, deserializationContext) : mapArray(jsonParser, deserializationContext);
            case 4:
            default:
                return deserializationContext.handleUnexpectedToken(Object.class, jsonParser);
            case 6:
                esd<Object> esdVar3 = this._stringDeserializer;
                return esdVar3 != null ? esdVar3.deserialize(jsonParser, deserializationContext) : jsonParser.d0();
            case 7:
                esd<Object> esdVar4 = this._numberDeserializer;
                if (esdVar4 != null) {
                    return esdVar4.deserialize(jsonParser, deserializationContext);
                }
                return deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS) ? _coerceIntegral(jsonParser, deserializationContext) : jsonParser.U();
            case 8:
                esd<Object> esdVar5 = this._numberDeserializer;
                if (esdVar5 != null) {
                    return esdVar5.deserialize(jsonParser, deserializationContext);
                }
                return deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.N() : jsonParser.U();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jsonParser.P();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, defpackage.esd
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
        int iM = jsonParser.M();
        if (iM != 1 && iM != 3) {
            switch (iM) {
                case 5:
                    break;
                case 6:
                    esd<Object> esdVar = this._stringDeserializer;
                    return esdVar != null ? esdVar.deserialize(jsonParser, deserializationContext) : jsonParser.d0();
                case 7:
                    esd<Object> esdVar2 = this._numberDeserializer;
                    if (esdVar2 != null) {
                        return esdVar2.deserialize(jsonParser, deserializationContext);
                    }
                    return deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS) ? _coerceIntegral(jsonParser, deserializationContext) : jsonParser.U();
                case 8:
                    esd<Object> esdVar3 = this._numberDeserializer;
                    if (esdVar3 != null) {
                        return esdVar3.deserialize(jsonParser, deserializationContext);
                    }
                    return deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.N() : jsonParser.U();
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return jsonParser.P();
                default:
                    return deserializationContext.handleUnexpectedToken(Object.class, jsonParser);
            }
        }
        return q4qVar.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    @Override // defpackage.esd
    public boolean isCachable() {
        return true;
    }

    public Object mapArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken jsonTokenG0 = jsonParser.G0();
        JsonToken jsonToken = JsonToken.END_ARRAY;
        int i = 2;
        if (jsonTokenG0 == jsonToken) {
            return new ArrayList(2);
        }
        Object objDeserialize = deserialize(jsonParser, deserializationContext);
        if (jsonParser.G0() == jsonToken) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(objDeserialize);
            return arrayList;
        }
        Object objDeserialize2 = deserialize(jsonParser, deserializationContext);
        if (jsonParser.G0() == jsonToken) {
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(objDeserialize);
            arrayList2.add(objDeserialize2);
            return arrayList2;
        }
        u3h u3hVarLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] objArrI = u3hVarLeaseObjectBuffer.i();
        objArrI[0] = objDeserialize;
        objArrI[1] = objDeserialize2;
        int i2 = 2;
        while (true) {
            Object objDeserialize3 = deserialize(jsonParser, deserializationContext);
            i++;
            if (i2 >= objArrI.length) {
                objArrI = u3hVarLeaseObjectBuffer.c(objArrI);
                i2 = 0;
            }
            int i3 = i2 + 1;
            objArrI[i2] = objDeserialize3;
            if (jsonParser.G0() == JsonToken.END_ARRAY) {
                ArrayList arrayList3 = new ArrayList(i);
                u3hVarLeaseObjectBuffer.e(objArrI, i3, arrayList3);
                return arrayList3;
            }
            i2 = i3;
        }
    }

    public Object[] mapArrayToArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.G0() == JsonToken.END_ARRAY) {
            return NO_OBJECTS;
        }
        u3h u3hVarLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] objArrI = u3hVarLeaseObjectBuffer.i();
        int i = 0;
        while (true) {
            Object objDeserialize = deserialize(jsonParser, deserializationContext);
            if (i >= objArrI.length) {
                objArrI = u3hVarLeaseObjectBuffer.c(objArrI);
                i = 0;
            }
            int i2 = i + 1;
            objArrI[i] = objDeserialize;
            if (jsonParser.G0() == JsonToken.END_ARRAY) {
                return u3hVarLeaseObjectBuffer.f(objArrI, i2);
            }
            i = i2;
        }
    }

    public Object mapObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strJ;
        JsonToken jsonTokenK = jsonParser.K();
        if (jsonTokenK == JsonToken.START_OBJECT) {
            strJ = jsonParser.E0();
        } else if (jsonTokenK == JsonToken.FIELD_NAME) {
            strJ = jsonParser.J();
        } else {
            if (jsonTokenK != JsonToken.END_OBJECT) {
                return deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
            }
            strJ = null;
        }
        if (strJ == null) {
            return new LinkedHashMap(2);
        }
        jsonParser.G0();
        Object objDeserialize = deserialize(jsonParser, deserializationContext);
        String strE0 = jsonParser.E0();
        if (strE0 == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(2);
            linkedHashMap.put(strJ, objDeserialize);
            return linkedHashMap;
        }
        jsonParser.G0();
        Object objDeserialize2 = deserialize(jsonParser, deserializationContext);
        String strE1 = jsonParser.E0();
        if (strE1 == null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(4);
            linkedHashMap2.put(strJ, objDeserialize);
            linkedHashMap2.put(strE0, objDeserialize2);
            return linkedHashMap2;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(strJ, objDeserialize);
        linkedHashMap3.put(strE0, objDeserialize2);
        do {
            jsonParser.G0();
            linkedHashMap3.put(strE1, deserialize(jsonParser, deserializationContext));
            strE1 = jsonParser.E0();
        } while (strE1 != null);
        return linkedHashMap3;
    }

    @Override // defpackage.bqk
    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        JavaType javaTypeConstructType = deserializationContext.constructType(Object.class);
        JavaType javaTypeConstructType2 = deserializationContext.constructType(String.class);
        TypeFactory typeFactory = deserializationContext.getTypeFactory();
        JavaType javaType = this._listType;
        if (javaType == null) {
            this._listDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationContext, typeFactory.constructCollectionType(List.class, javaTypeConstructType)));
        } else {
            this._listDeserializer = _findCustomDeser(deserializationContext, javaType);
        }
        JavaType javaType2 = this._mapType;
        if (javaType2 == null) {
            this._mapDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationContext, typeFactory.constructMapType(Map.class, javaTypeConstructType2, javaTypeConstructType)));
        } else {
            this._mapDeserializer = _findCustomDeser(deserializationContext, javaType2);
        }
        this._stringDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationContext, javaTypeConstructType2));
        this._numberDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationContext, typeFactory.constructType(Number.class)));
        JavaType javaTypeUnknownType = TypeFactory.unknownType();
        this._mapDeserializer = deserializationContext.handleSecondaryContextualization(this._mapDeserializer, null, javaTypeUnknownType);
        this._listDeserializer = deserializationContext.handleSecondaryContextualization(this._listDeserializer, null, javaTypeUnknownType);
        this._stringDeserializer = deserializationContext.handleSecondaryContextualization(this._stringDeserializer, null, javaTypeUnknownType);
        this._numberDeserializer = deserializationContext.handleSecondaryContextualization(this._numberDeserializer, null, javaTypeUnknownType);
    }

    @Override // defpackage.esd
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return null;
    }

    public UntypedObjectDeserializer(JavaType javaType, JavaType javaType2) {
        super((Class<?>) Object.class);
        this._listType = javaType;
        this._mapType = javaType2;
        this._nonMerging = false;
    }

    public UntypedObjectDeserializer(UntypedObjectDeserializer untypedObjectDeserializer, esd<?> esdVar, esd<?> esdVar2, esd<?> esdVar3, esd<?> esdVar4) {
        super((Class<?>) Object.class);
        this._mapDeserializer = esdVar;
        this._listDeserializer = esdVar2;
        this._stringDeserializer = esdVar3;
        this._numberDeserializer = esdVar4;
        this._listType = untypedObjectDeserializer._listType;
        this._mapType = untypedObjectDeserializer._mapType;
        this._nonMerging = untypedObjectDeserializer._nonMerging;
    }

    public UntypedObjectDeserializer(UntypedObjectDeserializer untypedObjectDeserializer, boolean z) {
        super((Class<?>) Object.class);
        this._mapDeserializer = untypedObjectDeserializer._mapDeserializer;
        this._listDeserializer = untypedObjectDeserializer._listDeserializer;
        this._stringDeserializer = untypedObjectDeserializer._stringDeserializer;
        this._numberDeserializer = untypedObjectDeserializer._numberDeserializer;
        this._listType = untypedObjectDeserializer._listType;
        this._mapType = untypedObjectDeserializer._mapType;
        this._nonMerging = z;
    }

    public Object mapArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        while (jsonParser.G0() != JsonToken.END_ARRAY) {
            collection.add(deserialize(jsonParser, deserializationContext));
        }
        return collection;
    }

    public Object mapObject(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        Object objDeserialize;
        JsonToken jsonTokenK = jsonParser.K();
        if (jsonTokenK == JsonToken.START_OBJECT) {
            jsonTokenK = jsonParser.G0();
        }
        if (jsonTokenK == JsonToken.END_OBJECT) {
            return map;
        }
        String strJ = jsonParser.J();
        do {
            jsonParser.G0();
            Object obj = map.get(strJ);
            if (obj != null) {
                objDeserialize = deserialize(jsonParser, deserializationContext, obj);
            } else {
                objDeserialize = deserialize(jsonParser, deserializationContext);
            }
            if (objDeserialize != obj) {
                map.put(strJ, objDeserialize);
            }
            strJ = jsonParser.E0();
        } while (strJ != null);
        return map;
    }

    @Override // defpackage.esd
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (this._nonMerging) {
            return deserialize(jsonParser, deserializationContext);
        }
        switch (jsonParser.M()) {
            case 1:
            case 2:
            case 5:
                esd<Object> esdVar = this._mapDeserializer;
                if (esdVar != null) {
                    return esdVar.deserialize(jsonParser, deserializationContext, obj);
                }
                if (obj instanceof Map) {
                    return mapObject(jsonParser, deserializationContext, (Map) obj);
                }
                return mapObject(jsonParser, deserializationContext);
            case 3:
                esd<Object> esdVar2 = this._listDeserializer;
                if (esdVar2 != null) {
                    return esdVar2.deserialize(jsonParser, deserializationContext, obj);
                }
                if (obj instanceof Collection) {
                    return mapArray(jsonParser, deserializationContext, (Collection) obj);
                }
                if (deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                    return mapArrayToArray(jsonParser, deserializationContext);
                }
                return mapArray(jsonParser, deserializationContext);
            case 4:
            default:
                return deserialize(jsonParser, deserializationContext);
            case 6:
                esd<Object> esdVar3 = this._stringDeserializer;
                if (esdVar3 != null) {
                    return esdVar3.deserialize(jsonParser, deserializationContext, obj);
                }
                return jsonParser.d0();
            case 7:
                esd<Object> esdVar4 = this._numberDeserializer;
                if (esdVar4 != null) {
                    return esdVar4.deserialize(jsonParser, deserializationContext, obj);
                }
                if (deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS)) {
                    return _coerceIntegral(jsonParser, deserializationContext);
                }
                return jsonParser.U();
            case 8:
                esd<Object> esdVar5 = this._numberDeserializer;
                if (esdVar5 != null) {
                    return esdVar5.deserialize(jsonParser, deserializationContext, obj);
                }
                if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                    return jsonParser.N();
                }
                return jsonParser.U();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jsonParser.P();
        }
    }
}
