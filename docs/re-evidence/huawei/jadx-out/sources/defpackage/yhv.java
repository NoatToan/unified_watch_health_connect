package defpackage;

import com.huawei.wearengine.WearEngineBinderClient;
import com.huawei.wearengine.WearEngineClientInner;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes20.dex */
public class yhv<T extends WearEngineBinderClient> implements WearEngineClientInner.ReleaseConnectionCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<T> f53349c;

    public yhv(WeakReference<T> weakReference) {
        this.f53349c = weakReference;
    }

    @Override // com.huawei.wearengine.WearEngineClientInner.ReleaseConnectionCallback
    public void onReleaseConnection() {
        WeakReference<T> weakReference = this.f53349c;
        if (weakReference == null) {
            yis.c("WearEngineReleaseConnectCallback", "onReleaseConnection mWeakReference is null");
            return;
        }
        T t = weakReference.get();
        if (t != null) {
            t.clearBinderProxy();
        }
    }
}
