package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.operation.utils.Constants;

/* JADX INFO: loaded from: classes7.dex */
public class ffz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("fileSize")
    private String f34008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(Constants.ACTIVITY_SHARE_TYPE)
    private String f34009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("thumbnail")
    private String f34010c;

    @SerializedName("thumbnailSize")
    private String d;

    @SerializedName("subTitle")
    private String e;

    @SerializedName("title")
    private String f;

    @SerializedName("uri")
    private String h;

    @SerializedName("url")
    private String j;

    public void d(String str) {
        this.f34009b = str;
    }

    public void g(String str) {
        this.h = str;
    }

    public void f(String str) {
        this.j = str;
    }

    public void j(String str) {
        this.f = str;
    }

    public void a(String str) {
        this.e = str;
    }

    public void c(String str) {
        this.f34010c = str;
    }

    public void e(String str) {
        this.d = str;
    }

    public void b(String str) {
        this.f34008a = str;
    }

    public String toString() {
        return "ShareParamData{mShareType='" + this.f34009b + "', mUri='" + this.h + "', mUrl='" + this.j + "', mTitle='" + this.f + "', mSubTitle='" + this.e + "', mThumbnail='" + this.f34010c + "', mThumbnailSize='" + this.d + "', mFileSize='" + this.f34008a + "'}";
    }
}
