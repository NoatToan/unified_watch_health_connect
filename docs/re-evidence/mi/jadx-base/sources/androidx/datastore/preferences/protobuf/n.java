package androidx.datastore.preferences.protobuf;

import defpackage.ydi;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n extends m<GeneratedMessageLite.d> {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2242a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f2242a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2242a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2242a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2242a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2242a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2242a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2242a[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2242a[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2242a[WireFormat.FieldType.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2242a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2242a[WireFormat.FieldType.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2242a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2242a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2242a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2242a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2242a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2242a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f2242a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public int a(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.d) entry.getKey()).getNumber();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public Object b(l lVar, b0 b0Var, int i) {
        return lVar.a(b0Var, i);
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public p<GeneratedMessageLite.d> c(Object obj) {
        return ((GeneratedMessageLite.c) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public p<GeneratedMessageLite.d> d(Object obj) {
        return ((GeneratedMessageLite.c) obj).C();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public boolean e(b0 b0Var) {
        return b0Var instanceof GeneratedMessageLite.c;
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public void f(Object obj) {
        c(obj).t();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public <UT, UB> UB g(i0 i0Var, Object obj, l lVar, p<GeneratedMessageLite.d> pVar, UB ub, n0<UT, UB> n0Var) throws IOException {
        Object objValueOf;
        Object objI;
        ArrayList arrayList;
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj;
        int iC = eVar.c();
        if (eVar.f2179b.isRepeated() && eVar.f2179b.isPacked()) {
            switch (a.f2242a[eVar.a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    i0Var.q(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    i0Var.n(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    i0Var.w(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    i0Var.v(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    i0Var.j(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    i0Var.A(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    i0Var.k(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    i0Var.f(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    i0Var.B(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    i0Var.t(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    i0Var.i(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    i0Var.g(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    i0Var.a(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    i0Var.x(arrayList);
                    ub = (UB) l0.z(iC, arrayList, eVar.f2179b.b(), ub, n0Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f2179b.getLiteType());
            }
            pVar.x(eVar.f2179b, arrayList);
        } else {
            if (eVar.a() != WireFormat.FieldType.ENUM) {
                switch (a.f2242a[eVar.a().ordinal()]) {
                    case 1:
                        objValueOf = Double.valueOf(i0Var.readDouble());
                        break;
                    case 2:
                        objValueOf = Float.valueOf(i0Var.readFloat());
                        break;
                    case 3:
                        objValueOf = Long.valueOf(i0Var.r());
                        break;
                    case 4:
                        objValueOf = Long.valueOf(i0Var.h());
                        break;
                    case 5:
                        objValueOf = Integer.valueOf(i0Var.z());
                        break;
                    case 6:
                        objValueOf = Long.valueOf(i0Var.s());
                        break;
                    case 7:
                        objValueOf = Integer.valueOf(i0Var.C());
                        break;
                    case 8:
                        objValueOf = Boolean.valueOf(i0Var.u());
                        break;
                    case 9:
                        objValueOf = Integer.valueOf(i0Var.c());
                        break;
                    case 10:
                        objValueOf = Integer.valueOf(i0Var.F());
                        break;
                    case 11:
                        objValueOf = Long.valueOf(i0Var.b());
                        break;
                    case 12:
                        objValueOf = Integer.valueOf(i0Var.e());
                        break;
                    case 13:
                        objValueOf = Long.valueOf(i0Var.D());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        objValueOf = i0Var.readBytes();
                        break;
                    case 16:
                        objValueOf = i0Var.E();
                        break;
                    case 17:
                        objValueOf = i0Var.L(eVar.b().getClass(), lVar);
                        break;
                    case 18:
                        objValueOf = i0Var.I(eVar.b().getClass(), lVar);
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                int iZ = i0Var.z();
                if (eVar.f2179b.b().findValueByNumber(iZ) == null) {
                    return (UB) l0.L(iC, iZ, ub, n0Var);
                }
                objValueOf = Integer.valueOf(iZ);
            }
            if (eVar.d()) {
                pVar.a(eVar.f2179b, objValueOf);
            } else {
                int i = a.f2242a[eVar.a().ordinal()];
                if ((i == 17 || i == 18) && (objI = pVar.i(eVar.f2179b)) != null) {
                    objValueOf = s.h(objI, objValueOf);
                }
                pVar.x(eVar.f2179b, objValueOf);
            }
        }
        return ub;
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public void h(i0 i0Var, Object obj, l lVar, p<GeneratedMessageLite.d> pVar) throws IOException {
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj;
        pVar.x(eVar.f2179b, i0Var.I(eVar.b().getClass(), lVar));
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public void i(ByteString byteString, Object obj, l lVar, p<GeneratedMessageLite.d> pVar) throws IOException {
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj;
        b0 b0VarBuildPartial = eVar.b().newBuilderForType().buildPartial();
        e eVarO = e.O(ByteBuffer.wrap(byteString.toByteArray()), true);
        ydi.a().b(b0VarBuildPartial, eVarO, lVar);
        pVar.x(eVar.f2179b, b0VarBuildPartial);
        if (eVarO.l() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public void j(Writer writer, Map.Entry<?, ?> entry) throws IOException {
        GeneratedMessageLite.d dVar = (GeneratedMessageLite.d) entry.getKey();
        if (!dVar.isRepeated()) {
            switch (a.f2242a[dVar.getLiteType().ordinal()]) {
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
                    writer.N(dVar.getNumber(), entry.getValue(), ydi.a().d(entry.getValue().getClass()));
                    break;
                case 18:
                    writer.K(dVar.getNumber(), entry.getValue(), ydi.a().d(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f2242a[dVar.getLiteType().ordinal()]) {
            case 1:
                l0.P(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 2:
                l0.T(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 3:
                l0.W(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 4:
                l0.e0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 5:
                l0.V(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 6:
                l0.S(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 7:
                l0.R(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 8:
                l0.N(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 9:
                l0.d0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 10:
                l0.Y(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 11:
                l0.Z(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 12:
                l0.a0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 13:
                l0.b0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 14:
                l0.V(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 15:
                l0.O(dVar.getNumber(), (List) entry.getValue(), writer);
                break;
            case 16:
                l0.c0(dVar.getNumber(), (List) entry.getValue(), writer);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    l0.U(dVar.getNumber(), (List) entry.getValue(), writer, ydi.a().d(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    l0.X(dVar.getNumber(), (List) entry.getValue(), writer, ydi.a().d(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
