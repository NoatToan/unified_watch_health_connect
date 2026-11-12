package org.bouncycastle.util.test;

import defpackage.h7c;

/* JADX INFO: loaded from: classes3.dex */
public class TestRandomData extends FixedSecureRandom {
    public TestRandomData(String str) {
        super(new FixedSecureRandom.e[]{new FixedSecureRandom.b(h7c.a(str))});
    }

    public TestRandomData(byte[] bArr) {
        super(new FixedSecureRandom.e[]{new FixedSecureRandom.b(bArr)});
    }
}
