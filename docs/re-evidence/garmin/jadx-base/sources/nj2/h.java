package nj2;

import androidx.lifecycle.y0;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.customermanagementlib.viewmodel.CustomerManagementViewModel$loadAddresses$1", f = "CustomerManagementViewModel.kt", l = {389}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f126318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f126319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f126320c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f126320c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f126320c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        y0 y0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126319b;
        a aVar2 = this.f126320c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                aVar2.G4().debug("loadAddresses");
                aVar2.f126252d.setValue(Boolean.TRUE);
                y0<List<fj2.a>> y0Var2 = aVar2.f126262n;
                dj2.a aVar3 = aVar2.f126249a;
                this.f126318a = y0Var2;
                this.f126319b = 1;
                Object objI = aVar3.i(this);
                if (objI == aVar) {
                    return aVar;
                }
                y0Var = y0Var2;
                obj = objI;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y0Var = this.f126318a;
                o13.r.b(obj);
            }
            y0Var.m(obj);
            aVar2.f126252d.setValue(Boolean.FALSE);
        } catch (Exception e4) {
            aVar2.f126252d.setValue(Boolean.FALSE);
            aVar2.I4(e4);
        }
        return Unit.INSTANCE;
    }
}
