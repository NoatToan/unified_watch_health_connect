package com.xiaomi.aicr.vision.ocr;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class OCRRes$OCRChar implements Parcelable {
    public static final Parcelable.Creator<OCRRes$OCRChar> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OCRRes$Location f11106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11107b;
    public float c;

    public class a implements Parcelable.Creator<OCRRes$OCRChar> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OCRRes$OCRChar createFromParcel(Parcel parcel) {
            return new OCRRes$OCRChar(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public OCRRes$OCRChar[] newArray(int i) {
            return new OCRRes$OCRChar[i];
        }
    }

    public OCRRes$OCRChar(Parcel parcel) {
        this.f11106a = (OCRRes$Location) parcel.readParcelable(OCRRes$Location.class.getClassLoader());
        this.f11107b = parcel.readString();
        this.c = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f11106a, i);
        parcel.writeString(this.f11107b);
        parcel.writeFloat(this.c);
    }
}
