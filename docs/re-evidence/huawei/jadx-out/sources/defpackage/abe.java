package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class abe extends BaseNodeDeserializer<JsonNode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final abe f205a = new abe();

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return super.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ boolean isCachable() {
        return super.isCachable();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ LogicalType logicalType() {
        return super.logicalType();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Boolean supportsUpdate(yi yiVar) {
        return super.supportsUpdate(yiVar);
    }

    protected abe() {
        super(JsonNode.class, null);
    }

    public static JsonDeserializer<? extends JsonNode> b(Class<?> cls) {
        if (cls == aeu.class) {
            return c.d();
        }
        if (cls == aeg.class) {
            return e.b();
        }
        return f205a;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public JsonNode getNullValue(DeserializationContext deserializationContext) {
        return deserializationContext.getNodeFactory().nullNode();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public JsonNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int iCurrentTokenId = jsonParser.currentTokenId();
        if (iCurrentTokenId == 1) {
            return deserializeObject(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
        }
        if (iCurrentTokenId == 3) {
            return deserializeArray(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
        }
        return deserializeAny(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
    }

    static final class c extends BaseNodeDeserializer<aeu> {
        protected static final c d = new c();
        private static final long serialVersionUID = 1;

        protected c() {
            super(aeu.class, true);
        }

        public static c d() {
            return d;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public aeu deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.isExpectedStartObjectToken()) {
                return deserializeObject(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
            }
            if (jsonParser.hasToken(JsonToken.FIELD_NAME)) {
                return deserializeObjectAtName(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
            }
            if (jsonParser.hasToken(JsonToken.END_OBJECT)) {
                return deserializationContext.getNodeFactory().objectNode();
            }
            return (aeu) deserializationContext.handleUnexpectedToken(aeu.class, jsonParser);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public aeu deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, aeu aeuVar) throws IOException {
            if (jsonParser.isExpectedStartObjectToken() || jsonParser.hasToken(JsonToken.FIELD_NAME)) {
                return (aeu) updateObject(jsonParser, deserializationContext, aeuVar);
            }
            return (aeu) deserializationContext.handleUnexpectedToken(aeu.class, jsonParser);
        }
    }

    static final class e extends BaseNodeDeserializer<aeg> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected static final e f206a = new e();
        private static final long serialVersionUID = 1;

        protected e() {
            super(aeg.class, true);
        }

        public static e b() {
            return f206a;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public aeg deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.isExpectedStartArrayToken()) {
                return deserializeArray(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
            }
            return (aeg) deserializationContext.handleUnexpectedToken(aeg.class, jsonParser);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public aeg deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, aeg aegVar) throws IOException {
            if (jsonParser.isExpectedStartArrayToken()) {
                return (aeg) updateArray(jsonParser, deserializationContext, aegVar);
            }
            return (aeg) deserializationContext.handleUnexpectedToken(aeg.class, jsonParser);
        }
    }
}
