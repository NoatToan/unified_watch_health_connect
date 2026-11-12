package androidx.health.platform.client.proto;

import defpackage.vdi;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends z<GeneratedMessageLite.d> {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2472a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f2472a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2472a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2472a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2472a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2472a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2472a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2472a[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2472a[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2472a[WireFormat.FieldType.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2472a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2472a[WireFormat.FieldType.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2472a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2472a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2472a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2472a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2472a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2472a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f2472a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // androidx.health.platform.client.proto.z
    public int a(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.d) entry.getKey()).getNumber();
    }

    @Override // androidx.health.platform.client.proto.z
    public Object b(y yVar, o0 o0Var, int i) {
        return yVar.a(o0Var, i);
    }

    @Override // androidx.health.platform.client.proto.z
    public c0<GeneratedMessageLite.d> c(Object obj) {
        return ((GeneratedMessageLite.c) obj).extensions;
    }

    @Override // androidx.health.platform.client.proto.z
    public c0<GeneratedMessageLite.d> d(Object obj) {
        return ((GeneratedMessageLite.c) obj).N();
    }

    @Override // androidx.health.platform.client.proto.z
    public boolean e(o0 o0Var) {
        return o0Var instanceof GeneratedMessageLite.c;
    }

    @Override // androidx.health.platform.client.proto.z
    public void f(Object obj) {
        c(obj).u();
    }

    @Override // androidx.health.platform.client.proto.z
    public <UT, UB> UB g(Object obj, w0 w0Var, Object obj2, y yVar, c0<GeneratedMessageLite.d> c0Var, UB ub, b2<UT, UB> b2Var) throws IOException {
        Object objValueOf;
        Object objI;
        ArrayList arrayList;
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj2;
        int iC = eVar.c();
        if (eVar.f2466b.isRepeated() && eVar.f2466b.isPacked()) {
            switch (a.f2472a[eVar.a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    w0Var.q(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    w0Var.n(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    w0Var.w(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    w0Var.v(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    w0Var.j(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    w0Var.A(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    w0Var.k(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    w0Var.f(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    w0Var.B(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    w0Var.t(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    w0Var.i(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    w0Var.g(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    w0Var.a(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    w0Var.x(arrayList);
                    ub = (UB) x1.z(obj, iC, arrayList, eVar.f2466b.b(), ub, b2Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f2466b.getLiteType());
            }
            c0Var.y(eVar.f2466b, arrayList);
        } else {
            if (eVar.a() != WireFormat.FieldType.ENUM) {
                switch (a.f2472a[eVar.a().ordinal()]) {
                    case 1:
                        objValueOf = Double.valueOf(w0Var.readDouble());
                        break;
                    case 2:
                        objValueOf = Float.valueOf(w0Var.readFloat());
                        break;
                    case 3:
                        objValueOf = Long.valueOf(w0Var.r());
                        break;
                    case 4:
                        objValueOf = Long.valueOf(w0Var.h());
                        break;
                    case 5:
                        objValueOf = Integer.valueOf(w0Var.z());
                        break;
                    case 6:
                        objValueOf = Long.valueOf(w0Var.s());
                        break;
                    case 7:
                        objValueOf = Integer.valueOf(w0Var.C());
                        break;
                    case 8:
                        objValueOf = Boolean.valueOf(w0Var.u());
                        break;
                    case 9:
                        objValueOf = Integer.valueOf(w0Var.c());
                        break;
                    case 10:
                        objValueOf = Integer.valueOf(w0Var.F());
                        break;
                    case 11:
                        objValueOf = Long.valueOf(w0Var.b());
                        break;
                    case 12:
                        objValueOf = Integer.valueOf(w0Var.e());
                        break;
                    case 13:
                        objValueOf = Long.valueOf(w0Var.D());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        objValueOf = w0Var.readBytes();
                        break;
                    case 16:
                        objValueOf = w0Var.E();
                        break;
                    case 17:
                        if (!eVar.d()) {
                            Object objI2 = c0Var.i(eVar.f2466b);
                            if (objI2 instanceof GeneratedMessageLite) {
                                w1 w1VarD = vdi.a().d(objI2);
                                if (!((GeneratedMessageLite) objI2).A()) {
                                    Object objE = w1VarD.e();
                                    w1VarD.a(objE, objI2);
                                    c0Var.y(eVar.f2466b, objE);
                                    objI2 = objE;
                                }
                                w0Var.J(objI2, w1VarD, yVar);
                                return ub;
                            }
                        }
                        objValueOf = w0Var.N(eVar.b().getClass(), yVar);
                        break;
                    case 18:
                        if (!eVar.d()) {
                            Object objI3 = c0Var.i(eVar.f2466b);
                            if (objI3 instanceof GeneratedMessageLite) {
                                w1 w1VarD2 = vdi.a().d(objI3);
                                if (!((GeneratedMessageLite) objI3).A()) {
                                    Object objE2 = w1VarD2.e();
                                    w1VarD2.a(objE2, objI3);
                                    c0Var.y(eVar.f2466b, objE2);
                                    objI3 = objE2;
                                }
                                w0Var.I(objI3, w1VarD2, yVar);
                                return ub;
                            }
                        }
                        objValueOf = w0Var.L(eVar.b().getClass(), yVar);
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                int iZ = w0Var.z();
                if (eVar.f2466b.b().findValueByNumber(iZ) == null) {
                    return (UB) x1.L(obj, iC, iZ, ub, b2Var);
                }
                objValueOf = Integer.valueOf(iZ);
            }
            if (eVar.d()) {
                c0Var.a(eVar.f2466b, objValueOf);
            } else {
                int i = a.f2472a[eVar.a().ordinal()];
                if ((i == 17 || i == 18) && (objI = c0Var.i(eVar.f2466b)) != null) {
                    objValueOf = f0.h(objI, objValueOf);
                }
                c0Var.y(eVar.f2466b, objValueOf);
            }
        }
        return ub;
    }

    @Override // androidx.health.platform.client.proto.z
    public void h(w0 w0Var, Object obj, y yVar, c0<GeneratedMessageLite.d> c0Var) throws IOException {
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj;
        c0Var.y(eVar.f2466b, w0Var.L(eVar.b().getClass(), yVar));
    }

    @Override // androidx.health.platform.client.proto.z
    public void i(ByteString byteString, Object obj, y yVar, c0<GeneratedMessageLite.d> c0Var) throws IOException {
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj;
        o0.a aVarNewBuilderForType = eVar.b().newBuilderForType();
        h hVarNewCodedInput = byteString.newCodedInput();
        aVarNewBuilderForType.P(hVarNewCodedInput, yVar);
        c0Var.y(eVar.f2466b, aVarNewBuilderForType.buildPartial());
        hVarNewCodedInput.a(0);
    }

    @Override // androidx.health.platform.client.proto.z
    public void j(Writer writer, Map.Entry<?, ?> entry) throws IOException {
        GeneratedMessageLite.d dVar = (GeneratedMessageLite.d) entry.getKey();
        if (!dVar.isRepeated()) {
            switch (a.f2472a[dVar.getLiteType().ordinal()]) {
                case 1:
                    writer.z(dVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    writer.F(dVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    writer.C(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    writer.e(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    writer.g(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    writer.m(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    writer.c(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    writer.n(dVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    writer.k(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    writer.o(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    writer.w(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    writer.I(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    writer.j(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    writer.g(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    writer.J(dVar.getNumber(), (ByteString) entry.getValue());
                    break;
                case 16:
                    writer.d(dVar.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    writer.M(dVar.getNumber(), entry.getValue(), vdi.a().c(entry.getValue().getClass()));
                    break;
                case 18:
                    writer.K(dVar.getNumber(), entry.getValue(), vdi.a().c(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f2472a[dVar.getLiteType().ordinal()]) {
            case 1:
                x1.P(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 2:
                x1.T(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 3:
                x1.W(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 4:
                x1.e0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 5:
                x1.V(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 6:
                x1.S(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 7:
                x1.R(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 8:
                x1.N(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 9:
                x1.d0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 10:
                x1.Y(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 11:
                x1.Z(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 12:
                x1.a0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 13:
                x1.b0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 14:
                x1.V(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 15:
                x1.O(dVar.getNumber(), (List) entry.getValue(), writer);
                break;
            case 16:
                x1.c0(dVar.getNumber(), (List) entry.getValue(), writer);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    x1.U(dVar.getNumber(), (List) entry.getValue(), writer, vdi.a().c(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    x1.X(dVar.getNumber(), (List) entry.getValue(), writer, vdi.a().c(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
