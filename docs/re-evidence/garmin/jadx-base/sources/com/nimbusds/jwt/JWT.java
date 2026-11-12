package com.nimbusds.jwt;

import com.nimbusds.jose.Header;
import com.nimbusds.jose.util.Base64URL;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public interface JWT extends Serializable {
    Header getHeader();

    JWTClaimsSet getJWTClaimsSet();

    Base64URL[] getParsedParts();

    String getParsedString();

    String serialize();
}
