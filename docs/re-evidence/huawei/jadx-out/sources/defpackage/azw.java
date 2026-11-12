package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.android.appbundle.remote.RemoteTask;
import com.huawei.android.appbundle.splitinstall.protocol.SplitInstallServiceProxy;
import com.huawei.haf.bundle.InstallSessionState;
import com.huawei.hmf.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
final class azw extends RemoteTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TaskCompletionSource<List<InstallSessionState>> f859b;
    private final baa e;

    azw(baa baaVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource<List<InstallSessionState>> taskCompletionSource2) {
        super(taskCompletionSource);
        this.e = baaVar;
        this.f859b = taskCompletionSource2;
    }

    @Override // com.huawei.android.appbundle.remote.RemoteTask
    public void execute() {
        try {
            ((SplitInstallServiceProxy) this.e.f872c.c()).getSessionStates(this.e.f871b, new e(this.e, this.f859b));
        } catch (RemoteException e2) {
            baa.e.c(e2, "getSessionStates", new Object[0]);
            this.f859b.setException(new RuntimeException(e2));
        }
    }

    static class e extends bae<List<InstallSessionState>> {
        e(baa baaVar, TaskCompletionSource<List<InstallSessionState>> taskCompletionSource) {
            super(baaVar, taskCompletionSource);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.bae, com.huawei.android.appbundle.splitinstall.protocol.SplitInstallServiceCallbackProxy
        public void onGetSessionStates(List<Bundle> list) {
            super.onGetSessionStates(list);
            List arrayList = new ArrayList(list.size());
            Iterator<Bundle> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(baf.a(it.next()));
            }
            this.d.setResult((T) arrayList);
        }
    }
}
