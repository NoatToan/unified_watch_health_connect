package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.fitness.FitnessStatusCodes;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.knit.bff.impl.IResourceRequestCallback;
import com.huawei.health.knit.data.KnitDataProvider;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import health.compact.a.CommonUtil;
import health.compact.a.ReflectionUtils;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class fog {
    public static boolean a(int i) {
        return i == 23;
    }

    public static void d(WeakReference<Context> weakReference, final List<Integer> list, final IResourceRequestCallback iResourceRequestCallback) {
        if (njy.e(list)) {
            LogUtil.j("BffResTrigger", "resPosIdList is null.");
            iResourceRequestCallback.onFailure(5004, "resPosIdList is invalid");
            return;
        }
        if (weakReference == null) {
            LogUtil.j("BffResTrigger", "context is null.");
            iResourceRequestCallback.onFailure(5004, "weakReference is invalid");
            return;
        }
        Context context = weakReference.get();
        if (context == null) {
            LogUtil.a("BffResTrigger", "context is null.");
            iResourceRequestCallback.onFailure(5004, "context is invalid");
            return;
        }
        if (LoginInit.getInstance(context).isBrowseMode() || !VersionControlUtil.isSupportOperationAccount() || Utils.k() || CommonUtil.ca()) {
            LogUtil.a("BffResTrigger", "isMinorAccount or isOverseaNoCloudVersion or isStoreDemoVersion, return");
            iResourceRequestCallback.onFailure(FitnessStatusCodes.UNKNOWN_AUTH_ERROR, "isBrowseMode or isMinorAccount or isOverseaNoCloudVersion or isStoreDemoVersion");
        } else if (CommonUtil.ab(context)) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: fog.3
                @Override // java.lang.Runnable
                public void run() {
                    JSONObject jSONObjectD = fod.d(list);
                    foh fohVar = new foh();
                    fohVar.setExtraRequestArgs(jSONObjectD);
                    fohVar.getPageResource(list, true, iResourceRequestCallback);
                }
            });
        } else {
            iResourceRequestCallback.onFailure(FitnessStatusCodes.MISSING_BLE_PERMISSION, "Network is not connected");
            LogUtil.a("BffResTrigger", "network not connected");
        }
    }

    public static KnitDataProvider c(int i, int i2) {
        if (i != 23) {
            return null;
        }
        return c(i2);
    }

    private static KnitDataProvider c(int i) {
        String str;
        switch (i) {
            case 32:
                str = "local:content//YogaRecommendCourseProvider";
                break;
            case 33:
                str = "local:content//YogaMyCourseProvider";
                break;
            case 34:
                str = "local:content//YogaSeriesCourseProvider";
                break;
            default:
                str = null;
                break;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("BffResTrigger", "dp url is invalid");
            return null;
        }
        String strD = fom.d(str);
        if (!TextUtils.isEmpty(strD)) {
            Object objA = ReflectionUtils.a(strD);
            if (objA instanceof KnitDataProvider) {
                return (KnitDataProvider) objA;
            }
        }
        return null;
    }
}
