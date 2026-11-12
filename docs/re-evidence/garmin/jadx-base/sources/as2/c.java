package as2;

import android.content.Context;
import com.garmin.feature.garminpay.GarminPayInitializer;
import com.google.common.base.Optional;
import e13.m;
import e13.r;
import java.util.concurrent.Callable;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12687a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f12689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12691e;

    public /* synthetic */ c(GarminPayInitializer garminPayInitializer, Context context, boolean z14, boolean z15) {
        this.f12690d = garminPayInitializer;
        this.f12691e = context;
        this.f12688b = z14;
        this.f12689c = z15;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i14 = this.f12687a;
        boolean z14 = this.f12689c;
        boolean z15 = this.f12688b;
        Object obj = this.f12691e;
        Object obj2 = this.f12690d;
        switch (i14) {
            case 0:
                f fVar = (f) obj2;
                String str = (String) obj;
                Logger logger = f.f12699e;
                if (z15) {
                    e eVar = new e(z14, str, 0, fVar);
                    int i15 = w03.b.f181178a;
                    return new r(new z03.d(eVar).c(new m(new a73.h(fVar, 1))), new a73.j(new d(z14, fVar, 0), 21));
                }
                if (!z14) {
                    return q03.r.d(new IllegalArgumentException("Not able to fetch balance, you've just fetch the balance in past 30 secs, please fetch with cache"));
                }
                fVar.b(str);
                Optional<b<T>> by = fVar.f12700a.getBy(str);
                fVar.f12702c = by;
                return q03.r.f(by);
            default:
                return GarminPayInitializer.initUserWallet$lambda$0((GarminPayInitializer) obj2, (Context) obj, z15, z14);
        }
    }

    public /* synthetic */ c(boolean z14, f fVar, String str, boolean z15) {
        this.f12688b = z14;
        this.f12690d = fVar;
        this.f12691e = str;
        this.f12689c = z15;
    }
}
