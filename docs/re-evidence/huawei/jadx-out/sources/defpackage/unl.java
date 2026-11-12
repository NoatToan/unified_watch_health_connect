package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Tasks;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.UiCallback;
import com.huawei.ui.main.stories.guidepage.activity.GuidePageActivity;
import com.huawei.ui.main.stories.guidepage.data.GuidePageInfo;
import com.huawei.ui.main.stories.guidepage.data.GuideResource;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class unl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f50403b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f50404c = true;

    public static void c() {
        LogUtil.a("GuidePageManager", "enter startGuidePage");
        if (!j()) {
            LogUtil.a("GuidePageManager", "not Request");
            return;
        }
        c(true);
        if (h()) {
            LogUtil.a("GuidePageManager", "has catching data");
            o();
        } else {
            e("");
        }
    }

    private static boolean h() {
        return unh.d() && !g(CommonUtil.a(BaseApplication.getContext()));
    }

    public static void e(final String str) {
        f50403b = str;
        Tasks.callInBackground(new Callable<String>() { // from class: unl.2
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public String call() throws Exception {
                return ltg.a(unl.i() + "/messageCenter/getGuide" + com.huawei.health.messagecenter.model.CommonUtil.getUrlSuffix(), unh.a(), unh.b(str));
            }
        }).addOnSuccessListener(new OnSuccessListener<String>() { // from class: unl.1
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str2) {
                LogUtil.a("GuidePageManager", "enter onSuccess");
                if (!unl.c(str2)) {
                    unl.i(str2);
                } else {
                    LogUtil.j("GuidePageManager", "result invalid");
                }
            }
        });
    }

    public static void c(boolean z) {
        LogUtil.a("GuidePageManager", "setDisplayable", Boolean.valueOf(z));
        f50404c = z;
    }

    private static void h(String str) {
        LogUtil.a("GuidePageManager", "enter parseResult", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("resultCode");
            if (!"0".equals(string)) {
                LogUtil.j("GuidePageManager", "handleGuidePageCloudData resultCode = ", string, ",resultDesc = ", jSONObject.getString("resultDesc"));
                return;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("guideList");
            if (jSONArray != null && jSONArray.length() >= 1) {
                GuidePageInfo guidePageInfo = (GuidePageInfo) new Gson().fromJson(jSONArray.getString(0), GuidePageInfo.class);
                List<GuideResource> resourceList = guidePageInfo.getResourceList();
                if (njy.e(resourceList)) {
                    LogUtil.a("GuidePageManager", "guideResources is empty");
                    return;
                }
                String strValueOf = String.valueOf(guidePageInfo.getExpireTime());
                String strA = CommonUtil.a(BaseApplication.getContext());
                if (!TextUtils.isEmpty(f50403b)) {
                    LogUtil.a("GuidePageManager", "sHasDataVersion:", f50403b);
                    strA = f50403b;
                }
                if (g(strA)) {
                    LogUtil.a("GuidePageManager", "start downLoad");
                    unh.d(resourceList);
                    unh.b(strA, strValueOf);
                    d(resourceList);
                    return;
                }
                if (!TextUtils.isEmpty(f50403b)) {
                    LogUtil.a("GuidePageManager", "is from message, not start activity");
                    return;
                }
                LogUtil.a("GuidePageManager", "downLoad arlready, start show");
                unh.d(resourceList);
                b(strA);
                unh.b(strA, strValueOf);
                o();
                return;
            }
            LogUtil.j("GuidePageManager", "no data");
        } catch (JsonSyntaxException | JSONException unused) {
            LogUtil.e("GuidePageManager", "handleGuidePageCloudData exception.");
        }
    }

    private static void d(List<GuideResource> list) {
        ArrayList arrayList = new ArrayList(6);
        for (GuideResource guideResource : list) {
            ugv ugvVar = new ugv();
            ugvVar.c(guideResource.getResourceUrl());
            ugvVar.b(unh.c(guideResource.getResourceUrl()));
            arrayList.add(ugvVar);
        }
        new ugp().b(arrayList, 0L, new d());
    }

    static class d extends UiCallback<String> {
        private d() {
        }

        @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.a("GuidePageManager", "onFailure", "errorCode:", Integer.valueOf(i), " errorInfo:", str);
        }

        @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.UiCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            LogUtil.a("GuidePageManager", "onSuccess:", str);
            if (!TextUtils.isEmpty(unl.f50403b)) {
                unl.b(unl.f50403b);
                LogUtil.a("GuidePageManager", "is from message, download success");
            } else if (BaseApplication.getActivity() == null) {
                LogUtil.j("GuidePageManager", "BaseApplication.getActivity() = null");
            } else {
                BaseApplication.getActivity().runOnUiThread(new Runnable() { // from class: unl.d.5
                    @Override // java.lang.Runnable
                    public void run() {
                        unl.b(CommonUtil.a(BaseApplication.getContext()));
                        unl.o();
                    }
                });
            }
        }

        @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.UiCallback
        public boolean isCanceled() {
            return super.isCanceled();
        }

        @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.UiCallback
        public void onProgress(long j, long j2) {
            super.onProgress(j, j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(String str) {
        h(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o() {
        LogUtil.a("GuidePageManager", "enter startGuideActivity:", Boolean.valueOf(!f50404c));
        if (!f50404c) {
            LogUtil.j("GuidePageManager", "not startGuideActivity");
            return;
        }
        g();
        try {
            Context context = BaseApplication.getContext();
            Intent intent = new Intent(context, (Class<?>) GuidePageActivity.class);
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("GuidePageManager", "startGuideActivity: ", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(String str) {
        return TextUtils.isEmpty(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String i() {
        return GRSManager.c(BaseApplication.getContext()).getUrl("messageCenterUrl");
    }

    private static boolean j() {
        if (qrs.t() || qrs.ah(BaseApplication.getContext()) || !Utils.h()) {
            return false;
        }
        Context context = BaseApplication.getContext();
        String strB = b();
        String strA = unh.a(CommonUtil.a(context));
        LogUtil.a("GuidePageManager", "lastDispalyAppVersion:", strB, "appVersion:", strA);
        return TextUtils.isEmpty(strB) || CommonUtil.e(strA, strB) != 0;
    }

    private static void g() {
        SharedPreferenceManager.e(BaseApplication.getContext(), "guide_page_display_app_version", "display_app_version", unh.a(CommonUtil.a(BaseApplication.getContext())), null);
    }

    private static String b() {
        return SharedPreferenceManager.e(BaseApplication.getContext(), "guide_page_display_app_version", "display_app_version");
    }

    public static void b(String str) {
        String strA = unh.a(str);
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
        SharedPreferenceManager.e(BaseApplication.getContext(), "guide_page_download_app_version", accountInfo + "download_app_version", strA, null);
    }

    private static String f() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
        return SharedPreferenceManager.e(BaseApplication.getContext(), "guide_page_download_app_version", accountInfo + "download_app_version");
    }

    private static boolean g(String str) {
        String strA = unh.a(str);
        String strF = f();
        LogUtil.a("GuidePageManager", "resourceVersion:", strF, " appVersion:", strA);
        return TextUtils.isEmpty(strF) || CommonUtil.e(strF, strA) != 0;
    }
}
