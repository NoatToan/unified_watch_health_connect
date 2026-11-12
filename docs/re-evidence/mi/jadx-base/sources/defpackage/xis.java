package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class xis extends t2s implements wrs {
    public xis(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wrs
    public final void G0(String str, List list, Bundle bundle, cxs cxsVar) throws RemoteException {
        Parcel parcelS2 = s2();
        parcelS2.writeString(str);
        parcelS2.writeTypedList(list);
        les.c(parcelS2, bundle);
        parcelS2.writeStrongBinder(cxsVar);
        h4(14, parcelS2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wrs
    public final void G2(String str, Bundle bundle, Bundle bundle2, cxs cxsVar) throws RemoteException {
        Parcel parcelS2 = s2();
        parcelS2.writeString(str);
        les.c(parcelS2, bundle);
        les.c(parcelS2, bundle2);
        parcelS2.writeStrongBinder(cxsVar);
        h4(9, parcelS2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wrs
    public final void I4(String str, Bundle bundle, Bundle bundle2, cxs cxsVar) throws RemoteException {
        Parcel parcelS2 = s2();
        parcelS2.writeString(str);
        les.c(parcelS2, bundle);
        les.c(parcelS2, bundle2);
        parcelS2.writeStrongBinder(cxsVar);
        h4(11, parcelS2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wrs
    public final void N1(String str, Bundle bundle, cxs cxsVar) throws RemoteException {
        Parcel parcelS2 = s2();
        parcelS2.writeString(str);
        les.c(parcelS2, bundle);
        parcelS2.writeStrongBinder(cxsVar);
        h4(10, parcelS2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wrs
    public final void S4(String str, Bundle bundle, Bundle bundle2, cxs cxsVar) throws RemoteException {
        Parcel parcelS2 = s2();
        parcelS2.writeString(str);
        les.c(parcelS2, bundle);
        les.c(parcelS2, bundle2);
        parcelS2.writeStrongBinder(cxsVar);
        h4(6, parcelS2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wrs
    public final void a5(String str, Bundle bundle, Bundle bundle2, cxs cxsVar) throws RemoteException {
        Parcel parcelS2 = s2();
        parcelS2.writeString(str);
        les.c(parcelS2, bundle);
        les.c(parcelS2, bundle2);
        parcelS2.writeStrongBinder(cxsVar);
        h4(7, parcelS2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wrs
    public final void l2(String str, Bundle bundle, cxs cxsVar) throws RemoteException {
        Parcel parcelS2 = s2();
        parcelS2.writeString(str);
        les.c(parcelS2, bundle);
        parcelS2.writeStrongBinder(cxsVar);
        h4(5, parcelS2);
    }
}
