package kotlin;

import android.view.View;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.R;
import f4.f;
import h5.f2;
import o53.c0;
import p13.h0;
import p3.p;
import p3.r;
import p3.s;
import q53.b;
import q53.l;
import t13.g;
import z3.e;

/* JADX INFO: loaded from: classes.dex */
public final class z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f91670a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x008b  */
    /* JADX WARN: Code duplicated, block: B:29:0x009e  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a3  */
    public static final w4 a(a aVar, s1 s1Var, e eVar) {
        m mVar;
        w4 w4Var;
        d2.f91132a.getClass();
        if (d2.f91133b.compareAndSet(false, true)) {
            b bVarA = l.a(1, 6, null);
            r0.f91409k.getClass();
            ge1.b.T(c0.a((g) r0.f91410l.getValue()), null, null, new b2(bVarA, null), 3);
            f.a aVar2 = f.f68735e;
            c2 c2Var = new c2(bVarA);
            aVar2.getClass();
            synchronized (f4.l.f68775c) {
                f4.l.f68781i = h0.D0(f4.l.f68781i, c2Var);
                p005kotlin.Unit unit = p005kotlin.Unit.INSTANCE;
            }
            f4.l.d(f4.l.f68773a);
        }
        if (aVar.getChildCount() > 0) {
            View childAt = aVar.getChildAt(0);
            mVar = childAt instanceof m ? (m) childAt : null;
            if (mVar != null) {
                mVar.setComposeViewContext(s1Var);
            }
            if (mVar == null) {
                mVar = new m(aVar.getContext(), s1Var);
                aVar.addView(mVar.getView(), f91670a);
            }
            mVar.setComposeViewContext(s1Var);
            if (aVar.getComposeViewContext() != null) {
                s1Var.c();
                mVar.setComposeViewContextIncrementedDuringInit$ui(true);
            }
            k2.a aVar3 = k2.f91249a;
            Object tag = mVar.getTag(R.id.wrapped_composition_tag);
            w4Var = tag instanceof w4 ? (w4) tag : null;
            if (w4Var == null) {
                f2 f2Var = new f2(mVar.getRoot());
                p pVar = s1Var.f91444b;
                Object obj = s.f135268a;
                w4Var = new w4(mVar, new r(pVar, f2Var));
                mVar.setTag(R.id.wrapped_composition_tag, w4Var);
            }
            w4Var.r(eVar);
            mVar.setFrameEndScheduler$ui(new y4(s1Var.f91444b));
            return w4Var;
        }
        aVar.removeAllViews();
        mVar = null;
        if (mVar == null) {
            mVar = new m(aVar.getContext(), s1Var);
            aVar.addView(mVar.getView(), f91670a);
        }
        mVar.setComposeViewContext(s1Var);
        if (aVar.getComposeViewContext() != null) {
            s1Var.c();
            mVar.setComposeViewContextIncrementedDuringInit$ui(true);
        }
        k2.a aVar4 = k2.f91249a;
        Object tag2 = mVar.getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof w4) {
        }
        if (w4Var == null) {
            f2 f2Var2 = new f2(mVar.getRoot());
            p pVar2 = s1Var.f91444b;
            Object obj2 = s.f135268a;
            w4Var = new w4(mVar, new r(pVar2, f2Var2));
            mVar.setTag(R.id.wrapped_composition_tag, w4Var);
        }
        w4Var.r(eVar);
        mVar.setFrameEndScheduler$ui(new y4(s1Var.f91444b));
        return w4Var;
    }
}
