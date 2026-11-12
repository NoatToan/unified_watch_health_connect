package com.linecorp.linesdk.a;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes18.dex */
public final class d {

    @NonNull
    public final String a;
    public final long b;
    public final long c;

    @NonNull
    public final String d;

    public d(@NonNull String str, long j, long j2, @NonNull String str2) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.b == dVar.b && this.c == dVar.c && this.a.equals(dVar.a)) {
            return this.d.equals(dVar.d);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        return ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "InternalAccessToken{accessToken='#####', expiresInMillis=" + this.b + ", issuedClientTimeMillis=" + this.c + ", refreshToken='" + this.d + "'}";
    }
}
