package com.xiaomi.aicr.vision.ocr;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class OCRRes$OCRParagraph implements Parcelable {
    public static final Parcelable.Creator<OCRRes$OCRParagraph> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OCRRes$OCRLine[] f11110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11111b;

    public class a implements Parcelable.Creator<OCRRes$OCRParagraph> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OCRRes$OCRParagraph createFromParcel(Parcel parcel) {
            return new OCRRes$OCRParagraph(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public OCRRes$OCRParagraph[] newArray(int i) {
            return new OCRRes$OCRParagraph[i];
        }
    }

    public OCRRes$OCRParagraph(Parcel parcel) {
        this.f11110a = (OCRRes$OCRLine[]) parcel.createTypedArray(OCRRes$OCRLine.CREATOR);
        this.f11111b = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f11110a, i);
        parcel.writeString(this.f11111b);
    }

    public OCRRes$OCRParagraph() {
    }
}
