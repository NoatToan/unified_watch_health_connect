package com.google.protobuf;

import defpackage.bei;
import defpackage.ree;
import defpackage.vkh;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class FieldMask extends GeneratedMessageV3 implements s0 {
    private static final FieldMask DEFAULT_INSTANCE = new FieldMask();
    private static final vkh<FieldMask> PARSER = new a();
    public static final int PATHS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private ree paths_;

    public static class a extends c<FieldMask> {
        @Override // defpackage.vkh
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FieldMask parsePartialFrom(j jVar, t tVar) throws InvalidProtocolBufferException {
            return new FieldMask(jVar, tVar, null);
        }
    }

    public static final class b extends GeneratedMessageV3.b<b> implements s0 {
        public int e;
        public ree f;

        public /* synthetic */ b(a aVar) {
            this();
        }

        private void maybeForceBuilderInitialization() {
            boolean z = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public final b mo145mergeUnknownFields(r1 r1Var) {
            return (b) super.mo145mergeUnknownFields(r1Var);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.setField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public final b setUnknownFields(r1 r1Var) {
            return (b) super.setUnknownFields(r1Var);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
        public Descriptors.b getDescriptorForType() {
            return y.f9778a;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        public GeneratedMessageV3.e h() {
            return y.f9779b.d(FieldMask.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public FieldMask build() {
            FieldMask fieldMaskBuildPartial = buildPartial();
            if (fieldMaskBuildPartial.isInitialized()) {
                return fieldMaskBuildPartial;
            }
            throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) fieldMaskBuildPartial);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public FieldMask buildPartial() {
            FieldMask fieldMask = new FieldMask(this, (a) null);
            if ((this.e & 1) != 0) {
                this.f = this.f.getUnmodifiableView();
                this.e &= -2;
            }
            fieldMask.paths_ = this.f;
            onBuilt();
            return fieldMask;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mo142clear() {
            super.mo142clear();
            this.f = g0.d;
            this.e &= -2;
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

        public final void v() {
            if ((this.e & 1) == 0) {
                this.f = new g0(this.f);
                this.e |= 1;
            }
        }

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public FieldMask getDefaultInstanceForType() {
            return FieldMask.getDefaultInstance();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(j jVar, t tVar) throws Throwable {
            FieldMask fieldMask = null;
            try {
                try {
                    FieldMask fieldMask2 = (FieldMask) FieldMask.PARSER.parsePartialFrom(jVar, tVar);
                    if (fieldMask2 != null) {
                        y(fieldMask2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    FieldMask fieldMask3 = (FieldMask) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        fieldMask = fieldMask3;
                        if (fieldMask != null) {
                            y(fieldMask);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (fieldMask != null) {
                    y(fieldMask);
                }
                throw th;
            }
        }

        public b y(FieldMask fieldMask) {
            if (fieldMask == FieldMask.getDefaultInstance()) {
                return this;
            }
            if (!fieldMask.paths_.isEmpty()) {
                if (this.f.isEmpty()) {
                    this.f = fieldMask.paths_;
                    this.e &= -2;
                } else {
                    v();
                    this.f.addAll(fieldMask.paths_);
                }
                onChanged();
            }
            mo145mergeUnknownFields(fieldMask.unknownFields);
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(p0 p0Var) {
            if (p0Var instanceof FieldMask) {
                return y((FieldMask) p0Var);
            }
            super.mergeFrom(p0Var);
            return this;
        }

        public /* synthetic */ b(GeneratedMessageV3.c cVar, a aVar) {
            this(cVar);
        }

        public b() {
            this.f = g0.d;
            maybeForceBuilderInitialization();
        }

        public b(GeneratedMessageV3.c cVar) {
            super(cVar);
            this.f = g0.d;
            maybeForceBuilderInitialization();
        }
    }

    public /* synthetic */ FieldMask(j jVar, t tVar, a aVar) throws InvalidProtocolBufferException {
        this(jVar, tVar);
    }

    public static FieldMask getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.b getDescriptor() {
        return y.f9778a;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FieldMask) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static vkh<FieldMask> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.a
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FieldMask)) {
            return super.equals(obj);
        }
        FieldMask fieldMask = (FieldMask) obj;
        return m150getPathsList().equals(fieldMask.m150getPathsList()) && this.unknownFields.equals(fieldMask.unknownFields);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public vkh<FieldMask> getParserForType() {
        return PARSER;
    }

    public String getPaths(int i) {
        return this.paths_.get(i);
    }

    public ByteString getPathsBytes(int i) {
        return this.paths_.getByteString(i);
    }

    public int getPathsCount() {
        return this.paths_.size();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSizeNoTag = 0;
        for (int i2 = 0; i2 < this.paths_.size(); i2++) {
            iComputeStringSizeNoTag += GeneratedMessageV3.computeStringSizeNoTag(this.paths_.d(i2));
        }
        int size = iComputeStringSizeNoTag + m150getPathsList().size() + this.unknownFields.getSerializedSize();
        this.memoizedSize = size;
        return size;
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
        if (getPathsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + m150getPathsList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.e internalGetFieldAccessorTable() {
        return y.f9779b.d(FieldMask.class, b.class);
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
        return new FieldMask();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.paths_.size(); i++) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.paths_.d(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public /* synthetic */ FieldMask(GeneratedMessageV3.b bVar, a aVar) {
        this(bVar);
    }

    public static b newBuilder(FieldMask fieldMask) {
        return DEFAULT_INSTANCE.toBuilder().y(fieldMask);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, tVar);
    }

    /* JADX INFO: renamed from: getPathsList, reason: merged with bridge method [inline-methods] */
    public bei m150getPathsList() {
        return this.paths_;
    }

    private FieldMask(GeneratedMessageV3.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (FieldMask) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
    }

    public static FieldMask parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
    public FieldMask getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public b toBuilder() {
        a aVar = null;
        return this == DEFAULT_INSTANCE ? new b(aVar) : new b(aVar).y(this);
    }

    public static FieldMask parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, tVar);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public b newBuilderForType() {
        return newBuilder();
    }

    private FieldMask() {
        this.memoizedIsInitialized = (byte) -1;
        this.paths_ = g0.d;
    }

    public static FieldMask parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public b newBuilderForType(GeneratedMessageV3.c cVar) {
        return new b(cVar, null);
    }

    public static FieldMask parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, tVar);
    }

    public static FieldMask parseFrom(InputStream inputStream) throws IOException {
        return (FieldMask) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    private FieldMask(j jVar, t tVar) throws InvalidProtocolBufferException {
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
                            String strI = jVar.I();
                            if (!(z2 & true)) {
                                this.paths_ = new g0();
                                z2 = true;
                            }
                            this.paths_.add(strI);
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if (z2 & true) {
                    this.paths_ = this.paths_.getUnmodifiableView();
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (z2 & true) {
            this.paths_ = this.paths_.getUnmodifiableView();
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static FieldMask parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (FieldMask) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
    }

    public static FieldMask parseFrom(j jVar) throws IOException {
        return (FieldMask) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
    }

    public static FieldMask parseFrom(j jVar, t tVar) throws IOException {
        return (FieldMask) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
    }
}
