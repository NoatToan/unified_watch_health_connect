package com.google.android.gms.iid;

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
final class zzt implements ServiceConnection {
    int state;
    final Messenger zzch;
    zzy zzci;
    final Queue<zzz<?>> zzcj;
    final SparseArray<zzz<?>> zzck;
    final /* synthetic */ zzr zzcl;

    private zzt(zzr zzrVar) {
        this.zzcl = zzrVar;
        this.state = 0;
        this.zzch = new Messenger(new com.google.android.gms.internal.gcm.zzj(Looper.getMainLooper(), new Handler.Callback(this) { // from class: com.google.android.gms.iid.zzu
            private final zzt zzcm;

            {
                this.zzcm = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.zzcm.zzd(message);
            }
        }));
        this.zzcj = new ArrayDeque();
        this.zzck = new SparseArray<>();
    }

    private final void zzt() {
        this.zzcl.zzce.execute(new Runnable(this) { // from class: com.google.android.gms.iid.zzw
            private final zzt zzcm;

            {
                this.zzcm = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final zzt zztVar = this.zzcm;
                while (true) {
                    synchronized (zztVar) {
                        try {
                            if (zztVar.state != 2) {
                                return;
                            }
                            if (zztVar.zzcj.isEmpty()) {
                                zztVar.zzu();
                                return;
                            }
                            final zzz<?> zzzVarPoll = zztVar.zzcj.poll();
                            zztVar.zzck.put(zzzVarPoll.zzcp, zzzVarPoll);
                            zztVar.zzcl.zzce.schedule(new Runnable(zztVar, zzzVarPoll) { // from class: com.google.android.gms.iid.zzx
                                private final zzt zzcm;
                                private final zzz zzcn;

                                {
                                    this.zzcm = zztVar;
                                    this.zzcn = zzzVarPoll;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.zzcm.zzg(this.zzcn.zzcp);
                                }
                            }, 30L, TimeUnit.SECONDS);
                            if (Log.isLoggable("MessengerIpcClient", 3)) {
                                new StringBuilder(String.valueOf(zzzVarPoll).length() + 8);
                            }
                            Context context = zztVar.zzcl.zzl;
                            Messenger messenger = zztVar.zzch;
                            Message messageObtain = Message.obtain();
                            messageObtain.what = zzzVarPoll.what;
                            messageObtain.arg1 = zzzVarPoll.zzcp;
                            messageObtain.replyTo = messenger;
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("oneWay", zzzVarPoll.zzw());
                            bundle.putString("pkg", context.getPackageName());
                            bundle.putBundle("data", zzzVarPoll.zzcr);
                            messageObtain.setData(bundle);
                            try {
                                zzy zzyVar = zztVar.zzci;
                                Messenger messenger2 = zzyVar.zzad;
                                if (messenger2 != null) {
                                    messenger2.send(messageObtain);
                                } else {
                                    MessengerCompat messengerCompat = zzyVar.zzco;
                                    if (messengerCompat == null) {
                                        throw new IllegalStateException("Both messengers are null");
                                    }
                                    messengerCompat.send(messageObtain);
                                }
                            } catch (RemoteException e4) {
                                zztVar.zzd(2, e4.getMessage());
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            zzd(0, "Null service connection");
            return;
        }
        try {
            this.zzci = new zzy(iBinder);
            this.state = 2;
            zzt();
        } catch (RemoteException e4) {
            zzd(0, e4.getMessage());
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        zzd(2, "Service disconnected");
    }

    public final synchronized void zzd(int i14, String str) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String strValueOf = String.valueOf(str);
                if (strValueOf.length() != 0) {
                    "Disconnected: ".concat(strValueOf);
                }
            }
            int i15 = this.state;
            if (i15 == 0) {
                throw new IllegalStateException();
            }
            if (i15 != 1 && i15 != 2) {
                if (i15 == 3) {
                    this.state = 4;
                    return;
                } else {
                    if (i15 == 4) {
                        return;
                    }
                    StringBuilder sb3 = new StringBuilder(26);
                    sb3.append("Unknown state: ");
                    sb3.append(i15);
                    throw new IllegalStateException(sb3.toString());
                }
            }
            this.state = 4;
            ConnectionTracker.getInstance().unbindService(this.zzcl.zzl, this);
            zzaa zzaaVar = new zzaa(i14, str);
            Iterator<zzz<?>> it = this.zzcj.iterator();
            while (it.hasNext()) {
                it.next().zzd(zzaaVar);
            }
            this.zzcj.clear();
            int i16 = 0;
            while (true) {
                int size = this.zzck.size();
                SparseArray<zzz<?>> sparseArray = this.zzck;
                if (i16 >= size) {
                    sparseArray.clear();
                    return;
                } else {
                    sparseArray.valueAt(i16).zzd(zzaaVar);
                    i16++;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized boolean zze(zzz zzzVar) {
        int i14 = this.state;
        if (i14 == 0) {
            this.zzcj.add(zzzVar);
            Preconditions.checkState(this.state == 0);
            this.state = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            if (ConnectionTracker.getInstance().bindService(this.zzcl.zzl, intent, this, 1)) {
                this.zzcl.zzce.schedule(new Runnable(this) { // from class: com.google.android.gms.iid.zzv
                    private final zzt zzcm;

                    {
                        this.zzcm = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzcm.zzv();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                zzd(0, "Unable to bind to service");
            }
            return true;
        }
        if (i14 == 1) {
            this.zzcj.add(zzzVar);
            return true;
        }
        if (i14 == 2) {
            this.zzcj.add(zzzVar);
            zzt();
            return true;
        }
        if (i14 != 3 && i14 != 4) {
            StringBuilder sb3 = new StringBuilder(26);
            sb3.append("Unknown state: ");
            sb3.append(i14);
            throw new IllegalStateException(sb3.toString());
        }
        return false;
    }

    public final synchronized void zzg(int i14) {
        zzz<?> zzzVar = this.zzck.get(i14);
        if (zzzVar != null) {
            this.zzck.remove(i14);
            zzzVar.zzd(new zzaa(3, "Timed out waiting for response"));
            zzu();
        }
    }

    public final synchronized void zzu() {
        if (this.state == 2 && this.zzcj.isEmpty() && this.zzck.size() == 0) {
            this.state = 3;
            ConnectionTracker.getInstance().unbindService(this.zzcl.zzl, this);
        }
    }

    public final synchronized void zzv() {
        if (this.state == 1) {
            zzd(1, "Timed out while binding");
        }
    }

    public final boolean zzd(Message message) {
        int i14 = message.arg1;
        synchronized (this) {
            try {
                zzz<?> zzzVar = this.zzck.get(i14);
                if (zzzVar == null) {
                    return true;
                }
                this.zzck.remove(i14);
                zzu();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    zzzVar.zzd(new zzaa(4, "Not supported by GmsCore"));
                } else {
                    zzzVar.zzh(data);
                }
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
