package pc;

import androidx.core.view.j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import lc.x0;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpc/d;", "Landroidx/fragment/app/v$p;", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements v.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0 f137172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.navigation.fragment.a f137173b;

    public d(x0 x0Var, androidx.navigation.fragment.a aVar) {
        this.f137172a = x0Var;
        this.f137173b = aVar;
    }

    @Override // androidx.fragment.app.v.p
    public final void a(Fragment fragment, boolean z14) {
        Object objPrevious;
        fragment.getClass();
        if (z14) {
            x0 x0Var = this.f137172a;
            List list = (List) x0Var.f111900e.f150540a.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!s.g(((lc.v) objPrevious).f111886f, fragment.getTag()));
            lc.v vVar = (lc.v) objPrevious;
            int i14 = androidx.navigation.fragment.a.f10129j;
            this.f137173b.getClass();
            if (androidx.navigation.fragment.a.n()) {
                fragment.toString();
                Objects.toString(vVar);
            }
            if (vVar != null) {
                x0Var.f(vVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.v.p
    public final void b(Fragment fragment, boolean z14) {
        Object obj;
        Object objPrevious;
        fragment.getClass();
        x0 x0Var = this.f137172a;
        ArrayList arrayListC0 = h0.C0((Collection) x0Var.f111900e.f150540a.getValue(), (Iterable) x0Var.f111901f.f150540a.getValue());
        ListIterator listIterator = arrayListC0.listIterator(arrayListC0.size());
        do {
            obj = null;
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!s.g(((lc.v) objPrevious).f111886f, fragment.getTag()));
        lc.v vVar = (lc.v) objPrevious;
        androidx.navigation.fragment.a aVar = this.f137173b;
        boolean z15 = z14 && aVar.f10134g.isEmpty() && fragment.isRemoving();
        for (Object obj2 : aVar.f10134g) {
            if (s.g(((p) obj2).f128594a, fragment.getTag())) {
                obj = obj2;
                break;
            }
        }
        p pVar = (p) obj;
        if (pVar != null) {
            aVar.f10134g.remove(pVar);
        }
        if (!z15 && androidx.navigation.fragment.a.n()) {
            fragment.toString();
            Objects.toString(vVar);
        }
        boolean z16 = pVar != null && ((Boolean) pVar.f128595b).booleanValue();
        if (!z14 && !z16 && vVar == null) {
            h.x(j.j("The fragment ", fragment, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager."));
            return;
        }
        if (vVar != null) {
            aVar.l(fragment, vVar, x0Var);
            if (z15) {
                if (androidx.navigation.fragment.a.n()) {
                    fragment.toString();
                    vVar.toString();
                }
                x0Var.e(vVar, false);
            }
        }
    }

    @Override // androidx.fragment.app.v.p
    public final void onBackStackChanged() {
    }
}
