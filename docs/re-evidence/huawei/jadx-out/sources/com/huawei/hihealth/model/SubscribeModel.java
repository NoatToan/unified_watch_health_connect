package com.huawei.hihealth.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.huawei.hihealth.CommonParam;

/* JADX INFO: loaded from: classes2.dex */
public class SubscribeModel extends CommonParam {
    public static final Parcelable.Creator<SubscribeModel> CREATOR = new Parcelable.Creator<SubscribeModel>() { // from class: com.huawei.hihealth.model.SubscribeModel.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SubscribeModel createFromParcel(Parcel parcel) {
            return new SubscribeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SubscribeModel[] newArray(int i) {
            return new SubscribeModel[i];
        }
    };
    private int[] dataTypes;

    public SubscribeModel(int[] iArr) {
        this.dataTypes = iArr == null ? new int[0] : (int[]) iArr.clone();
    }

    private SubscribeModel(Parcel parcel) {
        super(parcel);
        int[] iArrCreateIntArray = parcel.createIntArray();
        this.dataTypes = iArrCreateIntArray;
        Log.i("read SubscribeModel", String.valueOf(iArrCreateIntArray == null));
    }

    public int[] getDataTypes() {
        int[] iArr = this.dataTypes;
        return iArr == null ? new int[0] : (int[]) iArr.clone();
    }

    @Override // com.huawei.hihealth.CommonParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        Log.i("write SubscribeModel", String.valueOf(this.dataTypes == null));
        parcel.writeIntArray(this.dataTypes);
    }

    public String toString() {
        int[] iArr = this.dataTypes;
        if (iArr == null || iArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i : this.dataTypes) {
            sb.append(i);
            sb.append("#");
        }
        String string = sb.toString();
        return string.substring(0, string.length() - 1);
    }
}
