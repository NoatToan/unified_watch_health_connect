package qe2;

import cf.a0;
import com.garmin.android.library.mapsdkadapter.p;
import com.garmin.android.library.mapsdkadapter.q;
import e23.l;
import ie2.s;
import ie2.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import vn2.t0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqe2/h;", "Lcom/garmin/android/library/mapsdkadapter/i;", "Lcom/garmin/android/library/mapsdkadapter/i$l;", "mapImpl", "<init>", "(Lcom/garmin/android/library/mapsdkadapter/i;)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h implements com.garmin.android.library.mapsdkadapter.i, com.garmin.android.library.mapsdkadapter.i.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.library.mapsdkadapter.i f144584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<l<com.garmin.android.library.mapsdkadapter.i, Unit>> f144585b;

    public h(com.garmin.android.library.mapsdkadapter.i iVar) {
        iVar.getClass();
        this.f144584a = iVar;
        this.f144585b = new ArrayList<>();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void A(com.garmin.android.library.mapsdkadapter.i.k kVar) {
        Y(new qd0.a(kVar, 7));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void B(com.garmin.android.library.mapsdkadapter.i.m mVar) {
        Y(new qd0.a(mVar, 6));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final List<a> C() {
        return this.f144584a.C();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void D(boolean z14) {
        this.f144584a.D(z14);
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void E(com.garmin.android.library.mapsdkadapter.i.g gVar) {
        Y(new qd0.a(gVar, 5));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final s F(t tVar) {
        tVar.getClass();
        k kVar = new k();
        Y(new ph1.d(13, kVar, tVar));
        return kVar;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void H(t0 t0Var) {
        Y(new qd0.a(t0Var, 13));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final /* bridge */ com.garmin.android.library.mapsdkadapter.l I(q qVar) {
        return com.garmin.android.library.mapsdkadapter.i.a.a(this, qVar);
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void J(int i14, List list) {
        Y(new gs.k(list, i14, 1));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void K(com.garmin.android.library.mapsdkadapter.i.n nVar) {
        Y(new qd0.a(nVar, 4));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void M(j40.a aVar) {
        Y(new qd0.a(aVar, 12));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void N(com.garmin.android.library.mapsdkadapter.i.o oVar) {
        Y(new qd0.a(oVar, 16));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void O(com.garmin.android.library.mapsdkadapter.i.j jVar) {
        Y(new qd0.a(jVar, 2));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.l
    public final void O5(com.garmin.android.library.mapsdkadapter.i.d dVar) {
        dVar.getClass();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    /* JADX INFO: renamed from: P */
    public final boolean getF50241b() {
        return this.f144584a.getF50241b();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final List<ie2.j> Q() {
        return this.f144584a.Q();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void R(com.garmin.android.library.mapsdkadapter.i.f fVar) {
        Y(new qd0.a(fVar, 9));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void S() {
        Y(new qc.c(7));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    /* JADX INFO: renamed from: T */
    public final boolean getB() {
        return this.f144584a.getB();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    /* JADX INFO: renamed from: U */
    public final float getF50270z() {
        return this.f144584a.getF50270z();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void V(com.garmin.android.library.mapsdkadapter.f fVar, float f14, int i14) {
        fVar.getClass();
        Y(new d(fVar, f14, i14));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void W(j40.c cVar) {
        Y(new j40.b(cVar, 5));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void X(boolean z14) {
        this.f144584a.X(z14);
    }

    public final void Y(l<? super com.garmin.android.library.mapsdkadapter.i, Unit> lVar) {
        com.garmin.android.library.mapsdkadapter.i iVar = this.f144584a;
        if (iVar.getF50241b()) {
            lVar.invoke(iVar);
        } else {
            this.f144585b.add(new c(lVar, 0));
        }
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void Z(com.garmin.android.library.mapsdkadapter.i.h hVar) {
        Y(new qd0.a(hVar, 11));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    /* JADX INFO: renamed from: a */
    public final com.garmin.android.library.mapsdkadapter.i.d getF50264r() {
        return this.f144584a.getF50264r();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void a0(j40.c cVar) {
        Y(new j40.b(cVar, 4));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void b(boolean z14, Boolean bool) {
        this.f144584a.b(z14, bool);
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void c(com.garmin.android.library.mapsdkadapter.e eVar, int i14) {
        eVar.getClass();
        Y(new e(eVar, i14, 1));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void clear() {
        Y(new qc.c(5));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void d(final boolean z14, final boolean z15, final float f14) {
        Y(new l() { // from class: qe2.b
            @Override // e23.l
            public final Object invoke(Object obj) {
                com.garmin.android.library.mapsdkadapter.i iVar = (com.garmin.android.library.mapsdkadapter.i) obj;
                iVar.getClass();
                iVar.d(z14, z15, f14);
                return Unit.INSTANCE;
            }
        });
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void e(Float f14) {
        Y(new c81.h(2, f14));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void f(int i14, List list) {
        list.getClass();
        Y(new gs.k(list, i14, 2));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void g() {
        this.f144584a.g();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final ie2.c getCameraState() {
        return this.f144584a.getCameraState();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final ie2.k getUiSettings() {
        return this.f144584a.getUiSettings();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    /* JADX INFO: renamed from: getVisibleRegion */
    public final com.garmin.android.library.mapsdkadapter.e getA() {
        return this.f144584a.getA();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final com.garmin.android.library.mapsdkadapter.l h(q qVar) {
        qVar.getClass();
        j jVar = new j(qVar);
        Y(new qd0.a(jVar, 1));
        return jVar;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.l
    public final void h1(com.garmin.android.library.mapsdkadapter.i iVar) {
        ArrayList<l<com.garmin.android.library.mapsdkadapter.i, Unit>> arrayList = this.f144585b;
        Iterator<l<com.garmin.android.library.mapsdkadapter.i, Unit>> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().invoke(iVar);
        }
        arrayList.clear();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void i(com.garmin.android.library.mapsdkadapter.i.InterfaceC1001i interfaceC1001i) {
        Y(new qd0.a(interfaceC1001i, 14));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void j(com.garmin.android.library.mapsdkadapter.e eVar, float f14, int i14, int i15) {
        eVar.getClass();
        Y(new f71.f(eVar, f14, i14, i15));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void k(com.garmin.android.library.mapsdkadapter.i.c cVar) {
        Y(new qd0.a(cVar, 8));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void m(com.garmin.android.library.mapsdkadapter.l lVar) {
        lVar.getClass();
        Y(new g(lVar, 0));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void n(ie2.j jVar) {
        jVar.getClass();
        Y(new f(jVar, 0));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void o(ie2.c cVar) {
        cVar.getClass();
        this.f144584a.o(cVar);
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void p(String str, boolean z14) {
        str.getClass();
        Y(new o60.b(str, 10));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void q() {
        Y(new qc.c(6));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void r(y40.i iVar) {
        Y(new qd0.a(iVar, 10));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final List<com.garmin.android.library.mapsdkadapter.l> s() {
        return this.f144584a.s();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void setMapType(int i14) {
        Y(new a0(i14, 7));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void setMyLocationEnabled(boolean z14) {
        Y(new a81.j(z14, 25));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void setPadding(int i14, int i15, int i16, int i17) {
        Y(new a0(i17, 8));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void t(n23.j jVar) {
        Y(new qd0.a(jVar, 15));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    /* JADX INFO: renamed from: u */
    public final com.garmin.android.library.mapsdkadapter.f getF50269y() {
        return this.f144584a.getF50269y();
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void v(com.garmin.android.library.mapsdkadapter.e eVar, int i14) {
        eVar.getClass();
        Y(new e(eVar, i14, 0));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final /* bridge */ void w() {
        com.garmin.android.library.mapsdkadapter.i.a.c(this);
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final ie2.j x(p pVar) {
        pVar.getClass();
        i iVar = new i(pVar);
        Y(new qd0.a(iVar, 3));
        return iVar;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void y(boolean z14) {
        Y(new a81.j(z14, 24));
    }

    @Override // com.garmin.android.library.mapsdkadapter.i
    public final void z(boolean z14) {
        Y(new a81.j(z14, 23));
    }
}
