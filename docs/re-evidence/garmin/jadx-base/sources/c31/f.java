package c31;

import e23.l;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.data.local.DeviceOnboardingDao_Impl$syncItems$2", f = "DeviceOnboardingDao_Impl.kt", l = {89}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.onboarding.data.local.a f24087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f24088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<d31.a> f24089d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.garmin.android.apps.connectmobile.onboarding.data.local.a aVar, long j8, List<d31.a> list, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f24087b = aVar;
        this.f24088c = j8;
        this.f24089d = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f24087b, this.f24088c, this.f24089d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f24086a;
        if (i14 == 0) {
            r.b(obj);
            this.f24086a = 1;
            com.garmin.android.apps.connectmobile.onboarding.data.local.a.b bVar = com.garmin.android.apps.connectmobile.onboarding.data.local.a.f39662d;
            com.garmin.android.apps.connectmobile.onboarding.data.local.a aVar2 = this.f24087b;
            aVar2.getClass();
            if (c.b(aVar2, this.f24088c, this.f24089d, this) == aVar) {
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
