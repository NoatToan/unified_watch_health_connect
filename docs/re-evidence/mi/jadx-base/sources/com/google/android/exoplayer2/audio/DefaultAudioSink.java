package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Format;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.fitness.sport_manager.sensor.SportSensorManager;
import defpackage.ayf;
import defpackage.dt1;
import defpackage.e20;
import defpackage.i20;
import defpackage.j9g;
import defpackage.m67;
import defpackage.n0i;
import defpackage.nm1;
import defpackage.om1;
import defpackage.rk1;
import defpackage.toe;
import defpackage.wlq;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultAudioSink implements AudioSink {
    public static boolean a0 = false;
    public long A;
    public long B;
    public long C;
    public int D;
    public boolean E;
    public boolean F;
    public long G;
    public float H;
    public AudioProcessor[] I;
    public ByteBuffer[] J;
    public ByteBuffer K;
    public int L;
    public ByteBuffer M;
    public byte[] N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public dt1 V;
    public boolean W;
    public long X;
    public boolean Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final om1 f7826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f7827b;
    public final boolean c;
    public final com.google.android.exoplayer2.audio.d d;
    public final j e;
    public final AudioProcessor[] f;
    public final AudioProcessor[] g;
    public final ConditionVariable h;
    public final com.google.android.exoplayer2.audio.b i;
    public final ArrayDeque<e> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f7828k;
    public final int l;
    public h m;
    public final f<AudioSink.InitializationException> n;
    public final f<AudioSink.WriteException> o;
    public AudioSink.a p;
    public c q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f7829r;
    public AudioTrack s;
    public nm1 t;
    public e u;
    public e v;
    public n0i w;
    public ByteBuffer x;
    public int y;
    public long z;

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        public /* synthetic */ InvalidAudioTrackTimestampException(String str, a aVar) {
            this(str);
        }

        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    public class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AudioTrack f7830a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, AudioTrack audioTrack) {
            super(str);
            this.f7830a = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f7830a.flush();
                this.f7830a.release();
            } finally {
                DefaultAudioSink.this.h.open();
            }
        }
    }

    public interface b {
        n0i a(n0i n0iVar);

        AudioProcessor[] b();

        long c();

        long d(long j);

        boolean e(boolean z);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Format f7832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7833b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final AudioProcessor[] i;

        public c(Format format, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, AudioProcessor[] audioProcessorArr) {
            this.f7832a = format;
            this.f7833b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.i = audioProcessorArr;
            this.h = c(i7, z);
        }

        @RequiresApi(21)
        public static AudioAttributes j(nm1 nm1Var, boolean z) {
            return z ? k() : nm1Var.a();
        }

        @RequiresApi(21)
        public static AudioAttributes k() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public AudioTrack a(boolean z, nm1 nm1Var, int i) throws AudioSink.InitializationException {
            try {
                AudioTrack audioTrackD = d(z, nm1Var, i);
                int state = audioTrackD.getState();
                if (state == 1) {
                    return audioTrackD;
                }
                try {
                    audioTrackD.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.e, this.f, this.h, this.f7832a, o(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                throw new AudioSink.InitializationException(0, this.e, this.f, this.h, this.f7832a, o(), e);
            }
        }

        public boolean b(c cVar) {
            return cVar.c == this.c && cVar.g == this.g && cVar.e == this.e && cVar.f == this.f && cVar.d == this.d;
        }

        public final int c(int i, boolean z) {
            if (i != 0) {
                return i;
            }
            int i2 = this.c;
            if (i2 == 0) {
                return m(z ? 8.0f : 1.0f);
            }
            if (i2 == 1) {
                return l(50000000L);
            }
            if (i2 == 2) {
                return l(250000L);
            }
            throw new IllegalStateException();
        }

        public final AudioTrack d(boolean z, nm1 nm1Var, int i) {
            int i2 = wlq.f38110a;
            if (i2 >= 29) {
                return f(z, nm1Var, i);
            }
            return i2 >= 21 ? e(z, nm1Var, i) : g(nm1Var, i);
        }

        @RequiresApi(21)
        public final AudioTrack e(boolean z, nm1 nm1Var, int i) {
            return new AudioTrack(j(nm1Var, z), DefaultAudioSink.J(this.e, this.f, this.g), this.h, 1, i);
        }

        @RequiresApi(29)
        public final AudioTrack f(boolean z, nm1 nm1Var, int i) {
            return new AudioTrack.Builder().setAudioAttributes(j(nm1Var, z)).setAudioFormat(DefaultAudioSink.J(this.e, this.f, this.g)).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i).setOffloadedPlayback(this.c == 1).build();
        }

        public final AudioTrack g(nm1 nm1Var, int i) {
            int iB0 = wlq.b0(nm1Var.c);
            return i == 0 ? new AudioTrack(iB0, this.e, this.f, this.g, this.h, 1) : new AudioTrack(iB0, this.e, this.f, this.g, this.h, 1, i);
        }

        public long h(long j) {
            return (j * ((long) this.e)) / FolmeCore.NANOS_TO_MS;
        }

        public long i(long j) {
            return (j * FolmeCore.NANOS_TO_MS) / ((long) this.e);
        }

        public final int l(long j) {
            int iP = DefaultAudioSink.P(this.g);
            if (this.g == 5) {
                iP *= 2;
            }
            return (int) ((j * ((long) iP)) / FolmeCore.NANOS_TO_MS);
        }

        public final int m(float f) {
            int minBufferSize = AudioTrack.getMinBufferSize(this.e, this.f, this.g);
            rk1.g(minBufferSize != -2);
            int iR = wlq.r(minBufferSize * 4, ((int) h(250000L)) * this.d, Math.max(minBufferSize, ((int) h(750000L)) * this.d));
            return f != 1.0f ? Math.round(iR * f) : iR;
        }

        public long n(long j) {
            return (j * FolmeCore.NANOS_TO_MS) / ((long) this.f7832a.z);
        }

        public boolean o() {
            return this.c == 1;
        }
    }

    public static class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioProcessor[] f7834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.audio.h f7835b;
        public final i c;

        public d(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new com.google.android.exoplayer2.audio.h(), new i());
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.b
        public n0i a(n0i n0iVar) {
            this.c.h(n0iVar.f27406a);
            this.c.g(n0iVar.f27407b);
            return n0iVar;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.b
        public AudioProcessor[] b() {
            return this.f7834a;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.b
        public long c() {
            return this.f7835b.o();
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.b
        public long d(long j) {
            return this.c.f(j);
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.b
        public boolean e(boolean z) {
            this.f7835b.u(z);
            return z;
        }

        public d(AudioProcessor[] audioProcessorArr, com.google.android.exoplayer2.audio.h hVar, i iVar) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f7834a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f7835b = hVar;
            this.c = iVar;
            audioProcessorArr2[audioProcessorArr.length] = hVar;
            audioProcessorArr2[audioProcessorArr.length + 1] = iVar;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n0i f7836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f7837b;
        public final long c;
        public final long d;

        public /* synthetic */ e(n0i n0iVar, boolean z, long j, long j2, a aVar) {
            this(n0iVar, z, j, j2);
        }

        public e(n0i n0iVar, boolean z, long j, long j2) {
            this.f7836a = n0iVar;
            this.f7837b = z;
            this.c = j;
            this.d = j2;
        }
    }

    public static final class f<T extends Exception> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f7838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public T f7839b;
        public long c;

        public f(long j) {
            this.f7838a = j;
        }

        public void a() {
            this.f7839b = null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void b(T t) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f7839b == null) {
                this.f7839b = t;
                this.c = this.f7838a + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.c) {
                T t2 = this.f7839b;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.f7839b;
                a();
                throw t3;
            }
        }
    }

    public final class g implements com.google.android.exoplayer2.audio.b.a {
        public g() {
        }

        @Override // com.google.android.exoplayer2.audio.b.a
        public void a(long j) {
            if (DefaultAudioSink.this.p != null) {
                DefaultAudioSink.this.p.a(j);
            }
        }

        @Override // com.google.android.exoplayer2.audio.b.a
        public void b(long j, long j2, long j3, long j4) {
            long jS = DefaultAudioSink.this.S();
            long jT = DefaultAudioSink.this.T();
            StringBuilder sb = new StringBuilder(182);
            sb.append("Spurious audio timestamp (frame position mismatch): ");
            sb.append(j);
            sb.append(", ");
            sb.append(j2);
            sb.append(", ");
            sb.append(j3);
            sb.append(", ");
            sb.append(j4);
            sb.append(", ");
            sb.append(jS);
            sb.append(", ");
            sb.append(jT);
            String string = sb.toString();
            if (DefaultAudioSink.a0) {
                throw new InvalidAudioTrackTimestampException(string, null);
            }
            toe.h("DefaultAudioSink", string);
        }

        @Override // com.google.android.exoplayer2.audio.b.a
        public void c(long j, long j2, long j3, long j4) {
            long jS = DefaultAudioSink.this.S();
            long jT = DefaultAudioSink.this.T();
            StringBuilder sb = new StringBuilder(180);
            sb.append("Spurious audio timestamp (system clock mismatch): ");
            sb.append(j);
            sb.append(", ");
            sb.append(j2);
            sb.append(", ");
            sb.append(j3);
            sb.append(", ");
            sb.append(j4);
            sb.append(", ");
            sb.append(jS);
            sb.append(", ");
            sb.append(jT);
            String string = sb.toString();
            if (DefaultAudioSink.a0) {
                throw new InvalidAudioTrackTimestampException(string, null);
            }
            toe.h("DefaultAudioSink", string);
        }

        @Override // com.google.android.exoplayer2.audio.b.a
        public void d(int i, long j) {
            if (DefaultAudioSink.this.p != null) {
                DefaultAudioSink.this.p.c(i, j, SystemClock.elapsedRealtime() - DefaultAudioSink.this.X);
            }
        }

        @Override // com.google.android.exoplayer2.audio.b.a
        public void e(long j) {
            StringBuilder sb = new StringBuilder(61);
            sb.append("Ignoring impossibly large audio latency: ");
            sb.append(j);
            toe.h("DefaultAudioSink", sb.toString());
        }

        public /* synthetic */ g(DefaultAudioSink defaultAudioSink, a aVar) {
            this();
        }
    }

    @RequiresApi(29)
    public final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f7841a = new Handler();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AudioTrack$StreamEventCallback f7842b;

        public class a extends AudioTrack$StreamEventCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ DefaultAudioSink f7843a;

            public a(DefaultAudioSink defaultAudioSink) {
                this.f7843a = defaultAudioSink;
            }

            public void onDataRequest(AudioTrack audioTrack, int i) {
                rk1.g(audioTrack == DefaultAudioSink.this.s);
                if (DefaultAudioSink.this.p == null || !DefaultAudioSink.this.S) {
                    return;
                }
                DefaultAudioSink.this.p.f();
            }

            public void onTearDown(AudioTrack audioTrack) {
                rk1.g(audioTrack == DefaultAudioSink.this.s);
                if (DefaultAudioSink.this.p == null || !DefaultAudioSink.this.S) {
                    return;
                }
                DefaultAudioSink.this.p.f();
            }
        }

        public h() {
            this.f7842b = new a(DefaultAudioSink.this);
        }

        public void a(AudioTrack audioTrack) {
            final Handler handler = this.f7841a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new Executor() { // from class: lt5
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.f7842b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f7842b);
            this.f7841a.removeCallbacksAndMessages(null);
        }
    }

    public DefaultAudioSink(om1 om1Var, b bVar, boolean z, boolean z2, int i) {
        this.f7826a = om1Var;
        this.f7827b = (b) rk1.e(bVar);
        int i2 = wlq.f38110a;
        this.c = i2 >= 21 && z;
        this.f7828k = i2 >= 23 && z2;
        this.l = i2 >= 29 ? i : 0;
        this.h = new ConditionVariable(true);
        this.i = new com.google.android.exoplayer2.audio.b(new g(this, null));
        com.google.android.exoplayer2.audio.d dVar = new com.google.android.exoplayer2.audio.d();
        this.d = dVar;
        j jVar = new j();
        this.e = jVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new com.google.android.exoplayer2.audio.g(), dVar, jVar);
        Collections.addAll(arrayList, bVar.b());
        this.f = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[0]);
        this.g = new AudioProcessor[]{new com.google.android.exoplayer2.audio.e()};
        this.H = 1.0f;
        this.t = nm1.f;
        this.U = 0;
        this.V = new dt1(0, 0.0f);
        n0i n0iVar = n0i.d;
        this.v = new e(n0iVar, false, 0L, 0L, null);
        this.w = n0iVar;
        this.P = -1;
        this.I = new AudioProcessor[0];
        this.J = new ByteBuffer[0];
        this.j = new ArrayDeque<>();
        this.n = new f<>(100L);
        this.o = new f<>(100L);
    }

    @RequiresApi(21)
    public static AudioFormat J(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    public static int L(int i) {
        int i2 = wlq.f38110a;
        if (i2 <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (i2 <= 26 && "fugu".equals(wlq.f38111b) && i == 1) {
            i = 2;
        }
        return wlq.G(i);
    }

    public static Pair<Integer, Integer> M(Format format, om1 om1Var) {
        if (om1Var == null) {
            return null;
        }
        int iF = ayf.f((String) rk1.e(format.l), format.i);
        int iO = 6;
        if (iF != 5 && iF != 6 && iF != 18 && iF != 17 && iF != 7 && iF != 8 && iF != 14) {
            return null;
        }
        if (iF == 18 && !om1Var.e(18)) {
            iF = 6;
        } else if (iF == 8 && !om1Var.e(8)) {
            iF = 7;
        }
        if (!om1Var.e(iF)) {
            return null;
        }
        if (iF != 18) {
            iO = format.y;
            if (iO > om1Var.d()) {
                return null;
            }
        } else if (wlq.f38110a >= 29 && (iO = O(18, format.z)) == 0) {
            toe.h("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
            return null;
        }
        int iL = L(iO);
        if (iL == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iF), Integer.valueOf(iL));
    }

    public static int N(int i, ByteBuffer byteBuffer) {
        switch (i) {
            case 5:
            case 6:
            case 18:
                return e20.d(byteBuffer);
            case 7:
            case 8:
                return m67.e(byteBuffer);
            case 9:
                int iM = j9g.m(wlq.H(byteBuffer, byteBuffer.position()));
                if (iM != -1) {
                    return iM;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unexpected audio encoding: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            case 14:
                int iA = e20.a(byteBuffer);
                if (iA == -1) {
                    return 0;
                }
                return e20.h(byteBuffer, iA) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return i20.c(byteBuffer);
        }
    }

    @RequiresApi(29)
    public static int O(int i, int i2) {
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        for (int i3 = 8; i3 > 0; i3--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(wlq.G(i3)).build(), audioAttributesBuild)) {
                return i3;
            }
        }
        return 0;
    }

    public static int P(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return SportSensorManager.SAMPLING_PERIOD_US_25HZ;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return CommonConstants.Mgc.NEED_UPGRADE_VERSION;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
        }
    }

    public static boolean V(int i) {
        return (wlq.f38110a >= 24 && i == -6) || i == -32;
    }

    public static boolean X() {
        return wlq.f38110a >= 30 && wlq.d.startsWith("Pixel");
    }

    public static boolean Y(AudioTrack audioTrack) {
        return wlq.f38110a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public static boolean Z(Format format, om1 om1Var) {
        return M(format, om1Var) != null;
    }

    @RequiresApi(21)
    public static void i0(AudioTrack audioTrack, float f2) {
        audioTrack.setVolume(f2);
    }

    public static void j0(AudioTrack audioTrack, float f2) {
        audioTrack.setStereoVolume(f2, f2);
    }

    @RequiresApi(21)
    public static int p0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    public final void D(long j) {
        n0i n0iVarA = l0() ? this.f7827b.a(K()) : n0i.d;
        boolean zE = l0() ? this.f7827b.e(R()) : false;
        this.j.add(new e(n0iVarA, zE, Math.max(0L, j), this.f7829r.i(T()), null));
        k0();
        AudioSink.a aVar = this.p;
        if (aVar != null) {
            aVar.onSkipSilenceEnabledChanged(zE);
        }
    }

    public final long E(long j) {
        while (!this.j.isEmpty() && j >= this.j.getFirst().d) {
            this.v = this.j.remove();
        }
        e eVar = this.v;
        long j2 = j - eVar.d;
        if (eVar.f7836a.equals(n0i.d)) {
            return this.v.c + j2;
        }
        if (this.j.isEmpty()) {
            return this.v.c + this.f7827b.d(j2);
        }
        e first = this.j.getFirst();
        return first.c - wlq.V(first.d - j, this.v.f7836a.f27406a);
    }

    public final long F(long j) {
        return j + this.f7829r.i(this.f7827b.c());
    }

    public final AudioTrack G() throws AudioSink.InitializationException {
        try {
            return ((c) rk1.e(this.f7829r)).a(this.W, this.t, this.U);
        } catch (AudioSink.InitializationException e2) {
            a0();
            AudioSink.a aVar = this.p;
            if (aVar != null) {
                aVar.b(e2);
            }
            throw e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final boolean H() throws com.google.android.exoplayer2.audio.AudioSink.WriteException {
        /*
            r9 = this;
            int r0 = r9.P
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.P = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.P
            com.google.android.exoplayer2.audio.AudioProcessor[] r5 = r9.I
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.c()
        L1f:
            r9.c0(r7)
            boolean r0 = r4.b()
            if (r0 != 0) goto L29
            return r2
        L29:
            int r0 = r9.P
            int r0 = r0 + r1
            r9.P = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.M
            if (r0 == 0) goto L3b
            r9.o0(r0, r7)
            java.nio.ByteBuffer r0 = r9.M
            if (r0 == 0) goto L3b
            return r2
        L3b:
            r9.P = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.H():boolean");
    }

    public final void I() {
        int i = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.I;
            if (i >= audioProcessorArr.length) {
                return;
            }
            AudioProcessor audioProcessor = audioProcessorArr[i];
            audioProcessor.flush();
            this.J[i] = audioProcessor.d();
            i++;
        }
    }

    public final n0i K() {
        return Q().f7836a;
    }

    public final e Q() {
        e eVar = this.u;
        if (eVar != null) {
            return eVar;
        }
        return !this.j.isEmpty() ? this.j.getLast() : this.v;
    }

    public boolean R() {
        return Q().f7837b;
    }

    public final long S() {
        c cVar = this.f7829r;
        return cVar.c == 0 ? this.z / ((long) cVar.f7833b) : this.A;
    }

    public final long T() {
        c cVar = this.f7829r;
        return cVar.c == 0 ? this.B / ((long) cVar.d) : this.C;
    }

    public final void U() throws AudioSink.InitializationException {
        this.h.block();
        AudioTrack audioTrackG = G();
        this.s = audioTrackG;
        if (Y(audioTrackG)) {
            d0(this.s);
            AudioTrack audioTrack = this.s;
            Format format = this.f7829r.f7832a;
            audioTrack.setOffloadDelayPadding(format.B, format.C);
        }
        this.U = this.s.getAudioSessionId();
        com.google.android.exoplayer2.audio.b bVar = this.i;
        AudioTrack audioTrack2 = this.s;
        c cVar = this.f7829r;
        bVar.t(audioTrack2, cVar.c == 2, cVar.g, cVar.d, cVar.h);
        h0();
        int i = this.V.f15907a;
        if (i != 0) {
            this.s.attachAuxEffect(i);
            this.s.setAuxEffectSendLevel(this.V.f15908b);
        }
        this.F = true;
    }

    public final boolean W() {
        return this.s != null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean a(Format format) {
        return n(format) != 0;
    }

    public final void a0() {
        if (this.f7829r.o()) {
            this.Y = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean b() {
        return !W() || (this.Q && !i());
    }

    public final void b0() {
        if (this.R) {
            return;
        }
        this.R = true;
        this.i.h(T());
        this.s.stop();
        this.y = 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public n0i c() {
        return this.f7828k ? this.w : K();
    }

    public final void c0(long j) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.I.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.J[i - 1];
            } else {
                byteBuffer = this.K;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.f7823a;
                }
            }
            if (i == length) {
                o0(byteBuffer, j);
            } else {
                AudioProcessor audioProcessor = this.I[i];
                if (i > this.P) {
                    audioProcessor.a(byteBuffer);
                }
                ByteBuffer byteBufferD = audioProcessor.d();
                this.J[i] = byteBufferD;
                if (byteBufferD.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void d(n0i n0iVar) {
        n0i n0iVar2 = new n0i(wlq.q(n0iVar.f27406a, 0.1f, 8.0f), wlq.q(n0iVar.f27407b, 0.1f, 8.0f));
        if (!this.f7828k || wlq.f38110a < 23) {
            f0(n0iVar2, R());
        } else {
            g0(n0iVar2);
        }
    }

    @RequiresApi(29)
    public final void d0(AudioTrack audioTrack) {
        if (this.m == null) {
            this.m = new h();
        }
        this.m.a(audioTrack);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void e() {
        if (this.W) {
            this.W = false;
            flush();
        }
    }

    public final void e0() {
        this.z = 0L;
        this.A = 0L;
        this.B = 0L;
        this.C = 0L;
        this.Z = false;
        this.D = 0;
        this.v = new e(K(), R(), 0L, 0L, null);
        this.G = 0L;
        this.u = null;
        this.j.clear();
        this.K = null;
        this.L = 0;
        this.M = null;
        this.R = false;
        this.Q = false;
        this.P = -1;
        this.x = null;
        this.y = 0;
        this.e.m();
        I();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void f(nm1 nm1Var) {
        if (this.t.equals(nm1Var)) {
            return;
        }
        this.t = nm1Var;
        if (this.W) {
            return;
        }
        flush();
    }

    public final void f0(n0i n0iVar, boolean z) {
        e eVarQ = Q();
        if (n0iVar.equals(eVarQ.f7836a) && z == eVarQ.f7837b) {
            return;
        }
        e eVar = new e(n0iVar, z, -9223372036854775807L, -9223372036854775807L, null);
        if (W()) {
            this.u = eVar;
        } else {
            this.v = eVar;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void flush() {
        if (W()) {
            e0();
            if (this.i.j()) {
                this.s.pause();
            }
            if (Y(this.s)) {
                ((h) rk1.e(this.m)).b(this.s);
            }
            AudioTrack audioTrack = this.s;
            this.s = null;
            if (wlq.f38110a < 21 && !this.T) {
                this.U = 0;
            }
            c cVar = this.q;
            if (cVar != null) {
                this.f7829r = cVar;
                this.q = null;
            }
            this.i.r();
            this.h.close();
            new a("ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.o.a();
        this.n.a();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void g() {
        if (wlq.f38110a < 25) {
            flush();
            return;
        }
        this.o.a();
        this.n.a();
        if (W()) {
            e0();
            if (this.i.j()) {
                this.s.pause();
            }
            this.s.flush();
            this.i.r();
            com.google.android.exoplayer2.audio.b bVar = this.i;
            AudioTrack audioTrack = this.s;
            c cVar = this.f7829r;
            bVar.t(audioTrack, cVar.c == 2, cVar.g, cVar.d, cVar.h);
            this.F = true;
        }
    }

    @RequiresApi(23)
    public final void g0(n0i n0iVar) {
        if (W()) {
            try {
                this.s.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(n0iVar.f27406a).setPitch(n0iVar.f27407b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e2) {
                toe.i("DefaultAudioSink", "Failed to set playback params", e2);
            }
            n0iVar = new n0i(this.s.getPlaybackParams().getSpeed(), this.s.getPlaybackParams().getPitch());
            this.i.u(n0iVar.f27406a);
        }
        this.w = n0iVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void h() {
        rk1.g(wlq.f38110a >= 21);
        rk1.g(this.T);
        if (this.W) {
            return;
        }
        this.W = true;
        flush();
    }

    public final void h0() {
        if (W()) {
            if (wlq.f38110a >= 21) {
                i0(this.s, this.H);
            } else {
                j0(this.s, this.H);
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean i() {
        return W() && this.i.i(T());
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void j(int i) {
        if (this.U != i) {
            this.U = i;
            this.T = i != 0;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void k(dt1 dt1Var) {
        if (this.V.equals(dt1Var)) {
            return;
        }
        int i = dt1Var.f15907a;
        float f2 = dt1Var.f15908b;
        AudioTrack audioTrack = this.s;
        if (audioTrack != null) {
            if (this.V.f15907a != i) {
                audioTrack.attachAuxEffect(i);
            }
            if (i != 0) {
                this.s.setAuxEffectSendLevel(f2);
            }
        }
        this.V = dt1Var;
    }

    public final void k0() {
        AudioProcessor[] audioProcessorArr = this.f7829r.i;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : audioProcessorArr) {
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.I = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.J = new ByteBuffer[size];
        I();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean l(ByteBuffer byteBuffer, long j, int i) throws Exception {
        ByteBuffer byteBuffer2 = this.K;
        rk1.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.q != null) {
            if (!H()) {
                return false;
            }
            if (this.q.b(this.f7829r)) {
                this.f7829r = this.q;
                this.q = null;
                if (Y(this.s)) {
                    this.s.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.s;
                    Format format = this.f7829r.f7832a;
                    audioTrack.setOffloadDelayPadding(format.B, format.C);
                    this.Z = true;
                }
            } else {
                b0();
                if (i()) {
                    return false;
                }
                flush();
            }
            D(j);
        }
        if (!W()) {
            try {
                U();
            } catch (AudioSink.InitializationException e2) {
                if (e2.isRecoverable) {
                    throw e2;
                }
                this.n.b(e2);
                return false;
            }
        }
        this.n.a();
        if (this.F) {
            this.G = Math.max(0L, j);
            this.E = false;
            this.F = false;
            if (this.f7828k && wlq.f38110a >= 23) {
                g0(this.w);
            }
            D(j);
            if (this.S) {
                play();
            }
        }
        if (!this.i.l(T())) {
            return false;
        }
        if (this.K == null) {
            rk1.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            c cVar = this.f7829r;
            if (cVar.c != 0 && this.D == 0) {
                int iN = N(cVar.g, byteBuffer);
                this.D = iN;
                if (iN == 0) {
                    return true;
                }
            }
            if (this.u != null) {
                if (!H()) {
                    return false;
                }
                D(j);
                this.u = null;
            }
            long jN = this.G + this.f7829r.n(S() - this.e.l());
            if (!this.E && Math.abs(jN - j) > 200000) {
                this.p.b(new AudioSink.UnexpectedDiscontinuityException(j, jN));
                this.E = true;
            }
            if (this.E) {
                if (!H()) {
                    return false;
                }
                long j2 = j - jN;
                this.G += j2;
                this.E = false;
                D(j);
                AudioSink.a aVar = this.p;
                if (aVar != null && j2 != 0) {
                    aVar.e();
                }
            }
            if (this.f7829r.c == 0) {
                this.z += (long) byteBuffer.remaining();
            } else {
                this.A += (long) (this.D * i);
            }
            this.K = byteBuffer;
            this.L = i;
        }
        c0(j);
        if (!this.K.hasRemaining()) {
            this.K = null;
            this.L = 0;
            return true;
        }
        if (!this.i.k(T())) {
            return false;
        }
        toe.h("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    public final boolean l0() {
        return (this.W || !"audio/raw".equals(this.f7829r.f7832a.l) || m0(this.f7829r.f7832a.A)) ? false : true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void m(AudioSink.a aVar) {
        this.p = aVar;
    }

    public final boolean m0(int i) {
        return this.c && wlq.n0(i);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public int n(Format format) {
        if (!"audio/raw".equals(format.l)) {
            return ((this.Y || !n0(format, this.t)) && !Z(format, this.f7826a)) ? 0 : 2;
        }
        if (wlq.o0(format.A)) {
            int i = format.A;
            return (i == 2 || (this.c && i == 4)) ? 2 : 1;
        }
        int i2 = format.A;
        StringBuilder sb = new StringBuilder(33);
        sb.append("Invalid PCM encoding: ");
        sb.append(i2);
        toe.h("DefaultAudioSink", sb.toString());
        return 0;
    }

    public final boolean n0(Format format, nm1 nm1Var) {
        int iF;
        int iG;
        if (wlq.f38110a < 29 || this.l == 0 || (iF = ayf.f((String) rk1.e(format.l), format.i)) == 0 || (iG = wlq.G(format.y)) == 0 || !AudioManager.isOffloadedPlaybackSupported(J(format.z, iG, iF), nm1Var.a())) {
            return false;
        }
        return ((format.B != 0 || format.C != 0) && (this.l == 1) && !X()) ? false : true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void o() throws AudioSink.WriteException {
        if (!this.Q && W() && H()) {
            b0();
            this.Q = true;
        }
    }

    public final void o0(ByteBuffer byteBuffer, long j) throws Exception {
        int iP0;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.M;
            if (byteBuffer2 != null) {
                rk1.a(byteBuffer2 == byteBuffer);
            } else {
                this.M = byteBuffer;
                if (wlq.f38110a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.N;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.N = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.N, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.O = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (wlq.f38110a < 21) {
                int iC = this.i.c(this.B);
                if (iC > 0) {
                    iP0 = this.s.write(this.N, this.O, Math.min(iRemaining2, iC));
                    if (iP0 > 0) {
                        this.O += iP0;
                        byteBuffer.position(byteBuffer.position() + iP0);
                    }
                } else {
                    iP0 = 0;
                }
            } else if (this.W) {
                rk1.g(j != -9223372036854775807L);
                iP0 = q0(this.s, byteBuffer, iRemaining2, j);
            } else {
                iP0 = p0(this.s, byteBuffer, iRemaining2);
            }
            this.X = SystemClock.elapsedRealtime();
            if (iP0 < 0) {
                boolean zV = V(iP0);
                if (zV) {
                    a0();
                }
                AudioSink.WriteException writeException = new AudioSink.WriteException(iP0, this.f7829r.f7832a, zV);
                AudioSink.a aVar = this.p;
                if (aVar != null) {
                    aVar.b(writeException);
                }
                if (writeException.isRecoverable) {
                    throw writeException;
                }
                this.o.b(writeException);
                return;
            }
            this.o.a();
            if (Y(this.s)) {
                long j2 = this.C;
                if (j2 > 0) {
                    this.Z = false;
                }
                if (this.S && this.p != null && iP0 < iRemaining2 && !this.Z) {
                    this.p.d(this.i.e(j2));
                }
            }
            int i = this.f7829r.c;
            if (i == 0) {
                this.B += (long) iP0;
            }
            if (iP0 == iRemaining2) {
                if (i != 0) {
                    rk1.g(byteBuffer == this.K);
                    this.C += (long) (this.D * this.L);
                }
                this.M = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public long p(boolean z) {
        if (!W() || this.F) {
            return Long.MIN_VALUE;
        }
        return F(E(Math.min(this.i.d(z), this.f7829r.i(T()))));
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void pause() {
        this.S = false;
        if (W() && this.i.q()) {
            this.s.pause();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void play() {
        this.S = true;
        if (W()) {
            this.i.v();
            this.s.play();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void q() {
        this.E = true;
    }

    @RequiresApi(21)
    public final int q0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (wlq.f38110a >= 26) {
            return audioTrack.write(byteBuffer, i, 1, j * 1000);
        }
        if (this.x == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.x = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.x.putInt(1431633921);
        }
        if (this.y == 0) {
            this.x.putInt(4, i);
            this.x.putLong(8, j * 1000);
            this.x.position(0);
            this.y = i;
        }
        int iRemaining = this.x.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.x, iRemaining, 1);
            if (iWrite < 0) {
                this.y = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iP0 = p0(audioTrack, byteBuffer, i);
        if (iP0 < 0) {
            this.y = 0;
            return iP0;
        }
        this.y -= iP0;
        return iP0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void r(float f2) {
        if (this.H != f2) {
            this.H = f2;
            h0();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void reset() {
        flush();
        for (AudioProcessor audioProcessor : this.f) {
            audioProcessor.reset();
        }
        for (AudioProcessor audioProcessor2 : this.g) {
            audioProcessor2.reset();
        }
        this.S = false;
        this.Y = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void s(Format format, int i, int[] iArr) throws AudioSink.ConfigurationException {
        int iZ;
        AudioProcessor[] audioProcessorArr;
        int iIntValue;
        int i2;
        int i3;
        int iIntValue2;
        int i4;
        int[] iArr2;
        if ("audio/raw".equals(format.l)) {
            rk1.a(wlq.o0(format.A));
            int iZ2 = wlq.Z(format.A, format.y);
            AudioProcessor[] audioProcessorArr2 = m0(format.A) ? this.g : this.f;
            this.e.n(format.B, format.C);
            if (wlq.f38110a < 21 && format.y == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i5 = 0; i5 < 6; i5++) {
                    iArr2[i5] = i5;
                }
            } else {
                iArr2 = iArr;
            }
            this.d.l(iArr2);
            AudioProcessor.a aVar = new AudioProcessor.a(format.z, format.y, format.A);
            for (AudioProcessor audioProcessor : audioProcessorArr2) {
                try {
                    AudioProcessor.a aVarE = audioProcessor.e(aVar);
                    if (audioProcessor.isActive()) {
                        aVar = aVarE;
                    }
                } catch (AudioProcessor.UnhandledAudioFormatException e2) {
                    throw new AudioSink.ConfigurationException(e2, format);
                }
            }
            int i6 = aVar.c;
            i2 = aVar.f7824a;
            iIntValue2 = wlq.G(aVar.f7825b);
            audioProcessorArr = audioProcessorArr2;
            iIntValue = i6;
            i3 = iZ2;
            iZ = wlq.Z(i6, aVar.f7825b);
            i4 = 0;
        } else {
            AudioProcessor[] audioProcessorArr3 = new AudioProcessor[0];
            int i7 = format.z;
            iZ = -1;
            if (n0(format, this.t)) {
                audioProcessorArr = audioProcessorArr3;
                iIntValue = ayf.f((String) rk1.e(format.l), format.i);
                i4 = 1;
                iIntValue2 = wlq.G(format.y);
                i2 = i7;
                i3 = -1;
            } else {
                Pair<Integer, Integer> pairM = M(format, this.f7826a);
                if (pairM == null) {
                    String strValueOf = String.valueOf(format);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 37);
                    sb.append("Unable to configure passthrough for: ");
                    sb.append(strValueOf);
                    throw new AudioSink.ConfigurationException(sb.toString(), format);
                }
                audioProcessorArr = audioProcessorArr3;
                iIntValue = ((Integer) pairM.first).intValue();
                i2 = i7;
                i3 = -1;
                iIntValue2 = ((Integer) pairM.second).intValue();
                i4 = 2;
            }
        }
        if (iIntValue == 0) {
            String strValueOf2 = String.valueOf(format);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 48);
            sb2.append("Invalid output encoding (mode=");
            sb2.append(i4);
            sb2.append(") for: ");
            sb2.append(strValueOf2);
            throw new AudioSink.ConfigurationException(sb2.toString(), format);
        }
        if (iIntValue2 != 0) {
            this.Y = false;
            c cVar = new c(format, i3, i4, iZ, i2, iIntValue2, iIntValue, i, this.f7828k, audioProcessorArr);
            if (W()) {
                this.q = cVar;
                return;
            } else {
                this.f7829r = cVar;
                return;
            }
        }
        String strValueOf3 = String.valueOf(format);
        StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 54);
        sb3.append("Invalid output channel config (mode=");
        sb3.append(i4);
        sb3.append(") for: ");
        sb3.append(strValueOf3);
        throw new AudioSink.ConfigurationException(sb3.toString(), format);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void t(boolean z) {
        f0(K(), z);
    }
}
