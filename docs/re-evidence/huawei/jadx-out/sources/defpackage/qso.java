package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.utils.AppTypeUtils;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qso {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile qso f46752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f46753b = true;

    private qso() {
    }

    public static qso d() {
        if (f46752a == null) {
            synchronized (qso.class) {
                if (f46752a == null) {
                    f46752a = new qso();
                }
            }
        }
        return f46752a;
    }

    public void a(final View view, final boolean z) {
        boolean zO = Utils.o();
        if (view == null || zO || !this.f46753b) {
            LogUtil.a("OneClickGrayingManager", "isViewNull: ", Boolean.valueOf(view == null), ", isOversea: ", Boolean.valueOf(zO), ", mHasFileDownLoaded: ", Boolean.valueOf(this.f46753b));
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: qso.4
                @Override // java.lang.Runnable
                public void run() {
                    if (qso.this.m()) {
                        if (!z || qso.this.j()) {
                            qqn.d(view);
                        } else {
                            qqn.a(view);
                        }
                    }
                }
            });
        }
    }

    public void b(final Dialog dialog) {
        boolean zO = Utils.o();
        if (dialog == null || zO || !this.f46753b) {
            LogUtil.a("OneClickGrayingManager", "isDialogNull: ", Boolean.valueOf(dialog == null), ", isOversea: ", Boolean.valueOf(zO), ", mHasFileDownLoaded: ", Boolean.valueOf(this.f46753b));
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: qso.1
                @Override // java.lang.Runnable
                public void run() {
                    if (qso.this.m()) {
                        if (qso.this.j()) {
                            qqn.d(dialog.getWindow().getDecorView());
                        } else {
                            qqn.a(dialog.getWindow().getDecorView());
                        }
                    }
                }
            });
        }
    }

    public void e(final Fragment fragment, final View view) {
        boolean zO = Utils.o();
        if (fragment == null || view == null || zO || !this.f46753b) {
            LogUtil.a("OneClickGrayingManager", "isFragmentNull: ", Boolean.valueOf(fragment == null), ", isViewNull: ", Boolean.valueOf(view == null), ", isOversea: ", Boolean.valueOf(zO), ", mHasFileDownLoaded: ", Boolean.valueOf(this.f46753b));
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: qso.2
            @Override // java.lang.Runnable
            public void run() {
                if (qso.this.m()) {
                    if (qso.this.d(fragment)) {
                        qqn.d(view);
                    } else {
                        qqn.a(view);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(Fragment fragment) {
        if (fragment == null) {
            LogUtil.a("OneClickGrayingManager", "fragment is null");
            return false;
        }
        List<Integer> listI = i();
        if (njy.e(listI)) {
            LogUtil.a("OneClickGrayingManager", "scopeList is empty in isNeedGray");
            return false;
        }
        List<String> listB = b(listI);
        return (listB.contains("HomeFragment") && (fragment.toString().contains("HomeFragment") || (fragment.toString().contains("InnerMarketingFragment") && h()))) || (listB.contains("SportEntranceFragment") && (fragment.toString().contains(String.valueOf(4040)) || (fragment.toString().contains("InnerMarketingFragment") && f())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j() {
        List<Integer> listI = i();
        if (!njy.e(listI)) {
            return (h() && listI.contains(1)) || (f() && listI.contains(2));
        }
        LogUtil.a("OneClickGrayingManager", "scopeList is empty in isNeedGray");
        return false;
    }

    private boolean h() {
        Activity activityJ = BaseApplication.j();
        if (!(activityJ instanceof BaseActivity) || !activityJ.getLocalClassName().contains("MainActivity")) {
            LogUtil.a("OneClickGrayingManager", "topActivity is not MainActivity");
            return false;
        }
        for (Fragment fragment : new ArrayList(((BaseActivity) activityJ).getSupportFragmentManager().getFragments())) {
            if (fragment != null && fragment.getUserVisibleHint() && fragment.toString().contains("HomeFragment")) {
                return true;
            }
        }
        return false;
    }

    private boolean f() {
        Activity activityJ = BaseApplication.j();
        if (!(activityJ instanceof BaseActivity) || !activityJ.getLocalClassName().contains("MainActivity")) {
            LogUtil.a("OneClickGrayingManager", "topActivity is not MainActivity");
            return false;
        }
        for (Fragment fragment : new ArrayList(((BaseActivity) activityJ).getSupportFragmentManager().getFragments())) {
            if (fragment != null && fragment.getUserVisibleHint() && fragment.toString().contains("SportEntranceFragment")) {
                for (Fragment fragment2 : new ArrayList(fragment.getChildFragmentManager().getFragments())) {
                    if (fragment2 != null && fragment2.toString().contains(String.valueOf(4040)) && fragment2.getUserVisibleHint()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private List<String> b(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        if (list.contains(1)) {
            arrayList.add("HomeFragment");
        }
        if (list.contains(2)) {
            arrayList.add("SportEntranceFragment");
        }
        return arrayList;
    }

    private List<Integer> i() {
        qsn.e eVarG = g();
        if (eVarG == null || eVarG.c() == null) {
            LogUtil.a("OneClickGrayingManager", "pagesTypeList is null in getScopeList");
            return new ArrayList();
        }
        return eVarG.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m() {
        qsn.e eVarG = g();
        if (eVarG == null) {
            LogUtil.a("OneClickGrayingManager", "bean is null in grayingConfig");
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a("OneClickGrayingManager", "grayingConfig: ", eVarG.toString());
        ReleaseLogUtil.d("TimeEat_OneClickGrayingManager", "currentTime: ", Long.valueOf(jCurrentTimeMillis), "startTime: ", Long.valueOf(eVarG.e()), " endTime, ", Long.valueOf(eVarG.a()), ", clientType: ", Integer.valueOf(eVarG.d()));
        return jCurrentTimeMillis >= eVarG.e() && jCurrentTimeMillis <= eVarG.a() && eVarG.d() == 0;
    }

    private qsn.e g() {
        qsn qsnVarA = a();
        if (qsnVarA == null) {
            LogUtil.a("OneClickGrayingManager", "bean is null in getGrayingConfig");
            this.f46753b = false;
            return null;
        }
        qsn.b bVarC = qsnVarA.c();
        if (bVarC == null) {
            LogUtil.a("OneClickGrayingManager", "globalConfig is null in getGrayingConfig");
            return null;
        }
        qsn.e eVarB = bVarC.b();
        if (eVarB != null) {
            return eVarB;
        }
        LogUtil.a("OneClickGrayingManager", "grayingConfig is null in getGrayingConfig");
        return null;
    }

    private qsn a() {
        String strE = SharedPreferenceManager.e(BaseApplication.b(), "ONE_CLICK_GRAYING", "ONE_CLICK_GRAYING");
        LogUtil.a("OneClickGrayingManager", "configStr: ", strE);
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        try {
            return (qsn) qqt.e(strE, qsn.class);
        } catch (JsonSyntaxException | NumberFormatException unused) {
            LogUtil.a("OneClickGrayingManager", "get configs exception");
            return null;
        }
    }

    public void b() {
        String url = GRSManager.c(BaseApplication.b()).getUrl("marketingUrl");
        if (LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).isBrowseMode()) {
            e(url + "/positionservice/v1/globalConfigAnon");
            return;
        }
        e(url + "/positionservice/v1/globalConfig");
    }

    private void e(String str) {
        HashMap map = new HashMap();
        map.put(CloudParamKeys.CLIENT_TYPE, String.valueOf(c()));
        oet.d().e(str, e(), map, String.class, new ResultCallback<String>() { // from class: qso.5
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str2) {
                if (TextUtils.isEmpty(str2)) {
                    LogUtil.j("OneClickGrayingManager", "response is empty");
                    return;
                }
                LogUtil.a("OneClickGrayingManager", "healthCloudRequest onSuccess -> " + str2);
                SharedPreferenceManager.e(BaseApplication.b(), "ONE_CLICK_GRAYING", "ONE_CLICK_GRAYING", str2, new StorageParams());
                qso.this.f46753b = true;
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.a("OneClickGrayingManager", "healthCloudRequest onFailure -> " + (th == null ? "request failed" : th.getMessage()));
            }
        });
    }

    private int c() {
        if (CommonUtil.bg()) {
            return 1;
        }
        if (CommonUtil.bd()) {
            return 2;
        }
        return qrs.ah(BaseApplication.b()) ? 5 : 3;
    }

    public static HashMap<String, String> e() {
        Context context = com.huawei.hwcommonmodel.application.BaseApplication.getContext();
        HashMap<String, String> map = new HashMap<>(16);
        if (!LoginInit.getInstance(context).isBrowseMode()) {
            map.put("x-huid", LoginInit.getInstance(context).getAccountInfo(1011));
            map.put(CloudParamKeys.X_TOKEN_TYPE, String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
            String accountInfo = LoginInit.getInstance(context).getAccountInfo(1008);
            if (!TextUtils.isEmpty(accountInfo)) {
                map.put(CloudParamKeys.X_TOKEN, accountInfo);
            }
        }
        map.put("Content-type", "application/json");
        map.put(CloudParamKeys.X_CLIENT_VERSION, CommonUtil.c(context));
        map.put(CloudParamKeys.X_SITE_ID, LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getAccountInfo(1009));
        map.put(CloudParamKeys.X_APP_ID, com.huawei.hwcommonmodel.application.BaseApplication.getAppPackage());
        String deviceId = LoginInit.getInstance(context).getDeviceId();
        if (TextUtils.isEmpty(deviceId)) {
            deviceId = "clientnull";
        }
        map.put(CloudParamKeys.X_DEVICE_ID, deviceId);
        map.put(CloudParamKeys.X_DEVICE_TYPE, LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).getDeviceType());
        map.put(CloudParamKeys.X_TS, String.valueOf(System.currentTimeMillis()));
        map.put(CloudParamKeys.X_APP_TYPE, String.valueOf(AppTypeUtils.getAppType()));
        map.put("x-caller-trace-id", String.valueOf(System.currentTimeMillis()) + Math.random());
        return map;
    }
}
