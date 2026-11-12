package rw0;

import android.view.View;
import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw0/e;", "Landroid/view/View$OnAttachStateChangeListener;", "gcm-map_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0 f154826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f154827b;

    public e(j jVar) {
        this.f154827b = jVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view2) {
        view2.getClass();
        n0 n0VarR = xy2.b.r(view2);
        n0VarR.getClass();
        b0 f158016a = n0VarR.getF158016a();
        f158016a.a(this.f154827b);
        this.f154826a = f158016a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view2) {
        view2.getClass();
        b0 b0Var = this.f154826a;
        j jVar = this.f154827b;
        if (b0Var != null) {
            b0Var.d(jVar);
        }
        this.f154826a = null;
        b0.b bVar = jVar.f154840b;
        b0.b bVar2 = b0.b.CREATED;
        if (bVar.compareTo(bVar2) > 0) {
            jVar.b(bVar2);
        }
    }
}
