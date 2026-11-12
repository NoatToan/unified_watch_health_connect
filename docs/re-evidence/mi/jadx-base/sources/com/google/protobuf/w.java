package com.google.protobuf;

import defpackage.xdi;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class w extends u<GeneratedMessageLite.d> {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9766a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f9766a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9766a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9766a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9766a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9766a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9766a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9766a[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9766a[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9766a[WireFormat.FieldType.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9766a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9766a[WireFormat.FieldType.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9766a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9766a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9766a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9766a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9766a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9766a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f9766a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.google.protobuf.u
    public int a(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.d) entry.getKey()).getNumber();
    }

    @Override // com.google.protobuf.u
    public Object b(t tVar, q0 q0Var, int i) {
        return tVar.b(q0Var, i);
    }

    @Override // com.google.protobuf.u
    public a0<GeneratedMessageLite.d> c(Object obj) {
        return ((GeneratedMessageLite.c) obj).f9544a;
    }

    @Override // com.google.protobuf.u
    public a0<GeneratedMessageLite.d> d(Object obj) {
        return ((GeneratedMessageLite.c) obj).a();
    }

    @Override // com.google.protobuf.u
    public boolean e(q0 q0Var) {
        return q0Var instanceof GeneratedMessageLite.c;
    }

    @Override // com.google.protobuf.u
    public void f(Object obj) {
        c(obj).G();
    }

    @Override // com.google.protobuf.u
    public <UT, UB> UB g(a1 a1Var, Object obj, t tVar, a0<GeneratedMessageLite.d> a0Var, UB ub, q1<UT, UB> q1Var) throws IOException {
        Object objValueOf;
        Object objS;
        ArrayList arrayList;
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj;
        int iE = eVar.e();
        if (eVar.d.isRepeated() && eVar.d.isPacked()) {
            switch (a.f9766a[eVar.c().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    a1Var.q(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    a1Var.n(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    a1Var.w(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    a1Var.v(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    a1Var.j(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    a1Var.A(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    a1Var.k(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    a1Var.f(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    a1Var.B(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    a1Var.t(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    a1Var.i(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    a1Var.g(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    a1Var.a(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    a1Var.x(arrayList);
                    ub = (UB) f1.z(iE, arrayList, eVar.d.b(), ub, q1Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.d.getLiteType());
            }
            a0Var.M(eVar.d, arrayList);
        } else {
            if (eVar.c() != WireFormat.FieldType.ENUM) {
                switch (a.f9766a[eVar.c().ordinal()]) {
                    case 1:
                        objValueOf = Double.valueOf(a1Var.readDouble());
                        break;
                    case 2:
                        objValueOf = Float.valueOf(a1Var.readFloat());
                        break;
                    case 3:
                        objValueOf = Long.valueOf(a1Var.r());
                        break;
                    case 4:
                        objValueOf = Long.valueOf(a1Var.h());
                        break;
                    case 5:
                        objValueOf = Integer.valueOf(a1Var.z());
                        break;
                    case 6:
                        objValueOf = Long.valueOf(a1Var.s());
                        break;
                    case 7:
                        objValueOf = Integer.valueOf(a1Var.C());
                        break;
                    case 8:
                        objValueOf = Boolean.valueOf(a1Var.u());
                        break;
                    case 9:
                        objValueOf = Integer.valueOf(a1Var.c());
                        break;
                    case 10:
                        objValueOf = Integer.valueOf(a1Var.F());
                        break;
                    case 11:
                        objValueOf = Long.valueOf(a1Var.b());
                        break;
                    case 12:
                        objValueOf = Integer.valueOf(a1Var.e());
                        break;
                    case 13:
                        objValueOf = Long.valueOf(a1Var.D());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        objValueOf = a1Var.readBytes();
                        break;
                    case 16:
                        objValueOf = a1Var.E();
                        break;
                    case 17:
                        objValueOf = a1Var.M(eVar.d().getClass(), tVar);
                        break;
                    case 18:
                        objValueOf = a1Var.N(eVar.d().getClass(), tVar);
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                int iZ = a1Var.z();
                if (eVar.d.b().findValueByNumber(iZ) == null) {
                    return (UB) f1.M(iE, iZ, ub, q1Var);
                }
                objValueOf = Integer.valueOf(iZ);
            }
            if (eVar.f()) {
                a0Var.f(eVar.d, objValueOf);
            } else {
                int i = a.f9766a[eVar.c().ordinal()];
                if ((i == 17 || i == 18) && (objS = a0Var.s(eVar.d)) != null) {
                    objValueOf = d0.k(objS, objValueOf);
                }
                a0Var.M(eVar.d, objValueOf);
            }
        }
        return ub;
    }

    @Override // com.google.protobuf.u
    public void h(a1 a1Var, Object obj, t tVar, a0<GeneratedMessageLite.d> a0Var) throws IOException {
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj;
        a0Var.M(eVar.d, a1Var.N(eVar.d().getClass(), tVar));
    }

    @Override // com.google.protobuf.u
    public void i(ByteString byteString, Object obj, t tVar, a0<GeneratedMessageLite.d> a0Var) throws IOException {
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj;
        q0 q0VarBuildPartial = eVar.d().newBuilderForType().buildPartial();
        h hVarP = h.P(ByteBuffer.wrap(byteString.toByteArray()), true);
        xdi.a().b(q0VarBuildPartial, hVarP, tVar);
        a0Var.M(eVar.d, q0VarBuildPartial);
        if (hVarP.l() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    @Override // com.google.protobuf.u
    public void j(Writer writer, Map.Entry<?, ?> entry) throws IOException {
        GeneratedMessageLite.d dVar = (GeneratedMessageLite.d) entry.getKey();
        if (!dVar.isRepeated()) {
            switch (a.f9766a[dVar.getLiteType().ordinal()]) {
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
                    writer.K(dVar.getNumber(), (ByteString) entry.getValue());
                    break;
                case 16:
                    writer.d(dVar.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    writer.O(dVar.getNumber(), entry.getValue(), xdi.a().d(entry.getValue().getClass()));
                    break;
                case 18:
                    writer.Q(dVar.getNumber(), entry.getValue(), xdi.a().d(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f9766a[dVar.getLiteType().ordinal()]) {
            case 1:
                f1.R(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 2:
                f1.V(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 3:
                f1.Z(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 4:
                f1.i0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 5:
                f1.Y(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 6:
                f1.U(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 7:
                f1.T(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 8:
                f1.P(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 9:
                f1.h0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 10:
                f1.c0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 11:
                f1.d0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 12:
                f1.e0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 13:
                f1.f0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 14:
                f1.Y(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                break;
            case 15:
                f1.Q(dVar.getNumber(), (List) entry.getValue(), writer);
                break;
            case 16:
                f1.g0(dVar.getNumber(), (List) entry.getValue(), writer);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    f1.X(dVar.getNumber(), (List) entry.getValue(), writer, xdi.a().d(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    f1.b0(dVar.getNumber(), (List) entry.getValue(), writer, xdi.a().d(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
