package gn0;

import c83.a0;
import com.google.android.gms.maps.model.LatLngBounds;
import e23.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lfn0/d;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.hazards.repo.HazardsRepo$getHazards$2", f = "HazardsRepo.kt", l = {27}, m = "invokeSuspend", v = 2)
public final class c extends i implements l<d<? super a0<fn0.d>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f78060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f78061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LatLngBounds f78062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<fn0.c> f78063d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(b bVar, LatLngBounds latLngBounds, List<? extends fn0.c> list, d<? super c> dVar) {
        super(1, dVar);
        this.f78061b = bVar;
        this.f78062c = latLngBounds;
        this.f78063d = list;
    }

    @Override // v13.a
    public final d<Unit> create(d<?> dVar) {
        return new c(this.f78061b, this.f78062c, this.f78063d, dVar);
    }

    @Override // e23.l
    public final Object invoke(d<? super a0<fn0.d>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f78060a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        a aVar2 = this.f78061b.f78059a;
        LatLngBounds latLngBounds = this.f78062c;
        int iA = lb2.b.a(latLngBounds.northeast.latitude);
        int iA2 = lb2.b.a(latLngBounds.southwest.latitude);
        int iA3 = lb2.b.a(latLngBounds.northeast.longitude);
        int iA4 = lb2.b.a(latLngBounds.southwest.longitude);
        List<fn0.c> list = this.f78063d;
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((fn0.c) it.next()).f72173a);
        }
        i0<a0<fn0.d>> i0VarA = aVar2.a(iA, iA2, iA3, iA4, (String[]) arrayList.toArray(new String[0]));
        this.f78060a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
