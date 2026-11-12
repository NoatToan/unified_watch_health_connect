package io.jsonwebtoken;

import java.security.Key;

/* JADX INFO: loaded from: classes46.dex */
@Deprecated
public interface SigningKeyResolver {
    Key resolveSigningKey(JwsHeader jwsHeader, Claims claims);

    Key resolveSigningKey(JwsHeader jwsHeader, byte[] bArr);
}
