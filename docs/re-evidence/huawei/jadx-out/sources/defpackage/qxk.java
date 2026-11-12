package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.service.HandleIntentService;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.interactors.NotificationPushInteractor;
import health.compact.a.CommonUtil;
import health.compact.a.MagicBuild;

/* JADX INFO: loaded from: classes43.dex */
public class qxk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f46932a = new Object();
    private static qxk e;

    private qxk() {
    }

    public static qxk d() {
        qxk qxkVar;
        synchronized (f46932a) {
            if (e == null) {
                e = new qxk();
            }
            qxkVar = e;
        }
        return qxkVar;
    }

    public void c(String str, final boolean z, final String str2, final NotificationPushInteractor notificationPushInteractor) {
        if (cio.e.contains(str)) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: qxk.4
                @Override // java.lang.Runnable
                public void run() {
                    mhs.a().setSwitchSettingToLocal("KEY_NOTIFICATION_SETTINGS_FIRST_OPEN_FLAG", "true", 10001);
                    LogUtil.a("NotificationUiPresenter", "recordNotificationToLocal set ture");
                }
            });
        }
        if (cio.d.equals(str)) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: qxk.1
                @Override // java.lang.Runnable
                public void run() {
                    mhs.a().setSwitchSettingToLocal("KEY_NOTIFICATION_SETTINGS_FIRST_OPEN_FLAG_ADD", "true", 10001);
                    if (MagicBuild.f36615a && !CommonUtil.v(BaseApplication.getContext())) {
                        LogUtil.j("NotificationUiPresenter", "recordNotificationToLocal isNewHonor oversea phone return");
                        return;
                    }
                    if (eej.a(str2) != null && eej.a(str2).isSupportMidware()) {
                        lzi.a().a(notificationPushInteractor.b(), z);
                    }
                    LogUtil.a("NotificationUiPresenter", "recordNotificationToLocal intelligent set ture");
                }
            });
        }
    }

    public boolean c(Context context, lzj lzjVar, NotificationPushInteractor notificationPushInteractor) {
        try {
            PackageManager packageManager = context.getPackageManager();
            String string = packageManager.getApplicationLabel(packageManager.getApplicationInfo(cio.d, 128)).toString();
            int iD = qxg.d(packageManager, cio.d);
            lzjVar.d(iD);
            LogUtil.a("NotificationUiPresenter", "hasIntelligent name:", string, " uid:", Integer.valueOf(iD));
            boolean zG = rcv.a(BaseApplication.getContext()).g();
            if (!zG) {
                LogUtil.a("NotificationUiPresenter", "hasIntelligent not support intelligent");
                notificationPushInteractor.b(cio.d, 0);
            }
            return zG;
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.j("NotificationUiPresenter", "hasIntelligent isHasIntelligent is false");
            return false;
        }
    }

    public lzj b(Context context, lzj lzjVar, NotificationPushInteractor notificationPushInteractor) {
        try {
            PackageManager packageManager = context.getPackageManager();
            String string = packageManager.getApplicationLabel(packageManager.getApplicationInfo(cio.d, 128)).toString();
            Drawable applicationIcon = packageManager.getApplicationIcon(packageManager.getApplicationInfo(cio.d, 128));
            LogUtil.a("NotificationUiPresenter", "insertIntelligentInfo name ", string, " icon ", applicationIcon);
            lzjVar.e(cio.d);
            lzjVar.a(string);
            lzjVar.c(applicationIcon);
            lzjVar.e(notificationPushInteractor.b(cio.d));
            return lzjVar;
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("NotificationUiPresenter", "insertIntelligentPkg NameNotFoundException");
            return lzjVar;
        }
    }

    public void c(Context context, String str) {
        if (qxg.i()) {
            LogUtil.a("NotificationUiPresenter", "is support notification push icon.");
            Intent intent = new Intent(context, (Class<?>) HandleIntentService.class);
            intent.setPackage(context.getPackageName());
            intent.setAction("com.huawei.bone.ACTION_NOTIFICATION_PUSH");
            Bundle bundle = new Bundle();
            bundle.putString("packageName", str);
            bundle.putString("notificationSwitchChangeType", "subNotificationSwitchChangeType");
            intent.putExtras(bundle);
            context.startService(intent);
        }
    }

    public void b(Context context, String str) {
        if (cio.e.contains(str) || cio.d.equals(str)) {
            LogUtil.a("NotificationUiPresenter", "enter syncDefaultSwitchStatus");
            Intent intent = new Intent(context, (Class<?>) HandleIntentService.class);
            intent.setPackage(context.getPackageName());
            intent.setAction("com.huawei.health.ACTION_NOTIFICATION_ENABLE_PUSH");
            Bundle bundle = new Bundle();
            bundle.putString("notificationEnablePushType", "notificationEnablePushSubSwitch");
            intent.putExtras(bundle);
            context.startService(intent);
        }
    }
}
