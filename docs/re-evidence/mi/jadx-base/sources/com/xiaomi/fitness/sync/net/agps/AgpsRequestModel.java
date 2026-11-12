package com.xiaomi.fitness.sync.net.agps;

import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/sync/net/agps/AgpsRequestModel;", "", "source", "", "days", "", "gps_type", "model", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getSource", "()Ljava/lang/String;", "setSource", "(Ljava/lang/String;)V", "getDays", "()I", "setDays", "(I)V", "getGps_type", "setGps_type", "getModel", "setModel", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AgpsRequestModel {
    private int days;
    private int gps_type;

    @NotNull
    private String model;

    @NotNull
    private String source;

    public AgpsRequestModel(@NotNull String source, int i, int i2, @NotNull String model) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(model, "model");
        this.source = source;
        this.days = i;
        this.gps_type = i2;
        this.model = model;
    }

    public static /* synthetic */ AgpsRequestModel copy$default(AgpsRequestModel agpsRequestModel, String str, int i, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = agpsRequestModel.source;
        }
        if ((i3 & 2) != 0) {
            i = agpsRequestModel.days;
        }
        if ((i3 & 4) != 0) {
            i2 = agpsRequestModel.gps_type;
        }
        if ((i3 & 8) != 0) {
            str2 = agpsRequestModel.model;
        }
        return agpsRequestModel.copy(str, i, i2, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDays() {
        return this.days;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getGps_type() {
        return this.gps_type;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final AgpsRequestModel copy(@NotNull String source, int days, int gps_type, @NotNull String model) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(model, "model");
        return new AgpsRequestModel(source, days, gps_type, model);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgpsRequestModel)) {
            return false;
        }
        AgpsRequestModel agpsRequestModel = (AgpsRequestModel) other;
        return Intrinsics.areEqual(this.source, agpsRequestModel.source) && this.days == agpsRequestModel.days && this.gps_type == agpsRequestModel.gps_type && Intrinsics.areEqual(this.model, agpsRequestModel.model);
    }

    public final int getDays() {
        return this.days;
    }

    public final int getGps_type() {
        return this.gps_type;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return (((((this.source.hashCode() * 31) + Integer.hashCode(this.days)) * 31) + Integer.hashCode(this.gps_type)) * 31) + this.model.hashCode();
    }

    public final void setDays(int i) {
        this.days = i;
    }

    public final void setGps_type(int i) {
        this.gps_type = i;
    }

    public final void setModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.model = str;
    }

    public final void setSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.source = str;
    }

    @NotNull
    public String toString() {
        return "AgpsRequestModel(source=" + this.source + ", days=" + this.days + ", gps_type=" + this.gps_type + ", model=" + this.model + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AgpsRequestModel(String str, int i, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        WearableDeviceModel wearableDeviceModel;
        if ((i3 & 8) != 0 && ((wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel()) == null || (str2 = DeviceModelExtKt.getModel(wearableDeviceModel)) == null)) {
            str2 = "";
        }
        this(str, i, i2, str2);
    }
}
