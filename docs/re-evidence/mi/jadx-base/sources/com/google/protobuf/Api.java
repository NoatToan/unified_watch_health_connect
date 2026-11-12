package com.google.protobuf;

import defpackage.q4n;
import defpackage.t6g;
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
public final class Api extends GeneratedMessageV3 implements s0 {
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private List<Method> methods_;
    private List<Mixin> mixins_;
    private volatile Object name_;
    private List<Option> options_;
    private SourceContext sourceContext_;
    private int syntax_;
    private volatile Object version_;
    private static final Api DEFAULT_INSTANCE = new Api();
    private static final vkh<Api> PARSER = new a();

    public static class a extends c<Api> {
        @Override // defpackage.vkh
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Api parsePartialFrom(j jVar, t tVar) throws InvalidProtocolBufferException {
            return new Api(jVar, tVar, null);
        }
    }

    public static final class b extends GeneratedMessageV3.b<b> implements s0 {
        public int e;
        public Object f;
        public List<Method> g;
        public c1<Method, Method.b, ztf> h;
        public List<Option> i;
        public c1<Option, Option.b, xbh> j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f9454k;
        public SourceContext l;
        public h1<SourceContext, SourceContext.b, q4n> m;
        public List<Mixin> n;
        public c1<Mixin, Mixin.b, t6g> o;
        public int p;

        public /* synthetic */ b(a aVar) {
            this();
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                z();
                B();
                A();
            }
        }

        public final c1<Mixin, Mixin.b, t6g> A() {
            if (this.o == null) {
                this.o = new c1<>(this.n, (this.e & 4) != 0, g(), isClean());
                this.n = null;
            }
            return this.o;
        }

        public final c1<Option, Option.b, xbh> B() {
            if (this.j == null) {
                this.j = new c1<>(this.i, (this.e & 2) != 0, g(), isClean());
                this.i = null;
            }
            return this.j;
        }

        public b C(Api api) {
            if (api == Api.getDefaultInstance()) {
                return this;
            }
            if (!api.getName().isEmpty()) {
                this.f = api.name_;
                onChanged();
            }
            if (this.h == null) {
                if (!api.methods_.isEmpty()) {
                    if (this.g.isEmpty()) {
                        this.g = api.methods_;
                        this.e &= -2;
                    } else {
                        v();
                        this.g.addAll(api.methods_);
                    }
                    onChanged();
                }
            } else if (!api.methods_.isEmpty()) {
                if (this.h.j()) {
                    this.h.f();
                    this.h = null;
                    this.g = api.methods_;
                    this.e &= -2;
                    this.h = GeneratedMessageV3.alwaysUseFieldBuilders ? z() : null;
                } else {
                    this.h.b(api.methods_);
                }
            }
            if (this.j == null) {
                if (!api.options_.isEmpty()) {
                    if (this.i.isEmpty()) {
                        this.i = api.options_;
                        this.e &= -3;
                    } else {
                        x();
                        this.i.addAll(api.options_);
                    }
                    onChanged();
                }
            } else if (!api.options_.isEmpty()) {
                if (this.j.j()) {
                    this.j.f();
                    this.j = null;
                    this.i = api.options_;
                    this.e &= -3;
                    this.j = GeneratedMessageV3.alwaysUseFieldBuilders ? B() : null;
                } else {
                    this.j.b(api.options_);
                }
            }
            if (!api.getVersion().isEmpty()) {
                this.f9454k = api.version_;
                onChanged();
            }
            if (api.hasSourceContext()) {
                G(api.getSourceContext());
            }
            if (this.o == null) {
                if (!api.mixins_.isEmpty()) {
                    if (this.n.isEmpty()) {
                        this.n = api.mixins_;
                        this.e &= -5;
                    } else {
                        w();
                        this.n.addAll(api.mixins_);
                    }
                    onChanged();
                }
            } else if (!api.mixins_.isEmpty()) {
                if (this.o.j()) {
                    this.o.f();
                    this.o = null;
                    this.n = api.mixins_;
                    this.e &= -5;
                    this.o = GeneratedMessageV3.alwaysUseFieldBuilders ? A() : null;
                } else {
                    this.o.b(api.mixins_);
                }
            }
            if (api.syntax_ != 0) {
                J(api.getSyntaxValue());
            }
            mo145mergeUnknownFields(api.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(j jVar, t tVar) throws Throwable {
            Api api = null;
            try {
                try {
                    Api api2 = (Api) Api.PARSER.parsePartialFrom(jVar, tVar);
                    if (api2 != null) {
                        C(api2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    Api api3 = (Api) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        api = api3;
                        if (api != null) {
                            C(api);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (api != null) {
                    C(api);
                }
                throw th;
            }
        }

        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(p0 p0Var) {
            if (p0Var instanceof Api) {
                return C((Api) p0Var);
            }
            super.mergeFrom(p0Var);
            return this;
        }

        public b G(SourceContext sourceContext) {
            h1<SourceContext, SourceContext.b, q4n> h1Var = this.m;
            if (h1Var == null) {
                SourceContext sourceContext2 = this.l;
                if (sourceContext2 != null) {
                    this.l = SourceContext.newBuilder(sourceContext2).y(sourceContext).buildPartial();
                } else {
                    this.l = sourceContext;
                }
                onChanged();
            } else {
                h1Var.g(sourceContext);
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final b mo145mergeUnknownFields(r1 r1Var) {
            return (b) super.mo145mergeUnknownFields(r1Var);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.setField(fieldDescriptor, obj);
        }

        public b J(int i) {
            this.p = i;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public final b setUnknownFields(r1 r1Var) {
            return (b) super.setUnknownFields(r1Var);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
        public Descriptors.b getDescriptorForType() {
            return f.f9633a;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        public GeneratedMessageV3.e h() {
            return f.f9634b.d(Api.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Api build() {
            Api apiBuildPartial = buildPartial();
            if (apiBuildPartial.isInitialized()) {
                return apiBuildPartial;
            }
            throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) apiBuildPartial);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Api buildPartial() {
            Api api = new Api(this, (a) null);
            api.name_ = this.f;
            c1<Method, Method.b, ztf> c1Var = this.h;
            if (c1Var == null) {
                if ((this.e & 1) != 0) {
                    this.g = Collections.unmodifiableList(this.g);
                    this.e &= -2;
                }
                api.methods_ = this.g;
            } else {
                api.methods_ = c1Var.d();
            }
            c1<Option, Option.b, xbh> c1Var2 = this.j;
            if (c1Var2 == null) {
                if ((this.e & 2) != 0) {
                    this.i = Collections.unmodifiableList(this.i);
                    this.e &= -3;
                }
                api.options_ = this.i;
            } else {
                api.options_ = c1Var2.d();
            }
            api.version_ = this.f9454k;
            h1<SourceContext, SourceContext.b, q4n> h1Var = this.m;
            if (h1Var == null) {
                api.sourceContext_ = this.l;
            } else {
                api.sourceContext_ = (SourceContext) h1Var.b();
            }
            c1<Mixin, Mixin.b, t6g> c1Var3 = this.o;
            if (c1Var3 == null) {
                if ((this.e & 4) != 0) {
                    this.n = Collections.unmodifiableList(this.n);
                    this.e &= -5;
                }
                api.mixins_ = this.n;
            } else {
                api.mixins_ = c1Var3.d();
            }
            api.syntax_ = this.p;
            onBuilt();
            return api;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mo142clear() {
            super.mo142clear();
            this.f = "";
            c1<Method, Method.b, ztf> c1Var = this.h;
            if (c1Var == null) {
                this.g = Collections.emptyList();
                this.e &= -2;
            } else {
                c1Var.e();
            }
            c1<Option, Option.b, xbh> c1Var2 = this.j;
            if (c1Var2 == null) {
                this.i = Collections.emptyList();
                this.e &= -3;
            } else {
                c1Var2.e();
            }
            this.f9454k = "";
            if (this.m == null) {
                this.l = null;
            } else {
                this.l = null;
                this.m = null;
            }
            c1<Mixin, Mixin.b, t6g> c1Var3 = this.o;
            if (c1Var3 == null) {
                this.n = Collections.emptyList();
                this.e &= -5;
            } else {
                c1Var3.e();
            }
            this.p = 0;
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
                this.g = new ArrayList(this.g);
                this.e |= 1;
            }
        }

        public final void w() {
            if ((this.e & 4) == 0) {
                this.n = new ArrayList(this.n);
                this.e |= 4;
            }
        }

        public final void x() {
            if ((this.e & 2) == 0) {
                this.i = new ArrayList(this.i);
                this.e |= 2;
            }
        }

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Api getDefaultInstanceForType() {
            return Api.getDefaultInstance();
        }

        public final c1<Method, Method.b, ztf> z() {
            if (this.h == null) {
                this.h = new c1<>(this.g, (this.e & 1) != 0, g(), isClean());
                this.g = null;
            }
            return this.h;
        }

        public /* synthetic */ b(GeneratedMessageV3.c cVar, a aVar) {
            this(cVar);
        }

        public b() {
            this.f = "";
            this.g = Collections.emptyList();
            this.i = Collections.emptyList();
            this.f9454k = "";
            this.n = Collections.emptyList();
            this.p = 0;
            maybeForceBuilderInitialization();
        }

        public b(GeneratedMessageV3.c cVar) {
            super(cVar);
            this.f = "";
            this.g = Collections.emptyList();
            this.i = Collections.emptyList();
            this.f9454k = "";
            this.n = Collections.emptyList();
            this.p = 0;
            maybeForceBuilderInitialization();
        }
    }

    public /* synthetic */ Api(j jVar, t tVar, a aVar) throws InvalidProtocolBufferException {
        this(jVar, tVar);
    }

    public static Api getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.b getDescriptor() {
        return f.f9633a;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Api parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Api) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Api parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static vkh<Api> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.a
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Api)) {
            return super.equals(obj);
        }
        Api api = (Api) obj;
        if (getName().equals(api.getName()) && getMethodsList().equals(api.getMethodsList()) && getOptionsList().equals(api.getOptionsList()) && getVersion().equals(api.getVersion()) && hasSourceContext() == api.hasSourceContext()) {
            return (!hasSourceContext() || getSourceContext().equals(api.getSourceContext())) && getMixinsList().equals(api.getMixinsList()) && this.syntax_ == api.syntax_ && this.unknownFields.equals(api.unknownFields);
        }
        return false;
    }

    public Method getMethods(int i) {
        return this.methods_.get(i);
    }

    public int getMethodsCount() {
        return this.methods_.size();
    }

    public List<Method> getMethodsList() {
        return this.methods_;
    }

    public ztf getMethodsOrBuilder(int i) {
        return this.methods_.get(i);
    }

    public List<? extends ztf> getMethodsOrBuilderList() {
        return this.methods_;
    }

    public Mixin getMixins(int i) {
        return this.mixins_.get(i);
    }

    public int getMixinsCount() {
        return this.mixins_.size();
    }

    public List<Mixin> getMixinsList() {
        return this.mixins_;
    }

    public t6g getMixinsOrBuilder(int i) {
        return this.mixins_.get(i);
    }

    public List<? extends t6g> getMixinsOrBuilderList() {
        return this.mixins_;
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
    public vkh<Api> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !getNameBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
        for (int i2 = 0; i2 < this.methods_.size(); i2++) {
            iComputeStringSize += CodedOutputStream.G(2, this.methods_.get(i2));
        }
        for (int i3 = 0; i3 < this.options_.size(); i3++) {
            iComputeStringSize += CodedOutputStream.G(3, this.options_.get(i3));
        }
        if (!getVersionBytes().isEmpty()) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.version_);
        }
        if (this.sourceContext_ != null) {
            iComputeStringSize += CodedOutputStream.G(5, getSourceContext());
        }
        for (int i4 = 0; i4 < this.mixins_.size(); i4++) {
            iComputeStringSize += CodedOutputStream.G(6, this.mixins_.get(i4));
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            iComputeStringSize += CodedOutputStream.l(7, this.syntax_);
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    public q4n getSourceContextOrBuilder() {
        return getSourceContext();
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

    public String getVersion() {
        Object obj = this.version_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.version_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getVersionBytes() {
        Object obj = this.version_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.version_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public boolean hasSourceContext() {
        return this.sourceContext_ != null;
    }

    @Override // com.google.protobuf.a
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode();
        if (getMethodsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getMethodsList().hashCode();
        }
        if (getOptionsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getOptionsList().hashCode();
        }
        int iHashCode2 = (((iHashCode * 37) + 4) * 53) + getVersion().hashCode();
        if (hasSourceContext()) {
            iHashCode2 = (((iHashCode2 * 37) + 5) * 53) + getSourceContext().hashCode();
        }
        if (getMixinsCount() > 0) {
            iHashCode2 = (((iHashCode2 * 37) + 6) * 53) + getMixinsList().hashCode();
        }
        int iHashCode3 = (((((iHashCode2 * 37) + 7) * 53) + this.syntax_) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.e internalGetFieldAccessorTable() {
        return f.f9634b.d(Api.class, b.class);
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
        return new Api();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
        }
        for (int i = 0; i < this.methods_.size(); i++) {
            codedOutputStream.K0(2, this.methods_.get(i));
        }
        for (int i2 = 0; i2 < this.options_.size(); i2++) {
            codedOutputStream.K0(3, this.options_.get(i2));
        }
        if (!getVersionBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.version_);
        }
        if (this.sourceContext_ != null) {
            codedOutputStream.K0(5, getSourceContext());
        }
        for (int i3 = 0; i3 < this.mixins_.size(); i3++) {
            codedOutputStream.K0(6, this.mixins_.get(i3));
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            codedOutputStream.u0(7, this.syntax_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public /* synthetic */ Api(GeneratedMessageV3.b bVar, a aVar) {
        this(bVar);
    }

    public static b newBuilder(Api api) {
        return DEFAULT_INSTANCE.toBuilder().C(api);
    }

    public static Api parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, tVar);
    }

    private Api(GeneratedMessageV3.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Api parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (Api) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
    }

    public static Api parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
    public Api getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public b toBuilder() {
        a aVar = null;
        return this == DEFAULT_INSTANCE ? new b(aVar) : new b(aVar).C(this);
    }

    public static Api parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, tVar);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public b newBuilderForType() {
        return newBuilder();
    }

    private Api() {
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.methods_ = Collections.emptyList();
        this.options_ = Collections.emptyList();
        this.version_ = "";
        this.mixins_ = Collections.emptyList();
        this.syntax_ = 0;
    }

    public static Api parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public b newBuilderForType(GeneratedMessageV3.c cVar) {
        return new b(cVar, null);
    }

    public static Api parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, tVar);
    }

    public static Api parseFrom(InputStream inputStream) throws IOException {
        return (Api) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Api parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (Api) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
    }

    public static Api parseFrom(j jVar) throws IOException {
        return (Api) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
    }

    private Api(j jVar, t tVar) throws InvalidProtocolBufferException {
        this();
        tVar.getClass();
        r1.b bVarG = r1.g();
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iJ = jVar.J();
                        if (iJ != 0) {
                            if (iJ == 10) {
                                this.name_ = jVar.I();
                            } else if (iJ == 18) {
                                if ((i & 1) == 0) {
                                    this.methods_ = new ArrayList();
                                    i |= 1;
                                }
                                this.methods_.add((Method) jVar.z(Method.parser(), tVar));
                            } else if (iJ == 26) {
                                if ((i & 2) == 0) {
                                    this.options_ = new ArrayList();
                                    i |= 2;
                                }
                                this.options_.add((Option) jVar.z(Option.parser(), tVar));
                            } else if (iJ == 34) {
                                this.version_ = jVar.I();
                            } else if (iJ == 42) {
                                SourceContext sourceContext = this.sourceContext_;
                                SourceContext.b builder = sourceContext != null ? sourceContext.toBuilder() : null;
                                SourceContext sourceContext2 = (SourceContext) jVar.z(SourceContext.parser(), tVar);
                                this.sourceContext_ = sourceContext2;
                                if (builder != null) {
                                    builder.y(sourceContext2);
                                    this.sourceContext_ = builder.buildPartial();
                                }
                            } else if (iJ == 50) {
                                if ((i & 4) == 0) {
                                    this.mixins_ = new ArrayList();
                                    i |= 4;
                                }
                                this.mixins_.add((Mixin) jVar.z(Mixin.parser(), tVar));
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
                    }
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if ((i & 1) != 0) {
                    this.methods_ = Collections.unmodifiableList(this.methods_);
                }
                if ((i & 2) != 0) {
                    this.options_ = Collections.unmodifiableList(this.options_);
                }
                if ((i & 4) != 0) {
                    this.mixins_ = Collections.unmodifiableList(this.mixins_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if ((i & 1) != 0) {
            this.methods_ = Collections.unmodifiableList(this.methods_);
        }
        if ((i & 2) != 0) {
            this.options_ = Collections.unmodifiableList(this.options_);
        }
        if ((i & 4) != 0) {
            this.mixins_ = Collections.unmodifiableList(this.mixins_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static Api parseFrom(j jVar, t tVar) throws IOException {
        return (Api) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
    }
}
