package com.google.android.play.core.splitinstall.internal;

import java.lang.reflect.Field;
import p6.b;

/* JADX INFO: loaded from: classes14.dex */
public class zzbj {
    private final Object zza;
    private final Field zzb;
    private final Class zzc;

    public zzbj(Object obj, Field field, Class cls) {
        this.zza = obj;
        this.zzb = field;
        this.zzc = cls;
    }

    public final Object zzc() {
        try {
            return this.zzc.cast(this.zzb.get(this.zza));
        } catch (Exception e4) {
            String name = this.zzb.getName();
            String name2 = this.zza.getClass().getName();
            String name3 = this.zzc.getName();
            StringBuilder sbI = b.i("Failed to get value of field ", name, " of type ", name2, " on object of type ");
            sbI.append(name3);
            throw new zzbl(sbI.toString(), e4);
        }
    }

    public final Field zzd() {
        return this.zzb;
    }

    public final void zze(Object obj) {
        try {
            this.zzb.set(this.zza, obj);
        } catch (Exception e4) {
            String name = this.zzb.getName();
            String name2 = this.zza.getClass().getName();
            String name3 = this.zzc.getName();
            StringBuilder sbI = b.i("Failed to set value of field ", name, " of type ", name2, " on object of type ");
            sbI.append(name3);
            throw new zzbl(sbI.toString(), e4);
        }
    }
}
