package defpackage;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.work.WorkInfo;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.mibi.sdk.component.ErrorCodes;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel;
import com.xiaomi.passport.ui.internal.MenuBuilder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class bs3 extends fs3 {
    public final int h;
    public final int i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f4531k;
    public List<h55> n;
    public List<h55> o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f4532r;
    public boolean s;
    public byte t;
    public byte u;
    public boolean w;
    public long x;
    public static final int[] y = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, MenuBuilder.CATEGORY_MASK, WorkInfo.STOP_REASON_NOT_STOPPED, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, SportReportBaseParser.ReportType.maxFreq, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, ErrorCode.ERROR_SP_NOTICE_NOT_READY, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, SportReportBaseParser.ReportType.descentCount, SportReportBaseParser.ReportType.minWaterTemperature, 8482, 162, 163, ErrorCodes.PARTNER_CHANNEL_INVALID, SportReportBaseParser.ReportType.avgFreq, 32, ErrorCode.ERROR_SP_NOTICE_INCOMPATIBLE, 226, 234, 238, 244, VibrateModeSetViewModel.DEFAULT_BBJI};
    public static final int[] D = {SportReportBaseParser.ReportType.divingOTU, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, SportReportBaseParser.ReportType.divingCNS, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, SportReportBaseParser.ReportType.avgAscentRate};
    public static final int[] E = {SportReportBaseParser.ReportType.oxygenPartialPressureThreshold, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, SportReportBaseParser.ReportType.oxygenConcentration, 228, 214, 246, SportReportBaseParser.ReportType.targetValueNumber, 165, 164, 9474, SportReportBaseParser.ReportType.noFlyDuration, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final okh g = new okh();
    public final ArrayList<a> l = new ArrayList<>();
    public a m = new a(0, 4);
    public int v = 0;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<C0097a> f4533a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<SpannableString> f4534b = new ArrayList();
        public final StringBuilder c = new StringBuilder();
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;

        /* JADX INFO: renamed from: bs3$a$a, reason: collision with other inner class name */
        public static class C0097a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f4535a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f4536b;
            public int c;

            public C0097a(int i, boolean z, int i2) {
                this.f4535a = i;
                this.f4536b = z;
                this.c = i2;
            }
        }

        public a(int i, int i2) {
            j(i);
            this.h = i2;
        }

        public static void n(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
        }

        public static void o(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
        }

        public static void q(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }

        public void e(char c) {
            if (this.c.length() < 32) {
                this.c.append(c);
            }
        }

        public void f() {
            int length = this.c.length();
            if (length > 0) {
                this.c.delete(length - 1, length);
                for (int size = this.f4533a.size() - 1; size >= 0; size--) {
                    C0097a c0097a = this.f4533a.get(size);
                    int i = c0097a.c;
                    if (i != length) {
                        return;
                    }
                    c0097a.c = i - 1;
                }
            }
        }

        public h55 g(int i) {
            float f;
            int i2 = this.e + this.f;
            int i3 = 32 - i2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.f4534b.size(); i4++) {
                spannableStringBuilder.append(wlq.V0(this.f4534b.get(i4), i3));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(wlq.V0(h(), i3));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i3 - spannableStringBuilder.length();
            int i5 = i2 - length;
            if (i == Integer.MIN_VALUE) {
                i = (this.g != 2 || (Math.abs(i5) >= 3 && length >= 0)) ? (this.g != 2 || i5 <= 0) ? 0 : 2 : 1;
            }
            if (i != 1) {
                if (i == 2) {
                    i2 = 32 - length;
                }
                f = ((i2 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i6 = this.d;
            if (i6 > 7) {
                i6 -= 17;
            } else if (this.g == 1) {
                i6 -= this.h - 1;
            }
            return new h55.b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i6, 1).k(f).l(i).a();
        }

        public final SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
            int length = spannableStringBuilder.length();
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            int i6 = 0;
            boolean z = false;
            while (i5 < this.f4533a.size()) {
                C0097a c0097a = this.f4533a.get(i5);
                boolean z2 = c0097a.f4536b;
                int i7 = c0097a.f4535a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i4 = bs3.A[i7];
                    }
                    z = z3;
                }
                int i8 = c0097a.c;
                i5++;
                if (i8 != (i5 < this.f4533a.size() ? this.f4533a.get(i5).c : length)) {
                    if (i != -1 && !z2) {
                        q(spannableStringBuilder, i, i8);
                        i = -1;
                    } else if (i == -1 && z2) {
                        i = i8;
                    }
                    if (i2 != -1 && !z) {
                        o(spannableStringBuilder, i2, i8);
                        i2 = -1;
                    } else if (i2 == -1 && z) {
                        i2 = i8;
                    }
                    if (i4 != i3) {
                        n(spannableStringBuilder, i6, i8, i3);
                        i3 = i4;
                        i6 = i8;
                    }
                }
            }
            if (i != -1 && i != length) {
                q(spannableStringBuilder, i, length);
            }
            if (i2 != -1 && i2 != length) {
                o(spannableStringBuilder, i2, length);
            }
            if (i6 != length) {
                n(spannableStringBuilder, i6, length, i3);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public boolean i() {
            return this.f4533a.isEmpty() && this.f4534b.isEmpty() && this.c.length() == 0;
        }

        public void j(int i) {
            this.g = i;
            this.f4533a.clear();
            this.f4534b.clear();
            this.c.setLength(0);
            this.d = 15;
            this.e = 0;
            this.f = 0;
        }

        public void k() {
            this.f4534b.add(h());
            this.c.setLength(0);
            this.f4533a.clear();
            int iMin = Math.min(this.h, this.d);
            while (this.f4534b.size() >= iMin) {
                this.f4534b.remove(0);
            }
        }

        public void l(int i) {
            this.g = i;
        }

        public void m(int i) {
            this.h = i;
        }

        public void p(int i, boolean z) {
            this.f4533a.add(new C0097a(i, z, this.c.length()));
        }
    }

    public bs3(String str, int i, long j) {
        this.f4531k = j > 0 ? j * 1000 : -9223372036854775807L;
        this.h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.j = 0;
            this.i = 0;
        } else if (i == 2) {
            this.j = 1;
            this.i = 0;
        } else if (i == 3) {
            this.j = 0;
            this.i = 1;
        } else if (i != 4) {
            toe.h("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.j = 0;
            this.i = 0;
        } else {
            this.j = 1;
            this.i = 1;
        }
        M(0);
        L();
        this.w = true;
        this.x = -9223372036854775807L;
    }

    public static boolean A(byte b2, byte b3) {
        return (b2 & 246) == 18 && (b3 & 224) == 32;
    }

    public static boolean B(byte b2, byte b3) {
        return (b2 & 247) == 17 && (b3 & 240) == 32;
    }

    public static boolean C(byte b2, byte b3) {
        return (b2 & 246) == 20 && (b3 & 240) == 32;
    }

    public static boolean D(byte b2, byte b3) {
        return (b2 & 240) == 16 && (b3 & 192) == 64;
    }

    public static boolean E(byte b2) {
        return (b2 & 240) == 16;
    }

    public static boolean G(byte b2) {
        return (b2 & 247) == 20;
    }

    public static boolean H(byte b2, byte b3) {
        return (b2 & 247) == 17 && (b3 & 240) == 48;
    }

    public static boolean I(byte b2, byte b3) {
        return (b2 & 247) == 23 && b3 >= 33 && b3 <= 35;
    }

    public static boolean J(byte b2) {
        return 1 <= b2 && b2 <= 15;
    }

    public static char p(byte b2) {
        return (char) B[(b2 & 127) - 32];
    }

    public static int q(byte b2) {
        return (b2 >> 3) & 1;
    }

    public static char s(byte b2) {
        return (char) D[b2 & 31];
    }

    public static char t(byte b2) {
        return (char) E[b2 & 31];
    }

    public static char u(byte b2, byte b3) {
        return (b2 & 1) == 0 ? s(b3) : t(b3);
    }

    public static char v(byte b2) {
        return (char) C[b2 & 15];
    }

    public static boolean z(byte b2) {
        return (b2 & 224) == 0;
    }

    public final boolean F(boolean z2, byte b2, byte b3) {
        if (!z2 || !E(b2)) {
            this.s = false;
        } else {
            if (this.s && this.t == b2 && this.u == b3) {
                this.s = false;
                return true;
            }
            this.s = true;
            this.t = b2;
            this.u = b3;
        }
        return false;
    }

    public final void K(byte b2, byte b3) {
        if (J(b2)) {
            this.w = false;
            return;
        }
        if (G(b2)) {
            if (b3 != 32 && b3 != 47) {
                switch (b3) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b3) {
                            case 42:
                            case 43:
                                this.w = false;
                                break;
                        }
                }
            }
            this.w = true;
        }
    }

    public final void L() {
        this.m.j(this.p);
        this.l.clear();
        this.l.add(this.m);
    }

    public final void M(int i) {
        int i2 = this.p;
        if (i2 == i) {
            return;
        }
        this.p = i;
        if (i == 3) {
            for (int i3 = 0; i3 < this.l.size(); i3++) {
                this.l.get(i3).l(i);
            }
            return;
        }
        L();
        if (i2 == 3 || i == 1 || i == 0) {
            this.n = Collections.emptyList();
        }
    }

    public final void N(int i) {
        this.q = i;
        this.m.m(i);
    }

    public final boolean O() {
        return (this.f4531k == -9223372036854775807L || this.x == -9223372036854775807L || j() - this.x < this.f4531k) ? false : true;
    }

    public final boolean P(byte b2) {
        if (z(b2)) {
            this.v = q(b2);
        }
        return this.v == this.j;
    }

    @Override // defpackage.fs3, defpackage.too
    public /* bridge */ /* synthetic */ void b(long j) {
        super.b(j);
    }

    @Override // defpackage.fs3
    public soo e() {
        List<h55> list = this.n;
        this.o = list;
        return new gs3((List) rk1.e(list));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    @Override // defpackage.fs3
    public void f(voo vooVar) {
        boolean z2;
        ByteBuffer byteBuffer = (ByteBuffer) rk1.e(vooVar.c);
        this.g.N(byteBuffer.array(), byteBuffer.limit());
        boolean z3 = false;
        while (true) {
            int iA = this.g.a();
            int i = this.h;
            if (iA < i) {
                break;
            }
            byte bD = i == 2 ? (byte) -4 : (byte) this.g.D();
            int iD = this.g.D();
            int iD2 = this.g.D();
            if ((bD & 2) == 0 && (bD & 1) == this.i) {
                byte b2 = (byte) (iD & 127);
                byte b3 = (byte) (iD2 & 127);
                if (b2 != 0 || b3 != 0) {
                    boolean z4 = this.f4532r;
                    if ((bD & 4) == 4) {
                        boolean[] zArr = F;
                        if (zArr[iD] && zArr[iD2]) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    this.f4532r = z2;
                    if (!F(z2, b2, b3)) {
                        if (this.f4532r) {
                            K(b2, b3);
                            if (this.w && P(b2)) {
                                if (!z(b2)) {
                                    this.m.e(p(b2));
                                    if ((b3 & 224) != 0) {
                                        this.m.e(p(b3));
                                    }
                                } else if (H(b2, b3)) {
                                    this.m.e(v(b3));
                                } else if (A(b2, b3)) {
                                    this.m.f();
                                    this.m.e(u(b2, b3));
                                } else if (B(b2, b3)) {
                                    w(b3);
                                } else if (D(b2, b3)) {
                                    y(b2, b3);
                                } else if (I(b2, b3)) {
                                    this.m.f = b3 - 32;
                                } else if (C(b2, b3)) {
                                    x(b3);
                                }
                                z3 = true;
                            }
                        } else if (z4) {
                            L();
                            z3 = true;
                        }
                    }
                }
            }
        }
        if (z3) {
            int i2 = this.p;
            if (i2 == 1 || i2 == 3) {
                this.n = r();
                this.x = j();
            }
        }
    }

    @Override // defpackage.fs3, defpackage.rs5
    public void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        M(0);
        N(4);
        L();
        this.f4532r = false;
        this.s = false;
        this.t = (byte) 0;
        this.u = (byte) 0;
        this.v = 0;
        this.w = true;
        this.x = -9223372036854775807L;
    }

    @Override // defpackage.fs3
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ voo a() throws SubtitleDecoderException {
        return super.a();
    }

    @Override // defpackage.fs3, defpackage.rs5
    /* JADX INFO: renamed from: h */
    public woo c() throws SubtitleDecoderException {
        woo wooVarI;
        woo wooVarC = super.c();
        if (wooVarC != null) {
            return wooVarC;
        }
        if (!O() || (wooVarI = i()) == null) {
            return null;
        }
        this.n = Collections.emptyList();
        this.x = -9223372036854775807L;
        wooVarI.s(j(), e(), Long.MAX_VALUE);
        return wooVarI;
    }

    @Override // defpackage.fs3
    public boolean k() {
        return this.n != this.o;
    }

    @Override // defpackage.fs3
    /* JADX INFO: renamed from: l */
    public /* bridge */ /* synthetic */ void d(voo vooVar) throws SubtitleDecoderException {
        super.d(vooVar);
    }

    public final List<h55> r() {
        int size = this.l.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            h55 h55VarG = this.l.get(i).g(Integer.MIN_VALUE);
            arrayList.add(h55VarG);
            if (h55VarG != null) {
                iMin = Math.min(iMin, h55VarG.i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            h55 h55Var = (h55) arrayList.get(i2);
            if (h55Var != null) {
                if (h55Var.i != iMin) {
                    h55Var = (h55) rk1.e(this.l.get(i2).g(iMin));
                }
                arrayList2.add(h55Var);
            }
        }
        return arrayList2;
    }

    @Override // defpackage.fs3, defpackage.rs5
    public void release() {
    }

    public final void w(byte b2) {
        this.m.e(' ');
        this.m.p((b2 >> 1) & 7, (b2 & 1) == 1);
    }

    public final void x(byte b2) {
        if (b2 == 32) {
            M(2);
            return;
        }
        if (b2 == 41) {
            M(3);
            return;
        }
        switch (b2) {
            case 37:
                M(1);
                N(2);
                break;
            case 38:
                M(1);
                N(3);
                break;
            case 39:
                M(1);
                N(4);
                break;
            default:
                int i = this.p;
                if (i != 0) {
                    if (b2 != 33) {
                        switch (b2) {
                            case 44:
                                this.n = Collections.emptyList();
                                int i2 = this.p;
                                if (i2 == 1 || i2 == 3) {
                                    L();
                                }
                                break;
                            case 45:
                                if (i == 1 && !this.m.i()) {
                                    this.m.k();
                                    break;
                                }
                                break;
                            case 46:
                                L();
                                break;
                            case 47:
                                this.n = r();
                                L();
                                break;
                        }
                    } else {
                        this.m.f();
                        break;
                    }
                }
                break;
        }
    }

    public final void y(byte b2, byte b3) {
        int i = y[b2 & 7];
        if ((b3 & 32) != 0) {
            i++;
        }
        if (i != this.m.d) {
            if (this.p != 1 && !this.m.i()) {
                a aVar = new a(this.p, this.q);
                this.m = aVar;
                this.l.add(aVar);
            }
            this.m.d = i;
        }
        boolean z2 = (b3 & 16) == 16;
        boolean z3 = (b3 & 1) == 1;
        int i2 = (b3 >> 1) & 7;
        this.m.p(z2 ? 8 : i2, z3);
        if (z2) {
            this.m.e = z[i2];
        }
    }
}
