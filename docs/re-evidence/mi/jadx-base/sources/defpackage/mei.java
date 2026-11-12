package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.work.WorkInfo;
import com.google.android.exoplayer2.ParserException;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class mei implements il8 {
    public static final nl8 l = new nl8() { // from class: lei
        @Override // defpackage.nl8
        public final il8[] c() {
            return mei.d();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rfp f26072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<a> f26073b;
    public final okh c;
    public final kei d;
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public jei i;
    public kl8 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26074k;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u68 f26075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final rfp f26076b;
        public final nkh c = new nkh(new byte[64]);
        public boolean d;
        public boolean e;
        public boolean f;
        public int g;
        public long h;

        public a(u68 u68Var, rfp rfpVar) {
            this.f26075a = u68Var;
            this.f26076b = rfpVar;
        }

        public void a(okh okhVar) throws ParserException {
            okhVar.j(this.c.f28014a, 0, 3);
            this.c.p(0);
            b();
            okhVar.j(this.c.f28014a, 0, this.g);
            this.c.p(0);
            c();
            this.f26075a.e(this.h, 4);
            this.f26075a.a(okhVar);
            this.f26075a.d();
        }

        public final void b() {
            this.c.r(8);
            this.d = this.c.g();
            this.e = this.c.g();
            this.c.r(6);
            this.g = this.c.h(8);
        }

        public final void c() {
            this.h = 0L;
            if (this.d) {
                this.c.r(4);
                long jH = ((long) this.c.h(3)) << 30;
                this.c.r(1);
                long jH2 = jH | ((long) (this.c.h(15) << 15));
                this.c.r(1);
                long jH3 = jH2 | ((long) this.c.h(15));
                this.c.r(1);
                if (!this.f && this.e) {
                    this.c.r(4);
                    long jH4 = ((long) this.c.h(3)) << 30;
                    this.c.r(1);
                    long jH5 = jH4 | ((long) (this.c.h(15) << 15));
                    this.c.r(1);
                    long jH6 = jH5 | ((long) this.c.h(15));
                    this.c.r(1);
                    this.f26076b.b(jH6);
                    this.f = true;
                }
                this.h = this.f26076b.b(jH3);
            }
        }

        public void d() {
            this.f = false;
            this.f26075a.c();
        }
    }

    public mei() {
        this(new rfp(0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ il8[] d() {
        return new il8[]{new mei()};
    }

    @Override // defpackage.il8
    public void a(long j, long j2) {
        if (this.f26072a.e() == -9223372036854775807L || (this.f26072a.c() != 0 && this.f26072a.c() != j2)) {
            this.f26072a.g(j2);
        }
        jei jeiVar = this.i;
        if (jeiVar != null) {
            jeiVar.h(j2);
        }
        for (int i = 0; i < this.f26073b.size(); i++) {
            this.f26073b.valueAt(i).d();
        }
    }

    @Override // defpackage.il8
    public void b(kl8 kl8Var) {
        this.j = kl8Var;
    }

    public final void e(long j) {
        if (this.f26074k) {
            return;
        }
        this.f26074k = true;
        if (this.d.c() == -9223372036854775807L) {
            this.j.k(new arl.b(this.d.c()));
            return;
        }
        jei jeiVar = new jei(this.d.d(), this.d.c(), j);
        this.i = jeiVar;
        this.j.k(jeiVar.b());
    }

    @Override // defpackage.il8
    public int f(jl8 jl8Var, r4i r4iVar) throws IOException {
        u68 ocbVar;
        rk1.i(this.j);
        long length = jl8Var.getLength();
        if (length != -1 && !this.d.e()) {
            return this.d.g(jl8Var, r4iVar);
        }
        e(length);
        jei jeiVar = this.i;
        if (jeiVar != null && jeiVar.d()) {
            return this.i.c(jl8Var, r4iVar);
        }
        jl8Var.l();
        long jN = length != -1 ? length - jl8Var.n() : -1L;
        if ((jN != -1 && jN < 4) || !jl8Var.k(this.c.d(), 0, 4, true)) {
            return -1;
        }
        this.c.P(0);
        int iN = this.c.n();
        if (iN == 441) {
            return -1;
        }
        if (iN == 442) {
            jl8Var.i(this.c.d(), 0, 10);
            this.c.P(9);
            jl8Var.p((this.c.D() & 7) + 14);
            return 0;
        }
        if (iN == 443) {
            jl8Var.i(this.c.d(), 0, 2);
            this.c.P(0);
            jl8Var.p(this.c.J() + 6);
            return 0;
        }
        if (((iN & WorkInfo.STOP_REASON_NOT_STOPPED) >> 8) != 1) {
            jl8Var.p(1);
            return 0;
        }
        int i = iN & 255;
        a aVar = this.f26073b.get(i);
        if (!this.e) {
            if (aVar == null) {
                if (i == 189) {
                    ocbVar = new d20();
                    this.f = true;
                    this.h = jl8Var.getPosition();
                } else if ((iN & SportReportBaseParser.ReportType.avgFreq) == 192) {
                    ocbVar = new i9g();
                    this.f = true;
                    this.h = jl8Var.getPosition();
                } else if ((iN & 240) == 224) {
                    ocbVar = new ocb();
                    this.g = true;
                    this.h = jl8Var.getPosition();
                } else {
                    ocbVar = null;
                }
                if (ocbVar != null) {
                    ocbVar.f(this.j, new i2q.d(i, 256));
                    aVar = new a(ocbVar, this.f26072a);
                    this.f26073b.put(i, aVar);
                }
            }
            if (jl8Var.getPosition() > ((this.f && this.g) ? this.h + 8192 : PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                this.e = true;
                this.j.m();
            }
        }
        jl8Var.i(this.c.d(), 0, 2);
        this.c.P(0);
        int iJ = this.c.J() + 6;
        if (aVar == null) {
            jl8Var.p(iJ);
        } else {
            this.c.L(iJ);
            jl8Var.readFully(this.c.d(), 0, iJ);
            this.c.P(6);
            aVar.a(this.c);
            okh okhVar = this.c;
            okhVar.O(okhVar.b());
        }
        return 0;
    }

    @Override // defpackage.il8
    public boolean g(jl8 jl8Var) throws IOException {
        byte[] bArr = new byte[14];
        jl8Var.i(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        jl8Var.o(bArr[13] & 7);
        jl8Var.i(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // defpackage.il8
    public void release() {
    }

    public mei(rfp rfpVar) {
        this.f26072a = rfpVar;
        this.c = new okh(4096);
        this.f26073b = new SparseArray<>();
        this.d = new kei();
    }
}
