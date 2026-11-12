package k4;

import android.view.DragEvent;
import android.view.View;
import e23.l;
import e23.q;
import h4.r;
import h5.d2;
import h5.x0;
import kotlin.m2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012*\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lk4/a;", "Landroid/view/View$OnDragListener;", "Lk4/d;", "Lkotlin/Function3;", "Lk4/k;", "Ln4/g;", "Lkotlin/Function1;", "Lq4/f;", "", "", "startDrag", "<init>", "(Le23/q;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements View.OnDragListener, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q<k, n4.g, l<? super q4.f, Unit>, Boolean> f102797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f102798b = new e(null, null, 3, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1.b<i> f102799c = new p1.b<>(0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1969a f102800d = new C1969a();

    /* JADX INFO: renamed from: k4.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"k4/a$a", "Lh5/x0;", "Lk4/e;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1969a extends x0<e> {
        public C1969a() {
        }

        @Override // h5.x0
        public final r.c create() {
            return a.this.f102798b;
        }

        @Override // h5.x0
        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // h5.x0
        public final int hashCode() {
            return a.this.f102798b.hashCode();
        }

        @Override // h5.x0
        public final void inspectableProperties(m2 m2Var) {
            m2Var.f91341a = "RootDragAndDropNode";
        }

        @Override // h5.x0
        public final /* bridge */ /* synthetic */ void update(r.c cVar) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(q<? super k, ? super n4.g, ? super l<? super q4.f, Unit>, Boolean> qVar) {
        this.f102797a = qVar;
    }

    @Override // k4.d
    public final boolean a(e eVar) {
        return this.f102799c.contains(eVar);
    }

    @Override // k4.d
    public final void b(e eVar) {
        this.f102799c.add(eVar);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view2, DragEvent dragEvent) {
        c cVar = new c(dragEvent);
        int action = dragEvent.getAction();
        p1.b<i> bVar = this.f102799c;
        e eVar = this.f102798b;
        switch (action) {
            case 1:
                eVar.getClass();
                m0 m0Var = new m0();
                f fVar = new f(cVar, eVar, m0Var);
                if (fVar.invoke(eVar) == d2.ContinueTraversal) {
                    gl1.d.k0(eVar, fVar);
                }
                boolean z14 = m0Var.f105804a;
                bVar.getClass();
                p1.b.a aVar = new p1.b.a();
                while (aVar.hasNext()) {
                    ((i) aVar.next()).j0(cVar);
                }
                return z14;
            case 2:
                eVar.K(cVar);
                return false;
            case 3:
                return eVar.G0(cVar);
            case 4:
                eVar.f1(cVar);
                bVar.clear();
                return false;
            case 5:
                eVar.F1(cVar);
                return false;
            case 6:
                eVar.E1(cVar);
                return false;
            default:
                return false;
        }
    }
}
