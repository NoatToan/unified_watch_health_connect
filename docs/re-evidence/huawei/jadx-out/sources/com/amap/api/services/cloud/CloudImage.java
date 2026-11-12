package com.amap.api.services.cloud;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes21.dex */
public class CloudImage implements Parcelable {
    public static final Parcelable.Creator<CloudImage> CREATOR = new Parcelable.Creator<CloudImage>() { // from class: com.amap.api.services.cloud.CloudImage.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CloudImage createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CloudImage[] newArray(int i) {
            return a(i);
        }

        private static CloudImage a(Parcel parcel) {
            return new CloudImage(parcel);
        }

        private static CloudImage[] a(int i) {
            return new CloudImage[i];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f3518c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CloudImage(String str, String str2, String str3) {
        this.f3516a = str;
        this.f3517b = str2;
        this.f3518c = str3;
    }

    public CloudImage(Parcel parcel) {
        this.f3516a = parcel.readString();
        this.f3517b = parcel.readString();
        this.f3518c = parcel.readString();
    }

    public String getId() {
        return this.f3516a;
    }

    public void setId(String str) {
        this.f3516a = str;
    }

    public String getPreurl() {
        return this.f3517b;
    }

    public void setPreurl(String str) {
        this.f3517b = str;
    }

    public String getUrl() {
        return this.f3518c;
    }

    public void setUrl(String str) {
        this.f3518c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3516a);
        parcel.writeString(this.f3517b);
        parcel.writeString(this.f3518c);
    }
}
