package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.NotificationManagerCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.onpremisesservicemanager.R;
import health.compact.a.EnvironmentInfo;
import health.compact.a.KeyValDbManager;
import health.compact.a.LogUtil;
import java.util.HashSet;

/* JADX INFO: loaded from: classes12.dex */
public class ohf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashSet<String> f44314b = new HashSet<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ohf f44315c;

    private ohf() {
        f44314b.add("PluginWearAbility");
    }

    public static ohf e() {
        ohf ohfVar;
        synchronized (ohf.class) {
            if (f44315c == null) {
                f44315c = new ohf();
            }
            ohfVar = f44315c;
        }
        return ohfVar;
    }

    public boolean d(String str) {
        return (TextUtils.isEmpty(str) || !AppBundle.c().isBundleModule(str) || AppBundle.c().isExistLocalModule(str) || AppBundle.c().isBuiltInModule(BaseApplication.b(), str)) ? false : true;
    }

    public String c() {
        for (String str : f44314b) {
            if ("download_plugin".equals(KeyValDbManager.d(BaseApplication.b()).c(str))) {
                boolean zD = d(str);
                LogUtil.b("PremisesServiceManager", "queryIsShowPluginDownload name:", str, ", isDownload:", Boolean.valueOf(zD));
                if (zD) {
                    return str;
                }
                b(str);
            }
        }
        return "";
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("PremisesServiceManager", "resetPluginDownloadFlag moduleName isEmpty");
            return;
        }
        Context contextB = BaseApplication.b();
        if ("".equals(KeyValDbManager.d(contextB).c(str))) {
            return;
        }
        KeyValDbManager.d(contextB).b(str, "");
        NotificationManagerCompat.from(contextB).cancel(str.hashCode());
        LogUtil.b("PremisesServiceManager", "leave resetPluginDownloadFlag");
    }

    public String e(String str) {
        String string;
        Context contextB = BaseApplication.b();
        str.hashCode();
        if (str.equals("PluginHiAiEngine")) {
            string = BaseApplication.b().getResources().getString(R.string.IDS_hi_ai_voice_title, qrs.a(contextB, AppBundle.c().getModuleZipSize(contextB, "PluginHiAiEngine")));
        } else if (str.equals("PluginWearAbility")) {
            string = contextB.getResources().getString(R.string.IDS_download_plugin_ota);
        } else {
            LogUtil.e("PremisesServiceManager", "getDownloadTitle moduleName:", str);
            string = "";
        }
        LogUtil.b("PremisesServiceManager", "getDownloadTitle title:", string);
        return string;
    }

    public void c(Context context, final String str) {
        LogUtil.b("PremisesServiceManager", "enter downloadPlugin");
        if (!AppBundle.c().isBundleModule(str)) {
            LogUtil.b("PremisesServiceManager", "moduleName is not bundleModule");
            b(str);
            qpx.b(context, R.string.IDS_motiontrack_download_complete);
        } else {
            Intent intent = new Intent();
            intent.putExtra("moduleName", str);
            AppBundle.d().launchActivity(context, intent, new AppBundleLauncher.InstallCallback() { // from class: ohf.5
                @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                public boolean call(Context context2, Intent intent2) {
                    ohf.this.b(str);
                    qpx.b(context2, R.string.IDS_motiontrack_download_complete);
                    LogUtil.b("PremisesServiceManager", "leave downloadPlugin");
                    return false;
                }
            });
        }
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("PremisesServiceManager", "saveDownloadPluginFlag moduleName is empty");
        } else {
            KeyValDbManager.d(BaseApplication.b()).b(str, "download_plugin");
            a(str);
        }
    }

    private void a(String str) {
        Context contextB = BaseApplication.b();
        RemoteViews remoteViews = new RemoteViews(contextB.getPackageName(), R.layout.download_plugin_notify_layout);
        remoteViews.setTextViewText(R.id.des_textview, e(str));
        remoteViews.setTextViewText(R.id.download_textview, contextB.getResources().getString(R.string.IDS_bundle_download_button));
        int iHashCode = str.hashCode();
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(BaseApplication.d(), "com.huawei.pluginmessagecenter.activity.DispatchSkipEventActivity"));
        intent.putExtra(CommonUtil.DETAIL_URI, "messagecenter://download_plugin");
        intent.putExtra("msgId", "download_plugin");
        intent.putExtra("moduleName", str);
        PendingIntent activity = PendingIntent.getActivity(contextB, iHashCode, intent, 201326592);
        LogUtil.b("PremisesServiceManager", "sendNotify.");
        Notification.Builder builderC = lsb.d().c();
        builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
        builderC.setAutoCancel(true);
        if (EnvironmentInfo.g()) {
            LogUtil.b("PremisesServiceManager", "sendNotify isHarmony4AndLater.");
            builderC.setStyle(new Notification.BigTextStyle());
            builderC.setContentTitle(qre.f(R.string.IDS_scan_device));
            builderC.setContentText(e(str));
            builderC.addAction(new Notification.Action.Builder((Icon) null, qre.f(R.string.IDS_bundle_download_button), activity).build());
        } else {
            builderC.setCustomContentView(remoteViews);
            builderC.setStyle(new Notification.DecoratedCustomViewStyle());
        }
        builderC.setContentIntent(activity);
        builderC.setPriority(0);
        lsb.d().c(iHashCode, builderC.build());
    }
}
