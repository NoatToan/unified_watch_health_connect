package androidx.emoji2.text;

import android.content.Context;
import android.os.Trace;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import h7.j;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements zd.b<Boolean> {

    public static class a extends d.c {
        public a(Context context) {
            super(new b(context));
            this.f7045b = 1;
        }
    }

    public static class b implements d.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f7025a;

        public b(Context context) {
            this.f7025a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.d.h
        public final void a(d.i iVar) {
            a8.a aVar = new a8.a("EmojiCompatInitializer", 0);
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), aVar);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new a8.d(this, 0, iVar, threadPoolExecutor));
        }
    }

    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                int i14 = j.f82330a;
                Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (d.e()) {
                    d.a().f();
                }
            } finally {
                int i15 = j.f82330a;
                Trace.endSection();
            }
        }
    }

    @Override // zd.b
    public final Boolean create(Context context) {
        d.d(new a(context));
        b0 lifecycle = ((n0) zd.a.c(context).d(ProcessLifecycleInitializer.class)).getF158017a();
        lifecycle.a(new a8.c(this, lifecycle));
        return Boolean.TRUE;
    }

    @Override // zd.b
    public final List<Class<? extends zd.b<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
