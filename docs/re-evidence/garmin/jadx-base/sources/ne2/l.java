package ne2;

import com.mapbox.geojson.Point;
import com.mapbox.maps.MapView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)I"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.mapsdkadapter.mapbox.MapboxCameraAlgorithm$Companion$scoreBearingTerrain$2", f = "MapboxCameraAlgorithm.kt", l = {366}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<o53.b0, t13.d<? super Integer>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f125666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f125667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<h.e> f125668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Point f125669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f125670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f125671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MapView f125672g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)I"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.mapsdkadapter.mapbox.MapboxCameraAlgorithm$Companion$scoreBearingTerrain$2$deferredObstructionScore$1$1", f = "MapboxCameraAlgorithm.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Integer>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h.e f125673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Point f125674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ double f125675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f125676d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ MapView f125677e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f125678f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h.e eVar, Point point, double d14, int i14, MapView mapView, int i15, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f125673a = eVar;
            this.f125674b = point;
            this.f125675c = d14;
            this.f125676d = i14;
            this.f125677e = mapView;
            this.f125678f = i15;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f125673a, this.f125674b, this.f125675c, this.f125676d, this.f125677e, this.f125678f, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Integer> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            int i14;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            h.d dVar = h.f125596a;
            h.e eVar = this.f125673a;
            Point point = eVar.f125606a;
            double d14 = eVar.f125607b;
            dVar.getClass();
            double d15 = this.f125675c * 0.9d;
            int i15 = this.f125676d;
            int i16 = i15 - 1;
            ArrayList arrayList = new ArrayList(i16);
            j23.j jVarM = j23.t.m(j23.t.o(0, i16));
            int i17 = jVarM.f96796a;
            int i18 = jVarM.f96797b;
            int i19 = jVarM.f96798c;
            if ((i19 > 0 && i17 <= i18) || (i19 < 0 && i18 <= i17)) {
                int i24 = i17;
                while (true) {
                    int i25 = i18;
                    double d16 = 1;
                    int i26 = i15;
                    Point point2 = point;
                    double dPow = d16 - Math.pow(d16 - (((double) i24) / ((double) i15)), 1.0d);
                    Point point3 = this.f125674b;
                    Point pointFromLngLat = Point.fromLngLat(((point2.longitude() - point3.longitude()) * dPow) + point3.longitude(), ((point2.latitude() - point3.latitude()) * dPow) + point3.latitude());
                    int i27 = i24;
                    double dB = o2.c.b(d14, d15, dPow, d15);
                    pointFromLngLat.getClass();
                    arrayList.add(new h.e(pointFromLngLat, dB));
                    if (i27 == i25) {
                        break;
                    }
                    i24 = i27 + i19;
                    point = point2;
                    i18 = i25;
                    i15 = i26;
                }
            }
            Iterator it = arrayList.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                h.e eVar2 = (h.e) next;
                Double elevation = this.f125677e.getMapboxMapDeprecated().getElevation(eVar2.f125606a);
                if (eVar2.f125607b < (elevation != null ? elevation.doubleValue() : 0.0d)) {
                    i14 = this.f125678f == 0 ? 5 : 1;
                    return new Integer(i14);
                }
            }
            i14 = 0;
            return new Integer(i14);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(List<h.e> list, Point point, double d14, int i14, MapView mapView, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f125668c = list;
        this.f125669d = point;
        this.f125670e = d14;
        this.f125671f = i14;
        this.f125672g = mapView;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l lVar = new l(this.f125668c, this.f125669d, this.f125670e, this.f125671f, this.f125672g, dVar);
        lVar.f125667b = obj;
        return lVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Integer> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objO;
        o53.b0 b0Var = (o53.b0) this.f125667b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f125666a;
        if (i14 == 0) {
            o13.r.b(obj);
            List<h.e> list = this.f125668c;
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            int i15 = 0;
            for (Object obj2 : list) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    p13.x.q();
                    throw null;
                }
                arrayList.add(ge1.b.j(b0Var, null, null, new a((h.e) obj2, this.f125669d, this.f125670e, this.f125671f, this.f125672g, i15, null), 3));
                i15 = i16;
            }
            this.f125667b = null;
            this.f125666a = 1;
            objO = g8.i.o(arrayList, this);
            if (objO == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objO = obj;
        }
        return new Integer(h0.R0((Iterable) objO));
    }
}
