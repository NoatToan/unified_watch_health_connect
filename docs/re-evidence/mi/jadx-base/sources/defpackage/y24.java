package defpackage;

import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.Marker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class y24 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LatLng f39706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<a34> f39707b = new ArrayList();
    public Marker c;

    public y24(LatLng latLng) {
        this.f39706a = latLng;
    }

    public void a(a34 a34Var) {
        this.f39707b.add(a34Var);
    }

    public LatLng b() {
        return this.f39706a;
    }

    public List<a34> c() {
        return this.f39707b;
    }

    public Marker d() {
        return this.c;
    }

    public void e(Marker marker) {
        this.c = marker;
    }
}
