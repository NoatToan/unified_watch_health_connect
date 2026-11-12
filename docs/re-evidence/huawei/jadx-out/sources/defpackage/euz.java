package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.datatype.MarketingOption;
import com.huawei.health.marketing.datatype.PositionIdSet;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.Tasks;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.OperationUtilsApi;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public class euz {
    public static void b(MarketingOption marketingOption) {
        int pageId = marketingOption.getPageId();
        ArrayList<Integer> positionIdList = PositionIdSet.getPositionIdList(pageId);
        String extendParam = marketingOption.getExtendParam();
        if (positionIdList.isEmpty()) {
            LogUtil.d("R_MarketingDataProvider", "requestByMarketingOption failed, positionId is empty, pageID: " + pageId);
        } else {
            Task<Map<Integer, ResourceResultInfo>> taskA = a(positionIdList, extendParam, false);
            evj.b().b(String.valueOf(pageId), taskA);
            taskA.addOnSuccessListener(new AnonymousClass4(marketingOption, pageId));
        }
    }

    /* JADX INFO: renamed from: euz$4, reason: invalid class name */
    class AnonymousClass4 implements OnSuccessListener<Map<Integer, ResourceResultInfo>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f33501c;
        final /* synthetic */ MarketingOption d;

        AnonymousClass4(MarketingOption marketingOption, int i) {
            this.d = marketingOption;
            this.f33501c = i;
        }

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final Map<Integer, ResourceResultInfo> map) {
            if (map == null) {
                LogUtil.c("R_MarketingDataProvider", "ResultInfoMap is null.");
            } else {
                if (this.d.getContext() == null) {
                    LogUtil.d("R_MarketingDataProvider", "caller is dead, pageID: " + this.f33501c);
                    return;
                }
                ThreadPoolManager.c().execute(new Runnable() { // from class: euz.4.4
                    @Override // java.lang.Runnable
                    public void run() {
                        final int i = 1;
                        final Map<Integer, ResourceResultInfo> mapA = evc.a(map, null, 1);
                        HandlerExecutor.b(new Runnable() { // from class: euz.4.4.5
                            @Override // java.lang.Runnable
                            public void run() {
                                new evh(AnonymousClass4.this.d).d(i, mapA, (Map<String, ?>) null);
                            }
                        });
                    }
                });
            }
        }
    }

    public static Task<Map<Integer, ResourceResultInfo>> d(List<Integer> list, String str, boolean z) {
        LogUtil.b("R_MarketingDataProvider", "requestByPositionIdList..." + list, " isGateway:", Boolean.valueOf(z));
        return a(list, str, z);
    }

    /* JADX INFO: renamed from: euz$2, reason: invalid class name */
    class AnonymousClass2 implements Callable<Map<Integer, ResourceResultInfo>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f33498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f33499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f33500c;

        AnonymousClass2(List list, String str, boolean z) {
            this.f33499b = list;
            this.f33500c = str;
            this.f33498a = z;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map<Integer, ResourceResultInfo> call() throws Exception {
            final Map<Integer, ResourceResultInfo> mapD = null;
            if (njy.e(this.f33499b)) {
                LogUtil.d("R_MarketingDataProvider", "doRequest failed, positionIdList is null.");
                return null;
            }
            if (!VersionControlUtil.isSupportOperationAccount()) {
                LogUtil.e("R_MarketingDataProvider", "doRequest abort, Minor Account detected");
                return null;
            }
            if (Utils.k()) {
                LogUtil.e("R_MarketingDataProvider", "doRequest abort, no cloud area detected");
                return null;
            }
            if (Utils.o()) {
                String accountInfo = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1010);
                if (!((OperationUtilsApi) Services.b("PluginOperation", OperationUtilsApi.class)).isOperation(accountInfo)) {
                    LogUtil.e("R_MarketingDataProvider", "doRequest abort, this country is not in operation, code:" + accountInfo);
                    return null;
                }
                if (!ddv.b().switchToMarketingTwo()) {
                    LogUtil.e("R_MarketingDataProvider", "doRequest abort, do not use marketing 2.0");
                    return null;
                }
            }
            evc evcVar = new evc(1);
            if (CommonUtil.ab(BaseApplication.b())) {
                LogUtil.b("R_MarketingDataProvider", "network ok, do requesting... " + this.f33499b);
                mapD = euz.b(this.f33499b, this.f33500c, this.f33498a);
                if (mapD != null && !mapD.isEmpty()) {
                    HandlerCenter.a().d(new Runnable() { // from class: eve
                        @Override // java.lang.Runnable
                        public final void run() {
                            eux.b(mapD);
                        }
                    }, 30000L);
                } else {
                    LogUtil.e("R_MarketingDataProvider", "resultInfoMap from cloud is null....");
                }
            } else {
                LogUtil.b("R_MarketingDataProvider", "network NOT ok, cancel requesting...");
            }
            if (mapD == null || mapD.isEmpty()) {
                LogUtil.b("R_MarketingDataProvider", "resultInfoMap is empty, read from cache...");
                mapD = eux.d(this.f33499b);
            }
            return evcVar.d(mapD);
        }
    }

    private static Task<Map<Integer, ResourceResultInfo>> a(List<Integer> list, String str, boolean z) {
        Task<Map<Integer, ResourceResultInfo>> taskCallInBackground = Tasks.callInBackground(new AnonymousClass2(list, str, z));
        taskCallInBackground.addOnFailureListener(new OnFailureListener() { // from class: evd
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                LogUtil.e("R_MarketingDataProvider", "doRequest failed!!! e:" + exc.toString());
            }
        });
        return taskCallInBackground;
    }

    public static Map<Integer, ResourceResultInfo> a(JSONObject jSONObject, List<Integer> list) {
        final Map<Integer, ResourceResultInfo> mapE;
        evc evcVar = new evc(1);
        if (jSONObject == null) {
            LogUtil.e("R_MarketingDataProvider", "parseFromJsonObject failed, JsonObject is null, requesting from DB...");
            return a(list);
        }
        if (list.size() != 1) {
            LogUtil.b("R_MarketingDataProvider", "parseFromJsonObject... parse multi position res");
            mapE = evb.e(jSONObject, null, false);
        } else {
            Integer num = list.get(0);
            num.intValue();
            LogUtil.b("R_MarketingDataProvider", "parseFromJsonObject... parse single position res");
            ResourceResultInfo resourceResultInfoC = evb.c(jSONObject);
            mapE = new HashMap<>();
            mapE.put(num, resourceResultInfoC);
        }
        if (mapE == null || mapE.isEmpty()) {
            LogUtil.e("R_MarketingDataProvider", "parseFromJsonObject failed, parse failed, requesting from DB...");
            return a(list);
        }
        HandlerCenter.a().d(new Runnable() { // from class: evg
            @Override // java.lang.Runnable
            public final void run() {
                eux.b(mapE);
            }
        }, 30000L);
        Map<Integer, ResourceResultInfo> mapD = evcVar.d(mapE);
        LogUtil.b("R_MarketingDataProvider", "parseFromJsonObject success, content:" + mapD);
        return mapD;
    }

    public static Map<Integer, ResourceResultInfo> a(List<Integer> list) {
        return new evc(1).d(eux.d(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<Integer, ResourceResultInfo> b(List<Integer> list, String str, boolean z) {
        LogUtil.b("R_MarketingDataProvider", "start requesting marketing resource, positionIds: ", list);
        String strA = evf.a(list, str, 1, z);
        if (TextUtils.isEmpty(strA)) {
            LogUtil.e("R_MarketingDataProvider", "startReq result is invaild.");
            return new HashMap();
        }
        if (!strA.contains("resultInfo")) {
            LogUtil.e("R_MarketingDataProvider", "no positionId configured. ", list.toString());
            return new HashMap();
        }
        LogUtil.b("R_MarketingDataProvider", "requesting marketing resource success, start processing...");
        return evb.c(strA, str);
    }
}
