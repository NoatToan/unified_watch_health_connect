package gw0;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.reports.LifestyleReportsViewModel$updateDailyBehaviourLog$1", f = "LifestyleReportsViewModel.kt", l = {220, 222}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f79814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pv0.h f79815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f79816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b63.o f79817d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(pv0.h hVar, u uVar, b63.o oVar, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f79815b = hVar;
        this.f79816c = uVar;
        this.f79817d = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f79815b, this.f79816c, this.f79817d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r7 == r0) goto L21;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f79814a;
        b63.o oVar = this.f79817d;
        u uVar = this.f79816c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                pv0.h hVar = this.f79815b;
                if (hVar.f141379f == null) {
                    rv0.a aVar2 = uVar.f79760a;
                    this.f79814a = 1;
                    obj = aVar2.c(oVar, hVar, this);
                    if (obj == aVar) {
                    }
                    v2Var = (v2) obj;
                } else {
                    rv0.a aVar3 = uVar.f79760a;
                    this.f79814a = 2;
                    obj = aVar3.d(oVar, hVar, this);
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                v2Var = (v2) obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                v2Var = (v2) obj;
            }
            if (v2Var instanceof v2.b) {
                uVar.f79776q.h();
                uVar.f79777r.h();
                uVar.f79778t.h();
                uVar.f79779v.h();
                uVar.f79762c.T3(true);
                if (p005kotlin.jvm.internal.s.g(oVar, uVar.f79767h)) {
                    uVar.f79764e.a(AbstractComponentTracker.LINGERING_TIMEOUT);
                }
            } else {
                if (!(v2Var instanceof v2.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                uVar.x4(oVar, true);
            }
        } catch (Exception unused) {
            uVar.x4(oVar, true);
        }
        return Unit.INSTANCE;
    }
}
