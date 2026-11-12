package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zacn<R extends Result> extends TransformedResult<R> implements ResultCallback<R> {
    private final WeakReference<GoogleApiClient> g;
    private final u0 h;

    @Nullable
    private ResultTransform<? super R, ? extends Result> a = null;

    @Nullable
    private zacn<? extends Result> b = null;

    @Nullable
    private volatile ResultCallbacks<? super R> c = null;

    @Nullable
    private PendingResult<R> d = null;
    private final Object e = new Object();

    @Nullable
    private Status f = null;
    private boolean i = false;

    public zacn(WeakReference<GoogleApiClient> weakReference) {
        Preconditions.checkNotNull(weakReference, "GoogleApiClient reference must not be null");
        this.g = weakReference;
        GoogleApiClient googleApiClient = weakReference.get();
        this.h = new u0(this, googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException e) {
                String strValueOf = String.valueOf(result);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 18);
                sb.append("Unable to release ");
                sb.append(strValueOf);
                Log.w("TransformedResultImpl", sb.toString(), e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Status status) {
        synchronized (this.e) {
            this.f = status;
            i(status);
        }
    }

    @GuardedBy("mSyncToken")
    private final void h() {
        if (this.a == null && this.c == null) {
            return;
        }
        GoogleApiClient googleApiClient = this.g.get();
        if (!this.i && this.a != null && googleApiClient != null) {
            googleApiClient.zaa(this);
            this.i = true;
        }
        Status status = this.f;
        if (status != null) {
            i(status);
            return;
        }
        PendingResult<R> pendingResult = this.d;
        if (pendingResult != null) {
            pendingResult.setResultCallback(this);
        }
    }

    private final void i(Status status) {
        synchronized (this.e) {
            ResultTransform<? super R, ? extends Result> resultTransform = this.a;
            if (resultTransform != null) {
                ((zacn) Preconditions.checkNotNull(this.b)).d((Status) Preconditions.checkNotNull(resultTransform.onFailure(status), "onFailure must not return null"));
            } else if (k()) {
                ((ResultCallbacks) Preconditions.checkNotNull(this.c)).onFailure(status);
            }
        }
    }

    @GuardedBy("mSyncToken")
    private final boolean k() {
        return (this.c == null || this.g.get() == null) ? false : true;
    }

    @Override // com.google.android.gms.common.api.TransformedResult
    public final void andFinally(@NonNull ResultCallbacks<? super R> resultCallbacks) {
        synchronized (this.e) {
            boolean z = true;
            Preconditions.checkState(this.c == null, "Cannot call andFinally() twice.");
            if (this.a != null) {
                z = false;
            }
            Preconditions.checkState(z, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.c = resultCallbacks;
            h();
        }
    }

    public final void b() {
        this.c = null;
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void onResult(R r) {
        synchronized (this.e) {
            if (!r.getStatus().isSuccess()) {
                d(r.getStatus());
                c(r);
            } else if (this.a != null) {
                zacd.zaa().submit(new t0(this, r));
            } else if (k()) {
                ((ResultCallbacks) Preconditions.checkNotNull(this.c)).onSuccess(r);
            }
        }
    }

    @Override // com.google.android.gms.common.api.TransformedResult
    @NonNull
    public final <S extends Result> TransformedResult<S> then(@NonNull ResultTransform<? super R, ? extends S> resultTransform) {
        zacn<? extends Result> zacnVar;
        synchronized (this.e) {
            boolean z = true;
            Preconditions.checkState(this.a == null, "Cannot call then() twice.");
            if (this.c != null) {
                z = false;
            }
            Preconditions.checkState(z, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.a = resultTransform;
            zacnVar = new zacn<>(this.g);
            this.b = zacnVar;
            h();
        }
        return zacnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zaa(PendingResult<?> pendingResult) {
        synchronized (this.e) {
            this.d = pendingResult;
            h();
        }
    }
}
