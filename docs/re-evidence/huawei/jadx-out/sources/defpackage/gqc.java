package defpackage;

import com.amap.api.services.district.DistrictSearchQuery;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.up.request.HttpRequestBase;
import com.tencent.open.SocialConstants;
import com.tencent.open.SocialOperation;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class gqc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("CException")
    private a f35882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("GetOtherUserInfoRsp")
    private b f35883b;

    @SerializedName("resultCode")
    private int d;

    /* JADX INFO: loaded from: classes30.dex */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName(SocialConstants.PARAM_APP_DESC)
        private String f35889a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("type")
        private int f35890c;

        @SerializedName("siteID")
        private int d;
    }

    /* JADX INFO: loaded from: classes30.dex */
    public static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName(DistrictSearchQuery.KEYWORDS_PROVINCE)
        private String f35891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("nationalCode")
        private String f35892c;

        @SerializedName(DistrictSearchQuery.KEYWORDS_CITY)
        private String e;
    }

    public void e(int i) {
        this.d = i;
    }

    public int e() {
        return this.d;
    }

    public b d() {
        return this.f35883b;
    }

    public static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("otherUserInfoList")
        private List<c> f35884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("otherUserInfo")
        private c f35885c;

        @SerializedName("reault")
        private int d;

        @SerializedName("version")
        private String e;

        public c a() {
            return this.f35885c;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("ext")
        private String f35886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName(CommonConstant.KEY_GENDER)
        private int f35887b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("ageGroupFlag")
        private int f35888c;

        @SerializedName("frdOrigin")
        private d d;

        @SerializedName("frdState")
        private int e;

        @SerializedName("needVerify")
        private int f;

        @SerializedName("imageURLDownload")
        private String g;

        @SerializedName("imageURL")
        private String h;

        @SerializedName("loginID")
        private String i;

        @SerializedName("nickName")
        private String j;

        @SerializedName("rCY")
        private String k;

        @SerializedName("phoneDigest")
        private String l;

        @SerializedName("privacySetFlags")
        private String m;

        @SerializedName("region")
        private e n;

        @SerializedName(SocialOperation.GAME_SIGNATURE)
        private String o;

        @SerializedName("siteID")
        private int p;

        @SerializedName("userAccount")
        private String q;

        @SerializedName(HwPayConstant.KEY_USER_ID)
        private String r;

        @SerializedName("userType")
        private int t;

        public String c() {
            return this.q;
        }

        public String e() {
            return this.h;
        }

        public String a() {
            return this.j;
        }
    }

    /* JADX INFO: loaded from: classes30.dex */
    static class a {

        @SerializedName("errorCode")
        private int d;

        @SerializedName(HttpRequestBase.TAG_ERROR_DESC)
        private String e;

        a() {
        }
    }
}
