package defpackage;

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
import com.xiaomi.push.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class s8s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f33416a = {"com.mi.globalbrowser", "com.android.browser"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f33417b = null;
    public static final a<String, String, String> c;
    public static final a<String, String, String> d;
    public static final a<String, String, String> e;
    public static final a<String, String, String> f;
    public static final a<String, String, String> g;
    public static final a<String, String, String> h;
    public static final a<String, String, String> i;
    public static final a<String, String, String> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Boolean f33418k;

    public static class a<F, S, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public F f33419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public S f33420b;
        public T c;

        public a(F f, S s, T t) {
            this.f33419a = f;
            this.f33420b = s;
            this.c = t;
        }
    }

    static {
        String str = "getNotificationSettings";
        c = new a<>(str, str, str);
        String str2 = "canSound";
        d = new a<>("setSound", str2, str2);
        String str3 = "canVibrate";
        e = new a<>("setVibrate", str3, str3);
        String str4 = "canLights";
        f = new a<>("setLights", str4, str4);
        String str5 = "canShowOnKeyguard";
        g = new a<>("setShowOnKeyguard", str5, str5);
        h = new a<>("setFloat", "canFloat", "canShowFloat");
        String str6 = "canShowBadge";
        i = new a<>("setShowBadge", str6, str6);
        String str7 = "canShowOngoing";
        j = new a<>("setShowOngoing", str7, str7);
    }

    public static int a(ContentResolver contentResolver) {
        try {
            return Settings.Global.getInt(contentResolver, "user_aggregate", 0);
        } catch (Exception e2) {
            x9s.o("get user aggregate failed, " + e2);
            return 0;
        }
    }

    public static int b(Context context, String str) {
        return g.m(context, str);
    }

    public static int c(Context context, String str, String str2, a<String, String, String> aVar) {
        if (aVar == null) {
            return -1;
        }
        try {
            Bundle bundleE = e(context, aVar.f33420b, str, str2, null);
            if (bundleE == null || !bundleE.containsKey(aVar.c)) {
                return -1;
            }
            return bundleE.getBoolean(aVar.c) ? 1 : 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static Bundle d(Context context, String str, String str2) {
        try {
            return e(context, c.f33420b, str, str2, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bundle e(Context context, String str, String str2, String str3, Bundle bundle) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("call notification provider failed!");
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("package", str2);
        if (!TextUtils.isEmpty(str3)) {
            bundle2.putString("channel_id", str3);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        return context.getContentResolver().call(Uri.parse("content://statusbar.notification"), str, (String) null, bundle2);
    }

    public static <T> T f(Notification notification, String str) {
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

    public static <T> T g(Object obj, String str, T t) {
        Object objF = null;
        try {
            if (obj instanceof Notification) {
                objF = f((Notification) obj, str);
            } else if (obj instanceof Map) {
                objF = ((Map) obj).get(str);
            } else if (obj instanceof Bundle) {
                objF = ((Bundle) obj).get(str);
            } else {
                x9s.o("not support get value from classType:" + obj);
            }
        } catch (Exception e2) {
            x9s.o("get value error " + e2);
        }
        return objF == null ? t : (T) objF;
    }

    public static String h(Notification notification) {
        CharSequence charSequence;
        Bundle bundle = notification.extras;
        if (bundle != null) {
            charSequence = bundle.getCharSequence("android.title");
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence("android.title.big");
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence("mipush.customTitle");
            }
        } else {
            charSequence = null;
        }
        return charSequence != null ? charSequence.toString() : "";
    }

    public static String i(Object obj) {
        return (String) g(obj, "msg_busi_type", "");
    }

    public static void j(Notification notification, int i2) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putInt("miui.messageCount", i2);
            }
            Object objD = zbs.d(notification, "extraNotification");
            if (objD != null) {
                zbs.e(objD, "setMessageCount", Integer.valueOf(i2));
            }
        } catch (Exception unused) {
        }
    }

    public static void k(Notification notification, int i2, int i3) {
        if (notification != null) {
            if (notification.extras == null) {
                notification.extras = new Bundle();
            }
            notification.extras.putInt("is_priority", i2);
            notification.extras.putInt("mipush_class", i3);
        }
    }

    public static void l(Notification notification, String str) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putString("target_package", str);
            }
            Object objD = zbs.d(notification, "extraNotification");
            if (objD != null) {
                zbs.e(objD, "setTargetPkg", str);
            }
        } catch (Exception unused) {
        }
    }

    public static void m(Notification notification, boolean z) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putBoolean("miui.enableFloat", z);
            }
            Object objD = zbs.d(notification, "extraNotification");
            if (objD != null) {
                zbs.e(objD, "setEnableFloat", Boolean.valueOf(z));
            }
        } catch (Exception unused) {
        }
    }

    public static void n(Context context, String str, Intent intent) {
        if (intent == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(str);
        }
        arrayList.addAll(Arrays.asList(f33416a));
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str2 = (String) arrayList.get(i2);
            if (!TextUtils.isEmpty(str2)) {
                Intent intent2 = new Intent(intent);
                intent2.setPackage(str2);
                try {
                    if (context.getPackageManager().resolveActivity(intent2, 65536) != null) {
                        intent.setPackage(str2);
                        break;
                    }
                    continue;
                } catch (Exception e2) {
                    x9s.o("can't match url intent. " + e2);
                }
            }
        }
        intent.setPackage(intent.getPackage());
    }

    public static void o(Map<String, String> map, Bundle bundle, String str) {
        if (map == null || bundle == null || TextUtils.isEmpty(str)) {
            x9s.o("cp map to b fail:" + str);
            return;
        }
        if (TextUtils.isEmpty(map.get(str))) {
            bundle.remove(str);
        } else {
            bundle.putString(str, map.get(str));
        }
    }

    public static boolean p() {
        Bundle bundleF;
        if (f33418k == null) {
            if (Build.VERSION.SDK_INT < 30 || (bundleF = vus.f("com.xiaomi.xmsf", null)) == null || bundleF.isEmpty()) {
                f33418k = Boolean.FALSE;
            } else {
                f33418k = Boolean.TRUE;
            }
        }
        return f33418k.booleanValue();
    }

    public static boolean q(Notification.Builder builder, boolean z) {
        builder.setGroupAlertBehavior(z ? 2 : 1);
        return true;
    }

    public static boolean r(ContentResolver contentResolver) {
        int iA = a(contentResolver);
        return iA == 1 || iA == 2;
    }

    public static boolean s(Context context, String str, String str2, a<String, String, String> aVar, boolean z) {
        if (aVar != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putBoolean(aVar.c, z);
                e(context, aVar.f33419a, str, str2, bundle);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean t(Map<String, String> map) {
        return Boolean.parseBoolean((String) g(map, "not_suppress", "true"));
    }

    public static Notification.Action[] u(Notification notification) {
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

    public static String v(Notification notification) {
        CharSequence charSequence;
        Bundle bundle = notification.extras;
        if (bundle != null) {
            charSequence = bundle.getCharSequence("android.text");
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence("android.bigText");
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence("mipush.customContent");
            }
        } else {
            charSequence = null;
        }
        return charSequence != null ? charSequence.toString() : "";
    }

    public static void w(Notification notification, boolean z) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putBoolean("miui.enableKeyguard", z);
            }
            Object objD = zbs.d(notification, "extraNotification");
            if (objD != null) {
                zbs.e(objD, "setEnableKeyguard", Boolean.valueOf(z));
            }
        } catch (Exception unused) {
        }
    }

    public static String x(Notification notification) {
        Object objD;
        String string = null;
        try {
            Bundle bundle = notification.extras;
            string = bundle != null ? bundle.getString("target_package") : null;
            return (!TextUtils.isEmpty(string) || (objD = zbs.d(notification, "extraNotification")) == null) ? string : (String) zbs.e(objD, "getTargetPkg", new Object[0]);
        } catch (Exception unused) {
            return string;
        }
    }
}
