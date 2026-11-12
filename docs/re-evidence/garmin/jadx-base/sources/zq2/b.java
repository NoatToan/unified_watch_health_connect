package zq2;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.addcard.AddCardFlowLauncher$launchAddCardWithExistingItem$1", f = "AddCardFlowLauncher.kt", l = {74, 79}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f206654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f206655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.ui.addcard.a f206656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qs2.d f206657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f206658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ns2.a<ms2.e> f206659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f206660g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(com.garmin.feature.garminpay.ui.addcard.a aVar, qs2.d dVar, long j8, ns2.a<? extends ms2.e> aVar2, String str, t13.d<? super b> dVar2) {
        super(2, dVar2);
        this.f206656c = aVar;
        this.f206657d = dVar;
        this.f206658e = j8;
        this.f206659f = aVar2;
        this.f206660g = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f206656c, this.f206657d, this.f206658e, this.f206659f, this.f206660g, dVar);
        bVar.f206655b = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (com.garmin.feature.garminpay.ui.addcard.a.b(r4, r5, r9.f206658e, r9.f206660g, r9) == r1) goto L19;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b bVar;
        b0 b0Var = (b0) this.f206655b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f206654a;
        if (i14 == 0) {
            r.b(obj);
            this.f206655b = b0Var;
            this.f206654a = 1;
            bVar = this;
            obj = com.garmin.feature.garminpay.ui.addcard.a.a(this.f206656c, this.f206657d, this.f206658e, this.f206659f, bVar);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
            bVar = this;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
        ms2.f fVar = (ms2.f) obj;
        com.garmin.feature.garminpay.ui.addcard.a aVar2 = bVar.f206656c;
        if (fVar == null) {
            com.garmin.feature.garminpay.ui.addcard.c.b(aVar2.f51835a, ar2.a.b.C0176b.f12566a);
            return Unit.INSTANCE;
        }
        bVar.f206655b = null;
        bVar.f206654a = 2;
    }
}
