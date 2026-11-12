package com.xiaomi.fitness.aivs.request.model;

import com.xiaomi.onetrack.b.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/aivs/request/model/DeviceBean;", "", g.d, "", "device_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getApp_id", "()Ljava/lang/String;", "getDevice_id", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceBean {

    @NotNull
    private final String app_id;

    @NotNull
    private final String device_id;

    public DeviceBean(@NotNull String app_id, @NotNull String device_id) {
        Intrinsics.checkNotNullParameter(app_id, "app_id");
        Intrinsics.checkNotNullParameter(device_id, "device_id");
        this.app_id = app_id;
        this.device_id = device_id;
    }

    public static /* synthetic */ DeviceBean copy$default(DeviceBean deviceBean, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceBean.app_id;
        }
        if ((i & 2) != 0) {
            str2 = deviceBean.device_id;
        }
        return deviceBean.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApp_id() {
        return this.app_id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDevice_id() {
        return this.device_id;
    }

    @NotNull
    public final DeviceBean copy(@NotNull String app_id, @NotNull String device_id) {
        Intrinsics.checkNotNullParameter(app_id, "app_id");
        Intrinsics.checkNotNullParameter(device_id, "device_id");
        return new DeviceBean(app_id, device_id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceBean)) {
            return false;
        }
        DeviceBean deviceBean = (DeviceBean) other;
        return Intrinsics.areEqual(this.app_id, deviceBean.app_id) && Intrinsics.areEqual(this.device_id, deviceBean.device_id);
    }

    @NotNull
    public final String getApp_id() {
        return this.app_id;
    }

    @NotNull
    public final String getDevice_id() {
        return this.device_id;
    }

    public int hashCode() {
        return (this.app_id.hashCode() * 31) + this.device_id.hashCode();
    }

    @NotNull
    public String toString() {
        return "DeviceBean(app_id=" + this.app_id + ", device_id=" + this.device_id + ")";
    }
}
