package zb;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.text.cea.Cea608Decoder;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Ascii;
import com.google.mlkit.common.MlKitException;
import fa.k;
import fa.r;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import yb.m;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f203333i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f203334j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f203335k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f203336l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<ea.a> f203339o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<ea.a> f203340p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f203341q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f203342r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f203343s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f203344t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte f203345u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte f203346v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f203348x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f203349y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f203331z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, SyslogConstants.LOG_LOCAL6, PsExtractor.PRIVATE_STREAM_1, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, 235, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] F = {195, 227, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f203332h = new r();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList<C3795a> f203337m = new ArrayList<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C3795a f203338n = new C3795a(0, 4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f203347w = 0;

    /* JADX INFO: renamed from: zb.a$a, reason: collision with other inner class name */
    public static final class C3795a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f203350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f203351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final StringBuilder f203352c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f203353d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f203354e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f203355f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f203356g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f203357h;

        /* JADX INFO: renamed from: zb.a$a$a, reason: collision with other inner class name */
        public static class C3796a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f203358a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f203359b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f203360c;

            public C3796a(int i14, boolean z14, int i15) {
                this.f203358a = i14;
                this.f203359b = z14;
                this.f203360c = i15;
            }
        }

        public C3795a(int i14, int i15) {
            ArrayList arrayList = new ArrayList();
            this.f203350a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f203351b = arrayList2;
            StringBuilder sb3 = new StringBuilder();
            this.f203352c = sb3;
            this.f203356g = i14;
            arrayList.clear();
            arrayList2.clear();
            sb3.setLength(0);
            this.f203353d = 15;
            this.f203354e = 0;
            this.f203355f = 0;
            this.f203357h = i15;
        }

        public final void a(char c14) {
            StringBuilder sb3 = this.f203352c;
            if (sb3.length() < 32) {
                sb3.append(c14);
            }
        }

        public final void b() {
            StringBuilder sb3 = this.f203352c;
            int length = sb3.length();
            if (length > 0) {
                sb3.delete(length - 1, length);
                ArrayList arrayList = this.f203350a;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C3796a c3796a = (C3796a) arrayList.get(size);
                    int i14 = c3796a.f203360c;
                    if (i14 != length) {
                        return;
                    }
                    c3796a.f203360c = i14 - 1;
                }
            }
        }

        public final ea.a c(int i14) {
            float f14;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i15 = 0;
            while (true) {
                ArrayList arrayList = this.f203351b;
                if (i15 >= arrayList.size()) {
                    break;
                }
                spannableStringBuilder.append((CharSequence) arrayList.get(i15));
                spannableStringBuilder.append('\n');
                i15++;
            }
            spannableStringBuilder.append((CharSequence) d());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i16 = this.f203354e + this.f203355f;
            int length = (32 - i16) - spannableStringBuilder.length();
            int i17 = i16 - length;
            if (i14 == Integer.MIN_VALUE) {
                if (this.f203356g != 2 || (Math.abs(i17) >= 3 && length >= 0)) {
                    i14 = (this.f203356g != 2 || i17 <= 0) ? 0 : 2;
                } else {
                    i14 = 1;
                }
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    i16 = 32 - length;
                }
                f14 = ((i16 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f14 = 0.5f;
            }
            int i18 = this.f203353d;
            if (i18 > 7) {
                i18 -= 17;
            } else if (this.f203356g == 1) {
                i18 -= this.f203357h - 1;
            }
            ea.a.b bVar = new ea.a.b();
            bVar.f63568a = spannableStringBuilder;
            bVar.f63570c = Layout.Alignment.ALIGN_NORMAL;
            bVar.f63572e = i18;
            bVar.f63573f = 1;
            bVar.f63575h = f14;
            bVar.f63576i = i14;
            return bVar.a();
        }

        public final SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f203352c);
            int length = spannableStringBuilder.length();
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = 0;
            int i19 = 0;
            boolean z14 = false;
            while (true) {
                ArrayList arrayList = this.f203350a;
                if (i18 >= arrayList.size()) {
                    break;
                }
                C3796a c3796a = (C3796a) arrayList.get(i18);
                boolean z15 = c3796a.f203359b;
                int i24 = c3796a.f203358a;
                if (i24 != 8) {
                    boolean z16 = i24 == 7;
                    if (i24 != 7) {
                        i17 = a.B[i24];
                    }
                    z14 = z16;
                }
                int i25 = c3796a.f203360c;
                i18++;
                if (i25 != (i18 < arrayList.size() ? ((C3796a) arrayList.get(i18)).f203360c : length)) {
                    if (i14 != -1 && !z15) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i14, i25, 33);
                        i14 = -1;
                    } else if (i14 == -1 && z15) {
                        i14 = i25;
                    }
                    if (i15 != -1 && !z14) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i15, i25, 33);
                        i15 = -1;
                    } else if (i15 == -1 && z14) {
                        i15 = i25;
                    }
                    if (i17 != i16) {
                        if (i16 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i16), i19, i25, 33);
                        }
                        i16 = i17;
                        i19 = i25;
                    }
                }
            }
            if (i14 != -1 && i14 != length) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i14, length, 33);
            }
            if (i15 != -1 && i15 != length) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i15, length, 33);
            }
            if (i19 != length && i16 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i16), i19, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final boolean e() {
            return this.f203350a.isEmpty() && this.f203351b.isEmpty() && this.f203352c.length() == 0;
        }
    }

    public a(String str, int i14, long j8) {
        if (j8 != C.TIME_UNSET) {
            fa.a.a(j8 >= Cea608Decoder.MIN_DATA_CHANNEL_TIMEOUT_MS);
            this.f203336l = j8 * 1000;
        } else {
            this.f203336l = C.TIME_UNSET;
        }
        this.f203333i = MimeTypes.APPLICATION_MP4CEA608.equals(str) ? 2 : 3;
        if (i14 == 1) {
            this.f203335k = 0;
            this.f203334j = 0;
        } else if (i14 == 2) {
            this.f203335k = 1;
            this.f203334j = 0;
        } else if (i14 == 3) {
            this.f203335k = 0;
            this.f203334j = 1;
        } else if (i14 != 4) {
            k.g("Invalid channel. Defaulting to CC1.");
            this.f203335k = 0;
            this.f203334j = 0;
        } else {
            this.f203335k = 1;
            this.f203334j = 1;
        }
        j(0);
        i();
        this.f203348x = true;
        this.f203349y = C.TIME_UNSET;
    }

    @Override // zb.c
    public final d d() {
        List<ea.a> list = this.f203339o;
        this.f203340p = list;
        list.getClass();
        return new d(list);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x019a  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:134:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01da  */
    /* JADX WARN: Code duplicated, block: B:143:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:148:0x0207 A[LOOP:1: B:146:0x0201->B:148:0x0207, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x020b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0211 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0213  */
    /* JADX WARN: Code duplicated, block: B:153:0x0218  */
    /* JADX WARN: Code duplicated, block: B:154:0x021f  */
    /* JADX WARN: Code duplicated, block: B:155:0x022a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0235  */
    /* JADX WARN: Code duplicated, block: B:157:0x0240  */
    /* JADX WARN: Code duplicated, block: B:158:0x0245  */
    /* JADX WARN: Code duplicated, block: B:159:0x024a  */
    /* JADX WARN: Code duplicated, block: B:161:0x025b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x012a  */
    /* JADX WARN: Code duplicated, block: B:93:0x012e  */
    @Override // zb.c
    public final void e(c.b bVar) {
        boolean z14;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList;
        int iMin;
        ByteBuffer byteBuffer = bVar.f8631d;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        r rVar = this.f203332h;
        rVar.E(bArrArray, iLimit);
        boolean z15 = false;
        while (true) {
            int iA = rVar.a();
            int i18 = this.f203333i;
            if (iA < i18) {
                if (z15) {
                    int i19 = this.f203341q;
                    if (i19 == 1 || i19 == 3) {
                        this.f203339o = h();
                        this.f203349y = this.f203408e;
                        return;
                    }
                    return;
                }
                return;
            }
            int iU = i18 == 2 ? -4 : rVar.u();
            int iU2 = rVar.u();
            int iU3 = rVar.u();
            if ((iU & 2) == 0 && (iU & 1) == this.f203334j) {
                byte b14 = (byte) (iU2 & 127);
                byte b15 = (byte) (iU3 & 127);
                if (b14 != 0 || b15 != 0) {
                    boolean z16 = this.f203343s;
                    if ((iU & 4) == 4) {
                        boolean[] zArr = G;
                        if (zArr[iU2] && zArr[iU3]) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    } else {
                        z14 = false;
                    }
                    this.f203343s = z14;
                    if (!z14 || (b14 & 240) != 16) {
                        this.f203344t = false;
                        if (!z14) {
                            if (1 > b14 && b14 <= 15) {
                                this.f203348x = false;
                            } else if ((b14 & 246) == 20) {
                                if (b15 == 32 && b15 != 47) {
                                    switch (b15) {
                                        default:
                                            switch (b15) {
                                                case 42:
                                                case 43:
                                                    this.f203348x = false;
                                                    break;
                                            }
                                        case 37:
                                        case 38:
                                        case 39:
                                            this.f203348x = true;
                                            break;
                                    }
                                } else {
                                    this.f203348x = true;
                                }
                            }
                            if (this.f203348x) {
                                i14 = b14 & 224;
                                if (i14 == 0) {
                                    this.f203347w = (b14 >> 3) & 1;
                                }
                                if (this.f203347w != this.f203335k) {
                                    if (i14 == 0) {
                                        i15 = b14 & 247;
                                        if (i15 == 17 || (b15 & 240) != 48) {
                                            i16 = b14 & 246;
                                            if (i16 != 18 && (b15 & 224) == 32) {
                                                this.f203338n.b();
                                                this.f203338n.a((char) ((b14 & 1) == 0 ? E[b15 & Ascii.US] : F[b15 & Ascii.US]));
                                            } else if (i15 != 17 && (b15 & 240) == 32) {
                                                this.f203338n.a(' ');
                                                boolean z17 = (b15 & 1) == 1;
                                                C3795a c3795a = this.f203338n;
                                                c3795a.f203350a.add(new C3795a.C3796a((b15 >> 1) & 7, z17, c3795a.f203352c.length()));
                                            } else if ((b14 & 240) != 16 && (b15 & 192) == 64) {
                                                int i24 = f203331z[b14 & 7];
                                                if ((b15 & 32) != 0) {
                                                    i24++;
                                                }
                                                C3795a c3795a2 = this.f203338n;
                                                if (i24 != c3795a2.f203353d) {
                                                    if (this.f203341q != 1 && !c3795a2.e()) {
                                                        C3795a c3795a3 = new C3795a(this.f203341q, this.f203342r);
                                                        this.f203338n = c3795a3;
                                                        this.f203337m.add(c3795a3);
                                                    }
                                                    this.f203338n.f203353d = i24;
                                                }
                                                boolean z18 = (b15 & Ascii.DLE) == 16;
                                                boolean z19 = (b15 & 1) == 1;
                                                int i25 = (b15 >> 1) & 7;
                                                C3795a c3795a4 = this.f203338n;
                                                c3795a4.f203350a.add(new C3795a.C3796a(z18 ? 8 : i25, z19, c3795a4.f203352c.length()));
                                                if (z18) {
                                                    this.f203338n.f203354e = A[i25];
                                                }
                                            } else if (i15 != 23 && b15 >= 33 && b15 <= 35) {
                                                this.f203338n.f203355f = b15 - 32;
                                            } else if (i16 == 20 && (b15 & 240) == 32) {
                                                if (b15 == 32) {
                                                    j(2);
                                                } else if (b15 != 41) {
                                                    switch (b15) {
                                                        case 37:
                                                            j(1);
                                                            this.f203342r = 2;
                                                            this.f203338n.f203357h = 2;
                                                            break;
                                                        case 38:
                                                            j(1);
                                                            this.f203342r = 3;
                                                            this.f203338n.f203357h = 3;
                                                            break;
                                                        case 39:
                                                            j(1);
                                                            this.f203342r = 4;
                                                            this.f203338n.f203357h = 4;
                                                            break;
                                                        default:
                                                            i17 = this.f203341q;
                                                            if (i17 != 0) {
                                                                if (b15 != 33) {
                                                                    switch (b15) {
                                                                        case 44:
                                                                            this.f203339o = Collections.EMPTY_LIST;
                                                                            if (i17 != 1 || i17 == 3) {
                                                                                i();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i17 == 1 && !this.f203338n.e()) {
                                                                                C3795a c3795a5 = this.f203338n;
                                                                                arrayList = c3795a5.f203351b;
                                                                                arrayList.add(c3795a5.d());
                                                                                c3795a5.f203352c.setLength(0);
                                                                                c3795a5.f203350a.clear();
                                                                                iMin = Math.min(c3795a5.f203357h, c3795a5.f203353d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            i();
                                                                            break;
                                                                        case 47:
                                                                            this.f203339o = h();
                                                                            i();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f203338n.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    j(3);
                                                }
                                            }
                                        } else {
                                            this.f203338n.a((char) D[b15 & Ascii.SI]);
                                        }
                                    } else {
                                        C3795a c3795a6 = this.f203338n;
                                        int i26 = (b14 & Ascii.DEL) - 32;
                                        iArr = C;
                                        c3795a6.a((char) iArr[i26]);
                                        if ((b15 & 224) != 0) {
                                            this.f203338n.a((char) iArr[(b15 & Ascii.DEL) - 32]);
                                        }
                                    }
                                    z15 = true;
                                }
                            }
                        } else if (z16) {
                            i();
                            z15 = true;
                        }
                    } else if (this.f203344t && this.f203345u == b14 && this.f203346v == b15) {
                        this.f203344t = false;
                    } else {
                        this.f203344t = true;
                        this.f203345u = b14;
                        this.f203346v = b15;
                        if (!z14) {
                            if (1 > b14) {
                                if ((b14 & 246) == 20) {
                                    if (b15 == 32) {
                                        this.f203348x = true;
                                    } else {
                                        this.f203348x = true;
                                    }
                                }
                            } else if ((b14 & 246) == 20) {
                                if (b15 == 32) {
                                    this.f203348x = true;
                                } else {
                                    this.f203348x = true;
                                }
                            }
                            if (this.f203348x) {
                                i14 = b14 & 224;
                                if (i14 == 0) {
                                    this.f203347w = (b14 >> 3) & 1;
                                }
                                if (this.f203347w != this.f203335k) {
                                    if (i14 == 0) {
                                        i15 = b14 & 247;
                                        if (i15 == 17) {
                                            i16 = b14 & 246;
                                            if (i16 != 18) {
                                                if (i15 != 17) {
                                                    if ((b14 & 240) != 16) {
                                                        if (i15 != 23) {
                                                            if (i16 == 20) {
                                                                if (b15 == 32) {
                                                                    j(2);
                                                                } else if (b15 != 41) {
                                                                    switch (b15) {
                                                                        case 37:
                                                                            j(1);
                                                                            this.f203342r = 2;
                                                                            this.f203338n.f203357h = 2;
                                                                            break;
                                                                        case 38:
                                                                            j(1);
                                                                            this.f203342r = 3;
                                                                            this.f203338n.f203357h = 3;
                                                                            break;
                                                                        case 39:
                                                                            j(1);
                                                                            this.f203342r = 4;
                                                                            this.f203338n.f203357h = 4;
                                                                            break;
                                                                        default:
                                                                            i17 = this.f203341q;
                                                                            if (i17 != 0) {
                                                                                if (b15 != 33) {
                                                                                    switch (b15) {
                                                                                        case 44:
                                                                                            this.f203339o = Collections.EMPTY_LIST;
                                                                                            if (i17 != 1) {
                                                                                                i();
                                                                                            } else {
                                                                                                i();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i17 == 1) {
                                                                                                C3795a c3795a7 = this.f203338n;
                                                                                                arrayList = c3795a7.f203351b;
                                                                                                arrayList.add(c3795a7.d());
                                                                                                c3795a7.f203352c.setLength(0);
                                                                                                c3795a7.f203350a.clear();
                                                                                                iMin = Math.min(c3795a7.f203357h, c3795a7.f203353d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            i();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f203339o = h();
                                                                                            i();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f203338n.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    j(3);
                                                                }
                                                            }
                                                        } else if (i16 == 20) {
                                                            if (b15 == 32) {
                                                                j(2);
                                                            } else if (b15 != 41) {
                                                                switch (b15) {
                                                                    case 37:
                                                                        j(1);
                                                                        this.f203342r = 2;
                                                                        this.f203338n.f203357h = 2;
                                                                        break;
                                                                    case 38:
                                                                        j(1);
                                                                        this.f203342r = 3;
                                                                        this.f203338n.f203357h = 3;
                                                                        break;
                                                                    case 39:
                                                                        j(1);
                                                                        this.f203342r = 4;
                                                                        this.f203338n.f203357h = 4;
                                                                        break;
                                                                    default:
                                                                        i17 = this.f203341q;
                                                                        if (i17 != 0) {
                                                                            if (b15 != 33) {
                                                                                switch (b15) {
                                                                                    case 44:
                                                                                        this.f203339o = Collections.EMPTY_LIST;
                                                                                        if (i17 != 1) {
                                                                                            i();
                                                                                        } else {
                                                                                            i();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i17 == 1) {
                                                                                            C3795a c3795a8 = this.f203338n;
                                                                                            arrayList = c3795a8.f203351b;
                                                                                            arrayList.add(c3795a8.d());
                                                                                            c3795a8.f203352c.setLength(0);
                                                                                            c3795a8.f203350a.clear();
                                                                                            iMin = Math.min(c3795a8.f203357h, c3795a8.f203353d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        i();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f203339o = h();
                                                                                        i();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f203338n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                j(3);
                                                            }
                                                        }
                                                    } else if (i15 != 23) {
                                                        if (i16 == 20) {
                                                            if (b15 == 32) {
                                                                j(2);
                                                            } else if (b15 != 41) {
                                                                switch (b15) {
                                                                    case 37:
                                                                        j(1);
                                                                        this.f203342r = 2;
                                                                        this.f203338n.f203357h = 2;
                                                                        break;
                                                                    case 38:
                                                                        j(1);
                                                                        this.f203342r = 3;
                                                                        this.f203338n.f203357h = 3;
                                                                        break;
                                                                    case 39:
                                                                        j(1);
                                                                        this.f203342r = 4;
                                                                        this.f203338n.f203357h = 4;
                                                                        break;
                                                                    default:
                                                                        i17 = this.f203341q;
                                                                        if (i17 != 0) {
                                                                            if (b15 != 33) {
                                                                                switch (b15) {
                                                                                    case 44:
                                                                                        this.f203339o = Collections.EMPTY_LIST;
                                                                                        if (i17 != 1) {
                                                                                            i();
                                                                                        } else {
                                                                                            i();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i17 == 1) {
                                                                                            C3795a c3795a9 = this.f203338n;
                                                                                            arrayList = c3795a9.f203351b;
                                                                                            arrayList.add(c3795a9.d());
                                                                                            c3795a9.f203352c.setLength(0);
                                                                                            c3795a9.f203350a.clear();
                                                                                            iMin = Math.min(c3795a9.f203357h, c3795a9.f203353d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        i();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f203339o = h();
                                                                                        i();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f203338n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                j(3);
                                                            }
                                                        }
                                                    } else if (i16 == 20) {
                                                        if (b15 == 32) {
                                                            j(2);
                                                        } else if (b15 != 41) {
                                                            switch (b15) {
                                                                case 37:
                                                                    j(1);
                                                                    this.f203342r = 2;
                                                                    this.f203338n.f203357h = 2;
                                                                    break;
                                                                case 38:
                                                                    j(1);
                                                                    this.f203342r = 3;
                                                                    this.f203338n.f203357h = 3;
                                                                    break;
                                                                case 39:
                                                                    j(1);
                                                                    this.f203342r = 4;
                                                                    this.f203338n.f203357h = 4;
                                                                    break;
                                                                default:
                                                                    i17 = this.f203341q;
                                                                    if (i17 != 0) {
                                                                        if (b15 != 33) {
                                                                            switch (b15) {
                                                                                case 44:
                                                                                    this.f203339o = Collections.EMPTY_LIST;
                                                                                    if (i17 != 1) {
                                                                                        i();
                                                                                    } else {
                                                                                        i();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i17 == 1) {
                                                                                        C3795a c3795a10 = this.f203338n;
                                                                                        arrayList = c3795a10.f203351b;
                                                                                        arrayList.add(c3795a10.d());
                                                                                        c3795a10.f203352c.setLength(0);
                                                                                        c3795a10.f203350a.clear();
                                                                                        iMin = Math.min(c3795a10.f203357h, c3795a10.f203353d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    i();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f203339o = h();
                                                                                    i();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f203338n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            j(3);
                                                        }
                                                    }
                                                } else if ((b14 & 240) != 16) {
                                                    if (i15 != 23) {
                                                        if (i16 == 20) {
                                                            if (b15 == 32) {
                                                                j(2);
                                                            } else if (b15 != 41) {
                                                                switch (b15) {
                                                                    case 37:
                                                                        j(1);
                                                                        this.f203342r = 2;
                                                                        this.f203338n.f203357h = 2;
                                                                        break;
                                                                    case 38:
                                                                        j(1);
                                                                        this.f203342r = 3;
                                                                        this.f203338n.f203357h = 3;
                                                                        break;
                                                                    case 39:
                                                                        j(1);
                                                                        this.f203342r = 4;
                                                                        this.f203338n.f203357h = 4;
                                                                        break;
                                                                    default:
                                                                        i17 = this.f203341q;
                                                                        if (i17 != 0) {
                                                                            if (b15 != 33) {
                                                                                switch (b15) {
                                                                                    case 44:
                                                                                        this.f203339o = Collections.EMPTY_LIST;
                                                                                        if (i17 != 1) {
                                                                                            i();
                                                                                        } else {
                                                                                            i();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i17 == 1) {
                                                                                            C3795a c3795a11 = this.f203338n;
                                                                                            arrayList = c3795a11.f203351b;
                                                                                            arrayList.add(c3795a11.d());
                                                                                            c3795a11.f203352c.setLength(0);
                                                                                            c3795a11.f203350a.clear();
                                                                                            iMin = Math.min(c3795a11.f203357h, c3795a11.f203353d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        i();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f203339o = h();
                                                                                        i();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f203338n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                j(3);
                                                            }
                                                        }
                                                    } else if (i16 == 20) {
                                                        if (b15 == 32) {
                                                            j(2);
                                                        } else if (b15 != 41) {
                                                            switch (b15) {
                                                                case 37:
                                                                    j(1);
                                                                    this.f203342r = 2;
                                                                    this.f203338n.f203357h = 2;
                                                                    break;
                                                                case 38:
                                                                    j(1);
                                                                    this.f203342r = 3;
                                                                    this.f203338n.f203357h = 3;
                                                                    break;
                                                                case 39:
                                                                    j(1);
                                                                    this.f203342r = 4;
                                                                    this.f203338n.f203357h = 4;
                                                                    break;
                                                                default:
                                                                    i17 = this.f203341q;
                                                                    if (i17 != 0) {
                                                                        if (b15 != 33) {
                                                                            switch (b15) {
                                                                                case 44:
                                                                                    this.f203339o = Collections.EMPTY_LIST;
                                                                                    if (i17 != 1) {
                                                                                        i();
                                                                                    } else {
                                                                                        i();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i17 == 1) {
                                                                                        C3795a c3795a12 = this.f203338n;
                                                                                        arrayList = c3795a12.f203351b;
                                                                                        arrayList.add(c3795a12.d());
                                                                                        c3795a12.f203352c.setLength(0);
                                                                                        c3795a12.f203350a.clear();
                                                                                        iMin = Math.min(c3795a12.f203357h, c3795a12.f203353d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    i();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f203339o = h();
                                                                                    i();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f203338n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            j(3);
                                                        }
                                                    }
                                                } else if (i15 != 23) {
                                                    if (i16 == 20) {
                                                        if (b15 == 32) {
                                                            j(2);
                                                        } else if (b15 != 41) {
                                                            switch (b15) {
                                                                case 37:
                                                                    j(1);
                                                                    this.f203342r = 2;
                                                                    this.f203338n.f203357h = 2;
                                                                    break;
                                                                case 38:
                                                                    j(1);
                                                                    this.f203342r = 3;
                                                                    this.f203338n.f203357h = 3;
                                                                    break;
                                                                case 39:
                                                                    j(1);
                                                                    this.f203342r = 4;
                                                                    this.f203338n.f203357h = 4;
                                                                    break;
                                                                default:
                                                                    i17 = this.f203341q;
                                                                    if (i17 != 0) {
                                                                        if (b15 != 33) {
                                                                            switch (b15) {
                                                                                case 44:
                                                                                    this.f203339o = Collections.EMPTY_LIST;
                                                                                    if (i17 != 1) {
                                                                                        i();
                                                                                    } else {
                                                                                        i();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i17 == 1) {
                                                                                        C3795a c3795a13 = this.f203338n;
                                                                                        arrayList = c3795a13.f203351b;
                                                                                        arrayList.add(c3795a13.d());
                                                                                        c3795a13.f203352c.setLength(0);
                                                                                        c3795a13.f203350a.clear();
                                                                                        iMin = Math.min(c3795a13.f203357h, c3795a13.f203353d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    i();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f203339o = h();
                                                                                    i();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f203338n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            j(3);
                                                        }
                                                    }
                                                } else if (i16 == 20) {
                                                    if (b15 == 32) {
                                                        j(2);
                                                    } else if (b15 != 41) {
                                                        switch (b15) {
                                                            case 37:
                                                                j(1);
                                                                this.f203342r = 2;
                                                                this.f203338n.f203357h = 2;
                                                                break;
                                                            case 38:
                                                                j(1);
                                                                this.f203342r = 3;
                                                                this.f203338n.f203357h = 3;
                                                                break;
                                                            case 39:
                                                                j(1);
                                                                this.f203342r = 4;
                                                                this.f203338n.f203357h = 4;
                                                                break;
                                                            default:
                                                                i17 = this.f203341q;
                                                                if (i17 != 0) {
                                                                    if (b15 != 33) {
                                                                        switch (b15) {
                                                                            case 44:
                                                                                this.f203339o = Collections.EMPTY_LIST;
                                                                                if (i17 != 1) {
                                                                                    i();
                                                                                } else {
                                                                                    i();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i17 == 1) {
                                                                                    C3795a c3795a14 = this.f203338n;
                                                                                    arrayList = c3795a14.f203351b;
                                                                                    arrayList.add(c3795a14.d());
                                                                                    c3795a14.f203352c.setLength(0);
                                                                                    c3795a14.f203350a.clear();
                                                                                    iMin = Math.min(c3795a14.f203357h, c3795a14.f203353d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                i();
                                                                                break;
                                                                            case 47:
                                                                                this.f203339o = h();
                                                                                i();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f203338n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        j(3);
                                                    }
                                                }
                                            } else if (i15 != 17) {
                                                if ((b14 & 240) != 16) {
                                                    if (i15 != 23) {
                                                        if (i16 == 20) {
                                                            if (b15 == 32) {
                                                                j(2);
                                                            } else if (b15 != 41) {
                                                                switch (b15) {
                                                                    case 37:
                                                                        j(1);
                                                                        this.f203342r = 2;
                                                                        this.f203338n.f203357h = 2;
                                                                        break;
                                                                    case 38:
                                                                        j(1);
                                                                        this.f203342r = 3;
                                                                        this.f203338n.f203357h = 3;
                                                                        break;
                                                                    case 39:
                                                                        j(1);
                                                                        this.f203342r = 4;
                                                                        this.f203338n.f203357h = 4;
                                                                        break;
                                                                    default:
                                                                        i17 = this.f203341q;
                                                                        if (i17 != 0) {
                                                                            if (b15 != 33) {
                                                                                switch (b15) {
                                                                                    case 44:
                                                                                        this.f203339o = Collections.EMPTY_LIST;
                                                                                        if (i17 != 1) {
                                                                                            i();
                                                                                        } else {
                                                                                            i();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i17 == 1) {
                                                                                            C3795a c3795a15 = this.f203338n;
                                                                                            arrayList = c3795a15.f203351b;
                                                                                            arrayList.add(c3795a15.d());
                                                                                            c3795a15.f203352c.setLength(0);
                                                                                            c3795a15.f203350a.clear();
                                                                                            iMin = Math.min(c3795a15.f203357h, c3795a15.f203353d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        i();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f203339o = h();
                                                                                        i();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f203338n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                j(3);
                                                            }
                                                        }
                                                    } else if (i16 == 20) {
                                                        if (b15 == 32) {
                                                            j(2);
                                                        } else if (b15 != 41) {
                                                            switch (b15) {
                                                                case 37:
                                                                    j(1);
                                                                    this.f203342r = 2;
                                                                    this.f203338n.f203357h = 2;
                                                                    break;
                                                                case 38:
                                                                    j(1);
                                                                    this.f203342r = 3;
                                                                    this.f203338n.f203357h = 3;
                                                                    break;
                                                                case 39:
                                                                    j(1);
                                                                    this.f203342r = 4;
                                                                    this.f203338n.f203357h = 4;
                                                                    break;
                                                                default:
                                                                    i17 = this.f203341q;
                                                                    if (i17 != 0) {
                                                                        if (b15 != 33) {
                                                                            switch (b15) {
                                                                                case 44:
                                                                                    this.f203339o = Collections.EMPTY_LIST;
                                                                                    if (i17 != 1) {
                                                                                        i();
                                                                                    } else {
                                                                                        i();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i17 == 1) {
                                                                                        C3795a c3795a16 = this.f203338n;
                                                                                        arrayList = c3795a16.f203351b;
                                                                                        arrayList.add(c3795a16.d());
                                                                                        c3795a16.f203352c.setLength(0);
                                                                                        c3795a16.f203350a.clear();
                                                                                        iMin = Math.min(c3795a16.f203357h, c3795a16.f203353d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    i();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f203339o = h();
                                                                                    i();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f203338n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            j(3);
                                                        }
                                                    }
                                                } else if (i15 != 23) {
                                                    if (i16 == 20) {
                                                        if (b15 == 32) {
                                                            j(2);
                                                        } else if (b15 != 41) {
                                                            switch (b15) {
                                                                case 37:
                                                                    j(1);
                                                                    this.f203342r = 2;
                                                                    this.f203338n.f203357h = 2;
                                                                    break;
                                                                case 38:
                                                                    j(1);
                                                                    this.f203342r = 3;
                                                                    this.f203338n.f203357h = 3;
                                                                    break;
                                                                case 39:
                                                                    j(1);
                                                                    this.f203342r = 4;
                                                                    this.f203338n.f203357h = 4;
                                                                    break;
                                                                default:
                                                                    i17 = this.f203341q;
                                                                    if (i17 != 0) {
                                                                        if (b15 != 33) {
                                                                            switch (b15) {
                                                                                case 44:
                                                                                    this.f203339o = Collections.EMPTY_LIST;
                                                                                    if (i17 != 1) {
                                                                                        i();
                                                                                    } else {
                                                                                        i();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i17 == 1) {
                                                                                        C3795a c3795a17 = this.f203338n;
                                                                                        arrayList = c3795a17.f203351b;
                                                                                        arrayList.add(c3795a17.d());
                                                                                        c3795a17.f203352c.setLength(0);
                                                                                        c3795a17.f203350a.clear();
                                                                                        iMin = Math.min(c3795a17.f203357h, c3795a17.f203353d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    i();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f203339o = h();
                                                                                    i();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f203338n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            j(3);
                                                        }
                                                    }
                                                } else if (i16 == 20) {
                                                    if (b15 == 32) {
                                                        j(2);
                                                    } else if (b15 != 41) {
                                                        switch (b15) {
                                                            case 37:
                                                                j(1);
                                                                this.f203342r = 2;
                                                                this.f203338n.f203357h = 2;
                                                                break;
                                                            case 38:
                                                                j(1);
                                                                this.f203342r = 3;
                                                                this.f203338n.f203357h = 3;
                                                                break;
                                                            case 39:
                                                                j(1);
                                                                this.f203342r = 4;
                                                                this.f203338n.f203357h = 4;
                                                                break;
                                                            default:
                                                                i17 = this.f203341q;
                                                                if (i17 != 0) {
                                                                    if (b15 != 33) {
                                                                        switch (b15) {
                                                                            case 44:
                                                                                this.f203339o = Collections.EMPTY_LIST;
                                                                                if (i17 != 1) {
                                                                                    i();
                                                                                } else {
                                                                                    i();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i17 == 1) {
                                                                                    C3795a c3795a18 = this.f203338n;
                                                                                    arrayList = c3795a18.f203351b;
                                                                                    arrayList.add(c3795a18.d());
                                                                                    c3795a18.f203352c.setLength(0);
                                                                                    c3795a18.f203350a.clear();
                                                                                    iMin = Math.min(c3795a18.f203357h, c3795a18.f203353d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                i();
                                                                                break;
                                                                            case 47:
                                                                                this.f203339o = h();
                                                                                i();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f203338n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        j(3);
                                                    }
                                                }
                                            } else if ((b14 & 240) != 16) {
                                                if (i15 != 23) {
                                                    if (i16 == 20) {
                                                        if (b15 == 32) {
                                                            j(2);
                                                        } else if (b15 != 41) {
                                                            switch (b15) {
                                                                case 37:
                                                                    j(1);
                                                                    this.f203342r = 2;
                                                                    this.f203338n.f203357h = 2;
                                                                    break;
                                                                case 38:
                                                                    j(1);
                                                                    this.f203342r = 3;
                                                                    this.f203338n.f203357h = 3;
                                                                    break;
                                                                case 39:
                                                                    j(1);
                                                                    this.f203342r = 4;
                                                                    this.f203338n.f203357h = 4;
                                                                    break;
                                                                default:
                                                                    i17 = this.f203341q;
                                                                    if (i17 != 0) {
                                                                        if (b15 != 33) {
                                                                            switch (b15) {
                                                                                case 44:
                                                                                    this.f203339o = Collections.EMPTY_LIST;
                                                                                    if (i17 != 1) {
                                                                                        i();
                                                                                    } else {
                                                                                        i();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i17 == 1) {
                                                                                        C3795a c3795a19 = this.f203338n;
                                                                                        arrayList = c3795a19.f203351b;
                                                                                        arrayList.add(c3795a19.d());
                                                                                        c3795a19.f203352c.setLength(0);
                                                                                        c3795a19.f203350a.clear();
                                                                                        iMin = Math.min(c3795a19.f203357h, c3795a19.f203353d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    i();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f203339o = h();
                                                                                    i();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f203338n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            j(3);
                                                        }
                                                    }
                                                } else if (i16 == 20) {
                                                    if (b15 == 32) {
                                                        j(2);
                                                    } else if (b15 != 41) {
                                                        switch (b15) {
                                                            case 37:
                                                                j(1);
                                                                this.f203342r = 2;
                                                                this.f203338n.f203357h = 2;
                                                                break;
                                                            case 38:
                                                                j(1);
                                                                this.f203342r = 3;
                                                                this.f203338n.f203357h = 3;
                                                                break;
                                                            case 39:
                                                                j(1);
                                                                this.f203342r = 4;
                                                                this.f203338n.f203357h = 4;
                                                                break;
                                                            default:
                                                                i17 = this.f203341q;
                                                                if (i17 != 0) {
                                                                    if (b15 != 33) {
                                                                        switch (b15) {
                                                                            case 44:
                                                                                this.f203339o = Collections.EMPTY_LIST;
                                                                                if (i17 != 1) {
                                                                                    i();
                                                                                } else {
                                                                                    i();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i17 == 1) {
                                                                                    C3795a c3795a110 = this.f203338n;
                                                                                    arrayList = c3795a110.f203351b;
                                                                                    arrayList.add(c3795a110.d());
                                                                                    c3795a110.f203352c.setLength(0);
                                                                                    c3795a110.f203350a.clear();
                                                                                    iMin = Math.min(c3795a110.f203357h, c3795a110.f203353d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                i();
                                                                                break;
                                                                            case 47:
                                                                                this.f203339o = h();
                                                                                i();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f203338n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        j(3);
                                                    }
                                                }
                                            } else if (i15 != 23) {
                                                if (i16 == 20) {
                                                    if (b15 == 32) {
                                                        j(2);
                                                    } else if (b15 != 41) {
                                                        switch (b15) {
                                                            case 37:
                                                                j(1);
                                                                this.f203342r = 2;
                                                                this.f203338n.f203357h = 2;
                                                                break;
                                                            case 38:
                                                                j(1);
                                                                this.f203342r = 3;
                                                                this.f203338n.f203357h = 3;
                                                                break;
                                                            case 39:
                                                                j(1);
                                                                this.f203342r = 4;
                                                                this.f203338n.f203357h = 4;
                                                                break;
                                                            default:
                                                                i17 = this.f203341q;
                                                                if (i17 != 0) {
                                                                    if (b15 != 33) {
                                                                        switch (b15) {
                                                                            case 44:
                                                                                this.f203339o = Collections.EMPTY_LIST;
                                                                                if (i17 != 1) {
                                                                                    i();
                                                                                } else {
                                                                                    i();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i17 == 1) {
                                                                                    C3795a c3795a111 = this.f203338n;
                                                                                    arrayList = c3795a111.f203351b;
                                                                                    arrayList.add(c3795a111.d());
                                                                                    c3795a111.f203352c.setLength(0);
                                                                                    c3795a111.f203350a.clear();
                                                                                    iMin = Math.min(c3795a111.f203357h, c3795a111.f203353d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                i();
                                                                                break;
                                                                            case 47:
                                                                                this.f203339o = h();
                                                                                i();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f203338n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        j(3);
                                                    }
                                                }
                                            } else if (i16 == 20) {
                                                if (b15 == 32) {
                                                    j(2);
                                                } else if (b15 != 41) {
                                                    switch (b15) {
                                                        case 37:
                                                            j(1);
                                                            this.f203342r = 2;
                                                            this.f203338n.f203357h = 2;
                                                            break;
                                                        case 38:
                                                            j(1);
                                                            this.f203342r = 3;
                                                            this.f203338n.f203357h = 3;
                                                            break;
                                                        case 39:
                                                            j(1);
                                                            this.f203342r = 4;
                                                            this.f203338n.f203357h = 4;
                                                            break;
                                                        default:
                                                            i17 = this.f203341q;
                                                            if (i17 != 0) {
                                                                if (b15 != 33) {
                                                                    switch (b15) {
                                                                        case 44:
                                                                            this.f203339o = Collections.EMPTY_LIST;
                                                                            if (i17 != 1) {
                                                                                i();
                                                                            } else {
                                                                                i();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i17 == 1) {
                                                                                C3795a c3795a112 = this.f203338n;
                                                                                arrayList = c3795a112.f203351b;
                                                                                arrayList.add(c3795a112.d());
                                                                                c3795a112.f203352c.setLength(0);
                                                                                c3795a112.f203350a.clear();
                                                                                iMin = Math.min(c3795a112.f203357h, c3795a112.f203353d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            i();
                                                                            break;
                                                                        case 47:
                                                                            this.f203339o = h();
                                                                            i();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f203338n.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    j(3);
                                                }
                                            }
                                        } else {
                                            i16 = b14 & 246;
                                            if (i16 != 18) {
                                                if (i15 != 17) {
                                                    if ((b14 & 240) != 16) {
                                                        if (i15 != 23) {
                                                            if (i16 == 20) {
                                                                if (b15 == 32) {
                                                                    j(2);
                                                                } else if (b15 != 41) {
                                                                    switch (b15) {
                                                                        case 37:
                                                                            j(1);
                                                                            this.f203342r = 2;
                                                                            this.f203338n.f203357h = 2;
                                                                            break;
                                                                        case 38:
                                                                            j(1);
                                                                            this.f203342r = 3;
                                                                            this.f203338n.f203357h = 3;
                                                                            break;
                                                                        case 39:
                                                                            j(1);
                                                                            this.f203342r = 4;
                                                                            this.f203338n.f203357h = 4;
                                                                            break;
                                                                        default:
                                                                            i17 = this.f203341q;
                                                                            if (i17 != 0) {
                                                                                if (b15 != 33) {
                                                                                    switch (b15) {
                                                                                        case 44:
                                                                                            this.f203339o = Collections.EMPTY_LIST;
                                                                                            if (i17 != 1) {
                                                                                                i();
                                                                                            } else {
                                                                                                i();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i17 == 1) {
                                                                                                C3795a c3795a113 = this.f203338n;
                                                                                                arrayList = c3795a113.f203351b;
                                                                                                arrayList.add(c3795a113.d());
                                                                                                c3795a113.f203352c.setLength(0);
                                                                                                c3795a113.f203350a.clear();
                                                                                                iMin = Math.min(c3795a113.f203357h, c3795a113.f203353d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            i();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f203339o = h();
                                                                                            i();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f203338n.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    j(3);
                                                                }
                                                            }
                                                        } else if (i16 == 20) {
                                                            if (b15 == 32) {
                                                                j(2);
                                                            } else if (b15 != 41) {
                                                                switch (b15) {
                                                                    case 37:
                                                                        j(1);
                                                                        this.f203342r = 2;
                                                                        this.f203338n.f203357h = 2;
                                                                        break;
                                                                    case 38:
                                                                        j(1);
                                                                        this.f203342r = 3;
                                                                        this.f203338n.f203357h = 3;
                                                                        break;
                                                                    case 39:
                                                                        j(1);
                                                                        this.f203342r = 4;
                                                                        this.f203338n.f203357h = 4;
                                                                        break;
                                                                    default:
                                                                        i17 = this.f203341q;
                                                                        if (i17 != 0) {
                                                                            if (b15 != 33) {
                                                                                switch (b15) {
                                                                                    case 44:
                                                                                        this.f203339o = Collections.EMPTY_LIST;
                                                                                        if (i17 != 1) {
                                                                                            i();
                                                                                        } else {
                                                                                            i();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i17 == 1) {
                                                                                            C3795a c3795a114 = this.f203338n;
                                                                                            arrayList = c3795a114.f203351b;
                                                                                            arrayList.add(c3795a114.d());
                                                                                            c3795a114.f203352c.setLength(0);
                                                                                            c3795a114.f203350a.clear();
                                                                                            iMin = Math.min(c3795a114.f203357h, c3795a114.f203353d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        i();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f203339o = h();
                                                                                        i();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f203338n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                j(3);
                                                            }
                                                        }
                                                    } else if (i15 != 23) {
                                                        if (i16 == 20) {
                                                            if (b15 == 32) {
                                                                j(2);
                                                            } else if (b15 != 41) {
                                                                switch (b15) {
                                                                    case 37:
                                                                        j(1);
                                                                        this.f203342r = 2;
                                                                        this.f203338n.f203357h = 2;
                                                                        break;
                                                                    case 38:
                                                                        j(1);
                                                                        this.f203342r = 3;
                                                                        this.f203338n.f203357h = 3;
                                                                        break;
                                                                    case 39:
                                                                        j(1);
                                                                        this.f203342r = 4;
                                                                        this.f203338n.f203357h = 4;
                                                                        break;
                                                                    default:
                                                                        i17 = this.f203341q;
                                                                        if (i17 != 0) {
                                                                            if (b15 != 33) {
                                                                                switch (b15) {
                                                                                    case 44:
                                                                                        this.f203339o = Collections.EMPTY_LIST;
                                                                                        if (i17 != 1) {
                                                                                            i();
                                                                                        } else {
                                                                                            i();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i17 == 1) {
                                                                                            C3795a c3795a115 = this.f203338n;
                                                                                            arrayList = c3795a115.f203351b;
                                                                                            arrayList.add(c3795a115.d());
                                                                                            c3795a115.f203352c.setLength(0);
                                                                                            c3795a115.f203350a.clear();
                                                                                            iMin = Math.min(c3795a115.f203357h, c3795a115.f203353d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        i();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f203339o = h();
                                                                                        i();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f203338n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                j(3);
                                                            }
                                                        }
                                                    } else if (i16 == 20) {
                                                        if (b15 == 32) {
                                                            j(2);
                                                        } else if (b15 != 41) {
                                                            switch (b15) {
                                                                case 37:
                                                                    j(1);
                                                                    this.f203342r = 2;
                                                                    this.f203338n.f203357h = 2;
                                                                    break;
                                                                case 38:
                                                                    j(1);
                                                                    this.f203342r = 3;
                                                                    this.f203338n.f203357h = 3;
                                                                    break;
                                                                case 39:
                                                                    j(1);
                                                                    this.f203342r = 4;
                                                                    this.f203338n.f203357h = 4;
                                                                    break;
                                                                default:
                                                                    i17 = this.f203341q;
                                                                    if (i17 != 0) {
                                                                        if (b15 != 33) {
                                                                            switch (b15) {
                                                                                case 44:
                                                                                    this.f203339o = Collections.EMPTY_LIST;
                                                                                    if (i17 != 1) {
                                                                                        i();
                                                                                    } else {
                                                                                        i();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i17 == 1) {
                                                                                        C3795a c3795a116 = this.f203338n;
                                                                                        arrayList = c3795a116.f203351b;
                                                                                        arrayList.add(c3795a116.d());
                                                                                        c3795a116.f203352c.setLength(0);
                                                                                        c3795a116.f203350a.clear();
                                                                                        iMin = Math.min(c3795a116.f203357h, c3795a116.f203353d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    i();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f203339o = h();
                                                                                    i();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f203338n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            j(3);
                                                        }
                                                    }
                                                } else if ((b14 & 240) != 16) {
                                                    if (i15 != 23) {
                                                        if (i16 == 20) {
                                                            if (b15 == 32) {
                                                                j(2);
                                                            } else if (b15 != 41) {
                                                                switch (b15) {
                                                                    case 37:
                                                                        j(1);
                                                                        this.f203342r = 2;
                                                                        this.f203338n.f203357h = 2;
                                                                        break;
                                                                    case 38:
                                                                        j(1);
                                                                        this.f203342r = 3;
                                                                        this.f203338n.f203357h = 3;
                                                                        break;
                                                                    case 39:
                                                                        j(1);
                                                                        this.f203342r = 4;
                                                                        this.f203338n.f203357h = 4;
                                                                        break;
                                                                    default:
                                                                        i17 = this.f203341q;
                                                                        if (i17 != 0) {
                                                                            if (b15 != 33) {
                                                                                switch (b15) {
                                                                                    case 44:
                                                                                        this.f203339o = Collections.EMPTY_LIST;
                                                                                        if (i17 != 1) {
                                                                                            i();
                                                                                        } else {
                                                                                            i();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i17 == 1) {
                                                                                            C3795a c3795a117 = this.f203338n;
                                                                                            arrayList = c3795a117.f203351b;
                                                                                            arrayList.add(c3795a117.d());
                                                                                            c3795a117.f203352c.setLength(0);
                                                                                            c3795a117.f203350a.clear();
                                                                                            iMin = Math.min(c3795a117.f203357h, c3795a117.f203353d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        i();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f203339o = h();
                                                                                        i();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f203338n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                j(3);
                                                            }
                                                        }
                                                    } else if (i16 == 20) {
                                                        if (b15 == 32) {
                                                            j(2);
                                                        } else if (b15 != 41) {
                                                            switch (b15) {
                                                                case 37:
                                                                    j(1);
                                                                    this.f203342r = 2;
                                                                    this.f203338n.f203357h = 2;
                                                                    break;
                                                                case 38:
                                                                    j(1);
                                                                    this.f203342r = 3;
                                                                    this.f203338n.f203357h = 3;
                                                                    break;
                                                                case 39:
                                                                    j(1);
                                                                    this.f203342r = 4;
                                                                    this.f203338n.f203357h = 4;
                                                                    break;
                                                                default:
                                                                    i17 = this.f203341q;
                                                                    if (i17 != 0) {
                                                                        if (b15 != 33) {
                                                                            switch (b15) {
                                                                                case 44:
                                                                                    this.f203339o = Collections.EMPTY_LIST;
                                                                                    if (i17 != 1) {
                                                                                        i();
                                                                                    } else {
                                                                                        i();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i17 == 1) {
                                                                                        C3795a c3795a118 = this.f203338n;
                                                                                        arrayList = c3795a118.f203351b;
                                                                                        arrayList.add(c3795a118.d());
                                                                                        c3795a118.f203352c.setLength(0);
                                                                                        c3795a118.f203350a.clear();
                                                                                        iMin = Math.min(c3795a118.f203357h, c3795a118.f203353d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    i();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f203339o = h();
                                                                                    i();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f203338n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            j(3);
                                                        }
                                                    }
                                                } else if (i15 != 23) {
                                                    if (i16 == 20) {
                                                        if (b15 == 32) {
                                                            j(2);
                                                        } else if (b15 != 41) {
                                                            switch (b15) {
                                                                case 37:
                                                                    j(1);
                                                                    this.f203342r = 2;
                                                                    this.f203338n.f203357h = 2;
                                                                    break;
                                                                case 38:
                                                                    j(1);
                                                                    this.f203342r = 3;
                                                                    this.f203338n.f203357h = 3;
                                                                    break;
                                                                case 39:
                                                                    j(1);
                                                                    this.f203342r = 4;
                                                                    this.f203338n.f203357h = 4;
                                                                    break;
                                                                default:
                                                                    i17 = this.f203341q;
                                                                    if (i17 != 0) {
                                                                        if (b15 != 33) {
                                                                            switch (b15) {
                                                                                case 44:
                                                                                    this.f203339o = Collections.EMPTY_LIST;
                                                                                    if (i17 != 1) {
                                                                                        i();
                                                                                    } else {
                                                                                        i();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i17 == 1) {
                                                                                        C3795a c3795a119 = this.f203338n;
                                                                                        arrayList = c3795a119.f203351b;
                                                                                        arrayList.add(c3795a119.d());
                                                                                        c3795a119.f203352c.setLength(0);
                                                                                        c3795a119.f203350a.clear();
                                                                                        iMin = Math.min(c3795a119.f203357h, c3795a119.f203353d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    i();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f203339o = h();
                                                                                    i();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f203338n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            j(3);
                                                        }
                                                    }
                                                } else if (i16 == 20) {
                                                    if (b15 == 32) {
                                                        j(2);
                                                    } else if (b15 != 41) {
                                                        switch (b15) {
                                                            case 37:
                                                                j(1);
                                                                this.f203342r = 2;
                                                                this.f203338n.f203357h = 2;
                                                                break;
                                                            case 38:
                                                                j(1);
                                                                this.f203342r = 3;
                                                                this.f203338n.f203357h = 3;
                                                                break;
                                                            case 39:
                                                                j(1);
                                                                this.f203342r = 4;
                                                                this.f203338n.f203357h = 4;
                                                                break;
                                                            default:
                                                                i17 = this.f203341q;
                                                                if (i17 != 0) {
                                                                    if (b15 != 33) {
                                                                        switch (b15) {
                                                                            case 44:
                                                                                this.f203339o = Collections.EMPTY_LIST;
                                                                                if (i17 != 1) {
                                                                                    i();
                                                                                } else {
                                                                                    i();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i17 == 1) {
                                                                                    C3795a c3795a1110 = this.f203338n;
                                                                                    arrayList = c3795a1110.f203351b;
                                                                                    arrayList.add(c3795a1110.d());
                                                                                    c3795a1110.f203352c.setLength(0);
                                                                                    c3795a1110.f203350a.clear();
                                                                                    iMin = Math.min(c3795a1110.f203357h, c3795a1110.f203353d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                i();
                                                                                break;
                                                                            case 47:
                                                                                this.f203339o = h();
                                                                                i();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f203338n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        j(3);
                                                    }
                                                }
                                            } else if (i15 != 17) {
                                                if ((b14 & 240) != 16) {
                                                    if (i15 != 23) {
                                                        if (i16 == 20) {
                                                            if (b15 == 32) {
                                                                j(2);
                                                            } else if (b15 != 41) {
                                                                switch (b15) {
                                                                    case 37:
                                                                        j(1);
                                                                        this.f203342r = 2;
                                                                        this.f203338n.f203357h = 2;
                                                                        break;
                                                                    case 38:
                                                                        j(1);
                                                                        this.f203342r = 3;
                                                                        this.f203338n.f203357h = 3;
                                                                        break;
                                                                    case 39:
                                                                        j(1);
                                                                        this.f203342r = 4;
                                                                        this.f203338n.f203357h = 4;
                                                                        break;
                                                                    default:
                                                                        i17 = this.f203341q;
                                                                        if (i17 != 0) {
                                                                            if (b15 != 33) {
                                                                                switch (b15) {
                                                                                    case 44:
                                                                                        this.f203339o = Collections.EMPTY_LIST;
                                                                                        if (i17 != 1) {
                                                                                            i();
                                                                                        } else {
                                                                                            i();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i17 == 1) {
                                                                                            C3795a c3795a1111 = this.f203338n;
                                                                                            arrayList = c3795a1111.f203351b;
                                                                                            arrayList.add(c3795a1111.d());
                                                                                            c3795a1111.f203352c.setLength(0);
                                                                                            c3795a1111.f203350a.clear();
                                                                                            iMin = Math.min(c3795a1111.f203357h, c3795a1111.f203353d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        i();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f203339o = h();
                                                                                        i();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f203338n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                j(3);
                                                            }
                                                        }
                                                    } else if (i16 == 20) {
                                                        if (b15 == 32) {
                                                            j(2);
                                                        } else if (b15 != 41) {
                                                            switch (b15) {
                                                                case 37:
                                                                    j(1);
                                                                    this.f203342r = 2;
                                                                    this.f203338n.f203357h = 2;
                                                                    break;
                                                                case 38:
                                                                    j(1);
                                                                    this.f203342r = 3;
                                                                    this.f203338n.f203357h = 3;
                                                                    break;
                                                                case 39:
                                                                    j(1);
                                                                    this.f203342r = 4;
                                                                    this.f203338n.f203357h = 4;
                                                                    break;
                                                                default:
                                                                    i17 = this.f203341q;
                                                                    if (i17 != 0) {
                                                                        if (b15 != 33) {
                                                                            switch (b15) {
                                                                                case 44:
                                                                                    this.f203339o = Collections.EMPTY_LIST;
                                                                                    if (i17 != 1) {
                                                                                        i();
                                                                                    } else {
                                                                                        i();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i17 == 1) {
                                                                                        C3795a c3795a1112 = this.f203338n;
                                                                                        arrayList = c3795a1112.f203351b;
                                                                                        arrayList.add(c3795a1112.d());
                                                                                        c3795a1112.f203352c.setLength(0);
                                                                                        c3795a1112.f203350a.clear();
                                                                                        iMin = Math.min(c3795a1112.f203357h, c3795a1112.f203353d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    i();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f203339o = h();
                                                                                    i();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f203338n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            j(3);
                                                        }
                                                    }
                                                } else if (i15 != 23) {
                                                    if (i16 == 20) {
                                                        if (b15 == 32) {
                                                            j(2);
                                                        } else if (b15 != 41) {
                                                            switch (b15) {
                                                                case 37:
                                                                    j(1);
                                                                    this.f203342r = 2;
                                                                    this.f203338n.f203357h = 2;
                                                                    break;
                                                                case 38:
                                                                    j(1);
                                                                    this.f203342r = 3;
                                                                    this.f203338n.f203357h = 3;
                                                                    break;
                                                                case 39:
                                                                    j(1);
                                                                    this.f203342r = 4;
                                                                    this.f203338n.f203357h = 4;
                                                                    break;
                                                                default:
                                                                    i17 = this.f203341q;
                                                                    if (i17 != 0) {
                                                                        if (b15 != 33) {
                                                                            switch (b15) {
                                                                                case 44:
                                                                                    this.f203339o = Collections.EMPTY_LIST;
                                                                                    if (i17 != 1) {
                                                                                        i();
                                                                                    } else {
                                                                                        i();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i17 == 1) {
                                                                                        C3795a c3795a1113 = this.f203338n;
                                                                                        arrayList = c3795a1113.f203351b;
                                                                                        arrayList.add(c3795a1113.d());
                                                                                        c3795a1113.f203352c.setLength(0);
                                                                                        c3795a1113.f203350a.clear();
                                                                                        iMin = Math.min(c3795a1113.f203357h, c3795a1113.f203353d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    i();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f203339o = h();
                                                                                    i();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f203338n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            j(3);
                                                        }
                                                    }
                                                } else if (i16 == 20) {
                                                    if (b15 == 32) {
                                                        j(2);
                                                    } else if (b15 != 41) {
                                                        switch (b15) {
                                                            case 37:
                                                                j(1);
                                                                this.f203342r = 2;
                                                                this.f203338n.f203357h = 2;
                                                                break;
                                                            case 38:
                                                                j(1);
                                                                this.f203342r = 3;
                                                                this.f203338n.f203357h = 3;
                                                                break;
                                                            case 39:
                                                                j(1);
                                                                this.f203342r = 4;
                                                                this.f203338n.f203357h = 4;
                                                                break;
                                                            default:
                                                                i17 = this.f203341q;
                                                                if (i17 != 0) {
                                                                    if (b15 != 33) {
                                                                        switch (b15) {
                                                                            case 44:
                                                                                this.f203339o = Collections.EMPTY_LIST;
                                                                                if (i17 != 1) {
                                                                                    i();
                                                                                } else {
                                                                                    i();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i17 == 1) {
                                                                                    C3795a c3795a1114 = this.f203338n;
                                                                                    arrayList = c3795a1114.f203351b;
                                                                                    arrayList.add(c3795a1114.d());
                                                                                    c3795a1114.f203352c.setLength(0);
                                                                                    c3795a1114.f203350a.clear();
                                                                                    iMin = Math.min(c3795a1114.f203357h, c3795a1114.f203353d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                i();
                                                                                break;
                                                                            case 47:
                                                                                this.f203339o = h();
                                                                                i();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f203338n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        j(3);
                                                    }
                                                }
                                            } else if ((b14 & 240) != 16) {
                                                if (i15 != 23) {
                                                    if (i16 == 20) {
                                                        if (b15 == 32) {
                                                            j(2);
                                                        } else if (b15 != 41) {
                                                            switch (b15) {
                                                                case 37:
                                                                    j(1);
                                                                    this.f203342r = 2;
                                                                    this.f203338n.f203357h = 2;
                                                                    break;
                                                                case 38:
                                                                    j(1);
                                                                    this.f203342r = 3;
                                                                    this.f203338n.f203357h = 3;
                                                                    break;
                                                                case 39:
                                                                    j(1);
                                                                    this.f203342r = 4;
                                                                    this.f203338n.f203357h = 4;
                                                                    break;
                                                                default:
                                                                    i17 = this.f203341q;
                                                                    if (i17 != 0) {
                                                                        if (b15 != 33) {
                                                                            switch (b15) {
                                                                                case 44:
                                                                                    this.f203339o = Collections.EMPTY_LIST;
                                                                                    if (i17 != 1) {
                                                                                        i();
                                                                                    } else {
                                                                                        i();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i17 == 1) {
                                                                                        C3795a c3795a1115 = this.f203338n;
                                                                                        arrayList = c3795a1115.f203351b;
                                                                                        arrayList.add(c3795a1115.d());
                                                                                        c3795a1115.f203352c.setLength(0);
                                                                                        c3795a1115.f203350a.clear();
                                                                                        iMin = Math.min(c3795a1115.f203357h, c3795a1115.f203353d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    i();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f203339o = h();
                                                                                    i();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f203338n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            j(3);
                                                        }
                                                    }
                                                } else if (i16 == 20) {
                                                    if (b15 == 32) {
                                                        j(2);
                                                    } else if (b15 != 41) {
                                                        switch (b15) {
                                                            case 37:
                                                                j(1);
                                                                this.f203342r = 2;
                                                                this.f203338n.f203357h = 2;
                                                                break;
                                                            case 38:
                                                                j(1);
                                                                this.f203342r = 3;
                                                                this.f203338n.f203357h = 3;
                                                                break;
                                                            case 39:
                                                                j(1);
                                                                this.f203342r = 4;
                                                                this.f203338n.f203357h = 4;
                                                                break;
                                                            default:
                                                                i17 = this.f203341q;
                                                                if (i17 != 0) {
                                                                    if (b15 != 33) {
                                                                        switch (b15) {
                                                                            case 44:
                                                                                this.f203339o = Collections.EMPTY_LIST;
                                                                                if (i17 != 1) {
                                                                                    i();
                                                                                } else {
                                                                                    i();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i17 == 1) {
                                                                                    C3795a c3795a1116 = this.f203338n;
                                                                                    arrayList = c3795a1116.f203351b;
                                                                                    arrayList.add(c3795a1116.d());
                                                                                    c3795a1116.f203352c.setLength(0);
                                                                                    c3795a1116.f203350a.clear();
                                                                                    iMin = Math.min(c3795a1116.f203357h, c3795a1116.f203353d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                i();
                                                                                break;
                                                                            case 47:
                                                                                this.f203339o = h();
                                                                                i();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f203338n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        j(3);
                                                    }
                                                }
                                            } else if (i15 != 23) {
                                                if (i16 == 20) {
                                                    if (b15 == 32) {
                                                        j(2);
                                                    } else if (b15 != 41) {
                                                        switch (b15) {
                                                            case 37:
                                                                j(1);
                                                                this.f203342r = 2;
                                                                this.f203338n.f203357h = 2;
                                                                break;
                                                            case 38:
                                                                j(1);
                                                                this.f203342r = 3;
                                                                this.f203338n.f203357h = 3;
                                                                break;
                                                            case 39:
                                                                j(1);
                                                                this.f203342r = 4;
                                                                this.f203338n.f203357h = 4;
                                                                break;
                                                            default:
                                                                i17 = this.f203341q;
                                                                if (i17 != 0) {
                                                                    if (b15 != 33) {
                                                                        switch (b15) {
                                                                            case 44:
                                                                                this.f203339o = Collections.EMPTY_LIST;
                                                                                if (i17 != 1) {
                                                                                    i();
                                                                                } else {
                                                                                    i();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i17 == 1) {
                                                                                    C3795a c3795a1117 = this.f203338n;
                                                                                    arrayList = c3795a1117.f203351b;
                                                                                    arrayList.add(c3795a1117.d());
                                                                                    c3795a1117.f203352c.setLength(0);
                                                                                    c3795a1117.f203350a.clear();
                                                                                    iMin = Math.min(c3795a1117.f203357h, c3795a1117.f203353d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                i();
                                                                                break;
                                                                            case 47:
                                                                                this.f203339o = h();
                                                                                i();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f203338n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        j(3);
                                                    }
                                                }
                                            } else if (i16 == 20) {
                                                if (b15 == 32) {
                                                    j(2);
                                                } else if (b15 != 41) {
                                                    switch (b15) {
                                                        case 37:
                                                            j(1);
                                                            this.f203342r = 2;
                                                            this.f203338n.f203357h = 2;
                                                            break;
                                                        case 38:
                                                            j(1);
                                                            this.f203342r = 3;
                                                            this.f203338n.f203357h = 3;
                                                            break;
                                                        case 39:
                                                            j(1);
                                                            this.f203342r = 4;
                                                            this.f203338n.f203357h = 4;
                                                            break;
                                                        default:
                                                            i17 = this.f203341q;
                                                            if (i17 != 0) {
                                                                if (b15 != 33) {
                                                                    switch (b15) {
                                                                        case 44:
                                                                            this.f203339o = Collections.EMPTY_LIST;
                                                                            if (i17 != 1) {
                                                                                i();
                                                                            } else {
                                                                                i();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i17 == 1) {
                                                                                C3795a c3795a1118 = this.f203338n;
                                                                                arrayList = c3795a1118.f203351b;
                                                                                arrayList.add(c3795a1118.d());
                                                                                c3795a1118.f203352c.setLength(0);
                                                                                c3795a1118.f203350a.clear();
                                                                                iMin = Math.min(c3795a1118.f203357h, c3795a1118.f203353d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            i();
                                                                            break;
                                                                        case 47:
                                                                            this.f203339o = h();
                                                                            i();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f203338n.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    j(3);
                                                }
                                            }
                                        }
                                    } else {
                                        C3795a c3795a20 = this.f203338n;
                                        int i27 = (b14 & Ascii.DEL) - 32;
                                        iArr = C;
                                        c3795a20.a((char) iArr[i27]);
                                        if ((b15 & 224) != 0) {
                                            this.f203338n.a((char) iArr[(b15 & Ascii.DEL) - 32]);
                                        }
                                    }
                                    z15 = true;
                                }
                            }
                        } else if (z16) {
                            i();
                            z15 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // zb.c, ia.c
    /* JADX INFO: renamed from: f */
    public final m dequeueOutputBuffer() {
        m mVarPollFirst;
        m mVarDequeueOutputBuffer = super.dequeueOutputBuffer();
        if (mVarDequeueOutputBuffer != null) {
            return mVarDequeueOutputBuffer;
        }
        long j8 = this.f203336l;
        if (j8 == C.TIME_UNSET) {
            return null;
        }
        long j14 = this.f203349y;
        if (j14 == C.TIME_UNSET || this.f203408e - j14 < j8 || (mVarPollFirst = this.f203405b.pollFirst()) == null) {
            return null;
        }
        this.f203339o = Collections.EMPTY_LIST;
        this.f203349y = C.TIME_UNSET;
        d dVarD = d();
        long j15 = this.f203408e;
        mVarPollFirst.f92385b = j15;
        mVarPollFirst.f195660d = dVarD;
        mVarPollFirst.f195661e = j15;
        return mVarPollFirst;
    }

    @Override // zb.c, ia.c
    public final void flush() {
        super.flush();
        this.f203339o = null;
        this.f203340p = null;
        j(0);
        this.f203342r = 4;
        this.f203338n.f203357h = 4;
        i();
        this.f203343s = false;
        this.f203344t = false;
        this.f203345u = (byte) 0;
        this.f203346v = (byte) 0;
        this.f203347w = 0;
        this.f203348x = true;
        this.f203349y = C.TIME_UNSET;
    }

    @Override // zb.c
    public final boolean g() {
        return this.f203339o != this.f203340p;
    }

    public final ArrayList h() {
        ArrayList<C3795a> arrayList = this.f203337m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i14 = 0; i14 < size; i14++) {
            ea.a aVarC = arrayList.get(i14).c(Integer.MIN_VALUE);
            arrayList2.add(aVarC);
            if (aVarC != null) {
                iMin = Math.min(iMin, aVarC.f63559i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i15 = 0; i15 < size; i15++) {
            ea.a aVarC2 = (ea.a) arrayList2.get(i15);
            if (aVarC2 != null) {
                if (aVarC2.f63559i != iMin) {
                    aVarC2 = arrayList.get(i15).c(iMin);
                    aVarC2.getClass();
                }
                arrayList3.add(aVarC2);
            }
        }
        return arrayList3;
    }

    public final void i() {
        C3795a c3795a = this.f203338n;
        c3795a.f203356g = this.f203341q;
        c3795a.f203350a.clear();
        c3795a.f203351b.clear();
        c3795a.f203352c.setLength(0);
        c3795a.f203353d = 15;
        c3795a.f203354e = 0;
        c3795a.f203355f = 0;
        ArrayList<C3795a> arrayList = this.f203337m;
        arrayList.clear();
        arrayList.add(this.f203338n);
    }

    public final void j(int i14) {
        int i15 = this.f203341q;
        if (i15 == i14) {
            return;
        }
        this.f203341q = i14;
        if (i14 != 3) {
            i();
            if (i15 == 3 || i14 == 1 || i14 == 0) {
                this.f203339o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i16 = 0;
        while (true) {
            ArrayList<C3795a> arrayList = this.f203337m;
            if (i16 >= arrayList.size()) {
                return;
            }
            arrayList.get(i16).f203356g = i14;
            i16++;
        }
    }

    @Override // zb.c, ia.c
    public final void release() {
    }
}
