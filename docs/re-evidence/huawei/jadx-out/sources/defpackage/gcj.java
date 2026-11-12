package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;

/* JADX INFO: loaded from: classes29.dex */
public class gcj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(HwPayConstant.KEY_USER_ID)
    private long f34892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("needVerify")
    private int f34893c;

    @SerializedName("imageURL")
    private String d = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("imageURLDownload")
    private String f34891a = "";

    @SerializedName("nickName")
    private String e = "";

    public String toString() {
        return "UserInfo{mUserId=" + this.f34892b + ", mNeedVerify=" + this.f34893c + ", mImageUrl='" + this.d + "', mImageUrlDownload='" + this.f34891a + "', mNickname='" + this.e + "'}";
    }
}
