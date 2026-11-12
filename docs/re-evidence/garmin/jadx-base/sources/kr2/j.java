package kr2;

import android.content.Context;
import com.garmin.garminpay.database.GarminPayCoreDatabase;
import e23.p;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import tn2.r0;
import tn2.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.developer.viewmodels.DeveloperSettingViewModel$expertInitializeChipForFelica$2", f = "DeveloperSettingViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ps2.n f106366a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ps2.n nVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f106366a = nVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f106366a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        tn2.c cVar = tn2.c.f165530a;
        t0 t0Var = s0.f105811a;
        k23.d dVarB = t0Var.b(rd2.f.class);
        rd2.f fVarA = rd2.f.a();
        fVarA.getClass();
        cVar.getClass();
        tn2.c.a(dVarB, fVarA);
        k23.d dVarB2 = t0Var.b(es2.a.class);
        GarminPayCoreDatabase.b bVar = GarminPayCoreDatabase.f52316a;
        Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        bVar.getClass();
        tn2.c.a(dVarB2, GarminPayCoreDatabase.b.a(contextC).e());
        ps2.n nVar = this.f106366a;
        new r0(new w(nVar.f140499b, nVar.f140498a), null, null, null, null, 30, null).j().e();
        return Unit.INSTANCE;
    }
}
