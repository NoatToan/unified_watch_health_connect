package com.nimbusds.jose;

import com.mapbox.maps.p;
import com.nimbusds.jose.util.JSONObjectUtils;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class JOSEObjectJSON implements Serializable {
    public static final String MIME_TYPE_JOSE_JSON = "application/jose+json; charset=UTF-8";
    private static final long serialVersionUID = 1;
    private Payload payload;

    public JOSEObjectJSON(Payload payload) {
        this.payload = payload;
    }

    public static JOSEObjectJSON parse(Map<String, Object> map) throws ParseException {
        if (map.containsKey("signature") || map.containsKey("signatures")) {
            return JWSObjectJSON.parse(map);
        }
        if (map.containsKey("ciphertext")) {
            p.i(0, "JWE JSON not supported");
            return null;
        }
        p.i(0, "Invalid JOSE object");
        return null;
    }

    public Payload getPayload() {
        return this.payload;
    }

    public abstract String serializeFlattened();

    public abstract String serializeGeneral();

    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    public abstract Map<String, Object> toFlattenedJSONObject();

    public abstract Map<String, Object> toGeneralJSONObject();

    public static JOSEObjectJSON parse(String str) {
        Objects.requireNonNull(str);
        return parse(JSONObjectUtils.parse(str));
    }
}
