package defpackage;

import com.auth0.jwt.interfaces.Claim;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import java.lang.reflect.Array;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
class rh implements Claim {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ObjectCodec f47323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JsonNode f47324c;

    private rh(JsonNode jsonNode, ObjectCodec objectCodec) {
        this.f47324c = jsonNode;
        this.f47323b = objectCodec;
    }

    @Override // com.auth0.jwt.interfaces.Claim
    public Boolean asBoolean() {
        if (isMissing() || isNull() || !this.f47324c.isBoolean()) {
            return null;
        }
        return Boolean.valueOf(this.f47324c.asBoolean());
    }

    @Override // com.auth0.jwt.interfaces.Claim
    public Integer asInt() {
        if (isMissing() || isNull() || !this.f47324c.isNumber()) {
            return null;
        }
        return Integer.valueOf(this.f47324c.asInt());
    }

    @Override // com.auth0.jwt.interfaces.Claim
    public Long asLong() {
        if (isMissing() || isNull() || !this.f47324c.isNumber()) {
            return null;
        }
        return Long.valueOf(this.f47324c.asLong());
    }

    @Override // com.auth0.jwt.interfaces.Claim
    public Double asDouble() {
        if (isMissing() || isNull() || !this.f47324c.isNumber()) {
            return null;
        }
        return Double.valueOf(this.f47324c.asDouble());
    }

    @Override // com.auth0.jwt.interfaces.Claim
    public String asString() {
        if (isMissing() || isNull() || !this.f47324c.isTextual()) {
            return null;
        }
        return this.f47324c.asText();
    }

    @Override // com.auth0.jwt.interfaces.Claim
    public Date asDate() {
        if (isMissing() || isNull() || !this.f47324c.canConvertToLong()) {
            return null;
        }
        return new Date(this.f47324c.asLong() * 1000);
    }

    @Override // com.auth0.jwt.interfaces.Claim
    public Instant asInstant() {
        if (isMissing() || isNull() || !this.f47324c.canConvertToLong()) {
            return null;
        }
        return Instant.ofEpochSecond(this.f47324c.asLong());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.auth0.jwt.interfaces.Claim
    public <T> T[] asArray(Class<T> cls) throws rf {
        if (isMissing() || isNull() || !this.f47324c.isArray()) {
            return null;
        }
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, this.f47324c.size()));
        for (int i = 0; i < this.f47324c.size(); i++) {
            try {
                tArr[i] = this.f47323b.treeToValue(this.f47324c.get(i), cls);
            } catch (wr e) {
                throw new rf("Couldn't map the Claim's array contents to " + cls.getSimpleName(), e);
            }
        }
        return tArr;
    }

    @Override // com.auth0.jwt.interfaces.Claim
    public <T> List<T> asList(Class<T> cls) throws rf {
        if (isMissing() || isNull() || !this.f47324c.isArray()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f47324c.size(); i++) {
            try {
                arrayList.add(this.f47323b.treeToValue(this.f47324c.get(i), cls));
            } catch (wr e) {
                throw new rf("Couldn't map the Claim's array contents to " + cls.getSimpleName(), e);
            }
        }
        return arrayList;
    }

    @Override // com.auth0.jwt.interfaces.Claim
    public Map<String, Object> asMap() throws rf {
        if (isMissing() || isNull() || !this.f47324c.isObject()) {
            return null;
        }
        TypeReference<Map<String, Object>> typeReference = new TypeReference<Map<String, Object>>() { // from class: rh.1
        };
        try {
            JsonParser jsonParserTreeAsTokens = this.f47323b.treeAsTokens(this.f47324c);
            try {
                Map<String, Object> map = (Map) jsonParserTreeAsTokens.readValueAs(typeReference);
                if (jsonParserTreeAsTokens != null) {
                    jsonParserTreeAsTokens.close();
                }
                return map;
            } catch (Throwable th) {
                if (jsonParserTreeAsTokens != null) {
                    try {
                        jsonParserTreeAsTokens.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            throw new rf("Couldn't map the Claim value to Map", e);
        }
    }

    @Override // com.auth0.jwt.interfaces.Claim
    public <T> T as(Class<T> cls) throws rf {
        try {
            if (!isMissing() && !isNull()) {
                return (T) this.f47323b.treeToValue(this.f47324c, cls);
            }
            return null;
        } catch (wr e) {
            throw new rf("Couldn't map the Claim value to " + cls.getSimpleName(), e);
        }
    }

    @Override // com.auth0.jwt.interfaces.Claim
    public boolean isNull() {
        return !isMissing() && this.f47324c.isNull();
    }

    @Override // com.auth0.jwt.interfaces.Claim
    public boolean isMissing() {
        JsonNode jsonNode = this.f47324c;
        return jsonNode == null || jsonNode.isMissingNode();
    }

    public String toString() {
        if (isMissing()) {
            return "Missing claim";
        }
        if (isNull()) {
            return "Null claim";
        }
        return this.f47324c.toString();
    }

    static Claim a(String str, Map<String, JsonNode> map, ObjectCodec objectCodec) {
        return b(map.get(str), objectCodec);
    }

    static Claim b(JsonNode jsonNode, ObjectCodec objectCodec) {
        return new rh(jsonNode, objectCodec);
    }
}
