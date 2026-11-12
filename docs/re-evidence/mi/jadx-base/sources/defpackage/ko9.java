package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.RequiresApi;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(26)
public final class ko9 implements koa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<Activity> f24040a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f24041b;

    public class a implements ViewTreeObserver.OnDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f24042a;

        /* JADX INFO: renamed from: ko9$a$a, reason: collision with other inner class name */
        public class RunnableC0993a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnDrawListener f24044a;

            public RunnableC0993a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f24044a = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                flb.b().h();
                ko9.this.f24041b = true;
                ko9.b(a.this.f24042a, this.f24044a);
                ko9.this.f24040a.clear();
            }
        }

        public a(View view) {
            this.f24042a = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            ulq.v(new RunnableC0993a(this));
        }
    }

    public static void b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // defpackage.koa
    public void a(Activity activity) {
        if (!this.f24041b && this.f24040a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}
