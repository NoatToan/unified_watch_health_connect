package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsService;
import androidx.webkit.ProxyConfig;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.openid.appauth.browser.BrowserMatcher;

/* JADX INFO: loaded from: classes20.dex */
public final class zrp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Intent f54553a = new Intent().setAction(CommonConstant.ACTION.HWID_SCHEME_URL).addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", null));

    public static List<zrn> c(Context context) {
        int i;
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        Intent intent = f54553a;
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
        String str = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 131136)) {
            if (a(resolveInfo)) {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(resolveInfo.activityInfo.packageName, 64);
                    if (b(packageManager, resolveInfo.activityInfo.packageName)) {
                        i = 1;
                        zrn zrnVar = new zrn(packageInfo, true);
                        if (resolveInfo.activityInfo.packageName.equals(str)) {
                            arrayList.add(0, zrnVar);
                        } else {
                            arrayList.add(zrnVar);
                            i = 0;
                        }
                    } else {
                        i = 0;
                    }
                    zrn zrnVar2 = new zrn(packageInfo, false);
                    if (resolveInfo.activityInfo.packageName.equals(str)) {
                        arrayList.add(i, zrnVar2);
                    } else {
                        arrayList.add(zrnVar2);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return arrayList;
    }

    public static zrn c(Context context, BrowserMatcher browserMatcher) {
        List<zrn> listC = c(context);
        HashMap map = new HashMap();
        zrn zrnVar = null;
        for (zrn zrnVar2 : listC) {
            if (browserMatcher.matches(zrnVar2)) {
                map.put(zrnVar2.f54551b, zrnVar2);
                if (zrnVar2.f54552c.booleanValue() || zrnVar == null) {
                    zrnVar = zrnVar2;
                }
            }
        }
        return d(map, zrnVar, context);
    }

    private static zrn d(Map<String, zrn> map, zrn zrnVar, Context context) {
        if (map.containsKey("com.android.chrome")) {
            return map.get("com.android.chrome");
        }
        if (map.containsKey(Constants.HW_BROWSER_PACKAGE)) {
            return map.get(Constants.HW_BROWSER_PACKAGE);
        }
        if (map.containsKey("com.android.browser")) {
            return map.get("com.android.browser");
        }
        String strA = a(context);
        return ("".equals(strA) || !map.containsKey(strA)) ? zrnVar : map.get(strA);
    }

    private static String a(Context context) {
        ResolveInfo resolveInfoResolveActivity;
        if (context == null || (resolveInfoResolveActivity = context.getPackageManager().resolveActivity(f54553a, 65536)) == null || resolveInfoResolveActivity.activityInfo == null || "com.huawei.android.internal.app".equalsIgnoreCase(resolveInfoResolveActivity.activityInfo.packageName)) {
            return "";
        }
        return resolveInfoResolveActivity.activityInfo.packageName;
    }

    private static boolean b(PackageManager packageManager, String str) {
        Intent intent = new Intent();
        intent.setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        intent.setPackage(str);
        return packageManager.resolveService(intent, 0) != null;
    }

    private static boolean a(ResolveInfo resolveInfo) {
        if (resolveInfo.filter == null || !resolveInfo.filter.hasAction(CommonConstant.ACTION.HWID_SCHEME_URL) || !resolveInfo.filter.hasCategory("android.intent.category.BROWSABLE") || resolveInfo.filter.schemesIterator() == null || resolveInfo.filter.authoritiesIterator() != null) {
            return false;
        }
        Iterator<String> itSchemesIterator = resolveInfo.filter.schemesIterator();
        boolean zEquals = false;
        boolean zEquals2 = false;
        while (itSchemesIterator.hasNext()) {
            String next = itSchemesIterator.next();
            zEquals |= "http".equals(next);
            zEquals2 |= ProxyConfig.MATCH_HTTPS.equals(next);
            if (zEquals && zEquals2) {
                return true;
            }
        }
        return false;
    }
}
