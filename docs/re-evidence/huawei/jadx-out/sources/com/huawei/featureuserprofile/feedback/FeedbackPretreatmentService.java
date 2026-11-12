package com.huawei.featureuserprofile.feedback;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.featureuserprofile.R;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.router.Guidepost;
import com.huawei.haf.router.facade.service.PretreatmentService;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.lli;
import defpackage.lmf;
import defpackage.lra;
import defpackage.qpx;
import health.compact.a.SharedPreferenceManager;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class FeedbackPretreatmentService implements PretreatmentService {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f5557c = {"com.tencent.qqpimsecure", "com.qihoo360.mobilesafe", "com.mpoyit.zawcgm", "com.zxly.assist", "com.anguanjia.safe", "com.fractalist.SystemOptimizer", "com.tencent.qlauncher.lite", "com.baoruan.launcher2", "com.hola.launcher", "com.dianxinos.dxhome", "com.nd.android.pandahome2", "com.mili.launcher", "com.tencent.launcher", "com.Dean.launcher", "com.gau.go.launcherex", "com.cleanmaster.mguard_cn", "com.isyezon.kbatterydoctor", "com.mdhlkj.batterysaver", "com.ijinshan.kbatterydoctor"};
    private static String e = "FeedbackPretreatmentService";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f5559b;
    private Context d;
    private boolean j = false;

    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        Uri uriO = guidepost.o();
        if (uriO == null) {
            LogUtil.j(e, "onPretreatment uri is null!");
            return false;
        }
        LogUtil.a(e, "onPretreatment uri:", uriO.toString());
        this.d = BaseApplication.b();
        if (lli.e().d()) {
            qpx.e(this.d, R.string.wallet_unenable_country);
            return false;
        }
        if (!SharedPreferenceManager.b(Integer.toString(PrebakedEffectId.RT_FLY), "Initialized_Feedback", false)) {
            qpx.e(this.d, R.string.IDS_submit_error_message_1);
            return false;
        }
        String queryParameter = uriO.getQueryParameter("isDevice");
        this.f5559b = queryParameter;
        boolean z = "1".equals(queryParameter) || "3".equals(this.f5559b);
        if (z || "4".equals(this.f5559b)) {
            this.f5558a = uriO.getQueryParameter("device_id");
            this.j = "true".equals(uriO.getQueryParameter("enhancement_mode"));
        } else {
            lra.d().a();
        }
        if (!z) {
            if ("4".equals(this.f5559b)) {
                d();
            } else {
                a();
            }
        } else {
            b();
        }
        return false;
    }

    private void a() {
        LogUtil.a(e, "gotoFeedback()");
        String strValue = AnalyticsValue.HEALTH_MINE_QA_2040026.value();
        HashMap map = new HashMap();
        map.put("click", 1);
        lmf.d().c(this.d, strValue, map, 0);
        b(this.d);
        int iA = lli.e().a(BaseApplication.j(), true);
        if (iA == 0) {
            LogUtil.a(e, "gotoFeedback successful");
        } else {
            LogUtil.a(e, "gotoFeedback errorCode : ", Integer.valueOf(iA));
        }
    }

    private void b() {
        LogUtil.a(e, "gotoDeviceFeedback()");
        AppRouter.c("/Device/QuestionSuggestionActivity").c("deviceType", this.f5559b).c("device_id", this.f5558a).e("enhancement_mode", this.j).b(this.d);
    }

    private void d() {
        LogUtil.a(e, "gotoScaleDeviceFeedback()");
        AppRouter.c("/Device/WeightQuestionSuggestionActivity").c("deviceType", this.f5559b).c("uniqueId", this.f5558a).e("enhancement_mode", this.j).b(this.d);
    }

    private void b(Context context) {
        LogUtil.a(e, "getThreeAppInfos");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            LogUtil.j(e, "PackageManager is null");
            return;
        }
        for (String str : f5557c) {
            try {
                packageManager.getApplicationInfo(str, 0);
                lra.d().e("third_app", str);
                LogUtil.a(e, "package : ", str);
            } catch (PackageManager.NameNotFoundException e2) {
                LogUtil.e(e, "writeThirdAppInfos fail ", e2.getMessage());
            }
        }
    }
}
