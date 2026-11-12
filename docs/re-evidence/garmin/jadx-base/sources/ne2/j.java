package ne2;

import com.mapbox.geojson.Point;
import com.mapbox.maps.MapView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lne2/h$a;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.mapsdkadapter.mapbox.MapboxCameraAlgorithm$Companion$calculateOptimalCamera$bearingScores$1", f = "MapboxCameraAlgorithm.kt", l = {143}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends h.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f125630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f125631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<Double> f125632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f125633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f125634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f125635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List<h.e> f125636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Point f125637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f125638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ double f125639j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ MapView f125640k;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lne2/h$a;", "<anonymous>", "(Lo53/b0;)Lne2/h$a;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.mapsdkadapter.mapbox.MapboxCameraAlgorithm$Companion$calculateOptimalCamera$bearingScores$1$1$1", f = "MapboxCameraAlgorithm.kt", l = {127}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super h.a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f125641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ double f125642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ double f125643c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ double f125644d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ double f125645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ List<h.e> f125646f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Point f125647g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ double f125648h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ double f125649i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ MapView f125650j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(double d14, double d15, double d16, double d17, List<h.e> list, Point point, double d18, double d19, MapView mapView, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f125642b = d14;
            this.f125643c = d15;
            this.f125644d = d16;
            this.f125645e = d17;
            this.f125646f = list;
            this.f125647g = point;
            this.f125648h = d18;
            this.f125649i = d19;
            this.f125650j = mapView;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f125642b, this.f125643c, this.f125644d, this.f125645e, this.f125646f, this.f125647g, this.f125648h, this.f125649i, this.f125650j, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super h.a> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objA;
            a aVar;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f125641a;
            if (i14 == 0) {
                o13.r.b(obj);
                h.d dVar = h.f125596a;
                this.f125641a = 1;
                objA = h.d.a(dVar, this.f125642b, this.f125643c, this.f125644d, this.f125645e, 0.0d, 0.0d, this.f125646f, 150, this.f125647g, this.f125648h, this.f125649i, this.f125650j, this);
                aVar = this;
                if (objA == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objA = obj;
                aVar = this;
            }
            return new h.a(aVar.f125642b, ((Number) objA).doubleValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(List<Double> list, double d14, double d15, double d16, List<h.e> list2, Point point, double d17, double d18, MapView mapView, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f125632c = list;
        this.f125633d = d14;
        this.f125634e = d15;
        this.f125635f = d16;
        this.f125636g = list2;
        this.f125637h = point;
        this.f125638i = d17;
        this.f125639j = d18;
        this.f125640k = mapView;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f125632c, this.f125633d, this.f125634e, this.f125635f, this.f125636g, this.f125637h, this.f125638i, this.f125639j, this.f125640k, dVar);
        jVar.f125631b = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends h.a>> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        o53.b0 b0Var = (o53.b0) this.f125631b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125630a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        List<Double> list = this.f125632c;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        for (Iterator it = list.iterator(); it.hasNext(); it = it) {
            arrayList.add(ge1.b.j(b0Var, null, null, new a(((Number) it.next()).doubleValue(), this.f125633d, this.f125634e, this.f125635f, this.f125636g, this.f125637h, this.f125638i, this.f125639j, this.f125640k, null), 3));
        }
        this.f125631b = null;
        this.f125630a = 1;
        Object objO = g8.i.o(arrayList, this);
        return objO == aVar ? aVar : objO;
    }
}
