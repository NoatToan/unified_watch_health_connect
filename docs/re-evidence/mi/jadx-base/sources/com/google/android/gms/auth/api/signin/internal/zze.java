package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import defpackage.rl1;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zze extends rl1<Void> implements SignInConnectionListener {
    private Semaphore zzbg;
    private Set<GoogleApiClient> zzbh;

    public zze(Context context, Set<GoogleApiClient> set) {
        super(context);
        this.zzbg = new Semaphore(0);
        this.zzbh = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // defpackage.rl1
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final Void loadInBackground() {
        Iterator<GoogleApiClient> it = this.zzbh.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().maybeSignIn(this)) {
                i++;
            }
        }
        try {
            this.zzbg.tryAcquire(i, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.SignInConnectionListener
    public final void onComplete() {
        this.zzbg.release();
    }

    @Override // defpackage.rie
    public final void onStartLoading() {
        this.zzbg.drainPermits();
        forceLoad();
    }
}
