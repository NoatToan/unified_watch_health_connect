package com.google.protobuf;

import defpackage.vkh;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class Timestamp extends GeneratedMessageV3 implements s0 {
    public static final int NANOS_FIELD_NUMBER = 2;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int nanos_;
    private long seconds_;
    private static final Timestamp DEFAULT_INSTANCE = new Timestamp();
    private static final vkh<Timestamp> PARSER = new a();

    public static class a extends c<Timestamp> {
        @Override // defpackage.vkh
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Timestamp parsePartialFrom(j jVar, t tVar) throws InvalidProtocolBufferException {
            return new Timestamp(jVar, tVar, null);
        }
    }

    public static final class b extends GeneratedMessageV3.b<b> implements s0 {
        public long e;
        public int f;

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

        public b B(int i) {
            this.f = i;
            onChanged();
            return this;
        }

        public b C(long j) {
            this.e = j;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public final b setUnknownFields(r1 r1Var) {
            return (b) super.setUnknownFields(r1Var);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
        public Descriptors.b getDescriptorForType() {
            return n1.f9720a;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        public GeneratedMessageV3.e h() {
            return n1.f9721b.d(Timestamp.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Timestamp build() {
            Timestamp timestampBuildPartial = buildPartial();
            if (timestampBuildPartial.isInitialized()) {
                return timestampBuildPartial;
            }
            throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) timestampBuildPartial);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Timestamp buildPartial() {
            Timestamp timestamp = new Timestamp(this, (a) null);
            timestamp.seconds_ = this.e;
            timestamp.nanos_ = this.f;
            onBuilt();
            return timestamp;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mo142clear() {
            super.mo142clear();
            this.e = 0L;
            this.f = 0;
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
        public Timestamp getDefaultInstanceForType() {
            return Timestamp.getDefaultInstance();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(j jVar, t tVar) throws Throwable {
            Timestamp timestamp = null;
            try {
                try {
                    Timestamp timestamp2 = (Timestamp) Timestamp.PARSER.parsePartialFrom(jVar, tVar);
                    if (timestamp2 != null) {
                        y(timestamp2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    Timestamp timestamp3 = (Timestamp) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        timestamp = timestamp3;
                        if (timestamp != null) {
                            y(timestamp);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (timestamp != null) {
                    y(timestamp);
                }
                throw th;
            }
        }

        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(p0 p0Var) {
            if (p0Var instanceof Timestamp) {
                return y((Timestamp) p0Var);
            }
            super.mergeFrom(p0Var);
            return this;
        }

        public b y(Timestamp timestamp) {
            if (timestamp == Timestamp.getDefaultInstance()) {
                return this;
            }
            if (timestamp.getSeconds() != 0) {
                C(timestamp.getSeconds());
            }
            if (timestamp.getNanos() != 0) {
                B(timestamp.getNanos());
            }
            mo145mergeUnknownFields(timestamp.unknownFields);
            onChanged();
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

    public /* synthetic */ Timestamp(j jVar, t tVar, a aVar) throws InvalidProtocolBufferException {
        this(jVar, tVar);
    }

    public static Timestamp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.b getDescriptor() {
        return n1.f9720a;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Timestamp parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Timestamp) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Timestamp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static vkh<Timestamp> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.a
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Timestamp)) {
            return super.equals(obj);
        }
        Timestamp timestamp = (Timestamp) obj;
        return getSeconds() == timestamp.getSeconds() && getNanos() == timestamp.getNanos() && this.unknownFields.equals(timestamp.unknownFields);
    }

    public int getNanos() {
        return this.nanos_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public vkh<Timestamp> getParserForType() {
        return PARSER;
    }

    public long getSeconds() {
        return this.seconds_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        long j = this.seconds_;
        int iZ = j != 0 ? CodedOutputStream.z(1, j) : 0;
        int i2 = this.nanos_;
        if (i2 != 0) {
            iZ += CodedOutputStream.x(2, i2);
        }
        int serializedSize = iZ + this.unknownFields.getSerializedSize();
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
        int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + d0.i(getSeconds())) * 37) + 2) * 53) + getNanos()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.e internalGetFieldAccessorTable() {
        return n1.f9721b.d(Timestamp.class, b.class);
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
        return new Timestamp();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j = this.seconds_;
        if (j != 0) {
            codedOutputStream.I0(1, j);
        }
        int i = this.nanos_;
        if (i != 0) {
            codedOutputStream.G0(2, i);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public /* synthetic */ Timestamp(GeneratedMessageV3.b bVar, a aVar) {
        this(bVar);
    }

    public static b newBuilder(Timestamp timestamp) {
        return DEFAULT_INSTANCE.toBuilder().y(timestamp);
    }

    public static Timestamp parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, tVar);
    }

    private Timestamp(GeneratedMessageV3.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Timestamp parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (Timestamp) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
    }

    public static Timestamp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
    public Timestamp getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public b toBuilder() {
        a aVar = null;
        return this == DEFAULT_INSTANCE ? new b(aVar) : new b(aVar).y(this);
    }

    public static Timestamp parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, tVar);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public b newBuilderForType() {
        return newBuilder();
    }

    private Timestamp() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Timestamp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public b newBuilderForType(GeneratedMessageV3.c cVar) {
        return new b(cVar, null);
    }

    public static Timestamp parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, tVar);
    }

    private Timestamp(j jVar, t tVar) throws InvalidProtocolBufferException {
        this();
        tVar.getClass();
        r1.b bVarG = r1.g();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iJ = jVar.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            this.seconds_ = jVar.y();
                        } else if (iJ != 16) {
                            if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                            }
                        } else {
                            this.nanos_ = jVar.x();
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

    public static Timestamp parseFrom(InputStream inputStream) throws IOException {
        return (Timestamp) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Timestamp parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (Timestamp) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
    }

    public static Timestamp parseFrom(j jVar) throws IOException {
        return (Timestamp) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
    }

    public static Timestamp parseFrom(j jVar, t tVar) throws IOException {
        return (Timestamp) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
    }
}
