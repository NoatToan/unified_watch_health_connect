package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.android.appbundle.splitinstall.protocol.SplitInstallServiceCallbackProxy;
import com.huawei.android.appbundle.splitinstall.protocol.SplitInstallServiceProxy;
import com.huawei.android.bundlecore.install.protocol.ISplitInstallService;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class bal extends azh implements SplitInstallServiceProxy {
    public bal(IBinder iBinder) {
        super(iBinder, ISplitInstallService.DESCRIPTOR);
    }

    @Override // com.huawei.android.appbundle.splitinstall.protocol.SplitInstallServiceProxy
    public final void startInstall(String str, List<Bundle> list, Bundle bundle, SplitInstallServiceCallbackProxy splitInstallServiceCallbackProxy) throws RemoteException {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeTypedList(list);
        azi.c(parcelB, bundle);
        azi.b(parcelB, splitInstallServiceCallbackProxy);
        c(1, parcelB);
    }

    @Override // com.huawei.android.appbundle.splitinstall.protocol.SplitInstallServiceProxy
    public void cancelInstall(String str, int i, Bundle bundle, SplitInstallServiceCallbackProxy splitInstallServiceCallbackProxy) throws RemoteException {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeInt(i);
        azi.c(parcelB, bundle);
        azi.b(parcelB, splitInstallServiceCallbackProxy);
        c(2, parcelB);
    }

    @Override // com.huawei.android.appbundle.splitinstall.protocol.SplitInstallServiceProxy
    public void getSessionState(String str, int i, SplitInstallServiceCallbackProxy splitInstallServiceCallbackProxy) throws RemoteException {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeInt(i);
        azi.b(parcelB, splitInstallServiceCallbackProxy);
        c(3, parcelB);
    }

    @Override // com.huawei.android.appbundle.splitinstall.protocol.SplitInstallServiceProxy
    public void getSessionStates(String str, SplitInstallServiceCallbackProxy splitInstallServiceCallbackProxy) throws RemoteException {
        Parcel parcelB = b();
        parcelB.writeString(str);
        azi.b(parcelB, splitInstallServiceCallbackProxy);
        c(4, parcelB);
    }

    @Override // com.huawei.android.appbundle.splitinstall.protocol.SplitInstallServiceProxy
    public void deferredInstall(String str, List<Bundle> list, Bundle bundle, SplitInstallServiceCallbackProxy splitInstallServiceCallbackProxy) throws RemoteException {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeTypedList(list);
        azi.c(parcelB, bundle);
        azi.b(parcelB, splitInstallServiceCallbackProxy);
        c(5, parcelB);
    }

    @Override // com.huawei.android.appbundle.splitinstall.protocol.SplitInstallServiceProxy
    public void deferredUninstall(String str, List<Bundle> list, Bundle bundle, SplitInstallServiceCallbackProxy splitInstallServiceCallbackProxy) throws RemoteException {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeTypedList(list);
        azi.c(parcelB, bundle);
        azi.b(parcelB, splitInstallServiceCallbackProxy);
        c(6, parcelB);
    }
}
