package com.google.protobuf;

import defpackage.vkh;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends com.google.protobuf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Descriptors.b f9728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0<Descriptors.FieldDescriptor> f9729b;
    public final Descriptors.FieldDescriptor[] c;
    public final r1 d;
    public int e = -1;

    public class a extends c<p> {
        public a() {
        }

        @Override // defpackage.vkh
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p parsePartialFrom(j jVar, t tVar) throws InvalidProtocolBufferException {
            b bVarH = p.h(p.this.f9728a);
            try {
                bVarH.mergeFrom(jVar, tVar);
                return bVarH.buildPartial();
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(bVarH.buildPartial());
            } catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(bVarH.buildPartial());
            }
        }
    }

    public static final class b extends com.google.protobuf.a.AbstractC0258a<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Descriptors.b f9731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a0<Descriptors.FieldDescriptor> f9732b;
        public final Descriptors.FieldDescriptor[] c;
        public r1 d;

        public /* synthetic */ b(Descriptors.b bVar, a aVar) {
            this(bVar);
        }

        @Override // com.google.protobuf.p0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            s(fieldDescriptor);
            i();
            this.f9732b.f(fieldDescriptor, obj);
            return this;
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p build() {
            if (isInitialized()) {
                return buildPartial();
            }
            Descriptors.b bVar = this.f9731a;
            a0<Descriptors.FieldDescriptor> a0Var = this.f9732b;
            Descriptors.FieldDescriptor[] fieldDescriptorArr = this.c;
            throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) new p(bVar, a0Var, (Descriptors.FieldDescriptor[]) Arrays.copyOf(fieldDescriptorArr, fieldDescriptorArr.length), this.d));
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public p buildPartial() {
            if (this.f9731a.s().getMapEntry()) {
                for (Descriptors.FieldDescriptor fieldDescriptor : this.f9731a.o()) {
                    if (fieldDescriptor.D() && !this.f9732b.z(fieldDescriptor)) {
                        if (fieldDescriptor.w() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                            this.f9732b.M(fieldDescriptor, p.e(fieldDescriptor.x()));
                        } else {
                            this.f9732b.M(fieldDescriptor, fieldDescriptor.p());
                        }
                    }
                }
            }
            this.f9732b.G();
            Descriptors.b bVar = this.f9731a;
            a0<Descriptors.FieldDescriptor> a0Var = this.f9732b;
            Descriptors.FieldDescriptor[] fieldDescriptorArr = this.c;
            return new p(bVar, a0Var, (Descriptors.FieldDescriptor[]) Arrays.copyOf(fieldDescriptorArr, fieldDescriptorArr.length), this.d);
        }

        @Override // com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b mo142clear() {
            if (this.f9732b.B()) {
                this.f9732b = a0.K();
            } else {
                this.f9732b.g();
            }
            this.d = r1.c();
            return this;
        }

        @Override // com.google.protobuf.p0.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            s(fieldDescriptor);
            i();
            Descriptors.h hVarN = fieldDescriptor.n();
            if (hVarN != null) {
                int iP = hVarN.p();
                Descriptors.FieldDescriptor[] fieldDescriptorArr = this.c;
                if (fieldDescriptorArr[iP] == fieldDescriptor) {
                    fieldDescriptorArr[iP] = null;
                }
            }
            this.f9732b.h(fieldDescriptor);
            return this;
        }

        @Override // com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public b clearOneof(Descriptors.h hVar) {
            t(hVar);
            Descriptors.FieldDescriptor fieldDescriptor = this.c[hVar.p()];
            if (fieldDescriptor != null) {
                clearField(fieldDescriptor);
            }
            return this;
        }

        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b mo144clone() {
            b bVar = new b(this.f9731a);
            bVar.f9732b.H(this.f9732b);
            bVar.mo145mergeUnknownFields(this.d);
            Descriptors.FieldDescriptor[] fieldDescriptorArr = this.c;
            System.arraycopy(fieldDescriptorArr, 0, bVar.c, 0, fieldDescriptorArr.length);
            return bVar;
        }

        @Override // com.google.protobuf.s0
        public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
            return this.f9732b.r();
        }

        @Override // com.google.protobuf.p0.a, com.google.protobuf.s0
        public Descriptors.b getDescriptorForType() {
            return this.f9731a;
        }

        @Override // com.google.protobuf.s0
        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            s(fieldDescriptor);
            Object objS = this.f9732b.s(fieldDescriptor);
            if (objS != null) {
                return objS;
            }
            if (fieldDescriptor.isRepeated()) {
                return Collections.emptyList();
            }
            return fieldDescriptor.w() == Descriptors.FieldDescriptor.JavaType.MESSAGE ? p.e(fieldDescriptor.x()) : fieldDescriptor.p();
        }

        @Override // com.google.protobuf.a.AbstractC0258a
        public p0.a getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor) {
            throw new UnsupportedOperationException("getFieldBuilder() called on a dynamic message type.");
        }

        @Override // com.google.protobuf.a.AbstractC0258a
        public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.h hVar) {
            t(hVar);
            return this.c[hVar.p()];
        }

        @Override // com.google.protobuf.a.AbstractC0258a
        public p0.a getRepeatedFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor, int i) {
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a dynamic message type.");
        }

        @Override // com.google.protobuf.s0
        public r1 getUnknownFields() {
            return this.d;
        }

        public final void h(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            if (!fieldDescriptor.isRepeated()) {
                j(fieldDescriptor, obj);
                return;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                j(fieldDescriptor, it.next());
            }
        }

        @Override // com.google.protobuf.s0
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            s(fieldDescriptor);
            return this.f9732b.z(fieldDescriptor);
        }

        @Override // com.google.protobuf.a.AbstractC0258a
        public boolean hasOneof(Descriptors.h hVar) {
            t(hVar);
            return this.c[hVar.p()] != null;
        }

        public final void i() {
            if (this.f9732b.B()) {
                this.f9732b = this.f9732b.clone();
            }
        }

        @Override // defpackage.bsf
        public boolean isInitialized() {
            return p.g(this.f9731a, this.f9732b);
        }

        public final void j(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            d0.a(obj);
            if (!(obj instanceof Descriptors.e)) {
                throw new IllegalArgumentException("DynamicMessage should use EnumValueDescriptor to set Enum Value.");
            }
        }

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public p getDefaultInstanceForType() {
            return p.e(this.f9731a);
        }

        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(p0 p0Var) {
            if (!(p0Var instanceof p)) {
                return (b) super.mergeFrom(p0Var);
            }
            p pVar = (p) p0Var;
            if (pVar.f9728a != this.f9731a) {
                throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
            }
            i();
            this.f9732b.H(pVar.f9729b);
            mo145mergeUnknownFields(pVar.d);
            int i = 0;
            while (true) {
                Descriptors.FieldDescriptor[] fieldDescriptorArr = this.c;
                if (i >= fieldDescriptorArr.length) {
                    return this;
                }
                if (fieldDescriptorArr[i] == null) {
                    fieldDescriptorArr[i] = pVar.c[i];
                } else if (pVar.c[i] != null && this.c[i] != pVar.c[i]) {
                    this.f9732b.h(this.c[i]);
                    this.c[i] = pVar.c[i];
                }
                i++;
            }
        }

        @Override // com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b mo145mergeUnknownFields(r1 r1Var) {
            this.d = r1.h(this.d).q(r1Var).build();
            return this;
        }

        @Override // com.google.protobuf.p0.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public b newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
            s(fieldDescriptor);
            if (fieldDescriptor.w() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                return new b(fieldDescriptor.x());
            }
            throw new IllegalArgumentException("newBuilderForField is only valid for fields with message type.");
        }

        @Override // com.google.protobuf.p0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            s(fieldDescriptor);
            i();
            if (fieldDescriptor.z() == Descriptors.FieldDescriptor.Type.ENUM) {
                h(fieldDescriptor, obj);
            }
            Descriptors.h hVarN = fieldDescriptor.n();
            if (hVarN != null) {
                int iP = hVarN.p();
                Descriptors.FieldDescriptor fieldDescriptor2 = this.c[iP];
                if (fieldDescriptor2 != null && fieldDescriptor2 != fieldDescriptor) {
                    this.f9732b.h(fieldDescriptor2);
                }
                this.c[iP] = fieldDescriptor;
            } else if (fieldDescriptor.a().r() == Descriptors.FileDescriptor.Syntax.PROTO3 && !fieldDescriptor.isRepeated() && fieldDescriptor.w() != Descriptors.FieldDescriptor.JavaType.MESSAGE && obj.equals(fieldDescriptor.p())) {
                this.f9732b.h(fieldDescriptor);
                return this;
            }
            this.f9732b.M(fieldDescriptor, obj);
            return this;
        }

        @Override // com.google.protobuf.p0.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b setUnknownFields(r1 r1Var) {
            this.d = r1Var;
            return this;
        }

        public final void s(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.o() != this.f9731a) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }

        public final void t(Descriptors.h hVar) {
            if (hVar.m() != this.f9731a) {
                throw new IllegalArgumentException("OneofDescriptor does not match message type.");
            }
        }

        public b(Descriptors.b bVar) {
            this.f9731a = bVar;
            this.f9732b = a0.K();
            this.d = r1.c();
            this.c = new Descriptors.FieldDescriptor[bVar.d().getOneofDeclCount()];
        }
    }

    public p(Descriptors.b bVar, a0<Descriptors.FieldDescriptor> a0Var, Descriptors.FieldDescriptor[] fieldDescriptorArr, r1 r1Var) {
        this.f9728a = bVar;
        this.f9729b = a0Var;
        this.c = fieldDescriptorArr;
        this.d = r1Var;
    }

    public static p e(Descriptors.b bVar) {
        return new p(bVar, a0.q(), new Descriptors.FieldDescriptor[bVar.d().getOneofDeclCount()], r1.c());
    }

    public static boolean g(Descriptors.b bVar, a0<Descriptors.FieldDescriptor> a0Var) {
        for (Descriptors.FieldDescriptor fieldDescriptor : bVar.o()) {
            if (fieldDescriptor.F() && !a0Var.z(fieldDescriptor)) {
                return false;
            }
        }
        return a0Var.C();
    }

    public static b h(Descriptors.b bVar) {
        return new b(bVar, null);
    }

    private void k(Descriptors.h hVar) {
        if (hVar.m() != this.f9728a) {
            throw new IllegalArgumentException("OneofDescriptor does not match message type.");
        }
    }

    private void verifyContainingType(Descriptors.FieldDescriptor fieldDescriptor) {
        if (fieldDescriptor.o() != this.f9728a) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }

    @Override // defpackage.bsf, com.google.protobuf.s0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public p getDefaultInstanceForType() {
        return e(this.f9728a);
    }

    @Override // com.google.protobuf.s0
    public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
        return this.f9729b.r();
    }

    @Override // com.google.protobuf.s0
    public Descriptors.b getDescriptorForType() {
        return this.f9728a;
    }

    @Override // com.google.protobuf.s0
    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        verifyContainingType(fieldDescriptor);
        Object objS = this.f9729b.s(fieldDescriptor);
        if (objS != null) {
            return objS;
        }
        if (fieldDescriptor.isRepeated()) {
            return Collections.emptyList();
        }
        return fieldDescriptor.w() == Descriptors.FieldDescriptor.JavaType.MESSAGE ? e(fieldDescriptor.x()) : fieldDescriptor.p();
    }

    @Override // com.google.protobuf.a
    public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.h hVar) {
        k(hVar);
        return this.c[hVar.p()];
    }

    @Override // com.google.protobuf.q0, com.google.protobuf.p0
    public vkh<p> getParserForType() {
        return new a();
    }

    @Override // com.google.protobuf.a, com.google.protobuf.q0
    public int getSerializedSize() {
        int iX;
        int serializedSize;
        int i = this.e;
        if (i != -1) {
            return i;
        }
        if (this.f9728a.s().getMessageSetWireFormat()) {
            iX = this.f9729b.t();
            serializedSize = this.d.f();
        } else {
            iX = this.f9729b.x();
            serializedSize = this.d.getSerializedSize();
        }
        int i2 = iX + serializedSize;
        this.e = i2;
        return i2;
    }

    @Override // com.google.protobuf.s0
    public r1 getUnknownFields() {
        return this.d;
    }

    @Override // com.google.protobuf.s0
    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        verifyContainingType(fieldDescriptor);
        return this.f9729b.z(fieldDescriptor);
    }

    @Override // com.google.protobuf.a
    public boolean hasOneof(Descriptors.h hVar) {
        k(hVar);
        return this.c[hVar.p()] != null;
    }

    @Override // com.google.protobuf.q0, com.google.protobuf.p0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return new b(this.f9728a, null);
    }

    @Override // com.google.protobuf.a, defpackage.bsf
    public boolean isInitialized() {
        return g(this.f9728a, this.f9729b);
    }

    @Override // com.google.protobuf.q0, com.google.protobuf.p0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        return newBuilderForType().mergeFrom(this);
    }

    @Override // com.google.protobuf.a, com.google.protobuf.q0
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f9728a.s().getMessageSetWireFormat()) {
            this.f9729b.R(codedOutputStream);
            this.d.l(codedOutputStream);
        } else {
            this.f9729b.T(codedOutputStream);
            this.d.writeTo(codedOutputStream);
        }
    }
}
