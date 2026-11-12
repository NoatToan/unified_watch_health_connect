package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class c4 {
    private static final Class<?> a;
    private static final o4<?, ?> b;
    private static final o4<?, ?> c;
    private static final o4<?, ?> d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = C(false);
        c = C(true);
        d = new p4();
    }

    public static int A(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzje.zzA(i << 3) + 1);
    }

    public static void B(int i, List<Long> list, u2 u2Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        u2Var.k(i, list, z);
    }

    private static o4<?, ?> C(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (o4) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int D(List<?> list) {
        return list.size();
    }

    public static int E(int i, List<zzix> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzz = size * zzje.zzz(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            iZzz += zzje.zzt(list.get(i2));
        }
        return iZzz;
    }

    public static int F(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return G(list) + (size * zzje.zzz(i));
    }

    public static int G(List<Integer> list) {
        int iZzv;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e3) {
            e3 e3Var = (e3) list;
            iZzv = 0;
            while (i < size) {
                iZzv += zzje.zzv(e3Var.a(i));
                i++;
            }
        } else {
            iZzv = 0;
            while (i < size) {
                iZzv += zzje.zzv(list.get(i).intValue());
                i++;
            }
        }
        return iZzv;
    }

    public static int H(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzje.zzA(i << 3) + 4);
    }

    public static int I(List<?> list) {
        return list.size() * 4;
    }

    public static int J(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzje.zzA(i << 3) + 8);
    }

    public static int K(List<?> list) {
        return list.size() * 8;
    }

    public static int L(int i, List<zzlc> list, a4 a4Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iC = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iC += zzje.c(i, list.get(i2), a4Var);
        }
        return iC;
    }

    public static int M(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * zzje.zzz(i));
    }

    public static int N(List<Integer> list) {
        int iZzv;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e3) {
            e3 e3Var = (e3) list;
            iZzv = 0;
            while (i < size) {
                iZzv += zzje.zzv(e3Var.a(i));
                i++;
            }
        } else {
            iZzv = 0;
            while (i < size) {
                iZzv += zzje.zzv(list.get(i).intValue());
                i++;
            }
        }
        return iZzv;
    }

    public static int O(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return P(list) + (list.size() * zzje.zzz(i));
    }

    public static int P(List<Long> list) {
        int iZzB;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j3) {
            j3 j3Var = (j3) list;
            iZzB = 0;
            while (i < size) {
                iZzB += zzje.zzB(j3Var.zza(i));
                i++;
            }
        } else {
            iZzB = 0;
            while (i < size) {
                iZzB += zzje.zzB(list.get(i).longValue());
                i++;
            }
        }
        return iZzB;
    }

    public static int Q(int i, Object obj, a4 a4Var) {
        if (!(obj instanceof zzkk)) {
            return zzje.zzA(i << 3) + zzje.d((zzlc) obj, a4Var);
        }
        int iZzA = zzje.zzA(i << 3);
        int iZza = ((zzkk) obj).zza();
        return iZzA + zzje.zzA(iZza) + iZza;
    }

    public static int R(int i, List<?> list, a4 a4Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzz = zzje.zzz(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            iZzz += obj instanceof zzkk ? zzje.zzw((zzkk) obj) : zzje.d((zzlc) obj, a4Var);
        }
        return iZzz;
    }

    public static int S(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return T(list) + (size * zzje.zzz(i));
    }

    public static int T(List<Integer> list) {
        int iZzA;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e3) {
            e3 e3Var = (e3) list;
            iZzA = 0;
            while (i < size) {
                int iA = e3Var.a(i);
                iZzA += zzje.zzA((iA >> 31) ^ (iA + iA));
                i++;
            }
        } else {
            iZzA = 0;
            while (i < size) {
                int iIntValue = list.get(i).intValue();
                iZzA += zzje.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
        }
        return iZzA;
    }

    public static int U(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return V(list) + (size * zzje.zzz(i));
    }

    public static int V(List<Long> list) {
        int iZzB;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j3) {
            j3 j3Var = (j3) list;
            iZzB = 0;
            while (i < size) {
                long jZza = j3Var.zza(i);
                iZzB += zzje.zzB((jZza >> 63) ^ (jZza + jZza));
                i++;
            }
        } else {
            iZzB = 0;
            while (i < size) {
                long jLongValue = list.get(i).longValue();
                iZzB += zzje.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
        }
        return iZzB;
    }

    public static int W(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzz = zzje.zzz(i) * size;
        if (list instanceof zzkm) {
            zzkm zzkmVar = (zzkm) list;
            while (i2 < size) {
                Object objZzf = zzkmVar.zzf(i2);
                iZzz += objZzf instanceof zzix ? zzje.zzt((zzix) objZzf) : zzje.zzy((String) objZzf);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                iZzz += obj instanceof zzix ? zzje.zzt((zzix) obj) : zzje.zzy((String) obj);
                i2++;
            }
        }
        return iZzz;
    }

    public static int X(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Y(list) + (size * zzje.zzz(i));
    }

    public static int Y(List<Integer> list) {
        int iZzA;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e3) {
            e3 e3Var = (e3) list;
            iZzA = 0;
            while (i < size) {
                iZzA += zzje.zzA(e3Var.a(i));
                i++;
            }
        } else {
            iZzA = 0;
            while (i < size) {
                iZzA += zzje.zzA(list.get(i).intValue());
                i++;
            }
        }
        return iZzA;
    }

    public static int Z(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return a0(list) + (size * zzje.zzz(i));
    }

    public static o4<?, ?> a() {
        return c;
    }

    public static int a0(List<Long> list) {
        int iZzB;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j3) {
            j3 j3Var = (j3) list;
            iZzB = 0;
            while (i < size) {
                iZzB += zzje.zzB(j3Var.zza(i));
                i++;
            }
        } else {
            iZzB = 0;
            while (i < size) {
                iZzB += zzje.zzB(list.get(i).longValue());
                i++;
            }
        }
        return iZzB;
    }

    public static o4<?, ?> b() {
        return d;
    }

    public static o4<?, ?> b0() {
        return b;
    }

    public static <UT, UB> UB c(int i, List<Integer> list, zzkb zzkbVar, UB ub, o4<UT, UB> o4Var) {
        if (zzkbVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iIntValue = list.get(i3).intValue();
                if (zzkbVar.zza(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(iIntValue));
                    }
                    i2++;
                } else {
                    ub = (UB) d(i, iIntValue, ub, o4Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                int iIntValue2 = it2.next().intValue();
                if (!zzkbVar.zza(iIntValue2)) {
                    ub = (UB) d(i, iIntValue2, ub, o4Var);
                    it2.remove();
                }
            }
        }
        return ub;
    }

    public static <UT, UB> UB d(int i, int i2, UB ub, o4<UT, UB> o4Var) {
        if (ub == null) {
            ub = o4Var.e();
        }
        o4Var.f(ub, i, i2);
        return ub;
    }

    public static <T, FT extends zzjn<FT>> void e(x2<FT> x2Var, T t, T t2) {
        x2Var.a(t2);
        throw null;
    }

    public static <T, UT, UB> void f(o4<UT, UB> o4Var, T t, T t2) {
        o4Var.h(t, o4Var.d(o4Var.c(t), o4Var.c(t2)));
    }

    public static void g(Class<?> cls) {
        Class<?> cls2;
        if (!zzjx.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean h(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T> void i(n3 n3Var, T t, T t2, long j) {
        w4.x(t, j, n3.b(w4.k(t, j), w4.k(t2, j)));
    }

    public static void j(int i, List<Boolean> list, u2 u2Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        u2Var.n(i, list, z);
    }

    public static void k(int i, List<zzix> list, u2 u2Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        u2Var.p(i, list);
    }

    public static void l(int i, List<Double> list, u2 u2Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        u2Var.r(i, list, z);
    }

    public static void m(int i, List<Integer> list, u2 u2Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        u2Var.u(i, list, z);
    }

    public static void n(int i, List<Integer> list, u2 u2Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        u2Var.w(i, list, z);
    }

    public static void o(int i, List<Long> list, u2 u2Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        u2Var.y(i, list, z);
    }

    public static void p(int i, List<Float> list, u2 u2Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        u2Var.A(i, list, z);
    }

    public static void q(int i, List<?> list, u2 u2Var, a4 a4Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            u2Var.B(i, list.get(i2), a4Var);
        }
    }

    public static void r(int i, List<Integer> list, u2 u2Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        u2Var.D(i, list, z);
    }

    public static void s(int i, List<Long> list, u2 u2Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        u2Var.F(i, list, z);
    }

    public static void t(int i, List<?> list, u2 u2Var, a4 a4Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            u2Var.G(i, list.get(i2), a4Var);
        }
    }

    public static void u(int i, List<Integer> list, u2 u2Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        u2Var.I(i, list, z);
    }

    public static void v(int i, List<Long> list, u2 u2Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        u2Var.K(i, list, z);
    }

    public static void w(int i, List<Integer> list, u2 u2Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        u2Var.b(i, list, z);
    }

    public static void x(int i, List<Long> list, u2 u2Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        u2Var.d(i, list, z);
    }

    public static void y(int i, List<String> list, u2 u2Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        u2Var.g(i, list);
    }

    public static void z(int i, List<Integer> list, u2 u2Var, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        u2Var.i(i, list, z);
    }
}
