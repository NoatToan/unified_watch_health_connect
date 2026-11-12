package ne2;

import com.google.android.gms.maps.model.LatLng;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.generated.LineLayer;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n0;
import p005kotlin.jvm.internal.q0;
import p13.h0;
import p13.w0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\t¨\u0006\u000b"}, d2 = {"Lne2/d0;", "Lcom/garmin/android/library/mapsdkadapter/l;", "Lcom/garmin/android/library/mapsdkadapter/q;", "polylineOptions", "Lne2/s;", "mapAdapter", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/q;Lne2/s;)V", "polyline", "(Lne2/d0;)V", "a", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d0 implements com.garmin.android.library.mapsdkadapter.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f125576h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.library.mapsdkadapter.q f125577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f125578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f125579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f125580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f125581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f125582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.garmin.android.library.mapsdkadapter.i.n f125583g;

    static {
        new a(null);
        g53.b.f75983c.getClass();
        g53.b.a.b().toString();
    }

    public d0(com.garmin.android.library.mapsdkadapter.q qVar, s sVar) {
        qVar.getClass();
        sVar.getClass();
        this.f125577a = qVar;
        this.f125578b = sVar;
        this.f125579c = new ArrayList();
        this.f125580d = new ArrayList();
        this.f125581e = new ArrayList();
        this.f125582f = new ArrayList();
        com.garmin.android.library.mapsdkadapter.f fVar = (com.garmin.android.library.mapsdkadapter.f) h0.e0(0, qVar.f50328a.f93153a);
        if (fVar == null || fVar.f50284b == null) {
            com.garmin.android.library.mapsdkadapter.i.b bVar = com.garmin.android.library.mapsdkadapter.i.b.WGS84;
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void a(float f14) {
        this.f125577a.f50328a.f93158f = f14;
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void b(Object obj) {
        this.f125577a.f50328a.f93164l = obj;
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void c(ie2.d dVar) {
        dVar.getClass();
        this.f125577a.d(dVar);
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final List<com.garmin.android.library.mapsdkadapter.f> d() {
        return this.f125577a.f50328a.f93153a;
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void e(boolean z14) {
        this.f125577a.f50328a.f93161i = z14;
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void f(int i14) {
        this.f125577a.f50328a.f93156d = i14;
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    /* JADX INFO: renamed from: g, reason: from getter */
    public final com.garmin.android.library.mapsdkadapter.q getF125577a() {
        return this.f125577a;
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final int getColor() {
        return this.f125577a.f50328a.f93156d;
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final Object getTag() {
        return this.f125577a.f50328a.f93164l;
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final float getZIndex() {
        return this.f125577a.f50328a.f93158f;
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void h(List<com.garmin.android.library.mapsdkadapter.f> list) {
        list.getClass();
        com.garmin.android.library.mapsdkadapter.q qVar = this.f125577a;
        qVar.b();
        qVar.a(list);
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void i(float f14) {
        this.f125577a.f50328a.f93155c = f14;
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void j(ie2.d dVar) {
        dVar.getClass();
        this.f125577a.c(dVar);
    }

    public final List k(ArrayList arrayList, List list) {
        double dA;
        Iterator it;
        double d14;
        List<List> list2 = list;
        ArrayList arrayListI1 = arrayList != null ? h0.i1(arrayList, 10000, 10000, true) : null;
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        if (arrayList != null) {
            for (List list3 : list2) {
                int i14 = 0;
                double dA2 = 0.0d;
                for (Object obj : list3) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    com.garmin.android.library.mapsdkadapter.f fVar = (com.garmin.android.library.mapsdkadapter.f) obj;
                    if (i15 < list3.size()) {
                        com.garmin.android.library.mapsdkadapter.f fVar2 = (com.garmin.android.library.mapsdkadapter.f) list3.get(i15);
                        LatLng latLng = fVar.f50283a;
                        LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
                        LatLng latLng3 = fVar2.f50283a;
                        dA2 += (double) com.garmin.android.library.mapsdkadapter.n.a(latLng2, new LatLng(latLng3.latitude, latLng3.longitude));
                    }
                    list3 = list3;
                    i14 = i15;
                    arrayListI1 = arrayListI1;
                }
                arrayList2.add(Double.valueOf(dA2));
            }
            ArrayList arrayList3 = arrayListI1;
            if (arrayList3 != null) {
                Iterator it3 = arrayList3.iterator();
                int i16 = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    HashMap map2 = new HashMap();
                    o13.u uVar = null;
                    int i18 = 0;
                    double d15 = 0.0d;
                    double d16 = 0.0d;
                    for (Object obj2 : (List) next) {
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        o13.u uVar2 = (o13.u) obj2;
                        if (i16 >= list2.size() || i18 >= ((List) list2.get(i16)).size()) {
                            dA = d15;
                            it = it3;
                        } else {
                            com.garmin.android.library.mapsdkadapter.f fVar3 = (com.garmin.android.library.mapsdkadapter.f) ((List) list2.get(i16)).get(i18);
                            int i24 = i18 - 1;
                            if (i24 >= 0) {
                                d14 = 0.0d;
                                LatLng latLng4 = ((com.garmin.android.library.mapsdkadapter.f) ((List) list2.get(i16)).get(i24)).f50283a;
                                it = it3;
                                LatLng latLng5 = new LatLng(latLng4.latitude, latLng4.longitude);
                                LatLng latLng6 = fVar3.f50283a;
                                dA = d15 + ((double) com.garmin.android.library.mapsdkadapter.n.a(latLng5, new LatLng(latLng6.latitude, latLng6.longitude)));
                            } else {
                                d14 = 0.0d;
                                it = it3;
                                dA = d15;
                            }
                            double dDoubleValue = ((Number) arrayList2.get(i16)).doubleValue();
                            if (dDoubleValue <= d14 || p005kotlin.jvm.internal.s.g(uVar, uVar2)) {
                                dA = dA;
                            } else {
                                double d17 = dA / dDoubleValue;
                                if (uVar != null) {
                                    map2.put(Float.valueOf((float) (Boolean.valueOf(this.f125577a.f50328a.f93167o).equals(Boolean.TRUE) ? d16 / dDoubleValue : d17)), uVar2);
                                }
                                map2.put(Float.valueOf((float) d17), uVar2);
                            }
                            uVar = uVar2;
                            d16 = dA;
                        }
                        map.putAll(map2);
                        list2 = list;
                        it3 = it;
                        i18 = i19;
                        d15 = dA;
                    }
                    list2 = list;
                    i16 = i17;
                }
            }
        }
        return w0.o(new TreeMap(map));
    }

    public final void l(LineLayer lineLayer) {
        n0 n0Var = new n0();
        n0Var.f105805a = 5.0d;
        q0 q0Var = new q0();
        q0Var.f105808a = 11L;
        lineLayer.lineWidth(Expression.INSTANCE.interpolate(new c0(q0Var, n0Var, Boolean.valueOf(this.f125577a.f50328a.f93166n).equals(Boolean.TRUE) ? 1.5d : 1.0d, 0)));
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void remove() {
        this.f125577a.b();
        s sVar = this.f125578b;
        sVar.C.remove(this);
        MapboxMap mapboxMapB0 = sVar.b0();
        if (mapboxMapB0 != null) {
            mapboxMapB0.getStyle(new com.mapbox.maps.a(this, 3));
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void setVisible(boolean z14) {
        this.f125577a.f50328a.f93160h = z14;
        Visibility visibility = z14 ? Visibility.VISIBLE : Visibility.NONE;
        Iterator it = this.f125580d.iterator();
        while (it.hasNext()) {
            ((LineLayer) it.next()).visibility(visibility);
        }
        Iterator it3 = this.f125581e.iterator();
        while (it3.hasNext()) {
            ((LineLayer) it3.next()).visibility(visibility);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lne2/d0$a;", "", "<init>", "()V", "", "CHUNK_SIZE", "I", "", "baseId", "Ljava/lang/String;", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d0(d0 d0Var) {
        this(new com.garmin.android.library.mapsdkadapter.q(d0Var.f125577a), d0Var.f125578b);
        d0Var.getClass();
    }
}
