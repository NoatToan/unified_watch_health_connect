package ps2;

import com.garmin.garminpay.wallet.exception.ExpressCardSettingException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import lc.u0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f140481b;

    public /* synthetic */ g(n nVar, int i14) {
        this.f140480a = i14;
        this.f140481b = nVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i14 = this.f140480a;
        int i15 = 3;
        n nVar = this.f140481b;
        switch (i14) {
            case 0:
                hs2.d dVar = nVar.f140499b;
                if (dVar.q() == hs2.g.DISCONNECTED) {
                    return q03.r.f(nVar.f140514q);
                }
                a13.k kVarE = q03.r.e(dVar.o());
                d dVar2 = new d(new c(nVar, i15), 4);
                int i16 = w03.b.f181178a;
                return new e13.g(kVarE, dVar2);
            case 1:
                Set<pl2.c> setB = nVar.f140498a.getNfcInfo().b();
                if (!(setB instanceof Collection) || !setB.isEmpty()) {
                    Iterator<T> it = setB.iterator();
                    while (it.hasNext()) {
                        switch (n.a.f140517a[((pl2.c) it.next()).ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                                break;
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                                e13.b bVarA = nVar.a();
                                d dVar3 = new d(new c(nVar, 2), i15);
                                int i17 = w03.b.f181178a;
                                return new e13.k(bVarA, dVar3);
                            default:
                                u0.r();
                                return null;
                        }
                    }
                }
                return z03.f.f200765a;
            default:
                hs2.d dVar4 = nVar.f140499b;
                if (dVar4.q() == hs2.g.DISCONNECTED) {
                    ExpressCardSettingException.a aVar = ExpressCardSettingException.a.DEVICE_NOT_CONNECTED;
                    throw new ExpressCardSettingException(aVar, "RemoveExpressCard failed. " + aVar);
                }
                e13.p pVarG = q03.r.e(dVar4.I()).g(l13.a.f108328c);
                int i18 = 0;
                d dVar5 = new d(new c(nVar, i18), i18);
                int i19 = w03.b.f181178a;
                return new e13.k(pVarG, dVar5);
        }
    }
}
