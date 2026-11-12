package i31;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.domain.GetDeviceOnboardingHomeItemsUseCase$invoke$$inlined$flatMapLatest$1", f = "GetDeviceOnboardingHomeItemsUseCase.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.q<r53.j<? super List<? extends k31.a>>, Integer, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f90686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ r53.j f90687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f90688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f90689d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(t13.d dVar, f fVar) {
        super(3, dVar);
        this.f90689d = fVar;
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super List<? extends k31.a>> jVar, Integer num, t13.d<? super Unit> dVar) {
        g gVar = new g(dVar, this.f90689d);
        gVar.f90687b = jVar;
        gVar.f90688c = num;
        return gVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f90686a;
        if (i14 == 0) {
            o13.r.b(obj);
            r53.j jVar = this.f90687b;
            ((Number) this.f90688c).intValue();
            a2 a2Var = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "GetDeviceOnboardingHomeItemsUseCase", "Loading device onboarding items.");
            f fVar = this.f90689d;
            i iVar = new i(new r53.v(new h(fVar, null), fVar.f90670a.e(d31.c.NOT_STARTED)), fVar);
            this.f90687b = null;
            this.f90688c = null;
            this.f90686a = 1;
            if (r53.s.v(jVar, iVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
