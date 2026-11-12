package com.google.protobuf;

import defpackage.vkh;
import defpackage.xbh;
import defpackage.ztf;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class Method extends GeneratedMessageV3 implements ztf {
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private List<Option> options_;
    private boolean requestStreaming_;
    private volatile Object requestTypeUrl_;
    private boolean responseStreaming_;
    private volatile Object responseTypeUrl_;
    private int syntax_;
    private static final Method DEFAULT_INSTANCE = new Method();
    private static final vkh<Method> PARSER = new a();

    public static class a extends c<Method> {
        @Override // defpackage.vkh
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Method parsePartialFrom(j jVar, t tVar) throws InvalidProtocolBufferException {
            return new Method(jVar, tVar, null);
        }
    }

    public static final class b extends GeneratedMessageV3.b<b> implements ztf {
        public int e;
        public Object f;
        public Object g;
        public boolean h;
        public Object i;
        public boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public List<Option> f9575k;
        public c1<Option, Option.b, xbh> l;
        public int m;

        public /* synthetic */ b(GeneratedMessageV3.c cVar, a aVar) {
            this(cVar);
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                x();
            }
        }

        private void v() {
            if ((this.e & 1) == 0) {
                this.f9575k = new ArrayList(this.f9575k);
                this.e |= 1;
            }
        }

        private c1<Option, Option.b, xbh> x() {
            if (this.l == null) {
                this.l = new c1<>(this.f9575k, (this.e & 1) != 0, g(), isClean());
                this.f9575k = null;
            }
            return this.l;
        }

        public b A(Method method) {
            if (method == Method.getDefaultInstance()) {
                return this;
            }
            if (!method.getName().isEmpty()) {
                this.f = method.name_;
                onChanged();
            }
            if (!method.getRequestTypeUrl().isEmpty()) {
                this.g = method.requestTypeUrl_;
                onChanged();
            }
            if (method.getRequestStreaming()) {
                D(method.getRequestStreaming());
            }
            if (!method.getResponseTypeUrl().isEmpty()) {
                this.i = method.responseTypeUrl_;
                onChanged();
            }
            if (method.getResponseStreaming()) {
                F(method.getResponseStreaming());
            }
            if (this.l == null) {
                if (!method.options_.isEmpty()) {
                    if (this.f9575k.isEmpty()) {
                        this.f9575k = method.options_;
                        this.e &= -2;
                    } else {
                        v();
                        this.f9575k.addAll(method.options_);
                    }
                    onChanged();
                }
            } else if (!method.options_.isEmpty()) {
                if (this.l.j()) {
                    this.l.f();
                    this.l = null;
                    this.f9575k = method.options_;
                    this.e &= -2;
                    this.l = GeneratedMessageV3.alwaysUseFieldBuilders ? x() : null;
                } else {
                    this.l.b(method.options_);
                }
            }
            if (method.syntax_ != 0) {
                G(method.getSyntaxValue());
            }
            mo145mergeUnknownFields(method.unknownFields);
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

        public b D(boolean z) {
            this.h = z;
            onChanged();
            return this;
        }

        public b F(boolean z) {
            this.j = z;
            onChanged();
            return this;
        }

        public b G(int i) {
            this.m = i;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final b setUnknownFields(r1 r1Var) {
            return (b) super.setUnknownFields(r1Var);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
        public Descriptors.b getDescriptorForType() {
            return f.c;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        public GeneratedMessageV3.e h() {
            return f.d.d(Method.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Method build() {
            Method methodBuildPartial = buildPartial();
            if (methodBuildPartial.isInitialized()) {
                return methodBuildPartial;
            }
            throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) methodBuildPartial);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Method buildPartial() {
            Method method = new Method(this, (a) null);
            method.name_ = this.f;
            method.requestTypeUrl_ = this.g;
            method.requestStreaming_ = this.h;
            method.responseTypeUrl_ = this.i;
            method.responseStreaming_ = this.j;
            c1<Option, Option.b, xbh> c1Var = this.l;
            if (c1Var == null) {
                if ((this.e & 1) != 0) {
                    this.f9575k = Collections.unmodifiableList(this.f9575k);
                    this.e &= -2;
                }
                method.options_ = this.f9575k;
            } else {
                method.options_ = c1Var.d();
            }
            method.syntax_ = this.m;
            onBuilt();
            return method;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mo142clear() {
            super.mo142clear();
            this.f = "";
            this.g = "";
            this.h = false;
            this.i = "";
            this.j = false;
            c1<Option, Option.b, xbh> c1Var = this.l;
            if (c1Var == null) {
                this.f9575k = Collections.emptyList();
                this.e &= -2;
            } else {
                c1Var.e();
            }
            this.m = 0;
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
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public Method getDefaultInstanceForType() {
            return Method.getDefaultInstance();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(j jVar, t tVar) throws Throwable {
            Method method = null;
            try {
                try {
                    Method method2 = (Method) Method.PARSER.parsePartialFrom(jVar, tVar);
                    if (method2 != null) {
                        A(method2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    Method method3 = (Method) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        method = method3;
                        if (method != null) {
                            A(method);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (method != null) {
                    A(method);
                }
                throw th;
            }
        }

        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(p0 p0Var) {
            if (p0Var instanceof Method) {
                return A((Method) p0Var);
            }
            super.mergeFrom(p0Var);
            return this;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            this.f = "";
            this.g = "";
            this.i = "";
            this.f9575k = Collections.emptyList();
            this.m = 0;
            maybeForceBuilderInitialization();
        }

        public b(GeneratedMessageV3.c cVar) {
            super(cVar);
            this.f = "";
            this.g = "";
            this.i = "";
            this.f9575k = Collections.emptyList();
            this.m = 0;
            maybeForceBuilderInitialization();
        }
    }

    public /* synthetic */ Method(j jVar, t tVar, a aVar) throws InvalidProtocolBufferException {
        this(jVar, tVar);
    }

    public static Method getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.b getDescriptor() {
        return f.c;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Method parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Method) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Method parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static vkh<Method> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.a
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Method)) {
            return super.equals(obj);
        }
        Method method = (Method) obj;
        return getName().equals(method.getName()) && getRequestTypeUrl().equals(method.getRequestTypeUrl()) && getRequestStreaming() == method.getRequestStreaming() && getResponseTypeUrl().equals(method.getResponseTypeUrl()) && getResponseStreaming() == method.getResponseStreaming() && getOptionsList().equals(method.getOptionsList()) && this.syntax_ == method.syntax_ && this.unknownFields.equals(method.unknownFields);
    }

    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public Option getOptions(int i) {
        return this.options_.get(i);
    }

    public int getOptionsCount() {
        return this.options_.size();
    }

    public List<Option> getOptionsList() {
        return this.options_;
    }

    public xbh getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    public List<? extends xbh> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public vkh<Method> getParserForType() {
        return PARSER;
    }

    public boolean getRequestStreaming() {
        return this.requestStreaming_;
    }

    public String getRequestTypeUrl() {
        Object obj = this.requestTypeUrl_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.requestTypeUrl_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getRequestTypeUrlBytes() {
        Object obj = this.requestTypeUrl_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.requestTypeUrl_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public boolean getResponseStreaming() {
        return this.responseStreaming_;
    }

    public String getResponseTypeUrl() {
        Object obj = this.responseTypeUrl_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.responseTypeUrl_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getResponseTypeUrlBytes() {
        Object obj = this.responseTypeUrl_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.responseTypeUrl_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !getNameBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
        if (!getRequestTypeUrlBytes().isEmpty()) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.requestTypeUrl_);
        }
        boolean z = this.requestStreaming_;
        if (z) {
            iComputeStringSize += CodedOutputStream.e(3, z);
        }
        if (!getResponseTypeUrlBytes().isEmpty()) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.responseTypeUrl_);
        }
        boolean z2 = this.responseStreaming_;
        if (z2) {
            iComputeStringSize += CodedOutputStream.e(5, z2);
        }
        for (int i2 = 0; i2 < this.options_.size(); i2++) {
            iComputeStringSize += CodedOutputStream.G(6, this.options_.get(i2));
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            iComputeStringSize += CodedOutputStream.l(7, this.syntax_);
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public Syntax getSyntax() {
        Syntax syntaxValueOf = Syntax.valueOf(this.syntax_);
        return syntaxValueOf == null ? Syntax.UNRECOGNIZED : syntaxValueOf;
    }

    public int getSyntaxValue() {
        return this.syntax_;
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
        int iHashCode = ((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + getRequestTypeUrl().hashCode()) * 37) + 3) * 53) + d0.d(getRequestStreaming())) * 37) + 4) * 53) + getResponseTypeUrl().hashCode()) * 37) + 5) * 53) + d0.d(getResponseStreaming());
        if (getOptionsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + getOptionsList().hashCode();
        }
        int iHashCode2 = (((((iHashCode * 37) + 7) * 53) + this.syntax_) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.e internalGetFieldAccessorTable() {
        return f.d.d(Method.class, b.class);
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
        return new Method();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
        }
        if (!getRequestTypeUrlBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.requestTypeUrl_);
        }
        boolean z = this.requestStreaming_;
        if (z) {
            codedOutputStream.m0(3, z);
        }
        if (!getResponseTypeUrlBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.responseTypeUrl_);
        }
        boolean z2 = this.responseStreaming_;
        if (z2) {
            codedOutputStream.m0(5, z2);
        }
        for (int i = 0; i < this.options_.size(); i++) {
            codedOutputStream.K0(6, this.options_.get(i));
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            codedOutputStream.u0(7, this.syntax_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public /* synthetic */ Method(GeneratedMessageV3.b bVar, a aVar) {
        this(bVar);
    }

    public static b newBuilder(Method method) {
        return DEFAULT_INSTANCE.toBuilder().A(method);
    }

    public static Method parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, tVar);
    }

    private Method(GeneratedMessageV3.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Method parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (Method) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
    }

    public static Method parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
    public Method getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public b toBuilder() {
        a aVar = null;
        return this == DEFAULT_INSTANCE ? new b(aVar) : new b(aVar).A(this);
    }

    public static Method parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, tVar);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public b newBuilderForType() {
        return newBuilder();
    }

    private Method() {
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.requestTypeUrl_ = "";
        this.responseTypeUrl_ = "";
        this.options_ = Collections.emptyList();
        this.syntax_ = 0;
    }

    public static Method parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public b newBuilderForType(GeneratedMessageV3.c cVar) {
        return new b(cVar, null);
    }

    public static Method parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, tVar);
    }

    public static Method parseFrom(InputStream inputStream) throws IOException {
        return (Method) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Method parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (Method) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
    }

    public static Method parseFrom(j jVar) throws IOException {
        return (Method) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
    }

    private Method(j jVar, t tVar) throws InvalidProtocolBufferException {
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
                        if (iJ == 10) {
                            this.name_ = jVar.I();
                        } else if (iJ == 18) {
                            this.requestTypeUrl_ = jVar.I();
                        } else if (iJ == 24) {
                            this.requestStreaming_ = jVar.p();
                        } else if (iJ == 34) {
                            this.responseTypeUrl_ = jVar.I();
                        } else if (iJ == 40) {
                            this.responseStreaming_ = jVar.p();
                        } else if (iJ == 50) {
                            if (!(z2 & true)) {
                                this.options_ = new ArrayList();
                                z2 = true;
                            }
                            this.options_.add((Option) jVar.z(Option.parser(), tVar));
                        } else if (iJ != 56) {
                            if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                            }
                        } else {
                            this.syntax_ = jVar.s();
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
                    this.options_ = Collections.unmodifiableList(this.options_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (z2 & true) {
            this.options_ = Collections.unmodifiableList(this.options_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static Method parseFrom(j jVar, t tVar) throws IOException {
        return (Method) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
    }
}
