package com.nimbusds.jwt.proc;

import com.nimbusds.jose.proc.SecurityContext;
import com.nimbusds.jwt.EncryptedJWT;
import com.nimbusds.jwt.JWT;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.PlainJWT;
import com.nimbusds.jwt.SignedJWT;

/* JADX INFO: loaded from: classes3.dex */
public interface JWTProcessor<C extends SecurityContext> {
    JWTClaimsSet process(EncryptedJWT encryptedJWT, C c14);

    JWTClaimsSet process(JWT jwt, C c14);

    JWTClaimsSet process(PlainJWT plainJWT, C c14);

    JWTClaimsSet process(SignedJWT signedJWT, C c14);

    JWTClaimsSet process(String str, C c14);
}
