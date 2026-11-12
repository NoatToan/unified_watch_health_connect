package com.xiaomi.aicr.vision.imagesegment;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SegmentResult implements Parcelable {
    public static final Parcelable.Creator<SegmentResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<Bitmap> f11102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<float[]> f11103b;
    public List<float[]> c;

    public class a implements Parcelable.Creator<SegmentResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SegmentResult createFromParcel(Parcel parcel) {
            return new SegmentResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SegmentResult[] newArray(int i) {
            return new SegmentResult[i];
        }
    }

    public SegmentResult() {
    }

    public List<Bitmap> a() {
        return this.f11102a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f11102a);
        parcel.writeList(this.f11103b);
        parcel.writeList(this.c);
    }

    public SegmentResult(Parcel parcel) {
        this.f11102a = parcel.createTypedArrayList(Bitmap.CREATOR);
        ArrayList arrayList = new ArrayList();
        this.f11103b = arrayList;
        parcel.readList(arrayList, float[].class.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.c = arrayList2;
        parcel.readList(arrayList2, float[].class.getClassLoader());
    }
}
