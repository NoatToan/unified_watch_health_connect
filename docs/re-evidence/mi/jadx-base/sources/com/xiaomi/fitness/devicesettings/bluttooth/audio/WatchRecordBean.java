package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import defpackage.wkf;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0004\"\u0004\b\u0017\u0010\u0018R\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0019\u001a\u0004\b\t\u0010\u0007\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/WatchRecordBean;", "", "Lwkf;", "component1", "()Lwkf;", "", "component2", "()Z", "file", "isPull", "copy", "(Lwkf;Z)Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/WatchRecordBean;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lwkf;", "getFile", "setFile", "(Lwkf;)V", "Z", "setPull", "(Z)V", "<init>", "(Lwkf;Z)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final /* data */ class WatchRecordBean {

    @NotNull
    private wkf file;
    private boolean isPull;

    public WatchRecordBean(@NotNull wkf file, boolean z) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.file = file;
        this.isPull = z;
    }

    public static /* synthetic */ WatchRecordBean copy$default(WatchRecordBean watchRecordBean, wkf wkfVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            wkfVar = watchRecordBean.file;
        }
        if ((i & 2) != 0) {
            z = watchRecordBean.isPull;
        }
        return watchRecordBean.copy(wkfVar, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final wkf getFile() {
        return this.file;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsPull() {
        return this.isPull;
    }

    @NotNull
    public final WatchRecordBean copy(@NotNull wkf file, boolean isPull) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new WatchRecordBean(file, isPull);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WatchRecordBean)) {
            return false;
        }
        WatchRecordBean watchRecordBean = (WatchRecordBean) other;
        return Intrinsics.areEqual(this.file, watchRecordBean.file) && this.isPull == watchRecordBean.isPull;
    }

    @NotNull
    public final wkf getFile() {
        return this.file;
    }

    public int hashCode() {
        return (this.file.hashCode() * 31) + Boolean.hashCode(this.isPull);
    }

    public final boolean isPull() {
        return this.isPull;
    }

    public final void setFile(@NotNull wkf wkfVar) {
        Intrinsics.checkNotNullParameter(wkfVar, "<set-?>");
        this.file = wkfVar;
    }

    public final void setPull(boolean z) {
        this.isPull = z;
    }

    @NotNull
    public String toString() {
        return "WatchRecordBean(file=" + this.file + ", isPull=" + this.isPull + ")";
    }

    public /* synthetic */ WatchRecordBean(wkf wkfVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wkfVar, (i & 2) != 0 ? false : z);
    }
}
