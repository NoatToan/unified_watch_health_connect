package com.nimbusds.jose.util;

import defpackage.mbo;
import defpackage.p12;
import defpackage.wi2;
import java.math.BigInteger;
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes6.dex */
@Immutable
public class Base64URL extends Base64 {
    public Base64URL(String str) {
        super(str);
    }

    public static Base64URL encode(byte[] bArr) {
        return new Base64URL(p12.g(bArr, true));
    }

    public static Base64URL from(String str) {
        if (str == null) {
            return null;
        }
        return new Base64URL(str);
    }

    @Override // com.nimbusds.jose.util.Base64
    public boolean equals(Object obj) {
        return (obj instanceof Base64URL) && toString().equals(obj.toString());
    }

    public static Base64URL encode(BigInteger bigInteger) {
        return encode(wi2.a(bigInteger));
    }

    public static Base64URL encode(String str) {
        return encode(str.getBytes(mbo.f25981a));
    }
}
