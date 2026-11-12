package xf;

import android.view.View;
import android.view.ViewTreeObserver;
import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxf/j;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f190625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k<View> f190626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f190627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o53.j<g> f190628d;

    /* JADX WARN: Multi-variable type inference failed */
    public j(k<View> kVar, ViewTreeObserver viewTreeObserver, o53.j<? super g> jVar) {
        this.f190626b = kVar;
        this.f190627c = viewTreeObserver;
        this.f190628d = jVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        k<View> kVar = this.f190626b;
        g size = kVar.getSize();
        if (size != null) {
            kVar.b(this.f190627c, this);
            if (!this.f190625a) {
                this.f190625a = true;
                int i14 = q.f128596b;
                this.f190628d.resumeWith(size);
            }
        }
        return true;
    }
}
