package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.RemoteViews;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.push.ib;
import com.xiaomi.push.io;
import com.xiaomi.push.ix;
import com.xiaomi.smarthome.framework.api.UserConfig;
import defpackage.b4s;
import defpackage.ccs;
import defpackage.d8s;
import defpackage.det;
import defpackage.jfs;
import defpackage.oss;
import defpackage.p8s;
import defpackage.qss;
import defpackage.rns;
import defpackage.s8s;
import defpackage.sss;
import defpackage.ufs;
import defpackage.v8t;
import defpackage.vss;
import defpackage.x9s;
import defpackage.y0t;
import defpackage.z7s;
import defpackage.zbs;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f14230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedList<Pair<Integer, ix>> f14231b = new LinkedList<>();
    public static ExecutorService c = Executors.newCachedThreadPool();

    public static class a implements Callable<Bitmap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f14232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Context f14233b;
        public boolean c;

        public a(String str, Context context, boolean z) {
            this.f14233b = context;
            this.f14232a = str;
            this.c = z;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap call() throws Throwable {
            if (TextUtils.isEmpty(this.f14232a)) {
                x9s.o("Failed get online picture/icon resource cause picUrl is empty");
                return null;
            }
            if (this.f14232a.startsWith("http")) {
                m.b bVarD = m.d(this.f14233b, this.f14232a, this.c);
                if (bVarD != null) {
                    return bVarD.f14242a;
                }
                x9s.o("Failed get online picture/icon resource");
                return null;
            }
            Bitmap bitmapB = m.b(this.f14233b, this.f14232a);
            if (bitmapB != null) {
                return bitmapB;
            }
            x9s.o("Failed get online picture/icon resource");
            return bitmapB;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Notification f14234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f14235b = 0;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f14236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f14237b = 0;
        public boolean c = false;
    }

    public static void A(Context context, String str, sss sssVar, Map<String, String> map) {
        int iB = b(context, str, "mipush_small_notification");
        int iB2 = b(context, str, "mipush_notification");
        if (y0t.j(context)) {
            if (iB <= 0 || iB2 <= 0) {
                S(context, str, sssVar, map);
                return;
            } else {
                sssVar.setSmallIcon(iB);
                sssVar.setLargeIcon(l(context, iB2));
                return;
            }
        }
        if (iB > 0) {
            sssVar.setSmallIcon(iB);
        } else {
            S(context, str, sssVar, map);
        }
        if (iB2 > 0) {
            sssVar.setLargeIcon(l(context, iB2));
        }
    }

    public static void B(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        p8s p8sVarE = p8s.e(context, str);
        List<StatusBarNotification> listY = p8sVarE.y();
        if (det.d(listY)) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (StatusBarNotification statusBarNotification : listY) {
            Notification notification = statusBarNotification.getNotification();
            if (notification != null && !TextUtils.isEmpty(String.valueOf(statusBarNotification.getId()))) {
                int id = statusBarNotification.getId();
                String strH = s8s.h(notification);
                String strV = s8s.v(notification);
                if (!TextUtils.isEmpty(strH) && !TextUtils.isEmpty(strV) && K(strH, str2) && K(strV, str3)) {
                    linkedList.add(statusBarNotification);
                    p8sVarE.m(id);
                }
            }
        }
        C(context, linkedList);
    }

    public static void C(Context context, LinkedList<? extends Object> linkedList) {
        if (linkedList == null || linkedList.size() <= 0) {
            return;
        }
        jfs.d(context, "category_clear_notification", "clear_notification", linkedList.size(), "");
    }

    public static void D(Intent intent) {
        if (intent == null) {
            return;
        }
        intent.setFlags(intent.getFlags() & (-196));
    }

    @TargetApi(16)
    public static void E(sss sssVar, Context context, String str, ix ixVar, byte[] bArr, int i) {
        PendingIntent pendingIntentH;
        PendingIntent pendingIntentH2;
        PendingIntent pendingIntentH3;
        PendingIntent pendingIntentH4;
        Map<String, String> mapM714a = ixVar.m747a().m714a();
        if (TextUtils.equals("3", mapM714a.get("notification_style_type")) || TextUtils.equals("4", mapM714a.get("notification_style_type"))) {
            return;
        }
        if (V(mapM714a)) {
            for (int i2 = 1; i2 <= 3; i2++) {
                String str2 = mapM714a.get(String.format("cust_btn_%s_n", Integer.valueOf(i2)));
                if (!TextUtils.isEmpty(str2) && (pendingIntentH4 = h(context, str, ixVar, bArr, i, i2)) != null) {
                    sssVar.addAction(0, str2, pendingIntentH4);
                }
            }
            return;
        }
        if (!TextUtils.isEmpty(mapM714a.get("notification_style_button_left_name")) && (pendingIntentH3 = h(context, str, ixVar, bArr, i, 1)) != null) {
            sssVar.addAction(0, mapM714a.get("notification_style_button_left_name"), pendingIntentH3);
        }
        if (!TextUtils.isEmpty(mapM714a.get("notification_style_button_mid_name")) && (pendingIntentH2 = h(context, str, ixVar, bArr, i, 2)) != null) {
            sssVar.addAction(0, mapM714a.get("notification_style_button_mid_name"), pendingIntentH2);
        }
        if (TextUtils.isEmpty(mapM714a.get("notification_style_button_right_name")) || (pendingIntentH = h(context, str, ixVar, bArr, i, 3)) == null) {
            return;
        }
        sssVar.addAction(0, mapM714a.get("notification_style_button_right_name"), pendingIntentH);
    }

    public static boolean F(Context context, ix ixVar, String str) {
        if (ixVar != null && ixVar.m747a() != null && ixVar.m747a().m714a() != null && !TextUtils.isEmpty(str)) {
            return Boolean.parseBoolean(ixVar.m747a().m714a().get("use_clicked_activity")) && v8t.b(context, i(str));
        }
        x9s.o("should clicked activity params are null.");
        return false;
    }

    public static boolean G(Context context, String str) {
        return com.xiaomi.push.g.o(context, str);
    }

    public static boolean H(Context context, String str, boolean z) {
        return y0t.i() && !z && G(context, str);
    }

    public static boolean I(io ioVar) {
        if (ioVar == null) {
            return false;
        }
        String strM713a = ioVar.m713a();
        return !TextUtils.isEmpty(strM713a) && strM713a.length() == 22 && "satuigmo".indexOf(strM713a.charAt(0)) >= 0;
    }

    public static boolean J(ix ixVar) {
        io ioVarM747a = ixVar.m747a();
        return I(ioVarM747a) && ioVarM747a.l();
    }

    public static boolean K(String str, String str2) {
        return TextUtils.isEmpty(str) || str2.contains(str);
    }

    public static boolean L(Map<String, String> map) {
        if (map == null || !map.containsKey("notify_foreground")) {
            return true;
        }
        return "1".equals(map.get("notify_foreground"));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072 A[PHI: r0 r3
      0x0072: PHI (r0v4 java.lang.String) = (r0v2 java.lang.String), (r0v5 java.lang.String) binds: [B:18:0x0070, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r3v14 java.lang.String) = (r3v13 java.lang.String), (r3v20 java.lang.String) binds: [B:18:0x0070, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    public static String[] M(Context context, io ioVar) {
        String str;
        String strM721c = ioVar.m721c();
        String strD = ioVar.d();
        Map<String, String> mapM714a = ioVar.m714a();
        if (mapM714a != null) {
            int iIntValue = Float.valueOf((context.getResources().getDisplayMetrics().widthPixels / context.getResources().getDisplayMetrics().density) + 0.5f).intValue();
            if (iIntValue <= 320) {
                String str2 = mapM714a.get("title_short");
                if (!TextUtils.isEmpty(str2)) {
                    strM721c = str2;
                }
                str = mapM714a.get("description_short");
                if (!TextUtils.isEmpty(str)) {
                    strD = str;
                }
            } else if (iIntValue > 360) {
                String str3 = mapM714a.get("title_long");
                if (!TextUtils.isEmpty(str3)) {
                    strM721c = str3;
                }
                str = mapM714a.get("description_long");
                if (!TextUtils.isEmpty(str)) {
                    strD = str;
                }
            }
        }
        return new String[]{strM721c, strD};
    }

    public static int N(Map<String, String> map) {
        if (map == null) {
            return 3;
        }
        String str = map.get("channel_importance");
        if (TextUtils.isEmpty(str)) {
            return 3;
        }
        try {
            x9s.B("importance=" + str);
            return Integer.parseInt(str);
        } catch (Exception e) {
            x9s.D("parsing channel importance error: " + e);
            return 3;
        }
    }

    public static Intent O(Context context, String str, Map<String, String> map, int i) {
        Intent launchIntentForPackage;
        String str2;
        Intent intent;
        Intent uri;
        if (map == null) {
            return null;
        }
        if (i != 0) {
            return j(context, str, map, i);
        }
        if (!map.containsKey("notify_effect")) {
            return null;
        }
        String str3 = map.get("notify_effect");
        String str4 = map.get("intent_flag");
        int i2 = -1;
        try {
            if (!TextUtils.isEmpty(str4)) {
                i2 = Integer.parseInt(str4);
            }
        } catch (NumberFormatException e) {
            x9s.D("Cause by intent_flag: " + e.getMessage());
        }
        if (ccs.f5196a.equals(str3)) {
            try {
                launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            } catch (Exception e2) {
                x9s.D("Cause: " + e2.getMessage());
                launchIntentForPackage = null;
            }
        } else if (ccs.f5197b.equals(str3)) {
            if (map.containsKey("intent_uri")) {
                String str5 = map.get("intent_uri");
                if (str5 != null) {
                    try {
                        uri = Intent.parseUri(str5, 1);
                        try {
                            uri.setPackage(str);
                        } catch (URISyntaxException e3) {
                            e = e3;
                            x9s.D("Cause: " + e.getMessage());
                        }
                    } catch (URISyntaxException e4) {
                        e = e4;
                        uri = null;
                    }
                    launchIntentForPackage = uri;
                }
            } else if (map.containsKey("class_name")) {
                String str6 = map.get("class_name");
                intent = new Intent();
                intent.setComponent(new ComponentName(str, str6));
                launchIntentForPackage = intent;
            }
            launchIntentForPackage = null;
        } else {
            if (ccs.c.equals(str3) && (str2 = map.get("web_uri")) != null) {
                String strTrim = str2.trim();
                if (!strTrim.startsWith("http://") && !strTrim.startsWith("https://")) {
                    strTrim = "http://" + strTrim;
                }
                try {
                    String protocol = new URL(strTrim).getProtocol();
                    if ("http".equals(protocol) || Constants.URI_SCHEME.equals(protocol)) {
                        intent = new Intent("android.intent.action.VIEW");
                        try {
                            intent.setData(Uri.parse(strTrim));
                            s8s.n(context, str, intent);
                        } catch (MalformedURLException e5) {
                            e = e5;
                            x9s.D("Cause: " + e.getMessage());
                        }
                        launchIntentForPackage = intent;
                    }
                } catch (MalformedURLException e6) {
                    e = e6;
                    intent = null;
                }
            }
            launchIntentForPackage = null;
        }
        if (launchIntentForPackage != null) {
            if (i2 >= 0) {
                launchIntentForPackage.setFlags(i2);
            }
            D(launchIntentForPackage);
            launchIntentForPackage.addFlags(268435456);
            try {
                if (context.getPackageManager().resolveActivity(launchIntentForPackage, 65536) != null) {
                    return launchIntentForPackage;
                }
                if (Build.VERSION.SDK_INT >= 30 && !y0t.j(context) && ccs.c.equals(str3)) {
                    return launchIntentForPackage;
                }
                x9s.o("not resolve activity:" + launchIntentForPackage);
            } catch (Exception e7) {
                x9s.D("Cause: " + e7.getMessage());
            }
        }
        return null;
    }

    public static String P(ix ixVar) {
        if (J(ixVar)) {
            return "E100002";
        }
        if (X(ixVar)) {
            return "E100000";
        }
        if (U(ixVar)) {
            return "E100001";
        }
        return Y(ixVar) ? "E100003" : "";
    }

    public static void Q(Context context, String str) {
        y0t.j(context);
    }

    public static void R(Context context, String str, int i) {
        context.getSharedPreferences("pref_notify_type", 0).edit().putInt(str, i).commit();
    }

    public static void S(Context context, String str, sss sssVar, Map<String, String> map) {
        int iB;
        if (!y0t.j(context)) {
            String strV = v(map, "fcm_icon_uri");
            String strV2 = v(map, "fcm_icon_color");
            if (!TextUtils.isEmpty(strV) && !TextUtils.isEmpty(strV2) && (iB = b(context, str, strV)) > 0) {
                sssVar.setSmallIcon(iB);
                sssVar.f(strV2);
                return;
            }
        }
        sssVar.setSmallIcon(Icon.createWithResource(str, s8s.b(context, str)));
    }

    public static boolean T(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).contains(str);
    }

    public static boolean U(ix ixVar) {
        io ioVarM747a = ixVar.m747a();
        return I(ioVarM747a) && ioVarM747a.f162b == 1 && !J(ixVar);
    }

    public static boolean V(Map<String, String> map) {
        if (map != null) {
            return "6".equals(map.get("notification_style_type"));
        }
        x9s.o("meta extra is null");
        return false;
    }

    public static void W(Context context, String str) {
        context.getSharedPreferences("pref_notify_type", 0).edit().remove(str).commit();
    }

    public static boolean X(ix ixVar) {
        io ioVarM747a = ixVar.m747a();
        return I(ioVarM747a) && ioVarM747a.f162b == 0 && !J(ixVar);
    }

    public static boolean Y(ix ixVar) {
        return ixVar.a() == ib.Registration;
    }

    public static boolean Z(ix ixVar) {
        return J(ixVar) || X(ixVar) || U(ixVar);
    }

    public static int a(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).getInt(str, Integer.MAX_VALUE);
    }

    public static int b(Context context, String str, String str2) {
        if (str.equals(context.getPackageName())) {
            return context.getResources().getIdentifier(str2, "drawable", str);
        }
        return 0;
    }

    public static int c(Context context, String str, Map<String, String> map, int i) {
        ComponentName componentNameA;
        Intent intentO = O(context, str, map, i);
        if (intentO == null || (componentNameA = v8t.a(context, intentO)) == null) {
            return 0;
        }
        return componentNameA.hashCode();
    }

    public static int d(Map<String, String> map) {
        String str = map == null ? null : map.get("timeout");
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static Notification e(Notification notification) {
        Object objD = zbs.d(notification, "extraNotification");
        if (objD != null) {
            zbs.e(objD, "setCustomizedIcon", Boolean.TRUE);
        }
        return notification;
    }

    public static PendingIntent f(Context context, ix ixVar, String str, byte[] bArr, int i) {
        return g(context, ixVar, str, bArr, i, 0, F(context, ixVar, str));
    }

    public static PendingIntent g(Context context, ix ixVar, String str, byte[] bArr, int i, int i2, boolean z) {
        int i3;
        Intent intent;
        if (X(ixVar)) {
            i3 = 1000;
        } else {
            i3 = J(ixVar) ? 3000 : -1;
        }
        io ioVarM747a = ixVar.m747a();
        String strM713a = ioVarM747a != null ? ioVarM747a.m713a() : "";
        boolean zJ = J(ixVar);
        if (ioVarM747a != null && !TextUtils.isEmpty(ioVarM747a.f169e)) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(ioVarM747a.f169e));
            try {
                String protocol = new URL(ioVarM747a.f169e).getProtocol();
                if ("http".equals(protocol) || Constants.URI_SCHEME.equals(protocol)) {
                    s8s.n(context, str, intent2);
                } else {
                    intent2.setPackage(str);
                }
            } catch (MalformedURLException unused) {
                x9s.o("meet URL exception : " + ioVarM747a.f169e);
                intent2.setPackage(str);
            }
            intent2.addFlags(268435456);
            intent2.putExtra("messageId", strM713a);
            intent2.putExtra("eventMessageType", i3);
            return Build.VERSION.SDK_INT >= 31 ? PendingIntent.getActivity(context, 0, intent2, 167772160) : PendingIntent.getActivity(context, 0, intent2, 134217728);
        }
        if (zJ) {
            intent = new Intent();
            intent.setComponent(new ComponentName("com.xiaomi.xmsf", "com.xiaomi.mipush.sdk.PushMessageHandler"));
            intent.putExtra("mipush_payload", bArr);
            intent.putExtra("mipush_notified", true);
            intent.addCategory(String.valueOf(i));
            intent.addCategory(String.valueOf(strM713a));
        } else {
            intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
            intent.setComponent(new ComponentName(str, "com.xiaomi.mipush.sdk.PushMessageHandler"));
            intent.putExtra("mipush_payload", bArr);
            intent.putExtra("mipush_notified", true);
            intent.addCategory(String.valueOf(i));
            intent.addCategory(String.valueOf(strM713a));
        }
        intent.putExtra("notification_click_button", i2);
        intent.putExtra("messageId", strM713a);
        intent.putExtra("eventMessageType", i3);
        if (zJ || !z) {
            w(context, intent, ixVar, ioVarM747a, strM713a, i2);
            return Build.VERSION.SDK_INT >= 31 ? PendingIntent.getService(context, 0, intent, 167772160) : PendingIntent.getService(context, 0, intent, 134217728);
        }
        Intent intent3 = new Intent();
        intent3.setComponent(i(str));
        intent3.addFlags(276824064);
        intent3.putExtra("mipush_serviceIntent", intent);
        intent3.addCategory(String.valueOf(i));
        intent3.addCategory(String.valueOf(strM713a));
        intent3.addCategory(String.valueOf(i2));
        w(context, intent3, ixVar, ioVarM747a, strM713a, i2);
        return Build.VERSION.SDK_INT >= 31 ? PendingIntent.getActivity(context, 0, intent3, 167772160) : PendingIntent.getActivity(context, 0, intent3, 134217728);
    }

    public static PendingIntent h(Context context, String str, ix ixVar, byte[] bArr, int i, int i2) {
        Map<String, String> mapM714a = ixVar.m747a().m714a();
        if (mapM714a == null) {
            return null;
        }
        boolean zF = F(context, ixVar, str);
        if (zF) {
            return g(context, ixVar, str, bArr, i, i2, zF);
        }
        Intent intentJ = j(context, str, mapM714a, i2);
        if (intentJ != null) {
            return Build.VERSION.SDK_INT >= 31 ? PendingIntent.getActivity(context, 0, intentJ, 167772160) : PendingIntent.getActivity(context, 0, intentJ, 134217728);
        }
        return null;
    }

    public static ComponentName i(String str) {
        return new ComponentName(str, "com.xiaomi.mipush.sdk.NotificationClickedActivity");
    }

    public static Intent j(Context context, String str, Map<String, String> map, int i) {
        if (V(map)) {
            return k(context, str, map, String.format("cust_btn_%s_ne", Integer.valueOf(i)), String.format("cust_btn_%s_iu", Integer.valueOf(i)), String.format("cust_btn_%s_ic", Integer.valueOf(i)), String.format("cust_btn_%s_wu", Integer.valueOf(i)));
        }
        if (i == 1) {
            return k(context, str, map, "notification_style_button_left_notify_effect", "notification_style_button_left_intent_uri", "notification_style_button_left_intent_class", "notification_style_button_left_web_uri");
        }
        if (i == 2) {
            return k(context, str, map, "notification_style_button_mid_notify_effect", "notification_style_button_mid_intent_uri", "notification_style_button_mid_intent_class", "notification_style_button_mid_web_uri");
        }
        if (i == 3) {
            return k(context, str, map, "notification_style_button_right_notify_effect", "notification_style_button_right_intent_uri", "notification_style_button_right_intent_class", "notification_style_button_right_web_uri");
        }
        if (i != 4) {
            return null;
        }
        return k(context, str, map, "notification_colorful_button_notify_effect", "notification_colorful_button_intent_uri", "notification_colorful_button_intent_class", "notification_colorful_button_web_uri");
    }

    public static Intent k(Context context, String str, Map<String, String> map, String str2, String str3, String str4, String str5) {
        Intent launchIntentForPackage;
        Intent intent;
        Intent uri;
        String str6 = map.get(str2);
        if (TextUtils.isEmpty(str6)) {
            return null;
        }
        if (ccs.f5196a.equals(str6)) {
            try {
                launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            } catch (Exception e) {
                x9s.D("Cause: " + e.getMessage());
                launchIntentForPackage = null;
            }
        } else if (ccs.f5197b.equals(str6)) {
            if (map.containsKey(str3)) {
                String str7 = map.get(str3);
                if (str7 != null) {
                    try {
                        uri = Intent.parseUri(str7, 1);
                        try {
                            uri.setPackage(str);
                        } catch (URISyntaxException e2) {
                            e = e2;
                            x9s.D("Cause: " + e.getMessage());
                        }
                    } catch (URISyntaxException e3) {
                        e = e3;
                        uri = null;
                    }
                    launchIntentForPackage = uri;
                }
            } else if (map.containsKey(str4)) {
                String str8 = map.get(str4);
                intent = new Intent();
                intent.setComponent(new ComponentName(str, str8));
                launchIntentForPackage = intent;
            }
            launchIntentForPackage = null;
        } else {
            if (ccs.c.equals(str6)) {
                String str9 = map.get(str5);
                if (!TextUtils.isEmpty(str9)) {
                    String strTrim = str9.trim();
                    if (!strTrim.startsWith("http://") && !strTrim.startsWith("https://")) {
                        strTrim = "http://" + strTrim;
                    }
                    try {
                        String protocol = new URL(strTrim).getProtocol();
                        if ("http".equals(protocol) || Constants.URI_SCHEME.equals(protocol)) {
                            intent = new Intent("android.intent.action.VIEW");
                            try {
                                intent.setData(Uri.parse(strTrim));
                                s8s.n(context, str, intent);
                            } catch (MalformedURLException e4) {
                                e = e4;
                                x9s.D("Cause: " + e.getMessage());
                            }
                            launchIntentForPackage = intent;
                        }
                    } catch (MalformedURLException e5) {
                        e = e5;
                        intent = null;
                    }
                }
            }
            launchIntentForPackage = null;
        }
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(268435456);
            try {
                if (context.getPackageManager().resolveActivity(launchIntentForPackage, 65536) != null) {
                    return launchIntentForPackage;
                }
                if (Build.VERSION.SDK_INT >= 30 && !y0t.j(context) && ccs.c.equals(str6)) {
                    return launchIntentForPackage;
                }
                x9s.o("not resolve activity:" + launchIntentForPackage + "for buttons");
            } catch (Exception e6) {
                x9s.D("Cause: " + e6.getMessage());
            }
        }
        return null;
    }

    public static Bitmap l(Context context, int i) {
        return n(context.getResources().getDrawable(i));
    }

    public static Bitmap m(Context context, String str, boolean z) {
        Future futureSubmit = c.submit(new a(str, context, z));
        try {
            try {
                try {
                    Bitmap bitmap = (Bitmap) futureSubmit.get(180L, TimeUnit.SECONDS);
                    if (bitmap != null) {
                        return bitmap;
                    }
                    futureSubmit.cancel(true);
                    return bitmap;
                } catch (ExecutionException e) {
                    x9s.s(e);
                    futureSubmit.cancel(true);
                    return null;
                }
            } catch (InterruptedException e2) {
                x9s.s(e2);
                futureSubmit.cancel(true);
                return null;
            } catch (TimeoutException e3) {
                x9s.s(e3);
                futureSubmit.cancel(true);
                return null;
            }
        } catch (Throwable th) {
            futureSubmit.cancel(true);
            throw th;
        }
    }

    public static Bitmap n(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 1;
        }
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight > 0 ? intrinsicHeight : 1, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static RemoteViews o(Context context, ix ixVar, byte[] bArr) {
        io ioVarM747a = ixVar.m747a();
        String strT = t(ixVar);
        if (ioVarM747a != null && ioVarM747a.m714a() != null) {
            Map<String, String> mapM714a = ioVarM747a.m714a();
            String str = mapM714a.get("layout_name");
            String str2 = mapM714a.get("layout_value");
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                try {
                    Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(strT);
                    int identifier = resourcesForApplication.getIdentifier(str, "layout", strT);
                    if (identifier == 0) {
                        return null;
                    }
                    RemoteViews remoteViews = new RemoteViews(strT, identifier);
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        if (jSONObject.has("text")) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("text");
                            Iterator<String> itKeys = jSONObject2.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                String string = jSONObject2.getString(next);
                                int identifier2 = resourcesForApplication.getIdentifier(next, "id", strT);
                                if (identifier2 > 0) {
                                    remoteViews.setTextViewText(identifier2, string);
                                }
                            }
                        }
                        if (jSONObject.has("image")) {
                            JSONObject jSONObject3 = jSONObject.getJSONObject("image");
                            Iterator<String> itKeys2 = jSONObject3.keys();
                            while (itKeys2.hasNext()) {
                                String next2 = itKeys2.next();
                                String string2 = jSONObject3.getString(next2);
                                int identifier3 = resourcesForApplication.getIdentifier(next2, "id", strT);
                                int identifier4 = resourcesForApplication.getIdentifier(string2, "drawable", strT);
                                if (identifier3 > 0) {
                                    remoteViews.setImageViewResource(identifier3, identifier4);
                                }
                            }
                        }
                        if (jSONObject.has("time")) {
                            JSONObject jSONObject4 = jSONObject.getJSONObject("time");
                            Iterator<String> itKeys3 = jSONObject4.keys();
                            while (itKeys3.hasNext()) {
                                String next3 = itKeys3.next();
                                String string3 = jSONObject4.getString(next3);
                                if (string3.length() == 0) {
                                    string3 = "yy-MM-dd hh:mm";
                                }
                                int identifier5 = resourcesForApplication.getIdentifier(next3, "id", strT);
                                if (identifier5 > 0) {
                                    remoteViews.setTextViewText(identifier5, new SimpleDateFormat(string3).format(new Date(System.currentTimeMillis())));
                                }
                            }
                        }
                        return remoteViews;
                    } catch (JSONException e) {
                        x9s.s(e);
                        return null;
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    x9s.s(e2);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0151  */
    /* JADX WARN: Code duplicated, block: B:88:0x0264  */
    @SuppressLint({"NewApi"})
    public static b p(Context context, ix ixVar, byte[] bArr, RemoteViews remoteViews, PendingIntent pendingIntent, int i) throws Throwable {
        sss sssVar;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        boolean z4;
        boolean z5;
        b bVar;
        int iA;
        Bitmap bitmapB;
        Bitmap bitmap;
        b bVar2 = new b();
        io ioVarM747a = ixVar.m747a();
        String strT = t(ixVar);
        Map<String, String> mapM714a = ioVarM747a.m714a();
        String[] strArrM = M(context, ioVarM747a);
        if (remoteViews != null) {
            sssVar = new sss(context);
            sssVar.setCustomContentView(remoteViews);
        } else {
            sssVar = (mapM714a == null || !mapM714a.containsKey("notification_style_type")) ? new sss(context) : r(context, ixVar, bArr, strArrM[1], i);
        }
        sss sssVar2 = sssVar;
        E(sssVar2, context, ixVar.b(), ixVar, bArr, i);
        sssVar2.setContentTitle(strArrM[0]);
        sssVar2.setContentText(strArrM[1]);
        long jCurrentTimeMillis = System.currentTimeMillis();
        sssVar2.setWhen(jCurrentTimeMillis);
        String strV = v(mapM714a, "notification_show_when");
        if (TextUtils.isEmpty(strV)) {
            sssVar2.setShowWhen(true);
        } else {
            sssVar2.setShowWhen(Boolean.parseBoolean(strV));
        }
        sssVar2.setContentIntent(pendingIntent);
        A(context, strT, sssVar2, mapM714a);
        Bitmap bitmapM = mapM714a == null ? null : m(context, mapM714a.get("notification_small_icon_uri"), true);
        if (bitmapM != null) {
            Object objG = zbs.g("android.graphics.drawable.Icon", "createWithBitmap", bitmapM);
            if (objG != null) {
                zbs.e(sssVar2, "setSmallIcon", objG);
                Bundle bundle = new Bundle();
                bundle.putBoolean("miui.isGrayscaleIcon", true);
                sssVar2.addExtras(bundle);
            } else {
                x9s.o("failed te get small icon with url:" + mapM714a.get("notification_small_icon_uri"));
            }
        } else {
            x9s.o("failed to get small icon url:" + v(mapM714a, "notification_small_icon_uri"));
        }
        sssVar2.f(v(mapM714a, "notification_small_icon_color"));
        String strV2 = v(mapM714a, "__dynamic_icon_uri");
        boolean z6 = Boolean.parseBoolean(v(mapM714a, "__adiom")) || !y0t.i();
        if (TextUtils.isEmpty(strV2) || !z6) {
            bitmapB = bitmap;
            z = false;
        } else {
            if (strV2.startsWith("http")) {
                m.b bVarD = m.d(context, strV2, true);
                if (bVarD != null) {
                    bitmap = bVarD.f14242a;
                    bVar2.f14235b = bVarD.f14243b;
                } else {
                    bitmapB = null;
                }
            } else {
                bitmapB = m.b(context, strV2);
            }
            if (bitmapB != null) {
                sssVar2.setLargeIcon(bitmapB);
                z = true;
            } else {
                bitmapB = bitmap;
                z = false;
            }
        }
        Bitmap bitmapM2 = mapM714a == null ? null : m(context, mapM714a.get("notification_large_icon_uri"), true);
        if (bitmapM2 != null) {
            bitmapB = bitmap;
            bitmapB = bitmap;
            sssVar2.setLargeIcon(bitmapM2);
        }
        bitmapB = bitmap;
        bitmapB = bitmap;
        String str2 = "com.xiaomi.xmsf";
        if (mapM714a != null) {
            String str3 = mapM714a.get("notification_group");
            z4 = Boolean.parseBoolean(mapM714a.get("notification_is_summary"));
            String strT2 = (!TextUtils.isEmpty(str3) || (!y0t.i() && Boolean.parseBoolean(mapM714a.get("notification_group_disable_default")))) ? str3 : t(ixVar);
            zbs.e(sssVar2, "setGroupSummary", Boolean.valueOf(z4));
            String str4 = mapM714a.get("notification_style_type");
            if ("com.xiaomi.xmsf".equals(context.getPackageName()) && ("4".equals(str4) || "3".equals(str4))) {
                str = t(ixVar) + "_custom_" + jCurrentTimeMillis;
                z2 = true;
                z3 = true;
            } else {
                str = strT2;
                z2 = true;
                z3 = false;
            }
        } else {
            z2 = true;
            z3 = false;
            str = null;
            z4 = false;
        }
        sssVar2.setAutoCancel(z2);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (mapM714a != null && mapM714a.containsKey("ticker")) {
            sssVar2.setTicker(mapM714a.get("ticker"));
        }
        if (jCurrentTimeMillis2 - f14230a > 10000) {
            f14230a = jCurrentTimeMillis2;
            iA = ioVarM747a.f156a;
            if (T(context, strT)) {
                iA = a(context, strT);
            }
            sssVar2.setDefaults(iA);
            if (mapM714a == null || (iA & 1) == 0) {
                z5 = z;
                bVar = bVar2;
            } else {
                String str5 = mapM714a.get("sound_uri");
                if (TextUtils.isEmpty(str5)) {
                    z5 = z;
                    bVar = bVar2;
                } else {
                    bVar = bVar2;
                    StringBuilder sb = new StringBuilder();
                    z5 = z;
                    sb.append("android.resource://");
                    sb.append(strT);
                    if (str5.startsWith(sb.toString())) {
                        sssVar2.setDefaults(iA ^ 1);
                        sssVar2.setSound(Uri.parse(str5));
                    }
                }
            }
        } else {
            z5 = z;
            bVar = bVar2;
            iA = -100;
        }
        if (mapM714a != null) {
            p8s p8sVarE = p8s.e(context, strT);
            int iD = d(mapM714a);
            if (iD > 0) {
                zbs.e(sssVar2, "setTimeoutAfter", Long.valueOf(iD * 1000));
            }
            z7s.i(ioVarM747a);
            String str6 = mapM714a.get("channel_id");
            if (!TextUtils.isEmpty(str6) || context.getApplicationInfo().targetSdkVersion >= 26) {
                String strS = s(context, strT, mapM714a);
                int iN = N(mapM714a);
                int i2 = ioVarM747a.f156a;
                String str7 = mapM714a.get("channel_description");
                String str8 = mapM714a.get("sound_uri");
                String str9 = mapM714a.get("channel_perm");
                ufs.f(context, mapM714a, sssVar2, jCurrentTimeMillis);
                zbs.e(sssVar2, "setChannelId", z7s.d(p8sVarE, str6, strS, str7, i2, iN, str8, str9));
                if (iA == -100 && s8s.t(mapM714a)) {
                    s8s.q(sssVar2, z4);
                }
                if ("pulldown".equals(s8s.i(mapM714a)) && s8s.t(mapM714a) && Objects.equals(mapM714a.get("pull_down_pop_type"), "0")) {
                    s8s.q(sssVar2, z4);
                }
                if ("tts".equals(s8s.i(mapM714a)) && s8s.t(mapM714a)) {
                    s8s.q(sssVar2, z4);
                }
            }
            String str10 = mapM714a.get("background_color");
            if (!TextUtils.isEmpty(str10)) {
                try {
                    int i3 = Integer.parseInt(str10);
                    sssVar2.setOngoing(true);
                    sssVar2.setColor(i3);
                    zbs.e(sssVar2, "setColorized", Boolean.TRUE);
                } catch (Exception e) {
                    x9s.s(e);
                }
            }
        } else {
            str2 = "com.xiaomi.xmsf";
            str = str;
        }
        if (str != null) {
            zbs.e(sssVar2, "setGroup", !z3 ? d8s.b().d(context, sssVar2, str) : str);
        }
        if (y0t.r() && str2.equals(context.getPackageName())) {
            zbs.g("miui.util.NotificationHelper", "setTargetPkg", context, sssVar2, t(ixVar));
        }
        Notification notification = sssVar2.getNotification();
        if (z5 && y0t.i()) {
            e(notification);
        }
        if (mapM714a != null) {
            if (notification.extras == null) {
                notification.extras = new Bundle();
            }
            if (!TextUtils.isEmpty(mapM714a.get("enable_keyguard"))) {
                s8s.w(notification, Boolean.parseBoolean(mapM714a.get("enable_keyguard")));
            }
            if (!TextUtils.isEmpty(mapM714a.get("enable_float"))) {
                s8s.m(notification, Boolean.parseBoolean(mapM714a.get("enable_float")));
            }
            if (!TextUtils.isEmpty(mapM714a.get("float_small_win")) && "0".equals(mapM714a.get("float_small_win")) && com.xiaomi.push.g.q(context, strT)) {
                s8s.m(notification, false);
            }
            int iA2 = det.a(mapM714a.get("section_is_prr"), -1);
            int iA3 = det.a(mapM714a.get("section_prr_cl"), -1);
            if (iA2 >= 0 && iA3 >= 0) {
                s8s.k(notification, iA2, iA3);
            }
        }
        b bVar3 = bVar;
        bVar3.f14234a = notification;
        return bVar3;
    }

    public static c q(Context context, ix ixVar, byte[] bArr) {
        int iC;
        Map<String, String> mapM714a;
        int i;
        c cVar = new c();
        com.xiaomi.push.g.b bVarF = com.xiaomi.push.g.f(context, t(ixVar), true);
        io ioVarM747a = ixVar.m747a();
        if (ioVarM747a != null) {
            iC = ioVarM747a.c();
            mapM714a = ioVarM747a.m714a();
        } else {
            iC = 0;
            mapM714a = null;
        }
        int iE = det.e(t(ixVar), iC);
        if (y0t.j(context) && bVarF == com.xiaomi.push.g.b.NOT_ALLOWED) {
            if (ioVarM747a != null) {
                oss.a(context.getApplicationContext()).h(ixVar.b(), P(ixVar), ioVarM747a.m713a(), "10:" + t(ixVar));
            }
            x9s.o("Do not notify because user block " + t(ixVar) + "‘s notification");
            return cVar;
        }
        y0t.j(context);
        RemoteViews remoteViewsO = o(context, ixVar, bArr);
        PendingIntent pendingIntentF = f(context, ixVar, ixVar.b(), bArr, iE);
        if (pendingIntentF == null) {
            if (ioVarM747a != null) {
                oss.a(context.getApplicationContext()).h(ixVar.b(), P(ixVar), ioVarM747a.m713a(), b4s.APPLY_CHANNEL_TOKEN2_QUICK_BIND_CARD);
            }
            x9s.o("The click PendingIntent is null. ");
            return cVar;
        }
        b bVarP = p(context, ixVar, bArr, remoteViewsO, pendingIntentF, iE);
        cVar.f14237b = bVarP.f14235b;
        cVar.f14236a = t(ixVar);
        Notification notification = bVarP.f14234a;
        if (y0t.i()) {
            if (!TextUtils.isEmpty(ioVarM747a.m713a())) {
                notification.extras.putString("message_id", ioVarM747a.m713a());
            }
            notification.extras.putString("local_paid", ixVar.m748a());
            s8s.o(mapM714a, notification.extras, "msg_busi_type");
            s8s.o(mapM714a, notification.extras, "disable_notification_flags");
            String str = ioVarM747a.m719b() == null ? null : ioVarM747a.m719b().get("score_info");
            if (!TextUtils.isEmpty(str)) {
                notification.extras.putString("score_info", str);
            }
            notification.extras.putString("pushUid", v(ioVarM747a.f160a, "n_stats_expose"));
            if (X(ixVar)) {
                i = 1000;
            } else {
                i = J(ixVar) ? 3000 : -1;
            }
            notification.extras.putString("eventMessageType", String.valueOf(i));
            notification.extras.putString("target_package", t(ixVar));
        }
        String str2 = ioVarM747a.m714a() != null ? ioVarM747a.m714a().get("message_count") : null;
        if (y0t.i() && str2 != null) {
            try {
                s8s.j(notification, Integer.parseInt(str2));
            } catch (NumberFormatException e) {
                oss.a(context.getApplicationContext()).i(ixVar.b(), P(ixVar), ioVarM747a.m713a(), UserConfig.KEY_MI_BRAIN_SETTING);
                x9s.D("fail to set message count. " + e);
            }
        }
        String strT = t(ixVar);
        s8s.l(notification, strT);
        p8s p8sVarE = p8s.e(context, strT);
        y0t.j(context);
        y0t.j(context);
        p8sVarE.n(iE, notification);
        cVar.c = true;
        x9s.o("notification: " + ioVarM747a.m713a() + " is notifyied");
        if (y0t.i() && y0t.j(context)) {
            d8s.b().f(context, iE, notification);
            ufs.e(context, strT, iE, ioVarM747a.m713a(), notification);
        }
        if (J(ixVar)) {
            oss.a(context.getApplicationContext()).g(ixVar.b(), P(ixVar), ioVarM747a.m713a(), 3002, null);
        }
        if (X(ixVar)) {
            oss.a(context.getApplicationContext()).g(ixVar.b(), P(ixVar), ioVarM747a.m713a(), 1002, null);
        }
        Pair<Integer, ix> pair = new Pair<>(Integer.valueOf(iE), ixVar);
        LinkedList<Pair<Integer, ix>> linkedList = f14231b;
        synchronized (linkedList) {
            try {
                linkedList.add(pair);
                if (linkedList.size() > 100) {
                    linkedList.remove();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @TargetApi(16)
    public static sss r(Context context, ix ixVar, byte[] bArr, String str, int i) {
        PendingIntent pendingIntentH;
        String strT = t(ixVar);
        Map<String, String> mapM714a = ixVar.m747a().m714a();
        String str2 = mapM714a.get("notification_style_type");
        y0t.j(context);
        if ("2".equals(str2)) {
            sss sssVar = new sss(context);
            Bitmap bitmapM = TextUtils.isEmpty(mapM714a.get("notification_bigPic_uri")) ? null : m(context, mapM714a.get("notification_bigPic_uri"), false);
            if (bitmapM == null) {
                x9s.o("can not get big picture.");
                return sssVar;
            }
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle(sssVar);
            bigPictureStyle.bigPicture(bitmapM);
            bigPictureStyle.setSummaryText(str);
            bigPictureStyle.bigLargeIcon((Bitmap) null);
            sssVar.setStyle(bigPictureStyle);
            return sssVar;
        }
        if ("1".equals(str2)) {
            sss sssVar2 = new sss(context);
            sssVar2.setStyle(new Notification.BigTextStyle().bigText(str));
            return sssVar2;
        }
        if ("4".equals(str2) && y0t.i()) {
            qss qssVar = new qss(context, strT);
            if (!TextUtils.isEmpty(mapM714a.get("notification_banner_image_uri"))) {
                qssVar.G(m(context, mapM714a.get("notification_banner_image_uri"), false));
            }
            if (!TextUtils.isEmpty(mapM714a.get("notification_banner_icon_uri"))) {
                qssVar.I(m(context, mapM714a.get("notification_banner_icon_uri"), false));
            }
            qssVar.l(mapM714a);
            return qssVar;
        }
        if (!"3".equals(str2) || !y0t.i()) {
            return new sss(context);
        }
        vss vssVar = new vss(context, i, strT);
        if (!TextUtils.isEmpty(mapM714a.get("notification_colorful_button_text")) && (pendingIntentH = h(context, strT, ixVar, bArr, i, 4)) != null) {
            vssVar.I(mapM714a.get("notification_colorful_button_text"), pendingIntentH).J(mapM714a.get("notification_colorful_button_bg_color"));
        }
        if (!TextUtils.isEmpty(mapM714a.get("notification_colorful_bg_color"))) {
            vssVar.L(mapM714a.get("notification_colorful_bg_color"));
        } else if (!TextUtils.isEmpty(mapM714a.get("notification_colorful_bg_image_uri"))) {
            vssVar.H(m(context, mapM714a.get("notification_colorful_bg_image_uri"), false));
        }
        vssVar.l(mapM714a);
        return vssVar;
    }

    public static String s(Context context, String str, Map<String, String> map) {
        return (map == null || TextUtils.isEmpty(map.get("channel_name"))) ? com.xiaomi.push.g.n(context, str) : map.get("channel_name");
    }

    public static String t(ix ixVar) {
        io ioVarM747a;
        if ("com.xiaomi.xmsf".equals(ixVar.f252b) && (ioVarM747a = ixVar.m747a()) != null && ioVarM747a.m714a() != null) {
            String str = ioVarM747a.m714a().get("miui_package_name");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return ixVar.f252b;
    }

    public static String u(Map<String, String> map, int i) {
        String str;
        if (i == 0) {
            str = "notify_effect";
        } else if (V(map)) {
            str = String.format("cust_btn_%s_ne", Integer.valueOf(i));
        } else if (i == 1) {
            str = "notification_style_button_left_notify_effect";
        } else if (i == 2) {
            str = "notification_style_button_mid_notify_effect";
        } else if (i == 3) {
            str = "notification_style_button_right_notify_effect";
        } else {
            str = i == 4 ? "notification_colorful_button_notify_effect" : null;
        }
        if (map == null || str == null) {
            return null;
        }
        return map.get(str);
    }

    public static String v(Map<String, String> map, String str) {
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public static void w(Context context, Intent intent, ix ixVar, io ioVar, String str, int i) {
        if (ixVar == null || ioVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        String strU = u(ioVar.m714a(), i);
        if (TextUtils.isEmpty(strU)) {
            return;
        }
        if (ccs.f5196a.equals(strU) || ccs.f5197b.equals(strU) || ccs.c.equals(strU)) {
            intent.putExtra("messageId", str);
            intent.putExtra("local_paid", ixVar.f248a);
            if (!TextUtils.isEmpty(ixVar.f252b)) {
                intent.putExtra("target_package", ixVar.f252b);
            }
            intent.putExtra("job_key", v(ioVar.m714a(), "jobkey"));
            intent.putExtra(i + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + "target_component", c(context, ixVar.f252b, ioVar.m714a(), i));
        }
    }

    public static void x(Context context, String str) {
        y(context, str, -1);
    }

    public static void y(Context context, String str, int i) {
        z(context, str, i, -1);
    }

    public static void z(Context context, String str, int i, int i2) {
        int iHashCode;
        if (context == null || TextUtils.isEmpty(str) || i < -1) {
            return;
        }
        p8s p8sVarE = p8s.e(context, str);
        List<StatusBarNotification> listY = p8sVarE.y();
        if (det.d(listY)) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        boolean z = false;
        if (i == -1) {
            z = true;
            iHashCode = 0;
        } else {
            iHashCode = ((str.hashCode() / 10) * 10) + i;
        }
        for (StatusBarNotification statusBarNotification : listY) {
            if (!TextUtils.isEmpty(String.valueOf(statusBarNotification.getId()))) {
                int id = statusBarNotification.getId();
                if (!z) {
                    if (iHashCode == id) {
                        rns.b(context, statusBarNotification, i2);
                        linkedList.add(statusBarNotification);
                        p8sVarE.m(id);
                        break;
                    }
                } else {
                    linkedList.add(statusBarNotification);
                    p8sVarE.m(id);
                }
            }
        }
        C(context, linkedList);
    }
}
