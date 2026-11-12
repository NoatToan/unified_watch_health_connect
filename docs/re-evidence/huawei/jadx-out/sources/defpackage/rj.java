package defpackage;

import com.auth0.jwt.interfaces.Header;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import io.jsonwebtoken.JwsHeader;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
class rj extends StdDeserializer<Header> {
    rj() {
        super((Class<?>) Header.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Header deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Map<String, JsonNode> map = (Map) jsonParser.getCodec().readValue(jsonParser, new TypeReference<Map<String, JsonNode>>() { // from class: rj.5
        });
        if (map == null) {
            throw new rf("Parsing the Header's JSON resulted on a Null map");
        }
        return new ri(e(map, "alg"), e(map, io.jsonwebtoken.Header.TYPE), e(map, io.jsonwebtoken.Header.CONTENT_TYPE), e(map, JwsHeader.KEY_ID), map, jsonParser.getCodec());
    }

    String e(Map<String, JsonNode> map, String str) {
        JsonNode jsonNode = map.get(str);
        if (jsonNode == null || jsonNode.isNull()) {
            return null;
        }
        return jsonNode.asText(null);
    }
}
