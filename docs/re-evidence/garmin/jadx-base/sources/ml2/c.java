package ml2;

import com.garmin.device.ble.BleCommunicationException;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public class c extends p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f119306h = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pj2.k f119307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f119308g;

    public c(pj2.k kVar, Collection<o> collection) {
        super(kVar.getMacAddress(), collection);
        this.f119308g = new AtomicInteger();
        this.f119307f = kVar;
    }

    @Override // ml2.p
    public final ListenableFuture<n> a() {
        if (this.f119418b.isEmpty()) {
            return Futures.immediateFuture(this.f119421e);
        }
        return Futures.catchingAsync(Futures.transformAsync(this.f119307f.v(m.f119394a, m.f119395b), new a(this, 1), MoreExecutors.directExecutor()), BleCommunicationException.class, new a(this, 0), MoreExecutors.directExecutor());
    }
}
