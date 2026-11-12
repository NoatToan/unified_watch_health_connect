package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.tencent.open.SocialOperation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class voe extends CloudCommonReponse {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("FindUserV2Rsp")
    private d f51396c = new d();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("nationalCode")
        private String f51397a;
    }

    public d b() {
        return this.f51396c;
    }

    public static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("findUserInfo")
        private List<b> f51401b = new ArrayList();

        public List<b> d() {
            return this.f51401b;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("needVerify")
        private int f51398a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName(CommonConstant.KEY_GENDER)
        private int f51400c;

        @SerializedName(HwPayConstant.KEY_USER_ID)
        private long g;

        @SerializedName("region")
        private a h;

        @SerializedName("siteID")
        private int i;

        @SerializedName("userType")
        private int o;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("imageURL")
        private String f51399b = "";

        @SerializedName("imageURLDownload")
        private String e = "";

        @SerializedName("nickName")
        private String d = "";

        @SerializedName(SocialOperation.GAME_SIGNATURE)
        private String f = "";

        @SerializedName("phoneDigest")
        private String j = "";

        public long e() {
            return this.g;
        }

        public String a() {
            return this.f51399b;
        }
    }

    @Override // com.huawei.hwcloudmodel.model.CloudCommonReponse
    public String toString() {
        StringBuilder sb = new StringBuilder("FindUserV2Response{FindUserV2Rsp=");
        if (b() != null) {
            sb.append(" findUserInfo=");
            if (b().d().size() != 0) {
                sb.append(", userID='");
                sb.append(b().d().get(0).e());
                sb.append(", imageURL='");
                sb.append(b().d().get(0).a());
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
