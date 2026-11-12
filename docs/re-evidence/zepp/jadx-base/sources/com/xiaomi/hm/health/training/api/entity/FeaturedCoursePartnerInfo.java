package com.xiaomi.hm.health.training.api.entity;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes21.dex */
public class FeaturedCoursePartnerInfo implements Parcelable {
    public static final Parcelable.Creator<FeaturedCoursePartnerInfo> CREATOR = new a();
    public String id;
    public String mifitCircleUrl;
    public String partnerBackgroundImg;
    public String partnerIntroduction;
    public String partnerLogo;
    public String partnerRecommendation;
    public String partnerTitle;

    public class a implements Parcelable.Creator<FeaturedCoursePartnerInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FeaturedCoursePartnerInfo createFromParcel(Parcel parcel) {
            return new FeaturedCoursePartnerInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FeaturedCoursePartnerInfo[] newArray(int i) {
            return new FeaturedCoursePartnerInfo[i];
        }
    }

    public FeaturedCoursePartnerInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.partnerTitle);
        parcel.writeString(this.partnerRecommendation);
        parcel.writeString(this.partnerIntroduction);
        parcel.writeString(this.partnerLogo);
        parcel.writeString(this.partnerBackgroundImg);
        parcel.writeString(this.mifitCircleUrl);
    }

    public FeaturedCoursePartnerInfo(Parcel parcel) {
        this.id = parcel.readString();
        this.partnerTitle = parcel.readString();
        this.partnerRecommendation = parcel.readString();
        this.partnerIntroduction = parcel.readString();
        this.partnerLogo = parcel.readString();
        this.partnerBackgroundImg = parcel.readString();
        this.mifitCircleUrl = parcel.readString();
    }
}
