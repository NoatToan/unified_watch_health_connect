package com.xiaomi.fitness.notify.focus;

import defpackage.sxg;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/notify/focus/RemoveNotification;", "", "", "component1", "()I", "Lsxg;", "component2", "()Lsxg;", "reason", "notifyData", "copy", "(ILsxg;)Lcom/xiaomi/fitness/notify/focus/RemoveNotification;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getReason", "Lsxg;", "getNotifyData", "<init>", "(ILsxg;)V", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final /* data */ class RemoveNotification {

    @NotNull
    private final sxg notifyData;
    private final int reason;

    public RemoveNotification(int i, @NotNull sxg notifyData) {
        Intrinsics.checkNotNullParameter(notifyData, "notifyData");
        this.reason = i;
        this.notifyData = notifyData;
    }

    public static /* synthetic */ RemoveNotification copy$default(RemoveNotification removeNotification, int i, sxg sxgVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = removeNotification.reason;
        }
        if ((i2 & 2) != 0) {
            sxgVar = removeNotification.notifyData;
        }
        return removeNotification.copy(i, sxgVar);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getReason() {
        return this.reason;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final sxg getNotifyData() {
        return this.notifyData;
    }

    @NotNull
    public final RemoveNotification copy(int reason, @NotNull sxg notifyData) {
        Intrinsics.checkNotNullParameter(notifyData, "notifyData");
        return new RemoveNotification(reason, notifyData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoveNotification)) {
            return false;
        }
        RemoveNotification removeNotification = (RemoveNotification) other;
        return this.reason == removeNotification.reason && Intrinsics.areEqual(this.notifyData, removeNotification.notifyData);
    }

    @NotNull
    public final sxg getNotifyData() {
        return this.notifyData;
    }

    public final int getReason() {
        return this.reason;
    }

    public int hashCode() {
        return (Integer.hashCode(this.reason) * 31) + this.notifyData.hashCode();
    }

    @NotNull
    public String toString() {
        return "RemoveNotification(reason=" + this.reason + ", notifyData=" + this.notifyData + ")";
    }
}
