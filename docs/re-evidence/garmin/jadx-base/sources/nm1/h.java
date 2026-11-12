package nm1;

import c83.a0;
import km1.v;
import o13.r;
import o53.i0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.sleep.data.repository.SleepRepositoryImpl$editSleepById$2", f = "SleepRepositoryImpl.kt", l = {69}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.l<t13.d<? super a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f126632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f126633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f126634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f126635d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b bVar, long j8, v vVar, t13.d<? super h> dVar) {
        super(1, dVar);
        this.f126633b = bVar;
        this.f126634c = j8;
        this.f126635d = vVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new h(this.f126633b, this.f126634c, this.f126635d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<Unit>> dVar) {
        return ((h) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126632a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        ((com.garmin.android.apps.connectmobile.googlehealthconnect.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.googlehealthconnect.a.class, null, null, 6, null)).k(com.garmin.android.apps.connectmobile.googlehealthconnect.b.c.ON_EDIT_SLEEP_ENTRY, true);
        i0<a0<Unit>> i0VarG = this.f126633b.f126612a.g(this.f126634c, this.f126635d);
        this.f126632a = 1;
        Object objAwait = i0VarG.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
