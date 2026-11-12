package io.jsonwebtoken;

import defpackage.yxe;
import defpackage.yxh;
import defpackage.yxj;
import defpackage.yxk;
import defpackage.yyf;
import io.jsonwebtoken.io.Parser;
import java.io.InputStream;

/* JADX INFO: loaded from: classes46.dex */
public interface JwtParser extends Parser<Jwt<?, ?>> {
    boolean isSigned(CharSequence charSequence);

    @Override // io.jsonwebtoken.io.Parser
    Jwt<?, ?> parse(CharSequence charSequence) throws yxe, yyf, yxj, IllegalArgumentException;

    @Deprecated
    <T> T parse(CharSequence charSequence, JwtHandler<T> jwtHandler) throws yxe, yyf, yxj, IllegalArgumentException, yxk;

    @Deprecated
    Jws<Claims> parseClaimsJws(CharSequence charSequence) throws yxe, yyf, yxj, IllegalArgumentException, yxk;

    @Deprecated
    Jwt<Header, Claims> parseClaimsJwt(CharSequence charSequence) throws yxe, yyf, yxj, IllegalArgumentException, yxk;

    @Deprecated
    Jws<byte[]> parseContentJws(CharSequence charSequence) throws yyf, yxj, IllegalArgumentException, yxk;

    @Deprecated
    Jwt<Header, byte[]> parseContentJwt(CharSequence charSequence) throws yyf, yxj, IllegalArgumentException, yxk;

    Jwe<Claims> parseEncryptedClaims(CharSequence charSequence) throws yxh, IllegalArgumentException;

    Jwe<byte[]> parseEncryptedContent(CharSequence charSequence) throws yxh, IllegalArgumentException;

    Jws<Claims> parseSignedClaims(CharSequence charSequence) throws yxh, IllegalArgumentException;

    Jws<Claims> parseSignedClaims(CharSequence charSequence, InputStream inputStream) throws yxh, IllegalArgumentException;

    Jws<Claims> parseSignedClaims(CharSequence charSequence, byte[] bArr) throws yxh, IllegalArgumentException;

    Jws<byte[]> parseSignedContent(CharSequence charSequence) throws yxh, IllegalArgumentException;

    Jws<byte[]> parseSignedContent(CharSequence charSequence, InputStream inputStream);

    Jws<byte[]> parseSignedContent(CharSequence charSequence, byte[] bArr);

    Jwt<Header, Claims> parseUnsecuredClaims(CharSequence charSequence) throws yxh, IllegalArgumentException;

    Jwt<Header, byte[]> parseUnsecuredContent(CharSequence charSequence) throws yxh, IllegalArgumentException;
}
