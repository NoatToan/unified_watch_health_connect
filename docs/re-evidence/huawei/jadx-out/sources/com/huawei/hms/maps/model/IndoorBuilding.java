package com.huawei.hms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.maps.utils.LogM;

/* JADX INFO: loaded from: classes34.dex */
public class IndoorBuilding implements Parcelable {
    public static final Parcelable.Creator<IndoorBuilding> CREATOR = new maa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f14252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String[] f14253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[] f14254c;
    String d;

    class maa implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IndoorBuilding createFromParcel(Parcel parcel) {
            return new IndoorBuilding(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IndoorBuilding[] newArray(int i) {
            return new IndoorBuilding[i];
        }

        maa() {
        }
    }

    protected IndoorBuilding(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.f14252a = parcelReader.createString(2, "");
        this.f14253b = parcelReader.createStringArray(3, new String[0]);
        this.f14254c = parcelReader.createIntArray(4, new int[0]);
        this.d = parcelReader.createString(5, "");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public IndoorBuilding(String str, String str2, String str3, String str4) {
        this.f14252a = str;
        this.f14253b = str2.split("\\|");
        String[] strArrSplit = str3.split("\\|");
        this.f14254c = new int[strArrSplit.length];
        try {
            int i = 0;
            for (String str5 : strArrSplit) {
                this.f14254c[i] = Integer.parseInt(str5);
                i++;
            }
        } catch (NumberFormatException unused) {
            LogM.e("IndoorBuilding", "error number type");
        }
        this.d = str4;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int iBeginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeString(2, this.f14252a, false);
        parcelWrite.writeStringArray(3, this.f14253b, false);
        parcelWrite.writeIntArray(4, this.f14254c, false);
        parcelWrite.writeString(5, this.d, false);
        parcelWrite.finishObjectHeader(iBeginObjectHeader);
    }

    public void setFloorOrder(int[] iArr) {
        this.f14254c = iArr;
    }

    public void setFloorNames(String[] strArr) {
        this.f14253b = strArr;
    }

    public void setCurrFloorName(String str) {
        this.d = str;
    }

    public void setBuildingId(String str) {
        this.f14252a = str;
    }

    public int[] getFloorOrder() {
        return this.f14254c;
    }

    public String[] getFloorNames() {
        return this.f14253b;
    }

    public String getCurrFloorName() {
        return this.d;
    }

    public String getBuildingId() {
        return this.f14252a;
    }
}
