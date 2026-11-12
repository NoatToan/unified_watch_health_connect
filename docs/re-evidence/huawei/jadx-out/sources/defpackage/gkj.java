package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.plan.model.UserFitnessPlanInfo;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gkj implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("userFitnessPlanInfo")
    private UserFitnessPlanInfo f35385a;

    private gkj(d dVar) {
        this.f35385a = dVar.f35386b;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.cb();
    }

    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private UserFitnessPlanInfo f35386b;

        public d e(UserFitnessPlanInfo userFitnessPlanInfo) {
            this.f35386b = userFitnessPlanInfo;
            return this;
        }

        public gkj e() {
            return new gkj(this);
        }
    }
}
