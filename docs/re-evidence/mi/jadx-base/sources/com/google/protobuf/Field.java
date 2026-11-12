package com.google.protobuf;

import defpackage.vkh;
import defpackage.xbh;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class Field extends GeneratedMessageV3 implements z {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private static final long serialVersionUID = 0;
    private int cardinality_;
    private volatile Object defaultValue_;
    private volatile Object jsonName_;
    private int kind_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private int number_;
    private int oneofIndex_;
    private List<Option> options_;
    private boolean packed_;
    private volatile Object typeUrl_;
    private static final Field DEFAULT_INSTANCE = new Field();
    private static final vkh<Field> PARSER = new a();

    public enum Cardinality implements z0 {
        CARDINALITY_UNKNOWN(0),
        CARDINALITY_OPTIONAL(1),
        CARDINALITY_REQUIRED(2),
        CARDINALITY_REPEATED(3),
        UNRECOGNIZED(-1);

        public static final int CARDINALITY_OPTIONAL_VALUE = 1;
        public static final int CARDINALITY_REPEATED_VALUE = 3;
        public static final int CARDINALITY_REQUIRED_VALUE = 2;
        public static final int CARDINALITY_UNKNOWN_VALUE = 0;
        private final int value;
        private static final d0.d<Cardinality> internalValueMap = new a();
        private static final Cardinality[] VALUES = values();

        public static class a implements d0.d<Cardinality> {
            @Override // com.google.protobuf.d0.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Cardinality findValueByNumber(int i) {
                return Cardinality.forNumber(i);
            }
        }

        Cardinality(int i) {
            this.value = i;
        }

        public static Cardinality forNumber(int i) {
            if (i == 0) {
                return CARDINALITY_UNKNOWN;
            }
            if (i == 1) {
                return CARDINALITY_OPTIONAL;
            }
            if (i == 2) {
                return CARDINALITY_REQUIRED;
            }
            if (i != 3) {
                return null;
            }
            return CARDINALITY_REPEATED;
        }

        public static final Descriptors.d getDescriptor() {
            return Field.getDescriptor().m().get(1);
        }

        public static d0.d<Cardinality> internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.d getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.d0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final Descriptors.e getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return getDescriptor().l().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        @Deprecated
        public static Cardinality valueOf(int i) {
            return forNumber(i);
        }

        public static Cardinality valueOf(Descriptors.e eVar) {
            if (eVar.i() == getDescriptor()) {
                if (eVar.h() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[eVar.h()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum Kind implements z0 {
        TYPE_UNKNOWN(0),
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18),
        UNRECOGNIZED(-1);

        public static final int TYPE_BOOL_VALUE = 8;
        public static final int TYPE_BYTES_VALUE = 12;
        public static final int TYPE_DOUBLE_VALUE = 1;
        public static final int TYPE_ENUM_VALUE = 14;
        public static final int TYPE_FIXED32_VALUE = 7;
        public static final int TYPE_FIXED64_VALUE = 6;
        public static final int TYPE_FLOAT_VALUE = 2;
        public static final int TYPE_GROUP_VALUE = 10;
        public static final int TYPE_INT32_VALUE = 5;
        public static final int TYPE_INT64_VALUE = 3;
        public static final int TYPE_MESSAGE_VALUE = 11;
        public static final int TYPE_SFIXED32_VALUE = 15;
        public static final int TYPE_SFIXED64_VALUE = 16;
        public static final int TYPE_SINT32_VALUE = 17;
        public static final int TYPE_SINT64_VALUE = 18;
        public static final int TYPE_STRING_VALUE = 9;
        public static final int TYPE_UINT32_VALUE = 13;
        public static final int TYPE_UINT64_VALUE = 4;
        public static final int TYPE_UNKNOWN_VALUE = 0;
        private final int value;
        private static final d0.d<Kind> internalValueMap = new a();
        private static final Kind[] VALUES = values();

        public static class a implements d0.d<Kind> {
            @Override // com.google.protobuf.d0.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Kind findValueByNumber(int i) {
                return Kind.forNumber(i);
            }
        }

        Kind(int i) {
            this.value = i;
        }

        public static Kind forNumber(int i) {
            switch (i) {
                case 0:
                    return TYPE_UNKNOWN;
                case 1:
                    return TYPE_DOUBLE;
                case 2:
                    return TYPE_FLOAT;
                case 3:
                    return TYPE_INT64;
                case 4:
                    return TYPE_UINT64;
                case 5:
                    return TYPE_INT32;
                case 6:
                    return TYPE_FIXED64;
                case 7:
                    return TYPE_FIXED32;
                case 8:
                    return TYPE_BOOL;
                case 9:
                    return TYPE_STRING;
                case 10:
                    return TYPE_GROUP;
                case 11:
                    return TYPE_MESSAGE;
                case 12:
                    return TYPE_BYTES;
                case 13:
                    return TYPE_UINT32;
                case 14:
                    return TYPE_ENUM;
                case 15:
                    return TYPE_SFIXED32;
                case 16:
                    return TYPE_SFIXED64;
                case 17:
                    return TYPE_SINT32;
                case 18:
                    return TYPE_SINT64;
                default:
                    return null;
            }
        }

        public static final Descriptors.d getDescriptor() {
            return Field.getDescriptor().m().get(0);
        }

        public static d0.d<Kind> internalGetValueMap() {
            return internalValueMap;
        }

        public final Descriptors.d getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.d0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final Descriptors.e getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return getDescriptor().l().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        @Deprecated
        public static Kind valueOf(int i) {
            return forNumber(i);
        }

        public static Kind valueOf(Descriptors.e eVar) {
            if (eVar.i() == getDescriptor()) {
                if (eVar.h() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[eVar.h()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static class a extends c<Field> {
        @Override // defpackage.vkh
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Field parsePartialFrom(j jVar, t tVar) throws InvalidProtocolBufferException {
            return new Field(jVar, tVar, null);
        }
    }

    public static final class b extends GeneratedMessageV3.b<b> implements z {
        public int e;
        public int f;
        public int g;
        public int h;
        public Object i;
        public Object j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f9511k;
        public boolean l;
        public List<Option> m;
        public c1<Option, Option.b, xbh> n;
        public Object o;
        public Object p;

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
                this.m = new ArrayList(this.m);
                this.e |= 1;
            }
        }

        private c1<Option, Option.b, xbh> x() {
            if (this.n == null) {
                this.n = new c1<>(this.m, (this.e & 1) != 0, g(), isClean());
                this.m = null;
            }
            return this.n;
        }

        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(p0 p0Var) {
            if (p0Var instanceof Field) {
                return z((Field) p0Var);
            }
            super.mergeFrom(p0Var);
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public final b mo145mergeUnknownFields(r1 r1Var) {
            return (b) super.mo145mergeUnknownFields(r1Var);
        }

        public b C(int i) {
            this.g = i;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.setField(fieldDescriptor, obj);
        }

        public b F(int i) {
            this.f = i;
            onChanged();
            return this;
        }

        public b G(int i) {
            this.h = i;
            onChanged();
            return this;
        }

        public b H(int i) {
            this.f9511k = i;
            onChanged();
            return this;
        }

        public b I(boolean z) {
            this.l = z;
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
            return o1.c;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        public GeneratedMessageV3.e h() {
            return o1.d.d(Field.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Field build() {
            Field fieldBuildPartial = buildPartial();
            if (fieldBuildPartial.isInitialized()) {
                return fieldBuildPartial;
            }
            throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) fieldBuildPartial);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Field buildPartial() {
            Field field = new Field(this, (a) null);
            field.kind_ = this.f;
            field.cardinality_ = this.g;
            field.number_ = this.h;
            field.name_ = this.i;
            field.typeUrl_ = this.j;
            field.oneofIndex_ = this.f9511k;
            field.packed_ = this.l;
            c1<Option, Option.b, xbh> c1Var = this.n;
            if (c1Var == null) {
                if ((this.e & 1) != 0) {
                    this.m = Collections.unmodifiableList(this.m);
                    this.e &= -2;
                }
                field.options_ = this.m;
            } else {
                field.options_ = c1Var.d();
            }
            field.jsonName_ = this.o;
            field.defaultValue_ = this.p;
            onBuilt();
            return field;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mo142clear() {
            super.mo142clear();
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = "";
            this.j = "";
            this.f9511k = 0;
            this.l = false;
            c1<Option, Option.b, xbh> c1Var = this.n;
            if (c1Var == null) {
                this.m = Collections.emptyList();
                this.e &= -2;
            } else {
                c1Var.e();
            }
            this.o = "";
            this.p = "";
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
        public Field getDefaultInstanceForType() {
            return Field.getDefaultInstance();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(j jVar, t tVar) throws Throwable {
            Field field = null;
            try {
                try {
                    Field field2 = (Field) Field.PARSER.parsePartialFrom(jVar, tVar);
                    if (field2 != null) {
                        z(field2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    Field field3 = (Field) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        field = field3;
                        if (field != null) {
                            z(field);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (field != null) {
                    z(field);
                }
                throw th;
            }
        }

        public b z(Field field) {
            if (field == Field.getDefaultInstance()) {
                return this;
            }
            if (field.kind_ != 0) {
                F(field.getKindValue());
            }
            if (field.cardinality_ != 0) {
                C(field.getCardinalityValue());
            }
            if (field.getNumber() != 0) {
                G(field.getNumber());
            }
            if (!field.getName().isEmpty()) {
                this.i = field.name_;
                onChanged();
            }
            if (!field.getTypeUrl().isEmpty()) {
                this.j = field.typeUrl_;
                onChanged();
            }
            if (field.getOneofIndex() != 0) {
                H(field.getOneofIndex());
            }
            if (field.getPacked()) {
                I(field.getPacked());
            }
            if (this.n == null) {
                if (!field.options_.isEmpty()) {
                    if (this.m.isEmpty()) {
                        this.m = field.options_;
                        this.e &= -2;
                    } else {
                        v();
                        this.m.addAll(field.options_);
                    }
                    onChanged();
                }
            } else if (!field.options_.isEmpty()) {
                if (this.n.j()) {
                    this.n.f();
                    this.n = null;
                    this.m = field.options_;
                    this.e &= -2;
                    this.n = GeneratedMessageV3.alwaysUseFieldBuilders ? x() : null;
                } else {
                    this.n.b(field.options_);
                }
            }
            if (!field.getJsonName().isEmpty()) {
                this.o = field.jsonName_;
                onChanged();
            }
            if (!field.getDefaultValue().isEmpty()) {
                this.p = field.defaultValue_;
                onChanged();
            }
            mo145mergeUnknownFields(field.unknownFields);
            onChanged();
            return this;
        }

        public /* synthetic */ b(GeneratedMessageV3.c cVar, a aVar) {
            this(cVar);
        }

        public b() {
            this.f = 0;
            this.g = 0;
            this.i = "";
            this.j = "";
            this.m = Collections.emptyList();
            this.o = "";
            this.p = "";
            maybeForceBuilderInitialization();
        }

        public b(GeneratedMessageV3.c cVar) {
            super(cVar);
            this.f = 0;
            this.g = 0;
            this.i = "";
            this.j = "";
            this.m = Collections.emptyList();
            this.o = "";
            this.p = "";
            maybeForceBuilderInitialization();
        }
    }

    public /* synthetic */ Field(j jVar, t tVar, a aVar) throws InvalidProtocolBufferException {
        this(jVar, tVar);
    }

    public static Field getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.b getDescriptor() {
        return o1.c;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Field parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Field) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Field parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static vkh<Field> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.a
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Field)) {
            return super.equals(obj);
        }
        Field field = (Field) obj;
        return this.kind_ == field.kind_ && this.cardinality_ == field.cardinality_ && getNumber() == field.getNumber() && getName().equals(field.getName()) && getTypeUrl().equals(field.getTypeUrl()) && getOneofIndex() == field.getOneofIndex() && getPacked() == field.getPacked() && getOptionsList().equals(field.getOptionsList()) && getJsonName().equals(field.getJsonName()) && getDefaultValue().equals(field.getDefaultValue()) && this.unknownFields.equals(field.unknownFields);
    }

    public Cardinality getCardinality() {
        Cardinality cardinalityValueOf = Cardinality.valueOf(this.cardinality_);
        return cardinalityValueOf == null ? Cardinality.UNRECOGNIZED : cardinalityValueOf;
    }

    public int getCardinalityValue() {
        return this.cardinality_;
    }

    public String getDefaultValue() {
        Object obj = this.defaultValue_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.defaultValue_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getDefaultValueBytes() {
        Object obj = this.defaultValue_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.defaultValue_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String getJsonName() {
        Object obj = this.jsonName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.jsonName_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getJsonNameBytes() {
        Object obj = this.jsonName_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.jsonName_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public Kind getKind() {
        Kind kindValueOf = Kind.valueOf(this.kind_);
        return kindValueOf == null ? Kind.UNRECOGNIZED : kindValueOf;
    }

    public int getKindValue() {
        return this.kind_;
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

    public int getOneofIndex() {
        return this.oneofIndex_;
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

    public boolean getPacked() {
        return this.packed_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public vkh<Field> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iL = this.kind_ != Kind.TYPE_UNKNOWN.getNumber() ? CodedOutputStream.l(1, this.kind_) : 0;
        if (this.cardinality_ != Cardinality.CARDINALITY_UNKNOWN.getNumber()) {
            iL += CodedOutputStream.l(2, this.cardinality_);
        }
        int i2 = this.number_;
        if (i2 != 0) {
            iL += CodedOutputStream.x(3, i2);
        }
        if (!getNameBytes().isEmpty()) {
            iL += GeneratedMessageV3.computeStringSize(4, this.name_);
        }
        if (!getTypeUrlBytes().isEmpty()) {
            iL += GeneratedMessageV3.computeStringSize(6, this.typeUrl_);
        }
        int i3 = this.oneofIndex_;
        if (i3 != 0) {
            iL += CodedOutputStream.x(7, i3);
        }
        boolean z = this.packed_;
        if (z) {
            iL += CodedOutputStream.e(8, z);
        }
        for (int i4 = 0; i4 < this.options_.size(); i4++) {
            iL += CodedOutputStream.G(9, this.options_.get(i4));
        }
        if (!getJsonNameBytes().isEmpty()) {
            iL += GeneratedMessageV3.computeStringSize(10, this.jsonName_);
        }
        if (!getDefaultValueBytes().isEmpty()) {
            iL += GeneratedMessageV3.computeStringSize(11, this.defaultValue_);
        }
        int serializedSize = iL + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
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

    @Override // com.google.protobuf.a
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.kind_) * 37) + 2) * 53) + this.cardinality_) * 37) + 3) * 53) + getNumber()) * 37) + 4) * 53) + getName().hashCode()) * 37) + 6) * 53) + getTypeUrl().hashCode()) * 37) + 7) * 53) + getOneofIndex()) * 37) + 8) * 53) + d0.d(getPacked());
        if (getOptionsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 9) * 53) + getOptionsList().hashCode();
        }
        int iHashCode2 = (((((((((iHashCode * 37) + 10) * 53) + getJsonName().hashCode()) * 37) + 11) * 53) + getDefaultValue().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.e internalGetFieldAccessorTable() {
        return o1.d.d(Field.class, b.class);
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
        return new Field();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.kind_ != Kind.TYPE_UNKNOWN.getNumber()) {
            codedOutputStream.u0(1, this.kind_);
        }
        if (this.cardinality_ != Cardinality.CARDINALITY_UNKNOWN.getNumber()) {
            codedOutputStream.u0(2, this.cardinality_);
        }
        int i = this.number_;
        if (i != 0) {
            codedOutputStream.G0(3, i);
        }
        if (!getNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.name_);
        }
        if (!getTypeUrlBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 6, this.typeUrl_);
        }
        int i2 = this.oneofIndex_;
        if (i2 != 0) {
            codedOutputStream.G0(7, i2);
        }
        boolean z = this.packed_;
        if (z) {
            codedOutputStream.m0(8, z);
        }
        for (int i3 = 0; i3 < this.options_.size(); i3++) {
            codedOutputStream.K0(9, this.options_.get(i3));
        }
        if (!getJsonNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 10, this.jsonName_);
        }
        if (!getDefaultValueBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 11, this.defaultValue_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public /* synthetic */ Field(GeneratedMessageV3.b bVar, a aVar) {
        this(bVar);
    }

    public static b newBuilder(Field field) {
        return DEFAULT_INSTANCE.toBuilder().z(field);
    }

    public static Field parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, tVar);
    }

    private Field(GeneratedMessageV3.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Field parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (Field) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
    }

    public static Field parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
    public Field getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public b toBuilder() {
        a aVar = null;
        return this == DEFAULT_INSTANCE ? new b(aVar) : new b(aVar).z(this);
    }

    public static Field parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, tVar);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public b newBuilderForType() {
        return newBuilder();
    }

    private Field() {
        this.memoizedIsInitialized = (byte) -1;
        this.kind_ = 0;
        this.cardinality_ = 0;
        this.name_ = "";
        this.typeUrl_ = "";
        this.options_ = Collections.emptyList();
        this.jsonName_ = "";
        this.defaultValue_ = "";
    }

    public static Field parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public b newBuilderForType(GeneratedMessageV3.c cVar) {
        return new b(cVar, null);
    }

    public static Field parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, tVar);
    }

    public static Field parseFrom(InputStream inputStream) throws IOException {
        return (Field) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Field parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (Field) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
    }

    public static Field parseFrom(j jVar) throws IOException {
        return (Field) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
    }

    public static Field parseFrom(j jVar, t tVar) throws IOException {
        return (Field) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
    }

    private Field(j jVar, t tVar) throws InvalidProtocolBufferException {
        this();
        tVar.getClass();
        r1.b bVarG = r1.g();
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iJ = jVar.J();
                    switch (iJ) {
                        case 0:
                            break;
                        case 8:
                            this.kind_ = jVar.s();
                            continue;
                        case 16:
                            this.cardinality_ = jVar.s();
                            continue;
                        case 24:
                            this.number_ = jVar.x();
                            continue;
                        case 34:
                            this.name_ = jVar.I();
                            continue;
                        case 50:
                            this.typeUrl_ = jVar.I();
                            continue;
                        case 56:
                            this.oneofIndex_ = jVar.x();
                            continue;
                        case 64:
                            this.packed_ = jVar.p();
                            continue;
                        case 74:
                            if (!(z2 & true)) {
                                this.options_ = new ArrayList();
                                z2 = true;
                            }
                            this.options_.add((Option) jVar.z(Option.parser(), tVar));
                            continue;
                        case 82:
                            this.jsonName_ = jVar.I();
                            continue;
                        case 90:
                            this.defaultValue_ = jVar.I();
                            continue;
                        default:
                            if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                break;
                            }
                            break;
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
}
