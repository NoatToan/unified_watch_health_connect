package w63;

import ch.qos.logback.core.CoreConstants;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lw63/e0;", "Lw63/h;", "", "", "segments", "", "directory", "<init>", "([[B[I)V", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e0 extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient byte[][] f183359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int[] f183360g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(byte[][] bArr, int[] iArr) {
        super(h.f183362e.f183363a);
        bArr.getClass();
        iArr.getClass();
        this.f183359f = bArr;
        this.f183360g = iArr;
    }

    @Override // w63.h
    public final String a() {
        return v().a();
    }

    @Override // w63.h
    public final h c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f183359f;
        int length = bArr.length;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            int[] iArr = this.f183360g;
            int i16 = iArr[length + i14];
            int i17 = iArr[i14];
            messageDigest.update(bArr[i14], i16, i17 - i15);
            i14++;
            i15 = i17;
        }
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new h(bArrDigest);
    }

    @Override // w63.h
    public final int d() {
        return this.f183360g[this.f183359f.length - 1];
    }

    @Override // w63.h
    public final String e() {
        return v().e();
    }

    @Override // w63.h
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.d() == d() && n(0, hVar, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // w63.h
    public final int f(int i14, byte[] bArr) {
        bArr.getClass();
        return v().f(i14, bArr);
    }

    @Override // w63.h
    /* JADX INFO: renamed from: h */
    public final byte[] getF183363a() {
        return u();
    }

    @Override // w63.h
    public final int hashCode() {
        int i14 = this.f183364b;
        if (i14 != 0) {
            return i14;
        }
        byte[][] bArr = this.f183359f;
        int length = bArr.length;
        int i15 = 0;
        int i16 = 1;
        int i17 = 0;
        while (i15 < length) {
            int[] iArr = this.f183360g;
            int i18 = iArr[length + i15];
            int i19 = iArr[i15];
            byte[] bArr2 = bArr[i15];
            int i24 = (i19 - i17) + i18;
            while (i18 < i24) {
                i16 = (i16 * 31) + bArr2[i18];
                i18++;
            }
            i15++;
            i17 = i19;
        }
        this.f183364b = i16;
        return i16;
    }

    @Override // w63.h
    public final byte i(int i14) {
        byte[][] bArr = this.f183359f;
        int length = bArr.length - 1;
        int[] iArr = this.f183360g;
        b.b(iArr[length], i14, 1L);
        int iD = x63.b.d(this, i14);
        return bArr[iD][(i14 - (iD == 0 ? 0 : iArr[iD - 1])) + iArr[bArr.length + iD]];
    }

    @Override // w63.h
    public final int k(int i14, byte[] bArr) {
        bArr.getClass();
        return v().k(i14, bArr);
    }

    @Override // w63.h
    public final boolean m(int i14, int i15, int i16, byte[] bArr) {
        bArr.getClass();
        if (i14 < 0 || i14 > d() - i16 || i15 < 0 || i15 > bArr.length - i16) {
            return false;
        }
        int i17 = i16 + i14;
        int iD = x63.b.d(this, i14);
        while (i14 < i17) {
            int[] iArr = this.f183360g;
            int i18 = iD == 0 ? 0 : iArr[iD - 1];
            int i19 = iArr[iD] - i18;
            byte[][] bArr2 = this.f183359f;
            int i24 = iArr[bArr2.length + iD];
            int iMin = Math.min(i17, i19 + i18) - i14;
            if (!b.a(bArr2[iD], (i14 - i18) + i24, i15, bArr, iMin)) {
                return false;
            }
            i15 += iMin;
            i14 += iMin;
            iD++;
        }
        return true;
    }

    @Override // w63.h
    public final boolean n(int i14, h hVar, int i15) {
        hVar.getClass();
        if (i14 >= 0 && i14 <= d() - i15) {
            int i16 = i15 + i14;
            int iD = x63.b.d(this, i14);
            int i17 = 0;
            while (i14 < i16) {
                int[] iArr = this.f183360g;
                int i18 = iD == 0 ? 0 : iArr[iD - 1];
                int i19 = iArr[iD] - i18;
                byte[][] bArr = this.f183359f;
                int i24 = iArr[bArr.length + iD];
                int iMin = Math.min(i16, i19 + i18) - i14;
                if (hVar.m(i17, (i14 - i18) + i24, iMin, bArr[iD])) {
                    i17 += iMin;
                    i14 += iMin;
                    iD++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // w63.h
    public final String o(Charset charset) {
        return new String(v().f183363a, charset);
    }

    @Override // w63.h
    public final h p(int i14, int i15) {
        if (i15 == b.f183327b) {
            i15 = d();
        }
        if (i14 < 0) {
            vb.h.x(v.e0.f(i14, "beginIndex=", " < 0"));
            return null;
        }
        if (i15 > d()) {
            StringBuilder sbI = b71.i.i(i15, "endIndex=", " > length(");
            sbI.append(d());
            sbI.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            throw new IllegalArgumentException(sbI.toString().toString());
        }
        int i16 = i15 - i14;
        if (i16 < 0) {
            vb.h.x(tn.k.e(i15, i14, "endIndex=", " < beginIndex="));
            return null;
        }
        if (i14 == 0 && i15 == d()) {
            return this;
        }
        if (i14 == i15) {
            return h.f183362e;
        }
        int iD = x63.b.d(this, i14);
        int iD2 = x63.b.d(this, i15 - 1);
        byte[][] bArr = this.f183359f;
        byte[][] bArr2 = (byte[][]) p13.s.l(iD, iD2 + 1, bArr);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f183360g;
        if (iD <= iD2) {
            int i17 = iD;
            int i18 = 0;
            while (true) {
                iArr[i18] = Math.min(iArr2[i17] - i14, i16);
                int i19 = i18 + 1;
                iArr[i18 + bArr2.length] = iArr2[bArr.length + i17];
                if (i17 == iD2) {
                    break;
                }
                i17++;
                i18 = i19;
            }
        }
        int i24 = iD != 0 ? iArr2[iD - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i14 - i24) + iArr[length];
        return new e0(bArr2, iArr);
    }

    @Override // w63.h
    public final h r() {
        return v().r();
    }

    @Override // w63.h
    public final void t(int i14, e eVar) {
        int iD = x63.b.d(this, 0);
        int i15 = 0;
        while (i15 < i14) {
            int[] iArr = this.f183360g;
            int i16 = iD == 0 ? 0 : iArr[iD - 1];
            int i17 = iArr[iD] - i16;
            byte[][] bArr = this.f183359f;
            int i18 = iArr[bArr.length + iD];
            int iMin = Math.min(i14, i17 + i16) - i15;
            int i19 = (i15 - i16) + i18;
            c0 c0Var = new c0(bArr[iD], i19, i19 + iMin, true, false);
            c0 c0Var2 = eVar.f183348a;
            if (c0Var2 == null) {
                c0Var.f183342g = c0Var;
                c0Var.f183341f = c0Var;
                eVar.f183348a = c0Var;
            } else {
                c0 c0Var3 = c0Var2.f183342g;
                c0Var3.getClass();
                c0Var3.b(c0Var);
            }
            i15 += iMin;
            iD++;
        }
        eVar.f183349b += (long) i14;
    }

    @Override // w63.h
    public final String toString() {
        return v().toString();
    }

    public final byte[] u() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.f183359f;
        int length = bArr2.length;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < length) {
            int[] iArr = this.f183360g;
            int i17 = iArr[length + i14];
            int i18 = iArr[i14];
            int i19 = i18 - i15;
            p13.s.e(bArr2[i14], i16, i17, bArr, i17 + i19);
            i16 += i19;
            i14++;
            i15 = i18;
        }
        return bArr;
    }

    public final h v() {
        return new h(u());
    }
}
