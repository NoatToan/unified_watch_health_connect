package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;

/* JADX INFO: loaded from: classes7.dex */
public class fel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(RecommendConstants.DOWNLOAD_URL)
    private String f33945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(BleConstants.KEY_PATH)
    private String f33946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(RecommendConstants.FILE_ID)
    private String f33947c;

    @SerializedName(RecommendConstants.VER)
    private int d;
    private int e;

    public String c() {
        return this.f33947c;
    }

    public fel a(String str) {
        this.f33947c = str;
        return this;
    }

    public int e() {
        return this.d;
    }

    public fel e(int i) {
        this.d = i;
        return this;
    }

    public fel b(String str) {
        this.f33945a = str;
        return this;
    }

    public int b() {
        return this.e;
    }

    public fel a(int i) {
        this.e = i;
        return this;
    }

    public String d() {
        return this.f33946b;
    }

    public fel c(String str) {
        this.f33946b = str;
        return this;
    }

    public String toString() {
        return "VoiceConfigData{mFileName='" + this.f33947c + "', mVersion=" + this.d + ", mDownloadUrl='" + this.f33945a + "', mFileSize=" + this.e + ", mFilePath='" + this.f33946b + "'}";
    }
}
