package kotlin;

import android.view.View;
import p3.s2;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li5/o4;", "Landroid/view/View$OnAttachStateChangeListener;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o4 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f91373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s2 f91374b;

    public o4(View view2, s2 s2Var) {
        this.f91373a = view2;
        this.f91374b = s2Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view2) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view2) {
        this.f91373a.removeOnAttachStateChangeListener(this);
        this.f91374b.A();
    }
}
