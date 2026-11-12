package androidx.lifecycle;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lo53/b0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.jvm.kt", l = {213}, m = "invokeSuspend", v = 1)
public final class c1 extends v13.i implements e23.p<o53.b0, t13.d<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f7851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0.b f7852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.p<o53.b0, t13.d<Object>, Object> f7853e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c1(b0 b0Var, b0.b bVar, e23.p<? super o53.b0, ? super t13.d<Object>, ? extends Object> pVar, t13.d<? super c1> dVar) {
        super(2, dVar);
        this.f7851c = b0Var;
        this.f7852d = bVar;
        this.f7853e = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c1 c1Var = new c1(this.f7851c, this.f7852d, this.f7853e, dVar);
        c1Var.f7850b = obj;
        return c1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<Object> dVar) {
        return ((c1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        c0 c0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f7849a;
        if (i14 != 0) {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0Var = (c0) this.f7850b;
            try {
                o13.r.b(obj);
                c0Var.a();
                return obj;
            } catch (Throwable th3) {
                th = th3;
                c0Var.a();
                throw th;
            }
        }
        o13.r.b(obj);
        o53.l1 l1Var = (o53.l1) ((o53.b0) this.f7850b).getF195311f().get(o53.l1.f129368i0);
        if (l1Var == null) {
            vb.h.z("when[State] methods should have a parent job");
            return null;
        }
        b1 b1Var = new b1();
        c0 c0Var2 = new c0(this.f7851c, this.f7852d, b1Var.f7839a, l1Var);
        try {
            e23.p<o53.b0, t13.d<Object>, Object> pVar = this.f7853e;
            this.f7850b = c0Var2;
            this.f7849a = 1;
            obj = ge1.b.e0(b1Var, pVar, this);
            if (obj == aVar) {
                return aVar;
            }
            c0Var = c0Var2;
            c0Var.a();
            return obj;
        } catch (Throwable th4) {
            th = th4;
            c0Var = c0Var2;
            c0Var.a();
            throw th;
        }
    }
}
