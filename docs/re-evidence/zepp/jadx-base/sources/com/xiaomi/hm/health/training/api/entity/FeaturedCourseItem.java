package com.xiaomi.hm.health.training.api.entity;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes21.dex */
public class FeaturedCourseItem implements Parcelable {
    public static final Parcelable.Creator<FeaturedCourseItem> CREATOR = new a();
    public Integer actionAmount;
    public Integer difficultyDegree;
    public String id;
    public String labelValue;
    public String listImgUrl;
    public String name;
    public Integer participantNumber;
    public long remainingTime;

    public class a implements Parcelable.Creator<FeaturedCourseItem> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FeaturedCourseItem createFromParcel(Parcel parcel) {
            return new FeaturedCourseItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FeaturedCourseItem[] newArray(int i) {
            return new FeaturedCourseItem[i];
        }
    }

    public FeaturedCourseItem() {
        this.difficultyDegree = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeInt(this.actionAmount.intValue());
        parcel.writeInt(this.difficultyDegree.intValue());
        parcel.writeInt(this.participantNumber.intValue());
        parcel.writeLong(this.remainingTime);
        parcel.writeString(this.listImgUrl);
        parcel.writeString(this.labelValue);
    }

    public FeaturedCourseItem(Parcel parcel) {
        this.difficultyDegree = 0;
        this.id = parcel.readString();
        this.name = parcel.readString();
        this.actionAmount = Integer.valueOf(parcel.readInt());
        this.difficultyDegree = Integer.valueOf(parcel.readInt());
        this.participantNumber = Integer.valueOf(parcel.readInt());
        this.remainingTime = parcel.readLong();
        this.listImgUrl = parcel.readString();
        this.labelValue = parcel.readString();
    }
}
