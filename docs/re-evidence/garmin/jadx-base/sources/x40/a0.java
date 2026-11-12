package x40;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La50/g;", "data", "", "<anonymous>", "(La50/g;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseViewModel$convertToGCJ02IfNeeded$2", f = "CreateCustomCourseViewModel.kt", l = {398}, m = "invokeSuspend", v = 2)
public final class a0 extends v13.i implements e23.p<a50.g, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f188654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f188655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f188656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f188657d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(l0 l0Var, e23.a<Unit> aVar, t13.d<? super a0> dVar) {
        super(2, dVar);
        this.f188656c = l0Var;
        this.f188657d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        a0 a0Var = new a0(this.f188656c, this.f188657d, dVar);
        a0Var.f188655b = obj;
        return a0Var;
    }

    @Override // e23.p
    public final Object invoke(a50.g gVar, t13.d<? super Unit> dVar) {
        return ((a0) create(gVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a0 a0Var;
        a50.g gVar = (a50.g) this.f188655b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f188654a;
        if (i14 == 0) {
            o13.r.b(obj);
            l0 l0Var = this.f188656c;
            if (gVar != null) {
                p2 p2Var = l0Var.F;
                p2Var.k(null, a50.g.a(gVar, false, null, false, null, false, null, null, null, 0, false, false, false, false, null, ((a50.g) p2Var.getValue()).f1405p, 32767));
                l0Var.D4(new a50.e.a1(com.garmin.android.library.mapsdkadapter.i.b.GCJ02));
                a0Var = this;
                a0Var.f188655b = null;
                a0Var.f188654a = 1;
                if (o53.m0.b(500L, a0Var) == aVar) {
                    return aVar;
                }
            } else {
                l0Var.D4(a50.e.m0.f1357a);
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a0Var = this;
        a0Var.f188657d.invoke();
        return Unit.INSTANCE;
    }
}
