package com.ximalaya.ting.android.opensdk.model.app;

import com.google.gson.annotations.SerializedName;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.xiaomi.market.sdk.Constants;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.datatrasfer.XimalayaResponse;

/* JADX INFO: loaded from: classes22.dex */
public class AppModel extends XimalayaResponse {

    @SerializedName("created_at")
    private long createdAt;

    @SerializedName("id")
    private long dataId;

    @SerializedName("download_url")
    private String downloadUrl;

    @SerializedName("file_name")
    private String filename;

    @SerializedName("sdk_or_app_name")
    private String name;

    @SerializedName(DTransferConstants.CLIENT_OS_TYPE)
    private int osType;

    @SerializedName(DTransferConstants.PACKID)
    private String packId;

    @SerializedName("release_info")
    private String releaseInfo;

    @SerializedName("release_type")
    private int releaseType;

    @SerializedName(WatchFaceApi.SORT_UPDATED)
    private long updatedAt;

    @SerializedName(Constants.Update.VERSION_CODE)
    private int versionCode;

    @SerializedName("version_name")
    private String versionName;

    public long getCreatedAt() {
        return this.createdAt;
    }

    public long getDataId() {
        return this.dataId;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public String getFilename() {
        return this.filename;
    }

    public String getName() {
        return this.name;
    }

    public int getOsType() {
        return this.osType;
    }

    public String getPackId() {
        return this.packId;
    }

    public String getReleaseInfo() {
        return this.releaseInfo;
    }

    public int getReleaseType() {
        return this.releaseType;
    }

    public long getUpdatedAt() {
        return this.updatedAt;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public void setCreatedAt(long j) {
        this.createdAt = j;
    }

    public void setDataId(long j) {
        this.dataId = j;
    }

    public void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public void setFilename(String str) {
        this.filename = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOsType(int i) {
        this.osType = i;
    }

    public void setPackId(String str) {
        this.packId = str;
    }

    public void setReleaseInfo(String str) {
        this.releaseInfo = str;
    }

    public void setReleaseType(int i) {
        this.releaseType = i;
    }

    public void setUpdatedAt(long j) {
        this.updatedAt = j;
    }

    public void setVersionCode(int i) {
        this.versionCode = i;
    }

    public void setVersionName(String str) {
        this.versionName = str;
    }

    public String toString() {
        return "AppModel [dataId=" + this.dataId + ", releaseType=" + this.releaseType + ", name=" + this.name + ", packId=" + this.packId + ", osType=" + this.osType + ", versionCode=" + this.versionCode + ", versionName=" + this.versionName + ", releaseInfo=" + this.releaseInfo + ", downloadUrl=" + this.downloadUrl + ", updatedAt=" + this.updatedAt + ", createdAt=" + this.createdAt + ", filename=" + this.filename + "]";
    }
}
