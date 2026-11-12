package com.garmin.android.library.mapsdkadapter;

import android.app.Dialog;
import android.os.Bundle;
import android.view.ViewGroup;
import ie2.t;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import vn2.t0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/library/mapsdkadapter/d;", "Lcom/garmin/android/library/mapsdkadapter/a;", "<init>", "()V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends com.garmin.android.library.mapsdkadapter.a {
    public final e A;
    public boolean B;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i.d f50264r = i.d.NULL;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f50265t = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f50266v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f50267w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b f50268x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f f50269y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float f50270z;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/library/mapsdkadapter/d$a", "Lie2/s;", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements ie2.s {
        @Override // ie2.s
        public final void remove() {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/library/mapsdkadapter/d$b", "Lie2/k;", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements ie2.k {
        @Override // ie2.k
        public final void a() {
        }

        @Override // ie2.k
        public final void b() {
        }

        @Override // ie2.k
        public final void setAllGesturesEnabled(boolean z14) {
        }

        @Override // ie2.k
        public final void setMapToolbarEnabled(boolean z14) {
        }

        @Override // ie2.k
        public final void setRotateGesturesEnabled(boolean z14) {
        }

        @Override // ie2.k
        public final void setScrollGesturesEnabled(boolean z14) {
        }

        @Override // ie2.k
        public final void setTiltGesturesEnabled(boolean z14) {
        }

        @Override // ie2.k
        public final void setZoomControlsEnabled(boolean z14) {
        }

        @Override // ie2.k
        public final void setZoomGesturesEnabled(boolean z14) {
        }
    }

    public d() {
        new ArrayList();
        this.f50267w = new ArrayList();
        this.f50268x = new b();
        f.f50281c.getClass();
        f fVar = f.f50282d;
        this.f50269y = fVar;
        this.f50270z = -1.0f;
        this.A = new e(fVar, fVar);
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void A(i.k kVar) {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void B(i.m mVar) {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final List<qe2.a> C() {
        return this.f50267w;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void D(boolean z14) {
        this.B = z14;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void E(i.g gVar) {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final ie2.s F(t tVar) {
        tVar.getClass();
        return new a();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final Dialog G(androidx.fragment.app.m mVar) {
        return null;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void H(t0 t0Var) {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void J(int i14, List list) {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void K(i.n nVar) {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    /* JADX INFO: renamed from: L */
    public final boolean getA() {
        return false;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void M(j40.a aVar) {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void N(i.o oVar) {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void O(i.j jVar) {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final List<ie2.j> Q() {
        return this.f50265t;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void R(i.f fVar) {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void S() {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    /* JADX INFO: renamed from: T, reason: from getter */
    public final boolean getT() {
        return this.B;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    /* JADX INFO: renamed from: U, reason: from getter */
    public final float getF() {
        return this.f50270z;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void V(f fVar, float f14, int i14) {
        fVar.getClass();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void W(j40.c cVar) {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void X(boolean z14) {
    }

    @Override // com.garmin.android.library.mapsdkadapter.j
    public final void Y(ViewGroup viewGroup, ie2.l lVar, i.l lVar2) {
        viewGroup.getClass();
        if (lVar2 != null) {
            lVar2.O5(this.f50264r);
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void Z(i.h hVar) {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    /* JADX INFO: renamed from: a, reason: from getter */
    public final i.d getF118185r() {
        return this.f50264r;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void a0(j40.c cVar) {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void b(boolean z14, Boolean bool) {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void c(e eVar, int i14) {
        eVar.getClass();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void clear() {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void d(boolean z14, boolean z15, float f14) {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void e(Float f14) {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void f(int i14, List list) {
        list.getClass();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void g() {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final ie2.c getCameraState() {
        return null;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final ie2.k getUiSettings() {
        return this.f50268x;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    /* JADX INFO: renamed from: getVisibleRegion, reason: from getter */
    public final e getI() {
        return this.A;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final l h(q qVar) {
        qVar.getClass();
        return new qe2.j(qVar);
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void i(i.InterfaceC1001i interfaceC1001i) {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void j(e eVar, float f14, int i14, int i15) {
        eVar.getClass();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void k(i.c cVar) {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void l() {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void m(l lVar) {
        lVar.getClass();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void n(ie2.j jVar) {
        jVar.getClass();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void o(ie2.c cVar) {
        cVar.getClass();
    }

    @Override // ie2.i
    public final void onCreate(Bundle bundle) {
    }

    @Override // ie2.i
    public final void onDestroy() {
    }

    @Override // ie2.i
    public final void onLowMemory() {
    }

    @Override // ie2.i
    public final void onPause() {
    }

    @Override // ie2.i
    public final void onResume() {
    }

    @Override // ie2.i
    public final void onStart() {
    }

    @Override // ie2.i
    public final void onStop() {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void p(String str, boolean z14) {
        str.getClass();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void q() {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void r(y40.i iVar) {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final List<l> s() {
        return this.f50266v;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void setMapType(int i14) {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void setMyLocationEnabled(boolean z14) {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void setPadding(int i14, int i15, int i16, int i17) {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void t(n23.j jVar) {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    /* JADX INFO: renamed from: u, reason: from getter */
    public final f getE() {
        return this.f50269y;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void v(e eVar, int i14) {
        eVar.getClass();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final ie2.j x(p pVar) {
        pVar.getClass();
        return new qe2.i(pVar);
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void y(boolean z14) {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void z(boolean z14) {
    }
}
