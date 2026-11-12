package defpackage;

import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qsv {
    public static final void b(String str, String str2) {
        qsq qsqVar = (qsq) qsr.c().c(str, str2, qsq.class);
        if (qsqVar == null) {
            return;
        }
        e(str, qsqVar.a(), c(qsqVar));
    }

    private static boolean c(qsq qsqVar) {
        List<String> listA;
        boolean zC;
        boolean zE;
        if (qsqVar.a() == 2) {
            LogUtil.j("HomeFragmentConfigUtil", "isSupposeNewHome IS_SWITCH_OPEN:", 1);
            return false;
        }
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LogUtil.j("HomeFragmentConfigUtil", "isSupposeNewHome isBrowseMode true.");
            return false;
        }
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.j("HomeFragmentConfigUtil", "currentHuid is empty.");
            return false;
        }
        String strC = CommonUtil.c(BaseApplication.getContext());
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("HomeFragmentConfigUtil", "currentVersion is empty.");
            return false;
        }
        qsz qszVarA = a(qsqVar, strC);
        if (qsy.b(qszVarA == null ? qsqVar.d() : qszVarA.d(), accountInfo)) {
            LogUtil.j("HomeFragmentConfigUtil", "isSupposeNewHome huid is blocked!");
            return false;
        }
        if (qszVarA == null) {
            listA = qsqVar.i();
        } else {
            listA = qszVarA.a();
        }
        if (!qsy.e(listA, LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010))) {
            LogUtil.j("HomeFragmentConfigUtil", "isSupposeNewHome not white list country!");
            return false;
        }
        if (qszVarA != null) {
            LogUtil.a("HomeFragmentConfigUtil", "versionInnerConfigBean enter.");
            zE = qsy.e(qszVarA.c());
            zC = qsy.c(qszVarA.e(), accountInfo);
        } else {
            boolean zE2 = qsy.e(qsqVar.e());
            zC = qsy.c(qsqVar.b(), accountInfo);
            zE = zE2;
        }
        LogUtil.a("HomeFragmentConfigUtil", "isDeviceTypeSupport:", Boolean.valueOf(zE), ",isHuidSupport:", Boolean.valueOf(zC));
        return zE && zC;
    }

    private static qsz a(qsq qsqVar, String str) {
        if (njy.e(qsqVar.c())) {
            LogUtil.j("HomeFragmentConfigUtil", "getInnerConfig SupportVersions is empty.");
            return null;
        }
        for (qsz qszVar : qsqVar.c()) {
            if (qszVar != null) {
                String strB = qszVar.b();
                if (!TextUtils.isEmpty(strB) && str.contains(strB)) {
                    return qszVar;
                }
            }
        }
        return null;
    }

    private static void e(String str, int i, boolean z) {
        LogUtil.a("HomeFragmentConfigUtil", "saveNewHomeConfigToSp configName: ", str, ", openType: ", Integer.valueOf(i));
        if (i == 1) {
            SharedPreferenceManager.a(str, str, z);
        } else if (i == 2) {
            SharedPreferenceManager.a(str, str, false);
        } else {
            SharedPreferenceManager.a(str, str, false);
        }
    }
}
