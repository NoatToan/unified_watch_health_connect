package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.s;
import com.xiaomi.fitness.common.utils.RomUtils;
import defpackage.a1a;
import defpackage.ayf;
import defpackage.dt1;
import defpackage.jjf;
import defpackage.n0i;
import defpackage.nm1;
import defpackage.rk1;
import defpackage.rkk;
import defpackage.toe;
import defpackage.us5;
import defpackage.vif;
import defpackage.wlq;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class f extends MediaCodecRenderer implements vif {
    public final Context J0;
    public final com.google.android.exoplayer2.audio.a.C0182a K0;
    public final AudioSink L0;
    public int M0;
    public boolean N0;
    public Format O0;
    public long P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public s.a U0;

    public final class b implements AudioSink.a {
        public b() {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void a(long j) {
            f.this.K0.B(j);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void b(Exception exc) {
            toe.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            f.this.K0.l(exc);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void c(int i, long j, long j2) {
            f.this.K0.D(i, j, j2);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void d(long j) {
            if (f.this.U0 != null) {
                f.this.U0.b(j);
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void e() {
            f.this.x1();
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void f() {
            if (f.this.U0 != null) {
                f.this.U0.a();
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void onSkipSilenceEnabledChanged(boolean z) {
            f.this.K0.C(z);
        }
    }

    public f(Context context, com.google.android.exoplayer2.mediacodec.d dVar, boolean z, Handler handler, com.google.android.exoplayer2.audio.a aVar, AudioSink audioSink) {
        this(context, com.google.android.exoplayer2.mediacodec.b.InterfaceC0187b.f7978a, dVar, z, handler, aVar, audioSink);
    }

    public static boolean s1(String str) {
        if (wlq.f38110a < 24 && "OMX.SEC.aac.dec".equals(str) && RomUtils.SAMSUNG.equals(wlq.c)) {
            String str2 = wlq.f38111b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    public static boolean t1() {
        if (wlq.f38110a == 23) {
            String str = wlq.d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    public void F() {
        this.S0 = true;
        try {
            this.L0.flush();
            try {
                super.F();
            } finally {
                this.K0.o(this.E0);
            }
        } catch (Throwable th) {
            try {
                super.F();
                throw th;
            } finally {
                this.K0.o(this.E0);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    public void G(boolean z, boolean z2) throws ExoPlaybackException {
        super.G(z, z2);
        this.K0.p(this.E0);
        if (A().f33740a) {
            this.L0.h();
        } else {
            this.L0.e();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    public void H(long j, boolean z) throws ExoPlaybackException {
        super.H(j, z);
        if (this.T0) {
            this.L0.g();
        } else {
            this.L0.flush();
        }
        this.P0 = j;
        this.Q0 = true;
        this.R0 = true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    public void I() {
        try {
            super.I();
        } finally {
            if (this.S0) {
                this.S0 = false;
                this.L0.reset();
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    public void J() {
        super.J();
        this.L0.play();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    public void K() {
        y1();
        this.L0.pause();
        super.K();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void L0(Exception exc) {
        toe.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.K0.k(exc);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void M0(String str, long j, long j2) {
        this.K0.m(str, j, j2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void N0(String str) {
        this.K0.n(str);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public us5 O0(a1a a1aVar) throws ExoPlaybackException {
        us5 us5VarO0 = super.O0(a1aVar);
        this.K0.q(a1aVar.f517b, us5VarO0);
        return us5VarO0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void P0(Format format, MediaFormat mediaFormat) throws ExoPlaybackException {
        int iX;
        int i;
        Format format2 = this.O0;
        int[] iArr = null;
        if (format2 != null) {
            format = format2;
        } else if (p0() != null) {
            if ("audio/raw".equals(format.l)) {
                iX = format.A;
            } else if (wlq.f38110a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                iX = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                iX = wlq.X(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                iX = "audio/raw".equals(format.l) ? format.A : 2;
            }
            Format formatE = new Format.b().e0("audio/raw").Y(iX).M(format.B).N(format.C).H(mediaFormat.getInteger("channel-count")).f0(mediaFormat.getInteger("sample-rate")).E();
            if (this.N0 && formatE.y == 6 && (i = format.y) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < format.y; i2++) {
                    iArr[i2] = i2;
                }
            }
            format = formatE;
        }
        try {
            this.L0.s(format, 0, iArr);
        } catch (AudioSink.ConfigurationException e) {
            throw y(e, e.format);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public us5 Q(com.google.android.exoplayer2.mediacodec.c cVar, Format format, Format format2) {
        us5 us5VarE = cVar.e(format, format2);
        int i = us5VarE.e;
        if (u1(cVar, format2) > this.M0) {
            i |= 64;
        }
        int i2 = i;
        return new us5(cVar.f7979a, format, format2, i2 != 0 ? 0 : us5VarE.d, i2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void R0() {
        super.R0();
        this.L0.q();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void S0(DecoderInputBuffer decoderInputBuffer) {
        if (!this.Q0 || decoderInputBuffer.m()) {
            return;
        }
        if (Math.abs(decoderInputBuffer.e - this.P0) > 500000) {
            this.P0 = decoderInputBuffer.e;
        }
        this.Q0 = false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean U0(long j, long j2, com.google.android.exoplayer2.mediacodec.b bVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format) throws ExoPlaybackException {
        rk1.e(byteBuffer);
        if (this.O0 != null && (i2 & 2) != 0) {
            ((com.google.android.exoplayer2.mediacodec.b) rk1.e(bVar)).f(i, false);
            return true;
        }
        if (z) {
            if (bVar != null) {
                bVar.f(i, false);
            }
            this.E0.f += i3;
            this.L0.q();
            return true;
        }
        try {
            if (!this.L0.l(byteBuffer, j3, i3)) {
                return false;
            }
            if (bVar != null) {
                bVar.f(i, false);
            }
            this.E0.e += i3;
            return true;
        } catch (AudioSink.InitializationException e) {
            throw z(e, e.format, e.isRecoverable);
        } catch (AudioSink.WriteException e2) {
            throw z(e2, format, e2.isRecoverable);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void Z0() throws ExoPlaybackException {
        try {
            this.L0.o();
        } catch (AudioSink.WriteException e) {
            throw z(e, e.format, e.isRecoverable);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.s
    public boolean b() {
        return super.b() && this.L0.b();
    }

    @Override // defpackage.vif
    public n0i c() {
        return this.L0.c();
    }

    @Override // defpackage.vif
    public void d(n0i n0iVar) {
        this.L0.d(n0iVar);
    }

    @Override // com.google.android.exoplayer2.s, defpackage.rkk
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.r.b
    public void h(int i, Object obj) throws ExoPlaybackException {
        if (i == 2) {
            this.L0.r(((Float) obj).floatValue());
        }
        if (i == 3) {
            this.L0.f((nm1) obj);
            return;
        }
        if (i == 5) {
            this.L0.k((dt1) obj);
            return;
        }
        switch (i) {
            case 101:
                this.L0.t(((Boolean) obj).booleanValue());
                break;
            case 102:
                this.L0.j(((Integer) obj).intValue());
                break;
            case 103:
                this.U0 = (s.a) obj;
                break;
            default:
                super.h(i, obj);
                break;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.s
    public boolean isReady() {
        return this.L0.i() || super.isReady();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean k1(Format format) {
        return this.L0.a(format);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public int l1(com.google.android.exoplayer2.mediacodec.d dVar, Format format) throws MediaCodecUtil.DecoderQueryException {
        if (!ayf.p(format.l)) {
            return rkk.t(0);
        }
        int i = wlq.f38110a >= 21 ? 32 : 0;
        boolean z = format.E != null;
        boolean zM1 = MediaCodecRenderer.m1(format);
        int i2 = 8;
        if (zM1 && this.L0.a(format) && (!z || MediaCodecUtil.u() != null)) {
            return rkk.k(4, 8, i);
        }
        if ((!"audio/raw".equals(format.l) || this.L0.a(format)) && this.L0.a(wlq.Y(2, format.y, format.z))) {
            List<com.google.android.exoplayer2.mediacodec.c> listU0 = u0(dVar, format, false);
            if (listU0.isEmpty()) {
                return rkk.t(1);
            }
            if (!zM1) {
                return rkk.t(2);
            }
            com.google.android.exoplayer2.mediacodec.c cVar = listU0.get(0);
            boolean zM = cVar.m(format);
            if (zM && cVar.o(format)) {
                i2 = 16;
            }
            return rkk.k(zM ? 4 : 3, i2, i);
        }
        return rkk.t(1);
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.s
    public vif o() {
        return this;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public float s0(float f, Format format, Format[] formatArr) {
        int iMax = -1;
        for (Format format2 : formatArr) {
            int i = format2.z;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f * iMax;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public List<com.google.android.exoplayer2.mediacodec.c> u0(com.google.android.exoplayer2.mediacodec.d dVar, Format format, boolean z) throws MediaCodecUtil.DecoderQueryException {
        com.google.android.exoplayer2.mediacodec.c cVarU;
        String str = format.l;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.L0.a(format) && (cVarU = MediaCodecUtil.u()) != null) {
            return Collections.singletonList(cVarU);
        }
        List<com.google.android.exoplayer2.mediacodec.c> listT = MediaCodecUtil.t(dVar.a(str, z, false), format);
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList = new ArrayList(listT);
            arrayList.addAll(dVar.a("audio/eac3", z, false));
            listT = arrayList;
        }
        return Collections.unmodifiableList(listT);
    }

    public final int u1(com.google.android.exoplayer2.mediacodec.c cVar, Format format) {
        int i;
        if (!"OMX.google.raw.decoder".equals(cVar.f7979a) || (i = wlq.f38110a) >= 24 || (i == 23 && wlq.r0(this.J0))) {
            return format.m;
        }
        return -1;
    }

    @Override // defpackage.vif
    public long v() {
        if (getState() == 2) {
            y1();
        }
        return this.P0;
    }

    public int v1(com.google.android.exoplayer2.mediacodec.c cVar, Format format, Format[] formatArr) {
        int iU1 = u1(cVar, format);
        if (formatArr.length == 1) {
            return iU1;
        }
        for (Format format2 : formatArr) {
            if (cVar.e(format, format2).d != 0) {
                iU1 = Math.max(iU1, u1(cVar, format2));
            }
        }
        return iU1;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public com.google.android.exoplayer2.mediacodec.b.a w0(com.google.android.exoplayer2.mediacodec.c cVar, Format format, MediaCrypto mediaCrypto, float f) {
        this.M0 = v1(cVar, format, D());
        this.N0 = s1(cVar.f7979a);
        MediaFormat mediaFormatW1 = w1(format, cVar.c, this.M0, f);
        this.O0 = (!"audio/raw".equals(cVar.f7980b) || "audio/raw".equals(format.l)) ? null : format;
        return new com.google.android.exoplayer2.mediacodec.b.a(cVar, mediaFormatW1, format, null, mediaCrypto, 0);
    }

    @SuppressLint({"InlinedApi"})
    public MediaFormat w1(Format format, String str, int i, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", format.y);
        mediaFormat.setInteger("sample-rate", format.z);
        jjf.e(mediaFormat, format.n);
        jjf.d(mediaFormat, "max-input-size", i);
        int i2 = wlq.f38110a;
        if (i2 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && !t1()) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (i2 <= 28 && "audio/ac4".equals(format.l)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i2 >= 24 && this.L0.n(wlq.Y(4, format.y, format.z)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        return mediaFormat;
    }

    public void x1() {
        this.R0 = true;
    }

    public final void y1() {
        long jP = this.L0.p(b());
        if (jP != Long.MIN_VALUE) {
            if (!this.R0) {
                jP = Math.max(this.P0, jP);
            }
            this.P0 = jP;
            this.R0 = false;
        }
    }

    public f(Context context, com.google.android.exoplayer2.mediacodec.b.InterfaceC0187b interfaceC0187b, com.google.android.exoplayer2.mediacodec.d dVar, boolean z, Handler handler, com.google.android.exoplayer2.audio.a aVar, AudioSink audioSink) {
        super(1, interfaceC0187b, dVar, z, 44100.0f);
        this.J0 = context.getApplicationContext();
        this.L0 = audioSink;
        this.K0 = new com.google.android.exoplayer2.audio.a.C0182a(handler, aVar);
        audioSink.m(new b());
    }
}
