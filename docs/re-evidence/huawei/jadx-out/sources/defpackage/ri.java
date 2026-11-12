package defpackage;

import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.Header;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
class ri implements Header, Serializable {
    private static final long serialVersionUID = -4659137688548605095L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, JsonNode> f47353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f47354c;
    private final String d;
    private final ObjectCodec e;
    private final String j;

    ri(String str, String str2, String str3, String str4, Map<String, JsonNode> map, ObjectCodec objectCodec) {
        this.f47354c = str;
        this.j = str2;
        this.d = str3;
        this.f47352a = str4;
        this.f47353b = map == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(map);
        this.e = objectCodec;
    }

    @Override // com.auth0.jwt.interfaces.Header
    public String getAlgorithm() {
        return this.f47354c;
    }

    @Override // com.auth0.jwt.interfaces.Header
    public String getType() {
        return this.j;
    }

    @Override // com.auth0.jwt.interfaces.Header
    public String getContentType() {
        return this.d;
    }

    @Override // com.auth0.jwt.interfaces.Header
    public String getKeyId() {
        return this.f47352a;
    }

    @Override // com.auth0.jwt.interfaces.Header
    public Claim getHeaderClaim(String str) {
        return rh.a(str, this.f47353b, this.e);
    }
}
