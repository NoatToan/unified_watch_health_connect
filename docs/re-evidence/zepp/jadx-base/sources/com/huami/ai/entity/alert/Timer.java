package com.huami.ai.entity.alert;

import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/huami/ai/entity/alert/Timer;", "Lcom/huami/ai/entity/alert/Alert;", "", "component1", "", "component2", "Lcom/huami/ai/entity/alert/AlertStatus;", "component3", "token", "scheduledTime", "status", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "b", "J", "getScheduledTime", "()J", "c", "Lcom/huami/ai/entity/alert/AlertStatus;", "getStatus", "()Lcom/huami/ai/entity/alert/AlertStatus;", "<init>", "(Ljava/lang/String;JLcom/huami/ai/entity/alert/AlertStatus;)V", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Timer extends Alert {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String token;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long scheduledTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final AlertStatus status;

    public /* synthetic */ Timer(String str, long j, AlertStatus alertStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i & 4) != 0 ? AlertStatus.ON : alertStatus);
    }

    public static /* synthetic */ Timer copy$default(Timer timer, String str, long j, AlertStatus alertStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            str = timer.token;
        }
        if ((i & 2) != 0) {
            j = timer.scheduledTime;
        }
        if ((i & 4) != 0) {
            alertStatus = timer.status;
        }
        return timer.copy(str, j, alertStatus);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getScheduledTime() {
        return this.scheduledTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AlertStatus getStatus() {
        return this.status;
    }

    @NotNull
    public final Timer copy(@NotNull String token, long scheduledTime, @NotNull AlertStatus status) {
        return new Timer(token, scheduledTime, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Timer)) {
            return false;
        }
        Timer timer = (Timer) other;
        return Intrinsics.areEqual(this.token, timer.token) && this.scheduledTime == timer.scheduledTime && this.status == timer.status;
    }

    public final long getScheduledTime() {
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
        return (((this.token.hashCode() * 31) + b.a(this.scheduledTime)) * 31) + this.status.hashCode();
    }

    @NotNull
    public String toString() {
        return "Timer(token=" + this.token + ", scheduledTime=" + this.scheduledTime + ", status=" + this.status + ')';
    }

    public Timer(@NotNull String str, long j, @NotNull AlertStatus alertStatus) {
        super(null);
        this.token = str;
        this.scheduledTime = j;
        this.status = alertStatus;
    }
}
