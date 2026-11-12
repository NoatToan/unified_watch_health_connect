package com.auth0.jwt.interfaces;

import defpackage.rf;

/* JADX INFO: loaded from: classes21.dex */
public interface JWTPartsParser {
    Header parseHeader(String str) throws rf;

    Payload parsePayload(String str) throws rf;
}
