package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
final class AudioTrackPositionTracker {
    private static final int G = 1;
    private static final int H = 2;
    private static final int I = 3;
    private static final long J = 5000000;
    private static final long K = 5000000;
    private static final long L = 1000000;
    private static final long M = 200;
    private static final int N = 10;
    private static final int O = 30000;
    private static final int P = 500000;
    private long A;
    private long B;
    private long C;
    private boolean D;
    private long E;
    private long F;
    private final Listener a;
    private final long[] b;

    @Nullable
    private AudioTrack c;
    private int d;
    private int e;

    @Nullable
    private d f;
    private int g;
    private boolean h;
    private long i;
    private float j;
    private boolean k;
    private long l;
    private long m;

    @Nullable
    private Method n;
    private long o;
    private boolean p;
    private boolean q;
    private long r;
    private long s;
    private long t;
    private long u;
    private int v;
    private int w;
    private long x;
    private long y;
    private long z;

    public interface Listener {
        void onInvalidLatency(long latencyUs);

        void onPositionAdvancing(long playoutStartSystemTimeMs);

        void onPositionFramesMismatch(long audioTimestampPositionFrames, long audioTimestampSystemTimeUs, long systemTimeUs, long playbackPositionUs);

        void onSystemTimeUsMismatch(long audioTimestampPositionFrames, long audioTimestampSystemTimeUs, long systemTimeUs, long playbackPositionUs);

        void onUnderrun(int bufferSize, long bufferSizeMs);
    }

    public AudioTrackPositionTracker(Listener listener) {
        this.a = (Listener) Assertions.checkNotNull(listener);
        if (Util.SDK_INT >= 18) {
            try {
                this.n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.b = new long[10];
    }

    private boolean a() {
        return this.h && ((AudioTrack) Assertions.checkNotNull(this.c)).getPlayState() == 2 && f() == 0;
    }

    private long b(long frameCount) {
        return (frameCount * 1000000) / ((long) this.g);
    }

    private long f() {
        AudioTrack audioTrack = (AudioTrack) Assertions.checkNotNull(this.c);
        if (this.x != C.TIME_UNSET) {
            return Math.min(this.A, this.z + ((((SystemClock.elapsedRealtime() * 1000) - this.x) * ((long) this.g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & ((long) audioTrack.getPlaybackHeadPosition());
        if (this.h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.u = this.s;
            }
            playbackHeadPosition += this.u;
        }
        if (Util.SDK_INT <= 29) {
            if (playbackHeadPosition == 0 && this.s > 0 && playState == 3) {
                if (this.y == C.TIME_UNSET) {
                    this.y = SystemClock.elapsedRealtime();
                }
                return this.s;
            }
            this.y = C.TIME_UNSET;
        }
        if (this.s > playbackHeadPosition) {
            this.t++;
        }
        this.s = playbackHeadPosition;
        return playbackHeadPosition + (this.t << 32);
    }

    private long g() {
        return b(f());
    }

    private void m(long systemTimeUs, long playbackPositionUs) {
        d dVar = (d) Assertions.checkNotNull(this.f);
        if (dVar.f(systemTimeUs)) {
            long jC = dVar.c();
            long jB = dVar.b();
            if (Math.abs(jC - systemTimeUs) > 5000000) {
                this.a.onSystemTimeUsMismatch(jB, jC, systemTimeUs, playbackPositionUs);
                dVar.g();
            } else if (Math.abs(b(jB) - playbackPositionUs) <= 5000000) {
                dVar.a();
            } else {
                this.a.onPositionFramesMismatch(jB, jC, systemTimeUs, playbackPositionUs);
                dVar.g();
            }
        }
    }

    private void n() {
        long jG = g();
        if (jG == 0) {
            return;
        }
        long jNanoTime = System.nanoTime() / 1000;
        if (jNanoTime - this.m >= 30000) {
            long[] jArr = this.b;
            int i = this.v;
            jArr[i] = jG - jNanoTime;
            this.v = (i + 1) % 10;
            int i2 = this.w;
            if (i2 < 10) {
                this.w = i2 + 1;
            }
            this.m = jNanoTime;
            this.l = 0L;
            int i3 = 0;
            while (true) {
                int i4 = this.w;
                if (i3 >= i4) {
                    break;
                }
                this.l += this.b[i3] / ((long) i4);
                i3++;
            }
        }
        if (this.h) {
            return;
        }
        m(jNanoTime, jG);
        o(jNanoTime);
    }

    private void o(long systemTimeUs) {
        Method method;
        if (!this.q || (method = this.n) == null || systemTimeUs - this.r < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) Util.castNonNull((Integer) method.invoke(Assertions.checkNotNull(this.c), new Object[0]))).intValue()) * 1000) - this.i;
            this.o = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.o = jMax;
            if (jMax > 5000000) {
                this.a.onInvalidLatency(jMax);
                this.o = 0L;
            }
        } catch (Exception unused) {
            this.n = null;
        }
        this.r = systemTimeUs;
    }

    private static boolean p(int outputEncoding) {
        return Util.SDK_INT < 23 && (outputEncoding == 5 || outputEncoding == 6);
    }

    private void s() {
        this.l = 0L;
        this.w = 0;
        this.v = 0;
        this.m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.k = false;
    }

    public int c(long writtenBytes) {
        return this.e - ((int) (writtenBytes - (f() * ((long) this.d))));
    }

    public long d(boolean sourceEnded) {
        long jG;
        if (((AudioTrack) Assertions.checkNotNull(this.c)).getPlayState() == 3) {
            n();
        }
        long jNanoTime = System.nanoTime() / 1000;
        d dVar = (d) Assertions.checkNotNull(this.f);
        boolean zD = dVar.d();
        if (zD) {
            jG = b(dVar.b()) + Util.getMediaDurationForPlayoutDuration(jNanoTime - dVar.c(), this.j);
        } else {
            jG = this.w == 0 ? g() : this.l + jNanoTime;
            if (!sourceEnded) {
                jG = Math.max(0L, jG - this.o);
            }
        }
        if (this.D != zD) {
            this.F = this.C;
            this.E = this.B;
        }
        long j = jNanoTime - this.F;
        if (j < 1000000) {
            long mediaDurationForPlayoutDuration = this.E + Util.getMediaDurationForPlayoutDuration(j, this.j);
            long j2 = (j * 1000) / 1000000;
            jG = ((jG * j2) + ((1000 - j2) * mediaDurationForPlayoutDuration)) / 1000;
        }
        if (!this.k) {
            long j3 = this.B;
            if (jG > j3) {
                this.k = true;
                this.a.onPositionAdvancing(System.currentTimeMillis() - C.usToMs(Util.getPlayoutDurationForMediaDuration(C.usToMs(jG - j3), this.j)));
            }
        }
        this.C = jNanoTime;
        this.B = jG;
        this.D = zD;
        return jG;
    }

    public long e(long writtenFrames) {
        return C.usToMs(b(writtenFrames - f()));
    }

    public void h(long writtenFrames) {
        this.z = f();
        this.x = SystemClock.elapsedRealtime() * 1000;
        this.A = writtenFrames;
    }

    public boolean i(long writtenFrames) {
        return writtenFrames > f() || a();
    }

    public boolean j() {
        return ((AudioTrack) Assertions.checkNotNull(this.c)).getPlayState() == 3;
    }

    public boolean k(long writtenFrames) {
        return this.y != C.TIME_UNSET && writtenFrames > 0 && SystemClock.elapsedRealtime() - this.y >= 200;
    }

    public boolean l(long writtenFrames) {
        int playState = ((AudioTrack) Assertions.checkNotNull(this.c)).getPlayState();
        if (this.h) {
            if (playState == 2) {
                this.p = false;
                return false;
            }
            if (playState == 1 && f() == 0) {
                return false;
            }
        }
        boolean z = this.p;
        boolean zI = i(writtenFrames);
        this.p = zI;
        if (z && !zI && playState != 1) {
            this.a.onUnderrun(this.e, C.usToMs(this.i));
        }
        return true;
    }

    public boolean q() {
        s();
        if (this.x != C.TIME_UNSET) {
            return false;
        }
        ((d) Assertions.checkNotNull(this.f)).h();
        return true;
    }

    public void r() {
        s();
        this.c = null;
        this.f = null;
    }

    public void t(AudioTrack audioTrack, boolean isPassthrough, int outputEncoding, int outputPcmFrameSize, int bufferSize) {
        this.c = audioTrack;
        this.d = outputPcmFrameSize;
        this.e = bufferSize;
        this.f = new d(audioTrack);
        this.g = audioTrack.getSampleRate();
        this.h = isPassthrough && p(outputEncoding);
        boolean zIsEncodingLinearPcm = Util.isEncodingLinearPcm(outputEncoding);
        this.q = zIsEncodingLinearPcm;
        this.i = zIsEncodingLinearPcm ? b(bufferSize / outputPcmFrameSize) : -9223372036854775807L;
        this.s = 0L;
        this.t = 0L;
        this.u = 0L;
        this.p = false;
        this.x = C.TIME_UNSET;
        this.y = C.TIME_UNSET;
        this.r = 0L;
        this.o = 0L;
        this.j = 1.0f;
    }

    public void u(float audioTrackPlaybackSpeed) {
        this.j = audioTrackPlaybackSpeed;
        d dVar = this.f;
        if (dVar != null) {
            dVar.h();
        }
    }

    public void v() {
        ((d) Assertions.checkNotNull(this.f)).h();
    }
}
