package of2;

import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;
import r53.p2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSessionManager$registerStartInteractor$1", f = "LSVSessionManager.kt", l = {302}, m = "invokeSuspend", v = 2)
public final class k0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f131846b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c0 f131847a;

        public a(c0 c0Var) {
            this.f131847a = c0Var;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            Object objG;
            sf2.f fVar = (sf2.f) obj;
            zg2.c cVar = zg2.c.f204692a;
            String str = "startListener collect " + (fVar != null ? fVar.getClass().getName() : null);
            cVar.getClass();
            zg2.c.a("LSVSessionManager", str);
            if (fVar instanceof sf2.f.a) {
                sf2.f.a aVar = (sf2.f.a) fVar;
                Object objB = c0.b(this.f131847a, aVar.f158987a, aVar.f158988b, aVar.f158989c, aVar.f158990d, aVar.f158991e, aVar.f158992f, aVar.f158993g, dVar);
                return objB == u13.a.COROUTINE_SUSPENDED ? objB : Unit.INSTANCE;
            }
            if (fVar instanceof sf2.f.c) {
                sf2.f.c cVar2 = (sf2.f.c) fVar;
                Object objC = c0.c(this.f131847a, cVar2.f159005a, cVar2.f159006b, cVar2.f159007c, cVar2.f159008d, cVar2.f159009e, cVar2.f159012h, cVar2.f159010f, cVar2.f159011g, cVar2.f159013i, dVar);
                return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
            }
            boolean z14 = fVar instanceof sf2.f.d;
            c0 c0Var = this.f131847a;
            if (!z14) {
                if (fVar instanceof sf2.f.b) {
                    int i14 = c0.f131771p;
                    c0Var.f131772a.e((sf2.f.b) fVar);
                } else if (fVar != null) {
                    lc.u0.r();
                    return null;
                }
                return Unit.INSTANCE;
            }
            sf2.f.d dVar2 = (sf2.f.d) fVar;
            UUID uuid = dVar2.f159014a;
            zf2.a aVar2 = dVar2.f159015b;
            int i15 = c0.f131771p;
            c0Var.getClass();
            zg2.c.d("LSVSessionManager", "requestStartUnsupportedSport started.");
            b bVar = (b) c0Var.f131778g.getValue();
            if (bVar == null) {
                zg2.c.d("LSVSessionManager", "Ignoring request to start unsupported activity due to lack of active session.");
                objG = Unit.INSTANCE;
            } else {
                p2 p2Var = bVar.f131736o;
                zg2.c.d("LSVSessionManager", "Existing session found.");
                if (p005kotlin.jvm.internal.s.g(((b0) p2Var.getValue()).f131744a, uuid)) {
                    zg2.c.d("LSVSessionManager", "Change to unsupported sport " + aVar2.f204563b);
                    bVar.b(aVar2, null, null, new zf2.h(null, p13.j0.f134944a), false);
                    fg2.d0 d0Var = c0Var.f131781j;
                    b0 b0Var = (b0) p2Var.getValue();
                    qf2.a aVar3 = c0Var.f131780i;
                    objG = d0Var.g(b0Var, aVar3.f144650e, aVar3.f144651f, true, dVar);
                    if (objG != u13.a.COROUTINE_SUSPENDED) {
                        objG = Unit.INSTANCE;
                    }
                } else {
                    zg2.c.b("LSVSessionManager", "Aborting the current session.");
                    objG = c0Var.a(bVar, dVar);
                    if (objG != u13.a.COROUTINE_SUSPENDED) {
                        objG = Unit.INSTANCE;
                    }
                }
            }
            return objG == u13.a.COROUTINE_SUSPENDED ? objG : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(c0 c0Var, t13.d<? super k0> dVar) {
        super(2, dVar);
        this.f131846b = c0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k0(this.f131846b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131845a;
        if (i14 == 0) {
            o13.r.b(obj);
            c0 c0Var = this.f131846b;
            e2 e2Var = c0Var.f131773b.e().f170500a;
            a aVar2 = new a(c0Var);
            this.f131845a = 1;
            e2Var.getClass();
            if (e2.m(e2Var, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        o2.c.f();
        return null;
    }
}
