package defpackage;

import com.auth0.jwt.interfaces.Payload;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import io.jsonwebtoken.Claims;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
class ro extends StdDeserializer<Payload> {
    ro() {
        super((Class<?>) Payload.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Payload deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Map<String, JsonNode> map = (Map) jsonParser.getCodec().readValue(jsonParser, new TypeReference<Map<String, JsonNode>>() { // from class: ro.5
        });
        if (map == null) {
            throw new rf("Parsing the Payload's JSON resulted on a Null map");
        }
        return new rm(d(map, Claims.ISSUER), d(map, Claims.SUBJECT), c(jsonParser.getCodec(), map, Claims.AUDIENCE), e(map, Claims.EXPIRATION), e(map, Claims.NOT_BEFORE), e(map, Claims.ISSUED_AT), d(map, Claims.ID), map, jsonParser.getCodec());
    }

    List<String> c(ObjectCodec objectCodec, Map<String, JsonNode> map, String str) throws rf {
        JsonNode jsonNode = map.get(str);
        if (jsonNode == null || jsonNode.isNull()) {
            return null;
        }
        if (!jsonNode.isArray() && !jsonNode.isTextual()) {
            return null;
        }
        if (jsonNode.isTextual()) {
            return Collections.singletonList(jsonNode.asText());
        }
        ArrayList arrayList = new ArrayList(jsonNode.size());
        for (int i = 0; i < jsonNode.size(); i++) {
            try {
                arrayList.add((String) objectCodec.treeToValue(jsonNode.get(i), String.class));
            } catch (wr e) {
                throw new rf("Couldn't map the Claim's array contents to String", e);
            }
        }
        return arrayList;
    }

    Instant e(Map<String, JsonNode> map, String str) {
        JsonNode jsonNode = map.get(str);
        if (jsonNode == null || jsonNode.isNull()) {
            return null;
        }
        if (!jsonNode.canConvertToLong()) {
            throw new rf(String.format("The claim '%s' contained a non-numeric date value.", str));
        }
        return Instant.ofEpochSecond(jsonNode.asLong());
    }

    String d(Map<String, JsonNode> map, String str) {
        JsonNode jsonNode = map.get(str);
        if (jsonNode == null || jsonNode.isNull()) {
            return null;
        }
        return jsonNode.asText(null);
    }
}
