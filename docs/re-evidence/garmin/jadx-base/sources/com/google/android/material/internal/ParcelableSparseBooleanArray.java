package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes14.dex */
public class ParcelableSparseBooleanArray extends SparseBooleanArray implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseBooleanArray> CREATOR = new Parcelable.Creator<ParcelableSparseBooleanArray>() { // from class: com.google.android.material.internal.ParcelableSparseBooleanArray.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableSparseBooleanArray createFromParcel(Parcel parcel) {
            int i14 = parcel.readInt();
            ParcelableSparseBooleanArray parcelableSparseBooleanArray = new ParcelableSparseBooleanArray(i14);
            int[] iArr = new int[i14];
            boolean[] zArr = new boolean[i14];
            parcel.readIntArray(iArr);
            parcel.readBooleanArray(zArr);
            for (int i15 = 0; i15 < i14; i15++) {
                parcelableSparseBooleanArray.put(iArr[i15], zArr[i15]);
            }
            return parcelableSparseBooleanArray;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableSparseBooleanArray[] newArray(int i14) {
            return new ParcelableSparseBooleanArray[i14];
        }
    };

    public ParcelableSparseBooleanArray(SparseBooleanArray sparseBooleanArray) {
        super(sparseBooleanArray.size());
        for (int i14 = 0; i14 < sparseBooleanArray.size(); i14++) {
            put(sparseBooleanArray.keyAt(i14), sparseBooleanArray.valueAt(i14));
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        int[] iArr = new int[size()];
        boolean[] zArr = new boolean[size()];
        for (int i15 = 0; i15 < size(); i15++) {
            iArr[i15] = keyAt(i15);
            zArr[i15] = valueAt(i15);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeBooleanArray(zArr);
    }

    public ParcelableSparseBooleanArray(int i14) {
        super(i14);
    }

    public ParcelableSparseBooleanArray() {
    }
}
