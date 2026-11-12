package io.jsonwebtoken;

import defpackage.yxm;

/* JADX INFO: loaded from: classes46.dex */
public interface Jws<P> extends ProtectedJwt<JwsHeader, P> {
    public static final JwtVisitor<Jws<byte[]>> CONTENT = new yxm<Jws<byte[]>>() { // from class: io.jsonwebtoken.Jws.5
        @Override // defpackage.yxm
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Jws<byte[]> onVerifiedContent(Jws<byte[]> jws) {
            return jws;
        }
    };
    public static final JwtVisitor<Jws<Claims>> CLAIMS = new yxm<Jws<Claims>>() { // from class: io.jsonwebtoken.Jws.2
        @Override // defpackage.yxm
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Jws<Claims> onVerifiedClaims(Jws<Claims> jws) {
            return jws;
        }
    };

    @Deprecated
    String getSignature();
}
