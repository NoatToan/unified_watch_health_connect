package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import defpackage.zsd;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r92<T extends zsd> extends StdDeserializer<T> {
    protected final Boolean _supportsUpdates;

    public r92(Class<T> cls, Boolean bool) {
        super((Class<?>) cls);
        this._supportsUpdates = bool;
    }

    public final zsd _fromEmbedded(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        Object objP = jsonParser.P();
        if (objP == null) {
            return jsonNodeFactory.nullNode();
        }
        if (objP.getClass() == byte[].class) {
            return jsonNodeFactory.m125binaryNode((byte[]) objP);
        }
        if (objP instanceof fcj) {
            return jsonNodeFactory.rawValueNode((fcj) objP);
        }
        return objP instanceof zsd ? (zsd) objP : jsonNodeFactory.pojoNode(objP);
    }

    public final zsd _fromFloat(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        JsonParser.NumberType numberTypeT = jsonParser.T();
        if (numberTypeT == JsonParser.NumberType.BIG_DECIMAL) {
            return jsonNodeFactory.numberNode(jsonParser.N());
        }
        if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            return jsonParser.D0() ? jsonNodeFactory.numberNode(jsonParser.O()) : jsonNodeFactory.numberNode(jsonParser.N());
        }
        return numberTypeT == JsonParser.NumberType.FLOAT ? jsonNodeFactory.numberNode(jsonParser.Q()) : jsonNodeFactory.numberNode(jsonParser.O());
    }

    public final zsd _fromInt(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        JsonParser.NumberType numberTypeT;
        int deserializationFeatures = deserializationContext.getDeserializationFeatures();
        if ((StdDeserializer.F_MASK_INT_COERCIONS & deserializationFeatures) == 0) {
            numberTypeT = jsonParser.T();
        } else if (DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(deserializationFeatures)) {
            numberTypeT = JsonParser.NumberType.BIG_INTEGER;
        } else {
            numberTypeT = DeserializationFeature.USE_LONG_FOR_INTS.enabledIn(deserializationFeatures) ? JsonParser.NumberType.LONG : jsonParser.T();
        }
        if (numberTypeT == JsonParser.NumberType.INT) {
            return jsonNodeFactory.numberNode(jsonParser.R());
        }
        return numberTypeT == JsonParser.NumberType.LONG ? jsonNodeFactory.numberNode(jsonParser.S()) : jsonNodeFactory.numberNode(jsonParser.o());
    }

    public void _handleDuplicateField(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory, String str, c4h c4hVar, zsd zsdVar, zsd zsdVar2) throws JsonProcessingException {
        if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY)) {
            deserializationContext.reportInputMismatch(zsd.class, "Duplicate field '%s' for ObjectNode: not allowed when FAIL_ON_READING_DUP_TREE_KEY enabled", str);
        }
    }

    public final zsd deserializeAny(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        int iM = jsonParser.M();
        if (iM == 2) {
            return jsonNodeFactory.objectNode();
        }
        switch (iM) {
            case 5:
                return deserializeObjectAtName(jsonParser, deserializationContext, jsonNodeFactory);
            case 6:
                return jsonNodeFactory.m135textNode(jsonParser.d0());
            case 7:
                return _fromInt(jsonParser, deserializationContext, jsonNodeFactory);
            case 8:
                return _fromFloat(jsonParser, deserializationContext, jsonNodeFactory);
            case 9:
                return jsonNodeFactory.m127booleanNode(true);
            case 10:
                return jsonNodeFactory.m127booleanNode(false);
            case 11:
                return jsonNodeFactory.nullNode();
            case 12:
                return _fromEmbedded(jsonParser, deserializationContext, jsonNodeFactory);
            default:
                return (zsd) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
        }
    }

    public final mj1 deserializeArray(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        mj1 mj1VarArrayNode = jsonNodeFactory.arrayNode();
        while (true) {
            switch (jsonParser.G0().id()) {
                case 1:
                    mj1VarArrayNode.d0(deserializeObject(jsonParser, deserializationContext, jsonNodeFactory));
                    break;
                case 2:
                case 5:
                case 8:
                default:
                    mj1VarArrayNode.d0(deserializeAny(jsonParser, deserializationContext, jsonNodeFactory));
                    break;
                case 3:
                    mj1VarArrayNode.d0(deserializeArray(jsonParser, deserializationContext, jsonNodeFactory));
                    break;
                case 4:
                    return mj1VarArrayNode;
                case 6:
                    mj1VarArrayNode.d0(jsonNodeFactory.m135textNode(jsonParser.d0()));
                    break;
                case 7:
                    mj1VarArrayNode.d0(_fromInt(jsonParser, deserializationContext, jsonNodeFactory));
                    break;
                case 9:
                    mj1VarArrayNode.d0(jsonNodeFactory.m127booleanNode(true));
                    break;
                case 10:
                    mj1VarArrayNode.d0(jsonNodeFactory.m127booleanNode(false));
                    break;
                case 11:
                    mj1VarArrayNode.d0(jsonNodeFactory.nullNode());
                    break;
                case 12:
                    mj1VarArrayNode.d0(_fromEmbedded(jsonParser, deserializationContext, jsonNodeFactory));
                    break;
            }
        }
    }

    public final c4h deserializeObject(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        zsd zsdVarDeserializeObject;
        c4h c4hVarObjectNode = jsonNodeFactory.objectNode();
        String strE0 = jsonParser.E0();
        while (strE0 != null) {
            JsonToken jsonTokenG0 = jsonParser.G0();
            if (jsonTokenG0 == null) {
                jsonTokenG0 = JsonToken.NOT_AVAILABLE;
            }
            int iId = jsonTokenG0.id();
            if (iId == 1) {
                zsdVarDeserializeObject = deserializeObject(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (iId == 3) {
                zsdVarDeserializeObject = deserializeArray(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (iId == 6) {
                zsdVarDeserializeObject = jsonNodeFactory.m135textNode(jsonParser.d0());
            } else if (iId != 7) {
                switch (iId) {
                    case 9:
                        zsdVarDeserializeObject = jsonNodeFactory.m127booleanNode(true);
                        break;
                    case 10:
                        zsdVarDeserializeObject = jsonNodeFactory.m127booleanNode(false);
                        break;
                    case 11:
                        zsdVarDeserializeObject = jsonNodeFactory.nullNode();
                        break;
                    case 12:
                        zsdVarDeserializeObject = _fromEmbedded(jsonParser, deserializationContext, jsonNodeFactory);
                        break;
                    default:
                        zsdVarDeserializeObject = deserializeAny(jsonParser, deserializationContext, jsonNodeFactory);
                        break;
                }
            } else {
                zsdVarDeserializeObject = _fromInt(jsonParser, deserializationContext, jsonNodeFactory);
            }
            zsd zsdVar = zsdVarDeserializeObject;
            zsd zsdVarP0 = c4hVarObjectNode.p0(strE0, zsdVar);
            if (zsdVarP0 != null) {
                _handleDuplicateField(jsonParser, deserializationContext, jsonNodeFactory, strE0, c4hVarObjectNode, zsdVarP0, zsdVar);
            }
            strE0 = jsonParser.E0();
        }
        return c4hVarObjectNode;
    }

    public final c4h deserializeObjectAtName(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        zsd zsdVarDeserializeObject;
        c4h c4hVarObjectNode = jsonNodeFactory.objectNode();
        String strJ = jsonParser.J();
        while (strJ != null) {
            JsonToken jsonTokenG0 = jsonParser.G0();
            if (jsonTokenG0 == null) {
                jsonTokenG0 = JsonToken.NOT_AVAILABLE;
            }
            int iId = jsonTokenG0.id();
            if (iId == 1) {
                zsdVarDeserializeObject = deserializeObject(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (iId == 3) {
                zsdVarDeserializeObject = deserializeArray(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (iId == 6) {
                zsdVarDeserializeObject = jsonNodeFactory.m135textNode(jsonParser.d0());
            } else if (iId != 7) {
                switch (iId) {
                    case 9:
                        zsdVarDeserializeObject = jsonNodeFactory.m127booleanNode(true);
                        break;
                    case 10:
                        zsdVarDeserializeObject = jsonNodeFactory.m127booleanNode(false);
                        break;
                    case 11:
                        zsdVarDeserializeObject = jsonNodeFactory.nullNode();
                        break;
                    case 12:
                        zsdVarDeserializeObject = _fromEmbedded(jsonParser, deserializationContext, jsonNodeFactory);
                        break;
                    default:
                        zsdVarDeserializeObject = deserializeAny(jsonParser, deserializationContext, jsonNodeFactory);
                        break;
                }
            } else {
                zsdVarDeserializeObject = _fromInt(jsonParser, deserializationContext, jsonNodeFactory);
            }
            zsd zsdVar = zsdVarDeserializeObject;
            zsd zsdVarP0 = c4hVarObjectNode.p0(strJ, zsdVar);
            if (zsdVarP0 != null) {
                _handleDuplicateField(jsonParser, deserializationContext, jsonNodeFactory, strJ, c4hVarObjectNode, zsdVarP0, zsdVar);
            }
            strJ = jsonParser.E0();
        }
        return c4hVarObjectNode;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, defpackage.esd
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
        return q4qVar.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    @Override // defpackage.esd
    public boolean isCachable() {
        return true;
    }

    @Override // defpackage.esd
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return this._supportsUpdates;
    }

    public final zsd updateArray(JsonParser jsonParser, DeserializationContext deserializationContext, mj1 mj1Var) throws IOException {
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        while (true) {
            switch (jsonParser.G0().id()) {
                case 1:
                    mj1Var.d0(deserializeObject(jsonParser, deserializationContext, nodeFactory));
                    break;
                case 2:
                case 5:
                case 8:
                default:
                    mj1Var.d0(deserializeAny(jsonParser, deserializationContext, nodeFactory));
                    break;
                case 3:
                    mj1Var.d0(deserializeArray(jsonParser, deserializationContext, nodeFactory));
                    break;
                case 4:
                    return mj1Var;
                case 6:
                    mj1Var.d0(nodeFactory.m135textNode(jsonParser.d0()));
                    break;
                case 7:
                    mj1Var.d0(_fromInt(jsonParser, deserializationContext, nodeFactory));
                    break;
                case 9:
                    mj1Var.d0(nodeFactory.m127booleanNode(true));
                    break;
                case 10:
                    mj1Var.d0(nodeFactory.m127booleanNode(false));
                    break;
                case 11:
                    mj1Var.d0(nodeFactory.nullNode());
                    break;
                case 12:
                    mj1Var.d0(_fromEmbedded(jsonParser, deserializationContext, nodeFactory));
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:41:0x0089  */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX WARN: Code duplicated, block: B:43:0x0097  */
    /* JADX WARN: Code duplicated, block: B:45:0x009e  */
    public final zsd updateObject(JsonParser jsonParser, DeserializationContext deserializationContext, c4h c4hVar) throws IOException {
        String strJ;
        JsonNodeFactory nodeFactory;
        int iId;
        zsd zsdVarDeserializeObject;
        zsd zsdVar;
        if (jsonParser.C0()) {
            strJ = jsonParser.E0();
        } else {
            if (!jsonParser.y0(JsonToken.FIELD_NAME)) {
                return deserialize(jsonParser, deserializationContext);
            }
            strJ = jsonParser.J();
        }
        while (strJ != null) {
            JsonToken jsonTokenG0 = jsonParser.G0();
            zsd zsdVarW = c4hVar.w(strJ);
            if (zsdVarW == null) {
                if (jsonTokenG0 == null) {
                    jsonTokenG0 = JsonToken.NOT_AVAILABLE;
                }
                nodeFactory = deserializationContext.getNodeFactory();
                iId = jsonTokenG0.id();
                if (iId != 1) {
                    zsdVarDeserializeObject = deserializeObject(jsonParser, deserializationContext, nodeFactory);
                } else if (iId != 3) {
                    zsdVarDeserializeObject = deserializeArray(jsonParser, deserializationContext, nodeFactory);
                } else if (iId != 6) {
                    zsdVarDeserializeObject = nodeFactory.m135textNode(jsonParser.d0());
                } else if (iId != 7) {
                    switch (iId) {
                        case 9:
                            zsdVarDeserializeObject = nodeFactory.m127booleanNode(true);
                            break;
                        case 10:
                            zsdVarDeserializeObject = nodeFactory.m127booleanNode(false);
                            break;
                        case 11:
                            zsdVarDeserializeObject = nodeFactory.nullNode();
                            break;
                        case 12:
                            zsdVarDeserializeObject = _fromEmbedded(jsonParser, deserializationContext, nodeFactory);
                            break;
                        default:
                            zsdVarDeserializeObject = deserializeAny(jsonParser, deserializationContext, nodeFactory);
                            break;
                    }
                } else {
                    zsdVarDeserializeObject = _fromInt(jsonParser, deserializationContext, nodeFactory);
                }
                zsdVar = zsdVarDeserializeObject;
                if (zsdVarW != null) {
                    _handleDuplicateField(jsonParser, deserializationContext, nodeFactory, strJ, c4hVar, zsdVarW, zsdVar);
                }
                c4hVar.q0(strJ, zsdVar);
            } else if (zsdVarW instanceof c4h) {
                zsd zsdVarUpdateObject = updateObject(jsonParser, deserializationContext, (c4h) zsdVarW);
                if (zsdVarUpdateObject != zsdVarW) {
                    c4hVar.q0(strJ, zsdVarUpdateObject);
                }
            } else if (zsdVarW instanceof mj1) {
                zsd zsdVarUpdateArray = updateArray(jsonParser, deserializationContext, (mj1) zsdVarW);
                if (zsdVarUpdateArray != zsdVarW) {
                    c4hVar.q0(strJ, zsdVarUpdateArray);
                }
            } else {
                if (jsonTokenG0 == null) {
                    jsonTokenG0 = JsonToken.NOT_AVAILABLE;
                }
                nodeFactory = deserializationContext.getNodeFactory();
                iId = jsonTokenG0.id();
                if (iId != 1) {
                    zsdVarDeserializeObject = deserializeObject(jsonParser, deserializationContext, nodeFactory);
                } else if (iId != 3) {
                    zsdVarDeserializeObject = deserializeArray(jsonParser, deserializationContext, nodeFactory);
                } else if (iId != 6) {
                    zsdVarDeserializeObject = nodeFactory.m135textNode(jsonParser.d0());
                } else if (iId != 7) {
                    switch (iId) {
                        case 9:
                            zsdVarDeserializeObject = nodeFactory.m127booleanNode(true);
                            break;
                        case 10:
                            zsdVarDeserializeObject = nodeFactory.m127booleanNode(false);
                            break;
                        case 11:
                            zsdVarDeserializeObject = nodeFactory.nullNode();
                            break;
                        case 12:
                            zsdVarDeserializeObject = _fromEmbedded(jsonParser, deserializationContext, nodeFactory);
                            break;
                        default:
                            zsdVarDeserializeObject = deserializeAny(jsonParser, deserializationContext, nodeFactory);
                            break;
                    }
                } else {
                    zsdVarDeserializeObject = _fromInt(jsonParser, deserializationContext, nodeFactory);
                }
                zsdVar = zsdVarDeserializeObject;
                if (zsdVarW != null) {
                    _handleDuplicateField(jsonParser, deserializationContext, nodeFactory, strJ, c4hVar, zsdVarW, zsdVar);
                }
                c4hVar.q0(strJ, zsdVar);
            }
            strJ = jsonParser.E0();
        }
        return c4hVar;
    }
}
