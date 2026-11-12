package com.huawei.haf.mediaprocess;

import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class VideoProgress {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f6010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Float f6011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private VideoProgressListener f6012c;
    private int d;
    private float e;
    private int h;

    public void e(long j) {
        if (this.f6012c == null) {
            return;
        }
        Float f = this.f6011b;
        if (f != null) {
            j = (long) (j * f.floatValue());
        }
        int i = this.d - this.h;
        if (i != 0) {
            float f2 = (j / 1000.0f) / i;
            this.f6010a = f2;
            float fMax = Math.max(f2, 0.0f);
            this.f6010a = fMax;
            float fMin = Math.min(fMax, 1.0f);
            this.f6010a = fMin;
            this.f6012c.onProgress((fMin + this.e) / 2.0f);
            LogUtil.b("VideoProgress", "mEncodeProgress:", Float.valueOf(this.f6010a));
        }
    }

    public void b(float f) {
        this.e = f;
        VideoProgressListener videoProgressListener = this.f6012c;
        if (videoProgressListener != null) {
            videoProgressListener.onProgress((this.f6010a + f) / 2.0f);
        }
        LogUtil.b("VideoProgress", "mAudioProgress:", Float.valueOf(this.e));
    }
}
