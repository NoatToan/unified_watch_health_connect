package zq2;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import ps2.n;
import ps2.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.addcard.AddCardFlowLauncher$launchAddCardWithoutSelection$1", f = "AddCardFlowLauncher.kt", l = {119, 121}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f206661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f206662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ns2.a<ms2.e> f206663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.ui.addcard.a f206664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f206665e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(long j8, ns2.a<? extends ms2.e> aVar, com.garmin.feature.garminpay.ui.addcard.a aVar2, String str, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f206662b = j8;
        this.f206663c = aVar;
        this.f206664d = aVar2;
        this.f206665e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f206662b, this.f206663c, this.f206664d, this.f206665e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (com.garmin.feature.garminpay.ui.addcard.a.b(r9.f206664d, r4, r9.f206662b, r9.f206665e, r9) == r0) goto L18;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f206661a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        w.f140538a.getClass();
        n nVarI = w.i(this.f206662b);
        if (nVarI == null) {
            vb.h.s("Required value was null.");
            return null;
        }
        ms2.e eVar = (ms2.e) h0.b0(this.f206663c);
        this.f206661a = 1;
        obj = nVarI.j(eVar, this);
        if (obj != aVar) {
        }
        return aVar;
        ms2.f fVar = (ms2.f) h0.b0((ns2.a) obj);
        this.f206661a = 2;
    }
}
