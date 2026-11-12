package defpackage;

import android.content.Context;
import com.huawei.ads.adsrec.e0;
import com.huawei.ads.adsrec.k;
import com.huawei.ads.adsrec.k0;
import com.huawei.ads.adsrec.s;
import com.huawei.ads.fund.util.ListUtil;
import com.huawei.ads.fund.util.SyncExec;
import com.huawei.openplatform.abl.log.HiAdLog;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
public class ayd extends k {
    /* JADX WARN: Code duplicated, block: B:15:0x0048 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #1 {all -> 0x004e, blocks: (B:3:0x001b, B:12:0x0041, B:13:0x0044, B:15:0x0048), top: B:24:0x001b }] */
    @Override // com.huawei.ads.adsrec.r0
    public <T> axi a(ayc aycVar, T t) {
        axi axiVar;
        e0 e0Var;
        HiAdLog.i("CRFS", "recall");
        Future futureCallWithFuture = SyncExec.callWithFuture(new b(aycVar, t));
        Future futureCallWithFuture2 = SyncExec.callWithFuture(new e(aycVar, t));
        axi axiVar2 = null;
        try {
            axiVar = (axi) futureCallWithFuture.get();
            try {
                if (axiVar != null) {
                    List<axm> listI = axiVar.i();
                    if (!ListUtil.isEmpty(listI)) {
                        b(aycVar, listI, axiVar);
                        axiVar2 = axiVar;
                    }
                    e0Var = this.f4756b;
                    if (e0Var != null) {
                        e0Var.a(axiVar2);
                    }
                    return axiVar2;
                }
                HiAdLog.i("CRFS", "no ad response");
                axiVar2 = (axi) futureCallWithFuture2.get();
                aycVar.c(1);
                e0Var = this.f4756b;
                if (e0Var != null) {
                    e0Var.a(axiVar2);
                }
                return axiVar2;
            } catch (Throwable th) {
                th = th;
                HiAdLog.w("CRFS", "recall with future error: %s", th.getClass().getSimpleName());
                return axiVar;
            }
        } catch (Throwable th2) {
            th = th2;
            axiVar = axiVar2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    @Override // com.huawei.ads.adsrec.r0
    public <T> axi a(ayc aycVar, axi axiVar) {
        e0 e0Var;
        new s(this.f4755a).a(aycVar, axiVar);
        if (axiVar != null) {
            List<axm> listI = axiVar.i();
            if (!ListUtil.isEmpty(listI)) {
                b(aycVar, listI, axiVar);
            }
            e0Var = this.f4756b;
            if (e0Var != null) {
                e0Var.a(axiVar);
            }
            return axiVar;
        }
        HiAdLog.i("CRFS", "no ad response");
        axiVar = c(aycVar, axiVar);
        e0Var = this.f4756b;
        if (e0Var != null) {
            e0Var.a(axiVar);
        }
        return axiVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> axi e(ayc aycVar, T t) {
        return new k0(this.f4755a).a(aycVar, t);
    }

    private axi c(ayc aycVar, axi axiVar) {
        return new k0(this.f4755a).a(aycVar, axiVar);
    }

    class b implements Callable<axi> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ayc f783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f784b;

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public axi call() {
            return new s(ayd.this.f4755a).a(this.f783a, this.f784b);
        }

        b(ayc aycVar, Object obj) {
            this.f783a = aycVar;
            this.f784b = obj;
        }
    }

    class e implements Callable<axi> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f786b;
        final /* synthetic */ ayc e;

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public axi call() {
            return ayd.this.e(this.e, this.f786b);
        }

        e(ayc aycVar, Object obj) {
            this.e = aycVar;
            this.f786b = obj;
        }
    }

    private void b(ayc aycVar, List<axm> list, axi axiVar) {
        for (axm axmVar : list) {
            if (axmVar.h()) {
                axmVar.j();
                aycVar.c(1);
                axm axmVarA = ayj.a(this.f4755a, aycVar.e(), axmVar.j(), aycVar.g());
                if (axmVarA != null) {
                    axmVar.c(axmVarA);
                }
            }
            if (!axmVar.h()) {
                axiVar.b(200);
            }
        }
    }

    public ayd(Context context, e0 e0Var) {
        super(context, e0Var);
    }
}
