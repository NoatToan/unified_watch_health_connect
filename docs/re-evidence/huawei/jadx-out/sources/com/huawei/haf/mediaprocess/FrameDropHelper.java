package com.huawei.haf.mediaprocess;

import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class FrameDropHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f5995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f5997c;
    private int d;
    private int e;

    public FrameDropHelper(int i, int i2) {
        this.f5995a = true;
        this.f5996b = i;
        this.e = i2;
        if (i <= i2) {
            LogUtil.d("FrameDropHelper", "srcFrameRate:", Integer.valueOf(i), " dstFrameRate:", Integer.valueOf(i2), "，not support frame interpolation");
            this.f5995a = false;
        }
    }

    public boolean d(int i) {
        boolean z = false;
        if (!this.f5995a) {
            return false;
        }
        if (i == 0) {
            this.d++;
            return false;
        }
        int i2 = this.f5996b;
        float f = (i2 - this.e) / i2;
        int i3 = this.f5997c;
        int i4 = this.d + i3;
        if (i4 != 0) {
            float f2 = i4;
            z = Math.abs((((float) (i3 + 1)) / f2) - f) < Math.abs((((float) i3) / ((float) (i4 + 1))) - f);
            if (z) {
                this.f5997c++;
            } else {
                this.d++;
            }
            LogUtil.b("FrameDropHelper", "current frame drop rate:", Float.valueOf(this.f5997c / f2), " target frame drop rate:", Float.valueOf(f));
        }
        return z;
    }
}
