package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class DoorCardProducts extends CommonResponseInfo implements Parcelable {
    public static final Parcelable.Creator<DoorCardProducts> CREATOR = new Parcelable.Creator<DoorCardProducts>() { // from class: com.miui.tsmclient.entity.DoorCardProducts.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DoorCardProducts createFromParcel(Parcel parcel) {
            return new DoorCardProducts(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DoorCardProducts[] newArray(int i) {
            return new DoorCardProducts[i];
        }
    };

    @SerializedName("data")
    private List<DoorCardProduct> mDoorCardList;
    private DoorCardProduct mSelectCardInfo;

    public DoorCardProducts(Parcel parcel) {
        this.mDoorCardList = parcel.createTypedArrayList(DoorCardProduct.CREATOR);
        this.mSelectCardInfo = (DoorCardProduct) parcel.readParcelable(DoorCardProduct.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<DoorCardProduct> getDoorCardProducts() {
        return this.mDoorCardList;
    }

    public DoorCardProduct getSelectCardInfo() {
        return this.mSelectCardInfo;
    }

    public String getSelectProductId() {
        DoorCardProduct doorCardProduct = this.mSelectCardInfo;
        return doorCardProduct == null ? "" : doorCardProduct.getProductId();
    }

    public void setSelectCardInfo(int i) {
        DoorCardProduct doorCardProduct = this.mSelectCardInfo;
        if (doorCardProduct != null) {
            doorCardProduct.setSelected(false);
        }
        List<DoorCardProduct> list = this.mDoorCardList;
        if (list == null || list.size() == 0) {
            return;
        }
        DoorCardProduct doorCardProduct2 = this.mDoorCardList.get(i);
        doorCardProduct2.setSelected(true);
        this.mSelectCardInfo = doorCardProduct2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.mDoorCardList);
        parcel.writeParcelable(this.mSelectCardInfo, i);
    }
}
