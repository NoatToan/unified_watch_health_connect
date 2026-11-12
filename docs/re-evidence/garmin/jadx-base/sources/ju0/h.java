package ju0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr53/j;", "Lfw/m;", "Liu0/d;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.liveeventsharing.network.LiveEventSharingRepo$getAllResources$2", f = "LiveEventSharingRepo.kt", l = {79}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.q<r53.j<? super fw.m<? extends iu0.d>>, Throwable, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f100898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ r53.j f100899b;

    public h(t13.d<? super h> dVar) {
        super(3, dVar);
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super fw.m<? extends iu0.d>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
        h hVar = new h(dVar);
        hVar.f100899b = jVar;
        return hVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = this.f100899b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f100898a;
        if (i14 == 0) {
            r.b(obj);
            a2 a2Var = a2.LIVE_EVENT_SHARING;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "LiveEventSharingRepo", "getAllResources()  Something went wrong ");
            fw.m mVarB = fw.m.a.b(fw.m.f73767e, new fw.g(), null, 1);
            this.f100899b = null;
            this.f100898a = 1;
            if (jVar.emit(mVarB, this) == aVar) {
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
