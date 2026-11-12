package wi2;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.auth.cmc.presentation.CMCPortalContentView_androidKt$signedInUserIT2AccessToken$2", f = "CMCPortalContentView.android.kt", l = {372}, m = "invokeSuspend")
public final class c extends v13.i implements e23.p<b0, t13.d<? super String>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f185636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f185637b;

    public c(t13.d<? super c> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(dVar);
        cVar.f185637b = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super String> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f185636a;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                int i15 = o13.q.f128596b;
                re2.b bVar2 = re2.b.f152215a;
                this.f185636a = 1;
                obj = re2.b.p(bVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            sc2.o oVar = (sc2.o) obj;
            bVar = oVar != null ? oVar.f158544a : null;
            int i16 = o13.q.f128596b;
        } catch (Throwable th3) {
            int i17 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        if (bVar instanceof o13.q.b) {
            return null;
        }
        return bVar;
    }
}
