package com.xiaomi.fitness.summary.recycler;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public class SportBehaviorModel implements Parcelable {
    public static final Parcelable.Creator<SportBehaviorModel> CREATOR = new a();
    public static final int DATA_TYPE_COMMON = 0;
    public static final int DATA_TYPE_LEVEL = 1;
    public static final int TYPE_AEROBIC = 0;
    public static final int TYPE_ANAEROBIC = 1;
    public static final int TYPE_DIVING_CNS = 2;
    public static final int TYPE_DIVING_NO_FLY = 4;
    public static final int TYPE_DIVING_OTU = 3;
    public static final int TYPE_PEEK_TRAINING = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f13233b;
    public int c;
    public int d;
    public String e;
    public String f;
    public String g;
    public int h;
    public int i;

    public class a implements Parcelable.Creator<SportBehaviorModel> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SportBehaviorModel createFromParcel(Parcel parcel) {
            return new SportBehaviorModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SportBehaviorModel[] newArray(int i) {
            return new SportBehaviorModel[i];
        }
    }

    public SportBehaviorModel(int i, String str, String str2, String str3, int i2, int i3) {
        this.d = 0;
        this.i = -1;
        this.f13232a = i;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = i2;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13232a);
        parcel.writeFloat(this.f13233b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h);
    }

    public SportBehaviorModel(int i, float f, int i2, int i3, int i4) {
        this.i = -1;
        this.f13232a = i;
        this.f13233b = f;
        this.c = i2;
        this.d = i3;
        this.h = i4;
    }

    public SportBehaviorModel(Parcel parcel) {
        this.d = 0;
        this.i = -1;
        this.f13232a = parcel.readInt();
        this.f13233b = parcel.readFloat();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readInt();
    }
}
