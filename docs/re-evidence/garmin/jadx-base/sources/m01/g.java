package m01;

import com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.PhotoCategory;
import java.util.List;
import okhttp3.MultipartBody;
import v01.f2;
import v01.m1;
import v01.r1;
import v01.t1;
import v01.x1;

/* JADX INFO: loaded from: classes9.dex */
public interface g {
    static /* synthetic */ Object h(g gVar, int i14, int i15, String str, String str2, v13.c cVar, int i16) {
        if ((i16 & 4) != 0) {
            str = null;
        }
        if ((i16 & 8) != 0) {
            str2 = null;
        }
        return gVar.O(i14, i15, str, str2, cVar);
    }

    static /* synthetic */ Object n(g gVar, int i14, int i15, String str, Long l14, v13.c cVar, int i16) {
        if ((i16 & 4) != 0) {
            str = null;
        }
        if ((i16 & 8) != 0) {
            l14 = null;
        }
        return gVar.p0(i14, i15, str, l14, cVar);
    }

    Object A0(String str, int i14, int i15, n01.f fVar);

    Object B(v13.c cVar);

    Object D0(j01.a aVar, v01.i iVar);

    Object E(int i14, String str, boolean z14, v01.q0 q0Var);

    Object G0(f01.c cVar, v01.l0 l0Var);

    Object H(String str, j01.a aVar, f2 f2Var);

    Object I(u21.x0 x0Var);

    Object K0(long j8, boolean z14, l11.q qVar);

    Object L(g01.b bVar, v01.g gVar);

    Object L0(b63.o oVar, v13.i iVar);

    Object M(String str, v01.t tVar);

    Object N(PhotoCategory photoCategory, String str, MultipartBody.Part part, r1 r1Var);

    Object N0(b63.o oVar, b63.o oVar2, x1 x1Var);

    Object O(int i14, int i15, String str, String str2, v13.c cVar);

    Object P0(i01.g gVar, m1 m1Var);

    Object R(b63.o oVar, i01.d dVar, v13.i iVar);

    Object T(l01.l lVar, u21.o0.b bVar);

    Object T0(String str, String str2, String str3, m21.t tVar);

    Object V(String str, String str2, String str3, y21.b bVar);

    Object Y(b63.o oVar, v13.c cVar);

    Object a(v13.i iVar);

    Object a0(i01.h hVar, m1 m1Var);

    Object b(long j8, v13.i iVar);

    Object b0(int i14, b63.o oVar, l01.k kVar, v13.c cVar);

    Object c(i21.p pVar);

    Object c0(String str, v01.v vVar);

    Object d(b63.o oVar, b63.o oVar2, s11.f fVar);

    Object d0(PhotoCategory photoCategory, String str, v13.c cVar);

    Object f(i01.c cVar, v01.a aVar);

    Object f0(v13.c cVar);

    Object g(g01.i iVar, v01.d dVar);

    Object i(String str, v01.x xVar);

    Object j(String str, int i14, int i15, String str2, String str3, n01.k kVar);

    Object j0(List list, v01.h0 h0Var);

    Object k(String str, v13.c cVar);

    Object l(String str, g01.u uVar, String str2, Double d14, String str3, String str4, v01.x xVar);

    Object m(v13.c cVar);

    Object m0(v13.c cVar);

    Object o(int i14, b63.o oVar, g01.z zVar, v13.c cVar);

    Object o0(int i14, int i15, String str, n01.p pVar);

    Object p0(int i14, int i15, String str, Long l14, v13.c cVar);

    Object q(b63.o oVar, b63.o oVar2, b63.o oVar3, v13.c cVar);

    Object r(int i14, int i15, Long l14, n01.m mVar);

    Object s0(i21.n nVar);

    Object t(g01.k kVar, t1 t1Var);

    Object u0(x01.h hVar);

    Object v(b63.o oVar, boolean z14, boolean z15, v01.o0 o0Var);

    Object v0(String str, String str2, String str3, x11.c cVar);

    Object y(g01.d0 d0Var, v13.i iVar);
}
