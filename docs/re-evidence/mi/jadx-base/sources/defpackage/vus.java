package defpackage;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class vus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f37250a = {1, 2, 4, 8, 16};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SparseArray<s8s.a<String, String, String>> f37251b = new ixs(5);
    public static final SparseArray<Integer> c = new mzs(5);

    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    public static int a(Context context, String str, NotificationChannel notificationChannel) {
        if (context == null || TextUtils.isEmpty(str) || notificationChannel == null) {
            x9s.o("context|packageName|channel must not be null ");
            return 0;
        }
        int i = notificationChannel.getImportance() != 0 ? 1 : 2;
        int i2 = 8;
        if (s8s.p()) {
            Bundle bundleF = f(str, notificationChannel.getId());
            s8s.a<String, String, String> aVar = s8s.h;
            if (bundleF.containsKey(aVar.c)) {
                if (bundleF.getBoolean(aVar.c) && notificationChannel.getImportance() >= 4) {
                    i2 = 4;
                }
                i |= i2;
            }
            s8s.a<String, String, String> aVar2 = s8s.g;
            if (bundleF.containsKey(aVar2.c)) {
                i |= bundleF.getBoolean(aVar2.c) ? 16 : 32;
            }
        } else {
            int iD = d(str, notificationChannel.getId(), 8);
            if (iD == 1) {
                if (notificationChannel.getImportance() >= 4) {
                    i |= 4;
                } else {
                    i |= 8;
                }
            } else if (iD == 0) {
                i |= 8;
            }
            int iD2 = d(str, notificationChannel.getId(), 16);
            if (iD2 == 1) {
                i |= 16;
            } else if (iD2 == 0) {
                i |= 32;
            }
        }
        return (notificationChannel.getSound() != null ? i | 64 : i | 128) | (notificationChannel.shouldVibrate() ? 256 : 512);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    public static int b(Context context, String str, String str2) {
        int i;
        if (context == null || TextUtils.isEmpty(str)) {
            x9s.o("Must greater than or equal android O and context|packageName not be null");
            return 0;
        }
        p8s p8sVarE = p8s.e(context, str);
        if (p8sVarE == null) {
            x9s.o("create NMHelper error");
            return 0;
        }
        NotificationChannel notificationChannelB = p8sVarE.b(p8sVarE.i(str2));
        if (notificationChannelB == null) {
            x9s.o("Channel must not be null");
            return 0;
        }
        int i2 = notificationChannelB.getImportance() != 0 ? 1 : 2;
        int iD = d(str, notificationChannelB.getId(), 8);
        if (iD == 1) {
            if (notificationChannelB.getImportance() >= 4) {
                i2 |= 4;
            } else {
                i2 |= 8;
            }
        } else if (iD == 0) {
            i2 |= 8;
        }
        int iD2 = d(str, notificationChannelB.getId(), 16);
        if (iD2 == 1) {
            i = i2 | 16;
        } else {
            if (iD2 != 0) {
                return i2;
            }
            i = i2 | 32;
        }
        return i;
    }

    public static int c(String str, String str2) {
        int i = p(str, str2, 8) ? 8 : 0;
        if (p(str, str2, 16)) {
            i |= 16;
        }
        if (p(str, str2, 1)) {
            i |= 1;
        }
        if (p(str, str2, 2)) {
            i |= 2;
        }
        return p(str, str2, 4) ? i | 4 : i;
    }

    public static int d(String str, String str2, int i) {
        return s8s.c(odt.b(), str, str2, f37251b.get(i));
    }

    public static SharedPreferences e(Context context) {
        return context.getSharedPreferences("ch_permission_cache_file", 0);
    }

    public static Bundle f(String str, String str2) {
        return s8s.d(odt.b(), str, str2);
    }

    public static void g(Context context, String str) {
        List<NotificationChannel> listL;
        if (!y0t.j(context) || TextUtils.isEmpty(str) || (listL = p8s.e(context, str).l()) == null) {
            return;
        }
        synchronized (vus.class) {
            try {
                SharedPreferences sharedPreferencesE = e(context);
                ArrayList arrayList = new ArrayList();
                Iterator<NotificationChannel> it = listL.iterator();
                while (it.hasNext()) {
                    String str2 = (String) zbs.d(it.next(), "mId");
                    if (!TextUtils.isEmpty(str2) && sharedPreferencesE.contains(str2)) {
                        arrayList.add(str2);
                    }
                }
                if (arrayList.size() > 0) {
                    l(sharedPreferencesE, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void h(Context context, String str, String str2, int i, String str3, boolean z, int i2) {
        if (!y0t.j(context) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            if (y0t.j(context)) {
                x9s.o("ChannelPC: can`t setup permission with permissionCode:" + String.valueOf(str3) + " channelId:" + String.valueOf(str2) + " targetPkg:" + str);
                return;
            }
            return;
        }
        int iA = det.a(str3, 0);
        boolean zO = o(i, iA);
        if (z) {
            m(str, str2, iA, i2);
            if (zO) {
                synchronized (vus.class) {
                    i(e(context), iA, str2);
                }
                return;
            }
            return;
        }
        synchronized (vus.class) {
            try {
                SharedPreferences sharedPreferencesE = e(context);
                if (zO || sharedPreferencesE.contains(str2)) {
                    j(sharedPreferencesE, iA, str, str2, i2);
                    if (zO) {
                        i(sharedPreferencesE, iA, str2);
                    } else {
                        k(sharedPreferencesE, str2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void i(SharedPreferences sharedPreferences, int i, String str) {
        sharedPreferences.edit().putInt(str, i).commit();
    }

    public static void j(SharedPreferences sharedPreferences, int i, String str, String str2, int i2) {
        if (sharedPreferences.getInt(str2, 0) != i) {
            m(str, str2, i, i2);
        }
    }

    public static void k(SharedPreferences sharedPreferences, String str) {
        l(sharedPreferences, new z0t(str));
    }

    public static void l(SharedPreferences sharedPreferences, List<String> list) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            editorEdit.remove(it.next());
        }
        editorEdit.commit();
    }

    public static void m(String str, String str2, int i, int i2) {
        for (int i3 : f37250a) {
            if ((c.get(i3).intValue() & i2) == 0) {
                n(str, str2, i3, (i & i3) > 0);
            } else {
                x9s.o("ChannelPermissions.grantPermission:" + str + ":" + str2 + ": <" + i3 + "> :stoped by userLock");
            }
        }
    }

    public static void n(String str, String str2, int i, boolean z) {
        x9s.o("ChannelPermissions.grantPermission:" + str + ":" + str2 + ": <" + i + "=" + z + "> :" + s8s.s(odt.b(), str, str2, f37251b.get(i), z));
    }

    public static boolean o(int i, int i2) {
        return i >= 4 || (i2 & 2) > 0 || (i2 & 1) > 0 || (i2 & 8) > 0 || (i2 & 16) > 0;
    }

    public static boolean p(String str, String str2, int i) {
        boolean z = s8s.c(odt.b(), str, str2, f37251b.get(i)) == 1;
        x9s.o("ChannelPermissions.checkPermission:" + str + ":" + str2 + ": <" + i + "=" + z + ">");
        return z;
    }
}
