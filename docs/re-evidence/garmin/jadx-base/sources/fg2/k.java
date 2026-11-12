package fg2;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.repositories.LiveActivityRepository$registerBluetoothListener$1", f = "LiveActivityRepository.kt", l = {429}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f71523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f71524b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f71525a;

        public a(f fVar) {
            this.f71525a = fVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            Object objB;
            if (((Boolean) obj).booleanValue()) {
                return Unit.INSTANCE;
            }
            zg2.c.f204692a.getClass();
            zg2.c.a("LiveActivityRepository", "Emit disconnected event.");
            of2.b0 b0Var = (of2.b0) this.f71525a.f71482f.getValue();
            return (b0Var == null || (objB = b0Var.b(sf2.a.f.f158890a, dVar)) != u13.a.COROUTINE_SUSPENDED) ? Unit.INSTANCE : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f fVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f71524b = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f71524b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f71523a;
        if (i14 == 0) {
            o13.r.b(obj);
            f fVar = this.f71524b;
            p2 p2Var = fVar.f71480d.f125898a;
            a aVar2 = new a(fVar);
            this.f71523a = 1;
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
