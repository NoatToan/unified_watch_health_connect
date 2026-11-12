package com.huami.ai.speech.alexa.entity.payload;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J)\u0010\b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/AlertsStatePayload;", "Lcom/huami/ai/speech/alexa/entity/payload/Payload;", "", "Lcom/huami/ai/speech/alexa/entity/payload/Alert;", "component1", "component2", "allAlerts", "activeAlerts", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/util/List;", "getAllAlerts", "()Ljava/util/List;", "b", "getActiveAlerts", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AlertsStatePayload implements Payload {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("allAlerts")
    @NotNull
    private final List<Alert> allAlerts;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("activeAlerts")
    @NotNull
    private final List<Alert> activeAlerts;

    /* JADX WARN: Multi-variable type inference failed */
    public AlertsStatePayload() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public AlertsStatePayload(@NotNull List<Alert> list, @NotNull List<Alert> list2) {
        this.allAlerts = list;
        this.activeAlerts = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AlertsStatePayload copy$default(AlertsStatePayload alertsStatePayload, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = alertsStatePayload.allAlerts;
        }
        if ((i & 2) != 0) {
            list2 = alertsStatePayload.activeAlerts;
        }
        return alertsStatePayload.copy(list, list2);
    }

    @NotNull
    public final List<Alert> component1() {
        return this.allAlerts;
    }

    @NotNull
    public final List<Alert> component2() {
        return this.activeAlerts;
    }

    @NotNull
    public final AlertsStatePayload copy(@NotNull List<Alert> allAlerts, @NotNull List<Alert> activeAlerts) {
        return new AlertsStatePayload(allAlerts, activeAlerts);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertsStatePayload)) {
            return false;
        }
        AlertsStatePayload alertsStatePayload = (AlertsStatePayload) other;
        return Intrinsics.areEqual(this.allAlerts, alertsStatePayload.allAlerts) && Intrinsics.areEqual(this.activeAlerts, alertsStatePayload.activeAlerts);
    }

    @NotNull
    public final List<Alert> getActiveAlerts() {
        return this.activeAlerts;
    }

    @NotNull
    public final List<Alert> getAllAlerts() {
        return this.allAlerts;
    }

    public int hashCode() {
        return (this.allAlerts.hashCode() * 31) + this.activeAlerts.hashCode();
    }

    @NotNull
    public String toString() {
        return "AlertsStatePayload(allAlerts=" + this.allAlerts + ", activeAlerts=" + this.activeAlerts + ')';
    }

    public /* synthetic */ AlertsStatePayload(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2);
    }
}
