package com.google.android.datatransport.runtime.backends;

import am.j;
import android.content.Context;
import com.google.android.datatransport.runtime.time.Clock;
import j20.x;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes13.dex */
final class AutoValue_CreationContext extends CreationContext {
    private final Context applicationContext;
    private final String backendName;
    private final Clock monotonicClock;
    private final Clock wallClock;

    public AutoValue_CreationContext(Context context, Clock clock, Clock clock2, String str) {
        if (context == null) {
            x.l("Null applicationContext");
            throw null;
        }
        this.applicationContext = context;
        if (clock == null) {
            x.l("Null wallClock");
            throw null;
        }
        this.wallClock = clock;
        if (clock2 == null) {
            x.l("Null monotonicClock");
            throw null;
        }
        this.monotonicClock = clock2;
        if (str != null) {
            this.backendName = str;
        } else {
            x.l("Null backendName");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CreationContext) {
            CreationContext creationContext = (CreationContext) obj;
            if (this.applicationContext.equals(creationContext.getApplicationContext()) && this.wallClock.equals(creationContext.getWallClock()) && this.monotonicClock.equals(creationContext.getMonotonicClock()) && this.backendName.equals(creationContext.getBackendName())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Context getApplicationContext() {
        return this.applicationContext;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public String getBackendName() {
        return this.backendName;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Clock getMonotonicClock() {
        return this.monotonicClock;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Clock getWallClock() {
        return this.wallClock;
    }

    public int hashCode() {
        return ((((((this.applicationContext.hashCode() ^ 1000003) * 1000003) ^ this.wallClock.hashCode()) * 1000003) ^ this.monotonicClock.hashCode()) * 1000003) ^ this.backendName.hashCode();
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("CreationContext{applicationContext=");
        sb3.append(this.applicationContext);
        sb3.append(", wallClock=");
        sb3.append(this.wallClock);
        sb3.append(", monotonicClock=");
        sb3.append(this.monotonicClock);
        sb3.append(", backendName=");
        return j.o(this.backendName, StringSubstitutor.DEFAULT_VAR_END, sb3);
    }
}
