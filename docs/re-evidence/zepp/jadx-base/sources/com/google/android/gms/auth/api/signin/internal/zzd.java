package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.util.Log;
import androidx.loader.content.AsyncTaskLoader;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzd extends AsyncTaskLoader<Void> implements SignInConnectionListener {
    private Semaphore a;
    private Set<GoogleApiClient> b;

    public zzd(Context context, Set<GoogleApiClient> set) {
        super(context);
        this.a = new Semaphore(0);
        this.b = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.loader.content.AsyncTaskLoader
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Void loadInBackground() {
        Iterator<GoogleApiClient> it2 = this.b.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().maybeSignIn(this)) {
                i++;
            }
        }
        try {
            this.a.tryAcquire(i, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.SignInConnectionListener
    public final void onComplete() {
        this.a.release();
    }

    @Override // androidx.loader.content.Loader
    public final void onStartLoading() {
        this.a.drainPermits();
        forceLoad();
    }
}
