package com.huawei.hwdevice.outofprocess.util;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.CursorWindowAllocationException;
import android.database.SQLException;
import android.database.StaleDataException;
import android.database.sqlite.SQLiteFullException;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.util.NotificationContentProviderUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import defpackage.coq;
import defpackage.ffv;
import defpackage.lon;
import defpackage.lsu;
import defpackage.mhs;
import defpackage.ncp;
import defpackage.qhq;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class NotificationContentProviderUtil {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f17421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f17422c;
    private static String j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f17420a = new Object();
    private static final Object d = new Object();
    private static final Set<NotificationLiveChangerListener> e = new LinkedHashSet(16);
    private static List<String> i = new ArrayList();
    private static Map<String, String> h = new HashMap();
    private static Map<String, List<String>> g = new HashMap();

    public interface NotificationLiveChangerListener {
        void onChanger(boolean z);
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("NotifiContProvUt", "isAppSubSwitchPushEnable packageName is empty");
            return false;
        }
        try {
            Cursor cursorQuery = BaseApplication.getContext().getContentResolver().query(Uri.parse(lsu.j), null, null, null, null);
            try {
                LogUtil.a("NotifiContProvUt", lsu.a("NotificationList", null, null, null, null));
                if (cursorQuery == null || cursorQuery.getCount() == 0) {
                    LogUtil.j("NotifiContProvUt", "isAppSubSwitchPushEnable cursor is null");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } else {
                    while (cursorQuery.moveToNext()) {
                        Integer numA = lsu.a("name", cursorQuery, "NotifiContProvUt");
                        if (numA == null) {
                            LogUtil.j("NotifiContProvUt", "isAppSubSwitchPushEnable columnIndex is null");
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        } else if (TextUtils.equals(str, cursorQuery.getString(numA.intValue()))) {
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return true;
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return false;
                }
                return false;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            LogUtil.a("NotifiContProvUt", "isAppSubSwitchPushEnable Exception: ", LogAnonymous.b(e2));
        }
    }

    public static void a(String str, int i2) {
        Uri uri = Uri.parse(lsu.j);
        boolean zA = a(str);
        LogUtil.a("NotifiContProvUt", "saveToDatabase packageName: ", str, " closeStatus: ", Integer.valueOf(i2), " hasKey: ", Boolean.valueOf(zA));
        try {
            ContentResolver contentResolver = BaseApplication.getContext().getContentResolver();
            if (zA && i2 == 0) {
                contentResolver.delete(uri, "name=?", new String[]{str});
                return;
            }
            if (!zA && i2 == 1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("name", str);
                contentResolver.insert(uri, contentValues);
                return;
            }
            LogUtil.j("NotifiContProvUt", "saveToDatabase else");
        } catch (SQLiteFullException e2) {
            ReleaseLogUtil.a("NotifiContProvUt", "saveToDatabase, SQLiteFullException: ", LogAnonymous.b(e2));
        } catch (IllegalArgumentException unused) {
            LogUtil.e("NotifiContProvUt", "saveToDatabase IllegalArgumentException.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r2 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List<String> j() {
        ArrayList arrayList = new ArrayList(16);
        try {
            Cursor cursorQuery = BaseApplication.getContext().getContentResolver().query(Uri.parse(lsu.j), null, null, null, null);
            try {
                LogUtil.a("NotifiContProvUt", lsu.a("NotificationList", null, null, null, null));
                if (cursorQuery != null && cursorQuery.getCount() != 0) {
                    while (cursorQuery.moveToNext()) {
                        Integer numA = lsu.a("name", cursorQuery, "NotifiContProvUt");
                        if (numA == null) {
                            LogUtil.j("NotifiContProvUt", "getPushEnableApps columnIndex is null");
                            if (cursorQuery != null) {
                                cursorQuery.close();
                                return arrayList;
                            }
                            return arrayList;
                        }
                        String string = cursorQuery.getString(numA.intValue());
                        if (string.contains(".")) {
                            arrayList.add(string);
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                        return arrayList;
                    }
                    return arrayList;
                }
                LogUtil.j("NotifiContProvUt", "getPushEnableApps cursor is null");
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (CursorWindowAllocationException unused) {
            LogUtil.e("NotifiContProvUt", "getPushEnableApps SQLECursorWindowAllocationException");
        } catch (SQLException unused2) {
            LogUtil.e("NotifiContProvUt", "getPushEnableApps SQLException");
        } catch (Exception unused3) {
            LogUtil.e("NotifiContProvUt", "getPushEnableApps Exception");
        }
    }

    public static void a(boolean z) {
        LogUtil.a("NotifiContProvUt", "setForbiddenValue intoProvider,USE_SYNERGY? isForbidden: ", Boolean.valueOf(z));
        ContentResolver contentResolver = BaseApplication.getContext().getContentResolver();
        Uri uri = Uri.parse(lsu.h);
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("value", (Integer) 1);
        } else {
            contentValues.put("value", (Integer) 0);
        }
        try {
            contentResolver.update(uri, contentValues, "name=?", new String[]{"is_Forbidden"});
        } catch (SQLException | IllegalArgumentException e2) {
            LogUtil.e("NotifiContProvUt", "setForbiddenValue Exception:", LogAnonymous.b(e2));
        }
    }

    public static void c(int i2) {
        LogUtil.a("NotifiContProvUt", "updateIsAuthorizedToNotificationFlagsDb status: ", Integer.valueOf(i2));
        b(i2, false);
    }

    public static void b(int i2, boolean z) {
        LogUtil.a("NotifiContProvUt", "updateIsAuthorizedToDb status: ", Integer.valueOf(i2), ",isHarmonyOS30SendNotify:", Boolean.valueOf(z));
        ContentResolver contentResolver = BaseApplication.getContext().getContentResolver();
        Uri uri = Uri.parse(lsu.h);
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", Integer.valueOf(i2));
        contentValues.put("isNotify", Boolean.valueOf(z));
        try {
            contentResolver.update(uri, contentValues, "name=?", new String[]{"authorized"});
        } catch (SQLException | IllegalArgumentException e2) {
            LogUtil.e("NotifiContProvUt", "updateIsSupportNotificationToNotificationFlagsDb Exception:", LogAnonymous.b(e2));
        }
    }

    public static boolean b() {
        String[] strArr = {"value"};
        String[] strArr2 = {"authorized"};
        try {
            Cursor cursorQuery = BaseApplication.getContext().getContentResolver().query(Uri.parse(lsu.h), strArr, "name=?", strArr2, null);
            try {
                LogUtil.a("NotifiContProvUt", lsu.a("NotificationFlags", strArr, "name=?", strArr2, null));
                if (cursorQuery == null || cursorQuery.getCount() == 0) {
                    LogUtil.j("NotifiContProvUt", "getNotificationStatus cursor is null");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } else {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return false;
                    }
                    Integer numA = lsu.a("value", cursorQuery, "NotifiContProvUt");
                    if (numA == null) {
                        LogUtil.j("NotifiContProvUt", "getNotificationStatus columnIndex is null");
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } else {
                        boolean z = cursorQuery.getInt(numA.intValue()) == 1;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return z;
                    }
                }
                return false;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (CursorWindowAllocationException | SQLException | StaleDataException | IllegalArgumentException e2) {
            LogUtil.a("NotifiContProvUt", "getNotificationStatus Exception: ", LogAnonymous.b(e2));
        }
    }

    public static boolean h() {
        String[] strArr = {"value"};
        String[] strArr2 = {"authorized"};
        boolean z = true;
        try {
            Cursor cursorQuery = BaseApplication.getContext().getContentResolver().query(Uri.parse(lsu.h), strArr, "name=?", strArr2, null);
            try {
                LogUtil.a("NotifiContProvUt", lsu.a("NotificationFlags", strArr, "name=?", strArr2, null));
                if (cursorQuery == null || cursorQuery.getCount() == 0) {
                    LogUtil.j("NotifiContProvUt", "isInitStatusNotificationAuthorized cursor is null,result: ", true);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } else {
                    if (cursorQuery.moveToFirst()) {
                        Integer numA = lsu.a("value", cursorQuery, "NotifiContProvUt");
                        if (numA == null) {
                            LogUtil.j("NotifiContProvUt", "isInitStatusNotificationAuthorized columnIndex is null,result: ", true);
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        } else {
                            int i2 = cursorQuery.getInt(numA.intValue());
                            if (i2 == 1 || i2 == 0) {
                                z = false;
                            }
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    LogUtil.a("NotifiContProvUt", "isInitStatusNotificationAuthorized result is: ", Boolean.valueOf(z));
                    return z;
                }
                return true;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SQLException | StaleDataException | IllegalArgumentException e2) {
            LogUtil.a("NotifiContProvUt", "isInitStatusNotificationAuthorized Exception: ", LogAnonymous.b(e2));
        }
    }

    public static void e(boolean z) {
        ContentResolver contentResolver = BaseApplication.getContext().getContentResolver();
        Uri uri = Uri.parse(lsu.h);
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("value", (Integer) 1);
        } else {
            contentValues.put("value", (Integer) 0);
        }
        try {
            contentResolver.update(uri, contentValues, "name=?", new String[]{"is_MessageAlert"});
            LogUtil.a("NotifiContProvUt", "updateIsSupportNotificationToNotificationFlagsDb isSupportNotification:", Boolean.valueOf(z));
        } catch (SQLException | IllegalArgumentException | SecurityException e2) {
            LogUtil.e("NotifiContProvUt", "updateIsSupportNotificationToNotificationFlagsDb Exception:", LogAnonymous.b(e2));
        }
    }

    public static boolean i() {
        String[] strArr = {"value"};
        String[] strArr2 = {"is_MessageAlert"};
        try {
            Cursor cursorQuery = BaseApplication.getContext().getContentResolver().query(Uri.parse(lsu.h), strArr, "name=?", strArr2, null);
            try {
                LogUtil.a("NotifiContProvUt", lsu.a("NotificationFlags", strArr, "name=?", strArr2, null));
                if (cursorQuery == null || cursorQuery.getCount() == 0) {
                    LogUtil.j("NotifiContProvUt", "isDeviceCapabilitySupportNotification cursor is null");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } else {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return false;
                    }
                    Integer numA = lsu.a("value", cursorQuery, "NotifiContProvUt");
                    if (numA == null) {
                        LogUtil.j("NotifiContProvUt", "isDeviceCapabilitySupportNotification columnIndex is null");
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } else {
                        boolean z = cursorQuery.getInt(numA.intValue()) == 1;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return z;
                    }
                }
                return false;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (CursorWindowAllocationException | SQLException e2) {
            LogUtil.a("NotifiContProvUt", "isDeviceCapabilitySupportNotification SQLException: ", ExceptionUtils.c(e2));
        }
    }

    public static void g() {
        LogUtil.a("NotifiContProvUt", "saveHarmonyNotificationCollaboration enter");
        BaseApplication.getContext().getContentResolver().insert(Uri.parse(lsu.f40768c), new ContentValues());
    }

    public static void c(IBaseResponseCallback iBaseResponseCallback) {
        if (!ncp.i() || !b()) {
            LogUtil.a("NotifiContProvUt", "isJoinHarmonyNotificationCollaboration witch is false");
            iBaseResponseCallback.a(0, false);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add("900500010");
            qhq.b("9005", arrayList, new AnonymousClass5(iBaseResponseCallback));
        }
    }

    /* JADX INFO: renamed from: com.huawei.hwdevice.outofprocess.util.NotificationContentProviderUtil$5, reason: invalid class name */
    public class AnonymousClass5 implements HiDataReadResultListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ IBaseResponseCallback f17424c;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        AnonymousClass5(IBaseResponseCallback iBaseResponseCallback) {
            this.f17424c = iBaseResponseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            LogUtil.a("NotifiContProvUt", "isJoinHarmonyCollaboration onResult errorCode: ", Integer.valueOf(i), ", data: ", obj);
            if (coq.e(obj, HiSampleConfig.class)) {
                List list = (List) obj;
                if (!coq.d(list)) {
                    String strA = ffv.a(((HiSampleConfig) list.get(0)).getConfigData(), "switch_smart_notify_reminder");
                    LogUtil.a("NotifiContProvUt", "isJoinHarmonyCollaboration cloudReminderSwitchState=", strA);
                    if (!TextUtils.isEmpty(strA) && ncp.i() && ncp.d()) {
                        boolean z = !"0".equals(strA);
                        LogUtil.a("NotifiContProvUt", "isJoinHarmonyCollaboration harmony 3.0 cloudSwitchState isChecked:", Boolean.valueOf(z));
                        this.f17424c.a(0, Boolean.valueOf(z));
                        return;
                    }
                }
            }
            mhs mhsVarA = mhs.a();
            final IBaseResponseCallback iBaseResponseCallback = this.f17424c;
            mhsVarA.getSwitchSetting("switch_smart_notify_reminder", new IBaseResponseCallback() { // from class: miu
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i3, Object obj2) {
                    NotificationContentProviderUtil.AnonymousClass5.e(iBaseResponseCallback, i3, obj2);
                }
            });
        }

        public static /* synthetic */ void e(IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
            LogUtil.a("NotifiContProvUt", "isJoinHarmonyNotificationCollaboration oldErrorCode:", Integer.valueOf(i));
            if (i != 0 && ncp.o()) {
                iBaseResponseCallback.a(0, false);
            } else if (i == 0 && (obj instanceof String)) {
                boolean z = !"0".equals(obj);
                LogUtil.a("NotifiContProvUt", "isJoinHarmonyNotificationCollaboration isChecked:", Boolean.valueOf(z));
                iBaseResponseCallback.a(0, Boolean.valueOf(z));
            }
        }
    }

    public static boolean f() {
        if (!EnvironmentInfo.g()) {
            return false;
        }
        if (!f17421b) {
            k();
        }
        return f17422c;
    }

    public static void e(NotificationLiveChangerListener notificationLiveChangerListener) {
        if (notificationLiveChangerListener == null) {
            return;
        }
        synchronized (f17420a) {
            Set<NotificationLiveChangerListener> set = e;
            int size = set.size();
            set.add(notificationLiveChangerListener);
            ReleaseLogUtil.d("R_NotifiContProvUt", "registerNotificationLiveChanger oldSize=", Integer.valueOf(size), " currentSize=", Integer.valueOf(set.size()));
            if (!f17421b) {
                k();
            }
        }
    }

    public static void d(NotificationLiveChangerListener notificationLiveChangerListener) {
        if (notificationLiveChangerListener == null) {
            return;
        }
        synchronized (f17420a) {
            Set<NotificationLiveChangerListener> set = e;
            int size = set.size();
            set.remove(notificationLiveChangerListener);
            ReleaseLogUtil.d("R_NotifiContProvUt", "unRegisterNotificationLiveChanger oldSize=", Integer.valueOf(size), " currentSize=", Integer.valueOf(set.size()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n() {
        synchronized (f17420a) {
            Set<NotificationLiveChangerListener> set = e;
            ReleaseLogUtil.d("R_NotifiContProvUt", "notifyNotificationLiveChanger currentSize=", Integer.valueOf(set.size()));
            Iterator<NotificationLiveChangerListener> it = set.iterator();
            while (it.hasNext()) {
                it.next().onChanger(f17422c);
            }
        }
    }

    private static void k() {
        synchronized (f17420a) {
            if (f17421b) {
                return;
            }
            f17421b = true;
            f17422c = l();
            HiHealthNativeApi.a(BaseApplication.getContext()).subscribeHiHealthData(102, new HiSubscribeListener() { // from class: com.huawei.hwdevice.outofprocess.util.NotificationContentProviderUtil.4
                @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
                public void onResult(List<Integer> list, List<Integer> list2) {
                    LogUtil.a("NotifiContProvUt", "isNotificationLiveEnabled onResult");
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    LogUtil.a("NotifiContProvUt", "isNotificationLiveEnabled success");
                }

                @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
                public void onChange(int i2, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j2) {
                    boolean zL;
                    LogUtil.a("NotifiContProvUt", "registerNotificationLiveChanger onChange type = ", Integer.valueOf(i2), ",changeKey = ", str);
                    if (i2 == 102) {
                        if (("notification_live_switch".equals(str) || "HiSyncUserData".equals(str)) && NotificationContentProviderUtil.f17422c != (zL = NotificationContentProviderUtil.l())) {
                            LogUtil.a("NotifiContProvUt", "liveInfo cloud switch state is different,change to: ", Boolean.valueOf(zL));
                            boolean unused = NotificationContentProviderUtil.f17422c = zL;
                            NotificationContentProviderUtil.n();
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        final boolean[] zArr = {true};
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        mhs.a().getSwitchSetting("notification_live_switch", new IBaseResponseCallback() { // from class: com.huawei.hwdevice.outofprocess.util.NotificationContentProviderUtil.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                ReleaseLogUtil.d("R_NotifiContProvUt", "fetch liveInfo cloud switch state,onResponse errorCode:", Integer.valueOf(i2), ",state in cloud:", obj);
                boolean zEquals = true;
                if (i2 == 0 && (obj instanceof String)) {
                    zEquals = true ^ "false".equals(obj);
                }
                zArr[0] = zEquals;
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            ReleaseLogUtil.a("R_NotifiContProvUt", "fetch liveInfo cloud switch state InterruptedException");
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        ReleaseLogUtil.d("R_NotifiContProvUt", "fetch liveInfo cloud switch state cost time: ", Long.valueOf(jElapsedRealtime2));
        OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("getNotificationLiveState", "time:" + jElapsedRealtime2);
        return zArr[0];
    }

    public static List<String> d() {
        String strD = lon.c().d("notification_live_support_apps");
        LogUtil.a("NotifiContProvUt", "getNotificationLiveSupportApps liveInfoSupportApps:", strD);
        if (TextUtils.isEmpty(strD)) {
            i = new ArrayList();
        } else if (!strD.equals(j)) {
            j = strD;
            String[] strArrSplit = strD.trim().split(";");
            for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                strArrSplit[i2] = strArrSplit[i2].trim();
            }
            i = Arrays.asList(strArrSplit);
        }
        return e(i);
    }

    public static List<String> e(String str) {
        List<String> arrayList;
        String strD = lon.c().d("notification_live_support_apps_".concat(str));
        LogUtil.a("NotifiContProvUt", "getNotificationLiveSupportApps level:" + str + " liveInfoSupportApps:", strD);
        synchronized (d) {
            if (TextUtils.isEmpty(strD)) {
                arrayList = new ArrayList<>();
            } else if (!strD.equals(h.get(str))) {
                h.put(str, strD);
                String[] strArrSplit = strD.trim().split(";");
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    strArrSplit[i2] = strArrSplit[i2].trim();
                }
                List<String> listAsList = Arrays.asList(strArrSplit);
                g.put(str, listAsList);
                arrayList = listAsList;
            } else {
                arrayList = g.get(str);
            }
        }
        return e(arrayList);
    }

    private static List<String> e(List<String> list) {
        if (list != null) {
            return list;
        }
        ReleaseLogUtil.e("R_NotifiContProvUt", "checkNotNull list is null");
        return new ArrayList();
    }
}
