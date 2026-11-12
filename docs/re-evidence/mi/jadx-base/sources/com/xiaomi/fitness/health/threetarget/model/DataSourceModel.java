package com.xiaomi.fitness.health.threetarget.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/model/DataSourceModel;", "", "currentDevice", "", "sourceName", "", "sourceIconUrl", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "getCurrentDevice", "()Z", "setCurrentDevice", "(Z)V", "getSourceName", "()Ljava/lang/String;", "setSourceName", "(Ljava/lang/String;)V", "getSourceIconUrl", "setSourceIconUrl", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DataSourceModel {
    private boolean currentDevice;

    @Nullable
    private String sourceIconUrl;

    @Nullable
    private String sourceName;

    public DataSourceModel() {
        this(false, null, null, 7, null);
    }

    public static /* synthetic */ DataSourceModel copy$default(DataSourceModel dataSourceModel, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dataSourceModel.currentDevice;
        }
        if ((i & 2) != 0) {
            str = dataSourceModel.sourceName;
        }
        if ((i & 4) != 0) {
            str2 = dataSourceModel.sourceIconUrl;
        }
        return dataSourceModel.copy(z, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getCurrentDevice() {
        return this.currentDevice;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSourceName() {
        return this.sourceName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSourceIconUrl() {
        return this.sourceIconUrl;
    }

    @NotNull
    public final DataSourceModel copy(boolean currentDevice, @Nullable String sourceName, @Nullable String sourceIconUrl) {
        return new DataSourceModel(currentDevice, sourceName, sourceIconUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataSourceModel)) {
            return false;
        }
        DataSourceModel dataSourceModel = (DataSourceModel) other;
        return this.currentDevice == dataSourceModel.currentDevice && Intrinsics.areEqual(this.sourceName, dataSourceModel.sourceName) && Intrinsics.areEqual(this.sourceIconUrl, dataSourceModel.sourceIconUrl);
    }

    public final boolean getCurrentDevice() {
        return this.currentDevice;
    }

    @Nullable
    public final String getSourceIconUrl() {
        return this.sourceIconUrl;
    }

    @Nullable
    public final String getSourceName() {
        return this.sourceName;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.currentDevice) * 31;
        String str = this.sourceName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sourceIconUrl;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setCurrentDevice(boolean z) {
        this.currentDevice = z;
    }

    public final void setSourceIconUrl(@Nullable String str) {
        this.sourceIconUrl = str;
    }

    public final void setSourceName(@Nullable String str) {
        this.sourceName = str;
    }

    @NotNull
    public String toString() {
        return "DataSourceModel(currentDevice=" + this.currentDevice + ", sourceName=" + this.sourceName + ", sourceIconUrl=" + this.sourceIconUrl + ")";
    }

    public DataSourceModel(boolean z, @Nullable String str, @Nullable String str2) {
        this.currentDevice = z;
        this.sourceName = str;
        this.sourceIconUrl = str2;
    }

    public /* synthetic */ DataSourceModel(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2);
    }
}
