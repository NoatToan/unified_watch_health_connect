package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class zzco extends zzct {
    private final AtomicReference zza = new AtomicReference();
    private boolean zzb;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r3 = r3.get(com.nimbusds.jose.jwk.JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object zzf(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e4) {
            String canonicalName = cls.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb3 = new StringBuilder("Unexpected object type. Expected, Received: ");
            sb3.append(canonicalName);
            sb3.append(", ");
            sb3.append(canonicalName2);
            throw e4;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void zzb(Bundle bundle) {
        AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.zzb = true;
                    this.zza.notify();
                } catch (Throwable th3) {
                    this.zza.notify();
                    throw th3;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final String zzc(long j8) {
        return (String) zzf(zze(j8), String.class);
    }

    public final Long zzd(long j8) {
        return (Long) zzf(zze(j8), Long.class);
    }

    public final Bundle zze(long j8) {
        Bundle bundle;
        AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            if (!this.zzb) {
                try {
                    atomicReference.wait(j8);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.zza.get();
        }
        return bundle;
    }
}
