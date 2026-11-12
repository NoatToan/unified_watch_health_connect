package com.google.protobuf;

import defpackage.bei;
import defpackage.q4n;
import defpackage.ree;
import defpackage.vkh;
import defpackage.xbh;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class Type extends GeneratedMessageV3 implements s0 {
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private static final long serialVersionUID = 0;
    private List<Field> fields_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private ree oneofs_;
    private List<Option> options_;
    private SourceContext sourceContext_;
    private int syntax_;
    private static final Type DEFAULT_INSTANCE = new Type();
    private static final vkh<Type> PARSER = new a();

    public static class a extends c<Type> {
        @Override // defpackage.vkh
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Type parsePartialFrom(j jVar, t tVar) throws InvalidProtocolBufferException {
            return new Type(jVar, tVar, null);
        }
    }

    public static final class b extends GeneratedMessageV3.b<b> implements s0 {
        public int e;
        public Object f;
        public List<Field> g;
        public c1<Field, Field.b, z> h;
        public ree i;
        public List<Option> j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public c1<Option, Option.b, xbh> f9591k;
        public SourceContext l;
        public h1<SourceContext, SourceContext.b, q4n> m;
        public int n;

        public /* synthetic */ b(GeneratedMessageV3.c cVar, a aVar) {
            this(cVar);
        }

        private c1<Option, Option.b, xbh> A() {
            if (this.f9591k == null) {
                this.f9591k = new c1<>(this.j, (this.e & 4) != 0, g(), isClean());
                this.j = null;
            }
            return this.f9591k;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                z();
                A();
            }
        }

        private void x() {
            if ((this.e & 4) == 0) {
                this.j = new ArrayList(this.j);
                this.e |= 4;
            }
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(j jVar, t tVar) throws Throwable {
            Type type = null;
            try {
                try {
                    Type type2 = (Type) Type.PARSER.parsePartialFrom(jVar, tVar);
                    if (type2 != null) {
                        D(type2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    Type type3 = (Type) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        type = type3;
                        if (type != null) {
                            D(type);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (type != null) {
                    D(type);
                }
                throw th;
            }
        }

        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(p0 p0Var) {
            if (p0Var instanceof Type) {
                return D((Type) p0Var);
            }
            super.mergeFrom(p0Var);
            return this;
        }

        public b D(Type type) {
            if (type == Type.getDefaultInstance()) {
                return this;
            }
            if (!type.getName().isEmpty()) {
                this.f = type.name_;
                onChanged();
            }
            if (this.h == null) {
                if (!type.fields_.isEmpty()) {
                    if (this.g.isEmpty()) {
                        this.g = type.fields_;
                        this.e &= -2;
                    } else {
                        v();
                        this.g.addAll(type.fields_);
                    }
                    onChanged();
                }
            } else if (!type.fields_.isEmpty()) {
                if (this.h.j()) {
                    this.h.f();
                    this.h = null;
                    this.g = type.fields_;
                    this.e &= -2;
                    this.h = GeneratedMessageV3.alwaysUseFieldBuilders ? z() : null;
                } else {
                    this.h.b(type.fields_);
                }
            }
            if (!type.oneofs_.isEmpty()) {
                if (this.i.isEmpty()) {
                    this.i = type.oneofs_;
                    this.e &= -3;
                } else {
                    w();
                    this.i.addAll(type.oneofs_);
                }
                onChanged();
            }
            if (this.f9591k == null) {
                if (!type.options_.isEmpty()) {
                    if (this.j.isEmpty()) {
                        this.j = type.options_;
                        this.e &= -5;
                    } else {
                        x();
                        this.j.addAll(type.options_);
                    }
                    onChanged();
                }
            } else if (!type.options_.isEmpty()) {
                if (this.f9591k.j()) {
                    this.f9591k.f();
                    this.f9591k = null;
                    this.j = type.options_;
                    this.e &= -5;
                    this.f9591k = GeneratedMessageV3.alwaysUseFieldBuilders ? A() : null;
                } else {
                    this.f9591k.b(type.options_);
                }
            }
            if (type.hasSourceContext()) {
                F(type.getSourceContext());
            }
            if (type.syntax_ != 0) {
                I(type.getSyntaxValue());
            }
            mo145mergeUnknownFields(type.unknownFields);
            onChanged();
            return this;
        }

        public b F(SourceContext sourceContext) {
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
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public final b mo145mergeUnknownFields(r1 r1Var) {
            return (b) super.mo145mergeUnknownFields(r1Var);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.setField(fieldDescriptor, obj);
        }

        public b I(int i) {
            this.n = i;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public final b setUnknownFields(r1 r1Var) {
            return (b) super.setUnknownFields(r1Var);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
        public Descriptors.b getDescriptorForType() {
            return o1.f9725a;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        public GeneratedMessageV3.e h() {
            return o1.f9726b.d(Type.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Type build() {
            Type typeBuildPartial = buildPartial();
            if (typeBuildPartial.isInitialized()) {
                return typeBuildPartial;
            }
            throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) typeBuildPartial);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Type buildPartial() {
            Type type = new Type(this, (a) null);
            type.name_ = this.f;
            c1<Field, Field.b, z> c1Var = this.h;
            if (c1Var == null) {
                if ((this.e & 1) != 0) {
                    this.g = Collections.unmodifiableList(this.g);
                    this.e &= -2;
                }
                type.fields_ = this.g;
            } else {
                type.fields_ = c1Var.d();
            }
            if ((this.e & 2) != 0) {
                this.i = this.i.getUnmodifiableView();
                this.e &= -3;
            }
            type.oneofs_ = this.i;
            c1<Option, Option.b, xbh> c1Var2 = this.f9591k;
            if (c1Var2 == null) {
                if ((this.e & 4) != 0) {
                    this.j = Collections.unmodifiableList(this.j);
                    this.e &= -5;
                }
                type.options_ = this.j;
            } else {
                type.options_ = c1Var2.d();
            }
            h1<SourceContext, SourceContext.b, q4n> h1Var = this.m;
            if (h1Var == null) {
                type.sourceContext_ = this.l;
            } else {
                type.sourceContext_ = (SourceContext) h1Var.b();
            }
            type.syntax_ = this.n;
            onBuilt();
            return type;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mo142clear() {
            super.mo142clear();
            this.f = "";
            c1<Field, Field.b, z> c1Var = this.h;
            if (c1Var == null) {
                this.g = Collections.emptyList();
                this.e &= -2;
            } else {
                c1Var.e();
            }
            this.i = g0.d;
            this.e &= -3;
            c1<Option, Option.b, xbh> c1Var2 = this.f9591k;
            if (c1Var2 == null) {
                this.j = Collections.emptyList();
                this.e &= -5;
            } else {
                c1Var2.e();
            }
            if (this.m == null) {
                this.l = null;
            } else {
                this.l = null;
                this.m = null;
            }
            this.n = 0;
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
            if ((this.e & 2) == 0) {
                this.i = new g0(this.i);
                this.e |= 2;
            }
        }

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Type getDefaultInstanceForType() {
            return Type.getDefaultInstance();
        }

        public final c1<Field, Field.b, z> z() {
            if (this.h == null) {
                this.h = new c1<>(this.g, (this.e & 1) != 0, g(), isClean());
                this.g = null;
            }
            return this.h;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            this.f = "";
            this.g = Collections.emptyList();
            this.i = g0.d;
            this.j = Collections.emptyList();
            this.n = 0;
            maybeForceBuilderInitialization();
        }

        public b(GeneratedMessageV3.c cVar) {
            super(cVar);
            this.f = "";
            this.g = Collections.emptyList();
            this.i = g0.d;
            this.j = Collections.emptyList();
            this.n = 0;
            maybeForceBuilderInitialization();
        }
    }

    public /* synthetic */ Type(j jVar, t tVar, a aVar) throws InvalidProtocolBufferException {
        this(jVar, tVar);
    }

    public static Type getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.b getDescriptor() {
        return o1.f9725a;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Type parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Type) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Type parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static vkh<Type> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.a
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Type)) {
            return super.equals(obj);
        }
        Type type = (Type) obj;
        if (getName().equals(type.getName()) && getFieldsList().equals(type.getFieldsList()) && m157getOneofsList().equals(type.m157getOneofsList()) && getOptionsList().equals(type.getOptionsList()) && hasSourceContext() == type.hasSourceContext()) {
            return (!hasSourceContext() || getSourceContext().equals(type.getSourceContext())) && this.syntax_ == type.syntax_ && this.unknownFields.equals(type.unknownFields);
        }
        return false;
    }

    public Field getFields(int i) {
        return this.fields_.get(i);
    }

    public int getFieldsCount() {
        return this.fields_.size();
    }

    public List<Field> getFieldsList() {
        return this.fields_;
    }

    public z getFieldsOrBuilder(int i) {
        return this.fields_.get(i);
    }

    public List<? extends z> getFieldsOrBuilderList() {
        return this.fields_;
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

    public String getOneofs(int i) {
        return this.oneofs_.get(i);
    }

    public ByteString getOneofsBytes(int i) {
        return this.oneofs_.getByteString(i);
    }

    public int getOneofsCount() {
        return this.oneofs_.size();
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
    public vkh<Type> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !getNameBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
        for (int i2 = 0; i2 < this.fields_.size(); i2++) {
            iComputeStringSize += CodedOutputStream.G(2, this.fields_.get(i2));
        }
        int iComputeStringSizeNoTag = 0;
        for (int i3 = 0; i3 < this.oneofs_.size(); i3++) {
            iComputeStringSizeNoTag += GeneratedMessageV3.computeStringSizeNoTag(this.oneofs_.d(i3));
        }
        int size = iComputeStringSize + iComputeStringSizeNoTag + m157getOneofsList().size();
        for (int i4 = 0; i4 < this.options_.size(); i4++) {
            size += CodedOutputStream.G(4, this.options_.get(i4));
        }
        if (this.sourceContext_ != null) {
            size += CodedOutputStream.G(5, getSourceContext());
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            size += CodedOutputStream.l(6, this.syntax_);
        }
        int serializedSize = size + this.unknownFields.getSerializedSize();
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
        if (getFieldsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getFieldsList().hashCode();
        }
        if (getOneofsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + m157getOneofsList().hashCode();
        }
        if (getOptionsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getOptionsList().hashCode();
        }
        if (hasSourceContext()) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + getSourceContext().hashCode();
        }
        int iHashCode2 = (((((iHashCode * 37) + 6) * 53) + this.syntax_) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.e internalGetFieldAccessorTable() {
        return o1.f9726b.d(Type.class, b.class);
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
        return new Type();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
        }
        for (int i = 0; i < this.fields_.size(); i++) {
            codedOutputStream.K0(2, this.fields_.get(i));
        }
        for (int i2 = 0; i2 < this.oneofs_.size(); i2++) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.oneofs_.d(i2));
        }
        for (int i3 = 0; i3 < this.options_.size(); i3++) {
            codedOutputStream.K0(4, this.options_.get(i3));
        }
        if (this.sourceContext_ != null) {
            codedOutputStream.K0(5, getSourceContext());
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            codedOutputStream.u0(6, this.syntax_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public /* synthetic */ Type(GeneratedMessageV3.b bVar, a aVar) {
        this(bVar);
    }

    public static b newBuilder(Type type) {
        return DEFAULT_INSTANCE.toBuilder().D(type);
    }

    public static Type parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, tVar);
    }

    /* JADX INFO: renamed from: getOneofsList, reason: merged with bridge method [inline-methods] */
    public bei m157getOneofsList() {
        return this.oneofs_;
    }

    private Type(GeneratedMessageV3.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Type parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (Type) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
    }

    public static Type parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
    public Type getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public b toBuilder() {
        a aVar = null;
        return this == DEFAULT_INSTANCE ? new b(aVar) : new b(aVar).D(this);
    }

    public static Type parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, tVar);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public b newBuilderForType() {
        return newBuilder();
    }

    private Type() {
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.fields_ = Collections.emptyList();
        this.oneofs_ = g0.d;
        this.options_ = Collections.emptyList();
        this.syntax_ = 0;
    }

    public static Type parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public b newBuilderForType(GeneratedMessageV3.c cVar) {
        return new b(cVar, null);
    }

    public static Type parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, tVar);
    }

    public static Type parseFrom(InputStream inputStream) throws IOException {
        return (Type) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Type parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (Type) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
    }

    public static Type parseFrom(j jVar) throws IOException {
        return (Type) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
    }

    private Type(j jVar, t tVar) throws InvalidProtocolBufferException {
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
                                this.fields_ = new ArrayList();
                                i |= 1;
                            }
                            this.fields_.add((Field) jVar.z(Field.parser(), tVar));
                        } else if (iJ == 26) {
                            String strI = jVar.I();
                            if ((i & 2) == 0) {
                                this.oneofs_ = new g0();
                                i |= 2;
                            }
                            this.oneofs_.add(strI);
                        } else if (iJ == 34) {
                            if ((i & 4) == 0) {
                                this.options_ = new ArrayList();
                                i |= 4;
                            }
                            this.options_.add((Option) jVar.z(Option.parser(), tVar));
                        } else if (iJ == 42) {
                            SourceContext sourceContext = this.sourceContext_;
                            SourceContext.b builder = sourceContext != null ? sourceContext.toBuilder() : null;
                            SourceContext sourceContext2 = (SourceContext) jVar.z(SourceContext.parser(), tVar);
                            this.sourceContext_ = sourceContext2;
                            if (builder != null) {
                                builder.y(sourceContext2);
                                this.sourceContext_ = builder.buildPartial();
                            }
                        } else if (iJ != 48) {
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
                    this.fields_ = Collections.unmodifiableList(this.fields_);
                }
                if ((i & 2) != 0) {
                    this.oneofs_ = this.oneofs_.getUnmodifiableView();
                }
                if ((i & 4) != 0) {
                    this.options_ = Collections.unmodifiableList(this.options_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if ((i & 1) != 0) {
            this.fields_ = Collections.unmodifiableList(this.fields_);
        }
        if ((i & 2) != 0) {
            this.oneofs_ = this.oneofs_.getUnmodifiableView();
        }
        if ((i & 4) != 0) {
            this.options_ = Collections.unmodifiableList(this.options_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static Type parseFrom(j jVar, t tVar) throws IOException {
        return (Type) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
    }
}
