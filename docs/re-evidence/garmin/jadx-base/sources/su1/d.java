package su1;

import am.x0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.google.android.gms.maps.model.LatLng;
import e23.p;
import h4.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr.q;
import jr.s;
import p005kotlin.Unit;
import p13.x;
import p13.y;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import ps.c1;
import yz1.u;

/* JADX INFO: loaded from: classes10.dex */
public final class d {
    public static final void a(final int i14, final ActivityListItemDTO activityListItemDTO, final e23.a aVar, final r rVar, m mVar, final boolean z14) {
        p2 p2VarI0;
        p<? super m, ? super Integer, Unit> pVar;
        ArrayList arrayList;
        Object next;
        List<Double> list;
        activityListItemDTO.getClass();
        o0 o0VarE = mVar.E(1328793069);
        int i15 = (o0VarE.r(activityListItemDTO) ? 32 : 16) | i14;
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            kr.a aVar2 = new kr.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            x0 x0Var = activityListItemDTO.f29265g;
            x0Var.getClass();
            List<q> listA = aVar2.a(x0Var).a();
            if (listA != null) {
                Iterator<T> it = listA.iterator();
                do {
                    arrayList = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((q) next).d() != s.Home);
                q qVar = (q) next;
                if (qVar != null) {
                    ps.m mVar2 = activityListItemDTO.f29300x;
                    c1 c1VarC = mVar2 != null ? wg0.e.c(mVar2) : null;
                    if (c1VarC != null && (list = c1VarC.f139764a) != null) {
                        List<Double> list2 = c1VarC.f139765b;
                        Iterator<T> it3 = list.iterator();
                        Iterator<T> it4 = list2.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(y.r(list, 10), y.r(list2, 10)));
                        while (it3.hasNext() && it4.hasNext()) {
                            arrayList2.add(new LatLng(((Number) it3.next()).doubleValue(), ((Number) it4.next()).doubleValue()));
                        }
                        arrayList = arrayList2;
                    }
                    new gp.b(new hp.a(new yz1.d(u.SUCCESS, null, false, 6, null), new in.a(activityListItemDTO, x.l(arrayList), false), qVar), false, z14, aVar).a(x2.f(rVar, 1.0f), new c(), o0VarE, 512);
                    x1 x1Var2 = n.f135158a;
                }
                p2VarI0.f135219d = pVar;
            }
            x1 x1Var3 = n.f135158a;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                final int i16 = 0;
                pVar = new p() { // from class: su1.b
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i16) {
                            case 0:
                                ((Integer) obj2).getClass();
                                d.a(p0.t(i14 | 1), activityListItemDTO, aVar, rVar, (m) obj, z14);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                d.a(p0.t(i14 | 1), activityListItemDTO, aVar, rVar, (m) obj, z14);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                p2VarI0.f135219d = pVar;
            }
            return;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i17 = 1;
            pVar = new p() { // from class: su1.b
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (i17) {
                        case 0:
                            ((Integer) obj2).getClass();
                            d.a(p0.t(i14 | 1), activityListItemDTO, aVar, rVar, (m) obj, z14);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            d.a(p0.t(i14 | 1), activityListItemDTO, aVar, rVar, (m) obj, z14);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
