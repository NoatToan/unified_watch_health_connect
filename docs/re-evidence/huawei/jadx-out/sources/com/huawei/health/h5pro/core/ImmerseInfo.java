package com.huawei.health.h5pro.core;

/* JADX INFO: loaded from: classes7.dex */
public class ImmerseInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f6777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f6778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6779c;
    private boolean d;
    private boolean e;

    public ImmerseInfo(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.d = z;
        this.e = z2;
        this.f6777a = z3;
        this.f6778b = z4;
        this.f6779c = z5;
    }

    public boolean isHideBottomVirtualKeys() {
        return this.f6779c;
    }

    public boolean isImmerse() {
        return this.d;
    }

    public boolean isShowStatusBar() {
        return this.e;
    }

    public boolean isStartAtBottomOfStatusBar() {
        return this.f6778b;
    }

    public boolean isStatusBarTextBlack() {
        return this.f6777a;
    }
}
