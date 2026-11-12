package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class udt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f35669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f35670b;
    public float d;
    public float e;
    public float f;
    public int g;
    public int h;
    public int i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f35671k;
    public int l;
    public int m;
    public int n;
    public List<lf> w;
    public float[] c = new float[7];
    public int o = 0;
    public int p = 0;
    public float[] q = new float[7];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f35672r = 0;
    public int s = 0;
    public int t = -1;
    public int u = -1;
    public int v = -1;
    public int x = 0;
    public int y = 1;

    public void A(int i) {
        this.m = i;
    }

    public int B() {
        return this.g;
    }

    public void C(int i) {
        this.u = i;
    }

    public float D() {
        return this.d;
    }

    public void E(int i) {
        this.h = i;
    }

    public int F() {
        return this.m;
    }

    public void G(int i) {
        this.l = i;
    }

    public int H() {
        return this.u;
    }

    public void I(int i) {
        this.o = i;
    }

    public int J() {
        return this.h;
    }

    public void K(int i) {
        this.p = i;
    }

    public float L() {
        return this.e;
    }

    public float[] M() {
        return this.q;
    }

    public int N() {
        return this.y;
    }

    public int O() {
        return this.l;
    }

    public long P() {
        return this.f35669a;
    }

    public long Q() {
        return this.f35670b;
    }

    public float R() {
        return this.f35671k;
    }

    public int S() {
        return this.o;
    }

    public int T() {
        return this.p;
    }

    public void a(float f) {
        this.j = f;
    }

    public void b(long j) {
        this.f35669a = j;
    }

    public void c(float[] fArr) {
        this.c = fArr;
    }

    public byte[] d(int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(tet.s((short) this.y));
        int i2 = this.y;
        if (i2 == 1) {
            byteArrayOutputStream.write(this.n);
            for (float f : this.c) {
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(f).array());
            }
        } else if (i2 == 2 || i2 == 3) {
            byteArrayOutputStream.write(tet.s((short) this.g));
            byteArrayOutputStream.write(tet.s((short) this.h));
            byteArrayOutputStream.write(tet.s((short) this.i));
        } else if (i2 == 4) {
            byteArrayOutputStream.write(this.x);
        } else if (i2 == 5) {
            List<lf> list = this.w;
            byteArrayOutputStream.write(list != null ? list.size() : 0);
            List<lf> list2 = this.w;
            if (list2 != null) {
                Iterator<lf> it = list2.iterator();
                while (it.hasNext()) {
                    byteArrayOutputStream.write(it.next().a(i));
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public float[] e() {
        return this.c;
    }

    public int f() {
        return this.s;
    }

    public void g(float f) {
        this.f = f;
    }

    public void h(int i) {
        this.s = i;
    }

    public void i(long j) {
        this.f35670b = j;
    }

    public void j(float[] fArr) {
        this.q = fArr;
    }

    public float k() {
        return this.j;
    }

    public void l(float f) {
        this.d = f;
    }

    public void m(int i) {
        this.f35672r = i;
    }

    public int n() {
        return this.f35672r;
    }

    public void o(float f) {
        this.e = f;
    }

    public void p(int i) {
        this.v = i;
    }

    public int q() {
        return this.v;
    }

    public void r(float f) {
        this.f35671k = f;
    }

    public void s(int i) {
        this.i = i;
    }

    public int t() {
        return this.i;
    }

    public String toString() {
        return "HMPaiData{time=" + this.f35669a + ", timezone=" + this.f35670b + ", activityScores=" + Arrays.toString(this.c) + ", lowZonePai=" + this.d + ", mediumZonePai=" + this.e + ", highZonePai=" + this.f + ", lowZoneMinutes=" + this.g + ", mediumZoneMinutes=" + this.h + ", highZoneMinutes=" + this.i + ", dailyPai=" + this.j + ", totalPai=" + this.f35671k + ", restHr=" + this.l + ", maxHr=" + this.m + ", index=" + this.n + ", type=" + this.o + ", version=" + this.p + ", nextActivityScores=" + Arrays.toString(this.q) + ", gender=" + this.f35672r + ", age=" + this.s + ", lowZoneLimit=" + this.t + ", mediumZoneLimit=" + this.u + ", highZoneLimit=" + this.v + AbstractJsonLexerKt.END_OBJ;
    }

    public void u(int i) {
        this.n = i;
    }

    public float v() {
        return this.f;
    }

    public void w(int i) {
        this.t = i;
    }

    public int x() {
        return this.n;
    }

    public void y(int i) {
        this.g = i;
    }

    public int z() {
        return this.t;
    }
}
