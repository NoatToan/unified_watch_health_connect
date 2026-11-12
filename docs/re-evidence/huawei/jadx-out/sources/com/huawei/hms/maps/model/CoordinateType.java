package com.huawei.hms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.location.AMapLocation;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;

/* JADX INFO: loaded from: classes10.dex */
public class CoordinateType implements Parcelable {
    public static final Parcelable.Creator<CoordinateType> CREATOR = new Parcelable.Creator<CoordinateType>() { // from class: com.huawei.hms.maps.model.CoordinateType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CoordinateType createFromParcel(Parcel parcel) {
            return new CoordinateType(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CoordinateType[] newArray(int i) {
            return new CoordinateType[i];
        }
    };
    private int coordinateType;

    public CoordinateType() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected CoordinateType(Parcel parcel) {
        this.coordinateType = new ParcelReader(parcel).readInt(2, 0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0012  */
    public CoordinateType(CoordinateTypeEnum coordinateTypeEnum) {
        int i;
        if (coordinateTypeEnum == null) {
            i = -1;
        } else if (coordinateTypeEnum == CoordinateTypeEnum.WGS84) {
            i = 0;
        } else if (coordinateTypeEnum == CoordinateTypeEnum.GCJ02) {
            i = 1;
        } else {
            i = -1;
        }
        this.coordinateType = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int iBeginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeInt(2, this.coordinateType);
        parcelWrite.finishObjectHeader(iBeginObjectHeader);
    }

    public enum CoordinateTypeEnum {
        WGS84(AMapLocation.COORD_TYPE_WGS84),
        GCJ02(AMapLocation.COORD_TYPE_GCJ02),
        UNKNOWN("UNKNOWN");

        private final String coordinateTypeName;

        CoordinateTypeEnum(String str) {
            this.coordinateTypeName = str;
        }
    }

    public void setCoordinateType(int i) {
        this.coordinateType = i;
    }

    public int getCoordinateType() {
        return this.coordinateType;
    }
}
