package com.huami.ai.entity.alert;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u000b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/huami/ai/entity/alert/Alarm;", "Lcom/huami/ai/entity/alert/Alert;", "", "component1", "component2", "", "component3", "Lcom/huami/ai/entity/alert/AlertStatus;", "component4", "token", "scheduledTime", "days", "status", "copy", "toString", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "b", "getScheduledTime", "c", LogUtil.I, "getDays", "()I", GoogleApiAvailabilityLight.a, "Lcom/huami/ai/entity/alert/AlertStatus;", "getStatus", "()Lcom/huami/ai/entity/alert/AlertStatus;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/huami/ai/entity/alert/AlertStatus;)V", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Alarm extends Alert {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String token;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String scheduledTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int days;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final AlertStatus status;

    public /* synthetic */ Alarm(String str, String str2, int i, AlertStatus alertStatus, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, (i2 & 8) != 0 ? AlertStatus.ON : alertStatus);
    }

    public static /* synthetic */ Alarm copy$default(Alarm alarm, String str, String str2, int i, AlertStatus alertStatus, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = alarm.token;
        }
        if ((i2 & 2) != 0) {
            str2 = alarm.scheduledTime;
        }
        if ((i2 & 4) != 0) {
            i = alarm.days;
        }
        if ((i2 & 8) != 0) {
            alertStatus = alarm.status;
        }
        return alarm.copy(str, str2, i, alertStatus);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getScheduledTime() {
        return this.scheduledTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDays() {
        return this.days;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AlertStatus getStatus() {
        return this.status;
    }

    @NotNull
    public final Alarm copy(@NotNull String token, @NotNull String scheduledTime, int days, @NotNull AlertStatus status) {
        return new Alarm(token, scheduledTime, days, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Alarm)) {
            return false;
        }
        Alarm alarm = (Alarm) other;
        return Intrinsics.areEqual(this.token, alarm.token) && Intrinsics.areEqual(this.scheduledTime, alarm.scheduledTime) && this.days == alarm.days && this.status == alarm.status;
    }

    public final int getDays() {
        return this.days;
    }

    @NotNull
    public final String getScheduledTime() {
        return this.scheduledTime;
    }

    @NotNull
    public final AlertStatus getStatus() {
        return this.status;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return (((((this.token.hashCode() * 31) + this.scheduledTime.hashCode()) * 31) + this.days) * 31) + this.status.hashCode();
    }

    @NotNull
    public String toString() {
        return "Alarm(token=" + this.token + ", scheduledTime=" + this.scheduledTime + ", days=" + this.days + ", status=" + this.status + ')';
    }

    public Alarm(@NotNull String str, @NotNull String str2, int i, @NotNull AlertStatus alertStatus) {
        super(null);
        this.token = str;
        this.scheduledTime = str2;
        this.days = i;
        this.status = alertStatus;
    }
}
