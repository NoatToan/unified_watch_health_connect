package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.health.marketing.datatype.SingleDailyMomentContent;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.datatype.templates.FloatingBoxTemplate;
import com.huawei.health.marketing.datatype.templates.TopBannerNewTemplate;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.KeyValDbManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class fua {
    public static final boolean b() {
        return true;
    }

    public static boolean c() {
        return true;
    }

    public static final boolean d(Context context) {
        return true;
    }

    public static final boolean g() {
        return true;
    }

    public static final boolean i() {
        return true;
    }

    public static final boolean j() {
        return true;
    }

    public static boolean m() {
        return false;
    }

    public static final boolean t() {
        return true;
    }

    public static final boolean a() {
        return (Utils.o() || CommonUtil.az()) ? false : true;
    }

    public static final boolean c(Context context) {
        return (qrs.ah(context) || CommonUtil.az() || Utils.k()) ? false : true;
    }

    public static final boolean e() {
        return ipg.e();
    }

    public static final boolean b(Context context) {
        return Utils.o();
    }

    public static final boolean h() {
        return Process.is64Bit();
    }

    public static final boolean n() {
        return Process.is64Bit();
    }

    public static boolean s() {
        return !Utils.o() && q();
    }

    public static final boolean f() {
        return Build.VERSION.SDK_INT <= 26;
    }

    public static void c(List<SingleGridContent> list) {
        if (njy.e(list) || c(BaseApplication.getContext())) {
            return;
        }
        Iterator<SingleGridContent> it = list.iterator();
        while (it.hasNext()) {
            SingleGridContent next = it.next();
            if (next != null && ("phoneSleep".equals(next.getRedDotFlag()) || "huaweischeme://healthapp/basicHealth?healthType=1&pageType=detection&fromType=3&urlType=4&pName=com.huawei.health".equals(next.getLinkValue()))) {
                LogUtil.a("VersionControlUtils", "filter HomeBanner: ", next.toString());
                it.remove();
            }
        }
        LogUtil.a("VersionControlUtils", Integer.valueOf(list.size()));
    }

    public static boolean a(TopBannerNewTemplate topBannerNewTemplate) {
        if (topBannerNewTemplate == null || c(BaseApplication.getContext()) || !"huaweischeme://healthapp/basicHealth?healthType=1&pageType=detection&fromType=3&urlType=4&pName=com.huawei.health".equals(topBannerNewTemplate.getLinkValue())) {
            return false;
        }
        LogUtil.a("VersionControlUtils", "filter TopBannerNewTemplate: ", topBannerNewTemplate.toString());
        return true;
    }

    public static void a(List<SingleDailyMomentContent> list) {
        if (njy.e(list) || c(BaseApplication.getContext())) {
            return;
        }
        Iterator<SingleDailyMomentContent> it = list.iterator();
        while (it.hasNext()) {
            SingleDailyMomentContent next = it.next();
            if (next != null && "huaweischeme://healthapp/basicHealth?healthType=1&pageType=detection&fromType=3&urlType=4&pName=com.huawei.health".equals(next.getCoverLinkValue())) {
                it.remove();
                LogUtil.a("VersionControlUtils", "filter SingleDailyMomentContent: ", next.toString());
            }
        }
    }

    public static boolean c(FloatingBoxTemplate floatingBoxTemplate) {
        if (floatingBoxTemplate == null || c(BaseApplication.getContext()) || !"huaweischeme://healthapp/basicHealth?healthType=1&pageType=detection&fromType=3&urlType=4&pName=com.huawei.health".equals(floatingBoxTemplate.getLinkValue())) {
            return false;
        }
        LogUtil.a("VersionControlUtils", "filter FloatingBoxTemplate: ", floatingBoxTemplate.toString());
        return true;
    }

    public static boolean b(osg osgVar) {
        if (osgVar == null || c(BaseApplication.getContext()) || !"huaweischeme://healthapp/basicHealth?healthType=1&pageType=detection&fromType=3&urlType=4&pName=com.huawei.health".equals(osgVar.c())) {
            return false;
        }
        LogUtil.a("VersionControlUtils", "filter KakaTaskInfo: ", osgVar.toString());
        return true;
    }

    public static boolean o() {
        return (q() || CommonUtil.az() || EnvironmentInfo.m()) ? false : true;
    }

    public static boolean l() {
        return !Utils.k();
    }

    public static boolean k() {
        return (Utils.b(BaseApplication.getContext()) || Utils.k()) ? false : true;
    }

    public static boolean d() {
        return Process.is64Bit() && !ets.e();
    }

    public static boolean r() {
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("test_sugar_blood_new_ui_key");
        return Process.is64Bit() && !CommonUtil.bu() && (!TextUtils.isEmpty(strC) && Boolean.parseBoolean(strC));
    }

    public static final boolean p() {
        return Process.is64Bit();
    }

    public static boolean q() {
        if (Utils.o()) {
            return false;
        }
        if (CommonUtil.bu()) {
            return SharedPreferenceManager.b("NEW_HOME_FRAGMENT_CONFIG", "NEW_HOME_FRAGMENT_CONFIG", false);
        }
        return true;
    }
}
