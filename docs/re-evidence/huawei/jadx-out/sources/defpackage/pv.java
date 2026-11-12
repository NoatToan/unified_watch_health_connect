package defpackage;

import com.auth0.jwt.TokenUtils;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.Header;
import com.auth0.jwt.interfaces.Payload;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
final class pv implements DecodedJWT, Serializable {
    private static final long serialVersionUID = 1873362438023312895L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Payload f45889a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f45890c;
    private final Header d;

    pv(String str) throws rf {
        this(new rl(), str);
    }

    pv(rl rlVar, String str) throws rf {
        String[] strArrSplitToken = TokenUtils.splitToken(str);
        this.f45890c = strArrSplitToken;
        try {
            String str2 = new String(Base64.getUrlDecoder().decode(strArrSplitToken[0]), StandardCharsets.UTF_8);
            String str3 = new String(Base64.getUrlDecoder().decode(strArrSplitToken[1]), StandardCharsets.UTF_8);
            this.d = rlVar.parseHeader(str2);
            this.f45889a = rlVar.parsePayload(str3);
        } catch (IllegalArgumentException e) {
            throw new rf("The input is not a valid base 64 encoded string.", e);
        } catch (NullPointerException e2) {
            throw new rf("The UTF-8 Charset isn't initialized.", e2);
        }
    }

    @Override // com.auth0.jwt.interfaces.Header
    public String getAlgorithm() {
        return this.d.getAlgorithm();
    }

    @Override // com.auth0.jwt.interfaces.Header
    public String getType() {
        return this.d.getType();
    }

    @Override // com.auth0.jwt.interfaces.Header
    public String getContentType() {
        return this.d.getContentType();
    }

    @Override // com.auth0.jwt.interfaces.Header
    public String getKeyId() {
        return this.d.getKeyId();
    }

    @Override // com.auth0.jwt.interfaces.Header
    public Claim getHeaderClaim(String str) {
        return this.d.getHeaderClaim(str);
    }

    @Override // com.auth0.jwt.interfaces.Payload
    public String getIssuer() {
        return this.f45889a.getIssuer();
    }

    @Override // com.auth0.jwt.interfaces.Payload
    public String getSubject() {
        return this.f45889a.getSubject();
    }

    @Override // com.auth0.jwt.interfaces.Payload
    public List<String> getAudience() {
        return this.f45889a.getAudience();
    }

    @Override // com.auth0.jwt.interfaces.Payload
    public Date getExpiresAt() {
        return this.f45889a.getExpiresAt();
    }

    @Override // com.auth0.jwt.interfaces.Payload
    public Instant getExpiresAtAsInstant() {
        return this.f45889a.getExpiresAtAsInstant();
    }

    @Override // com.auth0.jwt.interfaces.Payload
    public Date getNotBefore() {
        return this.f45889a.getNotBefore();
    }

    @Override // com.auth0.jwt.interfaces.Payload
    public Instant getNotBeforeAsInstant() {
        return this.f45889a.getNotBeforeAsInstant();
    }

    @Override // com.auth0.jwt.interfaces.Payload
    public Date getIssuedAt() {
        return this.f45889a.getIssuedAt();
    }

    @Override // com.auth0.jwt.interfaces.Payload
    public Instant getIssuedAtAsInstant() {
        return this.f45889a.getIssuedAtAsInstant();
    }

    @Override // com.auth0.jwt.interfaces.Payload
    public String getId() {
        return this.f45889a.getId();
    }

    @Override // com.auth0.jwt.interfaces.Payload
    public Claim getClaim(String str) {
        return this.f45889a.getClaim(str);
    }

    @Override // com.auth0.jwt.interfaces.Payload
    public Map<String, Claim> getClaims() {
        return this.f45889a.getClaims();
    }

    @Override // com.auth0.jwt.interfaces.DecodedJWT
    public String getHeader() {
        return this.f45890c[0];
    }

    @Override // com.auth0.jwt.interfaces.DecodedJWT
    public String getPayload() {
        return this.f45890c[1];
    }

    @Override // com.auth0.jwt.interfaces.DecodedJWT
    public String getSignature() {
        return this.f45890c[2];
    }

    @Override // com.auth0.jwt.interfaces.DecodedJWT
    public String getToken() {
        String[] strArr = this.f45890c;
        return String.format("%s.%s.%s", strArr[0], strArr[1], strArr[2]);
    }
}
