package defpackage;

import com.huawei.health.suggestion.RunCourseRecommendCallback;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.fitnessdatatype.Vo2maxDetail;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes29.dex */
public class gnk implements IBaseResponseCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RunCourseRecommendCallback f35810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35811b = 0;

    gnk(RunCourseRecommendCallback runCourseRecommendCallback) {
        this.f35810a = runCourseRecommendCallback;
    }

    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
    /* JADX INFO: renamed from: onResponse */
    public void a(int i, Object obj) {
        hcp hcpVar = new hcp();
        if (obj instanceof Vo2maxDetail) {
            Vo2maxDetail vo2maxDetail = (Vo2maxDetail) obj;
            LogUtil.a("Suggest_MyBaseResponseCallback", "System.currentTimeMillis()= ", Long.valueOf(System.currentTimeMillis()), " detail.getTimestamp() = ", Long.valueOf(vo2maxDetail.getTimestamp()));
            if (System.currentTimeMillis() - vo2maxDetail.getTimestamp() < 2592000000L) {
                this.f35811b = vo2maxDetail.getVo2maxValue();
                hcpVar.a(true);
            }
        } else {
            hcpVar.a(false);
            LogUtil.a("Suggest_MyBaseResponseCallback", "! objData instanceof Vo2maxDetail= ");
        }
        hcpVar.d(this.f35811b);
        LogUtil.a("Suggest_MyBaseResponseCallback", "errcode= ", Integer.valueOf(i), "mVo2max= ", Integer.valueOf(this.f35811b));
        this.f35810a.onSuccess(gnr.c(hcpVar));
    }
}
