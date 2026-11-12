package com.ximalaya.ting.android.opensdk.model.album;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.util.XiMaDataSupport;

/* JADX INFO: loaded from: classes22.dex */
public class SubordinatedAlbum extends XiMaDataSupport implements Parcelable {
    public static final Parcelable.Creator<SubordinatedAlbum> CREATOR = new Parcelable.Creator<SubordinatedAlbum>() { // from class: com.ximalaya.ting.android.opensdk.model.album.SubordinatedAlbum.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SubordinatedAlbum createFromParcel(Parcel parcel) {
            SubordinatedAlbum subordinatedAlbum = new SubordinatedAlbum();
            subordinatedAlbum.readFromParcel(parcel);
            return subordinatedAlbum;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SubordinatedAlbum[] newArray(int i) {
            return new SubordinatedAlbum[i];
        }
    };

    @SerializedName("id")
    private long albumId;

    @SerializedName(DTransferConstants.ALBUM_TITLE)
    private String albumTitle;

    @SerializedName("cover_url_large")
    private String coverUrlLarge;

    @SerializedName("cover_url_middle")
    private String coverUrlMiddle;

    @SerializedName("cover_url_small")
    private String coverUrlSmall;
    private String recSrc;
    private String recTrack;
    private int serializeStatus;
    private long uptoDateTime;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getAlbumId() {
        return this.albumId;
    }

    public String getAlbumTitle() {
        return this.albumTitle;
    }

    public String getCoverUrlLarge() {
        return this.coverUrlLarge;
    }

    public String getCoverUrlMiddle() {
        return this.coverUrlMiddle;
    }

    public String getCoverUrlSmall() {
        return this.coverUrlSmall;
    }

    public String getRecSrc() {
        return this.recSrc;
    }

    public String getRecTrack() {
        return this.recTrack;
    }

    public int getSerializeStatus() {
        return this.serializeStatus;
    }

    public long getUptoDateTime() {
        return this.uptoDateTime;
    }

    public String getValidCover() {
        if (!TextUtils.isEmpty(this.coverUrlMiddle)) {
            return this.coverUrlMiddle;
        }
        if (TextUtils.isEmpty(this.coverUrlSmall)) {
            return !TextUtils.isEmpty(this.coverUrlLarge) ? this.coverUrlLarge : "";
        }
        return this.coverUrlSmall;
    }

    public void readFromParcel(Parcel parcel) {
        this.albumId = parcel.readLong();
        this.albumTitle = parcel.readString();
        this.coverUrlSmall = parcel.readString();
        this.coverUrlMiddle = parcel.readString();
        this.coverUrlLarge = parcel.readString();
        this.recSrc = parcel.readString();
        this.recTrack = parcel.readString();
        this.serializeStatus = parcel.readInt();
    }

    public void setAlbumId(long j) {
        this.albumId = j;
    }

    public void setAlbumTitle(String str) {
        this.albumTitle = str;
    }

    public void setCoverUrlLarge(String str) {
        this.coverUrlLarge = str;
    }

    public void setCoverUrlMiddle(String str) {
        this.coverUrlMiddle = str;
    }

    public void setCoverUrlSmall(String str) {
        this.coverUrlSmall = str;
    }

    public void setRecSrc(String str) {
        this.recSrc = str;
    }

    public void setRecTrack(String str) {
        this.recTrack = str;
    }

    public void setSerializeStatus(int i) {
        this.serializeStatus = i;
    }

    public void setUptoDateTime(long j) {
        this.uptoDateTime = j;
    }

    public String toString() {
        return "SubordinatedAlbum [albumId=" + this.albumId + ", albumTitle=" + this.albumTitle + ", coverUrlSmall=" + this.coverUrlSmall + ", coverUrlMiddle=" + this.coverUrlMiddle + ", coverUrlLarge=" + this.coverUrlLarge + ", recSrc=" + this.recSrc + ", recTrack=" + this.recTrack + ",serializeStatus=" + this.serializeStatus + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.albumId);
        parcel.writeString(this.albumTitle);
        parcel.writeString(this.coverUrlSmall);
        parcel.writeString(this.coverUrlMiddle);
        parcel.writeString(this.coverUrlLarge);
        parcel.writeString(this.recSrc);
        parcel.writeString(this.recTrack);
        parcel.writeInt(this.serializeStatus);
    }
}
