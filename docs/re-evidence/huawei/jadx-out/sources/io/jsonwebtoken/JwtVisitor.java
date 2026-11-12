package io.jsonwebtoken;

/* JADX INFO: loaded from: classes46.dex */
public interface JwtVisitor<T> {
    T visit(Jwe<?> jwe);

    T visit(Jws<?> jws);

    T visit(Jwt<?, ?> jwt);
}
