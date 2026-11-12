package com.xiaomi.aicr.vision.ocr;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class OCRRes$Location implements Parcelable {
    public static final Parcelable.Creator<OCRRes$Location> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f11104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f11105b;

    public class a implements Parcelable.Creator<OCRRes$Location> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OCRRes$Location createFromParcel(Parcel parcel) {
            return new OCRRes$Location(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public OCRRes$Location[] newArray(int i) {
            return new OCRRes$Location[i];
        }
    }

    public OCRRes$Location(Parcel parcel) {
        this.f11104a = parcel.createFloatArray();
        this.f11105b = parcel.createFloatArray();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloatArray(this.f11104a);
        parcel.writeFloatArray(this.f11105b);
    }
}
