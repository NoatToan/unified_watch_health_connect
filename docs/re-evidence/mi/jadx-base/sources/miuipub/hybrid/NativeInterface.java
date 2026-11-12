package miuipub.hybrid;

import android.app.Activity;
import com.miuipub.internal.hybrid.HybridManager;

/* JADX INFO: loaded from: classes3.dex */
public class NativeInterface {
    private HybridManager mManager;

    public NativeInterface(HybridManager hybridManager) {
        this.mManager = hybridManager;
    }

    public void addLifecycleListener(LifecycleListener lifecycleListener) {
        this.mManager.addLifecycleListener(lifecycleListener);
    }

    public Activity getActivity() {
        return this.mManager.getActivity();
    }

    public void removeLifecycleListener(LifecycleListener lifecycleListener) {
        this.mManager.removeLifecycleListener(lifecycleListener);
    }
}
