package defpackage;

import android.app.Notification;
import android.content.Context;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class rns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List<a> f32732a = new CopyOnWriteArrayList();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f32733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f32734b;
        public final int c;
        public final Notification.Action[] d;

        public a(String str, long j, int i, Notification.Action[] actionArr) {
            this.f32733a = str;
            this.f32734b = j;
            this.c = i;
            this.d = actionArr;
        }
    }

    public static void a() {
        for (int size = f32732a.size() - 1; size >= 0; size--) {
            a aVar = f32732a.get(size);
            if (SystemClock.elapsedRealtime() - aVar.f32734b > 5000) {
                f32732a.remove(aVar);
            }
        }
        if (f32732a.size() > 10) {
            f32732a.remove(0);
        }
    }

    public static void b(Context context, StatusBarNotification statusBarNotification, int i) {
        if (!y0t.j(context) || i <= 0 || statusBarNotification == null) {
            return;
        }
        c(new a(statusBarNotification.getKey(), SystemClock.elapsedRealtime(), i, s8s.u(statusBarNotification.getNotification())));
    }

    public static void c(a aVar) {
        f32732a.add(aVar);
        a();
    }
}
