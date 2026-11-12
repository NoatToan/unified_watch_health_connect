package com.xiaomi.ai.mibrain;

/* JADX INFO: loaded from: classes18.dex */
public class MibrainVad {
    private static final int FIRSTPACK = 0;
    private static final int INTERMEIDATE_PACK = 1;
    private boolean mIsEnd;
    private boolean mIsSpeak;
    private int mPackCount;
    private long mVadInstance;

    static {
        Mibrainsdk.loadMibrainLibs();
    }

    private native long newVad();

    private native void releaseVad(long j);

    private native int vadCheckBegin(long j, byte[] bArr, int i, int i2);

    private native int vadCheckEnd(long j, byte[] bArr, int i, int i2);

    private native int vadInit(long j, float f, float f2, float f3);

    private native int vadUnInit(long j);

    public int init(int i, int i2, int i3, float f, float f2, float f3) {
        if (i != 16000 && i2 != 1 && i3 != 16) {
            return -1;
        }
        long jNewVad = newVad();
        this.mVadInstance = jNewVad;
        if (jNewVad == 0) {
            return -1;
        }
        if (vadInit(jNewVad, f, f2, f3) == 0) {
            return 0;
        }
        releaseVad(this.mVadInstance);
        this.mVadInstance = 0L;
        return -1;
    }

    public boolean isSpeak(byte[] bArr, int i) throws MibrainException {
        if (i < 8000 || i >= 16000) {
            throw new MibrainException("buffer must more than 8000bytes and less than 16000bytes");
        }
        if (bArr == null) {
            throw new MibrainException("buffer is null ");
        }
        if (!this.mIsEnd) {
            int i2 = this.mPackCount + 1;
            this.mPackCount = i2;
            if (!this.mIsSpeak) {
                if (vadCheckBegin(this.mVadInstance, bArr, i, i2 == 1 ? 0 : 1) >= 0) {
                    this.mIsSpeak = true;
                }
            } else if (vadCheckEnd(this.mVadInstance, bArr, i, 1) >= 0) {
                this.mIsSpeak = false;
                this.mIsEnd = true;
            }
        }
        return this.mIsSpeak;
    }

    public void release() {
        this.mIsEnd = true;
        long j = this.mVadInstance;
        if (j != 0) {
            vadUnInit(j);
        }
        long j2 = this.mVadInstance;
        if (j2 != 0) {
            releaseVad(j2);
            this.mVadInstance = 0L;
        }
    }
}
