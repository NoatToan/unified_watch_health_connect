package com.xiaomi.smarthome.homeroom.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.device.Device;

/* JADX INFO: loaded from: classes2.dex */
public class GridViewData implements Parcelable {
    public static final Parcelable.Creator<GridViewData> CREATOR = new Parcelable.Creator<GridViewData>() { // from class: com.xiaomi.smarthome.homeroom.model.GridViewData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GridViewData createFromParcel(Parcel parcel) {
            return new GridViewData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GridViewData[] newArray(int i) {
            return new GridViewData[i];
        }
    };
    public String anotherName;
    public Device device;
    public GridType type;

    public enum GridType implements Parcelable {
        TYPE_NORMAL,
        TYPE_IR,
        TYPE_ADD_TO_COMMON,
        TYPE_TIPS;

        public static final Parcelable.Creator<GridType> CREATOR = new Parcelable.Creator<GridType>() { // from class: com.xiaomi.smarthome.homeroom.model.GridViewData.GridType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public GridType createFromParcel(Parcel parcel) {
                return GridType.values()[parcel.readInt()];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public GridType[] newArray(int i) {
                return new GridType[i];
            }
        };

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public GridViewData() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "GVD{[" + this.device.did + "," + this.device.name + "]}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        GridType gridType = this.type;
        parcel.writeInt(gridType == null ? -1 : gridType.ordinal());
        parcel.writeParcelable(this.device, i);
        parcel.writeString(this.anotherName);
    }

    public GridViewData(GridType gridType) {
        this.type = gridType;
    }

    public GridViewData(Parcel parcel) {
        try {
            int i = parcel.readInt();
            this.type = i == -1 ? null : GridType.values()[i];
            this.device = (Device) parcel.readParcelable(Device.class.getClassLoader());
            this.anotherName = parcel.readString();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
