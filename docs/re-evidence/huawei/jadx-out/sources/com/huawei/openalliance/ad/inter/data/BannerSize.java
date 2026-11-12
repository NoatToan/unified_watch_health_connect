package com.huawei.openalliance.ad.inter.data;

import com.huawei.openalliance.ad.constant.ErrorCode;

/* JADX INFO: loaded from: classes41.dex */
public final class BannerSize {
    public static final String BANNER_STR = "BANNER";
    public static final String LARGE_BANNER_STR = "LARGE_BANNER";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f19174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19175b;
    public static final BannerSize BANNER = new BannerSize(1080, 170);
    public static final BannerSize LARGE_BANNER = new BannerSize(1080, ErrorCode.ERROR_CODE_NO_PACKAGE);

    public int b() {
        return this.f19175b;
    }

    public int a() {
        return this.f19174a;
    }

    private BannerSize(int i, int i2) {
        this.f19174a = i;
        this.f19175b = i2;
    }
}
