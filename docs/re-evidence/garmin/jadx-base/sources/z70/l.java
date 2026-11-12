package z70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lc80/o;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.data.ExclusiveOffersRepositoryImpl$fetchExclusiveOffers$result$1", f = "ExclusiveOffersRepository.kt", l = {39}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.l<t13.d<? super c83.a0<c80.o>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f202834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f202835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f202836c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(s sVar, String str, t13.d<? super l> dVar) {
        super(1, dVar);
        this.f202835b = sVar;
        this.f202836c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new l(this.f202835b, this.f202836c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<c80.o>> dVar) {
        return ((l) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f202834a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i iVar = this.f202835b.f202860a;
        this.f202834a = 1;
        Object objC = iVar.c(this.f202836c, this);
        return objC == aVar ? aVar : objC;
    }
}
