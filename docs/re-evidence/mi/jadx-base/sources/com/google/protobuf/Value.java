package com.google.protobuf;

import defpackage.ihe;
import defpackage.tlo;
import defpackage.vkh;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class Value extends GeneratedMessageV3 implements w1 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private int kindCase_;
    private Object kind_;
    private byte memoizedIsInitialized;
    private static final Value DEFAULT_INSTANCE = new Value();
    private static final vkh<Value> PARSER = new a();

    public enum KindCase implements d0.c {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);

        private final int value;

        KindCase(int i) {
            this.value = i;
        }

        public static KindCase forNumber(int i) {
            switch (i) {
                case 0:
                    return KIND_NOT_SET;
                case 1:
                    return NULL_VALUE;
                case 2:
                    return NUMBER_VALUE;
                case 3:
                    return STRING_VALUE;
                case 4:
                    return BOOL_VALUE;
                case 5:
                    return STRUCT_VALUE;
                case 6:
                    return LIST_VALUE;
                default:
                    return null;
            }
        }

        @Override // com.google.protobuf.d0.c
        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static KindCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static class a extends com.google.protobuf.c<Value> {
        @Override // defpackage.vkh
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Value parsePartialFrom(j jVar, t tVar) throws InvalidProtocolBufferException {
            return new Value(jVar, tVar, null);
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9592a;

        static {
            int[] iArr = new int[KindCase.values().length];
            f9592a = iArr;
            try {
                iArr[KindCase.NULL_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9592a[KindCase.NUMBER_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9592a[KindCase.STRING_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9592a[KindCase.BOOL_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9592a[KindCase.STRUCT_VALUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9592a[KindCase.LIST_VALUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9592a[KindCase.KIND_NOT_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class c extends GeneratedMessageV3.b<c> implements w1 {
        public int e;
        public Object f;
        public h1<Struct, Struct.b, tlo> g;
        public h1<ListValue, ListValue.b, ihe> h;

        public /* synthetic */ c(GeneratedMessageV3.c cVar, a aVar) {
            this(cVar);
        }

        private void maybeForceBuilderInitialization() {
            boolean z = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        public c A(Struct struct) {
            h1<Struct, Struct.b, tlo> h1Var = this.g;
            if (h1Var == null) {
                if (this.e != 5 || this.f == Struct.getDefaultInstance()) {
                    this.f = struct;
                } else {
                    this.f = Struct.newBuilder((Struct) this.f).A(struct).buildPartial();
                }
                onChanged();
            } else {
                if (this.e == 5) {
                    h1Var.g(struct);
                }
                this.g.i(struct);
            }
            this.e = 5;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public final c mo145mergeUnknownFields(r1 r1Var) {
            return (c) super.mo145mergeUnknownFields(r1Var);
        }

        public c C(boolean z) {
            this.e = 4;
            this.f = Boolean.valueOf(z);
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public c setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (c) super.setField(fieldDescriptor, obj);
        }

        public c F(int i) {
            this.e = 1;
            this.f = Integer.valueOf(i);
            onChanged();
            return this;
        }

        public c G(double d) {
            this.e = 2;
            this.f = Double.valueOf(d);
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final c setUnknownFields(r1 r1Var) {
            return (c) super.setUnknownFields(r1Var);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
        public Descriptors.b getDescriptorForType() {
            return k1.e;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        public GeneratedMessageV3.e h() {
            return k1.f.d(Value.class, c.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public c addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (c) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Value build() {
            Value valueBuildPartial = buildPartial();
            if (valueBuildPartial.isInitialized()) {
                return valueBuildPartial;
            }
            throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) valueBuildPartial);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Value buildPartial() {
            Value value = new Value(this, (a) null);
            if (this.e == 1) {
                value.kind_ = this.f;
            }
            if (this.e == 2) {
                value.kind_ = this.f;
            }
            if (this.e == 3) {
                value.kind_ = this.f;
            }
            if (this.e == 4) {
                value.kind_ = this.f;
            }
            if (this.e == 5) {
                h1<Struct, Struct.b, tlo> h1Var = this.g;
                if (h1Var == null) {
                    value.kind_ = this.f;
                } else {
                    value.kind_ = h1Var.b();
                }
            }
            if (this.e == 6) {
                h1<ListValue, ListValue.b, ihe> h1Var2 = this.h;
                if (h1Var2 == null) {
                    value.kind_ = this.f;
                } else {
                    value.kind_ = h1Var2.b();
                }
            }
            value.kindCase_ = this.e;
            onBuilt();
            return value;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public c mo142clear() {
            super.mo142clear();
            this.e = 0;
            this.f = null;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public c clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (c) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public c clearOneof(Descriptors.h hVar) {
            return (c) super.clearOneof(hVar);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public c mo144clone() {
            return (c) super.mo144clone();
        }

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public Value getDefaultInstanceForType() {
            return Value.getDefaultInstance();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public c mergeFrom(j jVar, t tVar) throws Throwable {
            Value value = null;
            try {
                try {
                    Value value2 = (Value) Value.PARSER.parsePartialFrom(jVar, tVar);
                    if (value2 != null) {
                        y(value2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    Value value3 = (Value) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        value = value3;
                        if (value != null) {
                            y(value);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (value != null) {
                    y(value);
                }
                throw th;
            }
        }

        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public c mergeFrom(p0 p0Var) {
            if (p0Var instanceof Value) {
                return y((Value) p0Var);
            }
            super.mergeFrom(p0Var);
            return this;
        }

        public c y(Value value) {
            if (value == Value.getDefaultInstance()) {
                return this;
            }
            switch (b.f9592a[value.getKindCase().ordinal()]) {
                case 1:
                    F(value.getNullValueValue());
                    break;
                case 2:
                    G(value.getNumberValue());
                    break;
                case 3:
                    this.e = 3;
                    this.f = value.kind_;
                    onChanged();
                    break;
                case 4:
                    C(value.getBoolValue());
                    break;
                case 5:
                    A(value.getStructValue());
                    break;
                case 6:
                    z(value.getListValue());
                    break;
            }
            mo145mergeUnknownFields(value.unknownFields);
            onChanged();
            return this;
        }

        public c z(ListValue listValue) {
            h1<ListValue, ListValue.b, ihe> h1Var = this.h;
            if (h1Var == null) {
                if (this.e != 6 || this.f == ListValue.getDefaultInstance()) {
                    this.f = listValue;
                } else {
                    this.f = ListValue.newBuilder((ListValue) this.f).z(listValue).buildPartial();
                }
                onChanged();
            } else {
                if (this.e == 6) {
                    h1Var.g(listValue);
                }
                this.h.i(listValue);
            }
            this.e = 6;
            return this;
        }

        public /* synthetic */ c(a aVar) {
            this();
        }

        public c() {
            this.e = 0;
            maybeForceBuilderInitialization();
        }

        public c(GeneratedMessageV3.c cVar) {
            super(cVar);
            this.e = 0;
            maybeForceBuilderInitialization();
        }
    }

    public /* synthetic */ Value(j jVar, t tVar, a aVar) throws InvalidProtocolBufferException {
        this(jVar, tVar);
    }

    public static Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.b getDescriptor() {
        return k1.e;
    }

    public static c newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Value) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Value parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static vkh<Value> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.a
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Value)) {
            return super.equals(obj);
        }
        Value value = (Value) obj;
        if (!getKindCase().equals(value.getKindCase())) {
            return false;
        }
        switch (this.kindCase_) {
            case 1:
                if (getNullValueValue() != value.getNullValueValue()) {
                    return false;
                }
                break;
            case 2:
                if (Double.doubleToLongBits(getNumberValue()) != Double.doubleToLongBits(value.getNumberValue())) {
                    return false;
                }
                break;
            case 3:
                if (!getStringValue().equals(value.getStringValue())) {
                    return false;
                }
                break;
            case 4:
                if (getBoolValue() != value.getBoolValue()) {
                    return false;
                }
                break;
            case 5:
                if (!getStructValue().equals(value.getStructValue())) {
                    return false;
                }
                break;
            case 6:
                if (!getListValue().equals(value.getListValue())) {
                    return false;
                }
                break;
        }
        return this.unknownFields.equals(value.unknownFields);
    }

    public boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    public KindCase getKindCase() {
        return KindCase.forNumber(this.kindCase_);
    }

    public ListValue getListValue() {
        return this.kindCase_ == 6 ? (ListValue) this.kind_ : ListValue.getDefaultInstance();
    }

    public ihe getListValueOrBuilder() {
        return this.kindCase_ == 6 ? (ListValue) this.kind_ : ListValue.getDefaultInstance();
    }

    public NullValue getNullValue() {
        if (this.kindCase_ != 1) {
            return NullValue.NULL_VALUE;
        }
        NullValue nullValueValueOf = NullValue.valueOf(((Integer) this.kind_).intValue());
        return nullValueValueOf == null ? NullValue.UNRECOGNIZED : nullValueValueOf;
    }

    public int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    public double getNumberValue() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public vkh<Value> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iL = this.kindCase_ == 1 ? CodedOutputStream.l(1, ((Integer) this.kind_).intValue()) : 0;
        if (this.kindCase_ == 2) {
            iL += CodedOutputStream.j(2, ((Double) this.kind_).doubleValue());
        }
        if (this.kindCase_ == 3) {
            iL += GeneratedMessageV3.computeStringSize(3, this.kind_);
        }
        if (this.kindCase_ == 4) {
            iL += CodedOutputStream.e(4, ((Boolean) this.kind_).booleanValue());
        }
        if (this.kindCase_ == 5) {
            iL += CodedOutputStream.G(5, (Struct) this.kind_);
        }
        if (this.kindCase_ == 6) {
            iL += CodedOutputStream.G(6, (ListValue) this.kind_);
        }
        int serializedSize = iL + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public String getStringValue() {
        Object obj = this.kindCase_ == 3 ? this.kind_ : "";
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        if (this.kindCase_ == 3) {
            this.kind_ = stringUtf8;
        }
        return stringUtf8;
    }

    public ByteString getStringValueBytes() {
        Object obj = this.kindCase_ == 3 ? this.kind_ : "";
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        if (this.kindCase_ == 3) {
            this.kind_ = byteStringCopyFromUtf8;
        }
        return byteStringCopyFromUtf8;
    }

    public Struct getStructValue() {
        return this.kindCase_ == 5 ? (Struct) this.kind_ : Struct.getDefaultInstance();
    }

    public tlo getStructValueOrBuilder() {
        return this.kindCase_ == 5 ? (Struct) this.kind_ : Struct.getDefaultInstance();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
    public final r1 getUnknownFields() {
        return this.unknownFields;
    }

    public boolean hasBoolValue() {
        return this.kindCase_ == 4;
    }

    public boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    public boolean hasNullValue() {
        return this.kindCase_ == 1;
    }

    public boolean hasNumberValue() {
        return this.kindCase_ == 2;
    }

    public boolean hasStringValue() {
        return this.kindCase_ == 3;
    }

    public boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    @Override // com.google.protobuf.a
    public int hashCode() {
        int i;
        int nullValueValue;
        int i2 = this.memoizedHashCode;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        switch (this.kindCase_) {
            case 1:
                i = ((iHashCode * 37) + 1) * 53;
                nullValueValue = getNullValueValue();
                break;
            case 2:
                i = ((iHashCode * 37) + 2) * 53;
                nullValueValue = d0.i(Double.doubleToLongBits(getNumberValue()));
                break;
            case 3:
                i = ((iHashCode * 37) + 3) * 53;
                nullValueValue = getStringValue().hashCode();
                break;
            case 4:
                i = ((iHashCode * 37) + 4) * 53;
                nullValueValue = d0.d(getBoolValue());
                break;
            case 5:
                i = ((iHashCode * 37) + 5) * 53;
                nullValueValue = getStructValue().hashCode();
                break;
            case 6:
                i = ((iHashCode * 37) + 6) * 53;
                nullValueValue = getListValue().hashCode();
                break;
            default:
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
        }
        iHashCode = i + nullValueValue;
        int iHashCode3 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.e internalGetFieldAccessorTable() {
        return k1.f.d(Value.class, c.class);
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
        return new Value();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.kindCase_ == 1) {
            codedOutputStream.u0(1, ((Integer) this.kind_).intValue());
        }
        if (this.kindCase_ == 2) {
            codedOutputStream.s0(2, ((Double) this.kind_).doubleValue());
        }
        if (this.kindCase_ == 3) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.kind_);
        }
        if (this.kindCase_ == 4) {
            codedOutputStream.m0(4, ((Boolean) this.kind_).booleanValue());
        }
        if (this.kindCase_ == 5) {
            codedOutputStream.K0(5, (Struct) this.kind_);
        }
        if (this.kindCase_ == 6) {
            codedOutputStream.K0(6, (ListValue) this.kind_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public /* synthetic */ Value(GeneratedMessageV3.b bVar, a aVar) {
        this(bVar);
    }

    public static c newBuilder(Value value) {
        return DEFAULT_INSTANCE.toBuilder().y(value);
    }

    public static Value parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, tVar);
    }

    private Value(GeneratedMessageV3.b<?> bVar) {
        super(bVar);
        this.kindCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Value parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (Value) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
    }

    public static Value parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
    public Value getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public c toBuilder() {
        a aVar = null;
        return this == DEFAULT_INSTANCE ? new c(aVar) : new c(aVar).y(this);
    }

    public static Value parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, tVar);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public c newBuilderForType() {
        return newBuilder();
    }

    public static Value parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public c newBuilderForType(GeneratedMessageV3.c cVar) {
        return new c(cVar, null);
    }

    private Value() {
        this.kindCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Value parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, tVar);
    }

    public static Value parseFrom(InputStream inputStream) throws IOException {
        return (Value) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    private Value(j jVar, t tVar) throws InvalidProtocolBufferException {
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
                            int iS = jVar.s();
                            this.kindCase_ = 1;
                            this.kind_ = Integer.valueOf(iS);
                        } else if (iJ == 17) {
                            this.kindCase_ = 2;
                            this.kind_ = Double.valueOf(jVar.r());
                        } else if (iJ == 26) {
                            String strI = jVar.I();
                            this.kindCase_ = 3;
                            this.kind_ = strI;
                        } else if (iJ != 32) {
                            if (iJ == 42) {
                                Struct.b builder = this.kindCase_ == 5 ? ((Struct) this.kind_).toBuilder() : null;
                                q0 q0VarZ = jVar.z(Struct.parser(), tVar);
                                this.kind_ = q0VarZ;
                                if (builder != null) {
                                    builder.A((Struct) q0VarZ);
                                    this.kind_ = builder.buildPartial();
                                }
                                this.kindCase_ = 5;
                            } else if (iJ != 50) {
                                if (!parseUnknownField(jVar, bVarG, tVar, iJ)) {
                                }
                            } else {
                                ListValue.b builder2 = this.kindCase_ == 6 ? ((ListValue) this.kind_).toBuilder() : null;
                                q0 q0VarZ2 = jVar.z(ListValue.parser(), tVar);
                                this.kind_ = q0VarZ2;
                                if (builder2 != null) {
                                    builder2.z((ListValue) q0VarZ2);
                                    this.kind_ = builder2.buildPartial();
                                }
                                this.kindCase_ = 6;
                            }
                        } else {
                            this.kindCase_ = 4;
                            this.kind_ = Boolean.valueOf(jVar.p());
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

    public static Value parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (Value) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
    }

    public static Value parseFrom(j jVar) throws IOException {
        return (Value) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
    }

    public static Value parseFrom(j jVar, t tVar) throws IOException {
        return (Value) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
    }
}
