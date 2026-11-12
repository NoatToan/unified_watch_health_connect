package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.c;
import com.google.android.exoplayer2.mediacodec.d;
import com.google.android.exoplayer2.video.DummySurface;
import com.google.android.exoplayer2.video.MediaCodecVideoDecoderException;
import com.google.android.gms.common.Scopes;
import com.xiaomi.fitness.sport.view.route.CreateRouteLoadingFragment;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class fjf extends MediaCodecRenderer {
    public static final int[] s1 = {1920, 1600, 1440, 1280, 960, 854, GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH, 540, 480};
    public static boolean t1;
    public static boolean u1;
    public final Context J0;
    public final crq K0;
    public final vrq.a L0;
    public final long M0;
    public final int N0;
    public final boolean O0;
    public a P0;
    public boolean Q0;
    public boolean R0;
    public Surface S0;
    public Surface T0;
    public boolean U0;
    public int V0;
    public boolean W0;
    public boolean X0;
    public boolean Y0;
    public long Z0;
    public long a1;
    public long b1;
    public int c1;
    public int d1;
    public int e1;
    public long f1;
    public long g1;
    public long h1;
    public int i1;
    public int j1;
    public int k1;
    public int l1;
    public float m1;
    public wrq n1;
    public boolean o1;
    public int p1;
    public b q1;
    public arq r1;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17845b;
        public final int c;

        public a(int i, int i2, int i3) {
            this.f17844a = i;
            this.f17845b = i2;
            this.c = i3;
        }
    }

    @RequiresApi(23)
    public final class b implements com.google.android.exoplayer2.mediacodec.b.c, Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f17846a;

        public b(com.google.android.exoplayer2.mediacodec.b bVar) {
            Handler handlerY = wlq.y(this);
            this.f17846a = handlerY;
            bVar.h(this, handlerY);
        }

        @Override // com.google.android.exoplayer2.mediacodec.b.c
        public void a(com.google.android.exoplayer2.mediacodec.b bVar, long j, long j2) {
            if (wlq.f38110a >= 30) {
                b(j);
            } else {
                this.f17846a.sendMessageAtFrontOfQueue(Message.obtain(this.f17846a, 0, (int) (j >> 32), (int) j));
            }
        }

        public final void b(long j) {
            fjf fjfVar = fjf.this;
            if (this != fjfVar.q1) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                fjfVar.Q1();
                return;
            }
            try {
                fjfVar.P1(j);
            } catch (ExoPlaybackException e) {
                fjf.this.g1(e);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(wlq.T0(message.arg1, message.arg2));
            return true;
        }
    }

    public fjf(Context context, com.google.android.exoplayer2.mediacodec.b.InterfaceC0187b interfaceC0187b, d dVar, long j, boolean z, Handler handler, vrq vrqVar, int i) {
        super(2, interfaceC0187b, dVar, z, 30.0f);
        this.M0 = j;
        this.N0 = i;
        Context applicationContext = context.getApplicationContext();
        this.J0 = applicationContext;
        this.K0 = new crq(applicationContext);
        this.L0 = new vrq.a(handler, vrqVar);
        this.O0 = w1();
        this.a1 = -9223372036854775807L;
        this.j1 = -1;
        this.k1 = -1;
        this.m1 = -1.0f;
        this.V0 = 1;
        this.p1 = 0;
        t1();
    }

    public static Point A1(c cVar, Format format) {
        int i = format.f7818r;
        int i2 = format.q;
        boolean z = i > i2;
        int i3 = z ? i : i2;
        if (z) {
            i = i2;
        }
        float f = i / i3;
        for (int i4 : s1) {
            int i5 = (int) (i4 * f);
            if (i4 <= i3 || i5 <= i) {
                break;
            }
            if (wlq.f38110a >= 21) {
                int i6 = z ? i5 : i4;
                if (!z) {
                    i4 = i5;
                }
                Point pointB = cVar.b(i6, i4);
                if (cVar.t(pointB.x, pointB.y, format.s)) {
                    return pointB;
                }
            } else {
                try {
                    int iL = wlq.l(i4, 16) * 16;
                    int iL2 = wlq.l(i5, 16) * 16;
                    if (iL * iL2 <= MediaCodecUtil.M()) {
                        int i7 = z ? iL2 : iL;
                        if (!z) {
                            iL = iL2;
                        }
                        return new Point(i7, iL);
                    }
                } catch (MediaCodecUtil.DecoderQueryException unused) {
                }
            }
        }
        return null;
    }

    public static List<c> C1(d dVar, Format format, boolean z, boolean z2) throws MediaCodecUtil.DecoderQueryException {
        Pair<Integer, Integer> pairP;
        String str = format.l;
        if (str == null) {
            return Collections.emptyList();
        }
        List<c> listT = MediaCodecUtil.t(dVar.a(str, z, z2), format);
        if ("video/dolby-vision".equals(str) && (pairP = MediaCodecUtil.p(format)) != null) {
            int iIntValue = ((Integer) pairP.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                listT.addAll(dVar.a("video/hevc", z, z2));
            } else if (iIntValue == 512) {
                listT.addAll(dVar.a("video/avc", z, z2));
            }
        }
        return Collections.unmodifiableList(listT);
    }

    public static int D1(c cVar, Format format) {
        if (format.m == -1) {
            return z1(cVar, format.l, format.q, format.f7818r);
        }
        int size = format.n.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += format.n.get(i).length;
        }
        return format.m + length;
    }

    public static boolean F1(long j) {
        return j < -30000;
    }

    public static boolean G1(long j) {
        return j < -500000;
    }

    @RequiresApi(29)
    public static void T1(com.google.android.exoplayer2.mediacodec.b bVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        bVar.c(bundle);
    }

    @RequiresApi(21)
    public static void v1(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    public static boolean w1() {
        return "NVIDIA".equals(wlq.c);
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1067)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public static boolean y1() {
        /*
            Method dump skipped, instruction units count: 3044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjf.y1():boolean");
    }

    public static int z1(c cVar, String str, int i, int i2) {
        int iL;
        if (i != -1 && i2 != -1) {
            str.hashCode();
            int i3 = 4;
            switch (str) {
                case "video/dolby-vision":
                case "video/avc":
                    String str2 = wlq.d;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(wlq.c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !cVar.g)))) {
                        iL = wlq.l(i, 16) * wlq.l(i2, 16) * 256;
                        i3 = 2;
                        return (iL * 3) / (i3 * 2);
                    }
                    break;
                case "video/3gpp":
                case "video/mp4v-es":
                case "video/x-vnd.on2.vp8":
                    iL = i * i2;
                    i3 = 2;
                    return (iL * 3) / (i3 * 2);
                case "video/hevc":
                case "video/x-vnd.on2.vp9":
                    iL = i * i2;
                    return (iL * 3) / (i3 * 2);
                default:
                    return -1;
            }
        }
        return -1;
    }

    public a B1(c cVar, Format format, Format[] formatArr) {
        int iZ1;
        int iMax = format.q;
        int iMax2 = format.f7818r;
        int iD1 = D1(cVar, format);
        if (formatArr.length == 1) {
            if (iD1 != -1 && (iZ1 = z1(cVar, format.l, format.q, format.f7818r)) != -1) {
                iD1 = Math.min((int) (iD1 * 1.5f), iZ1);
            }
            return new a(iMax, iMax2, iD1);
        }
        int length = formatArr.length;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            Format formatE = formatArr[i];
            if (format.x != null && formatE.x == null) {
                formatE = formatE.a().J(format.x).E();
            }
            if (cVar.e(format, formatE).d != 0) {
                int i2 = formatE.q;
                z |= i2 == -1 || formatE.f7818r == -1;
                iMax = Math.max(iMax, i2);
                iMax2 = Math.max(iMax2, formatE.f7818r);
                iD1 = Math.max(iD1, D1(cVar, formatE));
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder(66);
            sb.append("Resolutions unknown. Codec max resolution: ");
            sb.append(iMax);
            sb.append("x");
            sb.append(iMax2);
            toe.h("MediaCodecVideoRenderer", sb.toString());
            Point pointA1 = A1(cVar, format);
            if (pointA1 != null) {
                iMax = Math.max(iMax, pointA1.x);
                iMax2 = Math.max(iMax2, pointA1.y);
                iD1 = Math.max(iD1, z1(cVar, format.l, iMax, iMax2));
                StringBuilder sb2 = new StringBuilder(57);
                sb2.append("Codec max resolution adjusted to: ");
                sb2.append(iMax);
                sb2.append("x");
                sb2.append(iMax2);
                toe.h("MediaCodecVideoRenderer", sb2.toString());
            }
        }
        return new a(iMax, iMax2, iD1);
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    public MediaFormat E1(Format format, String str, a aVar, float f, boolean z, int i) {
        Pair<Integer, Integer> pairP;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", format.q);
        mediaFormat.setInteger("height", format.f7818r);
        jjf.e(mediaFormat, format.n);
        jjf.c(mediaFormat, "frame-rate", format.s);
        jjf.d(mediaFormat, "rotation-degrees", format.t);
        jjf.b(mediaFormat, format.x);
        if ("video/dolby-vision".equals(format.l) && (pairP = MediaCodecUtil.p(format)) != null) {
            jjf.d(mediaFormat, Scopes.PROFILE, ((Integer) pairP.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f17844a);
        mediaFormat.setInteger("max-height", aVar.f17845b);
        jjf.d(mediaFormat, "max-input-size", aVar.c);
        if (wlq.f38110a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            v1(mediaFormat, i);
        }
        return mediaFormat;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    public void F() {
        t1();
        s1();
        this.U0 = false;
        this.K0.g();
        this.q1 = null;
        try {
            super.F();
        } finally {
            this.L0.m(this.E0);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    public void G(boolean z, boolean z2) throws ExoPlaybackException {
        super.G(z, z2);
        boolean z3 = A().f33740a;
        rk1.g((z3 && this.p1 == 0) ? false : true);
        if (this.o1 != z3) {
            this.o1 = z3;
            Y0();
        }
        this.L0.o(this.E0);
        this.K0.h();
        this.X0 = z2;
        this.Y0 = false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    public void H(long j, boolean z) throws ExoPlaybackException {
        super.H(j, z);
        s1();
        this.K0.l();
        this.f1 = -9223372036854775807L;
        this.Z0 = -9223372036854775807L;
        this.d1 = 0;
        if (z) {
            U1();
        } else {
            this.a1 = -9223372036854775807L;
        }
    }

    public boolean H1(long j, boolean z) throws ExoPlaybackException {
        int iN = N(j);
        if (iN == 0) {
            return false;
        }
        ss5 ss5Var = this.E0;
        ss5Var.i++;
        int i = this.e1 + iN;
        if (z) {
            ss5Var.f += i;
        } else {
            c2(i);
        }
        m0();
        return true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    public void I() {
        Surface surface;
        try {
            super.I();
            surface = this.T0;
            if (surface != null) {
                if (this.S0 == surface) {
                    this.S0 = null;
                }
            }
        } finally {
            if (this.T0 != null) {
                Surface surface2 = this.S0;
                surface = this.T0;
                if (surface2 == surface) {
                    this.S0 = null;
                }
                surface.release();
                this.T0 = null;
            }
        }
    }

    public final void I1() {
        if (this.c1 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.L0.n(this.c1, jElapsedRealtime - this.b1);
            this.c1 = 0;
            this.b1 = jElapsedRealtime;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    public void J() {
        super.J();
        this.c1 = 0;
        this.b1 = SystemClock.elapsedRealtime();
        this.g1 = SystemClock.elapsedRealtime() * 1000;
        this.h1 = 0L;
        this.i1 = 0;
        this.K0.m();
    }

    public void J1() {
        this.Y0 = true;
        if (this.W0) {
            return;
        }
        this.W0 = true;
        this.L0.A(this.S0);
        this.U0 = true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    public void K() {
        this.a1 = -9223372036854775807L;
        I1();
        K1();
        this.K0.n();
        super.K();
    }

    public final void K1() {
        int i = this.i1;
        if (i != 0) {
            this.L0.B(this.h1, i);
            this.h1 = 0L;
            this.i1 = 0;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void L0(Exception exc) {
        toe.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.L0.C(exc);
    }

    public final void L1() {
        int i = this.j1;
        if (i == -1 && this.k1 == -1) {
            return;
        }
        wrq wrqVar = this.n1;
        if (wrqVar != null && wrqVar.f38295a == i && wrqVar.f38296b == this.k1 && wrqVar.c == this.l1 && wrqVar.d == this.m1) {
            return;
        }
        wrq wrqVar2 = new wrq(this.j1, this.k1, this.l1, this.m1);
        this.n1 = wrqVar2;
        this.L0.D(wrqVar2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void M0(String str, long j, long j2) {
        this.L0.k(str, j, j2);
        this.Q0 = u1(str);
        this.R0 = ((c) rk1.e(q0())).n();
        if (wlq.f38110a < 23 || !this.o1) {
            return;
        }
        this.q1 = new b((com.google.android.exoplayer2.mediacodec.b) rk1.e(p0()));
    }

    public final void M1() {
        if (this.U0) {
            this.L0.A(this.S0);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void N0(String str) {
        this.L0.l(str);
    }

    public final void N1() {
        wrq wrqVar = this.n1;
        if (wrqVar != null) {
            this.L0.D(wrqVar);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public us5 O0(a1a a1aVar) throws ExoPlaybackException {
        us5 us5VarO0 = super.O0(a1aVar);
        this.L0.p(a1aVar.f517b, us5VarO0);
        return us5VarO0;
    }

    public final void O1(long j, long j2, Format format) {
        arq arqVar = this.r1;
        if (arqVar != null) {
            arqVar.a(j, j2, format, t0());
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void P0(Format format, MediaFormat mediaFormat) {
        com.google.android.exoplayer2.mediacodec.b bVarP0 = p0();
        if (bVarP0 != null) {
            bVarP0.b(this.V0);
        }
        if (this.o1) {
            this.j1 = format.q;
            this.k1 = format.f7818r;
        } else {
            rk1.e(mediaFormat);
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.j1 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.k1 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f = format.u;
        this.m1 = f;
        if (wlq.f38110a >= 21) {
            int i = format.t;
            if (i == 90 || i == 270) {
                int i2 = this.j1;
                this.j1 = this.k1;
                this.k1 = i2;
                this.m1 = 1.0f / f;
            }
        } else {
            this.l1 = format.t;
        }
        this.K0.i(format.s);
    }

    public void P1(long j) throws ExoPlaybackException {
        p1(j);
        L1();
        this.E0.e++;
        J1();
        Q0(j);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public us5 Q(c cVar, Format format, Format format2) {
        us5 us5VarE = cVar.e(format, format2);
        int i = us5VarE.e;
        int i2 = format2.q;
        a aVar = this.P0;
        if (i2 > aVar.f17844a || format2.f7818r > aVar.f17845b) {
            i |= 256;
        }
        if (D1(cVar, format2) > this.P0.c) {
            i |= 64;
        }
        int i3 = i;
        return new us5(cVar.f7979a, format, format2, i3 != 0 ? 0 : us5VarE.d, i3);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void Q0(long j) {
        super.Q0(j);
        if (this.o1) {
            return;
        }
        this.e1--;
    }

    public final void Q1() {
        f1();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void R0() {
        super.R0();
        s1();
    }

    public void R1(com.google.android.exoplayer2.mediacodec.b bVar, int i, long j) {
        L1();
        nkp.a("releaseOutputBuffer");
        bVar.f(i, true);
        nkp.c();
        this.g1 = SystemClock.elapsedRealtime() * 1000;
        this.E0.e++;
        this.d1 = 0;
        J1();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void S0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        boolean z = this.o1;
        if (!z) {
            this.e1++;
        }
        if (wlq.f38110a >= 23 || !z) {
            return;
        }
        P1(decoderInputBuffer.e);
    }

    @RequiresApi(21)
    public void S1(com.google.android.exoplayer2.mediacodec.b bVar, int i, long j, long j2) {
        L1();
        nkp.a("releaseOutputBuffer");
        bVar.d(i, j2);
        nkp.c();
        this.g1 = SystemClock.elapsedRealtime() * 1000;
        this.E0.e++;
        this.d1 = 0;
        J1();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean U0(long j, long j2, com.google.android.exoplayer2.mediacodec.b bVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format) throws ExoPlaybackException {
        rk1.e(bVar);
        if (this.Z0 == -9223372036854775807L) {
            this.Z0 = j;
        }
        if (j3 != this.f1) {
            this.K0.j(j3);
            this.f1 = j3;
        }
        long jX0 = x0();
        long j4 = j3 - jX0;
        if (z && !z2) {
            b2(bVar, i, j4);
            return true;
        }
        double dY0 = y0();
        boolean z3 = getState() == 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j5 = (long) ((j3 - j) / dY0);
        if (z3) {
            j5 -= jElapsedRealtime - j2;
        }
        if (this.S0 == this.T0) {
            if (!F1(j5)) {
                return false;
            }
            b2(bVar, i, j4);
            d2(j5);
            return true;
        }
        long j6 = jElapsedRealtime - this.g1;
        boolean z4 = this.Y0 ? !this.W0 : z3 || this.X0;
        if (this.a1 == -9223372036854775807L && j >= jX0 && (z4 || (z3 && Z1(j5, j6)))) {
            long jNanoTime = System.nanoTime();
            O1(j4, jNanoTime, format);
            if (wlq.f38110a >= 21) {
                S1(bVar, i, j4, jNanoTime);
            } else {
                R1(bVar, i, j4);
            }
            d2(j5);
            return true;
        }
        if (z3 && j != this.Z0) {
            long jNanoTime2 = System.nanoTime();
            long jB = this.K0.b((j5 * 1000) + jNanoTime2);
            long j7 = (jB - jNanoTime2) / 1000;
            boolean z5 = this.a1 != -9223372036854775807L;
            if (X1(j7, j2, z2) && H1(j, z5)) {
                return false;
            }
            if (Y1(j7, j2, z2)) {
                if (z5) {
                    b2(bVar, i, j4);
                } else {
                    x1(bVar, i, j4);
                }
                d2(j7);
                return true;
            }
            if (wlq.f38110a >= 21) {
                if (j7 < CreateRouteLoadingFragment.STYLE_LOADING_DURATION) {
                    O1(j4, jB, format);
                    S1(bVar, i, j4, jB);
                    d2(j7);
                    return true;
                }
            } else if (j7 < 30000) {
                if (j7 > 11000) {
                    try {
                        Thread.sleep((j7 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                O1(j4, jB, format);
                R1(bVar, i, j4);
                d2(j7);
                return true;
            }
        }
        return false;
    }

    public final void U1() {
        this.a1 = this.M0 > 0 ? SystemClock.elapsedRealtime() + this.M0 : -9223372036854775807L;
    }

    public final void V1(Object obj) throws ExoPlaybackException {
        Surface surfaceD = obj instanceof Surface ? (Surface) obj : null;
        if (surfaceD == null) {
            Surface surface = this.T0;
            if (surface != null) {
                surfaceD = surface;
            } else {
                c cVarQ0 = q0();
                if (cVarQ0 != null && a2(cVarQ0)) {
                    surfaceD = DummySurface.d(this.J0, cVarQ0.g);
                    this.T0 = surfaceD;
                }
            }
        }
        if (this.S0 == surfaceD) {
            if (surfaceD == null || surfaceD == this.T0) {
                return;
            }
            N1();
            M1();
            return;
        }
        this.S0 = surfaceD;
        this.K0.o(surfaceD);
        this.U0 = false;
        int state = getState();
        com.google.android.exoplayer2.mediacodec.b bVarP0 = p0();
        if (bVarP0 != null) {
            if (wlq.f38110a < 23 || surfaceD == null || this.Q0) {
                Y0();
                I0();
            } else {
                W1(bVarP0, surfaceD);
            }
        }
        if (surfaceD == null || surfaceD == this.T0) {
            t1();
            s1();
            return;
        }
        N1();
        s1();
        if (state == 2) {
            U1();
        }
    }

    @RequiresApi(23)
    public void W1(com.google.android.exoplayer2.mediacodec.b bVar, Surface surface) {
        bVar.j(surface);
    }

    public boolean X1(long j, long j2, boolean z) {
        return G1(j) && !z;
    }

    public boolean Y1(long j, long j2, boolean z) {
        return F1(j) && !z;
    }

    public boolean Z1(long j, long j2) {
        return F1(j) && j2 > 100000;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public MediaCodecDecoderException a0(Throwable th, c cVar) {
        return new MediaCodecVideoDecoderException(th, cVar, this.S0);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void a1() {
        super.a1();
        this.e1 = 0;
    }

    public final boolean a2(c cVar) {
        return wlq.f38110a >= 23 && !this.o1 && !u1(cVar.f7979a) && (!cVar.g || DummySurface.c(this.J0));
    }

    public void b2(com.google.android.exoplayer2.mediacodec.b bVar, int i, long j) {
        nkp.a("skipVideoBuffer");
        bVar.f(i, false);
        nkp.c();
        this.E0.f++;
    }

    public void c2(int i) {
        ss5 ss5Var = this.E0;
        ss5Var.g += i;
        this.c1 += i;
        int i2 = this.d1 + i;
        this.d1 = i2;
        ss5Var.h = Math.max(i2, ss5Var.h);
        int i3 = this.N0;
        if (i3 <= 0 || this.c1 < i3) {
            return;
        }
        I1();
    }

    public void d2(long j) {
        this.E0.a(j);
        this.h1 += j;
        this.i1++;
    }

    @Override // com.google.android.exoplayer2.s, defpackage.rkk
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r.b
    public void h(int i, Object obj) throws ExoPlaybackException {
        if (i == 1) {
            V1(obj);
            return;
        }
        if (i == 4) {
            this.V0 = ((Integer) obj).intValue();
            com.google.android.exoplayer2.mediacodec.b bVarP0 = p0();
            if (bVarP0 != null) {
                bVarP0.b(this.V0);
                return;
            }
            return;
        }
        if (i == 6) {
            this.r1 = (arq) obj;
            return;
        }
        if (i != 102) {
            super.h(i, obj);
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (this.p1 != iIntValue) {
            this.p1 = iIntValue;
            if (this.o1) {
                Y0();
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.s
    public boolean isReady() {
        Surface surface;
        if (super.isReady() && (this.W0 || (((surface = this.T0) != null && this.S0 == surface) || p0() == null || this.o1))) {
            this.a1 = -9223372036854775807L;
            return true;
        }
        if (this.a1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.a1) {
            return true;
        }
        this.a1 = -9223372036854775807L;
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean j1(c cVar) {
        return this.S0 != null || a2(cVar);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public int l1(d dVar, Format format) throws MediaCodecUtil.DecoderQueryException {
        int i = 0;
        if (!ayf.s(format.l)) {
            return rkk.t(0);
        }
        boolean z = format.o != null;
        List<c> listC1 = C1(dVar, format, z, false);
        if (z && listC1.isEmpty()) {
            listC1 = C1(dVar, format, false, false);
        }
        if (listC1.isEmpty()) {
            return rkk.t(1);
        }
        if (!MediaCodecRenderer.m1(format)) {
            return rkk.t(2);
        }
        c cVar = listC1.get(0);
        boolean zM = cVar.m(format);
        int i2 = cVar.o(format) ? 16 : 8;
        if (zM) {
            List<c> listC2 = C1(dVar, format, z, true);
            if (!listC2.isEmpty()) {
                c cVar2 = listC2.get(0);
                if (cVar2.m(format) && cVar2.o(format)) {
                    i = 32;
                }
            }
        }
        return rkk.k(zM ? 4 : 3, i2, i);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean r0() {
        return this.o1 && wlq.f38110a < 23;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public float s0(float f, Format format, Format[] formatArr) {
        float fMax = -1.0f;
        for (Format format2 : formatArr) {
            float f2 = format2.s;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    public final void s1() {
        com.google.android.exoplayer2.mediacodec.b bVarP0;
        this.W0 = false;
        if (wlq.f38110a < 23 || !this.o1 || (bVarP0 = p0()) == null) {
            return;
        }
        this.q1 = new b(bVarP0);
    }

    public final void t1() {
        this.n1 = null;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public List<c> u0(d dVar, Format format, boolean z) throws MediaCodecUtil.DecoderQueryException {
        return C1(dVar, format, z, this.o1);
    }

    public boolean u1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (fjf.class) {
            try {
                if (!t1) {
                    u1 = y1();
                    t1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return u1;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.s
    public void w(float f, float f2) throws ExoPlaybackException {
        super.w(f, f2);
        this.K0.k(f);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public com.google.android.exoplayer2.mediacodec.b.a w0(c cVar, Format format, MediaCrypto mediaCrypto, float f) {
        String str = cVar.c;
        a aVarB1 = B1(cVar, format, D());
        this.P0 = aVarB1;
        MediaFormat mediaFormatE1 = E1(format, str, aVarB1, f, this.O0, this.o1 ? this.p1 : 0);
        if (this.S0 == null) {
            if (!a2(cVar)) {
                throw new IllegalStateException();
            }
            if (this.T0 == null) {
                this.T0 = DummySurface.d(this.J0, cVar.g);
            }
            this.S0 = this.T0;
        }
        return new com.google.android.exoplayer2.mediacodec.b.a(cVar, mediaFormatE1, format, this.S0, mediaCrypto, 0);
    }

    public void x1(com.google.android.exoplayer2.mediacodec.b bVar, int i, long j) {
        nkp.a("dropVideoBuffer");
        bVar.f(i, false);
        nkp.c();
        c2(1);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @TargetApi(29)
    public void z0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        if (this.R0) {
            ByteBuffer byteBuffer = (ByteBuffer) rk1.e(decoderInputBuffer.f);
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s == 60 && s2 == 1 && b3 == 4 && b4 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    T1(p0(), bArr);
                }
            }
        }
    }

    public fjf(Context context, d dVar, long j, boolean z, Handler handler, vrq vrqVar, int i) {
        this(context, com.google.android.exoplayer2.mediacodec.b.InterfaceC0187b.f7978a, dVar, j, z, handler, vrqVar, i);
    }
}
