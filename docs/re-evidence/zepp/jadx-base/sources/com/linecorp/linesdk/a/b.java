package com.linecorp.linesdk.a;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class b {
    public final long a;

    @NonNull
    public final List<String> b;

    @NonNull
    private final String c;

    public b(@NonNull String str, long j, @NonNull List<String> list) {
        this.c = str;
        this.a = j;
        this.b = Collections.unmodifiableList(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.c.equals(bVar.c) && this.a == bVar.a) {
            return this.b.equals(bVar.b);
        }
        return false;
    }

    public final int hashCode() {
        int iIntValue = Integer.valueOf(this.c).intValue() * 31;
        long j = this.a;
        return ((iIntValue + ((int) (j ^ (j >>> 32)))) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AccessTokenVerificationResult{expiresInMillis=" + this.a + ", channelId=" + this.c + ", permissions=" + this.b + '}';
    }
}
