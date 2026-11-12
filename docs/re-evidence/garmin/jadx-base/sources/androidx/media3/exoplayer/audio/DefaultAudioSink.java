package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.y;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.t0;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
import ds.e0;
import fa.z;
import j20.x;
import ja.q;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import k32.n;
import ka.l;
import ka.o;
import ka.p;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultAudioSink implements AudioSink {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final Object f8674j0 = new Object();

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static ScheduledExecutorService f8675k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static int f8676l0;
    public g A;
    public g B;
    public y C;
    public boolean D;
    public ByteBuffer E;
    public int F;
    public long G;
    public long H;
    public long I;
    public long J;
    public int K;
    public boolean L;
    public boolean M;
    public long N;
    public float O;
    public ByteBuffer P;
    public int Q;
    public ByteBuffer R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public androidx.media3.common.f Y;
    public ka.b Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8677a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f8678a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f8679b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f8680b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ka.h f8681c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public long f8682c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f8683d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f8684d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImmutableList<AudioProcessor> f8685e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f8686e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImmutableList<AudioProcessor> f8687f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Looper f8688f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.media3.exoplayer.audio.c f8689g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public long f8690g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayDeque<g> f8691h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public long f8692h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f8693i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Handler f8694i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8695j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k f8696k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i<AudioSink.InitializationException> f8697l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i<AudioSink.WriteException> f8698m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final androidx.media3.exoplayer.audio.d f8699n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ka.j f8700o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final androidx.media3.exoplayer.audio.e f8701p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public q f8702q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.media3.exoplayer.audio.f.b f8703r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public e f8704s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public e f8705t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public androidx.media3.common.audio.a f8706u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AudioTrack f8707v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ka.a f8708w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public androidx.media3.exoplayer.audio.a f8709x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public h f8710y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public androidx.media3.common.d f8711z;

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final androidx.media3.exoplayer.audio.d f8712a = new androidx.media3.exoplayer.audio.d(new androidx.media3.exoplayer.audio.d.a());
    }

    public interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final androidx.media3.exoplayer.audio.e f8713a = new androidx.media3.exoplayer.audio.e();
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.q f8721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f8724d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f8725e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f8726f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f8727g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f8728h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final androidx.media3.common.audio.a f8729i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f8730j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f8731k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f8732l;

        public e(androidx.media3.common.q qVar, int i14, int i15, int i16, int i17, int i18, int i19, int i24, androidx.media3.common.audio.a aVar, boolean z14, boolean z15, boolean z16) {
            this.f8721a = qVar;
            this.f8722b = i14;
            this.f8723c = i15;
            this.f8724d = i16;
            this.f8725e = i17;
            this.f8726f = i18;
            this.f8727g = i19;
            this.f8728h = i24;
            this.f8729i = aVar;
            this.f8730j = z14;
            this.f8731k = z15;
            this.f8732l = z16;
        }

        public final AudioSink.a a() {
            return new AudioSink.a(this.f8727g, this.f8725e, this.f8726f, this.f8732l, this.f8723c == 1, this.f8728h);
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y f8736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f8737b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f8738c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f8739d;

        private g(y yVar, long j8, long j14) {
            this.f8736a = yVar;
            this.f8737b = j8;
            this.f8738c = j14;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioTrack f8740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.media3.exoplayer.audio.a f8741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ka.k f8742c = new AudioRouting.OnRoutingChangedListener() { // from class: ka.k
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                DefaultAudioSink.h hVar = this.f103699a;
                if (hVar.f8742c == null || audioRouting.getRoutedDevice() == null) {
                    return;
                }
                hVar.f8741b.b(audioRouting.getRoutedDevice());
            }
        };

        /* JADX WARN: Type inference failed for: r3v1, types: [ka.k] */
        public h(AudioTrack audioTrack, androidx.media3.exoplayer.audio.a aVar) {
            this.f8740a = audioTrack;
            this.f8741b = aVar;
            audioTrack.addOnRoutingChangedListener(this.f8742c, new Handler(Looper.myLooper()));
        }
    }

    public static final class i<T extends Exception> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public T f8743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f8744b = C.TIME_UNSET;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f8745c = C.TIME_UNSET;

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public final void a(T t7) throws T {
            boolean z14;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f8743a == null) {
                this.f8743a = t7;
            }
            if (this.f8744b == C.TIME_UNSET) {
                synchronized (DefaultAudioSink.f8674j0) {
                    z14 = DefaultAudioSink.f8676l0 > 0;
                }
                if (!z14) {
                    this.f8744b = 200 + jElapsedRealtime;
                }
            }
            long j8 = this.f8744b;
            if (j8 == C.TIME_UNSET || jElapsedRealtime < j8) {
                this.f8745c = jElapsedRealtime + 50;
                return;
            }
            T t14 = this.f8743a;
            if (t14 != t7) {
                t14.addSuppressed(t7);
            }
            T t15 = this.f8743a;
            this.f8743a = null;
            this.f8744b = C.TIME_UNSET;
            this.f8745c = C.TIME_UNSET;
            throw t15;
        }
    }

    public final class j implements androidx.media3.exoplayer.audio.c.a {
        private j() {
        }

        @Override // androidx.media3.exoplayer.audio.c.a
        public final void onInvalidLatency(long j8) {
            fa.k.g("Ignoring impossibly large audio latency: " + j8);
        }

        @Override // androidx.media3.exoplayer.audio.c.a
        public final void onPositionAdvancing(long j8) {
            androidx.media3.exoplayer.audio.b.a aVar;
            Handler handler;
            androidx.media3.exoplayer.audio.f.b bVar = DefaultAudioSink.this.f8703r;
            if (bVar == null || (handler = (aVar = androidx.media3.exoplayer.audio.f.this.A1).f8766a) == null) {
                return;
            }
            handler.post(new com.google.android.exoplayer2.audio.d(aVar, j8, 4));
        }

        @Override // androidx.media3.exoplayer.audio.c.a
        public final void onPositionFramesMismatch(long j8, long j14, long j15, long j16) {
            StringBuilder sbK = e0.k(j8, "Spurious audio timestamp (frame position mismatch): ", ", ");
            sbK.append(j14);
            x.j(j15, ", ", ", ", sbK);
            sbK.append(j16);
            sbK.append(", ");
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            sbK.append(defaultAudioSink.r());
            sbK.append(", ");
            sbK.append(defaultAudioSink.s());
            fa.k.g(sbK.toString());
        }

        @Override // androidx.media3.exoplayer.audio.c.a
        public final void onSystemTimeUsMismatch(long j8, long j14, long j15, long j16) {
            StringBuilder sbK = e0.k(j8, "Spurious audio timestamp (system clock mismatch): ", ", ");
            sbK.append(j14);
            x.j(j15, ", ", ", ", sbK);
            sbK.append(j16);
            sbK.append(", ");
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            sbK.append(defaultAudioSink.r());
            sbK.append(", ");
            sbK.append(defaultAudioSink.s());
            fa.k.g(sbK.toString());
        }

        @Override // androidx.media3.exoplayer.audio.c.a
        public final void onUnderrun(int i14, long j8) {
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            if (defaultAudioSink.f8703r != null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - defaultAudioSink.f8682c0;
                androidx.media3.exoplayer.audio.b.a aVar = androidx.media3.exoplayer.audio.f.this.A1;
                Handler handler = aVar.f8766a;
                if (handler != null) {
                    handler.post(new com.google.android.exoplayer2.audio.a(aVar, i14, j8, jElapsedRealtime, 1));
                }
            }
        }
    }

    public final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f8747a = new Handler(Looper.myLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f8748b;

        public class a extends AudioTrack$StreamEventCallback {
            public a(DefaultAudioSink defaultAudioSink) {
            }

            public final void onDataRequest(AudioTrack audioTrack, int i14) {
                DefaultAudioSink defaultAudioSink;
                androidx.media3.exoplayer.audio.f.b bVar;
                t0.a aVar;
                if (audioTrack.equals(DefaultAudioSink.this.f8707v) && (bVar = (defaultAudioSink = DefaultAudioSink.this).f8703r) != null && defaultAudioSink.V && (aVar = androidx.media3.exoplayer.audio.f.this.T) != null) {
                    aVar.onWakeup();
                }
            }

            public final void onPresentationEnded(AudioTrack audioTrack) {
                if (audioTrack.equals(DefaultAudioSink.this.f8707v)) {
                    DefaultAudioSink.this.U = true;
                }
            }

            public final void onTearDown(AudioTrack audioTrack) {
                DefaultAudioSink defaultAudioSink;
                androidx.media3.exoplayer.audio.f.b bVar;
                t0.a aVar;
                if (audioTrack.equals(DefaultAudioSink.this.f8707v) && (bVar = (defaultAudioSink = DefaultAudioSink.this).f8703r) != null && defaultAudioSink.V && (aVar = androidx.media3.exoplayer.audio.f.this.T) != null) {
                    aVar.onWakeup();
                }
            }
        }

        public k() {
            this.f8748b = new a(DefaultAudioSink.this);
        }
    }

    private DefaultAudioSink(d dVar) {
        ka.a aVarC;
        Context context = dVar.f8714a;
        this.f8677a = context;
        androidx.media3.common.d dVar2 = androidx.media3.common.d.f8178g;
        this.f8711z = dVar2;
        if (context != null) {
            ka.a aVar = ka.a.f103656c;
            int i14 = z.f70071a;
            aVarC = ka.a.c(context, dVar2, null);
        } else {
            aVarC = dVar.f8715b;
        }
        this.f8708w = aVarC;
        this.f8679b = dVar.f8716c;
        int i15 = z.f70071a;
        this.f8693i = false;
        this.f8695j = 0;
        this.f8699n = dVar.f8718e;
        ka.j jVar = dVar.f8720g;
        jVar.getClass();
        this.f8700o = jVar;
        this.f8689g = new androidx.media3.exoplayer.audio.c(new j());
        ka.h hVar = new ka.h();
        this.f8681c = hVar;
        p pVar = new p();
        this.f8683d = pVar;
        this.f8685e = ImmutableList.of((p) new androidx.media3.common.audio.d(), (p) hVar, pVar);
        this.f8687f = ImmutableList.of(new o());
        this.O = 1.0f;
        this.X = 0;
        this.Y = new androidx.media3.common.f(0, 0.0f);
        y yVar = y.f8583d;
        this.B = new g(yVar, 0L, 0L);
        this.C = yVar;
        this.D = false;
        this.f8691h = new ArrayDeque<>();
        this.f8697l = new i<>();
        this.f8698m = new i<>();
        this.f8701p = dVar.f8719f;
    }

    public static boolean v(AudioTrack audioTrack) {
        return z.f70071a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX WARN: Code duplicated, block: B:47:0x013f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0142  */
    /* JADX WARN: Code duplicated, block: B:51:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0147  */
    /* JADX WARN: Code duplicated, block: B:54:0x014b  */
    /* JADX WARN: Code duplicated, block: B:56:0x014f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0153  */
    /* JADX WARN: Code duplicated, block: B:60:0x0157  */
    /* JADX WARN: Code duplicated, block: B:63:0x0173  */
    /* JADX WARN: Code duplicated, block: B:64:0x0186  */
    /* JADX WARN: Code duplicated, block: B:65:0x0193  */
    /* JADX WARN: Code duplicated, block: B:66:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x01e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0057 A[SYNTHETIC] */
    public final void A(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferOrder;
        int i14;
        byte b14;
        int i15;
        int i16;
        int i17;
        fa.a.d(this.R == null);
        if (byteBuffer.hasRemaining()) {
            if (this.f8705t.f8723c != 0) {
                byteBufferOrder = byteBuffer;
            } else {
                int iU = (int) z.U(z.O(20L), this.f8705t.f8725e, 1000000L, RoundingMode.UP);
                long jS = s();
                long j8 = iU;
                if (jS >= j8) {
                    byteBufferOrder = byteBuffer;
                } else {
                    e eVar = this.f8705t;
                    int i18 = eVar.f8727g;
                    int i19 = eVar.f8724d;
                    int i24 = (int) jS;
                    byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i24 < iU) {
                        if (i18 != 2) {
                            if (i18 == 3) {
                                i16 = (byteBuffer.get() & UnsignedBytes.MAX_VALUE) << 24;
                            } else if (i18 == 4) {
                                float fH = z.h(byteBuffer.getFloat(), -1.0f, 1.0f);
                                i16 = (int) (fH < 0.0f ? (-fH) * (-2.1474836E9f) : fH * 2.1474836E9f);
                            } else if (i18 != 21) {
                                if (i18 == 22) {
                                    i14 = (byteBuffer.get() & UnsignedBytes.MAX_VALUE) | ((byteBuffer.get() & UnsignedBytes.MAX_VALUE) << 8) | ((byteBuffer.get() & UnsignedBytes.MAX_VALUE) << 16);
                                    b14 = byteBuffer.get();
                                } else if (i18 == 268435456) {
                                    i14 = (byteBuffer.get() & UnsignedBytes.MAX_VALUE) << 24;
                                    i15 = (byteBuffer.get() & UnsignedBytes.MAX_VALUE) << 16;
                                } else if (i18 == 1342177280) {
                                    i14 = ((byteBuffer.get() & UnsignedBytes.MAX_VALUE) << 24) | ((byteBuffer.get() & UnsignedBytes.MAX_VALUE) << 16);
                                    i15 = (byteBuffer.get() & UnsignedBytes.MAX_VALUE) << 8;
                                } else if (i18 != 1610612736) {
                                    x.h();
                                    return;
                                } else {
                                    i14 = ((byteBuffer.get() & UnsignedBytes.MAX_VALUE) << 24) | ((byteBuffer.get() & UnsignedBytes.MAX_VALUE) << 16) | ((byteBuffer.get() & UnsignedBytes.MAX_VALUE) << 8);
                                    i15 = byteBuffer.get() & UnsignedBytes.MAX_VALUE;
                                }
                                i16 = i14 | i15;
                            } else {
                                i14 = ((byteBuffer.get() & UnsignedBytes.MAX_VALUE) << 8) | ((byteBuffer.get() & UnsignedBytes.MAX_VALUE) << 16);
                                b14 = byteBuffer.get();
                            }
                            i17 = (int) ((((long) i16) * ((long) i24)) / j8);
                            if (i18 != 2) {
                                byteBufferOrder.put((byte) (i17 >> 16));
                                byteBufferOrder.put((byte) (i17 >> 24));
                            } else if (i18 != 3) {
                                byteBufferOrder.put((byte) (i17 >> 24));
                            } else if (i18 != 4) {
                                if (i18 != 21) {
                                    byteBufferOrder.put((byte) (i17 >> 8));
                                    byteBufferOrder.put((byte) (i17 >> 16));
                                    byteBufferOrder.put((byte) (i17 >> 24));
                                } else if (i18 != 22) {
                                    byteBufferOrder.put((byte) i17);
                                    byteBufferOrder.put((byte) (i17 >> 8));
                                    byteBufferOrder.put((byte) (i17 >> 16));
                                    byteBufferOrder.put((byte) (i17 >> 24));
                                } else if (i18 != 268435456) {
                                    byteBufferOrder.put((byte) (i17 >> 24));
                                    byteBufferOrder.put((byte) (i17 >> 16));
                                } else if (i18 != 1342177280) {
                                    byteBufferOrder.put((byte) (i17 >> 24));
                                    byteBufferOrder.put((byte) (i17 >> 16));
                                    byteBufferOrder.put((byte) (i17 >> 8));
                                } else {
                                    if (i18 == 1610612736) {
                                        x.h();
                                        return;
                                    }
                                    byteBufferOrder.put((byte) (i17 >> 24));
                                    byteBufferOrder.put((byte) (i17 >> 16));
                                    byteBufferOrder.put((byte) (i17 >> 8));
                                    byteBufferOrder.put((byte) i17);
                                }
                            } else if (i17 < 0) {
                                byteBufferOrder.putFloat((-i17) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(i17 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() == iPosition + i19) {
                                i24++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i14 = (byteBuffer.get() & UnsignedBytes.MAX_VALUE) << 16;
                            b14 = byteBuffer.get();
                        }
                        i15 = (b14 & UnsignedBytes.MAX_VALUE) << 24;
                        i16 = i14 | i15;
                        i17 = (int) ((((long) i16) * ((long) i24)) / j8);
                        if (i18 != 2) {
                            byteBufferOrder.put((byte) (i17 >> 16));
                            byteBufferOrder.put((byte) (i17 >> 24));
                        } else if (i18 != 3) {
                            byteBufferOrder.put((byte) (i17 >> 24));
                        } else if (i18 != 4) {
                            if (i18 != 21) {
                                byteBufferOrder.put((byte) (i17 >> 8));
                                byteBufferOrder.put((byte) (i17 >> 16));
                                byteBufferOrder.put((byte) (i17 >> 24));
                            } else if (i18 != 22) {
                                byteBufferOrder.put((byte) i17);
                                byteBufferOrder.put((byte) (i17 >> 8));
                                byteBufferOrder.put((byte) (i17 >> 16));
                                byteBufferOrder.put((byte) (i17 >> 24));
                            } else if (i18 != 268435456) {
                                byteBufferOrder.put((byte) (i17 >> 24));
                                byteBufferOrder.put((byte) (i17 >> 16));
                            } else if (i18 != 1342177280) {
                                byteBufferOrder.put((byte) (i17 >> 24));
                                byteBufferOrder.put((byte) (i17 >> 16));
                                byteBufferOrder.put((byte) (i17 >> 8));
                            } else {
                                if (i18 == 1610612736) {
                                    x.h();
                                    return;
                                }
                                byteBufferOrder.put((byte) (i17 >> 24));
                                byteBufferOrder.put((byte) (i17 >> 16));
                                byteBufferOrder.put((byte) (i17 >> 8));
                                byteBufferOrder.put((byte) i17);
                            }
                        } else if (i17 < 0) {
                            byteBufferOrder.putFloat((-i17) / (-2.1474836E9f));
                        } else {
                            byteBufferOrder.putFloat(i17 / 2.1474836E9f);
                        }
                        if (byteBuffer.position() == iPosition + i19) {
                            i24++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                }
            }
            this.R = byteBufferOrder;
        }
    }

    public final boolean B() {
        e eVar = this.f8705t;
        return eVar != null && eVar.f8730j && z.f70071a >= 23;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final boolean a(androidx.media3.common.q qVar) {
        return h(qVar) != 0;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void b(y yVar) {
        this.C = new y(z.h(yVar.f8584a, 0.1f, 8.0f), z.h(yVar.f8585b, 0.1f, 8.0f));
        if (B()) {
            z();
            return;
        }
        g gVar = new g(yVar, C.TIME_UNSET, C.TIME_UNSET);
        if (u()) {
            this.A = gVar;
        } else {
            this.B = gVar;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void c(int i14) {
        fa.a.d(z.f70071a >= 29);
        this.f8695j = i14;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void d(q qVar) {
        this.f8702q = qVar;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void disableTunneling() {
        if (this.f8678a0) {
            this.f8678a0 = false;
            flush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void e(androidx.media3.common.d dVar) {
        if (this.f8711z.equals(dVar)) {
            return;
        }
        this.f8711z = dVar;
        if (this.f8678a0) {
            return;
        }
        androidx.media3.exoplayer.audio.a aVar = this.f8709x;
        if (aVar != null) {
            aVar.f8759i = dVar;
            aVar.a(ka.a.c(aVar.f8751a, dVar, aVar.f8758h));
        }
        flush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void enableTunnelingV21() {
        fa.a.d(this.W);
        if (this.f8678a0) {
            return;
        }
        this.f8678a0 = true;
        flush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void f(androidx.media3.exoplayer.audio.f.b bVar) {
        this.f8703r = bVar;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void flush() {
        h hVar;
        if (u()) {
            this.G = 0L;
            this.H = 0L;
            this.I = 0L;
            this.J = 0L;
            this.f8686e0 = false;
            this.K = 0;
            this.B = new g(this.C, 0L, 0L);
            this.N = 0L;
            this.A = null;
            this.f8691h.clear();
            this.P = null;
            this.Q = 0;
            this.R = null;
            this.T = false;
            this.S = false;
            this.U = false;
            this.E = null;
            this.F = 0;
            this.f8683d.f103728o = 0L;
            androidx.media3.common.audio.a aVar = this.f8705t.f8729i;
            this.f8706u = aVar;
            aVar.a();
            AudioTrack audioTrack = this.f8689g.f8770c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f8707v.pause();
            }
            if (v(this.f8707v)) {
                k kVar = this.f8696k;
                kVar.getClass();
                this.f8707v.unregisterStreamEventCallback(kVar.f8748b);
                kVar.f8747a.removeCallbacksAndMessages(null);
            }
            AudioSink.a aVarA = this.f8705t.a();
            e eVar = this.f8704s;
            if (eVar != null) {
                this.f8705t = eVar;
                this.f8704s = null;
            }
            androidx.media3.exoplayer.audio.c cVar = this.f8689g;
            cVar.d();
            cVar.f8770c = null;
            cVar.f8772e = null;
            if (z.f70071a >= 24 && (hVar = this.f8710y) != null) {
                AudioTrack audioTrack2 = hVar.f8740a;
                ka.k kVar2 = hVar.f8742c;
                kVar2.getClass();
                audioTrack2.removeOnRoutingChangedListener(kVar2);
                hVar.f8742c = null;
                this.f8710y = null;
            }
            AudioTrack audioTrack3 = this.f8707v;
            androidx.media3.exoplayer.audio.f.b bVar = this.f8703r;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f8674j0) {
                try {
                    if (f8675k0 == null) {
                        f8675k0 = Executors.newSingleThreadScheduledExecutor(new fa.y());
                    }
                    f8676l0++;
                    f8675k0.schedule(new at0.c(audioTrack3, bVar, handler, aVarA, 14), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            this.f8707v = null;
        }
        i<AudioSink.WriteException> iVar = this.f8698m;
        iVar.f8743a = null;
        iVar.f8744b = C.TIME_UNSET;
        iVar.f8745c = C.TIME_UNSET;
        i<AudioSink.InitializationException> iVar2 = this.f8697l;
        iVar2.f8743a = null;
        iVar2.f8744b = C.TIME_UNSET;
        iVar2.f8745c = C.TIME_UNSET;
        this.f8690g0 = 0L;
        this.f8692h0 = 0L;
        Handler handler2 = this.f8694i0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void g(androidx.media3.common.q qVar, int[] iArr) throws AudioSink.ConfigurationException {
        androidx.media3.common.audio.a aVar;
        int iY;
        int i14;
        int i15;
        boolean z14;
        int i16;
        boolean z15;
        int i17;
        int i18;
        int i19;
        w();
        String str = qVar.f8386n;
        int i24 = qVar.C;
        int i25 = qVar.E;
        boolean zEquals = MimeTypes.AUDIO_RAW.equals(str);
        boolean z16 = this.f8693i;
        if (zEquals) {
            fa.a.a(z.I(i25));
            int iY2 = z.y(i25, i24);
            ImmutableList.Builder builder = new ImmutableList.Builder();
            builder.addAll((Iterable) this.f8685e);
            builder.add((Object[]) this.f8679b.f8733a);
            androidx.media3.common.audio.a aVar2 = new androidx.media3.common.audio.a(builder.build());
            if (aVar2.equals(this.f8706u)) {
                aVar2 = this.f8706u;
            }
            int i26 = qVar.F;
            int i27 = qVar.G;
            p pVar = this.f8683d;
            pVar.f103722i = i26;
            pVar.f103723j = i27;
            this.f8681c.f103695i = iArr;
            AudioProcessor.a aVar3 = new AudioProcessor.a(qVar);
            try {
                ImmutableList<AudioProcessor> immutableList = aVar2.f8127a;
                if (aVar3.equals(AudioProcessor.a.f8122e)) {
                    throw new AudioProcessor.UnhandledAudioFormatException(aVar3);
                }
                for (int i28 = 0; i28 < immutableList.size(); i28++) {
                    AudioProcessor audioProcessor = immutableList.get(i28);
                    AudioProcessor.a aVarA = audioProcessor.a(aVar3);
                    if (audioProcessor.isActive()) {
                        fa.a.d(!aVarA.equals(AudioProcessor.a.f8122e));
                        aVar3 = aVarA;
                    }
                }
                int i29 = aVar3.f8124b;
                int i30 = aVar3.f8125c;
                int i34 = aVar3.f8123a;
                int iQ = z.q(i29);
                i18 = iY2;
                iY = z.y(i30, i29);
                aVar = aVar2;
                i14 = i30;
                z15 = z16;
                i17 = i34;
                i15 = iQ;
                z14 = false;
                i16 = 0;
            } catch (AudioProcessor.UnhandledAudioFormatException e4) {
                throw new AudioSink.ConfigurationException(e4, qVar);
            }
        } else {
            androidx.media3.common.audio.a aVar4 = new androidx.media3.common.audio.a(ImmutableList.of());
            int i35 = qVar.D;
            ka.c cVarJ = this.f8695j != 0 ? j(qVar) : ka.c.f103666d;
            if (this.f8695j == 0 || !cVarJ.f103667a) {
                Pair pairD = this.f8708w.d(this.f8711z, qVar);
                if (pairD == null) {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + qVar, qVar);
                }
                int iIntValue = ((Integer) pairD.first).intValue();
                int iIntValue2 = ((Integer) pairD.second).intValue();
                aVar = aVar4;
                iY = -1;
                i14 = iIntValue;
                i15 = iIntValue2;
                z14 = false;
                i16 = 2;
                z15 = z16;
                i17 = i35;
                i18 = -1;
            } else {
                str.getClass();
                int iC = androidx.media3.common.x.c(str, qVar.f8383k);
                int iQ2 = z.q(i24);
                boolean z17 = cVarJ.f103668b;
                i17 = i35;
                aVar = aVar4;
                i16 = 1;
                i18 = -1;
                i14 = iC;
                i15 = iQ2;
                z14 = z17;
                z15 = true;
                iY = -1;
            }
        }
        if (i14 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i16 + ") for: " + qVar, qVar);
        }
        if (i15 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i16 + ") for: " + qVar, qVar);
        }
        int i36 = qVar.f8382j;
        if (MimeTypes.AUDIO_DTS_EXPRESS.equals(str) && i36 == -1) {
            i36 = Ac3Util.E_AC3_MAX_RATE_BYTES_PER_SECOND;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i17, i15, i14);
        fa.a.d(minBufferSize != -2);
        int i37 = iY != -1 ? iY : 1;
        double d14 = z15 ? 8.0d : 1.0d;
        this.f8699n.getClass();
        if (i16 == 0) {
            iY = iY;
            long j8 = i17;
            long j14 = ((long) 250000) * j8;
            long j15 = i37;
            i19 = z.i(minBufferSize * 4, Ints.checkedCast((j14 * j15) / 1000000), Ints.checkedCast(((((long) 750000) * j8) * j15) / 1000000));
        } else if (i16 == 1) {
            iY = iY;
            i19 = Ints.checkedCast((((long) 50000000) * ((long) androidx.media3.exoplayer.audio.d.a(i14))) / 1000000);
        } else {
            if (i16 != 2) {
                vb.h.w();
                return;
            }
            i19 = Ints.checkedCast((((long) (i14 == 5 ? 500000 : i14 == 8 ? 1000000 : 250000)) * ((long) (i36 != -1 ? IntMath.divide(i36, 8, RoundingMode.CEILING) : androidx.media3.exoplayer.audio.d.a(i14)))) / 1000000);
        }
        int iMax = (((Math.max(minBufferSize, (int) (((double) i19) * d14)) + i37) - 1) / i37) * i37;
        this.f8684d0 = false;
        e eVar = new e(qVar, i18, i16, iY, i17, i15, i14, iMax, aVar, z15, z14, this.f8678a0);
        if (u()) {
            this.f8704s = eVar;
        } else {
            this.f8705t = eVar;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final long getCurrentPositionUs(boolean z14) {
        ArrayDeque<g> arrayDeque;
        long j8;
        if (!u() || this.M) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.f8689g.a(z14), z.S(this.f8705t.f8725e, s()));
        while (true) {
            arrayDeque = this.f8691h;
            if (arrayDeque.isEmpty() || jMin < arrayDeque.getFirst().f8738c) {
                break;
            }
            this.B = arrayDeque.remove();
        }
        g gVar = this.B;
        long jU = jMin - gVar.f8738c;
        long jW = z.w(jU, gVar.f8736a.f8584a);
        boolean zIsEmpty = arrayDeque.isEmpty();
        f fVar = this.f8679b;
        if (zIsEmpty) {
            androidx.media3.common.audio.c cVar = fVar.f8735c;
            if (cVar.isActive()) {
                if (cVar.f8151o >= 1024) {
                    long j14 = cVar.f8150n;
                    da.a aVar = cVar.f8146j;
                    aVar.getClass();
                    long j15 = j14 - ((long) ((aVar.f58646k * aVar.f58637b) * 2));
                    int i14 = cVar.f8144h.f8123a;
                    int i15 = cVar.f8143g.f8123a;
                    long j16 = cVar.f8151o;
                    jU = i14 == i15 ? z.U(jU, j15, j16, RoundingMode.DOWN) : z.U(jU, j15 * ((long) i14), j16 * ((long) i15), RoundingMode.DOWN);
                } else {
                    jU = (long) (((double) cVar.f8139c) * jU);
                }
            }
            g gVar2 = this.B;
            j8 = gVar2.f8737b + jU;
            gVar2.f8739d = jU - jW;
        } else {
            g gVar3 = this.B;
            j8 = gVar3.f8737b + jW + gVar3.f8739d;
        }
        long j17 = fVar.f8734b.f103715q;
        long jS = z.S(this.f8705t.f8725e, j17) + j8;
        long j18 = this.f8690g0;
        if (j17 > j18) {
            long jS2 = z.S(this.f8705t.f8725e, j17 - j18);
            this.f8690g0 = j17;
            this.f8692h0 += jS2;
            if (this.f8694i0 == null) {
                this.f8694i0 = new Handler(Looper.myLooper());
            }
            this.f8694i0.removeCallbacksAndMessages(null);
            this.f8694i0.postDelayed(new n(this, 1), 100L);
        }
        return jS;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final y getPlaybackParameters() {
        return this.C;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final int h(androidx.media3.common.q qVar) {
        w();
        String str = qVar.f8386n;
        int i14 = qVar.E;
        if (MimeTypes.AUDIO_RAW.equals(str)) {
            if (!z.I(i14)) {
                fb1.c.r(i14, "Invalid PCM encoding: ");
                return 0;
            }
            if (i14 != 2) {
                return 1;
            }
        } else if (this.f8708w.d(this.f8711z, qVar) == null) {
            return 0;
        }
        return 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x016e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0179  */
    /* JADX WARN: Code duplicated, block: B:104:0x0192  */
    /* JADX WARN: Code duplicated, block: B:105:0x0196  */
    /* JADX WARN: Code duplicated, block: B:106:0x019a  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:115:0x01c4 A[LOOP:0: B:107:0x01a4->B:115:0x01c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:119:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:121:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:122:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:126:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:128:0x0203  */
    /* JADX WARN: Code duplicated, block: B:129:0x0207  */
    /* JADX WARN: Code duplicated, block: B:132:0x0218  */
    /* JADX WARN: Code duplicated, block: B:135:0x0222  */
    /* JADX WARN: Code duplicated, block: B:137:0x0227  */
    /* JADX WARN: Code duplicated, block: B:156:0x0254  */
    /* JADX WARN: Code duplicated, block: B:157:0x0257  */
    /* JADX WARN: Code duplicated, block: B:158:0x025c  */
    /* JADX WARN: Code duplicated, block: B:159:0x025e  */
    /* JADX WARN: Code duplicated, block: B:161:0x026c  */
    /* JADX WARN: Code duplicated, block: B:164:0x027d  */
    /* JADX WARN: Code duplicated, block: B:166:0x0293  */
    /* JADX WARN: Code duplicated, block: B:169:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:188:0x0313  */
    /* JADX WARN: Code duplicated, block: B:190:0x031a  */
    /* JADX WARN: Code duplicated, block: B:191:0x031c  */
    /* JADX WARN: Code duplicated, block: B:193:0x0328 A[LOOP:1: B:192:0x0326->B:193:0x0328, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:196:0x033b A[LOOP:2: B:195:0x0339->B:196:0x033b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:200:0x035c  */
    /* JADX WARN: Code duplicated, block: B:201:0x0362  */
    /* JADX WARN: Code duplicated, block: B:208:0x0379  */
    /* JADX WARN: Code duplicated, block: B:211:0x0383  */
    /* JADX WARN: Code duplicated, block: B:212:0x0389  */
    /* JADX WARN: Code duplicated, block: B:214:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:218:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:222:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:225:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:227:0x03da  */
    /* JADX WARN: Code duplicated, block: B:232:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:233:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:235:0x0401  */
    /* JADX WARN: Code duplicated, block: B:237:0x040c  */
    /* JADX WARN: Code duplicated, block: B:239:0x0413  */
    /* JADX WARN: Code duplicated, block: B:241:0x041d  */
    /* JADX WARN: Code duplicated, block: B:248:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:67:0x0107 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0109  */
    /* JADX WARN: Code duplicated, block: B:70:0x010c  */
    /* JADX WARN: Code duplicated, block: B:71:0x010e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0122 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x0137  */
    /* JADX WARN: Code duplicated, block: B:83:0x013f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0141  */
    /* JADX WARN: Code duplicated, block: B:88:0x014d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0153  */
    /* JADX WARN: Code duplicated, block: B:94:0x015e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0164  */
    /* JADX WARN: Code duplicated, block: B:98:0x0169  */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0372, code lost:
    
        if (r15 == 0) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0114, code lost:
    
        if (r9.b() == 0) goto L12;
     */
    @Override // androidx.media3.exoplayer.audio.AudioSink
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleBuffer(ByteBuffer byteBuffer, long j8, int i14) throws T, AudioSink.WriteException, AudioSink.InitializationException {
        boolean zU;
        i<AudioSink.InitializationException> iVar;
        int playState;
        boolean z14;
        boolean z15;
        e eVar;
        long jS;
        androidx.media3.exoplayer.audio.f.b bVar;
        androidx.media3.exoplayer.audio.f.b bVar2;
        int i15;
        byte b14;
        int i16;
        int i17;
        int i18;
        byte b15;
        int i19;
        int i24;
        int i25;
        byte b16;
        int iB;
        int i26;
        byte b17;
        int i27;
        byte b18;
        int iReverseBytes;
        int i28;
        int i29;
        int i30;
        char c14;
        int iPosition;
        int iLimit;
        int i34;
        int i35;
        boolean z16;
        int i36;
        int iReverseBytes2;
        char c15;
        ka.g.a aVar;
        ByteBuffer byteBuffer2 = this.P;
        fa.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        e eVar2 = this.f8704s;
        androidx.media3.exoplayer.audio.c cVar = this.f8689g;
        if (eVar2 == null) {
            zU = u();
            iVar = this.f8697l;
            if (!zU) {
                iVar.f8743a = null;
                iVar.f8744b = C.TIME_UNSET;
                iVar.f8745c = C.TIME_UNSET;
                if (this.M) {
                    this.N = Math.max(0L, j8);
                    this.L = false;
                    this.M = false;
                    if (B()) {
                        z();
                    }
                    m(j8);
                    if (this.V) {
                        play();
                    }
                }
                long jS2 = s();
                AudioTrack audioTrack = cVar.f8770c;
                audioTrack.getClass();
                playState = audioTrack.getPlayState();
                if (cVar.f8774g) {
                    if (playState == 2) {
                        cVar.f8782o = false;
                        return false;
                    }
                    if (playState == 1) {
                    }
                }
                z14 = cVar.f8782o;
                boolean zC = cVar.c(jS2);
                cVar.f8782o = zC;
                if (z14) {
                    cVar.f8768a.onUnderrun(cVar.f8771d, z.Y(cVar.f8775h));
                }
                if (this.P != null) {
                    if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    fa.a.a(z15);
                    if (byteBuffer.hasRemaining()) {
                        eVar = this.f8705t;
                        if (eVar.f8723c != 0) {
                            i15 = eVar.f8727g;
                            if (i15 != 20) {
                                if ((byteBuffer.get(5) & 2) == 0) {
                                    i24 = 0;
                                } else {
                                    b14 = byteBuffer.get(26);
                                    i16 = 28;
                                    i17 = 28;
                                    for (i18 = 0; i18 < b14; i18++) {
                                        i17 += byteBuffer.get(i18 + 27);
                                    }
                                    b15 = byteBuffer.get(i17 + 26);
                                    for (i19 = 0; i19 < b15; i19++) {
                                        i16 += byteBuffer.get(i17 + 27 + i19);
                                    }
                                    i24 = i17 + i16;
                                }
                                i25 = byteBuffer.get(i24 + 26) + Ascii.ESC + i24;
                                byte b19 = byteBuffer.get(i25);
                                if (byteBuffer.limit() - i25 > 1) {
                                    b16 = byteBuffer.get(i25 + 1);
                                } else {
                                    b16 = 0;
                                }
                                iB = (int) ((bb.e0.b(b19, b16) * 48000) / 1000000);
                            } else if (i15 != 30) {
                                switch (i15) {
                                    case 5:
                                    case 6:
                                        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                                            iB = bb.b.f17092a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                                        } else {
                                            iB = 1536;
                                        }
                                        break;
                                    case 7:
                                    case 8:
                                        if (byteBuffer.getInt(0) != -233094848) {
                                            iB = 1024;
                                        } else {
                                            iB = 1024;
                                        }
                                        break;
                                    case 9:
                                        iReverseBytes = byteBuffer.getInt(byteBuffer.position());
                                        if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                            iReverseBytes = Integer.reverseBytes(iReverseBytes);
                                        }
                                        if ((iReverseBytes & (-2097152)) == -2097152) {
                                            i28 = -1;
                                        } else {
                                            i28 = -1;
                                        }
                                        if (i28 != -1) {
                                            vb.h.w();
                                            return false;
                                        }
                                        iB = i28;
                                        break;
                                        break;
                                    case 10:
                                        iB = 1024;
                                        break;
                                    case 11:
                                    case 12:
                                        iB = 2048;
                                        break;
                                    default:
                                        c14 = 16;
                                        switch (i15) {
                                            case 14:
                                                iPosition = byteBuffer.position();
                                                iLimit = byteBuffer.limit() - 10;
                                                i34 = iPosition;
                                                while (true) {
                                                    if (i34 <= iLimit) {
                                                        iReverseBytes2 = byteBuffer.getInt(i34 + 4);
                                                        c15 = c14;
                                                        if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                            iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                                        }
                                                        if ((iReverseBytes2 & (-2)) == -126718022) {
                                                            i35 = i34 - iPosition;
                                                        } else {
                                                            i34++;
                                                            c14 = c15;
                                                        }
                                                    } else {
                                                        i35 = -1;
                                                    }
                                                }
                                                if (i35 == -1) {
                                                    iB = 0;
                                                } else {
                                                    if ((byteBuffer.get(byteBuffer.position() + i35 + 7) & UnsignedBytes.MAX_VALUE) == 187) {
                                                        z16 = true;
                                                    } else {
                                                        z16 = false;
                                                    }
                                                    int iPosition2 = byteBuffer.position() + i35;
                                                    if (z16) {
                                                        i36 = 9;
                                                    } else {
                                                        i36 = 8;
                                                    }
                                                    iB = (40 << ((byteBuffer.get(iPosition2 + i36) >> 4) & 7)) * 16;
                                                }
                                                break;
                                            case 15:
                                                iB = 512;
                                                break;
                                            case 16:
                                                iB = 1024;
                                                break;
                                            case 17:
                                                byte[] bArr = new byte[16];
                                                int iPosition3 = byteBuffer.position();
                                                byteBuffer.get(bArr);
                                                byteBuffer.position(iPosition3);
                                                iB = bb.c.b(new fa.q(bArr)).f17117d;
                                                break;
                                            case 18:
                                                if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                                                    iB = bb.b.f17092a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                                                } else {
                                                    iB = 1536;
                                                }
                                                break;
                                            default:
                                                vb.h.z(am.j.h(i15, "Unexpected audio encoding: "));
                                                return false;
                                        }
                                        break;
                                }
                            } else if (byteBuffer.getInt(0) != -233094848) {
                                iB = 1024;
                            } else {
                                iB = 1024;
                            }
                            this.K = iB;
                        }
                        if (this.A == null) {
                            jS = z.S(this.f8705t.f8721a.D, r() - this.f8683d.f103728o) + this.N;
                            if (!this.L) {
                                bVar2 = this.f8703r;
                                if (bVar2 != null) {
                                    bVar2.a(new AudioSink.UnexpectedDiscontinuityException(j8, jS));
                                }
                                this.L = true;
                            }
                            if (this.L) {
                                if (q()) {
                                    long j14 = j8 - jS;
                                    this.N += j14;
                                    this.L = false;
                                    m(j8);
                                    bVar = this.f8703r;
                                    if (bVar != null) {
                                        androidx.media3.exoplayer.audio.f.this.J1 = true;
                                    }
                                }
                            }
                            if (this.f8705t.f8723c == 0) {
                                this.G += (long) byteBuffer.remaining();
                            } else {
                                this.H = (((long) this.K) * ((long) i14)) + this.H;
                            }
                            this.P = byteBuffer;
                            this.Q = i14;
                            y(j8);
                            if (!this.P.hasRemaining()) {
                                this.P = null;
                                this.Q = 0;
                                return true;
                            }
                            long jS3 = s();
                            if (cVar.f8792y != C.TIME_UNSET) {
                                fa.k.g("Resetting stalled audio track");
                                flush();
                                return true;
                            }
                        } else if (q()) {
                            m(j8);
                            this.A = null;
                            jS = z.S(this.f8705t.f8721a.D, r() - this.f8683d.f103728o) + this.N;
                            if (!this.L) {
                                bVar2 = this.f8703r;
                                if (bVar2 != null) {
                                    bVar2.a(new AudioSink.UnexpectedDiscontinuityException(j8, jS));
                                }
                                this.L = true;
                            }
                            if (this.L) {
                                if (q()) {
                                    long j15 = j8 - jS;
                                    this.N += j15;
                                    this.L = false;
                                    m(j8);
                                    bVar = this.f8703r;
                                    if (bVar != null) {
                                        androidx.media3.exoplayer.audio.f.this.J1 = true;
                                    }
                                }
                            }
                            if (this.f8705t.f8723c == 0) {
                                this.G += (long) byteBuffer.remaining();
                            } else {
                                this.H = (((long) this.K) * ((long) i14)) + this.H;
                            }
                            this.P = byteBuffer;
                            this.Q = i14;
                            y(j8);
                            if (!this.P.hasRemaining()) {
                                this.P = null;
                                this.Q = 0;
                                return true;
                            }
                            long jS4 = s();
                            if (cVar.f8792y != C.TIME_UNSET) {
                                fa.k.g("Resetting stalled audio track");
                                flush();
                                return true;
                            }
                        }
                    }
                    return true;
                }
                y(j8);
                if (!this.P.hasRemaining()) {
                    this.P = null;
                    this.Q = 0;
                    return true;
                }
                long jS5 = s();
                if (cVar.f8792y != C.TIME_UNSET) {
                    fa.k.g("Resetting stalled audio track");
                    flush();
                    return true;
                }
                return false;
            }
            try {
                if (t()) {
                    iVar.f8743a = null;
                    iVar.f8744b = C.TIME_UNSET;
                    iVar.f8745c = C.TIME_UNSET;
                    if (this.M) {
                        this.N = Math.max(0L, j8);
                        this.L = false;
                        this.M = false;
                        if (B()) {
                            z();
                        }
                        m(j8);
                        if (this.V) {
                            play();
                        }
                    }
                    long jS6 = s();
                    AudioTrack audioTrack2 = cVar.f8770c;
                    audioTrack2.getClass();
                    playState = audioTrack2.getPlayState();
                    if (cVar.f8774g) {
                        if (playState == 2) {
                            cVar.f8782o = false;
                            return false;
                        }
                        if (playState == 1) {
                        }
                    }
                    z14 = cVar.f8782o;
                    boolean zC2 = cVar.c(jS6);
                    cVar.f8782o = zC2;
                    if (z14 && !zC2 && playState != 1) {
                        cVar.f8768a.onUnderrun(cVar.f8771d, z.Y(cVar.f8775h));
                    }
                    if (this.P != null) {
                        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        fa.a.a(z15);
                        if (byteBuffer.hasRemaining()) {
                            eVar = this.f8705t;
                            if (eVar.f8723c != 0 && this.K == 0) {
                                i15 = eVar.f8727g;
                                if (i15 != 20) {
                                    if ((byteBuffer.get(5) & 2) == 0) {
                                        i24 = 0;
                                    } else {
                                        b14 = byteBuffer.get(26);
                                        i16 = 28;
                                        i17 = 28;
                                        while (i18 < b14) {
                                            i17 += byteBuffer.get(i18 + 27);
                                        }
                                        b15 = byteBuffer.get(i17 + 26);
                                        while (i19 < b15) {
                                            i16 += byteBuffer.get(i17 + 27 + i19);
                                        }
                                        i24 = i17 + i16;
                                    }
                                    i25 = byteBuffer.get(i24 + 26) + Ascii.ESC + i24;
                                    byte b110 = byteBuffer.get(i25);
                                    if (byteBuffer.limit() - i25 > 1) {
                                        b16 = byteBuffer.get(i25 + 1);
                                    } else {
                                        b16 = 0;
                                    }
                                    iB = (int) ((bb.e0.b(b110, b16) * 48000) / 1000000);
                                } else if (i15 != 30) {
                                    switch (i15) {
                                        case 5:
                                        case 6:
                                            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                                                iB = bb.b.f17092a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                                            } else {
                                                iB = 1536;
                                            }
                                            break;
                                        case 7:
                                        case 8:
                                            if (byteBuffer.getInt(0) != -233094848 || byteBuffer.getInt(0) == -398277519) {
                                                iB = 1024;
                                            } else if (byteBuffer.getInt(0) == 622876772) {
                                                iB = 4096;
                                            } else {
                                                int iPosition4 = byteBuffer.position();
                                                byte b24 = byteBuffer.get(iPosition4);
                                                if (b24 != -2) {
                                                    if (b24 == -1) {
                                                        i26 = (byteBuffer.get(iPosition4 + 4) & 7) << 4;
                                                        b18 = byteBuffer.get(iPosition4 + 7);
                                                    } else if (b24 != 31) {
                                                        i26 = (byteBuffer.get(iPosition4 + 4) & 1) << 6;
                                                        b17 = byteBuffer.get(iPosition4 + 5);
                                                    } else {
                                                        i26 = (byteBuffer.get(iPosition4 + 5) & 7) << 4;
                                                        b18 = byteBuffer.get(iPosition4 + 6);
                                                    }
                                                    i27 = b18 & 60;
                                                    iB = (((i27 >> 2) | i26) + 1) * 32;
                                                } else {
                                                    i26 = (byteBuffer.get(iPosition4 + 5) & 1) << 6;
                                                    b17 = byteBuffer.get(iPosition4 + 4);
                                                }
                                                i27 = b17 & 252;
                                                iB = (((i27 >> 2) | i26) + 1) * 32;
                                            }
                                            break;
                                        case 9:
                                            iReverseBytes = byteBuffer.getInt(byteBuffer.position());
                                            if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                iReverseBytes = Integer.reverseBytes(iReverseBytes);
                                            }
                                            if ((iReverseBytes & (-2097152)) == -2097152 || (i29 = (iReverseBytes >>> 19) & 3) == 1 || (i30 = (iReverseBytes >>> 17) & 3) == 0) {
                                                i28 = -1;
                                            } else {
                                                int i37 = (iReverseBytes >>> 12) & 15;
                                                int i38 = (iReverseBytes >>> 10) & 3;
                                                if (i37 == 0 || i37 == 15 || i38 == 3) {
                                                    i28 = -1;
                                                } else {
                                                    i28 = 1152;
                                                    if (i30 != 1) {
                                                        if (i30 != 2) {
                                                            if (i30 != 3) {
                                                                vb.h.w();
                                                                return false;
                                                            }
                                                            i28 = 384;
                                                        }
                                                    } else if (i29 != 3) {
                                                        i28 = 576;
                                                    }
                                                }
                                            }
                                            if (i28 != -1) {
                                                vb.h.w();
                                                return false;
                                            }
                                            iB = i28;
                                            break;
                                            break;
                                        case 10:
                                            iB = 1024;
                                            break;
                                        case 11:
                                        case 12:
                                            iB = 2048;
                                            break;
                                        default:
                                            c14 = 16;
                                            switch (i15) {
                                                case 14:
                                                    iPosition = byteBuffer.position();
                                                    iLimit = byteBuffer.limit() - 10;
                                                    i34 = iPosition;
                                                    while (true) {
                                                        if (i34 <= iLimit) {
                                                            iReverseBytes2 = byteBuffer.getInt(i34 + 4);
                                                            c15 = c14;
                                                            if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                                iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                                            }
                                                            if ((iReverseBytes2 & (-2)) == -126718022) {
                                                                i35 = i34 - iPosition;
                                                            } else {
                                                                i34++;
                                                                c14 = c15;
                                                            }
                                                        } else {
                                                            i35 = -1;
                                                        }
                                                    }
                                                    if (i35 == -1) {
                                                        iB = 0;
                                                    } else {
                                                        if ((byteBuffer.get(byteBuffer.position() + i35 + 7) & UnsignedBytes.MAX_VALUE) == 187) {
                                                            z16 = true;
                                                        } else {
                                                            z16 = false;
                                                        }
                                                        int iPosition5 = byteBuffer.position() + i35;
                                                        if (z16) {
                                                            i36 = 9;
                                                        } else {
                                                            i36 = 8;
                                                        }
                                                        iB = (40 << ((byteBuffer.get(iPosition5 + i36) >> 4) & 7)) * 16;
                                                    }
                                                    break;
                                                case 15:
                                                    iB = 512;
                                                    break;
                                                case 16:
                                                    iB = 1024;
                                                    break;
                                                case 17:
                                                    byte[] bArr2 = new byte[16];
                                                    int iPosition6 = byteBuffer.position();
                                                    byteBuffer.get(bArr2);
                                                    byteBuffer.position(iPosition6);
                                                    iB = bb.c.b(new fa.q(bArr2)).f17117d;
                                                    break;
                                                case 18:
                                                    if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                                                        iB = bb.b.f17092a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                                                    } else {
                                                        iB = 1536;
                                                    }
                                                    break;
                                                default:
                                                    vb.h.z(am.j.h(i15, "Unexpected audio encoding: "));
                                                    return false;
                                            }
                                            break;
                                    }
                                } else if (byteBuffer.getInt(0) != -233094848) {
                                    iB = 1024;
                                } else {
                                    iB = 1024;
                                }
                                this.K = iB;
                            }
                            if (this.A == null) {
                                jS = z.S(this.f8705t.f8721a.D, r() - this.f8683d.f103728o) + this.N;
                                if (!this.L && Math.abs(jS - j8) > 200000) {
                                    bVar2 = this.f8703r;
                                    if (bVar2 != null) {
                                        bVar2.a(new AudioSink.UnexpectedDiscontinuityException(j8, jS));
                                    }
                                    this.L = true;
                                }
                                if (this.L) {
                                    if (q()) {
                                        long j16 = j8 - jS;
                                        this.N += j16;
                                        this.L = false;
                                        m(j8);
                                        bVar = this.f8703r;
                                        if (bVar != null && j16 != 0) {
                                            androidx.media3.exoplayer.audio.f.this.J1 = true;
                                        }
                                    }
                                }
                                if (this.f8705t.f8723c == 0) {
                                    this.G += (long) byteBuffer.remaining();
                                } else {
                                    this.H = (((long) this.K) * ((long) i14)) + this.H;
                                }
                                this.P = byteBuffer;
                                this.Q = i14;
                                y(j8);
                                if (!this.P.hasRemaining()) {
                                    this.P = null;
                                    this.Q = 0;
                                    return true;
                                }
                                long jS7 = s();
                                if (cVar.f8792y != C.TIME_UNSET) {
                                    fa.k.g("Resetting stalled audio track");
                                    flush();
                                    return true;
                                }
                            } else if (q()) {
                                m(j8);
                                this.A = null;
                                jS = z.S(this.f8705t.f8721a.D, r() - this.f8683d.f103728o) + this.N;
                                if (!this.L) {
                                    bVar2 = this.f8703r;
                                    if (bVar2 != null) {
                                        bVar2.a(new AudioSink.UnexpectedDiscontinuityException(j8, jS));
                                    }
                                    this.L = true;
                                }
                                if (this.L) {
                                    if (q()) {
                                        long j17 = j8 - jS;
                                        this.N += j17;
                                        this.L = false;
                                        m(j8);
                                        bVar = this.f8703r;
                                        if (bVar != null) {
                                            androidx.media3.exoplayer.audio.f.this.J1 = true;
                                        }
                                    }
                                }
                                if (this.f8705t.f8723c == 0) {
                                    this.G += (long) byteBuffer.remaining();
                                } else {
                                    this.H = (((long) this.K) * ((long) i14)) + this.H;
                                }
                                this.P = byteBuffer;
                                this.Q = i14;
                                y(j8);
                                if (!this.P.hasRemaining()) {
                                    this.P = null;
                                    this.Q = 0;
                                    return true;
                                }
                                long jS8 = s();
                                if (cVar.f8792y != C.TIME_UNSET) {
                                    fa.k.g("Resetting stalled audio track");
                                    flush();
                                    return true;
                                }
                            }
                        }
                        return true;
                    }
                    y(j8);
                    if (!this.P.hasRemaining()) {
                        this.P = null;
                        this.Q = 0;
                        return true;
                    }
                    long jS9 = s();
                    if (cVar.f8792y != C.TIME_UNSET && jS9 > 0 && cVar.I.elapsedRealtime() - cVar.f8792y >= 200) {
                        fa.k.g("Resetting stalled audio track");
                        flush();
                        return true;
                    }
                    return false;
                }
            } catch (AudioSink.InitializationException e4) {
                if (e4.isRecoverable) {
                    throw e4;
                }
                iVar.a(e4);
                return false;
            }
        } else if (q()) {
            e eVar3 = this.f8704s;
            e eVar4 = this.f8705t;
            eVar3.getClass();
            if (eVar4.f8723c == eVar3.f8723c && eVar4.f8727g == eVar3.f8727g && eVar4.f8725e == eVar3.f8725e && eVar4.f8726f == eVar3.f8726f && eVar4.f8724d == eVar3.f8724d && eVar4.f8730j == eVar3.f8730j && eVar4.f8731k == eVar3.f8731k) {
                this.f8705t = this.f8704s;
                this.f8704s = null;
                AudioTrack audioTrack3 = this.f8707v;
                if (audioTrack3 != null && v(audioTrack3) && this.f8705t.f8731k) {
                    if (this.f8707v.getPlayState() == 3) {
                        this.f8707v.setOffloadEndOfStream();
                        cVar.G = true;
                        ka.g gVar = cVar.f8772e;
                        if (gVar != null && (aVar = gVar.f103682a) != null) {
                            aVar.f103693f = true;
                        }
                    }
                    AudioTrack audioTrack4 = this.f8707v;
                    androidx.media3.common.q qVar = this.f8705t.f8721a;
                    audioTrack4.setOffloadDelayPadding(qVar.F, qVar.G);
                    this.f8686e0 = true;
                }
            } else {
                x();
                if (!hasPendingData()) {
                    flush();
                }
            }
            m(j8);
            zU = u();
            iVar = this.f8697l;
            if (!zU) {
                iVar.f8743a = null;
                iVar.f8744b = C.TIME_UNSET;
                iVar.f8745c = C.TIME_UNSET;
                if (this.M) {
                    this.N = Math.max(0L, j8);
                    this.L = false;
                    this.M = false;
                    if (B()) {
                        z();
                    }
                    m(j8);
                    if (this.V) {
                        play();
                    }
                }
                long jS10 = s();
                AudioTrack audioTrack5 = cVar.f8770c;
                audioTrack5.getClass();
                playState = audioTrack5.getPlayState();
                if (cVar.f8774g) {
                    if (playState == 2) {
                        cVar.f8782o = false;
                        return false;
                    }
                    if (playState == 1) {
                    }
                }
                z14 = cVar.f8782o;
                boolean zC3 = cVar.c(jS10);
                cVar.f8782o = zC3;
                if (z14) {
                    cVar.f8768a.onUnderrun(cVar.f8771d, z.Y(cVar.f8775h));
                }
                if (this.P != null) {
                    if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    fa.a.a(z15);
                    if (byteBuffer.hasRemaining()) {
                        eVar = this.f8705t;
                        if (eVar.f8723c != 0) {
                            i15 = eVar.f8727g;
                            if (i15 != 20) {
                                if ((byteBuffer.get(5) & 2) == 0) {
                                    i24 = 0;
                                } else {
                                    b14 = byteBuffer.get(26);
                                    i16 = 28;
                                    i17 = 28;
                                    while (i18 < b14) {
                                        i17 += byteBuffer.get(i18 + 27);
                                    }
                                    b15 = byteBuffer.get(i17 + 26);
                                    while (i19 < b15) {
                                        i16 += byteBuffer.get(i17 + 27 + i19);
                                    }
                                    i24 = i17 + i16;
                                }
                                i25 = byteBuffer.get(i24 + 26) + Ascii.ESC + i24;
                                byte b111 = byteBuffer.get(i25);
                                if (byteBuffer.limit() - i25 > 1) {
                                    b16 = byteBuffer.get(i25 + 1);
                                } else {
                                    b16 = 0;
                                }
                                iB = (int) ((bb.e0.b(b111, b16) * 48000) / 1000000);
                            } else if (i15 != 30) {
                                switch (i15) {
                                    case 5:
                                    case 6:
                                        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                                            iB = bb.b.f17092a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                                        } else {
                                            iB = 1536;
                                        }
                                        break;
                                    case 7:
                                    case 8:
                                        if (byteBuffer.getInt(0) != -233094848) {
                                            iB = 1024;
                                        } else {
                                            iB = 1024;
                                        }
                                        break;
                                    case 9:
                                        iReverseBytes = byteBuffer.getInt(byteBuffer.position());
                                        if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                            iReverseBytes = Integer.reverseBytes(iReverseBytes);
                                        }
                                        if ((iReverseBytes & (-2097152)) == -2097152) {
                                            i28 = -1;
                                        } else {
                                            i28 = -1;
                                        }
                                        if (i28 != -1) {
                                            vb.h.w();
                                            return false;
                                        }
                                        iB = i28;
                                        break;
                                        break;
                                    case 10:
                                        iB = 1024;
                                        break;
                                    case 11:
                                    case 12:
                                        iB = 2048;
                                        break;
                                    default:
                                        c14 = 16;
                                        switch (i15) {
                                            case 14:
                                                iPosition = byteBuffer.position();
                                                iLimit = byteBuffer.limit() - 10;
                                                i34 = iPosition;
                                                while (true) {
                                                    if (i34 <= iLimit) {
                                                        iReverseBytes2 = byteBuffer.getInt(i34 + 4);
                                                        c15 = c14;
                                                        if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                            iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                                        }
                                                        if ((iReverseBytes2 & (-2)) == -126718022) {
                                                            i35 = i34 - iPosition;
                                                        } else {
                                                            i34++;
                                                            c14 = c15;
                                                        }
                                                    } else {
                                                        i35 = -1;
                                                    }
                                                }
                                                if (i35 == -1) {
                                                    iB = 0;
                                                } else {
                                                    if ((byteBuffer.get(byteBuffer.position() + i35 + 7) & UnsignedBytes.MAX_VALUE) == 187) {
                                                        z16 = true;
                                                    } else {
                                                        z16 = false;
                                                    }
                                                    int iPosition7 = byteBuffer.position() + i35;
                                                    if (z16) {
                                                        i36 = 9;
                                                    } else {
                                                        i36 = 8;
                                                    }
                                                    iB = (40 << ((byteBuffer.get(iPosition7 + i36) >> 4) & 7)) * 16;
                                                }
                                                break;
                                            case 15:
                                                iB = 512;
                                                break;
                                            case 16:
                                                iB = 1024;
                                                break;
                                            case 17:
                                                byte[] bArr3 = new byte[16];
                                                int iPosition8 = byteBuffer.position();
                                                byteBuffer.get(bArr3);
                                                byteBuffer.position(iPosition8);
                                                iB = bb.c.b(new fa.q(bArr3)).f17117d;
                                                break;
                                            case 18:
                                                if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                                                    iB = bb.b.f17092a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                                                } else {
                                                    iB = 1536;
                                                }
                                                break;
                                            default:
                                                vb.h.z(am.j.h(i15, "Unexpected audio encoding: "));
                                                return false;
                                        }
                                        break;
                                }
                            } else if (byteBuffer.getInt(0) != -233094848) {
                                iB = 1024;
                            } else {
                                iB = 1024;
                            }
                            this.K = iB;
                        }
                        if (this.A == null) {
                            jS = z.S(this.f8705t.f8721a.D, r() - this.f8683d.f103728o) + this.N;
                            if (!this.L) {
                                bVar2 = this.f8703r;
                                if (bVar2 != null) {
                                    bVar2.a(new AudioSink.UnexpectedDiscontinuityException(j8, jS));
                                }
                                this.L = true;
                            }
                            if (this.L) {
                                if (q()) {
                                    long j18 = j8 - jS;
                                    this.N += j18;
                                    this.L = false;
                                    m(j8);
                                    bVar = this.f8703r;
                                    if (bVar != null) {
                                        androidx.media3.exoplayer.audio.f.this.J1 = true;
                                    }
                                }
                            }
                            if (this.f8705t.f8723c == 0) {
                                this.G += (long) byteBuffer.remaining();
                            } else {
                                this.H = (((long) this.K) * ((long) i14)) + this.H;
                            }
                            this.P = byteBuffer;
                            this.Q = i14;
                            y(j8);
                            if (!this.P.hasRemaining()) {
                                this.P = null;
                                this.Q = 0;
                                return true;
                            }
                            long jS11 = s();
                            if (cVar.f8792y != C.TIME_UNSET) {
                                fa.k.g("Resetting stalled audio track");
                                flush();
                                return true;
                            }
                        } else if (q()) {
                            m(j8);
                            this.A = null;
                            jS = z.S(this.f8705t.f8721a.D, r() - this.f8683d.f103728o) + this.N;
                            if (!this.L) {
                                bVar2 = this.f8703r;
                                if (bVar2 != null) {
                                    bVar2.a(new AudioSink.UnexpectedDiscontinuityException(j8, jS));
                                }
                                this.L = true;
                            }
                            if (this.L) {
                                if (q()) {
                                    long j19 = j8 - jS;
                                    this.N += j19;
                                    this.L = false;
                                    m(j8);
                                    bVar = this.f8703r;
                                    if (bVar != null) {
                                        androidx.media3.exoplayer.audio.f.this.J1 = true;
                                    }
                                }
                            }
                            if (this.f8705t.f8723c == 0) {
                                this.G += (long) byteBuffer.remaining();
                            } else {
                                this.H = (((long) this.K) * ((long) i14)) + this.H;
                            }
                            this.P = byteBuffer;
                            this.Q = i14;
                            y(j8);
                            if (!this.P.hasRemaining()) {
                                this.P = null;
                                this.Q = 0;
                                return true;
                            }
                            long jS12 = s();
                            if (cVar.f8792y != C.TIME_UNSET) {
                                fa.k.g("Resetting stalled audio track");
                                flush();
                                return true;
                            }
                        }
                    }
                    return true;
                }
                y(j8);
                if (!this.P.hasRemaining()) {
                    this.P = null;
                    this.Q = 0;
                    return true;
                }
                long jS13 = s();
                if (cVar.f8792y != C.TIME_UNSET) {
                    fa.k.g("Resetting stalled audio track");
                    flush();
                    return true;
                }
                return false;
            }
            if (t()) {
                iVar.f8743a = null;
                iVar.f8744b = C.TIME_UNSET;
                iVar.f8745c = C.TIME_UNSET;
                if (this.M) {
                    this.N = Math.max(0L, j8);
                    this.L = false;
                    this.M = false;
                    if (B()) {
                        z();
                    }
                    m(j8);
                    if (this.V) {
                        play();
                    }
                }
                long jS14 = s();
                AudioTrack audioTrack6 = cVar.f8770c;
                audioTrack6.getClass();
                playState = audioTrack6.getPlayState();
                if (cVar.f8774g) {
                    if (playState == 2) {
                        cVar.f8782o = false;
                        return false;
                    }
                    if (playState == 1) {
                    }
                }
                z14 = cVar.f8782o;
                boolean zC4 = cVar.c(jS14);
                cVar.f8782o = zC4;
                if (z14) {
                    cVar.f8768a.onUnderrun(cVar.f8771d, z.Y(cVar.f8775h));
                }
                if (this.P != null) {
                    if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    fa.a.a(z15);
                    if (byteBuffer.hasRemaining()) {
                        eVar = this.f8705t;
                        if (eVar.f8723c != 0) {
                            i15 = eVar.f8727g;
                            if (i15 != 20) {
                                if ((byteBuffer.get(5) & 2) == 0) {
                                    i24 = 0;
                                } else {
                                    b14 = byteBuffer.get(26);
                                    i16 = 28;
                                    i17 = 28;
                                    while (i18 < b14) {
                                        i17 += byteBuffer.get(i18 + 27);
                                    }
                                    b15 = byteBuffer.get(i17 + 26);
                                    while (i19 < b15) {
                                        i16 += byteBuffer.get(i17 + 27 + i19);
                                    }
                                    i24 = i17 + i16;
                                }
                                i25 = byteBuffer.get(i24 + 26) + Ascii.ESC + i24;
                                byte b112 = byteBuffer.get(i25);
                                if (byteBuffer.limit() - i25 > 1) {
                                    b16 = byteBuffer.get(i25 + 1);
                                } else {
                                    b16 = 0;
                                }
                                iB = (int) ((bb.e0.b(b112, b16) * 48000) / 1000000);
                            } else if (i15 != 30) {
                                switch (i15) {
                                    case 5:
                                    case 6:
                                        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                                            iB = bb.b.f17092a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                                        } else {
                                            iB = 1536;
                                        }
                                        break;
                                    case 7:
                                    case 8:
                                        if (byteBuffer.getInt(0) != -233094848) {
                                            iB = 1024;
                                        } else {
                                            iB = 1024;
                                        }
                                        break;
                                    case 9:
                                        iReverseBytes = byteBuffer.getInt(byteBuffer.position());
                                        if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                            iReverseBytes = Integer.reverseBytes(iReverseBytes);
                                        }
                                        if ((iReverseBytes & (-2097152)) == -2097152) {
                                            i28 = -1;
                                        } else {
                                            i28 = -1;
                                        }
                                        if (i28 != -1) {
                                            vb.h.w();
                                            return false;
                                        }
                                        iB = i28;
                                        break;
                                        break;
                                    case 10:
                                        iB = 1024;
                                        break;
                                    case 11:
                                    case 12:
                                        iB = 2048;
                                        break;
                                    default:
                                        c14 = 16;
                                        switch (i15) {
                                            case 14:
                                                iPosition = byteBuffer.position();
                                                iLimit = byteBuffer.limit() - 10;
                                                i34 = iPosition;
                                                while (true) {
                                                    if (i34 <= iLimit) {
                                                        iReverseBytes2 = byteBuffer.getInt(i34 + 4);
                                                        c15 = c14;
                                                        if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                            iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                                        }
                                                        if ((iReverseBytes2 & (-2)) == -126718022) {
                                                            i35 = i34 - iPosition;
                                                        } else {
                                                            i34++;
                                                            c14 = c15;
                                                        }
                                                    } else {
                                                        i35 = -1;
                                                    }
                                                }
                                                if (i35 == -1) {
                                                    iB = 0;
                                                } else {
                                                    if ((byteBuffer.get(byteBuffer.position() + i35 + 7) & UnsignedBytes.MAX_VALUE) == 187) {
                                                        z16 = true;
                                                    } else {
                                                        z16 = false;
                                                    }
                                                    int iPosition9 = byteBuffer.position() + i35;
                                                    if (z16) {
                                                        i36 = 9;
                                                    } else {
                                                        i36 = 8;
                                                    }
                                                    iB = (40 << ((byteBuffer.get(iPosition9 + i36) >> 4) & 7)) * 16;
                                                }
                                                break;
                                            case 15:
                                                iB = 512;
                                                break;
                                            case 16:
                                                iB = 1024;
                                                break;
                                            case 17:
                                                byte[] bArr4 = new byte[16];
                                                int iPosition10 = byteBuffer.position();
                                                byteBuffer.get(bArr4);
                                                byteBuffer.position(iPosition10);
                                                iB = bb.c.b(new fa.q(bArr4)).f17117d;
                                                break;
                                            case 18:
                                                if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                                                    iB = bb.b.f17092a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                                                } else {
                                                    iB = 1536;
                                                }
                                                break;
                                            default:
                                                vb.h.z(am.j.h(i15, "Unexpected audio encoding: "));
                                                return false;
                                        }
                                        break;
                                }
                            } else if (byteBuffer.getInt(0) != -233094848) {
                                iB = 1024;
                            } else {
                                iB = 1024;
                            }
                            this.K = iB;
                        }
                        if (this.A == null) {
                            jS = z.S(this.f8705t.f8721a.D, r() - this.f8683d.f103728o) + this.N;
                            if (!this.L) {
                                bVar2 = this.f8703r;
                                if (bVar2 != null) {
                                    bVar2.a(new AudioSink.UnexpectedDiscontinuityException(j8, jS));
                                }
                                this.L = true;
                            }
                            if (this.L) {
                                if (q()) {
                                    long j110 = j8 - jS;
                                    this.N += j110;
                                    this.L = false;
                                    m(j8);
                                    bVar = this.f8703r;
                                    if (bVar != null) {
                                        androidx.media3.exoplayer.audio.f.this.J1 = true;
                                    }
                                }
                            }
                            if (this.f8705t.f8723c == 0) {
                                this.G += (long) byteBuffer.remaining();
                            } else {
                                this.H = (((long) this.K) * ((long) i14)) + this.H;
                            }
                            this.P = byteBuffer;
                            this.Q = i14;
                            y(j8);
                            if (!this.P.hasRemaining()) {
                                this.P = null;
                                this.Q = 0;
                                return true;
                            }
                            long jS15 = s();
                            if (cVar.f8792y != C.TIME_UNSET) {
                                fa.k.g("Resetting stalled audio track");
                                flush();
                                return true;
                            }
                        } else if (q()) {
                            m(j8);
                            this.A = null;
                            jS = z.S(this.f8705t.f8721a.D, r() - this.f8683d.f103728o) + this.N;
                            if (!this.L) {
                                bVar2 = this.f8703r;
                                if (bVar2 != null) {
                                    bVar2.a(new AudioSink.UnexpectedDiscontinuityException(j8, jS));
                                }
                                this.L = true;
                            }
                            if (this.L) {
                                if (q()) {
                                    long j111 = j8 - jS;
                                    this.N += j111;
                                    this.L = false;
                                    m(j8);
                                    bVar = this.f8703r;
                                    if (bVar != null) {
                                        androidx.media3.exoplayer.audio.f.this.J1 = true;
                                    }
                                }
                            }
                            if (this.f8705t.f8723c == 0) {
                                this.G += (long) byteBuffer.remaining();
                            } else {
                                this.H = (((long) this.K) * ((long) i14)) + this.H;
                            }
                            this.P = byteBuffer;
                            this.Q = i14;
                            y(j8);
                            if (!this.P.hasRemaining()) {
                                this.P = null;
                                this.Q = 0;
                                return true;
                            }
                            long jS16 = s();
                            if (cVar.f8792y != C.TIME_UNSET) {
                                fa.k.g("Resetting stalled audio track");
                                flush();
                                return true;
                            }
                        }
                    }
                    return true;
                }
                y(j8);
                if (!this.P.hasRemaining()) {
                    this.P = null;
                    this.Q = 0;
                    return true;
                }
                long jS17 = s();
                if (cVar.f8792y != C.TIME_UNSET) {
                    fa.k.g("Resetting stalled audio track");
                    flush();
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void handleDiscontinuity() {
        this.L = true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final boolean hasPendingData() {
        if (u()) {
            return !(z.f70071a >= 29 && this.f8707v.isOffloadedPlayback() && this.U) && this.f8689g.c(s());
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void i(androidx.media3.common.f fVar) {
        if (this.Y.equals(fVar)) {
            return;
        }
        int i14 = fVar.f8219a;
        float f14 = fVar.f8220b;
        AudioTrack audioTrack = this.f8707v;
        if (audioTrack != null) {
            if (this.Y.f8219a != i14) {
                audioTrack.attachAuxEffect(i14);
            }
            if (i14 != 0) {
                this.f8707v.setAuxEffectSendLevel(f14);
            }
        }
        this.Y = fVar;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final boolean isEnded() {
        if (u()) {
            return this.S && !hasPendingData();
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final ka.c j(androidx.media3.common.q qVar) {
        boolean zBooleanValue;
        AudioManager audioManager;
        if (this.f8684d0) {
            return ka.c.f103666d;
        }
        androidx.media3.common.d dVar = this.f8711z;
        ka.j jVar = this.f8700o;
        jVar.getClass();
        qVar.getClass();
        int i14 = qVar.D;
        dVar.getClass();
        int i15 = z.f70071a;
        if (i15 < 29 || i14 == -1) {
            return ka.c.f103666d;
        }
        Context context = jVar.f103697a;
        Boolean bool = jVar.f103698b;
        boolean z14 = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context == null || (audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO)) == null) {
                jVar.f103698b = Boolean.FALSE;
            } else {
                String parameters = audioManager.getParameters("offloadVariableRateSupported");
                jVar.f103698b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            }
            zBooleanValue = jVar.f103698b.booleanValue();
        }
        String str = qVar.f8386n;
        str.getClass();
        int iC = androidx.media3.common.x.c(str, qVar.f8383k);
        if (iC == 0 || i15 < z.o(iC)) {
            return ka.c.f103666d;
        }
        int iQ = z.q(qVar.C);
        if (iQ == 0) {
            return ka.c.f103666d;
        }
        try {
            AudioFormat audioFormatP = z.p(i14, iQ, iC);
            if (i15 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatP, dVar.a().f8185a)) {
                    return ka.c.f103666d;
                }
                ka.c.b bVar = new ka.c.b();
                bVar.f103670a = true;
                bVar.f103672c = zBooleanValue;
                return bVar.a();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatP, dVar.a().f8185a);
            if (playbackOffloadSupport == 0) {
                return ka.c.f103666d;
            }
            ka.c.b bVar2 = new ka.c.b();
            if (i15 > 32 && playbackOffloadSupport == 2) {
                z14 = true;
            }
            bVar2.f103670a = true;
            bVar2.f103671b = z14;
            bVar2.f103672c = zBooleanValue;
            return bVar2.a();
        } catch (IllegalArgumentException unused) {
            return ka.c.f103666d;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void k(int i14, int i15) {
        e eVar;
        AudioTrack audioTrack = this.f8707v;
        if (audioTrack == null || !v(audioTrack) || (eVar = this.f8705t) == null || !eVar.f8731k) {
            return;
        }
        this.f8707v.setOffloadDelayPadding(i14, i15);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void l(fa.c cVar) {
        this.f8689g.I = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0034  */
    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    public final void m(long j8) {
        y yVar;
        boolean z14;
        boolean zB = B();
        f fVar = this.f8679b;
        if (zB) {
            yVar = y.f8583d;
        } else {
            if (this.f8678a0) {
                yVar = y.f8583d;
            } else {
                e eVar = this.f8705t;
                if (eVar.f8723c == 0) {
                    int i14 = eVar.f8721a.E;
                    yVar = this.C;
                    androidx.media3.common.audio.c cVar = fVar.f8735c;
                    float f14 = yVar.f8584a;
                    if (cVar.f8139c != f14) {
                        cVar.f8139c = f14;
                        cVar.f8145i = true;
                    }
                    float f15 = yVar.f8585b;
                    if (cVar.f8140d != f15) {
                        cVar.f8140d = f15;
                        cVar.f8145i = true;
                    }
                } else {
                    yVar = y.f8583d;
                }
            }
            this.C = yVar;
        }
        y yVar2 = yVar;
        if (this.f8678a0) {
            z14 = false;
        } else {
            e eVar2 = this.f8705t;
            if (eVar2.f8723c == 0) {
                int i15 = eVar2.f8721a.E;
                z14 = this.D;
                fVar.f8734b.f103713o = z14;
            } else {
                z14 = false;
            }
        }
        this.D = z14;
        long jMax = Math.max(0L, j8);
        e eVar3 = this.f8705t;
        this.f8691h.add(new g(yVar2, jMax, z.S(eVar3.f8725e, s())));
        androidx.media3.common.audio.a aVar = this.f8705t.f8729i;
        this.f8706u = aVar;
        aVar.a();
        androidx.media3.exoplayer.audio.f.b bVar = this.f8703r;
        if (bVar != null) {
            boolean z15 = this.D;
            androidx.media3.exoplayer.audio.b.a aVar2 = androidx.media3.exoplayer.audio.f.this.A1;
            Handler handler = aVar2.f8766a;
            if (handler != null) {
                handler.post(new a0.a(aVar2, z15, 10));
            }
        }
    }

    public final AudioTrack n(AudioSink.a aVar, androidx.media3.common.d dVar, int i14, androidx.media3.common.q qVar) throws AudioSink.InitializationException {
        try {
            AudioTrack audioTrackA = this.f8701p.a(aVar, dVar, i14);
            int state = audioTrackA.getState();
            if (state == 1) {
                return audioTrackA;
            }
            try {
                audioTrackA.release();
            } catch (Exception unused) {
            }
            throw new AudioSink.InitializationException(state, aVar.f8669b, aVar.f8670c, aVar.f8668a, qVar, aVar.f8672e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e4) {
            throw new AudioSink.InitializationException(0, aVar.f8669b, aVar.f8670c, aVar.f8668a, qVar, aVar.f8672e, e4);
        }
    }

    public final AudioTrack o(e eVar) throws AudioSink.InitializationException {
        try {
            return n(eVar.a(), this.f8711z, this.X, eVar.f8721a);
        } catch (AudioSink.InitializationException e4) {
            androidx.media3.exoplayer.audio.f.b bVar = this.f8703r;
            if (bVar != null) {
                bVar.a(e4);
            }
            throw e4;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b4  */
    public final void p(long j8) throws T, AudioSink.WriteException {
        int iWrite;
        androidx.media3.exoplayer.audio.f.b bVar;
        t0.a aVar;
        boolean z14;
        i<AudioSink.WriteException> iVar = this.f8698m;
        if (this.R == null) {
            return;
        }
        boolean z15 = false;
        if (iVar.f8743a != 0) {
            synchronized (f8674j0) {
                z14 = f8676l0 > 0;
            }
            if (z14 || SystemClock.elapsedRealtime() < iVar.f8745c) {
                return;
            }
        }
        int iRemaining = this.R.remaining();
        if (this.f8678a0) {
            fa.a.d(j8 != C.TIME_UNSET);
            if (j8 == Long.MIN_VALUE) {
                j8 = this.f8680b0;
            } else {
                this.f8680b0 = j8;
            }
            AudioTrack audioTrack = this.f8707v;
            ByteBuffer byteBuffer = this.R;
            if (z.f70071a >= 26) {
                iWrite = audioTrack.write(byteBuffer, iRemaining, 1, 1000 * j8);
            } else {
                if (this.E == null) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                    this.E = byteBufferAllocate;
                    byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                    this.E.putInt(1431633921);
                }
                if (this.F == 0) {
                    this.E.putInt(4, iRemaining);
                    this.E.putLong(8, j8 * 1000);
                    this.E.position(0);
                    this.F = iRemaining;
                }
                int iRemaining2 = this.E.remaining();
                if (iRemaining2 <= 0) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining, 1);
                    if (iWrite < 0) {
                        this.F = 0;
                    } else {
                        this.F -= iWrite;
                    }
                } else {
                    int iWrite2 = audioTrack.write(this.E, iRemaining2, 1);
                    if (iWrite2 < 0) {
                        this.F = 0;
                        iWrite = iWrite2;
                    } else if (iWrite2 < iRemaining2) {
                        iWrite = 0;
                    } else {
                        iWrite = audioTrack.write(byteBuffer, iRemaining, 1);
                        if (iWrite < 0) {
                            this.F = 0;
                        } else {
                            this.F -= iWrite;
                        }
                    }
                }
            }
        } else {
            iWrite = this.f8707v.write(this.R, iRemaining, 1);
        }
        this.f8682c0 = SystemClock.elapsedRealtime();
        if (iWrite < 0) {
            if ((z.f70071a >= 24 && iWrite == -6) || iWrite == -32) {
                if (s() > 0) {
                    z15 = true;
                } else if (v(this.f8707v)) {
                    if (this.f8705t.f8723c == 1) {
                        this.f8684d0 = true;
                    }
                    z15 = true;
                }
            }
            AudioSink.WriteException writeException = new AudioSink.WriteException(iWrite, this.f8705t.f8721a, z15);
            androidx.media3.exoplayer.audio.f.b bVar2 = this.f8703r;
            if (bVar2 != null) {
                bVar2.a(writeException);
            }
            if (writeException.isRecoverable) {
                this.f8708w = ka.a.f103656c;
                throw writeException;
            }
            iVar.a(writeException);
            return;
        }
        iVar.f8743a = null;
        iVar.f8744b = C.TIME_UNSET;
        iVar.f8745c = C.TIME_UNSET;
        if (v(this.f8707v)) {
            if (this.J > 0) {
                this.f8686e0 = false;
            }
            if (this.V && (bVar = this.f8703r) != null && iWrite < iRemaining && !this.f8686e0 && (aVar = androidx.media3.exoplayer.audio.f.this.T) != null) {
                aVar.a();
            }
        }
        int i14 = this.f8705t.f8723c;
        if (i14 == 0) {
            this.I += (long) iWrite;
        }
        if (iWrite == iRemaining) {
            if (i14 != 0) {
                fa.a.d(this.R == this.P);
                this.J = (((long) this.K) * ((long) this.Q)) + this.J;
            }
            this.R = null;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void pause() {
        this.V = false;
        if (u()) {
            androidx.media3.exoplayer.audio.c cVar = this.f8689g;
            cVar.d();
            if (cVar.f8791x == C.TIME_UNSET) {
                ka.g gVar = cVar.f8772e;
                gVar.getClass();
                gVar.a();
            } else {
                cVar.f8793z = cVar.b();
                if (!v(this.f8707v)) {
                    return;
                }
            }
            this.f8707v.pause();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void play() {
        this.V = true;
        if (u()) {
            androidx.media3.exoplayer.audio.c cVar = this.f8689g;
            if (cVar.f8791x != C.TIME_UNSET) {
                cVar.f8791x = z.O(cVar.I.elapsedRealtime());
            }
            ka.g gVar = cVar.f8772e;
            gVar.getClass();
            gVar.a();
            this.f8707v.play();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void playToEndOfStream() {
        if (!this.S && u() && q()) {
            x();
            this.S = true;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0044 A[RETURN] */
    public final boolean q() throws T, AudioSink.WriteException {
        ByteBuffer byteBuffer;
        if (!this.f8706u.d()) {
            p(Long.MIN_VALUE);
            if (this.R == null) {
                return true;
            }
            return false;
        }
        androidx.media3.common.audio.a aVar = this.f8706u;
        if (aVar.d() && !aVar.f8130d) {
            aVar.f8130d = true;
            ((AudioProcessor) aVar.f8128b.get(0)).queueEndOfStream();
        }
        y(Long.MIN_VALUE);
        if (!this.f8706u.c() || ((byteBuffer = this.R) != null && byteBuffer.hasRemaining())) {
            return false;
        }
        return true;
    }

    public final long r() {
        e eVar = this.f8705t;
        return eVar.f8723c == 0 ? this.G / ((long) eVar.f8722b) : this.H;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void release() {
        androidx.media3.exoplayer.audio.a.b bVar;
        androidx.media3.exoplayer.audio.a aVar = this.f8709x;
        if (aVar != null) {
            Context context = aVar.f8751a;
            if (aVar.f8760j) {
                aVar.f8757g = null;
                if (z.f70071a >= 23 && (bVar = aVar.f8754d) != null) {
                    AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                    audioManager.getClass();
                    audioManager.unregisterAudioDeviceCallback(bVar);
                }
                context.unregisterReceiver(aVar.f8755e);
                androidx.media3.exoplayer.audio.a.c cVar = aVar.f8756f;
                if (cVar != null) {
                    cVar.f8762a.unregisterContentObserver(cVar);
                }
                aVar.f8760j = false;
            }
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void reset() {
        flush();
        UnmodifiableIterator<AudioProcessor> it = this.f8685e.iterator();
        while (it.hasNext()) {
            it.next().reset();
        }
        UnmodifiableIterator<AudioProcessor> it3 = this.f8687f.iterator();
        while (it3.hasNext()) {
            it3.next().reset();
        }
        androidx.media3.common.audio.a aVar = this.f8706u;
        if (aVar != null) {
            ImmutableList<AudioProcessor> immutableList = aVar.f8127a;
            for (int i14 = 0; i14 < immutableList.size(); i14++) {
                AudioProcessor audioProcessor = immutableList.get(i14);
                audioProcessor.flush();
                audioProcessor.reset();
            }
            aVar.f8129c = new ByteBuffer[0];
            AudioProcessor.a aVar2 = AudioProcessor.a.f8122e;
            aVar.f8130d = false;
        }
        this.V = false;
        this.f8684d0 = false;
    }

    public final long s() {
        e eVar = this.f8705t;
        if (eVar.f8723c != 0) {
            return this.J;
        }
        long j8 = this.I;
        long j14 = eVar.f8724d;
        int i14 = z.f70071a;
        return ((j8 + j14) - 1) / j14;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void setAudioSessionId(int i14) {
        if (this.X != i14) {
            this.X = i14;
            this.W = i14 != 0;
            flush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        this.Z = audioDeviceInfo == null ? null : new ka.b(audioDeviceInfo);
        androidx.media3.exoplayer.audio.a aVar = this.f8709x;
        if (aVar != null) {
            aVar.b(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f8707v;
        if (audioTrack != null) {
            ka.b bVar = this.Z;
            audioTrack.setPreferredDevice(bVar != null ? bVar.f103665a : null);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void setSkipSilenceEnabled(boolean z14) {
        this.D = z14;
        g gVar = new g(B() ? y.f8583d : this.C, C.TIME_UNSET, C.TIME_UNSET);
        if (u()) {
            this.A = gVar;
        } else {
            this.B = gVar;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public final void setVolume(float f14) {
        if (this.O != f14) {
            this.O = f14;
            if (u()) {
                this.f8707v.setVolume(this.O);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x019f  */
    /* JADX WARN: Code duplicated, block: B:94:? A[SYNTHETIC] */
    public final boolean t() throws AudioSink.InitializationException {
        AudioTrack audioTrackO;
        androidx.media3.exoplayer.audio.a aVar;
        q qVar;
        boolean z14;
        i<AudioSink.InitializationException> iVar = this.f8697l;
        if (iVar.f8743a != 0) {
            synchronized (f8674j0) {
                z14 = f8676l0 > 0;
            }
            if (z14 || SystemClock.elapsedRealtime() < iVar.f8745c) {
                return false;
            }
        }
        try {
            e eVar = this.f8705t;
            eVar.getClass();
            audioTrackO = o(eVar);
        } catch (AudioSink.InitializationException e4) {
            e eVar2 = this.f8705t;
            if (eVar2.f8728h > 1000000) {
                e eVar3 = new e(eVar2.f8721a, eVar2.f8722b, eVar2.f8723c, eVar2.f8724d, eVar2.f8725e, eVar2.f8726f, eVar2.f8727g, 1000000, eVar2.f8729i, eVar2.f8730j, eVar2.f8731k, eVar2.f8732l);
                try {
                    audioTrackO = o(eVar3);
                    this.f8705t = eVar3;
                } catch (AudioSink.InitializationException e14) {
                    e4.addSuppressed(e14);
                    if (this.f8705t.f8723c == 1) {
                        throw e4;
                    }
                    this.f8684d0 = true;
                    throw e4;
                }
            }
            if (this.f8705t.f8723c == 1) {
                throw e4;
            }
            this.f8684d0 = true;
            throw e4;
        }
        this.f8707v = audioTrackO;
        if (v(audioTrackO)) {
            AudioTrack audioTrack = this.f8707v;
            if (this.f8696k == null) {
                this.f8696k = new k();
            }
            k kVar = this.f8696k;
            Handler handler = kVar.f8747a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new l(handler, 0), kVar.f8748b);
            e eVar4 = this.f8705t;
            if (eVar4.f8731k) {
                AudioTrack audioTrack2 = this.f8707v;
                androidx.media3.common.q qVar2 = eVar4.f8721a;
                audioTrack2.setOffloadDelayPadding(qVar2.F, qVar2.G);
            }
        }
        int i14 = z.f70071a;
        if (i14 >= 31 && (qVar = this.f8702q) != null) {
            AudioTrack audioTrack3 = this.f8707v;
            q.a aVar2 = qVar.f98046b;
            aVar2.getClass();
            LogSessionId logSessionId = aVar2.f98049a;
            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
            if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                audioTrack3.setLogSessionId(logSessionId);
            }
        }
        this.X = this.f8707v.getAudioSessionId();
        androidx.media3.exoplayer.audio.c cVar = this.f8689g;
        AudioTrack audioTrack4 = this.f8707v;
        e eVar5 = this.f8705t;
        boolean z15 = eVar5.f8723c == 2;
        int i15 = eVar5.f8727g;
        int i16 = eVar5.f8724d;
        int i17 = eVar5.f8728h;
        cVar.f8770c = audioTrack4;
        cVar.f8771d = i17;
        cVar.f8772e = new ka.g(audioTrack4);
        cVar.f8773f = audioTrack4.getSampleRate();
        cVar.f8774g = z15 && i14 < 23 && (i15 == 5 || i15 == 6);
        boolean zI = z.I(i15);
        cVar.f8783p = zI;
        cVar.f8775h = zI ? z.S(cVar.f8773f, i17 / i16) : -9223372036854775807L;
        cVar.f8786s = 0L;
        cVar.f8787t = 0L;
        cVar.G = false;
        cVar.H = 0L;
        cVar.f8788u = 0L;
        cVar.f8782o = false;
        cVar.f8791x = C.TIME_UNSET;
        cVar.f8792y = C.TIME_UNSET;
        cVar.f8784q = 0L;
        cVar.f8781n = 0L;
        cVar.f8776i = 1.0f;
        if (u()) {
            this.f8707v.setVolume(this.O);
        }
        int i18 = this.Y.f8219a;
        if (i18 != 0) {
            this.f8707v.attachAuxEffect(i18);
            this.f8707v.setAuxEffectSendLevel(this.Y.f8220b);
        }
        ka.b bVar = this.Z;
        if (bVar != null && i14 >= 23) {
            this.f8707v.setPreferredDevice(bVar.f103665a);
            androidx.media3.exoplayer.audio.a aVar3 = this.f8709x;
            if (aVar3 != null) {
                aVar3.b(this.Z.f103665a);
            }
        }
        if (i14 >= 24 && (aVar = this.f8709x) != null) {
            this.f8710y = new h(this.f8707v, aVar);
        }
        this.M = true;
        androidx.media3.exoplayer.audio.f.b bVar2 = this.f8703r;
        if (bVar2 != null) {
            AudioSink.a aVarA = this.f8705t.a();
            androidx.media3.exoplayer.audio.b.a aVar4 = androidx.media3.exoplayer.audio.f.this.A1;
            Handler handler2 = aVar4.f8766a;
            if (handler2 != null) {
                handler2.post(new ka.e(aVar4, aVarA, 0));
            }
        }
        return true;
    }

    public final boolean u() {
        return this.f8707v != null;
    }

    public final void w() {
        Context context;
        ka.a aVarB;
        androidx.media3.exoplayer.audio.a.b bVar;
        if (this.f8709x != null || (context = this.f8677a) == null) {
            return;
        }
        this.f8688f0 = Looper.myLooper();
        androidx.media3.exoplayer.audio.a aVar = new androidx.media3.exoplayer.audio.a(context, new hy.d(this, 12), this.f8711z, this.Z);
        this.f8709x = aVar;
        if (aVar.f8760j) {
            aVarB = aVar.f8757g;
            aVarB.getClass();
        } else {
            aVar.f8760j = true;
            androidx.media3.exoplayer.audio.a.c cVar = aVar.f8756f;
            if (cVar != null) {
                cVar.f8762a.registerContentObserver(cVar.f8763b, false, cVar);
            }
            int i14 = z.f70071a;
            Handler handler = aVar.f8753c;
            Context context2 = aVar.f8751a;
            if (i14 >= 23 && (bVar = aVar.f8754d) != null) {
                AudioManager audioManager = (AudioManager) context2.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                audioManager.getClass();
                audioManager.registerAudioDeviceCallback(bVar, handler);
            }
            aVarB = ka.a.b(context2, context2.registerReceiver(aVar.f8755e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), aVar.f8759i, aVar.f8758h);
            aVar.f8757g = aVarB;
        }
        this.f8708w = aVarB;
    }

    public final void x() {
        if (this.T) {
            return;
        }
        this.T = true;
        long jS = s();
        androidx.media3.exoplayer.audio.c cVar = this.f8689g;
        cVar.f8793z = cVar.b();
        cVar.f8791x = z.O(cVar.I.elapsedRealtime());
        cVar.A = jS;
        if (v(this.f8707v)) {
            this.U = false;
        }
        this.f8707v.stop();
        this.F = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    public final void y(long j8) throws T, AudioSink.WriteException {
        ByteBuffer byteBuffer;
        p(j8);
        if (this.R != null) {
            return;
        }
        if (!this.f8706u.d()) {
            ByteBuffer byteBuffer2 = this.P;
            if (byteBuffer2 != null) {
                A(byteBuffer2);
                p(j8);
                return;
            }
            return;
        }
        while (!this.f8706u.c()) {
            do {
                androidx.media3.common.audio.a aVar = this.f8706u;
                if (aVar.d()) {
                    ByteBuffer byteBuffer3 = aVar.f8129c[aVar.b()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        aVar.e(AudioProcessor.f8121a);
                        byteBuffer = aVar.f8129c[aVar.b()];
                    }
                } else {
                    byteBuffer = AudioProcessor.f8121a;
                }
                if (byteBuffer.hasRemaining()) {
                    A(byteBuffer);
                    p(j8);
                } else {
                    ByteBuffer byteBuffer4 = this.P;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    androidx.media3.common.audio.a aVar2 = this.f8706u;
                    ByteBuffer byteBuffer5 = this.P;
                    if (aVar2.d() && !aVar2.f8130d) {
                        aVar2.e(byteBuffer5);
                    }
                }
            } while (this.R == null);
            return;
        }
    }

    public final void z() {
        if (u()) {
            try {
                this.f8707v.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.C.f8584a).setPitch(this.C.f8585b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e4) {
                fa.k.h("Failed to set playback params", e4);
            }
            y yVar = new y(this.f8707v.getPlaybackParams().getSpeed(), this.f8707v.getPlaybackParams().getPitch());
            this.C = yVar;
            float f14 = yVar.f8584a;
            androidx.media3.exoplayer.audio.c cVar = this.f8689g;
            cVar.f8776i = f14;
            ka.g gVar = cVar.f8772e;
            if (gVar != null) {
                gVar.a();
            }
            cVar.d();
        }
    }

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f8714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ka.a f8715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f f8716c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f8717d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final androidx.media3.exoplayer.audio.d f8718e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final androidx.media3.exoplayer.audio.e f8719f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ka.j f8720g;

        @Deprecated
        public d() {
            this.f8714a = null;
            this.f8715b = ka.a.f103656c;
            this.f8718e = b.f8712a;
            this.f8719f = c.f8713a;
        }

        public final DefaultAudioSink a() {
            fa.a.d(!this.f8717d);
            this.f8717d = true;
            if (this.f8716c == null) {
                this.f8716c = new f(new AudioProcessor[0]);
            }
            if (this.f8720g == null) {
                this.f8720g = new ka.j(this.f8714a);
            }
            return new DefaultAudioSink(this);
        }

        public d(Context context) {
            this.f8714a = context;
            this.f8715b = ka.a.f103656c;
            this.f8718e = b.f8712a;
            this.f8719f = c.f8713a;
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioProcessor[] f8733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ka.n f8734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.media3.common.audio.c f8735c;

        public f(AudioProcessor[] audioProcessorArr, ka.n nVar, androidx.media3.common.audio.c cVar) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f8733a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f8734b = nVar;
            this.f8735c = cVar;
            audioProcessorArr2[audioProcessorArr.length] = nVar;
            audioProcessorArr2[audioProcessorArr.length + 1] = cVar;
        }

        public f(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new ka.n(), new androidx.media3.common.audio.c());
        }
    }
}
