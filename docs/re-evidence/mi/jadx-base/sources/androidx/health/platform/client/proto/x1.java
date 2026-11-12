package androidx.health.platform.client.proto;

import defpackage.hbq;
import defpackage.pee;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f2549a = B();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b2<?, ?> f2550b = C(false);
    public static final b2<?, ?> c = C(true);
    public static final b2<?, ?> d = new d2();

    public static <UT, UB> UB A(Object obj, int i, List<Integer> list, f0.e eVar, UB ub, b2<UT, UB> b2Var) {
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
                    ub = (UB) L(obj, i, iIntValue, ub, b2Var);
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
                    ub = (UB) L(obj, i, iIntValue2, ub, b2Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static Class<?> B() {
        try {
            return Class.forName("androidx.health.platform.client.proto.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static b2<?, ?> C(boolean z) {
        try {
            Class<?> clsD = D();
            if (clsD == null) {
                return null;
            }
            return (b2) clsD.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> D() {
        try {
            return Class.forName("androidx.health.platform.client.proto.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T, FT extends c0.b<FT>> void E(z<FT> zVar, T t, T t2) {
        c0<T> c0VarC = zVar.c(t2);
        if (c0VarC.n()) {
            return;
        }
        zVar.d(t).v(c0VarC);
    }

    public static <T> void F(m0 m0Var, T t, T t2, long j) {
        hbq.W(t, j, m0Var.a(hbq.G(t, j), hbq.G(t2, j)));
    }

    public static <T, UT, UB> void G(b2<UT, UB> b2Var, T t, T t2) {
        b2Var.p(t, b2Var.k(b2Var.g(t), b2Var.g(t2)));
    }

    public static b2<?, ?> H() {
        return f2550b;
    }

    public static b2<?, ?> I() {
        return c;
    }

    public static void J(Class<?> cls) {
        Class<?> cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = f2549a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    public static boolean K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <UT, UB> UB L(Object obj, int i, int i2, UB ub, b2<UT, UB> b2Var) {
        if (ub == null) {
            ub = b2Var.f(obj);
        }
        b2Var.e(ub, i, i2);
        return ub;
    }

    public static b2<?, ?> M() {
        return d;
    }

    public static void N(int i, List<Boolean> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.E(i, list, z);
    }

    public static void O(int i, List<ByteString> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.u(i, list);
    }

    public static void P(int i, List<Double> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.t(i, list, z);
    }

    public static void Q(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.y(i, list, z);
    }

    public static void R(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.h(i, list, z);
    }

    public static void S(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.q(i, list, z);
    }

    public static void T(int i, List<Float> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.a(i, list, z);
    }

    public static void U(int i, List<?> list, Writer writer, w1 w1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.O(i, list, w1Var);
    }

    public static void V(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.f(i, list, z);
    }

    public static void W(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.H(i, list, z);
    }

    public static void X(int i, List<?> list, Writer writer, w1 w1Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.L(i, list, w1Var);
    }

    public static void Y(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.D(i, list, z);
    }

    public static void Z(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.A(i, list, z);
    }

    public static int a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.U(i) + CodedOutputStream.D(size) : size * CodedOutputStream.e(i, true);
    }

    public static void a0(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.s(i, list, z);
    }

    public static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.x(i, list, z);
    }

    public static int c(int i, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = size * CodedOutputStream.U(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            iU += CodedOutputStream.i(list.get(i2));
        }
        return iU;
    }

    public static void c0(int i, List<String> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.v(i, list);
    }

    public static int d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        return z ? CodedOutputStream.U(i) + CodedOutputStream.D(iE) : iE + (size * CodedOutputStream.U(i));
    }

    public static void d0(int i, List<Integer> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.i(i, list, z);
    }

    public static int e(List<Integer> list) {
        int iM;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e0) {
            e0 e0Var = (e0) list;
            iM = 0;
            while (i < size) {
                iM += CodedOutputStream.m(e0Var.getInt(i));
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

    public static void e0(int i, List<Long> list, Writer writer, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.l(i, list, z);
    }

    public static int f(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.U(i) + CodedOutputStream.D(size * 4) : size * CodedOutputStream.n(i, 0);
    }

    public static int g(List<?> list) {
        return list.size() * 4;
    }

    public static int h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.U(i) + CodedOutputStream.D(size * 8) : size * CodedOutputStream.p(i, 0L);
    }

    public static int i(List<?> list) {
        return list.size() * 8;
    }

    public static int j(int i, List<o0> list, w1 w1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iT += CodedOutputStream.t(i, list.get(i2), w1Var);
        }
        return iT;
    }

    public static int k(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        return z ? CodedOutputStream.U(i) + CodedOutputStream.D(iL) : iL + (size * CodedOutputStream.U(i));
    }

    public static int l(List<Integer> list) {
        int iX;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e0) {
            e0 e0Var = (e0) list;
            iX = 0;
            while (i < size) {
                iX += CodedOutputStream.x(e0Var.getInt(i));
                i++;
            }
        } else {
            iX = 0;
            while (i < size) {
                iX += CodedOutputStream.x(list.get(i).intValue());
                i++;
            }
        }
        return iX;
    }

    public static int m(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z ? CodedOutputStream.U(i) + CodedOutputStream.D(iN) : iN + (list.size() * CodedOutputStream.U(i));
    }

    public static int n(List<Long> list) {
        int iZ;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof k0) {
            k0 k0Var = (k0) list;
            iZ = 0;
            while (i < size) {
                iZ += CodedOutputStream.z(k0Var.l(i));
                i++;
            }
        } else {
            iZ = 0;
            while (i < size) {
                iZ += CodedOutputStream.z(list.get(i).longValue());
                i++;
            }
        }
        return iZ;
    }

    public static int o(int i, Object obj, w1 w1Var) {
        return obj instanceof h0 ? CodedOutputStream.B(i, (h0) obj) : CodedOutputStream.G(i, (o0) obj, w1Var);
    }

    public static int p(int i, List<?> list, w1 w1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = CodedOutputStream.U(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            iU += obj instanceof h0 ? CodedOutputStream.C((h0) obj) : CodedOutputStream.I((o0) obj, w1Var);
        }
        return iU;
    }

    public static int q(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        return z ? CodedOutputStream.U(i) + CodedOutputStream.D(iR) : iR + (size * CodedOutputStream.U(i));
    }

    public static int r(List<Integer> list) {
        int iP;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e0) {
            e0 e0Var = (e0) list;
            iP = 0;
            while (i < size) {
                iP += CodedOutputStream.P(e0Var.getInt(i));
                i++;
            }
        } else {
            iP = 0;
            while (i < size) {
                iP += CodedOutputStream.P(list.get(i).intValue());
                i++;
            }
        }
        return iP;
    }

    public static int s(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        return z ? CodedOutputStream.U(i) + CodedOutputStream.D(iT) : iT + (size * CodedOutputStream.U(i));
    }

    public static int t(List<Long> list) {
        int iR;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof k0) {
            k0 k0Var = (k0) list;
            iR = 0;
            while (i < size) {
                iR += CodedOutputStream.R(k0Var.l(i));
                i++;
            }
        } else {
            iR = 0;
            while (i < size) {
                iR += CodedOutputStream.R(list.get(i).longValue());
                i++;
            }
        }
        return iR;
    }

    public static int u(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iU = CodedOutputStream.U(i) * size;
        if (list instanceof pee) {
            pee peeVar = (pee) list;
            while (i2 < size) {
                Object objD = peeVar.d(i2);
                iU += objD instanceof ByteString ? CodedOutputStream.i((ByteString) objD) : CodedOutputStream.T((String) objD);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                iU += obj instanceof ByteString ? CodedOutputStream.i((ByteString) obj) : CodedOutputStream.T((String) obj);
                i2++;
            }
        }
        return iU;
    }

    public static int v(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        return z ? CodedOutputStream.U(i) + CodedOutputStream.D(iW) : iW + (size * CodedOutputStream.U(i));
    }

    public static int w(List<Integer> list) {
        int iW;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e0) {
            e0 e0Var = (e0) list;
            iW = 0;
            while (i < size) {
                iW += CodedOutputStream.W(e0Var.getInt(i));
                i++;
            }
        } else {
            iW = 0;
            while (i < size) {
                iW += CodedOutputStream.W(list.get(i).intValue());
                i++;
            }
        }
        return iW;
    }

    public static int x(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return z ? CodedOutputStream.U(i) + CodedOutputStream.D(iY) : iY + (size * CodedOutputStream.U(i));
    }

    public static int y(List<Long> list) {
        int iY;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof k0) {
            k0 k0Var = (k0) list;
            iY = 0;
            while (i < size) {
                iY += CodedOutputStream.Y(k0Var.l(i));
                i++;
            }
        } else {
            iY = 0;
            while (i < size) {
                iY += CodedOutputStream.Y(list.get(i).longValue());
                i++;
            }
        }
        return iY;
    }

    public static <UT, UB> UB z(Object obj, int i, List<Integer> list, f0.d<?> dVar, UB ub, b2<UT, UB> b2Var) {
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
                    ub = (UB) L(obj, i, iIntValue, ub, b2Var);
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
                    ub = (UB) L(obj, i, iIntValue2, ub, b2Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
