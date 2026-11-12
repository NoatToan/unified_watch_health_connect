package com.xiaomi.fitness.devicesettings.bluttooth.appsort;

import defpackage.jni;
import defpackage.jwo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0004R\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0007¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/appsort/AppSortWrapper;", "", "Ljwo;", "component1", "()Ljwo;", "", "component2", "()I", "data", "viewType", "copy", "(Ljwo;I)Lcom/xiaomi/fitness/devicesettings/bluttooth/appsort/AppSortWrapper;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljwo;", "getData", "I", "getViewType", "setViewType", "(I)V", "isAlwaysShown", "()Z", "getIconRes", "iconRes", "<init>", "(Ljwo;I)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final /* data */ class AppSortWrapper {

    @NotNull
    private final jwo data;
    private int viewType;

    public AppSortWrapper(@NotNull jwo data, int i) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.viewType = i;
    }

    public static /* synthetic */ AppSortWrapper copy$default(AppSortWrapper appSortWrapper, jwo jwoVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            jwoVar = appSortWrapper.data;
        }
        if ((i2 & 2) != 0) {
            i = appSortWrapper.viewType;
        }
        return appSortWrapper.copy(jwoVar, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final jwo getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getViewType() {
        return this.viewType;
    }

    @NotNull
    public final AppSortWrapper copy(@NotNull jwo data, int viewType) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new AppSortWrapper(data, viewType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppSortWrapper)) {
            return false;
        }
        AppSortWrapper appSortWrapper = (AppSortWrapper) other;
        return Intrinsics.areEqual(this.data, appSortWrapper.data) && this.viewType == appSortWrapper.viewType;
    }

    @NotNull
    public final jwo getData() {
        return this.data;
    }

    public final int getIconRes() {
        if (isAlwaysShown()) {
            return jni.d1;
        }
        return this.data.f ? jni.a1 : jni.c1;
    }

    public final int getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + Integer.hashCode(this.viewType);
    }

    public final boolean isAlwaysShown() {
        return this.data.e;
    }

    public final void setViewType(int i) {
        this.viewType = i;
    }

    @NotNull
    public String toString() {
        return "AppSortWrapper(data=" + this.data + ", viewType=" + this.viewType + ")";
    }
}
