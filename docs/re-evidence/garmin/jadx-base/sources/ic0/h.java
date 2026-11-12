package ic0;

import am.j;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import java.util.List;
import o13.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Ljc0/d;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.data.InMemoryDeviceInfoRepository$refresh$devicesInfo$1", f = "InMemoryDeviceInfoRepository.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h extends i implements p<b0, t13.d<? super List<? extends jc0.d>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f92600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f92601b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f92601b = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h hVar = new h(this.f92601b, dVar);
        hVar.f92600a = obj;
        return hVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super List<? extends jc0.d>> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        String strC;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        f fVar = this.f92601b;
        try {
            int i14 = q.f128596b;
            qd2.a aVarB = qd2.a.b();
            if (aVarB == null || (strC = aVarB.c(qd2.a.b.ALL_DEVICES)) == null) {
                bVar = null;
            } else {
                n63.b bVar2 = (n63.b) fVar.f92594e.getValue();
                bVar2.getClass();
                bVar = ((jc0.a) bVar2.c(jc0.a.INSTANCE.serializer(), strC)).f98126a;
            }
        } catch (Throwable th3) {
            int i15 = q.f128596b;
            bVar = new q.b(th3);
        }
        Throwable thB = q.b(bVar);
        if (thB != null) {
            String strP = j.p("Failed to decode devices JSON ", thB);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "InMemoryDeviceInfoRepository", strP);
        }
        if (bVar instanceof q.b) {
            return null;
        }
        return bVar;
    }
}
