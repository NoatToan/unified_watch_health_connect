package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import defpackage.ccs;
import defpackage.cet;
import defpackage.odt;
import defpackage.x9s;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class r {

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f13652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f13653b;
        public boolean c;
        public String d;

        public b(String str, boolean z, boolean z2, String str2) {
            this.f13652a = str;
            this.f13653b = z;
            this.c = z2;
            this.d = str2;
        }
    }

    public static ActivityInfo a(PackageManager packageManager, Intent intent, Class<?> cls) {
        Iterator<ResolveInfo> it = packageManager.queryBroadcastReceivers(intent, 16384).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && cls.getCanonicalName().equals(activityInfo.name)) {
                return activityInfo;
            }
        }
        return null;
    }

    public static void b(Context context) {
        new Thread(new cet(context)).start();
    }

    public static void d(Context context, String str, String str2) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        Intent intent = new Intent(str);
        intent.setPackage(packageName);
        Iterator<ResolveInfo> it = packageManager.queryBroadcastReceivers(intent, 16384).iterator();
        boolean z = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            z = (activityInfo == null || TextUtils.isEmpty(activityInfo.name) || !activityInfo.name.equals(str2)) ? false : true;
            if (z) {
                break;
            }
        }
        if (!z) {
            throw new a(String.format("<receiver android:name=\"%1$s\" .../> is missing or disabled in AndroidManifest.", str2));
        }
    }

    public static void e(ActivityInfo activityInfo, Boolean[] boolArr) {
        if (boolArr[0].booleanValue() != activityInfo.enabled) {
            throw new a(String.format("<receiver android:name=\"%1$s\" .../> in AndroidManifest had the wrong enabled attribute, which should be android:enabled=%2$b.", activityInfo.name, boolArr[0]));
        }
        if (boolArr[1].booleanValue() != activityInfo.exported) {
            throw new a(String.format("<receiver android:name=\"%1$s\" .../> in AndroidManifest had the wrong exported attribute, which should be android:exported=%2$b.", activityInfo.name, boolArr[1]));
        }
    }

    public static boolean f(PackageInfo packageInfo, String[] strArr) {
        for (ServiceInfo serviceInfo : packageInfo.services) {
            if (g(strArr, serviceInfo.name)) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(String[] strArr, String str) {
        if (strArr != null && str != null) {
            for (String str2 : strArr) {
                if (TextUtils.equals(str2, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a3 A[EDGE_INSN: B:45:0x00a3->B:31:0x00a3 BREAK  A[LOOP:0: B:16:0x006f->B:50:0x006f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x006f A[SYNTHETIC] */
    public static void j(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        Intent intent = new Intent(ccs.o);
        intent.setPackage(packageName);
        try {
            ActivityInfo activityInfoA = a(packageManager, intent, odt.c(context, "com.xiaomi.push.service.receivers.PingReceiver"));
            if (com.xiaomi.mipush.sdk.b.e0(context)) {
                if (activityInfoA != null) {
                    e(activityInfoA, new Boolean[]{Boolean.TRUE, Boolean.FALSE});
                }
            } else {
                if (activityInfoA == null) {
                    throw new a(String.format("<receiver android:name=\"%1$s\" .../> is missing or disabled in AndroidManifest.", "com.xiaomi.push.service.receivers.PingReceiver"));
                }
                e(activityInfoA, new Boolean[]{Boolean.TRUE, Boolean.FALSE});
            }
        } catch (ClassNotFoundException e) {
            x9s.s(e);
        }
        Intent intent2 = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent2.setPackage(packageName);
        Iterator<ResolveInfo> it = packageManager.queryBroadcastReceivers(intent2, 16384).iterator();
        boolean z = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null) {
                try {
                    if (!TextUtils.isEmpty(activityInfo.name) && PushMessageReceiver.class.isAssignableFrom(odt.c(context, activityInfo.name)) && activityInfo.enabled) {
                        z = true;
                    }
                    if (z) {
                        break;
                    }
                } catch (ClassNotFoundException e2) {
                    x9s.s(e2);
                }
            }
            z = false;
            if (z) {
                break;
                break;
            }
        }
        if (!z) {
            throw new a("Receiver: none of the subclasses of PushMessageReceiver is enabled or defined.");
        }
        if (com.xiaomi.mipush.sdk.b.A(context)) {
            d(context, "com.huawei.android.push.intent.RECEIVE", "com.xiaomi.assemble.control.HmsPushReceiver");
            d(context, "com.huawei.intent.action.PUSH", "com.huawei.hms.support.api.push.PushEventReceiver");
        }
        if (com.xiaomi.mipush.sdk.b.C(context)) {
            d(context, "com.vivo.pushclient.action.RECEIVE", "com.xiaomi.assemble.control.FTOSPushMessageReceiver");
        }
    }

    public static void k(Context context, PackageInfo packageInfo) {
        HashSet hashSet = new HashSet();
        String str = context.getPackageName() + ".permission.MIPUSH_RECEIVE";
        hashSet.addAll(Arrays.asList("android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", str, "android.permission.ACCESS_WIFI_STATE", "android.permission.VIBRATE"));
        PermissionInfo[] permissionInfoArr = packageInfo.permissions;
        if (permissionInfoArr != null) {
            for (PermissionInfo permissionInfo : permissionInfoArr) {
                if (str.equals(permissionInfo.name)) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (strArr != null) {
                        for (String str2 : strArr) {
                            if (!TextUtils.isEmpty(str2) && hashSet.contains(str2)) {
                                hashSet.remove(str2);
                                if (hashSet.isEmpty()) {
                                    break;
                                }
                            }
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        throw new a(String.format("<uses-permission android:name=\"%1$s\"/> is missing in AndroidManifest.", hashSet.iterator().next()));
                    }
                    return;
                }
            }
        }
        throw new a(String.format("<permission android:name=\"%1$s\" .../> is undefined in AndroidManifest.", str));
    }

    public static void l(Context context, PackageInfo packageInfo) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put(PushMessageHandler.class.getCanonicalName(), new b(PushMessageHandler.class.getCanonicalName(), true, true, ""));
        map2.put(MessageHandleService.class.getCanonicalName(), new b(MessageHandleService.class.getCanonicalName(), true, false, ""));
        if (!com.xiaomi.mipush.sdk.b.e0(context) || f(packageInfo, new String[]{"com.xiaomi.push.service.XMJobService", "com.xiaomi.push.service.XMPushService"})) {
            map2.put("com.xiaomi.push.service.XMJobService", new b("com.xiaomi.push.service.XMJobService", true, false, "android.permission.BIND_JOB_SERVICE"));
            map2.put("com.xiaomi.push.service.XMPushService", new b("com.xiaomi.push.service.XMPushService", true, false, ""));
        }
        if (com.xiaomi.mipush.sdk.b.z(context)) {
            map2.put("com.xiaomi.assemble.control.MiFireBaseInstanceIdService", new b("com.xiaomi.assemble.control.MiFireBaseInstanceIdService", true, false, ""));
            map2.put("com.xiaomi.assemble.control.MiFirebaseMessagingService", new b("com.xiaomi.assemble.control.MiFirebaseMessagingService", true, false, ""));
        }
        if (com.xiaomi.mipush.sdk.b.B(context)) {
            map2.put("com.xiaomi.assemble.control.COSPushMessageService", new b("com.xiaomi.assemble.control.COSPushMessageService", true, true, "com.coloros.mcs.permission.SEND_MCS_MESSAGE"));
        }
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                if (!TextUtils.isEmpty(serviceInfo.name) && map2.containsKey(serviceInfo.name)) {
                    b bVar = (b) map2.remove(serviceInfo.name);
                    boolean z = bVar.f13653b;
                    boolean z2 = bVar.c;
                    String str = bVar.d;
                    if (z != serviceInfo.enabled) {
                        throw new a(String.format("<service android:name=\"%1$s\" .../> in AndroidManifest had the wrong enabled attribute, which should be android:enabled=%2$b.", serviceInfo.name, Boolean.valueOf(z)));
                    }
                    if (z2 != serviceInfo.exported) {
                        throw new a(String.format("<service android:name=\"%1$s\" .../> in AndroidManifest had the wrong exported attribute, which should be android:exported=%2$b.", serviceInfo.name, Boolean.valueOf(z2)));
                    }
                    if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, serviceInfo.permission)) {
                        throw new a(String.format("<service android:name=\"%1$s\" .../> in AndroidManifest had the wrong permission attribute, which should be android:permission=\"%2$s\".", serviceInfo.name, str));
                    }
                    map.put(serviceInfo.name, serviceInfo.processName);
                    if (map2.isEmpty()) {
                        break;
                    }
                }
            }
        }
        if (!map2.isEmpty()) {
            throw new a(String.format("<service android:name=\"%1$s\" .../> is missing or disabled in AndroidManifest.", map2.keySet().iterator().next()));
        }
        if (!TextUtils.equals((CharSequence) map.get(PushMessageHandler.class.getCanonicalName()), (CharSequence) map.get(MessageHandleService.class.getCanonicalName()))) {
            throw new a(String.format("\"%1$s\" and \"%2$s\" must be running in the same process.", PushMessageHandler.class.getCanonicalName(), MessageHandleService.class.getCanonicalName()));
        }
        if (map.containsKey("com.xiaomi.push.service.XMJobService") && map.containsKey("com.xiaomi.push.service.XMPushService") && !TextUtils.equals((CharSequence) map.get("com.xiaomi.push.service.XMJobService"), (CharSequence) map.get("com.xiaomi.push.service.XMPushService"))) {
            throw new a(String.format("\"%1$s\" and \"%2$s\" must be running in the same process.", "com.xiaomi.push.service.XMJobService", "com.xiaomi.push.service.XMPushService"));
        }
    }
}
