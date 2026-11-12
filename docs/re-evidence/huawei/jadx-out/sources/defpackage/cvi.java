package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.IRequest;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.tencent.open.SocialConstants;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes6.dex */
public class cvi implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f31405a = "ActivityKakaParamsReq";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(ParsedFieldTag.KAKA_REDEEM_GIFT_ID)
    private String f31406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("activityId")
    private String f31407c;

    @SerializedName("activityCode")
    private String d;

    @SerializedName("awardRecordId")
    private String e;

    @SerializedName("receiverPhone")
    private String f;

    @SerializedName("receiverRemark")
    private String g;

    @SerializedName(SocialConstants.PARAM_RECEIVER)
    private String h;

    @SerializedName("awardType")
    private String i;

    @SerializedName("receiverAddr")
    private String j;

    @SerializedName("timeZone")
    private String m;
    private int n;

    private cvi(c cVar) {
        this.f31407c = cVar.f31408a;
        this.e = cVar.d;
        this.d = cVar.e;
        this.f31406b = cVar.f31410c;
        this.i = cVar.f31409b;
        this.h = cVar.h;
        this.f = cVar.g;
        this.j = cVar.j;
        this.g = cVar.i;
        this.m = cVar.m;
        this.n = cVar.f;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        String str;
        String str2;
        int i = this.n;
        if (i != 1) {
            str = "achievementUrl";
            if (i == 20001) {
                str2 = "/achievement/acceptAward";
            } else if (i == 20002) {
                str2 = "/achievement/exchangeGift";
            } else {
                LogUtil.j(f31405a, "getUrl handleSaveAchievementInfo source error");
                str = "";
                str2 = "";
            }
        } else {
            str = "activityUrl";
            str2 = "/activity/acceptAward";
        }
        return GRSManager.c(BaseApplication.b()).getUrl(str) + str2;
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f31408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f31409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f31410c;
        private String d;
        private String e;
        private int f;
        private String g;
        private String h;
        private String i;
        private String j;
        private String m;

        public c b(String str) {
            this.f31408a = str;
            return this;
        }

        public c c(String str) {
            this.d = str;
            return this;
        }

        public c a(String str) {
            this.e = str;
            return this;
        }

        public c e(String str) {
            this.f31410c = str;
            return this;
        }

        public c d(String str) {
            this.f31409b = str;
            return this;
        }

        public c h(String str) {
            this.h = str;
            return this;
        }

        public c i(String str) {
            this.g = str;
            return this;
        }

        public c f(String str) {
            this.j = str;
            return this;
        }

        public c j(String str) {
            this.i = str;
            return this;
        }

        public c g(String str) {
            this.m = str;
            return this;
        }

        public c b(int i) {
            this.f = i;
            return this;
        }

        public cvi d() {
            return new cvi(this);
        }
    }
}
