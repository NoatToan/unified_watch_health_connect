package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
final class zzdo implements zzhh {
    private final zzdn zza;

    private zzdo(zzdn zzdnVar) {
        byte[] bArr = zzep.zzb;
        this.zza = zzdnVar;
        zzdnVar.zza = this;
    }

    public static zzdo zza(zzdn zzdnVar) {
        zzdo zzdoVar = zzdnVar.zza;
        return zzdoVar != null ? zzdoVar : new zzdo(zzdnVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzA(int i14, List list, boolean z14) {
        int i15 = 0;
        if (!(list instanceof zzfb)) {
            if (!z14) {
                while (i15 < list.size()) {
                    this.zza.zzh(i14, ((Long) list.get(i15)).longValue());
                    i15++;
                }
                return;
            }
            this.zza.zzr(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                ((Long) list.get(i17)).getClass();
                i16 += 8;
            }
            this.zza.zzt(i16);
            while (i15 < list.size()) {
                this.zza.zzi(((Long) list.get(i15)).longValue());
                i15++;
            }
            return;
        }
        zzfb zzfbVar = (zzfb) list;
        if (!z14) {
            while (i15 < zzfbVar.size()) {
                this.zza.zzh(i14, zzfbVar.zze(i15));
                i15++;
            }
            return;
        }
        this.zza.zzr(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < zzfbVar.size(); i19++) {
            zzfbVar.zze(i19);
            i18 += 8;
        }
        this.zza.zzt(i18);
        while (i15 < zzfbVar.size()) {
            this.zza.zzi(zzfbVar.zze(i15));
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzB(int i14, int i15) {
        this.zza.zzs(i14, (i15 >> 31) ^ (i15 + i15));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzC(int i14, List list, boolean z14) {
        int i15 = 0;
        if (!(list instanceof zzei)) {
            if (!z14) {
                while (i15 < list.size()) {
                    zzdn zzdnVar = this.zza;
                    int iIntValue = ((Integer) list.get(i15)).intValue();
                    zzdnVar.zzs(i14, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i15++;
                }
                return;
            }
            this.zza.zzr(i14, 2);
            int iZzA = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                int iIntValue2 = ((Integer) list.get(i16)).intValue();
                iZzA += zzdn.zzA((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.zza.zzt(iZzA);
            while (i15 < list.size()) {
                zzdn zzdnVar2 = this.zza;
                int iIntValue3 = ((Integer) list.get(i15)).intValue();
                zzdnVar2.zzt((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i15++;
            }
            return;
        }
        zzei zzeiVar = (zzei) list;
        if (!z14) {
            while (i15 < zzeiVar.size()) {
                zzdn zzdnVar3 = this.zza;
                int iZze = zzeiVar.zze(i15);
                zzdnVar3.zzs(i14, (iZze >> 31) ^ (iZze + iZze));
                i15++;
            }
            return;
        }
        this.zza.zzr(i14, 2);
        int iZzA2 = 0;
        for (int i17 = 0; i17 < zzeiVar.size(); i17++) {
            int iZze2 = zzeiVar.zze(i17);
            iZzA2 += zzdn.zzA((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        this.zza.zzt(iZzA2);
        while (i15 < zzeiVar.size()) {
            zzdn zzdnVar4 = this.zza;
            int iZze3 = zzeiVar.zze(i15);
            zzdnVar4.zzt((iZze3 >> 31) ^ (iZze3 + iZze3));
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzD(int i14, long j8) {
        this.zza.zzu(i14, (j8 >> 63) ^ (j8 + j8));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzE(int i14, List list, boolean z14) {
        int i15 = 0;
        if (!(list instanceof zzfb)) {
            if (!z14) {
                while (i15 < list.size()) {
                    zzdn zzdnVar = this.zza;
                    long jLongValue = ((Long) list.get(i15)).longValue();
                    zzdnVar.zzu(i14, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i15++;
                }
                return;
            }
            this.zza.zzr(i14, 2);
            int iZzB = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                long jLongValue2 = ((Long) list.get(i16)).longValue();
                iZzB += zzdn.zzB((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.zza.zzt(iZzB);
            while (i15 < list.size()) {
                zzdn zzdnVar2 = this.zza;
                long jLongValue3 = ((Long) list.get(i15)).longValue();
                zzdnVar2.zzv((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i15++;
            }
            return;
        }
        zzfb zzfbVar = (zzfb) list;
        if (!z14) {
            while (i15 < zzfbVar.size()) {
                zzdn zzdnVar3 = this.zza;
                long jZze = zzfbVar.zze(i15);
                zzdnVar3.zzu(i14, (jZze >> 63) ^ (jZze + jZze));
                i15++;
            }
            return;
        }
        this.zza.zzr(i14, 2);
        int iZzB2 = 0;
        for (int i17 = 0; i17 < zzfbVar.size(); i17++) {
            long jZze2 = zzfbVar.zze(i17);
            iZzB2 += zzdn.zzB((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        this.zza.zzt(iZzB2);
        while (i15 < zzfbVar.size()) {
            zzdn zzdnVar4 = this.zza;
            long jZze3 = zzfbVar.zze(i15);
            zzdnVar4.zzv((jZze3 >> 63) ^ (jZze3 + jZze3));
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    @Deprecated
    public final void zzF(int i14) {
        this.zza.zzr(i14, 3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzG(int i14, String str) {
        this.zza.zzp(i14, str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzH(int i14, List list) {
        int i15 = 0;
        if (!(list instanceof zzey)) {
            while (i15 < list.size()) {
                this.zza.zzp(i14, (String) list.get(i15));
                i15++;
            }
            return;
        }
        zzey zzeyVar = (zzey) list;
        while (i15 < list.size()) {
            Object objZza = zzeyVar.zza();
            boolean z14 = objZza instanceof String;
            zzdn zzdnVar = this.zza;
            if (z14) {
                zzdnVar.zzp(i14, (String) objZza);
            } else {
                zzdnVar.zze(i14, (zzdf) objZza);
            }
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzI(int i14, int i15) {
        this.zza.zzs(i14, i15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzJ(int i14, List list, boolean z14) {
        int i15 = 0;
        if (!(list instanceof zzei)) {
            if (!z14) {
                while (i15 < list.size()) {
                    this.zza.zzs(i14, ((Integer) list.get(i15)).intValue());
                    i15++;
                }
                return;
            }
            this.zza.zzr(i14, 2);
            int iZzA = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                iZzA += zzdn.zzA(((Integer) list.get(i16)).intValue());
            }
            this.zza.zzt(iZzA);
            while (i15 < list.size()) {
                this.zza.zzt(((Integer) list.get(i15)).intValue());
                i15++;
            }
            return;
        }
        zzei zzeiVar = (zzei) list;
        if (!z14) {
            while (i15 < zzeiVar.size()) {
                this.zza.zzs(i14, zzeiVar.zze(i15));
                i15++;
            }
            return;
        }
        this.zza.zzr(i14, 2);
        int iZzA2 = 0;
        for (int i17 = 0; i17 < zzeiVar.size(); i17++) {
            iZzA2 += zzdn.zzA(zzeiVar.zze(i17));
        }
        this.zza.zzt(iZzA2);
        while (i15 < zzeiVar.size()) {
            this.zza.zzt(zzeiVar.zze(i15));
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzK(int i14, long j8) {
        this.zza.zzu(i14, j8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzL(int i14, List list, boolean z14) {
        int i15 = 0;
        if (!(list instanceof zzfb)) {
            if (!z14) {
                while (i15 < list.size()) {
                    this.zza.zzu(i14, ((Long) list.get(i15)).longValue());
                    i15++;
                }
                return;
            }
            this.zza.zzr(i14, 2);
            int iZzB = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                iZzB += zzdn.zzB(((Long) list.get(i16)).longValue());
            }
            this.zza.zzt(iZzB);
            while (i15 < list.size()) {
                this.zza.zzv(((Long) list.get(i15)).longValue());
                i15++;
            }
            return;
        }
        zzfb zzfbVar = (zzfb) list;
        if (!z14) {
            while (i15 < zzfbVar.size()) {
                this.zza.zzu(i14, zzfbVar.zze(i15));
                i15++;
            }
            return;
        }
        this.zza.zzr(i14, 2);
        int iZzB2 = 0;
        for (int i17 = 0; i17 < zzfbVar.size(); i17++) {
            iZzB2 += zzdn.zzB(zzfbVar.zze(i17));
        }
        this.zza.zzt(iZzB2);
        while (i15 < zzfbVar.size()) {
            this.zza.zzv(zzfbVar.zze(i15));
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzb(int i14, boolean z14) {
        this.zza.zzd(i14, z14);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzc(int i14, List list, boolean z14) {
        int i15 = 0;
        if (!(list instanceof zzcw)) {
            if (!z14) {
                while (i15 < list.size()) {
                    this.zza.zzd(i14, ((Boolean) list.get(i15)).booleanValue());
                    i15++;
                }
                return;
            }
            this.zza.zzr(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                ((Boolean) list.get(i17)).getClass();
                i16++;
            }
            this.zza.zzt(i16);
            while (i15 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i15)).booleanValue() ? (byte) 1 : (byte) 0);
                i15++;
            }
            return;
        }
        zzcw zzcwVar = (zzcw) list;
        if (!z14) {
            while (i15 < zzcwVar.size()) {
                this.zza.zzd(i14, zzcwVar.zzf(i15));
                i15++;
            }
            return;
        }
        this.zza.zzr(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < zzcwVar.size(); i19++) {
            zzcwVar.zzf(i19);
            i18++;
        }
        this.zza.zzt(i18);
        while (i15 < zzcwVar.size()) {
            this.zza.zzb(zzcwVar.zzf(i15) ? (byte) 1 : (byte) 0);
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzd(int i14, zzdf zzdfVar) {
        this.zza.zze(i14, zzdfVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zze(int i14, List list) {
        for (int i15 = 0; i15 < list.size(); i15++) {
            this.zza.zze(i14, (zzdf) list.get(i15));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzf(int i14, double d14) {
        this.zza.zzh(i14, Double.doubleToRawLongBits(d14));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzg(int i14, List list, boolean z14) {
        int i15 = 0;
        if (!(list instanceof zzdp)) {
            if (!z14) {
                while (i15 < list.size()) {
                    this.zza.zzh(i14, Double.doubleToRawLongBits(((Double) list.get(i15)).doubleValue()));
                    i15++;
                }
                return;
            }
            this.zza.zzr(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                ((Double) list.get(i17)).getClass();
                i16 += 8;
            }
            this.zza.zzt(i16);
            while (i15 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i15)).doubleValue()));
                i15++;
            }
            return;
        }
        zzdp zzdpVar = (zzdp) list;
        if (!z14) {
            while (i15 < zzdpVar.size()) {
                this.zza.zzh(i14, Double.doubleToRawLongBits(zzdpVar.zze(i15)));
                i15++;
            }
            return;
        }
        this.zza.zzr(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < zzdpVar.size(); i19++) {
            zzdpVar.zze(i19);
            i18 += 8;
        }
        this.zza.zzt(i18);
        while (i15 < zzdpVar.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(zzdpVar.zze(i15)));
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    @Deprecated
    public final void zzh(int i14) {
        this.zza.zzr(i14, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzi(int i14, int i15) {
        this.zza.zzj(i14, i15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzj(int i14, List list, boolean z14) {
        int i15 = 0;
        if (!(list instanceof zzei)) {
            if (!z14) {
                while (i15 < list.size()) {
                    this.zza.zzj(i14, ((Integer) list.get(i15)).intValue());
                    i15++;
                }
                return;
            }
            this.zza.zzr(i14, 2);
            int iZzB = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                iZzB += zzdn.zzB(((Integer) list.get(i16)).intValue());
            }
            this.zza.zzt(iZzB);
            while (i15 < list.size()) {
                this.zza.zzk(((Integer) list.get(i15)).intValue());
                i15++;
            }
            return;
        }
        zzei zzeiVar = (zzei) list;
        if (!z14) {
            while (i15 < zzeiVar.size()) {
                this.zza.zzj(i14, zzeiVar.zze(i15));
                i15++;
            }
            return;
        }
        this.zza.zzr(i14, 2);
        int iZzB2 = 0;
        for (int i17 = 0; i17 < zzeiVar.size(); i17++) {
            iZzB2 += zzdn.zzB(zzeiVar.zze(i17));
        }
        this.zza.zzt(iZzB2);
        while (i15 < zzeiVar.size()) {
            this.zza.zzk(zzeiVar.zze(i15));
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzk(int i14, int i15) {
        this.zza.zzf(i14, i15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzl(int i14, List list, boolean z14) {
        int i15 = 0;
        if (!(list instanceof zzei)) {
            if (!z14) {
                while (i15 < list.size()) {
                    this.zza.zzf(i14, ((Integer) list.get(i15)).intValue());
                    i15++;
                }
                return;
            }
            this.zza.zzr(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                ((Integer) list.get(i17)).getClass();
                i16 += 4;
            }
            this.zza.zzt(i16);
            while (i15 < list.size()) {
                this.zza.zzg(((Integer) list.get(i15)).intValue());
                i15++;
            }
            return;
        }
        zzei zzeiVar = (zzei) list;
        if (!z14) {
            while (i15 < zzeiVar.size()) {
                this.zza.zzf(i14, zzeiVar.zze(i15));
                i15++;
            }
            return;
        }
        this.zza.zzr(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < zzeiVar.size(); i19++) {
            zzeiVar.zze(i19);
            i18 += 4;
        }
        this.zza.zzt(i18);
        while (i15 < zzeiVar.size()) {
            this.zza.zzg(zzeiVar.zze(i15));
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzm(int i14, long j8) {
        this.zza.zzh(i14, j8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzn(int i14, List list, boolean z14) {
        int i15 = 0;
        if (!(list instanceof zzfb)) {
            if (!z14) {
                while (i15 < list.size()) {
                    this.zza.zzh(i14, ((Long) list.get(i15)).longValue());
                    i15++;
                }
                return;
            }
            this.zza.zzr(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                ((Long) list.get(i17)).getClass();
                i16 += 8;
            }
            this.zza.zzt(i16);
            while (i15 < list.size()) {
                this.zza.zzi(((Long) list.get(i15)).longValue());
                i15++;
            }
            return;
        }
        zzfb zzfbVar = (zzfb) list;
        if (!z14) {
            while (i15 < zzfbVar.size()) {
                this.zza.zzh(i14, zzfbVar.zze(i15));
                i15++;
            }
            return;
        }
        this.zza.zzr(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < zzfbVar.size(); i19++) {
            zzfbVar.zze(i19);
            i18 += 8;
        }
        this.zza.zzt(i18);
        while (i15 < zzfbVar.size()) {
            this.zza.zzi(zzfbVar.zze(i15));
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzo(int i14, float f14) {
        this.zza.zzf(i14, Float.floatToRawIntBits(f14));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzp(int i14, List list, boolean z14) {
        int i15 = 0;
        if (!(list instanceof zzdz)) {
            if (!z14) {
                while (i15 < list.size()) {
                    this.zza.zzf(i14, Float.floatToRawIntBits(((Float) list.get(i15)).floatValue()));
                    i15++;
                }
                return;
            }
            this.zza.zzr(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                ((Float) list.get(i17)).getClass();
                i16 += 4;
            }
            this.zza.zzt(i16);
            while (i15 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i15)).floatValue()));
                i15++;
            }
            return;
        }
        zzdz zzdzVar = (zzdz) list;
        if (!z14) {
            while (i15 < zzdzVar.size()) {
                this.zza.zzf(i14, Float.floatToRawIntBits(zzdzVar.zze(i15)));
                i15++;
            }
            return;
        }
        this.zza.zzr(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < zzdzVar.size(); i19++) {
            zzdzVar.zze(i19);
            i18 += 4;
        }
        this.zza.zzt(i18);
        while (i15 < zzdzVar.size()) {
            this.zza.zzg(Float.floatToRawIntBits(zzdzVar.zze(i15)));
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzq(int i14, Object obj, zzge zzgeVar) {
        zzdn zzdnVar = this.zza;
        zzdnVar.zzr(i14, 3);
        zzgeVar.zzi((zzfm) obj, zzdnVar.zza);
        zzdnVar.zzr(i14, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzr(int i14, int i15) {
        this.zza.zzj(i14, i15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzs(int i14, List list, boolean z14) {
        int i15 = 0;
        if (!(list instanceof zzei)) {
            if (!z14) {
                while (i15 < list.size()) {
                    this.zza.zzj(i14, ((Integer) list.get(i15)).intValue());
                    i15++;
                }
                return;
            }
            this.zza.zzr(i14, 2);
            int iZzB = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                iZzB += zzdn.zzB(((Integer) list.get(i16)).intValue());
            }
            this.zza.zzt(iZzB);
            while (i15 < list.size()) {
                this.zza.zzk(((Integer) list.get(i15)).intValue());
                i15++;
            }
            return;
        }
        zzei zzeiVar = (zzei) list;
        if (!z14) {
            while (i15 < zzeiVar.size()) {
                this.zza.zzj(i14, zzeiVar.zze(i15));
                i15++;
            }
            return;
        }
        this.zza.zzr(i14, 2);
        int iZzB2 = 0;
        for (int i17 = 0; i17 < zzeiVar.size(); i17++) {
            iZzB2 += zzdn.zzB(zzeiVar.zze(i17));
        }
        this.zza.zzt(iZzB2);
        while (i15 < zzeiVar.size()) {
            this.zza.zzk(zzeiVar.zze(i15));
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzt(int i14, long j8) {
        this.zza.zzu(i14, j8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzu(int i14, List list, boolean z14) {
        int i15 = 0;
        if (!(list instanceof zzfb)) {
            if (!z14) {
                while (i15 < list.size()) {
                    this.zza.zzu(i14, ((Long) list.get(i15)).longValue());
                    i15++;
                }
                return;
            }
            this.zza.zzr(i14, 2);
            int iZzB = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                iZzB += zzdn.zzB(((Long) list.get(i16)).longValue());
            }
            this.zza.zzt(iZzB);
            while (i15 < list.size()) {
                this.zza.zzv(((Long) list.get(i15)).longValue());
                i15++;
            }
            return;
        }
        zzfb zzfbVar = (zzfb) list;
        if (!z14) {
            while (i15 < zzfbVar.size()) {
                this.zza.zzu(i14, zzfbVar.zze(i15));
                i15++;
            }
            return;
        }
        this.zza.zzr(i14, 2);
        int iZzB2 = 0;
        for (int i17 = 0; i17 < zzfbVar.size(); i17++) {
            iZzB2 += zzdn.zzB(zzfbVar.zze(i17));
        }
        this.zza.zzt(iZzB2);
        while (i15 < zzfbVar.size()) {
            this.zza.zzv(zzfbVar.zze(i15));
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzv(int i14, Object obj, zzge zzgeVar) {
        this.zza.zzm(i14, (zzfm) obj, zzgeVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzw(int i14, Object obj) {
        boolean z14 = obj instanceof zzdf;
        zzdn zzdnVar = this.zza;
        if (z14) {
            zzdnVar.zzo(i14, (zzdf) obj);
        } else {
            zzdnVar.zzn(i14, (zzfm) obj);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzx(int i14, int i15) {
        this.zza.zzf(i14, i15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzy(int i14, List list, boolean z14) {
        int i15 = 0;
        if (!(list instanceof zzei)) {
            if (!z14) {
                while (i15 < list.size()) {
                    this.zza.zzf(i14, ((Integer) list.get(i15)).intValue());
                    i15++;
                }
                return;
            }
            this.zza.zzr(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                ((Integer) list.get(i17)).getClass();
                i16 += 4;
            }
            this.zza.zzt(i16);
            while (i15 < list.size()) {
                this.zza.zzg(((Integer) list.get(i15)).intValue());
                i15++;
            }
            return;
        }
        zzei zzeiVar = (zzei) list;
        if (!z14) {
            while (i15 < zzeiVar.size()) {
                this.zza.zzf(i14, zzeiVar.zze(i15));
                i15++;
            }
            return;
        }
        this.zza.zzr(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < zzeiVar.size(); i19++) {
            zzeiVar.zze(i19);
            i18 += 4;
        }
        this.zza.zzt(i18);
        while (i15 < zzeiVar.size()) {
            this.zza.zzg(zzeiVar.zze(i15));
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhh
    public final void zzz(int i14, long j8) {
        this.zza.zzh(i14, j8);
    }
}
