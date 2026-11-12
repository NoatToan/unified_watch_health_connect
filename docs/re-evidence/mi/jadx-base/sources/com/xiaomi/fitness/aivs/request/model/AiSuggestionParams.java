package com.xiaomi.fitness.aivs.request.model;

import com.xiaomi.fitness.feedback.util.FeedbackConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/aivs/request/model/AiSuggestionParams;", "", "trace_id", "", "device", "Lcom/xiaomi/fitness/aivs/request/model/DeviceBean;", FeedbackConstants.KEY_APP_NAME, "app_version", "", "request_origin", "today_impressions", "<init>", "(Ljava/lang/String;Lcom/xiaomi/fitness/aivs/request/model/DeviceBean;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getTrace_id", "()Ljava/lang/String;", "getDevice", "()Lcom/xiaomi/fitness/aivs/request/model/DeviceBean;", "getApp_name", "getApp_version", "()I", "getRequest_origin", "getToday_impressions", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AiSuggestionParams {

    @NotNull
    private final String app_name;
    private final int app_version;

    @NotNull
    private final DeviceBean device;

    @NotNull
    private final String request_origin;

    @NotNull
    private final String today_impressions;

    @NotNull
    private final String trace_id;

    public AiSuggestionParams(@NotNull String trace_id, @NotNull DeviceBean device, @NotNull String app_name, int i, @NotNull String request_origin, @NotNull String today_impressions) {
        Intrinsics.checkNotNullParameter(trace_id, "trace_id");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(app_name, "app_name");
        Intrinsics.checkNotNullParameter(request_origin, "request_origin");
        Intrinsics.checkNotNullParameter(today_impressions, "today_impressions");
        this.trace_id = trace_id;
        this.device = device;
        this.app_name = app_name;
        this.app_version = i;
        this.request_origin = request_origin;
        this.today_impressions = today_impressions;
    }

    public static /* synthetic */ AiSuggestionParams copy$default(AiSuggestionParams aiSuggestionParams, String str, DeviceBean deviceBean, String str2, int i, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = aiSuggestionParams.trace_id;
        }
        if ((i2 & 2) != 0) {
            deviceBean = aiSuggestionParams.device;
        }
        DeviceBean deviceBean2 = deviceBean;
        if ((i2 & 4) != 0) {
            str2 = aiSuggestionParams.app_name;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            i = aiSuggestionParams.app_version;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str3 = aiSuggestionParams.request_origin;
        }
        String str6 = str3;
        if ((i2 & 32) != 0) {
            str4 = aiSuggestionParams.today_impressions;
        }
        return aiSuggestionParams.copy(str, deviceBean2, str5, i3, str6, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTrace_id() {
        return this.trace_id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DeviceBean getDevice() {
        return this.device;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getApp_name() {
        return this.app_name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getApp_version() {
        return this.app_version;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRequest_origin() {
        return this.request_origin;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getToday_impressions() {
        return this.today_impressions;
    }

    @NotNull
    public final AiSuggestionParams copy(@NotNull String trace_id, @NotNull DeviceBean device, @NotNull String app_name, int app_version, @NotNull String request_origin, @NotNull String today_impressions) {
        Intrinsics.checkNotNullParameter(trace_id, "trace_id");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(app_name, "app_name");
        Intrinsics.checkNotNullParameter(request_origin, "request_origin");
        Intrinsics.checkNotNullParameter(today_impressions, "today_impressions");
        return new AiSuggestionParams(trace_id, device, app_name, app_version, request_origin, today_impressions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiSuggestionParams)) {
            return false;
        }
        AiSuggestionParams aiSuggestionParams = (AiSuggestionParams) other;
        return Intrinsics.areEqual(this.trace_id, aiSuggestionParams.trace_id) && Intrinsics.areEqual(this.device, aiSuggestionParams.device) && Intrinsics.areEqual(this.app_name, aiSuggestionParams.app_name) && this.app_version == aiSuggestionParams.app_version && Intrinsics.areEqual(this.request_origin, aiSuggestionParams.request_origin) && Intrinsics.areEqual(this.today_impressions, aiSuggestionParams.today_impressions);
    }

    @NotNull
    public final String getApp_name() {
        return this.app_name;
    }

    public final int getApp_version() {
        return this.app_version;
    }

    @NotNull
    public final DeviceBean getDevice() {
        return this.device;
    }

    @NotNull
    public final String getRequest_origin() {
        return this.request_origin;
    }

    @NotNull
    public final String getToday_impressions() {
        return this.today_impressions;
    }

    @NotNull
    public final String getTrace_id() {
        return this.trace_id;
    }

    public int hashCode() {
        return (((((((((this.trace_id.hashCode() * 31) + this.device.hashCode()) * 31) + this.app_name.hashCode()) * 31) + Integer.hashCode(this.app_version)) * 31) + this.request_origin.hashCode()) * 31) + this.today_impressions.hashCode();
    }

    @NotNull
    public String toString() {
        return "AiSuggestionParams(trace_id=" + this.trace_id + ", device=" + this.device + ", app_name=" + this.app_name + ", app_version=" + this.app_version + ", request_origin=" + this.request_origin + ", today_impressions=" + this.today_impressions + ")";
    }
}
