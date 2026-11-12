package qt1;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.PolyUtil;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.GarminTrailsViewModel$selectTrailsRunningThroughPoint$1", f = "GarminTrailsViewModel.kt", l = {365}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f147636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f147637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ke2.b f147638c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, ke2.b bVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f147637b = aVar;
        this.f147638c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f147637b, this.f147638c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f147636a;
        a aVar2 = this.f147637b;
        if (i14 == 0) {
            o13.r.b(obj);
            b2 b2Var = aVar2.f147511z;
            b2 b2Var2 = aVar2.f147511z;
            aVar2.D4(((pt1.c) b2Var.f150540a.getValue()).f140819d.f140827c);
            le2.a aVar3 = ((pt1.c) b2Var2.f150540a.getValue()).f140819d.f140827c;
            i53.c<le2.d> cVar = ((pt1.c) b2Var2.f150540a.getValue()).f140819d.f140831g;
            double dMin = Math.min(400.0d, ((double) com.garmin.android.library.mapsdkadapter.n.a(ke2.c.c(aVar3.f112052a), ke2.c.c(aVar3.f112053b))) * 0.05d);
            LatLng latLngC = ke2.c.c(this.f147638c);
            ArrayList arrayList = new ArrayList();
            for (le2.d dVar : cVar) {
                i53.c<ke2.b> cVar2 = dVar.f112063b;
                ArrayList arrayList2 = new ArrayList(p13.y.r(cVar2, 10));
                Iterator<ke2.b> it = cVar2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(ke2.c.c(it.next()));
                }
                if (PolyUtil.isLocationOnPath(latLngC, arrayList2, true, dMin) || (PolyUtil.isClosedPolygon(arrayList2) && PolyUtil.containsLocation(latLngC, arrayList2, true))) {
                    arrayList.add(dVar);
                }
            }
            if (arrayList.isEmpty()) {
                aVar2.C4();
            } else {
                aVar2.G4(true);
                this.f147636a = 1;
                if (a.y4(aVar2, arrayList, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        int i15 = a.I;
        aVar2.G4(false);
        return Unit.INSTANCE;
    }
}
