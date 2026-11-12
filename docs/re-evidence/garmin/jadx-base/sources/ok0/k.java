package ok0;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.o2;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.activity.ActivityDetailsGearFragmentViewModel$initCollector$2", f = "ActivityDetailsGearFragmentViewModel.kt", l = {142}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f132495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c80.b f132496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f132497c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f132498a;

        public a(g gVar) {
            this.f132498a = gVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            c80.c cVar = (c80.c) obj;
            p2 p2Var = this.f132498a.f132475e;
            boolean z14 = false;
            if (cVar != null && cVar.f25309b) {
                z14 = true;
            }
            p2Var.k(null, new g.a(z14));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(c80.b bVar, g gVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f132496b = bVar;
        this.f132497c = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f132496b, this.f132497c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f132495a;
        if (i14 == 0) {
            o13.r.b(obj);
            o2<c80.c> o2Var = this.f132496b.f25295a;
            a aVar2 = new a(this.f132497c);
            this.f132495a = 1;
            if (o2Var.collect(aVar2, this) == aVar) {
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
