package ly0;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.PolyUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.maps.MapFullscreenViewModel$setMapProxy$2$1", f = "MapFullscreenViewModel.kt", l = {234}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f115336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mapsdkadapter.f f115337c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, com.garmin.android.library.mapsdkadapter.f fVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f115336b = oVar;
        this.f115337c = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f115336b, this.f115337c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objB4;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115335a;
        if (i14 == 0) {
            o13.r.b(obj);
            LatLng latLng = this.f115337c.f50283a;
            this.f115335a = 1;
            o oVar = this.f115336b;
            le2.a aVar2 = oVar.T;
            oVar.X = aVar2;
            double dMin = Math.min(400.0d, ((double) com.garmin.android.library.mapsdkadapter.n.a(ke2.c.c(aVar2.f112052a), ke2.c.c(oVar.T.f112053b))) * 0.1d);
            List<com.garmin.android.library.mapsdkadapter.q> list = oVar.A;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                List<com.garmin.android.library.mapsdkadapter.f> list2 = ((com.garmin.android.library.mapsdkadapter.q) obj2).f50328a.f93153a;
                ArrayList arrayList2 = new ArrayList(y.r(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((com.garmin.android.library.mapsdkadapter.f) it.next()).f50283a);
                }
                if (PolyUtil.isLocationOnPath(latLng, arrayList2, true, dMin) || (PolyUtil.isClosedPolygon(arrayList2) && PolyUtil.containsLocation(latLng, arrayList2, true))) {
                    arrayList.add(obj2);
                }
            }
            oVar.f115351k0 = arrayList;
            if (arrayList.isEmpty() || (objB4 = oVar.B4(oVar.f115351k0, this)) != u13.a.COROUTINE_SUSPENDED) {
                objB4 = Unit.INSTANCE;
            }
            if (objB4 == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
