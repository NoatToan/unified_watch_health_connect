package com.ximalaya.ting.android.opensdk.model.album;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes22.dex */
public class RecommendTrack implements Parcelable {
    public static final Parcelable.Creator<RecommendTrack> CREATOR = new Parcelable.Creator<RecommendTrack>() { // from class: com.ximalaya.ting.android.opensdk.model.album.RecommendTrack.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RecommendTrack createFromParcel(Parcel parcel) {
            return new RecommendTrack(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RecommendTrack[] newArray(int i) {
            return new RecommendTrack[i];
        }
    };

    @SerializedName("human_recommend_real_title")
    private String realTitle;

    @SerializedName("human_recommend_track_id")
    private long trackId;

    @SerializedName("human_recommend_track_title")
    private String trackTitle;
    private long uid;

    public RecommendTrack() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getRealTitle() {
        return this.realTitle;
    }

    public long getTrackId() {
        return this.trackId;
    }

    public String getTrackTitle() {
        return this.trackTitle;
    }

    public long getUid() {
        return this.uid;
    }

    public void setRealTitle(String str) {
        this.realTitle = str;
    }

    public void setTrackId(long j) {
        this.trackId = j;
    }

    public void setTrackTitle(String str) {
        this.trackTitle = str;
    }

    public void setUid(long j) {
        this.uid = j;
    }

    public String toString() {
        return "RecommendTrack [uid=" + this.uid + ", trackId=" + this.trackId + ", realTitle=" + this.realTitle + ", tackTitle=" + this.trackTitle + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.uid);
        parcel.writeLong(this.trackId);
        parcel.writeString(this.realTitle);
        parcel.writeString(this.trackTitle);
    }

    public RecommendTrack(Parcel parcel) {
        this.uid = parcel.readLong();
        this.trackId = parcel.readLong();
        this.realTitle = parcel.readString();
        this.trackTitle = parcel.readString();
    }
}
