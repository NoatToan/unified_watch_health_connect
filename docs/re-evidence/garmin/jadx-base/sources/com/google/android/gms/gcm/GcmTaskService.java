package com.google.android.gms.gcm;

import android.annotation.TargetApi;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gcm.zzq;
import com.nimbusds.jose.HeaderParameterNames;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes14.dex */
public abstract class GcmTaskService extends Service {
    public static final String SERVICE_ACTION_EXECUTE_TASK = "com.google.android.gms.gcm.ACTION_TASK_READY";
    public static final String SERVICE_ACTION_INITIALIZE = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE";
    public static final String SERVICE_PERMISSION = "com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE";
    private ComponentName componentName;
    private final Object lock = new Object();
    private com.google.android.gms.internal.gcm.zzl zzg;
    private int zzu;
    private ExecutorService zzv;
    private Messenger zzw;
    private GcmNetworkManager zzx;

    @VisibleForTesting
    @TargetApi(21)
    public class zzd extends com.google.android.gms.internal.gcm.zzj {
        public zzd(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Messenger messenger;
            if (UidVerifier.uidHasPackageName(GcmTaskService.this, message.sendingUid, "com.google.android.gms")) {
                int i14 = message.what;
                if (i14 != 1) {
                    if (i14 == 2) {
                        if (Log.isLoggable("GcmTaskService", 3)) {
                            new StringBuilder(String.valueOf(message).length() + 45);
                            return;
                        }
                        return;
                    } else if (i14 != 4) {
                        new StringBuilder(String.valueOf(message).length() + 31);
                        return;
                    } else {
                        GcmTaskService.this.onInitializeTasks();
                        return;
                    }
                }
                Bundle data = message.getData();
                if (data.isEmpty() || (messenger = message.replyTo) == null) {
                    return;
                }
                String string = data.getString(HeaderParameterNames.AUTHENTICATION_TAG);
                ArrayList parcelableArrayList = data.getParcelableArrayList("triggered_uris");
                long j8 = data.getLong("max_exec_duration", 180L);
                if (GcmTaskService.this.zzg(string)) {
                    return;
                }
                GcmTaskService.this.zzd(GcmTaskService.this.new zze(string, messenger, data.getBundle("extras"), j8, parcelableArrayList));
            }
        }
    }

    private final void zzd(int i14) {
        synchronized (this.lock) {
            try {
                this.zzu = i14;
                if (!this.zzx.zzf(this.componentName.getClassName())) {
                    stopSelf(this.zzu);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzg(String str) {
        boolean z14;
        synchronized (this.lock) {
            try {
                boolean zZzd = this.zzx.zzd(str, this.componentName.getClassName());
                z14 = !zZzd;
                if (!zZzd) {
                    new StringBuilder(String.valueOf(getPackageName()).length() + 44 + String.valueOf(str).length());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z14;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent != null && PlatformVersion.isAtLeastLollipop() && SERVICE_ACTION_EXECUTE_TASK.equals(intent.getAction())) {
            return this.zzw.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.zzx = GcmNetworkManager.getInstance(this);
        this.zzv = com.google.android.gms.internal.gcm.zzg.zzaa().zzd(10, new com.google.android.gms.gcm.zze(this), 10);
        this.zzw = new Messenger(new zzd(Looper.getMainLooper()));
        this.componentName = new ComponentName(this, getClass());
        com.google.android.gms.internal.gcm.zzm.zzab();
        this.zzg = com.google.android.gms.internal.gcm.zzm.zzdk;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        List<Runnable> listShutdownNow = this.zzv.shutdownNow();
        if (listShutdownNow.isEmpty()) {
            return;
        }
        listShutdownNow.size();
    }

    public void onInitializeTasks() {
    }

    public abstract int onRunTask(TaskParams taskParams);

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i14, int i15) throws Throwable {
        Throwable th3;
        if (intent == null) {
            zzd(i15);
            return 2;
        }
        try {
            intent.setExtrasClassLoader(PendingCallback.class.getClassLoader());
            String action = intent.getAction();
            try {
                if (SERVICE_ACTION_EXECUTE_TASK.equals(action)) {
                    String stringExtra = intent.getStringExtra(HeaderParameterNames.AUTHENTICATION_TAG);
                    Parcelable parcelableExtra = intent.getParcelableExtra("callback");
                    Bundle bundleExtra = intent.getBundleExtra("extras");
                    ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("triggered_uris");
                    long longExtra = intent.getLongExtra("max_exec_duration", 180L);
                    if (!(parcelableExtra instanceof PendingCallback)) {
                        try {
                            new StringBuilder(String.valueOf(getPackageName()).length() + 47 + String.valueOf(stringExtra).length());
                            zzd(i15);
                            return 2;
                        } catch (Throwable th4) {
                            th3 = th4;
                        }
                    } else {
                        if (zzg(stringExtra)) {
                            zzd(i15);
                            return 2;
                        }
                        zzd(new zze(stringExtra, ((PendingCallback) parcelableExtra).zzan, bundleExtra, longExtra, parcelableArrayListExtra));
                    }
                    th3 = th;
                    zzd(i15);
                    throw th3;
                }
                if (SERVICE_ACTION_INITIALIZE.equals(action)) {
                    onInitializeTasks();
                } else {
                    new StringBuilder(String.valueOf(action).length() + 37);
                }
                zzd(i15);
                return 2;
            } catch (Throwable th5) {
                th = th5;
                th3 = th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public class zze implements Runnable {
        private final Bundle extras;
        private final String tag;
        private final List<Uri> zzaa;
        private final long zzab;
        private final zzg zzac;
        private final Messenger zzad;

        public zze(String str, IBinder iBinder, Bundle bundle, long j8, List<Uri> list) {
            zzg zzhVar;
            this.tag = str;
            if (iBinder == null) {
                zzhVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gcm.INetworkTaskCallback");
                zzhVar = iInterfaceQueryLocalInterface instanceof zzg ? (zzg) iInterfaceQueryLocalInterface : new zzh(iBinder);
            }
            this.zzac = zzhVar;
            this.extras = bundle;
            this.zzab = j8;
            this.zzaa = list;
            this.zzad = null;
        }

        private static /* synthetic */ void zzd(Throwable th3, zzp zzpVar) {
            if (th3 == null) {
                zzpVar.close();
                return;
            }
            try {
                zzpVar.close();
            } catch (Throwable th4) {
                zzq.zzd(th3, th4);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zze(int i14) {
            synchronized (GcmTaskService.this.lock) {
                try {
                    try {
                        try {
                            if (GcmTaskService.this.zzx.zzf(this.tag, GcmTaskService.this.componentName.getClassName())) {
                                GcmTaskService.this.zzx.zze(this.tag, GcmTaskService.this.componentName.getClassName());
                                if (!zzg() && !GcmTaskService.this.zzx.zzf(GcmTaskService.this.componentName.getClassName())) {
                                    GcmTaskService gcmTaskService = GcmTaskService.this;
                                    gcmTaskService.stopSelf(gcmTaskService.zzu);
                                }
                                return;
                            }
                            if (zzg()) {
                                Messenger messenger = this.zzad;
                                Message messageObtain = Message.obtain();
                                messageObtain.what = 3;
                                messageObtain.arg1 = i14;
                                Bundle bundle = new Bundle();
                                bundle.putParcelable("component", GcmTaskService.this.componentName);
                                bundle.putString(HeaderParameterNames.AUTHENTICATION_TAG, this.tag);
                                messageObtain.setData(bundle);
                                messenger.send(messageObtain);
                            } else {
                                this.zzac.zzf(i14);
                            }
                            GcmTaskService.this.zzx.zze(this.tag, GcmTaskService.this.componentName.getClassName());
                            if (!zzg() && !GcmTaskService.this.zzx.zzf(GcmTaskService.this.componentName.getClassName())) {
                                GcmTaskService gcmTaskService2 = GcmTaskService.this;
                                gcmTaskService2.stopSelf(gcmTaskService2.zzu);
                            }
                        } catch (RemoteException unused) {
                            String strValueOf = String.valueOf(this.tag);
                            if (strValueOf.length() != 0) {
                                "Error reporting result of operation to scheduler for ".concat(strValueOf);
                            }
                            GcmTaskService.this.zzx.zze(this.tag, GcmTaskService.this.componentName.getClassName());
                            if (!zzg() && !GcmTaskService.this.zzx.zzf(GcmTaskService.this.componentName.getClassName())) {
                                GcmTaskService gcmTaskService3 = GcmTaskService.this;
                                gcmTaskService3.stopSelf(gcmTaskService3.zzu);
                            }
                        }
                    } catch (Throwable th3) {
                        GcmTaskService.this.zzx.zze(this.tag, GcmTaskService.this.componentName.getClassName());
                        if (!zzg() && !GcmTaskService.this.zzx.zzf(GcmTaskService.this.componentName.getClassName())) {
                            GcmTaskService gcmTaskService4 = GcmTaskService.this;
                            gcmTaskService4.stopSelf(gcmTaskService4.zzu);
                        }
                        throw th3;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        private final boolean zzg() {
            return this.zzad != null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String strValueOf = String.valueOf(this.tag);
            zzp zzpVar = new zzp(strValueOf.length() != 0 ? "nts:client:onRunTask:".concat(strValueOf) : new String("nts:client:onRunTask:"));
            try {
                TaskParams taskParams = new TaskParams(this.tag, this.extras, this.zzab, this.zzaa);
                GcmTaskService.this.zzg.zzd("onRunTask", com.google.android.gms.internal.gcm.zzp.zzdo);
                try {
                    zze(GcmTaskService.this.onRunTask(taskParams));
                    zzd((Throwable) null, zzpVar);
                } catch (Throwable th3) {
                    throw th3;
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    zzd(th4, zzpVar);
                    throw th5;
                }
            }
        }

        public zze(String str, Messenger messenger, Bundle bundle, long j8, List<Uri> list) {
            this.tag = str;
            this.zzad = messenger;
            this.extras = bundle;
            this.zzab = j8;
            this.zzaa = list;
            this.zzac = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(zze zzeVar) {
        try {
            this.zzv.execute(zzeVar);
        } catch (RejectedExecutionException unused) {
            zzeVar.zze(1);
        }
    }
}
