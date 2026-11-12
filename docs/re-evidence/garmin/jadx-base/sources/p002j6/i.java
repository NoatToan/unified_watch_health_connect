package p002j6;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import e23.l;
import h4.r;
import h5.k;
import h5.o1;
import m4.a0;
import m4.g;
import m4.h;
import m4.j0;
import m4.k0;
import m4.m;
import m4.u;
import m4.y;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import q3.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj6/i;", "Lh4/r$c;", "Lm4/a0;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i extends r.c implements a0, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f97235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f97236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f97237c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f97238d = new b();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm4/h;", "", "invoke", "(Lm4/h;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends w implements l<h, Unit> {
        public a() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(h hVar) {
            h hVar2 = hVar;
            i iVar = i.this;
            View viewC = g.c(iVar);
            if (!viewC.isFocused() && !viewC.hasFocus()) {
                if (!m.b(viewC, m.c(hVar2.getF116449a()), g.b(k.h(iVar).getFocusOwner(), h5.l.a(iVar), viewC))) {
                    hVar2.a();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm4/h;", "", "invoke", "(Lm4/h;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends w implements l<h, Unit> {
        public b() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(h hVar) {
            h hVar2 = hVar;
            i iVar = i.this;
            View viewC = g.c(iVar);
            if (!h4.i.f81559a && viewC.hasFocus()) {
                u focusOwner = k.h(iVar).getFocusOwner();
                View viewA = h5.l.a(iVar);
                if (viewC instanceof ViewGroup) {
                    Rect rectB = g.b(focusOwner, viewA, viewC);
                    Integer numC = m.c(hVar2.getF116449a());
                    int iIntValue = numC != null ? numC.intValue() : 130;
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View view2 = iVar.f97235a;
                    View viewFindNextFocus = view2 != null ? focusFinder.findNextFocus((ViewGroup) viewA, view2, iIntValue) : focusFinder.findNextFocusFromRect((ViewGroup) viewA, rectB, iIntValue);
                    if (viewFindNextFocus != null && g.a(viewC, viewFindNextFocus)) {
                        viewFindNextFocus.requestFocus(iIntValue, rectB);
                        hVar2.a();
                    } else if (!viewA.requestFocus()) {
                        vb.h.z("host view did not take focus");
                        return null;
                    }
                } else if (!viewA.requestFocus()) {
                    vb.h.z("host view did not take focus");
                    return null;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // m4.a0
    public final void P1(y yVar) {
        yVar.b(false);
        yVar.d(this.f97237c);
        yVar.c(this.f97238d);
    }

    public final j0 U1() {
        boolean z14;
        if (!getNode().getIsAttached()) {
            e5.a.b("visitLocalDescendants called on an unattached node");
        }
        r.c node = getNode();
        if ((node.getAggregateChildKindSet() & 1024) != 0) {
            boolean z15 = false;
            for (r.c child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & 1024) != 0) {
                    r.c cVarB = child;
                    c cVar = null;
                    while (cVarB != null) {
                        if (cVarB instanceof j0) {
                            j0 j0Var = (j0) cVarB;
                            if (z15) {
                                return j0Var;
                            }
                            z14 = false;
                            z15 = true;
                        } else {
                            z14 = true;
                        }
                        if (z14 && (cVarB.getKindSet() & 1024) != 0 && (cVarB instanceof h5.m)) {
                            int i14 = 0;
                            for (r.c child2 = ((h5.m) cVarB).f81888b; child2 != null; child2 = child2.getChild()) {
                                if ((child2.getKindSet() & 1024) != 0) {
                                    i14++;
                                    if (i14 == 1) {
                                        cVarB = child2;
                                    } else {
                                        if (cVar == null) {
                                            cVar = new c(new r.c[16], 0);
                                        }
                                        if (cVarB != null) {
                                            cVar.b(cVarB);
                                            cVarB = null;
                                        }
                                        cVar.b(child2);
                                    }
                                }
                            }
                            if (i14 == 1) {
                            }
                        }
                        cVarB = k.b(cVar);
                    }
                }
            }
        }
        vb.h.z("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // h4.r.c
    public final void onAttach() {
        super.onAttach();
        ViewTreeObserver viewTreeObserver = h5.l.a(this).getViewTreeObserver();
        this.f97236b = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // h4.r.c
    public final void onDetach() {
        ViewTreeObserver viewTreeObserver = this.f97236b;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f97236b = null;
        h5.l.a(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.f97235a = null;
        super.onDetach();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view2, View view3) {
        if (k.g(this).f81774n == null) {
            return;
        }
        View viewC = g.c(this);
        u focusOwner = k.h(this).getFocusOwner();
        o1 o1VarH = k.h(this);
        boolean z14 = (view2 == null || view2.equals(o1VarH) || !g.a(viewC, view2)) ? false : true;
        boolean z15 = (view3 == null || view3.equals(o1VarH) || !g.a(viewC, view3)) ? false : true;
        if (z14 && z15) {
            this.f97235a = view3;
            return;
        }
        if (z15) {
            this.f97235a = view3;
            j0 j0VarU1 = U1();
            if (j0VarU1.a0().b()) {
                return;
            }
            k0.e(j0VarU1);
            return;
        }
        if (!z14) {
            this.f97235a = null;
            return;
        }
        this.f97235a = null;
        if (U1().a0().a()) {
            g.f116466b.getClass();
            focusOwner.o(g.f116474j, false, false);
        }
    }
}
