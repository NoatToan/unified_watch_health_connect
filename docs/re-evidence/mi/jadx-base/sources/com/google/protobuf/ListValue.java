package com.google.protobuf;

import defpackage.ihe;
import defpackage.vkh;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ListValue extends GeneratedMessageV3 implements ihe {
    private static final ListValue DEFAULT_INSTANCE = new ListValue();
    private static final vkh<ListValue> PARSER = new a();
    public static final int VALUES_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private List<Value> values_;

    public static class a extends c<ListValue> {
        @Override // defpackage.vkh
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ListValue parsePartialFrom(j jVar, t tVar) throws InvalidProtocolBufferException {
            return new ListValue(jVar, tVar, null);
        }
    }

    public static final class b extends GeneratedMessageV3.b<b> implements ihe {
        public int e;
        public List<Value> f;
        public c1<Value, Value.c, w1> g;

        public /* synthetic */ b(GeneratedMessageV3.c cVar, a aVar) {
            this(cVar);
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                x();
            }
        }

        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(p0 p0Var) {
            if (p0Var instanceof ListValue) {
                return z((ListValue) p0Var);
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

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public final b setUnknownFields(r1 r1Var) {
            return (b) super.setUnknownFields(r1Var);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.p0.a, com.google.protobuf.s0
        public Descriptors.b getDescriptorForType() {
            return k1.g;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        public GeneratedMessageV3.e h() {
            return k1.h.d(ListValue.class, b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (b) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public ListValue build() {
            ListValue listValueBuildPartial = buildPartial();
            if (listValueBuildPartial.isInitialized()) {
                return listValueBuildPartial;
            }
            throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) listValueBuildPartial);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public ListValue buildPartial() {
            ListValue listValue = new ListValue(this, (a) null);
            int i = this.e;
            c1<Value, Value.c, w1> c1Var = this.g;
            if (c1Var == null) {
                if ((i & 1) != 0) {
                    this.f = Collections.unmodifiableList(this.f);
                    this.e &= -2;
                }
                listValue.values_ = this.f;
            } else {
                listValue.values_ = c1Var.d();
            }
            onBuilt();
            return listValue;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.b, com.google.protobuf.a.AbstractC0258a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mo142clear() {
            super.mo142clear();
            c1<Value, Value.c, w1> c1Var = this.g;
            if (c1Var == null) {
                this.f = Collections.emptyList();
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

        public final void v() {
            if ((this.e & 1) == 0) {
                this.f = new ArrayList(this.f);
                this.e |= 1;
            }
        }

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public ListValue getDefaultInstanceForType() {
            return ListValue.getDefaultInstance();
        }

        public final c1<Value, Value.c, w1> x() {
            if (this.g == null) {
                this.g = new c1<>(this.f, (this.e & 1) != 0, g(), isClean());
                this.f = null;
            }
            return this.g;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a, com.google.protobuf.q0.a
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(j jVar, t tVar) throws Throwable {
            ListValue listValue = null;
            try {
                try {
                    ListValue listValue2 = (ListValue) ListValue.PARSER.parsePartialFrom(jVar, tVar);
                    if (listValue2 != null) {
                        z(listValue2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    ListValue listValue3 = (ListValue) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        listValue = listValue3;
                        if (listValue != null) {
                            z(listValue);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (listValue != null) {
                    z(listValue);
                }
                throw th;
            }
        }

        public b z(ListValue listValue) {
            if (listValue == ListValue.getDefaultInstance()) {
                return this;
            }
            if (this.g == null) {
                if (!listValue.values_.isEmpty()) {
                    if (this.f.isEmpty()) {
                        this.f = listValue.values_;
                        this.e &= -2;
                    } else {
                        v();
                        this.f.addAll(listValue.values_);
                    }
                    onChanged();
                }
            } else if (!listValue.values_.isEmpty()) {
                if (this.g.j()) {
                    this.g.f();
                    this.g = null;
                    this.f = listValue.values_;
                    this.e &= -2;
                    this.g = GeneratedMessageV3.alwaysUseFieldBuilders ? x() : null;
                } else {
                    this.g.b(listValue.values_);
                }
            }
            mo145mergeUnknownFields(listValue.unknownFields);
            onChanged();
            return this;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            this.f = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        public b(GeneratedMessageV3.c cVar) {
            super(cVar);
            this.f = Collections.emptyList();
            maybeForceBuilderInitialization();
        }
    }

    public /* synthetic */ ListValue(j jVar, t tVar, a aVar) throws InvalidProtocolBufferException {
        this(jVar, tVar);
    }

    public static ListValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.b getDescriptor() {
        return k1.g;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListValue) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static vkh<ListValue> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.a
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListValue)) {
            return super.equals(obj);
        }
        ListValue listValue = (ListValue) obj;
        return getValuesList().equals(listValue.getValuesList()) && this.unknownFields.equals(listValue.unknownFields);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public vkh<ListValue> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iG = 0;
        for (int i2 = 0; i2 < this.values_.size(); i2++) {
            iG += CodedOutputStream.G(1, this.values_.get(i2));
        }
        int serializedSize = iG + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.s0
    public final r1 getUnknownFields() {
        return this.unknownFields;
    }

    public Value getValues(int i) {
        return this.values_.get(i);
    }

    public int getValuesCount() {
        return this.values_.size();
    }

    public List<Value> getValuesList() {
        return this.values_;
    }

    public w1 getValuesOrBuilder(int i) {
        return this.values_.get(i);
    }

    public List<? extends w1> getValuesOrBuilderList() {
        return this.values_;
    }

    @Override // com.google.protobuf.a
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (getValuesCount() > 0) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getValuesList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.e internalGetFieldAccessorTable() {
        return k1.h.d(ListValue.class, b.class);
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
        return new ListValue();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.a, com.google.protobuf.q0
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.values_.size(); i++) {
            codedOutputStream.K0(1, this.values_.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public /* synthetic */ ListValue(GeneratedMessageV3.b bVar, a aVar) {
        this(bVar);
    }

    public static b newBuilder(ListValue listValue) {
        return DEFAULT_INSTANCE.toBuilder().z(listValue);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, tVar);
    }

    private ListValue(GeneratedMessageV3.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream, t tVar) throws IOException {
        return (ListValue) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, tVar);
    }

    public static ListValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, defpackage.bsf, com.google.protobuf.s0
    public ListValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public b toBuilder() {
        a aVar = null;
        return this == DEFAULT_INSTANCE ? new b(aVar) : new b(aVar).z(this);
    }

    public static ListValue parseFrom(ByteString byteString, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, tVar);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.q0, com.google.protobuf.p0
    public b newBuilderForType() {
        return newBuilder();
    }

    private ListValue() {
        this.memoizedIsInitialized = (byte) -1;
        this.values_ = Collections.emptyList();
    }

    public static ListValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public b newBuilderForType(GeneratedMessageV3.c cVar) {
        return new b(cVar, null);
    }

    public static ListValue parseFrom(byte[] bArr, t tVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, tVar);
    }

    public static ListValue parseFrom(InputStream inputStream) throws IOException {
        return (ListValue) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    private ListValue(j jVar, t tVar) throws InvalidProtocolBufferException {
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
                            if (!(z2 & true)) {
                                this.values_ = new ArrayList();
                                z2 = true;
                            }
                            this.values_.add((Value) jVar.z(Value.parser(), tVar));
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
                    this.values_ = Collections.unmodifiableList(this.values_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (z2 & true) {
            this.values_ = Collections.unmodifiableList(this.values_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static ListValue parseFrom(InputStream inputStream, t tVar) throws IOException {
        return (ListValue) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, tVar);
    }

    public static ListValue parseFrom(j jVar) throws IOException {
        return (ListValue) GeneratedMessageV3.parseWithIOException(PARSER, jVar);
    }

    public static ListValue parseFrom(j jVar, t tVar) throws IOException {
        return (ListValue) GeneratedMessageV3.parseWithIOException(PARSER, jVar, tVar);
    }
}
