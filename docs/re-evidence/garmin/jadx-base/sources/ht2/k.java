package ht2;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.inappupdate.InAppUpdateCheckHelper$initialize$persistedUpdateJsonStr$1", f = "InAppUpdateCheckHelper.kt", l = {69}, m = "invokeSuspend")
public final class k extends v13.i implements e23.p<b0, t13.d<? super String>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f85660a;

    public k(t13.d<? super k> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super String> dVar) {
        return new k(dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f85660a;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                c cVar = new c();
                this.f85660a = 1;
                obj = cVar.a("InAppUpdateCheckHelper", "mostRecentUpdate", this);
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
            return (String) obj;
        } catch (Throwable th3) {
            a aVar2 = a.f85620a;
            n.f85666a.getClass();
            aVar2.c("initialize", th3);
            return null;
        }
    }
}
