package com.twitter.sdk.android.core;

import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.AuthToken;

/* JADX INFO: loaded from: classes18.dex */
public class Session<T extends AuthToken> {

    @SerializedName("auth_token")
    private final T a;

    @SerializedName("id")
    private final long b;

    public Session(T t, long j) {
        if (t == null) {
            throw new IllegalArgumentException("AuthToken must not be null.");
        }
        this.a = t;
        this.b = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Session session = (Session) obj;
        if (this.b != session.b) {
            return false;
        }
        T t = this.a;
        T t2 = session.a;
        if (t != null) {
            return t.equals(t2);
        }
        return t2 == null;
    }

    public T getAuthToken() {
        return this.a;
    }

    public long getId() {
        return this.b;
    }

    public int hashCode() {
        T t = this.a;
        int iHashCode = t != null ? t.hashCode() : 0;
        long j = this.b;
        return (iHashCode * 31) + ((int) (j ^ (j >>> 32)));
    }
}
