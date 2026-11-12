package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzav {
    private final zzbg<zzam> a;
    private final Context b;
    private boolean c = false;
    private final Map<ListenerHolder.ListenerKey<LocationListener>, i> d = new HashMap();
    private final Map<ListenerHolder.ListenerKey, g> e = new HashMap();
    private final Map<ListenerHolder.ListenerKey<LocationCallback>, f> f = new HashMap();

    public zzav(Context context, zzbg<zzam> zzbgVar) {
        this.b = context;
        this.a = zzbgVar;
    }

    public final Location zza(String str) throws RemoteException {
        ((v) this.a).a.checkConnected();
        return ((v) this.a).a().zzn(str);
    }

    @Deprecated
    public final Location zzb() throws RemoteException {
        ((v) this.a).a.checkConnected();
        return ((v) this.a).a().zzm();
    }

    public final LocationAvailability zzc() throws RemoteException {
        ((v) this.a).a.checkConnected();
        return ((v) this.a).a().zzs(this.b.getPackageName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(LocationRequest locationRequest, ListenerHolder<LocationListener> listenerHolder, zzai zzaiVar) throws RemoteException {
        i iVar;
        i iVar2;
        ((v) this.a).a.checkConnected();
        ListenerHolder.ListenerKey<LocationListener> listenerKey = listenerHolder.getListenerKey();
        if (listenerKey == null) {
            iVar2 = null;
        } else {
            synchronized (this.d) {
                iVar = this.d.get(listenerKey);
                if (iVar == null) {
                    iVar = new i(listenerHolder);
                }
                this.d.put(listenerKey, iVar);
            }
            iVar2 = iVar;
        }
        if (iVar2 == null) {
            return;
        }
        ((v) this.a).a().zzo(new zzbc(1, zzba.zza(null, locationRequest), iVar2, null, null, zzaiVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(zzba zzbaVar, ListenerHolder<LocationCallback> listenerHolder, zzai zzaiVar) throws RemoteException {
        f fVar;
        ((v) this.a).a.checkConnected();
        ListenerHolder.ListenerKey<LocationCallback> listenerKey = listenerHolder.getListenerKey();
        if (listenerKey == null) {
            fVar = null;
        } else {
            synchronized (this.f) {
                f fVar2 = this.f.get(listenerKey);
                if (fVar2 == null) {
                    fVar2 = new f(listenerHolder);
                }
                fVar = fVar2;
                this.f.put(listenerKey, fVar);
            }
        }
        f fVar3 = fVar;
        if (fVar3 == null) {
            return;
        }
        ((v) this.a).a().zzo(new zzbc(1, zzbaVar, null, null, fVar3, zzaiVar));
    }

    public final void zzf(zzba zzbaVar, PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
        ((v) this.a).a.checkConnected();
        ((v) this.a).a().zzo(zzbc.zzb(zzbaVar, pendingIntent, zzaiVar));
    }

    public final void zzg(LocationRequest locationRequest, PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
        ((v) this.a).a.checkConnected();
        ((v) this.a).a().zzo(zzbc.zzb(zzba.zza(null, locationRequest), pendingIntent, zzaiVar));
    }

    public final void zzh(ListenerHolder.ListenerKey<LocationListener> listenerKey, zzai zzaiVar) throws RemoteException {
        ((v) this.a).a.checkConnected();
        Preconditions.checkNotNull(listenerKey, "Invalid null listener key");
        synchronized (this.d) {
            i iVarRemove = this.d.remove(listenerKey);
            if (iVarRemove != null) {
                iVarRemove.zzc();
                ((v) this.a).a().zzo(zzbc.zza(iVarRemove, zzaiVar));
            }
        }
    }

    public final void zzi(ListenerHolder.ListenerKey<LocationCallback> listenerKey, zzai zzaiVar) throws RemoteException {
        ((v) this.a).a.checkConnected();
        Preconditions.checkNotNull(listenerKey, "Invalid null listener key");
        synchronized (this.f) {
            f fVarRemove = this.f.remove(listenerKey);
            if (fVarRemove != null) {
                fVarRemove.zzc();
                ((v) this.a).a().zzo(zzbc.zzc(fVarRemove, zzaiVar));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzj(PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
        ((v) this.a).a.checkConnected();
        ((v) this.a).a().zzo(new zzbc(2, null, null, pendingIntent, null, zzaiVar));
    }

    public final void zzk(boolean z) throws RemoteException {
        ((v) this.a).a.checkConnected();
        ((v) this.a).a().zzp(z);
        this.c = z;
    }

    public final void zzl(Location location) throws RemoteException {
        ((v) this.a).a.checkConnected();
        ((v) this.a).a().zzq(location);
    }

    public final void zzm(zzai zzaiVar) throws RemoteException {
        ((v) this.a).a.checkConnected();
        ((v) this.a).a().zzr(zzaiVar);
    }

    public final void zzn() throws RemoteException {
        synchronized (this.d) {
            for (i iVar : this.d.values()) {
                if (iVar != null) {
                    ((v) this.a).a().zzo(zzbc.zza(iVar, null));
                }
            }
            this.d.clear();
        }
        synchronized (this.f) {
            for (f fVar : this.f.values()) {
                if (fVar != null) {
                    ((v) this.a).a().zzo(zzbc.zzc(fVar, null));
                }
            }
            this.f.clear();
        }
        synchronized (this.e) {
            for (g gVar : this.e.values()) {
                if (gVar != null) {
                    ((v) this.a).a().zzu(new zzl(2, null, gVar, null));
                }
            }
            this.e.clear();
        }
    }

    public final void zzo() throws RemoteException {
        if (this.c) {
            zzk(false);
        }
    }
}
