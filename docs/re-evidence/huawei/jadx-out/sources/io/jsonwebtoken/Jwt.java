package io.jsonwebtoken;

import defpackage.yxm;
import io.jsonwebtoken.Header;

/* JADX INFO: loaded from: classes46.dex */
public interface Jwt<H extends Header, P> {
    public static final JwtVisitor<Jwt<Header, byte[]>> UNSECURED_CONTENT = new yxm<Jwt<Header, byte[]>>() { // from class: io.jsonwebtoken.Jwt.5
        @Override // defpackage.yxm
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Jwt<Header, byte[]> onUnsecuredContent(Jwt<Header, byte[]> jwt) {
            return jwt;
        }
    };
    public static final JwtVisitor<Jwt<Header, Claims>> UNSECURED_CLAIMS = new yxm<Jwt<Header, Claims>>() { // from class: io.jsonwebtoken.Jwt.1
        @Override // defpackage.yxm
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Jwt<Header, Claims> onUnsecuredClaims(Jwt<Header, Claims> jwt) {
            return jwt;
        }
    };

    <T> T accept(JwtVisitor<T> jwtVisitor);

    @Deprecated
    P getBody();

    H getHeader();

    P getPayload();
}
