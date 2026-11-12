package r31;

import i31.e0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.presentation.DeviceOnboardingViewModel$updateOnboardingItemStatus$1", f = "DeviceOnboardingViewModel.kt", l = {60}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f150024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f150025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k31.c f150026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d31.c f150027d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, k31.c cVar, d31.c cVar2, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f150025b = gVar;
        this.f150026c = cVar;
        this.f150027d = cVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f150025b, this.f150026c, this.f150027d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f150024a;
        if (i14 == 0) {
            o13.r.b(obj);
            g gVar = this.f150025b;
            e0 e0Var = gVar.f150011b;
            long j8 = gVar.f150010a;
            d31.d dVar = this.f150026c.f102645a;
            this.f150024a = 1;
            if (e0Var.a(j8, dVar, this.f150027d, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            ((o13.q) obj).getClass();
        }
        return Unit.INSTANCE;
    }
}
