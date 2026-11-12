package defpackage;

import android.graphics.Bitmap;
import androidx.work.WorkInfo;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes4.dex */
public final class cth extends odm {
    public final okh o;
    public final okh p;
    public final a q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Inflater f14700r;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final okh f14701a = new okh();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f14702b = new int[256];
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;

        public h55 d() {
            int iD;
            if (this.d == 0 || this.e == 0 || this.h == 0 || this.i == 0 || this.f14701a.f() == 0 || this.f14701a.e() != this.f14701a.f() || !this.c) {
                return null;
            }
            this.f14701a.P(0);
            int i = this.h * this.i;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int iD2 = this.f14701a.D();
                if (iD2 != 0) {
                    iD = i2 + 1;
                    iArr[i2] = this.f14702b[iD2];
                } else {
                    int iD3 = this.f14701a.D();
                    if (iD3 != 0) {
                        iD = ((iD3 & 64) == 0 ? iD3 & 63 : ((iD3 & 63) << 8) | this.f14701a.D()) + i2;
                        Arrays.fill(iArr, i2, iD, (iD3 & 128) == 0 ? 0 : this.f14702b[this.f14701a.D()]);
                    }
                }
                i2 = iD;
            }
            return new h55.b().f(Bitmap.createBitmap(iArr, this.h, this.i, Bitmap.Config.ARGB_8888)).k(this.f / this.d).l(0).h(this.g / this.e, 0).i(0).n(this.h / this.d).g(this.i / this.e).a();
        }

        public final void e(okh okhVar, int i) {
            int iG;
            if (i < 4) {
                return;
            }
            okhVar.Q(3);
            int i2 = i - 4;
            if ((okhVar.D() & 128) != 0) {
                if (i2 < 7 || (iG = okhVar.G()) < 4) {
                    return;
                }
                this.h = okhVar.J();
                this.i = okhVar.J();
                this.f14701a.L(iG - 4);
                i2 = i - 11;
            }
            int iE = this.f14701a.e();
            int iF = this.f14701a.f();
            if (iE >= iF || i2 <= 0) {
                return;
            }
            int iMin = Math.min(i2, iF - iE);
            okhVar.j(this.f14701a.d(), iE, iMin);
            this.f14701a.P(iE + iMin);
        }

        public final void f(okh okhVar, int i) {
            if (i < 19) {
                return;
            }
            this.d = okhVar.J();
            this.e = okhVar.J();
            okhVar.Q(11);
            this.f = okhVar.J();
            this.g = okhVar.J();
        }

        public final void g(okh okhVar, int i) {
            if (i % 5 != 2) {
                return;
            }
            okhVar.Q(2);
            Arrays.fill(this.f14702b, 0);
            int i2 = i / 5;
            for (int i3 = 0; i3 < i2; i3++) {
                int iD = okhVar.D();
                int iD2 = okhVar.D();
                int iD3 = okhVar.D();
                int iD4 = okhVar.D();
                int iD5 = okhVar.D();
                double d = iD2;
                double d2 = iD3 + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                double d3 = iD4 + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                this.f14702b[iD] = (wlq.r((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (iD5 << 24) | (wlq.r((int) ((1.402d * d2) + d), 0, 255) << 16) | wlq.r((int) (d + (d3 * 1.772d)), 0, 255);
            }
            this.c = true;
        }

        public void h() {
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.f14701a.L(0);
            this.c = false;
        }
    }

    public cth() {
        super("PgsDecoder");
        this.o = new okh();
        this.p = new okh();
        this.q = new a();
    }

    public static h55 C(okh okhVar, a aVar) {
        int iF = okhVar.f();
        int iD = okhVar.D();
        int iJ = okhVar.J();
        int iE = okhVar.e() + iJ;
        h55 h55VarD = null;
        if (iE > iF) {
            okhVar.P(iF);
            return null;
        }
        if (iD != 128) {
            switch (iD) {
                case 20:
                    aVar.g(okhVar, iJ);
                    break;
                case 21:
                    aVar.e(okhVar, iJ);
                    break;
                case 22:
                    aVar.f(okhVar, iJ);
                    break;
            }
        } else {
            h55VarD = aVar.d();
            aVar.h();
        }
        okhVar.P(iE);
        return h55VarD;
    }

    public final void B(okh okhVar) {
        if (okhVar.a() <= 0 || okhVar.h() != 120) {
            return;
        }
        if (this.f14700r == null) {
            this.f14700r = new Inflater();
        }
        if (wlq.m0(okhVar, this.p, this.f14700r)) {
            okhVar.N(this.p.d(), this.p.f());
        }
    }

    @Override // defpackage.odm
    public soo z(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        this.o.N(bArr, i);
        B(this.o);
        this.q.h();
        ArrayList arrayList = new ArrayList();
        while (this.o.a() >= 3) {
            h55 h55VarC = C(this.o, this.q);
            if (h55VarC != null) {
                arrayList.add(h55VarC);
            }
        }
        return new dth(Collections.unmodifiableList(arrayList));
    }
}
