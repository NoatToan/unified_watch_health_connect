package com.twitter.sdk.android.core;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Token;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class AuthTokenAdapter implements JsonSerializer<AuthToken>, JsonDeserializer<AuthToken> {
    private static final String b = "auth_type";
    private static final String c = "auth_token";
    public static final Map<String, Class<? extends AuthToken>> d;
    private final Gson a = new Gson();

    static {
        HashMap map = new HashMap();
        d = map;
        map.put("oauth1a", TwitterAuthToken.class);
        map.put("oauth2", OAuth2Token.class);
        map.put("guest", GuestAuthToken.class);
    }

    public static String a(Class<? extends AuthToken> cls) {
        for (Map.Entry<String, Class<? extends AuthToken>> entry : d.entrySet()) {
            if (entry.getValue().equals(cls)) {
                return entry.getKey();
            }
        }
        return "";
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public AuthToken deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        String asString = asJsonObject.getAsJsonPrimitive("auth_type").getAsString();
        return (AuthToken) this.a.fromJson(asJsonObject.get(c), (Class) d.get(asString));
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(AuthToken authToken, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("auth_type", a(authToken.getClass()));
        jsonObject.add(c, this.a.toJsonTree(authToken));
        return jsonObject;
    }
}
