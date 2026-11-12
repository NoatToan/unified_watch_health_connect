package com.xiaomi.aicr.nlp;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class Entity implements Parcelable {
    public static final Parcelable.Creator<Entity> CREATOR = new a();
    public static final int NER_TYPE_BCN = 4;
    public static final int NER_TYPE_CAR = 7;
    public static final int NER_TYPE_ENO = 9;
    public static final int NER_TYPE_FLN = 6;
    public static final int NER_TYPE_ID = 2;
    public static final int NER_TYPE_LOCATION = 1;
    public static final int NER_TYPE_ORDER = 8;
    public static final int NER_TYPE_TEL = 3;
    public static final int NER_TYPE_TRAIN = 5;
    public static final int NER_TYPE_UNKNOW = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11097b;
    public int c;
    public int d;

    public class a implements Parcelable.Creator<Entity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Entity createFromParcel(Parcel parcel) {
            return new Entity(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Entity[] newArray(int i) {
            return new Entity[i];
        }
    }

    public Entity(Parcel parcel) {
        this.c = -1;
        this.d = -1;
        this.f11096a = parcel.readString();
        this.f11097b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "text: " + this.f11096a + ",mType:" + this.f11097b + ",start:" + this.c + ",end" + this.d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11096a);
        parcel.writeInt(this.f11097b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
