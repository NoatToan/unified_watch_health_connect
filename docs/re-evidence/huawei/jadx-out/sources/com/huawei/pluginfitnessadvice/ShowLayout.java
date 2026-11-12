package com.huawei.pluginfitnessadvice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.tencent.connect.share.QzonePublish;

/* JADX INFO: loaded from: classes14.dex */
public class ShowLayout implements Parcelable {
    public static final Parcelable.Creator<ShowLayout> CREATOR = new Parcelable.Creator<ShowLayout>() { // from class: com.huawei.pluginfitnessadvice.ShowLayout.3
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShowLayout createFromParcel(Parcel parcel) {
            return new ShowLayout(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShowLayout[] newArray(int i) {
            return new ShowLayout[i];
        }
    };

    @SerializedName("imageJumpUrl")
    private String mImageJumpUrl;

    @SerializedName("imageUrl")
    private String mImageUrl;

    @SerializedName("type")
    private int mType;

    @SerializedName("videoCoverUrl")
    private String mVideoCoverUrl;

    @SerializedName(QzonePublish.PUBLISH_TO_QZONE_VIDEO_SIZE)
    private long mVideoSize;

    @SerializedName("videoUrl")
    private String mVideoUrl;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected ShowLayout(Parcel parcel) {
        this.mType = parcel.readInt();
        this.mImageUrl = parcel.readString();
        this.mImageJumpUrl = parcel.readString();
        this.mVideoUrl = parcel.readString();
        this.mVideoSize = parcel.readLong();
        this.mVideoCoverUrl = parcel.readString();
    }

    private ShowLayout(e eVar) {
        this.mType = eVar.e;
        this.mImageUrl = eVar.f22326b;
        this.mImageJumpUrl = eVar.f22327c;
        this.mVideoUrl = eVar.g;
        this.mVideoSize = eVar.d;
        this.mVideoCoverUrl = eVar.f22325a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mType);
        parcel.writeString(this.mImageUrl);
        parcel.writeString(this.mImageJumpUrl);
        parcel.writeString(this.mVideoUrl);
        parcel.writeLong(this.mVideoSize);
        parcel.writeString(this.mVideoCoverUrl);
    }

    /* JADX INFO: loaded from: classes41.dex */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f22325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f22326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f22327c;
        private long d;
        private int e;
        private String g;
    }

    public int getType() {
        return this.mType;
    }

    public String getImageUrl() {
        return this.mImageUrl;
    }

    public String getImageJumpUrl() {
        return this.mImageJumpUrl;
    }

    public String getVideoUrl() {
        return this.mVideoUrl;
    }

    public long getVideoSize() {
        return this.mVideoSize;
    }

    public String getVideoCoverUrl() {
        return this.mVideoCoverUrl;
    }

    public String toString() {
        return "ShowLayout{mType=" + this.mType + ", mImageUrl='" + this.mImageUrl + "', mImageJumpUrl='" + this.mImageJumpUrl + "', mVideoUrl='" + this.mVideoUrl + "', mVideoSize=" + this.mVideoSize + ", mVideoCoverUrl='" + this.mVideoCoverUrl + "'}";
    }
}
