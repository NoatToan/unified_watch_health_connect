package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Objects;
import javax.annotation.CheckForNull;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes3.dex */
final class b2<T> implements Serializable, zzib {
    public final zzib<T> a;
    public volatile transient boolean b;

    @CheckForNull
    public transient T c;

    public b2(zzib<T> zzibVar) {
        Objects.requireNonNull(zzibVar);
        this.a = zzibVar;
    }

    public final String toString() {
        Object string;
        if (this.b) {
            String strValueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(SearchCriteria.GT);
            string = sb.toString();
        } else {
            string = this.a;
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final T zza() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    T tZza = this.a.zza();
                    this.c = tZza;
                    this.b = true;
                    return tZza;
                }
            }
        }
        return this.c;
    }
}
