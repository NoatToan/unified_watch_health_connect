package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.core.content.PermissionChecker;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class t1 implements r1 {

    @GuardedBy("GservicesLoader.class")
    private static t1 c;

    @Nullable
    private final Context a;

    @Nullable
    private final ContentObserver b;

    private t1() {
        this.a = null;
        this.b = null;
    }

    private t1(Context context) {
        this.a = context;
        s1 s1Var = new s1(this, null);
        this.b = s1Var;
        context.getContentResolver().registerContentObserver(zzgv.zza, true, s1Var);
    }

    public static t1 a(Context context) {
        t1 t1Var;
        synchronized (t1.class) {
            if (c == null) {
                c = PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new t1(context) : new t1();
            }
            t1Var = c;
        }
        return t1Var;
    }

    public static synchronized void d() {
        Context context;
        t1 t1Var = c;
        if (t1Var != null && (context = t1Var.a) != null && t1Var.b != null) {
            context.getContentResolver().unregisterContentObserver(c.b);
        }
        c = null;
    }

    @Override // com.google.android.gms.internal.measurement.r1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String zzb(final String str) {
        if (this.a == null) {
            return null;
        }
        try {
            return (String) zzhc.zza(new zzhd() { // from class: com.google.android.gms.internal.measurement.zzhf
                @Override // com.google.android.gms.internal.measurement.zzhd
                public final Object zza() {
                    return this.zza.c(str);
                }
            });
        } catch (IllegalStateException | NullPointerException | SecurityException e) {
            String strValueOf = String.valueOf(str);
            Log.e("GservicesLoader", strValueOf.length() != 0 ? "Unable to read GServices for: ".concat(strValueOf) : new String("Unable to read GServices for: "), e);
            return null;
        }
    }

    public final /* synthetic */ String c(String str) {
        return zzgv.zza(this.a.getContentResolver(), str, null);
    }
}
