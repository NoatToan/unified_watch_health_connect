package ly0;

import java.util.ArrayList;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.maps.MapFullscreenViewModel$didSelectMarker$1", f = "MapFullscreenViewModel.kt", l = {399}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f115316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f115317c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, long j8, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f115316b = oVar;
        this.f115317c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f115316b, this.f115317c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115315a;
        if (i14 == 0) {
            o13.r.b(obj);
            o oVar = this.f115316b;
            oVar.X = oVar.T;
            List<com.garmin.android.library.mapsdkadapter.q> list = oVar.A;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                Object obj3 = ((com.garmin.android.library.mapsdkadapter.q) obj2).f50328a.f93164l;
                Long l14 = obj3 instanceof Long ? (Long) obj3 : null;
                if (l14 != null && l14.longValue() == this.f115317c) {
                    arrayList.add(obj2);
                }
            }
            oVar.f115351k0 = arrayList;
            this.f115315a = 1;
            if (oVar.B4(arrayList, this) == aVar) {
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
