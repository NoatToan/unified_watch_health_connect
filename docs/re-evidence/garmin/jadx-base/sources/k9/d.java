package k9;

import android.os.RemoteException;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import h0.r0;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f103416a = new HashSet();

    @Override // k9.e
    public final void a(SettableFuture<?> settableFuture) {
        synchronized (this.f103416a) {
            this.f103416a.add(settableFuture);
            settableFuture.addListener(new r0(26, this, settableFuture), MoreExecutors.directExecutor());
        }
    }

    @Override // k9.e
    public final void b(RemoteException remoteException) {
        HashSet hashSet;
        synchronized (this.f103416a) {
            hashSet = new HashSet(this.f103416a);
            this.f103416a.clear();
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((SettableFuture) it.next()).setException(remoteException);
        }
    }
}
