package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class jil extends b87.b {
    public static final BigInteger i = new BigInteger(1, i7c.a("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));
    public pil h;

    public jil() {
        super(i);
        this.h = new pil(this, null, null);
        this.f3911b = j(new BigInteger(1, i7c.a("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.c = j(new BigInteger(1, i7c.a("E87579C11079F43DD824993C2CEE5ED3")));
        this.d = new BigInteger(1, i7c.a("FFFFFFFE0000000075A30D1B9038A115"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.b87
    public b87 b() {
        return new jil();
    }

    @Override // defpackage.b87
    public i97 f(h87 h87Var, h87 h87Var2, boolean z) {
        return new pil(this, h87Var, h87Var2, z);
    }

    @Override // defpackage.b87
    public h87 j(BigInteger bigInteger) {
        return new nil(bigInteger);
    }

    @Override // defpackage.b87
    public int p() {
        return i.bitLength();
    }

    @Override // defpackage.b87
    public i97 q() {
        return this.h;
    }

    @Override // defpackage.b87
    public boolean v(int i2) {
        return i2 == 2;
    }
}
