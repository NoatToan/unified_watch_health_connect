package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;

/* JADX INFO: loaded from: classes13.dex */
public class Entry extends BaseEntry implements Parcelable {
    public static final Parcelable.Creator<Entry> CREATOR = new Parcelable.Creator<Entry>() { // from class: com.github.mikephil.charting.data.Entry.1
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

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f52818x;

    public Entry(Parcel parcel) {
        this.f52818x = 0.0f;
        this.f52818x = parcel.readFloat();
        setY(parcel.readFloat());
        if (parcel.readInt() == 1) {
            setData(parcel.readParcelable(Object.class.getClassLoader()));
        }
    }

    public Entry copy() {
        return new Entry(this.f52818x, getY(), getData());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equalTo(Entry entry) {
        if (entry == null || entry.getData() != getData()) {
            return false;
        }
        float fAbs = Math.abs(entry.f52818x - this.f52818x);
        float f14 = Utils.FLOAT_EPSILON;
        return fAbs <= f14 && Math.abs(entry.getY() - getY()) <= f14;
    }

    public float getX() {
        return this.f52818x;
    }

    public void setX(float f14) {
        this.f52818x = f14;
    }

    public String toString() {
        return "Entry, x: " + this.f52818x + " y: " + getY();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        parcel.writeFloat(this.f52818x);
        parcel.writeFloat(getY());
        if (getData() == null) {
            parcel.writeInt(0);
        } else {
            if (!(getData() instanceof Parcelable)) {
                throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
            }
            parcel.writeInt(1);
            parcel.writeParcelable((Parcelable) getData(), i14);
        }
    }

    public Entry(float f14, float f15) {
        super(f15);
        this.f52818x = f14;
    }

    public Entry(float f14, float f15, Object obj) {
        super(f15, obj);
        this.f52818x = f14;
    }

    public Entry(float f14, float f15, Drawable drawable) {
        super(f15, drawable);
        this.f52818x = f14;
    }

    public Entry(float f14, float f15, Drawable drawable, Object obj) {
        super(f15, drawable, obj);
        this.f52818x = f14;
    }

    public Entry() {
        this.f52818x = 0.0f;
    }
}
