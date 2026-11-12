package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class zzh {
    private Long zzA;
    private long zzB;
    private String zzC;
    private int zzD;
    private int zzE;
    private long zzF;
    private String zzG;
    private byte[] zzH;
    private int zzI;
    private long zzJ;
    private long zzK;
    private long zzL;
    private long zzM;
    private long zzN;
    private long zzO;
    private String zzP;
    private boolean zzQ;
    private long zzR;
    private long zzS;
    private final zzic zza;
    private final String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private String zzj;
    private long zzk;
    private String zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private Boolean zzq;
    private long zzr;
    private List zzs;
    private String zzt;
    private boolean zzu;
    private long zzv;
    private long zzw;
    private int zzx;
    private boolean zzy;
    private Long zzz;

    public zzh(zzic zzicVar, String str) {
        Preconditions.checkNotNull(zzicVar);
        Preconditions.checkNotEmpty(str);
        this.zza = zzicVar;
        this.zzb = str;
        zzicVar.zzaW().zzg();
    }

    public final void zzA(long j8) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzn != j8;
        this.zzn = j8;
    }

    public final long zzB() {
        this.zza.zzaW().zzg();
        return this.zzr;
    }

    public final void zzC(long j8) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzr != j8;
        this.zzr = j8;
    }

    public final boolean zzD() {
        this.zza.zzaW().zzg();
        return this.zzo;
    }

    public final void zzE(boolean z14) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzo != z14;
        this.zzo = z14;
    }

    public final void zzF(long j8) {
        Preconditions.checkArgument(j8 >= 0);
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzg != j8;
        this.zzg = j8;
    }

    public final long zzG() {
        this.zza.zzaW().zzg();
        return this.zzg;
    }

    public final long zzH() {
        this.zza.zzaW().zzg();
        return this.zzR;
    }

    public final void zzI(long j8) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzR != j8;
        this.zzR = j8;
    }

    public final long zzJ() {
        this.zza.zzaW().zzg();
        return this.zzS;
    }

    public final void zzK(long j8) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzS != j8;
        this.zzS = j8;
    }

    public final void zzL() {
        zzic zzicVar = this.zza;
        zzicVar.zzaW().zzg();
        long j8 = this.zzg + 1;
        if (j8 > 2147483647L) {
            zzicVar.zzaV().zze().zzb("Bundle index overflow. appId", zzgu.zzl(this.zzb));
            j8 = 0;
        }
        this.zzQ = true;
        this.zzg = j8;
    }

    public final void zzM(long j8) {
        zzic zzicVar = this.zza;
        zzicVar.zzaW().zzg();
        long j14 = this.zzg + j8;
        if (j14 > 2147483647L) {
            zzicVar.zzaV().zze().zzb("Bundle index overflow. appId", zzgu.zzl(this.zzb));
            j14 = (-1) + j8;
        }
        long j15 = this.zzF + 1;
        if (j15 > 2147483647L) {
            zzicVar.zzaV().zze().zzb("Delivery index overflow. appId", zzgu.zzl(this.zzb));
            j15 = 0;
        }
        this.zzQ = true;
        this.zzg = j14;
        this.zzF = j15;
    }

    public final long zzN() {
        this.zza.zzaW().zzg();
        return this.zzJ;
    }

    public final void zzO(long j8) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzJ != j8;
        this.zzJ = j8;
    }

    public final long zzP() {
        this.zza.zzaW().zzg();
        return this.zzK;
    }

    public final void zzQ(long j8) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzK != j8;
        this.zzK = j8;
    }

    public final long zzR() {
        this.zza.zzaW().zzg();
        return this.zzL;
    }

    public final void zzS(long j8) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzL != j8;
        this.zzL = j8;
    }

    public final long zzT() {
        this.zza.zzaW().zzg();
        return this.zzM;
    }

    public final void zzU(long j8) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzM != j8;
        this.zzM = j8;
    }

    public final long zzV() {
        this.zza.zzaW().zzg();
        return this.zzO;
    }

    public final void zzW(long j8) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzO != j8;
        this.zzO = j8;
    }

    public final long zzX() {
        this.zza.zzaW().zzg();
        return this.zzN;
    }

    public final void zzY(long j8) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzN != j8;
        this.zzN = j8;
    }

    public final String zzZ() {
        this.zza.zzaW().zzg();
        return this.zzP;
    }

    public final boolean zza() {
        this.zza.zzaW().zzg();
        return this.zzQ;
    }

    public final int zzaA() {
        this.zza.zzaW().zzg();
        return this.zzD;
    }

    public final void zzaB(int i14) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzD != i14;
        this.zzD = i14;
    }

    public final int zzaC() {
        this.zza.zzaW().zzg();
        return this.zzE;
    }

    public final void zzaD(int i14) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzE != i14;
        this.zzE = i14;
    }

    public final void zzaE(long j8) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzF != j8;
        this.zzF = j8;
    }

    public final long zzaF() {
        this.zza.zzaW().zzg();
        return this.zzF;
    }

    public final void zzaG(String str) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzG != str;
        this.zzG = str;
    }

    public final String zzaH() {
        this.zza.zzaW().zzg();
        return this.zzG;
    }

    public final void zzaI(byte[] bArr) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzH != bArr;
        this.zzH = bArr;
    }

    public final byte[] zzaJ() {
        this.zza.zzaW().zzg();
        return this.zzH;
    }

    public final void zzaK(int i14) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzI != i14;
        this.zzI = i14;
    }

    public final int zzaL() {
        this.zza.zzaW().zzg();
        return this.zzI;
    }

    public final String zzaa() {
        this.zza.zzaW().zzg();
        String str = this.zzP;
        zzab(null);
        return str;
    }

    public final void zzab(String str) {
        this.zza.zzaW().zzg();
        this.zzQ |= !Objects.equals(this.zzP, str);
        this.zzP = str;
    }

    public final boolean zzac() {
        this.zza.zzaW().zzg();
        return this.zzp;
    }

    public final void zzad(boolean z14) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzp != z14;
        this.zzp = z14;
    }

    public final Boolean zzae() {
        this.zza.zzaW().zzg();
        return this.zzq;
    }

    public final void zzaf(Boolean bool) {
        this.zza.zzaW().zzg();
        this.zzQ |= !Objects.equals(this.zzq, bool);
        this.zzq = bool;
    }

    public final List zzag() {
        this.zza.zzaW().zzg();
        return this.zzs;
    }

    public final void zzah(List list) {
        this.zza.zzaW().zzg();
        if (Objects.equals(this.zzs, list)) {
            return;
        }
        this.zzQ = true;
        this.zzs = list != null ? new ArrayList(list) : null;
    }

    public final boolean zzai() {
        this.zza.zzaW().zzg();
        return this.zzu;
    }

    public final void zzaj(boolean z14) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzu != z14;
        this.zzu = z14;
    }

    public final long zzak() {
        this.zza.zzaW().zzg();
        return this.zzv;
    }

    public final void zzal(long j8) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzv != j8;
        this.zzv = j8;
    }

    public final long zzam() {
        this.zza.zzaW().zzg();
        return this.zzw;
    }

    public final void zzan(long j8) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzw != j8;
        this.zzw = j8;
    }

    public final int zzao() {
        this.zza.zzaW().zzg();
        return this.zzx;
    }

    public final void zzap(int i14) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzx != i14;
        this.zzx = i14;
    }

    public final boolean zzaq() {
        this.zza.zzaW().zzg();
        return this.zzy;
    }

    public final void zzar(boolean z14) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzy != z14;
        this.zzy = z14;
    }

    public final Long zzas() {
        this.zza.zzaW().zzg();
        return this.zzz;
    }

    public final void zzat(Long l14) {
        this.zza.zzaW().zzg();
        this.zzQ |= !Objects.equals(this.zzz, l14);
        this.zzz = l14;
    }

    public final Long zzau() {
        this.zza.zzaW().zzg();
        return this.zzA;
    }

    public final void zzav(Long l14) {
        this.zza.zzaW().zzg();
        this.zzQ |= !Objects.equals(this.zzA, l14);
        this.zzA = l14;
    }

    public final long zzaw() {
        this.zza.zzaW().zzg();
        return this.zzB;
    }

    public final void zzax(long j8) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzB != j8;
        this.zzB = j8;
    }

    public final String zzay() {
        this.zza.zzaW().zzg();
        return this.zzC;
    }

    public final void zzaz(String str) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzC != str;
        this.zzC = str;
    }

    public final void zzb() {
        this.zza.zzaW().zzg();
        this.zzQ = false;
    }

    public final String zzc() {
        this.zza.zzaW().zzg();
        return this.zzb;
    }

    public final String zzd() {
        this.zza.zzaW().zzg();
        return this.zzc;
    }

    public final void zze(String str) {
        this.zza.zzaW().zzg();
        this.zzQ |= !Objects.equals(this.zzc, str);
        this.zzc = str;
    }

    public final String zzf() {
        this.zza.zzaW().zzg();
        return this.zzd;
    }

    public final void zzg(String str) {
        this.zza.zzaW().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzQ |= true ^ Objects.equals(this.zzd, str);
        this.zzd = str;
    }

    public final String zzh() {
        this.zza.zzaW().zzg();
        return this.zzt;
    }

    public final void zzi(String str) {
        this.zza.zzaW().zzg();
        this.zzQ |= !Objects.equals(this.zzt, str);
        this.zzt = str;
    }

    public final String zzj() {
        this.zza.zzaW().zzg();
        return this.zze;
    }

    public final void zzk(String str) {
        this.zza.zzaW().zzg();
        this.zzQ |= !Objects.equals(this.zze, str);
        this.zze = str;
    }

    public final String zzl() {
        this.zza.zzaW().zzg();
        return this.zzf;
    }

    public final void zzm(String str) {
        this.zza.zzaW().zzg();
        this.zzQ |= !Objects.equals(this.zzf, str);
        this.zzf = str;
    }

    public final long zzn() {
        this.zza.zzaW().zzg();
        return this.zzh;
    }

    public final void zzo(long j8) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzh != j8;
        this.zzh = j8;
    }

    public final long zzp() {
        this.zza.zzaW().zzg();
        return this.zzi;
    }

    public final void zzq(long j8) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzi != j8;
        this.zzi = j8;
    }

    public final String zzr() {
        this.zza.zzaW().zzg();
        return this.zzj;
    }

    public final void zzs(String str) {
        this.zza.zzaW().zzg();
        this.zzQ |= !Objects.equals(this.zzj, str);
        this.zzj = str;
    }

    public final long zzt() {
        this.zza.zzaW().zzg();
        return this.zzk;
    }

    public final void zzu(long j8) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzk != j8;
        this.zzk = j8;
    }

    public final String zzv() {
        this.zza.zzaW().zzg();
        return this.zzl;
    }

    public final void zzw(String str) {
        this.zza.zzaW().zzg();
        this.zzQ |= !Objects.equals(this.zzl, str);
        this.zzl = str;
    }

    public final long zzx() {
        this.zza.zzaW().zzg();
        return this.zzm;
    }

    public final void zzy(long j8) {
        this.zza.zzaW().zzg();
        this.zzQ |= this.zzm != j8;
        this.zzm = j8;
    }

    public final long zzz() {
        this.zza.zzaW().zzg();
        return this.zzn;
    }
}
