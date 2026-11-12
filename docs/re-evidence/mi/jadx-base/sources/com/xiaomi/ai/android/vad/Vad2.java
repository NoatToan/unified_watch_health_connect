package com.xiaomi.ai.android.vad;

import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.google.android.gms.common.ConnectionResult;
import defpackage.wpe;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class Vad2 implements IVad {
    private static boolean p = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f10991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f10992b;
    private int[] c;
    private byte[] d;
    private int e;
    private boolean f;
    private int g;
    private int h;
    private int i;
    private boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f10993k;
    private int l;
    private int m;
    private int n;
    private boolean o;

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
        this.d = new byte[GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH];
        this.e = 0;
        this.g = 0;
        this.h = -1;
        this.i = 1;
        this.j = false;
        this.m = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        this.n = 6000;
        this.f10993k = i;
        this.l = i2;
        wpe.b("Vad2", "minVoice:" + i + ", minSil:" + i2);
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
        if (!this.o) {
            wpe.e("Vad2", "checkVad: mAvailable=" + this.o);
            return false;
        }
        int length = bArr.length;
        int i = this.e;
        int i2 = length + i;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(this.d, 0, bArr2, 0, i);
        System.arraycopy(bArr, 0, bArr2, this.e, length);
        this.e = i2 % GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH;
        int i3 = i2 / GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH;
        for (int i4 = 0; i4 < i3; i4++) {
            System.arraycopy(bArr2, i4 * GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH, this.d, 0, GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH);
            boolean zHasVoice = hasVoice(this.d, 0, GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH);
            this.g++;
            if (!this.f && zHasVoice) {
                wpe.b("Vad2", "detect vad start at pack:" + this.g);
                this.f = true;
            }
            if (this.f && !zHasVoice) {
                wpe.b("Vad2", "stop speak at pack:" + this.g);
                this.f = false;
                return true;
            }
            this.f = zHasVoice;
        }
        System.arraycopy(bArr2, i3 * GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH, this.d, 0, this.e);
        return false;
    }

    public void finalize() throws Throwable {
        release();
        super.finalize();
    }

    public int getEndDelay() {
        if (!this.o) {
            wpe.e("Vad2", "getEndDelay: mAvailable=false");
            return -1;
        }
        long j = this.f10991a;
        if (j == 0) {
            return -1;
        }
        long j2 = this.f10992b;
        if (j2 != 0) {
            return endDelay(j, j2);
        }
        return -1;
    }

    public int getStartDelay() {
        if (!this.o) {
            wpe.e("Vad2", "getStartDelay: mAvailable=false");
            return -1;
        }
        long j = this.f10991a;
        if (j == 0) {
            return -1;
        }
        long j2 = this.f10992b;
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
            if (!this.o) {
                wpe.e("Vad2", "hasVoice: mAvailable=" + this.o);
                return false;
            }
            DecodeResult decodeResultProcessTask = processTask(bArr, GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH);
            if (decodeResultProcessTask == null) {
                return false;
            }
            if (!decodeResultProcessTask.hasVoice) {
                return false;
            }
            if (this.h != decodeResultProcessTask.packNumBeg) {
                wpe.b("Vad2", "isSpeak:mPackNumBeg=" + (((double) decodeResultProcessTask.packNumBeg) * 0.01d));
                this.j = true;
            }
            if (decodeResultProcessTask.packNumEnd > this.i && this.j) {
                wpe.b("Vad2", "isSpeak:mPackNumEnd=" + (((double) decodeResultProcessTask.packNumEnd) * 0.01d));
                this.j = false;
            }
            this.h = decodeResultProcessTask.packNumBeg;
            this.i = decodeResultProcessTask.packNumEnd;
            return this.j;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.xiaomi.ai.android.vad.IVad
    public boolean init() {
        if (!p) {
            System.loadLibrary("vad2");
            p = true;
        }
        release();
        long jNewVad = newVad(this.f10993k, this.l, this.m, this.n);
        this.f10991a = jNewVad;
        this.f10992b = createTask(jNewVad);
        this.f = false;
        this.g = 0;
        this.h = -1;
        this.i = 1;
        this.e = 0;
        this.o = true;
        return true;
    }

    public synchronized boolean isSpeak(byte[] bArr, int i, int i2) {
        if (!this.o) {
            wpe.e("Vad2", "isSpeak: mAvailable=" + this.o);
            return false;
        }
        int i3 = this.e;
        int i4 = i2 + i3;
        byte[] bArr2 = new byte[i4];
        System.arraycopy(this.d, 0, bArr2, 0, i3);
        System.arraycopy(bArr, i, bArr2, this.e, i2);
        this.e = i4 % GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH;
        int i5 = i4 / GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH;
        boolean z = false;
        for (int i6 = 0; i6 < i5; i6++) {
            System.arraycopy(bArr2, i6 * GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH, this.d, 0, GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH);
            if (hasVoice(this.d, 0, GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH)) {
                z = true;
            }
        }
        System.arraycopy(bArr2, i5 * GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH, this.d, 0, this.e);
        return z;
    }

    public DecodeResult processTask(byte[] bArr, int i) {
        if (!this.o) {
            wpe.e("Vad2", "processTask: mAvailable=" + this.o);
            return null;
        }
        if (bArr != null && i != 0) {
            DecodeResult decodeResult = new DecodeResult();
            Arrays.fill(this.c, 0);
            if (hasVoice(this.f10991a, this.f10992b, bArr, i, this.c)) {
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
        try {
            stopTask();
            long j = this.f10991a;
            if (j != 0) {
                releaseVad(j);
                this.f = false;
                this.g = 0;
                this.h = -1;
                this.i = 1;
                this.f10991a = 0L;
                this.e = 0;
                wpe.b("Vad2", "releaseVad");
            }
            this.o = false;
            wpe.b("Vad2", "release");
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean reset() {
        Arrays.fill(this.c, 0);
        boolean zStopTask = stopTask(this.f10991a, this.f10992b, this.c);
        if (zStopTask) {
            this.f10992b = createTask(this.f10991a);
        }
        this.f = false;
        this.g = 0;
        this.h = -1;
        this.i = 1;
        this.e = 0;
        return zStopTask;
    }

    public DecodeResult stopTask() {
        wpe.b("Vad2", "stopTask");
        long j = this.f10991a;
        if (j != 0) {
            long j2 = this.f10992b;
            if (j2 != 0 && stopTask(j, j2, this.c)) {
                wpe.b("Vad2", "stopTask: get result");
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
                this.f10992b = 0L;
                return decodeResult;
            }
        }
        this.f10992b = 0L;
        return null;
    }

    public Vad2(int i, int i2, int i3, int i4) {
        this.c = new int[8];
        this.d = new byte[GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH];
        this.e = 0;
        this.g = 0;
        this.h = -1;
        this.i = 1;
        this.j = false;
        this.f10993k = i;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        wpe.b("Vad2", "minVoice:" + i + ", minSil:" + i2 + ", maxVoice:" + i3 + ", maxLengthReset:" + i4);
    }
}
