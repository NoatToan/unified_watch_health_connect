package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.systemmanager.notificationmanager.HwNotificationManagerEx;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.notification.data.StorageType;
import com.huawei.ui.device.activity.notification.data.storage.NotificationCallback;
import com.huawei.ui.device.activity.notification.data.storage.NotificationResult;
import com.huawei.ui.device.activity.notification.data.storage.NotificationStorage;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qyd implements NotificationStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f46955b;
    private String e;

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public int getAppSwitch(String str) {
        return 0;
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void getNotifyReminderMode(int i, NotificationCallback<Integer> notificationCallback) {
    }

    public List<ResolveInfo> d() {
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        return BaseApplication.getContext().getPackageManager().queryIntentActivities(intent, 0);
    }

    private String b() {
        String str;
        List<String> listUnmodifiableList = Collections.unmodifiableList(Arrays.asList("com.android.mms", "cn.nubia.mms", "com.hihonor.mms", "com.samsung.android.messaging", "com.htc.sense.mms", "com.oneplus.mms", "com.google.android.apps.messaging"));
        Iterator<ResolveInfo> it = BaseApplication.getContext().getPackageManager().queryIntentActivities(new Intent("android.intent.action.SENDTO", Uri.parse("smsto:")), 1048576).iterator();
        while (true) {
            if (!it.hasNext()) {
                str = "";
                break;
            }
            ResolveInfo next = it.next();
            if (next != null && next.activityInfo != null && listUnmodifiableList.contains(next.activityInfo.packageName)) {
                str = next.activityInfo.packageName;
                break;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            LogUtil.a("SystemStrategy", "getSystemSmsPackageName resolveInfos packageName: ", str);
            return str;
        }
        for (String str2 : listUnmodifiableList) {
            if (mir.b(str2) != null) {
                str = str2;
                break;
            }
        }
        LogUtil.a("SystemStrategy", "getSystemSmsPackageName matchThirdPart packageName", str);
        return str;
    }

    public lzj c(String str) {
        PackageInfo packageInfoB = mir.b(str);
        if (packageInfoB == null) {
            LogUtil.j("SystemStrategy", "hasObtainSingleAppInfo packageInfo is null, packageName:", str);
            return null;
        }
        String string = packageInfoB.applicationInfo.loadLabel(BaseApplication.getContext().getPackageManager()).toString();
        if (TextUtils.isEmpty(string) || TextUtils.equals(str, string) || "Calendar data migrator".equals(string)) {
            LogUtil.j("SystemStrategy", "hasObtainSingleAppInfo appName is invalid, packageName:", str);
            return null;
        }
        int iA = a(BaseApplication.getContext().getPackageManager(), str);
        lzj lzjVar = new lzj();
        lzjVar.e(str);
        lzjVar.c(String.valueOf(packageInfoB.versionCode));
        lzjVar.d(iA);
        if ((this.f46955b && TextUtils.equals(str, this.e)) || (!this.f46955b && TextUtils.equals(str, this.f46954a))) {
            lzjVar.a(BaseApplication.getContext().getResources().getString(R.string.IDS_short_message));
            lzjVar.c(ContextCompat.getDrawable(BaseApplication.getContext(), R.mipmap.notification_icon_sms));
            LogUtil.a("SystemStrategy", "hasObtainSingleAppInfo smsApp style changed, origin name:", string, " packageName:", str);
            return lzjVar;
        }
        lzjVar.c(mir.a(str));
        lzjVar.a(string);
        return lzjVar;
    }

    public int a(PackageManager packageManager, String str) {
        if (packageManager == null || TextUtils.isEmpty(str)) {
            LogUtil.j("SystemStrategy", "getUidByPackageName error");
            return -1;
        }
        if (CommonUtil.at()) {
            try {
                return packageManager.getPackageUid(str, 0);
            } catch (PackageManager.NameNotFoundException unused) {
                LogUtil.e("SystemStrategy", "PackageManager NameNotFoundException");
            }
        }
        return -1;
    }

    public boolean e() {
        return mir.a();
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void getMainSwitch(NotificationCallback<Boolean> notificationCallback) {
        notificationCallback.onSuccess(Boolean.valueOf(mir.a()));
    }

    public boolean d(boolean z) {
        ContentResolver contentResolverB = mir.b(BaseApplication.getContext(), "SystemStrategy");
        if (contentResolverB != null) {
            return mir.d(contentResolverB, z, "SystemStrategy");
        }
        return false;
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void setNotifyReminderMode(int i, NotificationCallback<Boolean> notificationCallback) {
        LogUtil.a("SystemStrategy", "saveHarmonyNotificationCollaboration enter");
        BaseApplication.getContext().getContentResolver().insert(Uri.parse(lsu.f40768c), new ContentValues());
    }

    public boolean a() {
        Intent intent = new Intent();
        intent.setAction("com.huawei.action.NOTIFICATION_DECISION_CENTER");
        return !CollectionUtils.a(BaseApplication.getContext().getPackageManager().queryIntentContentProviders(intent, 0));
    }

    public boolean e(String str, int i) {
        boolean zAreNotificationsEnabledForPackage = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            zAreNotificationsEnabledForPackage = HwNotificationManagerEx.getNotificationManager().areNotificationsEnabledForPackage(str, i);
        } catch (RemoteException | SecurityException unused) {
            LogUtil.e("SystemStrategy", "checkAuthorityInSystem RemoteException exception");
        }
        LogUtil.a("SystemStrategy", str, " whose packageUid is: ", Integer.valueOf(i), ",status in system is: ", Boolean.valueOf(zAreNotificationsEnabledForPackage));
        return zAreNotificationsEnabledForPackage;
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void saveMainSwitch(int i, NotificationCallback<Integer> notificationCallback) {
        if (i != 1) {
            d(false);
            if (notificationCallback != null) {
                notificationCallback.onSuccess(Integer.valueOf(i));
                return;
            }
            return;
        }
        if (mir.a()) {
            if (notificationCallback != null) {
                notificationCallback.onSuccess(Integer.valueOf(i));
                return;
            }
            return;
        }
        NotificationStorage notificationStorageB = qxr.b(StorageType.LOCAL);
        if (notificationStorageB instanceof qye) {
            ((qye) notificationStorageB).c();
        }
        boolean zD = d(true);
        if (notificationCallback == null) {
            return;
        }
        if (zD) {
            notificationCallback.onSuccess(Integer.valueOf(i));
        } else {
            notificationCallback.onError(NotificationResult.SET_NOTIFICATION_STATUS_FAILED, "通知使用权设置失败");
        }
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void getAppSwitch(List<lzj> list, NotificationCallback<List<lzj>> notificationCallback) {
        this.e = ndj.b("SystemStrategy");
        this.f46954a = b();
        boolean zAn = LanguageUtil.an(BaseApplication.getContext());
        this.f46955b = zAn;
        LogUtil.a("SystemStrategy", " mDefaultSms:", this.e, " mSystemSms:", this.f46954a, " mIsDomestic:", Boolean.valueOf(zAn));
        List<lzj> arrayList = new ArrayList<>();
        for (String str : cio.f1619a) {
            lzj lzjVarC = c(str);
            if (lzjVarC == null) {
                LogUtil.j("SystemStrategy", "appListInfo is null:", str);
            } else {
                b(lzjVarC);
                arrayList.add(lzjVarC);
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<ResolveInfo> listD = d();
        LogUtil.a("SystemStrategy", "load system app cost:", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < listD.size(); i++) {
            String str2 = listD.get(i).activityInfo.packageName;
            if (!cio.f1621c.contains(str2) && !cio.f1619a.contains(str2)) {
                if (hashSet.contains(str2)) {
                    LogUtil.j("SystemStrategy", "obtainOtherPushApp contains packageName:", str2);
                } else {
                    lzj lzjVarC2 = c(str2);
                    if (lzjVarC2 == null) {
                        LogUtil.j("SystemStrategy", "appListInfo is null:", str2);
                    } else {
                        b(lzjVarC2);
                        arrayList2.add(lzjVarC2);
                        hashSet.add(lzjVarC2.f());
                    }
                }
            }
        }
        arrayList2.sort(new lzj.e());
        arrayList.addAll(arrayList2);
        if (notificationCallback != null) {
            notificationCallback.onSuccess(arrayList);
        }
    }

    private void b(lzj lzjVar) {
        String strB = ndj.b("SystemStrategy");
        NotificationStorage notificationStorageB = qxr.b(StorageType.LOCAL);
        qye qyeVar = notificationStorageB instanceof qye ? (qye) notificationStorageB : null;
        if (TextUtils.equals(strB, lzjVar.f()) || cio.e.contains(lzjVar.f())) {
            if (!"true".equals(qyeVar != null ? qyeVar.a("KEY_NOTIFICATION_SETTINGS_FIRST_OPEN_FLAG") : "true")) {
                lzjVar.e(1);
                qyeVar.saveAppSwitch(lzjVar, null);
            }
        }
        if (cio.d.equals(lzjVar.f())) {
            if (!rcv.a(BaseApplication.getContext()).g()) {
                lzjVar.e(0);
                qyeVar.saveAppSwitch(lzjVar, null);
            }
            if ("true".equals(qyeVar.a("KEY_NOTIFICATION_SETTINGS_FIRST_OPEN_FLAG_ADD"))) {
                return;
            }
            lzjVar.e(1);
            qyeVar.saveAppSwitch(lzjVar, null);
        }
    }

    @Override // com.huawei.ui.device.activity.notification.data.storage.NotificationStorage
    public void saveAppSwitch(lzj lzjVar, NotificationCallback<lzj> notificationCallback) {
        if (lzjVar.e() == 1 && CommonUtil.at() && lzjVar.a() != -1 && !TextUtils.isEmpty(lzjVar.f())) {
            try {
                HwNotificationManagerEx.getNotificationManager().setNotificationsEnabledForPackage(lzjVar.f(), lzjVar.a(), true);
            } catch (RemoteException | NullPointerException | SecurityException e) {
                LogUtil.e("SystemStrategy", "openSystemAuthority exception: ", LogAnonymous.b(e));
            }
        }
    }
}
