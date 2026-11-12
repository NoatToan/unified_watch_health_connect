package com.xiaomi.push.service;

import android.app.Notification;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.huami.device.feature.notification.statistics.NotificationEvent;
import com.ximalaya.ting.android.opensdk.player.statistic.OpenSdkPlayStatisticUpload;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class ar {
    public static final a<String, String, String> a;
    public static final a<String, String, String> b;
    public static final a<String, String, String> c;
    public static final a<String, String, String> d;
    public static final a<String, String, String> e;
    private static final String[] f = {"com.mi.globalbrowser", "com.android.browser"};
    private static String g = null;

    public static class a<F, S, T> {
        public F a;
        public S b;
        public T c;

        private a(F f, S s, T t) {
            this.a = f;
            this.b = s;
            this.c = t;
        }
    }

    static {
        String str = "canSound";
        a = new a<>("setSound", str, str);
        String str2 = "canVibrate";
        b = new a<>("setVibrate", str2, str2);
        String str3 = "canLights";
        c = new a<>("setLights", str3, str3);
        String str4 = "canShowOnKeyguard";
        d = new a<>("setShowOnKeyguard", str4, str4);
        e = new a<>("setFloat", "canFloat", "canShowFloat");
    }

    public static int a(ContentResolver contentResolver) {
        try {
            return Settings.Global.getInt(contentResolver, "user_aggregate", 0);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("get user aggregate failed, " + e2);
            return 0;
        }
    }

    public static int a(Context context, String str, String str2, a<String, String, String> aVar) {
        if (aVar == null) {
            return -1;
        }
        try {
            Bundle bundleC = c(context, aVar.b, str, str2, null);
            if (bundleC == null || !bundleC.containsKey(aVar.c)) {
                return -1;
            }
            return bundleC.getBoolean(aVar.c) ? 1 : 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static <T> T a(Notification notification, String str) {
        Bundle bundle = notification.extras;
        if (bundle == null) {
            return null;
        }
        try {
            return (T) bundle.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    public static <T> T a(Object obj, String str, T t) {
        Object objA;
        Object obj2 = null;
        try {
            if (obj instanceof Notification) {
                objA = a((Notification) obj, str);
            } else {
                if (!(obj instanceof Map)) {
                    if (obj instanceof Bundle) {
                        objA = ((Bundle) obj).get(str);
                    } else {
                        com.xiaomi.channel.commonutils.logger.b.m3434a("not support get value from classType:" + obj);
                    }
                    if (obj2 == null) {
                        return t;
                    }
                    return (T) obj2;
                }
                objA = ((Map) obj).get(str);
            }
            obj2 = objA;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("get value error " + e2);
        }
        if (obj2 == null) {
            return t;
        }
        return (T) obj2;
    }

    public static String a(Notification notification) {
        CharSequence charSequence;
        Bundle bundle = notification.extras;
        if (bundle != null) {
            charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_TITLE);
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence(NotificationCompat.EXTRA_TITLE_BIG);
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence("mipush.customTitle");
            }
        } else {
            charSequence = null;
        }
        return charSequence != null ? charSequence.toString() : "";
    }

    public static String a(Object obj) {
        return (String) a(obj, "msg_busi_type", "");
    }

    public static void a(Map<String, String> map, Bundle bundle, String str) {
        if (map == null || bundle == null || TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("cp map to b fail:" + str);
            return;
        }
        if (TextUtils.isEmpty(map.get(str))) {
            bundle.remove(str);
        } else {
            bundle.putString(str, map.get(str));
        }
    }

    public static boolean a(Notification.Builder builder, boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setGroupAlertBehavior(z ? 2 : 1);
            return true;
        }
        com.xiaomi.channel.commonutils.logger.b.b("not support setGroupAlertBehavior");
        return false;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m3822a(ContentResolver contentResolver) {
        int iA = a(contentResolver);
        return iA == 1 || iA == 2;
    }

    public static boolean a(Context context, String str, String str2, a<String, String, String> aVar, boolean z) {
        if (aVar != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putBoolean(aVar.c, z);
                c(context, aVar.a, str, str2, bundle);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean a(Map<String, String> map) {
        return Boolean.parseBoolean((String) a(map, "not_suppress", "true"));
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static Notification.Action[] m3823a(Notification notification) {
        Parcelable[] parcelableArray;
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr;
        }
        Bundle bundle = notification.extras;
        if (bundle == null || (parcelableArray = bundle.getParcelableArray("mipush.customActions")) == null) {
            return null;
        }
        return (Notification.Action[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Notification.Action[].class);
    }

    public static int b(Context context, String str) {
        return com.xiaomi.channel.commonutils.android.a.b(context, str);
    }

    public static String b(Notification notification) {
        CharSequence charSequence;
        Bundle bundle = notification.extras;
        if (bundle != null) {
            charSequence = bundle.getCharSequence(NotificationCompat.EXTRA_TEXT);
            if (TextUtils.isEmpty(charSequence) && Build.VERSION.SDK_INT >= 21) {
                charSequence = notification.extras.getCharSequence(NotificationCompat.EXTRA_BIG_TEXT);
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence("mipush.customContent");
            }
        } else {
            charSequence = null;
        }
        return charSequence != null ? charSequence.toString() : "";
    }

    public static void b(Notification notification, boolean z) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putBoolean("miui.enableKeyguard", z);
            }
            Object objA = com.xiaomi.push.z.a(notification, "extraNotification");
            if (objA != null) {
                com.xiaomi.push.z.a(objA, "setEnableKeyguard", Boolean.valueOf(z));
            }
        } catch (Exception unused) {
        }
    }

    private static Bundle c(Context context, String str, String str2, String str3, Bundle bundle) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("call notification provider failed!");
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString(NotificationEvent.KEY_PACKAGE, str2);
        if (!TextUtils.isEmpty(str3)) {
            bundle2.putString(OpenSdkPlayStatisticUpload.KEY_CHANNEL_ID, str3);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        return context.getContentResolver().call(Uri.parse("content://statusbar.notification"), str, (String) null, bundle2);
    }

    public static String c(Notification notification) {
        Object objA;
        String string = null;
        try {
            Bundle bundle = notification.extras;
            string = bundle != null ? bundle.getString("target_package") : null;
            return (!TextUtils.isEmpty(string) || (objA = com.xiaomi.push.z.a(notification, "extraNotification")) == null) ? string : (String) com.xiaomi.push.z.a(objA, "getTargetPkg", new Object[0]);
        } catch (Exception unused) {
            return string;
        }
    }

    public static void d(Notification notification, int i) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putInt("miui.messageCount", i);
            }
            Object objA = com.xiaomi.push.z.a(notification, "extraNotification");
            if (objA != null) {
                com.xiaomi.push.z.a(objA, "setMessageCount", Integer.valueOf(i));
            }
        } catch (Exception unused) {
        }
    }

    public static void e(Notification notification, int i, int i2) {
        if (notification != null) {
            if (notification.extras == null) {
                notification.extras = new Bundle();
            }
            notification.extras.putInt("is_priority", i);
            notification.extras.putInt("mipush_class", i2);
        }
    }

    public static void f(Notification notification, String str) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putString("target_package", str);
            }
            Object objA = com.xiaomi.push.z.a(notification, "extraNotification");
            if (objA != null) {
                com.xiaomi.push.z.a(objA, "setTargetPkg", str);
            }
        } catch (Exception unused) {
        }
    }

    public static void g(Notification notification, boolean z) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putBoolean("miui.enableFloat", z);
            }
            Object objA = com.xiaomi.push.z.a(notification, "extraNotification");
            if (objA != null) {
                com.xiaomi.push.z.a(objA, "setEnableFloat", Boolean.valueOf(z));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    public static void h(Context context, Intent intent) {
        String str;
        int i = -1;
        do {
            str = i < 0 ? g : f[i];
            if (TextUtils.isEmpty(str)) {
                i++;
            } else {
                intent.setPackage(str);
                try {
                    if (context.getPackageManager().resolveActivity(intent, 65536) == null) {
                        i++;
                    }
                } catch (Exception e2) {
                    com.xiaomi.channel.commonutils.logger.b.m3434a("not found xm browser:" + e2);
                }
            }
            intent.setPackage(str);
            g = str;
        } while (i < f.length);
        str = null;
        intent.setPackage(str);
        g = str;
    }
}
