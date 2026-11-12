package kotlin;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import e5.a;
import ge1.b;
import gl1.d;
import o53.e1;
import p1.g1;
import p1.t0;
import p3.p;
import p3.s2;
import p53.e;
import r53.o2;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public final class s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t0<Context, o2<Float>> f91480a = g1.b();

    public static final p a(View view2) {
        Object tag = view2.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof p) {
            return (p) tag;
        }
        return null;
    }

    public static final s2 b(View view2) {
        if (!view2.isAttachedToWindow()) {
            a.b("Cannot locate windowRecomposer; View " + view2 + " is not attached to a window");
        }
        Object objA = d.A(view2);
        while (objA instanceof View) {
            View view3 = (View) objA;
            if (view3.getId() == 16908290) {
                break;
            }
            objA = view3.getParent();
            view2 = view3;
        }
        p pVarA = a(view2);
        if (pVarA != null) {
            if (pVarA instanceof s2) {
                return (s2) pVarA;
            }
            h.z("root viewTreeParentCompositionContext is not a Recomposer");
            return null;
        }
        n4.f91357a.getClass();
        s2 s2VarA = n4.f91358b.get().a(view2);
        view2.setTag(R.id.androidx_compose_ui_view_composition_context, s2VarA);
        e1 e1Var = e1.f129333a;
        Handler handler = view2.getHandler();
        int i14 = e.f136190a;
        view2.addOnAttachStateChangeListener(new l4(b.T(e1Var, new p53.b(handler, "windowRecomposer cleanup").f136188d, null, new m4(s2VarA, view2, null), 2)));
        return s2VarA;
    }
}
