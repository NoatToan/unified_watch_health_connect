package com.xiaomi.ai.android.vad;

import com.xiaomi.ai.log.Logger;
import java.util.Arrays;

/* JADX INFO: loaded from: classes18.dex */
public class Vad2 implements IVad {
    private static boolean d = false;
    private long a;
    private long b;
    private int[] c;
    private byte[] e;
    private int f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private int l;
    private int m;
    private int n;
    private int o;
    private boolean p;

    public class DecodeResult {
        public boolean hasVoice;
        public boolean hasVoicePre;
        public int minVoiceLength;
        public int packNumBeg;
        public int packNumEnd;
        public int packNumPreBeg;
        public int packNumVoice;
        public int retVal;

        public DecodeResult() {
        }
    }

    public Vad2(int i, int i2) {
        this.c = new int[8];
        this.e = new byte[640];
        this.f = 0;
        this.h = 0;
        this.i = -1;
        this.j = 1;
        this.k = false;
        this.l = 60;
        this.m = 50;
        this.n = 1500;
        this.o = 6000;
        this.l = i;
        this.m = i2;
        Logger.a("Vad2", "minVoice:" + i + ", minSil:" + i2);
    }

    public Vad2(int i, int i2, int i3, int i4) {
        this.c = new int[8];
        this.e = new byte[640];
        this.f = 0;
        this.h = 0;
        this.i = -1;
        this.j = 1;
        this.k = false;
        this.l = 60;
        this.m = 50;
        this.n = 1500;
        this.o = 6000;
        this.l = i;
        this.m = i2;
        this.n = i3;
        this.o = i4;
        Logger.a("Vad2", "minVoice:" + i + ", minSil:" + i2 + ", maxVoice:" + i3 + ", maxLengthReset:" + i4);
    }

    private native long createTask(long j);

    private native int endDelay(long j, long j2);

    private native boolean hasVoice(long j, long j2, byte[] bArr, int i, int[] iArr);

    private native long newVad(int i, int i2, int i3, int i4);

    private native boolean releaseVad(long j);

    private native int startDelay(long j, long j2);

    private native boolean stopTask(long j, long j2, int[] iArr);

    @Override // com.xiaomi.ai.android.vad.IVad
    public synchronized boolean checkVad(byte[] bArr) {
        if (!this.p) {
            Logger.d("Vad2", "checkVad: mAvailable=" + this.p);
            return false;
        }
        int length = bArr.length;
        int i = this.f;
        int i2 = length + i;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(this.e, 0, bArr2, 0, i);
        System.arraycopy(bArr, 0, bArr2, this.f, length);
        this.f = i2 % 640;
        int i3 = i2 / 640;
        for (int i4 = 0; i4 < i3; i4++) {
            System.arraycopy(bArr2, i4 * 640, this.e, 0, 640);
            boolean zHasVoice = hasVoice(this.e, 0, 640);
            this.h++;
            if (!this.g && zHasVoice) {
                Logger.a("Vad2", "detect vad start at pack:" + this.h);
                this.g = true;
            }
            if (this.g && !zHasVoice) {
                Logger.a("Vad2", "stop speak at pack:" + this.h);
                this.g = false;
                return true;
            }
            this.g = zHasVoice;
        }
        System.arraycopy(bArr2, i3 * 640, this.e, 0, this.f);
        return false;
    }

    public void finalize() throws Throwable {
        release();
        super.finalize();
    }

    public int getEndDelay() {
        if (!this.p) {
            Logger.d("Vad2", "getEndDelay: mAvailable=false");
            return -1;
        }
        long j = this.a;
        if (j == 0) {
            return -1;
        }
        long j2 = this.b;
        if (j2 != 0) {
            return endDelay(j, j2);
        }
        return -1;
    }

    public int getStartDelay() {
        if (!this.p) {
            Logger.d("Vad2", "getStartDelay: mAvailable=false");
            return -1;
        }
        long j = this.a;
        if (j == 0) {
            return -1;
        }
        long j2 = this.b;
        if (j2 != 0) {
            return startDelay(j, j2);
        }
        return -1;
    }

    public synchronized boolean hasVoice(byte[] bArr, int i, int i2) {
        try {
            if (i2 != 640) {
                throw new IllegalArgumentException("buffer length must be 640");
            }
            if (!this.p) {
                Logger.d("Vad2", "hasVoice: mAvailable=" + this.p);
                return false;
            }
            DecodeResult decodeResultProcessTask = processTask(bArr, 640);
            if (decodeResultProcessTask == null) {
                return false;
            }
            if (!decodeResultProcessTask.hasVoice) {
                return false;
            }
            if (this.i != decodeResultProcessTask.packNumBeg) {
                Logger.a("Vad2", "isSpeak:mPackNumBeg=" + (((double) decodeResultProcessTask.packNumBeg) * 0.01d));
                this.k = true;
            }
            if (decodeResultProcessTask.packNumEnd > this.j && this.k) {
                Logger.a("Vad2", "isSpeak:mPackNumEnd=" + (((double) decodeResultProcessTask.packNumEnd) * 0.01d));
                this.k = false;
            }
            this.i = decodeResultProcessTask.packNumBeg;
            this.j = decodeResultProcessTask.packNumEnd;
            return this.k;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.xiaomi.ai.android.vad.IVad
    public boolean init() {
        if (!d) {
            System.loadLibrary("vad2");
            d = true;
        }
        release();
        long jNewVad = newVad(this.l, this.m, this.n, this.o);
        this.a = jNewVad;
        this.b = createTask(jNewVad);
        this.g = false;
        this.h = 0;
        this.i = -1;
        this.j = 1;
        this.f = 0;
        this.p = true;
        return true;
    }

    public synchronized boolean isSpeak(byte[] bArr, int i, int i2) {
        if (!this.p) {
            Logger.d("Vad2", "isSpeak: mAvailable=" + this.p);
            return false;
        }
        int i3 = this.f;
        int i4 = i2 + i3;
        byte[] bArr2 = new byte[i4];
        System.arraycopy(this.e, 0, bArr2, 0, i3);
        System.arraycopy(bArr, i, bArr2, this.f, i2);
        this.f = i4 % 640;
        int i5 = i4 / 640;
        boolean z = false;
        for (int i6 = 0; i6 < i5; i6++) {
            System.arraycopy(bArr2, i6 * 640, this.e, 0, 640);
            if (hasVoice(this.e, 0, 640)) {
                z = true;
            }
        }
        System.arraycopy(bArr2, i5 * 640, this.e, 0, this.f);
        return z;
    }

    public DecodeResult processTask(byte[] bArr, int i) {
        if (!this.p) {
            Logger.d("Vad2", "processTask: mAvailable=" + this.p);
            return null;
        }
        if (bArr != null && i != 0) {
            DecodeResult decodeResult = new DecodeResult();
            Arrays.fill(this.c, 0);
            if (hasVoice(this.a, this.b, bArr, i, this.c)) {
                int[] iArr = this.c;
                decodeResult.retVal = iArr[0];
                decodeResult.hasVoice = iArr[1] == 1;
                decodeResult.packNumVoice = iArr[2];
                decodeResult.packNumBeg = iArr[3];
                decodeResult.packNumEnd = iArr[4];
                decodeResult.minVoiceLength = iArr[5];
                decodeResult.hasVoicePre = iArr[6] == 1;
                decodeResult.packNumPreBeg = iArr[7];
                return decodeResult;
            }
        }
        return null;
    }

    @Override // com.xiaomi.ai.android.vad.IVad
    public synchronized void release() {
        stopTask();
        long j = this.a;
        if (j != 0) {
            releaseVad(j);
            this.g = false;
            this.h = 0;
            this.i = -1;
            this.j = 1;
            this.a = 0L;
            this.f = 0;
            Logger.a("Vad2", "releaseVad");
        }
        this.p = false;
        Logger.a("Vad2", "release");
    }

    public boolean reset() {
        Arrays.fill(this.c, 0);
        boolean zStopTask = stopTask(this.a, this.b, this.c);
        if (zStopTask) {
            this.b = createTask(this.a);
        }
        this.g = false;
        this.h = 0;
        this.i = -1;
        this.j = 1;
        this.f = 0;
        return zStopTask;
    }

    public DecodeResult stopTask() {
        Logger.a("Vad2", "stopTask");
        long j = this.a;
        if (j != 0) {
            long j2 = this.b;
            if (j2 != 0 && stopTask(j, j2, this.c)) {
                Logger.a("Vad2", "stopTask: get result");
                DecodeResult decodeResult = new DecodeResult();
                int[] iArr = this.c;
                decodeResult.retVal = iArr[0];
                decodeResult.hasVoice = iArr[1] == 1;
                decodeResult.packNumVoice = iArr[2];
                decodeResult.packNumBeg = iArr[3];
                decodeResult.packNumEnd = iArr[4];
                decodeResult.minVoiceLength = iArr[5];
                decodeResult.hasVoicePre = iArr[6] == 1;
                decodeResult.packNumPreBeg = iArr[7];
                this.b = 0L;
                return decodeResult;
            }
        }
        this.b = 0L;
        return null;
    }
}
