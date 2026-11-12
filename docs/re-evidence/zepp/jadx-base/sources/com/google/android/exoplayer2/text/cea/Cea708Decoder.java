package com.google.android.exoplayer2.text.cea;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.SubtitleInputBuffer;
import com.google.android.exoplayer2.text.SubtitleOutputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import io.netty.util.internal.StringUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.text.Typography;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Cea708Decoder extends com.google.android.exoplayer2.text.cea.c {
    private static final int A = 159;
    private static final int A0 = 49;
    private static final int B = 255;
    private static final int B0 = 50;
    private static final int C = 31;
    private static final int C0 = 51;
    private static final int D = 127;
    private static final int D0 = 52;
    private static final int E = 159;
    private static final int E0 = 53;
    private static final int F = 255;
    private static final int F0 = 57;
    private static final int G = 0;
    private static final int G0 = 58;
    private static final int H = 3;
    private static final int H0 = 60;
    private static final int I = 8;
    private static final int I0 = 61;
    private static final int J = 12;
    private static final int J0 = 63;
    private static final int K = 13;
    private static final int K0 = 118;
    private static final int L = 14;
    private static final int L0 = 119;
    private static final int M = 16;
    private static final int M0 = 120;
    private static final int N = 17;
    private static final int N0 = 121;
    private static final int O = 23;
    private static final int O0 = 122;
    private static final int P = 24;
    private static final int P0 = 123;
    private static final int Q = 31;
    private static final int Q0 = 124;
    private static final int R = 128;
    private static final int R0 = 125;
    private static final int S = 129;
    private static final int S0 = 126;
    private static final int T = 130;
    private static final int T0 = 127;
    private static final int U = 131;
    private static final int V = 132;
    private static final int W = 133;
    private static final int X = 134;
    private static final int Y = 135;
    private static final int Z = 136;
    private static final int a0 = 137;
    private static final int b0 = 138;
    private static final int c0 = 139;
    private static final int d0 = 140;
    private static final int e0 = 141;
    private static final int f0 = 142;
    private static final int g0 = 143;
    private static final int h0 = 144;
    private static final int i0 = 145;
    private static final int j0 = 146;
    private static final int k0 = 151;
    private static final int l0 = 152;
    private static final int m0 = 153;
    private static final int n0 = 154;
    private static final int o0 = 155;
    private static final int p0 = 156;
    private static final int q0 = 157;
    private static final int r0 = 158;
    private static final int s0 = 159;
    private static final String t = "Cea708Decoder";
    private static final int t0 = 127;
    private static final int u = 8;
    private static final int u0 = 32;
    private static final int v = 2;
    private static final int v0 = 33;
    private static final int w = 3;
    private static final int w0 = 37;
    private static final int x = 4;
    private static final int x0 = 42;
    private static final int y = 31;
    private static final int y0 = 44;
    private static final int z = 127;
    private static final int z0 = 48;
    private final ParsableByteArray i = new ParsableByteArray();
    private final ParsableBitArray j = new ParsableBitArray();
    private int k = -1;
    private final boolean l;
    private final int m;
    private final b[] n;
    private b o;

    @Nullable
    private List<Cue> p;

    @Nullable
    private List<Cue> q;

    @Nullable
    private c r;
    private int s;

    public static final class a {
        private static final Comparator<a> c = new Comparator() { // from class: com.google.android.exoplayer2.text.cea.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Cea708Decoder.a.c((Cea708Decoder.a) obj, (Cea708Decoder.a) obj2);
            }
        };
        public final Cue a;
        public final int b;

        public a(CharSequence text, Layout.Alignment textAlignment, float line, int lineType, int lineAnchor, float position, int positionAnchor, float size, boolean windowColorSet, int windowColor, int priority) {
            Cue.Builder size2 = new Cue.Builder().setText(text).setTextAlignment(textAlignment).setLine(line, lineType).setLineAnchor(lineAnchor).setPosition(position).setPositionAnchor(positionAnchor).setSize(size);
            if (windowColorSet) {
                size2.setWindowColor(windowColor);
            }
            this.a = size2.build();
            this.b = priority;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int c(a aVar, a aVar2) {
            return Integer.compare(aVar2.b, aVar.b);
        }
    }

    public static final class b {
        private static final int A = 15;
        private static final int B = 0;
        private static final int C = 1;
        private static final int D = 2;
        private static final int E = 3;
        private static final int F = 0;
        private static final int G = 1;
        private static final int H = 2;
        private static final int I = 3;
        private static final int J = 0;
        private static final int K = 3;
        public static final int L = h(2, 2, 2, 0);
        public static final int M;
        public static final int N;
        private static final int O = 1;
        private static final int P = 0;
        private static final int Q = 1;
        private static final int R = 2;
        private static final int S = 3;
        private static final int T = 4;
        private static final int U = 1;
        private static final int[] V;
        private static final int[] W;
        private static final int[] X;
        private static final boolean[] Y;
        private static final int[] Z;
        private static final int[] a0;
        private static final int[] b0;
        private static final int[] c0;
        private static final int w = 99;
        private static final int x = 74;
        private static final int y = 209;
        private static final int z = 4;
        private final List<SpannableString> a = new ArrayList();
        private final SpannableStringBuilder b = new SpannableStringBuilder();
        private boolean c;
        private boolean d;
        private int e;
        private boolean f;
        private int g;
        private int h;
        private int i;
        private int j;
        private boolean k;
        private int l;
        private int m;
        private int n;
        private int o;
        private int p;
        private int q;
        private int r;
        private int s;
        private int t;
        private int u;
        private int v;

        static {
            int iH = h(0, 0, 0, 0);
            M = iH;
            int iH2 = h(0, 0, 0, 3);
            N = iH2;
            V = new int[]{0, 0, 0, 0, 0, 2, 0};
            W = new int[]{0, 0, 0, 0, 0, 0, 2};
            X = new int[]{3, 3, 3, 3, 3, 3, 1};
            Y = new boolean[]{false, false, false, true, true, true, false};
            Z = new int[]{iH, iH2, iH, iH, iH2, iH, iH};
            a0 = new int[]{0, 1, 2, 3, 4, 3, 4};
            b0 = new int[]{0, 0, 0, 0, 0, 3, 3};
            c0 = new int[]{iH, iH, iH, iH, iH, iH2, iH2};
        }

        public b() {
            l();
        }

        public static int g(int red, int green, int blue) {
            return h(red, green, blue, 0);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0021  */
        public static int h(int red, int green, int blue, int opacity) {
            int i;
            Assertions.checkIndex(red, 0, 4);
            Assertions.checkIndex(green, 0, 4);
            Assertions.checkIndex(blue, 0, 4);
            Assertions.checkIndex(opacity, 0, 4);
            if (opacity == 0 || opacity == 1) {
                i = 255;
            } else if (opacity == 2) {
                i = 127;
            } else if (opacity != 3) {
                i = 255;
            } else {
                i = 0;
            }
            return Color.argb(i, red > 1 ? 255 : 0, green > 1 ? 255 : 0, blue > 1 ? 255 : 0);
        }

        public void a(char text) {
            if (text != '\n') {
                this.b.append(text);
                return;
            }
            this.a.add(d());
            this.b.clear();
            if (this.p != -1) {
                this.p = 0;
            }
            if (this.q != -1) {
                this.q = 0;
            }
            if (this.r != -1) {
                this.r = 0;
            }
            if (this.t != -1) {
                this.t = 0;
            }
            while (true) {
                if ((!this.k || this.a.size() < this.j) && this.a.size() < 15) {
                    return;
                } else {
                    this.a.remove(0);
                }
            }
        }

        public void b() {
            int length = this.b.length();
            if (length > 0) {
                this.b.delete(length - 1, length);
            }
        }

        @Nullable
        public a c() {
            Layout.Alignment alignment;
            float f;
            float f2;
            if (j()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i = 0; i < this.a.size(); i++) {
                spannableStringBuilder.append((CharSequence) this.a.get(i));
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
            return new a(spannableStringBuilder, alignment2, f4, 0, i4 / 3 == 0 ? 0 : i4 / 3 == 1 ? 1 : 2, f3, i4 % 3 == 0 ? 0 : i4 % 3 == 1 ? 1 : 2, -3.4028235E38f, this.o != M, this.o, this.e);
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.p, length, 33);
                }
                if (this.q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.q, length, 33);
                }
                if (this.r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.s), this.r, length, 33);
                }
                if (this.t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.u), this.t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.a.clear();
            this.b.clear();
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.t = -1;
            this.v = 0;
        }

        public void f(boolean visible, boolean rowLock, boolean columnLock, int priority, boolean relativePositioning, int verticalAnchor, int horizontalAnchor, int rowCount, int columnCount, int anchorId, int windowStyleId, int penStyleId) {
            this.c = true;
            this.d = visible;
            this.k = rowLock;
            this.e = priority;
            this.f = relativePositioning;
            this.g = verticalAnchor;
            this.h = horizontalAnchor;
            this.i = anchorId;
            int i = rowCount + 1;
            if (this.j != i) {
                this.j = i;
                while (true) {
                    if ((!rowLock || this.a.size() < this.j) && this.a.size() < 15) {
                        break;
                    } else {
                        this.a.remove(0);
                    }
                }
            }
            if (windowStyleId != 0 && this.m != windowStyleId) {
                this.m = windowStyleId;
                int i2 = windowStyleId - 1;
                q(Z[i2], N, Y[i2], 0, W[i2], X[i2], V[i2]);
            }
            if (penStyleId == 0 || this.n == penStyleId) {
                return;
            }
            this.n = penStyleId;
            int i3 = penStyleId - 1;
            m(0, 1, 1, false, false, b0[i3], a0[i3]);
            n(L, c0[i3], M);
        }

        public boolean i() {
            return this.c;
        }

        public boolean j() {
            return !i() || (this.a.isEmpty() && this.b.length() == 0);
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
            this.k = true;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            int i = M;
            this.o = i;
            this.s = L;
            this.u = i;
        }

        public void m(int textTag, int offset, int penSize, boolean italicsToggle, boolean underlineToggle, int edgeType, int fontStyle) {
            if (this.p != -1) {
                if (!italicsToggle) {
                    this.b.setSpan(new StyleSpan(2), this.p, this.b.length(), 33);
                    this.p = -1;
                }
            } else if (italicsToggle) {
                this.p = this.b.length();
            }
            if (this.q == -1) {
                if (underlineToggle) {
                    this.q = this.b.length();
                }
            } else {
                if (underlineToggle) {
                    return;
                }
                this.b.setSpan(new UnderlineSpan(), this.q, this.b.length(), 33);
                this.q = -1;
            }
        }

        public void n(int foregroundColor, int backgroundColor, int edgeColor) {
            if (this.r != -1 && this.s != foregroundColor) {
                this.b.setSpan(new ForegroundColorSpan(this.s), this.r, this.b.length(), 33);
            }
            if (foregroundColor != L) {
                this.r = this.b.length();
                this.s = foregroundColor;
            }
            if (this.t != -1 && this.u != backgroundColor) {
                this.b.setSpan(new BackgroundColorSpan(this.u), this.t, this.b.length(), 33);
            }
            if (backgroundColor != M) {
                this.t = this.b.length();
                this.u = backgroundColor;
            }
        }

        public void o(int row, int column) {
            if (this.v != row) {
                a('\n');
            }
            this.v = row;
        }

        public void p(boolean visible) {
            this.d = visible;
        }

        public void q(int fillColor, int borderColor, boolean wordWrapToggle, int borderType, int printDirection, int scrollDirection, int justification) {
            this.o = fillColor;
            this.l = justification;
        }
    }

    public static final class c {
        public final int a;
        public final int b;
        public final byte[] c;
        public int d = 0;

        public c(int sequenceNumber, int packetSize) {
            this.a = sequenceNumber;
            this.b = packetSize;
            this.c = new byte[(packetSize * 2) - 1];
        }
    }

    public Cea708Decoder(int accessibilityChannel, @Nullable List<byte[]> initializationData) {
        this.m = accessibilityChannel == -1 ? 1 : accessibilityChannel;
        this.l = initializationData != null && CodecSpecificDataUtil.parseCea708InitializationData(initializationData);
        this.n = new b[8];
        for (int i = 0; i < 8; i++) {
            this.n[i] = new b();
        }
        this.o = this.n[0];
    }

    private void b() {
        if (this.r == null) {
            return;
        }
        q();
        this.r = null;
    }

    private List<Cue> c() {
        a aVarC;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.n[i].j() && this.n[i].k() && (aVarC = this.n[i].c()) != null) {
                arrayList.add(aVarC);
            }
        }
        Collections.sort(arrayList, a.c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((a) arrayList.get(i2)).a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void d(int command) {
        if (command != 0) {
            if (command == 3) {
                this.p = c();
            }
            if (command == 8) {
                this.o.b();
                return;
            }
            switch (command) {
                case 12:
                    r();
                    break;
                case 13:
                    this.o.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (command >= 17 && command <= 23) {
                        StringBuilder sb = new StringBuilder(55);
                        sb.append("Currently unsupported COMMAND_EXT1 Command: ");
                        sb.append(command);
                        Log.w(t, sb.toString());
                        this.j.skipBits(8);
                    } else if (command >= 24 && command <= 31) {
                        StringBuilder sb2 = new StringBuilder(54);
                        sb2.append("Currently unsupported COMMAND_P16 Command: ");
                        sb2.append(command);
                        Log.w(t, sb2.toString());
                        this.j.skipBits(16);
                    } else {
                        StringBuilder sb3 = new StringBuilder(31);
                        sb3.append("Invalid C0 command: ");
                        sb3.append(command);
                        Log.w(t, sb3.toString());
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void e(int command) {
        int i = 1;
        switch (command) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i2 = command + com.alipay.sdk.m.n.a.g;
                if (this.s != i2) {
                    this.s = i2;
                    this.o = this.n[i2];
                }
                break;
            case 136:
                while (i <= 8) {
                    if (this.j.readBit()) {
                        this.n[8 - i].e();
                    }
                    i++;
                }
                break;
            case 137:
                for (int i3 = 1; i3 <= 8; i3++) {
                    if (this.j.readBit()) {
                        this.n[8 - i3].p(true);
                    }
                }
                break;
            case 138:
                while (i <= 8) {
                    if (this.j.readBit()) {
                        this.n[8 - i].p(false);
                    }
                    i++;
                }
                break;
            case 139:
                for (int i4 = 1; i4 <= 8; i4++) {
                    if (this.j.readBit()) {
                        b bVar = this.n[8 - i4];
                        bVar.p(!bVar.k());
                    }
                }
                break;
            case 140:
                while (i <= 8) {
                    if (this.j.readBit()) {
                        this.n[8 - i].l();
                    }
                    i++;
                }
                break;
            case 141:
                this.j.skipBits(8);
                break;
            case 142:
                break;
            case 143:
                r();
                break;
            case 144:
                if (this.o.i()) {
                    m();
                } else {
                    this.j.skipBits(16);
                }
                break;
            case 145:
                if (this.o.i()) {
                    n();
                } else {
                    this.j.skipBits(24);
                }
                break;
            case 146:
                if (this.o.i()) {
                    o();
                } else {
                    this.j.skipBits(16);
                }
                break;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                StringBuilder sb = new StringBuilder(31);
                sb.append("Invalid C1 command: ");
                sb.append(command);
                Log.w(t, sb.toString());
                break;
            case 151:
                if (this.o.i()) {
                    p();
                } else {
                    this.j.skipBits(32);
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
                int i5 = command - 152;
                h(i5);
                if (this.s != i5) {
                    this.s = i5;
                    this.o = this.n[i5];
                }
                break;
        }
    }

    private void f(int command) {
        if (command <= 7) {
            return;
        }
        if (command <= 15) {
            this.j.skipBits(8);
        } else if (command <= 23) {
            this.j.skipBits(16);
        } else if (command <= 31) {
            this.j.skipBits(24);
        }
    }

    private void g(int command) {
        if (command <= 135) {
            this.j.skipBits(32);
            return;
        }
        if (command <= 143) {
            this.j.skipBits(40);
        } else if (command <= 159) {
            this.j.skipBits(2);
            this.j.skipBits(this.j.readBits(6) * 8);
        }
    }

    private void h(int window) {
        b bVar = this.n[window];
        this.j.skipBits(2);
        boolean bit = this.j.readBit();
        boolean bit2 = this.j.readBit();
        boolean bit3 = this.j.readBit();
        int bits = this.j.readBits(3);
        boolean bit4 = this.j.readBit();
        int bits2 = this.j.readBits(7);
        int bits3 = this.j.readBits(8);
        int bits4 = this.j.readBits(4);
        int bits5 = this.j.readBits(4);
        this.j.skipBits(2);
        int bits6 = this.j.readBits(6);
        this.j.skipBits(2);
        bVar.f(bit, bit2, bit3, bits, bit4, bits2, bits3, bits5, bits6, bits4, this.j.readBits(3), this.j.readBits(3));
    }

    private void i(int characterCode) {
        if (characterCode == 127) {
            this.o.a((char) 9835);
        } else {
            this.o.a((char) (characterCode & 255));
        }
    }

    private void j(int characterCode) {
        this.o.a((char) (characterCode & 255));
    }

    private void k(int characterCode) {
        if (characterCode == 32) {
            this.o.a(StringUtil.SPACE);
        }
        if (characterCode == 33) {
            this.o.a(Typography.nbsp);
            return;
        }
        if (characterCode == 37) {
            this.o.a(Typography.ellipsis);
            return;
        }
        if (characterCode == 42) {
            this.o.a((char) 352);
            return;
        }
        if (characterCode == 44) {
            this.o.a((char) 338);
            return;
        }
        if (characterCode == 63) {
            this.o.a((char) 376);
            return;
        }
        if (characterCode == 57) {
            this.o.a(Typography.tm);
            return;
        }
        if (characterCode == 58) {
            this.o.a((char) 353);
            return;
        }
        if (characterCode == 60) {
            this.o.a((char) 339);
            return;
        }
        if (characterCode == 61) {
            this.o.a((char) 8480);
            return;
        }
        switch (characterCode) {
            case 48:
                this.o.a((char) 9608);
                break;
            case 49:
                this.o.a(Typography.leftSingleQuote);
                break;
            case 50:
                this.o.a(Typography.rightSingleQuote);
                break;
            case 51:
                this.o.a(Typography.leftDoubleQuote);
                break;
            case 52:
                this.o.a(Typography.rightDoubleQuote);
                break;
            case 53:
                this.o.a(Typography.bullet);
                break;
            default:
                switch (characterCode) {
                    case 118:
                        this.o.a((char) 8539);
                        break;
                    case 119:
                        this.o.a((char) 8540);
                        break;
                    case 120:
                        this.o.a((char) 8541);
                        break;
                    case 121:
                        this.o.a((char) 8542);
                        break;
                    case 122:
                        this.o.a((char) 9474);
                        break;
                    case 123:
                        this.o.a((char) 9488);
                        break;
                    case 124:
                        this.o.a((char) 9492);
                        break;
                    case 125:
                        this.o.a((char) 9472);
                        break;
                    case 126:
                        this.o.a((char) 9496);
                        break;
                    case 127:
                        this.o.a((char) 9484);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder(33);
                        sb.append("Invalid G2 character: ");
                        sb.append(characterCode);
                        Log.w(t, sb.toString());
                        break;
                }
                break;
        }
    }

    private void l(int characterCode) {
        if (characterCode == 160) {
            this.o.a((char) 13252);
            return;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Invalid G3 character: ");
        sb.append(characterCode);
        Log.w(t, sb.toString());
        this.o.a('_');
    }

    private void m() {
        this.o.m(this.j.readBits(4), this.j.readBits(2), this.j.readBits(2), this.j.readBit(), this.j.readBit(), this.j.readBits(3), this.j.readBits(3));
    }

    private void n() {
        int iH = b.h(this.j.readBits(2), this.j.readBits(2), this.j.readBits(2), this.j.readBits(2));
        int iH2 = b.h(this.j.readBits(2), this.j.readBits(2), this.j.readBits(2), this.j.readBits(2));
        this.j.skipBits(2);
        this.o.n(iH, iH2, b.g(this.j.readBits(2), this.j.readBits(2), this.j.readBits(2)));
    }

    private void o() {
        this.j.skipBits(4);
        int bits = this.j.readBits(4);
        this.j.skipBits(2);
        this.o.o(bits, this.j.readBits(6));
    }

    private void p() {
        int iH = b.h(this.j.readBits(2), this.j.readBits(2), this.j.readBits(2), this.j.readBits(2));
        int bits = this.j.readBits(2);
        int iG = b.g(this.j.readBits(2), this.j.readBits(2), this.j.readBits(2));
        if (this.j.readBit()) {
            bits |= 4;
        }
        boolean bit = this.j.readBit();
        int bits2 = this.j.readBits(2);
        int bits3 = this.j.readBits(2);
        int bits4 = this.j.readBits(2);
        this.j.skipBits(8);
        this.o.q(iH, iG, bit, bits, bits2, bits3, bits4);
    }

    @RequiresNonNull({"currentDtvCcPacket"})
    private void q() {
        c cVar = this.r;
        int i = cVar.d;
        int i2 = cVar.b;
        if (i != (i2 * 2) - 1) {
            int i3 = cVar.a;
            StringBuilder sb = new StringBuilder(115);
            sb.append("DtvCcPacket ended prematurely; size is ");
            sb.append((i2 * 2) - 1);
            sb.append(", but current index is ");
            sb.append(i);
            sb.append(" (sequence number ");
            sb.append(i3);
            sb.append(");");
            Log.d(t, sb.toString());
        }
        ParsableBitArray parsableBitArray = this.j;
        c cVar2 = this.r;
        parsableBitArray.reset(cVar2.c, cVar2.d);
        int bits = this.j.readBits(3);
        int bits2 = this.j.readBits(5);
        if (bits == 7) {
            this.j.skipBits(2);
            bits = this.j.readBits(6);
            if (bits < 7) {
                StringBuilder sb2 = new StringBuilder(44);
                sb2.append("Invalid extended service number: ");
                sb2.append(bits);
                Log.w(t, sb2.toString());
            }
        }
        if (bits2 == 0) {
            if (bits != 0) {
                StringBuilder sb3 = new StringBuilder(59);
                sb3.append("serviceNumber is non-zero (");
                sb3.append(bits);
                sb3.append(") when blockSize is 0");
                Log.w(t, sb3.toString());
                return;
            }
            return;
        }
        if (bits != this.m) {
            return;
        }
        boolean z2 = false;
        while (this.j.bitsLeft() > 0) {
            int bits3 = this.j.readBits(8);
            if (bits3 == 16) {
                int bits4 = this.j.readBits(8);
                if (bits4 <= 31) {
                    f(bits4);
                } else {
                    if (bits4 <= 127) {
                        k(bits4);
                    } else if (bits4 <= 159) {
                        g(bits4);
                    } else if (bits4 <= 255) {
                        l(bits4);
                    } else {
                        StringBuilder sb4 = new StringBuilder(37);
                        sb4.append("Invalid extended command: ");
                        sb4.append(bits4);
                        Log.w(t, sb4.toString());
                    }
                    z2 = true;
                }
            } else if (bits3 <= 31) {
                d(bits3);
            } else {
                if (bits3 <= 127) {
                    i(bits3);
                } else if (bits3 <= 159) {
                    e(bits3);
                } else if (bits3 <= 255) {
                    j(bits3);
                } else {
                    StringBuilder sb5 = new StringBuilder(33);
                    sb5.append("Invalid base command: ");
                    sb5.append(bits3);
                    Log.w(t, sb5.toString());
                }
                z2 = true;
            }
        }
        if (z2) {
            this.p = c();
        }
    }

    private void r() {
        for (int i = 0; i < 8; i++) {
            this.n[i].l();
        }
    }

    @Override // com.google.android.exoplayer2.text.cea.c
    public Subtitle createSubtitle() {
        List<Cue> list = this.p;
        this.q = list;
        return new d((List) Assertions.checkNotNull(list));
    }

    @Override // com.google.android.exoplayer2.text.cea.c
    public void decode(SubtitleInputBuffer inputBuffer) {
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(inputBuffer.data);
        this.i.reset(byteBuffer.array(), byteBuffer.limit());
        while (this.i.bytesLeft() >= 3) {
            int unsignedByte = this.i.readUnsignedByte() & 7;
            int i = unsignedByte & 3;
            boolean z2 = (unsignedByte & 4) == 4;
            byte unsignedByte2 = (byte) this.i.readUnsignedByte();
            byte unsignedByte3 = (byte) this.i.readUnsignedByte();
            if (i == 2 || i == 3) {
                if (z2) {
                    if (i == 3) {
                        b();
                        int i2 = (unsignedByte2 & 192) >> 6;
                        int i3 = this.k;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            r();
                            int i4 = this.k;
                            StringBuilder sb = new StringBuilder(71);
                            sb.append("Sequence number discontinuity. previous=");
                            sb.append(i4);
                            sb.append(" current=");
                            sb.append(i2);
                            Log.w(t, sb.toString());
                        }
                        this.k = i2;
                        int i5 = unsignedByte2 & HMProSyncDataBaseProfile.DATA_TYPE_ACTIVITY_TODAY;
                        if (i5 == 0) {
                            i5 = 64;
                        }
                        c cVar = new c(i2, i5);
                        this.r = cVar;
                        byte[] bArr = cVar.c;
                        int i6 = cVar.d;
                        cVar.d = i6 + 1;
                        bArr[i6] = unsignedByte3;
                    } else {
                        Assertions.checkArgument(i == 2);
                        c cVar2 = this.r;
                        if (cVar2 == null) {
                            Log.e(t, "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.c;
                            int i7 = cVar2.d;
                            int i8 = i7 + 1;
                            cVar2.d = i8;
                            bArr2[i7] = unsignedByte2;
                            cVar2.d = i8 + 1;
                            bArr2[i8] = unsignedByte3;
                        }
                    }
                    c cVar3 = this.r;
                    if (cVar3.d == (cVar3.b * 2) - 1) {
                        b();
                    }
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.text.cea.c, com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public /* bridge */ /* synthetic */ SubtitleInputBuffer dequeueInputBuffer() throws SubtitleDecoderException {
        return super.dequeueInputBuffer();
    }

    @Override // com.google.android.exoplayer2.text.cea.c, com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public /* bridge */ /* synthetic */ SubtitleOutputBuffer dequeueOutputBuffer() throws SubtitleDecoderException {
        return super.dequeueOutputBuffer();
    }

    @Override // com.google.android.exoplayer2.text.cea.c, com.google.android.exoplayer2.decoder.Decoder
    public void flush() {
        super.flush();
        this.p = null;
        this.q = null;
        this.s = 0;
        this.o = this.n[0];
        r();
        this.r = null;
    }

    @Override // com.google.android.exoplayer2.text.cea.c, com.google.android.exoplayer2.decoder.Decoder
    public String getName() {
        return t;
    }

    @Override // com.google.android.exoplayer2.text.cea.c
    public boolean isNewSubtitleDataAvailable() {
        return this.p != this.q;
    }

    @Override // com.google.android.exoplayer2.text.cea.c
    public /* bridge */ /* synthetic */ void queueInputBuffer(SubtitleInputBuffer inputBuffer) throws SubtitleDecoderException {
        super.queueInputBuffer(inputBuffer);
    }

    @Override // com.google.android.exoplayer2.text.cea.c, com.google.android.exoplayer2.decoder.Decoder
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    @Override // com.google.android.exoplayer2.text.cea.c, com.google.android.exoplayer2.text.SubtitleDecoder
    public /* bridge */ /* synthetic */ void setPositionUs(long positionUs) {
        super.setPositionUs(positionUs);
    }
}
