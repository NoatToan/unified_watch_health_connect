package com.auth0.jwt.interfaces;

import defpackage.rd;

/* JADX INFO: loaded from: classes21.dex */
public interface JWTVerifier {
    DecodedJWT verify(DecodedJWT decodedJWT) throws rd;

    DecodedJWT verify(String str) throws rd;
}
