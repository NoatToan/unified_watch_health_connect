package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.devicepair.api.MessageNotificationApi;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.util.NotificationContentProviderUtil;
import com.huawei.hwdevice.phoneprocess.service.HandleIntentService;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.systemmanager.notificationmanager.HwNotificationManagerEx;
import com.huawei.systemmanager.notificationmanager.IHwNotificationManager;
import com.huawei.ui.device.R;
import com.huawei.ui.device.interactors.NotificationPushInteractor;
import health.compact.a.CommonUtil;
import health.compact.a.EmuiBuild;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.MagicBuild;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = MessageNotificationApi.class)
@Singleton
public class rcs implements MessageNotificationApi {
    private String e;

    @Override // com.huawei.devicepair.api.MessageNotificationApi
    public boolean isSupportNotify(String str) {
        if (!rcv.a(BaseApplication.getContext()).g()) {
            LogUtil.a("MessageNotificationApiImpl", "not support intelligent");
            new NotificationPushInteractor(BaseApplication.getContext()).b(cio.d, 0);
        }
        DeviceCapability deviceCapabilityA = eej.a(str);
        if (deviceCapabilityA != null) {
            return deviceCapabilityA.isMessageAlert();
        }
        return false;
    }

    @Override // com.huawei.devicepair.api.MessageNotificationApi
    public int queryMessageNotificationStatus() {
        NotificationPushInteractor notificationPushInteractor = new NotificationPushInteractor(BaseApplication.getContext());
        if (!notificationPushInteractor.e()) {
            notificationPushInteractor.a(0);
        }
        return notificationPushInteractor.b() ? 1 : 0;
    }

    @Override // com.huawei.devicepair.api.MessageNotificationApi
    public int setMessageNotificationStatus(Context context, String str, int i) {
        NotificationPushInteractor notificationPushInteractor = new NotificationPushInteractor(BaseApplication.getContext());
        if (i != 1) {
            LogUtil.a("MessageNotificationApiImpl", "mNotificationSwitch false isAuthorizeEnabled is false");
            if (notificationPushInteractor.b()) {
                notificationPushInteractor.e(0);
                ContentResolver contentResolverB = mir.b(context, "MessageNotificationApiImpl");
                if (contentResolverB != null) {
                    mir.d(contentResolverB, false, "MessageNotificationApiImpl");
                }
                b(notificationPushInteractor, str);
                d(context, str, false);
            } else {
                d(context, str, false);
            }
        } else {
            notificationPushInteractor.e(1);
            if (!notificationPushInteractor.e()) {
                LogUtil.a("MessageNotificationApiImpl", "mNotificationSwitch true isAuthorizeEnabled is false");
                e(notificationPushInteractor, str, context);
            } else {
                LogUtil.a("MessageNotificationApiImpl", "mNotificationSwitch true isAuthorizeEnabled is true");
                b(notificationPushInteractor, str);
            }
            if (qxg.i()) {
                LogUtil.a("MessageNotificationApiImpl", "is support notification push icon.");
                c(context);
            }
            b(notificationPushInteractor);
            lzl.a(BaseApplication.getContext()).c(true, true);
            d(context, str, true);
        }
        return 1;
    }

    private void e(NotificationPushInteractor notificationPushInteractor, String str, Context context) {
        ContentResolver contentResolverB = mir.b(context, "MessageNotificationApiImpl");
        boolean zD = contentResolverB != null ? mir.d(contentResolverB, true, "MessageNotificationApiImpl") : false;
        LogUtil.a("MessageNotificationApiImpl", "checkedChangeSub isSuccess is ", Boolean.valueOf(zD));
        if (zD) {
            b(notificationPushInteractor, str);
        }
    }

    protected void d(Context context, String str, boolean z) {
        DeviceCapability deviceCapabilityA = eej.a(str);
        if (deviceCapabilityA == null || !deviceCapabilityA.isSupportMessageAlertInfo()) {
            LogUtil.j("MessageNotificationApiImpl", "createNotificationEnableIntent currentDevice is not support notification");
            return;
        }
        boolean zD = lzi.a().d();
        LogUtil.a("MessageNotificationApiImpl", "createNotificationEnableIntent notificationStatus is ", Boolean.valueOf(zD), ",isTurnOnSwitch is.", Boolean.valueOf(z));
        Intent intent = new Intent(context, (Class<?>) HandleIntentService.class);
        intent.setAction("com.huawei.health.ACTION_NOTIFICATION_ENABLE_PUSH");
        intent.putExtra("notificationEnablePushType", "notificationEnablePushMainSwitch");
        intent.putExtra("notificationEnableStatus", zD);
        intent.putExtra("notificationEnableTurnOnSwitch", z);
        context.startService(intent);
    }

    public static void b(NotificationPushInteractor notificationPushInteractor, String str) {
        if (MagicBuild.f36615a && !CommonUtil.v(BaseApplication.getContext())) {
            LogUtil.j("MessageNotificationApiImpl", "reportStatusToMidware isNewHonor oversea phone return");
            return;
        }
        boolean z = notificationPushInteractor.b(cio.d) != 0;
        LogUtil.a("MessageNotificationApiImpl", "isAuthorizeEnabled:", Boolean.valueOf(notificationPushInteractor.b()), " prompt: ", Boolean.valueOf(z));
        if (eej.a(str) == null || !eej.a(str).isSupportMidware()) {
            return;
        }
        lzi.a().a(notificationPushInteractor.b(), z);
    }

    private void c(Context context) {
        Intent intent = new Intent(context, (Class<?>) HandleIntentService.class);
        intent.setPackage(context.getPackageName());
        intent.setAction("com.huawei.bone.ACTION_NOTIFICATION_PUSH");
        Bundle bundle = new Bundle();
        bundle.putString("notificationSwitchChangeType", "notificationSwitchChangeType");
        intent.putExtras(bundle);
        context.startService(intent);
    }

    private void b(NotificationPushInteractor notificationPushInteractor) {
        LogUtil.a("MessageNotificationApiImpl", "enter saveFirstOpenAppToDb");
        int i = Integer.parseInt("1");
        for (String str : cio.e) {
            if (notificationPushInteractor.b(str) == i) {
                NotificationContentProviderUtil.a(str, i);
            }
        }
        if (notificationPushInteractor.b(cio.d) == i) {
            NotificationContentProviderUtil.a(cio.d, i);
        }
    }

    @Override // com.huawei.devicepair.api.MessageNotificationApi
    public boolean setNotificationRemindStatus(Context context, int i, int i2) {
        if (i == 2) {
            a(context, "switch_smart_notify_reminder", i2);
            return true;
        }
        a(context, "switch_silent_notify_using_phone", i2);
        return true;
    }

    private void a(final Context context, final String str, int i) {
        mhs.a().setSwitchSetting(str, String.valueOf(i), new IBaseResponseCallback() { // from class: rcs.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                rcs.this.d(context);
                if ("switch_smart_notify_reminder".equals(str)) {
                    qxg.d();
                }
                if ("switch_smart_notify_reminder".equals(str) && i2 == 0) {
                    NotificationContentProviderUtil.g();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context) {
        Intent intent = new Intent(context, (Class<?>) HandleIntentService.class);
        intent.setPackage(context.getPackageName());
        intent.setAction("com.huawei.bone.ACTION_NOTIFICATION_PUSH");
        Bundle bundle = new Bundle();
        bundle.putString("notificationSwitchChangeType", "notification_collaborate_switch_change");
        intent.putExtras(bundle);
        context.startService(intent);
    }

    @Override // com.huawei.devicepair.api.MessageNotificationApi
    public void queryApplicationInfoList(final Context context, final String str, final IBaseResponseCallback iBaseResponseCallback) {
        ThreadPoolManager.c().a("MessageNotificationApiImpl", new Runnable() { // from class: rcs.5
            @Override // java.lang.Runnable
            public void run() {
                rcs rcsVar = rcs.this;
                Context context2 = context;
                iBaseResponseCallback.a(0, rcsVar.d(context2, (List<lzj>) rcsVar.b(context2), str));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<lzj> b(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        return d(context, context.getPackageManager().queryIntentActivities(intent, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<cjr> d(Context context, List<lzj> list, String str) {
        ArrayList arrayList = new ArrayList(16);
        for (lzj lzjVar : list) {
            cjr cjrVar = new cjr();
            Drawable drawableB = lzjVar.b();
            if (drawableB == null && (drawableB = mir.a(lzjVar.f())) == null) {
                drawableB = context.getResources().getDrawable(R.mipmap.notification_icon_sms);
                LogUtil.j("MessageNotificationApiImpl", "onBindViewHolder drawable is null ", lzjVar.f());
            }
            cjrVar.b(rcn.d(qqf.a(drawableB)));
            cjrVar.a(lzjVar.d());
            cjrVar.e(lzjVar.f());
            cjrVar.c(String.valueOf(lzjVar.a()));
            cjrVar.d(lzjVar.e() == 1 ? "1" : "0");
            d(context, lzjVar, str);
            b(context, lzjVar);
            arrayList.add(cjrVar);
        }
        return arrayList;
    }

    private void d(Context context, lzj lzjVar, String str) {
        NotificationPushInteractor notificationPushInteractor = new NotificationPushInteractor(context);
        int i = lzjVar.e() == 1 ? 1 : 0;
        boolean z = lzjVar.e() == 1;
        LogUtil.a("MessageNotificationApiImpl", "current authority:", Integer.valueOf(i), ", flag:", Integer.valueOf(lzjVar.e()), " pkg:", lzjVar.f());
        if (i != lzjVar.e()) {
            lzjVar.e(i);
            notificationPushInteractor.b(lzjVar.f(), i);
        }
        qxk.d().c(lzjVar.f(), z, str, notificationPushInteractor);
    }

    private void b(Context context, lzj lzjVar) {
        LogUtil.a("MessageNotificationApiImpl", "getView isSetFirstOpen: ", Boolean.valueOf("true".equals(mhs.a().getSwitchSettingFromLocal("KEY_NOTIFICATION_SETTINGS_FIRST_OPEN_FLAG", 10001))));
        int iIntValue = Integer.valueOf("1").intValue();
        NotificationPushInteractor notificationPushInteractor = new NotificationPushInteractor(context);
        LogUtil.a("MessageNotificationApiImpl", "packagename:", lzjVar.d(), " is autho: ", Integer.valueOf(lzjVar.e()), " is auto 2:", Integer.valueOf(notificationPushInteractor.b(lzjVar.f())));
        if (notificationPushInteractor.b(lzjVar.f()) == iIntValue) {
            NotificationContentProviderUtil.a(lzjVar.f(), iIntValue);
        }
    }

    private List<lzj> d(Context context, List<ResolveInfo> list) {
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        ArrayList arrayList3 = new ArrayList(16);
        a(context, arrayList, arrayList2);
        c(context, arrayList, arrayList2);
        c(context, list, arrayList, arrayList2, arrayList3);
        Collections.sort(arrayList3, new lzj.e());
        ArrayList arrayList4 = new ArrayList(arrayList.size() + arrayList2.size() + arrayList3.size());
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        LogUtil.a("MessageNotificationApiImpl", "loadAllAppInfo size:", Integer.valueOf(arrayList4.size()));
        return arrayList4;
    }

    private void a(Context context, List<lzj> list, List<lzj> list2) {
        ArrayList arrayList = new ArrayList(16);
        arrayList.addAll(cio.e);
        for (int i = 0; i < arrayList.size(); i++) {
            String str = (String) arrayList.get(i);
            lzj lzjVar = new lzj();
            if (e(context, str, lzjVar, true)) {
                if (lzjVar.e() == 1) {
                    list.add(lzjVar);
                } else {
                    list2.add(lzjVar);
                }
            }
        }
    }

    private void c(Context context, List<ResolveInfo> list, List<lzj> list2, List<lzj> list3, List<lzj> list4) {
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).activityInfo.packageName;
            if (!cio.f1621c.contains(str) && !cio.e.contains(str)) {
                if (arrayList2.contains(str)) {
                    LogUtil.j("MessageNotificationApiImpl", "obtainOtherPushApp contains packageName:", str);
                } else {
                    lzj lzjVar = new lzj();
                    if (e(context, str, lzjVar, false)) {
                        arrayList2.add(str);
                        if (lzjVar.e() == 1) {
                            list2.add(lzjVar);
                        } else if (cio.f1619a.contains(str)) {
                            arrayList.add(lzjVar);
                        } else {
                            list4.add(lzjVar);
                        }
                    }
                }
            }
        }
        arrayList2.clear();
        list3.addAll(qxg.c(arrayList));
    }

    private boolean e(Context context, String str, lzj lzjVar, boolean z) {
        PackageInfo packageInfoB = mir.b(str);
        if (packageInfoB == null) {
            LogUtil.j("MessageNotificationApiImpl", "hasObtainSingleAppInfo packageInfo is null, packageName:", str);
            return false;
        }
        String strD = qxg.d(context, str);
        if (TextUtils.isEmpty(strD) || TextUtils.equals(str, strD) || "Calendar data migrator".equals(strD)) {
            LogUtil.j("MessageNotificationApiImpl", "hasObtainSingleAppInfo appName is invalid, packageName:", str);
            return false;
        }
        int iD = qxg.d(context.getPackageManager(), str);
        lzjVar.e(str);
        lzjVar.c(String.valueOf(packageInfoB.versionCode));
        lzjVar.d(iD);
        String strB = ndj.b("MessageNotificationApiImpl");
        if (TextUtils.isEmpty(this.e)) {
            this.e = d();
        }
        boolean zAn = LanguageUtil.an(context);
        if (!(zAn && TextUtils.equals(str, strB)) && (zAn || !TextUtils.equals(str, this.e))) {
            lzjVar.a(strD);
        } else {
            if (!z) {
                return false;
            }
            lzjVar.a(context.getResources().getString(R.string.IDS_short_message));
            lzjVar.c(context.getResources().getDrawable(R.mipmap.notification_icon_sms));
            LogUtil.a("MessageNotificationApiImpl", "hasObtainSingleAppInfo smsApp style changed, origin name:", strD, " packageName:", str);
        }
        int iB = new NotificationPushInteractor(BaseApplication.getContext()).b(str);
        LogUtil.a("MessageNotificationApiImpl", "hasObtainSingleAppInfo packageName:", str, " appName:", lzjVar.d(), " authorizeFlag:", Integer.valueOf(iB));
        lzjVar.e(e(str, iB, lzjVar));
        return true;
    }

    private int e(String str, int i, lzj lzjVar) {
        if ((!TextUtils.equals(ndj.b("MessageNotificationApiImpl"), str) && !cio.e.contains(str)) || "true".equals(mhs.a().getSwitchSettingFromLocal("KEY_NOTIFICATION_SETTINGS_FIRST_OPEN_FLAG", 10001)) || i == 1) {
            return i;
        }
        lzjVar.e(1);
        new NotificationPushInteractor(BaseApplication.getContext()).b(str, 1);
        return 1;
    }

    private String d() {
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
            LogUtil.a("MessageNotificationApiImpl", "getSystemSmsPackageName resolveInfos packageName: ", str);
            return str;
        }
        for (String str2 : listUnmodifiableList) {
            if (mir.b(str2) != null) {
                str = str2;
                break;
            }
        }
        LogUtil.a("MessageNotificationApiImpl", "getSystemSmsPackageName matchThirdPart packageName", str);
        return str;
    }

    private void c(Context context, List<lzj> list, List<lzj> list2) {
        lzj lzjVar = new lzj();
        if (!qxk.d().c(context, lzjVar, new NotificationPushInteractor(BaseApplication.getContext()))) {
            LogUtil.j("MessageNotificationApiImpl", "obtainIntelligentPushApp isSupportIntelligent false");
            return;
        }
        int iB = new NotificationPushInteractor(BaseApplication.getContext()).b(cio.d);
        if (iB == 1) {
            list.add(qxk.d().b(context, lzjVar, new NotificationPushInteractor(BaseApplication.getContext())));
        } else if (d(cio.d, iB, lzjVar) != 1) {
            LogUtil.a("MessageNotificationApiImpl", "obtainIntelligentPushApp intelligent add mainAppList");
            list2.add(qxk.d().b(context, lzjVar, new NotificationPushInteractor(BaseApplication.getContext())));
        } else {
            list.add(qxk.d().b(context, lzjVar, new NotificationPushInteractor(BaseApplication.getContext())));
        }
    }

    private int d(String str, int i, lzj lzjVar) {
        lzjVar.e(cio.d);
        if ("true".equals(mhs.a().getSwitchSettingFromLocal("KEY_NOTIFICATION_SETTINGS_FIRST_OPEN_FLAG_ADD", 10001))) {
            LogUtil.j("MessageNotificationApiImpl", "getIsPushEnableIntelligent already set value");
            return i;
        }
        boolean zA = qxg.a(lzjVar);
        if (i == 1 || !zA) {
            return i;
        }
        lzjVar.e(1);
        new NotificationPushInteractor(BaseApplication.getContext()).b(str, 1);
        LogUtil.a("03", 1, "MessageNotificationApiImpl", "set authorizeFlag auto!");
        return 1;
    }

    @Override // com.huawei.devicepair.api.MessageNotificationApi
    public cjr setApplicationNotificationStatus(Context context, String str, String str2, int i) {
        NotificationPushInteractor notificationPushInteractor = new NotificationPushInteractor(context);
        int iB = notificationPushInteractor.b(str);
        LogUtil.a("MessageNotificationApiImpl", "setApplicationNotificationStatus: ", str, Integer.valueOf(i), Integer.valueOf(iB));
        if (i != iB) {
            qxk.d().b(context, str);
        }
        notificationPushInteractor.b(str, i);
        boolean z = 1 == i;
        qxk.d().c(str, z, str2, new NotificationPushInteractor(context));
        if (z) {
            qxk.d().c(context, str);
        }
        cjr cjrVar = new cjr();
        cjrVar.e(str);
        cjrVar.d(String.valueOf(i));
        return cjrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huawei.devicepair.api.MessageNotificationApi
    public cjp queryNotificationRemind(String str) {
        Object[] objArr = qxg.c() && qxg.f();
        Object[] objArr2 = qxg.h() && eei.e() != 1;
        cjp cjpVar = new cjp();
        if (objArr2 != true && objArr != true) {
            cjpVar.a(0);
            return cjpVar;
        }
        if (objArr != false) {
            cjpVar.a(2);
            boolean[] zArrA = a();
            cjpVar.c(zArrA[0] ? 1 : 0);
            if (zArrA[1]) {
                cjpVar.d(true);
            }
            return cjpVar;
        }
        cjpVar.a(1);
        cjpVar.c(c(false));
        return cjpVar;
    }

    @Override // com.huawei.devicepair.api.MessageNotificationApi
    public boolean isMessagePermission(Context context) {
        if (mir.a()) {
            return true;
        }
        ContentResolver contentResolverB = mir.b(context, "MessageNotificationApiImpl");
        if (contentResolverB != null) {
            return mir.d(contentResolverB, true, "MessageNotificationApiImpl");
        }
        return false;
    }

    private boolean[] a() {
        final boolean[] zArr = new boolean[2];
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        mhs.a().getSwitchSetting("switch_smart_notify_reminder", new IBaseResponseCallback() { // from class: rcs.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("MessageNotificationApiImpl", "initSmartNotifyReminderView errorCode:", Integer.valueOf(i));
                if (i != 0) {
                    zArr[1] = true;
                    int iC = rcs.this.c(true);
                    if (iC == -1 && qxg.j()) {
                        LogUtil.a("MessageNotificationApiImpl", "getSmartNotifyStatus isSupportNotifyReminderSwitchClose");
                        iC = 0;
                    }
                    boolean[] zArr2 = zArr;
                    boolean z = iC == 1;
                    zArr2[0] = z;
                    LogUtil.a("MessageNotificationApiImpl", "getSmartNotifyStatus:", Boolean.valueOf(z));
                } else if (obj instanceof String) {
                    LogUtil.a("MessageNotificationApiImpl", "getSmartNotifyStatus objectData: ", obj);
                    zArr[0] = !"0".equals(obj);
                }
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
            return zArr;
        } catch (InterruptedException unused) {
            LogUtil.e("MessageNotificationApiImpl", "getNotifyStatus exception");
            return zArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c(final boolean z) {
        final int[] iArr = new int[1];
        final int[] iArr2 = {-1};
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        mhs.a().getSwitchSetting("switch_silent_notify_using_phone", new IBaseResponseCallback() { // from class: rcs.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                String str;
                LogUtil.a("MessageNotificationApiImpl", "getNotifyStatus errorCode:", Integer.valueOf(i));
                if (i == 0) {
                    if (!(obj instanceof String)) {
                        str = "1";
                    } else {
                        str = (String) obj;
                        LogUtil.a("MessageNotificationApiImpl", "getNotifyStatus buttonStatus:", str);
                    }
                    if ("0".equals(str)) {
                        iArr[0] = 0;
                    } else {
                        iArr[0] = 1;
                    }
                    iArr2[0] = iArr[0];
                } else if (z) {
                    iArr2[0] = rcs.this.b(true);
                } else {
                    iArr[0] = rcs.this.b(false);
                }
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            LogUtil.e("MessageNotificationApiImpl", "getNotifyStatus exception");
        }
        if (z) {
            return iArr2[0];
        }
        return iArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b(boolean z) {
        final int[] iArr = new int[1];
        final int[] iArr2 = {-1};
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        mhs.a().getSwitchSetting("lock_screen_reminder_switch", new IBaseResponseCallback() { // from class: rcs.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.j("MessageNotificationApiImpl", "enter  getReminderOldSwitch");
                boolean z2 = (i == 0 || !qxg.j()) ? 0 : 1;
                if (i == 0 && (obj instanceof String)) {
                    boolean zEquals = "0".equals(obj);
                    z2 = !zEquals;
                    iArr2[0] = zEquals ? 1 : 0;
                    LogUtil.a("MessageNotificationApiImpl", "getReminderOldSwitch isChecked:", Boolean.valueOf(z2));
                }
                iArr[0] = !z2;
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            LogUtil.e("MessageNotificationApiImpl", "getNotifyStatus exception");
        }
        if (z) {
            return iArr2[0];
        }
        return iArr[0];
    }

    @Override // com.huawei.devicepair.api.MessageNotificationApi
    public boolean isAppNotificationEnabled(Context context, cjr cjrVar) {
        return e(context, cjrVar);
    }

    private boolean e(Context context, cjr cjrVar) {
        LogUtil.a("MessageNotificationApiImpl", "getUidByPackageName system is:", Integer.valueOf(EmuiBuild.e));
        if (context == null || cjrVar == null) {
            LogUtil.j("MessageNotificationApiImpl", "remindOpenSystemAuthority error");
            return false;
        }
        if (!CommonUtil.at()) {
            return true;
        }
        int i = Integer.parseInt(cjrVar.b());
        if (TextUtils.isEmpty(cjrVar.b()) || qxg.d(cjrVar.e(), i)) {
            return true;
        }
        LogUtil.a("MessageNotificationApiImpl", "remindOpenSystemAuthority is not open");
        return false;
    }

    @Override // com.huawei.devicepair.api.MessageNotificationApi
    public void enabledAppNotification(Context context, cjr cjrVar) {
        if (cjrVar == null) {
            LogUtil.j("MessageNotificationApiImpl", "enabledAppNotification, app is null");
            return;
        }
        IHwNotificationManager notificationManager = HwNotificationManagerEx.getNotificationManager();
        try {
            String strE = cjrVar.e();
            String strB = cjrVar.b();
            if (TextUtils.isEmpty(strE) || TextUtils.isEmpty(strB)) {
                return;
            }
            notificationManager.setNotificationsEnabledForPackage(strE, Integer.parseInt(strB), true);
        } catch (RemoteException | SecurityException e) {
            LogUtil.e("MessageNotificationApiImpl", "openSystemAuthority exception: ", LogAnonymous.b(e));
        }
    }
}
