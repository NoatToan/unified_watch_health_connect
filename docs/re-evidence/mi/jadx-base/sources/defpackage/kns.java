package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes5.dex */
public abstract class kns extends n9s implements wrs {
    public static wrs h4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        return iInterfaceQueryLocalInterface instanceof wrs ? (wrs) iInterfaceQueryLocalInterface : new xis(iBinder);
    }
}
