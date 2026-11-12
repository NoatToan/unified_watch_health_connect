package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public final class x2t extends t2s implements IInterface {
    public x2t(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    public final void I(Bundle bundle) throws RemoteException {
        Parcel parcelS2 = s2();
        les.c(parcelS2, bundle);
        h4(4, parcelS2);
    }

    public final void Y1(Bundle bundle) throws RemoteException {
        Parcel parcelS2 = s2();
        les.c(parcelS2, bundle);
        h4(3, parcelS2);
    }

    public final void g2(Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel parcelS2 = s2();
        les.c(parcelS2, bundle);
        les.c(parcelS2, bundle2);
        h4(2, parcelS2);
    }
}
