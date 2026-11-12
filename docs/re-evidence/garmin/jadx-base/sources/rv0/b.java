package rv0;

import c83.a0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import gw0.v;
import java.util.ArrayList;
import java.util.Set;
import lc.u0;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lrv0/b;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lrv0/a;", "Lnv0/a;", "lifestyleLoggingApi", "Lnv0/c;", "userPreferenceAPI", "<init>", "(Lnv0/a;Lnv0/c;)V", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements f0, rv0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f154624c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nv0.a f154625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nv0.c f154626b;

    /* JADX INFO: renamed from: rv0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.data.repository.LifestyleLoggingRepositoryImpl$deleteCustomBehaviour$2", f = "LifestyleLoggingRepositoryImpl.kt", l = {42}, m = "invokeSuspend", v = 2)
    public static final class C2931b extends v13.i implements e23.l<t13.d<? super a0<Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f154627a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f154629c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2931b(long j8, t13.d<? super C2931b> dVar) {
            super(1, dVar);
            this.f154629c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return b.this.new C2931b(this.f154629c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<Unit>> dVar) {
            return ((C2931b) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f154627a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            i0<a0<Unit>> i0VarG = b.this.f154625a.g(this.f154629c);
            this.f154627a = 1;
            Object objAwait = i0VarG.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    static {
        new a(null);
    }

    public b(nv0.a aVar, nv0.c cVar) {
        aVar.getClass();
        cVar.getClass();
        this.f154625a = aVar;
        this.f154626b = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object B(boolean z14, v13.c cVar) {
        o oVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f154675c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f154675c = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object objJ = oVar.f154673a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f154675c;
        if (i15 == 0) {
            o13.r.b(objJ);
            p pVar = new p(z14, this, null);
            oVar.f154675c = 1;
            objJ = f0.J(this, pVar, oVar);
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
            Boolean bool = ((nv0.b) bVar.f47386a).f127963b;
            return new v2.b(Boolean.valueOf(bool != null ? bool.booleanValue() : false), bVar.f47387b, bVar.f47388c, null, 8, null);
        }
        if (v2Var instanceof v2.a) {
            v2.a aVar2 = (v2.a) v2Var;
            return new v2.a(aVar2.f47383a, aVar2.f47384b, aVar2.f47385c);
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E(boolean z14, v13.c cVar) {
        q qVar;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i14 = qVar.f154682d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f154682d = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object objJ = qVar.f154680b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f154682d;
        if (i15 == 0) {
            o13.r.b(objJ);
            r rVar = new r(z14, this, null);
            qVar.f154679a = z14;
            qVar.f154682d = 1;
            objJ = f0.J(this, rVar, qVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = qVar.f154679a;
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
        u0.r();
        return null;
    }

    @Override // rv0.a
    public final Object a(long j8, String str, b63.o oVar, gw0.u.i iVar) {
        return f0.J(this, new j(this, j8, str, oVar, 12, null), iVar);
    }

    @Override // rv0.a
    public final Object b(ArrayList arrayList, tv0.m mVar) {
        return f0.J(this, new c(this, arrayList, null), mVar);
    }

    @Override // rv0.a
    public final Object c(b63.o oVar, pv0.h hVar, v vVar) {
        return f0.J(this, new e(this, hVar, oVar, null), vVar);
    }

    @Override // rv0.a
    public final Object d(b63.o oVar, pv0.h hVar, v vVar) {
        return f0.J(this, new u(this, hVar, oVar, null), vVar);
    }

    @Override // rv0.a
    public final Object f(pv0.a0 a0Var, v13.c cVar) {
        return f0.J(this, new s(this, a0Var, null), cVar);
    }

    @Override // rv0.a
    public final Object g(v13.c cVar) {
        return B(true, cVar);
    }

    @Override // rv0.a
    public final Object h(ew0.p pVar) {
        return E(true, pVar);
    }

    @Override // rv0.a
    public final Object i(b63.o oVar, v13.c cVar) {
        return f0.J(this, new f(this, oVar, null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // rv0.a
    public final Object k(v13.c cVar) {
        m mVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f154670c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f154670c = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objJ = mVar.f154668a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f154670c;
        if (i15 == 0) {
            o13.r.b(objJ);
            n nVar = new n(this, null);
            mVar.f154670c = 1;
            objJ = f0.J(this, nVar, mVar);
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
            Boolean bool = ((nv0.b) bVar.f47386a).f127963b;
            return new v2.b(Boolean.valueOf(bool != null ? bool.booleanValue() : false), bVar.f47387b, bVar.f47388c, null, 8, null);
        }
        if (v2Var instanceof v2.a) {
            v2.a aVar2 = (v2.a) v2Var;
            return new v2.a(aVar2.f47383a, aVar2.f47384b, aVar2.f47385c);
        }
        u0.r();
        return null;
    }

    @Override // rv0.a
    public final Object l(t13.d<? super v2<Boolean>> dVar) {
        return E(false, (v13.c) dVar);
    }

    @Override // rv0.a
    public final Object m(long j8, t13.d<? super v2<Unit>> dVar) {
        return f0.J(this, new C2931b(j8, null), dVar);
    }

    @Override // rv0.a
    public final Object n(b63.o oVar, gw0.u.e eVar) {
        return f0.J(this, new i(this, oVar, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // rv0.a
    public final Object o(v13.c cVar) {
        k kVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f154665c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f154665c = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objJ = kVar.f154663a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f154665c;
        if (i15 == 0) {
            o13.r.b(objJ);
            l lVar = new l(this, null);
            kVar.f154665c = 1;
            objJ = f0.J(this, lVar, kVar);
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
            Boolean bool = ((nv0.b) bVar.f47386a).f127963b;
            return new v2.b(Boolean.valueOf(bool != null ? bool.booleanValue() : false), bVar.f47387b, bVar.f47388c, null, 8, null);
        }
        if (v2Var instanceof v2.a) {
            v2.a aVar2 = (v2.a) v2Var;
            return new v2.a(aVar2.f47383a, aVar2.f47384b, aVar2.f47385c);
        }
        u0.r();
        return null;
    }

    @Override // rv0.a
    public final Object q(v13.c cVar) {
        return B(false, cVar);
    }

    @Override // rv0.a
    public final Object r(long j8, String str, b63.o oVar, b63.o oVar2, gw0.u.d dVar) {
        return f0.J(this, new g(this, j8, str, oVar, oVar2, null), dVar);
    }

    @Override // rv0.a
    public final Object t(Set set, tv0.j jVar) {
        return f0.J(this, new d(this, set, null), jVar);
    }

    @Override // rv0.a
    public final Object v(long j8, pv0.d dVar, tv0.o oVar) {
        return f0.J(this, new t(this, j8, dVar, null), oVar);
    }

    @Override // rv0.a
    public final Object y(String str, b63.o oVar, b63.o oVar2, gw0.u.c cVar) {
        return f0.J(this, new h(this, str, oVar, oVar2, null), cVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lrv0/b$a;", "", "<init>", "()V", "", "PREFERENCE_KEY_LIFESTYLE_ONBOARDING_DISPLAYED", "Ljava/lang/String;", "PREFERENCE_KEY_LIFESTYLE_AUTO_LOGGING_ENABLED", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
