package com.xiaomi.fitness.watch.face.export.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J+\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/data/WatchFaceSlotItem;", "Landroid/os/Parcelable;", "slotId", "", "widgetId", "positionIndex", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getSlotId", "()Ljava/lang/String;", "getWidgetId", "getPositionIndex", "()I", "writeToParcel", "", "flags", "describeContents", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "CREATOR", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WatchFaceSlotItem implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int positionIndex;

    @Nullable
    private final String slotId;

    @Nullable
    private final String widgetId;

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.export.data.WatchFaceSlotItem$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/data/WatchFaceSlotItem$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFaceSlotItem;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/watch/face/export/data/WatchFaceSlotItem;", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<WatchFaceSlotItem> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public WatchFaceSlotItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WatchFaceSlotItem(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public WatchFaceSlotItem[] newArray(int size) {
            return new WatchFaceSlotItem[size];
        }
    }

    public WatchFaceSlotItem(@Nullable String str, @Nullable String str2, int i) {
        this.slotId = str;
        this.widgetId = str2;
        this.positionIndex = i;
    }

    public static /* synthetic */ WatchFaceSlotItem copy$default(WatchFaceSlotItem watchFaceSlotItem, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = watchFaceSlotItem.slotId;
        }
        if ((i2 & 2) != 0) {
            str2 = watchFaceSlotItem.widgetId;
        }
        if ((i2 & 4) != 0) {
            i = watchFaceSlotItem.positionIndex;
        }
        return watchFaceSlotItem.copy(str, str2, i);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSlotId() {
        return this.slotId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPositionIndex() {
        return this.positionIndex;
    }

    @NotNull
    public final WatchFaceSlotItem copy(@Nullable String slotId, @Nullable String widgetId, int positionIndex) {
        return new WatchFaceSlotItem(slotId, widgetId, positionIndex);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WatchFaceSlotItem)) {
            return false;
        }
        WatchFaceSlotItem watchFaceSlotItem = (WatchFaceSlotItem) other;
        return Intrinsics.areEqual(this.slotId, watchFaceSlotItem.slotId) && Intrinsics.areEqual(this.widgetId, watchFaceSlotItem.widgetId) && this.positionIndex == watchFaceSlotItem.positionIndex;
    }

    public final int getPositionIndex() {
        return this.positionIndex;
    }

    @Nullable
    public final String getSlotId() {
        return this.slotId;
    }

    @Nullable
    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        String str = this.slotId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.widgetId;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.positionIndex);
    }

    @NotNull
    public String toString() {
        return "WatchFaceSlotItem(slotId=" + this.slotId + ", widgetId=" + this.widgetId + ", positionIndex=" + this.positionIndex + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.slotId);
        parcel.writeString(this.widgetId);
        parcel.writeInt(this.positionIndex);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WatchFaceSlotItem(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readInt());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
