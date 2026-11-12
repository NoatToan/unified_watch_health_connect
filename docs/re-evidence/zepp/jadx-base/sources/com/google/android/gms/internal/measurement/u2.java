package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class u2 {
    private final zzje a;

    private u2(zzje zzjeVar) {
        zzkf.c(zzjeVar, "output");
        this.a = zzjeVar;
        zzjeVar.a = this;
    }

    public static u2 l(zzje zzjeVar) {
        u2 u2Var = zzjeVar.a;
        return u2Var != null ? u2Var : new u2(zzjeVar);
    }

    public final void A(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.zzf(i, Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
            return;
        }
        this.a.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).floatValue();
            i3 += 4;
        }
        this.a.zzq(i3);
        while (i2 < list.size()) {
            this.a.zzg(Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }

    public final void B(int i, Object obj, a4 a4Var) throws IOException {
        zzje zzjeVar = this.a;
        zzjeVar.zzo(i, 3);
        a4Var.h((zzlc) obj, zzjeVar.a);
        zzjeVar.zzo(i, 4);
    }

    public final void C(int i, int i2) throws IOException {
        this.a.zzj(i, i2);
    }

    public final void D(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.zzj(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.zzo(i, 2);
        int iZzv = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzv += zzje.zzv(list.get(i3).intValue());
        }
        this.a.zzq(iZzv);
        while (i2 < list.size()) {
            this.a.zzk(list.get(i2).intValue());
            i2++;
        }
    }

    public final void E(int i, long j) throws IOException {
        this.a.zzr(i, j);
    }

    public final void F(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.zzr(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.zzo(i, 2);
        int iZzB = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzB += zzje.zzB(list.get(i3).longValue());
        }
        this.a.zzq(iZzB);
        while (i2 < list.size()) {
            this.a.zzs(list.get(i2).longValue());
            i2++;
        }
    }

    public final void G(int i, Object obj, a4 a4Var) throws IOException {
        zzlc zzlcVar = (zzlc) obj;
        t2 t2Var = (t2) this.a;
        t2Var.zzq((i << 3) | 2);
        zzih zzihVar = (zzih) zzlcVar;
        int iA = zzihVar.a();
        if (iA == -1) {
            iA = a4Var.d(zzihVar);
            zzihVar.b(iA);
        }
        t2Var.zzq(iA);
        a4Var.h(zzlcVar, t2Var.a);
    }

    public final void H(int i, int i2) throws IOException {
        this.a.zzf(i, i2);
    }

    public final void I(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.zzf(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).intValue();
            i3 += 4;
        }
        this.a.zzq(i3);
        while (i2 < list.size()) {
            this.a.zzg(list.get(i2).intValue());
            i2++;
        }
    }

    public final void J(int i, long j) throws IOException {
        this.a.zzh(i, j);
    }

    public final void K(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.zzh(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).longValue();
            i3 += 8;
        }
        this.a.zzq(i3);
        while (i2 < list.size()) {
            this.a.zzi(list.get(i2).longValue());
            i2++;
        }
    }

    public final void a(int i, int i2) throws IOException {
        this.a.zzp(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void b(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzje zzjeVar = this.a;
                int iIntValue = list.get(i2).intValue();
                zzjeVar.zzp(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i2++;
            }
            return;
        }
        this.a.zzo(i, 2);
        int iZzA = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = list.get(i3).intValue();
            iZzA += zzje.zzA((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        this.a.zzq(iZzA);
        while (i2 < list.size()) {
            zzje zzjeVar2 = this.a;
            int iIntValue3 = list.get(i2).intValue();
            zzjeVar2.zzq((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i2++;
        }
    }

    public final void c(int i, long j) throws IOException {
        this.a.zzr(i, (j >> 63) ^ (j + j));
    }

    public final void d(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzje zzjeVar = this.a;
                long jLongValue = list.get(i2).longValue();
                zzjeVar.zzr(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        this.a.zzo(i, 2);
        int iZzB = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = list.get(i3).longValue();
            iZzB += zzje.zzB((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.a.zzq(iZzB);
        while (i2 < list.size()) {
            zzje zzjeVar2 = this.a;
            long jLongValue3 = list.get(i2).longValue();
            zzjeVar2.zzs((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    @Deprecated
    public final void e(int i) throws IOException {
        this.a.zzo(i, 3);
    }

    public final void f(int i, String str) throws IOException {
        this.a.zzm(i, str);
    }

    public final void g(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzkm)) {
            while (i2 < list.size()) {
                this.a.zzm(i, list.get(i2));
                i2++;
            }
            return;
        }
        zzkm zzkmVar = (zzkm) list;
        while (i2 < list.size()) {
            Object objZzf = zzkmVar.zzf(i2);
            if (objZzf instanceof String) {
                this.a.zzm(i, (String) objZzf);
            } else {
                this.a.zze(i, (zzix) objZzf);
            }
            i2++;
        }
    }

    public final void h(int i, int i2) throws IOException {
        this.a.zzp(i, i2);
    }

    public final void i(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.zzp(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.zzo(i, 2);
        int iZzA = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzA += zzje.zzA(list.get(i3).intValue());
        }
        this.a.zzq(iZzA);
        while (i2 < list.size()) {
            this.a.zzq(list.get(i2).intValue());
            i2++;
        }
    }

    public final void j(int i, long j) throws IOException {
        this.a.zzr(i, j);
    }

    public final void k(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.zzr(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.zzo(i, 2);
        int iZzB = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzB += zzje.zzB(list.get(i3).longValue());
        }
        this.a.zzq(iZzB);
        while (i2 < list.size()) {
            this.a.zzs(list.get(i2).longValue());
            i2++;
        }
    }

    public final void m(int i, boolean z) throws IOException {
        this.a.zzd(i, z);
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
    public final void n(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.zzd(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        this.a.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).booleanValue();
            i3++;
        }
        this.a.zzq(i3);
        while (i2 < list.size()) {
            this.a.zzb(list.get(i2).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public final void o(int i, zzix zzixVar) throws IOException {
        this.a.zze(i, zzixVar);
    }

    public final void p(int i, List<zzix> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.zze(i, list.get(i2));
        }
    }

    public final void q(int i, double d) throws IOException {
        this.a.zzh(i, Double.doubleToRawLongBits(d));
    }

    public final void r(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.zzh(i, Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
            return;
        }
        this.a.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).doubleValue();
            i3 += 8;
        }
        this.a.zzq(i3);
        while (i2 < list.size()) {
            this.a.zzi(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    @Deprecated
    public final void s(int i) throws IOException {
        this.a.zzo(i, 4);
    }

    public final void t(int i, int i2) throws IOException {
        this.a.zzj(i, i2);
    }

    public final void u(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.zzj(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.zzo(i, 2);
        int iZzv = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzv += zzje.zzv(list.get(i3).intValue());
        }
        this.a.zzq(iZzv);
        while (i2 < list.size()) {
            this.a.zzk(list.get(i2).intValue());
            i2++;
        }
    }

    public final void v(int i, int i2) throws IOException {
        this.a.zzf(i, i2);
    }

    public final void w(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.zzf(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.a.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).intValue();
            i3 += 4;
        }
        this.a.zzq(i3);
        while (i2 < list.size()) {
            this.a.zzg(list.get(i2).intValue());
            i2++;
        }
    }

    public final void x(int i, long j) throws IOException {
        this.a.zzh(i, j);
    }

    public final void y(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.zzh(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.a.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).longValue();
            i3 += 8;
        }
        this.a.zzq(i3);
        while (i2 < list.size()) {
            this.a.zzi(list.get(i2).longValue());
            i2++;
        }
    }

    public final void z(int i, float f) throws IOException {
        this.a.zzf(i, Float.floatToRawIntBits(f));
    }
}
