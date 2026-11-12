package ff0;

import c83.a0;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ecg.data.EcgOnboardingRepositoryImpl$isEcgAvailableAtLocation$2", f = "EcgOnboardingRepositoryImpl.kt", l = {74}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.l<t13.d<? super a0<String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f71070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f71071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f71072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f71073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f71074e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, long j8, double d14, double d15, t13.d<? super j> dVar) {
        super(1, dVar);
        this.f71071b = kVar;
        this.f71072c = j8;
        this.f71073d = d14;
        this.f71074e = d15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new j(this.f71071b, this.f71072c, this.f71073d, this.f71074e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<String>> dVar) {
        return ((j) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f71070a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<a0<String>> i0VarA = this.f71071b.f71075a.a(this.f71072c, "ECG", this.f71073d, this.f71074e);
        this.f71070a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
