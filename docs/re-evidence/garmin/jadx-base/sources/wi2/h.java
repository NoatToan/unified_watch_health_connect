package wi2;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.auth.cmc.presentation.CMCPortalViewModel$globalSignOut$1", f = "CMCPortalViewModel.kt", l = {185, 186}, m = "invokeSuspend")
public final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f185665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f185666b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f185666b = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f185666b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (r6.h(r1, r5) == r0) goto L18;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f185665a;
        e eVar = this.f185666b;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        vi2.e eVar2 = eVar.f185643d;
        this.f185665a = 1;
        eVar2.getClass();
        re2.b.f152215a.getClass();
        Object objR = re2.b.r(this);
        if (objR != obj2) {
            objR = Unit.INSTANCE;
        }
        if (objR != obj2) {
        }
        return obj2;
        q53.b bVar = eVar.f185647h;
        ti2.c.h hVar = ti2.c.h.f164613a;
        this.f185665a = 2;
    }
}
