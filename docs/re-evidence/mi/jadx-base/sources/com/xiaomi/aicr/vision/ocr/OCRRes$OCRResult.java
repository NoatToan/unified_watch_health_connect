package com.xiaomi.aicr.vision.ocr;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class OCRRes$OCRResult implements Parcelable {
    public static final Parcelable.Creator<OCRRes$OCRResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OCRRes$OCRParagraph[] f11112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11113b;

    public class a implements Parcelable.Creator<OCRRes$OCRResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OCRRes$OCRResult createFromParcel(Parcel parcel) {
            return new OCRRes$OCRResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public OCRRes$OCRResult[] newArray(int i) {
            return new OCRRes$OCRResult[i];
        }
    }

    public OCRRes$OCRResult(Parcel parcel) {
        this.f11112a = (OCRRes$OCRParagraph[]) parcel.createTypedArray(OCRRes$OCRParagraph.CREATOR);
        this.f11113b = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f11112a, i);
        parcel.writeString(this.f11113b);
    }
}
