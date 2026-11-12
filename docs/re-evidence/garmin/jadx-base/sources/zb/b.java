package zb;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import fa.k;
import fa.q;
import fa.r;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tl2.g;

/* JADX INFO: loaded from: classes.dex */
public final class b extends zb.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f203361h = new r();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q f203362i = new q();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f203363j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f203364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C3797b[] f203365l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C3797b f203366m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<ea.a> f203367n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<ea.a> f203368o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c f203369p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f203370q;

    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f203371c = new g(15);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ea.a f203372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f203373b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f14, int i14, int i15, float f15, int i16, float f16, boolean z14, int i17, int i18) {
            ea.a.b bVar = new ea.a.b();
            bVar.f63568a = charSequence;
            bVar.f63570c = alignment;
            bVar.f63572e = f14;
            bVar.f63573f = i14;
            bVar.f63574g = i15;
            bVar.f63575h = f15;
            bVar.f63576i = i16;
            bVar.f63579l = f16;
            if (z14) {
                bVar.f63582o = i17;
                bVar.f63581n = true;
            }
            this.f203372a = bVar.a();
            this.f203373b = i18;
        }
    }

    /* JADX INFO: renamed from: zb.b$b, reason: collision with other inner class name */
    public static final class C3797b {
        public static final boolean[] A;
        public static final int[] B;
        public static final int[] C;
        public static final int[] D;
        public static final int[] E;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f203374v = c(2, 2, 2, 0);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f203375w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int[] f203376x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int[] f203377y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int[] f203378z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f203379a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SpannableStringBuilder f203380b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f203381c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f203382d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f203383e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f203384f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f203385g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f203386h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f203387i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f203388j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f203389k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f203390l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f203391m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f203392n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f203393o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f203394p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f203395q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f203396r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f203397s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f203398t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f203399u;

        static {
            int iC = c(0, 0, 0, 0);
            f203375w = iC;
            int iC2 = c(0, 0, 0, 3);
            f203376x = new int[]{0, 0, 0, 0, 0, 2, 0};
            f203377y = new int[]{0, 0, 0, 0, 0, 0, 2};
            f203378z = new int[]{3, 3, 3, 3, 3, 3, 1};
            A = new boolean[]{false, false, false, true, true, true, false};
            B = new int[]{iC, iC2, iC, iC, iC2, iC, iC};
            C = new int[]{0, 1, 2, 3, 4, 3, 4};
            D = new int[]{0, 0, 0, 0, 0, 3, 3};
            E = new int[]{iC, iC, iC, iC, iC, iC2, iC2};
        }

        public C3797b() {
            d();
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001b  */
        public static int c(int i14, int i15, int i16, int i17) {
            int i18;
            fa.a.c(i14, 4);
            fa.a.c(i15, 4);
            fa.a.c(i16, 4);
            fa.a.c(i17, 4);
            if (i17 == 0 || i17 == 1) {
                i18 = 255;
            } else if (i17 == 2) {
                i18 = 127;
            } else if (i17 != 3) {
                i18 = 255;
            } else {
                i18 = 0;
            }
            return Color.argb(i18, i14 > 1 ? 255 : 0, i15 > 1 ? 255 : 0, i16 <= 1 ? 0 : 255);
        }

        public final void a(char c14) {
            SpannableStringBuilder spannableStringBuilder = this.f203380b;
            if (c14 != '\n') {
                spannableStringBuilder.append(c14);
                return;
            }
            SpannableString spannableStringB = b();
            ArrayList arrayList = this.f203379a;
            arrayList.add(spannableStringB);
            spannableStringBuilder.clear();
            if (this.f203393o != -1) {
                this.f203393o = 0;
            }
            if (this.f203394p != -1) {
                this.f203394p = 0;
            }
            if (this.f203395q != -1) {
                this.f203395q = 0;
            }
            if (this.f203397s != -1) {
                this.f203397s = 0;
            }
            while (true) {
                if (arrayList.size() < this.f203388j && arrayList.size() < 15) {
                    this.f203399u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        }

        public final SpannableString b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f203380b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f203393o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f203393o, length, 33);
                }
                if (this.f203394p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f203394p, length, 33);
                }
                if (this.f203395q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f203396r), this.f203395q, length, 33);
                }
                if (this.f203397s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f203398t), this.f203397s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final void d() {
            this.f203379a.clear();
            this.f203380b.clear();
            this.f203393o = -1;
            this.f203394p = -1;
            this.f203395q = -1;
            this.f203397s = -1;
            this.f203399u = 0;
            this.f203381c = false;
            this.f203382d = false;
            this.f203383e = 4;
            this.f203384f = false;
            this.f203385g = 0;
            this.f203386h = 0;
            this.f203387i = 0;
            this.f203388j = 15;
            this.f203389k = 0;
            this.f203390l = 0;
            this.f203391m = 0;
            int i14 = f203375w;
            this.f203392n = i14;
            this.f203396r = f203374v;
            this.f203398t = i14;
        }

        public final void e(boolean z14, boolean z15) {
            int i14 = this.f203393o;
            SpannableStringBuilder spannableStringBuilder = this.f203380b;
            if (i14 != -1) {
                if (!z14) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f203393o, spannableStringBuilder.length(), 33);
                    this.f203393o = -1;
                }
            } else if (z14) {
                this.f203393o = spannableStringBuilder.length();
            }
            if (this.f203394p == -1) {
                if (z15) {
                    this.f203394p = spannableStringBuilder.length();
                }
            } else {
                if (z15) {
                    return;
                }
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f203394p, spannableStringBuilder.length(), 33);
                this.f203394p = -1;
            }
        }

        public final void f(int i14, int i15) {
            int i16 = this.f203395q;
            SpannableStringBuilder spannableStringBuilder = this.f203380b;
            if (i16 != -1 && this.f203396r != i14) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f203396r), this.f203395q, spannableStringBuilder.length(), 33);
            }
            if (i14 != f203374v) {
                this.f203395q = spannableStringBuilder.length();
                this.f203396r = i14;
            }
            if (this.f203397s != -1 && this.f203398t != i15) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f203398t), this.f203397s, spannableStringBuilder.length(), 33);
            }
            if (i15 != f203375w) {
                this.f203397s = spannableStringBuilder.length();
                this.f203398t = i15;
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f203400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f203401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f203402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f203403d = 0;

        public c(int i14, int i15) {
            this.f203400a = i14;
            this.f203401b = i15;
            this.f203402c = new byte[(i15 * 2) - 1];
        }
    }

    public b(int i14, List<byte[]> list) {
        this.f203364k = i14 == -1 ? 1 : i14;
        if (list != null) {
            byte[] bArr = fa.d.f70005a;
            if (list.size() == 1 && list.get(0).length == 1) {
                byte b14 = list.get(0)[0];
            }
        }
        this.f203365l = new C3797b[8];
        int i15 = 0;
        while (true) {
            C3797b[] c3797bArr = this.f203365l;
            if (i15 >= 8) {
                this.f203366m = c3797bArr[0];
                return;
            } else {
                c3797bArr[i15] = new C3797b();
                i15++;
            }
        }
    }

    @Override // zb.c
    public final d d() {
        List<ea.a> list = this.f203367n;
        this.f203368o = list;
        list.getClass();
        return new d(list);
    }

    @Override // zb.c
    public final void e(zb.c.b bVar) {
        ByteBuffer byteBuffer = bVar.f8631d;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        r rVar = this.f203361h;
        rVar.E(bArrArray, iLimit);
        while (rVar.a() >= 3) {
            int iU = rVar.u();
            int i14 = iU & 3;
            boolean z14 = (iU & 4) == 4;
            byte bU = (byte) rVar.u();
            byte bU2 = (byte) rVar.u();
            if (i14 == 2 || i14 == 3) {
                if (z14) {
                    if (i14 == 3) {
                        h();
                        int i15 = (bU & 192) >> 6;
                        int i16 = this.f203363j;
                        if (i16 != -1 && i15 != (i16 + 1) % 4) {
                            j();
                            k.g("Sequence number discontinuity. previous=" + this.f203363j + " current=" + i15);
                        }
                        this.f203363j = i15;
                        int i17 = bU & 63;
                        if (i17 == 0) {
                            i17 = 64;
                        }
                        c cVar = new c(i15, i17);
                        this.f203369p = cVar;
                        int i18 = cVar.f203403d;
                        cVar.f203403d = i18 + 1;
                        cVar.f203402c[i18] = bU2;
                    } else {
                        fa.a.a(i14 == 2);
                        c cVar2 = this.f203369p;
                        if (cVar2 == null) {
                            k.c("Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = cVar2.f203402c;
                            int i19 = cVar2.f203403d;
                            int i24 = i19 + 1;
                            cVar2.f203403d = i24;
                            bArr[i19] = bU;
                            cVar2.f203403d = i19 + 2;
                            bArr[i24] = bU2;
                        }
                    }
                    c cVar3 = this.f203369p;
                    if (cVar3.f203403d == (cVar3.f203401b * 2) - 1) {
                        h();
                    }
                }
            }
        }
    }

    @Override // zb.c, ia.c
    public final void flush() {
        super.flush();
        this.f203367n = null;
        this.f203368o = null;
        this.f203370q = 0;
        this.f203366m = this.f203365l[0];
        j();
        this.f203369p = null;
    }

    @Override // zb.c
    public final boolean g() {
        return this.f203367n != this.f203368o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:230:0x053b  */
    public final void h() {
        boolean z14;
        char c14;
        c cVar = this.f203369p;
        if (cVar == null) {
            return;
        }
        int i14 = 2;
        boolean z15 = true;
        if (cVar.f203403d != (cVar.f203401b * 2) - 1) {
            k.b("DtvCcPacket ended prematurely; size is " + ((this.f203369p.f203401b * 2) - 1) + ", but current index is " + this.f203369p.f203403d + " (sequence number " + this.f203369p.f203400a + ");");
        }
        c cVar2 = this.f203369p;
        byte[] bArr = cVar2.f203402c;
        int i15 = cVar2.f203403d;
        q qVar = this.f203362i;
        qVar.l(bArr, i15);
        boolean z16 = false;
        while (qVar.b() > 0) {
            int i16 = 3;
            int iG = qVar.g(3);
            int iG2 = qVar.g(5);
            int i17 = 7;
            if (iG == 7) {
                qVar.o(i14);
                iG = qVar.g(6);
                if (iG < 7) {
                    fb1.c.r(iG, "Invalid extended service number: ");
                }
            }
            if (iG2 == 0) {
                if (iG != 0) {
                    k.g("serviceNumber is non-zero (" + iG + ") when blockSize is 0");
                }
                if (z16) {
                    this.f203367n = i();
                }
                this.f203369p = null;
            }
            if (iG != this.f203364k) {
                qVar.p(iG2);
            } else {
                int iE = (iG2 * 8) + qVar.e();
                while (qVar.e() < iE) {
                    int iG3 = qVar.g(8);
                    if (iG3 != 16) {
                        if (iG3 <= 31) {
                            if (iG3 != 0) {
                                if (iG3 == i16) {
                                    this.f203367n = i();
                                } else if (iG3 != 8) {
                                    switch (iG3) {
                                        case 12:
                                            j();
                                            break;
                                        case 13:
                                            this.f203366m.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (iG3 >= 17 && iG3 <= 23) {
                                                k.g("Currently unsupported COMMAND_EXT1 Command: " + iG3);
                                                qVar.o(8);
                                            } else if (iG3 < 24 || iG3 > 31) {
                                                fb1.c.r(iG3, "Invalid C0 command: ");
                                            } else {
                                                k.g("Currently unsupported COMMAND_P16 Command: " + iG3);
                                                qVar.o(16);
                                            }
                                            break;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.f203366m.f203380b;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                        } else if (iG3 <= 127) {
                            C3797b c3797b = this.f203366m;
                            if (iG3 == 127) {
                                c3797b.a((char) 9835);
                            } else {
                                c3797b.a((char) (iG3 & 255));
                            }
                            z16 = true;
                        } else {
                            if (iG3 <= 159) {
                                C3797b[] c3797bArr = this.f203365l;
                                switch (iG3) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                                    case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                                        i16 = i16;
                                        z14 = true;
                                        int i18 = iG3 - 128;
                                        if (this.f203370q != i18) {
                                            this.f203370q = i18;
                                            this.f203366m = c3797bArr[i18];
                                        }
                                        break;
                                    case SyslogConstants.LOG_LOCAL1 /* 136 */:
                                        i16 = i16;
                                        z14 = true;
                                        for (int i19 = 1; i19 <= 8; i19++) {
                                            if (qVar.f()) {
                                                C3797b c3797b2 = c3797bArr[8 - i19];
                                                c3797b2.f203379a.clear();
                                                c3797b2.f203380b.clear();
                                                c3797b2.f203393o = -1;
                                                c3797b2.f203394p = -1;
                                                c3797b2.f203395q = -1;
                                                c3797b2.f203397s = -1;
                                                c3797b2.f203399u = 0;
                                            }
                                        }
                                        break;
                                    case 137:
                                        i16 = i16;
                                        for (int i24 = 1; i24 <= 8; i24++) {
                                            if (qVar.f()) {
                                                c3797bArr[8 - i24].f203382d = true;
                                            }
                                        }
                                        z14 = true;
                                        break;
                                    case TsExtractor.TS_STREAM_TYPE_DTS /* 138 */:
                                        i16 = i16;
                                        for (int i25 = 1; i25 <= 8; i25++) {
                                            if (qVar.f()) {
                                                c3797bArr[8 - i25].f203382d = false;
                                            }
                                        }
                                        z14 = true;
                                        break;
                                    case 139:
                                        i16 = i16;
                                        for (int i26 = 1; i26 <= 8; i26++) {
                                            if (qVar.f()) {
                                                C3797b c3797b3 = c3797bArr[8 - i26];
                                                c3797b3.f203382d = !c3797b3.f203382d;
                                            }
                                        }
                                        z14 = true;
                                        break;
                                    case 140:
                                        i16 = i16;
                                        for (int i27 = 1; i27 <= 8; i27++) {
                                            if (qVar.f()) {
                                                c3797bArr[8 - i27].d();
                                            }
                                        }
                                        z14 = true;
                                        break;
                                    case 141:
                                        i16 = i16;
                                        qVar.o(8);
                                        z14 = true;
                                        break;
                                    case 142:
                                        i16 = i16;
                                        z14 = true;
                                        break;
                                    case 143:
                                        i16 = i16;
                                        j();
                                        z14 = true;
                                        break;
                                    case SyslogConstants.LOG_LOCAL2 /* 144 */:
                                        int i28 = i14;
                                        if (this.f203366m.f203381c) {
                                            qVar.g(4);
                                            qVar.g(i28);
                                            qVar.g(i28);
                                            boolean zF = qVar.f();
                                            boolean zF2 = qVar.f();
                                            i16 = 3;
                                            qVar.g(3);
                                            qVar.g(3);
                                            this.f203366m.e(zF, zF2);
                                        } else {
                                            qVar.o(16);
                                            i16 = 3;
                                        }
                                        z14 = true;
                                        break;
                                    case 145:
                                        if (this.f203366m.f203381c) {
                                            int iC = C3797b.c(qVar.g(2), qVar.g(2), qVar.g(2), qVar.g(2));
                                            int iC2 = C3797b.c(qVar.g(2), qVar.g(2), qVar.g(2), qVar.g(2));
                                            qVar.o(2);
                                            C3797b.c(qVar.g(2), qVar.g(2), qVar.g(2), 0);
                                            this.f203366m.f(iC, iC2);
                                        } else {
                                            qVar.o(24);
                                        }
                                        i16 = 3;
                                        z14 = true;
                                        break;
                                    case 146:
                                        if (this.f203366m.f203381c) {
                                            qVar.o(4);
                                            int iG4 = qVar.g(4);
                                            qVar.o(2);
                                            qVar.g(6);
                                            C3797b c3797b4 = this.f203366m;
                                            if (c3797b4.f203399u != iG4) {
                                                c3797b4.a('\n');
                                            }
                                            c3797b4.f203399u = iG4;
                                        } else {
                                            qVar.o(16);
                                        }
                                        i16 = 3;
                                        z14 = true;
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        fb1.c.r(iG3, "Invalid C1 command: ");
                                        i16 = i16;
                                        z14 = true;
                                        break;
                                    case 151:
                                        if (this.f203366m.f203381c) {
                                            int iC3 = C3797b.c(qVar.g(2), qVar.g(2), qVar.g(2), qVar.g(2));
                                            qVar.g(2);
                                            C3797b.c(qVar.g(2), qVar.g(2), qVar.g(2), 0);
                                            qVar.f();
                                            qVar.f();
                                            qVar.g(2);
                                            qVar.g(2);
                                            int iG5 = qVar.g(2);
                                            qVar.o(8);
                                            C3797b c3797b5 = this.f203366m;
                                            c3797b5.f203392n = iC3;
                                            c3797b5.f203389k = iG5;
                                        } else {
                                            qVar.o(32);
                                        }
                                        i16 = 3;
                                        z14 = true;
                                        break;
                                    case SyslogConstants.LOG_LOCAL3 /* 152 */:
                                    case 153:
                                    case 154:
                                    case ModuleDescriptor.MODULE_VERSION /* 155 */:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i29 = iG3 - 152;
                                        C3797b c3797b6 = c3797bArr[i29];
                                        qVar.o(i14);
                                        boolean zF3 = qVar.f();
                                        qVar.o(i14);
                                        int iG6 = qVar.g(i16);
                                        boolean zF4 = qVar.f();
                                        int iG7 = qVar.g(i17);
                                        int iG8 = qVar.g(8);
                                        int iG9 = qVar.g(4);
                                        int iG10 = qVar.g(4);
                                        qVar.o(i14);
                                        qVar.o(6);
                                        qVar.o(i14);
                                        int iG11 = qVar.g(i16);
                                        int iG12 = qVar.g(i16);
                                        ArrayList arrayList = c3797b6.f203379a;
                                        c3797b6.f203381c = true;
                                        c3797b6.f203382d = zF3;
                                        c3797b6.f203383e = iG6;
                                        c3797b6.f203384f = zF4;
                                        c3797b6.f203385g = iG7;
                                        c3797b6.f203386h = iG8;
                                        c3797b6.f203387i = iG9;
                                        int i30 = iG10 + 1;
                                        if (c3797b6.f203388j != i30) {
                                            c3797b6.f203388j = i30;
                                            while (true) {
                                                if (arrayList.size() >= c3797b6.f203388j || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (iG11 != 0 && c3797b6.f203390l != iG11) {
                                            c3797b6.f203390l = iG11;
                                            int i34 = iG11 - 1;
                                            int i35 = C3797b.B[i34];
                                            boolean z17 = C3797b.A[i34];
                                            int i36 = C3797b.f203377y[i34];
                                            int i37 = C3797b.f203378z[i34];
                                            int i38 = C3797b.f203376x[i34];
                                            c3797b6.f203392n = i35;
                                            c3797b6.f203389k = i38;
                                        }
                                        if (iG12 != 0 && c3797b6.f203391m != iG12) {
                                            c3797b6.f203391m = iG12;
                                            int i39 = iG12 - 1;
                                            int i44 = C3797b.D[i39];
                                            int i45 = C3797b.C[i39];
                                            c3797b6.e(false, false);
                                            c3797b6.f(C3797b.f203374v, C3797b.E[i39]);
                                        }
                                        if (this.f203370q != i29) {
                                            this.f203370q = i29;
                                            this.f203366m = c3797bArr[i29];
                                        }
                                        i16 = 3;
                                        z14 = true;
                                        break;
                                }
                            } else {
                                i16 = i16;
                                z14 = true;
                                if (iG3 <= 255) {
                                    this.f203366m.a((char) (iG3 & 255));
                                } else {
                                    fb1.c.r(iG3, "Invalid base command: ");
                                }
                                i14 = 2;
                                i17 = 7;
                            }
                            z16 = z14;
                            i14 = 2;
                            i17 = 7;
                        }
                        z14 = true;
                    } else {
                        i16 = i16;
                        z14 = true;
                        int iG13 = qVar.g(8);
                        if (iG13 <= 31) {
                            i17 = 7;
                            if (iG13 > 7) {
                                if (iG13 <= 15) {
                                    qVar.o(8);
                                } else if (iG13 <= 23) {
                                    qVar.o(16);
                                } else if (iG13 <= 31) {
                                    qVar.o(24);
                                }
                            }
                        } else {
                            i17 = 7;
                            if (iG13 <= 127) {
                                if (iG13 == 32) {
                                    this.f203366m.a(' ');
                                } else if (iG13 == 33) {
                                    this.f203366m.a((char) 160);
                                } else if (iG13 == 37) {
                                    this.f203366m.a((char) 8230);
                                } else if (iG13 == 42) {
                                    this.f203366m.a((char) 352);
                                } else if (iG13 == 44) {
                                    this.f203366m.a((char) 338);
                                } else if (iG13 == 63) {
                                    this.f203366m.a((char) 376);
                                } else if (iG13 == 57) {
                                    this.f203366m.a((char) 8482);
                                } else if (iG13 == 58) {
                                    this.f203366m.a((char) 353);
                                } else if (iG13 == 60) {
                                    this.f203366m.a((char) 339);
                                } else if (iG13 != 61) {
                                    switch (iG13) {
                                        case 48:
                                            this.f203366m.a((char) 9608);
                                            break;
                                        case 49:
                                            this.f203366m.a((char) 8216);
                                            break;
                                        case 50:
                                            this.f203366m.a((char) 8217);
                                            break;
                                        case 51:
                                            this.f203366m.a((char) 8220);
                                            break;
                                        case 52:
                                            this.f203366m.a((char) 8221);
                                            break;
                                        case 53:
                                            this.f203366m.a((char) 8226);
                                            break;
                                        default:
                                            switch (iG13) {
                                                case 118:
                                                    this.f203366m.a((char) 8539);
                                                    break;
                                                case 119:
                                                    this.f203366m.a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.f203366m.a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.f203366m.a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.f203366m.a((char) 9474);
                                                    break;
                                                case 123:
                                                    this.f203366m.a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.f203366m.a((char) 9492);
                                                    break;
                                                case 125:
                                                    this.f203366m.a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.f203366m.a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.f203366m.a((char) 9484);
                                                    break;
                                                default:
                                                    fb1.c.r(iG13, "Invalid G2 character: ");
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.f203366m.a((char) 8480);
                                }
                                z16 = true;
                            } else {
                                if (iG13 > 159) {
                                    i14 = 2;
                                    c14 = 6;
                                    if (iG13 <= 255) {
                                        if (iG13 == 160) {
                                            this.f203366m.a((char) 13252);
                                        } else {
                                            fb1.c.r(iG13, "Invalid G3 character: ");
                                            this.f203366m.a('_');
                                        }
                                        z16 = true;
                                    } else {
                                        fb1.c.r(iG13, "Invalid extended command: ");
                                    }
                                } else if (iG13 <= 135) {
                                    qVar.o(32);
                                } else if (iG13 <= 143) {
                                    qVar.o(40);
                                } else if (iG13 <= 159) {
                                    i14 = 2;
                                    qVar.o(2);
                                    c14 = 6;
                                    qVar.o(qVar.g(6) * 8);
                                }
                                boolean z18 = z14;
                                i16 = i16;
                                i14 = i14;
                                z15 = z18;
                                i17 = i17;
                            }
                        }
                        i14 = 2;
                    }
                    c14 = 6;
                    boolean z19 = z14;
                    i16 = i16;
                    i14 = i14;
                    z15 = z19;
                    i17 = i17;
                }
            }
        }
        if (z16) {
            this.f203367n = i();
        }
        this.f203369p = null;
    }

    public final List<ea.a> i() {
        a aVar;
        Layout.Alignment alignment;
        float f14;
        float f15;
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < 8; i14++) {
            C3797b[] c3797bArr = this.f203365l;
            C3797b c3797b = c3797bArr[i14];
            if (c3797b.f203381c && (!c3797b.f203379a.isEmpty() || c3797b.f203380b.length() != 0)) {
                C3797b c3797b2 = c3797bArr[i14];
                if (c3797b2.f203382d) {
                    ArrayList arrayList2 = c3797b2.f203379a;
                    if (!c3797b2.f203381c || (arrayList2.isEmpty() && c3797b2.f203380b.length() == 0)) {
                        aVar = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i15));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) c3797b2.b());
                        int i16 = c3797b2.f203389k;
                        if (i16 == 0) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else if (i16 == 1) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else if (i16 != 2) {
                            if (i16 != 3) {
                                sn.a.z(c3797b2.f203389k, "Unexpected justification value: ");
                                return null;
                            }
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_CENTER;
                        }
                        Layout.Alignment alignment2 = alignment;
                        boolean z14 = c3797b2.f203384f;
                        int i17 = c3797b2.f203386h;
                        int i18 = c3797b2.f203385g;
                        if (z14) {
                            f14 = i17 / 99.0f;
                            f15 = i18 / 99.0f;
                        } else {
                            f14 = i17 / 209.0f;
                            f15 = i18 / 74.0f;
                        }
                        float f16 = (f14 * 0.9f) + 0.05f;
                        float f17 = (f15 * 0.9f) + 0.05f;
                        int i19 = c3797b2.f203387i;
                        int i24 = i19 / 3;
                        int i25 = i24 == 0 ? 0 : i24 == 1 ? 1 : 2;
                        int i26 = i19 % 3;
                        int i27 = i26 == 0 ? 0 : i26 == 1 ? 1 : 2;
                        int i28 = c3797b2.f203392n;
                        aVar = new a(spannableStringBuilder, alignment2, f17, 0, i25, f16, i27, -3.4028235E38f, i28 != C3797b.f203375w, i28, c3797b2.f203383e);
                    }
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, a.f203371c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i29 = 0; i29 < arrayList.size(); i29++) {
            arrayList3.add(((a) arrayList.get(i29)).f203372a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void j() {
        for (int i14 = 0; i14 < 8; i14++) {
            this.f203365l[i14].d();
        }
    }
}
