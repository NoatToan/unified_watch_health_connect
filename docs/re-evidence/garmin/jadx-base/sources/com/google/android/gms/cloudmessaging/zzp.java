package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
final class zzp implements ServiceConnection {
    zzq zzc;
    final /* synthetic */ zzv zzf;
    int zza = 0;
    final Messenger zzb = new Messenger(new com.google.android.gms.internal.cloudmessaging.zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.zzm
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i14 = message.arg1;
            zzp zzpVar = this.zza;
            synchronized (zzpVar) {
                try {
                    zzs zzsVar = (zzs) zzpVar.zze.get(i14);
                    if (zzsVar == null) {
                        return true;
                    }
                    zzpVar.zze.remove(i14);
                    zzpVar.zzf();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        zzsVar.zzc(new zzt(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    zzsVar.zza(data);
                    return true;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }));
    final Queue zzd = new ArrayDeque();
    final SparseArray zze = new SparseArray();

    public /* synthetic */ zzp(zzv zzvVar, zzo zzoVar) {
        this.zzf = zzvVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.zzf.zzc.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzi
            @Override // java.lang.Runnable
            public final void run() {
                zzp zzpVar = this.zza;
                IBinder iBinder2 = iBinder;
                synchronized (zzpVar) {
                    if (iBinder2 == null) {
                        zzpVar.zza(0, "Null service connection");
                        return;
                    }
                    try {
                        zzpVar.zzc = new zzq(iBinder2);
                        zzpVar.zza = 2;
                        zzpVar.zzc();
                    } catch (RemoteException e4) {
                        zzpVar.zza(0, e4.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf.zzc.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzl
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(2, "Service disconnected");
            }
        });
    }

    public final synchronized void zza(int i14, String str) {
        zzb(i14, str, null);
    }

    public final synchronized void zzb(int i14, String str, Throwable th3) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i15 = this.zza;
            if (i15 == 0) {
                throw new IllegalStateException();
            }
            if (i15 != 1 && i15 != 2) {
                if (i15 != 3) {
                    return;
                }
                this.zza = 4;
                return;
            }
            this.zza = 4;
            ConnectionTracker.getInstance().unbindService(this.zzf.zzb, this);
            zzt zztVar = new zzt(i14, str, th3);
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                ((zzs) it.next()).zzc(zztVar);
            }
            this.zzd.clear();
            int i16 = 0;
            while (true) {
                int size = this.zze.size();
                SparseArray sparseArray = this.zze;
                if (i16 >= size) {
                    sparseArray.clear();
                    return;
                } else {
                    ((zzs) sparseArray.valueAt(i16)).zzc(zztVar);
                    i16++;
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public final void zzc() {
        this.zzf.zzc.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzj
            @Override // java.lang.Runnable
            public final void run() {
                final zzs zzsVar;
                while (true) {
                    final zzp zzpVar = this.zza;
                    synchronized (zzpVar) {
                        try {
                            if (zzpVar.zza != 2) {
                                return;
                            }
                            if (zzpVar.zzd.isEmpty()) {
                                zzpVar.zzf();
                                return;
                            } else {
                                zzsVar = (zzs) zzpVar.zzd.poll();
                                zzpVar.zze.put(zzsVar.zza, zzsVar);
                                zzpVar.zzf.zzc.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzn
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzpVar.zze(zzsVar.zza);
                                    }
                                }, 30L, TimeUnit.SECONDS);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(zzsVar));
                    }
                    zzv zzvVar = zzpVar.zzf;
                    Messenger messenger = zzpVar.zzb;
                    int i14 = zzsVar.zzc;
                    Context context = zzvVar.zzb;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i14;
                    messageObtain.arg1 = zzsVar.zza;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", zzsVar.zzb());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", zzsVar.zzd);
                    messageObtain.setData(bundle);
                    try {
                        zzpVar.zzc.zza(messageObtain);
                    } catch (RemoteException e4) {
                        zzpVar.zza(2, e4.getMessage());
                    }
                }
            }
        });
    }

    public final synchronized void zzd() {
        if (this.zza == 1) {
            zza(1, "Timed out while binding");
        }
    }

    public final synchronized void zze(int i14) {
        zzs zzsVar = (zzs) this.zze.get(i14);
        if (zzsVar != null) {
            this.zze.remove(i14);
            zzsVar.zzc(new zzt(3, "Timed out waiting for response", null));
            zzf();
        }
    }

    public final synchronized void zzf() {
        if (this.zza == 2 && this.zzd.isEmpty() && this.zze.size() == 0) {
            this.zza = 3;
            ConnectionTracker.getInstance().unbindService(this.zzf.zzb, this);
        }
    }

    public final synchronized boolean zzg(zzs zzsVar) {
        try {
            int i14 = this.zza;
            if (i14 != 0) {
                if (i14 == 1) {
                    this.zzd.add(zzsVar);
                    return true;
                }
                if (i14 != 2) {
                    return false;
                }
                this.zzd.add(zzsVar);
                zzc();
                return true;
            }
            this.zzd.add(zzsVar);
            Preconditions.checkState(this.zza == 0);
            this.zza = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (ConnectionTracker.getInstance().bindService(this.zzf.zzb, intent, this, 1)) {
                    this.zzf.zzc.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzk
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzd();
                        }
                    }, 30L, TimeUnit.SECONDS);
                } else {
                    zza(0, "Unable to bind to service");
                }
            } catch (SecurityException e4) {
                zzb(0, "Unable to bind to service", e4);
            }
            return true;
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
