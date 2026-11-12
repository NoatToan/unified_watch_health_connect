package ne2;

import com.mapbox.geojson.Point;
import com.mapbox.maps.MapView;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lne2/h$b;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.mapsdkadapter.mapbox.MapboxCameraAlgorithm$Companion$calculateOptimalCamera$candidates$1", f = "MapboxCameraAlgorithm.kt", l = {239}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends h.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f125651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f125652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.b f125653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f125654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f125655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<h.e> f125656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Point f125657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ MapView f125658h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lne2/h$b;", "<anonymous>", "(Lo53/b0;)Lne2/h$b;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.mapsdkadapter.mapbox.MapboxCameraAlgorithm$Companion$calculateOptimalCamera$candidates$1$1", f = "MapboxCameraAlgorithm.kt", l = {217}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super h.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f125659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h.b f125660b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ double f125661c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ double f125662d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List<h.e> f125663e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Point f125664f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ MapView f125665g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h.b bVar, double d14, double d15, List<h.e> list, Point point, MapView mapView, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f125660b = bVar;
            this.f125661c = d14;
            this.f125662d = d15;
            this.f125663e = list;
            this.f125664f = point;
            this.f125665g = mapView;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f125660b, this.f125661c, this.f125662d, this.f125663e, this.f125664f, this.f125665g, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super h.b> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            h.b bVar;
            Object objA;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f125659a;
            h.b bVar2 = this.f125660b;
            if (i14 == 0) {
                o13.r.b(obj);
                h.d dVar = h.f125596a;
                double d14 = bVar2.f125599a;
                double d15 = bVar2.f125600b;
                double d16 = bVar2.f125603e;
                double d17 = bVar2.f125602d;
                this.f125659a = 1;
                bVar = bVar2;
                objA = h.d.a(dVar, d14, d15, this.f125661c, this.f125662d, 20.0d, 5.0d, this.f125663e, 500, this.f125664f, d16, d17, this.f125665g, this);
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objA = obj;
                bVar = bVar2;
            }
            h.b bVar3 = bVar;
            return new h.b(bVar3.f125599a, bVar3.f125600b, ((Number) objA).doubleValue(), bVar3.f125602d, bVar3.f125603e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h.b bVar, double d14, double d15, List<h.e> list, Point point, MapView mapView, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f125653c = bVar;
        this.f125654d = d14;
        this.f125655e = d15;
        this.f125656f = list;
        this.f125657g = point;
        this.f125658h = mapView;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k kVar = new k(this.f125653c, this.f125654d, this.f125655e, this.f125656f, this.f125657g, this.f125658h, dVar);
        kVar.f125652b = obj;
        return kVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends h.b>> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        o53.b0 b0Var = (o53.b0) this.f125652b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125651a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        List listC = p13.w.c(ge1.b.j(b0Var, null, null, new a(this.f125653c, this.f125654d, this.f125655e, this.f125656f, this.f125657g, this.f125658h, null), 3));
        this.f125652b = null;
        this.f125651a = 1;
        Object objO = g8.i.o(listC, this);
        return objO == aVar ? aVar : objO;
    }
}
