package com.google.protobuf;

import defpackage.q4n;
import defpackage.vkh;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class SourceContext extends GeneratedMessageV3 implements q4n {
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private volatile Object fileName_;
    private byte memoizedIsInitialized;
    private static final SourceContext DEFAULT_INSTANCE = new SourceContext();
    private static final vkh<SourceContext> PARSER = new a();

    public static class a extends c<SourceContext> {
        @Override // defpackage.vkh
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SourceContext parsePartialFrom(j jVar, t tVar) throws InvalidProtocolBufferException {
            return new SourceContext(jVar, tVar, null);
        }
    }

    public static final class b extends GeneratedMessageV3.b<b> implements q4n {
        public Object e;

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

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
        public Descriptors.b getDescriptorForType() {
            return j1.f9676a;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        public GeneratedMessageV3.e h() {
            return j1.f9677b.d(SourceContext.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public SourceContext build() {
            SourceContext sourceContextBuildPartial = buildPartial();
            if (sourceContextBuildPartial.isInitialized()) {
                return sourceContextBuildPartial;
            }
            throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) sourceContextBuildPartial);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public SourceContext buildPartial() {
            SourceContext sourceContext = new SourceContext(this, (a) null);
            sourceContext.fileName_ = this.e;
            onBuilt();
            return sourceContext;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mo142clear() {
            super.mo142clear();
            this.e = "";
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
        public SourceContext getDefaultInstanceForType() {
            return SourceContext.getDefaultInstance();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(j jVar, t tVar) throws Throwable {
            SourceContext sourceContext = null;
            try {
                try {
                    SourceContext sourceContext2 = (SourceContext) SourceContext.PARSER.parsePartialFrom(jVar, tVar);
                    if (sourceContext2 != null) {
                        y(sourceContext2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    SourceContext sourceContext3 = (SourceContext) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        sourceContext = sourceContext3;
                        if (sourceContext != null) {
                            y(sourceContext);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (sourceContext != null) {
                    y(sourceContext);
                }
                throw th;
            }
        }

        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(p0 p0Var) {
            if (p0Var instanceof SourceContext) {
                return y((SourceContext) p0Var);
            }
            super.mergeFrom(p0Var);
            return this;
        }

        public b y(SourceContext sourceContext) {
            if (sourceContext == SourceContext.getDefaultInstance()) {
                return this;
            }
            if (!sourceContext.getFileName().isEmpty()) {
                this.e = sourceContext.fileName_;
                onChanged();
            }
            mo145mergeUnknownFields(sourceContext.unknownFields);
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
            this.e = "";
            maybeForceBuilderInitialization();
        }

        public b(GeneratedMessageV3.c cVar) {
            super(cVar);
            this.e = "";
            maybeForceBuilderInitialization();
        }
    }

    public /* synthetic */ SourceContext(j jVar, t tVar, a aVar) throws InvalidProtocolBufferException {
        this(jVar, tVar);
    }

    public static SourceContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.b getDescriptor() {
        return j1.f9676a;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static SourceContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SourceContext) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SourceContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static vkh<SourceContext> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.a
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SourceContext)) {
            return super.equals(obj);
        }
        SourceContext sourceContext = (SourceContext) obj;
        return getFileName().equals(sourceContext.getFileName()) && this.unknownFields.equals(sourceContext.unknownFields);
    }

    public String getFileName() {
        Object obj = this.fileName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.fileName_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getFileNameBytes() {
        Object obj = this.fileName_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.fileName_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public vkh<SourceContext> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = (!getFileNameBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.fileName_) : 0) + this.unknownFields.getSerializedSize();
        this.memoizedSize = iComputeStringSize;
        return iComputeStringSize;
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
        int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getFileName().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.e internalGetFieldAccessorTable() {
        return j1.f9677b.d(SourceContext.class, b.class);
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
        return new SourceContext();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getFileNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.fileName_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public /* synthetic */ SourceContext(GeneratedMessageV3.b bVar, a aVar) {
        this(bVar);
    }

    public static b newBuilder(SourceContext sourceContext) {
        return DEFAULT_INSTANCE.toBuilder().y(sourceContext);
    }

    public static SourceContext parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, tVar);
    }

    private SourceContext(GeneratedMessageV3.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static SourceContext parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (SourceContext) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
    }

    public static SourceContext parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
    public SourceContext getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public b toBuilder() {
        a aVar = null;
        return this == DEFAULT_INSTANCE ? new b(aVar) : new b(aVar).y(this);
    }

    public static SourceContext parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, tVar);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public b newBuilderForType() {
        return newBuilder();
    }

    private SourceContext() {
        this.memoizedIsInitialized = (byte) -1;
        this.fileName_ = "";
    }

    public static SourceContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public b newBuilderForType(GeneratedMessageV3.c cVar) {
        return new b(cVar, null);
    }

    public static SourceContext parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, tVar);
    }

    public static SourceContext parseFrom(InputStream inputStream) throws IOException {
        return (SourceContext) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    private SourceContext(j jVar, t tVar) throws InvalidProtocolBufferException {
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
                            if (iJ != 10) {
                                if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                }
                            } else {
                                this.fileName_ = jVar.I();
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

    public static SourceContext parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (SourceContext) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
    }

    public static SourceContext parseFrom(j jVar) throws IOException {
        return (SourceContext) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
    }

    public static SourceContext parseFrom(j jVar, t tVar) throws IOException {
        return (SourceContext) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
    }
}
