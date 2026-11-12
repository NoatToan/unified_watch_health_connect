package com.github.mikephil.chartingv2.data;

import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class Entry implements Parcelable {
    public static final Parcelable.Creator<Entry> CREATOR = new Parcelable.Creator<Entry>() { // from class: com.github.mikephil.chartingv2.data.Entry.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Entry createFromParcel(Parcel parcel) {
            return new Entry(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Entry[] newArray(int i14) {
            return new Entry[i14];
        }
    };
    private Object mData;
    private float mVal;
    private int mXIndex;

    public Entry(Parcel parcel) {
        this.mVal = 0.0f;
        this.mXIndex = 0;
        this.mData = null;
        this.mVal = parcel.readFloat();
        this.mXIndex = parcel.readInt();
        if (parcel.readInt() == 1) {
            this.mData = parcel.readParcelable(Object.class.getClassLoader());
        }
    }

    public Entry copy() {
        return new Entry(this.mVal, this.mXIndex, this.mData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equalTo(Entry entry) {
        return entry != null && entry.mData == this.mData && entry.mXIndex == this.mXIndex && Math.abs(entry.mVal - this.mVal) <= 1.0E-5f;
    }

    public Object getData() {
        return this.mData;
    }

    public float getVal() {
        return this.mVal;
    }

    public int getXIndex() {
        return this.mXIndex;
    }

    public void setData(Object obj) {
        this.mData = obj;
    }

    public void setVal(float f14) {
        this.mVal = f14;
    }

    public void setXIndex(int i14) {
        this.mXIndex = i14;
    }

    public String toString() {
        return "Entry, xIndex: " + this.mXIndex + " val (sum): " + getVal();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        parcel.writeFloat(this.mVal);
        parcel.writeInt(this.mXIndex);
        Object obj = this.mData;
        if (obj == null) {
            parcel.writeInt(0);
        } else {
            if (!(obj instanceof Parcelable)) {
                throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
            }
            parcel.writeInt(1);
            parcel.writeParcelable((Parcelable) this.mData, i14);
        }
    }

    public Entry(float f14, int i14, Object obj) {
        this(f14, i14);
        this.mData = obj;
    }

    public Entry(float f14, int i14) {
        this.mData = null;
        this.mVal = f14;
        this.mXIndex = i14;
    }
}
