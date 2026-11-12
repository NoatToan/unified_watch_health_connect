package h50;

import ds.g0;
import e23.p;
import h2.j0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p0;
import p3.x3;
import r53.c2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.list.components.CoursesTabsPagerKt$CoursesTabsPager$2$1", f = "CoursesTabsPager.kt", l = {51}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f82068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f82069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<i50.a, Unit> f82070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x3<i50.i> f82071d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<i50.a, Unit> f82072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<i50.i> f82073b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super i50.a, Unit> lVar, x3<? extends i50.i> x3Var) {
            this.f82072a = lVar;
            this.f82073b = x3Var;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            i50.i iVar = m.f82074a.get(((Number) obj).intValue());
            if (iVar != this.f82073b.getF182175a()) {
                this.f82072a.invoke(new i50.a.q(iVar));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(j0 j0Var, e23.l<? super i50.a, Unit> lVar, x3<? extends i50.i> x3Var, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f82069b = j0Var;
        this.f82070c = lVar;
        this.f82071d = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f82069b, this.f82070c, this.f82071d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f82068a;
        if (i14 == 0) {
            r.b(obj);
            c2 c2VarS = p0.s(new g0(this.f82069b, 6));
            a aVar2 = new a(this.f82070c, this.f82071d);
            this.f82068a = 1;
            if (c2VarS.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
