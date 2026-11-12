package defpackage;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.Jwe;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.JwtVisitor;

/* JADX INFO: loaded from: classes46.dex */
public class yxm<T> implements JwtVisitor<T> {
    @Override // io.jsonwebtoken.JwtVisitor
    public T visit(Jwt<?, ?> jwt) {
        yxz.b(jwt, "JWT cannot be null.");
        Object payload = jwt.getPayload();
        if (payload instanceof byte[]) {
            return onUnsecuredContent(jwt);
        }
        yxz.d(Claims.class, payload, "Unexpected payload data type: ");
        return onUnsecuredClaims(jwt);
    }

    public T onUnsecuredContent(Jwt<Header, byte[]> jwt) throws yxk {
        throw new yxk("Unexpected unsecured content JWT.");
    }

    public T onUnsecuredClaims(Jwt<Header, Claims> jwt) {
        throw new yxk("Unexpected unsecured Claims JWT.");
    }

    @Override // io.jsonwebtoken.JwtVisitor
    public T visit(Jws<?> jws) {
        yxz.b(jws, "JWS cannot be null.");
        Object payload = jws.getPayload();
        if (payload instanceof byte[]) {
            return onVerifiedContent(jws);
        }
        yxz.d(Claims.class, payload, "Unexpected payload data type: ");
        return onVerifiedClaims(jws);
    }

    public T onVerifiedContent(Jws<byte[]> jws) {
        throw new yxk("Unexpected content JWS.");
    }

    public T onVerifiedClaims(Jws<Claims> jws) {
        throw new yxk("Unexpected Claims JWS.");
    }

    @Override // io.jsonwebtoken.JwtVisitor
    public T visit(Jwe<?> jwe) {
        yxz.b(jwe, "JWE cannot be null.");
        Object payload = jwe.getPayload();
        if (payload instanceof byte[]) {
            return onDecryptedContent(jwe);
        }
        yxz.d(Claims.class, payload, "Unexpected payload data type: ");
        return onDecryptedClaims(jwe);
    }

    public T onDecryptedContent(Jwe<byte[]> jwe) {
        throw new yxk("Unexpected content JWE.");
    }

    public T onDecryptedClaims(Jwe<Claims> jwe) {
        throw new yxk("Unexpected Claims JWE.");
    }
}
