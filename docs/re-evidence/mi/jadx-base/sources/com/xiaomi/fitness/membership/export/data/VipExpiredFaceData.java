package com.xiaomi.fitness.membership.export.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Parcelize
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\"\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003JL\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0003J\u0013\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0003R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R,\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/membership/export/data/VipExpiredFaceData;", "Landroid/os/Parcelable;", "hasShowPopup", "", "hasMore", "", "watchfaceList", "Lkotlin/collections/ArrayList;", "Lcom/xiaomi/fitness/membership/export/data/VipExpiredFaceItem;", "Ljava/util/ArrayList;", "device_config", "Lcom/xiaomi/fitness/membership/export/data/VipExpiredFaceConfig;", "<init>", "(IZLjava/util/ArrayList;Lcom/xiaomi/fitness/membership/export/data/VipExpiredFaceConfig;)V", "getHasShowPopup", "()I", "getHasMore", "()Z", "getWatchfaceList", "()Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "getDevice_config", "()Lcom/xiaomi/fitness/membership/export/data/VipExpiredFaceConfig;", "component1", "component2", "component3", "component4", "copy", "(IZLjava/util/ArrayList;Lcom/xiaomi/fitness/membership/export/data/VipExpiredFaceConfig;)Lcom/xiaomi/fitness/membership/export/data/VipExpiredFaceData;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "membership-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VipExpiredFaceData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<VipExpiredFaceData> CREATOR = new Creator();

    @SerializedName("device_config")
    @Nullable
    private final VipExpiredFaceConfig device_config;

    @SerializedName("has_more")
    private final boolean hasMore;

    @SerializedName("is_popup")
    private final int hasShowPopup;

    @SerializedName("watchface_list")
    @Nullable
    private final ArrayList<VipExpiredFaceItem> watchfaceList;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VipExpiredFaceData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VipExpiredFaceData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(VipExpiredFaceItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new VipExpiredFaceData(i, z, arrayList, parcel.readInt() != 0 ? VipExpiredFaceConfig.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VipExpiredFaceData[] newArray(int i) {
            return new VipExpiredFaceData[i];
        }
    }

    public VipExpiredFaceData(int i, boolean z, @Nullable ArrayList<VipExpiredFaceItem> arrayList, @Nullable VipExpiredFaceConfig vipExpiredFaceConfig) {
        this.hasShowPopup = i;
        this.hasMore = z;
        this.watchfaceList = arrayList;
        this.device_config = vipExpiredFaceConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VipExpiredFaceData copy$default(VipExpiredFaceData vipExpiredFaceData, int i, boolean z, ArrayList arrayList, VipExpiredFaceConfig vipExpiredFaceConfig, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = vipExpiredFaceData.hasShowPopup;
        }
        if ((i2 & 2) != 0) {
            z = vipExpiredFaceData.hasMore;
        }
        if ((i2 & 4) != 0) {
            arrayList = vipExpiredFaceData.watchfaceList;
        }
        if ((i2 & 8) != 0) {
            vipExpiredFaceConfig = vipExpiredFaceData.device_config;
        }
        return vipExpiredFaceData.copy(i, z, arrayList, vipExpiredFaceConfig);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getHasShowPopup() {
        return this.hasShowPopup;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    @Nullable
    public final ArrayList<VipExpiredFaceItem> component3() {
        return this.watchfaceList;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final VipExpiredFaceConfig getDevice_config() {
        return this.device_config;
    }

    @NotNull
    public final VipExpiredFaceData copy(int hasShowPopup, boolean hasMore, @Nullable ArrayList<VipExpiredFaceItem> watchfaceList, @Nullable VipExpiredFaceConfig device_config) {
        return new VipExpiredFaceData(hasShowPopup, hasMore, watchfaceList, device_config);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VipExpiredFaceData)) {
            return false;
        }
        VipExpiredFaceData vipExpiredFaceData = (VipExpiredFaceData) other;
        return this.hasShowPopup == vipExpiredFaceData.hasShowPopup && this.hasMore == vipExpiredFaceData.hasMore && Intrinsics.areEqual(this.watchfaceList, vipExpiredFaceData.watchfaceList) && Intrinsics.areEqual(this.device_config, vipExpiredFaceData.device_config);
    }

    @Nullable
    public final VipExpiredFaceConfig getDevice_config() {
        return this.device_config;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final int getHasShowPopup() {
        return this.hasShowPopup;
    }

    @Nullable
    public final ArrayList<VipExpiredFaceItem> getWatchfaceList() {
        return this.watchfaceList;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.hasShowPopup) * 31) + Boolean.hashCode(this.hasMore)) * 31;
        ArrayList<VipExpiredFaceItem> arrayList = this.watchfaceList;
        int iHashCode2 = (iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        VipExpiredFaceConfig vipExpiredFaceConfig = this.device_config;
        return iHashCode2 + (vipExpiredFaceConfig != null ? vipExpiredFaceConfig.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VipExpiredFaceData(hasShowPopup=" + this.hasShowPopup + ", hasMore=" + this.hasMore + ", watchfaceList=" + this.watchfaceList + ", device_config=" + this.device_config + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.hasShowPopup);
        dest.writeInt(this.hasMore ? 1 : 0);
        ArrayList<VipExpiredFaceItem> arrayList = this.watchfaceList;
        if (arrayList == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(arrayList.size());
            Iterator<VipExpiredFaceItem> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        VipExpiredFaceConfig vipExpiredFaceConfig = this.device_config;
        if (vipExpiredFaceConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            vipExpiredFaceConfig.writeToParcel(dest, flags);
        }
    }
}
