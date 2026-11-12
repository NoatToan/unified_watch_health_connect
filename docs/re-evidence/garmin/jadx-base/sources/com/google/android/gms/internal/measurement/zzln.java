package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
final class zzln implements zzov {
    private final zzlm zza;

    private zzln(zzlm zzlmVar) {
        byte[] bArr = zzmp.zzb;
        this.zza = zzlmVar;
        zzlmVar.zza = this;
    }

    public static zzln zza(zzlm zzlmVar) {
        zzln zzlnVar = zzlmVar.zza;
        return zzlnVar != null ? zzlnVar : new zzln(zzlmVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzA(int i14, List list, boolean z14) {
        int i15 = 0;
        if (!(list instanceof zzna)) {
            if (!z14) {
                while (i15 < list.size()) {
                    this.zza.zzf(i14, ((Long) list.get(i15)).longValue());
                    i15++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                ((Long) list.get(i17)).getClass();
                i16 += 8;
            }
            zzlmVar.zzr(i16);
            while (i15 < list.size()) {
                zzlmVar.zzu(((Long) list.get(i15)).longValue());
                i15++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z14) {
            while (i15 < zznaVar.size()) {
                this.zza.zzf(i14, zznaVar.zzc(i15));
                i15++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < zznaVar.size(); i19++) {
            zznaVar.zzc(i19);
            i18 += 8;
        }
        zzlmVar2.zzr(i18);
        while (i15 < zznaVar.size()) {
            zzlmVar2.zzu(zznaVar.zzc(i15));
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzB(int i14, List list, boolean z14) {
        int i15 = 0;
        if (!(list instanceof zzly)) {
            if (!z14) {
                while (i15 < list.size()) {
                    this.zza.zzd(i14, Float.floatToRawIntBits(((Float) list.get(i15)).floatValue()));
                    i15++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                ((Float) list.get(i17)).getClass();
                i16 += 4;
            }
            zzlmVar.zzr(i16);
            while (i15 < list.size()) {
                zzlmVar.zzs(Float.floatToRawIntBits(((Float) list.get(i15)).floatValue()));
                i15++;
            }
            return;
        }
        zzly zzlyVar = (zzly) list;
        if (!z14) {
            while (i15 < zzlyVar.size()) {
                this.zza.zzd(i14, Float.floatToRawIntBits(zzlyVar.zze(i15)));
                i15++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < zzlyVar.size(); i19++) {
            zzlyVar.zze(i19);
            i18 += 4;
        }
        zzlmVar2.zzr(i18);
        while (i15 < zzlyVar.size()) {
            zzlmVar2.zzs(Float.floatToRawIntBits(zzlyVar.zze(i15)));
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzC(int i14, List list, boolean z14) {
        int i15 = 0;
        if (!(list instanceof zzlo)) {
            if (!z14) {
                while (i15 < list.size()) {
                    this.zza.zzf(i14, Double.doubleToRawLongBits(((Double) list.get(i15)).doubleValue()));
                    i15++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                ((Double) list.get(i17)).getClass();
                i16 += 8;
            }
            zzlmVar.zzr(i16);
            while (i15 < list.size()) {
                zzlmVar.zzu(Double.doubleToRawLongBits(((Double) list.get(i15)).doubleValue()));
                i15++;
            }
            return;
        }
        zzlo zzloVar = (zzlo) list;
        if (!z14) {
            while (i15 < zzloVar.size()) {
                this.zza.zzf(i14, Double.doubleToRawLongBits(zzloVar.zze(i15)));
                i15++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < zzloVar.size(); i19++) {
            zzloVar.zze(i19);
            i18 += 8;
        }
        zzlmVar2.zzr(i18);
        while (i15 < zzloVar.size()) {
            zzlmVar2.zzu(Double.doubleToRawLongBits(zzloVar.zze(i15)));
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzD(int i14, List list, boolean z14) {
        int i15 = 0;
        if (!(list instanceof zzmg)) {
            if (!z14) {
                while (i15 < list.size()) {
                    this.zza.zzb(i14, ((Integer) list.get(i15)).intValue());
                    i15++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i14, 2);
            int iZzA = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                iZzA += zzlm.zzA(((Integer) list.get(i16)).intValue());
            }
            zzlmVar.zzr(iZzA);
            while (i15 < list.size()) {
                zzlmVar.zzq(((Integer) list.get(i15)).intValue());
                i15++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z14) {
            while (i15 < zzmgVar.size()) {
                this.zza.zzb(i14, zzmgVar.zzf(i15));
                i15++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i14, 2);
        int iZzA2 = 0;
        for (int i17 = 0; i17 < zzmgVar.size(); i17++) {
            iZzA2 += zzlm.zzA(zzmgVar.zzf(i17));
        }
        zzlmVar2.zzr(iZzA2);
        while (i15 < zzmgVar.size()) {
            zzlmVar2.zzq(zzmgVar.zzf(i15));
            i15++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzE(int i14, List list, boolean z14) {
        int i15 = 0;
        if (!(list instanceof zzky)) {
            if (!z14) {
                while (i15 < list.size()) {
                    this.zza.zzg(i14, ((Boolean) list.get(i15)).booleanValue());
                    i15++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                ((Boolean) list.get(i17)).getClass();
                i16++;
            }
            zzlmVar.zzr(i16);
            while (i15 < list.size()) {
                zzlmVar.zzp(((Boolean) list.get(i15)).booleanValue() ? (byte) 1 : (byte) 0);
                i15++;
            }
            return;
        }
        zzky zzkyVar = (zzky) list;
        if (!z14) {
            while (i15 < zzkyVar.size()) {
                this.zza.zzg(i14, zzkyVar.zze(i15));
                i15++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < zzkyVar.size(); i19++) {
            zzkyVar.zze(i19);
            i18++;
        }
        zzlmVar2.zzr(i18);
        while (i15 < zzkyVar.size()) {
            zzlmVar2.zzp(zzkyVar.zze(i15) ? (byte) 1 : (byte) 0);
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzF(int i14, List list) {
        int i15 = 0;
        if (!(list instanceof zzmx)) {
            while (i15 < list.size()) {
                this.zza.zzh(i14, (String) list.get(i15));
                i15++;
            }
            return;
        }
        zzmx zzmxVar = (zzmx) list;
        while (i15 < list.size()) {
            Object objZzc = zzmxVar.zzc();
            boolean z14 = objZzc instanceof String;
            zzlm zzlmVar = this.zza;
            if (z14) {
                zzlmVar.zzh(i14, (String) objZzc);
            } else {
                zzlmVar.zzi(i14, (zzlh) objZzc);
            }
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzG(int i14, List list) {
        for (int i15 = 0; i15 < list.size(); i15++) {
            this.zza.zzi(i14, (zzlh) list.get(i15));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzH(int i14, List list, boolean z14) {
        int i15 = 0;
        if (!(list instanceof zzmg)) {
            if (!z14) {
                while (i15 < list.size()) {
                    this.zza.zzc(i14, ((Integer) list.get(i15)).intValue());
                    i15++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i14, 2);
            int iZzz = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                iZzz += zzlm.zzz(((Integer) list.get(i16)).intValue());
            }
            zzlmVar.zzr(iZzz);
            while (i15 < list.size()) {
                zzlmVar.zzr(((Integer) list.get(i15)).intValue());
                i15++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z14) {
            while (i15 < zzmgVar.size()) {
                this.zza.zzc(i14, zzmgVar.zzf(i15));
                i15++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i14, 2);
        int iZzz2 = 0;
        for (int i17 = 0; i17 < zzmgVar.size(); i17++) {
            iZzz2 += zzlm.zzz(zzmgVar.zzf(i17));
        }
        zzlmVar2.zzr(iZzz2);
        while (i15 < zzmgVar.size()) {
            zzlmVar2.zzr(zzmgVar.zzf(i15));
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzI(int i14, List list, boolean z14) {
        int i15 = 0;
        if (!(list instanceof zzmg)) {
            if (!z14) {
                while (i15 < list.size()) {
                    this.zza.zzd(i14, ((Integer) list.get(i15)).intValue());
                    i15++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                ((Integer) list.get(i17)).getClass();
                i16 += 4;
            }
            zzlmVar.zzr(i16);
            while (i15 < list.size()) {
                zzlmVar.zzs(((Integer) list.get(i15)).intValue());
                i15++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z14) {
            while (i15 < zzmgVar.size()) {
                this.zza.zzd(i14, zzmgVar.zzf(i15));
                i15++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < zzmgVar.size(); i19++) {
            zzmgVar.zzf(i19);
            i18 += 4;
        }
        zzlmVar2.zzr(i18);
        while (i15 < zzmgVar.size()) {
            zzlmVar2.zzs(zzmgVar.zzf(i15));
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzJ(int i14, List list, boolean z14) {
        int i15 = 0;
        if (!(list instanceof zzna)) {
            if (!z14) {
                while (i15 < list.size()) {
                    this.zza.zzf(i14, ((Long) list.get(i15)).longValue());
                    i15++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                ((Long) list.get(i17)).getClass();
                i16 += 8;
            }
            zzlmVar.zzr(i16);
            while (i15 < list.size()) {
                zzlmVar.zzu(((Long) list.get(i15)).longValue());
                i15++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z14) {
            while (i15 < zznaVar.size()) {
                this.zza.zzf(i14, zznaVar.zzc(i15));
                i15++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < zznaVar.size(); i19++) {
            zznaVar.zzc(i19);
            i18 += 8;
        }
        zzlmVar2.zzr(i18);
        while (i15 < zznaVar.size()) {
            zzlmVar2.zzu(zznaVar.zzc(i15));
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzK(int i14, List list, boolean z14) {
        int i15 = 0;
        if (!(list instanceof zzmg)) {
            if (!z14) {
                while (i15 < list.size()) {
                    zzlm zzlmVar = this.zza;
                    int iIntValue = ((Integer) list.get(i15)).intValue();
                    zzlmVar.zzc(i14, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i15++;
                }
                return;
            }
            zzlm zzlmVar2 = this.zza;
            zzlmVar2.zza(i14, 2);
            int iZzz = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                int iIntValue2 = ((Integer) list.get(i16)).intValue();
                iZzz += zzlm.zzz((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zzlmVar2.zzr(iZzz);
            while (i15 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i15)).intValue();
                zzlmVar2.zzr((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i15++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z14) {
            while (i15 < zzmgVar.size()) {
                zzlm zzlmVar3 = this.zza;
                int iZzf = zzmgVar.zzf(i15);
                zzlmVar3.zzc(i14, (iZzf >> 31) ^ (iZzf + iZzf));
                i15++;
            }
            return;
        }
        zzlm zzlmVar4 = this.zza;
        zzlmVar4.zza(i14, 2);
        int iZzz2 = 0;
        for (int i17 = 0; i17 < zzmgVar.size(); i17++) {
            int iZzf2 = zzmgVar.zzf(i17);
            iZzz2 += zzlm.zzz((iZzf2 >> 31) ^ (iZzf2 + iZzf2));
        }
        zzlmVar4.zzr(iZzz2);
        while (i15 < zzmgVar.size()) {
            int iZzf3 = zzmgVar.zzf(i15);
            zzlmVar4.zzr((iZzf3 >> 31) ^ (iZzf3 + iZzf3));
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzL(int i14, List list, boolean z14) {
        int i15 = 0;
        if (!(list instanceof zzna)) {
            if (!z14) {
                while (i15 < list.size()) {
                    zzlm zzlmVar = this.zza;
                    long jLongValue = ((Long) list.get(i15)).longValue();
                    zzlmVar.zze(i14, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i15++;
                }
                return;
            }
            zzlm zzlmVar2 = this.zza;
            zzlmVar2.zza(i14, 2);
            int iZzA = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                long jLongValue2 = ((Long) list.get(i16)).longValue();
                iZzA += zzlm.zzA((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zzlmVar2.zzr(iZzA);
            while (i15 < list.size()) {
                long jLongValue3 = ((Long) list.get(i15)).longValue();
                zzlmVar2.zzt((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i15++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z14) {
            while (i15 < zznaVar.size()) {
                zzlm zzlmVar3 = this.zza;
                long jZzc = zznaVar.zzc(i15);
                zzlmVar3.zze(i14, (jZzc >> 63) ^ (jZzc + jZzc));
                i15++;
            }
            return;
        }
        zzlm zzlmVar4 = this.zza;
        zzlmVar4.zza(i14, 2);
        int iZzA2 = 0;
        for (int i17 = 0; i17 < zznaVar.size(); i17++) {
            long jZzc2 = zznaVar.zzc(i17);
            iZzA2 += zzlm.zzA((jZzc2 >> 63) ^ (jZzc2 + jZzc2));
        }
        zzlmVar4.zzr(iZzA2);
        while (i15 < zznaVar.size()) {
            long jZzc3 = zznaVar.zzc(i15);
            zzlmVar4.zzt((jZzc3 >> 63) ^ (jZzc3 + jZzc3));
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzM(int i14, zzne zzneVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i14, 2);
            zzlmVar.zzr(zznf.zzc(zzneVar, entry.getKey(), entry.getValue()));
            zznf.zzb(zzlmVar, zzneVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzb(int i14, int i15) {
        this.zza.zzd(i14, i15);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzc(int i14, long j8) {
        this.zza.zze(i14, j8);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzd(int i14, long j8) {
        this.zza.zzf(i14, j8);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zze(int i14, float f14) {
        this.zza.zzd(i14, Float.floatToRawIntBits(f14));
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzf(int i14, double d14) {
        this.zza.zzf(i14, Double.doubleToRawLongBits(d14));
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzg(int i14, int i15) {
        this.zza.zzb(i14, i15);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzh(int i14, long j8) {
        this.zza.zze(i14, j8);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzi(int i14, int i15) {
        this.zza.zzb(i14, i15);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzj(int i14, long j8) {
        this.zza.zzf(i14, j8);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzk(int i14, int i15) {
        this.zza.zzd(i14, i15);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzl(int i14, boolean z14) {
        this.zza.zzg(i14, z14);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzm(int i14, String str) {
        this.zza.zzh(i14, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzn(int i14, zzlh zzlhVar) {
        this.zza.zzi(i14, zzlhVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzo(int i14, int i15) {
        this.zza.zzc(i14, i15);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzp(int i14, int i15) {
        this.zza.zzc(i14, (i15 >> 31) ^ (i15 + i15));
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzq(int i14, long j8) {
        this.zza.zze(i14, (j8 >> 63) ^ (j8 + j8));
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzr(int i14, Object obj, zznx zznxVar) {
        this.zza.zzl(i14, (zznm) obj, zznxVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzs(int i14, Object obj, zznx zznxVar) {
        zzlm zzlmVar = this.zza;
        zzlmVar.zza(i14, 3);
        zznxVar.zzf((zznm) obj, zzlmVar.zza);
        zzlmVar.zza(i14, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    @Deprecated
    public final void zzt(int i14) {
        this.zza.zza(i14, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    @Deprecated
    public final void zzu(int i14) {
        this.zza.zza(i14, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzv(int i14, Object obj) {
        boolean z14 = obj instanceof zzlh;
        zzlm zzlmVar = this.zza;
        if (z14) {
            zzlmVar.zzn(i14, (zzlh) obj);
        } else {
            zzlmVar.zzm(i14, (zznm) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzw(int i14, List list, boolean z14) {
        int i15 = 0;
        if (!(list instanceof zzmg)) {
            if (!z14) {
                while (i15 < list.size()) {
                    this.zza.zzb(i14, ((Integer) list.get(i15)).intValue());
                    i15++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i14, 2);
            int iZzA = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                iZzA += zzlm.zzA(((Integer) list.get(i16)).intValue());
            }
            zzlmVar.zzr(iZzA);
            while (i15 < list.size()) {
                zzlmVar.zzq(((Integer) list.get(i15)).intValue());
                i15++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z14) {
            while (i15 < zzmgVar.size()) {
                this.zza.zzb(i14, zzmgVar.zzf(i15));
                i15++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i14, 2);
        int iZzA2 = 0;
        for (int i17 = 0; i17 < zzmgVar.size(); i17++) {
            iZzA2 += zzlm.zzA(zzmgVar.zzf(i17));
        }
        zzlmVar2.zzr(iZzA2);
        while (i15 < zzmgVar.size()) {
            zzlmVar2.zzq(zzmgVar.zzf(i15));
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzx(int i14, List list, boolean z14) {
        int i15 = 0;
        if (!(list instanceof zzmg)) {
            if (!z14) {
                while (i15 < list.size()) {
                    this.zza.zzd(i14, ((Integer) list.get(i15)).intValue());
                    i15++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                ((Integer) list.get(i17)).getClass();
                i16 += 4;
            }
            zzlmVar.zzr(i16);
            while (i15 < list.size()) {
                zzlmVar.zzs(((Integer) list.get(i15)).intValue());
                i15++;
            }
            return;
        }
        zzmg zzmgVar = (zzmg) list;
        if (!z14) {
            while (i15 < zzmgVar.size()) {
                this.zza.zzd(i14, zzmgVar.zzf(i15));
                i15++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < zzmgVar.size(); i19++) {
            zzmgVar.zzf(i19);
            i18 += 4;
        }
        zzlmVar2.zzr(i18);
        while (i15 < zzmgVar.size()) {
            zzlmVar2.zzs(zzmgVar.zzf(i15));
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzy(int i14, List list, boolean z14) {
        int i15 = 0;
        if (!(list instanceof zzna)) {
            if (!z14) {
                while (i15 < list.size()) {
                    this.zza.zze(i14, ((Long) list.get(i15)).longValue());
                    i15++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i14, 2);
            int iZzA = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                iZzA += zzlm.zzA(((Long) list.get(i16)).longValue());
            }
            zzlmVar.zzr(iZzA);
            while (i15 < list.size()) {
                zzlmVar.zzt(((Long) list.get(i15)).longValue());
                i15++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z14) {
            while (i15 < zznaVar.size()) {
                this.zza.zze(i14, zznaVar.zzc(i15));
                i15++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i14, 2);
        int iZzA2 = 0;
        for (int i17 = 0; i17 < zznaVar.size(); i17++) {
            iZzA2 += zzlm.zzA(zznaVar.zzc(i17));
        }
        zzlmVar2.zzr(iZzA2);
        while (i15 < zznaVar.size()) {
            zzlmVar2.zzt(zznaVar.zzc(i15));
            i15++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzov
    public final void zzz(int i14, List list, boolean z14) {
        int i15 = 0;
        if (!(list instanceof zzna)) {
            if (!z14) {
                while (i15 < list.size()) {
                    this.zza.zze(i14, ((Long) list.get(i15)).longValue());
                    i15++;
                }
                return;
            }
            zzlm zzlmVar = this.zza;
            zzlmVar.zza(i14, 2);
            int iZzA = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                iZzA += zzlm.zzA(((Long) list.get(i16)).longValue());
            }
            zzlmVar.zzr(iZzA);
            while (i15 < list.size()) {
                zzlmVar.zzt(((Long) list.get(i15)).longValue());
                i15++;
            }
            return;
        }
        zzna zznaVar = (zzna) list;
        if (!z14) {
            while (i15 < zznaVar.size()) {
                this.zza.zze(i14, zznaVar.zzc(i15));
                i15++;
            }
            return;
        }
        zzlm zzlmVar2 = this.zza;
        zzlmVar2.zza(i14, 2);
        int iZzA2 = 0;
        for (int i17 = 0; i17 < zznaVar.size(); i17++) {
            iZzA2 += zzlm.zzA(zznaVar.zzc(i17));
        }
        zzlmVar2.zzr(iZzA2);
        while (i15 < zznaVar.size()) {
            zzlmVar2.zzt(zznaVar.zzc(i15));
            i15++;
        }
    }
}
