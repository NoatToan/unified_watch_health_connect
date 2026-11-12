package xd2;

import android.os.RemoteException;
import com.garmin.android.library.livetrack.data.typeadapters.PeriodAdapter;
import java.util.HashMap;
import org.joda.time.Period;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import wd2.o1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lyd2/b;", "Lbe2/f;", "<anonymous>", "(Lo53/b0;)Lyd2/b;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLivetrackRepository$getRemoteSettings$2", f = "DefaultLivetrackRepository.kt", l = {562}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<o53.b0, t13.d<? super yd2.b<? extends be2.f>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f190388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f190389b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b bVar, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f190389b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f190389b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super yd2.b<? extends be2.f>> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190388a;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = b.f190044j;
            o1 o1Var = (o1) this.f190389b.f190050h.getValue();
            this.f190388a = 1;
            obj = o1Var.d(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        wd2.f0 f0Var = (wd2.f0) obj;
        T t7 = f0Var.f184457a;
        if (t7 == 0) {
            Exception remoteException = f0Var.f184458b;
            if (remoteException == null) {
                remoteException = new RemoteException("Unknown error fetching settings from Mobcore API");
            }
            return new yd2.b.a(remoteException, null, null, null, 8, null);
        }
        ge2.e eVar = (ge2.e) t7;
        HashMap mapC = a.c(eVar.f77022a);
        Boolean bool = eVar.f77023b;
        Boolean bool2 = eVar.f77024c;
        Boolean bool3 = eVar.f77025d;
        Boolean bool4 = eVar.f77026e;
        String str = eVar.f77028g;
        Period periodB = str != null ? new PeriodAdapter().b(str) : null;
        ge2.d dVar = eVar.f77027f;
        return new yd2.b.C3683b(new be2.f(mapC, bool, bool2, bool3, bool4, periodB, dVar != null ? new be2.f.b(dVar.f77020a, dVar.f77021b) : null), 200);
    }
}
