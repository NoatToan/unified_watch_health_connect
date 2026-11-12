package io.jsonwebtoken;

import io.jsonwebtoken.ProtectedHeader;
import io.jsonwebtoken.security.DigestSupplier;

/* JADX INFO: loaded from: classes46.dex */
public interface ProtectedJwt<H extends ProtectedHeader, P> extends Jwt<H, P>, DigestSupplier {
}
