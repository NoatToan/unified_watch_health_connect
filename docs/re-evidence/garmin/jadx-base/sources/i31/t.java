package i31;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Li31/s$c;", "<anonymous>", "(Lo53/b0;)Li31/s$c;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.domain.GetOnboardingDeviceFilterTypeUseCase$getCachedDevice$2", f = "GetOnboardingDeviceFilterTypeUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.p<o53.b0, t13.d<? super s.c>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f90758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f90759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f90760c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(s sVar, String str, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f90759b = sVar;
        this.f90760c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        t tVar = new t(this.f90759b, this.f90760c, dVar);
        tVar.f90758a = obj;
        return tVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super s.c> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        List<s.c> list;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        qd2.a aVarB = qd2.a.b();
        Object obj2 = null;
        String strC = aVarB != null ? aVarB.c(qd2.a.b.ALL_DEVICES) : null;
        s sVar = this.f90759b;
        try {
            int i14 = o13.q.f128596b;
            n63.o oVar = sVar.f90748a;
            if (strC == null) {
                strC = "";
            }
            oVar.getClass();
            bVar = (s.a) oVar.c(j63.a.d(s.a.INSTANCE.serializer()), strC);
        } catch (Throwable th3) {
            int i15 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        if (bVar instanceof o13.q.b) {
            bVar = null;
        }
        s.a aVar2 = (s.a) bVar;
        if (aVar2 == null || (list = aVar2.f90750a) == null) {
            return null;
        }
        for (Object obj3 : list) {
            if (p005kotlin.jvm.internal.s.g(zb0.k.a(((s.c) obj3).f90756d), this.f90760c)) {
                obj2 = obj3;
                break;
            }
        }
        return (s.c) obj2;
    }
}
