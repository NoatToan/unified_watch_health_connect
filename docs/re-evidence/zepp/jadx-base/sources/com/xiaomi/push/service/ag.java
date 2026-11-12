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
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.huami.chart.style.constant.BackgroundStyleConstant;
import com.huami.device.feature.notification.utils.PkgNameConstants;
import com.huami.message.api.WebConst;
import com.xiaomi.push.di;
import com.xiaomi.push.dq;
import com.ximalaya.ting.android.opensdk.model.PlayableModel;
import com.ximalaya.ting.android.opensdk.player.statistic.OpenSdkPlayStatisticUpload;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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

/* JADX INFO: loaded from: classes22.dex */
public class ag {
    public static long a;
    private static final LinkedList<Pair<Integer, dq>> b = new LinkedList<>();
    private static ExecutorService c = Executors.newCachedThreadPool();
    private static volatile al d;

    public static class a implements Callable<Bitmap> {
        private String a;
        private Context b;
        private boolean c;

        public a(String str, Context context, boolean z) {
            this.b = context;
            this.a = str;
            this.c = z;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap call() throws Throwable {
            Bitmap bitmapA = null;
            if (TextUtils.isEmpty(this.a)) {
                com.xiaomi.channel.commonutils.logger.b.m3434a("Failed get online picture/icon resource cause picUrl is empty");
                return null;
            }
            if (this.a.startsWith("http")) {
                ap.b bVarA = ap.a(this.b, this.a, this.c);
                if (bVarA != null) {
                    return bVarA.f204a;
                }
            } else {
                bitmapA = ap.a(this.b, this.a);
                if (bitmapA != null) {
                    return bitmapA;
                }
            }
            com.xiaomi.channel.commonutils.logger.b.m3434a("Failed get online picture/icon resource");
            return bitmapA;
        }
    }

    public static class b {
        public Notification a;
        public long b = 0;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public String f202a;
        public long a = 0;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public boolean f203a = false;
    }

    private static int A(Map<String, String> map) {
        if (map == null) {
            return 3;
        }
        String str = map.get("channel_importance");
        if (TextUtils.isEmpty(str)) {
            return 3;
        }
        try {
            com.xiaomi.channel.commonutils.logger.b.c("importance=" + str);
            return Integer.parseInt(str);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.d("parsing channel importance error: " + e);
            return 3;
        }
    }

    public static void B(Context context, String str) {
        context.getSharedPreferences("pref_notify_type", 0).edit().remove(str).commit();
    }

    public static void C(Context context, String str, int i) {
        context.getSharedPreferences("pref_notify_type", 0).edit().putInt(str, i).commit();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    private static void D(Context context, String str, com.xiaomi.push.ay ayVar, Map<String, String> map) {
        boolean z;
        int iC;
        if (com.xiaomi.channel.commonutils.android.f.m3427a(context)) {
            z = false;
        } else {
            String strQ = q(map, "fcm_icon_uri");
            String strQ2 = q(map, "fcm_icon_color");
            if (TextUtils.isEmpty(strQ) || TextUtils.isEmpty(strQ2) || (iC = c(context, str, strQ)) <= 0) {
                z = false;
            } else {
                z = true;
                ayVar.setSmallIcon(iC);
                ayVar.mo3576a(strQ2);
            }
        }
        if (z) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            ayVar.setSmallIcon(Icon.createWithResource(str, ar.b(context, str)));
        } else {
            ayVar.setSmallIcon(z(context, str));
        }
    }

    private static void E(Intent intent) {
        if (intent == null) {
            return;
        }
        int flags = intent.getFlags() & (-2) & (-3) & (-65);
        if (Build.VERSION.SDK_INT >= 21) {
            flags &= -129;
        }
        intent.setFlags(flags);
    }

    public static boolean F(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).contains(str);
    }

    private static boolean G(Map<String, String> map) {
        if (map != null) {
            return "6".equals(map.get("notification_style_type"));
        }
        com.xiaomi.channel.commonutils.logger.b.m3434a("meta extra is null");
        return false;
    }

    private static int H(Map<String, String> map) {
        if (map == null) {
            return 0;
        }
        String str = map.get("notification_priority");
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            com.xiaomi.channel.commonutils.logger.b.c("priority=" + str);
            return Integer.parseInt(str);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.d("parsing notification priority error: " + e);
            return 0;
        }
    }

    public static ComponentName a(String str) {
        return new ComponentName(str, "com.xiaomi.mipush.sdk.NotificationClickedActivity");
    }

    public static Intent a(Context context, String str, Map<String, String> map, int i) {
        if (G(map)) {
            return j(context, str, map, String.format("cust_btn_%s_ne", Integer.valueOf(i)), String.format("cust_btn_%s_iu", Integer.valueOf(i)), String.format("cust_btn_%s_ic", Integer.valueOf(i)), String.format("cust_btn_%s_wu", Integer.valueOf(i)));
        }
        if (i == 1) {
            return j(context, str, map, "notification_style_button_left_notify_effect", "notification_style_button_left_intent_uri", "notification_style_button_left_intent_class", "notification_style_button_left_web_uri");
        }
        if (i == 2) {
            return j(context, str, map, "notification_style_button_mid_notify_effect", "notification_style_button_mid_intent_uri", "notification_style_button_mid_intent_class", "notification_style_button_mid_web_uri");
        }
        if (i == 3) {
            return j(context, str, map, "notification_style_button_right_notify_effect", "notification_style_button_right_intent_uri", "notification_style_button_right_intent_class", "notification_style_button_right_web_uri");
        }
        if (i != 4) {
            return null;
        }
        return j(context, str, map, "notification_colorful_button_notify_effect", "notification_colorful_button_intent_uri", "notification_colorful_button_intent_class", "notification_colorful_button_web_uri");
    }

    public static Bitmap a(Drawable drawable) {
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

    public static c a(Context context, dq dqVar, byte[] bArr) {
        int iC;
        Map<String, String> mapM3671a;
        StringBuilder sb;
        String str;
        String str2;
        c cVar = new c();
        com.xiaomi.channel.commonutils.android.a.b bVarA = com.xiaomi.channel.commonutils.android.a.a(context, a(dqVar), true);
        di diVarM3701a = dqVar.m3701a();
        if (diVarM3701a != null) {
            iC = diVarM3701a.c();
            mapM3671a = diVarM3701a.m3671a();
        } else {
            iC = 0;
            mapM3671a = null;
        }
        int iB = com.xiaomi.channel.commonutils.android.l.b(a(dqVar), iC);
        if (com.xiaomi.channel.commonutils.android.f.m3427a(context) && bVarA == com.xiaomi.channel.commonutils.android.a.b.NOT_ALLOWED) {
            str2 = "Do not notify because user block " + a(dqVar) + "‘s notification";
        } else if (com.xiaomi.channel.commonutils.android.f.m3427a(context) && d != null && d.c(context, iB, a(dqVar), mapM3671a)) {
            str2 = "Do not notify because card notification is canceled or sequence incorrect";
        } else {
            RemoteViews remoteViewsM = m(context, dqVar, bArr);
            PendingIntent pendingIntentG = g(context, dqVar, dqVar.b(), bArr, iB);
            if (pendingIntentG != null) {
                b bVarO = o(context, dqVar, bArr, remoteViewsM, pendingIntentG, iB);
                cVar.a = bVarO.b;
                cVar.f202a = a(dqVar);
                Notification notification = bVarO.a;
                String[] strArrY = y(context, diVarM3701a);
                try {
                    notification.getClass().getMethod("setLatestEventInfo", Context.class, CharSequence.class, CharSequence.class, PendingIntent.class).invoke(notification, context, strArrY[0], strArrY[1], pendingIntentG);
                } catch (IllegalAccessException e) {
                    e = e;
                    sb = new StringBuilder();
                    str = "meet illegal access error. ";
                    sb.append(str);
                    sb.append(e);
                    com.xiaomi.channel.commonutils.logger.b.d(sb.toString());
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    sb = new StringBuilder();
                    str = "meet illegal argument error. ";
                    sb.append(str);
                    sb.append(e);
                    com.xiaomi.channel.commonutils.logger.b.d(sb.toString());
                } catch (NoSuchMethodException e3) {
                    e = e3;
                    sb = new StringBuilder();
                    str = "meet no such method error. ";
                    sb.append(str);
                    sb.append(e);
                    com.xiaomi.channel.commonutils.logger.b.d(sb.toString());
                } catch (InvocationTargetException e4) {
                    e = e4;
                    sb = new StringBuilder();
                    str = "meet invocation target error. ";
                    sb.append(str);
                    sb.append(e);
                    com.xiaomi.channel.commonutils.logger.b.d(sb.toString());
                }
                Map<String, String> mapM3671a2 = diVarM3701a.m3671a();
                if (mapM3671a2 != null && mapM3671a2.containsKey("ticker")) {
                    notification.tickerText = mapM3671a2.get("ticker");
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - a > 10000) {
                    a = jCurrentTimeMillis;
                    int iB2 = diVarM3701a.a;
                    if (F(context, a(dqVar))) {
                        iB2 = b(context, a(dqVar));
                    }
                    notification.defaults = iB2;
                    if (mapM3671a2 != null && (iB2 & 1) != 0) {
                        String str3 = mapM3671a2.get("sound_uri");
                        if (!TextUtils.isEmpty(str3)) {
                            if (str3.startsWith("android.resource://" + a(dqVar))) {
                                notification.defaults = iB2 ^ 1;
                                notification.sound = Uri.parse(str3);
                            }
                        }
                    }
                }
                notification.flags |= 16;
                if (remoteViewsM != null) {
                    notification.contentView = remoteViewsM;
                }
                if (com.xiaomi.channel.commonutils.android.f.m3426a() && Build.VERSION.SDK_INT >= 19) {
                    if (!TextUtils.isEmpty(diVarM3701a.m3670a())) {
                        notification.extras.putString("message_id", diVarM3701a.m3670a());
                    }
                    notification.extras.putString("local_paid", dqVar.m3702a());
                    ar.a(mapM3671a, notification.extras, "msg_busi_type");
                    ar.a(mapM3671a, notification.extras, "disable_notification_flags");
                    String str4 = diVarM3701a.m3676b() == null ? null : diVarM3701a.m3676b().get("score_info");
                    if (!TextUtils.isEmpty(str4)) {
                        notification.extras.putString("score_info", str4);
                    }
                    notification.extras.putString("pushUid", q(diVarM3701a.f90a, "n_stats_expose"));
                    int i = -1;
                    if (c(dqVar)) {
                        i = 1000;
                    } else if (m3818a(dqVar)) {
                        i = 3000;
                    }
                    notification.extras.putString("eventMessageType", String.valueOf(i));
                    notification.extras.putString("target_package", a(dqVar));
                }
                String str5 = diVarM3701a.m3671a() == null ? null : diVarM3701a.m3671a().get("message_count");
                if (com.xiaomi.channel.commonutils.android.f.m3426a() && str5 != null) {
                    try {
                        ar.d(notification, Integer.parseInt(str5));
                    } catch (NumberFormatException e5) {
                        com.xiaomi.channel.commonutils.logger.b.d("fail to set message count. " + e5);
                    }
                }
                String strA = a(dqVar);
                ar.f(notification, strA);
                aq aqVarA = aq.a(context, strA);
                if (com.xiaomi.channel.commonutils.android.f.m3427a(context) && d != null) {
                    d.b(dqVar, diVarM3701a.m3671a(), iB, notification);
                }
                if (com.xiaomi.channel.commonutils.android.f.m3427a(context) && d != null && d.d(diVarM3701a.m3671a(), iB, notification)) {
                    com.xiaomi.channel.commonutils.logger.b.b("consume this notificaiton by agent");
                } else {
                    aqVarA.a(iB, notification);
                    cVar.f203a = true;
                }
                if (com.xiaomi.channel.commonutils.android.f.m3426a() && com.xiaomi.channel.commonutils.android.f.m3427a(context)) {
                    w.b().f(context, iB, notification);
                    br.e(context, strA, iB, diVarM3701a.m3670a(), notification);
                }
                if (Build.VERSION.SDK_INT < 26) {
                    String strM3670a = diVarM3701a.m3670a();
                    com.xiaomi.push.o oVarA = com.xiaomi.push.o.a(context);
                    int iE = e(diVarM3701a.m3671a());
                    if (iE > 0 && !TextUtils.isEmpty(strM3670a)) {
                        String str6 = "n_timeout_" + strM3670a;
                        oVarA.a(str6);
                        oVarA.b(new p(str6, aqVarA, iB), iE);
                    }
                }
                Pair<Integer, dq> pair = new Pair<>(Integer.valueOf(iB), dqVar);
                LinkedList<Pair<Integer, dq>> linkedList = b;
                synchronized (linkedList) {
                    linkedList.add(pair);
                    if (linkedList.size() > 100) {
                        linkedList.remove();
                    }
                }
                return cVar;
            }
            str2 = "The click PendingIntent is null. ";
        }
        com.xiaomi.channel.commonutils.logger.b.m3434a(str2);
        return cVar;
    }

    public static String a(dq dqVar) {
        di diVarM3701a;
        if (PkgNameConstants.XMSF.equals(dqVar.b) && (diVarM3701a = dqVar.m3701a()) != null && diVarM3701a.m3671a() != null) {
            String str = diVarM3701a.m3671a().get("miui_package_name");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return dqVar.b;
    }

    public static String a(Map<String, String> map, int i) {
        String str;
        if (i == 0) {
            str = "notify_effect";
        } else if (G(map)) {
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

    public static void a(Context context, String str) {
        a(context, str, -1);
    }

    public static void a(Context context, String str, int i) {
        a(context, str, i, -1);
    }

    public static void a(Context context, String str, int i, int i2) {
        int iHashCode;
        if (context == null || TextUtils.isEmpty(str) || i < -1) {
            return;
        }
        aq aqVarA = aq.a(context, str);
        List<StatusBarNotification> listB = aqVarA.b();
        if (com.xiaomi.channel.commonutils.android.l.a(listB)) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        boolean z = false;
        if (i == -1) {
            iHashCode = 0;
            z = true;
        } else {
            iHashCode = ((str.hashCode() / 10) * 10) + i;
        }
        for (StatusBarNotification statusBarNotification : listB) {
            if (!TextUtils.isEmpty(String.valueOf(statusBarNotification.getId()))) {
                int id = statusBarNotification.getId();
                if (!z) {
                    if (iHashCode == id) {
                        d.a(context, statusBarNotification, i2);
                        linkedList.add(statusBarNotification);
                        aqVarA.a(id);
                        break;
                    }
                } else {
                    linkedList.add(statusBarNotification);
                    aqVarA.a(id);
                }
            }
        }
        a(context, (LinkedList<? extends Object>) linkedList);
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        aq aqVarA = aq.a(context, str);
        List<StatusBarNotification> listB = aqVarA.b();
        if (com.xiaomi.channel.commonutils.android.l.a(listB)) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (StatusBarNotification statusBarNotification : listB) {
            Notification notification = statusBarNotification.getNotification();
            if (notification != null && !TextUtils.isEmpty(String.valueOf(statusBarNotification.getId()))) {
                int id = statusBarNotification.getId();
                String strA = ar.a(notification);
                String strB = ar.b(notification);
                if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(strB) && x(strA, str2) && x(strB, str3)) {
                    linkedList.add(statusBarNotification);
                    aqVarA.a(id);
                }
            }
        }
        a(context, (LinkedList<? extends Object>) linkedList);
    }

    public static void a(Context context, LinkedList<? extends Object> linkedList) {
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m3817a(Context context, String str) {
        return com.xiaomi.channel.commonutils.android.a.m3420b(context, str);
    }

    public static boolean a(Context context, String str, boolean z) {
        return com.xiaomi.channel.commonutils.android.f.m3426a() && !z && m3817a(context, str);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m3818a(dq dqVar) {
        di diVarM3701a = dqVar.m3701a();
        return w(diVarM3701a) && diVarM3701a.l();
    }

    public static boolean a(Map<String, String> map) {
        if (map == null || !map.containsKey("notify_foreground")) {
            return true;
        }
        return "1".equals(map.get("notify_foreground"));
    }

    public static int b(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).getInt(str, Integer.MAX_VALUE);
    }

    public static Intent b(Context context, String str, Map<String, String> map, int i) {
        Intent launchIntentForPackage;
        String str2;
        Intent intent;
        StringBuilder sb;
        String message;
        if (map == null) {
            return null;
        }
        if (i != 0) {
            return a(context, str, map, i);
        }
        if (!map.containsKey("notify_effect")) {
            return null;
        }
        String str3 = map.get("notify_effect");
        int i2 = -1;
        String str4 = map.get("intent_flag");
        try {
            if (!TextUtils.isEmpty(str4)) {
                i2 = Integer.parseInt(str4);
            }
        } catch (NumberFormatException e) {
            com.xiaomi.channel.commonutils.logger.b.d("Cause by intent_flag: " + e.getMessage());
        }
        if (bd.a.equals(str3)) {
            try {
                launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.b.d("Cause: " + e2.getMessage());
                launchIntentForPackage = null;
            }
        } else if (bd.b.equals(str3)) {
            if (map.containsKey("intent_uri")) {
                String str5 = map.get("intent_uri");
                if (str5 != null) {
                    try {
                        intent = Intent.parseUri(str5, 1);
                        try {
                            intent.setPackage(str);
                        } catch (URISyntaxException e3) {
                            e = e3;
                            sb = new StringBuilder();
                            sb.append("Cause: ");
                            message = e.getMessage();
                            sb.append(message);
                            com.xiaomi.channel.commonutils.logger.b.d(sb.toString());
                        }
                    } catch (URISyntaxException e4) {
                        e = e4;
                        intent = null;
                    }
                    launchIntentForPackage = intent;
                }
            } else if (map.containsKey("class_name")) {
                String str6 = map.get("class_name");
                Intent intent2 = new Intent();
                intent2.setComponent(new ComponentName(str, str6));
                launchIntentForPackage = intent2;
            }
            launchIntentForPackage = null;
        } else {
            if (bd.c.equals(str3) && (str2 = map.get("web_uri")) != null) {
                String strTrim = str2.trim();
                if (!strTrim.startsWith("http://") && !strTrim.startsWith("https://")) {
                    strTrim = "http://" + strTrim;
                }
                try {
                    String protocol = new URL(strTrim).getProtocol();
                    if ("http".equals(protocol) || "https".equals(protocol)) {
                        intent = new Intent("android.intent.action.VIEW");
                        try {
                            intent.setData(Uri.parse(strTrim));
                            ar.h(context, intent);
                        } catch (MalformedURLException e5) {
                            e = e5;
                            sb = new StringBuilder();
                            sb.append("Cause: ");
                            message = e.getMessage();
                            sb.append(message);
                            com.xiaomi.channel.commonutils.logger.b.d(sb.toString());
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
            E(launchIntentForPackage);
            launchIntentForPackage.addFlags(268435456);
            try {
                if (context.getPackageManager().resolveActivity(launchIntentForPackage, 65536) != null) {
                    return launchIntentForPackage;
                }
                if (Build.VERSION.SDK_INT >= 30 && !com.xiaomi.channel.commonutils.android.f.m3427a(context) && bd.c.equals(str3)) {
                    return launchIntentForPackage;
                }
                com.xiaomi.channel.commonutils.logger.b.m3434a("not resolve activity:" + launchIntentForPackage);
            } catch (Exception e7) {
                com.xiaomi.channel.commonutils.logger.b.d("Cause: " + e7.getMessage());
            }
        }
        return null;
    }

    public static boolean b(dq dqVar) {
        di diVarM3701a = dqVar.m3701a();
        return w(diVarM3701a) && diVarM3701a.b == 1 && !m3818a(dqVar);
    }

    private static int c(Context context, String str, String str2) {
        if (str.equals(context.getPackageName())) {
            return context.getResources().getIdentifier(str2, "drawable", str);
        }
        return 0;
    }

    public static boolean c(dq dqVar) {
        di diVarM3701a = dqVar.m3701a();
        return w(diVarM3701a) && diVarM3701a.b == 0 && !m3818a(dqVar);
    }

    private static int d(Context context, String str, Map<String, String> map, int i) {
        ComponentName componentNameA;
        Intent intentB = b(context, str, map, i);
        if (intentB == null || (componentNameA = l.a(context, intentB)) == null) {
            return 0;
        }
        return componentNameA.hashCode();
    }

    private static int e(Map<String, String> map) {
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

    private static Notification f(Notification notification) {
        Object objA = com.xiaomi.push.z.a(notification, "extraNotification");
        if (objA != null) {
            com.xiaomi.push.z.a(objA, "setCustomizedIcon", Boolean.TRUE);
        }
        return notification;
    }

    private static PendingIntent g(Context context, dq dqVar, String str, byte[] bArr, int i) {
        return h(context, dqVar, str, bArr, i, 0, v(context, dqVar, str));
    }

    private static PendingIntent h(Context context, dq dqVar, String str, byte[] bArr, int i, int i2, boolean z) {
        int i3;
        Intent intent;
        if (c(dqVar)) {
            i3 = 1000;
        } else {
            i3 = m3818a(dqVar) ? 3000 : -1;
        }
        di diVarM3701a = dqVar.m3701a();
        String strM3670a = diVarM3701a != null ? diVarM3701a.m3670a() : "";
        boolean zM3818a = m3818a(dqVar);
        if (diVarM3701a != null && !TextUtils.isEmpty(diVarM3701a.e)) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(diVarM3701a.e));
            try {
                String protocol = new URL(diVarM3701a.e).getProtocol();
                if ("http".equals(protocol) || "https".equals(protocol)) {
                    ar.h(context, intent2);
                } else {
                    intent2.setPackage(str);
                }
            } catch (MalformedURLException unused) {
                com.xiaomi.channel.commonutils.logger.b.m3434a("meet URL exception : " + diVarM3701a.e);
                intent2.setPackage(str);
            }
            intent2.addFlags(268435456);
            intent2.putExtra(WebConst.QueryParam.MESSAGE_ID, strM3670a);
            intent2.putExtra("eventMessageType", i3);
            return Build.VERSION.SDK_INT >= 31 ? PendingIntent.getActivity(context, 0, intent2, 167772160) : PendingIntent.getActivity(context, 0, intent2, AMapEngineUtils.HALF_MAX_P20_WIDTH);
        }
        if (zM3818a) {
            intent = new Intent();
            intent.setComponent(new ComponentName(PkgNameConstants.XMSF, "com.xiaomi.mipush.sdk.PushMessageHandler"));
        } else {
            intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
            intent.setComponent(new ComponentName(str, "com.xiaomi.mipush.sdk.PushMessageHandler"));
        }
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mipush_notified", true);
        intent.addCategory(String.valueOf(i));
        intent.addCategory(String.valueOf(strM3670a));
        intent.putExtra("notification_click_button", i2);
        intent.putExtra(WebConst.QueryParam.MESSAGE_ID, strM3670a);
        intent.putExtra("eventMessageType", i3);
        if (zM3818a || !z) {
            r(context, intent, dqVar, diVarM3701a, strM3670a, i2);
            return Build.VERSION.SDK_INT >= 31 ? PendingIntent.getService(context, 0, intent, 167772160) : PendingIntent.getService(context, 0, intent, AMapEngineUtils.HALF_MAX_P20_WIDTH);
        }
        Intent intent3 = new Intent();
        intent3.setComponent(a(str));
        intent3.addFlags(276824064);
        intent3.putExtra("mipush_serviceIntent", intent);
        intent3.addCategory(String.valueOf(i));
        intent3.addCategory(String.valueOf(strM3670a));
        intent3.addCategory(String.valueOf(i2));
        r(context, intent3, dqVar, diVarM3701a, strM3670a, i2);
        t(intent3);
        return Build.VERSION.SDK_INT >= 31 ? PendingIntent.getActivity(context, 0, intent3, 167772160) : PendingIntent.getActivity(context, 0, intent3, AMapEngineUtils.HALF_MAX_P20_WIDTH);
    }

    private static PendingIntent i(Context context, String str, dq dqVar, byte[] bArr, int i, int i2) {
        Map<String, String> mapM3671a = dqVar.m3701a().m3671a();
        if (mapM3671a == null) {
            return null;
        }
        boolean zV = v(context, dqVar, str);
        if (zV) {
            return h(context, dqVar, str, bArr, i, i2, zV);
        }
        Intent intentA = a(context, str, mapM3671a, i2);
        if (intentA != null) {
            return PendingIntent.getActivity(context, 0, intentA, Build.VERSION.SDK_INT >= 31 ? 167772160 : AMapEngineUtils.HALF_MAX_P20_WIDTH);
        }
        return null;
    }

    private static Intent j(Context context, String str, Map<String, String> map, String str2, String str3, String str4, String str5) {
        Intent launchIntentForPackage;
        Intent intent;
        StringBuilder sb;
        String message;
        String str6 = map.get(str2);
        if (TextUtils.isEmpty(str6)) {
            return null;
        }
        if (bd.a.equals(str6)) {
            try {
                launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.d("Cause: " + e.getMessage());
                launchIntentForPackage = null;
            }
        } else if (bd.b.equals(str6)) {
            if (map.containsKey(str3)) {
                String str7 = map.get(str3);
                if (str7 != null) {
                    try {
                        intent = Intent.parseUri(str7, 1);
                        try {
                            intent.setPackage(str);
                        } catch (URISyntaxException e2) {
                            e = e2;
                            sb = new StringBuilder();
                            sb.append("Cause: ");
                            message = e.getMessage();
                            sb.append(message);
                            com.xiaomi.channel.commonutils.logger.b.d(sb.toString());
                        }
                    } catch (URISyntaxException e3) {
                        e = e3;
                        intent = null;
                    }
                    launchIntentForPackage = intent;
                }
            } else if (map.containsKey(str4)) {
                String str8 = map.get(str4);
                Intent intent2 = new Intent();
                intent2.setComponent(new ComponentName(str, str8));
                launchIntentForPackage = intent2;
            }
            launchIntentForPackage = null;
        } else {
            if (bd.c.equals(str6)) {
                String str9 = map.get(str5);
                if (!TextUtils.isEmpty(str9)) {
                    String strTrim = str9.trim();
                    if (!strTrim.startsWith("http://") && !strTrim.startsWith("https://")) {
                        strTrim = "http://" + strTrim;
                    }
                    try {
                        String protocol = new URL(strTrim).getProtocol();
                        if ("http".equals(protocol) || "https".equals(protocol)) {
                            intent = new Intent("android.intent.action.VIEW");
                            try {
                                intent.setData(Uri.parse(strTrim));
                                ar.h(context, intent);
                            } catch (MalformedURLException e4) {
                                e = e4;
                                sb = new StringBuilder();
                                sb.append("Cause: ");
                                message = e.getMessage();
                                sb.append(message);
                                com.xiaomi.channel.commonutils.logger.b.d(sb.toString());
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
                if (Build.VERSION.SDK_INT >= 30 && !com.xiaomi.channel.commonutils.android.f.m3427a(context) && bd.c.equals(str6)) {
                    return launchIntentForPackage;
                }
                com.xiaomi.channel.commonutils.logger.b.m3434a("not resolve activity:" + launchIntentForPackage + "for buttons");
            } catch (Exception e6) {
                com.xiaomi.channel.commonutils.logger.b.d("Cause: " + e6.getMessage());
            }
        }
        return null;
    }

    private static Bitmap k(Context context, int i) {
        return a(context.getResources().getDrawable(i));
    }

    private static Bitmap l(Context context, String str, boolean z) {
        Bitmap bitmap;
        Future futureSubmit = c.submit(new a(str, context, z));
        try {
            try {
                bitmap = (Bitmap) futureSubmit.get(180L, TimeUnit.SECONDS);
                if (bitmap == null) {
                    futureSubmit.cancel(true);
                }
            } catch (Throwable th) {
                futureSubmit.cancel(true);
                throw th;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            futureSubmit.cancel(true);
            bitmap = null;
        }
        return bitmap;
    }

    private static RemoteViews m(Context context, dq dqVar, byte[] bArr) {
        di diVarM3701a = dqVar.m3701a();
        String strA = a(dqVar);
        if (diVarM3701a != null && diVarM3701a.m3671a() != null) {
            Map<String, String> mapM3671a = diVarM3701a.m3671a();
            String str = mapM3671a.get("layout_name");
            String str2 = mapM3671a.get("layout_value");
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                try {
                    Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(strA);
                    int identifier = resourcesForApplication.getIdentifier(str, "layout", strA);
                    if (identifier == 0) {
                        return null;
                    }
                    RemoteViews remoteViews = new RemoteViews(strA, identifier);
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        if (jSONObject.has("text")) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("text");
                            Iterator<String> itKeys = jSONObject2.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                String string = jSONObject2.getString(next);
                                int identifier2 = resourcesForApplication.getIdentifier(next, "id", strA);
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
                                int identifier3 = resourcesForApplication.getIdentifier(next2, "id", strA);
                                int identifier4 = resourcesForApplication.getIdentifier(string2, "drawable", strA);
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
                                int identifier5 = resourcesForApplication.getIdentifier(next3, "id", strA);
                                if (identifier5 > 0) {
                                    remoteViews.setTextViewText(identifier5, new SimpleDateFormat(string3).format(new Date(System.currentTimeMillis())));
                                }
                            }
                        }
                        return remoteViews;
                    } catch (JSONException e) {
                        com.xiaomi.channel.commonutils.logger.b.a(e);
                        return null;
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    com.xiaomi.channel.commonutils.logger.b.a(e2);
                }
            }
        }
        return null;
    }

    @TargetApi(16)
    private static com.xiaomi.push.ay n(Context context, dq dqVar, byte[] bArr, String str, int i) {
        PendingIntent pendingIntentI;
        String strA = a(dqVar);
        Map<String, String> mapM3671a = dqVar.m3701a().m3671a();
        String str2 = mapM3671a.get("notification_style_type");
        com.xiaomi.push.ay ayVarA = (!com.xiaomi.channel.commonutils.android.f.m3427a(context) || d == null) ? null : d.a(context, i, strA, mapM3671a);
        if (ayVarA != null) {
            ayVarA.a(mapM3671a);
            return ayVarA;
        }
        if ("2".equals(str2)) {
            com.xiaomi.push.ay ayVar = new com.xiaomi.push.ay(context);
            Bitmap bitmapL = TextUtils.isEmpty(mapM3671a.get("notification_bigPic_uri")) ? null : l(context, mapM3671a.get("notification_bigPic_uri"), false);
            if (bitmapL == null) {
                com.xiaomi.channel.commonutils.logger.b.m3434a("can not get big picture.");
                return ayVar;
            }
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle(ayVar);
            bigPictureStyle.bigPicture(bitmapL);
            bigPictureStyle.setSummaryText(str);
            bigPictureStyle.bigLargeIcon((Bitmap) null);
            ayVar.setStyle(bigPictureStyle);
            return ayVar;
        }
        if ("1".equals(str2)) {
            com.xiaomi.push.ay ayVar2 = new com.xiaomi.push.ay(context);
            ayVar2.setStyle(new Notification.BigTextStyle().bigText(str));
            return ayVar2;
        }
        if ("4".equals(str2) && com.xiaomi.channel.commonutils.android.f.m3426a()) {
            com.xiaomi.push.ax axVar = new com.xiaomi.push.ax(context, strA);
            if (!TextUtils.isEmpty(mapM3671a.get("notification_banner_image_uri"))) {
                axVar.setLargeIcon(l(context, mapM3671a.get("notification_banner_image_uri"), false));
            }
            if (!TextUtils.isEmpty(mapM3671a.get("notification_banner_icon_uri"))) {
                axVar.b(l(context, mapM3671a.get("notification_banner_icon_uri"), false));
            }
            axVar.a(mapM3671a);
            return axVar;
        }
        if (!"3".equals(str2) || !com.xiaomi.channel.commonutils.android.f.m3426a()) {
            return new com.xiaomi.push.ay(context);
        }
        com.xiaomi.push.az azVar = new com.xiaomi.push.az(context, i, strA);
        if (!TextUtils.isEmpty(mapM3671a.get("notification_colorful_button_text")) && (pendingIntentI = i(context, strA, dqVar, bArr, i, 4)) != null) {
            azVar.a(mapM3671a.get("notification_colorful_button_text"), pendingIntentI).mo3576a(mapM3671a.get("notification_colorful_button_bg_color"));
        }
        if (!TextUtils.isEmpty(mapM3671a.get("notification_colorful_bg_color"))) {
            azVar.b(mapM3671a.get("notification_colorful_bg_color"));
        } else if (!TextUtils.isEmpty(mapM3671a.get("notification_colorful_bg_image_uri"))) {
            azVar.setLargeIcon(l(context, mapM3671a.get("notification_colorful_bg_image_uri"), false));
        }
        azVar.a(mapM3671a);
        return azVar;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x036a  */
    /* JADX WARN: Code duplicated, block: B:134:0x036d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0386 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x0388  */
    /* JADX WARN: Code duplicated, block: B:152:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:154:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:157:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:160:0x0409  */
    /* JADX WARN: Code duplicated, block: B:50:0x0151  */
    /* JADX WARN: Code duplicated, block: B:83:0x021b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0225  */
    /* JADX WARN: Code duplicated, block: B:96:0x026f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0276  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v29 */
    @SuppressLint({"NewApi"})
    private static b o(Context context, dq dqVar, byte[] bArr, RemoteViews remoteViews, PendingIntent pendingIntent, int i) throws Throwable {
        com.xiaomi.push.ay ayVar;
        boolean z;
        String strD;
        boolean z2;
        boolean z3;
        long jCurrentTimeMillis;
        String str;
        boolean z4;
        b bVar;
        int iB;
        String str2;
        Notification notification;
        int iA;
        int iA2;
        Bitmap bitmapA;
        int i2;
        Bitmap bitmapL;
        StringBuilder sb;
        String strQ;
        b bVar2 = new b();
        di diVarM3701a = dqVar.m3701a();
        String strA = a(dqVar);
        Map<String, String> mapM3671a = diVarM3701a.m3671a();
        String[] strArrY = y(context, diVarM3701a);
        if (remoteViews != null) {
            ayVar = new com.xiaomi.push.ay(context);
            ayVar.setCustomContentView(remoteViews);
        } else {
            ayVar = (mapM3671a == null || !mapM3671a.containsKey("notification_style_type")) ? new com.xiaomi.push.ay(context) : n(context, dqVar, bArr, strArrY[1], i);
        }
        com.xiaomi.push.ay ayVar2 = ayVar;
        u(ayVar2, context, dqVar.b(), dqVar, bArr, i);
        ayVar2.setContentTitle(strArrY[0]);
        ayVar2.setContentText(strArrY[1]);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        ayVar2.setWhen(jCurrentTimeMillis2);
        String strQ2 = q(mapM3671a, "notification_show_when");
        if (!TextUtils.isEmpty(strQ2)) {
            ayVar2.setShowWhen(Boolean.parseBoolean(strQ2));
        } else if (Build.VERSION.SDK_INT >= 24) {
            ayVar2.setShowWhen(true);
        }
        ayVar2.setContentIntent(pendingIntent);
        s(context, strA, ayVar2, mapM3671a);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            if (mapM3671a == null) {
                i2 = 1;
                bitmapL = null;
            } else {
                i2 = 1;
                bitmapL = l(context, mapM3671a.get("notification_small_icon_uri"), true);
            }
            if (bitmapL != null) {
                Object[] objArr = new Object[i2];
                objArr[0] = bitmapL;
                Object objA = com.xiaomi.push.z.a("android.graphics.drawable.Icon", "createWithBitmap", objArr);
                if (objA != null) {
                    Object[] objArr2 = new Object[i2];
                    objArr2[0] = objA;
                    com.xiaomi.push.z.a((Object) ayVar2, "setSmallIcon", objArr2);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("miui.isGrayscaleIcon", i2);
                    ayVar2.addExtras(bundle);
                } else {
                    sb = new StringBuilder();
                    sb.append("failed te get small icon with url:");
                    strQ = mapM3671a.get("notification_small_icon_uri");
                }
                ayVar2.mo3576a(q(mapM3671a, "notification_small_icon_color"));
            } else {
                sb = new StringBuilder();
                sb.append("failed to get small icon url:");
                strQ = q(mapM3671a, "notification_small_icon_uri");
            }
            sb.append(strQ);
            com.xiaomi.channel.commonutils.logger.b.m3434a(sb.toString());
            ayVar2.mo3576a(q(mapM3671a, "notification_small_icon_color"));
        }
        String strQ3 = q(mapM3671a, "__dynamic_icon_uri");
        boolean z5 = Boolean.parseBoolean(q(mapM3671a, "__adiom")) || !com.xiaomi.channel.commonutils.android.f.m3426a();
        if (TextUtils.isEmpty(strQ3) || !z5) {
            z = false;
        } else {
            if (strQ3.startsWith("http")) {
                ap.b bVarA = ap.a(context, strQ3, true);
                if (bVarA != null) {
                    bitmapA = bVarA.f204a;
                    bVar2.b = bVarA.a;
                } else {
                    bitmapA = null;
                }
            } else {
                bitmapA = ap.a(context, strQ3);
            }
            if (bitmapA != null) {
                ayVar2.setLargeIcon(bitmapA);
                z = true;
            } else {
                z = false;
            }
        }
        Bitmap bitmapL2 = mapM3671a == null ? null : l(context, mapM3671a.get("notification_large_icon_uri"), true);
        if (bitmapL2 != null) {
            ayVar2.setLargeIcon(bitmapL2);
        }
        if (mapM3671a != null && i3 >= 24) {
            String strA2 = mapM3671a.get("notification_group");
            z2 = Boolean.parseBoolean(mapM3671a.get("notification_is_summary"));
            boolean z6 = Boolean.parseBoolean(mapM3671a.get("notification_group_disable_default"));
            if (TextUtils.isEmpty(strA2) && (com.xiaomi.channel.commonutils.android.f.m3426a() || !z6)) {
                strA2 = a(dqVar);
            }
            String str3 = strA2;
            com.xiaomi.push.z.a((Object) ayVar2, "setGroupSummary", Boolean.valueOf(z2));
            String str4 = mapM3671a.get("notification_style_type");
            if (PkgNameConstants.XMSF.equals(context.getPackageName()) && ("4".equals(str4) || "3".equals(str4))) {
                strD = a(dqVar) + "_custom_" + jCurrentTimeMillis2;
                z3 = true;
            } else {
                strD = str3;
            }
            ayVar2.setAutoCancel(true);
            jCurrentTimeMillis = System.currentTimeMillis();
            if (mapM3671a != null && mapM3671a.containsKey("ticker")) {
                ayVar2.setTicker(mapM3671a.get("ticker"));
            }
            if (jCurrentTimeMillis - a > 10000) {
                a = jCurrentTimeMillis;
                iB = diVarM3701a.a;
                if (F(context, strA)) {
                    iB = b(context, strA);
                }
                ayVar2.setDefaults(iB);
                if (mapM3671a != null || (iB & 1) == 0) {
                    str = PkgNameConstants.XMSF;
                    z4 = z;
                    bVar = bVar2;
                } else {
                    bVar = bVar2;
                    String str5 = mapM3671a.get("sound_uri");
                    if (TextUtils.isEmpty(str5)) {
                        str = PkgNameConstants.XMSF;
                        z4 = z;
                    } else {
                        z4 = z;
                        StringBuilder sb2 = new StringBuilder();
                        str = PkgNameConstants.XMSF;
                        sb2.append("android.resource://");
                        sb2.append(strA);
                        if (str5.startsWith(sb2.toString())) {
                            ayVar2.setDefaults(iB ^ 1);
                            ayVar2.setSound(Uri.parse(str5));
                        }
                    }
                }
            } else {
                str = PkgNameConstants.XMSF;
                z4 = z;
                bVar = bVar2;
                iB = -100;
            }
            str2 = "0";
            if (mapM3671a != null || i3 < 26) {
                str2 = "0";
                if (mapM3671a != null && i3 < 26) {
                    com.xiaomi.push.z.a((Object) ayVar2, "setPriority", Integer.valueOf(H(mapM3671a)));
                }
            } else {
                aq aqVarA = aq.a(context, strA);
                int iE = e(mapM3671a);
                if (iE > 0) {
                    com.xiaomi.push.z.a((Object) ayVar2, "setTimeoutAfter", Long.valueOf(iE * 1000));
                }
                am.f(diVarM3701a);
                String str6 = mapM3671a.get(OpenSdkPlayStatisticUpload.KEY_CHANNEL_ID);
                if (!TextUtils.isEmpty(str6) || context.getApplicationInfo().targetSdkVersion >= 26) {
                    String strP = p(context, strA, mapM3671a);
                    int iA3 = A(mapM3671a);
                    int i4 = diVarM3701a.a;
                    String str7 = mapM3671a.get("channel_description");
                    String str8 = mapM3671a.get("sound_uri");
                    String str9 = mapM3671a.get("channel_perm");
                    br.f(context, mapM3671a, ayVar2, jCurrentTimeMillis2);
                    com.xiaomi.push.z.a((Object) ayVar2, "setChannelId", am.a(aqVarA, str6, strP, str7, i4, iA3, str8, str9));
                    if (iB == -100 && ar.a(mapM3671a)) {
                        ar.a(ayVar2, z2);
                    }
                    if (WorkoutExercises.PULLDOWN.equals(ar.a((Object) mapM3671a)) && ar.a(mapM3671a) && Objects.equals(mapM3671a.get("pull_down_pop_type"), str2)) {
                        ar.a(ayVar2, z2);
                    }
                    if (PlayableModel.KIND_TTS.equals(ar.a((Object) mapM3671a)) && ar.a(mapM3671a)) {
                        ar.a(ayVar2, z2);
                    }
                }
                String str10 = mapM3671a.get(BackgroundStyleConstant.BACKGROUND_COLOR);
                if (!TextUtils.isEmpty(str10)) {
                    try {
                        int i5 = Integer.parseInt(str10);
                        ayVar2.setOngoing(true);
                        ayVar2.setColor(i5);
                        com.xiaomi.push.z.a((Object) ayVar2, "setColorized", Boolean.TRUE);
                    } catch (Exception e) {
                        com.xiaomi.channel.commonutils.logger.b.a(e);
                    }
                }
            }
            if (strD != null) {
                if (!z3) {
                    strD = w.b().d(context, ayVar2, strD);
                }
                com.xiaomi.push.z.a((Object) ayVar2, "setGroup", strD);
            }
            if (com.xiaomi.channel.commonutils.android.f.m3429b() && str.equals(context.getPackageName())) {
                com.xiaomi.push.z.a("miui.util.NotificationHelper", "setTargetPkg", context, ayVar2, a(dqVar));
            }
            notification = ayVar2.getNotification();
            if (z4 && com.xiaomi.channel.commonutils.android.f.m3426a()) {
                f(notification);
            }
            if (mapM3671a != null) {
                if (notification.extras == null) {
                    notification.extras = new Bundle();
                }
                if (!TextUtils.isEmpty(mapM3671a.get("enable_keyguard"))) {
                    ar.b(notification, Boolean.parseBoolean(mapM3671a.get("enable_keyguard")));
                }
                if (!TextUtils.isEmpty(mapM3671a.get("enable_float"))) {
                    ar.g(notification, Boolean.parseBoolean(mapM3671a.get("enable_float")));
                }
                if (!TextUtils.isEmpty(mapM3671a.get("float_small_win")) && str2.equals(mapM3671a.get("float_small_win")) && com.xiaomi.channel.commonutils.android.a.c(context, strA)) {
                    ar.g(notification, false);
                }
                iA = com.xiaomi.channel.commonutils.android.l.a(mapM3671a.get("section_is_prr"), -1);
                iA2 = com.xiaomi.channel.commonutils.android.l.a(mapM3671a.get("section_prr_cl"), -1);
                if (iA >= 0 && iA2 >= 0) {
                    ar.e(notification, iA, iA2);
                }
            }
            b bVar3 = bVar;
            bVar3.a = notification;
            return bVar3;
        }
        strD = null;
        z2 = false;
        z3 = false;
        ayVar2.setAutoCancel(true);
        jCurrentTimeMillis = System.currentTimeMillis();
        if (mapM3671a != null) {
            ayVar2.setTicker(mapM3671a.get("ticker"));
        }
        if (jCurrentTimeMillis - a > 10000) {
            a = jCurrentTimeMillis;
            iB = diVarM3701a.a;
            if (F(context, strA)) {
                iB = b(context, strA);
            }
            ayVar2.setDefaults(iB);
            if (mapM3671a != null) {
                str = PkgNameConstants.XMSF;
                z4 = z;
                bVar = bVar2;
            } else {
                str = PkgNameConstants.XMSF;
                z4 = z;
                bVar = bVar2;
            }
        } else {
            str = PkgNameConstants.XMSF;
            z4 = z;
            bVar = bVar2;
            iB = -100;
        }
        str2 = "0";
        if (mapM3671a != null) {
            str2 = "0";
            if (mapM3671a != null) {
                com.xiaomi.push.z.a((Object) ayVar2, "setPriority", Integer.valueOf(H(mapM3671a)));
            }
        } else {
            str2 = "0";
            if (mapM3671a != null) {
                com.xiaomi.push.z.a((Object) ayVar2, "setPriority", Integer.valueOf(H(mapM3671a)));
            }
        }
        if (strD != null) {
            if (!z3) {
                strD = w.b().d(context, ayVar2, strD);
            }
            com.xiaomi.push.z.a((Object) ayVar2, "setGroup", strD);
        }
        if (com.xiaomi.channel.commonutils.android.f.m3429b()) {
            com.xiaomi.push.z.a("miui.util.NotificationHelper", "setTargetPkg", context, ayVar2, a(dqVar));
        }
        notification = ayVar2.getNotification();
        if (z4) {
            f(notification);
        }
        if (mapM3671a != null) {
            if (notification.extras == null) {
                notification.extras = new Bundle();
            }
            if (!TextUtils.isEmpty(mapM3671a.get("enable_keyguard"))) {
                ar.b(notification, Boolean.parseBoolean(mapM3671a.get("enable_keyguard")));
            }
            if (!TextUtils.isEmpty(mapM3671a.get("enable_float"))) {
                ar.g(notification, Boolean.parseBoolean(mapM3671a.get("enable_float")));
            }
            if (!TextUtils.isEmpty(mapM3671a.get("float_small_win"))) {
                ar.g(notification, false);
            }
            iA = com.xiaomi.channel.commonutils.android.l.a(mapM3671a.get("section_is_prr"), -1);
            iA2 = com.xiaomi.channel.commonutils.android.l.a(mapM3671a.get("section_prr_cl"), -1);
            if (iA >= 0) {
                ar.e(notification, iA, iA2);
            }
        }
        b bVar4 = bVar;
        bVar4.a = notification;
        return bVar4;
    }

    private static String p(Context context, String str, Map<String, String> map) {
        return (map == null || TextUtils.isEmpty(map.get("channel_name"))) ? com.xiaomi.channel.commonutils.android.a.m3419b(context, str) : map.get("channel_name");
    }

    private static String q(Map<String, String> map, String str) {
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    private static void r(Context context, Intent intent, dq dqVar, di diVar, String str, int i) {
        if (dqVar == null || diVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        String strA = a(diVar.m3671a(), i);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        if (bd.a.equals(strA) || bd.b.equals(strA) || bd.c.equals(strA)) {
            intent.putExtra(WebConst.QueryParam.MESSAGE_ID, str);
            intent.putExtra("local_paid", dqVar.f122a);
            if (!TextUtils.isEmpty(dqVar.b)) {
                intent.putExtra("target_package", dqVar.b);
            }
            intent.putExtra("job_key", q(diVar.m3671a(), "jobkey"));
            intent.putExtra(i + "_target_component", d(context, dqVar.b, diVar.m3671a(), i));
        }
    }

    private static void s(Context context, String str, com.xiaomi.push.ay ayVar, Map<String, String> map) {
        int iC = c(context, str, "mipush_small_notification");
        int iC2 = c(context, str, "mipush_notification");
        if (!com.xiaomi.channel.commonutils.android.f.m3427a(context)) {
            if (iC > 0) {
                ayVar.setSmallIcon(iC);
            } else {
                D(context, str, ayVar, map);
            }
            if (iC2 <= 0) {
                return;
            }
        } else {
            if (iC <= 0 || iC2 <= 0) {
                D(context, str, ayVar, map);
                return;
            }
            ayVar.setSmallIcon(iC);
        }
        ayVar.setLargeIcon(k(context, iC2));
    }

    private static void t(Intent intent) {
        try {
            Method declaredMethod = intent.getClass().getDeclaredMethod("addMiuiFlags", Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(intent, 2);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.b("insert flags error " + e);
        }
    }

    @TargetApi(16)
    private static void u(com.xiaomi.push.ay ayVar, Context context, String str, dq dqVar, byte[] bArr, int i) {
        PendingIntent pendingIntentI;
        PendingIntent pendingIntentI2;
        PendingIntent pendingIntentI3;
        PendingIntent pendingIntentI4;
        Map<String, String> mapM3671a = dqVar.m3701a().m3671a();
        if (TextUtils.equals("3", mapM3671a.get("notification_style_type")) || TextUtils.equals("4", mapM3671a.get("notification_style_type"))) {
            return;
        }
        if (G(mapM3671a)) {
            for (int i2 = 1; i2 <= 3; i2++) {
                String str2 = mapM3671a.get(String.format("cust_btn_%s_n", Integer.valueOf(i2)));
                if (!TextUtils.isEmpty(str2) && (pendingIntentI4 = i(context, str, dqVar, bArr, i, i2)) != null) {
                    ayVar.addAction(0, str2, pendingIntentI4);
                }
            }
            return;
        }
        if (!TextUtils.isEmpty(mapM3671a.get("notification_style_button_left_name")) && (pendingIntentI3 = i(context, str, dqVar, bArr, i, 1)) != null) {
            ayVar.addAction(0, mapM3671a.get("notification_style_button_left_name"), pendingIntentI3);
        }
        if (!TextUtils.isEmpty(mapM3671a.get("notification_style_button_mid_name")) && (pendingIntentI2 = i(context, str, dqVar, bArr, i, 2)) != null) {
            ayVar.addAction(0, mapM3671a.get("notification_style_button_mid_name"), pendingIntentI2);
        }
        if (TextUtils.isEmpty(mapM3671a.get("notification_style_button_right_name")) || (pendingIntentI = i(context, str, dqVar, bArr, i, 3)) == null) {
            return;
        }
        ayVar.addAction(0, mapM3671a.get("notification_style_button_right_name"), pendingIntentI);
    }

    private static boolean v(Context context, dq dqVar, String str) {
        if (dqVar != null && dqVar.m3701a() != null && dqVar.m3701a().m3671a() != null && !TextUtils.isEmpty(str)) {
            return Boolean.parseBoolean(dqVar.m3701a().m3671a().get("use_clicked_activity")) && l.a(context, a(str));
        }
        com.xiaomi.channel.commonutils.logger.b.m3434a("should clicked activity params are null.");
        return false;
    }

    private static boolean w(di diVar) {
        if (diVar == null) {
            return false;
        }
        String strM3670a = diVar.m3670a();
        return !TextUtils.isEmpty(strM3670a) && strM3670a.length() == 22 && "satuigmo".indexOf(strM3670a.charAt(0)) >= 0;
    }

    private static boolean x(String str, String str2) {
        return TextUtils.isEmpty(str) || str2.contains(str);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072 A[PHI: r0 r3
      0x0072: PHI (r0v4 java.lang.String) = (r0v2 java.lang.String), (r0v5 java.lang.String) binds: [B:18:0x0070, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r3v15 java.lang.String) = (r3v14 java.lang.String), (r3v21 java.lang.String) binds: [B:18:0x0070, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    private static String[] y(Context context, di diVar) {
        String str;
        String strM3678c = diVar.m3678c();
        String strD = diVar.d();
        Map<String, String> mapM3671a = diVar.m3671a();
        if (mapM3671a != null) {
            int iIntValue = Float.valueOf((context.getResources().getDisplayMetrics().widthPixels / context.getResources().getDisplayMetrics().density) + 0.5f).intValue();
            if (iIntValue <= 320) {
                String str2 = mapM3671a.get("title_short");
                if (!TextUtils.isEmpty(str2)) {
                    strM3678c = str2;
                }
                str = mapM3671a.get("description_short");
                if (!TextUtils.isEmpty(str)) {
                    strD = str;
                }
            } else if (iIntValue > 360) {
                String str3 = mapM3671a.get("title_long");
                if (!TextUtils.isEmpty(str3)) {
                    strM3678c = str3;
                }
                str = mapM3671a.get("description_long");
                if (!TextUtils.isEmpty(str)) {
                    strD = str;
                }
            }
        }
        return new String[]{strM3678c, strD};
    }

    private static int z(Context context, String str) {
        int iC = c(context, str, "mipush_notification");
        int iC2 = c(context, str, "mipush_small_notification");
        if (iC <= 0) {
            iC = iC2 > 0 ? iC2 : context.getApplicationInfo().icon;
        }
        return iC == 0 ? context.getApplicationInfo().logo : iC;
    }
}
