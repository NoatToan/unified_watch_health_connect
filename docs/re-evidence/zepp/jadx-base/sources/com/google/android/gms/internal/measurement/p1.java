package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class p1 extends y1 {
    private final Context a;
    private final zzib<zzhz<zzhi>> b;

    public p1(Context context, @Nullable zzib<zzhz<zzhi>> zzibVar) {
        Objects.requireNonNull(context, "Null context");
        this.a = context;
        this.b = zzibVar;
    }

    @Override // com.google.android.gms.internal.measurement.y1
    public final Context a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.measurement.y1
    @Nullable
    public final zzib<zzhz<zzhi>> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        zzib<zzhz<zzhi>> zzibVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            y1 y1Var = (y1) obj;
            if (this.a.equals(y1Var.a()) && ((zzibVar = this.b) != null ? zzibVar.equals(y1Var.b()) : y1Var.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        zzib<zzhz<zzhi>> zzibVar = this.b;
        return iHashCode ^ (zzibVar == null ? 0 : zzibVar.hashCode());
    }

    public final String toString() {
        String string = this.a.toString();
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(string.length() + 46 + strValueOf.length());
        sb.append("FlagsContext{context=");
        sb.append(string);
        sb.append(", hermeticFileOverrides=");
        sb.append(strValueOf);
        sb.append(com.alipay.sdk.m.u.i.d);
        return sb.toString();
    }
}
