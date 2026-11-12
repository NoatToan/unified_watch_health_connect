package d43;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p13.h0;
import p13.j0;
import p43.v0;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f57483a = new i();

    private i() {
    }

    public final b a(List<?> list, t23.c0 c0Var, q23.h hVar) {
        List listB1 = h0.b1(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listB1.iterator();
        while (it.hasNext()) {
            g<?> gVarB = b(it.next(), null);
            if (gVarB != null) {
                arrayList.add(gVarB);
            }
        }
        if (c0Var == null) {
            return new b(arrayList, new h(hVar));
        }
        v0 v0VarR = c0Var.e().r(hVar);
        v0VarR.getClass();
        return new z(arrayList, v0VarR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v28, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [d43.i] */
    public final g<?> b(Object obj, t23.c0 c0Var) {
        ?? C;
        ?? C2;
        if (obj instanceof Byte) {
            return new d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new w(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new n(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new u(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new m(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new j(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new x((String) obj);
        }
        if (obj instanceof byte[]) {
            return a(p13.u.d0((byte[]) obj), c0Var, q23.h.BYTE);
        }
        int i14 = 0;
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length = sArr.length;
            if (length == 0) {
                C2 = j0.f134944a;
            } else if (length != 1) {
                C2 = new ArrayList(sArr.length);
                int length2 = sArr.length;
                while (i14 < length2) {
                    C2.add(Short.valueOf(sArr[i14]));
                    i14++;
                }
            } else {
                C2 = p13.w.c(Short.valueOf(sArr[0]));
            }
            return a(C2, c0Var, q23.h.SHORT);
        }
        if (obj instanceof int[]) {
            return a(p13.u.g0((int[]) obj), c0Var, q23.h.INT);
        }
        if (obj instanceof long[]) {
            return a(p13.u.h0((long[]) obj), c0Var, q23.h.LONG);
        }
        if (!(obj instanceof char[])) {
            if (obj instanceof float[]) {
                return a(p13.u.f0((float[]) obj), c0Var, q23.h.FLOAT);
            }
            if (obj instanceof double[]) {
                return a(p13.u.e0((double[]) obj), c0Var, q23.h.DOUBLE);
            }
            if (obj instanceof boolean[]) {
                return a(p13.u.j0((boolean[]) obj), c0Var, q23.h.BOOLEAN);
            }
            if (obj == null) {
                return new v();
            }
            return null;
        }
        char[] cArr = (char[]) obj;
        int length3 = cArr.length;
        if (length3 == 0) {
            C = j0.f134944a;
        } else if (length3 != 1) {
            C = new ArrayList(cArr.length);
            int length4 = cArr.length;
            while (i14 < length4) {
                C.add(Character.valueOf(cArr[i14]));
                i14++;
            }
        } else {
            C = p13.w.c(Character.valueOf(cArr[0]));
        }
        return a(C, c0Var, q23.h.CHAR);
    }
}
