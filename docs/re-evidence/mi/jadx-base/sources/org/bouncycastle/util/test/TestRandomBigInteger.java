package org.bouncycastle.util.test;

import defpackage.yi2;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class TestRandomBigInteger extends FixedSecureRandom {
    public TestRandomBigInteger(int i, byte[] bArr) {
        super(new FixedSecureRandom.e[]{new FixedSecureRandom.a(i, bArr)});
    }

    public TestRandomBigInteger(String str) {
        this(str, 10);
    }

    public TestRandomBigInteger(String str, int i) {
        super(new FixedSecureRandom.e[]{new FixedSecureRandom.a(yi2.b(new BigInteger(str, i)))});
    }

    public TestRandomBigInteger(byte[] bArr) {
        super(new FixedSecureRandom.e[]{new FixedSecureRandom.a(bArr)});
    }
}
