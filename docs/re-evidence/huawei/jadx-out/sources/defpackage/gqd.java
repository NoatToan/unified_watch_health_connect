package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwlogsmodel.LogUtil;
import com.tencent.open.SocialOperation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes30.dex */
public class gqd extends CloudCommonReponse {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("FindUserV2Rsp")
    private b f35893b = new b();

    public static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("nationalCode")
        private String f35898c;
    }

    public b e() {
        return this.f35893b;
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("findUserInfo")
        private List<c> f35894c = new ArrayList();

        public List<c> a() {
            return this.f35894c;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName(CommonConstant.KEY_GENDER)
        private int f35895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("needVerify")
        private int f35896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("ageGroupFlag")
        private int f35897c;

        @SerializedName("region")
        private d g;

        @SerializedName("siteID")
        private int j;

        @SerializedName(HwPayConstant.KEY_USER_ID)
        private long k;

        @SerializedName("userType")
        private int o;

        @SerializedName("imageURL")
        private String e = "";

        @SerializedName("imageURLDownload")
        private String d = "";

        @SerializedName("nickName")
        private String h = "";

        @SerializedName(SocialOperation.GAME_SIGNATURE)
        private String f = "";

        @SerializedName("phoneDigest")
        private String i = "";

        public long a() {
            return this.k;
        }

        public String c() {
            return this.e;
        }

        public String d() {
            return this.h;
        }

        public String e() {
            JSONObject jSONObject = new JSONObject(new LinkedHashMap());
            try {
                jSONObject.put("ageGroupFlag", this.f35897c);
                jSONObject.put(CommonConstant.KEY_GENDER, this.f35895a);
                jSONObject.put("imageURL", this.e);
                jSONObject.put("imageURLDownload", this.d);
                jSONObject.put("needVerify", this.f35896b);
                jSONObject.put("nickName", this.h);
                jSONObject.put("phoneDigest", this.i);
                jSONObject.put("region", HiJsonUtil.d(this.g));
                jSONObject.put(SocialOperation.GAME_SIGNATURE, this.f);
                jSONObject.put("siteID", this.j);
                jSONObject.put(HwPayConstant.KEY_USER_ID, this.k);
                jSONObject.put("userType", this.o);
            } catch (JSONException e) {
                LogUtil.e("FindUserInfo", "Exception = ", e.getMessage());
            }
            return jSONObject.toString();
        }
    }

    @Override // com.huawei.hwcloudmodel.model.CloudCommonReponse
    public String toString() {
        StringBuilder sb = new StringBuilder("FindUserV2Response{FindUserV2Rsp=");
        if (e() != null) {
            sb.append(" findUserInfo=");
            if (e().a().size() != 0) {
                sb.append(", userID='");
                sb.append(e().a().get(0).a());
                sb.append(", imageURL='");
                sb.append(e().a().get(0).c());
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
