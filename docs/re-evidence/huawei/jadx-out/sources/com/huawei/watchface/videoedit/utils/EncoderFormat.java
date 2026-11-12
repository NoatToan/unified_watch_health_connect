package com.huawei.watchface.videoedit.utils;

import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes20.dex */
public class EncoderFormat {
    private static final int BITRATE = 2000000;
    private static final int FRAMERATE = 30;
    private static final int HEIRHT = 720;
    private static final int WIDTH = 1080;
    private int mBitRate = BITRATE;
    private int mFrameRate = 30;
    private int mFrameInterval = 1;
    private int mWidth = 1080;
    private int mHeight = 720;

    public static long getMaxDurationForSize(int i) {
        long j;
        if (i <= 270) {
            j = 120;
        } else if (i <= 540) {
            j = 90;
        } else if (i <= 900) {
            j = 45;
        } else if (i <= 1200) {
            j = 30;
        } else if (i <= 1500) {
            j = 15;
        } else {
            j = i <= 1800 ? 12L : 10L;
        }
        HwLog.d(HwLog.TAG, "shortSize = " + i + " minutes = " + j);
        return j;
    }

    public static int getVideoEncBitrate(int i, int i2) {
        int iMin = Math.min(i, i2);
        if (iMin <= 270) {
            return 1000000;
        }
        if (iMin <= 540) {
            return 1200000;
        }
        return BITRATE;
    }

    public int getmBitRate() {
        return this.mBitRate;
    }

    public int getmFrameInterval() {
        return this.mFrameInterval;
    }

    public int getmFrameRate() {
        return this.mFrameRate;
    }

    public int getmHeight() {
        return this.mHeight;
    }

    public int getmWidth() {
        return this.mWidth;
    }

    public void setmBitRate(int i) {
        this.mBitRate = i;
    }

    public void setmFrameInterval(int i) {
        this.mFrameInterval = i;
    }

    public void setmFrameRate(int i) {
        this.mFrameRate = i;
    }

    public void setmHeight(int i) {
        this.mHeight = i;
    }

    public void setmWidth(int i) {
        this.mWidth = i;
    }
}
