package nj2;

import androidx.lifecycle.y0;
import ch.qos.logback.classic.Logger;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.customermanagementlib.viewmodel.CustomerManagementViewModel$retrieveAddressDetail$1", f = "CustomerManagementViewModel.kt", l = {595}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f126350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f126351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f126352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f126353d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a aVar, String str, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f126352c = aVar;
        this.f126353d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f126352c, this.f126353d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        y0 y0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126351b;
        a aVar2 = this.f126352c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                Logger loggerG4 = aVar2.G4();
                StringBuilder sb3 = new StringBuilder("retrieveAddressDetail: id=");
                String str = this.f126353d;
                sb3.append(str);
                loggerG4.debug(sb3.toString());
                y0<List<fj2.i>> y0Var2 = aVar2.f126272z;
                dj2.a aVar3 = aVar2.f126249a;
                this.f126350a = y0Var2;
                this.f126351b = 1;
                Object objQ = aVar3.q(str, this);
                if (objQ == aVar) {
                    return aVar;
                }
                y0Var = y0Var2;
                obj = objQ;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y0Var = this.f126350a;
                o13.r.b(obj);
            }
            y0Var.m(obj);
        } catch (Exception e4) {
            int i15 = a.A;
            aVar2.I4(e4);
        }
        return Unit.INSTANCE;
    }
}
