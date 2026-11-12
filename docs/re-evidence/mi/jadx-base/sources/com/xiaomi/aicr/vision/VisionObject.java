package com.xiaomi.aicr.vision;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class VisionObject implements Parcelable {
    public static final Parcelable.Creator<VisionObject> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public VisionAttribute f11100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, float[]> f11101b;

    public class a implements Parcelable.Creator<VisionObject> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VisionObject createFromParcel(Parcel parcel) {
            VisionAttribute visionAttribute = (VisionAttribute) parcel.readParcelable(VisionAttribute.class.getClassLoader());
            return (visionAttribute.a() & 16777216) == 16777216 ? new Text(parcel, visionAttribute) : new VisionObject(parcel, visionAttribute);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public VisionObject[] newArray(int i) {
            return new VisionObject[i];
        }
    }

    public VisionObject() {
        this(new VisionAttribute(-1));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f11100a, i);
        parcel.writeStringList(new ArrayList(this.f11101b.keySet()));
        for (float[] fArr : this.f11101b.values()) {
            parcel.writeInt(fArr.length);
            parcel.writeFloatArray(fArr);
        }
    }

    public VisionObject(VisionAttribute visionAttribute) {
        this.f11101b = new HashMap();
        this.f11100a = visionAttribute;
    }

    public VisionObject(Parcel parcel, VisionAttribute visionAttribute) {
        this(visionAttribute);
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            float[] fArr = new float[parcel.readInt()];
            parcel.readFloatArray(fArr);
            this.f11101b.put((String) arrayList.get(i), fArr);
        }
    }
}
