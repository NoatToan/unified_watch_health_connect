package androidx.work.multiprocess;

import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkContinuation;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class RemoteWorkContinuationImpl extends RemoteWorkContinuation {
    private final RemoteWorkManagerClient mClient;
    private final WorkContinuation mContinuation;

    public RemoteWorkContinuationImpl(RemoteWorkManagerClient remoteWorkManagerClient, WorkContinuation workContinuation) {
        this.mClient = remoteWorkManagerClient;
        this.mContinuation = workContinuation;
    }

    @Override // androidx.work.multiprocess.RemoteWorkContinuation
    public RemoteWorkContinuation then(List<OneTimeWorkRequest> list) {
        return new RemoteWorkContinuationImpl(this.mClient, this.mContinuation.then(list));
    }

    @Override // androidx.work.multiprocess.RemoteWorkContinuation
    public ListenableFuture<Void> enqueue() {
        return this.mClient.enqueue(this.mContinuation);
    }

    @Override // androidx.work.multiprocess.RemoteWorkContinuation
    protected RemoteWorkContinuation combineInternal(List<RemoteWorkContinuation> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<RemoteWorkContinuation> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((RemoteWorkContinuationImpl) it.next()).mContinuation);
        }
        return new RemoteWorkContinuationImpl(this.mClient, WorkContinuation.combine(arrayList));
    }
}
