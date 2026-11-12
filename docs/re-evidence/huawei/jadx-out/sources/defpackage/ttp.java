package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.GRSManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class ttp {
    public void e(final IBaseResponseCallback iBaseResponseCallback) {
        GRSManager.c(BaseApplication.getContext()).d("healthCloudUrl", new GrsQueryCallback() { // from class: ttp.5
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                LogUtil.a("SCUI_ThreeCirclePerfectDaysHelper", "hostUrl is ", str);
                ttp.this.e(str, iBaseResponseCallback);
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                ReleaseLogUtil.e("SCUI_ThreeCirclePerfectDaysHelper", "requestPerformanceBestOfHistory getUrl failed resultCode = ", Integer.valueOf(i));
                iBaseResponseCallback.a(-1, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, IBaseResponseCallback iBaseResponseCallback) {
        Map<String, Object> mapAddPublicParams = HealthEngineRequestManager.addPublicParams();
        HashSet hashSet = new HashSet();
        hashSet.add("accumPerfectGoalAchievedDays");
        mapAddPublicParams.put("accumulatedItems", hashSet);
        Map<String, String> mapAddPublicHeaders = HealthEngineRequestManager.addPublicHeaders();
        e eVar = (e) oet.d().e(str + "/dataQuery/report/getPersonalReport", mapAddPublicHeaders, ofe.c(mapAddPublicParams), e.class);
        if (eVar == null || eVar.c() == null) {
            ReleaseLogUtil.a("SCUI_ThreeCirclePerfectDaysHelper", "requestPerformanceBestOfHistory() PerfectDaysResponses is null");
            iBaseResponseCallback.a(-1, null);
        } else {
            if (eVar.b() != 0) {
                ReleaseLogUtil.e("SCUI_ThreeCirclePerfectDaysHelper", "requestPerformanceBestOfHistory fail resultCode is ", Integer.valueOf(eVar.b()), " resultDesc is ", eVar.a());
                iBaseResponseCallback.a(-1, null);
                return;
            }
            ttj.e eVarD = eVar.c().d();
            LogUtil.a("SCUI_ThreeCirclePerfectDaysHelper", "pData is ", eVarD);
            iBaseResponseCallback.a(0, eVarD);
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("resultCode")
        private int f49649a;

        @SerializedName("accumulatedReports")
        private ttj d;

        @SerializedName("resultDesc")
        private String e;

        private e() {
        }

        public int b() {
            return this.f49649a;
        }

        public String a() {
            return this.e;
        }

        public ttj c() {
            return this.d;
        }

        public String toString() {
            return "PerfectDaysResponses{resultCode=" + this.f49649a + ", resultDesc=" + this.e + ", accumulatedReports=" + this.d + '}';
        }
    }
}
