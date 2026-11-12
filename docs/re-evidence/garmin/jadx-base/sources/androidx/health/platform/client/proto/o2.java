package androidx.health.platform.client.proto;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f7739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v2<?, ?> f7740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x2 f7741c;

    static {
        Class<?> cls;
        Class<?> cls2;
        r1 r1Var = r1.f7767c;
        v2<?, ?> v2Var = null;
        try {
            cls = Class.forName("androidx.health.platform.client.proto.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f7739a = cls;
        try {
            r1 r1Var2 = r1.f7767c;
            try {
                cls2 = Class.forName("androidx.health.platform.client.proto.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                v2Var = (v2) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f7740b = v2Var;
        f7741c = new x2();
    }

    private o2() {
    }

    public static void A(int i14, List<Long> list, d3 d3Var, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z15 = list instanceof t0;
        CodedOutputStream codedOutputStream = ((l) d3Var).f7707a;
        int i15 = 0;
        if (!z15) {
            if (!z14) {
                while (i15 < list.size()) {
                    codedOutputStream.p(i14, list.get(i15).longValue());
                    i15++;
                }
                return;
            }
            codedOutputStream.z(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                list.get(i17).getClass();
                Logger logger = CodedOutputStream.f7529b;
                i16 += 8;
            }
            codedOutputStream.B(i16);
            while (i15 < list.size()) {
                codedOutputStream.q(list.get(i15).longValue());
                i15++;
            }
            return;
        }
        t0 t0Var = (t0) list;
        if (!z14) {
            while (i15 < t0Var.f7784c) {
                codedOutputStream.p(i14, t0Var.getLong(i15));
                i15++;
            }
            return;
        }
        codedOutputStream.z(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < t0Var.f7784c; i19++) {
            t0Var.getLong(i19);
            Logger logger2 = CodedOutputStream.f7529b;
            i18 += 8;
        }
        codedOutputStream.B(i18);
        while (i15 < t0Var.f7784c) {
            codedOutputStream.q(t0Var.getLong(i15));
            i15++;
        }
    }

    public static void B(int i14, List<Integer> list, d3 d3Var, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z15 = list instanceof k0;
        CodedOutputStream codedOutputStream = ((l) d3Var).f7707a;
        int i15 = 0;
        if (!z15) {
            if (!z14) {
                while (i15 < list.size()) {
                    int iIntValue = list.get(i15).intValue();
                    codedOutputStream.A(i14, (iIntValue >> 31) ^ (iIntValue << 1));
                    i15++;
                }
                return;
            }
            codedOutputStream.z(i14, 2);
            int iC = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                iC += CodedOutputStream.c(list.get(i16).intValue());
            }
            codedOutputStream.B(iC);
            while (i15 < list.size()) {
                int iIntValue2 = list.get(i15).intValue();
                codedOutputStream.B((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i15++;
            }
            return;
        }
        k0 k0Var = (k0) list;
        if (!z14) {
            while (i15 < k0Var.f7704c) {
                int i17 = k0Var.getInt(i15);
                codedOutputStream.A(i14, (i17 >> 31) ^ (i17 << 1));
                i15++;
            }
            return;
        }
        codedOutputStream.z(i14, 2);
        int iC2 = 0;
        for (int i18 = 0; i18 < k0Var.f7704c; i18++) {
            iC2 += CodedOutputStream.c(k0Var.getInt(i18));
        }
        codedOutputStream.B(iC2);
        while (i15 < k0Var.f7704c) {
            int i19 = k0Var.getInt(i15);
            codedOutputStream.B((i19 >> 31) ^ (i19 << 1));
            i15++;
        }
    }

    public static void C(int i14, List<Long> list, d3 d3Var, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z15 = list instanceof t0;
        CodedOutputStream codedOutputStream = ((l) d3Var).f7707a;
        int i15 = 0;
        if (!z15) {
            if (!z14) {
                while (i15 < list.size()) {
                    long jLongValue = list.get(i15).longValue();
                    codedOutputStream.C(i14, (jLongValue >> 63) ^ (jLongValue << 1));
                    i15++;
                }
                return;
            }
            codedOutputStream.z(i14, 2);
            int iD = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                iD += CodedOutputStream.d(list.get(i16).longValue());
            }
            codedOutputStream.B(iD);
            while (i15 < list.size()) {
                long jLongValue2 = list.get(i15).longValue();
                codedOutputStream.D((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i15++;
            }
            return;
        }
        t0 t0Var = (t0) list;
        if (!z14) {
            while (i15 < t0Var.f7784c) {
                long j8 = t0Var.getLong(i15);
                codedOutputStream.C(i14, (j8 >> 63) ^ (j8 << 1));
                i15++;
            }
            return;
        }
        codedOutputStream.z(i14, 2);
        int iD2 = 0;
        for (int i17 = 0; i17 < t0Var.f7784c; i17++) {
            iD2 += CodedOutputStream.d(t0Var.getLong(i17));
        }
        codedOutputStream.B(iD2);
        while (i15 < t0Var.f7784c) {
            long j14 = t0Var.getLong(i15);
            codedOutputStream.D((j14 >> 63) ^ (j14 << 1));
            i15++;
        }
    }

    public static void D(int i14, List<String> list, d3 d3Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((l) d3Var).f7707a;
        int i15 = 0;
        if (!(list instanceof p0)) {
            while (i15 < list.size()) {
                codedOutputStream.x(i14, list.get(i15));
                i15++;
            }
            return;
        }
        p0 p0Var = (p0) list;
        while (i15 < list.size()) {
            Object objK = p0Var.k();
            if (objK instanceof String) {
                codedOutputStream.x(i14, (String) objK);
            } else {
                codedOutputStream.l(i14, (i) objK);
            }
            i15++;
        }
    }

    public static void E(int i14, List<Integer> list, d3 d3Var, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z15 = list instanceof k0;
        CodedOutputStream codedOutputStream = ((l) d3Var).f7707a;
        int i15 = 0;
        if (!z15) {
            if (!z14) {
                while (i15 < list.size()) {
                    codedOutputStream.A(i14, list.get(i15).intValue());
                    i15++;
                }
                return;
            }
            codedOutputStream.z(i14, 2);
            int iG = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                iG += CodedOutputStream.g(list.get(i16).intValue());
            }
            codedOutputStream.B(iG);
            while (i15 < list.size()) {
                codedOutputStream.B(list.get(i15).intValue());
                i15++;
            }
            return;
        }
        k0 k0Var = (k0) list;
        if (!z14) {
            while (i15 < k0Var.f7704c) {
                codedOutputStream.A(i14, k0Var.getInt(i15));
                i15++;
            }
            return;
        }
        codedOutputStream.z(i14, 2);
        int iG2 = 0;
        for (int i17 = 0; i17 < k0Var.f7704c; i17++) {
            iG2 += CodedOutputStream.g(k0Var.getInt(i17));
        }
        codedOutputStream.B(iG2);
        while (i15 < k0Var.f7704c) {
            codedOutputStream.B(k0Var.getInt(i15));
            i15++;
        }
    }

    public static void F(int i14, List<Long> list, d3 d3Var, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z15 = list instanceof t0;
        CodedOutputStream codedOutputStream = ((l) d3Var).f7707a;
        int i15 = 0;
        if (!z15) {
            if (!z14) {
                while (i15 < list.size()) {
                    codedOutputStream.C(i14, list.get(i15).longValue());
                    i15++;
                }
                return;
            }
            codedOutputStream.z(i14, 2);
            int iH = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                iH += CodedOutputStream.h(list.get(i16).longValue());
            }
            codedOutputStream.B(iH);
            while (i15 < list.size()) {
                codedOutputStream.D(list.get(i15).longValue());
                i15++;
            }
            return;
        }
        t0 t0Var = (t0) list;
        if (!z14) {
            while (i15 < t0Var.f7784c) {
                codedOutputStream.C(i14, t0Var.getLong(i15));
                i15++;
            }
            return;
        }
        codedOutputStream.z(i14, 2);
        int iH2 = 0;
        for (int i17 = 0; i17 < t0Var.f7784c; i17++) {
            iH2 += CodedOutputStream.h(t0Var.getLong(i17));
        }
        codedOutputStream.B(iH2);
        while (i15 < t0Var.f7784c) {
            codedOutputStream.D(t0Var.getLong(i15));
            i15++;
        }
    }

    public static int a(List<Integer> list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof k0)) {
            int iH = 0;
            while (i14 < size) {
                iH += CodedOutputStream.h(list.get(i14).intValue());
                i14++;
            }
            return iH;
        }
        k0 k0Var = (k0) list;
        int iH2 = 0;
        while (i14 < size) {
            iH2 += CodedOutputStream.h(k0Var.getInt(i14));
            i14++;
        }
        return iH2;
    }

    public static int b(int i14, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.f(i14) + 4) * size;
    }

    public static int c(int i14, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.f(i14) + 8) * size;
    }

    public static int d(List<Integer> list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof k0)) {
            int iH = 0;
            while (i14 < size) {
                iH += CodedOutputStream.h(list.get(i14).intValue());
                i14++;
            }
            return iH;
        }
        k0 k0Var = (k0) list;
        int iH2 = 0;
        while (i14 < size) {
            iH2 += CodedOutputStream.h(k0Var.getInt(i14));
            i14++;
        }
        return iH2;
    }

    public static int e(List<Long> list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof t0)) {
            int iH = 0;
            while (i14 < size) {
                iH += CodedOutputStream.h(list.get(i14).longValue());
                i14++;
            }
            return iH;
        }
        t0 t0Var = (t0) list;
        int iH2 = 0;
        while (i14 < size) {
            iH2 += CodedOutputStream.h(t0Var.getLong(i14));
            i14++;
        }
        return iH2;
    }

    public static int f(List<Integer> list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof k0)) {
            int iC = 0;
            while (i14 < size) {
                iC += CodedOutputStream.c(list.get(i14).intValue());
                i14++;
            }
            return iC;
        }
        k0 k0Var = (k0) list;
        int iC2 = 0;
        while (i14 < size) {
            iC2 += CodedOutputStream.c(k0Var.getInt(i14));
            i14++;
        }
        return iC2;
    }

    public static int g(List<Long> list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof t0)) {
            int iD = 0;
            while (i14 < size) {
                iD += CodedOutputStream.d(list.get(i14).longValue());
                i14++;
            }
            return iD;
        }
        t0 t0Var = (t0) list;
        int iD2 = 0;
        while (i14 < size) {
            iD2 += CodedOutputStream.d(t0Var.getLong(i14));
            i14++;
        }
        return iD2;
    }

    public static int h(List<Integer> list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof k0)) {
            int iG = 0;
            while (i14 < size) {
                iG += CodedOutputStream.g(list.get(i14).intValue());
                i14++;
            }
            return iG;
        }
        k0 k0Var = (k0) list;
        int iG2 = 0;
        while (i14 < size) {
            iG2 += CodedOutputStream.g(k0Var.getInt(i14));
            i14++;
        }
        return iG2;
    }

    public static int i(List<Long> list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof t0)) {
            int iH = 0;
            while (i14 < size) {
                iH += CodedOutputStream.h(list.get(i14).longValue());
                i14++;
            }
            return iH;
        }
        t0 t0Var = (t0) list;
        int iH2 = 0;
        while (i14 < size) {
            iH2 += CodedOutputStream.h(t0Var.getLong(i14));
            i14++;
        }
        return iH2;
    }

    public static Object j(Object obj, int i14, AbstractList abstractList, l0.b bVar, Object obj2, v2 v2Var) {
        if (bVar == null) {
            return obj2;
        }
        int size = abstractList.size();
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            Integer num = (Integer) abstractList.get(i16);
            int iIntValue = num.intValue();
            if (n1.a(iIntValue) != null) {
                if (i16 != i15) {
                    abstractList.set(i15, num);
                }
                i15++;
            } else {
                obj2 = n(obj, i14, iIntValue, obj2, v2Var);
            }
        }
        if (i15 != size) {
            abstractList.subList(i15, size).clear();
        }
        return obj2;
    }

    public static <UT, UB> UB k(Object obj, int i14, List<Integer> list, l0.c cVar, UB ub3, v2<UT, UB> v2Var) {
        if (cVar == null) {
            return ub3;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!cVar.isInRange(iIntValue)) {
                    ub3 = (UB) n(obj, i14, iIntValue, ub3, v2Var);
                    it.remove();
                }
            }
            return ub3;
        }
        int size = list.size();
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            Integer num = list.get(i16);
            int iIntValue2 = num.intValue();
            if (cVar.isInRange(iIntValue2)) {
                if (i16 != i15) {
                    list.set(i15, num);
                }
                i15++;
            } else {
                ub3 = (UB) n(obj, i14, iIntValue2, ub3, v2Var);
            }
        }
        if (i15 != size) {
            list.subList(i15, size).clear();
        }
        return ub3;
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
    public static <T, FT extends f0.b<FT>> void l(b0<FT> b0Var, T t7, T t14) {
        q2<T, Object> q2Var = b0Var.c(t14).f7605a;
        if (q2Var.isEmpty()) {
            return;
        }
        f0<T> f0VarD = b0Var.d(t7);
        f0VarD.getClass();
        int size = q2Var.f7749a.size();
        for (int i14 = 0; i14 < size; i14++) {
            f0VarD.l(q2Var.c(i14));
        }
        Iterator<T> it = q2Var.d().iterator();
        while (it.hasNext()) {
            f0VarD.l((Map.Entry) it.next());
        }
    }

    public static boolean m(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static <UT, UB> UB n(Object obj, int i14, int i15, UB ub3, v2<UT, UB> v2Var) {
        if (ub3 == null) {
            ub3 = (UB) v2Var.f(obj);
        }
        v2Var.e(ub3, i14, i15);
        return ub3;
    }

    public static void o(int i14, List<Boolean> list, d3 d3Var, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z15 = list instanceof f;
        CodedOutputStream codedOutputStream = ((l) d3Var).f7707a;
        int i15 = 0;
        if (!z15) {
            if (!z14) {
                while (i15 < list.size()) {
                    codedOutputStream.j(i14, list.get(i15).booleanValue());
                    i15++;
                }
                return;
            }
            codedOutputStream.z(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                list.get(i17).getClass();
                Logger logger = CodedOutputStream.f7529b;
                i16++;
            }
            codedOutputStream.B(i16);
            while (i15 < list.size()) {
                codedOutputStream.i(list.get(i15).booleanValue() ? (byte) 1 : (byte) 0);
                i15++;
            }
            return;
        }
        f fVar = (f) list;
        if (!z14) {
            while (i15 < fVar.f7603c) {
                fVar.b(i15);
                codedOutputStream.j(i14, fVar.f7602b[i15]);
                i15++;
            }
            return;
        }
        codedOutputStream.z(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < fVar.f7603c; i19++) {
            fVar.b(i19);
            boolean z16 = fVar.f7602b[i19];
            Logger logger2 = CodedOutputStream.f7529b;
            i18++;
        }
        codedOutputStream.B(i18);
        while (i15 < fVar.f7603c) {
            fVar.b(i15);
            codedOutputStream.i(fVar.f7602b[i15] ? (byte) 1 : (byte) 0);
            i15++;
        }
    }

    public static void p(int i14, List<i> list, d3 d3Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) d3Var;
        lVar.getClass();
        for (int i15 = 0; i15 < list.size(); i15++) {
            lVar.f7707a.l(i14, list.get(i15));
        }
    }

    public static void q(int i14, List<Double> list, d3 d3Var, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z15 = list instanceof v;
        CodedOutputStream codedOutputStream = ((l) d3Var).f7707a;
        int i15 = 0;
        if (!z15) {
            if (!z14) {
                while (i15 < list.size()) {
                    double dDoubleValue = list.get(i15).doubleValue();
                    codedOutputStream.getClass();
                    codedOutputStream.p(i14, Double.doubleToRawLongBits(dDoubleValue));
                    i15++;
                }
                return;
            }
            codedOutputStream.z(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                list.get(i17).getClass();
                Logger logger = CodedOutputStream.f7529b;
                i16 += 8;
            }
            codedOutputStream.B(i16);
            while (i15 < list.size()) {
                codedOutputStream.q(Double.doubleToRawLongBits(list.get(i15).doubleValue()));
                i15++;
            }
            return;
        }
        v vVar = (v) list;
        if (!z14) {
            while (i15 < vVar.f7795c) {
                vVar.b(i15);
                double d14 = vVar.f7794b[i15];
                codedOutputStream.getClass();
                codedOutputStream.p(i14, Double.doubleToRawLongBits(d14));
                i15++;
            }
            return;
        }
        codedOutputStream.z(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < vVar.f7795c; i19++) {
            vVar.b(i19);
            double d15 = vVar.f7794b[i19];
            Logger logger2 = CodedOutputStream.f7529b;
            i18 += 8;
        }
        codedOutputStream.B(i18);
        while (i15 < vVar.f7795c) {
            vVar.b(i15);
            codedOutputStream.q(Double.doubleToRawLongBits(vVar.f7794b[i15]));
            i15++;
        }
    }

    public static void r(int i14, List<Integer> list, d3 d3Var, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z15 = list instanceof k0;
        CodedOutputStream codedOutputStream = ((l) d3Var).f7707a;
        int i15 = 0;
        if (!z15) {
            if (!z14) {
                while (i15 < list.size()) {
                    codedOutputStream.r(i14, list.get(i15).intValue());
                    i15++;
                }
                return;
            }
            codedOutputStream.z(i14, 2);
            int iH = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                iH += CodedOutputStream.h(list.get(i16).intValue());
            }
            codedOutputStream.B(iH);
            while (i15 < list.size()) {
                codedOutputStream.s(list.get(i15).intValue());
                i15++;
            }
            return;
        }
        k0 k0Var = (k0) list;
        if (!z14) {
            while (i15 < k0Var.f7704c) {
                codedOutputStream.r(i14, k0Var.getInt(i15));
                i15++;
            }
            return;
        }
        codedOutputStream.z(i14, 2);
        int iH2 = 0;
        for (int i17 = 0; i17 < k0Var.f7704c; i17++) {
            iH2 += CodedOutputStream.h(k0Var.getInt(i17));
        }
        codedOutputStream.B(iH2);
        while (i15 < k0Var.f7704c) {
            codedOutputStream.s(k0Var.getInt(i15));
            i15++;
        }
    }

    public static void s(int i14, List<Integer> list, d3 d3Var, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z15 = list instanceof k0;
        CodedOutputStream codedOutputStream = ((l) d3Var).f7707a;
        int i15 = 0;
        if (!z15) {
            if (!z14) {
                while (i15 < list.size()) {
                    codedOutputStream.n(i14, list.get(i15).intValue());
                    i15++;
                }
                return;
            }
            codedOutputStream.z(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                list.get(i17).getClass();
                Logger logger = CodedOutputStream.f7529b;
                i16 += 4;
            }
            codedOutputStream.B(i16);
            while (i15 < list.size()) {
                codedOutputStream.o(list.get(i15).intValue());
                i15++;
            }
            return;
        }
        k0 k0Var = (k0) list;
        if (!z14) {
            while (i15 < k0Var.f7704c) {
                codedOutputStream.n(i14, k0Var.getInt(i15));
                i15++;
            }
            return;
        }
        codedOutputStream.z(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < k0Var.f7704c; i19++) {
            k0Var.getInt(i19);
            Logger logger2 = CodedOutputStream.f7529b;
            i18 += 4;
        }
        codedOutputStream.B(i18);
        while (i15 < k0Var.f7704c) {
            codedOutputStream.o(k0Var.getInt(i15));
            i15++;
        }
    }

    public static void t(int i14, List<Long> list, d3 d3Var, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z15 = list instanceof t0;
        CodedOutputStream codedOutputStream = ((l) d3Var).f7707a;
        int i15 = 0;
        if (!z15) {
            if (!z14) {
                while (i15 < list.size()) {
                    codedOutputStream.p(i14, list.get(i15).longValue());
                    i15++;
                }
                return;
            }
            codedOutputStream.z(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                list.get(i17).getClass();
                Logger logger = CodedOutputStream.f7529b;
                i16 += 8;
            }
            codedOutputStream.B(i16);
            while (i15 < list.size()) {
                codedOutputStream.q(list.get(i15).longValue());
                i15++;
            }
            return;
        }
        t0 t0Var = (t0) list;
        if (!z14) {
            while (i15 < t0Var.f7784c) {
                codedOutputStream.p(i14, t0Var.getLong(i15));
                i15++;
            }
            return;
        }
        codedOutputStream.z(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < t0Var.f7784c; i19++) {
            t0Var.getLong(i19);
            Logger logger2 = CodedOutputStream.f7529b;
            i18 += 8;
        }
        codedOutputStream.B(i18);
        while (i15 < t0Var.f7784c) {
            codedOutputStream.q(t0Var.getLong(i15));
            i15++;
        }
    }

    public static void u(int i14, List<Float> list, d3 d3Var, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z15 = list instanceof h0;
        CodedOutputStream codedOutputStream = ((l) d3Var).f7707a;
        int i15 = 0;
        if (!z15) {
            if (!z14) {
                while (i15 < list.size()) {
                    float fFloatValue = list.get(i15).floatValue();
                    codedOutputStream.getClass();
                    codedOutputStream.n(i14, Float.floatToRawIntBits(fFloatValue));
                    i15++;
                }
                return;
            }
            codedOutputStream.z(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                list.get(i17).getClass();
                Logger logger = CodedOutputStream.f7529b;
                i16 += 4;
            }
            codedOutputStream.B(i16);
            while (i15 < list.size()) {
                codedOutputStream.o(Float.floatToRawIntBits(list.get(i15).floatValue()));
                i15++;
            }
            return;
        }
        h0 h0Var = (h0) list;
        if (!z14) {
            while (i15 < h0Var.f7656c) {
                h0Var.b(i15);
                float f14 = h0Var.f7655b[i15];
                codedOutputStream.getClass();
                codedOutputStream.n(i14, Float.floatToRawIntBits(f14));
                i15++;
            }
            return;
        }
        codedOutputStream.z(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < h0Var.f7656c; i19++) {
            h0Var.b(i19);
            float f15 = h0Var.f7655b[i19];
            Logger logger2 = CodedOutputStream.f7529b;
            i18 += 4;
        }
        codedOutputStream.B(i18);
        while (i15 < h0Var.f7656c) {
            h0Var.b(i15);
            codedOutputStream.o(Float.floatToRawIntBits(h0Var.f7655b[i15]));
            i15++;
        }
    }

    public static void v(int i14, List<?> list, d3 d3Var, n2 n2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) d3Var;
        lVar.getClass();
        for (int i15 = 0; i15 < list.size(); i15++) {
            lVar.e(i14, list.get(i15), n2Var);
        }
    }

    public static void w(int i14, List<Integer> list, d3 d3Var, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z15 = list instanceof k0;
        CodedOutputStream codedOutputStream = ((l) d3Var).f7707a;
        int i15 = 0;
        if (!z15) {
            if (!z14) {
                while (i15 < list.size()) {
                    codedOutputStream.r(i14, list.get(i15).intValue());
                    i15++;
                }
                return;
            }
            codedOutputStream.z(i14, 2);
            int iH = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                iH += CodedOutputStream.h(list.get(i16).intValue());
            }
            codedOutputStream.B(iH);
            while (i15 < list.size()) {
                codedOutputStream.s(list.get(i15).intValue());
                i15++;
            }
            return;
        }
        k0 k0Var = (k0) list;
        if (!z14) {
            while (i15 < k0Var.f7704c) {
                codedOutputStream.r(i14, k0Var.getInt(i15));
                i15++;
            }
            return;
        }
        codedOutputStream.z(i14, 2);
        int iH2 = 0;
        for (int i17 = 0; i17 < k0Var.f7704c; i17++) {
            iH2 += CodedOutputStream.h(k0Var.getInt(i17));
        }
        codedOutputStream.B(iH2);
        while (i15 < k0Var.f7704c) {
            codedOutputStream.s(k0Var.getInt(i15));
            i15++;
        }
    }

    public static void x(int i14, List<Long> list, d3 d3Var, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z15 = list instanceof t0;
        CodedOutputStream codedOutputStream = ((l) d3Var).f7707a;
        int i15 = 0;
        if (!z15) {
            if (!z14) {
                while (i15 < list.size()) {
                    codedOutputStream.C(i14, list.get(i15).longValue());
                    i15++;
                }
                return;
            }
            codedOutputStream.z(i14, 2);
            int iH = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                iH += CodedOutputStream.h(list.get(i16).longValue());
            }
            codedOutputStream.B(iH);
            while (i15 < list.size()) {
                codedOutputStream.D(list.get(i15).longValue());
                i15++;
            }
            return;
        }
        t0 t0Var = (t0) list;
        if (!z14) {
            while (i15 < t0Var.f7784c) {
                codedOutputStream.C(i14, t0Var.getLong(i15));
                i15++;
            }
            return;
        }
        codedOutputStream.z(i14, 2);
        int iH2 = 0;
        for (int i17 = 0; i17 < t0Var.f7784c; i17++) {
            iH2 += CodedOutputStream.h(t0Var.getLong(i17));
        }
        codedOutputStream.B(iH2);
        while (i15 < t0Var.f7784c) {
            codedOutputStream.D(t0Var.getLong(i15));
            i15++;
        }
    }

    public static void y(int i14, List<?> list, d3 d3Var, n2 n2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) d3Var;
        lVar.getClass();
        for (int i15 = 0; i15 < list.size(); i15++) {
            lVar.h(i14, list.get(i15), n2Var);
        }
    }

    public static void z(int i14, List<Integer> list, d3 d3Var, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z15 = list instanceof k0;
        CodedOutputStream codedOutputStream = ((l) d3Var).f7707a;
        int i15 = 0;
        if (!z15) {
            if (!z14) {
                while (i15 < list.size()) {
                    codedOutputStream.n(i14, list.get(i15).intValue());
                    i15++;
                }
                return;
            }
            codedOutputStream.z(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                list.get(i17).getClass();
                Logger logger = CodedOutputStream.f7529b;
                i16 += 4;
            }
            codedOutputStream.B(i16);
            while (i15 < list.size()) {
                codedOutputStream.o(list.get(i15).intValue());
                i15++;
            }
            return;
        }
        k0 k0Var = (k0) list;
        if (!z14) {
            while (i15 < k0Var.f7704c) {
                codedOutputStream.n(i14, k0Var.getInt(i15));
                i15++;
            }
            return;
        }
        codedOutputStream.z(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < k0Var.f7704c; i19++) {
            k0Var.getInt(i19);
            Logger logger2 = CodedOutputStream.f7529b;
            i18 += 4;
        }
        codedOutputStream.B(i18);
        while (i15 < k0Var.f7704c) {
            codedOutputStream.o(k0Var.getInt(i15));
            i15++;
        }
    }
}
