package jd;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.room.coroutines.PassthroughConnection$usePrepared$2", f = "PassthroughConnectionPool.kt", l = {}, m = "invokeSuspend")
public final class k extends v13.i implements e23.l<t13.d<? super Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f98249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f98250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<ud.c, Object> f98251c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(h hVar, String str, e23.l<? super ud.c, Object> lVar, t13.d<? super k> dVar) {
        super(1, dVar);
        this.f98249a = hVar;
        this.f98250b = str;
        this.f98251c = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new k(this.f98249a, this.f98250b, this.f98251c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Object> dVar) {
        return ((k) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        ud.c cVarM0 = this.f98249a.f98235b.M0(this.f98250b);
        try {
            Object objInvoke = this.f98251c.invoke(cVarM0);
            zf.b.h(cVarM0, null);
            return objInvoke;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                zf.b.h(cVarM0, th3);
                throw th4;
            }
        }
    }
}
