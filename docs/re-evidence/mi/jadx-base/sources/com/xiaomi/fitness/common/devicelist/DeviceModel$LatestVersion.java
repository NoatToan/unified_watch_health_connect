package com.xiaomi.fitness.common.devicelist;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceModel$LatestVersion implements Serializable {
    public String changeLog;

    @SerializedName("diff_md5")
    public String diffMd5;

    @SerializedName("diff_safe_url")
    public String diffUrl;
    public boolean force;
    public String md5;

    @SerializedName("upload_time")
    public Long uploadTime;

    @SerializedName("safe_url")
    public String url;
    public String version;

    public String getFullPackageMD5() {
        return this.md5;
    }

    public String getFullPackageUrl() {
        return this.url;
    }

    public String getMD5() {
        return !TextUtils.isEmpty(this.diffUrl) ? this.diffMd5 : this.md5;
    }

    public String getUrl() {
        return !TextUtils.isEmpty(this.diffUrl) ? this.diffUrl : this.url;
    }

    public boolean isValid() {
        return !TextUtils.isEmpty(this.version);
    }
}
