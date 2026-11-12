package io.jsonwebtoken;

import defpackage.yxm;

/* JADX INFO: loaded from: classes46.dex */
public interface Jwe<B> extends ProtectedJwt<JweHeader, B> {
    public static final JwtVisitor<Jwe<byte[]>> CONTENT = new yxm<Jwe<byte[]>>() { // from class: io.jsonwebtoken.Jwe.3
        @Override // defpackage.yxm
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Jwe<byte[]> onDecryptedContent(Jwe<byte[]> jwe) {
            return jwe;
        }
    };
    public static final JwtVisitor<Jwe<Claims>> CLAIMS = new yxm<Jwe<Claims>>() { // from class: io.jsonwebtoken.Jwe.4
        @Override // defpackage.yxm
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Jwe<Claims> onDecryptedClaims(Jwe<Claims> jwe) {
            return jwe;
        }
    };

    byte[] getInitializationVector();
}
