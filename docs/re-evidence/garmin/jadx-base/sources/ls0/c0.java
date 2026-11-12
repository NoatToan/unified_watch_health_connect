package ls0;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.TripSetupViewModel$saveTrip$1", f = "TripSetupViewModel.kt", l = {122, 124}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yr0.o f114706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f114707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e f114708c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e eVar, t13.d<? super c0> dVar) {
        super(2, dVar);
        this.f114708c = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c0(this.f114708c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        yr0.o oVar;
        v2 v2Var;
        v2.b bVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f114707b;
        com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e eVar = this.f114708c;
        if (i14 == 0) {
            o13.r.b(obj);
            eVar.f37115m.j(g3.a.c(g3.f35298f));
            yr0.o oVarX4 = eVar.x4();
            if (!oVarX4.equals(eVar.f37103a)) {
                boolean zZ4 = eVar.z4();
                zr0.a aVar2 = eVar.f37105c;
                if (zZ4) {
                    this.f114706a = oVarX4;
                    this.f114707b = 1;
                    Object objD = aVar2.d(oVarX4, this);
                    if (objD != aVar) {
                        oVar = oVarX4;
                        obj = objD;
                        v2Var = (v2) obj;
                        if (v2Var instanceof v2.b) {
                            bVar = (v2.b) v2Var;
                            if (bVar.f47387b != 204) {
                                oVar = (yr0.o) bVar.f47386a;
                            }
                            y0<g3<yr0.o>> y0Var = eVar.f37115m;
                            g3.f35298f.getClass();
                            y0Var.j(g3.a.d(oVar));
                        } else {
                            if (v2Var instanceof v2.a) {
                                u0.r();
                                return null;
                            }
                            eVar.f37115m.j(g3.a.a(g3.f35298f, ((v2.a) v2Var).f47385c, null, null, null, 14));
                        }
                    }
                } else {
                    this.f114706a = oVarX4;
                    this.f114707b = 2;
                    Object objG = aVar2.g(oVarX4, this);
                    if (objG != aVar) {
                        oVar = oVarX4;
                        obj = objG;
                        v2Var = (v2) obj;
                        if (v2Var instanceof v2.b) {
                            bVar = (v2.b) v2Var;
                            if (bVar.f47387b != 204) {
                                oVar = (yr0.o) bVar.f47386a;
                            }
                            y0<g3<yr0.o>> y0Var2 = eVar.f37115m;
                            g3.f35298f.getClass();
                            y0Var2.j(g3.a.d(oVar));
                        } else {
                            if (v2Var instanceof v2.a) {
                                u0.r();
                                return null;
                            }
                            eVar.f37115m.j(g3.a.a(g3.f35298f, ((v2.a) v2Var).f47385c, null, null, null, 14));
                        }
                    }
                }
                return aVar;
            }
            eVar.f37115m.j(g3.a.d(null));
        } else if (i14 == 1) {
            oVar = this.f114706a;
            o13.r.b(obj);
            v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                bVar = (v2.b) v2Var;
                if (bVar.f47387b != 204) {
                    oVar = (yr0.o) bVar.f47386a;
                }
                y0<g3<yr0.o>> y0Var3 = eVar.f37115m;
                g3.f35298f.getClass();
                y0Var3.j(g3.a.d(oVar));
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                eVar.f37115m.j(g3.a.a(g3.f35298f, ((v2.a) v2Var).f47385c, null, null, null, 14));
            }
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oVar = this.f114706a;
            o13.r.b(obj);
            v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                bVar = (v2.b) v2Var;
                if (bVar.f47387b != 204) {
                    oVar = (yr0.o) bVar.f47386a;
                }
                y0<g3<yr0.o>> y0Var4 = eVar.f37115m;
                g3.f35298f.getClass();
                y0Var4.j(g3.a.d(oVar));
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                eVar.f37115m.j(g3.a.a(g3.f35298f, ((v2.a) v2Var).f47385c, null, null, null, 14));
            }
        }
        return Unit.INSTANCE;
    }
}
