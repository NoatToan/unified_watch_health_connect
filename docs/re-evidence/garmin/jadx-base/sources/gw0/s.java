package gw0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.reports.LifestyleLoggingReportsScreenKt$LifestyleLoggingReportsScreen$1$1", f = "LifestyleLoggingReportsScreen.kt", l = {94}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f79753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n82.f f79754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f79755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x3<h0> f79756d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(n82.f fVar, u uVar, x3<h0> x3Var, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f79754b = fVar;
        this.f79755c = uVar;
        this.f79756d = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s(this.f79754b, this.f79755c, this.f79756d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f79753a;
        if (i14 == 0) {
            o13.r.b(obj);
            b63.o oVar = this.f79756d.getF182175a().f79617i;
            if (oVar != null) {
                n82.f fVar = this.f79754b;
                o82.g gVarA = fVar.f124961b.a();
                o82.g gVar = o82.g.f130850c;
                if (gVarA == gVar) {
                    this.f79753a = 1;
                    if (fVar.a(oVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    fVar.e(gVar, oVar);
                }
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        this.f79755c.C4(null);
        return Unit.INSTANCE;
    }
}
