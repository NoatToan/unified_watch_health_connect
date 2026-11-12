package defpackage;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.work.WorkInfo;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
public final class ds3 extends fs3 {
    public final okh g = new okh();
    public final nkh h = new nkh();
    public int i = -1;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f15863k;
    public final b[] l;
    public b m;
    public List<h55> n;
    public List<h55> o;
    public c p;
    public int q;

    public static final class a {
        public static final Comparator<a> c = new Comparator() { // from class: cs3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ds3.a.c((ds3.a) obj, (ds3.a) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h55 f15864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f15865b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
            h55.b bVarN = new h55.b().o(charSequence).p(alignment).h(f, i).i(i2).k(f2).l(i3).n(f3);
            if (z) {
                bVarN.s(i4);
            }
            this.f15864a = bVarN.a();
            this.f15865b = i5;
        }

        public static /* synthetic */ int c(a aVar, a aVar2) {
            return Integer.compare(aVar2.f15865b, aVar.f15865b);
        }
    }

    public static final class b {
        public static final int[] A;
        public static final int[] B;
        public static final boolean[] C;
        public static final int[] D;
        public static final int[] E;
        public static final int[] F;
        public static final int[] G;
        public static final int w = h(2, 2, 2, 0);
        public static final int x;
        public static final int y;
        public static final int[] z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<SpannableString> f15866a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SpannableStringBuilder f15867b = new SpannableStringBuilder();
        public boolean c;
        public boolean d;
        public int e;
        public boolean f;
        public int g;
        public int h;
        public int i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f15868k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f15869r;
        public int s;
        public int t;
        public int u;
        public int v;

        static {
            int iH = h(0, 0, 0, 0);
            x = iH;
            int iH2 = h(0, 0, 0, 3);
            y = iH2;
            z = new int[]{0, 0, 0, 0, 0, 2, 0};
            A = new int[]{0, 0, 0, 0, 0, 0, 2};
            B = new int[]{3, 3, 3, 3, 3, 3, 1};
            C = new boolean[]{false, false, false, true, true, true, false};
            D = new int[]{iH, iH2, iH, iH, iH2, iH, iH};
            E = new int[]{0, 1, 2, 3, 4, 3, 4};
            F = new int[]{0, 0, 0, 0, 0, 3, 3};
            G = new int[]{iH, iH, iH, iH, iH, iH2, iH2};
        }

        public b() {
            l();
        }

        public static int g(int i, int i2, int i3) {
            return h(i, i2, i3, 0);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001b  */
        public static int h(int i, int i2, int i3, int i4) {
            int i5;
            rk1.c(i, 0, 4);
            rk1.c(i2, 0, 4);
            rk1.c(i3, 0, 4);
            rk1.c(i4, 0, 4);
            if (i4 == 0 || i4 == 1) {
                i5 = 255;
            } else if (i4 == 2) {
                i5 = 127;
            } else if (i4 != 3) {
                i5 = 255;
            } else {
                i5 = 0;
            }
            return Color.argb(i5, i > 1 ? 255 : 0, i2 > 1 ? 255 : 0, i3 > 1 ? 255 : 0);
        }

        public void a(char c) {
            if (c != '\n') {
                this.f15867b.append(c);
                return;
            }
            this.f15866a.add(d());
            this.f15867b.clear();
            if (this.p != -1) {
                this.p = 0;
            }
            if (this.q != -1) {
                this.q = 0;
            }
            if (this.f15869r != -1) {
                this.f15869r = 0;
            }
            if (this.t != -1) {
                this.t = 0;
            }
            while (true) {
                if ((!this.f15868k || this.f15866a.size() < this.j) && this.f15866a.size() < 15) {
                    return;
                } else {
                    this.f15866a.remove(0);
                }
            }
        }

        public void b() {
            int length = this.f15867b.length();
            if (length > 0) {
                this.f15867b.delete(length - 1, length);
            }
        }

        public a c() {
            Layout.Alignment alignment;
            float f;
            float f2;
            if (j()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i = 0; i < this.f15866a.size(); i++) {
                spannableStringBuilder.append((CharSequence) this.f15866a.get(i));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) d());
            int i2 = this.l;
            if (i2 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i2 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    int i3 = this.l;
                    StringBuilder sb = new StringBuilder(43);
                    sb.append("Unexpected justification value: ");
                    sb.append(i3);
                    throw new IllegalArgumentException(sb.toString());
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            if (this.f) {
                f = this.h / 99.0f;
                f2 = this.g / 99.0f;
            } else {
                f = this.h / 209.0f;
                f2 = this.g / 74.0f;
            }
            float f3 = (f * 0.9f) + 0.05f;
            float f4 = (f2 * 0.9f) + 0.05f;
            int i4 = this.i;
            return new a(spannableStringBuilder, alignment2, f4, 0, i4 / 3 == 0 ? 0 : i4 / 3 == 1 ? 1 : 2, f3, i4 % 3 == 0 ? 0 : i4 % 3 == 1 ? 1 : 2, -3.4028235E38f, this.o != x, this.o, this.e);
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f15867b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.p, length, 33);
                }
                if (this.q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.q, length, 33);
                }
                if (this.f15869r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.s), this.f15869r, length, 33);
                }
                if (this.t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.u), this.t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f15866a.clear();
            this.f15867b.clear();
            this.p = -1;
            this.q = -1;
            this.f15869r = -1;
            this.t = -1;
            this.v = 0;
        }

        public void f(boolean z2, boolean z3, boolean z4, int i, boolean z5, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.c = true;
            this.d = z2;
            this.f15868k = z3;
            this.e = i;
            this.f = z5;
            this.g = i2;
            this.h = i3;
            this.i = i6;
            int i9 = i4 + 1;
            if (this.j != i9) {
                this.j = i9;
                while (true) {
                    if ((!z3 || this.f15866a.size() < this.j) && this.f15866a.size() < 15) {
                        break;
                    } else {
                        this.f15866a.remove(0);
                    }
                }
            }
            if (i7 != 0 && this.m != i7) {
                this.m = i7;
                int i10 = i7 - 1;
                q(D[i10], y, C[i10], 0, A[i10], B[i10], z[i10]);
            }
            if (i8 == 0 || this.n == i8) {
                return;
            }
            this.n = i8;
            int i11 = i8 - 1;
            m(0, 1, 1, false, false, F[i11], E[i11]);
            n(w, G[i11], x);
        }

        public boolean i() {
            return this.c;
        }

        public boolean j() {
            return !i() || (this.f15866a.isEmpty() && this.f15867b.length() == 0);
        }

        public boolean k() {
            return this.d;
        }

        public void l() {
            e();
            this.c = false;
            this.d = false;
            this.e = 4;
            this.f = false;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = 15;
            this.f15868k = true;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            int i = x;
            this.o = i;
            this.s = w;
            this.u = i;
        }

        public void m(int i, int i2, int i3, boolean z2, boolean z3, int i4, int i5) {
            if (this.p != -1) {
                if (!z2) {
                    this.f15867b.setSpan(new StyleSpan(2), this.p, this.f15867b.length(), 33);
                    this.p = -1;
                }
            } else if (z2) {
                this.p = this.f15867b.length();
            }
            if (this.q == -1) {
                if (z3) {
                    this.q = this.f15867b.length();
                }
            } else {
                if (z3) {
                    return;
                }
                this.f15867b.setSpan(new UnderlineSpan(), this.q, this.f15867b.length(), 33);
                this.q = -1;
            }
        }

        public void n(int i, int i2, int i3) {
            if (this.f15869r != -1 && this.s != i) {
                this.f15867b.setSpan(new ForegroundColorSpan(this.s), this.f15869r, this.f15867b.length(), 33);
            }
            if (i != w) {
                this.f15869r = this.f15867b.length();
                this.s = i;
            }
            if (this.t != -1 && this.u != i2) {
                this.f15867b.setSpan(new BackgroundColorSpan(this.u), this.t, this.f15867b.length(), 33);
            }
            if (i2 != x) {
                this.t = this.f15867b.length();
                this.u = i2;
            }
        }

        public void o(int i, int i2) {
            if (this.v != i) {
                a('\n');
            }
            this.v = i;
        }

        public void p(boolean z2) {
            this.d = z2;
        }

        public void q(int i, int i2, boolean z2, int i3, int i4, int i5, int i6) {
            this.o = i;
            this.l = i6;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f15870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f15871b;
        public final byte[] c;
        public int d = 0;

        public c(int i, int i2) {
            this.f15870a = i;
            this.f15871b = i2;
            this.c = new byte[(i2 * 2) - 1];
        }
    }

    public ds3(int i, List<byte[]> list) {
        this.f15863k = i == -1 ? 1 : i;
        this.j = list != null && m34.h(list);
        this.l = new b[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.l[i2] = new b();
        }
        this.m = this.l[0];
    }

    private void E() {
        for (int i = 0; i < 8; i++) {
            this.l[i].l();
        }
    }

    private List<h55> p() {
        a aVarC;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.l[i].j() && this.l[i].k() && (aVarC = this.l[i].c()) != null) {
                arrayList.add(aVarC);
            }
        }
        Collections.sort(arrayList, a.c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((a) arrayList.get(i2)).f15864a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final void A() {
        int iH = b.h(this.h.h(2), this.h.h(2), this.h.h(2), this.h.h(2));
        int iH2 = b.h(this.h.h(2), this.h.h(2), this.h.h(2), this.h.h(2));
        this.h.r(2);
        this.m.n(iH, iH2, b.g(this.h.h(2), this.h.h(2), this.h.h(2)));
    }

    public final void B() {
        this.h.r(4);
        int iH = this.h.h(4);
        this.h.r(2);
        this.m.o(iH, this.h.h(6));
    }

    public final void C() {
        int iH = b.h(this.h.h(2), this.h.h(2), this.h.h(2), this.h.h(2));
        int iH2 = this.h.h(2);
        int iG = b.g(this.h.h(2), this.h.h(2), this.h.h(2));
        if (this.h.g()) {
            iH2 |= 4;
        }
        boolean zG = this.h.g();
        int iH3 = this.h.h(2);
        int iH4 = this.h.h(2);
        int iH5 = this.h.h(2);
        this.h.r(8);
        this.m.q(iH, iG, zG, iH2, iH3, iH4, iH5);
    }

    public final void D() {
        c cVar = this.p;
        int i = cVar.d;
        int i2 = cVar.f15871b;
        if (i != (i2 * 2) - 1) {
            int i3 = cVar.f15870a;
            StringBuilder sb = new StringBuilder(115);
            sb.append("DtvCcPacket ended prematurely; size is ");
            sb.append((i2 * 2) - 1);
            sb.append(", but current index is ");
            sb.append(i);
            sb.append(" (sequence number ");
            sb.append(i3);
            sb.append(");");
            toe.b("Cea708Decoder", sb.toString());
        }
        nkh nkhVar = this.h;
        c cVar2 = this.p;
        nkhVar.o(cVar2.c, cVar2.d);
        int iH = this.h.h(3);
        int iH2 = this.h.h(5);
        if (iH == 7) {
            this.h.r(2);
            iH = this.h.h(6);
            if (iH < 7) {
                StringBuilder sb2 = new StringBuilder(44);
                sb2.append("Invalid extended service number: ");
                sb2.append(iH);
                toe.h("Cea708Decoder", sb2.toString());
            }
        }
        if (iH2 == 0) {
            if (iH != 0) {
                StringBuilder sb3 = new StringBuilder(59);
                sb3.append("serviceNumber is non-zero (");
                sb3.append(iH);
                sb3.append(") when blockSize is 0");
                toe.h("Cea708Decoder", sb3.toString());
                return;
            }
            return;
        }
        if (iH != this.f15863k) {
            return;
        }
        boolean z = false;
        while (this.h.b() > 0) {
            int iH3 = this.h.h(8);
            if (iH3 == 16) {
                int iH4 = this.h.h(8);
                if (iH4 <= 31) {
                    s(iH4);
                } else {
                    if (iH4 <= 127) {
                        x(iH4);
                    } else if (iH4 <= 159) {
                        t(iH4);
                    } else if (iH4 <= 255) {
                        y(iH4);
                    } else {
                        StringBuilder sb4 = new StringBuilder(37);
                        sb4.append("Invalid extended command: ");
                        sb4.append(iH4);
                        toe.h("Cea708Decoder", sb4.toString());
                    }
                    z = true;
                }
            } else if (iH3 <= 31) {
                q(iH3);
            } else {
                if (iH3 <= 127) {
                    v(iH3);
                } else if (iH3 <= 159) {
                    r(iH3);
                } else if (iH3 <= 255) {
                    w(iH3);
                } else {
                    StringBuilder sb5 = new StringBuilder(33);
                    sb5.append("Invalid base command: ");
                    sb5.append(iH3);
                    toe.h("Cea708Decoder", sb5.toString());
                }
                z = true;
            }
        }
        if (z) {
            this.n = p();
        }
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

    @Override // defpackage.fs3
    public void f(voo vooVar) {
        ByteBuffer byteBuffer = (ByteBuffer) rk1.e(vooVar.c);
        this.g.N(byteBuffer.array(), byteBuffer.limit());
        while (this.g.a() >= 3) {
            int iD = this.g.D();
            int i = iD & 3;
            boolean z = (iD & 4) == 4;
            byte bD = (byte) this.g.D();
            byte bD2 = (byte) this.g.D();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        o();
                        int i2 = (bD & 192) >> 6;
                        int i3 = this.i;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            E();
                            int i4 = this.i;
                            StringBuilder sb = new StringBuilder(71);
                            sb.append("Sequence number discontinuity. previous=");
                            sb.append(i4);
                            sb.append(" current=");
                            sb.append(i2);
                            toe.h("Cea708Decoder", sb.toString());
                        }
                        this.i = i2;
                        int i5 = bD & 63;
                        if (i5 == 0) {
                            i5 = 64;
                        }
                        c cVar = new c(i2, i5);
                        this.p = cVar;
                        byte[] bArr = cVar.c;
                        int i6 = cVar.d;
                        cVar.d = i6 + 1;
                        bArr[i6] = bD2;
                    } else {
                        rk1.a(i == 2);
                        c cVar2 = this.p;
                        if (cVar2 == null) {
                            toe.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.c;
                            int i7 = cVar2.d;
                            bArr2[i7] = bD;
                            cVar2.d = i7 + 2;
                            bArr2[i7 + 1] = bD2;
                        }
                    }
                    c cVar3 = this.p;
                    if (cVar3.d == (cVar3.f15871b * 2) - 1) {
                        o();
                    }
                }
            }
        }
    }

    @Override // defpackage.fs3, defpackage.rs5
    public void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        E();
        this.p = null;
    }

    @Override // defpackage.fs3
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ voo a() throws SubtitleDecoderException {
        return super.a();
    }

    @Override // defpackage.fs3
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ woo c() throws SubtitleDecoderException {
        return super.c();
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

    public final void o() {
        if (this.p == null) {
            return;
        }
        D();
        this.p = null;
    }

    public final void q(int i) {
        if (i != 0) {
            if (i == 3) {
                this.n = p();
            }
            if (i == 8) {
                this.m.b();
                return;
            }
            switch (i) {
                case 12:
                    E();
                    break;
                case 13:
                    this.m.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i >= 17 && i <= 23) {
                        StringBuilder sb = new StringBuilder(55);
                        sb.append("Currently unsupported COMMAND_EXT1 Command: ");
                        sb.append(i);
                        toe.h("Cea708Decoder", sb.toString());
                        this.h.r(8);
                    } else if (i >= 24 && i <= 31) {
                        StringBuilder sb2 = new StringBuilder(54);
                        sb2.append("Currently unsupported COMMAND_P16 Command: ");
                        sb2.append(i);
                        toe.h("Cea708Decoder", sb2.toString());
                        this.h.r(16);
                    } else {
                        StringBuilder sb3 = new StringBuilder(31);
                        sb3.append("Invalid C0 command: ");
                        sb3.append(i);
                        toe.h("Cea708Decoder", sb3.toString());
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void r(int i) {
        int i2 = 1;
        switch (i) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i3 = i + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                if (this.q != i3) {
                    this.q = i3;
                    this.m = this.l[i3];
                }
                break;
            case 136:
                while (i2 <= 8) {
                    if (this.h.g()) {
                        this.l[8 - i2].e();
                    }
                    i2++;
                }
                break;
            case 137:
                for (int i4 = 1; i4 <= 8; i4++) {
                    if (this.h.g()) {
                        this.l[8 - i4].p(true);
                    }
                }
                break;
            case 138:
                while (i2 <= 8) {
                    if (this.h.g()) {
                        this.l[8 - i2].p(false);
                    }
                    i2++;
                }
                break;
            case 139:
                for (int i5 = 1; i5 <= 8; i5++) {
                    if (this.h.g()) {
                        b bVar = this.l[8 - i5];
                        bVar.p(!bVar.k());
                    }
                }
                break;
            case 140:
                while (i2 <= 8) {
                    if (this.h.g()) {
                        this.l[8 - i2].l();
                    }
                    i2++;
                }
                break;
            case 141:
                this.h.r(8);
                break;
            case 142:
                break;
            case 143:
                E();
                break;
            case 144:
                if (this.m.i()) {
                    z();
                } else {
                    this.h.r(16);
                }
                break;
            case 145:
                if (this.m.i()) {
                    A();
                } else {
                    this.h.r(24);
                }
                break;
            case 146:
                if (this.m.i()) {
                    B();
                } else {
                    this.h.r(16);
                }
                break;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                StringBuilder sb = new StringBuilder(31);
                sb.append("Invalid C1 command: ");
                sb.append(i);
                toe.h("Cea708Decoder", sb.toString());
                break;
            case 151:
                if (this.m.i()) {
                    C();
                } else {
                    this.h.r(32);
                }
                break;
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i6 = i - 152;
                u(i6);
                if (this.q != i6) {
                    this.q = i6;
                    this.m = this.l[i6];
                }
                break;
        }
    }

    @Override // defpackage.fs3, defpackage.rs5
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    public final void s(int i) {
        if (i <= 7) {
            return;
        }
        if (i <= 15) {
            this.h.r(8);
        } else if (i <= 23) {
            this.h.r(16);
        } else if (i <= 31) {
            this.h.r(24);
        }
    }

    public final void t(int i) {
        if (i <= 135) {
            this.h.r(32);
            return;
        }
        if (i <= 143) {
            this.h.r(40);
        } else if (i <= 159) {
            this.h.r(2);
            this.h.r(this.h.h(6) * 8);
        }
    }

    public final void u(int i) {
        b bVar = this.l[i];
        this.h.r(2);
        boolean zG = this.h.g();
        boolean zG2 = this.h.g();
        boolean zG3 = this.h.g();
        int iH = this.h.h(3);
        boolean zG4 = this.h.g();
        int iH2 = this.h.h(7);
        int iH3 = this.h.h(8);
        int iH4 = this.h.h(4);
        int iH5 = this.h.h(4);
        this.h.r(2);
        int iH6 = this.h.h(6);
        this.h.r(2);
        bVar.f(zG, zG2, zG3, iH, zG4, iH2, iH3, iH5, iH6, iH4, this.h.h(3), this.h.h(3));
    }

    public final void v(int i) {
        if (i == 127) {
            this.m.a((char) 9835);
        } else {
            this.m.a((char) (i & 255));
        }
    }

    public final void w(int i) {
        this.m.a((char) (i & 255));
    }

    public final void x(int i) {
        if (i == 32) {
            this.m.a(' ');
        }
        if (i == 33) {
            this.m.a(Typography.nbsp);
            return;
        }
        if (i == 37) {
            this.m.a(Typography.ellipsis);
            return;
        }
        if (i == 42) {
            this.m.a((char) 352);
            return;
        }
        if (i == 44) {
            this.m.a((char) 338);
            return;
        }
        if (i == 63) {
            this.m.a((char) 376);
            return;
        }
        if (i == 57) {
            this.m.a(Typography.tm);
            return;
        }
        if (i == 58) {
            this.m.a((char) 353);
            return;
        }
        if (i == 60) {
            this.m.a((char) 339);
            return;
        }
        if (i == 61) {
            this.m.a((char) 8480);
            return;
        }
        switch (i) {
            case 48:
                this.m.a((char) 9608);
                break;
            case 49:
                this.m.a(Typography.leftSingleQuote);
                break;
            case 50:
                this.m.a(Typography.rightSingleQuote);
                break;
            case 51:
                this.m.a(Typography.leftDoubleQuote);
                break;
            case 52:
                this.m.a(Typography.rightDoubleQuote);
                break;
            case 53:
                this.m.a(Typography.bullet);
                break;
            default:
                switch (i) {
                    case 118:
                        this.m.a((char) 8539);
                        break;
                    case 119:
                        this.m.a((char) 8540);
                        break;
                    case 120:
                        this.m.a((char) 8541);
                        break;
                    case 121:
                        this.m.a((char) 8542);
                        break;
                    case 122:
                        this.m.a((char) 9474);
                        break;
                    case 123:
                        this.m.a((char) 9488);
                        break;
                    case 124:
                        this.m.a((char) 9492);
                        break;
                    case 125:
                        this.m.a((char) 9472);
                        break;
                    case 126:
                        this.m.a((char) 9496);
                        break;
                    case 127:
                        this.m.a((char) 9484);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder(33);
                        sb.append("Invalid G2 character: ");
                        sb.append(i);
                        toe.h("Cea708Decoder", sb.toString());
                        break;
                }
                break;
        }
    }

    public final void y(int i) {
        if (i == 160) {
            this.m.a((char) 13252);
            return;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Invalid G3 character: ");
        sb.append(i);
        toe.h("Cea708Decoder", sb.toString());
        this.m.a('_');
    }

    public final void z() {
        this.m.m(this.h.h(4), this.h.h(2), this.h.h(2), this.h.g(), this.h.g(), this.h.h(3), this.h.h(3));
    }
}
