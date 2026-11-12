package com.google.protobuf;

import defpackage.tlo;
import defpackage.vkh;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class Struct extends GeneratedMessageV3 implements tlo {
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private l0<String, Value> fields_;
    private byte memoizedIsInitialized;
    private static final Struct DEFAULT_INSTANCE = new Struct();
    private static final vkh<Struct> PARSER = new a();

    public static class a extends com.google.protobuf.c<Struct> {
        @Override // defpackage.vkh
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Struct parsePartialFrom(j jVar, t tVar) throws InvalidProtocolBufferException {
            return new Struct(jVar, tVar, null);
        }
    }

    public static final class b extends GeneratedMessageV3.b<b> implements tlo {
        public l0<String, Value> e;

        public /* synthetic */ b(GeneratedMessageV3.c cVar, a aVar) {
            this(cVar);
        }

        private void maybeForceBuilderInitialization() {
            boolean z = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        public b A(Struct struct) {
            if (struct == Struct.getDefaultInstance()) {
                return this;
            }
            x().p(struct.internalGetFields());
            mo145mergeUnknownFields(struct.unknownFields);
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public final b mo145mergeUnknownFields(r1 r1Var) {
            return (b) super.mo145mergeUnknownFields(r1Var);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.setField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public final b setUnknownFields(r1 r1Var) {
            return (b) super.setUnknownFields(r1Var);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
        public Descriptors.b getDescriptorForType() {
            return k1.f9685a;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        public GeneratedMessageV3.e h() {
            return k1.f9686b.d(Struct.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        public l0 internalGetMapField(int i) {
            if (i == 1) {
                return w();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        public l0 internalGetMutableMapField(int i) {
            if (i == 1) {
                return x();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Struct build() {
            Struct structBuildPartial = buildPartial();
            if (structBuildPartial.isInitialized()) {
                return structBuildPartial;
            }
            throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) structBuildPartial);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Struct buildPartial() {
            Struct struct = new Struct(this, (a) null);
            struct.fields_ = w();
            struct.fields_.o();
            onBuilt();
            return struct;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mo142clear() {
            super.mo142clear();
            x().b();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (b) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b clearOneof(Descriptors.h hVar) {
            return (b) super.clearOneof(hVar);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public b mo144clone() {
            return (b) super.mo144clone();
        }

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public Struct getDefaultInstanceForType() {
            return Struct.getDefaultInstance();
        }

        public final l0<String, Value> w() {
            l0<String, Value> l0Var = this.e;
            return l0Var == null ? l0.h(c.f9576a) : l0Var;
        }

        public final l0<String, Value> x() {
            onChanged();
            if (this.e == null) {
                this.e = l0.q(c.f9576a);
            }
            if (!this.e.n()) {
                this.e = this.e.g();
            }
            return this.e;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(j jVar, t tVar) throws Throwable {
            Struct struct = null;
            try {
                try {
                    Struct struct2 = (Struct) Struct.PARSER.parsePartialFrom(jVar, tVar);
                    if (struct2 != null) {
                        A(struct2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    Struct struct3 = (Struct) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        struct = struct3;
                        if (struct != null) {
                            A(struct);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (struct != null) {
                    A(struct);
                }
                throw th;
            }
        }

        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(p0 p0Var) {
            if (p0Var instanceof Struct) {
                return A((Struct) p0Var);
            }
            super.mergeFrom(p0Var);
            return this;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            maybeForceBuilderInitialization();
        }

        public b(GeneratedMessageV3.c cVar) {
            super(cVar);
            maybeForceBuilderInitialization();
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j0<String, Value> f9576a = j0.j(k1.c, WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Value.getDefaultInstance());
    }

    public /* synthetic */ Struct(j jVar, t tVar, a aVar) throws InvalidProtocolBufferException {
        this(jVar, tVar);
    }

    public static Struct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.b getDescriptor() {
        return k1.f9685a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l0<String, Value> internalGetFields() {
        l0<String, Value> l0Var = this.fields_;
        return l0Var == null ? l0.h(c.f9576a) : l0Var;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Struct parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Struct) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static vkh<Struct> parser() {
        return PARSER;
    }

    public boolean containsFields(String str) {
        str.getClass();
        return internalGetFields().j().containsKey(str);
    }

    @Override // com.google.protobuf.a
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Struct)) {
            return super.equals(obj);
        }
        Struct struct = (Struct) obj;
        return internalGetFields().equals(struct.internalGetFields()) && this.unknownFields.equals(struct.unknownFields);
    }

    @Deprecated
    public Map<String, Value> getFields() {
        return getFieldsMap();
    }

    public int getFieldsCount() {
        return internalGetFields().j().size();
    }

    public Map<String, Value> getFieldsMap() {
        return internalGetFields().j();
    }

    public Value getFieldsOrDefault(String str, Value value) {
        str.getClass();
        Map<String, Value> mapJ = internalGetFields().j();
        return mapJ.containsKey(str) ? mapJ.get(str) : value;
    }

    public Value getFieldsOrThrow(String str) {
        str.getClass();
        Map<String, Value> mapJ = internalGetFields().j();
        if (mapJ.containsKey(str)) {
            return mapJ.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public vkh<Struct> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iG = 0;
        for (Map.Entry<String, Value> entry : internalGetFields().j().entrySet()) {
            iG += CodedOutputStream.G(1, c.f9576a.newBuilderForType().n(entry.getKey()).q(entry.getValue()).build());
        }
        int serializedSize = iG + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
    public final r1 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.a
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (!internalGetFields().j().isEmpty()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + internalGetFields().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.e internalGetFieldAccessorTable() {
        return k1.f9686b.d(Struct.class, b.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public l0 internalGetMapField(int i) {
        if (i == 1) {
            return internalGetFields();
        }
        throw new RuntimeException("Invalid map field number: " + i);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, defpackage.bsf
    public final boolean isInitialized() {
        byte b2 = this.memoizedIsInitialized;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.f fVar) {
        return new Struct();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetFields(), c.f9576a, 1);
        this.unknownFields.writeTo(codedOutputStream);
    }

    public /* synthetic */ Struct(GeneratedMessageV3.b bVar, a aVar) {
        this(bVar);
    }

    public static b newBuilder(Struct struct) {
        return DEFAULT_INSTANCE.toBuilder().A(struct);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, tVar);
    }

    private Struct(GeneratedMessageV3.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Struct parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (Struct) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
    }

    public static Struct parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
    public Struct getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public b toBuilder() {
        a aVar = null;
        return this == DEFAULT_INSTANCE ? new b(aVar) : new b(aVar).A(this);
    }

    public static Struct parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, tVar);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public b newBuilderForType() {
        return newBuilder();
    }

    private Struct() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Struct parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public b newBuilderForType(GeneratedMessageV3.c cVar) {
        return new b(cVar, null);
    }

    public static Struct parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, tVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Struct(j jVar, t tVar) throws InvalidProtocolBufferException {
        this();
        tVar.getClass();
        r1.b bVarG = r1.g();
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iJ = jVar.J();
                    if (iJ != 0) {
                        if (iJ != 10) {
                            if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                            }
                        } else {
                            if (!(z2 & true)) {
                                this.fields_ = l0.q(c.f9576a);
                                z2 = true;
                            }
                            j0 j0Var = (j0) jVar.z(c.f9576a.getParserForType(), tVar);
                            this.fields_.m().put(j0Var.e(), j0Var.g());
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static Struct parseFrom(InputStream inputStream) throws IOException {
        return (Struct) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Struct parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (Struct) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
    }

    public static Struct parseFrom(j jVar) throws IOException {
        return (Struct) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
    }

    public static Struct parseFrom(j jVar, t tVar) throws IOException {
        return (Struct) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
    }
}
