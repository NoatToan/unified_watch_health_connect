package wf;

import android.view.View;
import o53.c2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwf/t;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f185020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f185021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c2 f185022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f185023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f185024e;

    public t(View view2) {
        this.f185020a = view2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view2) {
        r rVar = this.f185023d;
        if (rVar == null) {
            return;
        }
        this.f185024e = true;
        rVar.f185015a.c(rVar.f185016b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view2) {
        r rVar = this.f185023d;
        if (rVar != null) {
            rVar.c();
        }
    }
}
