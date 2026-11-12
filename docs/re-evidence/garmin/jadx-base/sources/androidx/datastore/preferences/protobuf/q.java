package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q extends p<x.d> {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6807a;

        static {
            int[] iArr = new int[s1.values().length];
            f6807a = iArr;
            try {
                iArr[s1.f6826c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6807a[s1.f6827d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6807a[s1.f6828e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6807a[s1.f6829f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6807a[s1.f6830g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6807a[s1.f6831h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6807a[s1.f6832i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6807a[s1.f6833j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6807a[s1.f6838o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6807a[s1.f6840q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6807a[s1.f6841r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6807a[s1.f6842t.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f6807a[s1.f6843v.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f6807a[s1.f6839p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f6807a[s1.f6837n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f6807a[s1.f6834k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f6807a[s1.f6835l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f6807a[s1.f6836m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public final int a(Map.Entry<?, ?> entry) {
        return ((x.d) entry.getKey()).f6914a;
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public final x.e b(o oVar, q0 q0Var, int i14) {
        return oVar.f6796a.get(new o.a(q0Var, i14));
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public final t<x.d> c(Object obj) {
        return ((x.c) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public final t<x.d> d(Object obj) {
        x.c cVar = (x.c) obj;
        t<x.d> tVar = cVar.extensions;
        if (tVar.f6849b) {
            cVar.extensions = tVar.clone();
        }
        return cVar.extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public final boolean e(q0 q0Var) {
        return q0Var instanceof x.c;
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public final void f(Object obj) {
        ((x.c) obj).extensions.j();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.datastore.preferences.protobuf.p
    public final Object g(j jVar, Object obj, o oVar, t tVar, Object obj2) throws InvalidProtocolBufferException {
        Object objValueOf;
        Object objE;
        List arrayList;
        ArrayList arrayList2;
        x.e eVar = (x.e) obj;
        x.d dVar = eVar.f6921d;
        q0 q0Var = eVar.f6920c;
        int i14 = dVar.f6914a;
        s1 s1Var = dVar.f6915b;
        if (dVar.f6916c && dVar.f6917d) {
            switch (a.f6807a[s1Var.ordinal()]) {
                case 1:
                    arrayList2 = new ArrayList();
                    jVar.h(arrayList2);
                    break;
                case 2:
                    arrayList2 = new ArrayList();
                    jVar.m(arrayList2);
                    break;
                case 3:
                    arrayList2 = new ArrayList();
                    jVar.o(arrayList2);
                    break;
                case 4:
                    arrayList2 = new ArrayList();
                    jVar.w(arrayList2);
                    break;
                case 5:
                    arrayList2 = new ArrayList();
                    jVar.n(arrayList2);
                    break;
                case 6:
                    arrayList2 = new ArrayList();
                    jVar.l(arrayList2);
                    break;
                case 7:
                    arrayList2 = new ArrayList();
                    jVar.k(arrayList2);
                    break;
                case 8:
                    arrayList2 = new ArrayList();
                    jVar.e(arrayList2);
                    break;
                case 9:
                    arrayList2 = new ArrayList();
                    jVar.v(arrayList2);
                    break;
                case 10:
                    arrayList2 = new ArrayList();
                    jVar.q(arrayList2);
                    break;
                case 11:
                    arrayList2 = new ArrayList();
                    jVar.r(arrayList2);
                    break;
                case 12:
                    arrayList2 = new ArrayList();
                    jVar.s(arrayList2);
                    break;
                case 13:
                    arrayList2 = new ArrayList();
                    jVar.t(arrayList2);
                    break;
                case 14:
                    arrayList2 = new ArrayList();
                    jVar.i(arrayList2);
                    dVar.getClass();
                    Class<?> cls = h1.f6717a;
                    break;
                default:
                    androidx.room.a0.s(dVar.f6915b, "Type cannot be packed: ");
                    return null;
            }
            tVar.l(dVar, arrayList2);
            return obj2;
        }
        if (s1Var == s1.f6839p) {
            jVar.y(0);
            jVar.f6743a.n();
            dVar.getClass();
            throw null;
        }
        int[] iArr = a.f6807a;
        switch (iArr[s1Var.ordinal()]) {
            case 1:
                jVar.y(1);
                objValueOf = Double.valueOf(jVar.f6743a.i());
                break;
            case 2:
                jVar.y(5);
                objValueOf = Float.valueOf(jVar.f6743a.m());
                break;
            case 3:
                jVar.y(0);
                objValueOf = Long.valueOf(jVar.f6743a.o());
                break;
            case 4:
                jVar.y(0);
                objValueOf = Long.valueOf(jVar.f6743a.x());
                break;
            case 5:
                jVar.y(0);
                objValueOf = Integer.valueOf(jVar.f6743a.n());
                break;
            case 6:
                jVar.y(1);
                objValueOf = Long.valueOf(jVar.f6743a.l());
                break;
            case 7:
                jVar.y(5);
                objValueOf = Integer.valueOf(jVar.f6743a.k());
                break;
            case 8:
                jVar.y(0);
                objValueOf = Boolean.valueOf(jVar.f6743a.g());
                break;
            case 9:
                jVar.y(0);
                objValueOf = Integer.valueOf(jVar.f6743a.w());
                break;
            case 10:
                jVar.y(5);
                objValueOf = Integer.valueOf(jVar.f6743a.p());
                break;
            case 11:
                jVar.y(1);
                objValueOf = Long.valueOf(jVar.f6743a.q());
                break;
            case 12:
                jVar.y(0);
                objValueOf = Integer.valueOf(jVar.f6743a.r());
                break;
            case 13:
                jVar.y(0);
                objValueOf = Long.valueOf(jVar.f6743a.s());
                break;
            case 14:
                vb.h.z("Shouldn't reach here.");
                return null;
            case 15:
                objValueOf = jVar.f();
                break;
            case 16:
                jVar.y(2);
                objValueOf = jVar.f6743a.t();
                break;
            case 17:
                if (!dVar.f6916c) {
                    Object objE2 = tVar.e(dVar);
                    if (objE2 instanceof x) {
                        c1 c1Var = c1.f6688c;
                        c1Var.getClass();
                        g1 g1VarA = c1Var.a(objE2.getClass());
                        if (!((x) objE2).j()) {
                            Object objNewInstance = g1VarA.newInstance();
                            g1VarA.mergeFrom(objNewInstance, objE2);
                            tVar.l(dVar, objNewInstance);
                            objE2 = objNewInstance;
                        }
                        jVar.y(3);
                        jVar.c(objE2, g1VarA, oVar);
                        return obj2;
                    }
                }
                Class<?> cls2 = q0Var.getClass();
                jVar.y(3);
                g1 g1VarA2 = c1.f6688c.a(cls2);
                Object objNewInstance2 = g1VarA2.newInstance();
                jVar.c(objNewInstance2, g1VarA2, oVar);
                g1VarA2.makeImmutable(objNewInstance2);
                objValueOf = objNewInstance2;
                break;
            case 18:
                if (!dVar.f6916c) {
                    Object objE3 = tVar.e(dVar);
                    if (objE3 instanceof x) {
                        c1 c1Var2 = c1.f6688c;
                        c1Var2.getClass();
                        g1 g1VarA3 = c1Var2.a(objE3.getClass());
                        if (!((x) objE3).j()) {
                            Object objNewInstance3 = g1VarA3.newInstance();
                            g1VarA3.mergeFrom(objNewInstance3, objE3);
                            tVar.l(dVar, objNewInstance3);
                            objE3 = objNewInstance3;
                        }
                        jVar.y(2);
                        jVar.d(objE3, g1VarA3, oVar);
                        return obj2;
                    }
                }
                objValueOf = jVar.p(q0Var.getClass(), oVar);
                break;
            default:
                objValueOf = null;
                break;
        }
        if (dVar.f6916c) {
            tVar.getClass();
            if (!dVar.f6916c) {
                vb.h.s("addRepeatedField() can only be called on repeated fields.");
                return null;
            }
            t.m(dVar, objValueOf);
            Object objE4 = tVar.e(dVar);
            if (objE4 == null) {
                arrayList = new ArrayList();
                tVar.f6848a.put(dVar, arrayList);
            } else {
                arrayList = (List) objE4;
            }
            arrayList.add(objValueOf);
            return obj2;
        }
        int i15 = iArr[dVar.f6915b.ordinal()];
        if ((i15 == 17 || i15 == 18) && (objE = tVar.e(dVar)) != null) {
            x.a builder = ((q0) objE).toBuilder();
            q0 q0Var2 = (q0) objValueOf;
            if (!builder.f6911a.getClass().isInstance(q0Var2)) {
                vb.h.s("mergeFrom(MessageLite) can only merge messages of the same type.");
                return null;
            }
            objValueOf = builder.d((androidx.datastore.preferences.protobuf.a) q0Var2).f();
        }
        tVar.l(dVar, objValueOf);
        return obj2;
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public final void h(f1 f1Var, Object obj, o oVar, t<x.d> tVar) throws InvalidProtocolBufferException {
        x.e eVar = (x.e) obj;
        tVar.l(eVar.f6921d, ((j) f1Var).p(eVar.f6920c.getClass(), oVar));
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public final void i(h hVar, Object obj, o oVar, t<x.d> tVar) throws IOException {
        x.e eVar = (x.e) obj;
        x.a aVarNewBuilderForType = eVar.f6920c.newBuilderForType();
        i.b bVarF = hVar.f();
        aVarNewBuilderForType.g();
        try {
            c1 c1Var = c1.f6688c;
            MessageType messagetype = aVarNewBuilderForType.f6912b;
            c1Var.getClass();
            c1Var.a(messagetype.getClass()).b(aVarNewBuilderForType.f6912b, j.a(bVarF), oVar);
            tVar.l(eVar.f6921d, aVarNewBuilderForType.f());
            bVarF.a(0);
        } catch (RuntimeException e4) {
            if (!(e4.getCause() instanceof IOException)) {
                throw e4;
            }
            throw ((IOException) e4.getCause());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public final void j(u1 u1Var, Map.Entry<?, ?> entry) {
        x.d dVar = (x.d) entry.getKey();
        boolean z14 = dVar.f6916c;
        s1 s1Var = dVar.f6915b;
        boolean z15 = dVar.f6917d;
        int i14 = dVar.f6914a;
        if (z14) {
            switch (a.f6807a[s1Var.ordinal()]) {
                case 1:
                    h1.o(i14, (List) entry.getValue(), u1Var, z15);
                    break;
                case 2:
                    h1.s(i14, (List) entry.getValue(), u1Var, z15);
                    break;
                case 3:
                    h1.v(i14, (List) entry.getValue(), u1Var, z15);
                    break;
                case 4:
                    h1.D(i14, (List) entry.getValue(), u1Var, z15);
                    break;
                case 5:
                    h1.u(i14, (List) entry.getValue(), u1Var, z15);
                    break;
                case 6:
                    h1.r(i14, (List) entry.getValue(), u1Var, z15);
                    break;
                case 7:
                    h1.q(i14, (List) entry.getValue(), u1Var, z15);
                    break;
                case 8:
                    h1.m(i14, (List) entry.getValue(), u1Var, z15);
                    break;
                case 9:
                    h1.C(i14, (List) entry.getValue(), u1Var, z15);
                    break;
                case 10:
                    h1.x(i14, (List) entry.getValue(), u1Var, z15);
                    break;
                case 11:
                    h1.y(i14, (List) entry.getValue(), u1Var, z15);
                    break;
                case 12:
                    h1.z(i14, (List) entry.getValue(), u1Var, z15);
                    break;
                case 13:
                    h1.A(i14, (List) entry.getValue(), u1Var, z15);
                    break;
                case 14:
                    h1.u(i14, (List) entry.getValue(), u1Var, z15);
                    break;
                case 15:
                    h1.n(i14, (List) entry.getValue(), u1Var);
                    break;
                case 16:
                    h1.B(i14, (List) entry.getValue(), u1Var);
                    break;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        h1.t(i14, (List) entry.getValue(), u1Var, c1.f6688c.a(list.get(0).getClass()));
                        break;
                    }
                    break;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        h1.w(i14, (List) entry.getValue(), u1Var, c1.f6688c.a(list2.get(0).getClass()));
                        break;
                    }
                    break;
            }
        }
        switch (a.f6807a[s1Var.ordinal()]) {
            case 1:
                double dDoubleValue = ((Double) entry.getValue()).doubleValue();
                CodedOutputStream codedOutputStream = ((k) u1Var).f6774a;
                codedOutputStream.getClass();
                codedOutputStream.r(i14, Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 2:
                float fFloatValue = ((Float) entry.getValue()).floatValue();
                CodedOutputStream codedOutputStream2 = ((k) u1Var).f6774a;
                codedOutputStream2.getClass();
                codedOutputStream2.p(i14, Float.floatToRawIntBits(fFloatValue));
                break;
            case 3:
                ((k) u1Var).g(i14, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                ((k) u1Var).f6774a.E(i14, ((Long) entry.getValue()).longValue());
                break;
            case 5:
                ((k) u1Var).f(i14, ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                ((k) u1Var).d(i14, ((Long) entry.getValue()).longValue());
                break;
            case 7:
                ((k) u1Var).c(i14, ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                ((k) u1Var).f6774a.l(i14, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                ((k) u1Var).f6774a.C(i14, ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                ((k) u1Var).f6774a.p(i14, ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                ((k) u1Var).f6774a.r(i14, ((Long) entry.getValue()).longValue());
                break;
            case 12:
                int iIntValue = ((Integer) entry.getValue()).intValue();
                ((k) u1Var).f6774a.C(i14, (iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 13:
                long jLongValue = ((Long) entry.getValue()).longValue();
                ((k) u1Var).f6774a.E(i14, (jLongValue >> 63) ^ (jLongValue << 1));
                break;
            case 14:
                ((k) u1Var).f(i14, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                ((k) u1Var).b(i14, (h) entry.getValue());
                break;
            case 16:
                ((k) u1Var).f6774a.z(i14, (String) entry.getValue());
                break;
            case 17:
                ((k) u1Var).e(i14, entry.getValue(), c1.f6688c.a(entry.getValue().getClass()));
                break;
            case 18:
                ((k) u1Var).h(i14, entry.getValue(), c1.f6688c.a(entry.getValue().getClass()));
                break;
        }
    }
}
