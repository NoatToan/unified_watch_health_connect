package c31;

import e23.l;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.data.local.PromptOnboardingDao_Impl$syncItems$2", f = "PromptOnboardingDao_Impl.kt", l = {102}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.onboarding.data.local.b f24099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<d31.f> f24100c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.garmin.android.apps.connectmobile.onboarding.data.local.b bVar, List<d31.f> list, t13.d<? super k> dVar) {
        super(1, dVar);
        this.f24099b = bVar;
        this.f24100c = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new k(this.f24099b, this.f24100c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((k) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f24098a;
        if (i14 == 0) {
            r.b(obj);
            this.f24098a = 1;
            com.garmin.android.apps.connectmobile.onboarding.data.local.b.C0713b c0713b = com.garmin.android.apps.connectmobile.onboarding.data.local.b.f39667d;
            com.garmin.android.apps.connectmobile.onboarding.data.local.b bVar = this.f24099b;
            bVar.getClass();
            if (j.b(bVar, this.f24100c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
