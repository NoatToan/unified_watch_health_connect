package com.google.crypto.tink.shaded.protobuf;

import defpackage.ibq;
import defpackage.qee;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f9410a = B();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n0<?, ?> f9411b = C(false);
    public static final n0<?, ?> c = C(true);
    public static final n0<?, ?> d = new p0();

    public static <UT, UB> UB A(int i, List<Integer> list, s.e eVar, UB ub, n0<UT, UB> n0Var) {
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
                    ub = (UB) L(i, iIntValue, ub, n0Var);
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
                    ub = (UB) L(i, iIntValue2, ub, n0Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static Class<?> B() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static n0<?, ?> C(boolean z) {
        try {
            Class<?> clsD = D();
            if (clsD == null) {
                return null;
            }
            return (n0) clsD.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> D() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T, FT extends p.b<FT>> void E(m<FT> mVar, T t, T t2) {
        p<T> pVarC = mVar.c(t2);
        if (pVarC.m()) {
            return;
        }
        mVar.d(t).t(pVarC);
    }

    public static <T> void F(z zVar, T t, T t2, long j) {
        ibq.T(t, j, zVar.a(ibq.E(t, j), ibq.E(t2, j)));
    }

    public static <T, UT, UB> void G(n0<UT, UB> n0Var, T t, T t2) {
        n0Var.p(t, n0Var.k(n0Var.g(t), n0Var.g(t2)));
    }

    public static n0<?, ?> H() {
        return f9411b;
    }

    public static n0<?, ?> I() {
        return c;
    }

    public static void J(Class<?> cls) {
        Class<?> cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = f9410a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <UT, UB> UB L(int i, int i2, UB ub, n0<UT, UB> n0Var) {
        if (ub == null) {
            ub = n0Var.n();
        }
        n0Var.e(ub, i, i2);
        return ub;
    }

    public static n0<?, ?> M() {
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

    public static void U(int i, List<?> list, Writer writer, k0 k0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.N(i, list, k0Var);
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

    public static void X(int i, List<?> list, Writer writer, k0 k0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.L(i, list, k0Var);
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
        return z ? CodedOutputStream.V(i) + CodedOutputStream.D(size) : size * CodedOutputStream.e(i, true);
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
        int iV = size * CodedOutputStream.V(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            iV += CodedOutputStream.i(list.get(i2));
        }
        return iV;
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
        return z ? CodedOutputStream.V(i) + CodedOutputStream.D(iE) : iE + (size * CodedOutputStream.V(i));
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
        if (list instanceof r) {
            r rVar = (r) list;
            iM = 0;
            while (i < size) {
                iM += CodedOutputStream.m(rVar.getInt(i));
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
        return z ? CodedOutputStream.V(i) + CodedOutputStream.D(size * 4) : size * CodedOutputStream.n(i, 0);
    }

    public static int g(List<?> list) {
        return list.size() * 4;
    }

    public static int h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? CodedOutputStream.V(i) + CodedOutputStream.D(size * 8) : size * CodedOutputStream.p(i, 0L);
    }

    public static int i(List<?> list) {
        return list.size() * 8;
    }

    public static int j(int i, List<b0> list, k0 k0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iT += CodedOutputStream.t(i, list.get(i2), k0Var);
        }
        return iT;
    }

    public static int k(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        return z ? CodedOutputStream.V(i) + CodedOutputStream.D(iL) : iL + (size * CodedOutputStream.V(i));
    }

    public static int l(List<Integer> list) {
        int iX;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r) {
            r rVar = (r) list;
            iX = 0;
            while (i < size) {
                iX += CodedOutputStream.x(rVar.getInt(i));
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
        return z ? CodedOutputStream.V(i) + CodedOutputStream.D(iN) : iN + (list.size() * CodedOutputStream.V(i));
    }

    public static int n(List<Long> list) {
        int iZ;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            iZ = 0;
            while (i < size) {
                iZ += CodedOutputStream.z(xVar.l(i));
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

    public static int o(int i, Object obj, k0 k0Var) {
        return obj instanceof u ? CodedOutputStream.B(i, (u) obj) : CodedOutputStream.G(i, (b0) obj, k0Var);
    }

    public static int p(int i, List<?> list, k0 k0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iV = CodedOutputStream.V(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            iV += obj instanceof u ? CodedOutputStream.C((u) obj) : CodedOutputStream.I((b0) obj, k0Var);
        }
        return iV;
    }

    public static int q(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        return z ? CodedOutputStream.V(i) + CodedOutputStream.D(iR) : iR + (size * CodedOutputStream.V(i));
    }

    public static int r(List<Integer> list) {
        int iQ;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r) {
            r rVar = (r) list;
            iQ = 0;
            while (i < size) {
                iQ += CodedOutputStream.Q(rVar.getInt(i));
                i++;
            }
        } else {
            iQ = 0;
            while (i < size) {
                iQ += CodedOutputStream.Q(list.get(i).intValue());
                i++;
            }
        }
        return iQ;
    }

    public static int s(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        return z ? CodedOutputStream.V(i) + CodedOutputStream.D(iT) : iT + (size * CodedOutputStream.V(i));
    }

    public static int t(List<Long> list) {
        int iS;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            iS = 0;
            while (i < size) {
                iS += CodedOutputStream.S(xVar.l(i));
                i++;
            }
        } else {
            iS = 0;
            while (i < size) {
                iS += CodedOutputStream.S(list.get(i).longValue());
                i++;
            }
        }
        return iS;
    }

    public static int u(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iV = CodedOutputStream.V(i) * size;
        if (list instanceof qee) {
            qee qeeVar = (qee) list;
            while (i2 < size) {
                Object objD = qeeVar.d(i2);
                iV += objD instanceof ByteString ? CodedOutputStream.i((ByteString) objD) : CodedOutputStream.U((String) objD);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                iV += obj instanceof ByteString ? CodedOutputStream.i((ByteString) obj) : CodedOutputStream.U((String) obj);
                i2++;
            }
        }
        return iV;
    }

    public static int v(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        return z ? CodedOutputStream.V(i) + CodedOutputStream.D(iW) : iW + (size * CodedOutputStream.V(i));
    }

    public static int w(List<Integer> list) {
        int iX;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r) {
            r rVar = (r) list;
            iX = 0;
            while (i < size) {
                iX += CodedOutputStream.X(rVar.getInt(i));
                i++;
            }
        } else {
            iX = 0;
            while (i < size) {
                iX += CodedOutputStream.X(list.get(i).intValue());
                i++;
            }
        }
        return iX;
    }

    public static int x(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return z ? CodedOutputStream.V(i) + CodedOutputStream.D(iY) : iY + (size * CodedOutputStream.V(i));
    }

    public static int y(List<Long> list) {
        int iZ;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x) {
            x xVar = (x) list;
            iZ = 0;
            while (i < size) {
                iZ += CodedOutputStream.Z(xVar.l(i));
                i++;
            }
        } else {
            iZ = 0;
            while (i < size) {
                iZ += CodedOutputStream.Z(list.get(i).longValue());
                i++;
            }
        }
        return iZ;
    }

    public static <UT, UB> UB z(int i, List<Integer> list, s.d<?> dVar, UB ub, n0<UT, UB> n0Var) {
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
                    ub = (UB) L(i, iIntValue, ub, n0Var);
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
                    ub = (UB) L(i, iIntValue2, ub, n0Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
