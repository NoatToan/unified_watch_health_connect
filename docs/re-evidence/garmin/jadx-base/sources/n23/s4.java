package n23;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x33.c f122608a = new x33.c("kotlin.jvm.JvmStatic");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f122609b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f122610a;

        static {
            int[] iArr = new int[q23.h.values().length];
            try {
                iArr[q23.h.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q23.h.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q23.h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q23.h.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[q23.h.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[q23.h.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[q23.h.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[q23.h.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f122610a = iArr;
        }
    }

    static {
        StringBuilder sb3 = new StringBuilder();
        r23.f.d dVar = r23.f.d.f149962c;
        sb3.append(dVar.f149957a.f188596a.f188600a);
        sb3.append('.');
        sb3.append(dVar.f149958b);
        f122609b = sb3.toString();
    }

    public static final y3<?> a(Object obj) {
        if (obj instanceof y3) {
            return (y3) obj;
        }
        if (!(obj instanceof p005kotlin.jvm.internal.e)) {
            return null;
        }
        k23.c cVarCompute = ((p005kotlin.jvm.internal.e) obj).compute();
        if (cVarCompute instanceof y3) {
            return (y3) cVarCompute;
        }
        return null;
    }

    public static final List<Annotation> b(u23.a aVar) {
        Annotation annotationH;
        aVar.getClass();
        u23.h annotations = aVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (u23.c cVar : annotations) {
            t23.y0 source = cVar.getSource();
            if (source instanceof y23.b) {
                annotationH = ((y23.b) source).f194344b;
            } else if (source instanceof y23.j.a) {
                z23.x xVar = ((y23.j.a) source).f194358b;
                z23.g gVar = xVar instanceof z23.g ? (z23.g) xVar : null;
                annotationH = gVar != null ? gVar.f202046a : null;
            } else {
                annotationH = h(cVar);
            }
            if (annotationH != null) {
                arrayList.add(annotationH);
            }
        }
        return k(arrayList);
    }

    public static final Class<?> c(Class<?> cls) {
        cls.getClass();
        return Array.newInstance(cls, 0).getClass();
    }

    public static final Object d(Type type) {
        type.getClass();
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!cls.isPrimitive()) {
            return null;
        }
        if (cls.equals(Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (cls.equals(Character.TYPE)) {
            return (char) 0;
        }
        if (cls.equals(Byte.TYPE)) {
            return (byte) 0;
        }
        if (cls.equals(Short.TYPE)) {
            return (short) 0;
        }
        if (cls.equals(Integer.TYPE)) {
            return 0;
        }
        if (cls.equals(Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (cls.equals(Long.TYPE)) {
            return 0L;
        }
        if (cls.equals(Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (cls.equals(Void.TYPE)) {
            vb.h.z("Parameter with void type is illegal");
            return null;
        }
        org.apache.commons.lang3.e.w(j.h("Unknown primitive: ", type));
        return null;
    }

    public static final t23.a e(Class cls, z33.g.d dVar, u33.d dVar2, u33.h hVar, u33.a aVar, e23.p pVar) {
        List<s33.u> list;
        cls.getClass();
        dVar.getClass();
        dVar2.getClass();
        aVar.getClass();
        pVar.getClass();
        y23.i iVarA = x3.a(cls);
        if (dVar instanceof s33.j) {
            list = ((s33.j) dVar).f156688i;
        } else {
            if (!(dVar instanceof s33.o)) {
                ds.e0.t(dVar, "Unsupported message: ");
                return null;
            }
            list = ((s33.o) dVar).f156774i;
        }
        List<s33.u> list2 = list;
        l43.n nVar = iVarA.f194355a;
        t23.c0 c0Var = nVar.f110052b;
        u33.j.f168343b.getClass();
        u33.j jVar = u33.j.f168344c;
        list2.getClass();
        return (t23.a) pVar.invoke(new l43.l0(new l43.p(nVar, dVar2, c0Var, hVar, jVar, aVar, null, null, list2)), dVar);
    }

    public static final boolean f(k23.p pVar) {
        pVar.getClass();
        k23.e f16153b = pVar.getF105782a();
        f2 f2Var = f16153b instanceof f2 ? (f2) f16153b : null;
        if (f2Var == null || !f2Var.k()) {
            return false;
        }
        c33.f fVarV = f2Var.V();
        return (fVarV != null ? fVarV.f24213m : null) == null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class<?> g(ClassLoader classLoader, x33.b bVar, int i14) {
        classLoader.getClass();
        bVar.getClass();
        x33.d dVar = bVar.a().f188596a;
        String str = dVar.f188600a;
        Integer numI = d53.t.i(d53.w.c0(str, f122609b, str));
        if (numI != null) {
            int iIntValue = numI.intValue();
            r23.f.a aVar = r23.f.a.f149959c;
            aVar.getClass();
            return g(classLoader, new x33.b(aVar.f149957a, aVar.a(iIntValue + 1)), i14);
        }
        s23.c.f156232a.getClass();
        x33.b bVarF = s23.c.f(dVar);
        if (bVarF == null) {
            bVarF = bVar;
        }
        if (!bVarF.equals(bVar)) {
            classLoader = z23.f.d(Unit.class);
        }
        String str2 = bVarF.f188591a.f188596a.f188600a;
        String str3 = bVarF.f188592b.f188596a.f188600a;
        if (p005kotlin.jvm.internal.s.g(str2, "kotlin")) {
            switch (str3.hashCode()) {
                case -901856463:
                    if (str3.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str3.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str3.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str3.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str3.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str3.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str3.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str3.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str3.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb3 = new StringBuilder();
        if (i14 > 0) {
            for (int i15 = 0; i15 < i14; i15++) {
                sb3.append("[");
            }
            sb3.append("L");
        }
        if (str2.length() > 0) {
            sb3.append(str2.concat("."));
        }
        sb3.append(d53.u.w(str3, '.', '$'));
        if (i14 > 0) {
            sb3.append(";");
        }
        try {
            return Class.forName(sb3.toString(), false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final Annotation h(u23.c cVar) {
        t23.e eVarD = f43.e.d(cVar);
        Class<?> clsI = eVarD != null ? i(eVarD) : null;
        if (clsI == null) {
            clsI = null;
        }
        if (clsI == null) {
            return null;
        }
        Set<Map.Entry<x33.f, d43.g<?>>> setEntrySet = cVar.b().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            x33.f fVar = (x33.f) entry.getKey();
            d43.g gVar = (d43.g) entry.getValue();
            ClassLoader classLoader = clsI.getClassLoader();
            classLoader.getClass();
            Object objJ = j(gVar, classLoader);
            o13.p pVar = objJ != null ? new o13.p(fVar.b(), objJ) : null;
            if (pVar != null) {
                arrayList.add(pVar);
            }
        }
        return (Annotation) o23.f.b(clsI, p13.u0.l(arrayList));
    }

    public static final Class<?> i(t23.e eVar) {
        eVar.getClass();
        t23.y0 source = eVar.getSource();
        source.getClass();
        if (source instanceof q33.z) {
            return ((y23.e) ((q33.z) source).f142541b).f194348a;
        }
        if (source instanceof y23.j.a) {
            return ((z23.t) ((y23.j.a) source).f194358b).f202070a;
        }
        x33.b bVarF = f43.e.f(eVar);
        if (bVarF == null) {
            return null;
        }
        return g(z23.f.d(eVar.getClass()), bVarF, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object j(d43.g<?> gVar, ClassLoader classLoader) {
        p43.n0 n0Var;
        Class<?> clsG;
        if (gVar instanceof d43.a) {
            return h((u23.c) ((d43.a) gVar).f57481a);
        }
        int i14 = 0;
        if (gVar instanceof d43.b) {
            d43.b bVar = (d43.b) gVar;
            d43.z zVar = bVar instanceof d43.z ? (d43.z) bVar : null;
            if (zVar != null && (n0Var = zVar.f57504c) != null) {
                T t7 = bVar.f57481a;
                Iterable iterable = (Iterable) t7;
                ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(j((d43.g) it.next(), classLoader));
                }
                x33.f fVar = p005kotlin.reflect.jvm.internal.impl.builtins.d.f105832e;
                t23.h hVarT = n0Var.F0().t();
                q23.h hVarS = hVarT == null ? null : p005kotlin.reflect.jvm.internal.impl.builtins.d.s(hVarT);
                switch (hVarS == null ? -1 : a.f122610a[hVarS.ordinal()]) {
                    case -1:
                        if (!p005kotlin.reflect.jvm.internal.impl.builtins.d.z(n0Var)) {
                            o2.c.s(n0Var, "Not an array type: ");
                            return null;
                        }
                        p43.n0 type = ((p43.t1) p13.h0.I0(n0Var.D0())).getType();
                        type.getClass();
                        t23.h hVarT2 = type.F0().t();
                        t23.e eVar = hVarT2 instanceof t23.e ? (t23.e) hVarT2 : null;
                        if (eVar == null) {
                            ds.e0.t(type, "Not a class type: ");
                            return null;
                        }
                        if (p005kotlin.reflect.jvm.internal.impl.builtins.d.I(type)) {
                            int size = ((List) t7).size();
                            String[] strArr = new String[size];
                            while (i14 < size) {
                                Object obj = arrayList.get(i14);
                                obj.getClass();
                                strArr[i14] = obj;
                                i14++;
                            }
                            return strArr;
                        }
                        if (p005kotlin.reflect.jvm.internal.impl.builtins.d.b(eVar, kotlin.reflect.jvm.internal.impl.builtins.f.a.R)) {
                            int size2 = ((List) t7).size();
                            Class[] clsArr = new Class[size2];
                            while (i14 < size2) {
                                Object obj2 = arrayList.get(i14);
                                obj2.getClass();
                                clsArr[i14] = obj2;
                                i14++;
                            }
                            return clsArr;
                        }
                        x33.b bVarF = f43.e.f(eVar);
                        if (bVarF != null && (clsG = g(classLoader, bVarF, 0)) != null) {
                            Object objNewInstance = Array.newInstance(clsG, ((List) t7).size());
                            objNewInstance.getClass();
                            Object[] objArr = (Object[]) objNewInstance;
                            int size3 = arrayList.size();
                            while (i14 < size3) {
                                objArr[i14] = arrayList.get(i14);
                                i14++;
                            }
                            return objArr;
                        }
                        break;
                    case 0:
                    default:
                        lc.u0.r();
                        return null;
                    case 1:
                        int size4 = ((List) t7).size();
                        boolean[] zArr = new boolean[size4];
                        while (i14 < size4) {
                            Object obj3 = arrayList.get(i14);
                            obj3.getClass();
                            zArr[i14] = ((Boolean) obj3).booleanValue();
                            i14++;
                        }
                        return zArr;
                    case 2:
                        int size5 = ((List) t7).size();
                        char[] cArr = new char[size5];
                        while (i14 < size5) {
                            Object obj4 = arrayList.get(i14);
                            obj4.getClass();
                            cArr[i14] = ((Character) obj4).charValue();
                            i14++;
                        }
                        return cArr;
                    case 3:
                        int size6 = ((List) t7).size();
                        byte[] bArr = new byte[size6];
                        while (i14 < size6) {
                            Object obj5 = arrayList.get(i14);
                            obj5.getClass();
                            bArr[i14] = ((Byte) obj5).byteValue();
                            i14++;
                        }
                        return bArr;
                    case 4:
                        int size7 = ((List) t7).size();
                        short[] sArr = new short[size7];
                        while (i14 < size7) {
                            Object obj6 = arrayList.get(i14);
                            obj6.getClass();
                            sArr[i14] = ((Short) obj6).shortValue();
                            i14++;
                        }
                        return sArr;
                    case 5:
                        int size8 = ((List) t7).size();
                        int[] iArr = new int[size8];
                        while (i14 < size8) {
                            Object obj7 = arrayList.get(i14);
                            obj7.getClass();
                            iArr[i14] = ((Integer) obj7).intValue();
                            i14++;
                        }
                        return iArr;
                    case 6:
                        int size9 = ((List) t7).size();
                        float[] fArr = new float[size9];
                        while (i14 < size9) {
                            Object obj8 = arrayList.get(i14);
                            obj8.getClass();
                            fArr[i14] = ((Float) obj8).floatValue();
                            i14++;
                        }
                        return fArr;
                    case 7:
                        int size10 = ((List) t7).size();
                        long[] jArr = new long[size10];
                        while (i14 < size10) {
                            Object obj9 = arrayList.get(i14);
                            obj9.getClass();
                            jArr[i14] = ((Long) obj9).longValue();
                            i14++;
                        }
                        return jArr;
                    case 8:
                        int size11 = ((List) t7).size();
                        double[] dArr = new double[size11];
                        while (i14 < size11) {
                            Object obj10 = arrayList.get(i14);
                            obj10.getClass();
                            dArr[i14] = ((Double) obj10).doubleValue();
                            i14++;
                        }
                        return dArr;
                }
            }
        } else if (gVar instanceof d43.k) {
            o13.p pVar = (o13.p) ((d43.k) gVar).f57481a;
            x33.b bVar2 = (x33.b) pVar.f128594a;
            x33.f fVar2 = (x33.f) pVar.f128595b;
            Class<?> clsG2 = g(classLoader, bVar2, 0);
            if (clsG2 != null) {
                return Enum.valueOf(clsG2, fVar2.b());
            }
        } else {
            if (!(gVar instanceof d43.t)) {
                if ((gVar instanceof d43.l) || (gVar instanceof d43.v)) {
                    return null;
                }
                return gVar.b();
            }
            d43.t.b bVar3 = (d43.t.b) ((d43.t) gVar).f57481a;
            if (bVar3 instanceof d43.t.b.C1229b) {
                d43.f fVar3 = ((d43.t.b.C1229b) bVar3).f57502a;
                return g(classLoader, fVar3.f57479a, fVar3.f57480b);
            }
            if (!(bVar3 instanceof d43.t.b.a)) {
                lc.u0.r();
                return null;
            }
            t23.h hVarT3 = ((d43.t.b.a) bVar3).f57501a.F0().t();
            t23.e eVar2 = hVarT3 instanceof t23.e ? (t23.e) hVarT3 : null;
            if (eVar2 != null) {
                return i(eVar2);
            }
        }
        return null;
    }

    public static final List k(ArrayList arrayList) throws IllegalAccessException, InvocationTargetException {
        List listC;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (dh.b.u(dh.b.s((Annotation) it.next())).getSimpleName().equals("Container")) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        Annotation annotation = (Annotation) it3.next();
                        Class clsU = dh.b.u(dh.b.s(annotation));
                        if (!clsU.getSimpleName().equals("Container") || clsU.getAnnotation(p005kotlin.jvm.internal.u0.class) == null) {
                            listC = p13.w.c(annotation);
                        } else {
                            Object objInvoke = clsU.getDeclaredMethod("value", null).invoke(annotation, null);
                            objInvoke.getClass();
                            listC = Arrays.asList((Annotation[]) objInvoke);
                            listC.getClass();
                        }
                        p13.d0.v(arrayList2, listC);
                    }
                    return arrayList2;
                }
            }
        }
        return arrayList;
    }
}
