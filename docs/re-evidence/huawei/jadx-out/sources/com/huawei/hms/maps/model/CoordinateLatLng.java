package com.huawei.hms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;

/* JADX INFO: loaded from: classes10.dex */
public class CoordinateLatLng implements Parcelable {
    public static final Parcelable.Creator<CoordinateLatLng> CREATOR = new maa();
    private CoordinateType coordinateType;
    private LatLng location;

    class maa implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CoordinateLatLng createFromParcel(Parcel parcel) {
            return new CoordinateLatLng(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CoordinateLatLng[] newArray(int i) {
            return new CoordinateLatLng[i];
        }

        maa() {
        }
    }

    public CoordinateLatLng() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected CoordinateLatLng(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.coordinateType = (CoordinateType) parcelReader.readParcelable(2, CoordinateType.CREATOR, null);
        this.location = (LatLng) parcelReader.readParcelable(3, LatLng.CREATOR, null);
    }

    public CoordinateLatLng(CoordinateType coordinateType, LatLng latLng) {
        this.coordinateType = coordinateType;
        this.location = latLng;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int iBeginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeParcelable(2, this.coordinateType, i, false);
        parcelWrite.writeParcelable(3, this.location, i, false);
        parcelWrite.finishObjectHeader(iBeginObjectHeader);
    }

    public void setLocation(LatLng latLng) {
        this.location = latLng;
    }

    public void setCoordinateType(CoordinateType coordinateType) {
        this.coordinateType = coordinateType;
    }

    public LatLng getLocation() {
        return this.location;
    }

    public CoordinateType.CoordinateTypeEnum getCoordinateType() {
        CoordinateType coordinateType = this.coordinateType;
        if (coordinateType != null) {
            if (coordinateType.getCoordinateType() == 0) {
                return CoordinateType.CoordinateTypeEnum.WGS84;
            }
            if (this.coordinateType.getCoordinateType() == 1) {
                return CoordinateType.CoordinateTypeEnum.GCJ02;
            }
        }
        return CoordinateType.CoordinateTypeEnum.UNKNOWN;
    }
}
