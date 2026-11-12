package com.ximalaya.ting.android.opensdk.model.album;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;

/* JADX INFO: loaded from: classes22.dex */
public class LastUpTrack implements Parcelable {
    public static Parcelable.Creator<LastUpTrack> CREATOR = new Parcelable.Creator<LastUpTrack>() { // from class: com.ximalaya.ting.android.opensdk.model.album.LastUpTrack.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LastUpTrack createFromParcel(Parcel parcel) {
            return new LastUpTrack(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LastUpTrack[] newArray(int i) {
            return new LastUpTrack[i];
        }
    };

    @SerializedName("created_at")
    private long createdAt;

    @SerializedName("duration")
    private long duration;

    @SerializedName("track_id")
    private long trackId;

    @SerializedName("track_title")
    private String trackTitle;

    @SerializedName(WatchFaceApi.SORT_UPDATED)
    private long updatedAt;

    public LastUpTrack() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getCreatedAt() {
        return this.createdAt;
    }

    public long getDuration() {
        return this.duration;
    }

    public long getTrackId() {
        return this.trackId;
    }

    public String getTrackTitle() {
        return this.trackTitle;
    }

    public long getUpdatedAt() {
        return this.updatedAt;
    }

    public void setCreatedAt(long j) {
        this.createdAt = j;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setTrackId(long j) {
        this.trackId = j;
    }

    public void setTrackTitle(String str) {
        this.trackTitle = str;
    }

    public void setUpdatedAt(long j) {
        this.updatedAt = j;
    }

    public String toString() {
        return "LastUpTrack [trackId=" + this.trackId + ", trackTitle=" + this.trackTitle + ", duration=" + this.duration + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.createdAt);
        parcel.writeLong(this.updatedAt);
        parcel.writeLong(this.trackId);
        parcel.writeLong(this.duration);
        parcel.writeString(this.trackTitle);
    }

    public LastUpTrack(Parcel parcel) {
        this.trackId = parcel.readLong();
        this.duration = parcel.readLong();
        this.createdAt = parcel.readLong();
        this.updatedAt = parcel.readLong();
        this.trackTitle = parcel.readString();
    }
}
