package health.compact.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import defpackage.lon;
import defpackage.njy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ThirdMobileManager {
    private static final String[] d = {"com.tencent.qqpimsecure", "com.qihoo360.mobilesafe", "com.mpoyit.zawcgm", "com.zxly.assist", "com.anguanjia.safe", "com.fractalist.SystemOptimizer", "com.tencent.qlauncher.lite", "com.baoruan.launcher2", "com.hola.launcher", "com.dianxinos.dxhome", "com.nd.android.pandahome2", "com.mili.launcher", "com.tencent.launcher", "com.Dean.launcher", "com.gau.go.launcherex", "com.cleanmaster.mguard_cn", "com.isyezon.kbatterydoctor", "com.mdhlkj.batterysaver", "com.ijinshan.kbatterydoctor", "com.zlkj.cjszgj", "kaiqi.mobileguard"};

    private ThirdMobileManager() {
    }

    public static List<String> d(Context context) {
        PackageInfo packageInfo;
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_ThirdMobileManager", "hasThirdMobileManager context is null,hasThirdMobileManager return false");
            return new ArrayList();
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_ThirdMobileManager", "PackageManager is null,hasThirdMobileManager return false");
            return new ArrayList();
        }
        List<String> listC = c();
        ArrayList arrayList = new ArrayList();
        for (String str : listC) {
            try {
                packageInfo = packageManager.getPackageInfo(str, 0);
            } catch (PackageManager.NameNotFoundException e) {
                com.huawei.hwlogsmodel.LogUtil.e("Step_ThirdMobileManager", "hasThirdMobileManager exception", e);
                packageInfo = null;
            }
            if (packageInfo != null) {
                arrayList.add(packageInfo.packageName);
                com.huawei.hwlogsmodel.LogUtil.a("Step_ThirdMobileManager", "package : ", str);
            }
        }
        com.huawei.hwlogsmodel.LogUtil.a("Step_ThirdMobileManager", "hasThirdMobileManager return :", Boolean.valueOf(njy.e(arrayList)));
        return arrayList;
    }

    private static List<String> c() {
        String strD = lon.c().d("thirdMobileManager_kill_app_live");
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("Step_ThirdMobileManager", "getThirdAppPacksInfo: ", strD);
        if (TextUtils.isEmpty(strD)) {
            return Arrays.asList(d);
        }
        String[] strArrSplit = strD.trim().split(";");
        if (strArrSplit.length == 0) {
            return Arrays.asList(d);
        }
        for (int i = 0; i < strArrSplit.length; i++) {
            strArrSplit[i] = strArrSplit[i].trim();
        }
        String[] strArr = d;
        ArrayList arrayList = new ArrayList(strArr.length + strArrSplit.length);
        arrayList.addAll(Arrays.asList(strArr));
        arrayList.addAll(Arrays.asList(strArrSplit));
        return arrayList;
    }
}
