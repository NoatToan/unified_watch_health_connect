package ug2;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import p3.x3;
import r53.p2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.ui.main.MainViewKt$MainView$2$1", f = "MainView.kt", l = {251}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f170758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wg2.g f170759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<Boolean, Unit> f170760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f170761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x3<Boolean> f170762e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<Boolean, Unit> f170763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f170764b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<Boolean> f170765c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super Boolean, Unit> lVar, p1<Boolean> p1Var, x3<Boolean> x3Var) {
            this.f170763a = lVar;
            this.f170764b = p1Var;
            this.f170765c = x3Var;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            wg2.f fVar = (wg2.f) obj;
            if (p005kotlin.jvm.internal.s.g(fVar, wg2.f.a.f185144a)) {
                this.f170764b.setValue(Boolean.FALSE);
                Boolean f182175a = this.f170765c.getF182175a();
                f182175a.booleanValue();
                this.f170763a.invoke(f182175a);
            } else if (fVar != null) {
                lc.u0.r();
                return null;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e0(wg2.g gVar, e23.l<? super Boolean, Unit> lVar, p1<Boolean> p1Var, x3<Boolean> x3Var, t13.d<? super e0> dVar) {
        super(2, dVar);
        this.f170759b = gVar;
        this.f170760c = lVar;
        this.f170761d = p1Var;
        this.f170762e = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e0(this.f170759b, this.f170760c, this.f170761d, this.f170762e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f170758a;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = this.f170759b.f185156k;
            a aVar2 = new a(this.f170760c, this.f170761d, this.f170762e);
            this.f170758a = 1;
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
