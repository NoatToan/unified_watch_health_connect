package com.xiaomi.fitness.devicesettings.bluttooth.falldetection;

import com.miui.circulate.device.api.Column;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionReportPositionRequest;", "", "report_id", "", "longitude", "latitude", Column.BATTERY, "signal", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getReport_id", "()Ljava/lang/String;", "getLongitude", "getLatitude", "getBattery", "getSignal", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FallDetectionReportPositionRequest {

    @NotNull
    private final String battery;

    @NotNull
    private final String latitude;

    @NotNull
    private final String longitude;

    @NotNull
    private final String report_id;

    @NotNull
    private final String signal;

    public FallDetectionReportPositionRequest(@NotNull String report_id, @NotNull String longitude, @NotNull String latitude, @NotNull String battery, @NotNull String signal) {
        Intrinsics.checkNotNullParameter(report_id, "report_id");
        Intrinsics.checkNotNullParameter(longitude, "longitude");
        Intrinsics.checkNotNullParameter(latitude, "latitude");
        Intrinsics.checkNotNullParameter(battery, "battery");
        Intrinsics.checkNotNullParameter(signal, "signal");
        this.report_id = report_id;
        this.longitude = longitude;
        this.latitude = latitude;
        this.battery = battery;
        this.signal = signal;
    }

    public static /* synthetic */ FallDetectionReportPositionRequest copy$default(FallDetectionReportPositionRequest fallDetectionReportPositionRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fallDetectionReportPositionRequest.report_id;
        }
        if ((i & 2) != 0) {
            str2 = fallDetectionReportPositionRequest.longitude;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = fallDetectionReportPositionRequest.latitude;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = fallDetectionReportPositionRequest.battery;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = fallDetectionReportPositionRequest.signal;
        }
        return fallDetectionReportPositionRequest.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getReport_id() {
        return this.report_id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLongitude() {
        return this.longitude;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLatitude() {
        return this.latitude;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBattery() {
        return this.battery;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSignal() {
        return this.signal;
    }

    @NotNull
    public final FallDetectionReportPositionRequest copy(@NotNull String report_id, @NotNull String longitude, @NotNull String latitude, @NotNull String battery, @NotNull String signal) {
        Intrinsics.checkNotNullParameter(report_id, "report_id");
        Intrinsics.checkNotNullParameter(longitude, "longitude");
        Intrinsics.checkNotNullParameter(latitude, "latitude");
        Intrinsics.checkNotNullParameter(battery, "battery");
        Intrinsics.checkNotNullParameter(signal, "signal");
        return new FallDetectionReportPositionRequest(report_id, longitude, latitude, battery, signal);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FallDetectionReportPositionRequest)) {
            return false;
        }
        FallDetectionReportPositionRequest fallDetectionReportPositionRequest = (FallDetectionReportPositionRequest) other;
        return Intrinsics.areEqual(this.report_id, fallDetectionReportPositionRequest.report_id) && Intrinsics.areEqual(this.longitude, fallDetectionReportPositionRequest.longitude) && Intrinsics.areEqual(this.latitude, fallDetectionReportPositionRequest.latitude) && Intrinsics.areEqual(this.battery, fallDetectionReportPositionRequest.battery) && Intrinsics.areEqual(this.signal, fallDetectionReportPositionRequest.signal);
    }

    @NotNull
    public final String getBattery() {
        return this.battery;
    }

    @NotNull
    public final String getLatitude() {
        return this.latitude;
    }

    @NotNull
    public final String getLongitude() {
        return this.longitude;
    }

    @NotNull
    public final String getReport_id() {
        return this.report_id;
    }

    @NotNull
    public final String getSignal() {
        return this.signal;
    }

    public int hashCode() {
        return (((((((this.report_id.hashCode() * 31) + this.longitude.hashCode()) * 31) + this.latitude.hashCode()) * 31) + this.battery.hashCode()) * 31) + this.signal.hashCode();
    }

    @NotNull
    public String toString() {
        return "FallDetectionReportPositionRequest(report_id=" + this.report_id + ", longitude=" + this.longitude + ", latitude=" + this.latitude + ", battery=" + this.battery + ", signal=" + this.signal + ")";
    }
}
