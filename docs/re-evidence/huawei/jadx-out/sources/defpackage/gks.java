package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;
import com.huawei.pluginfitnessadvice.plandata.UserInfoBean;

/* JADX INFO: loaded from: classes29.dex */
public class gks implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("userInfo")
    private UserInfoBean f35438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("returnAlgorithmInfos")
    private Boolean f35439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("weekIndex")
    private Integer f35440c;

    private gks(d dVar) {
        this.f35438a = dVar.f35441b;
        this.f35440c = dVar.f35442c;
        this.f35439b = dVar.e;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.cf();
    }

    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private UserInfoBean f35441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f35442c;
        private Boolean e;

        public d b(UserInfoBean userInfoBean) {
            this.f35441b = userInfoBean;
            return this;
        }

        public d c(Integer num) {
            this.f35442c = num;
            return this;
        }

        public d d(Boolean bool) {
            this.e = bool;
            return this;
        }

        public gks d() {
            return new gks(this);
        }
    }
}
