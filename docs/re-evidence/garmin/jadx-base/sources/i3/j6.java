package i3;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class j6 {

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"i3/j6$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f88522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f88523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f88524c;

        public a(View view2, e23.a<Unit> aVar) {
            this.f88523b = view2;
            this.f88524c = aVar;
            view2.addOnAttachStateChangeListener(this);
            if (this.f88522a || !view2.isAttachedToWindow()) {
                return;
            }
            view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f88522a = true;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            this.f88524c.invoke();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view2) {
            if (this.f88522a) {
                return;
            }
            View view3 = this.f88523b;
            if (view3.isAttachedToWindow()) {
                view3.getViewTreeObserver().addOnGlobalLayoutListener(this);
                this.f88522a = true;
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view2) {
            if (this.f88522a) {
                this.f88523b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.f88522a = false;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"i3/j6$b", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements p3.h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f88525a;

        public b(a aVar) {
            this.f88525a = aVar;
        }

        @Override // p3.h0
        public final void dispose() {
            a aVar = this.f88525a;
            boolean z14 = aVar.f88522a;
            View view2 = aVar.f88523b;
            if (z14) {
                view2.getViewTreeObserver().removeOnGlobalLayoutListener(aVar);
                aVar.f88522a = false;
            }
            view2.removeOnAttachStateChangeListener(aVar);
        }
    }

    public static final void a(e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-1646555525);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            b((View) o0VarE.A(AndroidCompositionLocals_androidKt.f6046f), (g6.c) o0VarE.A(kotlin.t1.f91490h), aVar, o0VarE, (i15 << 6) & 896);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.c(aVar, i14, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    public static final void b(View view2, g6.c cVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-1319522472);
        int i16 = 2;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(view2) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(cVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            boolean zR = o0VarE.r(view2) | ((i15 & 896) == 256);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new hy.h(i16, view2, aVar);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new hy.h(i16, view2, aVar);
                    o0VarE.K(objQ);
                }
            }
            p3.l0.b(view2, cVar, (e23.l) objQ, o0VarE);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h82.p(view2, cVar, aVar, i14, 8);
        }
    }
}
