package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f6717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m1<?, ?> f6718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o1 f6719c;

    static {
        Class<?> cls;
        Class<?> cls2;
        c1 c1Var = c1.f6688c;
        m1<?, ?> m1Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f6717a = cls;
        try {
            c1 c1Var2 = c1.f6688c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                m1Var = (m1) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f6718b = m1Var;
        f6719c = new o1();
    }

    private h1() {
    }

    public static void A(int i14, List<Long> list, u1 u1Var, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z15 = list instanceof h0;
        CodedOutputStream codedOutputStream = ((k) u1Var).f6774a;
        int i15 = 0;
        if (!z15) {
            if (!z14) {
                while (i15 < list.size()) {
                    long jLongValue = list.get(i15).longValue();
                    codedOutputStream.E(i14, (jLongValue >> 63) ^ (jLongValue << 1));
                    i15++;
                }
                return;
            }
            codedOutputStream.B(i14, 2);
            int iE = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                iE += CodedOutputStream.e(list.get(i16).longValue());
            }
            codedOutputStream.D(iE);
            while (i15 < list.size()) {
                long jLongValue2 = list.get(i15).longValue();
                codedOutputStream.F((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i15++;
            }
            return;
        }
        h0 h0Var = (h0) list;
        if (!z14) {
            while (i15 < h0Var.f6716c) {
                long j8 = h0Var.getLong(i15);
                codedOutputStream.E(i14, (j8 >> 63) ^ (j8 << 1));
                i15++;
            }
            return;
        }
        codedOutputStream.B(i14, 2);
        int iE2 = 0;
        for (int i17 = 0; i17 < h0Var.f6716c; i17++) {
            iE2 += CodedOutputStream.e(h0Var.getLong(i17));
        }
        codedOutputStream.D(iE2);
        while (i15 < h0Var.f6716c) {
            long j14 = h0Var.getLong(i15);
            codedOutputStream.F((j14 >> 63) ^ (j14 << 1));
            i15++;
        }
    }

    public static void B(int i14, List<String> list, u1 u1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ((k) u1Var).f6774a;
        int i15 = 0;
        if (!(list instanceof d0)) {
            while (i15 < list.size()) {
                codedOutputStream.z(i14, list.get(i15));
                i15++;
            }
            return;
        }
        d0 d0Var = (d0) list;
        while (i15 < list.size()) {
            Object objK = d0Var.k();
            if (objK instanceof String) {
                codedOutputStream.z(i14, (String) objK);
            } else {
                codedOutputStream.n(i14, (h) objK);
            }
            i15++;
        }
    }

    public static void C(int i14, List<Integer> list, u1 u1Var, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z15 = list instanceof y;
        CodedOutputStream codedOutputStream = ((k) u1Var).f6774a;
        int i15 = 0;
        if (!z15) {
            if (!z14) {
                while (i15 < list.size()) {
                    codedOutputStream.C(i14, list.get(i15).intValue());
                    i15++;
                }
                return;
            }
            codedOutputStream.B(i14, 2);
            int iH = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                iH += CodedOutputStream.h(list.get(i16).intValue());
            }
            codedOutputStream.D(iH);
            while (i15 < list.size()) {
                codedOutputStream.D(list.get(i15).intValue());
                i15++;
            }
            return;
        }
        y yVar = (y) list;
        if (!z14) {
            while (i15 < yVar.f6933c) {
                codedOutputStream.C(i14, yVar.getInt(i15));
                i15++;
            }
            return;
        }
        codedOutputStream.B(i14, 2);
        int iH2 = 0;
        for (int i17 = 0; i17 < yVar.f6933c; i17++) {
            iH2 += CodedOutputStream.h(yVar.getInt(i17));
        }
        codedOutputStream.D(iH2);
        while (i15 < yVar.f6933c) {
            codedOutputStream.D(yVar.getInt(i15));
            i15++;
        }
    }

    public static void D(int i14, List<Long> list, u1 u1Var, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z15 = list instanceof h0;
        CodedOutputStream codedOutputStream = ((k) u1Var).f6774a;
        int i15 = 0;
        if (!z15) {
            if (!z14) {
                while (i15 < list.size()) {
                    codedOutputStream.E(i14, list.get(i15).longValue());
                    i15++;
                }
                return;
            }
            codedOutputStream.B(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                i16 += CodedOutputStream.i(list.get(i17).longValue());
            }
            codedOutputStream.D(i16);
            while (i15 < list.size()) {
                codedOutputStream.F(list.get(i15).longValue());
                i15++;
            }
            return;
        }
        h0 h0Var = (h0) list;
        if (!z14) {
            while (i15 < h0Var.f6716c) {
                codedOutputStream.E(i14, h0Var.getLong(i15));
                i15++;
            }
            return;
        }
        codedOutputStream.B(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < h0Var.f6716c; i19++) {
            i18 += CodedOutputStream.i(h0Var.getLong(i19));
        }
        codedOutputStream.D(i18);
        while (i15 < h0Var.f6716c) {
            codedOutputStream.F(h0Var.getLong(i15));
            i15++;
        }
    }

    public static int a(List<Integer> list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof y)) {
            int i15 = 0;
            while (i14 < size) {
                i15 += CodedOutputStream.i(list.get(i14).intValue());
                i14++;
            }
            return i15;
        }
        y yVar = (y) list;
        int i16 = 0;
        while (i14 < size) {
            i16 += CodedOutputStream.i(yVar.getInt(i14));
            i14++;
        }
        return i16;
    }

    public static int b(int i14, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.g(i14) + 4) * size;
    }

    public static int c(int i14, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.g(i14) + 8) * size;
    }

    public static int d(List<Integer> list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof y)) {
            int i15 = 0;
            while (i14 < size) {
                i15 += CodedOutputStream.i(list.get(i14).intValue());
                i14++;
            }
            return i15;
        }
        y yVar = (y) list;
        int i16 = 0;
        while (i14 < size) {
            i16 += CodedOutputStream.i(yVar.getInt(i14));
            i14++;
        }
        return i16;
    }

    public static int e(List<Long> list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h0)) {
            int i15 = 0;
            while (i14 < size) {
                i15 += CodedOutputStream.i(list.get(i14).longValue());
                i14++;
            }
            return i15;
        }
        h0 h0Var = (h0) list;
        int i16 = 0;
        while (i14 < size) {
            i16 += CodedOutputStream.i(h0Var.getLong(i14));
            i14++;
        }
        return i16;
    }

    public static int f(List<Integer> list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof y)) {
            int iD = 0;
            while (i14 < size) {
                iD += CodedOutputStream.d(list.get(i14).intValue());
                i14++;
            }
            return iD;
        }
        y yVar = (y) list;
        int iD2 = 0;
        while (i14 < size) {
            iD2 += CodedOutputStream.d(yVar.getInt(i14));
            i14++;
        }
        return iD2;
    }

    public static int g(List<Long> list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h0)) {
            int iE = 0;
            while (i14 < size) {
                iE += CodedOutputStream.e(list.get(i14).longValue());
                i14++;
            }
            return iE;
        }
        h0 h0Var = (h0) list;
        int iE2 = 0;
        while (i14 < size) {
            iE2 += CodedOutputStream.e(h0Var.getLong(i14));
            i14++;
        }
        return iE2;
    }

    public static int h(List<Integer> list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof y)) {
            int iH = 0;
            while (i14 < size) {
                iH += CodedOutputStream.h(list.get(i14).intValue());
                i14++;
            }
            return iH;
        }
        y yVar = (y) list;
        int iH2 = 0;
        while (i14 < size) {
            iH2 += CodedOutputStream.h(yVar.getInt(i14));
            i14++;
        }
        return iH2;
    }

    public static int i(List<Long> list) {
        int size = list.size();
        int i14 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof h0)) {
            int i15 = 0;
            while (i14 < size) {
                i15 += CodedOutputStream.i(list.get(i14).longValue());
                i14++;
            }
            return i15;
        }
        h0 h0Var = (h0) list;
        int i16 = 0;
        while (i14 < size) {
            i16 += CodedOutputStream.i(h0Var.getLong(i14));
            i14++;
        }
        return i16;
    }

    public static <UT, UB> UB j(Object obj, int i14, List<Integer> list, z.c cVar, UB ub3, m1<UT, UB> m1Var) {
        if (cVar == null) {
            return ub3;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!cVar.a()) {
                    if (ub3 == null) {
                        ub3 = (UB) m1Var.f(obj);
                    }
                    m1Var.e(ub3, i14, iIntValue);
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
            if (cVar.a()) {
                if (i16 != i15) {
                    list.set(i15, num);
                }
                i15++;
            } else {
                if (ub3 == null) {
                    ub3 = (UB) m1Var.f(obj);
                }
                m1Var.e(ub3, i14, iIntValue2);
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
    public static <T, FT extends t.b<FT>> void k(p<FT> pVar, T t7, T t14) {
        j1<T, Object> j1Var = pVar.c(t14).f6848a;
        if (j1Var.isEmpty()) {
            return;
        }
        t<T> tVarD = pVar.d(t7);
        tVarD.getClass();
        int size = j1Var.f6756a.size();
        for (int i14 = 0; i14 < size; i14++) {
            tVarD.k(j1Var.c(i14));
        }
        Iterator<T> it = j1Var.d().iterator();
        while (it.hasNext()) {
            tVarD.k((Map.Entry) it.next());
        }
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i14, List<Boolean> list, u1 u1Var, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z15 = list instanceof e;
        CodedOutputStream codedOutputStream = ((k) u1Var).f6774a;
        int i15 = 0;
        if (!z15) {
            if (!z14) {
                while (i15 < list.size()) {
                    codedOutputStream.l(i14, list.get(i15).booleanValue());
                    i15++;
                }
                return;
            }
            codedOutputStream.B(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                list.get(i17).getClass();
                Logger logger = CodedOutputStream.f6654b;
                i16++;
            }
            codedOutputStream.D(i16);
            while (i15 < list.size()) {
                codedOutputStream.k(list.get(i15).booleanValue() ? (byte) 1 : (byte) 0);
                i15++;
            }
            return;
        }
        e eVar = (e) list;
        if (!z14) {
            while (i15 < eVar.f6697c) {
                eVar.b(i15);
                codedOutputStream.l(i14, eVar.f6696b[i15]);
                i15++;
            }
            return;
        }
        codedOutputStream.B(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < eVar.f6697c; i19++) {
            eVar.b(i19);
            boolean z16 = eVar.f6696b[i19];
            Logger logger2 = CodedOutputStream.f6654b;
            i18++;
        }
        codedOutputStream.D(i18);
        while (i15 < eVar.f6697c) {
            eVar.b(i15);
            codedOutputStream.k(eVar.f6696b[i15] ? (byte) 1 : (byte) 0);
            i15++;
        }
    }

    public static void n(int i14, List<h> list, u1 u1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = (k) u1Var;
        kVar.getClass();
        for (int i15 = 0; i15 < list.size(); i15++) {
            kVar.f6774a.n(i14, list.get(i15));
        }
    }

    public static void o(int i14, List<Double> list, u1 u1Var, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z15 = list instanceof l;
        CodedOutputStream codedOutputStream = ((k) u1Var).f6774a;
        int i15 = 0;
        if (!z15) {
            if (!z14) {
                while (i15 < list.size()) {
                    double dDoubleValue = list.get(i15).doubleValue();
                    codedOutputStream.getClass();
                    codedOutputStream.r(i14, Double.doubleToRawLongBits(dDoubleValue));
                    i15++;
                }
                return;
            }
            codedOutputStream.B(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                list.get(i17).getClass();
                Logger logger = CodedOutputStream.f6654b;
                i16 += 8;
            }
            codedOutputStream.D(i16);
            while (i15 < list.size()) {
                codedOutputStream.s(Double.doubleToRawLongBits(list.get(i15).doubleValue()));
                i15++;
            }
            return;
        }
        l lVar = (l) list;
        if (!z14) {
            while (i15 < lVar.f6783c) {
                lVar.b(i15);
                double d14 = lVar.f6782b[i15];
                codedOutputStream.getClass();
                codedOutputStream.r(i14, Double.doubleToRawLongBits(d14));
                i15++;
            }
            return;
        }
        codedOutputStream.B(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < lVar.f6783c; i19++) {
            lVar.b(i19);
            double d15 = lVar.f6782b[i19];
            Logger logger2 = CodedOutputStream.f6654b;
            i18 += 8;
        }
        codedOutputStream.D(i18);
        while (i15 < lVar.f6783c) {
            lVar.b(i15);
            codedOutputStream.s(Double.doubleToRawLongBits(lVar.f6782b[i15]));
            i15++;
        }
    }

    public static void p(int i14, List<Integer> list, u1 u1Var, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z15 = list instanceof y;
        CodedOutputStream codedOutputStream = ((k) u1Var).f6774a;
        int i15 = 0;
        if (!z15) {
            if (!z14) {
                while (i15 < list.size()) {
                    codedOutputStream.t(i14, list.get(i15).intValue());
                    i15++;
                }
                return;
            }
            codedOutputStream.B(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                i16 += CodedOutputStream.i(list.get(i17).intValue());
            }
            codedOutputStream.D(i16);
            while (i15 < list.size()) {
                codedOutputStream.u(list.get(i15).intValue());
                i15++;
            }
            return;
        }
        y yVar = (y) list;
        if (!z14) {
            while (i15 < yVar.f6933c) {
                codedOutputStream.t(i14, yVar.getInt(i15));
                i15++;
            }
            return;
        }
        codedOutputStream.B(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < yVar.f6933c; i19++) {
            i18 += CodedOutputStream.i(yVar.getInt(i19));
        }
        codedOutputStream.D(i18);
        while (i15 < yVar.f6933c) {
            codedOutputStream.u(yVar.getInt(i15));
            i15++;
        }
    }

    public static void q(int i14, List<Integer> list, u1 u1Var, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z15 = list instanceof y;
        CodedOutputStream codedOutputStream = ((k) u1Var).f6774a;
        int i15 = 0;
        if (!z15) {
            if (!z14) {
                while (i15 < list.size()) {
                    codedOutputStream.p(i14, list.get(i15).intValue());
                    i15++;
                }
                return;
            }
            codedOutputStream.B(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                list.get(i17).getClass();
                Logger logger = CodedOutputStream.f6654b;
                i16 += 4;
            }
            codedOutputStream.D(i16);
            while (i15 < list.size()) {
                codedOutputStream.q(list.get(i15).intValue());
                i15++;
            }
            return;
        }
        y yVar = (y) list;
        if (!z14) {
            while (i15 < yVar.f6933c) {
                codedOutputStream.p(i14, yVar.getInt(i15));
                i15++;
            }
            return;
        }
        codedOutputStream.B(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < yVar.f6933c; i19++) {
            yVar.getInt(i19);
            Logger logger2 = CodedOutputStream.f6654b;
            i18 += 4;
        }
        codedOutputStream.D(i18);
        while (i15 < yVar.f6933c) {
            codedOutputStream.q(yVar.getInt(i15));
            i15++;
        }
    }

    public static void r(int i14, List<Long> list, u1 u1Var, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z15 = list instanceof h0;
        CodedOutputStream codedOutputStream = ((k) u1Var).f6774a;
        int i15 = 0;
        if (!z15) {
            if (!z14) {
                while (i15 < list.size()) {
                    codedOutputStream.r(i14, list.get(i15).longValue());
                    i15++;
                }
                return;
            }
            codedOutputStream.B(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                list.get(i17).getClass();
                Logger logger = CodedOutputStream.f6654b;
                i16 += 8;
            }
            codedOutputStream.D(i16);
            while (i15 < list.size()) {
                codedOutputStream.s(list.get(i15).longValue());
                i15++;
            }
            return;
        }
        h0 h0Var = (h0) list;
        if (!z14) {
            while (i15 < h0Var.f6716c) {
                codedOutputStream.r(i14, h0Var.getLong(i15));
                i15++;
            }
            return;
        }
        codedOutputStream.B(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < h0Var.f6716c; i19++) {
            h0Var.getLong(i19);
            Logger logger2 = CodedOutputStream.f6654b;
            i18 += 8;
        }
        codedOutputStream.D(i18);
        while (i15 < h0Var.f6716c) {
            codedOutputStream.s(h0Var.getLong(i15));
            i15++;
        }
    }

    public static void s(int i14, List<Float> list, u1 u1Var, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z15 = list instanceof v;
        CodedOutputStream codedOutputStream = ((k) u1Var).f6774a;
        int i15 = 0;
        if (!z15) {
            if (!z14) {
                while (i15 < list.size()) {
                    float fFloatValue = list.get(i15).floatValue();
                    codedOutputStream.getClass();
                    codedOutputStream.p(i14, Float.floatToRawIntBits(fFloatValue));
                    i15++;
                }
                return;
            }
            codedOutputStream.B(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                list.get(i17).getClass();
                Logger logger = CodedOutputStream.f6654b;
                i16 += 4;
            }
            codedOutputStream.D(i16);
            while (i15 < list.size()) {
                codedOutputStream.q(Float.floatToRawIntBits(list.get(i15).floatValue()));
                i15++;
            }
            return;
        }
        v vVar = (v) list;
        if (!z14) {
            while (i15 < vVar.f6909c) {
                vVar.b(i15);
                float f14 = vVar.f6908b[i15];
                codedOutputStream.getClass();
                codedOutputStream.p(i14, Float.floatToRawIntBits(f14));
                i15++;
            }
            return;
        }
        codedOutputStream.B(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < vVar.f6909c; i19++) {
            vVar.b(i19);
            float f15 = vVar.f6908b[i19];
            Logger logger2 = CodedOutputStream.f6654b;
            i18 += 4;
        }
        codedOutputStream.D(i18);
        while (i15 < vVar.f6909c) {
            vVar.b(i15);
            codedOutputStream.q(Float.floatToRawIntBits(vVar.f6908b[i15]));
            i15++;
        }
    }

    public static void t(int i14, List<?> list, u1 u1Var, g1 g1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = (k) u1Var;
        kVar.getClass();
        for (int i15 = 0; i15 < list.size(); i15++) {
            kVar.e(i14, list.get(i15), g1Var);
        }
    }

    public static void u(int i14, List<Integer> list, u1 u1Var, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z15 = list instanceof y;
        CodedOutputStream codedOutputStream = ((k) u1Var).f6774a;
        int i15 = 0;
        if (!z15) {
            if (!z14) {
                while (i15 < list.size()) {
                    codedOutputStream.t(i14, list.get(i15).intValue());
                    i15++;
                }
                return;
            }
            codedOutputStream.B(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                i16 += CodedOutputStream.i(list.get(i17).intValue());
            }
            codedOutputStream.D(i16);
            while (i15 < list.size()) {
                codedOutputStream.u(list.get(i15).intValue());
                i15++;
            }
            return;
        }
        y yVar = (y) list;
        if (!z14) {
            while (i15 < yVar.f6933c) {
                codedOutputStream.t(i14, yVar.getInt(i15));
                i15++;
            }
            return;
        }
        codedOutputStream.B(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < yVar.f6933c; i19++) {
            i18 += CodedOutputStream.i(yVar.getInt(i19));
        }
        codedOutputStream.D(i18);
        while (i15 < yVar.f6933c) {
            codedOutputStream.u(yVar.getInt(i15));
            i15++;
        }
    }

    public static void v(int i14, List<Long> list, u1 u1Var, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z15 = list instanceof h0;
        CodedOutputStream codedOutputStream = ((k) u1Var).f6774a;
        int i15 = 0;
        if (!z15) {
            if (!z14) {
                while (i15 < list.size()) {
                    codedOutputStream.E(i14, list.get(i15).longValue());
                    i15++;
                }
                return;
            }
            codedOutputStream.B(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                i16 += CodedOutputStream.i(list.get(i17).longValue());
            }
            codedOutputStream.D(i16);
            while (i15 < list.size()) {
                codedOutputStream.F(list.get(i15).longValue());
                i15++;
            }
            return;
        }
        h0 h0Var = (h0) list;
        if (!z14) {
            while (i15 < h0Var.f6716c) {
                codedOutputStream.E(i14, h0Var.getLong(i15));
                i15++;
            }
            return;
        }
        codedOutputStream.B(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < h0Var.f6716c; i19++) {
            i18 += CodedOutputStream.i(h0Var.getLong(i19));
        }
        codedOutputStream.D(i18);
        while (i15 < h0Var.f6716c) {
            codedOutputStream.F(h0Var.getLong(i15));
            i15++;
        }
    }

    public static void w(int i14, List<?> list, u1 u1Var, g1 g1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        k kVar = (k) u1Var;
        kVar.getClass();
        for (int i15 = 0; i15 < list.size(); i15++) {
            kVar.h(i14, list.get(i15), g1Var);
        }
    }

    public static void x(int i14, List<Integer> list, u1 u1Var, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z15 = list instanceof y;
        CodedOutputStream codedOutputStream = ((k) u1Var).f6774a;
        int i15 = 0;
        if (!z15) {
            if (!z14) {
                while (i15 < list.size()) {
                    codedOutputStream.p(i14, list.get(i15).intValue());
                    i15++;
                }
                return;
            }
            codedOutputStream.B(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                list.get(i17).getClass();
                Logger logger = CodedOutputStream.f6654b;
                i16 += 4;
            }
            codedOutputStream.D(i16);
            while (i15 < list.size()) {
                codedOutputStream.q(list.get(i15).intValue());
                i15++;
            }
            return;
        }
        y yVar = (y) list;
        if (!z14) {
            while (i15 < yVar.f6933c) {
                codedOutputStream.p(i14, yVar.getInt(i15));
                i15++;
            }
            return;
        }
        codedOutputStream.B(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < yVar.f6933c; i19++) {
            yVar.getInt(i19);
            Logger logger2 = CodedOutputStream.f6654b;
            i18 += 4;
        }
        codedOutputStream.D(i18);
        while (i15 < yVar.f6933c) {
            codedOutputStream.q(yVar.getInt(i15));
            i15++;
        }
    }

    public static void y(int i14, List<Long> list, u1 u1Var, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z15 = list instanceof h0;
        CodedOutputStream codedOutputStream = ((k) u1Var).f6774a;
        int i15 = 0;
        if (!z15) {
            if (!z14) {
                while (i15 < list.size()) {
                    codedOutputStream.r(i14, list.get(i15).longValue());
                    i15++;
                }
                return;
            }
            codedOutputStream.B(i14, 2);
            int i16 = 0;
            for (int i17 = 0; i17 < list.size(); i17++) {
                list.get(i17).getClass();
                Logger logger = CodedOutputStream.f6654b;
                i16 += 8;
            }
            codedOutputStream.D(i16);
            while (i15 < list.size()) {
                codedOutputStream.s(list.get(i15).longValue());
                i15++;
            }
            return;
        }
        h0 h0Var = (h0) list;
        if (!z14) {
            while (i15 < h0Var.f6716c) {
                codedOutputStream.r(i14, h0Var.getLong(i15));
                i15++;
            }
            return;
        }
        codedOutputStream.B(i14, 2);
        int i18 = 0;
        for (int i19 = 0; i19 < h0Var.f6716c; i19++) {
            h0Var.getLong(i19);
            Logger logger2 = CodedOutputStream.f6654b;
            i18 += 8;
        }
        codedOutputStream.D(i18);
        while (i15 < h0Var.f6716c) {
            codedOutputStream.s(h0Var.getLong(i15));
            i15++;
        }
    }

    public static void z(int i14, List<Integer> list, u1 u1Var, boolean z14) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z15 = list instanceof y;
        CodedOutputStream codedOutputStream = ((k) u1Var).f6774a;
        int i15 = 0;
        if (!z15) {
            if (!z14) {
                while (i15 < list.size()) {
                    int iIntValue = list.get(i15).intValue();
                    codedOutputStream.C(i14, (iIntValue >> 31) ^ (iIntValue << 1));
                    i15++;
                }
                return;
            }
            codedOutputStream.B(i14, 2);
            int iD = 0;
            for (int i16 = 0; i16 < list.size(); i16++) {
                iD += CodedOutputStream.d(list.get(i16).intValue());
            }
            codedOutputStream.D(iD);
            while (i15 < list.size()) {
                int iIntValue2 = list.get(i15).intValue();
                codedOutputStream.D((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i15++;
            }
            return;
        }
        y yVar = (y) list;
        if (!z14) {
            while (i15 < yVar.f6933c) {
                int i17 = yVar.getInt(i15);
                codedOutputStream.C(i14, (i17 >> 31) ^ (i17 << 1));
                i15++;
            }
            return;
        }
        codedOutputStream.B(i14, 2);
        int iD2 = 0;
        for (int i18 = 0; i18 < yVar.f6933c; i18++) {
            iD2 += CodedOutputStream.d(yVar.getInt(i18));
        }
        codedOutputStream.D(iD2);
        while (i15 < yVar.f6933c) {
            int i19 = yVar.getInt(i15);
            codedOutputStream.D((i19 >> 31) ^ (i19 << 1));
            i15++;
        }
    }
}
