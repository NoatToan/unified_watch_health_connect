package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.util.NotificationContentProviderUtil;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class nbx {
    public static List<lzj> d() {
        lzj lzjVarA;
        ArrayList arrayList = new ArrayList(16);
        List<String> listJ = NotificationContentProviderUtil.j();
        listJ.addAll(new ArrayList(b()));
        LogUtil.a("HwNotificationAppInfoUtil", "getNotificationPushAppList size: ", Integer.valueOf(listJ.size()));
        if (!listJ.isEmpty()) {
            for (String str : listJ) {
                if (cio.d.equals(str)) {
                    lzjVarA = e();
                } else {
                    lzjVarA = a(str);
                }
                if (lzjVarA != null) {
                    arrayList.add(lzjVarA);
                }
            }
        }
        return arrayList;
    }

    private static Set<String> b() {
        HashSet hashSet = new HashSet();
        if (NotificationContentProviderUtil.f()) {
            boolean zB = SharedPreferenceManager.b("SUPPORT_NOTIFY_LIVE_LEVEL_CAPABILITY", "SUPPORT_NOTIFY_LIVE_LEVEL_CAPABILITY", false);
            ReleaseLogUtil.d("Notify_HwNotificationAppInfoUtil", "getLiveCloudList notifyLiveLevelCapability=", Boolean.valueOf(zB));
            if (zB) {
                String strB = SharedPreferenceManager.b("NOTIFY_LIVE_LEVEL_VALUE", "NOTIFY_LIVE_LEVEL_VALUE", "levelDefault");
                ReleaseLogUtil.d("Notify_HwNotificationAppInfoUtil", "getLiveCloudList notifyLiveLevel=", strB);
                if (!TextUtils.equals(strB, "levelDefault")) {
                    hashSet.addAll(NotificationContentProviderUtil.e(strB));
                    return hashSet;
                }
                hashSet.addAll(NotificationContentProviderUtil.e("levelDefault"));
            }
        }
        return hashSet;
    }

    public static List<lzj> a() {
        ReleaseLogUtil.d("Notify_HwNotificationAppInfoUtil", "getDefaultPushAppList enter");
        ArrayList arrayList = new ArrayList(16);
        HashSet hashSet = new HashSet();
        hashSet.addAll(b());
        hashSet.addAll(cio.f1620b);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            lzj lzjVarA = a((String) it.next());
            if (lzjVarA != null) {
                arrayList.add(lzjVarA);
            }
        }
        lzj lzjVarE = e();
        if (lzjVarE != null) {
            arrayList.add(lzjVarE);
        }
        return arrayList;
    }

    public static lzj a(String str) {
        LogUtil.a("HwNotificationAppInfoUtil", "obtainSingleAppInfo enter packageName: ", str);
        String strC = mir.c(str);
        if (TextUtils.isEmpty(strC) || TextUtils.equals(str, strC)) {
            LogUtil.j("HwNotificationAppInfoUtil", "obtainSingleAppInfo appName is invalid packageName: ", str);
            return null;
        }
        PackageInfo packageInfoB = mir.b(str);
        if (packageInfoB == null) {
            LogUtil.j("HwNotificationAppInfoUtil", "obtainSingleAppInfo packageInfo is null, packageName: ", str);
            return null;
        }
        lzj lzjVar = new lzj();
        lzjVar.e(str);
        lzjVar.c(String.valueOf(packageInfoB.versionCode));
        lzjVar.a(strC);
        lzjVar.e(1);
        if (TextUtils.equals(ndj.b("HwNotificationAppInfoUtil"), str)) {
            ndj.d("HwNotificationAppInfoUtil");
            lzjVar.a(BaseApplication.getContext().getResources().getString(R.string.IDS_short_message));
        }
        return lzjVar;
    }

    public static Drawable d(String str) {
        if (TextUtils.equals(ndj.b("HwNotificationAppInfoUtil"), str)) {
            return new BitmapDrawable(BaseApplication.getContext().getResources(), mir.d(BaseApplication.getContext(), "notification_icon_sms"));
        }
        if (cio.d.equals(str)) {
            try {
                PackageManager packageManager = BaseApplication.getContext().getPackageManager();
                return packageManager.getApplicationIcon(packageManager.getApplicationInfo(cio.d, 128));
            } catch (PackageManager.NameNotFoundException unused) {
                LogUtil.e("HwNotificationAppInfoUtil", "getIconByPackageName NameNotFoundException");
                return null;
            }
        }
        PackageInfo packageInfoB = mir.b(str);
        if (packageInfoB != null) {
            return BaseApplication.getContext().getPackageManager().getApplicationIcon(packageInfoB.applicationInfo);
        }
        return null;
    }

    public static lzj e() {
        PackageManager packageManager = BaseApplication.getContext().getPackageManager();
        String string = "";
        boolean zC = false;
        try {
            string = packageManager.getApplicationLabel(packageManager.getApplicationInfo(cio.d, 128)).toString();
            LogUtil.a("HwNotificationAppInfoUtil", "getIntelligent appName is: ", string);
            zC = true;
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("HwNotificationAppInfoUtil", "getIntelligent NameNotFoundException");
        }
        if (zC) {
            zC = ncl.d(BaseApplication.getContext()).c();
        }
        if (!zC) {
            ReleaseLogUtil.e("Notify_HwNotificationAppInfoUtil", "getIntelligent is not support");
            return null;
        }
        lzj lzjVar = new lzj();
        lzjVar.a(string);
        lzjVar.e(cio.d);
        lzjVar.e(1);
        if (!TextUtils.isEmpty(CommonUtil.p())) {
            lzjVar.c(CommonUtil.p());
        } else {
            PackageInfo packageInfoB = mir.b(cio.d);
            if (packageInfoB == null) {
                LogUtil.j("HwNotificationAppInfoUtil", "getIntelligent packageInfo is null.");
                return lzjVar;
            }
            LogUtil.a("HwNotificationAppInfoUtil", "packageInfo.versionCode: ", String.valueOf(packageInfoB.versionCode));
            lzjVar.c(String.valueOf(packageInfoB.versionCode));
        }
        return lzjVar;
    }

    public static Bitmap a(Drawable drawable) {
        Bitmap bitmap = drawable instanceof BitmapDrawable ? ((BitmapDrawable) drawable).getBitmap() : null;
        return bitmap == null ? qqf.a(drawable) : bitmap;
    }

    public static String e(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("HwNotificationAppInfoUtil", "getAppInfoHash parameter is empty: ", str);
            return "";
        }
        return eeq.c((str + str2).hashCode());
    }
}
