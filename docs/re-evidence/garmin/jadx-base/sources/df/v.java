package df;

import android.content.Context;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ve.d1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lo53/b0;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "androidx.work.impl.utils.WorkForegroundKt$workForeground$2", f = "WorkForeground.kt", l = {42, 50}, m = "invokeSuspend")
public final class v extends v13.i implements e23.p<b0, t13.d<? super Void>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f59429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.work.d f59430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cf.t f59431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ue.n f59432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f59433e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.work.d dVar, cf.t tVar, ue.n nVar, Context context, t13.d<? super v> dVar2) {
        super(2, dVar2);
        this.f59430b = dVar;
        this.f59431c = tVar;
        this.f59432d = nVar;
        this.f59433e = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f59430b, this.f59431c, this.f59432d, this.f59433e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Void> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f59429a;
        androidx.work.d dVar = this.f59430b;
        if (i14 == 0) {
            o13.r.b(obj);
            androidx.concurrent.futures.b.d dVarA = dVar.a();
            this.f59429a = 1;
            obj = d1.a(dVarA, dVar, this);
            if (obj != aVar) {
            }
        }
        if (i14 != 1) {
            if (i14 == 2) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ue.m mVar = (ue.m) obj;
        cf.t tVar = this.f59431c;
        if (mVar == null) {
            vb.h.z(am.j.o(tVar.f26943c, ") but did not provide ForegroundInfo", new StringBuilder("Worker was marked important (")));
            return null;
        }
        int i15 = w.f59434a;
        ue.u uVarA = ue.u.a();
        String str = tVar.f26943c;
        uVarA.getClass();
        androidx.concurrent.futures.b.d dVarA2 = this.f59432d.a(this.f59433e, dVar.f11470b.f11426a, mVar);
        this.f59429a = 2;
        Object objK = lg.d.k(dVarA2, this);
        return objK == aVar ? aVar : objK;
    }
}
