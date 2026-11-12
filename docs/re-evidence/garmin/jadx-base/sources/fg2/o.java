package fg2;

import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import r53.p2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.repositories.LiveActivityRepository$registerSessionListener$1", f = "LiveActivityRepository.kt", l = {394}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f71544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f71545b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f71546a;

        public a(f fVar) {
            this.f71546a = fVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            of2.b bVar = (of2.b) obj;
            zg2.c.f204692a.getClass();
            zg2.c.a("LiveActivityRepository", "collect new session " + bVar);
            f fVar = this.f71546a;
            fVar.getClass();
            if (bVar == null) {
                fVar.f71482f.setValue(null);
                fVar.f71500x = null;
                fVar.f71499w = null;
                fVar.D = null;
                fVar.f71485i.k(null, Boolean.FALSE);
                fVar.f71493q.setValue(fg2.a.d.f71402a);
                j0 j0Var = j0.f134944a;
            } else {
                x53.c cVar = s0.f129406a;
                ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new n(bVar, fVar, null), 3);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(f fVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f71545b = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f71545b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f71544a;
        if (i14 == 0) {
            o13.r.b(obj);
            f fVar = this.f71545b;
            p2 p2Var = fVar.f71478b.f131778g;
            a aVar2 = new a(fVar);
            this.f71544a = 1;
            if (p2Var.collect(aVar2, this) == aVar) {
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
