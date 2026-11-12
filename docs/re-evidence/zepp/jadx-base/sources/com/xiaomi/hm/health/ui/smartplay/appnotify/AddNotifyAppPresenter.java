package com.xiaomi.hm.health.ui.smartplay.appnotify;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.provider.Telephony;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.huami.device.feature.notification.appnotify.NotificationManager;
import com.huami.device.feature.notification.utils.PkgNameConstants;
import com.huami.devicex.R;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.Language;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class AddNotifyAppPresenter implements AddNotifyAppContract.a {
    private static final String e = "AddNotifyAppPresenter";
    private static final Comparator<AppInfo> f = new a();
    private static final String[] g = {"com.xiaomi.hm.health", "com.tencent.mm", "com.tencent.mobileqq", "com.tencent.qqlite", "com.tencent.minihd.qq", PkgNameConstants.QQ_INTERNATIONAL, "com.eg.android.AlipayGphone", "com.sina.weibo"};
    private static final String[] h = {"com.xiaomi.hm.health", PkgNameConstants.WHATSAPP, "com.facebook.orca", PkgNameConstants.VIBER, "com.facebook.katana"};
    private static final String[] i = {PkgNameConstants.CONTACTS_HUAWEI_OPPO, PkgNameConstants.MMS};
    private Activity a;
    private AddNotifyAppContract.View b;
    private NotificationManager c;
    private b d;

    public class a implements Comparator<AppInfo> {
        private int b(String str, String str2) {
            return CharacterParser.getInstance().getSellingIgnoreCase(str).compareTo(CharacterParser.getInstance().getSellingIgnoreCase(str2));
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AppInfo appInfo, AppInfo appInfo2) {
            boolean z = appInfo.isChecked;
            if (z && appInfo2.isChecked) {
                return b(appInfo.name, appInfo2.name);
            }
            if (z || appInfo2.isChecked) {
                return z ? -1 : 1;
            }
            return 0;
        }
    }

    public class b extends BaseAdapter {
        public List<AppInfo> a;

        private b(List<AppInfo> list) {
            this.a = list;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AppInfo getItem(int i) {
            return this.a.get(i);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.a.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(AddNotifyAppPresenter.this.a).inflate(R.layout.view_notifi_apps_list_item, viewGroup, false);
            }
            AppInfo item = getItem(i);
            ((ImageView) view.findViewById(R.id.icon)).setImageDrawable(item.icon);
            ((TextView) view.findViewById(R.id.text)).setText(item.name);
            ((CheckBox) view.findViewById(R.id.check)).setChecked(item.isChecked);
            return view;
        }
    }

    public AddNotifyAppPresenter(Activity activity, AddNotifyAppContract.View view) {
        this.a = activity;
        this.b = view;
        view.setPresenter(this);
    }

    private void d(List<AppInfo> list) {
        for (AppInfo appInfo : AppInfoManager.getSortAppInfos(this.a)) {
            boolean zF = f(list, appInfo);
            HMLog.d(e, "contains " + appInfo.packageName + ": " + zF, new Object[0]);
            if (!zF) {
                list.add(appInfo);
            }
        }
    }

    private static List<ResolveInfo> e(Context context) {
        Intent intent = new Intent();
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setAction("android.intent.action.MAIN");
        return context.getPackageManager().queryIntentActivities(intent, 0);
    }

    private boolean f(List<AppInfo> list, AppInfo appInfo) {
        for (AppInfo appInfo2 : list) {
            if (!TextUtils.isEmpty(appInfo.packageName) && TextUtils.equals(appInfo2.packageName, appInfo.packageName)) {
                return true;
            }
        }
        return false;
    }

    private boolean g(String str) {
        if (TextUtils.equals(Telephony.Sms.getDefaultSmsPackage(this.a), str)) {
            return true;
        }
        for (String str2 : i) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public static List<AppInfo> getFirstList(List<AppInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (Language.isSimplifiedChinese()) {
            for (String str : g) {
                for (AppInfo appInfo : list) {
                    if (TextUtils.equals(str, appInfo.packageName)) {
                        arrayList.add(appInfo);
                        HMLog.d(e, "first app : " + str, new Object[0]);
                    }
                }
            }
            list.removeAll(arrayList);
        } else {
            for (String str2 : h) {
                for (AppInfo appInfo2 : list) {
                    if (TextUtils.equals(str2, appInfo2.packageName)) {
                        arrayList.add(appInfo2);
                        HMLog.d(e, "first app : " + str2, new Object[0]);
                    }
                }
            }
            list.removeAll(arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        this.b.showAppList(this.d);
        this.b.stopLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void h() {
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : e(this.a)) {
            AppInfo appInfo = new AppInfo();
            appInfo.packageName = resolveInfo.activityInfo.packageName;
            appInfo.name = resolveInfo.loadLabel(this.a.getPackageManager()).toString();
            appInfo.icon = resolveInfo.loadIcon(this.a.getPackageManager());
            if (this.c.getAppsRepo().hasApp(appInfo.packageName)) {
                appInfo.isChecked = true;
            }
            if (!g(appInfo.packageName)) {
                arrayList.add(appInfo);
            }
        }
        d(arrayList);
        List<AppInfo> firstList = getFirstList(arrayList);
        Collections.sort(arrayList, new AppComparator());
        arrayList.addAll(0, firstList);
        Collections.sort(arrayList, f);
        List<AppInfo> listK = k(arrayList);
        if (this.d == null) {
            this.d = new b(listK);
        }
        this.a.runOnUiThread(new Runnable() { // from class: v9
            @Override // java.lang.Runnable
            public final void run() {
                this.a.i();
            }
        });
    }

    private List<AppInfo> k(List<AppInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (AppInfo appInfo : list) {
            if (appInfo.isChecked) {
                arrayList.add(appInfo);
            }
        }
        list.removeAll(arrayList);
        arrayList.addAll(0, getFirstList(arrayList));
        list.addAll(0, arrayList);
        return list;
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.appnotify.AddNotifyAppContract.a
    public void initAppInfo() {
        new Thread(new Runnable() { // from class: u9
            @Override // java.lang.Runnable
            public final void run() {
                this.a.h();
            }
        }).start();
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.appnotify.AddNotifyAppContract.a
    public void onChecked(int i2, CheckBox checkBox) {
        if (checkBox.isChecked()) {
            checkBox.setChecked(false);
            AppInfo item = this.d.getItem(i2);
            item.isChecked = false;
            this.c.getAppsRepo().removeApp(item.packageName);
            return;
        }
        checkBox.setChecked(true);
        AppInfo item2 = this.d.getItem(i2);
        item2.isChecked = true;
        this.c.getAppsRepo().addApp(item2.packageName);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.appnotify.AddNotifyAppContract.a
    public void start() {
        this.b.startLoading();
        this.c = NotificationManager.getInstance();
        initAppInfo();
    }
}
