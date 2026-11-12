package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Assertions;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class h {
    private static final int w = 65;
    private static final int x = 400;
    private static final int y = 4000;
    private static final int z = 2;
    private final int a;
    private final int b;
    private final float c;
    private final float d;
    private final float e;
    private final int f;
    private final int g;
    private final int h;
    private final short[] i;
    private short[] j;
    private int k;
    private short[] l;
    private int m;
    private short[] n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;

    public h(int inputSampleRateHz, int channelCount, float speed, float pitch, int outputSampleRateHz) {
        this.a = inputSampleRateHz;
        this.b = channelCount;
        this.c = speed;
        this.d = pitch;
        this.e = inputSampleRateHz / outputSampleRateHz;
        this.f = inputSampleRateHz / 400;
        int i = inputSampleRateHz / 65;
        this.g = i;
        int i2 = i * 2;
        this.h = i2;
        this.i = new short[i2];
        this.j = new short[i2 * channelCount];
        this.l = new short[i2 * channelCount];
        this.n = new short[i2 * channelCount];
    }

    private void a(float rate, int originalOutputFrameCount) {
        int i;
        int i2;
        if (this.m == originalOutputFrameCount) {
            return;
        }
        int i3 = this.a;
        int i4 = (int) (i3 / rate);
        while (true) {
            if (i4 <= 16384 && i3 <= 16384) {
                break;
            }
            i4 /= 2;
            i3 /= 2;
        }
        o(originalOutputFrameCount);
        int i5 = 0;
        while (true) {
            int i6 = this.o;
            if (i5 >= i6 - 1) {
                u(i6 - 1);
                return;
            }
            while (true) {
                i = this.p;
                int i7 = (i + 1) * i4;
                i2 = this.q;
                if (i7 <= i2 * i3) {
                    break;
                }
                this.l = f(this.l, this.m, 1);
                int i8 = 0;
                while (true) {
                    int i9 = this.b;
                    if (i8 < i9) {
                        this.l[(this.m * i9) + i8] = n(this.n, (i9 * i5) + i8, i3, i4);
                        i8++;
                    }
                }
                this.q++;
                this.m++;
            }
            int i10 = i + 1;
            this.p = i10;
            if (i10 == i3) {
                this.p = 0;
                Assertions.checkState(i2 == i4);
                this.q = 0;
            }
            i5++;
        }
    }

    private void b(float speed) {
        int iW;
        int i = this.k;
        if (i < this.h) {
            return;
        }
        int i2 = 0;
        do {
            if (this.r > 0) {
                iW = c(i2);
            } else {
                int iG = g(this.j, i2);
                iW = ((double) speed) > 1.0d ? iG + w(this.j, i2, speed, iG) : m(this.j, i2, speed, iG);
            }
            i2 += iW;
        } while (this.h + i2 <= i);
        v(i2);
    }

    private int c(int positionFrames) {
        int iMin = Math.min(this.h, this.r);
        d(this.j, positionFrames, iMin);
        this.r -= iMin;
        return iMin;
    }

    private void d(short[] samples, int positionFrames, int frameCount) {
        short[] sArrF = f(this.l, this.m, frameCount);
        this.l = sArrF;
        int i = this.b;
        System.arraycopy(samples, positionFrames * i, sArrF, this.m * i, i * frameCount);
        this.m += frameCount;
    }

    private void e(short[] samples, int position, int skip) {
        int i = this.h / skip;
        int i2 = this.b;
        int i3 = skip * i2;
        int i4 = position * i2;
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = 0;
            for (int i7 = 0; i7 < i3; i7++) {
                i6 += samples[(i5 * i3) + i4 + i7];
            }
            this.i[i5] = (short) (i6 / i3);
        }
    }

    private short[] f(short[] buffer, int frameCount, int additionalFrameCount) {
        int length = buffer.length;
        int i = this.b;
        int i2 = length / i;
        return frameCount + additionalFrameCount <= i2 ? buffer : Arrays.copyOf(buffer, (((i2 * 3) / 2) + additionalFrameCount) * i);
    }

    private int g(short[] samples, int position) {
        int iH;
        int i = this.a;
        int i2 = i > 4000 ? i / 4000 : 1;
        if (this.b == 1 && i2 == 1) {
            iH = h(samples, position, this.f, this.g);
        } else {
            e(samples, position, i2);
            int iH2 = h(this.i, 0, this.f / i2, this.g / i2);
            if (i2 != 1) {
                int i3 = iH2 * i2;
                int i4 = i2 * 4;
                int i5 = i3 - i4;
                int i6 = i3 + i4;
                int i7 = this.f;
                if (i5 < i7) {
                    i5 = i7;
                }
                int i8 = this.g;
                if (i6 > i8) {
                    i6 = i8;
                }
                if (this.b == 1) {
                    iH = h(samples, position, i5, i6);
                } else {
                    e(samples, position, 1);
                    iH = h(this.i, 0, i5, i6);
                }
            } else {
                iH = iH2;
            }
        }
        int i9 = q(this.u, this.v) ? this.s : iH;
        this.t = this.u;
        this.s = iH;
        return i9;
    }

    private int h(short[] samples, int position, int minPeriod, int maxPeriod) {
        int i = position * this.b;
        int i2 = 1;
        int i3 = 255;
        int i4 = 0;
        int i5 = 0;
        while (minPeriod <= maxPeriod) {
            int iAbs = 0;
            for (int i6 = 0; i6 < minPeriod; i6++) {
                iAbs += Math.abs(samples[i + i6] - samples[(i + minPeriod) + i6]);
            }
            if (iAbs * i4 < i2 * minPeriod) {
                i4 = minPeriod;
                i2 = iAbs;
            }
            if (iAbs * i3 > i5 * minPeriod) {
                i3 = minPeriod;
                i5 = iAbs;
            }
            minPeriod++;
        }
        this.u = i2 / i4;
        this.v = i5 / i3;
        return i4;
    }

    private int m(short[] samples, int position, float speed, int period) {
        int i;
        if (speed < 0.5f) {
            i = (int) ((period * speed) / (1.0f - speed));
        } else {
            this.r = (int) ((period * ((2.0f * speed) - 1.0f)) / (1.0f - speed));
            i = period;
        }
        int i2 = period + i;
        short[] sArrF = f(this.l, this.m, i2);
        this.l = sArrF;
        int i3 = this.b;
        System.arraycopy(samples, position * i3, sArrF, this.m * i3, i3 * period);
        p(i, this.b, this.l, this.m + period, samples, position + period, samples, position);
        this.m += i2;
        return i;
    }

    private short n(short[] in, int inPos, int oldSampleRate, int newSampleRate) {
        short s = in[inPos];
        short s2 = in[inPos + this.b];
        int i = this.q * oldSampleRate;
        int i2 = this.p;
        int i3 = i2 * newSampleRate;
        int i4 = (i2 + 1) * newSampleRate;
        int i5 = i4 - i;
        int i6 = i4 - i3;
        return (short) (((s * i5) + ((i6 - i5) * s2)) / i6);
    }

    private void o(int originalOutputFrameCount) {
        int i = this.m - originalOutputFrameCount;
        short[] sArrF = f(this.n, this.o, i);
        this.n = sArrF;
        short[] sArr = this.l;
        int i2 = this.b;
        System.arraycopy(sArr, originalOutputFrameCount * i2, sArrF, this.o * i2, i2 * i);
        this.m = originalOutputFrameCount;
        this.o += i;
    }

    private static void p(int frameCount, int channelCount, short[] out, int outPosition, short[] rampDown, int rampDownPosition, short[] rampUp, int rampUpPosition) {
        for (int i = 0; i < channelCount; i++) {
            int i2 = (outPosition * channelCount) + i;
            int i3 = (rampUpPosition * channelCount) + i;
            int i4 = (rampDownPosition * channelCount) + i;
            for (int i5 = 0; i5 < frameCount; i5++) {
                out[i2] = (short) (((rampDown[i4] * (frameCount - i5)) + (rampUp[i3] * i5)) / frameCount);
                i2 += channelCount;
                i4 += channelCount;
                i3 += channelCount;
            }
        }
    }

    private boolean q(int minDiff, int maxDiff) {
        return minDiff != 0 && this.s != 0 && maxDiff <= minDiff * 3 && minDiff * 2 > this.t * 3;
    }

    private void r() {
        int i = this.m;
        float f = this.c;
        float f2 = this.d;
        float f3 = f / f2;
        float f4 = this.e * f2;
        double d = f3;
        if (d > 1.00001d || d < 0.99999d) {
            b(f3);
        } else {
            d(this.j, 0, this.k);
            this.k = 0;
        }
        if (f4 != 1.0f) {
            a(f4, i);
        }
    }

    private void u(int frameCount) {
        if (frameCount == 0) {
            return;
        }
        short[] sArr = this.n;
        int i = this.b;
        System.arraycopy(sArr, frameCount * i, sArr, 0, (this.o - frameCount) * i);
        this.o -= frameCount;
    }

    private void v(int positionFrames) {
        int i = this.k - positionFrames;
        short[] sArr = this.j;
        int i2 = this.b;
        System.arraycopy(sArr, positionFrames * i2, sArr, 0, i2 * i);
        this.k = i;
    }

    private int w(short[] samples, int position, float speed, int period) {
        int i;
        if (speed >= 2.0f) {
            i = (int) (period / (speed - 1.0f));
        } else {
            this.r = (int) ((period * (2.0f - speed)) / (speed - 1.0f));
            i = period;
        }
        short[] sArrF = f(this.l, this.m, i);
        this.l = sArrF;
        p(i, this.b, sArrF, this.m, samples, position, samples, position + period);
        this.m += i;
        return i;
    }

    public void i() {
        this.k = 0;
        this.m = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
    }

    public void j(ShortBuffer buffer) {
        int iMin = Math.min(buffer.remaining() / this.b, this.m);
        buffer.put(this.l, 0, this.b * iMin);
        int i = this.m - iMin;
        this.m = i;
        short[] sArr = this.l;
        int i2 = this.b;
        System.arraycopy(sArr, iMin * i2, sArr, 0, i * i2);
    }

    public int k() {
        return this.m * this.b * 2;
    }

    public int l() {
        return this.k * this.b * 2;
    }

    public void s() {
        int i;
        int i2 = this.k;
        float f = this.c;
        float f2 = this.d;
        int i3 = this.m + ((int) ((((i2 / (f / f2)) + this.o) / (this.e * f2)) + 0.5f));
        this.j = f(this.j, i2, (this.h * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.h;
            int i5 = this.b;
            if (i4 >= i * 2 * i5) {
                break;
            }
            this.j[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.k += i * 2;
        r();
        if (this.m > i3) {
            this.m = i3;
        }
        this.k = 0;
        this.r = 0;
        this.o = 0;
    }

    public void t(ShortBuffer buffer) {
        int iRemaining = buffer.remaining();
        int i = this.b;
        int i2 = iRemaining / i;
        short[] sArrF = f(this.j, this.k, i2);
        this.j = sArrF;
        buffer.get(sArrF, this.k * this.b, ((i * i2) * 2) / 2);
        this.k += i2;
        r();
    }
}
