package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.Objects;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzq {
    private final Messenger zza;
    private final zzd zzb;

    public zzq(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.zza = new Messenger(iBinder);
            this.zzb = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, IMessengerCompat.DESCRIPTOR)) {
                "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor));
                throw new RemoteException();
            }
            this.zzb = new zzd(iBinder);
            this.zza = null;
        }
    }

    public final void zza(Message message) throws RemoteException {
        Messenger messenger = this.zza;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzd zzdVar = this.zzb;
        if (zzdVar != null) {
            zzdVar.zzb(message);
        } else {
            h.z("Both messengers are null");
        }
    }
}
