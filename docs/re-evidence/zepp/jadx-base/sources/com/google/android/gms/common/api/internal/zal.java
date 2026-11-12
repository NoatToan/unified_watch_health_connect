package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zas;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zal extends LifecycleCallback implements DialogInterface.OnCancelListener {
    private final Handler a;
    public volatile boolean zaa;
    public final AtomicReference<x0> zab;
    public final GoogleApiAvailability zac;

    public zal(LifecycleFragment lifecycleFragment) {
        this(lifecycleFragment, GoogleApiAvailability.getInstance());
    }

    private static int a(@Nullable x0 x0Var) {
        if (x0Var == null) {
            return -1;
        }
        return x0Var.a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onActivityResult(int i, int i2, Intent intent) {
        x0 x0Var = this.zab.get();
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                z = false;
            } else {
                int iIsGooglePlayServicesAvailable = this.zac.isGooglePlayServicesAvailable(getActivity());
                z = iIsGooglePlayServicesAvailable == 0;
                if (x0Var == null) {
                    return;
                }
                if (x0Var.b().getErrorCode() == 18 && iIsGooglePlayServicesAvailable == 18) {
                    return;
                }
            }
        } else if (i2 != -1) {
            if (i2 == 0) {
                if (x0Var == null) {
                    return;
                }
                x0 x0Var2 = new x0(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, x0Var.b().toString()), a(x0Var));
                this.zab.set(x0Var2);
                x0Var = x0Var2;
            }
            z = false;
        }
        if (z) {
            zab();
        } else if (x0Var != null) {
            zaa(x0Var.b(), x0Var.a());
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        zaa(new ConnectionResult(13, null), a(this.zab.get()));
        zab();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.zab.set(bundle.getBoolean("resolving_error", false) ? new x0(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        x0 x0Var = this.zab.get();
        if (x0Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", x0Var.a());
            bundle.putInt("failed_status", x0Var.b().getErrorCode());
            bundle.putParcelable("failed_resolution", x0Var.b().getResolution());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStart() {
        super.onStart();
        this.zaa = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStop() {
        super.onStop();
        this.zaa = false;
    }

    public abstract void zaa();

    public abstract void zaa(ConnectionResult connectionResult, int i);

    public final void zab() {
        this.zab.set(null);
        zaa();
    }

    @VisibleForTesting
    public zal(LifecycleFragment lifecycleFragment, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment);
        this.zab = new AtomicReference<>(null);
        this.a = new zas(Looper.getMainLooper());
        this.zac = googleApiAvailability;
    }

    public final void zab(ConnectionResult connectionResult, int i) {
        x0 x0Var = new x0(connectionResult, i);
        if (this.zab.compareAndSet(null, x0Var)) {
            this.a.post(new z0(this, x0Var));
        }
    }
}
