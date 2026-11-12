package io.jsonwebtoken.security;

import defpackage.yyf;
import io.jsonwebtoken.Identifiable;
import io.jsonwebtoken.security.Request;
import io.jsonwebtoken.security.VerifyDigestRequest;
import java.io.InputStream;

/* JADX INFO: loaded from: classes46.dex */
public interface DigestAlgorithm<R extends Request<InputStream>, V extends VerifyDigestRequest> extends Identifiable {
    byte[] digest(R r) throws yyf;

    boolean verify(V v) throws yyf;
}
