package com.xiaomi.hm.health.model.summery;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/model/summery/SelectDateData;", "", "", "toString", "a", "Ljava/lang/String;", "getDate", "()Ljava/lang/String;", "date", "", "b", "Z", "isEarbud", "()Z", "setEarbud", "(Z)V", "c", "isMutiSource", "setMutiSource", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getMainDataSource", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "setMainDataSource", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;)V", "mainDataSource", "<init>", "(Ljava/lang/String;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SelectDateData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String date;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isMutiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isEarbud = true;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private HMDeviceSource mainDataSource = HMDeviceSource.MILI;

    public SelectDateData(@NotNull String str) {
        this.date = str;
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final HMDeviceSource getMainDataSource() {
        return this.mainDataSource;
    }

    /* JADX INFO: renamed from: isEarbud, reason: from getter */
    public final boolean getIsEarbud() {
        return this.isEarbud;
    }

    /* JADX INFO: renamed from: isMutiSource, reason: from getter */
    public final boolean getIsMutiSource() {
        return this.isMutiSource;
    }

    public final void setEarbud(boolean z) {
        this.isEarbud = z;
    }

    public final void setMainDataSource(@NotNull HMDeviceSource hMDeviceSource) {
        this.mainDataSource = hMDeviceSource;
    }

    public final void setMutiSource(boolean z) {
        this.isMutiSource = z;
    }

    @NotNull
    public String toString() {
        return "date=" + this.date + "\nisEarbud=" + this.isEarbud + "\nisMutiSource=" + this.isMutiSource + "\nmainDataSource=" + this.mainDataSource;
    }
}
