package com.xiaomi.hm.health.ui.smartplay.appnotify;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.huami.device.feature.notification.appnotify.NotificationManager;
import com.huami.device.feature.notification.data.AppChosen;
import com.huami.devicex.injection.basic.MiuiFnApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes22.dex */
public class AppInfoManager {
    private static final Lazy<MiuiFnApi> a = KoinJavaComponent.inject(MiuiFnApi.class);

    public static List<AppInfo> getSortAppInfos(Context context) {
        ArrayList arrayList = new ArrayList();
        ArrayList<AppChosen> allApps = NotificationManager.getInstance().getAppsRepo().getAllApps();
        if (allApps == null) {
            return arrayList;
        }
        for (AppChosen appChosen : allApps) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(appChosen.getPkg(), 0);
                if (!a.getValue().getXiaomiServiceFrameworkPackageName().equals(appChosen.getPkg())) {
                    AppInfo appInfo = new AppInfo();
                    appInfo.packageName = applicationInfo.packageName;
                    appInfo.name = applicationInfo.loadLabel(context.getPackageManager()).toString();
                    appInfo.icon = applicationInfo.loadIcon(context.getPackageManager());
                    appInfo.isChecked = appChosen.getOn();
                    arrayList.add(appInfo);
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }
        Collections.sort(arrayList, new AppComparator());
        List<AppInfo> firstList = AddNotifyAppPresenter.getFirstList(arrayList);
        arrayList.removeAll(firstList);
        arrayList.addAll(0, firstList);
        return arrayList;
    }
}
