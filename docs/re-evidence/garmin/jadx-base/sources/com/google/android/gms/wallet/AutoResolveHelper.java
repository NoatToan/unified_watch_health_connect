package com.google.android.gms.wallet;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public class AutoResolveHelper {
    public static final int RESULT_ERROR = 1;
    private static final long zzv = 600000;
    static long zzw = SystemClock.elapsedRealtime();

    private AutoResolveHelper() {
    }

    public static Status getStatusFromIntent(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
    }

    public static void putStatusIntoIntent(Intent intent, Status status) {
        if (status == null) {
            intent.removeExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
        } else {
            intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", status);
        }
    }

    public static <TResult extends AutoResolvableResult> void resolveTask(Task<TResult> task, Activity activity, int i14) {
        zza zzaVarZza = zza.zza(task);
        FragmentTransaction fragmentTransactionBeginTransaction = activity.getFragmentManager().beginTransaction();
        Fragment fragmentZza = zzb.zza(zzaVarZza.zzs, i14);
        int i15 = zzaVarZza.zzs;
        StringBuilder sb3 = new StringBuilder(58);
        sb3.append("com.google.android.gms.wallet.AutoResolveHelper");
        sb3.append(i15);
        fragmentTransactionBeginTransaction.add(fragmentZza, sb3.toString()).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(Activity activity, int i14, Task<? extends AutoResolvableResult> task) {
        int i15;
        if (activity.isFinishing()) {
            return;
        }
        if (task.getException() instanceof ResolvableApiException) {
            try {
                ((ResolvableApiException) task.getException()).startResolutionForResult(activity, i14);
                return;
            } catch (IntentSender.SendIntentException unused) {
                return;
            }
        }
        Intent intent = new Intent();
        if (task.isSuccessful()) {
            task.getResult().putIntoIntent(intent);
            i15 = -1;
        } else {
            if (task.getException() instanceof ApiException) {
                ApiException apiException = (ApiException) task.getException();
                putStatusIntoIntent(intent, new Status(apiException.getStatusCode(), apiException.getMessage(), (PendingIntent) null));
            } else {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    task.getException();
                }
                putStatusIntoIntent(intent, new Status(8, "Unexpected non API exception when trying to deliver the task result to an activity!"));
            }
            i15 = 1;
        }
        zza(activity, i14, i15, intent);
    }

    public static class zza<TResult extends AutoResolvableResult> implements OnCompleteListener<TResult>, Runnable {
        private static final Handler zzp = new com.google.android.gms.internal.wallet.zzf(Looper.getMainLooper());
        static final SparseArray<zza<?>> zzq = new SparseArray<>(2);
        private static final AtomicInteger zzr = new AtomicInteger();
        int zzs;
        private zzb zzt;
        private Task<TResult> zzu;

        public static <TResult extends AutoResolvableResult> zza<TResult> zza(Task<TResult> task) {
            zza<TResult> zzaVar = new zza<>();
            int iIncrementAndGet = zzr.incrementAndGet();
            zzaVar.zzs = iIncrementAndGet;
            zzq.put(iIncrementAndGet, zzaVar);
            zzp.postDelayed(zzaVar, AutoResolveHelper.zzv);
            task.addOnCompleteListener(zzaVar);
            return zzaVar;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task<TResult> task) {
            this.zzu = task;
            zza();
        }

        @Override // java.lang.Runnable
        public final void run() {
            zzq.delete(this.zzs);
        }

        public final void zzb(zzb zzbVar) {
            if (this.zzt == zzbVar) {
                this.zzt = null;
            }
        }

        public final void zza(zzb zzbVar) {
            this.zzt = zzbVar;
            zza();
        }

        private final void zza() {
            if (this.zzu == null || this.zzt == null) {
                return;
            }
            zzq.delete(this.zzs);
            zzp.removeCallbacks(this);
            this.zzt.zzb(this.zzu);
        }
    }

    public static class zzb extends Fragment {
        private static String zzac = "resolveCallId";
        private static String zzad = "requestCode";
        private static String zzae = "initializationElapsedRealtime";
        private static String zzaf = "delivered";
        private int zzag;
        private zza<?> zzah;
        private boolean zzai;

        /* JADX INFO: Access modifiers changed from: private */
        public static Fragment zza(int i14, int i15) {
            Bundle bundle = new Bundle();
            bundle.putInt(zzac, i14);
            bundle.putInt(zzad, i15);
            bundle.putLong(zzae, AutoResolveHelper.zzw);
            zzb zzbVar = new zzb();
            zzbVar.setArguments(bundle);
            return zzbVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(Task<? extends AutoResolvableResult> task) {
            if (this.zzai) {
                return;
            }
            this.zzai = true;
            Activity activity = getActivity();
            activity.getFragmentManager().beginTransaction().remove(this).commit();
            int i14 = this.zzag;
            if (task != null) {
                AutoResolveHelper.zza(activity, i14, task);
            } else {
                AutoResolveHelper.zza(activity, i14, 0, new Intent());
            }
        }

        private final void zzc() {
            zza<?> zzaVar = this.zzah;
            if (zzaVar != null) {
                zzaVar.zzb(this);
            }
        }

        @Override // android.app.Fragment
        public final void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            this.zzag = getArguments().getInt(zzad);
            if (AutoResolveHelper.zzw != getArguments().getLong(zzae)) {
                this.zzah = null;
            } else {
                this.zzah = zza.zzq.get(getArguments().getInt(zzac));
            }
            this.zzai = bundle != null && bundle.getBoolean(zzaf);
        }

        @Override // android.app.Fragment
        public final void onPause() {
            super.onPause();
            zzc();
        }

        @Override // android.app.Fragment
        public final void onResume() {
            super.onResume();
            zza<?> zzaVar = this.zzah;
            if (zzaVar != null) {
                zzaVar.zza(this);
            } else {
                zzb(null);
            }
        }

        @Override // android.app.Fragment
        public final void onSaveInstanceState(Bundle bundle) {
            super.onSaveInstanceState(bundle);
            bundle.putBoolean(zzaf, this.zzai);
            zzc();
        }
    }

    public static <TResult> void zza(Status status, TResult tresult, TaskCompletionSource<TResult> taskCompletionSource) {
        if (status.isSuccess()) {
            taskCompletionSource.setResult(tresult);
        } else {
            taskCompletionSource.setException(ApiExceptionUtil.fromStatus(status));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(Activity activity, int i14, int i15, Intent intent) {
        PendingIntent pendingIntentCreatePendingResult = activity.createPendingResult(i14, intent, 1073741824);
        if (pendingIntentCreatePendingResult == null) {
            return;
        }
        try {
            pendingIntentCreatePendingResult.send(i15);
        } catch (PendingIntent.CanceledException unused) {
        }
    }
}
