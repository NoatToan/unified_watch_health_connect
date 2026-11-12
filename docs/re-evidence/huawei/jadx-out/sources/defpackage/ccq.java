package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class ccq {
    public static void a(final String str, final ResponseCallback<ffd> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("HL_HealthChallengeTimeUtil", "getHealthLifeChallenges callback is null");
            return;
        }
        if (!cbg.ac()) {
            LogUtil.j("HL_HealthChallengeTimeUtil", "getHealthLifeChallenges isJoinHealthModel false source ", str);
            responseCallback.onResponse(0, null);
        } else if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: ccp
                @Override // java.lang.Runnable
                public final void run() {
                    ccq.a(str, (ResponseCallback<ffd>) responseCallback);
                }
            });
        } else if (!CommonUtil.ab(BaseApplication.b())) {
            LogUtil.j("HL_HealthChallengeTimeUtil", "getHealthLifeChallenges isNetworkConnected false source ", str);
            responseCallback.onResponse(-1, null);
        } else {
            int iA = DateFormatUtil.a(System.currentTimeMillis());
            bwh.b().b(iA, iA, new ResultCallback<bwm>() { // from class: ccq.5
                @Override // com.huawei.networkclient.ResultCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(bwm bwmVar) {
                    if (bwmVar == null) {
                        LogUtil.j("HL_HealthChallengeTimeUtil", "getHealthLifeChallenges onSuccess response is null source ", str);
                        responseCallback.onResponse(-1, null);
                        return;
                    }
                    int iB = bwmVar.b();
                    List<ffd> listC = bwmVar.c();
                    if (iB != 0 || njy.e(listC)) {
                        LogUtil.j("HL_HealthChallengeTimeUtil", "getHealthLifeChallenges onSuccess response ", bwmVar, " source ", str);
                        responseCallback.onResponse(iB, null);
                    } else {
                        LogUtil.a("HL_HealthChallengeTimeUtil", "getHealthLifeChallenges onSuccess data ", bwmVar.toString());
                        ccq.e(listC, responseCallback);
                    }
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    LogUtil.j("HL_HealthChallengeTimeUtil", "getHealthLifeChallenges onFailure ", LogAnonymous.b(th), " source ", str);
                    responseCallback.onResponse(-1, null);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(List<ffd> list, ResponseCallback<ffd> responseCallback) {
        ffd ffdVar = list.get(0);
        for (ffd ffdVar2 : list) {
            if (ffdVar2 != null) {
                int iA = ffdVar2.a();
                if (iA == 0) {
                    ffdVar = ffdVar2;
                    break;
                } else if (ffdVar == null || iA <= ffdVar.a()) {
                    LogUtil.d("HL_HealthChallengeTimeUtil", "parseChallenges other time");
                } else {
                    ffdVar = ffdVar2;
                }
            }
        }
        int iA2 = DateFormatUtil.a(System.currentTimeMillis());
        if (ffdVar != null && ffdVar.a() == iA2) {
            ffdVar = null;
        }
        if (ffdVar == null) {
            LogUtil.j("HL_HealthChallengeTimeUtil", "parseChallenges jsonObject is null");
            responseCallback.onResponse(0, null);
        } else if (iA2 < ffdVar.b()) {
            LogUtil.a("HL_HealthChallengeTimeUtil", "switch system time");
            responseCallback.onResponse(0, null);
        } else {
            responseCallback.onResponse(0, ffdVar);
        }
    }

    public static void b() {
        a("HL_HealthChallengeTimeUtil", (ResponseCallback<ffd>) new ResponseCallback() { // from class: ccs
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                ccq.a(i, (ffd) obj);
            }
        });
    }

    static /* synthetic */ void a(int i, ffd ffdVar) {
        LogUtil.a("HL_HealthChallengeTimeUtil", "setHealthGoalId errorCode ", Integer.valueOf(i), " object ", ffdVar);
        if (ffdVar == null) {
            return;
        }
        ccy.d("health_model_challenge_id", String.valueOf(ffdVar.c()));
        ccy.d("health_model_current_challenge_join_time", String.valueOf(ffdVar.b()));
    }
}
