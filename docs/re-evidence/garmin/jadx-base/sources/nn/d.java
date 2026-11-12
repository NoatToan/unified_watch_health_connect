package nn;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.health.BaseViewModel$subscribeToEvents$1", f = "BaseViewModel.kt", l = {48}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f126666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c<k, l, j> f126667b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c<k, l, j> f126668a;

        public a(c<k, l, j> cVar) {
            this.f126668a = cVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            this.f126668a.z4((k) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c<k, l, j> cVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f126667b = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f126667b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126666a;
        if (i14 == 0) {
            r.b(obj);
            c<k, l, j> cVar = this.f126667b;
            e2 e2Var = cVar.f126660d;
            a aVar2 = new a(cVar);
            this.f126666a = 1;
            e2Var.getClass();
            if (e2.m(e2Var, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        o2.c.f();
        return null;
    }
}
