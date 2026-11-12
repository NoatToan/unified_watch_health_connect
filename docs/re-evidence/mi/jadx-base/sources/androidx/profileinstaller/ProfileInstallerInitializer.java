package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.RequiresApi;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.profileinstaller.c;
import defpackage.iad;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements iad<c> {

    @RequiresApi(16)
    public static class a {
        public static void c(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: wbi
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    runnable.run();
                }
            });
        }
    }

    @RequiresApi(28)
    public static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class c {
    }

    public static void j(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: vbi
            @Override // java.lang.Runnable
            public final void run() {
                c.i(context);
            }
        });
    }

    @Override // defpackage.iad
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public c create(Context context) {
        e(context.getApplicationContext());
        return new c();
    }

    @Override // defpackage.iad
    public List<Class<? extends iad<?>>> dependencies() {
        return Collections.emptyList();
    }

    @RequiresApi(16)
    public void e(final Context context) {
        a.c(new Runnable() { // from class: tbi
            @Override // java.lang.Runnable
            public final void run() {
                this.f34539a.g(context);
            }
        });
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void g(final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: ubi
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.j(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}
