package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.plan.model.intplan.IntPlanBean;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gim implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("reportType")
    private int f35205a;

    @SerializedName("intPlan")
    private IntPlanBean e;

    private gim(c cVar) {
        this.e = cVar.f35206b;
        this.f35205a = cVar.f35207c;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.r();
    }

    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IntPlanBean f35206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f35207c;

        public c c(IntPlanBean intPlanBean) {
            this.f35206b = intPlanBean;
            return this;
        }

        public c b(int i) {
            this.f35207c = i;
            return this;
        }

        public gim b() {
            return new gim(this);
        }
    }
}
