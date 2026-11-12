package jj;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes7.dex */
public class h implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f98912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f98913b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewTreeObserver.OnDrawListener f98914a;

        public a(ViewTreeObserver.OnDrawListener onDrawListener) {
            this.f98914a = onDrawListener;
        }

        @Override // java.lang.Runnable
        public final void run() {
            dj.t tVarA = dj.t.a();
            tVarA.getClass();
            qj.m.a();
            tVarA.f59873d.set(true);
            h.this.f98913b.f98917b = true;
            View view2 = h.this.f98912a;
            view2.getViewTreeObserver().removeOnDrawListener(this.f98914a);
            h.this.f98913b.f98916a.clear();
        }
    }

    public h(i iVar, View view2) {
        this.f98913b = iVar;
        this.f98912a = view2;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        qj.m.f().post(new a(this));
    }
}
