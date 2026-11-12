package kk0;

import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p005kotlin.Metadata;
import sk0.b1;
import sk0.t0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkk0/h0;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lkk0/b;", "Lkk0/a;", "gearApi", "<init>", "(Lkk0/a;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h0 implements com.garmin.android.apps.connectmobile.f0, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f105050a;

    public h0(a aVar) {
        aVar.getClass();
        this.f105050a = aVar;
    }

    @Override // kk0.b
    public final Object B(long j8, ok0.t.e eVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new m(this, j8, null), eVar);
    }

    @Override // kk0.b
    public final Object E(String str, long j8, rk0.n0 n0Var) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new g0(this, str, j8, null), n0Var);
    }

    @Override // kk0.b
    public final Object H(long j8, ok0.h hVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new p(this, j8, null), hVar);
    }

    @Override // kk0.b
    public final Object I(String str, zp0.f fVar, String str2, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new d(this, str, MultipartBody.Part.INSTANCE.createFormData("file", e5.g(str2, ".", fVar.f206589b), RequestBody.Companion.create$default(RequestBody.INSTANCE, fVar.f206588a, gz0.a.f80404d, 0, 0, 6, (Object) null)), null), iVar);
    }

    @Override // kk0.b
    public final Object L(List list, mk0.f.b bVar) {
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((c80.u) it.next()).toString());
        }
        return com.garmin.android.apps.connectmobile.f0.J(this, new v(this, arrayList, null), bVar);
    }

    @Override // kk0.b
    public final Object M(String str, rk0.k.b bVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new i(this, str, null), bVar);
    }

    @Override // kk0.b
    public final Object N(String str, v13.c cVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new r(this, str, null), cVar);
    }

    @Override // kk0.b
    public final Object O(String str, List list, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new f(this, str, list, null), iVar);
    }

    @Override // kk0.b
    public final Object R(jk0.j jVar, sk0.w wVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new g(this, jVar, null), wVar);
    }

    @Override // kk0.b
    public final Object T(b63.o oVar, ok0.t.d.a aVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new q(this, oVar, null), aVar);
    }

    @Override // kk0.b
    public final Object V(jk0.j jVar, v13.c cVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new n(jVar, this, null), cVar);
    }

    @Override // kk0.b
    public final Object Y(int i14, int i15, jk0.o oVar, sk0.g0 g0Var) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new s(this, i14, i15, oVar, null), g0Var);
    }

    @Override // kk0.b
    public final Object a(int i14, int i15, List list, jk0.o oVar, c80.u uVar, t0 t0Var) {
        ArrayList arrayList = null;
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((jk0.p) it.next()).toString());
            }
        }
        return com.garmin.android.apps.connectmobile.f0.J(this, new y(this, i14, i15, arrayList, uVar, oVar, null), t0Var);
    }

    @Override // kk0.b
    public final Object b(String str, String str2, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new j(this, str, str2, null), iVar);
    }

    @Override // kk0.b
    public final Object c(jk0.x xVar, sk0.b0.b bVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new h(this, xVar, null), bVar);
    }

    @Override // kk0.b
    public final Object d(jk0.x xVar, v13.c cVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new o(xVar, this, null), cVar);
    }

    @Override // kk0.b
    public final Object f(String str, zp0.f fVar, String str2, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new c(this, str, MultipartBody.Part.INSTANCE.createFormData("file", e5.g(str2, ".", fVar.f206589b), RequestBody.Companion.create$default(RequestBody.INSTANCE, fVar.f206588a, gz0.a.f80404d, 0, 0, 6, (Object) null)), null), iVar);
    }

    @Override // kk0.b
    public final Object g(String str, jk0.p pVar, rk0.m0 m0Var) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new e0(this, str, pVar, null), m0Var);
    }

    @Override // kk0.b
    public final Object h(String str, List list, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new b0(this, str, list, null), iVar);
    }

    @Override // kk0.b
    public final Object i(String str, String str2, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new l(this, str, str2, null), iVar);
    }

    @Override // kk0.b
    public final Object j(String str, rk0.i0 i0Var) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new k(this, str, null), i0Var);
    }

    @Override // kk0.b
    public final Object k(String str, ArrayList arrayList, sk0.t tVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new e(this, str, arrayList, null), tVar);
    }

    @Override // kk0.b
    public final Object l(long j8, String str, ok0.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new t(this, j8, str, null), iVar);
    }

    @Override // kk0.b
    public final Object m(long j8, List list, ok0.t.e eVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new f0(this, j8, list, null), eVar);
    }

    @Override // kk0.b
    public final Object n(String str, String str2, rk0.k0 k0Var) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new a0(this, str, str2, null), k0Var);
    }

    @Override // kk0.b
    public final Object o(b1.d dVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new w(this, null), dVar);
    }

    @Override // kk0.b
    public final Object q(String str, List list, v13.c cVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new d0(this, str, list, null), cVar);
    }

    @Override // kk0.b
    public final Object r(List list, mk0.f.a aVar) {
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((c80.u) it.next()).toString());
        }
        return com.garmin.android.apps.connectmobile.f0.J(this, new u(this, arrayList, null), aVar);
    }

    @Override // kk0.b
    public final Object t(String str, List list, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new c0(this, str, list, null), iVar);
    }

    @Override // kk0.b
    public final Object v(b63.o oVar, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new z(this, oVar, null), iVar);
    }

    @Override // kk0.b
    public final Object y(String str, v13.c cVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new x(this, str, null), cVar);
    }
}
