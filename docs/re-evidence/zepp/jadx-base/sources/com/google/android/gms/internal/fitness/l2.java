package com.google.android.gms.internal.fitness;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class l2 implements d5 {
    private final zzgk a;

    private l2(zzgk zzgkVar) {
        zzgk zzgkVar2 = (zzgk) zzhc.c(zzgkVar, "output");
        this.a = zzgkVar2;
        zzgkVar2.a = this;
    }

    public static l2 P(zzgk zzgkVar) {
        l2 l2Var = zzgkVar.a;
        return l2Var != null ? l2Var : new l2(zzgkVar);
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void A(int i, int i2) throws IOException {
        this.a.zze(i, i2);
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void B(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.zza(i, list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        this.a.writeTag(i, 2);
        int iZzc = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzc += zzgk.zzc(list.get(i3).doubleValue());
        }
        this.a.zzo(iZzc);
        while (i2 < list.size()) {
            this.a.zzb(list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void C(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.zza(i, list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        this.a.writeTag(i, 2);
        int iZzc = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzc += zzgk.zzc(list.get(i3).floatValue());
        }
        this.a.zzo(iZzc);
        while (i2 < list.size()) {
            this.a.zzb(list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final int D() {
        return zzkl.zzaea;
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void E(int i, List<?> list, x3 x3Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            H(i, list.get(i2), x3Var);
        }
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void F(int i, Object obj, x3 x3Var) throws IOException {
        zzgk zzgkVar = this.a;
        zzgkVar.writeTag(i, 3);
        x3Var.e((zzik) obj, zzgkVar.a);
        zzgkVar.writeTag(i, 4);
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void G(int i) throws IOException {
        this.a.writeTag(i, 4);
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void H(int i, Object obj, x3 x3Var) throws IOException {
        this.a.b(i, (zzik) obj, x3Var);
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void I(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.zzb(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.writeTag(i, 2);
        int iZzf = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzf += zzgk.zzf(list.get(i3).longValue());
        }
        this.a.zzo(iZzf);
        while (i2 < list.size()) {
            this.a.zzb(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void J(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.zzg(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.writeTag(i, 2);
        int iZzu = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzu += zzgk.zzu(list.get(i3).intValue());
        }
        this.a.zzo(iZzu);
        while (i2 < list.size()) {
            this.a.zzp(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void K(int i, zzfx zzfxVar) throws IOException {
        this.a.zza(i, zzfxVar);
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void L(int i, List<zzfx> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.zza(i, list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void M(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhr)) {
            while (i2 < list.size()) {
                this.a.zza(i, list.get(i2));
                i2++;
            }
            return;
        }
        zzhr zzhrVar = (zzhr) list;
        while (i2 < list.size()) {
            Object objZzaf = zzhrVar.zzaf(i2);
            if (objZzaf instanceof String) {
                this.a.zza(i, (String) objZzaf);
            } else {
                this.a.zza(i, (zzfx) objZzaf);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final <K, V> void N(int i, g3<K, V> g3Var, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.a.writeTag(i, 2);
            this.a.zzo(q2.e(g3Var.a, 1, entry.getKey()) + q2.e(g3Var.b, 2, entry.getValue()));
            zzgk zzgkVar = this.a;
            K key = entry.getKey();
            V value = entry.getValue();
            q2.g(zzgkVar, g3Var.a, 1, key);
            q2.g(zzgkVar, g3Var.b, 2, value);
        }
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void O(int i, List<?> list, x3 x3Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            F(i, list.get(i2), x3Var);
        }
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void a(int i, boolean z) throws IOException {
        this.a.zza(i, z);
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void b(int i, long j) throws IOException {
        this.a.zzb(i, j);
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void c(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.zze(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.writeTag(i, 2);
        int iZzs = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzs += zzgk.zzs(list.get(i3).intValue());
        }
        this.a.zzo(iZzs);
        while (i2 < list.size()) {
            this.a.zzn(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void d(int i, long j) throws IOException {
        this.a.zzc(i, j);
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void e(int i, Object obj) throws IOException {
        if (obj instanceof zzfx) {
            this.a.zzb(i, (zzfx) obj);
        } else {
            this.a.zza(i, (zzik) obj);
        }
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void f(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.zza(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.writeTag(i, 2);
        int iZzd = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzd += zzgk.zzd(list.get(i3).longValue());
        }
        this.a.zzo(iZzd);
        while (i2 < list.size()) {
            this.a.zza(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void g(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.zzh(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.writeTag(i, 2);
        int iZzv = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzv += zzgk.zzv(list.get(i3).intValue());
        }
        this.a.zzo(iZzv);
        while (i2 < list.size()) {
            this.a.zzq(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void h(int i, long j) throws IOException {
        this.a.zza(i, j);
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void i(int i, double d) throws IOException {
        this.a.zza(i, d);
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void j(int i, float f) throws IOException {
        this.a.zza(i, f);
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void k(int i, int i2) throws IOException {
        this.a.zzf(i, i2);
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void l(int i, int i2) throws IOException {
        this.a.zzg(i, i2);
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void m(int i, int i2) throws IOException {
        this.a.zze(i, i2);
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void n(int i, long j) throws IOException {
        this.a.zzc(i, j);
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void o(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.zza(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        this.a.writeTag(i, 2);
        int iZzb = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzb += zzgk.zzb(list.get(i3).booleanValue());
        }
        this.a.zzo(iZzb);
        while (i2 < list.size()) {
            this.a.zza(list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void p(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.zze(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.writeTag(i, 2);
        int iZzx = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzx += zzgk.zzx(list.get(i3).intValue());
        }
        this.a.zzo(iZzx);
        while (i2 < list.size()) {
            this.a.zzn(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void q(int i, int i2) throws IOException {
        this.a.zzh(i, i2);
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void r(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.zzc(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.writeTag(i, 2);
        int iZzh = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzh += zzgk.zzh(list.get(i3).longValue());
        }
        this.a.zzo(iZzh);
        while (i2 < list.size()) {
            this.a.zzc(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void s(int i, long j) throws IOException {
        this.a.zza(i, j);
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void t(int i, String str) throws IOException {
        this.a.zza(i, str);
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void u(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.zzf(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.writeTag(i, 2);
        int iZzt = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzt += zzgk.zzt(list.get(i3).intValue());
        }
        this.a.zzo(iZzt);
        while (i2 < list.size()) {
            this.a.zzo(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void v(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.zzh(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.writeTag(i, 2);
        int iZzw = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzw += zzgk.zzw(list.get(i3).intValue());
        }
        this.a.zzo(iZzw);
        while (i2 < list.size()) {
            this.a.zzq(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void w(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.zzc(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.writeTag(i, 2);
        int iZzg = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzg += zzgk.zzg(list.get(i3).longValue());
        }
        this.a.zzo(iZzg);
        while (i2 < list.size()) {
            this.a.zzc(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void x(int i, int i2) throws IOException {
        this.a.zzh(i, i2);
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void y(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.zza(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.writeTag(i, 2);
        int iZze = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZze += zzgk.zze(list.get(i3).longValue());
        }
        this.a.zzo(iZze);
        while (i2 < list.size()) {
            this.a.zza(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.d5
    public final void z(int i) throws IOException {
        this.a.writeTag(i, 3);
    }
}
