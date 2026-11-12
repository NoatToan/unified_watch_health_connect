package com.google.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class MessageReflection {

    public interface MergeTarget {

        public enum ContainerType {
            MESSAGE,
            EXTENSION_SET
        }

        s.b a(s sVar, Descriptors.b bVar, int i);

        MergeTarget addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj);

        WireFormat.b b(Descriptors.FieldDescriptor fieldDescriptor);

        Object c(ByteString byteString, t tVar, Descriptors.FieldDescriptor fieldDescriptor, p0 p0Var) throws IOException;

        Object d(j jVar, t tVar, Descriptors.FieldDescriptor fieldDescriptor, p0 p0Var) throws IOException;

        ContainerType e();

        Object f(j jVar, t tVar, Descriptors.FieldDescriptor fieldDescriptor, p0 p0Var) throws IOException;

        boolean hasField(Descriptors.FieldDescriptor fieldDescriptor);

        MergeTarget setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj);
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9572a;

        static {
            int[] iArr = new int[Descriptors.FieldDescriptor.Type.values().length];
            f9572a = iArr;
            try {
                iArr[Descriptors.FieldDescriptor.Type.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9572a[Descriptors.FieldDescriptor.Type.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9572a[Descriptors.FieldDescriptor.Type.ENUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class b implements MergeTarget {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p0.a f9573a;

        public b(p0.a aVar) {
            this.f9573a = aVar;
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public s.b a(s sVar, Descriptors.b bVar, int i) {
            return sVar.f(bVar, i);
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public MergeTarget addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            this.f9573a.addRepeatedField(fieldDescriptor, obj);
            return this;
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public WireFormat.b b(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.G()) {
                return WireFormat.b.f9597b;
            }
            return (fieldDescriptor.isRepeated() || !(this.f9573a instanceof GeneratedMessage.f)) ? WireFormat.b.f9596a : WireFormat.b.c;
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public Object c(ByteString byteString, t tVar, Descriptors.FieldDescriptor fieldDescriptor, p0 p0Var) throws IOException {
            p0 p0Var2;
            p0.a aVarNewBuilderForType = p0Var != null ? p0Var.newBuilderForType() : this.f9573a.newBuilderForField(fieldDescriptor);
            if (!fieldDescriptor.isRepeated() && (p0Var2 = (p0) g(fieldDescriptor)) != null) {
                aVarNewBuilderForType.mergeFrom(p0Var2);
            }
            aVarNewBuilderForType.mergeFrom(byteString, tVar);
            return aVarNewBuilderForType.buildPartial();
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public Object d(j jVar, t tVar, Descriptors.FieldDescriptor fieldDescriptor, p0 p0Var) throws IOException {
            p0 p0Var2;
            p0.a aVarNewBuilderForType = p0Var != null ? p0Var.newBuilderForType() : this.f9573a.newBuilderForField(fieldDescriptor);
            if (!fieldDescriptor.isRepeated() && (p0Var2 = (p0) g(fieldDescriptor)) != null) {
                aVarNewBuilderForType.mergeFrom(p0Var2);
            }
            jVar.A(aVarNewBuilderForType, tVar);
            return aVarNewBuilderForType.buildPartial();
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public MergeTarget.ContainerType e() {
            return MergeTarget.ContainerType.MESSAGE;
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public Object f(j jVar, t tVar, Descriptors.FieldDescriptor fieldDescriptor, p0 p0Var) throws IOException {
            p0 p0Var2;
            p0.a aVarNewBuilderForType = p0Var != null ? p0Var.newBuilderForType() : this.f9573a.newBuilderForField(fieldDescriptor);
            if (!fieldDescriptor.isRepeated() && (p0Var2 = (p0) g(fieldDescriptor)) != null) {
                aVarNewBuilderForType.mergeFrom(p0Var2);
            }
            jVar.w(fieldDescriptor.getNumber(), aVarNewBuilderForType, tVar);
            return aVarNewBuilderForType.buildPartial();
        }

        public Object g(Descriptors.FieldDescriptor fieldDescriptor) {
            return this.f9573a.getField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            return this.f9573a.hasField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public MergeTarget setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            this.f9573a.setField(fieldDescriptor, obj);
            return this;
        }
    }

    public static class c implements MergeTarget {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a0<Descriptors.FieldDescriptor> f9574a;

        public c(a0<Descriptors.FieldDescriptor> a0Var) {
            this.f9574a = a0Var;
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public s.b a(s sVar, Descriptors.b bVar, int i) {
            return sVar.f(bVar, i);
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public MergeTarget addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            this.f9574a.f(fieldDescriptor, obj);
            return this;
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public WireFormat.b b(Descriptors.FieldDescriptor fieldDescriptor) {
            return fieldDescriptor.G() ? WireFormat.b.f9597b : WireFormat.b.f9596a;
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public Object c(ByteString byteString, t tVar, Descriptors.FieldDescriptor fieldDescriptor, p0 p0Var) throws IOException {
            p0 p0Var2;
            p0.a aVarNewBuilderForType = p0Var.newBuilderForType();
            if (!fieldDescriptor.isRepeated() && (p0Var2 = (p0) g(fieldDescriptor)) != null) {
                aVarNewBuilderForType.mergeFrom(p0Var2);
            }
            aVarNewBuilderForType.mergeFrom(byteString, tVar);
            return aVarNewBuilderForType.buildPartial();
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public Object d(j jVar, t tVar, Descriptors.FieldDescriptor fieldDescriptor, p0 p0Var) throws IOException {
            p0 p0Var2;
            p0.a aVarNewBuilderForType = p0Var.newBuilderForType();
            if (!fieldDescriptor.isRepeated() && (p0Var2 = (p0) g(fieldDescriptor)) != null) {
                aVarNewBuilderForType.mergeFrom(p0Var2);
            }
            jVar.A(aVarNewBuilderForType, tVar);
            return aVarNewBuilderForType.buildPartial();
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public MergeTarget.ContainerType e() {
            return MergeTarget.ContainerType.EXTENSION_SET;
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public Object f(j jVar, t tVar, Descriptors.FieldDescriptor fieldDescriptor, p0 p0Var) throws IOException {
            p0 p0Var2;
            p0.a aVarNewBuilderForType = p0Var.newBuilderForType();
            if (!fieldDescriptor.isRepeated() && (p0Var2 = (p0) g(fieldDescriptor)) != null) {
                aVarNewBuilderForType.mergeFrom(p0Var2);
            }
            jVar.w(fieldDescriptor.getNumber(), aVarNewBuilderForType, tVar);
            return aVarNewBuilderForType.buildPartial();
        }

        public Object g(Descriptors.FieldDescriptor fieldDescriptor) {
            return this.f9574a.s(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            return this.f9574a.z(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageReflection.MergeTarget
        public MergeTarget setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            this.f9574a.M(fieldDescriptor, obj);
            return this;
        }
    }

    public static String a(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static void b(j jVar, s.b bVar, t tVar, MergeTarget mergeTarget) throws IOException {
        Descriptors.FieldDescriptor fieldDescriptor = bVar.f9747a;
        mergeTarget.setField(fieldDescriptor, mergeTarget.d(jVar, tVar, fieldDescriptor, bVar.f9748b));
    }

    public static List<String> c(s0 s0Var) {
        ArrayList arrayList = new ArrayList();
        d(s0Var, "", arrayList);
        return arrayList;
    }

    public static void d(s0 s0Var, String str, List<String> list) {
        for (Descriptors.FieldDescriptor fieldDescriptor : s0Var.getDescriptorForType().o()) {
            if (fieldDescriptor.F() && !s0Var.hasField(fieldDescriptor)) {
                list.add(str + fieldDescriptor.c());
            }
        }
        for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : s0Var.getAllFields().entrySet()) {
            Descriptors.FieldDescriptor key = entry.getKey();
            Object value = entry.getValue();
            if (key.w() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                if (key.isRepeated()) {
                    Iterator it = ((List) value).iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        d((s0) it.next(), j(str, key, i), list);
                        i++;
                    }
                } else if (s0Var.hasField(key)) {
                    d((s0) value, j(str, key, -1), list);
                }
            }
        }
    }

    public static int e(p0 p0Var, Map<Descriptors.FieldDescriptor, Object> map) {
        boolean messageSetWireFormat = p0Var.getDescriptorForType().s().getMessageSetWireFormat();
        int iF = 0;
        for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : map.entrySet()) {
            Descriptors.FieldDescriptor key = entry.getKey();
            Object value = entry.getValue();
            iF += (messageSetWireFormat && key.B() && key.z() == Descriptors.FieldDescriptor.Type.MESSAGE && !key.isRepeated()) ? CodedOutputStream.F(key.getNumber(), (p0) value) : a0.o(key, value);
        }
        r1 unknownFields = p0Var.getUnknownFields();
        return iF + (messageSetWireFormat ? unknownFields.f() : unknownFields.getSerializedSize());
    }

    public static boolean f(s0 s0Var) {
        for (Descriptors.FieldDescriptor fieldDescriptor : s0Var.getDescriptorForType().o()) {
            if (fieldDescriptor.F() && !s0Var.hasField(fieldDescriptor)) {
                return false;
            }
        }
        for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : s0Var.getAllFields().entrySet()) {
            Descriptors.FieldDescriptor key = entry.getKey();
            if (key.w() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                if (key.isRepeated()) {
                    Iterator it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        if (!((p0) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (!((p0) entry.getValue()).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    public static boolean g(j jVar, r1.b bVar, t tVar, Descriptors.b bVar2, MergeTarget mergeTarget, int i) throws IOException {
        p0 p0Var;
        boolean z;
        Object objF;
        s.b bVarA;
        if (bVar2.s().getMessageSetWireFormat() && i == WireFormat.f9593a) {
            i(jVar, bVar, tVar, bVar2, mergeTarget);
            return true;
        }
        int iB = WireFormat.b(i);
        int iA = WireFormat.a(i);
        Descriptors.FieldDescriptor fieldDescriptorL = null;
        if (bVar2.w(iA)) {
            if (!(tVar instanceof s) || (bVarA = mergeTarget.a((s) tVar, bVar2, iA)) == null) {
                p0Var = null;
            } else {
                fieldDescriptorL = bVarA.f9747a;
                p0Var = bVarA.f9748b;
                if (p0Var == null && fieldDescriptorL.w() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                    throw new IllegalStateException("Message-typed extension lacked default instance: " + fieldDescriptorL.b());
                }
            }
        } else if (mergeTarget.e() == MergeTarget.ContainerType.MESSAGE) {
            fieldDescriptorL = bVar2.l(iA);
            p0Var = null;
        } else {
            p0Var = null;
        }
        boolean z2 = false;
        if (fieldDescriptorL == null) {
            z = false;
            z2 = true;
        } else if (iB == a0.y(fieldDescriptorL.getLiteType(), false)) {
            z = false;
        } else if (fieldDescriptorL.E() && iB == a0.y(fieldDescriptorL.getLiteType(), true)) {
            z = true;
        } else {
            z = false;
            z2 = true;
        }
        if (z2) {
            return bVar != null ? bVar.j(i, jVar) : jVar.N(i);
        }
        if (z) {
            int iO = jVar.o(jVar.B());
            if (fieldDescriptorL.getLiteType() == WireFormat.FieldType.ENUM) {
                while (jVar.d() > 0) {
                    int iS = jVar.s();
                    if (fieldDescriptorL.a().y()) {
                        mergeTarget.addRepeatedField(fieldDescriptorL, fieldDescriptorL.r().k(iS));
                    } else {
                        Descriptors.e eVarFindValueByNumber = fieldDescriptorL.r().findValueByNumber(iS);
                        if (eVarFindValueByNumber != null) {
                            mergeTarget.addRepeatedField(fieldDescriptorL, eVarFindValueByNumber);
                        } else if (bVar != null) {
                            bVar.s(iA, iS);
                        }
                    }
                }
            } else {
                while (jVar.d() > 0) {
                    mergeTarget.addRepeatedField(fieldDescriptorL, WireFormat.d(jVar, fieldDescriptorL.getLiteType(), mergeTarget.b(fieldDescriptorL)));
                }
            }
            jVar.n(iO);
        } else {
            int i2 = a.f9572a[fieldDescriptorL.z().ordinal()];
            if (i2 == 1) {
                objF = mergeTarget.f(jVar, tVar, fieldDescriptorL, p0Var);
            } else if (i2 == 2) {
                objF = mergeTarget.d(jVar, tVar, fieldDescriptorL, p0Var);
            } else if (i2 != 3) {
                objF = WireFormat.d(jVar, fieldDescriptorL.getLiteType(), mergeTarget.b(fieldDescriptorL));
            } else {
                int iS2 = jVar.s();
                if (fieldDescriptorL.a().y()) {
                    objF = fieldDescriptorL.r().k(iS2);
                } else {
                    Descriptors.e eVarFindValueByNumber2 = fieldDescriptorL.r().findValueByNumber(iS2);
                    if (eVarFindValueByNumber2 == null) {
                        if (bVar != null) {
                            bVar.s(iA, iS2);
                        }
                        return true;
                    }
                    objF = eVarFindValueByNumber2;
                }
            }
            if (fieldDescriptorL.isRepeated()) {
                mergeTarget.addRepeatedField(fieldDescriptorL, objF);
            } else {
                mergeTarget.setField(fieldDescriptorL, objF);
            }
        }
        return true;
    }

    public static void h(ByteString byteString, s.b bVar, t tVar, MergeTarget mergeTarget) throws IOException {
        Descriptors.FieldDescriptor fieldDescriptor = bVar.f9747a;
        if (mergeTarget.hasField(fieldDescriptor) || t.d()) {
            mergeTarget.setField(fieldDescriptor, mergeTarget.c(byteString, tVar, fieldDescriptor, bVar.f9748b));
        } else {
            mergeTarget.setField(fieldDescriptor, new e0(bVar.f9748b, tVar, byteString));
        }
    }

    public static void i(j jVar, r1.b bVar, t tVar, Descriptors.b bVar2, MergeTarget mergeTarget) throws IOException {
        int iK = 0;
        ByteString byteStringQ = null;
        s.b bVarA = null;
        while (true) {
            int iJ = jVar.J();
            if (iJ == 0) {
                break;
            }
            if (iJ == WireFormat.c) {
                iK = jVar.K();
                if (iK != 0 && (tVar instanceof s)) {
                    bVarA = mergeTarget.a((s) tVar, bVar2, iK);
                }
            } else if (iJ == WireFormat.d) {
                if (iK == 0 || bVarA == null || !t.d()) {
                    byteStringQ = jVar.q();
                } else {
                    b(jVar, bVarA, tVar, mergeTarget);
                    byteStringQ = null;
                }
            } else if (!jVar.N(iJ)) {
                break;
            }
        }
        jVar.a(WireFormat.f9594b);
        if (byteStringQ == null || iK == 0) {
            return;
        }
        if (bVarA != null) {
            h(byteStringQ, bVarA, tVar, mergeTarget);
        } else if (bVar != null) {
            bVar.i(iK, r1.c.t().e(byteStringQ).g());
        }
    }

    public static String j(String str, Descriptors.FieldDescriptor fieldDescriptor, int i) {
        StringBuilder sb = new StringBuilder(str);
        if (fieldDescriptor.B()) {
            sb.append('(');
            sb.append(fieldDescriptor.b());
            sb.append(')');
        } else {
            sb.append(fieldDescriptor.c());
        }
        if (i != -1) {
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb.append(i);
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        sb.append('.');
        return sb.toString();
    }

    public static void k(p0 p0Var, Map<Descriptors.FieldDescriptor, Object> map, CodedOutputStream codedOutputStream, boolean z) throws IOException {
        boolean messageSetWireFormat = p0Var.getDescriptorForType().s().getMessageSetWireFormat();
        if (z) {
            TreeMap treeMap = new TreeMap(map);
            for (Descriptors.FieldDescriptor fieldDescriptor : p0Var.getDescriptorForType().o()) {
                if (fieldDescriptor.F() && !treeMap.containsKey(fieldDescriptor)) {
                    treeMap.put(fieldDescriptor, p0Var.getField(fieldDescriptor));
                }
            }
            map = treeMap;
        }
        for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : map.entrySet()) {
            Descriptors.FieldDescriptor key = entry.getKey();
            Object value = entry.getValue();
            if (messageSetWireFormat && key.B() && key.z() == Descriptors.FieldDescriptor.Type.MESSAGE && !key.isRepeated()) {
                codedOutputStream.N0(key.getNumber(), (p0) value);
            } else {
                a0.Q(key, value, codedOutputStream);
            }
        }
        r1 unknownFields = p0Var.getUnknownFields();
        if (messageSetWireFormat) {
            unknownFields.l(codedOutputStream);
        } else {
            unknownFields.writeTo(codedOutputStream);
        }
    }
}
