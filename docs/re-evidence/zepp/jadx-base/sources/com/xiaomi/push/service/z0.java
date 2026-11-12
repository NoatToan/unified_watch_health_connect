package com.xiaomi.push.service;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes22.dex */
class z0 {
    private static final int[] a = {1, 2, 4, 8, 16};
    private static final SparseArray<ar.a<String, String, String>> b = new a1(5);
    private static final SparseArray<Integer> c = new b1(5);

    public static int a(String str, String str2) {
        int i = l(str, str2, 8) ? 8 : 0;
        if (l(str, str2, 16)) {
            i |= 16;
        }
        if (l(str, str2, 1)) {
            i |= 1;
        }
        if (l(str, str2, 2)) {
            i |= 2;
        }
        return l(str, str2, 4) ? i | 4 : i;
    }

    private static SharedPreferences b(Context context) {
        return context.getSharedPreferences("ch_permission_cache_file", 0);
    }

    public static void c(Context context, String str) {
        List<NotificationChannel> listG;
        if (!com.xiaomi.channel.commonutils.android.f.m3427a(context) || TextUtils.isEmpty(str) || (listG = aq.a(context, str).g()) == null) {
            return;
        }
        synchronized (z0.class) {
            SharedPreferences sharedPreferencesB = b(context);
            ArrayList arrayList = new ArrayList();
            Iterator<NotificationChannel> it2 = listG.iterator();
            while (it2.hasNext()) {
                String str2 = (String) com.xiaomi.push.z.a(it2.next(), "mId");
                if (!TextUtils.isEmpty(str2) && sharedPreferencesB.contains(str2)) {
                    arrayList.add(str2);
                }
            }
            if (arrayList.size() > 0) {
                h(sharedPreferencesB, arrayList);
            }
        }
    }

    public static void d(Context context, String str, String str2, int i, String str3, boolean z, int i2) {
        if (!com.xiaomi.channel.commonutils.android.f.m3427a(context) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            if (com.xiaomi.channel.commonutils.android.f.m3427a(context)) {
                com.xiaomi.channel.commonutils.logger.b.m3434a("ChannelPC: can`t setup permission with permissionCode:" + String.valueOf(str3) + " channelId:" + String.valueOf(str2) + " targetPkg:" + str);
                return;
            }
            return;
        }
        int iA = com.xiaomi.channel.commonutils.android.l.a(str3, 0);
        boolean zK = k(i, iA);
        if (z) {
            i(str, str2, iA, i2);
            if (zK) {
                synchronized (z0.class) {
                    e(b(context), iA, str2);
                }
                return;
            }
            return;
        }
        synchronized (z0.class) {
            SharedPreferences sharedPreferencesB = b(context);
            if (zK || sharedPreferencesB.contains(str2)) {
                f(sharedPreferencesB, iA, str, str2, i2);
                if (zK) {
                    e(sharedPreferencesB, iA, str2);
                } else {
                    g(sharedPreferencesB, str2);
                }
            }
        }
    }

    private static void e(SharedPreferences sharedPreferences, int i, String str) {
        sharedPreferences.edit().putInt(str, i).commit();
    }

    private static void f(SharedPreferences sharedPreferences, int i, String str, String str2, int i2) {
        if (sharedPreferences.getInt(str2, 0) != i) {
            i(str, str2, i, i2);
        }
    }

    private static void g(SharedPreferences sharedPreferences, String str) {
        h(sharedPreferences, new c1(str));
    }

    private static void h(SharedPreferences sharedPreferences, List<String> list) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            editorEdit.remove(it2.next());
        }
        editorEdit.commit();
    }

    public static void i(String str, String str2, int i, int i2) {
        for (int i3 : a) {
            if ((c.get(i3).intValue() & i2) == 0) {
                j(str, str2, i3, (i & i3) > 0);
            } else {
                com.xiaomi.channel.commonutils.logger.b.m3434a("ChannelPermissions.grantPermission:" + str + ":" + str2 + ": <" + i3 + "> :stoped by userLock");
            }
        }
    }

    private static void j(String str, String str2, int i, boolean z) {
        com.xiaomi.channel.commonutils.logger.b.m3434a("ChannelPermissions.grantPermission:" + str + ":" + str2 + ": <" + i + SearchCriteria.EQ + z + "> :" + ar.a(com.xiaomi.channel.commonutils.android.k.m3431a(), str, str2, b.get(i), z));
    }

    private static boolean k(int i, int i2) {
        return i >= 4 || (i2 & 2) > 0 || (i2 & 1) > 0 || (i2 & 8) > 0 || (i2 & 16) > 0;
    }

    private static boolean l(String str, String str2, int i) {
        boolean z = ar.a(com.xiaomi.channel.commonutils.android.k.m3431a(), str, str2, b.get(i)) == 1;
        com.xiaomi.channel.commonutils.logger.b.m3434a("ChannelPermissions.checkPermission:" + str + ":" + str2 + ": <" + i + SearchCriteria.EQ + z + SearchCriteria.GT);
        return z;
    }
}
