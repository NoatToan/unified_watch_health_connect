package kotlin;

import android.view.View;
import o53.l1;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li5/l4;", "Landroid/view/View$OnAttachStateChangeListener;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l4 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l1 f91261a;

    public l4(l1 l1Var) {
        this.f91261a = l1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view2) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view2) {
        view2.removeOnAttachStateChangeListener(this);
        this.f91261a.c(null);
    }
}
