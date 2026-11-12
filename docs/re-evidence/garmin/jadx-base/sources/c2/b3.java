package c2;

import android.view.View;
import java.util.WeakHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc2/b3;", "Lc2/k1;", "Lh5/c0;", "Lkotlin/Function1;", "Lc2/m3;", "Lc2/k3;", "insetsGetter", "<init>", "(Le23/l;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b3 extends k1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e23.l<? super m3, ? extends k3> f22607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m3 f22608e;

    public b3(e23.l<? super m3, ? extends k3> lVar) {
        super(n3.f22788a);
        this.f22607d = lVar;
    }

    @Override // c2.h1, h4.r.c
    public final void onAttach() {
        View viewA = h5.l.a(this);
        m3.f22753w.getClass();
        m3 m3VarD = m3.a.d(viewA);
        m3VarD.a(viewA);
        k3 k3VarInvoke = this.f22607d.invoke(m3VarD);
        if (!p005kotlin.jvm.internal.s.g(k3VarInvoke, this.f22725c)) {
            this.f22725c = k3VarInvoke;
            V1();
        }
        this.f22608e = m3VarD;
        super.onAttach();
    }

    @Override // c2.h1, h4.r.c
    public final void onDetach() {
        View viewA = h5.l.a(this);
        m3 m3Var = this.f22608e;
        if (m3Var != null) {
            int i14 = m3Var.f22775u - 1;
            m3Var.f22775u = i14;
            if (i14 == 0) {
                WeakHashMap<View, androidx.core.view.g1> weakHashMap = androidx.core.view.s0.f6563a;
                androidx.core.view.s0.d.c(viewA, null);
                androidx.core.view.s0.t(viewA, null);
                viewA.removeOnAttachStateChangeListener(m3Var.f22776v);
            }
        }
        super.onDetach();
    }
}
