package defpackage;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class wd extends re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f37861a;

    public wd(long j) {
        this.f37861a = BigInteger.valueOf(j).toByteArray();
    }

    public static wd o(Object obj) {
        if (obj == null || (obj instanceof wd)) {
            return (wd) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (wd) re.j((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
        }
    }

    public static boolean t(byte[] bArr) {
        if (bArr.length > 1) {
            byte b2 = bArr[0];
            if (b2 == 0 && (bArr[1] & 128) == 0) {
                return true;
            }
            if (b2 == -1 && (bArr[1] & 128) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.re
    public boolean g(re reVar) {
        if (reVar instanceof wd) {
            return vj1.a(this.f37861a, ((wd) reVar).f37861a);
        }
        return false;
    }

    @Override // defpackage.re
    public void h(ke keVar) throws IOException {
        keVar.g(2, this.f37861a);
    }

    @Override // defpackage.re, defpackage.de
    public int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f37861a;
            if (i == bArr.length) {
                return i2;
            }
            i2 ^= (bArr[i] & 255) << (i % 4);
            i++;
        }
    }

    @Override // defpackage.re
    public int i() {
        return yio.a(this.f37861a.length) + 1 + this.f37861a.length;
    }

    @Override // defpackage.re
    public boolean k() {
        return false;
    }

    public BigInteger q() {
        return new BigInteger(1, this.f37861a);
    }

    public BigInteger r() {
        return new BigInteger(this.f37861a);
    }

    public String toString() {
        return r().toString();
    }

    public wd(BigInteger bigInteger) {
        this.f37861a = bigInteger.toByteArray();
    }

    public wd(byte[] bArr, boolean z) {
        if (!jdi.c("org.bouncycastle.asn1.allow_unsafe_integer") && t(bArr)) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.f37861a = z ? vj1.e(bArr) : bArr;
    }
}
