package defpackage;

import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.base.a;
import com.xiaomi.hm.health.bt.profile.feature.Feature;

/* JADX INFO: loaded from: classes4.dex */
public final class g4s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f18601b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public b9t i;
    public a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f18602k;
    public MedicalRegisterVersion l;
    public qd m;
    public Feature n;
    public LanguageComBination o;

    public g4s(b9t b9tVar) {
        this(b9tVar, false);
    }

    public Feature A() {
        Feature feature = this.n;
        return feature != null ? feature : new Feature();
    }

    public final qd B(boolean z) {
        qd qdVarB;
        if (z && !Z() && "OMRONHEALTHCARE".equals(this.i.i) && "J750L".equals(this.i.j)) {
            return qd.l3;
        }
        if (Z()) {
            if (z) {
                hws hwsVar = this.i.e;
                int i = hwsVar.c;
                int i2 = hwsVar.d;
                qdVarB = qd.d(i, i2);
                t5t.d(DeviceInfoModule.NAME, "third pnp id = " + i + "; pnp version = " + i2 + "; and source = " + qdVarB);
            } else {
                hws hwsVar2 = this.i.e;
                qdVarB = qd.b(hwsVar2.c, hwsVar2.d);
            }
            if (qdVarB != null) {
                return qdVarB;
            }
        }
        if (i()) {
            return qd.y;
        }
        if (g()) {
            return qd.x;
        }
        if (y()) {
            return z() ? qd.f0 : qd.Z;
        }
        if (s()) {
            return qd.b0;
        }
        if (L()) {
            return qd.a0;
        }
        if (F()) {
            return qd.c0;
        }
        if (V()) {
            return qd.k0;
        }
        if (v()) {
            return qd.d0;
        }
        if (w()) {
            return qd.E0;
        }
        if (x()) {
            return qd.H0;
        }
        if (p()) {
            return qd.n0;
        }
        if (N()) {
            return qd.e0;
        }
        if (T()) {
            return qd.g0;
        }
        if (m()) {
            return qd.i0;
        }
        if (j()) {
            return qd.h0;
        }
        if (k()) {
            return qd.j0;
        }
        if (l()) {
            return qd.m0;
        }
        if (d()) {
            return qd.W2;
        }
        if (b0()) {
            return qd.F;
        }
        if (d0()) {
            return qd.G;
        }
        if (f0()) {
            return qd.H;
        }
        if (j0()) {
            return qd.I;
        }
        if (n0()) {
            return qd.z;
        }
        if (r0()) {
            return qd.A;
        }
        if (t0()) {
            return qd.C;
        }
        if (p0()) {
            return qd.B;
        }
        if (h0()) {
            return qd.J;
        }
        if (b()) {
            return qd.X;
        }
        if (n()) {
            return qd.p0;
        }
        if (P()) {
            return qd.r0;
        }
        if (o()) {
            return qd.q0;
        }
        if (R()) {
            return qd.s0;
        }
        if (t()) {
            return qd.v0;
        }
        if (u()) {
            return qd.z0;
        }
        if (J()) {
            return qd.w0;
        }
        if (e()) {
            return qd.Y2;
        }
        if (X()) {
            return qd.X2;
        }
        if (q()) {
            return qd.x0;
        }
        if (r()) {
            return qd.g1;
        }
        if (H()) {
            return qd.y0;
        }
        if (c()) {
            return qd.O0;
        }
        if (f()) {
            return qd.w;
        }
        return l0() ? qd.S : qd.v;
    }

    public void C(MedicalRegisterVersion clVar) {
        this.l = clVar;
    }

    public void D(a aVar) {
        this.j = aVar;
    }

    public void E(String str) {
        this.f18602k = str;
    }

    public boolean F() {
        return Z() && this.i.e.c == 9;
    }

    public String G() {
        return this.f18600a;
    }

    public boolean H() {
        return Z() && this.i.e.c == 45;
    }

    public qd I() {
        return this.m;
    }

    public boolean J() {
        return Z() && this.i.e.c == 34;
    }

    public final int K() {
        return this.h & 255;
    }

    public boolean L() {
        return Z() && this.i.e.c == 10;
    }

    public final int M() {
        return (this.h >> 24) & 255;
    }

    public boolean N() {
        return Z() && this.i.e.c == 16;
    }

    public final int O() {
        return (this.h >> 16) & 255;
    }

    public boolean P() {
        hws hwsVar;
        int i;
        return Z() && (((i = (hwsVar = this.i.e).c) == 31 && hwsVar.d == 257) || (i == 35 && hwsVar.d == 256));
    }

    public final int Q() {
        return (this.h >> 8) & 255;
    }

    public boolean R() {
        if (Z()) {
            hws hwsVar = this.i.e;
            if (hwsVar.c == 35 && hwsVar.d == 257) {
                return true;
            }
        }
        return false;
    }

    public String S() {
        return M() + "." + O() + "." + Q() + "." + K();
    }

    public boolean T() {
        return Z() && this.i.e.c == 19;
    }

    public int U() {
        return this.g;
    }

    public boolean V() {
        return Z() && this.i.e.c == 24;
    }

    public final int W() {
        return this.g & 255;
    }

    public boolean X() {
        return Z() && this.i.e.c == 37;
    }

    public final int Y() {
        return (this.g >> 24) & 255;
    }

    public final boolean Z() {
        b9t b9tVar = this.i;
        return (b9tVar == null || b9tVar.e == null) ? false : true;
    }

    public String a() {
        String str;
        b9t b9tVar = this.i;
        return (b9tVar == null || (str = b9tVar.f3966b) == null) ? "" : str;
    }

    public final int a0() {
        return (this.g >> 16) & 255;
    }

    public boolean b() {
        int i = this.c & 255;
        return i == 6 || i == 9;
    }

    public boolean b0() {
        return Z() && this.i.e.c == 3;
    }

    public boolean c() {
        if (Z()) {
            hws hwsVar = this.i.e;
            if (hwsVar.c == 47 && hwsVar.d == 256) {
                return true;
            }
        }
        return false;
    }

    public final int c0() {
        return (this.g >> 8) & 255;
    }

    public boolean d() {
        return Z() && this.i.e.c == 18;
    }

    public boolean d0() {
        return Z() && this.i.e.c == 5;
    }

    public boolean e() {
        if (Z()) {
            hws hwsVar = this.i.e;
            if (hwsVar.c == 101 && hwsVar.d == 31) {
                return true;
            }
        }
        return false;
    }

    public String e0() {
        b9t b9tVar = this.i;
        if (b9tVar != null) {
            return b9tVar.c;
        }
        return Y() + "." + a0() + "." + c0() + "." + W();
    }

    public boolean f() {
        int i;
        return (this.c & 255) == 0 && (this.d & 255) == 0 && ((i = this.e & 255) == 2 || i == 1 || i == 49);
    }

    public boolean f0() {
        return Z() && this.i.e.c == 7;
    }

    public boolean g() {
        int i = this.c & 255;
        return (i == 5 && (this.d & 255) == 0) || (i == 0 && (this.e & 255) == 208) || ((i == 0 && (this.e & 255) == 8) || h());
    }

    public String g0() {
        return this.f18602k;
    }

    public final boolean h() {
        return (this.c & 255) == 4 && (this.e & 255) == 8;
    }

    public boolean h0() {
        return Z() && this.i.e.c == 13;
    }

    public boolean i() {
        return (this.h == -1 || (this.e & 255) == 8) ? false : true;
    }

    public String i0() {
        String str;
        b9t b9tVar = this.i;
        return (b9tVar == null || (str = b9tVar.d) == null) ? String.valueOf(this.e) : str;
    }

    public boolean j() {
        return Z() && this.i.e.c == 20;
    }

    public boolean j0() {
        return Z() && this.i.e.c == 8;
    }

    public boolean k() {
        return Z() && this.i.e.c == 22;
    }

    public LanguageComBination k0() {
        return this.o;
    }

    public boolean l() {
        return Z() && this.i.e.c == 26;
    }

    public boolean l0() {
        return Z() && this.i.e.c == 23;
    }

    public boolean m() {
        return Z() && this.i.e.c == 21;
    }

    public a m0() {
        return this.j;
    }

    public boolean n() {
        hws hwsVar;
        int i;
        return Z() && (((i = (hwsVar = this.i.e).c) == 31 && hwsVar.d == 256) || (i == 36 && hwsVar.d == 256));
    }

    public boolean n0() {
        return Z() && this.i.e.c == 36897;
    }

    public boolean o() {
        if (Z()) {
            hws hwsVar = this.i.e;
            if (hwsVar.c == 36 && hwsVar.d == 257) {
                return true;
            }
        }
        return false;
    }

    public hws o0() {
        if (Z()) {
            return this.i.e;
        }
        return null;
    }

    public boolean p() {
        return Z() && this.i.e.c == 27;
    }

    public boolean p0() {
        return Z() && this.i.e.c == 25;
    }

    public boolean q() {
        return Z() && this.i.e.c == 38;
    }

    public int q0() {
        if (Z()) {
            return this.i.e.c;
        }
        return -1;
    }

    public boolean r() {
        if (Z()) {
            hws hwsVar = this.i.e;
            if (hwsVar.c == 54 && hwsVar.d == 256) {
                return true;
            }
        }
        return false;
    }

    public boolean r0() {
        return Z() && this.i.e.c == 6;
    }

    public boolean s() {
        return Z() && this.i.e.c == 11;
    }

    public int s0() {
        if (Z()) {
            return this.i.e.d;
        }
        return -1;
    }

    public final boolean t() {
        return Z() && this.i.e.c == 32;
    }

    public boolean t0() {
        return Z() && this.i.e.c == 30;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("[[[ ");
        sb.append(g4s.class.getSimpleName());
        sb.append(" ]]]");
        sb.append("\n         deviceID: ");
        sb.append(this.f18600a);
        sb.append("\n          feature: ");
        sb.append(Integer.toHexString(this.c));
        sb.append("\n       appearance: ");
        sb.append(Integer.toHexString(this.d));
        sb.append("\n  hardwareVersion: ");
        sb.append(Integer.toHexString(this.e));
        sb.append("\n   profileVersion: ");
        sb.append(y0());
        sb.append("\n  firmwareVersion: ");
        sb.append(e0());
        sb.append("\n firmware2Version: ");
        sb.append(S());
        sb.append("\n     deviceSource: ");
        sb.append(I());
        sb.append("\n     otherVersion: ");
        sb.append(this.j);
        if (this.i != null) {
            sb.append("\n generalInfo:");
            sb.append(this.i);
        }
        if (this.f18602k != null) {
            sb.append("\n gpsVersion:");
            sb.append(this.f18602k);
        }
        sb.append("\n deviceFeature:");
        sb.append(this.n);
        if (this.l != null) {
            sb.append("\n medicalRegVersion:");
            sb.append(this.l);
        }
        return sb.toString();
    }

    public final boolean u() {
        return Z() && this.i.e.c == 39;
    }

    public final int u0() {
        return this.f & 255;
    }

    public boolean v() {
        return Z() && this.i.e.c == 15;
    }

    public final int v0() {
        return (this.f >> 24) & 255;
    }

    public final boolean w() {
        if (Z()) {
            hws hwsVar = this.i.e;
            if (hwsVar.c == 44 && hwsVar.d == 256) {
                return true;
            }
        }
        return false;
    }

    public final int w0() {
        return (this.f >> 16) & 255;
    }

    public final boolean x() {
        if (Z()) {
            hws hwsVar = this.i.e;
            if (hwsVar.c == 44 && hwsVar.d == 257) {
                return true;
            }
        }
        return false;
    }

    public final int x0() {
        return (this.f >> 8) & 255;
    }

    public boolean y() {
        int i;
        return Z() && ((i = this.i.e.c) == 4 || i == 260);
    }

    public final String y0() {
        return v0() + "." + w0() + "." + x0() + "." + u0();
    }

    public boolean z() {
        return y() && this.i.e.d == 259;
    }

    public g4s(b9t b9tVar, boolean z) {
        this.f18600a = null;
        this.f18601b = null;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = null;
        this.j = new a();
        this.f18602k = null;
        this.m = qd.v;
        this.n = null;
        this.o = new LanguageComBination();
        this.i = b9tVar;
        this.f18600a = b9tVar.f3965a;
        this.f18601b = b9tVar.f;
        this.g = ProfileUtils.getVersionCodeFromVersionName(b9tVar.c);
        this.m = B(z);
        this.n = b9tVar.a();
    }

    public g4s(byte[] bArr, int i, int i2, boolean z) {
        this(bArr, i, i2, -1, z);
    }

    public g4s(byte[] bArr, int i, int i2, int i3, boolean z) {
        this.f18600a = null;
        this.f18601b = null;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = null;
        this.j = new a();
        this.f18602k = null;
        this.m = qd.v;
        this.n = null;
        this.o = new LanguageComBination();
        this.f18601b = bArr;
        this.f18600a = String.format("%02X%02X%02X%02X%02X%02X%02X%02X", Byte.valueOf(bArr[0]), Byte.valueOf(bArr[1]), Byte.valueOf(bArr[2]), Byte.valueOf(bArr[3]), Byte.valueOf(bArr[4]), Byte.valueOf(bArr[5]), Byte.valueOf(bArr[6]), Byte.valueOf(bArr[7]));
        this.c = bArr[4] & 255;
        this.d = bArr[5] & 255;
        this.e = bArr[6] & 255;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.m = B(z);
    }
}
