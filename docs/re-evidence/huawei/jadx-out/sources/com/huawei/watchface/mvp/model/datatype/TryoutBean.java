package com.huawei.watchface.mvp.model.datatype;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class TryoutBean implements Parcelable {
    public static final Parcelable.Creator<TryoutBean> CREATOR = new Parcelable.Creator<TryoutBean>() { // from class: com.huawei.watchface.mvp.model.datatype.TryoutBean.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TryoutBean createFromParcel(Parcel parcel) {
            return new TryoutBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TryoutBean[] newArray(int i) {
            return new TryoutBean[i];
        }
    };
    private String cnTitle;
    private String detailUrl;
    private String fileSize;
    private String hashCode;
    private boolean isZip;
    private String productId;
    private String resourceType;
    private String title;

    @SerializedName("hitopId")
    private String tryOutHitopId;
    private String version;
    private String versionCode;
    private String watchScreen;

    public TryoutBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCnTitle() {
        return this.cnTitle;
    }

    public String getDetailUrl() {
        return this.detailUrl;
    }

    public String getFileSize() {
        return this.fileSize;
    }

    public String getHashCode() {
        return this.hashCode;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getResourceType() {
        return this.resourceType;
    }

    public String getShowTitle() {
        Locale locale = Locale.getDefault();
        if (TextUtils.isEmpty(this.cnTitle)) {
            return this.title;
        }
        return (locale.toString().contains("zh_") || locale.equals(Locale.CHINESE)) ? this.cnTitle : this.title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTryOutHiTopId() {
        return this.tryOutHitopId;
    }

    public String getVersion() {
        return this.version;
    }

    public String getVersionCode() {
        return this.versionCode;
    }

    public String getWatchScreen() {
        return this.watchScreen;
    }

    public boolean isZip() {
        return this.isZip;
    }

    public void setCnTitle(String str) {
        this.cnTitle = str;
    }

    public void setDetailUrl(String str) {
        this.detailUrl = str;
    }

    public void setFileSize(String str) {
        this.fileSize = str;
    }

    public void setHashCode(String str) {
        this.hashCode = str;
    }

    public void setProductId(String str) {
        this.productId = str;
    }

    public void setResourceType(String str) {
        this.resourceType = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTryOutHiTopId(String str) {
        this.tryOutHitopId = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setVersionCode(String str) {
        this.versionCode = str;
    }

    public void setWatchScreen(String str) {
        this.watchScreen = str;
    }

    public void setZip(boolean z) {
        this.isZip = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.tryOutHitopId);
        parcel.writeString(this.version);
        parcel.writeString(this.productId);
        parcel.writeString(this.fileSize);
        parcel.writeString(this.hashCode);
        parcel.writeString(this.title);
        parcel.writeString(this.cnTitle);
        parcel.writeString(this.detailUrl);
        parcel.writeString(this.versionCode);
        parcel.writeString(this.watchScreen);
        parcel.writeString(this.resourceType);
        parcel.writeByte(this.isZip ? (byte) 1 : (byte) 0);
    }

    public TryoutBean(Parcel parcel) {
        this.tryOutHitopId = parcel.readString();
        this.version = parcel.readString();
        this.productId = parcel.readString();
        this.fileSize = parcel.readString();
        this.hashCode = parcel.readString();
        this.title = parcel.readString();
        this.cnTitle = parcel.readString();
        this.detailUrl = parcel.readString();
        this.versionCode = parcel.readString();
        this.watchScreen = parcel.readString();
        this.resourceType = parcel.readString();
        this.isZip = parcel.readByte() != 0;
    }
}
