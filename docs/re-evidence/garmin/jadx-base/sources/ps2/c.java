package ps2;

import com.garmin.garminpay.wallet.exception.ExpressCardSettingException;
import com.google.common.base.Optional;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.Iterator;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f140470b;

    public /* synthetic */ c(n nVar, int i14) {
        this.f140469a = i14;
        this.f140470b = nVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f140469a;
        n nVar = this.f140470b;
        switch (i14) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                if (bool.booleanValue()) {
                    Optional<hs2.c> optionalAbsent = Optional.absent();
                    optionalAbsent.getClass();
                    nVar.f140514q = optionalAbsent;
                    return z03.f.f200765a;
                }
                ExpressCardSettingException.a aVar = ExpressCardSettingException.a.DEVICE_IS_BUSY;
                throw new ExpressCardSettingException(aVar, "RemoveExpressCard failed. " + aVar);
            case 1:
                ((js2.d) obj).getClass();
                Collection collectionValues = nVar.f140508k.values();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    ((ms2.d) it.next()).b();
                }
                return collectionValues;
            case 2:
                Optional optional = (Optional) obj;
                optional.getClass();
                if (!optional.isPresent()) {
                    return z03.f.f200765a;
                }
                Object obj2 = optional.get();
                obj2.getClass();
                hs2.c cVar = (hs2.c) obj2;
                boolean z14 = false;
                Object obj3 = null;
                for (Object obj4 : qs2.a.A) {
                    if (p005kotlin.jvm.internal.s.g(((qs2.a) obj4).f147399d, cVar.f85442b)) {
                        if (z14) {
                            vb.h.s("Collection contains more than one matching element.");
                            return null;
                        }
                        z14 = true;
                        obj3 = obj4;
                    }
                }
                if (!z14) {
                    n23.j.s("Collection contains no element matching the predicate.");
                    return null;
                }
                if (!((qs2.a) obj3).f147400e) {
                    return z03.f.f200765a;
                }
                ListenableFuture<Boolean> listenableFutureI = nVar.f140499b.I();
                w03.b.a(listenableFutureI, "future is null");
                w03.a.f fVar = w03.a.f181170a;
                return new z03.h(new w03.a.i(listenableFutureI)).h(l13.a.f108328c);
            case 3:
                Optional<hs2.c> optional2 = (Optional) obj;
                optional2.getClass();
                nVar.f140514q = optional2;
                return Unit.INSTANCE;
            case 4:
                nVar.f140504g.debug("checkExpressCard completed with " + ((Optional) obj));
                return Unit.INSTANCE;
            default:
                nVar.f140504g.warn("checkExpressCard completed with an exception", (Throwable) obj);
                return Unit.INSTANCE;
        }
    }
}
