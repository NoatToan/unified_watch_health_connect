package com.google.android.gms.internal.measurement;

import java.util.Objects;
import javax.annotation.CheckForNull;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes3.dex */
final class c2<T> implements zzib<T> {

    @CheckForNull
    public volatile zzib<T> a;
    public volatile boolean b;

    @CheckForNull
    public T c;

    public c2(zzib<T> zzibVar) {
        Objects.requireNonNull(zzibVar);
        this.a = zzibVar;
    }

    public final String toString() {
        Object string = this.a;
        if (string == null) {
            String strValueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(SearchCriteria.GT);
            string = sb.toString();
        }
        String string2 = string.toString();
        StringBuilder sb2 = new StringBuilder(string2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(string2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final T zza() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    zzib<T> zzibVar = this.a;
                    zzibVar.getClass();
                    T tZza = zzibVar.zza();
                    this.c = tZza;
                    this.b = true;
                    this.a = null;
                    return tZza;
                }
            }
        }
        return this.c;
    }
}
