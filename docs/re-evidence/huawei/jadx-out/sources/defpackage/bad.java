package defpackage;

import android.os.IBinder;
import com.huawei.android.appbundle.remote.RemoteCall;
import com.huawei.android.appbundle.splitinstall.protocol.SplitInstallServiceHolder;
import com.huawei.android.appbundle.splitinstall.protocol.SplitInstallServiceProxy;

/* JADX INFO: loaded from: classes22.dex */
public class bad implements RemoteCall<SplitInstallServiceProxy> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final RemoteCall f877b = new bad();

    private bad() {
    }

    @Override // com.huawei.android.appbundle.remote.RemoteCall
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SplitInstallServiceProxy asInterface(IBinder iBinder) {
        return SplitInstallServiceHolder.queryLocalInterface(iBinder);
    }
}
