package zq2;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ldr2/a$a;", "<anonymous>", "(Lo53/b0;)Ldr2/a$a;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.addcard.AddCardFlowLauncher$validateAndLaunchAddCard$error$1", f = "AddCardFlowLauncher.kt", l = {127}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super dr2.a.InterfaceC1294a>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f206672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.ui.addcard.a f206673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ms2.f f206674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f206675d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.garmin.feature.garminpay.ui.addcard.a aVar, ms2.f fVar, long j8, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f206673b = aVar;
        this.f206674c = fVar;
        this.f206675d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f206673b, this.f206674c, this.f206675d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super dr2.a.InterfaceC1294a> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f206672a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        dr2.a aVar2 = this.f206673b.f51836b;
        this.f206672a = 1;
        Object objC = aVar2.c(this.f206674c, this.f206675d, this);
        return objC == aVar ? aVar : objC;
    }
}
