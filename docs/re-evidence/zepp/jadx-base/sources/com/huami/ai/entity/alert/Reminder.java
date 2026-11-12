package com.huami.ai.entity.alert;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b+\u0010,J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003JE\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\tHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0019\u0010\u000e\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001cR\u0019\u0010\u0010\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/huami/ai/entity/alert/Reminder;", "Lcom/huami/ai/entity/alert/Alert;", "", "component1", "component2", "component3", "", "component4", "component5", "Lcom/huami/ai/entity/alert/AlertStatus;", "component6", "token", "label", "scheduledTime", "circle", "cron", "status", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "b", "getLabel", "c", "getScheduledTime", GoogleApiAvailabilityLight.a, ExifInterface.LATITUDE_SOUTH, "getCircle", "()S", "e", "getCron", "f", "Lcom/huami/ai/entity/alert/AlertStatus;", "getStatus", "()Lcom/huami/ai/entity/alert/AlertStatus;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;SLjava/lang/String;Lcom/huami/ai/entity/alert/AlertStatus;)V", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Reminder extends Alert {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String token;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String label;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String scheduledTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final short circle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String cron;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final AlertStatus status;

    public /* synthetic */ Reminder(String str, String str2, String str3, short s, String str4, AlertStatus alertStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, s, str4, (i & 32) != 0 ? AlertStatus.ON : alertStatus);
    }

    public static /* synthetic */ Reminder copy$default(Reminder reminder, String str, String str2, String str3, short s, String str4, AlertStatus alertStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reminder.token;
        }
        if ((i & 2) != 0) {
            str2 = reminder.label;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = reminder.scheduledTime;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            s = reminder.circle;
        }
        short s2 = s;
        if ((i & 16) != 0) {
            str4 = reminder.cron;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            alertStatus = reminder.status;
        }
        return reminder.copy(str, str5, str6, s2, str7, alertStatus);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getScheduledTime() {
        return this.scheduledTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final short getCircle() {
        return this.circle;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCron() {
        return this.cron;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AlertStatus getStatus() {
        return this.status;
    }

    @NotNull
    public final Reminder copy(@NotNull String token, @NotNull String label, @NotNull String scheduledTime, short circle, @NotNull String cron, @NotNull AlertStatus status) {
        return new Reminder(token, label, scheduledTime, circle, cron, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Reminder)) {
            return false;
        }
        Reminder reminder = (Reminder) other;
        return Intrinsics.areEqual(this.token, reminder.token) && Intrinsics.areEqual(this.label, reminder.label) && Intrinsics.areEqual(this.scheduledTime, reminder.scheduledTime) && this.circle == reminder.circle && Intrinsics.areEqual(this.cron, reminder.cron) && this.status == reminder.status;
    }

    public final short getCircle() {
        return this.circle;
    }

    @NotNull
    public final String getCron() {
        return this.cron;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
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
        return (((((((((this.token.hashCode() * 31) + this.label.hashCode()) * 31) + this.scheduledTime.hashCode()) * 31) + this.circle) * 31) + this.cron.hashCode()) * 31) + this.status.hashCode();
    }

    @NotNull
    public String toString() {
        return "Reminder(token=" + this.token + ", label=" + this.label + ", scheduledTime=" + this.scheduledTime + ", circle=" + ((int) this.circle) + ", cron=" + this.cron + ", status=" + this.status + ')';
    }

    public Reminder(@NotNull String str, @NotNull String str2, @NotNull String str3, short s, @NotNull String str4, @NotNull AlertStatus alertStatus) {
        super(null);
        this.token = str;
        this.label = str2;
        this.scheduledTime = str3;
        this.circle = s;
        this.cron = str4;
        this.status = alertStatus;
    }
}
