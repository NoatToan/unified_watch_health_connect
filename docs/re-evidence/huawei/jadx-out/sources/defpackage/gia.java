package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.plan.model.intplan.IntPlanBean;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gia implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("intPlan")
    private IntPlanBean f35163a;

    private gia(a aVar) {
        this.f35163a = aVar.f35164b;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.h();
    }

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IntPlanBean f35164b;

        public a a(IntPlanBean intPlanBean) {
            this.f35164b = intPlanBean;
            return this;
        }

        public gia e() {
            return new gia(this);
        }
    }
}
