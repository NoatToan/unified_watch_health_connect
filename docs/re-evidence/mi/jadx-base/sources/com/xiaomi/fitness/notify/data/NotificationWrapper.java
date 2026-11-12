package com.xiaomi.fitness.notify.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Parcelize
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/notify/data/NotificationWrapper;", "Landroid/os/Parcelable;", "sbn", "Landroid/service/notification/StatusBarNotification;", "reason", "", "<init>", "(Landroid/service/notification/StatusBarNotification;I)V", "getSbn", "()Landroid/service/notification/StatusBarNotification;", "getReason", "()I", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NotificationWrapper implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NotificationWrapper> CREATOR = new Creator();
    private final int reason;

    @NotNull
    private final StatusBarNotification sbn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NotificationWrapper> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationWrapper createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NotificationWrapper((StatusBarNotification) parcel.readParcelable(NotificationWrapper.class.getClassLoader()), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationWrapper[] newArray(int i) {
            return new NotificationWrapper[i];
        }
    }

    public NotificationWrapper(@NotNull StatusBarNotification sbn, int i) {
        Intrinsics.checkNotNullParameter(sbn, "sbn");
        this.sbn = sbn;
        this.reason = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int getReason() {
        return this.reason;
    }

    @NotNull
    public final StatusBarNotification getSbn() {
        return this.sbn;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.sbn, flags);
        dest.writeInt(this.reason);
    }
}
