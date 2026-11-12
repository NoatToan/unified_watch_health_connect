package com.huami.watch.dataflow.model.health.process;

import android.content.Context;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.heartrate.reserve.HRReserveHelper;
import com.huami.watch.companion.heartrate.reserve.bean.HeartRateReserveInfo;

/* JADX INFO: loaded from: classes16.dex */
public class HeartRateIntervalDefine {
    public final int ERROR_CODE;
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private int i;
    private int[] f = null;
    private int[] g = null;
    private int h = 0;
    private boolean j = false;

    public enum HeartRateMode {
        ANAEROBIC_LIMIT,
        POWER_STRENGTH,
        ENHANCEMENT,
        BURNING_FAT,
        WARM_UP,
        NONE_SPORT,
        SLEEP
    }

    public HeartRateIntervalDefine(Context context, int i) {
        i = (i > 100 || i < 5) ? 27 : i;
        HeartRateReserveInfo info = DeviceUtil.isRomSupportHRR(context.getApplicationContext()) ? HRReserveHelper.getInstance(context).getInfo() : null;
        if (info == null || info.getHeartRateType() != 0) {
            double d = 220 - i;
            this.b = (float) (0.9d * d);
            this.c = (float) (0.8d * d);
            this.d = (float) (0.7d * d);
            this.e = (float) (0.6d * d);
            this.a = (float) (d * 0.5d);
        } else {
            int[] section = info.getSection();
            this.b = section[4];
            this.c = section[3];
            this.d = section[2];
            this.e = section[1];
            this.a = section[0];
        }
        int length = HeartRateMode.values().length;
        this.i = length;
        this.ERROR_CODE = length;
    }

    public void endCount() {
        if (!this.j || this.f == null || this.h < 1) {
            return;
        }
        int iOrdinal = HeartRateMode.SLEEP.ordinal();
        int[] iArr = this.g;
        iArr[iOrdinal] = (this.f[iOrdinal] * 100) / this.h;
        int i = iArr[iOrdinal] + 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.i && i4 != iOrdinal; i4++) {
            int[] iArr2 = this.f;
            int i5 = iArr2[i4];
            int[] iArr3 = this.g;
            iArr3[i4] = (iArr2[i4] * 100) / this.h;
            if (i5 != 0) {
                i3 = 100 - i;
                i2 = i4;
            }
            i += iArr3[i4];
        }
        this.g[i2] = i3;
    }

    public int[] getHeartRateInterval() {
        return this.f;
    }

    public int[] getHeartRateIntervalPercent() {
        return this.g;
    }

    public HeartRateMode getHeartRateMode(int i, boolean z) {
        HeartRateMode heartRateMode;
        if (z) {
            heartRateMode = HeartRateMode.SLEEP;
        } else {
            float f = i;
            if (f >= this.b) {
                heartRateMode = HeartRateMode.ANAEROBIC_LIMIT;
            } else if (f >= this.c) {
                heartRateMode = HeartRateMode.POWER_STRENGTH;
            } else if (f >= this.d) {
                heartRateMode = HeartRateMode.ENHANCEMENT;
            } else if (f >= this.e) {
                heartRateMode = HeartRateMode.BURNING_FAT;
            } else {
                heartRateMode = f >= this.a ? HeartRateMode.WARM_UP : HeartRateMode.NONE_SPORT;
            }
        }
        if (this.j) {
            int[] iArr = this.f;
            int iOrdinal = heartRateMode.ordinal();
            iArr[iOrdinal] = iArr[iOrdinal] + 1;
            this.h++;
        }
        return heartRateMode;
    }

    public void prepareCount() {
        int i = this.i;
        this.f = new int[i];
        this.g = new int[i];
        this.h = 0;
        this.j = true;
    }
}
