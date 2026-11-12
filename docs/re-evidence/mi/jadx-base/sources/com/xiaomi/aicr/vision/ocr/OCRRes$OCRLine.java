package com.xiaomi.aicr.vision.ocr;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class OCRRes$OCRLine implements Parcelable {
    public static final Parcelable.Creator<OCRRes$OCRLine> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OCRRes$Location f11108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11109b;
    public int c;
    public OCRRes$OCRChar[] d;
    public float e;

    public class a implements Parcelable.Creator<OCRRes$OCRLine> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OCRRes$OCRLine createFromParcel(Parcel parcel) {
            return new OCRRes$OCRLine(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public OCRRes$OCRLine[] newArray(int i) {
            return new OCRRes$OCRLine[i];
        }
    }

    public OCRRes$OCRLine(Parcel parcel) {
        this.f11108a = (OCRRes$Location) parcel.readParcelable(OCRRes$Location.class.getClassLoader());
        this.f11109b = parcel.readString();
        this.c = parcel.readInt();
        this.d = (OCRRes$OCRChar[]) parcel.createTypedArray(OCRRes$OCRChar.CREATOR);
        this.e = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f11108a, i);
        parcel.writeString(this.f11109b);
        parcel.writeInt(this.c);
        parcel.writeTypedArray(this.d, i);
        parcel.writeFloat(this.e);
    }
}
