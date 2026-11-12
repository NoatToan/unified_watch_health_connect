package z70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.data.ExclusiveOffersRepositoryImpl$logExclusiveOfferAction$2", f = "ExclusiveOffersRepository.kt", l = {112}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f202855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f202856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f202857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c80.m f202858d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, String str, c80.m mVar, t13.d<? super r> dVar) {
        super(1, dVar);
        this.f202856b = sVar;
        this.f202857c = str;
        this.f202858d = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new r(this.f202856b, this.f202857c, this.f202858d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((r) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f202855a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i iVar = this.f202856b.f202860a;
        this.f202855a = 1;
        Object objA = iVar.a(this.f202857c, this.f202858d, this);
        return objA == aVar ? aVar : objA;
    }
}
