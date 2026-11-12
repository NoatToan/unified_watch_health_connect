package m01;

import com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.PhotoCategory;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import okhttp3.MultipartBody;
import p005kotlin.Metadata;
import v01.f2;
import v01.m1;
import v01.r1;
import v01.t1;
import v01.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lm01/h;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lm01/g;", "Lc01/b;", "nutritionApi", "Lc01/c;", "userPreferenceAPI", "<init>", "(Lc01/b;Lc01/c;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements com.garmin.android.apps.connectmobile.f0, g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f115593c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c01.b f115594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c01.c f115595b;

    static {
        new a(null);
    }

    public h(c01.b bVar, c01.c cVar) {
        bVar.getClass();
        cVar.getClass();
        this.f115594a = bVar;
        this.f115595b = cVar;
    }

    @Override // m01.g
    public final Object A0(String str, int i14, int i15, n01.f fVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new w(this, i14, i15, str, null), fVar);
    }

    @Override // m01.g
    public final Object B(v13.c cVar) {
        return X0("nutrition.pregnancy.starting.goal.suggestion.opened", true, cVar);
    }

    @Override // m01.g
    public final Object D0(j01.a aVar, v01.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new l(this, aVar, null), iVar);
    }

    @Override // m01.g
    public final Object E(int i14, String str, boolean z14, v01.q0 q0Var) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new d0(this, i14, str, z14, null), q0Var);
    }

    @Override // m01.g
    public final Object G0(f01.c cVar, v01.l0 l0Var) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new z(this, cVar, null), l0Var);
    }

    @Override // m01.g
    public final Object H(String str, j01.a aVar, f2 f2Var) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new f1(this, str, aVar, null), f2Var);
    }

    @Override // m01.g
    public final Object I(u21.x0 x0Var) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new q(this, null), x0Var);
    }

    @Override // m01.g
    public final Object K0(long j8, boolean z14, l11.q qVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new e1(this, j8, z14, null), qVar);
    }

    @Override // m01.g
    public final Object L(g01.b bVar, v01.g gVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new w0(this, bVar, null), gVar);
    }

    @Override // m01.g
    public final Object L0(b63.o oVar, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new v(this, oVar, null), iVar);
    }

    @Override // m01.g
    public final Object M(String str, v01.t tVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new m(this, str, null), tVar);
    }

    @Override // m01.g
    public final Object N(PhotoCategory photoCategory, String str, MultipartBody.Part part, r1 r1Var) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new c1(this, photoCategory, str, part, null), r1Var);
    }

    @Override // m01.g
    public final Object N0(b63.o oVar, b63.o oVar2, x1 x1Var) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new q0(this, oVar, oVar2, null), x1Var);
    }

    @Override // m01.g
    public final Object O(int i14, int i15, String str, String str2, v13.c cVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new s(this, str, str2, i14, i15, null), cVar);
    }

    @Override // m01.g
    public final Object P0(i01.g gVar, m1 m1Var) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new u0(this, gVar, null), m1Var);
    }

    @Override // m01.g
    public final Object R(b63.o oVar, i01.d dVar, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new i(this, oVar, dVar, null), iVar);
    }

    @Override // m01.g
    public final Object T(l01.l lVar, u21.o0.b bVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new k(this, lVar, null), bVar);
    }

    @Override // m01.g
    public final Object T0(String str, String str2, String str3, m21.t tVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new l0(this, str, str2, str3, null), tVar);
    }

    @Override // m01.g
    public final Object V(String str, String str2, String str3, y21.b bVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new a0(this, str, str2, str3, null), bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object W0(String str, v13.c cVar) {
        o0 o0Var;
        if (cVar instanceof o0) {
            o0Var = (o0) cVar;
            int i14 = o0Var.f115649c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                o0Var.f115649c = i14 - Integer.MIN_VALUE;
            } else {
                o0Var = new o0(this, cVar);
            }
        } else {
            o0Var = new o0(this, cVar);
        }
        Object objJ = o0Var.f115647a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = o0Var.f115649c;
        if (i15 == 0) {
            o13.r.b(objJ);
            p0 p0Var = new p0(this, str, null);
            o0Var.f115649c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, p0Var, o0Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            v2.b bVar = (v2.b) v2Var;
            return new v2.b(((f01.k) bVar.f47386a).f67720b, bVar.f47387b, bVar.f47388c, bVar.f47389d);
        }
        if (v2Var instanceof v2.a) {
            return v2Var;
        }
        lc.u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object X0(String str, boolean z14, v13.c cVar) {
        a1 a1Var;
        if (cVar instanceof a1) {
            a1Var = (a1) cVar;
            int i14 = a1Var.f115536d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a1Var.f115536d = i14 - Integer.MIN_VALUE;
            } else {
                a1Var = new a1(this, cVar);
            }
        } else {
            a1Var = new a1(this, cVar);
        }
        Object objJ = a1Var.f115534b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = a1Var.f115536d;
        if (i15 == 0) {
            o13.r.b(objJ);
            b1 b1Var = new b1(str, z14, this, null);
            a1Var.f115533a = z14;
            a1Var.f115536d = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, b1Var, a1Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = a1Var.f115533a;
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            v2.b bVar = (v2.b) v2Var;
            return new v2.b(Boolean.valueOf(z14), bVar.f47387b, bVar.f47388c, null, 8, null);
        }
        if (v2Var instanceof v2.a) {
            v2.a aVar2 = (v2.a) v2Var;
            return new v2.a(aVar2.f47383a, aVar2.f47384b, aVar2.f47385c);
        }
        lc.u0.r();
        return null;
    }

    @Override // m01.g
    public final Object Y(b63.o oVar, v13.c cVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new m0(this, oVar, null), cVar);
    }

    @Override // m01.g
    public final Object a(v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new r(this, null), iVar);
    }

    @Override // m01.g
    public final Object a0(i01.h hVar, m1 m1Var) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new r0(this, hVar, null), m1Var);
    }

    @Override // m01.g
    public final Object b(long j8, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new n(this, j8, null), iVar);
    }

    @Override // m01.g
    public final Object b0(int i14, b63.o oVar, l01.k kVar, v13.c cVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new y0(this, i14, oVar, null, kVar, null), cVar);
    }

    @Override // m01.g
    public final Object c(i21.p pVar) {
        return X0("nutrition.whats.new.opened", true, pVar);
    }

    @Override // m01.g
    public final Object c0(String str, v01.v vVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new p(this, str, null), vVar);
    }

    @Override // m01.g
    public final Object d(b63.o oVar, b63.o oVar2, s11.f fVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new c0(this, oVar, oVar2, null), fVar);
    }

    @Override // m01.g
    public final Object d0(PhotoCategory photoCategory, String str, v13.c cVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new o(this, photoCategory, str, null), cVar);
    }

    @Override // m01.g
    public final Object f(i01.c cVar, v01.a aVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new j(this, cVar, null), aVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // m01.g
    public final Object f0(v13.c cVar) {
        g0 g0Var;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i14 = g0Var.f115592c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                g0Var.f115592c = i14 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(this, cVar);
            }
        } else {
            g0Var = new g0(this, cVar);
        }
        Object objW0 = g0Var.f115590a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = g0Var.f115592c;
        if (i15 == 0) {
            o13.r.b(objW0);
            g0Var.f115592c = 1;
            objW0 = W0("nutrition.pregnancy.completion.goal.suggestion.opened", g0Var);
            if (objW0 == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objW0);
        }
        v2 v2Var = (v2) objW0;
        if (v2Var instanceof v2.b) {
            v2.b bVar = (v2.b) v2Var;
            return new v2.b(Boolean.valueOf(Boolean.parseBoolean((String) bVar.f47386a)), bVar.f47387b, bVar.f47388c, bVar.f47389d);
        }
        if (v2Var instanceof v2.a) {
            return v2Var;
        }
        lc.u0.r();
        return null;
    }

    @Override // m01.g
    public final Object g(g01.i iVar, v01.d dVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new v0(this, iVar, null), dVar);
    }

    @Override // m01.g
    public final Object i(String str, v01.x xVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new d1(this, str, null), xVar);
    }

    @Override // m01.g
    public final Object j(String str, int i14, int i15, String str2, String str3, n01.k kVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new z0(this, str, i14, i15, str2, str3, null), kVar);
    }

    @Override // m01.g
    public final Object j0(List list, v01.h0 h0Var) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new e0(this, list, null), h0Var);
    }

    @Override // m01.g
    public final Object k(String str, v13.c cVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new j0(this, str, true, null), cVar);
    }

    @Override // m01.g
    public final Object l(String str, g01.u uVar, String str2, Double d14, String str3, String str4, v01.x xVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new t0(this, str, str2, uVar, d14, str3, str4, null), xVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // m01.g
    public final Object m(v13.c cVar) {
        h0 h0Var;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i14 = h0Var.f115598c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                h0Var.f115598c = i14 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(this, cVar);
            }
        } else {
            h0Var = new h0(this, cVar);
        }
        Object objW0 = h0Var.f115596a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = h0Var.f115598c;
        if (i15 == 0) {
            o13.r.b(objW0);
            h0Var.f115598c = 1;
            objW0 = W0("nutrition.pregnancy.starting.goal.suggestion.opened", h0Var);
            if (objW0 == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objW0);
        }
        v2 v2Var = (v2) objW0;
        if (v2Var instanceof v2.b) {
            v2.b bVar = (v2.b) v2Var;
            return new v2.b(Boolean.valueOf(Boolean.parseBoolean((String) bVar.f47386a)), bVar.f47387b, bVar.f47388c, bVar.f47389d);
        }
        if (v2Var instanceof v2.a) {
            return v2Var;
        }
        lc.u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // m01.g
    public final Object m0(v13.c cVar) {
        f0 f0Var;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i14 = f0Var.f115585c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f0Var.f115585c = i14 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(this, cVar);
            }
        } else {
            f0Var = new f0(this, cVar);
        }
        Object objW0 = f0Var.f115583a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = f0Var.f115585c;
        if (i15 == 0) {
            o13.r.b(objW0);
            f0Var.f115585c = 1;
            objW0 = W0("nutrition.whats.new.opened", f0Var);
            if (objW0 == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objW0);
        }
        v2 v2Var = (v2) objW0;
        if (v2Var instanceof v2.b) {
            v2.b bVar = (v2.b) v2Var;
            return new v2.b(Boolean.valueOf(Boolean.parseBoolean((String) bVar.f47386a)), bVar.f47387b, bVar.f47388c, bVar.f47389d);
        }
        if (v2Var instanceof v2.a) {
            return v2Var;
        }
        lc.u0.r();
        return null;
    }

    @Override // m01.g
    public final Object o(int i14, b63.o oVar, g01.z zVar, v13.c cVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new x0(this, i14, oVar, zVar, null), cVar);
    }

    @Override // m01.g
    public final Object o0(int i14, int i15, String str, n01.p pVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new k0(this, i14, i15, str, null), pVar);
    }

    @Override // m01.g
    public final Object p0(int i14, int i15, String str, Long l14, v13.c cVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new t(this, str, l14, i14, i15, null), cVar);
    }

    @Override // m01.g
    public final Object q(b63.o oVar, b63.o oVar2, b63.o oVar3, v13.c cVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new u(this, oVar, oVar2, oVar3, null), cVar);
    }

    @Override // m01.g
    public final Object r(int i14, int i15, Long l14, n01.m mVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new i0(this, i14, i15, null, l14, null), mVar);
    }

    @Override // m01.g
    public final Object s0(i21.n nVar) {
        return X0("nutrition.pregnancy.completion.goal.suggestion.opened", true, nVar);
    }

    @Override // m01.g
    public final Object t(g01.k kVar, t1 t1Var) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new s0(this, kVar, null), t1Var);
    }

    @Override // m01.g
    public final Object u0(x01.h hVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new n0(this, null), hVar);
    }

    @Override // m01.g
    public final Object v(b63.o oVar, boolean z14, boolean z15, v01.o0 o0Var) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new b0(this, oVar, z14, z15, null), o0Var);
    }

    @Override // m01.g
    public final Object v0(String str, String str2, String str3, x11.c cVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new y(this, str, str2, str3, null), cVar);
    }

    @Override // m01.g
    public final Object y(g01.d0 d0Var, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new x(this, d0Var, null), iVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lm01/h$a;", "", "<init>", "()V", "", "NUTRITION_PREFERENCE_KEY_PREGNANCY_STARTING_GOAL_SUGGESTION", "Ljava/lang/String;", "NUTRITION_PREFERENCE_KEY_PREGNANCY_COMPLETION_GOAL_SUGGESTION", "NUTRITION_PREFERENCE_KEY_WHATS_NEW", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
