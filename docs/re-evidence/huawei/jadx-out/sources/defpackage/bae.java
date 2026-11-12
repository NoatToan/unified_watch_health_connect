package defpackage;

import android.os.Bundle;
import com.huawei.android.appbundle.splitinstall.protocol.SplitInstallServiceCallback;
import com.huawei.haf.bundle.InstallException;
import com.huawei.hmf.tasks.TaskCompletionSource;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
class bae<T> extends SplitInstallServiceCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final baa f878c;
    protected final TaskCompletionSource<T> d;

    bae(baa baaVar, TaskCompletionSource<T> taskCompletionSource) {
        this.f878c = baaVar;
        this.d = taskCompletionSource;
    }

    @Override // com.huawei.android.appbundle.splitinstall.protocol.SplitInstallServiceCallbackProxy
    public void onStartInstall(int i, Bundle bundle) {
        this.f878c.f872c.a();
        baa.e.d("onStartInstall(%d)", Integer.valueOf(i));
    }

    @Override // com.huawei.android.appbundle.splitinstall.protocol.SplitInstallServiceCallbackProxy
    public void onCompleteInstall(int i) {
        this.f878c.f872c.a();
        baa.e.d("onCompleteInstall(%d)", Integer.valueOf(i));
    }

    public void onCancelInstall(int i, Bundle bundle) {
        this.f878c.f872c.a();
        baa.e.d("onCancelInstall(%d)", Integer.valueOf(i));
    }

    public void onGetSession(int i, Bundle bundle) {
        this.f878c.f872c.a();
        baa.e.d("onGetSession(%d)", Integer.valueOf(i));
    }

    public void onDeferredUninstall(Bundle bundle) {
        this.f878c.f872c.a();
        baa.e.d("onDeferredUninstall", new Object[0]);
    }

    public void onDeferredInstall(Bundle bundle) {
        this.f878c.f872c.a();
        baa.e.d("onDeferredInstall", new Object[0]);
    }

    public void onGetSessionStates(List<Bundle> list) {
        this.f878c.f872c.a();
        baa.e.d("onGetSessionStates", new Object[0]);
    }

    @Override // com.huawei.android.appbundle.splitinstall.protocol.SplitInstallServiceCallbackProxy
    public final void onError(Bundle bundle) {
        this.f878c.f872c.a();
        int i = bundle.getInt("error_code");
        baa.e.d("onError(%d)", Integer.valueOf(i));
        this.d.setException(new InstallException(i));
    }
}
