package io.jsonwebtoken;

import defpackage.yxm;

/* JADX INFO: loaded from: classes46.dex */
public abstract class JwtHandlerAdapter<T> extends yxm<T> implements JwtHandler<T> {
    @Override // defpackage.yxm
    public T onUnsecuredContent(Jwt<Header, byte[]> jwt) {
        return onContentJwt(jwt);
    }

    @Override // defpackage.yxm
    public T onUnsecuredClaims(Jwt<Header, Claims> jwt) {
        return onClaimsJwt(jwt);
    }

    @Override // defpackage.yxm
    public T onVerifiedContent(Jws<byte[]> jws) {
        return onContentJws(jws);
    }

    @Override // defpackage.yxm
    public T onVerifiedClaims(Jws<Claims> jws) {
        return onClaimsJws(jws);
    }

    @Override // defpackage.yxm
    public T onDecryptedContent(Jwe<byte[]> jwe) {
        return onContentJwe(jwe);
    }

    @Override // defpackage.yxm
    public T onDecryptedClaims(Jwe<Claims> jwe) {
        return onClaimsJwe(jwe);
    }

    @Override // io.jsonwebtoken.JwtHandler
    public T onContentJwt(Jwt<Header, byte[]> jwt) {
        return (T) super.onUnsecuredContent(jwt);
    }

    @Override // io.jsonwebtoken.JwtHandler
    public T onClaimsJwt(Jwt<Header, Claims> jwt) {
        return (T) super.onUnsecuredClaims(jwt);
    }

    @Override // io.jsonwebtoken.JwtHandler
    public T onContentJws(Jws<byte[]> jws) {
        return (T) super.onVerifiedContent(jws);
    }

    @Override // io.jsonwebtoken.JwtHandler
    public T onClaimsJws(Jws<Claims> jws) {
        return (T) super.onVerifiedClaims(jws);
    }

    @Override // io.jsonwebtoken.JwtHandler
    public T onContentJwe(Jwe<byte[]> jwe) {
        return (T) super.onDecryptedContent(jwe);
    }

    @Override // io.jsonwebtoken.JwtHandler
    public T onClaimsJwe(Jwe<Claims> jwe) {
        return (T) super.onDecryptedClaims(jwe);
    }
}
