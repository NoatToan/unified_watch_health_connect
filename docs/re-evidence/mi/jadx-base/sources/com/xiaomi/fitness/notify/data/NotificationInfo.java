package com.xiaomi.fitness.notify.data;

import android.app.PendingIntent;
import com.google.android.gms.common.internal.BaseGmsClient;
import defpackage.rxg;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010\n¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/notify/data/NotificationInfo;", "", "Lrxg;", "component1", "()Lrxg;", "Landroid/app/PendingIntent;", "component2", "()Landroid/app/PendingIntent;", "", "component3", "()J", "notifyData", BaseGmsClient.KEY_PENDING_INTENT, "postTime", "copy", "(Lrxg;Landroid/app/PendingIntent;J)Lcom/xiaomi/fitness/notify/data/NotificationInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrxg;", "getNotifyData", "Landroid/app/PendingIntent;", "getPendingIntent", "J", "getPostTime", "<init>", "(Lrxg;Landroid/app/PendingIntent;J)V", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final /* data */ class NotificationInfo {

    @NotNull
    private final rxg notifyData;

    @Nullable
    private final PendingIntent pendingIntent;
    private final long postTime;

    public NotificationInfo(@NotNull rxg notifyData, @Nullable PendingIntent pendingIntent, long j) {
        Intrinsics.checkNotNullParameter(notifyData, "notifyData");
        this.notifyData = notifyData;
        this.pendingIntent = pendingIntent;
        this.postTime = j;
    }

    public static /* synthetic */ NotificationInfo copy$default(NotificationInfo notificationInfo, rxg rxgVar, PendingIntent pendingIntent, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            rxgVar = notificationInfo.notifyData;
        }
        if ((i & 2) != 0) {
            pendingIntent = notificationInfo.pendingIntent;
        }
        if ((i & 4) != 0) {
            j = notificationInfo.postTime;
        }
        return notificationInfo.copy(rxgVar, pendingIntent, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final rxg getNotifyData() {
        return this.notifyData;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getPostTime() {
        return this.postTime;
    }

    @NotNull
    public final NotificationInfo copy(@NotNull rxg notifyData, @Nullable PendingIntent pendingIntent, long postTime) {
        Intrinsics.checkNotNullParameter(notifyData, "notifyData");
        return new NotificationInfo(notifyData, pendingIntent, postTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationInfo)) {
            return false;
        }
        NotificationInfo notificationInfo = (NotificationInfo) other;
        return Intrinsics.areEqual(this.notifyData, notificationInfo.notifyData) && Intrinsics.areEqual(this.pendingIntent, notificationInfo.pendingIntent) && this.postTime == notificationInfo.postTime;
    }

    @NotNull
    public final rxg getNotifyData() {
        return this.notifyData;
    }

    @Nullable
    public final PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    public final long getPostTime() {
        return this.postTime;
    }

    public int hashCode() {
        int iHashCode = this.notifyData.hashCode() * 31;
        PendingIntent pendingIntent = this.pendingIntent;
        return ((iHashCode + (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 31) + Long.hashCode(this.postTime);
    }

    @NotNull
    public String toString() {
        return "NotificationInfo(notifyData=" + this.notifyData + ", pendingIntent=" + this.pendingIntent + ", postTime=" + this.postTime + ")";
    }
}
