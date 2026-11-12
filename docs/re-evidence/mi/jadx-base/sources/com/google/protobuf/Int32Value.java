package com.google.protobuf;

import defpackage.vkh;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class Int32Value extends GeneratedMessageV3 implements s0 {
    private static final Int32Value DEFAULT_INSTANCE = new Int32Value();
    private static final vkh<Int32Value> PARSER = new a();
    public static final int VALUE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int value_;

    public static class a extends c<Int32Value> {
        @Override // defpackage.vkh
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Int32Value parsePartialFrom(j jVar, t tVar) throws InvalidProtocolBufferException {
            return new Int32Value(jVar, tVar, null);
        }
    }

    public static final class b extends GeneratedMessageV3.b<b> implements s0 {
        public int e;

        public /* synthetic */ b(GeneratedMessageV3.c cVar, a aVar) {
            this(cVar);
        }

        private void maybeForceBuilderInitialization() {
            boolean z = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.setField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public final b setUnknownFields(r1 r1Var) {
            return (b) super.setUnknownFields(r1Var);
        }

        public b C(int i) {
            this.e = i;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
        public Descriptors.b getDescriptorForType() {
            return x1.i;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        public GeneratedMessageV3.e h() {
            return x1.j.d(Int32Value.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Int32Value build() {
            Int32Value int32ValueBuildPartial = buildPartial();
            if (int32ValueBuildPartial.isInitialized()) {
                return int32ValueBuildPartial;
            }
            throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) int32ValueBuildPartial);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Int32Value buildPartial() {
            Int32Value int32Value = new Int32Value(this, (a) null);
            int32Value.value_ = this.e;
            onBuilt();
            return int32Value;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mo142clear() {
            super.mo142clear();
            this.e = 0;
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
        public Int32Value getDefaultInstanceForType() {
            return Int32Value.getDefaultInstance();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(j jVar, t tVar) throws Throwable {
            Int32Value int32Value = null;
            try {
                try {
                    Int32Value int32Value2 = (Int32Value) Int32Value.PARSER.parsePartialFrom(jVar, tVar);
                    if (int32Value2 != null) {
                        x(int32Value2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    Int32Value int32Value3 = (Int32Value) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        int32Value = int32Value3;
                        if (int32Value != null) {
                            x(int32Value);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (int32Value != null) {
                    x(int32Value);
                }
                throw th;
            }
        }

        public b x(Int32Value int32Value) {
            if (int32Value == Int32Value.getDefaultInstance()) {
                return this;
            }
            if (int32Value.getValue() != 0) {
                C(int32Value.getValue());
            }
            mo145mergeUnknownFields(int32Value.unknownFields);
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(p0 p0Var) {
            if (p0Var instanceof Int32Value) {
                return x((Int32Value) p0Var);
            }
            super.mergeFrom(p0Var);
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public final b mo145mergeUnknownFields(r1 r1Var) {
            return (b) super.mo145mergeUnknownFields(r1Var);
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

    public /* synthetic */ Int32Value(j jVar, t tVar, a aVar) throws InvalidProtocolBufferException {
        this(jVar, tVar);
    }

    public static Int32Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.b getDescriptor() {
        return x1.i;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Int32Value of(int i) {
        return newBuilder().C(i).build();
    }

    public static Int32Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Int32Value) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Int32Value parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static vkh<Int32Value> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.a
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Int32Value)) {
            return super.equals(obj);
        }
        Int32Value int32Value = (Int32Value) obj;
        return getValue() == int32Value.getValue() && this.unknownFields.equals(int32Value.unknownFields);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public vkh<Int32Value> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.value_;
        int iX = (i2 != 0 ? CodedOutputStream.x(1, i2) : 0) + this.unknownFields.getSerializedSize();
        this.memoizedSize = iX;
        return iX;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
    public final r1 getUnknownFields() {
        return this.unknownFields;
    }

    public int getValue() {
        return this.value_;
    }

    @Override // com.google.protobuf.a
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getValue()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.e internalGetFieldAccessorTable() {
        return x1.j.d(Int32Value.class, b.class);
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
        return new Int32Value();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.value_;
        if (i != 0) {
            codedOutputStream.G0(1, i);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public /* synthetic */ Int32Value(GeneratedMessageV3.b bVar, a aVar) {
        this(bVar);
    }

    public static b newBuilder(Int32Value int32Value) {
        return DEFAULT_INSTANCE.toBuilder().x(int32Value);
    }

    public static Int32Value parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, tVar);
    }

    private Int32Value(GeneratedMessageV3.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Int32Value parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (Int32Value) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
    }

    public static Int32Value parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
    public Int32Value getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public b toBuilder() {
        a aVar = null;
        return this == DEFAULT_INSTANCE ? new b(aVar) : new b(aVar).x(this);
    }

    public static Int32Value parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, tVar);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public b newBuilderForType() {
        return newBuilder();
    }

    private Int32Value() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Int32Value parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public b newBuilderForType(GeneratedMessageV3.c cVar) {
        return new b(cVar, null);
    }

    public static Int32Value parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, tVar);
    }

    private Int32Value(j jVar, t tVar) throws InvalidProtocolBufferException {
        this();
        tVar.getClass();
        r1.b bVarG = r1.g();
        boolean z = false;
        while (!z) {
            try {
                try {
                    try {
                        int iJ = jVar.J();
                        if (iJ != 0) {
                            if (iJ != 8) {
                                if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                }
                            } else {
                                this.value_ = jVar.x();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    }
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

    public static Int32Value parseFrom(InputStream inputStream) throws IOException {
        return (Int32Value) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Int32Value parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (Int32Value) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
    }

    public static Int32Value parseFrom(j jVar) throws IOException {
        return (Int32Value) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
    }

    public static Int32Value parseFrom(j jVar, t tVar) throws IOException {
        return (Int32Value) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
    }
}
