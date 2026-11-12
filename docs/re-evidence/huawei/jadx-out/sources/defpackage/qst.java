package defpackage;

import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qst {
    private static int e;

    public static boolean d() {
        return false;
    }

    public static void c(String str, String str2) {
        qsu qsuVar = (qsu) qsr.c().c(str, str2, qsu.class);
        if (qsuVar == null) {
            return;
        }
        if ("deviceTabConfig".equals(str) && "1".equals(SharedPreferenceManager.e(BaseApplication.getContext(), str, str))) {
            return;
        }
        b(str, qsuVar.a(), a(qsuVar));
    }

    private static boolean a(qsu qsuVar) {
        List<String> listA;
        boolean zC;
        boolean zE;
        if (qsuVar == null) {
            LogUtil.j("ArkuixPageConfigUtil", "not found config.");
            return false;
        }
        if (qsuVar.a() == 2) {
            LogUtil.j("ArkuixPageConfigUtil", "isOpenArkuix IS_SWITCH_OPEN:", 1);
            return false;
        }
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LogUtil.j("ArkuixPageConfigUtil", "isOpenArkuix isBrowseMode true.");
            return false;
        }
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.j("ArkuixPageConfigUtil", "currentHuid is empty.");
            return false;
        }
        String strC = CommonUtil.c(BaseApplication.getContext());
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("ArkuixPageConfigUtil", "currentVersion is empty.");
            return false;
        }
        qsz qszVarA = a(qsuVar, strC);
        if (qsy.b(qszVarA == null ? qsuVar.c() : qszVarA.d(), accountInfo)) {
            LogUtil.j("ArkuixPageConfigUtil", "isOpenArkuix huid is blocked!");
            return false;
        }
        if (qszVarA == null) {
            listA = qsuVar.h();
        } else {
            listA = qszVarA.a();
        }
        if (!qsy.e(listA, LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010))) {
            LogUtil.j("ArkuixPageConfigUtil", "isOpenArkuix not white list country!");
            return false;
        }
        if (qszVarA != null) {
            LogUtil.a("ArkuixPageConfigUtil", "versionInnerConfigBean enter.");
            zE = qsy.e(qszVarA.c());
            zC = qsy.c(qszVarA.e(), accountInfo);
        } else {
            boolean zE2 = qsy.e(qsuVar.d());
            zC = qsy.c(qsuVar.b(), accountInfo);
            zE = zE2;
        }
        LogUtil.a("ArkuixPageConfigUtil", "isDeviceTypeSupport:", Boolean.valueOf(zE), ",isHuidSupport:", Boolean.valueOf(zC));
        return zE && zC;
    }

    private static void b(String str, int i, boolean z) {
        LogUtil.j("ArkuixPageConfigUtil", "saveArkConfigToSp configName:", str, ",openType:", Integer.valueOf(i));
        if (i == 1) {
            SharedPreferenceManager.e(BaseApplication.getContext(), str, str, z ? "1" : "2", new StorageParams());
            return;
        }
        if (i == 3) {
            e(str, z ? "1" : "2");
        } else if (i != 4) {
            SharedPreferenceManager.e(BaseApplication.getContext(), str, str, "2", new StorageParams());
        } else {
            e(str, "2");
        }
    }

    private static void e(String str, String str2) {
        if (TextUtils.isEmpty(SharedPreferenceManager.e(BaseApplication.getContext(), str, str))) {
            SharedPreferenceManager.e(BaseApplication.getContext(), str, str, str2, new StorageParams());
        }
    }

    private static qsz a(qsu qsuVar, String str) {
        if (njy.e(qsuVar.e())) {
            LogUtil.j("ArkuixPageConfigUtil", "getInnerConfig SupportVersions is empty.");
            return null;
        }
        for (qsz qszVar : qsuVar.e()) {
            if (qszVar != null) {
                String strB = qszVar.b();
                if (!TextUtils.isEmpty(strB) && str.contains(strB)) {
                    return qszVar;
                }
            }
        }
        return null;
    }

    public static void b() {
        e = 0;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x009f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0 A[RETURN] */
    public static boolean c() {
        int i = e;
        if (i != 0) {
            return i == 1;
        }
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("test_ark_ui_key");
        LogUtil.a("ArkuixPageConfigUtil", "arkUiSwitchValue:", strC);
        if (!TextUtils.isEmpty(strC)) {
            if (Boolean.parseBoolean(strC)) {
                e = 1;
            } else {
                e = 2;
            }
            return e == 1;
        }
        if (Utils.o()) {
            e = 2;
            return false;
        }
        if (CommonUtil.ap()) {
            e = 1;
            return true;
        }
        LogUtil.j("ArkuixPageConfigUtil", "isUserDeviceArkui  not init.");
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "deviceTabConfig", "deviceTabConfig");
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("ArkuixPageConfigUtil", "arkuixConfigStr  isEmpty.");
            e = 2;
            return false;
        }
        LogUtil.j("ArkuixPageConfigUtil", "arkuixConfigStr  :", strE);
        int iHashCode = strE.hashCode();
        if (iHashCode == 49) {
            if (strE.equals("1")) {
                e = 1;
            }
            if (e == 1) {
                return true;
            }
            return false;
        }
        if (iHashCode == 50) {
            strE.equals("2");
        }
        e = 2;
        if (e == 1) {
            return true;
        }
        return false;
    }
}
