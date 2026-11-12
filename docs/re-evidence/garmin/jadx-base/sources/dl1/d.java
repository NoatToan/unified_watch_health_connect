package dl1;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lbl1/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.setup.data.repository.RecordActivityRepositoryImpl$isOnboardingCompleted$result$1", f = "RecordActivityRepositoryImpl.kt", l = {16}, m = "invokeSuspend", v = 2)
public final class d extends i implements l<t13.d<? super a0<bl1.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f60307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f60308b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f60308b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f60308b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<bl1.a>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f60307a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<bl1.a>> i0VarA = this.f60308b.f60301a.a("recordActivity.onboarding.displayed.deviceIds.list");
        this.f60307a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
