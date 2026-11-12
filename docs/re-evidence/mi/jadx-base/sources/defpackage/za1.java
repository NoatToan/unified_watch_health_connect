package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class za1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f41060a = new AtomicBoolean();

    public static void a(Application application) {
        b(application);
    }

    public static void b(Context context) {
        c(context, "org/threeten/bp/TZDB.dat");
    }

    public static void c(Context context, String str) {
        if (f41060a.getAndSet(true)) {
            return;
        }
        j1s.c(new yk1(context, str));
    }
}
