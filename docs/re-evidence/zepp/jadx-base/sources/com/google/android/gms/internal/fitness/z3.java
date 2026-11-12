package com.google.android.gms.internal.fitness;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class z3 {
    private static final Class<?> a = x();
    private static final n4<?, ?> b = s(false);
    private static final n4<?, ?> c = s(true);
    private static final n4<?, ?> d = new o4();

    public static void A(int i, List<Long> list, d5 d5Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        d5Var.I(i, list, z);
    }

    public static boolean B(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int C(List<Integer> list) {
        int iZzs;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof u2) {
            u2 u2Var = (u2) list;
            iZzs = 0;
            while (i < size) {
                iZzs += zzgk.zzs(u2Var.getInt(i));
                i++;
            }
        } else {
            iZzs = 0;
            while (i < size) {
                iZzs += zzgk.zzs(list.get(i).intValue());
                i++;
            }
        }
        return iZzs;
    }

    public static void D(int i, List<Long> list, d5 d5Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        d5Var.w(i, list, z);
    }

    public static void E(Class<?> cls) {
        Class<?> cls2;
        if (!zzgy.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static int F(List<Integer> list) {
        int iZzt;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof u2) {
            u2 u2Var = (u2) list;
            iZzt = 0;
            while (i < size) {
                iZzt += zzgk.zzt(u2Var.getInt(i));
                i++;
            }
        } else {
            iZzt = 0;
            while (i < size) {
                iZzt += zzgk.zzt(list.get(i).intValue());
                i++;
            }
        }
        return iZzt;
    }

    public static void G(int i, List<Long> list, d5 d5Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        d5Var.r(i, list, z);
    }

    public static int H(List<Integer> list) {
        int iZzu;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof u2) {
            u2 u2Var = (u2) list;
            iZzu = 0;
            while (i < size) {
                iZzu += zzgk.zzu(u2Var.getInt(i));
                i++;
            }
        } else {
            iZzu = 0;
            while (i < size) {
                iZzu += zzgk.zzu(list.get(i).intValue());
                i++;
            }
        }
        return iZzu;
    }

    public static void I(int i, List<Integer> list, d5 d5Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        d5Var.c(i, list, z);
    }

    public static int J(List<?> list) {
        return list.size() << 2;
    }

    public static void K(int i, List<Integer> list, d5 d5Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        d5Var.u(i, list, z);
    }

    public static int L(List<?> list) {
        return list.size() << 3;
    }

    public static void M(int i, List<Integer> list, d5 d5Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        d5Var.J(i, list, z);
    }

    public static int N(List<?> list) {
        return list.size();
    }

    public static void O(int i, List<Integer> list, d5 d5Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        d5Var.g(i, list, z);
    }

    public static void P(int i, List<Integer> list, d5 d5Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        d5Var.v(i, list, z);
    }

    public static void Q(int i, List<Integer> list, d5 d5Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        d5Var.p(i, list, z);
    }

    public static void R(int i, List<Boolean> list, d5 d5Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        d5Var.o(i, list, z);
    }

    public static int S(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return g(list) + (list.size() * zzgk.zzr(i));
    }

    public static int T(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return n(list) + (size * zzgk.zzr(i));
    }

    public static int U(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return r(list) + (size * zzgk.zzr(i));
    }

    public static int V(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z(list) + (size * zzgk.zzr(i));
    }

    public static int W(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C(list) + (size * zzgk.zzr(i));
    }

    public static int X(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return F(list) + (size * zzgk.zzr(i));
    }

    public static int Y(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return H(list) + (size * zzgk.zzr(i));
    }

    public static int Z(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzgk.zzl(i, 0);
    }

    public static void a(int i, List<String> list, d5 d5Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        d5Var.M(i, list);
    }

    public static int a0(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzgk.zzg(i, 0L);
    }

    public static void b(int i, List<?> list, d5 d5Var, x3 x3Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        d5Var.E(i, list, x3Var);
    }

    public static int b0(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzgk.zzb(i, true);
    }

    public static void c(int i, List<Double> list, d5 d5Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        d5Var.B(i, list, z);
    }

    public static <T, FT extends zzgv<FT>> void d(m2<FT> m2Var, T t, T t2) {
        q2<T> q2VarC = m2Var.c(t2);
        if (q2VarC.a.isEmpty()) {
            return;
        }
        m2Var.d(t).h(q2VarC);
    }

    public static <T> void e(h3 h3Var, T t, T t2, long j) {
        s4.g(t, j, h3Var.c(s4.G(t, j), s4.G(t2, j)));
    }

    public static <T, UT, UB> void f(n4<UT, UB> n4Var, T t, T t2) {
        n4Var.d(t, n4Var.e(n4Var.g(t), n4Var.g(t2)));
    }

    public static int g(List<Long> list) {
        int iZzd;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d3) {
            d3 d3Var = (d3) list;
            iZzd = 0;
            while (i < size) {
                iZzd += zzgk.zzd(d3Var.getLong(i));
                i++;
            }
        } else {
            iZzd = 0;
            while (i < size) {
                iZzd += zzgk.zzd(list.get(i).longValue());
                i++;
            }
        }
        return iZzd;
    }

    public static void h(int i, List<zzfx> list, d5 d5Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        d5Var.L(i, list);
    }

    public static void i(int i, List<?> list, d5 d5Var, x3 x3Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        d5Var.O(i, list, x3Var);
    }

    public static void j(int i, List<Float> list, d5 d5Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        d5Var.C(i, list, z);
    }

    public static int k(int i, Object obj, x3 x3Var) {
        return obj instanceof zzhp ? zzgk.zza(i, (zzhp) obj) : zzgk.d(i, (zzik) obj, x3Var);
    }

    public static int l(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzr = zzgk.zzr(i) * size;
        if (list instanceof zzhr) {
            zzhr zzhrVar = (zzhr) list;
            while (i2 < size) {
                Object objZzaf = zzhrVar.zzaf(i2);
                iZzr += objZzaf instanceof zzfx ? zzgk.zzb((zzfx) objZzaf) : zzgk.zzm((String) objZzaf);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                iZzr += obj instanceof zzfx ? zzgk.zzb((zzfx) obj) : zzgk.zzm((String) obj);
                i2++;
            }
        }
        return iZzr;
    }

    public static int m(int i, List<?> list, x3 x3Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzr = zzgk.zzr(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            iZzr += obj instanceof zzhp ? zzgk.zza((zzhp) obj) : zzgk.a((zzik) obj, x3Var);
        }
        return iZzr;
    }

    public static int n(List<Long> list) {
        int iZze;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d3) {
            d3 d3Var = (d3) list;
            iZze = 0;
            while (i < size) {
                iZze += zzgk.zze(d3Var.getLong(i));
                i++;
            }
        } else {
            iZze = 0;
            while (i < size) {
                iZze += zzgk.zze(list.get(i).longValue());
                i++;
            }
        }
        return iZze;
    }

    public static void o(int i, List<Long> list, d5 d5Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        d5Var.f(i, list, z);
    }

    public static int p(int i, List<zzfx> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzr = size * zzgk.zzr(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            iZzr += zzgk.zzb(list.get(i2));
        }
        return iZzr;
    }

    public static int q(int i, List<zzik> list, x3 x3Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iG = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iG += zzgk.g(i, list.get(i2), x3Var);
        }
        return iG;
    }

    public static int r(List<Long> list) {
        int iZzf;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof d3) {
            d3 d3Var = (d3) list;
            iZzf = 0;
            while (i < size) {
                iZzf += zzgk.zzf(d3Var.getLong(i));
                i++;
            }
        } else {
            iZzf = 0;
            while (i < size) {
                iZzf += zzgk.zzf(list.get(i).longValue());
                i++;
            }
        }
        return iZzf;
    }

    private static n4<?, ?> s(boolean z) {
        try {
            Class<?> clsY = y();
            if (clsY == null) {
                return null;
            }
            return (n4) clsY.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void t(int i, List<Long> list, d5 d5Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        d5Var.y(i, list, z);
    }

    public static n4<?, ?> u() {
        return b;
    }

    public static n4<?, ?> v() {
        return c;
    }

    public static n4<?, ?> w() {
        return d;
    }

    private static Class<?> x() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> y() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int z(List<Integer> list) {
        int iZzx;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof u2) {
            u2 u2Var = (u2) list;
            iZzx = 0;
            while (i < size) {
                iZzx += zzgk.zzx(u2Var.getInt(i));
                i++;
            }
        } else {
            iZzx = 0;
            while (i < size) {
                iZzx += zzgk.zzx(list.get(i).intValue());
                i++;
            }
        }
        return iZzx;
    }
}
