package com.xiaomi.fitness.notify.init;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Parcelize
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0006J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/notify/init/RemoveNotificationItem;", "Landroid/os/Parcelable;", "appID", "", "key", "UID", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getAppID", "()Ljava/lang/String;", "getKey", "getUID", "()I", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RemoveNotificationItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RemoveNotificationItem> CREATOR = new Creator();
    private final int UID;

    @NotNull
    private final String appID;

    @NotNull
    private final String key;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RemoveNotificationItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RemoveNotificationItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RemoveNotificationItem(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RemoveNotificationItem[] newArray(int i) {
            return new RemoveNotificationItem[i];
        }
    }

    public RemoveNotificationItem(@NotNull String appID, @NotNull String key, int i) {
        Intrinsics.checkNotNullParameter(appID, "appID");
        Intrinsics.checkNotNullParameter(key, "key");
        this.appID = appID;
        this.key = key;
        this.UID = i;
    }

    public static /* synthetic */ RemoveNotificationItem copy$default(RemoveNotificationItem removeNotificationItem, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = removeNotificationItem.appID;
        }
        if ((i2 & 2) != 0) {
            str2 = removeNotificationItem.key;
        }
        if ((i2 & 4) != 0) {
            i = removeNotificationItem.UID;
        }
        return removeNotificationItem.copy(str, str2, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppID() {
        return this.appID;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getUID() {
        return this.UID;
    }

    @NotNull
    public final RemoveNotificationItem copy(@NotNull String appID, @NotNull String key, int UID) {
        Intrinsics.checkNotNullParameter(appID, "appID");
        Intrinsics.checkNotNullParameter(key, "key");
        return new RemoveNotificationItem(appID, key, UID);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoveNotificationItem)) {
            return false;
        }
        RemoveNotificationItem removeNotificationItem = (RemoveNotificationItem) other;
        return Intrinsics.areEqual(this.appID, removeNotificationItem.appID) && Intrinsics.areEqual(this.key, removeNotificationItem.key) && this.UID == removeNotificationItem.UID;
    }

    @NotNull
    public final String getAppID() {
        return this.appID;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final int getUID() {
        return this.UID;
    }

    public int hashCode() {
        return (((this.appID.hashCode() * 31) + this.key.hashCode()) * 31) + Integer.hashCode(this.UID);
    }

    @NotNull
    public String toString() {
        return "RemoveNotificationItem(appID=" + this.appID + ", key=" + this.key + ", UID=" + this.UID + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.appID);
        dest.writeString(this.key);
        dest.writeInt(this.UID);
    }
}
