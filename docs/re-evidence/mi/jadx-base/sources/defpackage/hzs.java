package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class hzs extends n9s implements v0t {
    public hzs() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    @Override // defpackage.n9s
    public final boolean s2(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        x2t x2tVar = null;
        if (i == 2) {
            Bundle bundle = (Bundle) les.a(parcel, Bundle.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                x2tVar = iInterfaceQueryLocalInterface instanceof x2t ? (x2t) iInterfaceQueryLocalInterface : new x2t(strongBinder);
            }
            les.b(parcel);
            O4(bundle, x2tVar);
            return true;
        }
        if (i != 3) {
            return false;
        }
        Bundle bundle2 = (Bundle) les.a(parcel, Bundle.CREATOR);
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
            x2tVar = iInterfaceQueryLocalInterface2 instanceof x2t ? (x2t) iInterfaceQueryLocalInterface2 : new x2t(strongBinder2);
        }
        les.b(parcel);
        F4(bundle2, x2tVar);
        return true;
    }
}
