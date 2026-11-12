package z70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lc80/k;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.data.ExclusiveOffersRepositoryImpl$getDiscountVisibility$result$1", f = "ExclusiveOffersRepository.kt", l = {85}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.l<t13.d<? super c83.a0<c80.k>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f202848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f202849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f202850c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, String str, t13.d<? super p> dVar) {
        super(1, dVar);
        this.f202849b = sVar;
        this.f202850c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new p(this.f202849b, this.f202850c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<c80.k>> dVar) {
        return ((p) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f202848a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i iVar = this.f202849b.f202860a;
        this.f202848a = 1;
        Object objB = iVar.b(this.f202850c, this);
        return objB == aVar ? aVar : objB;
    }
}
