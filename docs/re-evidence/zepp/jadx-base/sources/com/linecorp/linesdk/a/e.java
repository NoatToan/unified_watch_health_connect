package com.linecorp.linesdk.a;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class e {

    @NonNull
    public final d a;

    @NonNull
    public final List<String> b;

    public e(@NonNull d dVar, @NonNull List<String> list) {
        this.a = dVar;
        this.b = Collections.unmodifiableList(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.a.equals(eVar.a)) {
            return this.b.equals(eVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "IssueAccessTokenResult{accessToken=" + ((Object) "#####") + ", permissions=" + this.b + '}';
    }
}
