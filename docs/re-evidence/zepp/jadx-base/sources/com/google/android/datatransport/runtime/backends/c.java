package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.NonNull;
import com.alipay.sdk.m.u.i;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class c extends CreationContext {
    private final Context b;
    private final Clock c;
    private final Clock d;
    private final String e;

    public c(Context context, Clock clock, Clock clock2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.b = context;
        Objects.requireNonNull(clock, "Null wallClock");
        this.c = clock;
        Objects.requireNonNull(clock2, "Null monotonicClock");
        this.d = clock2;
        Objects.requireNonNull(str, "Null backendName");
        this.e = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreationContext)) {
            return false;
        }
        CreationContext creationContext = (CreationContext) obj;
        return this.b.equals(creationContext.getApplicationContext()) && this.c.equals(creationContext.getWallClock()) && this.d.equals(creationContext.getMonotonicClock()) && this.e.equals(creationContext.getBackendName());
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Context getApplicationContext() {
        return this.b;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    @NonNull
    public String getBackendName() {
        return this.e;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Clock getMonotonicClock() {
        return this.d;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Clock getWallClock() {
        return this.c;
    }

    public int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.b + ", wallClock=" + this.c + ", monotonicClock=" + this.d + ", backendName=" + this.e + i.d;
    }
}
