package defpackage;

import android.text.TextUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.health.userlabelmgr.api.UserLabelServiceApi;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthApi;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes23.dex */
public class ccu {
    public static void d(final ResponseCallback<bwx> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_HL_HealthModelCardReaderInfo", "getHealthModelStatus callback is null");
            return;
        }
        if (HandlerExecutor.c()) {
            cbg.c(ThreadPoolManager.c(), "HealthModelGetHealthModelStatus", new Runnable() { // from class: ccv
                @Override // java.lang.Runnable
                public final void run() {
                    ccu.d(responseCallback);
                }
            });
        } else if (!Utils.h()) {
            ReleaseLogUtil.c("R_HL_HealthModelCardReaderInfo", "getHealthModelStatus ifAllowLogin false");
            c(responseCallback);
        } else {
            bwk.d().e(new IBaseResponseCallback() { // from class: ccz
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    ccu.b(responseCallback, i, obj);
                }
            });
        }
    }

    static /* synthetic */ void b(ResponseCallback responseCallback, int i, Object obj) {
        LogUtil.a("HL_HealthModelCardReaderInfo", "getHealthModelStatus errorCode ", Integer.valueOf(i), " object ", obj);
        if (i == -1) {
            responseCallback.onResponse(i, null);
        } else if (obj instanceof bwx) {
            a((bwx) obj, responseCallback, true);
        }
    }

    private static void c(ResponseCallback<bwx> responseCallback) {
        bwx bwxVar = new bwx();
        bwxVar.c(cbg.r());
        bwxVar.b(cbg.w());
        bwxVar.d(cbg.ac() ? 1 : 0);
        bwxVar.e(cda.b() ? 1 : 0);
        a(bwxVar, responseCallback, false);
    }

    private static void a(bwx bwxVar, ResponseCallback<bwx> responseCallback, boolean z) {
        LogUtil.a("HL_HealthModelCardReaderInfo", "getHealthModelStatus data onSuccess");
        if (bwxVar == null || bwxVar.b() != 0) {
            ReleaseLogUtil.d("R_HL_HealthModelCardReaderInfo", "processResult data ", bwxVar);
            responseCallback.onResponse(-1, null);
            return;
        }
        int iD = bwxVar.d();
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        String strQ = cbg.q();
        if (iD == iA) {
            byu.c().c(strQ, iD, z);
            b(strQ, iD);
        }
        boolean z2 = iD > iA;
        if (z2) {
            cbg.ak();
        }
        ccy.d("health_model_is_join_future", String.valueOf(z2));
        ccy.c(iD, true);
        int iC = bwxVar.c();
        ccy.a(iC, true);
        ccy.d("health_model_challenge_join", String.valueOf(bwxVar.e()));
        boolean zAc = cbg.ac();
        c(zAc);
        if (zAc) {
            ccq.b();
        } else if (!z2) {
            d(false, false, new ResponseCallback() { // from class: cdc
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    LogUtil.a("HL_HealthModelCardReaderInfo", "processResult onResponse resultCode ", Integer.valueOf(i));
                }
            });
            responseCallback.onResponse(0, bwxVar);
            return;
        }
        e(strQ, iC, iD, responseCallback, bwxVar);
    }

    private static void e(String str, int i, int i2, ResponseCallback<bwx> responseCallback, bwx bwxVar) {
        int iA;
        if (i < i2 || i <= 0) {
            iA = 0;
        } else {
            HealthLifeBean healthLifeBeanD = bxd.d(str, 1, i);
            if (!cbg.h(healthLifeBeanD)) {
                LogUtil.j("HL_HealthModelCardReaderInfo", "processResult recordDbBean is null ");
                responseCallback.onResponse(0, bwxVar);
                return;
            }
            iA = cfu.a(str, i, healthLifeBeanD.getTarget());
        }
        LogUtil.a("HL_HealthModelCardReaderInfo", "processResult joinTime = ", Integer.valueOf(i2), ", upgradeTime = ", Integer.valueOf(i), " codeDelete=", Integer.valueOf(iA));
        responseCallback.onResponse(0, bwxVar);
    }

    private static void c(boolean z) {
        String str;
        UserLabelServiceApi userLabelServiceApi = (UserLabelServiceApi) Services.b("HWUserLabelMgr", UserLabelServiceApi.class);
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (z) {
            userLabelServiceApi.initLabel("health_sport_health_mode_user", "HealthModeUser", accountInfo);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("health_sport_health_mode_active");
        if (!userLabelServiceApi.getLabels(arrayList, accountInfo).contains("HealthModeActive_360+")) {
            str = "HealthModeUser_Quit";
        } else {
            str = "HealthModeUser_NotJoined";
        }
        userLabelServiceApi.initLabel("health_sport_health_mode_user", str, accountInfo);
    }

    private static void b(String str, int i) {
        HealthLifeBean healthLifeBeanD = bxd.d(str, 1, i);
        LogUtil.a("HL_HealthModelCardReaderInfo", "deleteBeforeJoinData join today and delete before data code: ", Integer.valueOf(bxc.c(str, i)));
        if (cbg.h(healthLifeBeanD)) {
            String target = healthLifeBeanD.getTarget();
            if (TextUtils.isEmpty(target)) {
                return;
            }
            cfu.a(str, i, target);
            return;
        }
        LogUtil.j("HL_HealthModelCardReaderInfo", "subscriptionDbBean is null");
    }

    public static void d(final boolean z, final boolean z2, final ResponseCallback<Object> responseCallback) {
        LogUtil.a("HL_HealthModelCardReaderInfo", "clearHealthModelLocalData");
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: cdd
                @Override // java.lang.Runnable
                public final void run() {
                    ccu.d(z, z2, responseCallback);
                }
            });
            return;
        }
        cfu.e("");
        int iD = cbg.d(z);
        if (iD != 0 && responseCallback != null) {
            responseCallback.onResponse(iD, "");
            return;
        }
        int iB = cbg.b();
        if (iB != 0 && responseCallback != null) {
            responseCallback.onResponse(iB, "");
            return;
        }
        HiUserPreference hiUserPreference = new HiUserPreference();
        HiHealthApi hiHealthApiD = HiHealthManager.d(BaseApplication.getContext());
        hiUserPreference.setKey("health_model_is_support_health_model_new");
        hiUserPreference.setValue("");
        LogUtil.a("HL_HealthModelCardReaderInfo", "clearHealthModelLocalData isSuccess key = isSupportNewHealthModel ", Boolean.valueOf(hiHealthApiD.setUserPreference(hiUserPreference)));
        Iterator<Integer> it = ffv.j().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            hiUserPreference.setKey("health_model_target_adjustment_date_" + iIntValue);
            hiUserPreference.setValue("");
            LogUtil.d("HL_HealthModelCardReaderInfo", "clearHealthModelLocalData accept isSuccess ", Boolean.valueOf(hiHealthApiD.setUserPreference(hiUserPreference)));
            hiUserPreference.setKey("health_model_ignored_target_adjustment_date_" + iIntValue);
            hiUserPreference.setValue("");
            LogUtil.d("HL_HealthModelCardReaderInfo", "clearHealthModelLocalData ignore isSuccess ", Boolean.valueOf(hiHealthApiD.setUserPreference(hiUserPreference)));
        }
        if (z2) {
            cbg.al();
        }
        if (responseCallback != null) {
            responseCallback.onResponse(0, "");
        }
    }
}
