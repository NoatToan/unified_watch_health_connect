package com.xiaomi.fitness.common.utils;

import defpackage.ni4;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"isHasLocationPermission", "", "common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FusionLocationRequestKt {
    public static final boolean isHasLocationPermission() {
        return ni4.a(AppUtil.getApp(), "android.permission.ACCESS_FINE_LOCATION") == 0 && ni4.a(AppUtil.getApp(), "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }
}
