package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class c {
    private static c c = null;
    private static final String d = "fire-global";
    private static final String e = "FirebaseAppHeartBeat";
    private static final String f = "fire-count";
    private static final int g = 200;
    private static final SimpleDateFormat h = new SimpleDateFormat("dd/MM/yyyy z");
    private static final String i = "FirebaseAppHeartBeatStorage";
    private final SharedPreferences a;
    private final SharedPreferences b;

    private c(Context context) {
        this.a = context.getSharedPreferences(e, 0);
        this.b = context.getSharedPreferences(i, 0);
    }

    private synchronized void a() {
        long j = this.a.getLong(f, 0L);
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, ?>> it2 = this.b.getAll().entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(Long.parseLong(it2.next().getKey())));
        }
        Collections.sort(arrayList);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            this.b.edit().remove(String.valueOf((Long) it3.next())).apply();
            j--;
            this.a.edit().putLong(f, j).apply();
            if (j <= 100) {
                return;
            }
        }
    }

    public static synchronized c d(Context context) {
        if (c == null) {
            c = new c(context);
        }
        return c;
    }

    public static boolean g(long j, long j2) {
        Date date = new Date(j);
        Date date2 = new Date(j2);
        SimpleDateFormat simpleDateFormat = h;
        return !simpleDateFormat.format(date).equals(simpleDateFormat.format(date2));
    }

    public synchronized void b() {
        this.b.edit().clear().apply();
        this.a.edit().remove(f).apply();
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    @VisibleForTesting
    public int c() {
        return (int) this.a.getLong(f, 0L);
    }

    public synchronized long e() {
        return this.a.getLong(d, -1L);
    }

    public synchronized List<SdkHeartBeatResult> f(boolean z) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.b.getAll().entrySet()) {
            arrayList.add(SdkHeartBeatResult.create((String) entry.getValue(), Long.parseLong(entry.getKey())));
        }
        Collections.sort(arrayList);
        if (z) {
            b();
        }
        return arrayList;
    }

    public synchronized boolean h(long j) {
        return i(d, j);
    }

    public synchronized boolean i(String str, long j) {
        if (!this.a.contains(str)) {
            this.a.edit().putLong(str, j).apply();
            return true;
        }
        if (!g(this.a.getLong(str, -1L), j)) {
            return false;
        }
        this.a.edit().putLong(str, j).apply();
        return true;
    }

    public synchronized void j(String str, long j) {
        long j2 = this.a.getLong(f, 0L);
        this.b.edit().putString(String.valueOf(j), str).apply();
        long j3 = j2 + 1;
        this.a.edit().putLong(f, j3).apply();
        if (j3 > 200) {
            a();
        }
    }

    public synchronized void k(long j) {
        this.a.edit().putLong(d, j).apply();
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    @VisibleForTesting
    public c(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        this.a = sharedPreferences;
        this.b = sharedPreferences2;
    }
}
