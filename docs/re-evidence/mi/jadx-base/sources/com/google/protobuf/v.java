package com.google.protobuf;

import defpackage.jbq;
import defpackage.xdi;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class v extends u<Descriptors.FieldDescriptor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f9762a = k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f9763b = 0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9764a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f9764a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9764a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9764a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9764a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9764a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9764a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9764a[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9764a[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9764a[WireFormat.FieldType.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9764a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9764a[WireFormat.FieldType.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9764a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9764a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9764a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9764a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9764a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9764a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f9764a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public static <T> long k() {
        try {
            return jbq.M(GeneratedMessageV3.ExtendableMessage.class.getDeclaredField("extensions"));
        } catch (Throwable unused) {
            throw new IllegalStateException("Unable to lookup extension field offset");
        }
    }

    @Override // com.google.protobuf.u
    public int a(Map.Entry<?, ?> entry) {
        return ((Descriptors.FieldDescriptor) entry.getKey()).getNumber();
    }

    @Override // com.google.protobuf.u
    public Object b(t tVar, q0 q0Var, int i) {
        return ((s) tVar).e(((p0) q0Var).getDescriptorForType(), i);
    }

    @Override // com.google.protobuf.u
    public a0<Descriptors.FieldDescriptor> c(Object obj) {
        return (a0) jbq.G(obj, f9762a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.u
    public a0<Descriptors.FieldDescriptor> d(Object obj) {
        a0<Descriptors.FieldDescriptor> a0VarC = c(obj);
        if (!a0VarC.B()) {
            return a0VarC;
        }
        a0 a0VarClone = a0VarC.clone();
        l(obj, a0VarClone);
        return a0VarClone;
    }

    @Override // com.google.protobuf.u
    public boolean e(q0 q0Var) {
        return q0Var instanceof GeneratedMessageV3.ExtendableMessage;
    }

    @Override // com.google.protobuf.u
    public void f(Object obj) {
        c(obj).G();
    }

    @Override // com.google.protobuf.u
    public <UT, UB> UB g(a1 a1Var, Object obj, t tVar, a0<Descriptors.FieldDescriptor> a0Var, UB ub, q1<UT, UB> q1Var) throws IOException {
        Object objValueOf;
        Object objS;
        ArrayList arrayList;
        ArrayList arrayList2;
        s.b bVar = (s.b) obj;
        int number = bVar.f9747a.getNumber();
        if (bVar.f9747a.isRepeated() && bVar.f9747a.isPacked()) {
            switch (a.f9764a[bVar.f9747a.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    a1Var.q(arrayList);
                    arrayList2 = arrayList;
                    a0Var.M(bVar.f9747a, arrayList2);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    a1Var.n(arrayList);
                    arrayList2 = arrayList;
                    a0Var.M(bVar.f9747a, arrayList2);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    a1Var.w(arrayList);
                    arrayList2 = arrayList;
                    a0Var.M(bVar.f9747a, arrayList2);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    a1Var.v(arrayList);
                    arrayList2 = arrayList;
                    a0Var.M(bVar.f9747a, arrayList2);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    a1Var.j(arrayList);
                    arrayList2 = arrayList;
                    a0Var.M(bVar.f9747a, arrayList2);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    a1Var.A(arrayList);
                    arrayList2 = arrayList;
                    a0Var.M(bVar.f9747a, arrayList2);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    a1Var.k(arrayList);
                    arrayList2 = arrayList;
                    a0Var.M(bVar.f9747a, arrayList2);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    a1Var.f(arrayList);
                    arrayList2 = arrayList;
                    a0Var.M(bVar.f9747a, arrayList2);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    a1Var.B(arrayList);
                    arrayList2 = arrayList;
                    a0Var.M(bVar.f9747a, arrayList2);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    a1Var.t(arrayList);
                    arrayList2 = arrayList;
                    a0Var.M(bVar.f9747a, arrayList2);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    a1Var.i(arrayList);
                    arrayList2 = arrayList;
                    a0Var.M(bVar.f9747a, arrayList2);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    a1Var.g(arrayList);
                    arrayList2 = arrayList;
                    a0Var.M(bVar.f9747a, arrayList2);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    a1Var.a(arrayList);
                    arrayList2 = arrayList;
                    a0Var.M(bVar.f9747a, arrayList2);
                    break;
                case 14:
                    ArrayList arrayList3 = new ArrayList();
                    a1Var.x(arrayList3);
                    arrayList2 = new ArrayList();
                    Iterator<Integer> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        int iIntValue = it.next().intValue();
                        Descriptors.e eVarFindValueByNumber = bVar.f9747a.r().findValueByNumber(iIntValue);
                        if (eVarFindValueByNumber != null) {
                            arrayList2.add(eVarFindValueByNumber);
                        } else {
                            ub = (UB) f1.M(number, iIntValue, ub, q1Var);
                        }
                    }
                    a0Var.M(bVar.f9747a, arrayList2);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + bVar.f9747a.getLiteType());
            }
        } else {
            if (bVar.f9747a.getLiteType() != WireFormat.FieldType.ENUM) {
                switch (a.f9764a[bVar.f9747a.getLiteType().ordinal()]) {
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
                        objValueOf = a1Var.M(bVar.f9748b.getClass(), tVar);
                        break;
                    case 18:
                        objValueOf = a1Var.N(bVar.f9748b.getClass(), tVar);
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                int iZ = a1Var.z();
                objValueOf = bVar.f9747a.r().findValueByNumber(iZ);
                if (objValueOf == null) {
                    return (UB) f1.M(number, iZ, ub, q1Var);
                }
            }
            if (bVar.f9747a.isRepeated()) {
                a0Var.f(bVar.f9747a, objValueOf);
            } else {
                int i = a.f9764a[bVar.f9747a.getLiteType().ordinal()];
                if ((i == 17 || i == 18) && (objS = a0Var.s(bVar.f9747a)) != null) {
                    objValueOf = d0.k(objS, objValueOf);
                }
                a0Var.M(bVar.f9747a, objValueOf);
            }
        }
        return ub;
    }

    @Override // com.google.protobuf.u
    public void h(a1 a1Var, Object obj, t tVar, a0<Descriptors.FieldDescriptor> a0Var) throws IOException {
        s.b bVar = (s.b) obj;
        if (!t.d()) {
            a0Var.M(bVar.f9747a, new e0(bVar.f9748b, tVar, a1Var.readBytes()));
        } else {
            a0Var.M(bVar.f9747a, a1Var.N(bVar.f9748b.getClass(), tVar));
        }
    }

    @Override // com.google.protobuf.u
    public void i(ByteString byteString, Object obj, t tVar, a0<Descriptors.FieldDescriptor> a0Var) throws IOException {
        s.b bVar = (s.b) obj;
        p0 p0VarBuildPartial = bVar.f9748b.newBuilderForType().buildPartial();
        if (!t.d()) {
            a0Var.M(bVar.f9747a, new e0(bVar.f9748b, tVar, byteString));
            return;
        }
        h hVarP = h.P(ByteBuffer.wrap(byteString.toByteArray()), true);
        xdi.a().b(p0VarBuildPartial, hVarP, tVar);
        a0Var.M(bVar.f9747a, p0VarBuildPartial);
        if (hVarP.l() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    @Override // com.google.protobuf.u
    public void j(Writer writer, Map.Entry<?, ?> entry) throws IOException {
        Descriptors.FieldDescriptor fieldDescriptor = (Descriptors.FieldDescriptor) entry.getKey();
        if (!fieldDescriptor.isRepeated()) {
            switch (a.f9764a[fieldDescriptor.getLiteType().ordinal()]) {
                case 1:
                    writer.z(fieldDescriptor.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    writer.F(fieldDescriptor.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    writer.C(fieldDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    writer.e(fieldDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    writer.g(fieldDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    writer.m(fieldDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    writer.c(fieldDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    writer.n(fieldDescriptor.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    writer.k(fieldDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    writer.o(fieldDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    writer.w(fieldDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    writer.I(fieldDescriptor.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    writer.j(fieldDescriptor.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    writer.g(fieldDescriptor.getNumber(), ((Descriptors.e) entry.getValue()).getNumber());
                    break;
                case 15:
                    writer.K(fieldDescriptor.getNumber(), (ByteString) entry.getValue());
                    break;
                case 16:
                    writer.d(fieldDescriptor.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    writer.S(fieldDescriptor.getNumber(), entry.getValue());
                    break;
                case 18:
                    writer.R(fieldDescriptor.getNumber(), entry.getValue());
                    break;
            }
        }
        switch (a.f9764a[fieldDescriptor.getLiteType().ordinal()]) {
            case 1:
                f1.R(fieldDescriptor.getNumber(), (List) entry.getValue(), writer, fieldDescriptor.isPacked());
                break;
            case 2:
                f1.V(fieldDescriptor.getNumber(), (List) entry.getValue(), writer, fieldDescriptor.isPacked());
                break;
            case 3:
                f1.Z(fieldDescriptor.getNumber(), (List) entry.getValue(), writer, fieldDescriptor.isPacked());
                break;
            case 4:
                f1.i0(fieldDescriptor.getNumber(), (List) entry.getValue(), writer, fieldDescriptor.isPacked());
                break;
            case 5:
                f1.Y(fieldDescriptor.getNumber(), (List) entry.getValue(), writer, fieldDescriptor.isPacked());
                break;
            case 6:
                f1.U(fieldDescriptor.getNumber(), (List) entry.getValue(), writer, fieldDescriptor.isPacked());
                break;
            case 7:
                f1.T(fieldDescriptor.getNumber(), (List) entry.getValue(), writer, fieldDescriptor.isPacked());
                break;
            case 8:
                f1.P(fieldDescriptor.getNumber(), (List) entry.getValue(), writer, fieldDescriptor.isPacked());
                break;
            case 9:
                f1.h0(fieldDescriptor.getNumber(), (List) entry.getValue(), writer, fieldDescriptor.isPacked());
                break;
            case 10:
                f1.c0(fieldDescriptor.getNumber(), (List) entry.getValue(), writer, fieldDescriptor.isPacked());
                break;
            case 11:
                f1.d0(fieldDescriptor.getNumber(), (List) entry.getValue(), writer, fieldDescriptor.isPacked());
                break;
            case 12:
                f1.e0(fieldDescriptor.getNumber(), (List) entry.getValue(), writer, fieldDescriptor.isPacked());
                break;
            case 13:
                f1.f0(fieldDescriptor.getNumber(), (List) entry.getValue(), writer, fieldDescriptor.isPacked());
                break;
            case 14:
                List list = (List) entry.getValue();
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((Descriptors.e) it.next()).getNumber()));
                }
                f1.Y(fieldDescriptor.getNumber(), arrayList, writer, fieldDescriptor.isPacked());
                break;
            case 15:
                f1.Q(fieldDescriptor.getNumber(), (List) entry.getValue(), writer);
                break;
            case 16:
                f1.g0(fieldDescriptor.getNumber(), (List) entry.getValue(), writer);
                break;
            case 17:
                f1.W(fieldDescriptor.getNumber(), (List) entry.getValue(), writer);
                break;
            case 18:
                f1.a0(fieldDescriptor.getNumber(), (List) entry.getValue(), writer);
                break;
        }
    }

    public void l(Object obj, a0<Descriptors.FieldDescriptor> a0Var) {
        jbq.X(obj, f9762a, a0Var);
    }
}
