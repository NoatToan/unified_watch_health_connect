package com.google.protobuf;

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
public final class EnumValue extends GeneratedMessageV3 implements rc8 {
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private int number_;
    private List<Option> options_;
    private static final EnumValue DEFAULT_INSTANCE = new EnumValue();
    private static final vkh<EnumValue> PARSER = new a();

    public static class a extends c<EnumValue> {
        @Override // defpackage.vkh
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EnumValue parsePartialFrom(j jVar, t tVar) throws InvalidProtocolBufferException {
            return new EnumValue(jVar, tVar, null);
        }
    }

    public static final class b extends GeneratedMessageV3.b<b> implements rc8 {
        public int e;
        public Object f;
        public int g;
        public List<Option> h;
        public c1<Option, Option.b, xbh> i;

        public /* synthetic */ b(a aVar) {
            this();
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                x();
            }
        }

        private void v() {
            if ((this.e & 1) == 0) {
                this.h = new ArrayList(this.h);
                this.e |= 1;
            }
        }

        private c1<Option, Option.b, xbh> x() {
            if (this.i == null) {
                this.i = new c1<>(this.h, (this.e & 1) != 0, g(), isClean());
                this.h = null;
            }
            return this.i;
        }

        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(p0 p0Var) {
            if (p0Var instanceof EnumValue) {
                return z((EnumValue) p0Var);
            }
            super.mergeFrom(p0Var);
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

        public b D(int i) {
            this.g = i;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public final b setUnknownFields(r1 r1Var) {
            return (b) super.setUnknownFields(r1Var);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
        public Descriptors.b getDescriptorForType() {
            return o1.g;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        public GeneratedMessageV3.e h() {
            return o1.h.d(EnumValue.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public EnumValue build() {
            EnumValue enumValueBuildPartial = buildPartial();
            if (enumValueBuildPartial.isInitialized()) {
                return enumValueBuildPartial;
            }
            throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) enumValueBuildPartial);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public EnumValue buildPartial() {
            EnumValue enumValue = new EnumValue(this, (a) null);
            enumValue.name_ = this.f;
            enumValue.number_ = this.g;
            c1<Option, Option.b, xbh> c1Var = this.i;
            if (c1Var == null) {
                if ((this.e & 1) != 0) {
                    this.h = Collections.unmodifiableList(this.h);
                    this.e &= -2;
                }
                enumValue.options_ = this.h;
            } else {
                enumValue.options_ = c1Var.d();
            }
            onBuilt();
            return enumValue;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mo142clear() {
            super.mo142clear();
            this.f = "";
            this.g = 0;
            c1<Option, Option.b, xbh> c1Var = this.i;
            if (c1Var == null) {
                this.h = Collections.emptyList();
                this.e &= -2;
            } else {
                c1Var.e();
            }
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
        public EnumValue getDefaultInstanceForType() {
            return EnumValue.getDefaultInstance();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(j jVar, t tVar) throws Throwable {
            EnumValue enumValue = null;
            try {
                try {
                    EnumValue enumValue2 = (EnumValue) EnumValue.PARSER.parsePartialFrom(jVar, tVar);
                    if (enumValue2 != null) {
                        z(enumValue2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    EnumValue enumValue3 = (EnumValue) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        enumValue = enumValue3;
                        if (enumValue != null) {
                            z(enumValue);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (enumValue != null) {
                    z(enumValue);
                }
                throw th;
            }
        }

        public b z(EnumValue enumValue) {
            if (enumValue == EnumValue.getDefaultInstance()) {
                return this;
            }
            if (!enumValue.getName().isEmpty()) {
                this.f = enumValue.name_;
                onChanged();
            }
            if (enumValue.getNumber() != 0) {
                D(enumValue.getNumber());
            }
            if (this.i == null) {
                if (!enumValue.options_.isEmpty()) {
                    if (this.h.isEmpty()) {
                        this.h = enumValue.options_;
                        this.e &= -2;
                    } else {
                        v();
                        this.h.addAll(enumValue.options_);
                    }
                    onChanged();
                }
            } else if (!enumValue.options_.isEmpty()) {
                if (this.i.j()) {
                    this.i.f();
                    this.i = null;
                    this.h = enumValue.options_;
                    this.e &= -2;
                    this.i = GeneratedMessageV3.alwaysUseFieldBuilders ? x() : null;
                } else {
                    this.i.b(enumValue.options_);
                }
            }
            mo145mergeUnknownFields(enumValue.unknownFields);
            onChanged();
            return this;
        }

        public /* synthetic */ b(GeneratedMessageV3.c cVar, a aVar) {
            this(cVar);
        }

        public b() {
            this.f = "";
            this.h = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        public b(GeneratedMessageV3.c cVar) {
            super(cVar);
            this.f = "";
            this.h = Collections.emptyList();
            maybeForceBuilderInitialization();
        }
    }

    public /* synthetic */ EnumValue(j jVar, t tVar, a aVar) throws InvalidProtocolBufferException {
        this(jVar, tVar);
    }

    public static EnumValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.b getDescriptor() {
        return o1.g;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EnumValue) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static vkh<EnumValue> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.a
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EnumValue)) {
            return super.equals(obj);
        }
        EnumValue enumValue = (EnumValue) obj;
        return getName().equals(enumValue.getName()) && getNumber() == enumValue.getNumber() && getOptionsList().equals(enumValue.getOptionsList()) && this.unknownFields.equals(enumValue.unknownFields);
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

    public int getNumber() {
        return this.number_;
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
    public vkh<EnumValue> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !getNameBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
        int i2 = this.number_;
        if (i2 != 0) {
            iComputeStringSize += CodedOutputStream.x(2, i2);
        }
        for (int i3 = 0; i3 < this.options_.size(); i3++) {
            iComputeStringSize += CodedOutputStream.G(3, this.options_.get(i3));
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
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
        int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + getNumber();
        if (getOptionsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getOptionsList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.e internalGetFieldAccessorTable() {
        return o1.h.d(EnumValue.class, b.class);
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
        return new EnumValue();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
        }
        int i = this.number_;
        if (i != 0) {
            codedOutputStream.G0(2, i);
        }
        for (int i2 = 0; i2 < this.options_.size(); i2++) {
            codedOutputStream.K0(3, this.options_.get(i2));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public /* synthetic */ EnumValue(GeneratedMessageV3.b bVar, a aVar) {
        this(bVar);
    }

    public static b newBuilder(EnumValue enumValue) {
        return DEFAULT_INSTANCE.toBuilder().z(enumValue);
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, tVar);
    }

    private EnumValue(GeneratedMessageV3.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (EnumValue) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
    }

    public static EnumValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
    public EnumValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public b toBuilder() {
        a aVar = null;
        return this == DEFAULT_INSTANCE ? new b(aVar) : new b(aVar).z(this);
    }

    public static EnumValue parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, tVar);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public b newBuilderForType() {
        return newBuilder();
    }

    private EnumValue() {
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.options_ = Collections.emptyList();
    }

    public static EnumValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public b newBuilderForType(GeneratedMessageV3.c cVar) {
        return new b(cVar, null);
    }

    public static EnumValue parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, tVar);
    }

    public static EnumValue parseFrom(InputStream inputStream) throws IOException {
        return (EnumValue) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    private EnumValue(j jVar, t tVar) throws InvalidProtocolBufferException {
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
                        } else if (iJ == 16) {
                            this.number_ = jVar.x();
                        } else if (iJ != 26) {
                            if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                            }
                        } else {
                            if (!(z2 & true)) {
                                this.options_ = new ArrayList();
                                z2 = true;
                            }
                            this.options_.add((Option) jVar.z(Option.parser(), tVar));
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

    public static EnumValue parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (EnumValue) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
    }

    public static EnumValue parseFrom(j jVar) throws IOException {
        return (EnumValue) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
    }

    public static EnumValue parseFrom(j jVar, t tVar) throws IOException {
        return (EnumValue) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
    }
}
