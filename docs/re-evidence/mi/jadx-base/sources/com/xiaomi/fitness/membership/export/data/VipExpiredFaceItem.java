package com.xiaomi.fitness.membership.export.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/membership/export/data/VipExpiredFaceItem;", "Landroid/os/Parcelable;", "id", "", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getIcon", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "membership-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VipExpiredFaceItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<VipExpiredFaceItem> CREATOR = new Creator();

    @NotNull
    private final String icon;

    @NotNull
    private final String id;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VipExpiredFaceItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VipExpiredFaceItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VipExpiredFaceItem(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VipExpiredFaceItem[] newArray(int i) {
            return new VipExpiredFaceItem[i];
        }
    }

    public VipExpiredFaceItem(@NotNull String id, @NotNull String icon) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.id = id;
        this.icon = icon;
    }

    public static /* synthetic */ VipExpiredFaceItem copy$default(VipExpiredFaceItem vipExpiredFaceItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vipExpiredFaceItem.id;
        }
        if ((i & 2) != 0) {
            str2 = vipExpiredFaceItem.icon;
        }
        return vipExpiredFaceItem.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final VipExpiredFaceItem copy(@NotNull String id, @NotNull String icon) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new VipExpiredFaceItem(id, icon);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VipExpiredFaceItem)) {
            return false;
        }
        VipExpiredFaceItem vipExpiredFaceItem = (VipExpiredFaceItem) other;
        return Intrinsics.areEqual(this.id, vipExpiredFaceItem.id) && Intrinsics.areEqual(this.icon, vipExpiredFaceItem.icon);
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.icon.hashCode();
    }

    @NotNull
    public String toString() {
        return "VipExpiredFaceItem(id=" + this.id + ", icon=" + this.icon + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.icon);
    }
}
