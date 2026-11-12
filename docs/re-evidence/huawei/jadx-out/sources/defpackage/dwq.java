package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class dwq {
    public static void e() {
        if (CommonUtil.ab(BaseApplication.getContext())) {
            b();
        } else {
            LogUtil.j("HonorPrivacyUtils", "querySignResult no connect network.");
            d("");
        }
    }

    public static void c(boolean z) {
        LogUtil.a("HonorPrivacyUtils", "reportSignResult isSign: ", Boolean.valueOf(z));
        e(z);
        if (!etn.d(BaseApplication.getContext())) {
            LogUtil.j("HonorPrivacyUtils", "reportSignResult current zone no need sign.");
            return;
        }
        if (!Utils.h()) {
            LogUtil.j("HonorPrivacyUtils", "reportSignResult current zone no cloud.");
        } else if (CommonUtil.ab(BaseApplication.getContext())) {
            a(z);
        } else {
            LogUtil.j("HonorPrivacyUtils", "reportSignResult no connect network.");
        }
    }

    private static void b() {
        LogUtil.a("HonorPrivacyUtils", "Enter queryHonorPrivacy.");
        ArrayList arrayList = new ArrayList(16);
        String country = Locale.getDefault().getCountry();
        lpy lpyVar = new lpy();
        lpyVar.c((Integer) 1050);
        lpyVar.c(country);
        arrayList.add(lpyVar);
        lpy lpyVar2 = new lpy();
        lpyVar2.c((Integer) 1051);
        lpyVar2.c(country);
        arrayList.add(lpyVar2);
        lpx.b(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011), arrayList, new ResultCallback<lpw>() { // from class: dwq.4
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(lpw lpwVar) {
                dwq.d(String.valueOf(System.currentTimeMillis()));
                if (lpwVar == null) {
                    LogUtil.j("HonorPrivacyUtils", "queryHonorPrivacy data is null.");
                    return;
                }
                LogUtil.a("HonorPrivacyUtils", "queryHonorPrivacy data: ", lpwVar.toString());
                if (lpwVar.e() == 0) {
                    dwq.c(lpwVar);
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.j("HonorPrivacyUtils", "queryHonorPrivacy onFailure.");
                dwq.d("");
            }
        });
    }

    private static void a(boolean z) {
        LogUtil.a("HonorPrivacyUtils", "Enter signHonorPrivacy isSign: ", Boolean.valueOf(z));
        ArrayList arrayList = new ArrayList(16);
        String country = Locale.getDefault().getCountry();
        lqf lqfVar = new lqf();
        lqfVar.d((Integer) 1050);
        lqfVar.d(country);
        lqfVar.a(z);
        arrayList.add(lqfVar);
        lqf lqfVar2 = new lqf();
        lqfVar2.d((Integer) 1051);
        lqfVar2.d(country);
        lqfVar2.a(z);
        arrayList.add(lqfVar2);
        lpx.c(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011), arrayList, new ResultCallback<lpw>() { // from class: dwq.1
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(lpw lpwVar) {
                if (lpwVar == null) {
                    LogUtil.j("HonorPrivacyUtils", "signHonorPrivacy data is null.");
                } else {
                    LogUtil.a("HonorPrivacyUtils", "signHonorPrivacy data: ", lpwVar.toString());
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.j("HonorPrivacyUtils", "signHonorPrivacy onFailure.");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(lpw lpwVar) {
        List<lqa> listA = lpwVar.a();
        boolean zC = SharedPreferenceManager.c(BaseApplication.getContext(), LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        if (listA == null || listA.size() == 0) {
            if (zC) {
                LogUtil.a("HonorPrivacyUtils", "saveSignResult report sign result.");
                a(true);
                return;
            }
            return;
        }
        long jB = 0;
        long jA = 0;
        long jB2 = 0;
        long jA2 = 0;
        boolean zC2 = false;
        boolean zC3 = false;
        for (lqa lqaVar : listA) {
            if (lqaVar.d().intValue() == 1050) {
                zC2 = lqaVar.c();
                jB = lqaVar.b();
                jA = lqaVar.a();
            } else if (lqaVar.d().intValue() != 1051) {
                LogUtil.j("HonorPrivacyUtils", "saveSignResult arg type is error.");
            } else {
                zC3 = lqaVar.c();
                jB2 = lqaVar.b();
                jA2 = lqaVar.a();
            }
        }
        if ((!zC2 && !zC3) || !zC) {
            e(true);
        } else if (jB > jA || jB2 > jA2) {
            e(false);
        } else {
            a(true);
        }
    }

    private static void e(boolean z) {
        SharedPreferenceManager.b(BaseApplication.getContext(), LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str) {
        LogUtil.a("HonorPrivacyUtils", "saveQueryTime queryTime: ", str);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), "honor_privacy_query_time", str, null);
    }
}
