package vo2;

import com.garmin.feature.garminpay.providers.gpay.sync.NewFitPayCreditCardSync;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lmn2/a;", "<anonymous>", "(Lo53/b0;)Lmn2/a;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.sync.NewFitPayCreditCardSync$getCardImageWidthHeight$1$1", f = "NewFitPayCreditCardSync.kt", l = {358}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<b0, t13.d<? super mn2.a>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f179211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewFitPayCreditCardSync f179212b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(NewFitPayCreditCardSync newFitPayCreditCardSync, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f179212b = newFitPayCreditCardSync;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f179212b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super mn2.a> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179211a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        NewFitPayCreditCardSync newFitPayCreditCardSync = this.f179212b;
        mn2.k kVar = newFitPayCreditCardSync.f51345e;
        kVar.getClass();
        long f99647a = newFitPayCreditCardSync.f51341a.f205816b.getF99647a();
        this.f179211a = 1;
        Object objA = mn2.m.a(kVar, f99647a, this);
        return objA == aVar ? aVar : objA;
    }
}
