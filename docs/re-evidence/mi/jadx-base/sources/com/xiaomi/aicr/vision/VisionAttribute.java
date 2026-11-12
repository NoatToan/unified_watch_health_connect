package com.xiaomi.aicr.vision;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class VisionAttribute implements Parcelable {
    public static final Parcelable.Creator<VisionAttribute> CREATOR = new a();
    public static final int VISION_TYPE_CLASS_BUILDING = 83886080;
    public static final int VISION_TYPE_CLASS_CAR = 67108864;
    public static final int VISION_TYPE_CLASS_ENTITY = 536870912;
    public static final int VISION_TYPE_CLASS_FACE = 50331648;
    public static final int VISION_TYPE_CLASS_TEXT = 16777216;
    public static final int VISION_TYPE_ENTITY_BCN = 536870916;
    public static final int VISION_TYPE_ENTITY_CAR = 536870919;
    public static final int VISION_TYPE_ENTITY_ENO = 536870921;
    public static final int VISION_TYPE_ENTITY_FLN = 536870918;
    public static final int VISION_TYPE_ENTITY_ID = 536870914;
    public static final int VISION_TYPE_ENTITY_LOCATION = 536870913;
    public static final int VISION_TYPE_ENTITY_ORDER = 536870920;
    public static final int VISION_TYPE_ENTITY_TEL = 536870915;
    public static final int VISION_TYPE_ENTITY_TRAIN = 536870917;
    public static final int VISION_TYPE_PRIVATE_INFO = 100663297;
    public static final int VISION_TYPE_TEXT_LINE = 16777217;
    public static final int VISION_TYPE_TEXT_PARAGRAPH = 16777218;
    public static final int VISION_TYPE_UNKNOW = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11099b;
    public Bundle c;
    public boolean d;
    public boolean e;

    public class a implements Parcelable.Creator<VisionAttribute> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VisionAttribute createFromParcel(Parcel parcel) {
            return new VisionAttribute(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public VisionAttribute[] newArray(int i) {
            return new VisionAttribute[i];
        }
    }

    public VisionAttribute() {
        this(-1);
    }

    public int a() {
        return this.f11098a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11098a);
        parcel.writeBoolean(this.f11099b);
        parcel.writeBundle(this.c);
        parcel.writeBoolean(this.d);
        parcel.writeBoolean(this.e);
    }

    public VisionAttribute(int i) {
        this(i, false);
    }

    public VisionAttribute(int i, boolean z) {
        this(i, z, false, false);
    }

    public VisionAttribute(boolean z, boolean z2) {
        this(-1, false, z, z2);
    }

    public VisionAttribute(int i, boolean z, boolean z2, boolean z3) {
        this.f11098a = i;
        this.f11099b = z;
        this.c = new Bundle();
        this.d = z2;
        this.e = z3;
    }

    public VisionAttribute(Parcel parcel) {
        this.f11098a = parcel.readInt();
        this.f11099b = parcel.readBoolean();
        this.c = parcel.readBundle();
        this.d = parcel.readBoolean();
        this.e = parcel.readBoolean();
    }
}
