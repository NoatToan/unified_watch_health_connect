package j02;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.dashboard.PolylineView;
import com.garmin.android.apps.connectmobile.connections.groups.details.GroupActivityFeedTypeSubTypeSelectionFragment;
import com.garmin.android.apps.connectmobile.i2;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.registry.ScopeRegistry;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class r implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96124a;

    public /* synthetic */ r(int i14) {
        this.f96124a = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = 0;
        Object[] objArr = 0;
        switch (this.f96124a) {
            case 0:
                int i15 = s.f96125v;
                ((g) obj).getClass();
                return Boolean.TRUE;
            case 1:
                List list = (List) obj;
                ArrayList arrayListL = androidx.core.view.j.l(list);
                for (Object obj2 : list) {
                    if (((GroupActivityFeedTypeSubTypeSelectionFragment.b) obj2).f31404b) {
                        arrayListL.add(obj2);
                    }
                }
                ArrayList arrayList = new ArrayList(p13.y.r(arrayListL, 10));
                Iterator it = arrayListL.iterator();
                while (it.hasNext()) {
                    arrayList.add(((GroupActivityFeedTypeSubTypeSelectionFragment.b) it.next()).f31403a);
                }
                return arrayList;
            case 2:
                List list2 = (List) obj;
                int i16 = com.garmin.android.apps.connectmobile.connections.groups.details.a.f31464g;
                ArrayList arrayList2 = new ArrayList();
                list2.getClass();
                for (Object obj3 : list2) {
                    int i17 = i14 + 1;
                    if (i14 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a abstractC0510a = (com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a) obj3;
                    if (abstractC0510a instanceof com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.C0511a) {
                        if (i17 > list2.size() - 1) {
                            String str = "No subTypes for MainType: " + ((com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.C0511a) abstractC0510a).f31472b + ", it's data: " + abstractC0510a;
                            i2.a aVar = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar.getClass();
                            i2.a.f(a2Var, "GroupActivityFeedTypeViewModel", str);
                        } else {
                            arrayList2.add(abstractC0510a);
                            Object objE0 = p13.h0.e0(i17, list2);
                            com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b bVar = objE0 instanceof com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b ? (com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b) objE0 : null;
                            if (bVar != null && ((com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.C0511a) abstractC0510a).f31473c && bVar.f31475c.size() > 1) {
                                arrayList2.add(bVar);
                            }
                        }
                    }
                    i14 = i17;
                }
                return arrayList2;
            case 3:
                com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b bVar2 = (com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b) obj;
                int i18 = com.garmin.android.apps.connectmobile.connections.groups.details.a.f31464g;
                bVar2.getClass();
                return bVar2.f31476d;
            case 4:
                k23.l<Object>[] lVarArr = p5.h0.f136016a;
                p5.d0.f135959a.getClass();
                p5.j0<Unit> j0Var = p5.d0.f135964f;
                Unit unit = Unit.INSTANCE;
                ((p5.k0) obj).a(j0Var, unit);
                return unit;
            case 5:
                j21.a aVar2 = j21.a.f96635a;
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 6:
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 7:
                ((p5.k0) obj).getClass();
                return Unit.INSTANCE;
            case 8:
                ((b11.a) obj).getClass();
                return Unit.INSTANCE;
            case 9:
                o13.p pVar = (o13.p) obj;
                pVar.getClass();
                return (CharSequence) pVar.f128595b;
            case 10:
                o13.p pVar2 = (o13.p) obj;
                pVar2.getClass();
                return (CharSequence) pVar2.f128595b;
            case 11:
                oi0.b bVar3 = (oi0.b) obj;
                bVar3.getClass();
                bVar3.k();
                return Unit.INSTANCE;
            case 12:
                oi0.b bVar4 = (oi0.b) obj;
                bVar4.getClass();
                bVar4.w();
                return Unit.INSTANCE;
            case 13:
                oi0.b bVar5 = (oi0.b) obj;
                bVar5.getClass();
                bVar5.f132238b = d53.u.v(bVar5.f132238b, "≤", bVar5.f132237a.getString(R.string.lbl_less_or_equal), false);
                return Unit.INSTANCE;
            case 14:
                oi0.b bVar6 = (oi0.b) obj;
                bVar6.getClass();
                bVar6.f132238b = d53.u.v(bVar6.f132238b, "≥", bVar6.f132237a.getString(R.string.lbl_greater_or_equal), false);
                return Unit.INSTANCE;
            case 15:
                oi0.b bVar7 = (oi0.b) obj;
                bVar7.getClass();
                bVar7.p();
                return Unit.INSTANCE;
            case 16:
                o13.p pVar3 = (o13.p) obj;
                pVar3.getClass();
                return (CharSequence) pVar3.f128595b;
            case 17:
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 18:
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 19:
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 20:
                oi0.b bVar8 = (oi0.b) obj;
                int i19 = jc1.c.f98167e;
                bVar8.getClass();
                bVar8.p();
                bVar8.w();
                return Unit.INSTANCE;
            case 21:
                Module module = (Module) obj;
                jd0.q qVar = jd0.q.f98359a;
                module.getClass();
                new KoinDefinition(module, e5.n(new BeanDefinition(ScopeRegistry.INSTANCE.getRootScopeQualifier(), s0.f105811a.b(qn.b.class), null, new in2.e(objArr == true ? 1 : 0, 16), Kind.Factory, p13.j0.f134944a), module));
                return Unit.INSTANCE;
            case 22:
                Context context = (Context) obj;
                context.getClass();
                return new PolylineView(context, null, 0, 6, null);
            case 23:
                jf.d.c cVar = (jf.d.c) obj;
                jf.d.a aVar3 = jf.d.f98614r;
                return cVar;
            case 24:
                li0.d0 d0Var = (li0.d0) obj;
                d0Var.getClass();
                String str2 = d0Var.f112650c;
                return str2 == null ? Integer.valueOf(d0Var.hashCode()) : str2;
            case 25:
                oi0.b bVar9 = (oi0.b) obj;
                bVar9.getClass();
                if (d53.w.z(bVar9.f132238b, "Venu Sq", true)) {
                    bVar9.f132238b = d53.u.v(bVar9.f132238b, "Sq", "S Q", true);
                }
                if (d53.w.z(bVar9.f132238b, "vívosmart HR", true) || d53.w.z(bVar9.f132238b, "vivosmart HR", true) || d53.w.z(bVar9.f132238b, "vívoactive HR", true) || d53.w.z(bVar9.f132238b, "vivoactive HR", true) || d53.w.z(bVar9.f132238b, "vívomove HR", true) || d53.w.z(bVar9.f132238b, "vivomove HR", true)) {
                    bVar9.f132238b = d53.u.v(bVar9.f132238b, "HR", "H R", true);
                }
                if (d53.w.z(bVar9.f132238b, "Gen", true)) {
                    bVar9.f132238b = d53.u.v(bVar9.f132238b, "Gen", bVar9.f132237a.getString(R.string.lbl_generation), true);
                }
                return Unit.INSTANCE;
            case 26:
                ((il0.a) obj).getClass();
                return Unit.INSTANCE;
            case 27:
                String str3 = (String) obj;
                Logger logger = jl2.c.f99547l;
                str3.getClass();
                return Boolean.valueOf(wb2.r.f().i(str3));
            case 28:
                String str4 = (String) obj;
                Logger logger2 = jl2.c.f99547l;
                str4.getClass();
                return Boolean.valueOf(da2.d.b().f58886a.f111646e.d(str4) != null);
            default:
                ql2.a aVar4 = (ql2.a) obj;
                aVar4.getClass();
                return Boolean.valueOf(aVar4 instanceof ql2.a.C2739a);
        }
    }
}
