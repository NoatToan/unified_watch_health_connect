package oo2;

import e23.p;
import mn2.k;
import mn2.m;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lmn2/a;", "<anonymous>", "(Lo53/b0;)Lmn2/a;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.sync.SnowballSyncStrategy$getCardImageTlvs$dimensions$1", f = "SnowballSyncStrategy.kt", l = {99}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super mn2.a>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f133140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f133141b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f133141b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f133141b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super mn2.a> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f133140a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        a aVar2 = this.f133141b;
        k kVar = aVar2.f133138f;
        long unitId = aVar2.f133135c.getUnitId();
        this.f133140a = 1;
        Object objA = m.a(kVar, unitId, this);
        return objA == aVar ? aVar : objA;
    }
}
