package re2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.MobileAuthUtil$isChinaEnvironment$2", f = "MobileAuthUtil.kt", l = {296}, m = "invokeSuspend")
public final class j0 extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ve2.d f152309b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ve2.d dVar, t13.d<? super j0> dVar2) {
        super(2, dVar2);
        this.f152309b = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j0(this.f152309b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((j0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ve2.e eVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152308a;
        boolean z14 = false;
        if (i14 == 0) {
            o13.r.b(obj);
            ve2.d dVar = this.f152309b;
            if (dVar == null || (eVar = dVar.f177690a) == null) {
                b bVar = b.f152215a;
                this.f152308a = 1;
                bVar.getClass();
                obj = b.q(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (eVar == ve2.e.f177705e || eVar == ve2.e.f177706f) {
                z14 = true;
            }
            return Boolean.valueOf(z14);
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ve2.e eVar2 = (ve2.e) obj;
        if (eVar2 == ve2.e.f177705e || eVar2 == ve2.e.f177706f) {
            z14 = true;
        }
        return Boolean.valueOf(z14);
    }
}
