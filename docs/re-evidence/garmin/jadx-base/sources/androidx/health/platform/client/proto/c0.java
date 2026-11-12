package androidx.health.platform.client.proto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends b0<j0.d> {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7562a;

        static {
            int[] iArr = new int[b3.values().length];
            f7562a = iArr;
            try {
                iArr[b3.f7540c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7562a[b3.f7541d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7562a[b3.f7542e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7562a[b3.f7543f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7562a[b3.f7544g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7562a[b3.f7545h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7562a[b3.f7546i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7562a[b3.f7547j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7562a[b3.f7552o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7562a[b3.f7554q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7562a[b3.f7555r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7562a[b3.f7556t.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7562a[b3.f7557v.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7562a[b3.f7553p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7562a[b3.f7551n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f7562a[b3.f7548k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f7562a[b3.f7549l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f7562a[b3.f7550m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // androidx.health.platform.client.proto.b0
    public final int a(Map.Entry<?, ?> entry) {
        return ((j0.d) entry.getKey()).f7680b;
    }

    @Override // androidx.health.platform.client.proto.b0
    public final j0.e b(a0 a0Var, c1 c1Var, int i14) {
        return a0Var.f7537a.get(new a0.a(c1Var, i14));
    }

    @Override // androidx.health.platform.client.proto.b0
    public final f0<j0.d> c(Object obj) {
        return ((j0.c) obj).extensions;
    }

    @Override // androidx.health.platform.client.proto.b0
    public final f0<j0.d> d(Object obj) {
        j0.c cVar = (j0.c) obj;
        f0<j0.d> f0Var = cVar.extensions;
        if (f0Var.f7606b) {
            cVar.extensions = f0Var.clone();
        }
        return cVar.extensions;
    }

    @Override // androidx.health.platform.client.proto.b0
    public final boolean e(c1 c1Var) {
        return c1Var instanceof j0.c;
    }

    @Override // androidx.health.platform.client.proto.b0
    public final void f(Object obj) {
        ((j0.c) obj).extensions.k();
    }

    @Override // androidx.health.platform.client.proto.b0
    public final Object g(Object obj, k kVar, Object obj2, a0 a0Var, f0 f0Var, Object obj3, v2 v2Var) throws InvalidProtocolBufferException {
        Object objValueOf;
        Object objF;
        ArrayList arrayList;
        j0.e eVar = (j0.e) obj2;
        j0.d dVar = eVar.f7687d;
        c1 c1Var = eVar.f7686c;
        int i14 = dVar.f7680b;
        b3 b3Var = dVar.f7681c;
        if (dVar.f7682d && dVar.f7683e) {
            switch (a.f7562a[b3Var.ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    kVar.h(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    kVar.m(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    kVar.o(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    kVar.w(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    kVar.n(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    kVar.l(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    kVar.k(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    kVar.e(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    kVar.v(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    kVar.q(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    kVar.r(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    kVar.s(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    kVar.t(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    kVar.i(arrayList);
                    obj3 = o2.j(obj, i14, arrayList, dVar.f7679a, obj3, v2Var);
                    break;
                default:
                    androidx.room.a0.s(dVar.f7681c, "Type cannot be packed: ");
                    return null;
            }
            f0Var.m(dVar, arrayList);
            return obj3;
        }
        if (b3Var != b3.f7553p) {
            switch (a.f7562a[b3Var.ordinal()]) {
                case 1:
                    kVar.y(1);
                    objValueOf = Double.valueOf(kVar.f7698a.j());
                    break;
                case 2:
                    kVar.y(5);
                    objValueOf = Float.valueOf(kVar.f7698a.n());
                    break;
                case 3:
                    kVar.y(0);
                    objValueOf = Long.valueOf(kVar.f7698a.p());
                    break;
                case 4:
                    kVar.y(0);
                    objValueOf = Long.valueOf(kVar.f7698a.y());
                    break;
                case 5:
                    kVar.y(0);
                    objValueOf = Integer.valueOf(kVar.f7698a.o());
                    break;
                case 6:
                    kVar.y(1);
                    objValueOf = Long.valueOf(kVar.f7698a.m());
                    break;
                case 7:
                    kVar.y(5);
                    objValueOf = Integer.valueOf(kVar.f7698a.l());
                    break;
                case 8:
                    kVar.y(0);
                    objValueOf = Boolean.valueOf(kVar.f7698a.h());
                    break;
                case 9:
                    kVar.y(0);
                    objValueOf = Integer.valueOf(kVar.f7698a.x());
                    break;
                case 10:
                    kVar.y(5);
                    objValueOf = Integer.valueOf(kVar.f7698a.q());
                    break;
                case 11:
                    kVar.y(1);
                    objValueOf = Long.valueOf(kVar.f7698a.r());
                    break;
                case 12:
                    kVar.y(0);
                    objValueOf = Integer.valueOf(kVar.f7698a.s());
                    break;
                case 13:
                    kVar.y(0);
                    objValueOf = Long.valueOf(kVar.f7698a.t());
                    break;
                case 14:
                    vb.h.z("Shouldn't reach here.");
                    return null;
                case 15:
                    objValueOf = kVar.f();
                    break;
                case 16:
                    kVar.y(2);
                    objValueOf = kVar.f7698a.u();
                    break;
                case 17:
                    if (!dVar.f7682d) {
                        Object objF2 = f0Var.f(dVar);
                        if (objF2 instanceof j0) {
                            r1 r1Var = r1.f7767c;
                            r1Var.getClass();
                            n2 n2VarA = r1Var.a(objF2.getClass());
                            if (!((j0) objF2).m()) {
                                Object objNewInstance = n2VarA.newInstance();
                                n2VarA.mergeFrom(objNewInstance, objF2);
                                f0Var.m(dVar, objNewInstance);
                                objF2 = objNewInstance;
                            }
                            kVar.y(3);
                            kVar.c(objF2, n2VarA, a0Var);
                            return obj3;
                        }
                    }
                    Class<?> cls = c1Var.getClass();
                    kVar.y(3);
                    n2 n2VarA2 = r1.f7767c.a(cls);
                    Object objNewInstance2 = n2VarA2.newInstance();
                    kVar.c(objNewInstance2, n2VarA2, a0Var);
                    n2VarA2.makeImmutable(objNewInstance2);
                    objValueOf = objNewInstance2;
                    break;
                case 18:
                    if (!dVar.f7682d) {
                        Object objF3 = f0Var.f(dVar);
                        if (objF3 instanceof j0) {
                            r1 r1Var2 = r1.f7767c;
                            r1Var2.getClass();
                            n2 n2VarA3 = r1Var2.a(objF3.getClass());
                            if (!((j0) objF3).m()) {
                                Object objNewInstance3 = n2VarA3.newInstance();
                                n2VarA3.mergeFrom(objNewInstance3, objF3);
                                f0Var.m(dVar, objNewInstance3);
                                objF3 = objNewInstance3;
                            }
                            kVar.y(2);
                            kVar.d(objF3, n2VarA3, a0Var);
                            return obj3;
                        }
                    }
                    objValueOf = kVar.p(c1Var.getClass(), a0Var);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            kVar.y(0);
            int iO = kVar.f7698a.o();
            ((n1.a) dVar.f7679a).getClass();
            if (n1.a(iO) == null) {
                return o2.n(obj, i14, iO, obj3, v2Var);
            }
            objValueOf = Integer.valueOf(iO);
        }
        if (dVar.f7682d) {
            f0Var.a(dVar, objValueOf);
            return obj3;
        }
        int i15 = a.f7562a[dVar.f7681c.ordinal()];
        if ((i15 == 17 || i15 == 18) && (objF = f0Var.f(dVar)) != null) {
            j0.a builder = ((c1) objF).toBuilder();
            c1 c1Var2 = (c1) objValueOf;
            if (!builder.f7676a.getClass().isInstance(c1Var2)) {
                vb.h.s("mergeFrom(MessageLite) can only merge messages of the same type.");
                return null;
            }
            objValueOf = builder.d((androidx.health.platform.client.proto.a) c1Var2).f();
        }
        f0Var.m(dVar, objValueOf);
        return obj3;
    }

    @Override // androidx.health.platform.client.proto.b0
    public final void h(u1 u1Var, Object obj, a0 a0Var, f0<j0.d> f0Var) throws InvalidProtocolBufferException {
        j0.e eVar = (j0.e) obj;
        f0Var.m(eVar.f7687d, ((k) u1Var).p(eVar.f7686c.getClass(), a0Var));
    }

    @Override // androidx.health.platform.client.proto.b0
    public final void i(i iVar, Object obj, a0 a0Var, f0<j0.d> f0Var) throws IOException {
        j0.e eVar = (j0.e) obj;
        j0.a aVarNewBuilderForType = eVar.f7686c.newBuilderForType();
        j.b bVarE = iVar.e();
        aVarNewBuilderForType.g();
        try {
            r1 r1Var = r1.f7767c;
            MessageType messagetype = aVarNewBuilderForType.f7677b;
            r1Var.getClass();
            r1Var.a(messagetype.getClass()).e(aVarNewBuilderForType.f7677b, k.a(bVarE), a0Var);
            f0Var.m(eVar.f7687d, aVarNewBuilderForType.f());
            bVarE.a(0);
        } catch (RuntimeException e4) {
            if (!(e4.getCause() instanceof IOException)) {
                throw e4;
            }
            throw ((IOException) e4.getCause());
        }
    }

    @Override // androidx.health.platform.client.proto.b0
    public final void j(d3 d3Var, Map.Entry<?, ?> entry) {
        j0.d dVar = (j0.d) entry.getKey();
        boolean z14 = dVar.f7682d;
        b3 b3Var = dVar.f7681c;
        boolean z15 = dVar.f7683e;
        int i14 = dVar.f7680b;
        if (z14) {
            switch (a.f7562a[b3Var.ordinal()]) {
                case 1:
                    o2.q(i14, (List) entry.getValue(), d3Var, z15);
                    break;
                case 2:
                    o2.u(i14, (List) entry.getValue(), d3Var, z15);
                    break;
                case 3:
                    o2.x(i14, (List) entry.getValue(), d3Var, z15);
                    break;
                case 4:
                    o2.F(i14, (List) entry.getValue(), d3Var, z15);
                    break;
                case 5:
                    o2.w(i14, (List) entry.getValue(), d3Var, z15);
                    break;
                case 6:
                    o2.t(i14, (List) entry.getValue(), d3Var, z15);
                    break;
                case 7:
                    o2.s(i14, (List) entry.getValue(), d3Var, z15);
                    break;
                case 8:
                    o2.o(i14, (List) entry.getValue(), d3Var, z15);
                    break;
                case 9:
                    o2.E(i14, (List) entry.getValue(), d3Var, z15);
                    break;
                case 10:
                    o2.z(i14, (List) entry.getValue(), d3Var, z15);
                    break;
                case 11:
                    o2.A(i14, (List) entry.getValue(), d3Var, z15);
                    break;
                case 12:
                    o2.B(i14, (List) entry.getValue(), d3Var, z15);
                    break;
                case 13:
                    o2.C(i14, (List) entry.getValue(), d3Var, z15);
                    break;
                case 14:
                    o2.w(i14, (List) entry.getValue(), d3Var, z15);
                    break;
                case 15:
                    o2.p(i14, (List) entry.getValue(), d3Var);
                    break;
                case 16:
                    o2.D(i14, (List) entry.getValue(), d3Var);
                    break;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        o2.v(i14, (List) entry.getValue(), d3Var, r1.f7767c.a(list.get(0).getClass()));
                        break;
                    }
                    break;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        o2.y(i14, (List) entry.getValue(), d3Var, r1.f7767c.a(list2.get(0).getClass()));
                        break;
                    }
                    break;
            }
        }
        switch (a.f7562a[b3Var.ordinal()]) {
            case 1:
                double dDoubleValue = ((Double) entry.getValue()).doubleValue();
                CodedOutputStream codedOutputStream = ((l) d3Var).f7707a;
                codedOutputStream.getClass();
                codedOutputStream.p(i14, Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 2:
                float fFloatValue = ((Float) entry.getValue()).floatValue();
                CodedOutputStream codedOutputStream2 = ((l) d3Var).f7707a;
                codedOutputStream2.getClass();
                codedOutputStream2.n(i14, Float.floatToRawIntBits(fFloatValue));
                break;
            case 3:
                ((l) d3Var).g(i14, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                ((l) d3Var).f7707a.C(i14, ((Long) entry.getValue()).longValue());
                break;
            case 5:
                ((l) d3Var).f(i14, ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                ((l) d3Var).d(i14, ((Long) entry.getValue()).longValue());
                break;
            case 7:
                ((l) d3Var).c(i14, ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                ((l) d3Var).f7707a.j(i14, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                ((l) d3Var).f7707a.A(i14, ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                ((l) d3Var).f7707a.n(i14, ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                ((l) d3Var).f7707a.p(i14, ((Long) entry.getValue()).longValue());
                break;
            case 12:
                int iIntValue = ((Integer) entry.getValue()).intValue();
                ((l) d3Var).f7707a.A(i14, (iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 13:
                long jLongValue = ((Long) entry.getValue()).longValue();
                ((l) d3Var).f7707a.C(i14, (jLongValue >> 63) ^ (jLongValue << 1));
                break;
            case 14:
                ((l) d3Var).f(i14, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                ((l) d3Var).b(i14, (i) entry.getValue());
                break;
            case 16:
                ((l) d3Var).f7707a.x(i14, (String) entry.getValue());
                break;
            case 17:
                ((l) d3Var).e(i14, entry.getValue(), r1.f7767c.a(entry.getValue().getClass()));
                break;
            case 18:
                ((l) d3Var).h(i14, entry.getValue(), r1.f7767c.a(entry.getValue().getClass()));
                break;
        }
    }
}
