package com.xiaomi.fitness.access.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/access/bean/DeviceModelsInfo;", "", "did", "", "name", "icon", "bindStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDid", "()Ljava/lang/String;", "setDid", "(Ljava/lang/String;)V", "getName", "setName", "getIcon", "setIcon", "getBindStatus", "setBindStatus", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceModelsInfo {

    @NotNull
    private String bindStatus;

    @NotNull
    private String did;

    @Nullable
    private String icon;

    @NotNull
    private String name;

    public DeviceModelsInfo(@NotNull String did, @NotNull String name, @Nullable String str, @NotNull String bindStatus) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bindStatus, "bindStatus");
        this.did = did;
        this.name = name;
        this.icon = str;
        this.bindStatus = bindStatus;
    }

    public static /* synthetic */ DeviceModelsInfo copy$default(DeviceModelsInfo deviceModelsInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceModelsInfo.did;
        }
        if ((i & 2) != 0) {
            str2 = deviceModelsInfo.name;
        }
        if ((i & 4) != 0) {
            str3 = deviceModelsInfo.icon;
        }
        if ((i & 8) != 0) {
            str4 = deviceModelsInfo.bindStatus;
        }
        return deviceModelsInfo.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBindStatus() {
        return this.bindStatus;
    }

    @NotNull
    public final DeviceModelsInfo copy(@NotNull String did, @NotNull String name, @Nullable String icon, @NotNull String bindStatus) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bindStatus, "bindStatus");
        return new DeviceModelsInfo(did, name, icon, bindStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceModelsInfo)) {
            return false;
        }
        DeviceModelsInfo deviceModelsInfo = (DeviceModelsInfo) other;
        return Intrinsics.areEqual(this.did, deviceModelsInfo.did) && Intrinsics.areEqual(this.name, deviceModelsInfo.name) && Intrinsics.areEqual(this.icon, deviceModelsInfo.icon) && Intrinsics.areEqual(this.bindStatus, deviceModelsInfo.bindStatus);
    }

    @NotNull
    public final String getBindStatus() {
        return this.bindStatus;
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = ((this.did.hashCode() * 31) + this.name.hashCode()) * 31;
        String str = this.icon;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.bindStatus.hashCode();
    }

    public final void setBindStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bindStatus = str;
    }

    public final void setDid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.did = str;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    @NotNull
    public String toString() {
        return "DeviceModelsInfo(did=" + this.did + ", name=" + this.name + ", icon=" + this.icon + ", bindStatus=" + this.bindStatus + ")";
    }
}
