package com.google.protobuf;

import defpackage.q4n;
import defpackage.rc8;
import defpackage.vkh;
import defpackage.xbh;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class Enum extends GeneratedMessageV3 implements s0 {
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private List<EnumValue> enumvalue_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private List<Option> options_;
    private SourceContext sourceContext_;
    private int syntax_;
    private static final Enum DEFAULT_INSTANCE = new Enum();
    private static final vkh<Enum> PARSER = new a();

    public static class a extends c<Enum> {
        @Override // defpackage.vkh
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Enum parsePartialFrom(j jVar, t tVar) throws InvalidProtocolBufferException {
            return new Enum(jVar, tVar, null);
        }
    }

    public static final class b extends GeneratedMessageV3.b<b> implements s0 {
        public int e;
        public Object f;
        public List<EnumValue> g;
        public c1<EnumValue, EnumValue.b, rc8> h;
        public List<Option> i;
        public c1<Option, Option.b, xbh> j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public SourceContext f9510k;
        public h1<SourceContext, SourceContext.b, q4n> l;
        public int m;

        public /* synthetic */ b(a aVar) {
            this();
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                y();
                z();
            }
        }

        private void w() {
            if ((this.e & 2) == 0) {
                this.i = new ArrayList(this.i);
                this.e |= 2;
            }
        }

        private c1<Option, Option.b, xbh> z() {
            if (this.j == null) {
                this.j = new c1<>(this.i, (this.e & 2) != 0, g(), isClean());
                this.i = null;
            }
            return this.j;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(j jVar, t tVar) throws Throwable {
            Enum r0 = null;
            try {
                try {
                    Enum r3 = (Enum) Enum.PARSER.parsePartialFrom(jVar, tVar);
                    if (r3 != null) {
                        B(r3);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    Enum r4 = (Enum) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        r0 = r4;
                        if (r0 != null) {
                            B(r0);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (r0 != null) {
                    B(r0);
                }
                throw th;
            }
        }

        public b B(Enum r4) {
            if (r4 == Enum.getDefaultInstance()) {
                return this;
            }
            if (!r4.getName().isEmpty()) {
                this.f = r4.name_;
                onChanged();
            }
            if (this.h == null) {
                if (!r4.enumvalue_.isEmpty()) {
                    if (this.g.isEmpty()) {
                        this.g = r4.enumvalue_;
                        this.e &= -2;
                    } else {
                        v();
                        this.g.addAll(r4.enumvalue_);
                    }
                    onChanged();
                }
            } else if (!r4.enumvalue_.isEmpty()) {
                if (this.h.j()) {
                    this.h.f();
                    this.h = null;
                    this.g = r4.enumvalue_;
                    this.e &= -2;
                    this.h = GeneratedMessageV3.alwaysUseFieldBuilders ? y() : null;
                } else {
                    this.h.b(r4.enumvalue_);
                }
            }
            if (this.j == null) {
                if (!r4.options_.isEmpty()) {
                    if (this.i.isEmpty()) {
                        this.i = r4.options_;
                        this.e &= -3;
                    } else {
                        w();
                        this.i.addAll(r4.options_);
                    }
                    onChanged();
                }
            } else if (!r4.options_.isEmpty()) {
                if (this.j.j()) {
                    this.j.f();
                    this.j = null;
                    this.i = r4.options_;
                    this.e &= -3;
                    this.j = GeneratedMessageV3.alwaysUseFieldBuilders ? z() : null;
                } else {
                    this.j.b(r4.options_);
                }
            }
            if (r4.hasSourceContext()) {
                D(r4.getSourceContext());
            }
            if (r4.syntax_ != 0) {
                H(r4.getSyntaxValue());
            }
            mo145mergeUnknownFields(r4.unknownFields);
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(p0 p0Var) {
            if (p0Var instanceof Enum) {
                return B((Enum) p0Var);
            }
            super.mergeFrom(p0Var);
            return this;
        }

        public b D(SourceContext sourceContext) {
            h1<SourceContext, SourceContext.b, q4n> h1Var = this.l;
            if (h1Var == null) {
                SourceContext sourceContext2 = this.f9510k;
                if (sourceContext2 != null) {
                    this.f9510k = SourceContext.newBuilder(sourceContext2).y(sourceContext).buildPartial();
                } else {
                    this.f9510k = sourceContext;
                }
                onChanged();
            } else {
                h1Var.g(sourceContext);
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public final b mo145mergeUnknownFields(r1 r1Var) {
            return (b) super.mo145mergeUnknownFields(r1Var);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.setField(fieldDescriptor, obj);
        }

        public b H(int i) {
            this.m = i;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public final b setUnknownFields(r1 r1Var) {
            return (b) super.setUnknownFields(r1Var);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
        public Descriptors.b getDescriptorForType() {
            return o1.e;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        public GeneratedMessageV3.e h() {
            return o1.f.d(Enum.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Enum build() {
            Enum enumBuildPartial = buildPartial();
            if (enumBuildPartial.isInitialized()) {
                return enumBuildPartial;
            }
            throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) enumBuildPartial);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Enum buildPartial() {
            Enum r0 = new Enum(this, (a) null);
            r0.name_ = this.f;
            c1<EnumValue, EnumValue.b, rc8> c1Var = this.h;
            if (c1Var == null) {
                if ((this.e & 1) != 0) {
                    this.g = Collections.unmodifiableList(this.g);
                    this.e &= -2;
                }
                r0.enumvalue_ = this.g;
            } else {
                r0.enumvalue_ = c1Var.d();
            }
            c1<Option, Option.b, xbh> c1Var2 = this.j;
            if (c1Var2 == null) {
                if ((this.e & 2) != 0) {
                    this.i = Collections.unmodifiableList(this.i);
                    this.e &= -3;
                }
                r0.options_ = this.i;
            } else {
                r0.options_ = c1Var2.d();
            }
            h1<SourceContext, SourceContext.b, q4n> h1Var = this.l;
            if (h1Var == null) {
                r0.sourceContext_ = this.f9510k;
            } else {
                r0.sourceContext_ = (SourceContext) h1Var.b();
            }
            r0.syntax_ = this.m;
            onBuilt();
            return r0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mo142clear() {
            super.mo142clear();
            this.f = "";
            c1<EnumValue, EnumValue.b, rc8> c1Var = this.h;
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
            if (this.l == null) {
                this.f9510k = null;
            } else {
                this.f9510k = null;
                this.l = null;
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

        public final void v() {
            if ((this.e & 1) == 0) {
                this.g = new ArrayList(this.g);
                this.e |= 1;
            }
        }

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public Enum getDefaultInstanceForType() {
            return Enum.getDefaultInstance();
        }

        public final c1<EnumValue, EnumValue.b, rc8> y() {
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
            this.m = 0;
            maybeForceBuilderInitialization();
        }

        public b(GeneratedMessageV3.c cVar) {
            super(cVar);
            this.f = "";
            this.g = Collections.emptyList();
            this.i = Collections.emptyList();
            this.m = 0;
            maybeForceBuilderInitialization();
        }
    }

    public /* synthetic */ Enum(j jVar, t tVar, a aVar) throws InvalidProtocolBufferException {
        this(jVar, tVar);
    }

    public static Enum getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.b getDescriptor() {
        return o1.e;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Enum parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Enum) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static vkh<Enum> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.a
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Enum)) {
            return super.equals(obj);
        }
        Enum r5 = (Enum) obj;
        if (getName().equals(r5.getName()) && getEnumvalueList().equals(r5.getEnumvalueList()) && getOptionsList().equals(r5.getOptionsList()) && hasSourceContext() == r5.hasSourceContext()) {
            return (!hasSourceContext() || getSourceContext().equals(r5.getSourceContext())) && this.syntax_ == r5.syntax_ && this.unknownFields.equals(r5.unknownFields);
        }
        return false;
    }

    public EnumValue getEnumvalue(int i) {
        return this.enumvalue_.get(i);
    }

    public int getEnumvalueCount() {
        return this.enumvalue_.size();
    }

    public List<EnumValue> getEnumvalueList() {
        return this.enumvalue_;
    }

    public rc8 getEnumvalueOrBuilder(int i) {
        return this.enumvalue_.get(i);
    }

    public List<? extends rc8> getEnumvalueOrBuilderList() {
        return this.enumvalue_;
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
    public vkh<Enum> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !getNameBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
        for (int i2 = 0; i2 < this.enumvalue_.size(); i2++) {
            iComputeStringSize += CodedOutputStream.G(2, this.enumvalue_.get(i2));
        }
        for (int i3 = 0; i3 < this.options_.size(); i3++) {
            iComputeStringSize += CodedOutputStream.G(3, this.options_.get(i3));
        }
        if (this.sourceContext_ != null) {
            iComputeStringSize += CodedOutputStream.G(4, getSourceContext());
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            iComputeStringSize += CodedOutputStream.l(5, this.syntax_);
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
        if (getEnumvalueCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getEnumvalueList().hashCode();
        }
        if (getOptionsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getOptionsList().hashCode();
        }
        if (hasSourceContext()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getSourceContext().hashCode();
        }
        int iHashCode2 = (((((iHashCode * 37) + 5) * 53) + this.syntax_) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.e internalGetFieldAccessorTable() {
        return o1.f.d(Enum.class, b.class);
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
        return new Enum();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
        }
        for (int i = 0; i < this.enumvalue_.size(); i++) {
            codedOutputStream.K0(2, this.enumvalue_.get(i));
        }
        for (int i2 = 0; i2 < this.options_.size(); i2++) {
            codedOutputStream.K0(3, this.options_.get(i2));
        }
        if (this.sourceContext_ != null) {
            codedOutputStream.K0(4, getSourceContext());
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            codedOutputStream.u0(5, this.syntax_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public /* synthetic */ Enum(GeneratedMessageV3.b bVar, a aVar) {
        this(bVar);
    }

    public static b newBuilder(Enum r1) {
        return DEFAULT_INSTANCE.toBuilder().B(r1);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, tVar);
    }

    private Enum(GeneratedMessageV3.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Enum parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (Enum) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
    }

    public static Enum parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
    public Enum getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public b toBuilder() {
        a aVar = null;
        return this == DEFAULT_INSTANCE ? new b(aVar) : new b(aVar).B(this);
    }

    public static Enum parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, tVar);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public b newBuilderForType() {
        return newBuilder();
    }

    private Enum() {
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.enumvalue_ = Collections.emptyList();
        this.options_ = Collections.emptyList();
        this.syntax_ = 0;
    }

    public static Enum parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public b newBuilderForType(GeneratedMessageV3.c cVar) {
        return new b(cVar, null);
    }

    public static Enum parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, tVar);
    }

    public static Enum parseFrom(InputStream inputStream) throws IOException {
        return (Enum) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Enum parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (Enum) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
    }

    private Enum(j jVar, t tVar) throws InvalidProtocolBufferException {
        this();
        tVar.getClass();
        r1.b bVarG = r1.g();
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iJ = jVar.J();
                    if (iJ != 0) {
                        if (iJ == 10) {
                            this.name_ = jVar.I();
                        } else if (iJ == 18) {
                            if ((i & 1) == 0) {
                                this.enumvalue_ = new ArrayList();
                                i |= 1;
                            }
                            this.enumvalue_.add((EnumValue) jVar.z(EnumValue.parser(), tVar));
                        } else if (iJ == 26) {
                            if ((i & 2) == 0) {
                                this.options_ = new ArrayList();
                                i |= 2;
                            }
                            this.options_.add((Option) jVar.z(Option.parser(), tVar));
                        } else if (iJ == 34) {
                            SourceContext sourceContext = this.sourceContext_;
                            SourceContext.b builder = sourceContext != null ? sourceContext.toBuilder() : null;
                            SourceContext sourceContext2 = (SourceContext) jVar.z(SourceContext.parser(), tVar);
                            this.sourceContext_ = sourceContext2;
                            if (builder != null) {
                                builder.y(sourceContext2);
                                this.sourceContext_ = builder.buildPartial();
                            }
                        } else if (iJ != 40) {
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
                if ((i & 1) != 0) {
                    this.enumvalue_ = Collections.unmodifiableList(this.enumvalue_);
                }
                if ((i & 2) != 0) {
                    this.options_ = Collections.unmodifiableList(this.options_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if ((i & 1) != 0) {
            this.enumvalue_ = Collections.unmodifiableList(this.enumvalue_);
        }
        if ((i & 2) != 0) {
            this.options_ = Collections.unmodifiableList(this.options_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static Enum parseFrom(j jVar) throws IOException {
        return (Enum) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
    }

    public static Enum parseFrom(j jVar, t tVar) throws IOException {
        return (Enum) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
    }
}
