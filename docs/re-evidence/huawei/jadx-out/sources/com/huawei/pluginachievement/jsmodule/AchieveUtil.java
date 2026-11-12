package com.huawei.pluginachievement.jsmodule;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginachievement.manager.model.MedalConfigInfo;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import defpackage.ddv;
import defpackage.njy;
import defpackage.oru;
import defpackage.osb;
import defpackage.osf;
import defpackage.osv;
import defpackage.oth;
import defpackage.otl;
import defpackage.pap;
import defpackage.paq;
import defpackage.qrs;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class AchieveUtil extends JsBaseModule {
    private static final String CLIENT_TYPE_HONOR = "2";
    private static final String CLIENT_TYPE_HUAWEI = "1";
    private static final String CLIENT_TYPE_PAD = "5";
    private static final String CLIENT_TYPE_THIRD = "3";
    private static final String KAKA_TASK_RULE_ID = "taskRuleId";
    private static final int RESULT_OK = 200;

    @JavascriptInterface
    public void openEditAddressPage(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("awardRecordId", str);
        bundle.putString("activityId", str2);
        AppRouter.c("/HWUserProfileMgr/WriteDeliveryInfoActivity").d(bundle).b(BaseApplication.getContext());
    }

    @JavascriptInterface
    public void openVmallDetail(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        Intent intentCreateWebViewIntent = ddv.b().createWebViewIntent(this.mContext, bundle, 268435456);
        if (intentCreateWebViewIntent != null) {
            this.mContext.startActivity(intentCreateWebViewIntent);
        }
    }

    @JavascriptInterface
    public String getNickName() {
        String strE = osb.e(this.mContext.getApplicationContext());
        return !TextUtils.isEmpty(strE) ? strE : LoginInit.getInstance(this.mContext).getAccountInfo(1002);
    }

    @JavascriptInterface
    public int getiVersion(int i) {
        return otl.b(BaseApplication.getContext()).d(i);
    }

    @JavascriptInterface
    public void openMyAwardPage() {
        AppRouter.c("/HWUserProfileMgr/MyAwardActivity").b(this.mContext);
    }

    @JavascriptInterface
    public void openMyAwardPage(long j, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("from", str);
        AppRouter.c("/HWUserProfileMgr/MyAwardActivity").d(bundle).b(this.mContext);
        onSuccessCallback(j, true);
    }

    @JavascriptInterface
    public static String getClientType() {
        if (SystemInfo.d()) {
            return "1";
        }
        if (SystemInfo.c() || SystemInfo.j()) {
            return "2";
        }
        if (qrs.ah(BaseApplication.getContext())) {
            return "5";
        }
        return "3";
    }

    @JavascriptInterface
    public void finishKakaTask(String str, String str2) {
        LogUtil.d(this.TAG, "finishKakaTask taskRuleId = ", str, " params =", str2);
        HashMap map = new HashMap(2);
        if (!TextUtils.isEmpty(str2)) {
            osv.d(str2, map);
        }
        oru.a(BaseApplication.getContext()).c(BaseApplication.getContext(), str, map);
    }

    @JavascriptInterface
    public void finishKakaTaskV2(String str) {
        ReleaseLogUtil.d(this.TAG, "BuyVip finishKakaTaskV2 params =", str);
        HashMap map = new HashMap(2);
        osv.d(str, map);
        if (map.containsKey(KAKA_TASK_RULE_ID) && (map.get(KAKA_TASK_RULE_ID) instanceof String)) {
            String str2 = (String) map.get(KAKA_TASK_RULE_ID);
            LogUtil.a(this.TAG, "BuyVip finishKakaTaskV2 taskRuleId = ", str2);
            oru.a(BaseApplication.getContext()).c(BaseApplication.getContext(), str2, map);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0038  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    @JavascriptInterface
    public void isFinishAllTasks(long j) {
        int iIntValue;
        int iIntValue2;
        boolean z = false;
        Map<String, Object> mapC = pap.c(pap.a(), 0);
        if (mapC.containsKey("task_size")) {
            Object obj = mapC.get("task_size");
            if (obj instanceof Integer) {
                iIntValue = ((Integer) obj).intValue();
            } else {
                iIntValue = 0;
            }
        } else {
            iIntValue = 0;
        }
        if (mapC.containsKey("finish_count")) {
            Object obj2 = mapC.get("finish_count");
            if (obj2 instanceof Integer) {
                iIntValue2 = ((Integer) obj2).intValue();
            } else {
                iIntValue2 = 0;
            }
        } else {
            iIntValue2 = 0;
        }
        LogUtil.a(this.TAG, "isFinishAllTasks taskSize ", Integer.valueOf(iIntValue), " finishCount ", Integer.valueOf(iIntValue2));
        if (iIntValue != 0 && iIntValue2 == iIntValue) {
            z = true;
        }
        onSuccessCallback(j, Boolean.valueOf(z));
    }

    @JavascriptInterface
    public void scrollToTop(long j) {
        UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(27);
        userAchieveWrapper.setResultCode("0");
        oth.b(this.mContext).d(200, userAchieveWrapper);
        onSuccessCallback(j, true);
    }

    @JavascriptInterface
    public void showTotalKakaNum(long j, int i) {
        LogUtil.a(this.TAG, "showTotalKakaNum:", Integer.valueOf(i));
        if (i < 0) {
            return;
        }
        UserAchieveWrapper userAchieveWrapper = new UserAchieveWrapper(28);
        userAchieveWrapper.setResultCode("0");
        oth.b(this.mContext).d(i, userAchieveWrapper);
        onSuccessCallback(j, true);
    }

    @JavascriptInterface
    public void getMedalsImage(final long j, final String str) {
        LogUtil.a(this.TAG, "getMedalsImage medals= ", str);
        if (TextUtils.isEmpty(str)) {
            onSuccessCallback(j, false);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.pluginachievement.jsmodule.AchieveUtil.2
                @Override // java.lang.Runnable
                public void run() {
                    ArrayList<String> arrayListC = paq.c(str);
                    LogUtil.a(AchieveUtil.this.TAG, "getMedalsImage medalList= ", arrayListC.toString());
                    AchieveUtil.this.getMedalsImageUrl(j, arrayListC);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getMedalsImageUrl(long j, List<String> list) {
        if (njy.e(list)) {
            onSuccessCallback(j, false);
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        List<osf> listD = otl.b(BaseApplication.getContext()).d(9, new HashMap(2));
        for (String str : list) {
            for (osf osfVar : listD) {
                if (osfVar instanceof MedalConfigInfo) {
                    MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVar;
                    if (str.equals(medalConfigInfo.acquireMedalID())) {
                        arrayList.add(medalConfigInfo.acquireLightListStyle());
                        break;
                    }
                }
            }
        }
        LogUtil.a(this.TAG, "getMedalsImage medalUrls ", arrayList.toString());
        onSuccessCallback(j, arrayList);
    }
}
