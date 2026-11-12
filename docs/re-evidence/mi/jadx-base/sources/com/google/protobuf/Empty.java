package com.google.protobuf;

import defpackage.vkh;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class Empty extends GeneratedMessageV3 implements s0 {
    private static final Empty DEFAULT_INSTANCE = new Empty();
    private static final vkh<Empty> PARSER = new a();
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;

    public static class a extends c<Empty> {
        @Override // defpackage.vkh
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Empty parsePartialFrom(j jVar, t tVar) throws InvalidProtocolBufferException {
            return new Empty(jVar, tVar, null);
        }
    }

    public static final class b extends GeneratedMessageV3.b<b> implements s0 {
        public /* synthetic */ b(a aVar) {
            this();
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

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
        public Descriptors.b getDescriptorForType() {
            return q.f9736a;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        public GeneratedMessageV3.e h() {
            return q.f9737b.d(Empty.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Empty build() {
            Empty emptyBuildPartial = buildPartial();
            if (emptyBuildPartial.isInitialized()) {
                return emptyBuildPartial;
            }
            throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) emptyBuildPartial);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Empty buildPartial() {
            Empty empty = new Empty(this, (a) null);
            onBuilt();
            return empty;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mo142clear() {
            super.mo142clear();
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
        public Empty getDefaultInstanceForType() {
            return Empty.getDefaultInstance();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(j jVar, t tVar) throws Throwable {
            Empty empty = null;
            try {
                try {
                    Empty empty2 = (Empty) Empty.PARSER.parsePartialFrom(jVar, tVar);
                    if (empty2 != null) {
                        x(empty2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    Empty empty3 = (Empty) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        empty = empty3;
                        if (empty != null) {
                            x(empty);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (empty != null) {
                    x(empty);
                }
                throw th;
            }
        }

        public b x(Empty empty) {
            if (empty == Empty.getDefaultInstance()) {
                return this;
            }
            mo145mergeUnknownFields(empty.unknownFields);
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(p0 p0Var) {
            if (p0Var instanceof Empty) {
                return x((Empty) p0Var);
            }
            super.mergeFrom(p0Var);
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public final b mo145mergeUnknownFields(r1 r1Var) {
            return (b) super.mo145mergeUnknownFields(r1Var);
        }

        public /* synthetic */ b(GeneratedMessageV3.c cVar, a aVar) {
            this(cVar);
        }

        public b() {
            maybeForceBuilderInitialization();
        }

        public b(GeneratedMessageV3.c cVar) {
            super(cVar);
            maybeForceBuilderInitialization();
        }
    }

    public /* synthetic */ Empty(j jVar, t tVar, a aVar) throws InvalidProtocolBufferException {
        this(jVar, tVar);
    }

    public static Empty getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.b getDescriptor() {
        return q.f9736a;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Empty parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Empty) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Empty parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static vkh<Empty> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.a
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Empty) {
            return this.unknownFields.equals(((Empty) obj).unknownFields);
        }
        return super.equals(obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public vkh<Empty> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int serializedSize = this.unknownFields.getSerializedSize();
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
        int iHashCode = ((779 + getDescriptor().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.e internalGetFieldAccessorTable() {
        return q.f9737b.d(Empty.class, b.class);
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
        return new Empty();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        this.unknownFields.writeTo(codedOutputStream);
    }

    public /* synthetic */ Empty(GeneratedMessageV3.b bVar, a aVar) {
        this(bVar);
    }

    public static b newBuilder(Empty empty) {
        return DEFAULT_INSTANCE.toBuilder().x(empty);
    }

    public static Empty parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, tVar);
    }

    private Empty(GeneratedMessageV3.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Empty parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (Empty) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
    }

    public static Empty parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
    public Empty getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public b toBuilder() {
        a aVar = null;
        return this == DEFAULT_INSTANCE ? new b(aVar) : new b(aVar).x(this);
    }

    public static Empty parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, tVar);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public b newBuilderForType() {
        return newBuilder();
    }

    private Empty() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Empty parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public b newBuilderForType(GeneratedMessageV3.c cVar) {
        return new b(cVar, null);
    }

    public static Empty parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, tVar);
    }

    private Empty(j jVar, t tVar) throws InvalidProtocolBufferException {
        this();
        tVar.getClass();
        r1.b bVarG = r1.g();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iJ = jVar.J();
                    if (iJ == 0 || !parseUnknownField(jVar, bVarG, tVar, iJ)) {
                        z = true;
                    }
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

    public static Empty parseFrom(InputStream inputStream) throws IOException {
        return (Empty) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Empty parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (Empty) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
    }

    public static Empty parseFrom(j jVar) throws IOException {
        return (Empty) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
    }

    public static Empty parseFrom(j jVar, t tVar) throws IOException {
        return (Empty) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
    }
}
