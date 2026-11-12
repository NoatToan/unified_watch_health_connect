package defpackage;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class vd extends pe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f36760a;

    public vd(long j) {
        this.f36760a = BigInteger.valueOf(j).toByteArray();
    }

    public static vd o(Object obj) {
        if (obj == null || (obj instanceof vd)) {
            return (vd) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (vd) pe.j((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
        }
    }

    @Override // defpackage.pe
    public boolean g(pe peVar) {
        if (peVar instanceof vd) {
            return wj1.a(this.f36760a, ((vd) peVar).f36760a);
        }
        return false;
    }

    @Override // defpackage.pe
    public void h(oe oeVar) throws IOException {
        oeVar.g(2, this.f36760a);
    }

    @Override // defpackage.pe, defpackage.be
    public int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f36760a;
            if (i == bArr.length) {
                return i2;
            }
            i2 ^= (bArr[i] & 255) << (i % 4);
            i++;
        }
    }

    @Override // defpackage.pe
    public int i() {
        return zio.a(this.f36760a.length) + 1 + this.f36760a.length;
    }

    @Override // defpackage.pe
    public boolean k() {
        return false;
    }

    public BigInteger q() {
        return new BigInteger(1, this.f36760a);
    }

    public BigInteger r() {
        return new BigInteger(this.f36760a);
    }

    public String toString() {
        return r().toString();
    }

    public vd(BigInteger bigInteger) {
        this.f36760a = bigInteger.toByteArray();
    }

    public vd(byte[] bArr, boolean z) {
        this.f36760a = z ? wj1.d(bArr) : bArr;
    }
}
