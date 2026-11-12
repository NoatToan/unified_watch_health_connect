package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.util.HwWatchFaceUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.WebViewActivity;
import com.huawei.watchface.mvp.model.datatype.WatchFaceListBean;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class mca {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static WatchFaceListBean f41392c;

    public static Map<String, String> e(String str) {
        return HwWatchFaceApi.getInstance(BaseApplication.getContext()).getWatchFaceUrlMap(str) != null ? HwWatchFaceApi.getInstance(BaseApplication.getContext()).getWatchFaceUrlMap(str) : new HashMap(16);
    }

    public static void b(Activity activity, int i) {
        HwWatchFaceApi.getInstance(BaseApplication.getContext()).gotoDetailOrMarket(activity, i);
    }

    public static void a(Context context) {
        if (!yln.d(context)) {
            LogUtil.j("WatchFaceAarUtil", "initWatchfaceAdapter is not authorized");
        } else {
            ReleaseLogUtil.d("DEVMGR_WatchFaceAarUtil", "initWatchfaceAdapter");
            HwWatchFaceApi.getInstance(context).setAdapter(mce.c());
        }
    }

    public static void a() {
        try {
            f41392c = (WatchFaceListBean) new Gson().fromJson(SharedPreferenceManager.f(BaseApplication.getContext()), WatchFaceListBean.class);
        } catch (JsonSyntaxException unused) {
            LogUtil.e("WatchFaceAarUtil", "JsonSyntaxException");
        }
    }

    public static void a(Intent intent) {
        LogUtil.a("WatchFaceAarUtil", "onReceive mWatchFaceReceiver");
        if (intent != null) {
            f41392c = (WatchFaceListBean) intent.getParcelableExtra("watchFaceBeanList");
        }
    }

    public static boolean c(int i, int i2) {
        if (c()) {
            return true;
        }
        String resolution = f41392c.getWatchFaceBeanList().get(0).getResolution();
        if (resolution == null) {
            LogUtil.j("WatchFaceAarUtil", "checkListBeanResolutionInvalid resolution is null");
            return false;
        }
        String[] strArrSplit = resolution.split("\\*");
        if (strArrSplit.length != 2) {
            LogUtil.j("WatchFaceAarUtil", "checkListBeanResolutionInvalid split error");
            return false;
        }
        int iE = CommonUtil.e(strArrSplit[0], -1);
        int iE2 = CommonUtil.e(strArrSplit[1], -1);
        if (iE == -1 || iE2 == -1) {
            LogUtil.j("WatchFaceAarUtil", "checkListBeanResolutionInvalid resolution width or height error");
            return false;
        }
        boolean z = i == i2;
        boolean z2 = iE == iE2;
        if (z) {
            return !z2;
        }
        return (i == iE && i2 == iE2) ? false : true;
    }

    public static boolean c() {
        WatchFaceListBean watchFaceListBean = f41392c;
        return watchFaceListBean == null || watchFaceListBean.getWatchFaceBeanList() == null || f41392c.getWatchFaceBeanList().isEmpty();
    }

    public static int e() {
        WatchFaceListBean watchFaceListBean = f41392c;
        if (watchFaceListBean != null) {
            return watchFaceListBean.getWatchFaceBeanList().size();
        }
        return 0;
    }

    public static String c(int i) {
        if (f41392c != null && i < e() && f41392c.getWatchFaceBeanList().get(i).getPreviews().size() >= 2) {
            return f41392c.getWatchFaceBeanList().get(i).getPreviews().get(1).getPreviewUrl();
        }
        return "";
    }

    public static String d(int i) {
        if (f41392c != null && i < e()) {
            return f41392c.getWatchFaceBeanList().get(i).getTitleLocal();
        }
        return "";
    }

    public static String b(int i) {
        if (f41392c != null && i < e()) {
            return f41392c.getWatchFaceBeanList().get(i).getHitopId();
        }
        return "";
    }

    public static String a(int i) {
        if (f41392c != null && i < e()) {
            return f41392c.getWatchFaceBeanList().get(i).getVersion();
        }
        return "";
    }

    public static void c(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
        intent.putExtra("url", str);
        intent.setFlags(268435456);
        HwWatchFaceUtil.e(context, intent, "WatchFaceAarUtil");
    }

    public static void e(String str, String str2, int i) {
        HwWatchFaceApi.getInstance(BaseApplication.getContext()).createBinFile(str, str2, i);
    }
}
