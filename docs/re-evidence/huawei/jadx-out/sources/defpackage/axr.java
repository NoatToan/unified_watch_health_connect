package defpackage;

import android.content.Context;
import com.huawei.ads.adsrec.e0;
import com.huawei.ads.adsrec.k;
import com.huawei.ads.adsrec.k0;
import com.huawei.ads.adsrec.s;
import com.huawei.ads.fund.util.SyncExec;
import com.huawei.openplatform.abl.log.HiAdLog;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
public class axr extends k {
    @Override // com.huawei.ads.adsrec.r0
    public <T> axi a(ayc aycVar, axi axiVar) {
        return axiVar;
    }

    @Override // com.huawei.ads.adsrec.r0
    public <T> axi a(ayc aycVar, T t) {
        axi axiVar;
        HiAdLog.i("LRFS", "recall");
        Future futureCallWithFuture = SyncExec.callWithFuture(new c(aycVar, t));
        Future futureCallWithFuture2 = SyncExec.callWithFuture(new b(aycVar, t));
        axi axiVar2 = null;
        try {
            axiVar = (axi) futureCallWithFuture.get();
            try {
                aycVar.c(1);
                e0 e0Var = this.f4756b;
                if (e0Var != null) {
                    e0Var.a(axiVar);
                }
                boolean zE = e(axiVar);
                HiAdLog.i("LRFS", "ad rsp empty: %s", Boolean.valueOf(zE));
                if (!zE) {
                    return axiVar;
                }
                axiVar2 = (axi) futureCallWithFuture2.get();
                aycVar.c(0);
                return axiVar2;
            } catch (Throwable th) {
                th = th;
                HiAdLog.w("LRFS", "recall with future error: %s", th.getClass().getSimpleName());
                return axiVar;
            }
        } catch (Throwable th2) {
            th = th2;
            axiVar = axiVar2;
        }
    }

    class b implements Callable<axi> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ayc f762b;

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public axi call() {
            return new s(axr.this.f4755a).a(this.f762b, this.f761a);
        }

        b(ayc aycVar, Object obj) {
            this.f762b = aycVar;
            this.f761a = obj;
        }
    }

    class c implements Callable<axi> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f763a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ayc f765c;

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public axi call() {
            return new k0(axr.this.f4755a).a(this.f765c, this.f763a);
        }

        c(ayc aycVar, Object obj) {
            this.f765c = aycVar;
            this.f763a = obj;
        }
    }

    private boolean e(axi axiVar) {
        if (axiVar == null) {
            return true;
        }
        return axiVar.h();
    }

    public axr(Context context, e0 e0Var) {
        super(context, e0Var);
    }
}
