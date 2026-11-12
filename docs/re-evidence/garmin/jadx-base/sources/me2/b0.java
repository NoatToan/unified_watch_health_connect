package me2;

import com.google.android.gms.maps.model.Polyline;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Lme2/b0;", "Lcom/garmin/android/library/mapsdkadapter/l;", "Lcom/garmin/android/library/mapsdkadapter/q;", "polylineOptions", "Lme2/l;", "mapAdapter", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/q;Lme2/l;)V", "polyline", "(Lme2/b0;)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b0 implements com.garmin.android.library.mapsdkadapter.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.library.mapsdkadapter.q f118133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f118134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Polyline f118135c;

    public b0(com.garmin.android.library.mapsdkadapter.q qVar, l lVar) {
        qVar.getClass();
        lVar.getClass();
        this.f118133a = qVar;
        this.f118134b = lVar;
        com.garmin.android.library.mapsdkadapter.f fVar = (com.garmin.android.library.mapsdkadapter.f) h0.e0(0, qVar.f50328a.f93153a);
        if (fVar == null || fVar.f50284b == null) {
            com.garmin.android.library.mapsdkadapter.i.b bVar = com.garmin.android.library.mapsdkadapter.i.b.WGS84;
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void a(float f14) {
        this.f118133a.f50328a.f93158f = f14;
        k().setZIndex(f14);
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void b(Object obj) {
        this.f118133a.f50328a.f93164l = obj;
        k().setTag(obj);
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void c(ie2.d dVar) {
        dVar.getClass();
        this.f118133a.d(dVar);
        k().setStartCap(z.c(dVar));
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final List<com.garmin.android.library.mapsdkadapter.f> d() {
        return this.f118133a.f50328a.f93153a;
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void e(boolean z14) {
        this.f118133a.f50328a.f93161i = z14;
        k().setGeodesic(z14);
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void f(int i14) {
        this.f118133a.f50328a.f93156d = i14;
        k().setColor(i14);
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    /* JADX INFO: renamed from: g, reason: from getter */
    public final com.garmin.android.library.mapsdkadapter.q getF118133a() {
        return this.f118133a;
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final int getColor() {
        return this.f118133a.f50328a.f93156d;
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final Object getTag() {
        return this.f118133a.f50328a.f93164l;
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final float getZIndex() {
        return this.f118133a.f50328a.f93158f;
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void h(List<com.garmin.android.library.mapsdkadapter.f> list) {
        list.getClass();
        com.garmin.android.library.mapsdkadapter.q qVar = this.f118133a;
        qVar.b();
        qVar.a(list);
        k().setPoints(z.j(list));
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void i(float f14) {
        this.f118133a.f50328a.f93155c = f14;
        k().setWidth(f14);
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void j(ie2.d dVar) {
        dVar.getClass();
        this.f118133a.c(dVar);
        k().setEndCap(z.c(dVar));
    }

    public final Polyline k() {
        Polyline polyline = this.f118135c;
        if (polyline != null) {
            return polyline;
        }
        p005kotlin.jvm.internal.s.m("googlePolyline");
        throw null;
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void remove() {
        this.f118133a.b();
        k().remove();
        this.f118134b.A.remove(this);
    }

    @Override // com.garmin.android.library.mapsdkadapter.l
    public final void setVisible(boolean z14) {
        this.f118133a.f50328a.f93160h = z14;
        k().setVisible(z14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(b0 b0Var) {
        this(new com.garmin.android.library.mapsdkadapter.q(b0Var.f118133a), b0Var.f118134b);
        b0Var.getClass();
        this.f118135c = b0Var.k();
    }
}
