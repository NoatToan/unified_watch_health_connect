package com.google.protobuf;

import defpackage.jbq;
import defpackage.ree;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f9637a = B();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1<?, ?> f9638b = D(false);
    public static final q1<?, ?> c = D(true);
    public static final q1<?, ?> d = new t1();

    public static <UT, UB> UB A(int i, List<Integer> list, d0.e eVar, UB ub, q1<UT, UB> q1Var) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = list.get(i3);
                int iIntValue = num.intValue();
                if (eVar.isInRange(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    ub = (UB) M(i, iIntValue, ub, q1Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!eVar.isInRange(iIntValue2)) {
                    ub = (UB) M(i, iIntValue2, ub, q1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static Class<?> B() {
        try {
            boolean z = GeneratedMessageV3.alwaysUseFieldBuilders;
            return GeneratedMessageV3.class;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object C(Class<?> cls, String str) {
        try {
            java.lang.reflect.Field[] declaredFields = Class.forName(cls.getName() + "$" + N(str, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return jbq.H(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public static q1<?, ?> D(boolean z) {
        try {
            Class<?> clsE = E();
            if (clsE == null) {
                return null;
            }
            return (q1) clsE.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> E() {
        return u1.class;
    }

    public static <T, FT extends a0.c<FT>> void F(u<FT> uVar, T t, T t2) {
        a0<T> a0VarC = uVar.c(t2);
        if (a0VarC.A()) {
            return;
        }
        uVar.d(t).H(a0VarC);
    }

    public static <T> void G(m0 m0Var, T t, T t2, long j) {
        jbq.X(t, j, m0Var.a(jbq.G(t, j), jbq.G(t2, j)));
    }

    public static <T, UT, UB> void H(q1<UT, UB> q1Var, T t, T t2) {
        q1Var.p(t, q1Var.k(q1Var.g(t), q1Var.g(t2)));
    }

    public static q1<?, ?> I() {
        return f9638b;
    }

    public static q1<?, ?> J() {
        return c;
    }

    public static void K(Class<?> cls) {
        Class<?> cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = f9637a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean L(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <UT, UB> UB M(int i, int i2, UB ub, q1<UT, UB> q1Var) {
        if (ub == null) {
            ub = q1Var.n();
        }
        q1Var.e(ub, i, i2);
        return ub;
    }

    public static String N(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if ('a' > cCharAt || cCharAt > 'z') {
                if ('A' > cCharAt || cCharAt > 'Z') {
                    if ('0' <= cCharAt && cCharAt <= '9') {
                        sb.append(cCharAt);
                    }
                    z = true;
                } else if (i != 0 || z) {
                    sb.append(cCharAt);
                } else {
                    sb.append((char) (cCharAt + ' '));
                }
            } else if (z) {
                sb.append((char) (cCharAt - ' '));
            } else {
                sb.append(cCharAt);
            }
            z = false;
        }
        return sb.toString();
    }

    public static q1<?, ?> O() {
        return d;
    }

    public static void P(int i, List<Boolean> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.E(i, list, z);
    }

    public static void Q(int i, List<ByteString> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.u(i, list);
    }

    public static void R(int i, List<Double> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.t(i, list, z);
    }

    public static void S(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.y(i, list, z);
    }

    public static void T(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.h(i, list, z);
    }

    public static void U(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.q(i, list, z);
    }

    public static void V(int i, List<Float> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.a(i, list, z);
    }

    public static void W(int i, List<?> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.J(i, list);
    }

    public static void X(int i, List<?> list, Writer writer, e1 e1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.P(i, list, e1Var);
    }

    public static void Y(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.f(i, list, z);
    }

    public static void Z(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.H(i, list, z);
    }

    public static int a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.X(i) + CodedOutputStream.E(size) : size * CodedOutputStream.e(i, true);
    }

    public static void a0(int i, List<?> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.L(i, list);
    }

    public static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i, List<?> list, Writer writer, e1 e1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.N(i, list, e1Var);
    }

    public static int c(int i, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = size * CodedOutputStream.X(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            iX += CodedOutputStream.i(list.get(i2));
        }
        return iX;
    }

    public static void c0(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.D(i, list, z);
    }

    public static int d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        return z ? CodedOutputStream.X(i) + CodedOutputStream.E(iE) : iE + (size * CodedOutputStream.X(i));
    }

    public static void d0(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.A(i, list, z);
    }

    public static int e(List<Integer> list) {
        int iM;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            iM = 0;
            while (i < size) {
                iM += CodedOutputStream.m(c0Var.getInt(i));
                i++;
            }
        } else {
            iM = 0;
            while (i < size) {
                iM += CodedOutputStream.m(list.get(i).intValue());
                i++;
            }
        }
        return iM;
    }

    public static void e0(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.s(i, list, z);
    }

    public static int f(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.X(i) + CodedOutputStream.E(size * 4) : size * CodedOutputStream.n(i, 0);
    }

    public static void f0(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.x(i, list, z);
    }

    public static int g(List<?> list) {
        return list.size() * 4;
    }

    public static void g0(int i, List<String> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.v(i, list);
    }

    public static int h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.X(i) + CodedOutputStream.E(size * 8) : size * CodedOutputStream.p(i, 0L);
    }

    public static void h0(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.i(i, list, z);
    }

    public static int i(List<?> list) {
        return list.size() * 8;
    }

    public static void i0(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.l(i, list, z);
    }

    public static int j(int i, List<q0> list, e1 e1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iU += CodedOutputStream.u(i, list.get(i2), e1Var);
        }
        return iU;
    }

    public static int k(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        return z ? CodedOutputStream.X(i) + CodedOutputStream.E(iL) : iL + (size * CodedOutputStream.X(i));
    }

    public static int l(List<Integer> list) {
        int iY;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            iY = 0;
            while (i < size) {
                iY += CodedOutputStream.y(c0Var.getInt(i));
                i++;
            }
        } else {
            iY = 0;
            while (i < size) {
                iY += CodedOutputStream.y(list.get(i).intValue());
                i++;
            }
        }
        return iY;
    }

    public static int m(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z ? CodedOutputStream.X(i) + CodedOutputStream.E(iN) : iN + (list.size() * CodedOutputStream.X(i));
    }

    public static int n(List<Long> list) {
        int iA;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof i0) {
            i0 i0Var = (i0) list;
            iA = 0;
            while (i < size) {
                iA += CodedOutputStream.A(i0Var.m(i));
                i++;
            }
        } else {
            iA = 0;
            while (i < size) {
                iA += CodedOutputStream.A(list.get(i).longValue());
                i++;
            }
        }
        return iA;
    }

    public static int o(int i, Object obj, e1 e1Var) {
        return obj instanceof f0 ? CodedOutputStream.C(i, (f0) obj) : CodedOutputStream.H(i, (q0) obj, e1Var);
    }

    public static int p(int i, List<?> list, e1 e1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = CodedOutputStream.X(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            iX += obj instanceof f0 ? CodedOutputStream.D((f0) obj) : CodedOutputStream.J((q0) obj, e1Var);
        }
        return iX;
    }

    public static int q(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        return z ? CodedOutputStream.X(i) + CodedOutputStream.E(iR) : iR + (size * CodedOutputStream.X(i));
    }

    public static int r(List<Integer> list) {
        int iS;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            iS = 0;
            while (i < size) {
                iS += CodedOutputStream.S(c0Var.getInt(i));
                i++;
            }
        } else {
            iS = 0;
            while (i < size) {
                iS += CodedOutputStream.S(list.get(i).intValue());
                i++;
            }
        }
        return iS;
    }

    public static int s(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        return z ? CodedOutputStream.X(i) + CodedOutputStream.E(iT) : iT + (size * CodedOutputStream.X(i));
    }

    public static int t(List<Long> list) {
        int iU;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof i0) {
            i0 i0Var = (i0) list;
            iU = 0;
            while (i < size) {
                iU += CodedOutputStream.U(i0Var.m(i));
                i++;
            }
        } else {
            iU = 0;
            while (i < size) {
                iU += CodedOutputStream.U(list.get(i).longValue());
                i++;
            }
        }
        return iU;
    }

    public static int u(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iX = CodedOutputStream.X(i) * size;
        if (list instanceof ree) {
            ree reeVar = (ree) list;
            while (i2 < size) {
                Object objD = reeVar.d(i2);
                iX += objD instanceof ByteString ? CodedOutputStream.i((ByteString) objD) : CodedOutputStream.W((String) objD);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                iX += obj instanceof ByteString ? CodedOutputStream.i((ByteString) obj) : CodedOutputStream.W((String) obj);
                i2++;
            }
        }
        return iX;
    }

    public static int v(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        return z ? CodedOutputStream.X(i) + CodedOutputStream.E(iW) : iW + (size * CodedOutputStream.X(i));
    }

    public static int w(List<Integer> list) {
        int iZ;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            iZ = 0;
            while (i < size) {
                iZ += CodedOutputStream.Z(c0Var.getInt(i));
                i++;
            }
        } else {
            iZ = 0;
            while (i < size) {
                iZ += CodedOutputStream.Z(list.get(i).intValue());
                i++;
            }
        }
        return iZ;
    }

    public static int x(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return z ? CodedOutputStream.X(i) + CodedOutputStream.E(iY) : iY + (size * CodedOutputStream.X(i));
    }

    public static int y(List<Long> list) {
        int iB0;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof i0) {
            i0 i0Var = (i0) list;
            iB0 = 0;
            while (i < size) {
                iB0 += CodedOutputStream.b0(i0Var.m(i));
                i++;
            }
        } else {
            iB0 = 0;
            while (i < size) {
                iB0 += CodedOutputStream.b0(list.get(i).longValue());
                i++;
            }
        }
        return iB0;
    }

    public static <UT, UB> UB z(int i, List<Integer> list, d0.d<?> dVar, UB ub, q1<UT, UB> q1Var) {
        if (dVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = list.get(i3);
                int iIntValue = num.intValue();
                if (dVar.findValueByNumber(iIntValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    ub = (UB) M(i, iIntValue, ub, q1Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (dVar.findValueByNumber(iIntValue2) == null) {
                    ub = (UB) M(i, iIntValue2, ub, q1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
