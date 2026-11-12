package defpackage;

import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.Payload;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.Serializable;
import java.time.Instant;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
class rm implements Payload, Serializable {
    private static final long serialVersionUID = 1659021498824562311L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Instant f47460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Instant f47462c;
    private final String d;
    private final List<String> e;
    private final Instant f;
    private final ObjectCodec g;
    private final Map<String, JsonNode> h;
    private final String i;

    rm(String str, String str2, List<String> list, Instant instant, Instant instant2, Instant instant3, String str3, Map<String, JsonNode> map, ObjectCodec objectCodec) {
        this.f47461b = str;
        this.i = str2;
        this.e = list != null ? Collections.unmodifiableList(list) : null;
        this.f47460a = instant;
        this.f = instant2;
        this.f47462c = instant3;
        this.d = str3;
        this.h = map != null ? Collections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        this.g = objectCodec;
    }

    @Override // com.auth0.jwt.interfaces.Payload
    public String getIssuer() {
        return this.f47461b;
    }

    @Override // com.auth0.jwt.interfaces.Payload
    public String getSubject() {
        return this.i;
    }

    @Override // com.auth0.jwt.interfaces.Payload
    public List<String> getAudience() {
        return this.e;
    }

    @Override // com.auth0.jwt.interfaces.Payload
    public Date getExpiresAt() {
        Instant instant = this.f47460a;
        if (instant != null) {
            return Date.from(instant);
        }
        return null;
    }

    @Override // com.auth0.jwt.interfaces.Payload
    public Instant getExpiresAtAsInstant() {
        return this.f47460a;
    }

    @Override // com.auth0.jwt.interfaces.Payload
    public Date getIssuedAt() {
        Instant instant = this.f47462c;
        if (instant != null) {
            return Date.from(instant);
        }
        return null;
    }

    @Override // com.auth0.jwt.interfaces.Payload
    public Instant getIssuedAtAsInstant() {
        return this.f47462c;
    }

    @Override // com.auth0.jwt.interfaces.Payload
    public Date getNotBefore() {
        Instant instant = this.f;
        if (instant != null) {
            return Date.from(instant);
        }
        return null;
    }

    @Override // com.auth0.jwt.interfaces.Payload
    public Instant getNotBeforeAsInstant() {
        return this.f;
    }

    @Override // com.auth0.jwt.interfaces.Payload
    public String getId() {
        return this.d;
    }

    @Override // com.auth0.jwt.interfaces.Payload
    public Claim getClaim(String str) {
        return rh.a(str, this.h, this.g);
    }

    @Override // com.auth0.jwt.interfaces.Payload
    public Map<String, Claim> getClaims() {
        HashMap map = new HashMap(this.h.size() * 2);
        for (String str : this.h.keySet()) {
            map.put(str, rh.a(str, this.h, this.g));
        }
        return Collections.unmodifiableMap(map);
    }
}
