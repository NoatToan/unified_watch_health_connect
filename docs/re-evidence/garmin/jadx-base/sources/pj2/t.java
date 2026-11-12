package pj2;

import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public class t implements AsyncFunction<Void, Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f138111a;

    public t(v vVar) {
        this.f138111a = vVar;
    }

    @Override // com.google.common.util.concurrent.AsyncFunction
    public final ListenableFuture<Void> apply(Void r14) {
        v vVar = this.f138111a;
        boolean z14 = vVar.f138133q;
        Logger logger = vVar.f138121e;
        if (!z14) {
            logger.info("Skip direct requestMtu");
            return Futures.immediateFuture(null);
        }
        logger.info("requesting MTU negotiation");
        b bVar = vVar.f138124h;
        bVar.getClass();
        return bVar.C(new h(bVar));
    }
}
