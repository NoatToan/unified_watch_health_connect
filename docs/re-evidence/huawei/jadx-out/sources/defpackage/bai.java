package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.android.appbundle.remote.RemoteTask;
import com.huawei.android.appbundle.splitinstall.protocol.SplitInstallServiceProxy;
import com.huawei.hmf.tasks.TaskCompletionSource;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
final class bai extends RemoteTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TaskCompletionSource<Integer> f886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final baa f887c;
    private final List<String> e;

    bai(baa baaVar, TaskCompletionSource taskCompletionSource, List<String> list, TaskCompletionSource<Integer> taskCompletionSource2) {
        super(taskCompletionSource);
        this.f887c = baaVar;
        this.e = list;
        this.f886b = taskCompletionSource2;
    }

    @Override // com.huawei.android.appbundle.remote.RemoteTask
    public void execute() {
        try {
            ((SplitInstallServiceProxy) this.f887c.f872c.c()).startInstall(this.f887c.f871b, baa.c((Collection<String>) this.e), baa.a(), new b(this.f887c, this.f886b));
        } catch (RemoteException e) {
            baa.e.c(e, "startInstall(%s)", this.e);
            this.f886b.setException(new RuntimeException(e));
        }
    }

    static class b extends bae<Integer> {
        b(baa baaVar, TaskCompletionSource<Integer> taskCompletionSource) {
            super(baaVar, taskCompletionSource);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.bae, com.huawei.android.appbundle.splitinstall.protocol.SplitInstallServiceCallbackProxy
        public void onStartInstall(int i, Bundle bundle) {
            super.onStartInstall(i, bundle);
            this.d.setResult((T) Integer.valueOf(i));
        }
    }
}
