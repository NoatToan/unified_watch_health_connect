package com.google.android.exoplayer2.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.baseflow.permissionhandler.m;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.SubtitleInputBuffer;
import com.google.android.exoplayer2.text.SubtitleOutputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.huami.account.ui.areas.SelectAreaActivity;
import com.huami.applet.AppletConfig;
import com.huami.ecg.core.model.constant.EcgConst;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.widget.wheelview.Constant;
import com.xiaomi.hm.health.bt.profile.base.Mtu;
import com.xiaomi.hm.health.bt.profile.milipro.MiLiProProfile;
import io.netty.util.internal.StringUtil;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Cea608Decoder extends c {
    private static final String A = "Cea608Decoder";
    private static final int B = 4;
    private static final int C = 2;
    private static final int D = 1;
    private static final int E = 0;
    private static final int F = 1;
    private static final int G = 0;
    private static final int H = 1;
    private static final int I = 0;
    private static final int J = 1;
    private static final int K = 2;
    private static final int L = 3;
    public static final long MIN_DATA_CHANNEL_TIMEOUT_MS = 16000;
    private static final int P = 7;
    private static final int Q = 8;
    private static final int R = 4;
    private static final byte S = -4;
    private static final byte T = 32;
    private static final byte U = 33;
    private static final byte V = 36;
    private static final byte W = 37;
    private static final byte X = 38;
    private static final byte Y = 39;
    private static final byte Z = 41;
    private static final byte a0 = 42;
    private static final byte b0 = 43;
    private static final byte c0 = 44;
    private static final byte d0 = 45;
    private static final byte e0 = 46;
    private static final byte f0 = 47;
    private final int j;
    private final int k;
    private final int l;
    private final long m;

    @Nullable
    private List<Cue> p;

    @Nullable
    private List<Cue> q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private byte v;
    private byte w;
    private boolean y;
    private long z;
    private static final int[] M = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] N = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] O = {-1, -16711936, -16776961, -16711681, SupportMenu.CATEGORY_MASK, InputDeviceCompat.SOURCE_ANY, -65281};
    private static final int[] g0 = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, Constant.HEIGHT_MAX, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, Mtu.ATT_MTU_MAX, m.c, 241, 9632};
    private static final int[] h0 = {DataTypeSource.SPORT_TYPE_CHECKERS, DataTypeSource.SPORT_TYPE_BRIDGE, 189, DataTypeSource.SPORT_TYPE_NO_GPS_SOCCER, 8482, 162, 163, 9834, 224, 32, 232, FTPCodes.DATA_CONNECTION_CLOSING, EcgConst.ECG_FULL_MEASURE_SECOND_TIME, 238, 244, 251};
    private static final int[] i0 = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, DataTypeSource.SPORT_TYPE_TAP_DANCE};
    private static final int[] j0 = {Constant.WEIGHT_DEFAULT_IMPERIAL, FTPCodes.ENTER_PASSIVE_MODE, 205, 204, 236, m.d, 242, 213, com.unionpay.tsmservice.data.Constant.PLAIN_TEXT_MAX_LENGTH, 123, 125, 92, 94, 95, 124, 126, 196, 228, FTPCodes.HELP_MESSAGE, 246, SelectAreaActivity.REQUEST_SELECT_AREA_ONLY, 165, 164, 9474, 197, AppletConfig.DEFAULT_DEVICE_SOURCE, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] k0 = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private final ParsableByteArray i = new ParsableByteArray();
    private final ArrayList<a> n = new ArrayList<>();
    private a o = new a(0, 4);
    private int x = 0;

    public static final class a {
        private static final int i = 32;
        private static final int j = 15;
        private final List<C0152a> a = new ArrayList();
        private final List<SpannableString> b = new ArrayList();
        private final StringBuilder c = new StringBuilder();
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.text.cea.Cea608Decoder$a$a, reason: collision with other inner class name */
        public static class C0152a {
            public final int a;
            public final boolean b;
            public int c;

            public C0152a(int style, boolean underline, int start) {
                this.a = style;
                this.b = underline;
                this.c = start;
            }
        }

        public a(int captionMode, int captionRowCount) {
            j(captionMode);
            this.h = captionRowCount;
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
            int length = spannableStringBuilder.length();
            int i2 = 0;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            int i6 = -1;
            int i7 = -1;
            boolean z = false;
            while (i2 < this.a.size()) {
                C0152a c0152a = this.a.get(i2);
                boolean z2 = c0152a.b;
                int i8 = c0152a.a;
                if (i8 != 8) {
                    boolean z3 = i8 == 7;
                    if (i8 != 7) {
                        i7 = Cea608Decoder.O[i8];
                    }
                    z = z3;
                }
                int i9 = c0152a.c;
                i2++;
                if (i9 != (i2 < this.a.size() ? this.a.get(i2).c : length)) {
                    if (i3 != -1 && !z2) {
                        q(spannableStringBuilder, i3, i9);
                        i3 = -1;
                    } else if (i3 == -1 && z2) {
                        i3 = i9;
                    }
                    if (i4 != -1 && !z) {
                        o(spannableStringBuilder, i4, i9);
                        i4 = -1;
                    } else if (i4 == -1 && z) {
                        i4 = i9;
                    }
                    if (i7 != i6) {
                        n(spannableStringBuilder, i5, i9, i6);
                        i6 = i7;
                        i5 = i9;
                    }
                }
            }
            if (i3 != -1 && i3 != length) {
                q(spannableStringBuilder, i3, length);
            }
            if (i4 != -1 && i4 != length) {
                o(spannableStringBuilder, i4, length);
            }
            if (i5 != length) {
                n(spannableStringBuilder, i5, length, i6);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void n(SpannableStringBuilder builder, int start, int end, int color) {
            if (color == -1) {
                return;
            }
            builder.setSpan(new ForegroundColorSpan(color), start, end, 33);
        }

        private static void o(SpannableStringBuilder builder, int start, int end) {
            builder.setSpan(new StyleSpan(2), start, end, 33);
        }

        private static void q(SpannableStringBuilder builder, int start, int end) {
            builder.setSpan(new UnderlineSpan(), start, end, 33);
        }

        public void e(char text) {
            if (this.c.length() < 32) {
                this.c.append(text);
            }
        }

        public void f() {
            int length = this.c.length();
            if (length > 0) {
                this.c.delete(length - 1, length);
                for (int size = this.a.size() - 1; size >= 0; size--) {
                    C0152a c0152a = this.a.get(size);
                    int i2 = c0152a.c;
                    if (i2 != length) {
                        return;
                    }
                    c0152a.c = i2 - 1;
                }
            }
        }

        @Nullable
        public Cue g(int forcedPositionAnchor) {
            float f;
            int i2 = this.e + this.f;
            int i3 = 32 - i2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.b.size(); i4++) {
                spannableStringBuilder.append(Util.truncateAscii(this.b.get(i4), i3));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(Util.truncateAscii(h(), i3));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i3 - spannableStringBuilder.length();
            int i5 = i2 - length;
            if (forcedPositionAnchor == Integer.MIN_VALUE) {
                forcedPositionAnchor = (this.g != 2 || (Math.abs(i5) >= 3 && length >= 0)) ? (this.g != 2 || i5 <= 0) ? 0 : 2 : 1;
            }
            if (forcedPositionAnchor != 1) {
                if (forcedPositionAnchor == 2) {
                    i2 = 32 - length;
                }
                f = ((i2 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i6 = this.d;
            if (i6 > 7) {
                i6 = (i6 - 15) - 2;
            } else if (this.g == 1) {
                i6 -= this.h - 1;
            }
            return new Cue.Builder().setText(spannableStringBuilder).setTextAlignment(Layout.Alignment.ALIGN_NORMAL).setLine(i6, 1).setPosition(f).setPositionAnchor(forcedPositionAnchor).build();
        }

        public boolean i() {
            return this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
        }

        public void j(int captionMode) {
            this.g = captionMode;
            this.a.clear();
            this.b.clear();
            this.c.setLength(0);
            this.d = 15;
            this.e = 0;
            this.f = 0;
        }

        public void k() {
            this.b.add(h());
            this.c.setLength(0);
            this.a.clear();
            int iMin = Math.min(this.h, this.d);
            while (this.b.size() >= iMin) {
                this.b.remove(0);
            }
        }

        public void l(int captionMode) {
            this.g = captionMode;
        }

        public void m(int captionRowCount) {
            this.h = captionRowCount;
        }

        public void p(int style, boolean underline) {
            this.a.add(new C0152a(style, underline, this.c.length()));
        }
    }

    public Cea608Decoder(String mimeType, int accessibilityChannel, long validDataChannelTimeoutMs) {
        this.m = validDataChannelTimeoutMs > 0 ? validDataChannelTimeoutMs * 1000 : -9223372036854775807L;
        this.j = MimeTypes.APPLICATION_MP4CEA608.equals(mimeType) ? 2 : 3;
        if (accessibilityChannel == 1) {
            this.l = 0;
            this.k = 0;
        } else if (accessibilityChannel == 2) {
            this.l = 1;
            this.k = 0;
        } else if (accessibilityChannel == 3) {
            this.l = 0;
            this.k = 1;
        } else if (accessibilityChannel != 4) {
            Log.w(A, "Invalid channel. Defaulting to CC1.");
            this.l = 0;
            this.k = 0;
        } else {
            this.l = 1;
            this.k = 1;
        }
        z(0);
        y();
        this.y = true;
        this.z = C.TIME_UNSET;
    }

    private void A(int captionRowCount) {
        this.s = captionRowCount;
        this.o.m(captionRowCount);
    }

    private boolean B() {
        return (this.m == C.TIME_UNSET || this.z == C.TIME_UNSET || getPositionUs() - this.z < this.m) ? false : true;
    }

    private boolean C(byte cc1) {
        if (m(cc1)) {
            this.x = d(cc1);
        }
        return this.x == this.l;
    }

    private static char c(byte ccData) {
        return (char) g0[(ccData & 127) - 32];
    }

    private static int d(byte cc1) {
        return (cc1 >> 3) & 1;
    }

    private List<Cue> e() {
        int size = this.n.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            Cue cueG = this.n.get(i).g(Integer.MIN_VALUE);
            arrayList.add(cueG);
            if (cueG != null) {
                iMin = Math.min(iMin, cueG.positionAnchor);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            Cue cue = (Cue) arrayList.get(i2);
            if (cue != null) {
                if (cue.positionAnchor != iMin) {
                    cue = (Cue) Assertions.checkNotNull(this.n.get(i2).g(iMin));
                }
                arrayList2.add(cue);
            }
        }
        return arrayList2;
    }

    private static char f(byte ccData) {
        return (char) i0[ccData & 31];
    }

    private static char g(byte ccData) {
        return (char) j0[ccData & 31];
    }

    private static char h(byte cc1, byte cc2) {
        return (cc1 & 1) == 0 ? f(cc2) : g(cc2);
    }

    private static char i(byte ccData) {
        return (char) h0[ccData & 15];
    }

    private void j(byte cc2) {
        this.o.e(StringUtil.SPACE);
        this.o.p((cc2 >> 1) & 7, (cc2 & 1) == 1);
    }

    private void k(byte cc2) {
        if (cc2 == 32) {
            z(2);
            return;
        }
        if (cc2 == 41) {
            z(3);
            return;
        }
        switch (cc2) {
            case 37:
                z(1);
                A(2);
                break;
            case 38:
                z(1);
                A(3);
                break;
            case 39:
                z(1);
                A(4);
                break;
            default:
                int i = this.r;
                if (i != 0) {
                    if (cc2 != 33) {
                        switch (cc2) {
                            case 44:
                                this.p = Collections.emptyList();
                                int i2 = this.r;
                                if (i2 == 1 || i2 == 3) {
                                    y();
                                }
                                break;
                            case 45:
                                if (i == 1 && !this.o.i()) {
                                    this.o.k();
                                    break;
                                }
                                break;
                            case 46:
                                y();
                                break;
                            case 47:
                                this.p = e();
                                y();
                                break;
                        }
                    } else {
                        this.o.f();
                        break;
                    }
                }
                break;
        }
    }

    private void l(byte cc1, byte cc2) {
        int i = M[cc1 & 7];
        if ((cc2 & 32) != 0) {
            i++;
        }
        if (i != this.o.d) {
            if (this.r != 1 && !this.o.i()) {
                a aVar = new a(this.r, this.s);
                this.o = aVar;
                this.n.add(aVar);
            }
            this.o.d = i;
        }
        boolean z = (cc2 & 16) == 16;
        boolean z2 = (cc2 & 1) == 1;
        int i2 = (cc2 >> 1) & 7;
        this.o.p(z ? 8 : i2, z2);
        if (z) {
            this.o.e = N[i2];
        }
    }

    private static boolean m(byte cc1) {
        return (cc1 & MiLiProProfile.ECF_COMMAND_SET_SPORT_TYPE_SORT) == 0;
    }

    private static boolean n(byte cc1, byte cc2) {
        return (cc1 & 246) == 18 && (cc2 & MiLiProProfile.ECF_COMMAND_SET_SPORT_TYPE_SORT) == 32;
    }

    private static boolean o(byte cc1, byte cc2) {
        return (cc1 & 247) == 17 && (cc2 & 240) == 32;
    }

    private static boolean p(byte cc1, byte cc2) {
        return (cc1 & 246) == 20 && (cc2 & 240) == 32;
    }

    private static boolean q(byte cc1, byte cc2) {
        return (cc1 & 240) == 16 && (cc2 & 192) == 64;
    }

    private static boolean r(byte cc1) {
        return (cc1 & 240) == 16;
    }

    private boolean s(boolean captionValid, byte cc1, byte cc2) {
        if (!captionValid || !r(cc1)) {
            this.u = false;
        } else {
            if (this.u && this.v == cc1 && this.w == cc2) {
                this.u = false;
                return true;
            }
            this.u = true;
            this.v = cc1;
            this.w = cc2;
        }
        return false;
    }

    private static boolean t(byte cc1) {
        return (cc1 & 247) == 20;
    }

    private static boolean u(byte cc1, byte cc2) {
        return (cc1 & 247) == 17 && (cc2 & 240) == 48;
    }

    private static boolean v(byte cc1, byte cc2) {
        return (cc1 & 247) == 23 && cc2 >= 33 && cc2 <= 35;
    }

    private static boolean w(byte cc1) {
        return 1 <= cc1 && cc1 <= 15;
    }

    private void x(byte cc1, byte cc2) {
        if (w(cc1)) {
            this.y = false;
            return;
        }
        if (t(cc1)) {
            if (cc2 != 32 && cc2 != 47) {
                switch (cc2) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (cc2) {
                            case 42:
                            case 43:
                                this.y = false;
                                break;
                        }
                }
            }
            this.y = true;
        }
    }

    private void y() {
        this.o.j(this.r);
        this.n.clear();
        this.n.add(this.o);
    }

    private void z(int captionMode) {
        int i = this.r;
        if (i == captionMode) {
            return;
        }
        this.r = captionMode;
        if (captionMode == 3) {
            for (int i2 = 0; i2 < this.n.size(); i2++) {
                this.n.get(i2).l(captionMode);
            }
            return;
        }
        y();
        if (i == 3 || captionMode == 1 || captionMode == 0) {
            this.p = Collections.emptyList();
        }
    }

    @Override // com.google.android.exoplayer2.text.cea.c
    public Subtitle createSubtitle() {
        List<Cue> list = this.p;
        this.q = list;
        return new d((List) Assertions.checkNotNull(list));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    @Override // com.google.android.exoplayer2.text.cea.c
    public void decode(SubtitleInputBuffer inputBuffer) {
        boolean z;
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(inputBuffer.data);
        this.i.reset(byteBuffer.array(), byteBuffer.limit());
        boolean z2 = false;
        while (true) {
            int iBytesLeft = this.i.bytesLeft();
            int i = this.j;
            if (iBytesLeft < i) {
                break;
            }
            byte unsignedByte = i == 2 ? (byte) -4 : (byte) this.i.readUnsignedByte();
            int unsignedByte2 = this.i.readUnsignedByte();
            int unsignedByte3 = this.i.readUnsignedByte();
            if ((unsignedByte & 2) == 0 && (unsignedByte & 1) == this.k) {
                byte b = (byte) (unsignedByte2 & 127);
                byte b2 = (byte) (unsignedByte3 & 127);
                if (b != 0 || b2 != 0) {
                    boolean z3 = this.t;
                    if ((unsignedByte & 4) == 4) {
                        boolean[] zArr = k0;
                        if (zArr[unsignedByte2] && zArr[unsignedByte3]) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    this.t = z;
                    if (!s(z, b, b2)) {
                        if (this.t) {
                            x(b, b2);
                            if (this.y && C(b)) {
                                if (!m(b)) {
                                    this.o.e(c(b));
                                    if ((b2 & MiLiProProfile.ECF_COMMAND_SET_SPORT_TYPE_SORT) != 0) {
                                        this.o.e(c(b2));
                                    }
                                } else if (u(b, b2)) {
                                    this.o.e(i(b2));
                                } else if (n(b, b2)) {
                                    this.o.f();
                                    this.o.e(h(b, b2));
                                } else if (o(b, b2)) {
                                    j(b2);
                                } else if (q(b, b2)) {
                                    l(b, b2);
                                } else if (v(b, b2)) {
                                    this.o.f = b2 + MiLiProProfile.ECF_COMMAND_SET_SPORT_TYPE_SORT;
                                } else if (p(b, b2)) {
                                    k(b2);
                                }
                                z2 = true;
                            }
                        } else if (z3) {
                            y();
                            z2 = true;
                        }
                    }
                }
            }
        }
        if (z2) {
            int i2 = this.r;
            if (i2 == 1 || i2 == 3) {
                this.p = e();
                this.z = getPositionUs();
            }
        }
    }

    @Override // com.google.android.exoplayer2.text.cea.c, com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public /* bridge */ /* synthetic */ SubtitleInputBuffer dequeueInputBuffer() throws SubtitleDecoderException {
        return super.dequeueInputBuffer();
    }

    @Override // com.google.android.exoplayer2.text.cea.c, com.google.android.exoplayer2.decoder.Decoder
    public void flush() {
        super.flush();
        this.p = null;
        this.q = null;
        z(0);
        A(4);
        y();
        this.t = false;
        this.u = false;
        this.v = (byte) 0;
        this.w = (byte) 0;
        this.x = 0;
        this.y = true;
        this.z = C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.text.cea.c, com.google.android.exoplayer2.decoder.Decoder
    public String getName() {
        return A;
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
    public void release() {
    }

    @Override // com.google.android.exoplayer2.text.cea.c, com.google.android.exoplayer2.text.SubtitleDecoder
    public /* bridge */ /* synthetic */ void setPositionUs(long positionUs) {
        super.setPositionUs(positionUs);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.text.cea.c, com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public SubtitleOutputBuffer dequeueOutputBuffer() throws SubtitleDecoderException {
        SubtitleOutputBuffer availableOutputBuffer;
        SubtitleOutputBuffer subtitleOutputBufferDequeueOutputBuffer = super.dequeueOutputBuffer();
        if (subtitleOutputBufferDequeueOutputBuffer != null) {
            return subtitleOutputBufferDequeueOutputBuffer;
        }
        if (!B() || (availableOutputBuffer = getAvailableOutputBuffer()) == null) {
            return null;
        }
        this.p = Collections.emptyList();
        this.z = C.TIME_UNSET;
        availableOutputBuffer.setContent(getPositionUs(), createSubtitle(), Long.MAX_VALUE);
        return availableOutputBuffer;
    }
}
