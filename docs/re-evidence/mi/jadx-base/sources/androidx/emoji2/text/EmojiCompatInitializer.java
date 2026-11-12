package androidx.emoji2.text;

import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.ekp;
import defpackage.gb4;
import defpackage.iad;
import defpackage.kg1;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements iad<Boolean> {

    @RequiresApi(19)
    public static class a extends androidx.emoji2.text.c.AbstractC0033c {
        public a(Context context) {
            super(new b(context));
            b(1);
        }
    }

    @RequiresApi(19)
    public static class b implements androidx.emoji2.text.c.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f2282a;

        public class a extends androidx.emoji2.text.c.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ androidx.emoji2.text.c.h f2283a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThreadPoolExecutor f2284b;

            public a(androidx.emoji2.text.c.h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f2283a = hVar;
                this.f2284b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.c.h
            public void a(Throwable th) {
                try {
                    this.f2283a.a(th);
                } finally {
                    this.f2284b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.c.h
            public void b(f fVar) {
                try {
                    this.f2283a.b(fVar);
                } finally {
                    this.f2284b.shutdown();
                }
            }
        }

        public b(Context context) {
            this.f2282a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.c.g
        public void a(final androidx.emoji2.text.c.h hVar) {
            final ThreadPoolExecutor threadPoolExecutorB = gb4.b("EmojiCompatInitializer");
            threadPoolExecutorB.execute(new Runnable() { // from class: t88
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34446a.d(hVar, threadPoolExecutorB);
                }
            });
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void d(androidx.emoji2.text.c.h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                e eVarA = androidx.emoji2.text.a.a(this.f2282a);
                if (eVarA == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                eVarA.c(threadPoolExecutor);
                eVarA.a().a(new a(hVar, threadPoolExecutor));
            } catch (Throwable th) {
                hVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                ekp.a("EmojiCompat.EmojiCompatInitializer.run");
                if (androidx.emoji2.text.c.h()) {
                    androidx.emoji2.text.c.b().k();
                }
            } finally {
                ekp.b();
            }
        }
    }

    @Override // defpackage.iad
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean create(Context context) {
        androidx.emoji2.text.c.g(new a(context));
        b(context);
        return Boolean.TRUE;
    }

    @RequiresApi(19)
    public void b(Context context) {
        final Lifecycle lifecycle = ((LifecycleOwner) kg1.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(LifecycleOwner lifecycleOwner) {
                EmojiCompatInitializer.this.c();
                lifecycle.removeObserver(this);
            }
        });
    }

    @RequiresApi(19)
    public void c() {
        gb4.d().postDelayed(new c(), 500L);
    }

    @Override // defpackage.iad
    public List<Class<? extends iad<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
