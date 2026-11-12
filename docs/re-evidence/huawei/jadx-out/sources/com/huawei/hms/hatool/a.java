package com.huawei.hms.hatool;

import android.content.Context;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static z0 f13396a;

    public static void c() {
        if (a() == null || !q1.b().a()) {
            return;
        }
        f13396a.a(-1);
    }

    public static boolean b() {
        return q.c().a();
    }

    public static void b(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a() == null || !q1.b().a()) {
            return;
        }
        if (i == 1 || i == 0) {
            f13396a.b(i, str, linkedHashMap);
            return;
        }
        v.d("hmsSdk", "Data type no longer collects range.type: " + i);
    }

    @Deprecated
    public static void a(Context context, String str, String str2) {
        if (a() != null) {
            f13396a.a(context, str, str2);
        }
    }

    public static void a(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a() == null || !q1.b().a()) {
            return;
        }
        if (i == 1 || i == 0) {
            f13396a.a(i, str, linkedHashMap);
            return;
        }
        v.d("hmsSdk", "Data type no longer collects range.type: " + i);
    }

    private static z0 a() {
        z0 z0Var;
        synchronized (a.class) {
            if (f13396a == null) {
                f13396a = q.c().b();
            }
            z0Var = f13396a;
        }
        return z0Var;
    }
}
