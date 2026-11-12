package com.xiaomi.push.service;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes22.dex */
public class d {
    private static List<a> a = new CopyOnWriteArrayList();

    public static class a {
        public final String a;
        public final long b;
        public final int c;
        public final Notification.Action[] d;

        public a(String str, long j, int i, Notification.Action[] actionArr) {
            this.a = str;
            this.b = j;
            this.c = i;
            this.d = actionArr;
        }
    }

    private static void a() {
        for (int size = a.size() - 1; size >= 0; size--) {
            a aVar = a.get(size);
            if (SystemClock.elapsedRealtime() - aVar.b > 5000) {
                a.remove(aVar);
            }
        }
        if (a.size() > 10) {
            a.remove(0);
        }
    }

    public static void a(Context context, StatusBarNotification statusBarNotification, int i) {
        if (!com.xiaomi.channel.commonutils.android.f.m3427a(context) || i <= 0 || statusBarNotification == null || Build.VERSION.SDK_INT < 20) {
            return;
        }
        b(new a(statusBarNotification.getKey(), SystemClock.elapsedRealtime(), i, ar.m3823a(statusBarNotification.getNotification())));
    }

    private static void b(a aVar) {
        a.add(aVar);
        a();
    }
}
