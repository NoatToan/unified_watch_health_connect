package com.huawei.maps.offlinedata.consts;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.pluginfitnessadvice.FitWorkout;

/* JADX INFO: loaded from: classes12.dex */
public enum a {
    IS_SUPPORT_OFFLINE_MAP(1, 201),
    IS_SUPPORT_CONTOUR_MAP(2, 202),
    IS_SUPPORT_AUTO_DOWNLOAD_MAP(3, FitWorkout.CATEGORY_REAL_SCENE),
    IS_SUPPORT_SKI_MAP(4, TypedValues.AttributesType.TYPE_EASING);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17839b;

    a(int i, int i2) {
        this.f17838a = i;
        this.f17839b = i2;
    }

    public int b() {
        return this.f17839b;
    }
}
