package hx0;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsViewModel$getSettingsAndCheckIfMCTIsConfigured$1", f = "MenstrualCycleDetailsViewModel.kt", l = {327}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f86198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f86199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y0<fw.m<Boolean>> f86200d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(s sVar, y0<fw.m<Boolean>> y0Var, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f86199c = sVar;
        this.f86200d = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        y yVar = new y(this.f86199c, this.f86200d, dVar);
        yVar.f86198b = obj;
        return yVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        s sVar = this.f86199c;
        o53.b0 b0Var = (o53.b0) this.f86198b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f86197a;
        y0<fw.m<Boolean>> y0Var = this.f86200d;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                o53.s sVarB = gl.b.b();
                sVar.f86146j = new Long(((ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null)).i(new s.b(sVar, sVarB)));
                this.f86198b = b0Var;
                this.f86197a = 1;
                if (sVarB.C(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            y0Var.j(fw.m.a.g(fw.m.f73767e, Boolean.valueOf(((ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null)).d()), 1));
        } catch (Throwable th3) {
            String str = s.f86136o;
            String strP = am.j.p("Exception thrown from MctDelegate.getAndSaveUserSettingsFromGC(): ", th3);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, str, strP);
            y0Var.j(fw.m.a.g(fw.m.f73767e, Boolean.valueOf(((ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null)).d()), 1));
        }
        return Unit.INSTANCE;
    }
}
