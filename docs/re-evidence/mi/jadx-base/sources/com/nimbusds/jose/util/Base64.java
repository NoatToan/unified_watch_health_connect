package com.nimbusds.jose.util;

import defpackage.mbo;
import defpackage.p12;
import defpackage.upd;
import defpackage.wi2;
import java.io.Serializable;
import java.math.BigInteger;
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes6.dex */
@Immutable
public class Base64 implements Serializable {
    private static final long serialVersionUID = 1;
    private final String value;

    public Base64(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The Base64 value must not be null");
        }
        this.value = str;
    }

    public static Base64 encode(byte[] bArr) {
        return new Base64(p12.g(bArr, false));
    }

    public static Base64 from(String str) {
        if (str == null) {
            return null;
        }
        return new Base64(str);
    }

    public byte[] decode() {
        return p12.c(this.value);
    }

    public BigInteger decodeToBigInteger() {
        return new BigInteger(1, decode());
    }

    public String decodeToString() {
        return new String(decode(), mbo.f25981a);
    }

    public boolean equals(Object obj) {
        return (obj instanceof Base64) && toString().equals(obj.toString());
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toJSONString() {
        return upd.a(this.value);
    }

    public String toString() {
        return this.value;
    }

    public static Base64 encode(BigInteger bigInteger) {
        return encode(wi2.a(bigInteger));
    }

    public static Base64 encode(String str) {
        return encode(str.getBytes(mbo.f25981a));
    }
}
