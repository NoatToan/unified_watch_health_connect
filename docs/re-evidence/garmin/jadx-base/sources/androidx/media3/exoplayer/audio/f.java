package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.q;
import androidx.media3.common.x;
import androidx.media3.common.y;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.a0;
import androidx.media3.exoplayer.e0;
import androidx.media3.exoplayer.g;
import androidx.media3.exoplayer.h;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.u0;
import androidx.media3.exoplayer.v0;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.MoreExecutors;
import fa.k;
import fa.n;
import fa.z;
import h0.r0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import mt0.b2;

/* JADX INFO: loaded from: classes.dex */
public class f extends MediaCodecRenderer implements e0 {
    public final androidx.media3.exoplayer.audio.b.a A1;
    public final AudioSink B1;
    public final pa.f C1;
    public int D1;
    public boolean E1;
    public boolean F1;
    public q G1;
    public q H1;
    public long I1;
    public boolean J1;
    public boolean K1;
    public boolean L1;
    public int M1;
    public boolean N1;
    public long O1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public final Context f8794z1;

    public final class b implements AudioSink.b {
        private b() {
        }

        public final void a(Exception exc) {
            k.d("Audio sink error", exc);
            androidx.media3.exoplayer.audio.b.a aVar = f.this.A1;
            Handler handler = aVar.f8766a;
            if (handler != null) {
                handler.post(new ka.f(aVar, exc, 1));
            }
        }
    }

    public f(Context context, androidx.media3.exoplayer.mediacodec.c.b bVar, androidx.media3.exoplayer.mediacodec.f fVar, boolean z14, Handler handler, androidx.media3.exoplayer.audio.b bVar2, AudioSink audioSink, pa.f fVar2) {
        super(1, bVar, fVar, z14, 44100.0f);
        this.f8794z1 = context.getApplicationContext();
        this.B1 = audioSink;
        this.C1 = fVar2;
        this.M1 = -1000;
        this.A1 = new androidx.media3.exoplayer.audio.b.a(handler, bVar2);
        this.O1 = C.TIME_UNSET;
        audioSink.f(new b());
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final float H(float f14, q[] qVarArr) {
        int iMax = -1;
        for (q qVar : qVarArr) {
            int i14 = qVar.D;
            if (i14 != -1) {
                iMax = Math.max(iMax, i14);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f14;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final ArrayList I(androidx.media3.exoplayer.mediacodec.f fVar, q qVar, boolean z14) {
        ImmutableList immutableListG;
        if (qVar.f8386n == null) {
            immutableListG = ImmutableList.of();
        } else if (this.B1.a(qVar)) {
            List<androidx.media3.exoplayer.mediacodec.d> listE = MediaCodecUtil.e(MimeTypes.AUDIO_RAW, false, false);
            androidx.media3.exoplayer.mediacodec.d dVar = listE.isEmpty() ? null : listE.get(0);
            if (dVar != null) {
                immutableListG = ImmutableList.of(dVar);
            } else {
                immutableListG = MediaCodecUtil.g(fVar, qVar, z14, false);
            }
        } else {
            immutableListG = MediaCodecUtil.g(fVar, qVar, z14, false);
        }
        HashMap<MediaCodecUtil.b, List<androidx.media3.exoplayer.mediacodec.d>> map = MediaCodecUtil.f9248a;
        ArrayList arrayList = new ArrayList(immutableListG);
        Collections.sort(arrayList, new a61.c(new b2(qVar, 27), 15));
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final long J(long j8, long j14) {
        long j15 = this.O1;
        if (j15 == C.TIME_UNSET) {
            return AbstractComponentTracker.LINGERING_TIMEOUT;
        }
        float f14 = j15 - j8;
        AudioSink audioSink = this.B1;
        long jO = (long) ((f14 / (audioSink.getPlaybackParameters() != null ? audioSink.getPlaybackParameters().f8584a : 1.0f)) / 2.0f);
        if (this.N1) {
            fa.c cVar = this.f8927g;
            cVar.getClass();
            jO -= z.O(cVar.elapsedRealtime()) - j14;
        }
        return Math.max(AbstractComponentTracker.LINGERING_TIMEOUT, jO);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d5  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final androidx.media3.exoplayer.mediacodec.c.a K(androidx.media3.exoplayer.mediacodec.d dVar, q qVar, MediaCrypto mediaCrypto, float f14) {
        boolean z14;
        q[] qVarArr = this.f8930j;
        qVarArr.getClass();
        int iR0 = r0(dVar, qVar);
        String str = dVar.f9270a;
        if (qVarArr.length != 1) {
            for (q qVar2 : qVarArr) {
                if (dVar.b(qVar, qVar2).f8979d != 0) {
                    iR0 = Math.max(iR0, r0(dVar, qVar2));
                }
            }
        }
        this.D1 = iR0;
        int i14 = z.f70071a;
        if (i14 < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(z.f70073c)) {
            String str2 = z.f70072b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        this.E1 = z14;
        this.F1 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str3 = dVar.f9272c;
        int i15 = this.D1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        int i16 = qVar.C;
        String str4 = qVar.f8386n;
        mediaFormat.setInteger("channel-count", i16);
        int i17 = qVar.D;
        mediaFormat.setInteger("sample-rate", i17);
        n.b(mediaFormat, qVar.f8389q);
        n.a(mediaFormat, "max-input-size", i15);
        if (i14 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f14 != -1.0f) {
                if (i14 == 23) {
                    String str5 = z.f70074d;
                    if (!"ZTE B2017G".equals(str5) && !"AXON 7 mini".equals(str5)) {
                        mediaFormat.setFloat("operating-rate", f14);
                    }
                } else {
                    mediaFormat.setFloat("operating-rate", f14);
                }
            }
        }
        if (i14 <= 28 && MimeTypes.AUDIO_AC4.equals(str4)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i14 >= 24) {
            int i18 = qVar.C;
            q.b bVar = new q.b();
            bVar.f8411m = x.n(MimeTypes.AUDIO_RAW);
            bVar.B = i18;
            bVar.C = i17;
            bVar.D = 4;
            if (this.B1.h(bVar.a()) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        if (i14 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i14 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.M1));
        }
        this.H1 = (!MimeTypes.AUDIO_RAW.equals(dVar.f9271b) || MimeTypes.AUDIO_RAW.equals(str4)) ? null : qVar;
        return androidx.media3.exoplayer.mediacodec.c.a.a(dVar, mediaFormat, qVar, mediaCrypto, this.C1);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void L(DecoderInputBuffer decoderInputBuffer) {
        q qVar;
        if (z.f70071a < 29 || (qVar = decoderInputBuffer.f8629b) == null || !Objects.equals(qVar.f8386n, MimeTypes.AUDIO_OPUS) || !this.f9213d1) {
            return;
        }
        ByteBuffer byteBuffer = decoderInputBuffer.f8634g;
        byteBuffer.getClass();
        q qVar2 = decoderInputBuffer.f8629b;
        qVar2.getClass();
        int i14 = qVar2.F;
        if (byteBuffer.remaining() == 8) {
            this.B1.k(i14, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / C.NANOS_PER_SECOND));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void Q(Exception exc) {
        k.d("Audio codec error", exc);
        androidx.media3.exoplayer.audio.b.a aVar = this.A1;
        Handler handler = aVar.f8766a;
        if (handler != null) {
            handler.post(new ka.f(aVar, exc, 0));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void R(long j8, long j14, String str) {
        androidx.media3.exoplayer.audio.b.a aVar = this.A1;
        Handler handler = aVar.f8766a;
        if (handler != null) {
            handler.post(new com.google.android.exoplayer2.audio.b(aVar, str, j8, j14, 2));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void S(String str) {
        androidx.media3.exoplayer.audio.b.a aVar = this.A1;
        Handler handler = aVar.f8766a;
        if (handler != null) {
            handler.post(new r0(27, aVar, str));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final h T(a0 a0Var) {
        q qVar = a0Var.f8667b;
        qVar.getClass();
        this.G1 = qVar;
        h hVarT = super.T(a0Var);
        androidx.media3.exoplayer.audio.b.a aVar = this.A1;
        Handler handler = aVar.f8766a;
        if (handler != null) {
            handler.post(new fh2.a(aVar, 11, qVar, hVarT));
        }
        return hVarT;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00f8 A[Catch: ConfigurationException -> 0x00f6, TryCatch #0 {ConfigurationException -> 0x00f6, blocks: (B:44:0x00d6, B:47:0x00de, B:49:0x00e2, B:51:0x00eb, B:54:0x00f8, B:55:0x00fb), top: B:59:0x00d6 }] */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void U(q qVar, MediaFormat mediaFormat) throws ExoPlaybackException {
        int iX;
        q qVar2 = this.H1;
        int[] iArr = null;
        if (qVar2 != null) {
            qVar = qVar2;
        } else if (this.H0 != null) {
            mediaFormat.getClass();
            String str = qVar.f8386n;
            int i14 = qVar.C;
            if (MimeTypes.AUDIO_RAW.equals(str)) {
                iX = qVar.E;
            } else if (z.f70071a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iX = mediaFormat.containsKey("v-bits-per-sample") ? z.x(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iX = mediaFormat.getInteger("pcm-encoding");
            }
            q.b bVar = new q.b();
            bVar.f8411m = x.n(MimeTypes.AUDIO_RAW);
            bVar.D = iX;
            bVar.E = qVar.F;
            bVar.F = qVar.G;
            bVar.f8409k = qVar.f8384l;
            bVar.f8399a = qVar.f8373a;
            bVar.f8400b = qVar.f8374b;
            bVar.f8401c = ImmutableList.copyOf((Collection) qVar.f8375c);
            bVar.f8402d = qVar.f8376d;
            bVar.f8403e = qVar.f8377e;
            bVar.f8404f = qVar.f8378f;
            bVar.B = mediaFormat.getInteger("channel-count");
            bVar.C = mediaFormat.getInteger("sample-rate");
            qVar = bVar.a();
            int i15 = qVar.C;
            if (this.E1 && i15 == 6 && i14 < 6) {
                iArr = new int[i14];
                for (int i16 = 0; i16 < i14; i16++) {
                    iArr[i16] = i16;
                }
            } else if (this.F1) {
                if (i15 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i15 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i15 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i15 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i15 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
        }
        try {
            int i17 = z.f70071a;
            AudioSink audioSink = this.B1;
            if (i17 >= 29) {
                if (this.f9213d1) {
                    v0 v0Var = this.f8924d;
                    v0Var.getClass();
                    if (v0Var.f9774a != 0) {
                        v0 v0Var2 = this.f8924d;
                        v0Var2.getClass();
                        audioSink.c(v0Var2.f9774a);
                    } else {
                        audioSink.c(0);
                    }
                } else {
                    audioSink.c(0);
                }
            }
            audioSink.g(qVar, iArr);
        } catch (AudioSink.ConfigurationException e4) {
            throw l(e4, e4.format, false, 5001);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void V(long j8) {
        this.B1.getClass();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void X() {
        this.B1.handleDiscontinuity();
    }

    @Override // androidx.media3.exoplayer.e0
    public final void b(y yVar) {
        this.B1.b(yVar);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean b0(long j8, long j14, androidx.media3.exoplayer.mediacodec.c cVar, ByteBuffer byteBuffer, int i14, int i15, int i16, long j15, boolean z14, boolean z15, q qVar) throws ExoPlaybackException {
        int i17;
        int i18;
        byteBuffer.getClass();
        this.O1 = C.TIME_UNSET;
        if (this.H1 != null && (i15 & 2) != 0) {
            cVar.getClass();
            cVar.d(i14);
            return true;
        }
        AudioSink audioSink = this.B1;
        if (z14) {
            if (cVar != null) {
                cVar.d(i14);
            }
            this.f9233u1.f8960f += i16;
            audioSink.handleDiscontinuity();
            return true;
        }
        try {
            if (!audioSink.handleBuffer(byteBuffer, j15, i16)) {
                this.O1 = j15;
                return false;
            }
            if (cVar != null) {
                cVar.d(i14);
            }
            this.f9233u1.f8959e += i16;
            return true;
        } catch (AudioSink.InitializationException e4) {
            q qVar2 = this.G1;
            boolean z16 = e4.isRecoverable;
            if (this.f9213d1) {
                v0 v0Var = this.f8924d;
                v0Var.getClass();
                if (v0Var.f9774a != 0) {
                    i18 = PlaybackException.ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED;
                } else {
                    i18 = 5001;
                }
            } else {
                i18 = 5001;
            }
            throw l(e4, qVar2, z16, i18);
        } catch (AudioSink.WriteException e14) {
            boolean z17 = e14.isRecoverable;
            if (this.f9213d1) {
                v0 v0Var2 = this.f8924d;
                v0Var2.getClass();
                if (v0Var2.f9774a != 0) {
                    i17 = PlaybackException.ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED;
                } else {
                    i17 = 5002;
                }
            } else {
                i17 = 5002;
            }
            throw l(e14, qVar, z17, i17);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void e0() throws ExoPlaybackException {
        try {
            this.B1.playToEndOfStream();
            long j8 = this.f9225o1;
            if (j8 != C.TIME_UNSET) {
                this.O1 = j8;
            }
        } catch (AudioSink.WriteException e4) {
            throw l(e4, e4.format, e4.isRecoverable, this.f9213d1 ? PlaybackException.ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED : 5002);
        }
    }

    @Override // androidx.media3.exoplayer.f, androidx.media3.exoplayer.t0
    public final e0 getMediaClock() {
        return this;
    }

    @Override // androidx.media3.exoplayer.t0, androidx.media3.exoplayer.u0
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // androidx.media3.exoplayer.e0
    public final y getPlaybackParameters() {
        return this.B1.getPlaybackParameters();
    }

    @Override // androidx.media3.exoplayer.e0
    public final long getPositionUs() {
        if (this.f8928h == 2) {
            s0();
        }
        return this.I1;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.f, androidx.media3.exoplayer.r0.b
    public final void handleMessage(int i14, Object obj) {
        pa.f fVar;
        AudioSink audioSink = this.B1;
        if (i14 == 2) {
            obj.getClass();
            audioSink.setVolume(((Float) obj).floatValue());
            return;
        }
        if (i14 == 3) {
            androidx.media3.common.d dVar = (androidx.media3.common.d) obj;
            dVar.getClass();
            audioSink.e(dVar);
            return;
        }
        if (i14 == 6) {
            androidx.media3.common.f fVar2 = (androidx.media3.common.f) obj;
            fVar2.getClass();
            audioSink.i(fVar2);
            return;
        }
        if (i14 == 12) {
            if (z.f70071a >= 23) {
                audioSink.setPreferredDevice((AudioDeviceInfo) obj);
                return;
            }
            return;
        }
        if (i14 == 16) {
            obj.getClass();
            this.M1 = ((Integer) obj).intValue();
            androidx.media3.exoplayer.mediacodec.c cVar = this.H0;
            if (cVar != null && z.f70071a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.M1));
                cVar.setParameters(bundle);
                return;
            }
            return;
        }
        if (i14 == 9) {
            obj.getClass();
            audioSink.setSkipSilenceEnabled(((Boolean) obj).booleanValue());
            return;
        }
        if (i14 != 10) {
            super.handleMessage(i14, obj);
            return;
        }
        obj.getClass();
        int iIntValue = ((Integer) obj).intValue();
        audioSink.setAudioSessionId(iIntValue);
        if (z.f70071a < 35 || (fVar = this.C1) == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = fVar.f136704c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            fVar.f136704c = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(iIntValue, MoreExecutors.directExecutor(), new pa.e(fVar));
        fVar.f136704c = loudnessCodecControllerCreate;
        Iterator<MediaCodec> it = fVar.f136702a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec(it.next())) {
                it.remove();
            }
        }
    }

    @Override // androidx.media3.exoplayer.e0
    public final boolean i() {
        boolean z14 = this.L1;
        this.L1 = false;
        return z14;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.f, androidx.media3.exoplayer.t0
    public final boolean isEnded() {
        return this.f9227q1 && this.B1.isEnded();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.t0
    public final boolean isReady() {
        return this.B1.hasPendingData() || super.isReady();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean l0(q qVar) {
        v0 v0Var = this.f8924d;
        v0Var.getClass();
        if (v0Var.f9774a != 0) {
            int iQ0 = q0(qVar);
            if ((iQ0 & 512) != 0) {
                v0 v0Var2 = this.f8924d;
                v0Var2.getClass();
                if (v0Var2.f9774a == 2 || (iQ0 & 1024) != 0) {
                    return true;
                }
                if (qVar.F == 0 && qVar.G == 0) {
                    return true;
                }
            }
        }
        return this.B1.a(qVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.f
    public final void m() {
        androidx.media3.exoplayer.audio.b.a aVar = this.A1;
        this.K1 = true;
        this.G1 = null;
        try {
            this.B1.flush();
            try {
                super.m();
            } finally {
                aVar.a(this.f9233u1);
            }
        } catch (Throwable th3) {
            try {
                super.m();
                throw th3;
            } finally {
                aVar.a(this.f9233u1);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final int m0(androidx.media3.exoplayer.mediacodec.f fVar, q qVar) {
        int iQ0;
        ImmutableList immutableListG;
        boolean z14;
        boolean z15;
        int iH = u0.h(1, 0, 0, 0);
        String str = qVar.f8386n;
        String str2 = qVar.f8386n;
        if (!x.j(str)) {
            return u0.h(0, 0, 0, 0);
        }
        int i14 = qVar.L;
        boolean z16 = i14 != 0;
        boolean z17 = i14 == 0 || i14 == 2;
        int i15 = 8;
        AudioSink audioSink = this.B1;
        if (z17) {
            if (z16) {
                List<androidx.media3.exoplayer.mediacodec.d> listE = MediaCodecUtil.e(MimeTypes.AUDIO_RAW, false, false);
                if ((listE.isEmpty() ? null : listE.get(0)) == null) {
                    iQ0 = 0;
                }
            }
            iQ0 = q0(qVar);
            if (audioSink.a(qVar)) {
                return u0.h(4, 8, 32, iQ0);
            }
        } else {
            iQ0 = 0;
        }
        if (!MimeTypes.AUDIO_RAW.equals(str2) || audioSink.a(qVar)) {
            int i16 = qVar.C;
            int i17 = qVar.D;
            int i18 = z.f70071a;
            q.b bVar = new q.b();
            bVar.f8411m = x.n(MimeTypes.AUDIO_RAW);
            bVar.B = i16;
            bVar.C = i17;
            bVar.D = 2;
            if (audioSink.a(bVar.a())) {
                if (str2 == null) {
                    immutableListG = ImmutableList.of();
                } else if (audioSink.a(qVar)) {
                    List<androidx.media3.exoplayer.mediacodec.d> listE2 = MediaCodecUtil.e(MimeTypes.AUDIO_RAW, false, false);
                    androidx.media3.exoplayer.mediacodec.d dVar = listE2.isEmpty() ? null : listE2.get(0);
                    if (dVar != null) {
                        immutableListG = ImmutableList.of(dVar);
                    } else {
                        immutableListG = MediaCodecUtil.g(fVar, qVar, false, false);
                    }
                } else {
                    immutableListG = MediaCodecUtil.g(fVar, qVar, false, false);
                }
                if (!immutableListG.isEmpty()) {
                    if (!z17) {
                        return u0.h(2, 0, 0, 0);
                    }
                    androidx.media3.exoplayer.mediacodec.d dVar2 = (androidx.media3.exoplayer.mediacodec.d) immutableListG.get(0);
                    boolean zD = dVar2.d(qVar);
                    if (!zD) {
                        int i19 = 1;
                        while (true) {
                            if (i19 >= immutableListG.size()) {
                                z14 = zD;
                                z15 = true;
                                break;
                            }
                            androidx.media3.exoplayer.mediacodec.d dVar3 = (androidx.media3.exoplayer.mediacodec.d) immutableListG.get(i19);
                            if (dVar3.d(qVar)) {
                                z15 = false;
                                dVar2 = dVar3;
                                z14 = true;
                                break;
                            }
                            i19++;
                        }
                    } else {
                        z14 = zD;
                        z15 = true;
                        break;
                    }
                    int i24 = z14 ? 4 : 3;
                    if (z14 && dVar2.e(qVar)) {
                        i15 = 16;
                    }
                    return (dVar2.f9276g ? 64 : 0) | i24 | i15 | 32 | (z15 ? 128 : 0) | iQ0;
                }
            }
        }
        return iH;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.f
    public final void n(boolean z14, boolean z15) {
        super.n(z14, z15);
        g gVar = this.f9233u1;
        androidx.media3.exoplayer.audio.b.a aVar = this.A1;
        Handler handler = aVar.f8766a;
        if (handler != null) {
            handler.post(new ka.d(aVar, gVar, 0));
        }
        v0 v0Var = this.f8924d;
        v0Var.getClass();
        boolean z16 = v0Var.f9775b;
        AudioSink audioSink = this.B1;
        if (z16) {
            audioSink.enableTunnelingV21();
        } else {
            audioSink.disableTunneling();
        }
        ja.q qVar = this.f8926f;
        qVar.getClass();
        audioSink.d(qVar);
        fa.c cVar = this.f8927g;
        cVar.getClass();
        audioSink.l(cVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.f
    public final void o(long j8, boolean z14) {
        super.o(j8, z14);
        this.B1.flush();
        this.I1 = j8;
        this.L1 = false;
        this.J1 = true;
    }

    @Override // androidx.media3.exoplayer.f
    public final void p() {
        pa.f fVar;
        this.B1.release();
        if (z.f70071a < 35 || (fVar = this.C1) == null) {
            return;
        }
        fVar.f136702a.clear();
        LoudnessCodecController loudnessCodecController = fVar.f136704c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.f
    public final void q() {
        AudioSink audioSink = this.B1;
        this.L1 = false;
        try {
            super.q();
        } finally {
            if (this.K1) {
                this.K1 = false;
                audioSink.reset();
            }
        }
    }

    public final int q0(q qVar) {
        ka.c cVarJ = this.B1.j(qVar);
        if (!cVarJ.f103667a) {
            return 0;
        }
        int i14 = cVarJ.f103668b ? 1536 : 512;
        return cVarJ.f103669c ? i14 | 2048 : i14;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.f
    public final void r() {
        this.B1.play();
        this.N1 = true;
    }

    public final int r0(androidx.media3.exoplayer.mediacodec.d dVar, q qVar) {
        int i14;
        if (!"OMX.google.raw.decoder".equals(dVar.f9270a) || (i14 = z.f70071a) >= 24 || (i14 == 23 && z.L(this.f8794z1))) {
            return qVar.f8387o;
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.f
    public final void s() {
        s0();
        this.N1 = false;
        this.B1.pause();
    }

    public final void s0() {
        long currentPositionUs = this.B1.getCurrentPositionUs(isEnded());
        if (currentPositionUs != Long.MIN_VALUE) {
            if (!this.J1) {
                currentPositionUs = Math.max(this.I1, currentPositionUs);
            }
            this.I1 = currentPositionUs;
            this.J1 = false;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final h w(androidx.media3.exoplayer.mediacodec.d dVar, q qVar, q qVar2) {
        h hVarB = dVar.b(qVar, qVar2);
        int i14 = hVarB.f8980e;
        if (this.P == null && l0(qVar2)) {
            i14 |= 32768;
        }
        if (r0(dVar, qVar2) > this.D1) {
            i14 |= 64;
        }
        int i15 = i14;
        return new h(dVar.f9270a, qVar, qVar2, i15 != 0 ? 0 : hVarB.f8979d, i15);
    }

    public f(Context context, androidx.media3.exoplayer.mediacodec.f fVar, Handler handler, androidx.media3.exoplayer.audio.b bVar) {
        this(context, fVar, handler, bVar, new DefaultAudioSink.d(context).a());
    }

    @Deprecated
    public f(Context context, androidx.media3.exoplayer.mediacodec.f fVar, Handler handler, androidx.media3.exoplayer.audio.b bVar, ka.a aVar, AudioProcessor... audioProcessorArr) {
        DefaultAudioSink.d dVar = new DefaultAudioSink.d();
        ka.a aVar2 = (ka.a) MoreObjects.firstNonNull(aVar, ka.a.f103656c);
        aVar2.getClass();
        dVar.f8715b = aVar2;
        audioProcessorArr.getClass();
        dVar.f8716c = new DefaultAudioSink.f(audioProcessorArr);
        this(context, fVar, handler, bVar, dVar.a());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(Context context, androidx.media3.exoplayer.mediacodec.f fVar, Handler handler, androidx.media3.exoplayer.audio.b bVar, AudioSink audioSink) {
        this(context, new androidx.media3.exoplayer.mediacodec.b(context), fVar, false, handler, bVar, audioSink);
        int i14 = androidx.media3.exoplayer.mediacodec.c.b.f9269a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(Context context, androidx.media3.exoplayer.mediacodec.f fVar, boolean z14, Handler handler, androidx.media3.exoplayer.audio.b bVar, AudioSink audioSink) {
        this(context, new androidx.media3.exoplayer.mediacodec.b(context), fVar, z14, handler, bVar, audioSink);
        int i14 = androidx.media3.exoplayer.mediacodec.c.b.f9269a;
    }

    public f(Context context, androidx.media3.exoplayer.mediacodec.c.b bVar, androidx.media3.exoplayer.mediacodec.f fVar, boolean z14, Handler handler, androidx.media3.exoplayer.audio.b bVar2, AudioSink audioSink) {
        this(context, bVar, fVar, z14, handler, bVar2, audioSink, z.f70071a >= 35 ? new pa.f() : null);
    }

    public f(Context context, androidx.media3.exoplayer.mediacodec.f fVar) {
        this(context, fVar, null, null);
    }
}
