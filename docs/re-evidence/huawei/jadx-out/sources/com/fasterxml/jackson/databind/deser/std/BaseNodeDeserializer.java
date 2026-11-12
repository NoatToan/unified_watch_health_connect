package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import defpackage.aeg;
import defpackage.aes;
import defpackage.aeu;
import defpackage.aid;
import defpackage.wr;
import defpackage.yi;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BaseNodeDeserializer<T extends JsonNode> extends StdDeserializer<T> {
    protected final Boolean _supportsUpdates;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }

    public BaseNodeDeserializer(Class<T> cls, Boolean bool) {
        super((Class<?>) cls);
        this._supportsUpdates = bool;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Untyped;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(yi yiVar) {
        return this._supportsUpdates;
    }

    protected void _handleDuplicateField(JsonParser jsonParser, DeserializationContext deserializationContext, aes aesVar, String str, aeu aeuVar, JsonNode jsonNode, JsonNode jsonNode2) throws wr {
        if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY)) {
            deserializationContext.reportInputMismatch(JsonNode.class, "Duplicate field '%s' for `ObjectNode`: not allowed when `DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY` enabled", str);
        }
        if (deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES)) {
            if (jsonNode.isArray()) {
                ((aeg) jsonNode).a(jsonNode2);
                aeuVar.e(str, jsonNode);
            } else {
                aeg aegVarArrayNode = aesVar.arrayNode();
                aegVarArrayNode.a(jsonNode);
                aegVarArrayNode.a(jsonNode2);
                aeuVar.e(str, aegVarArrayNode);
            }
        }
    }

    protected final aeu deserializeObject(JsonParser jsonParser, DeserializationContext deserializationContext, aes aesVar) throws IOException {
        JsonNode jsonNodeDeserializeObject;
        aeu aeuVarObjectNode = aesVar.objectNode();
        String strNextFieldName = jsonParser.nextFieldName();
        while (strNextFieldName != null) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            if (jsonTokenNextToken == null) {
                jsonTokenNextToken = JsonToken.NOT_AVAILABLE;
            }
            int iId = jsonTokenNextToken.id();
            if (iId == 1) {
                jsonNodeDeserializeObject = deserializeObject(jsonParser, deserializationContext, aesVar);
            } else if (iId == 3) {
                jsonNodeDeserializeObject = deserializeArray(jsonParser, deserializationContext, aesVar);
            } else if (iId == 6) {
                jsonNodeDeserializeObject = aesVar.textNode(jsonParser.getText());
            } else if (iId == 7) {
                jsonNodeDeserializeObject = _fromInt(jsonParser, deserializationContext, aesVar);
            } else {
                switch (iId) {
                    case 9:
                        jsonNodeDeserializeObject = aesVar.booleanNode(true);
                        break;
                    case 10:
                        jsonNodeDeserializeObject = aesVar.booleanNode(false);
                        break;
                    case 11:
                        jsonNodeDeserializeObject = aesVar.nullNode();
                        break;
                    case 12:
                        jsonNodeDeserializeObject = _fromEmbedded(jsonParser, deserializationContext, aesVar);
                        break;
                    default:
                        jsonNodeDeserializeObject = deserializeAny(jsonParser, deserializationContext, aesVar);
                        break;
                }
            }
            JsonNode jsonNode = jsonNodeDeserializeObject;
            JsonNode jsonNodeE = aeuVarObjectNode.e(strNextFieldName, jsonNode);
            if (jsonNodeE != null) {
                _handleDuplicateField(jsonParser, deserializationContext, aesVar, strNextFieldName, aeuVarObjectNode, jsonNodeE, jsonNode);
            }
            strNextFieldName = jsonParser.nextFieldName();
        }
        return aeuVarObjectNode;
    }

    protected final aeu deserializeObjectAtName(JsonParser jsonParser, DeserializationContext deserializationContext, aes aesVar) throws IOException {
        JsonNode jsonNodeDeserializeObject;
        aeu aeuVarObjectNode = aesVar.objectNode();
        String strCurrentName = jsonParser.currentName();
        while (strCurrentName != null) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            if (jsonTokenNextToken == null) {
                jsonTokenNextToken = JsonToken.NOT_AVAILABLE;
            }
            int iId = jsonTokenNextToken.id();
            if (iId == 1) {
                jsonNodeDeserializeObject = deserializeObject(jsonParser, deserializationContext, aesVar);
            } else if (iId == 3) {
                jsonNodeDeserializeObject = deserializeArray(jsonParser, deserializationContext, aesVar);
            } else if (iId == 6) {
                jsonNodeDeserializeObject = aesVar.textNode(jsonParser.getText());
            } else if (iId == 7) {
                jsonNodeDeserializeObject = _fromInt(jsonParser, deserializationContext, aesVar);
            } else {
                switch (iId) {
                    case 9:
                        jsonNodeDeserializeObject = aesVar.booleanNode(true);
                        break;
                    case 10:
                        jsonNodeDeserializeObject = aesVar.booleanNode(false);
                        break;
                    case 11:
                        jsonNodeDeserializeObject = aesVar.nullNode();
                        break;
                    case 12:
                        jsonNodeDeserializeObject = _fromEmbedded(jsonParser, deserializationContext, aesVar);
                        break;
                    default:
                        jsonNodeDeserializeObject = deserializeAny(jsonParser, deserializationContext, aesVar);
                        break;
                }
            }
            JsonNode jsonNode = jsonNodeDeserializeObject;
            JsonNode jsonNodeE = aeuVarObjectNode.e(strCurrentName, jsonNode);
            if (jsonNodeE != null) {
                _handleDuplicateField(jsonParser, deserializationContext, aesVar, strCurrentName, aeuVarObjectNode, jsonNodeE, jsonNode);
            }
            strCurrentName = jsonParser.nextFieldName();
        }
        return aeuVarObjectNode;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0098  */
    /* JADX WARN: Code duplicated, block: B:46:0x009d  */
    protected final JsonNode updateObject(JsonParser jsonParser, DeserializationContext deserializationContext, aeu aeuVar) throws IOException {
        String strCurrentName;
        aes nodeFactory;
        int iId;
        JsonNode jsonNodeDeserializeObject;
        if (jsonParser.isExpectedStartObjectToken()) {
            strCurrentName = jsonParser.nextFieldName();
        } else {
            if (!jsonParser.hasToken(JsonToken.FIELD_NAME)) {
                return deserialize(jsonParser, deserializationContext);
            }
            strCurrentName = jsonParser.currentName();
        }
        while (strCurrentName != null) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            JsonNode jsonNode = aeuVar.get(strCurrentName);
            if (jsonNode != null) {
                if (jsonNode instanceof aeu) {
                    if (jsonTokenNextToken == JsonToken.START_OBJECT) {
                        JsonNode jsonNodeUpdateObject = updateObject(jsonParser, deserializationContext, (aeu) jsonNode);
                        if (jsonNodeUpdateObject != jsonNode) {
                            aeuVar.b(strCurrentName, jsonNodeUpdateObject);
                        }
                    } else {
                        if (jsonTokenNextToken == null) {
                            jsonTokenNextToken = JsonToken.NOT_AVAILABLE;
                        }
                        nodeFactory = deserializationContext.getNodeFactory();
                        iId = jsonTokenNextToken.id();
                        if (iId == 1) {
                            jsonNodeDeserializeObject = deserializeObject(jsonParser, deserializationContext, nodeFactory);
                        } else if (iId == 3) {
                            jsonNodeDeserializeObject = deserializeArray(jsonParser, deserializationContext, nodeFactory);
                        } else if (iId == 6) {
                            jsonNodeDeserializeObject = nodeFactory.textNode(jsonParser.getText());
                        } else if (iId == 7) {
                            jsonNodeDeserializeObject = _fromInt(jsonParser, deserializationContext, nodeFactory);
                        } else {
                            switch (iId) {
                                case 9:
                                    jsonNodeDeserializeObject = nodeFactory.booleanNode(true);
                                    break;
                                case 10:
                                    jsonNodeDeserializeObject = nodeFactory.booleanNode(false);
                                    break;
                                case 11:
                                    jsonNodeDeserializeObject = nodeFactory.nullNode();
                                    break;
                                case 12:
                                    jsonNodeDeserializeObject = _fromEmbedded(jsonParser, deserializationContext, nodeFactory);
                                    break;
                                default:
                                    jsonNodeDeserializeObject = deserializeAny(jsonParser, deserializationContext, nodeFactory);
                                    break;
                            }
                        }
                        aeuVar.b(strCurrentName, jsonNodeDeserializeObject);
                    }
                } else if ((jsonNode instanceof aeg) && jsonTokenNextToken == JsonToken.START_ARRAY) {
                    JsonNode jsonNodeUpdateArray = updateArray(jsonParser, deserializationContext, (aeg) jsonNode);
                    if (jsonNodeUpdateArray != jsonNode) {
                        aeuVar.b(strCurrentName, jsonNodeUpdateArray);
                    }
                } else {
                    if (jsonTokenNextToken == null) {
                        jsonTokenNextToken = JsonToken.NOT_AVAILABLE;
                    }
                    nodeFactory = deserializationContext.getNodeFactory();
                    iId = jsonTokenNextToken.id();
                    if (iId == 1) {
                        jsonNodeDeserializeObject = deserializeObject(jsonParser, deserializationContext, nodeFactory);
                    } else if (iId == 3) {
                        jsonNodeDeserializeObject = deserializeArray(jsonParser, deserializationContext, nodeFactory);
                    } else if (iId == 6) {
                        jsonNodeDeserializeObject = nodeFactory.textNode(jsonParser.getText());
                    } else if (iId == 7) {
                        jsonNodeDeserializeObject = _fromInt(jsonParser, deserializationContext, nodeFactory);
                    } else {
                        switch (iId) {
                            case 9:
                                jsonNodeDeserializeObject = nodeFactory.booleanNode(true);
                                break;
                            case 10:
                                jsonNodeDeserializeObject = nodeFactory.booleanNode(false);
                                break;
                            case 11:
                                jsonNodeDeserializeObject = nodeFactory.nullNode();
                                break;
                            case 12:
                                jsonNodeDeserializeObject = _fromEmbedded(jsonParser, deserializationContext, nodeFactory);
                                break;
                            default:
                                jsonNodeDeserializeObject = deserializeAny(jsonParser, deserializationContext, nodeFactory);
                                break;
                        }
                    }
                    aeuVar.b(strCurrentName, jsonNodeDeserializeObject);
                }
            } else {
                if (jsonTokenNextToken == null) {
                    jsonTokenNextToken = JsonToken.NOT_AVAILABLE;
                }
                nodeFactory = deserializationContext.getNodeFactory();
                iId = jsonTokenNextToken.id();
                if (iId == 1) {
                    jsonNodeDeserializeObject = deserializeObject(jsonParser, deserializationContext, nodeFactory);
                } else if (iId == 3) {
                    jsonNodeDeserializeObject = deserializeArray(jsonParser, deserializationContext, nodeFactory);
                } else if (iId == 6) {
                    jsonNodeDeserializeObject = nodeFactory.textNode(jsonParser.getText());
                } else if (iId == 7) {
                    jsonNodeDeserializeObject = _fromInt(jsonParser, deserializationContext, nodeFactory);
                } else {
                    switch (iId) {
                        case 9:
                            jsonNodeDeserializeObject = nodeFactory.booleanNode(true);
                            break;
                        case 10:
                            jsonNodeDeserializeObject = nodeFactory.booleanNode(false);
                            break;
                        case 11:
                            jsonNodeDeserializeObject = nodeFactory.nullNode();
                            break;
                        case 12:
                            jsonNodeDeserializeObject = _fromEmbedded(jsonParser, deserializationContext, nodeFactory);
                            break;
                        default:
                            jsonNodeDeserializeObject = deserializeAny(jsonParser, deserializationContext, nodeFactory);
                            break;
                    }
                }
                aeuVar.b(strCurrentName, jsonNodeDeserializeObject);
            }
            strCurrentName = jsonParser.nextFieldName();
        }
        return aeuVar;
    }

    protected final aeg deserializeArray(JsonParser jsonParser, DeserializationContext deserializationContext, aes aesVar) throws IOException {
        aeg aegVarArrayNode = aesVar.arrayNode();
        while (true) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            if (jsonTokenNextToken != null) {
                switch (jsonTokenNextToken.id()) {
                    case 1:
                        aegVarArrayNode.a(deserializeObject(jsonParser, deserializationContext, aesVar));
                        break;
                    case 2:
                    case 5:
                    case 8:
                    default:
                        aegVarArrayNode.a(deserializeAny(jsonParser, deserializationContext, aesVar));
                        break;
                    case 3:
                        aegVarArrayNode.a(deserializeArray(jsonParser, deserializationContext, aesVar));
                        break;
                    case 4:
                        break;
                    case 6:
                        aegVarArrayNode.a(aesVar.textNode(jsonParser.getText()));
                        break;
                    case 7:
                        aegVarArrayNode.a(_fromInt(jsonParser, deserializationContext, aesVar));
                        break;
                    case 9:
                        aegVarArrayNode.a(aesVar.booleanNode(true));
                        break;
                    case 10:
                        aegVarArrayNode.a(aesVar.booleanNode(false));
                        break;
                    case 11:
                        aegVarArrayNode.a(aesVar.nullNode());
                        break;
                    case 12:
                        aegVarArrayNode.a(_fromEmbedded(jsonParser, deserializationContext, aesVar));
                        break;
                }
            }
        }
        return aegVarArrayNode;
    }

    protected final JsonNode updateArray(JsonParser jsonParser, DeserializationContext deserializationContext, aeg aegVar) throws IOException {
        aes nodeFactory = deserializationContext.getNodeFactory();
        while (true) {
            switch (jsonParser.nextToken().id()) {
                case 1:
                    aegVar.a(deserializeObject(jsonParser, deserializationContext, nodeFactory));
                    break;
                case 2:
                case 5:
                case 8:
                default:
                    aegVar.a(deserializeAny(jsonParser, deserializationContext, nodeFactory));
                    break;
                case 3:
                    aegVar.a(deserializeArray(jsonParser, deserializationContext, nodeFactory));
                    break;
                case 4:
                    return aegVar;
                case 6:
                    aegVar.a(nodeFactory.textNode(jsonParser.getText()));
                    break;
                case 7:
                    aegVar.a(_fromInt(jsonParser, deserializationContext, nodeFactory));
                    break;
                case 9:
                    aegVar.a(nodeFactory.booleanNode(true));
                    break;
                case 10:
                    aegVar.a(nodeFactory.booleanNode(false));
                    break;
                case 11:
                    aegVar.a(nodeFactory.nullNode());
                    break;
                case 12:
                    aegVar.a(_fromEmbedded(jsonParser, deserializationContext, nodeFactory));
                    break;
            }
        }
    }

    protected final JsonNode deserializeAny(JsonParser jsonParser, DeserializationContext deserializationContext, aes aesVar) throws IOException {
        int iCurrentTokenId = jsonParser.currentTokenId();
        if (iCurrentTokenId == 2) {
            return aesVar.objectNode();
        }
        switch (iCurrentTokenId) {
            case 5:
                return deserializeObjectAtName(jsonParser, deserializationContext, aesVar);
            case 6:
                return aesVar.textNode(jsonParser.getText());
            case 7:
                return _fromInt(jsonParser, deserializationContext, aesVar);
            case 8:
                return _fromFloat(jsonParser, deserializationContext, aesVar);
            case 9:
                return aesVar.booleanNode(true);
            case 10:
                return aesVar.booleanNode(false);
            case 11:
                return aesVar.nullNode();
            case 12:
                return _fromEmbedded(jsonParser, deserializationContext, aesVar);
            default:
                return (JsonNode) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
        }
    }

    protected final JsonNode _fromInt(JsonParser jsonParser, DeserializationContext deserializationContext, aes aesVar) throws IOException {
        JsonParser.NumberType numberType;
        int deserializationFeatures = deserializationContext.getDeserializationFeatures();
        if ((F_MASK_INT_COERCIONS & deserializationFeatures) != 0) {
            if (DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(deserializationFeatures)) {
                numberType = JsonParser.NumberType.BIG_INTEGER;
            } else if (DeserializationFeature.USE_LONG_FOR_INTS.enabledIn(deserializationFeatures)) {
                numberType = JsonParser.NumberType.LONG;
            } else {
                numberType = jsonParser.getNumberType();
            }
        } else {
            numberType = jsonParser.getNumberType();
        }
        if (numberType == JsonParser.NumberType.INT) {
            return aesVar.numberNode(jsonParser.getIntValue());
        }
        if (numberType == JsonParser.NumberType.LONG) {
            return aesVar.numberNode(jsonParser.getLongValue());
        }
        return aesVar.numberNode(jsonParser.getBigIntegerValue());
    }

    protected final JsonNode _fromFloat(JsonParser jsonParser, DeserializationContext deserializationContext, aes aesVar) throws IOException {
        JsonParser.NumberType numberType = jsonParser.getNumberType();
        if (numberType == JsonParser.NumberType.BIG_DECIMAL) {
            return aesVar.numberNode(jsonParser.getDecimalValue());
        }
        if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            if (jsonParser.isNaN()) {
                return aesVar.numberNode(jsonParser.getDoubleValue());
            }
            return aesVar.numberNode(jsonParser.getDecimalValue());
        }
        if (numberType == JsonParser.NumberType.FLOAT) {
            return aesVar.numberNode(jsonParser.getFloatValue());
        }
        return aesVar.numberNode(jsonParser.getDoubleValue());
    }

    protected final JsonNode _fromEmbedded(JsonParser jsonParser, DeserializationContext deserializationContext, aes aesVar) throws IOException {
        Object embeddedObject = jsonParser.getEmbeddedObject();
        if (embeddedObject == null) {
            return aesVar.nullNode();
        }
        if (embeddedObject.getClass() == byte[].class) {
            return aesVar.binaryNode((byte[]) embeddedObject);
        }
        if (embeddedObject instanceof aid) {
            return aesVar.rawValueNode((aid) embeddedObject);
        }
        if (embeddedObject instanceof JsonNode) {
            return (JsonNode) embeddedObject;
        }
        return aesVar.pojoNode(embeddedObject);
    }
}
