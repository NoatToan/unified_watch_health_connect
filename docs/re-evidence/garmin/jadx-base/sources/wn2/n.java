package wn2;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import tn2.r0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.felica.ui.account.developer.FelicaConsoleViewModel$initialize$1", f = "FelicaConsoleViewModel.kt", l = {452}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.providers.felica.ui.account.developer.a f186383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f186384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f186385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f186386e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVar, String str, String str2, String str3, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f186383b = aVar;
        this.f186384c = str;
        this.f186385d = str2;
        this.f186386e = str3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f186383b, this.f186384c, this.f186385d, this.f186386e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f186382a;
        if (i14 == 0) {
            o13.r.b(obj);
            String str = this.f186384c;
            com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVar2 = this.f186383b;
            aVar2.f51034h = str;
            aVar2.f51035i = this.f186385d;
            aVar2.f51036j = this.f186386e;
            r0 r0Var = aVar2.f51030d;
            if (r0Var == null) {
                p005kotlin.jvm.internal.s.m("felicaService");
                throw null;
            }
            e13.k kVarJ = r0Var.j();
            this.f186382a = 1;
            if (aVar2.x4(kVarJ, "InitializeChip", new wl.a(6), this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
