package com.xiaomi.fitness.mine.personal.data.management.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/data/model/AppWrapper;", "", "app", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/App;", "authType", "", "<init>", "(Lcom/xiaomi/fitness/mine/personal/data/management/data/model/App;I)V", "getApp", "()Lcom/xiaomi/fitness/mine/personal/data/management/data/model/App;", "getAuthType", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AppWrapper {

    @NotNull
    private final App app;
    private final int authType;

    public AppWrapper(@NotNull App app, int i) {
        Intrinsics.checkNotNullParameter(app, "app");
        this.app = app;
        this.authType = i;
    }

    public static /* synthetic */ AppWrapper copy$default(AppWrapper appWrapper, App app, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            app = appWrapper.app;
        }
        if ((i2 & 2) != 0) {
            i = appWrapper.authType;
        }
        return appWrapper.copy(app, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final App getApp() {
        return this.app;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAuthType() {
        return this.authType;
    }

    @NotNull
    public final AppWrapper copy(@NotNull App app, int authType) {
        Intrinsics.checkNotNullParameter(app, "app");
        return new AppWrapper(app, authType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppWrapper)) {
            return false;
        }
        AppWrapper appWrapper = (AppWrapper) other;
        return Intrinsics.areEqual(this.app, appWrapper.app) && this.authType == appWrapper.authType;
    }

    @NotNull
    public final App getApp() {
        return this.app;
    }

    public final int getAuthType() {
        return this.authType;
    }

    public int hashCode() {
        return (this.app.hashCode() * 31) + Integer.hashCode(this.authType);
    }

    @NotNull
    public String toString() {
        return "AppWrapper(app=" + this.app + ", authType=" + this.authType + ")";
    }
}
