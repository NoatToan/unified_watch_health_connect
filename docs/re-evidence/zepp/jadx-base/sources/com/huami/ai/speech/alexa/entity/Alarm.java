package com.huami.ai.speech.alexa.entity;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b/\u00100J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J[\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00022\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\r\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u001c\u0010\u0011\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u001eR\u001c\u0010\u0012\u001a\u00020\n8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0013\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u001c\u001a\u0004\b.\u0010\u001e¨\u00061"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/Alarm;", "", "", "component1", "", "Lcom/huami/ai/speech/alexa/entity/Asset;", "component2", "component3", "component4", "component5", "Lcom/huami/ai/speech/alexa/entity/Trigger;", "component6", "component7", "alarmToken", "assets", "createdTime", "endpointIds", "status", "trigger", "updatedTime", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getAlarmToken", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getAssets", "()Ljava/util/List;", "c", "getCreatedTime", GoogleApiAvailabilityLight.a, "getEndpointIds", "e", "getStatus", "f", "Lcom/huami/ai/speech/alexa/entity/Trigger;", "getTrigger", "()Lcom/huami/ai/speech/alexa/entity/Trigger;", "g", "getUpdatedTime", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/huami/ai/speech/alexa/entity/Trigger;Ljava/lang/String;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Alarm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("alarmToken")
    @NotNull
    private final String alarmToken;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("assets")
    @NotNull
    private final List<Asset> assets;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("createdTime")
    @NotNull
    private final String createdTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("endpointIds")
    @NotNull
    private final List<String> endpointIds;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("trigger")
    @NotNull
    private final Trigger trigger;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("updatedTime")
    @NotNull
    private final String updatedTime;

    public Alarm(@NotNull String str, @NotNull List<Asset> list, @NotNull String str2, @NotNull List<String> list2, @NotNull String str3, @NotNull Trigger trigger, @NotNull String str4) {
        this.alarmToken = str;
        this.assets = list;
        this.createdTime = str2;
        this.endpointIds = list2;
        this.status = str3;
        this.trigger = trigger;
        this.updatedTime = str4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Alarm copy$default(Alarm alarm, String str, List list, String str2, List list2, String str3, Trigger trigger, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alarm.alarmToken;
        }
        if ((i & 2) != 0) {
            list = alarm.assets;
        }
        List list3 = list;
        if ((i & 4) != 0) {
            str2 = alarm.createdTime;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            list2 = alarm.endpointIds;
        }
        List list4 = list2;
        if ((i & 16) != 0) {
            str3 = alarm.status;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            trigger = alarm.trigger;
        }
        Trigger trigger2 = trigger;
        if ((i & 64) != 0) {
            str4 = alarm.updatedTime;
        }
        return alarm.copy(str, list3, str5, list4, str6, trigger2, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAlarmToken() {
        return this.alarmToken;
    }

    @NotNull
    public final List<Asset> component2() {
        return this.assets;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCreatedTime() {
        return this.createdTime;
    }

    @NotNull
    public final List<String> component4() {
        return this.endpointIds;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Trigger getTrigger() {
        return this.trigger;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUpdatedTime() {
        return this.updatedTime;
    }

    @NotNull
    public final Alarm copy(@NotNull String alarmToken, @NotNull List<Asset> assets, @NotNull String createdTime, @NotNull List<String> endpointIds, @NotNull String status, @NotNull Trigger trigger, @NotNull String updatedTime) {
        return new Alarm(alarmToken, assets, createdTime, endpointIds, status, trigger, updatedTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Alarm)) {
            return false;
        }
        Alarm alarm = (Alarm) other;
        return Intrinsics.areEqual(this.alarmToken, alarm.alarmToken) && Intrinsics.areEqual(this.assets, alarm.assets) && Intrinsics.areEqual(this.createdTime, alarm.createdTime) && Intrinsics.areEqual(this.endpointIds, alarm.endpointIds) && Intrinsics.areEqual(this.status, alarm.status) && Intrinsics.areEqual(this.trigger, alarm.trigger) && Intrinsics.areEqual(this.updatedTime, alarm.updatedTime);
    }

    @NotNull
    public final String getAlarmToken() {
        return this.alarmToken;
    }

    @NotNull
    public final List<Asset> getAssets() {
        return this.assets;
    }

    @NotNull
    public final String getCreatedTime() {
        return this.createdTime;
    }

    @NotNull
    public final List<String> getEndpointIds() {
        return this.endpointIds;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final Trigger getTrigger() {
        return this.trigger;
    }

    @NotNull
    public final String getUpdatedTime() {
        return this.updatedTime;
    }

    public int hashCode() {
        return (((((((((((this.alarmToken.hashCode() * 31) + this.assets.hashCode()) * 31) + this.createdTime.hashCode()) * 31) + this.endpointIds.hashCode()) * 31) + this.status.hashCode()) * 31) + this.trigger.hashCode()) * 31) + this.updatedTime.hashCode();
    }

    @NotNull
    public String toString() {
        return "Alarm(alarmToken=" + this.alarmToken + ", assets=" + this.assets + ", createdTime=" + this.createdTime + ", endpointIds=" + this.endpointIds + ", status=" + this.status + ", trigger=" + this.trigger + ", updatedTime=" + this.updatedTime + ')';
    }
}
