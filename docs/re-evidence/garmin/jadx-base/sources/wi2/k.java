package wi2;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.auth.cmc.presentation.CMCPortalViewModel$handleNextEvent$1", f = "CMCPortalViewModel.kt", l = {263}, m = "invokeSuspend")
public final class k extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f185673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f185674b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f185674b = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f185674b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f185673a;
        e eVar = this.f185674b;
        if (i14 == 0) {
            o13.r.b(obj);
            p13.k<ti2.b> kVar = eVar.f185645f;
            p13.k<ti2.b> kVar2 = eVar.f185645f;
            if (kVar.isEmpty()) {
                return Unit.INSTANCE;
            }
            kVar2.removeFirst();
            if (!kVar2.isEmpty()) {
                q53.b bVar = eVar.f185646g;
                ti2.b bVarFirst = kVar2.first();
                this.f185673a = 1;
                if (bVar.h(bVarFirst, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        eVar.f185651l.debug("handleNextEvent: " + eVar.f185645f.first());
        return Unit.INSTANCE;
    }
}
