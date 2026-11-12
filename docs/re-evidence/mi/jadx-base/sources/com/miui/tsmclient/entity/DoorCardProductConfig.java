package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class DoorCardProductConfig implements Parcelable {
    public static final Parcelable.Creator<DoorCardProductConfig> CREATOR = new Parcelable.Creator<DoorCardProductConfig>() { // from class: com.miui.tsmclient.entity.DoorCardProductConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DoorCardProductConfig createFromParcel(Parcel parcel) {
            return new DoorCardProductConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DoorCardProductConfig[] newArray(int i) {
            return new DoorCardProductConfig[i];
        }
    };

    @SerializedName("detailItemList")
    private List<DoorCardProductConfigItem> mDetailItemList;

    @SerializedName("moreItemList")
    private List<DoorCardProductConfigItem> mMoreItemList;

    @SerializedName("keyItem")
    private DoorCardProductConfigItem mPrductConfigItem;

    public DoorCardProductConfig(Parcel parcel) {
        readFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<DoorCardProductConfigItem> getDetailItemList() {
        return this.mDetailItemList;
    }

    public List<DoorCardProductConfigItem> getMoreItemList() {
        return this.mMoreItemList;
    }

    public DoorCardProductConfigItem getPrductConfigItem() {
        return this.mPrductConfigItem;
    }

    public void readFromParcel(Parcel parcel) {
        this.mPrductConfigItem = (DoorCardProductConfigItem) parcel.readParcelable(DoorCardProductConfigItem.class.getClassLoader());
        Parcelable.Creator<DoorCardProductConfigItem> creator = DoorCardProductConfigItem.CREATOR;
        this.mMoreItemList = parcel.createTypedArrayList(creator);
        this.mDetailItemList = parcel.createTypedArrayList(creator);
    }

    public void setDetailItemList(List<DoorCardProductConfigItem> list) {
        this.mDetailItemList = list;
    }

    public void setMoreItemList(List<DoorCardProductConfigItem> list) {
        this.mMoreItemList = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mPrductConfigItem, i);
        parcel.writeTypedList(this.mMoreItemList);
        parcel.writeTypedList(this.mDetailItemList);
    }
}
