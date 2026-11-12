package a73;

import android.content.res.AssetFileDescriptor;
import com.garmin.android.apps.connectmobile.settings.GCMActivityAppDiagnostics;
import com.garmin.feature.garminpay.providers.gpay.sync.NewFitPayCreditCardSync;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import java.io.File;
import java.util.concurrent.Callable;
import org.apache.commons.lang3.Functions;
import org.apache.commons.lang3.function.Failable;
import org.apache.commons.lang3.function.FailableCallable;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p13.a1;
import tn2.x0;
import tn2.y0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1843b;

    public /* synthetic */ h(Object obj, int i14) {
        this.f1842a = i14;
        this.f1843b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f1842a) {
            case 0:
                return Failable.call((FailableCallable) this.f1843b);
            case 1:
                return ((as2.f) this.f1843b).f12702c;
            case 2:
                return ((CrashlyticsCore) this.f1843b).lambda$checkForPreviousCrash$10();
            case 3:
                return ((FirebaseInstallations) this.f1843b).deleteFirebaseInstallationId();
            case 4:
                return ((ConfigStorageClient) this.f1843b).read();
            case 5:
                return GCMActivityAppDiagnostics.onResume$lambda$0((GCMActivityAppDiagnostics) this.f1843b);
            case 6:
                hq2.r rVar = (hq2.r) this.f1843b;
                ListenableFuture listenableFutureE = rVar.f85271a.E(a1.b(rVar.o().f147399d), false);
                return listenableFutureE == null ? q03.r.d(new RuntimeException("Failed to get device cards")) : q03.r.e(listenableFutureE);
            case 7:
                return (AssetFileDescriptor) this.f1843b;
            case 8:
                return Functions.call((Functions.FailableCallable) this.f1843b);
            case 9:
                File file = (File) this.f1843b;
                ro0.u uVar = ro0.u.f153887a;
                return file.getName();
            case 10:
                tn2.r0 r0Var = (tn2.r0) this.f1843b;
                Logger logger = tn2.r0.f165631n;
                return (mn2.a) ge1.b.W(t13.h.f161748a, new tn2.v0(r0Var, null));
            case 11:
                y0 y0Var = (y0) this.f1843b;
                Logger logger2 = y0.f165733f;
                logger2.trace("triggerSyncIfNecessary");
                synchronized (y0Var.f165738d) {
                    if (y0Var.f165737c) {
                        return z03.f.f200765a;
                    }
                    y0Var.f165737c = true;
                    Unit unit = Unit.INSTANCE;
                    logger2.trace("Start sync");
                    e13.j jVarH = y0Var.f165735a.h();
                    tn2.p0 p0Var = new tn2.p0(new x0(y0Var, 2), 21);
                    int i14 = w03.b.f181178a;
                    return new z03.o(new e13.k(jVarH, p0Var), new tn2.p0(new x0(y0Var, 3), 15));
                }
            case 12:
                return vn2.i.b1((vn2.i) this.f1843b);
            case 13:
                NewFitPayCreditCardSync newFitPayCreditCardSync = (NewFitPayCreditCardSync) this.f1843b;
                Logger logger3 = NewFitPayCreditCardSync.f51340f;
                return (mn2.a) ge1.b.W(t13.h.f161748a, new vo2.u(newFitPayCreditCardSync, null));
            default:
                String str = (String) this.f1843b;
                zn2.u0.f205864a.getClass();
                q03.r<c83.a0<fo2.l>> rVarA = zn2.u0.g().A(str);
                xw.b bVar = new xw.b(new z81.b(14), 13);
                rVarA.getClass();
                int i15 = w03.b.f181178a;
                return new e13.j(rVarA, bVar);
        }
    }
}
