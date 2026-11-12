package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.util.Pair;
import com.huawei.openalliance.ad.constant.Action;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.gk;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public class am {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f20408a = false;

    private static void i(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(Action.ACTION_HW_ACCOUNT_LOGIN);
            intentFilter.addAction(Action.ACTION_HW_ACCOUNT_LOGOUT);
            hw.b("GroupIdUtils", "register hw account receiver");
            as.a(context, new com.huawei.openalliance.ad.inter.e(), intentFilter, "com.huawei.hms.permission.INNER_BROADCAST", (Handler) null);
        } catch (Throwable th) {
            hw.b("GroupIdUtils", "register hw account receiver ex: %s", th.getClass().getSimpleName());
        }
    }

    private static Pair<String, Integer> h(Context context) {
        String string = "";
        if (context == null) {
            return new Pair<>("", 1);
        }
        if (com.huawei.openalliance.ad.cc.a(context).d()) {
            return new Pair<>("", 12);
        }
        Uri uri = Uri.parse("content://com.huawei.hms.ads.brain.open/groupid/query");
        int i = 11;
        if (!as.b(context, uri)) {
            hw.b("GroupIdUtils", "target provider not exists");
            return new Pair<>("", 11);
        }
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                string = cursorQuery.getString(cursorQuery.getColumnIndex("group_id"));
                i = cursorQuery.getInt(cursorQuery.getColumnIndex("code"));
            }
        } catch (Throwable th) {
            try {
                hw.d("GroupIdUtils", "getGroupId ex: %s", th.getClass().getSimpleName());
            } finally {
                df.a(cursorQuery);
            }
        }
        return new Pair<>(string, Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(Context context) {
        Pair<String, Integer> pairH = h(context);
        hw.a("GroupIdUtils", "update groupId: %s", ds.a((String) pairH.first));
        hw.b("GroupIdUtils", "update grpIdStatusCode: %s", pairH.second);
        cn cnVarA = cn.a(context);
        cnVarA.b(((Integer) pairH.second).intValue());
        cnVarA.C((String) pairH.first);
    }

    private static boolean f(Context context) {
        gk gkVarB = fp.b(context);
        long jCA = gkVarB.cA();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - jCA < 43200000) {
            hw.a("GroupIdUtils", "update groupId too quick");
            return true;
        }
        gkVarB.m(jCurrentTimeMillis);
        return false;
    }

    private static void e(final Context context) {
        if (f(context)) {
            return;
        }
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.am.1
            @Override // java.lang.Runnable
            public void run() {
                am.g(context);
            }
        });
    }

    public static void c(final Context context) {
        if (f20408a) {
            Log.d("GroupIdUtils", "hasInit true");
            return;
        }
        Log.i("GroupIdUtils", "init");
        f20408a = true;
        if (f(context)) {
            Log.d("GroupIdUtils", "update groupId too quick");
        } else {
            o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.am.3
                @Override // java.lang.Runnable
                public void run() {
                    am.g(context);
                }
            });
        }
        i(context);
    }

    public static void b(final Context context) {
        bu.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.am.2
            @Override // java.lang.Runnable
            public void run() {
                o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.am.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        am.g(context);
                    }
                });
            }
        }, 1000L);
    }

    public static Pair<String, Integer> a(Context context) {
        e(context);
        cn cnVarA = cn.a(context);
        String strH = cnVarA.H();
        int iS = cnVarA.S();
        hw.a("GroupIdUtils", "get groupId: %s", ds.a(strH));
        hw.b("GroupIdUtils", "get grpIdStatusCode: %s", Integer.valueOf(iS));
        return new Pair<>(strH, Integer.valueOf(iS));
    }
}
