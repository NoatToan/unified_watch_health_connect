package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
final class d2<T> implements Serializable, zzib {
    public final T a;

    public d2(T t) {
        this.a = t;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof d2)) {
            return false;
        }
        T t = this.a;
        T t2 = ((d2) obj).a;
        return t == t2 || t.equals(t2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        String string = this.a.toString();
        StringBuilder sb = new StringBuilder(string.length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final T zza() {
        return this.a;
    }
}
