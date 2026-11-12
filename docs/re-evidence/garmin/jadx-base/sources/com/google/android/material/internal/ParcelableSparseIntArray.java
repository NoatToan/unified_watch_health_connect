package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes14.dex */
public class ParcelableSparseIntArray extends SparseIntArray implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseIntArray> CREATOR = new Parcelable.Creator<ParcelableSparseIntArray>() { // from class: com.google.android.material.internal.ParcelableSparseIntArray.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableSparseIntArray createFromParcel(Parcel parcel) {
            int i14 = parcel.readInt();
            ParcelableSparseIntArray parcelableSparseIntArray = new ParcelableSparseIntArray(i14);
            int[] iArr = new int[i14];
            int[] iArr2 = new int[i14];
            parcel.readIntArray(iArr);
            parcel.readIntArray(iArr2);
            for (int i15 = 0; i15 < i14; i15++) {
                parcelableSparseIntArray.put(iArr[i15], iArr2[i15]);
            }
            return parcelableSparseIntArray;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableSparseIntArray[] newArray(int i14) {
            return new ParcelableSparseIntArray[i14];
        }
    };

    public ParcelableSparseIntArray(SparseIntArray sparseIntArray) {
        for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
            put(sparseIntArray.keyAt(i14), sparseIntArray.valueAt(i14));
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        int[] iArr = new int[size()];
        int[] iArr2 = new int[size()];
        for (int i15 = 0; i15 < size(); i15++) {
            iArr[i15] = keyAt(i15);
            iArr2[i15] = valueAt(i15);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeIntArray(iArr2);
    }

    public ParcelableSparseIntArray(int i14) {
        super(i14);
    }

    public ParcelableSparseIntArray() {
    }
}
