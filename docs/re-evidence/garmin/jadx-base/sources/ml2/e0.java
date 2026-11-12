package ml2;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f119329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pj2.k f119330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f119331c;

    public class a implements FutureCallback<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ UUID f119332a;

        public a(UUID uuid) {
            this.f119332a = uuid;
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public final void onFailure(Throwable th3) {
            e0.this.f119330b.s(m.f119394a, this.f119332a, false);
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public final /* bridge */ /* synthetic */ void onSuccess(b bVar) {
        }
    }

    public e0(pj2.k kVar, long j8) {
        if (kVar == null) {
            vb.h.s("gatt is null");
            throw null;
        }
        this.f119329a = LoggerFactory.getLogger(m.a("RegisterCharacteristicTask", kVar.getMacAddress(), this));
        this.f119330b = kVar;
        this.f119331c = j8;
    }

    public static UUID a(UUID uuid) {
        String string = uuid.toString();
        int iIndexOf = string.indexOf(49);
        if (iIndexOf == -1) {
            return uuid;
        }
        return UUID.fromString(string.substring(0, iIndexOf) + "2" + string.substring(iIndexOf + 1));
    }

    public final ListenableFuture<b> b(UUID uuid, UUID uuid2) {
        ListenableFuture<Void> listenableFutureS = this.f119330b.s(m.f119394a, uuid, true);
        nl2.d dVar = new nl2.d(this.f119330b, uuid, uuid2, this.f119331c);
        ListenableFuture listenableFutureTransformAsync = Futures.transformAsync(Futures.catchingAsync(Futures.transformAsync(listenableFutureS, new jn2.k(dVar, 1), MoreExecutors.directExecutor()), Throwable.class, new jn2.k(this, 2), MoreExecutors.directExecutor()), new d0(0, this, dVar), MoreExecutors.directExecutor());
        listenableFutureTransformAsync.addListener(new k32.n(dVar, 13), MoreExecutors.directExecutor());
        ListenableFuture<b> listenableFutureTransformAsync2 = Futures.transformAsync(listenableFutureTransformAsync, new jn2.j(this, 1, uuid, uuid2), MoreExecutors.directExecutor());
        Futures.addCallback(listenableFutureTransformAsync2, new a(uuid), MoreExecutors.directExecutor());
        return listenableFutureTransformAsync2;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f119334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f119335b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f119336c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte f119337d;

        private b(UUID uuid, UUID uuid2, int i14, byte b14) {
            this.f119334a = uuid;
            this.f119335b = uuid2;
            this.f119336c = i14;
            this.f119337d = b14;
        }

        public /* synthetic */ b(UUID uuid, UUID uuid2, int i14, byte b14, int i15) {
            this(uuid, uuid2, i14, b14);
        }
    }
}
