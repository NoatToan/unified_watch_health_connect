package defpackage;

import com.mi.fitness.netproxy.NetProxyComponentKt;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportType;
import com.xiaomi.hm.health.bt.profile.sport.SportTemperature;
import java.io.ByteArrayOutputStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class r6t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32268a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32269b = -1;
    public int c = -1;
    public int d = -1;
    public int e = -1;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f32270k = -1;
    public int l = -1;
    public int m = -1;
    public int n = -1;
    public int o = -1;
    public int p = -1;
    public int q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f32271r = -1;
    public s4t s = null;
    public SportTemperature t = null;
    public SportType u = SportType.SPORT_TYPE_ODRUN;
    public int v = -1;
    public int w = -1;
    public int x = -1;
    public int y = -1;
    public final int z = 1;
    public final int A = 2;
    public final int B = 4;

    public static byte[] y() {
        return new byte[]{0, 0, 0, 0};
    }

    public void A(int i) {
        this.f32270k = i;
    }

    public int a() {
        return this.q;
    }

    public void b(int i) {
        this.q = i;
    }

    public void c(SportType sportType) {
        this.u = sportType;
    }

    public void d(SportTemperature sportTemperature) {
        this.t = sportTemperature;
    }

    public void e(s4t s4tVar) {
        this.s = s4tVar;
    }

    public int f() {
        return this.f32271r;
    }

    public void g(int i) {
        this.f32271r = i;
    }

    public void h(int i) {
        this.i = i;
    }

    public byte[] i() {
        int i;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = this.f32268a;
        if (i2 != -1) {
            byteArrayOutputStream.write((byte) i2);
            i = 1;
        } else {
            i = 0;
        }
        int i3 = this.c;
        if (i3 != -1) {
            i |= 2;
            byteArrayOutputStream.write(tet.p(i3), 0, 4);
        }
        int i4 = this.f32269b;
        if (i4 != -1) {
            i |= 4;
            byteArrayOutputStream.write(tet.p(i4), 0, 4);
        }
        int i5 = this.d;
        if (i5 != -1) {
            i |= 8;
            byteArrayOutputStream.write(tet.p(i5), 0, 4);
        }
        int i6 = this.e;
        if (i6 != -1) {
            i |= 16;
            byteArrayOutputStream.write(tet.p(i6), 0, 4);
        }
        int i7 = this.f;
        if (i7 != -1) {
            i |= 32;
            byteArrayOutputStream.write((byte) i7);
        }
        int i8 = this.g;
        if (i8 != -1) {
            i |= 64;
            byteArrayOutputStream.write(tet.p(i8), 0, 4);
        }
        int i9 = this.h;
        if (i9 != -1) {
            i |= 128;
            byteArrayOutputStream.write(tet.p(i9), 0, 4);
        }
        int i10 = this.i;
        if (i10 != -1) {
            i |= 256;
            byteArrayOutputStream.write(tet.p(i10), 0, 4);
        }
        int i11 = this.j;
        if (i11 != -1) {
            i |= 512;
            byteArrayOutputStream.write(tet.s((short) i11), 0, 2);
        }
        int i12 = this.f32270k;
        if (i12 != -1) {
            i |= 1024;
            byteArrayOutputStream.write(tet.s((short) i12), 0, 2);
        }
        int i13 = this.l;
        if (i13 != -1) {
            i |= 2048;
            byteArrayOutputStream.write(tet.p(i13), 0, 4);
        }
        int i14 = this.m;
        if (i14 != -1) {
            i |= 4096;
            byteArrayOutputStream.write(tet.p(i14), 0, 4);
        }
        int i15 = this.n;
        if (i15 != -1) {
            i |= 8192;
            byteArrayOutputStream.write(tet.p(i15), 0, 4);
        }
        int i16 = this.o;
        if (i16 != -1) {
            i |= 16384;
            byteArrayOutputStream.write(tet.p(i16), 0, 4);
        }
        int i17 = this.p;
        if (i17 != -1) {
            i |= 32768;
            byteArrayOutputStream.write(tet.p(i17), 0, 4);
        }
        int i18 = this.q;
        if (i18 != -1) {
            i |= 65536;
            byteArrayOutputStream.write(tet.p(i18), 0, 4);
        }
        int i19 = this.f32271r;
        if (i19 != -1) {
            i |= 131072;
            byteArrayOutputStream.write(tet.p(i19), 0, 4);
        }
        s4t s4tVar = this.s;
        if (s4tVar != null) {
            i |= 262144;
            byte[] bArrC = s4tVar.c();
            byteArrayOutputStream.write(bArrC, 0, bArrC.length);
        }
        SportTemperature sportTemperature = this.t;
        if (sportTemperature != null) {
            i |= 524288;
            byte[] bytes = sportTemperature.getBytes();
            byteArrayOutputStream.write(bytes, 0, bytes.length);
        }
        int i20 = this.v;
        if (i20 != -1) {
            i |= EventRecurrence.TH;
            byteArrayOutputStream.write(tet.p(i20), 0, 2);
        }
        int i21 = this.w;
        if (i21 != -1) {
            i |= 2097152;
            byteArrayOutputStream.write(tet.p(i21), 0, 1);
        }
        int i22 = this.x;
        if (i22 != -1) {
            i |= 4194304;
            byteArrayOutputStream.write(tet.p(i22), 0, 4);
        }
        int i23 = this.y;
        if (i23 != -1) {
            i |= NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
            byteArrayOutputStream.write(tet.p(i23), 0, 4);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream2.write(tet.p(i), 0, 4);
            if (byteArrayOutputStream.size() > 0) {
                byteArrayOutputStream2.write(byteArrayOutputStream.toByteArray());
            }
            return byteArrayOutputStream2.toByteArray();
        } catch (Exception unused) {
            return null;
        }
    }

    public int j() {
        return this.d;
    }

    public void k(int i) {
        this.d = i;
    }

    public int l() {
        return this.f;
    }

    public void m(int i) {
        this.f32269b = i;
    }

    public int n() {
        return this.e;
    }

    public void o(int i) {
        this.f32268a = i;
    }

    public int p() {
        return this.h;
    }

    public void q(int i) {
        if (i == -1) {
            return;
        }
        this.f = i;
    }

    public SportType r() {
        return this.u;
    }

    public void s(int i) {
        this.e = i;
    }

    public int t() {
        return this.g;
    }

    public String toString() {
        return "SportInfo{gpsState=" + this.f32268a + ", elapsedTime=" + this.f32269b + ", startTime=" + this.c + ", distance=" + this.d + ", pace=" + this.e + ", hr=" + this.f + ", step=" + this.g + ", speed=" + this.h + ", cal=" + this.i + ", stepFreq=" + this.j + ", stepLen=" + this.f32270k + ", ascent=" + this.l + ", descent=" + this.m + ", maxSpeed=" + this.n + ", rideTime=" + this.o + ", climbDistance=" + this.p + ", avePace=" + this.q + ", aveSpeed=" + this.f32271r + ", gpsPoint=" + this.s + ", sportType=" + this.u + AbstractJsonLexerKt.END_OBJ;
    }

    public void u(int i) {
        this.h = i;
    }

    public int v() {
        return this.j;
    }

    public void w(int i) {
        this.c = i;
    }

    public void x(int i) {
        this.g = i;
    }

    public void z(int i) {
        this.j = i;
    }
}
