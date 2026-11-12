package com.huawei.phoneservice.feedbackcommon.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public class FeedMedia implements Serializable, Parcelable {
    public static final Parcelable.Creator<FeedMedia> CREATOR = new d();
    private static final long serialVersionUID = -6196153509419034853L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("size")
    private String f21808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("attachId")
    private String f21809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("downloadURL")
    private String f21810c;

    @SerializedName("isReplay")
    private boolean d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f21808a);
        parcel.writeString(this.f21809b);
        parcel.writeString(this.f21810c);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
    }

    public String getSize() {
        return this.f21808a;
    }

    public String getDownloadURL() {
        return this.f21810c;
    }

    class d implements Parcelable.Creator<FeedMedia> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FeedMedia[] newArray(int i) {
            return new FeedMedia[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FeedMedia createFromParcel(Parcel parcel) {
            return new FeedMedia(parcel);
        }

        d() {
        }
    }

    public String getAttachId() {
        return this.f21809b;
    }

    protected FeedMedia(Parcel parcel) {
        this.d = false;
        this.f21808a = parcel.readString();
        this.f21809b = parcel.readString();
        this.f21810c = parcel.readString();
        this.d = parcel.readByte() != 0;
    }
}
