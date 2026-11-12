package com.google.protobuf;

import defpackage.rd1;
import defpackage.vkh;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class Any extends GeneratedMessageV3 implements rd1 {
    private static final Any DEFAULT_INSTANCE = new Any();
    private static final vkh<Any> PARSER = new a();
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private volatile p0 cachedUnpackValue;
    private byte memoizedIsInitialized;
    private volatile Object typeUrl_;
    private ByteString value_;

    public static class a extends c<Any> {
        @Override // defpackage.vkh
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Any parsePartialFrom(j jVar, t tVar) throws InvalidProtocolBufferException {
            return new Any(jVar, tVar, null);
        }
    }

    public static final class b extends GeneratedMessageV3.b<b> implements rd1 {
        public Object e;
        public ByteString f;

        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.setField(fieldDescriptor, obj);
        }

        public b B(String str) {
            str.getClass();
            this.e = str;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public final b setUnknownFields(r1 r1Var) {
            return (b) super.setUnknownFields(r1Var);
        }

        public b D(ByteString byteString) {
            byteString.getClass();
            this.f = byteString;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
        public Descriptors.b getDescriptorForType() {
            return e.f9629a;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        public GeneratedMessageV3.e h() {
            return e.f9630b.d(Any.class, b.class);
        }

        public final void maybeForceBuilderInitialization() {
            boolean z = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Any build() {
            Any anyBuildPartial = buildPartial();
            if (anyBuildPartial.isInitialized()) {
                return anyBuildPartial;
            }
            throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) anyBuildPartial);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Any buildPartial() {
            Any any = new Any(this, (a) null);
            any.typeUrl_ = this.e;
            any.value_ = this.f;
            onBuilt();
            return any;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mo142clear() {
            super.mo142clear();
            this.e = "";
            this.f = ByteString.EMPTY;
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
        public Any getDefaultInstanceForType() {
            return Any.getDefaultInstance();
        }

        public b w(Any any) {
            if (any == Any.getDefaultInstance()) {
                return this;
            }
            if (!any.getTypeUrl().isEmpty()) {
                this.e = any.typeUrl_;
                onChanged();
            }
            if (any.getValue() != ByteString.EMPTY) {
                D(any.getValue());
            }
            mo145mergeUnknownFields(any.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(j jVar, t tVar) throws Throwable {
            Any any = null;
            try {
                try {
                    Any any2 = (Any) Any.PARSER.parsePartialFrom(jVar, tVar);
                    if (any2 != null) {
                        w(any2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    Any any3 = (Any) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        any = any3;
                        if (any != null) {
                            w(any);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (any != null) {
                    w(any);
                }
                throw th;
            }
        }

        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(p0 p0Var) {
            if (p0Var instanceof Any) {
                return w((Any) p0Var);
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
            this.e = "";
            this.f = ByteString.EMPTY;
            maybeForceBuilderInitialization();
        }

        public b(GeneratedMessageV3.c cVar) {
            super(cVar);
            this.e = "";
            this.f = ByteString.EMPTY;
            maybeForceBuilderInitialization();
        }
    }

    public /* synthetic */ Any(j jVar, t tVar, a aVar) throws InvalidProtocolBufferException {
        this(jVar, tVar);
    }

    public static Any getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.b getDescriptor() {
        return e.f9629a;
    }

    private static String getTypeNameFromTypeUrl(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? "" : str.substring(iLastIndexOf + 1);
    }

    private static String getTypeUrl(String str, Descriptors.b bVar) {
        if (str.endsWith("/")) {
            return str + bVar.b();
        }
        return str + "/" + bVar.b();
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static <T extends p0> Any pack(T t) {
        return newBuilder().B(getTypeUrl("type.googleapis.com", t.getDescriptorForType())).D(t.toByteString()).build();
    }

    public static Any parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Any) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Any parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static vkh<Any> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.a
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Any)) {
            return super.equals(obj);
        }
        Any any = (Any) obj;
        return getTypeUrl().equals(any.getTypeUrl()) && getValue().equals(any.getValue()) && this.unknownFields.equals(any.unknownFields);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public vkh<Any> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !getTypeUrlBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.typeUrl_) : 0;
        if (!this.value_.isEmpty()) {
            iComputeStringSize += CodedOutputStream.h(2, this.value_);
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public ByteString getTypeUrlBytes() {
        Object obj = this.typeUrl_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.typeUrl_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
    public final r1 getUnknownFields() {
        return this.unknownFields;
    }

    public ByteString getValue() {
        return this.value_;
    }

    @Override // com.google.protobuf.a
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTypeUrl().hashCode()) * 37) + 2) * 53) + getValue().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.e internalGetFieldAccessorTable() {
        return e.f9630b.d(Any.class, b.class);
    }

    public <T extends p0> boolean is(Class<T> cls) {
        return getTypeNameFromTypeUrl(getTypeUrl()).equals(((p0) d0.c(cls)).getDescriptorForType().b());
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
        return new Any();
    }

    public <T extends p0> T unpack(Class<T> cls) throws InvalidProtocolBufferException {
        if (this.cachedUnpackValue != null) {
            if (this.cachedUnpackValue.getClass() == cls) {
                return (T) this.cachedUnpackValue;
            }
        } else if (is(cls)) {
            T t = (T) ((p0) d0.c(cls)).getParserForType().parseFrom(getValue());
            this.cachedUnpackValue = t;
            return t;
        }
        throw new InvalidProtocolBufferException("Type of the Any message does not match the given class.");
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getTypeUrlBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.typeUrl_);
        }
        if (!this.value_.isEmpty()) {
            codedOutputStream.q0(2, this.value_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public /* synthetic */ Any(GeneratedMessageV3.b bVar, a aVar) {
        this(bVar);
    }

    public static b newBuilder(Any any) {
        return DEFAULT_INSTANCE.toBuilder().w(any);
    }

    public static Any parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, tVar);
    }

    private Any(GeneratedMessageV3.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Any parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (Any) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
    }

    public static Any parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
    public Any getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public b toBuilder() {
        a aVar = null;
        return this == DEFAULT_INSTANCE ? new b(aVar) : new b(aVar).w(this);
    }

    public static Any parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, tVar);
    }

    public String getTypeUrl() {
        Object obj = this.typeUrl_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.typeUrl_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public b newBuilderForType() {
        return newBuilder();
    }

    private Any() {
        this.memoizedIsInitialized = (byte) -1;
        this.typeUrl_ = "";
        this.value_ = ByteString.EMPTY;
    }

    public static Any parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public b newBuilderForType(GeneratedMessageV3.c cVar) {
        return new b(cVar, null);
    }

    public static <T extends p0> Any pack(T t, String str) {
        return newBuilder().B(getTypeUrl(str, t.getDescriptorForType())).D(t.toByteString()).build();
    }

    public static Any parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, tVar);
    }

    public static Any parseFrom(InputStream inputStream) throws IOException {
        return (Any) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    private Any(j jVar, t tVar) throws InvalidProtocolBufferException {
        this();
        tVar.getClass();
        r1.b bVarG = r1.g();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iJ = jVar.J();
                    if (iJ != 0) {
                        if (iJ == 10) {
                            this.typeUrl_ = jVar.I();
                        } else if (iJ != 18) {
                            if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                            }
                        } else {
                            this.value_ = jVar.q();
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

    public static Any parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (Any) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
    }

    public static Any parseFrom(j jVar) throws IOException {
        return (Any) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
    }

    public static Any parseFrom(j jVar, t tVar) throws IOException {
        return (Any) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
    }
}
