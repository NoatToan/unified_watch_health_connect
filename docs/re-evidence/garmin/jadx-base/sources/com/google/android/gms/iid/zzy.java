package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.gms.cloudmessaging.IMessengerCompat;

/* JADX INFO: loaded from: classes14.dex */
final class zzy {
    final Messenger zzad;
    final MessengerCompat zzco;

    public zzy(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.zzad = new Messenger(iBinder);
            this.zzco = null;
        } else if (IMessengerCompat.DESCRIPTOR.equals(interfaceDescriptor)) {
            this.zzco = new MessengerCompat(iBinder);
            this.zzad = null;
        } else {
            String strValueOf = String.valueOf(interfaceDescriptor);
            if (strValueOf.length() != 0) {
                "Invalid interface descriptor: ".concat(strValueOf);
            }
            throw new RemoteException();
        }
    }
}
