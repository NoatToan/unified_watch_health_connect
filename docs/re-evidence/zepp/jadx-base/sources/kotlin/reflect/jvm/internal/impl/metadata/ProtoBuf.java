package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.ProtocolStringList;

/* JADX INFO: loaded from: classes23.dex */
public final class ProtoBuf {

    public static final class Annotation extends GeneratedMessageLite implements AnnotationOrBuilder {
        public static Parser<Annotation> PARSER = new a();
        private static final Annotation g;
        private final ByteString a;
        private int b;
        private int c;
        private List<Argument> d;
        private byte e;
        private int f;

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {
            public static Parser<Argument> PARSER = new a();
            private static final Argument g;
            private final ByteString a;
            private int b;
            private int c;
            private Value d;
            private byte e;
            private int f;

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {
                private int b;
                private int c;
                private Value d = Value.getDefaultInstance();

                private Builder() {
                    c();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static Builder b() {
                    return new Builder();
                }

                private void c() {
                }

                public Argument buildPartial() {
                    Argument argument = new Argument(this);
                    int i = this.b;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    argument.c = this.c;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    argument.d = this.d;
                    argument.b = i2;
                    return argument;
                }

                public Value getValue() {
                    return this.d;
                }

                public boolean hasNameId() {
                    return (this.b & 1) == 1;
                }

                public boolean hasValue() {
                    return (this.b & 2) == 2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasNameId() && hasValue() && getValue().isInitialized();
                }

                public Builder mergeValue(Value value) {
                    if ((this.b & 2) != 2 || this.d == Value.getDefaultInstance()) {
                        this.d = value;
                    } else {
                        this.d = Value.newBuilder(this.d).mergeFrom(value).buildPartial();
                    }
                    this.b |= 2;
                    return this;
                }

                public Builder setNameId(int i) {
                    this.b |= 1;
                    this.c = i;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Argument build() {
                    Argument argumentBuildPartial = buildPartial();
                    if (argumentBuildPartial.isInitialized()) {
                        return argumentBuildPartial;
                    }
                    throw AbstractMessageLite.Builder.newUninitializedMessageException(argumentBuildPartial);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public Argument getDefaultInstanceForType() {
                    return Argument.getDefaultInstance();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
                public Builder mo4297clone() {
                    return b().mergeFrom(buildPartial());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public Builder mergeFrom(Argument argument) {
                    if (argument == Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (argument.hasNameId()) {
                        setNameId(argument.getNameId());
                    }
                    if (argument.hasValue()) {
                        mergeValue(argument.getValue());
                    }
                    setUnknownFields(getUnknownFields().concat(argument.a));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Argument argument = null;
                    try {
                        try {
                            Argument partialFrom = Argument.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (partialFrom != null) {
                                mergeFrom(partialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            Argument argument2 = (Argument) e.getUnfinishedMessage();
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                argument = argument2;
                                if (argument != null) {
                                    mergeFrom(argument);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (argument != null) {
                            mergeFrom(argument);
                        }
                        throw th;
                    }
                }
            }

            public static final class Value extends GeneratedMessageLite implements ValueOrBuilder {
                public static Parser<Value> PARSER = new a();
                private static final Value p;
                private final ByteString a;
                private int b;
                private Type c;
                private long d;
                private float e;
                private double f;
                private int g;
                private int h;
                private int i;
                private Annotation j;
                private List<Value> k;
                private int l;
                private int m;
                private byte n;
                private int o;

                public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {
                    private int b;
                    private long d;
                    private float e;
                    private double f;
                    private int g;
                    private int h;
                    private int i;
                    private int l;
                    private int m;
                    private Type c = Type.BYTE;
                    private Annotation j = Annotation.getDefaultInstance();
                    private List<Value> k = Collections.emptyList();

                    private Builder() {
                        d();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static Builder b() {
                        return new Builder();
                    }

                    private void c() {
                        if ((this.b & 256) != 256) {
                            this.k = new ArrayList(this.k);
                            this.b |= 256;
                        }
                    }

                    private void d() {
                    }

                    public Value buildPartial() {
                        Value value = new Value(this);
                        int i = this.b;
                        int i2 = (i & 1) != 1 ? 0 : 1;
                        value.c = this.c;
                        if ((i & 2) == 2) {
                            i2 |= 2;
                        }
                        value.d = this.d;
                        if ((i & 4) == 4) {
                            i2 |= 4;
                        }
                        value.e = this.e;
                        if ((i & 8) == 8) {
                            i2 |= 8;
                        }
                        value.f = this.f;
                        if ((i & 16) == 16) {
                            i2 |= 16;
                        }
                        value.g = this.g;
                        if ((i & 32) == 32) {
                            i2 |= 32;
                        }
                        value.h = this.h;
                        if ((i & 64) == 64) {
                            i2 |= 64;
                        }
                        value.i = this.i;
                        if ((i & 128) == 128) {
                            i2 |= 128;
                        }
                        value.j = this.j;
                        if ((this.b & 256) == 256) {
                            this.k = Collections.unmodifiableList(this.k);
                            this.b &= -257;
                        }
                        value.k = this.k;
                        if ((i & 512) == 512) {
                            i2 |= 256;
                        }
                        value.l = this.l;
                        if ((i & 1024) == 1024) {
                            i2 |= 512;
                        }
                        value.m = this.m;
                        value.b = i2;
                        return value;
                    }

                    public Annotation getAnnotation() {
                        return this.j;
                    }

                    public Value getArrayElement(int i) {
                        return this.k.get(i);
                    }

                    public int getArrayElementCount() {
                        return this.k.size();
                    }

                    public boolean hasAnnotation() {
                        return (this.b & 128) == 128;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        if (hasAnnotation() && !getAnnotation().isInitialized()) {
                            return false;
                        }
                        for (int i = 0; i < getArrayElementCount(); i++) {
                            if (!getArrayElement(i).isInitialized()) {
                                return false;
                            }
                        }
                        return true;
                    }

                    public Builder mergeAnnotation(Annotation annotation) {
                        if ((this.b & 128) != 128 || this.j == Annotation.getDefaultInstance()) {
                            this.j = annotation;
                        } else {
                            this.j = Annotation.newBuilder(this.j).mergeFrom(annotation).buildPartial();
                        }
                        this.b |= 128;
                        return this;
                    }

                    public Builder setArrayDimensionCount(int i) {
                        this.b |= 512;
                        this.l = i;
                        return this;
                    }

                    public Builder setClassId(int i) {
                        this.b |= 32;
                        this.h = i;
                        return this;
                    }

                    public Builder setDoubleValue(double d) {
                        this.b |= 8;
                        this.f = d;
                        return this;
                    }

                    public Builder setEnumValueId(int i) {
                        this.b |= 64;
                        this.i = i;
                        return this;
                    }

                    public Builder setFlags(int i) {
                        this.b |= 1024;
                        this.m = i;
                        return this;
                    }

                    public Builder setFloatValue(float f) {
                        this.b |= 4;
                        this.e = f;
                        return this;
                    }

                    public Builder setIntValue(long j) {
                        this.b |= 2;
                        this.d = j;
                        return this;
                    }

                    public Builder setStringValue(int i) {
                        this.b |= 16;
                        this.g = i;
                        return this;
                    }

                    public Builder setType(Type type) {
                        Objects.requireNonNull(type);
                        this.b |= 1;
                        this.c = type;
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    public Value build() {
                        Value valueBuildPartial = buildPartial();
                        if (valueBuildPartial.isInitialized()) {
                            return valueBuildPartial;
                        }
                        throw AbstractMessageLite.Builder.newUninitializedMessageException(valueBuildPartial);
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                    public Value getDefaultInstanceForType() {
                        return Value.getDefaultInstance();
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                    /* JADX INFO: renamed from: clone */
                    public Builder mo4297clone() {
                        return b().mergeFrom(buildPartial());
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                    public Builder mergeFrom(Value value) {
                        if (value == Value.getDefaultInstance()) {
                            return this;
                        }
                        if (value.hasType()) {
                            setType(value.getType());
                        }
                        if (value.hasIntValue()) {
                            setIntValue(value.getIntValue());
                        }
                        if (value.hasFloatValue()) {
                            setFloatValue(value.getFloatValue());
                        }
                        if (value.hasDoubleValue()) {
                            setDoubleValue(value.getDoubleValue());
                        }
                        if (value.hasStringValue()) {
                            setStringValue(value.getStringValue());
                        }
                        if (value.hasClassId()) {
                            setClassId(value.getClassId());
                        }
                        if (value.hasEnumValueId()) {
                            setEnumValueId(value.getEnumValueId());
                        }
                        if (value.hasAnnotation()) {
                            mergeAnnotation(value.getAnnotation());
                        }
                        if (!value.k.isEmpty()) {
                            if (this.k.isEmpty()) {
                                this.k = value.k;
                                this.b &= -257;
                            } else {
                                c();
                                this.k.addAll(value.k);
                            }
                        }
                        if (value.hasArrayDimensionCount()) {
                            setArrayDimensionCount(value.getArrayDimensionCount());
                        }
                        if (value.hasFlags()) {
                            setFlags(value.getFlags());
                        }
                        setUnknownFields(getUnknownFields().concat(value.a));
                        return this;
                    }

                    /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                        Value value = null;
                        try {
                            try {
                                Value partialFrom = Value.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                                if (partialFrom != null) {
                                    mergeFrom(partialFrom);
                                }
                                return this;
                            } catch (InvalidProtocolBufferException e) {
                                Value value2 = (Value) e.getUnfinishedMessage();
                                try {
                                    throw e;
                                } catch (Throwable th) {
                                    th = th;
                                    value = value2;
                                    if (value != null) {
                                        mergeFrom(value);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (value != null) {
                                mergeFrom(value);
                            }
                            throw th;
                        }
                    }
                }

                public enum Type implements Internal.EnumLite {
                    BYTE(0, 0),
                    CHAR(1, 1),
                    SHORT(2, 2),
                    INT(3, 3),
                    LONG(4, 4),
                    FLOAT(5, 5),
                    DOUBLE(6, 6),
                    BOOLEAN(7, 7),
                    STRING(8, 8),
                    CLASS(9, 9),
                    ENUM(10, 10),
                    ANNOTATION(11, 11),
                    ARRAY(12, 12);

                    private static Internal.EnumLiteMap<Type> internalValueMap = new a();
                    private final int value;

                    public static class a implements Internal.EnumLiteMap<Type> {
                        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public Type findValueByNumber(int i) {
                            return Type.valueOf(i);
                        }
                    }

                    Type(int i, int i2) {
                        this.value = i2;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                    public final int getNumber() {
                        return this.value;
                    }

                    public static Type valueOf(int i) {
                        switch (i) {
                            case 0:
                                return BYTE;
                            case 1:
                                return CHAR;
                            case 2:
                                return SHORT;
                            case 3:
                                return INT;
                            case 4:
                                return LONG;
                            case 5:
                                return FLOAT;
                            case 6:
                                return DOUBLE;
                            case 7:
                                return BOOLEAN;
                            case 8:
                                return STRING;
                            case 9:
                                return CLASS;
                            case 10:
                                return ENUM;
                            case 11:
                                return ANNOTATION;
                            case 12:
                                return ARRAY;
                            default:
                                return null;
                        }
                    }
                }

                public static class a extends AbstractParser<Value> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                    public Value parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new Value(codedInputStream, extensionRegistryLite);
                    }
                }

                static {
                    Value value = new Value(true);
                    p = value;
                    value.v();
                }

                public static Value getDefaultInstance() {
                    return p;
                }

                public static Builder newBuilder() {
                    return Builder.b();
                }

                private void v() {
                    this.c = Type.BYTE;
                    this.d = 0L;
                    this.e = 0.0f;
                    this.f = 0.0d;
                    this.g = 0;
                    this.h = 0;
                    this.i = 0;
                    this.j = Annotation.getDefaultInstance();
                    this.k = Collections.emptyList();
                    this.l = 0;
                    this.m = 0;
                }

                public Annotation getAnnotation() {
                    return this.j;
                }

                public int getArrayDimensionCount() {
                    return this.l;
                }

                public Value getArrayElement(int i) {
                    return this.k.get(i);
                }

                public int getArrayElementCount() {
                    return this.k.size();
                }

                public List<Value> getArrayElementList() {
                    return this.k;
                }

                public int getClassId() {
                    return this.h;
                }

                public double getDoubleValue() {
                    return this.f;
                }

                public int getEnumValueId() {
                    return this.i;
                }

                public int getFlags() {
                    return this.m;
                }

                public float getFloatValue() {
                    return this.e;
                }

                public long getIntValue() {
                    return this.d;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public Parser<Value> getParserForType() {
                    return PARSER;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public int getSerializedSize() {
                    int i = this.o;
                    if (i != -1) {
                        return i;
                    }
                    int iComputeEnumSize = (this.b & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.c.getNumber()) + 0 : 0;
                    if ((this.b & 2) == 2) {
                        iComputeEnumSize += CodedOutputStream.computeSInt64Size(2, this.d);
                    }
                    if ((this.b & 4) == 4) {
                        iComputeEnumSize += CodedOutputStream.computeFloatSize(3, this.e);
                    }
                    if ((this.b & 8) == 8) {
                        iComputeEnumSize += CodedOutputStream.computeDoubleSize(4, this.f);
                    }
                    if ((this.b & 16) == 16) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(5, this.g);
                    }
                    if ((this.b & 32) == 32) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(6, this.h);
                    }
                    if ((this.b & 64) == 64) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(7, this.i);
                    }
                    if ((this.b & 128) == 128) {
                        iComputeEnumSize += CodedOutputStream.computeMessageSize(8, this.j);
                    }
                    for (int i2 = 0; i2 < this.k.size(); i2++) {
                        iComputeEnumSize += CodedOutputStream.computeMessageSize(9, this.k.get(i2));
                    }
                    if ((this.b & 512) == 512) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(10, this.m);
                    }
                    if ((this.b & 256) == 256) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(11, this.l);
                    }
                    int size = iComputeEnumSize + this.a.size();
                    this.o = size;
                    return size;
                }

                public int getStringValue() {
                    return this.g;
                }

                public Type getType() {
                    return this.c;
                }

                public boolean hasAnnotation() {
                    return (this.b & 128) == 128;
                }

                public boolean hasArrayDimensionCount() {
                    return (this.b & 256) == 256;
                }

                public boolean hasClassId() {
                    return (this.b & 32) == 32;
                }

                public boolean hasDoubleValue() {
                    return (this.b & 8) == 8;
                }

                public boolean hasEnumValueId() {
                    return (this.b & 64) == 64;
                }

                public boolean hasFlags() {
                    return (this.b & 512) == 512;
                }

                public boolean hasFloatValue() {
                    return (this.b & 4) == 4;
                }

                public boolean hasIntValue() {
                    return (this.b & 2) == 2;
                }

                public boolean hasStringValue() {
                    return (this.b & 16) == 16;
                }

                public boolean hasType() {
                    return (this.b & 1) == 1;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b = this.n;
                    if (b == 1) {
                        return true;
                    }
                    if (b == 0) {
                        return false;
                    }
                    if (hasAnnotation() && !getAnnotation().isInitialized()) {
                        this.n = (byte) 0;
                        return false;
                    }
                    for (int i = 0; i < getArrayElementCount(); i++) {
                        if (!getArrayElement(i).isInitialized()) {
                            this.n = (byte) 0;
                            return false;
                        }
                    }
                    this.n = (byte) 1;
                    return true;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    getSerializedSize();
                    if ((this.b & 1) == 1) {
                        codedOutputStream.writeEnum(1, this.c.getNumber());
                    }
                    if ((this.b & 2) == 2) {
                        codedOutputStream.writeSInt64(2, this.d);
                    }
                    if ((this.b & 4) == 4) {
                        codedOutputStream.writeFloat(3, this.e);
                    }
                    if ((this.b & 8) == 8) {
                        codedOutputStream.writeDouble(4, this.f);
                    }
                    if ((this.b & 16) == 16) {
                        codedOutputStream.writeInt32(5, this.g);
                    }
                    if ((this.b & 32) == 32) {
                        codedOutputStream.writeInt32(6, this.h);
                    }
                    if ((this.b & 64) == 64) {
                        codedOutputStream.writeInt32(7, this.i);
                    }
                    if ((this.b & 128) == 128) {
                        codedOutputStream.writeMessage(8, this.j);
                    }
                    for (int i = 0; i < this.k.size(); i++) {
                        codedOutputStream.writeMessage(9, this.k.get(i));
                    }
                    if ((this.b & 512) == 512) {
                        codedOutputStream.writeInt32(10, this.m);
                    }
                    if ((this.b & 256) == 256) {
                        codedOutputStream.writeInt32(11, this.l);
                    }
                    codedOutputStream.writeRawBytes(this.a);
                }

                public static Builder newBuilder(Value value) {
                    return newBuilder().mergeFrom(value);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public Value getDefaultInstanceForType() {
                    return p;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public Builder toBuilder() {
                    return newBuilder(this);
                }

                private Value(GeneratedMessageLite.Builder builder) {
                    super(builder);
                    this.n = (byte) -1;
                    this.o = -1;
                    this.a = builder.getUnknownFields();
                }

                private Value(boolean z) {
                    this.n = (byte) -1;
                    this.o = -1;
                    this.a = ByteString.EMPTY;
                }

                private Value(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    this.n = (byte) -1;
                    this.o = -1;
                    v();
                    ByteString.Output outputNewOutput = ByteString.newOutput();
                    CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
                    boolean z = false;
                    int i = 0;
                    while (!z) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                switch (tag) {
                                    case 0:
                                        break;
                                    case 8:
                                        int i2 = codedInputStream.readEnum();
                                        Type typeValueOf = Type.valueOf(i2);
                                        if (typeValueOf == null) {
                                            codedOutputStreamNewInstance.writeRawVarint32(tag);
                                            codedOutputStreamNewInstance.writeRawVarint32(i2);
                                        } else {
                                            this.b |= 1;
                                            this.c = typeValueOf;
                                            continue;
                                        }
                                        break;
                                    case 16:
                                        this.b |= 2;
                                        this.d = codedInputStream.readSInt64();
                                        continue;
                                    case 29:
                                        this.b |= 4;
                                        this.e = codedInputStream.readFloat();
                                        continue;
                                    case 33:
                                        this.b |= 8;
                                        this.f = codedInputStream.readDouble();
                                        continue;
                                    case 40:
                                        this.b |= 16;
                                        this.g = codedInputStream.readInt32();
                                        continue;
                                    case 48:
                                        this.b |= 32;
                                        this.h = codedInputStream.readInt32();
                                        continue;
                                    case 56:
                                        this.b |= 64;
                                        this.i = codedInputStream.readInt32();
                                        continue;
                                    case 66:
                                        Builder builder = (this.b & 128) == 128 ? this.j.toBuilder() : null;
                                        Annotation annotation = (Annotation) codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite);
                                        this.j = annotation;
                                        if (builder != null) {
                                            builder.mergeFrom(annotation);
                                            this.j = builder.buildPartial();
                                        }
                                        this.b |= 128;
                                        continue;
                                    case 74:
                                        if ((i & 256) != 256) {
                                            this.k = new ArrayList();
                                            i |= 256;
                                        }
                                        this.k.add((Value) codedInputStream.readMessage(PARSER, extensionRegistryLite));
                                        continue;
                                    case 80:
                                        this.b |= 512;
                                        this.m = codedInputStream.readInt32();
                                        continue;
                                    case 88:
                                        this.b |= 256;
                                        this.l = codedInputStream.readInt32();
                                        continue;
                                    default:
                                        if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                            break;
                                        }
                                        break;
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e) {
                                throw e.setUnfinishedMessage(this);
                            } catch (IOException e2) {
                                throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                            }
                        } catch (Throwable th) {
                            if ((i & 256) == 256) {
                                this.k = Collections.unmodifiableList(this.k);
                            }
                            try {
                                codedOutputStreamNewInstance.flush();
                            } catch (IOException unused) {
                            } finally {
                                this.a = outputNewOutput.toByteString();
                            }
                            makeExtensionsImmutable();
                            throw th;
                        }
                    }
                    if ((i & 256) == 256) {
                        this.k = Collections.unmodifiableList(this.k);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused2) {
                    } finally {
                        this.a = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                }
            }

            public interface ValueOrBuilder extends MessageLiteOrBuilder {
            }

            public static class a extends AbstractParser<Argument> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public Argument parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Argument(codedInputStream, extensionRegistryLite);
                }
            }

            static {
                Argument argument = new Argument(true);
                g = argument;
                argument.k();
            }

            public static Argument getDefaultInstance() {
                return g;
            }

            private void k() {
                this.c = 0;
                this.d = Value.getDefaultInstance();
            }

            public static Builder newBuilder() {
                return Builder.b();
            }

            public int getNameId() {
                return this.c;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<Argument> getParserForType() {
                return PARSER;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.f;
                if (i != -1) {
                    return i;
                }
                int iComputeInt32Size = (this.b & 1) == 1 ? 0 + CodedOutputStream.computeInt32Size(1, this.c) : 0;
                if ((this.b & 2) == 2) {
                    iComputeInt32Size += CodedOutputStream.computeMessageSize(2, this.d);
                }
                int size = iComputeInt32Size + this.a.size();
                this.f = size;
                return size;
            }

            public Value getValue() {
                return this.d;
            }

            public boolean hasNameId() {
                return (this.b & 1) == 1;
            }

            public boolean hasValue() {
                return (this.b & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.e;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!hasNameId()) {
                    this.e = (byte) 0;
                    return false;
                }
                if (!hasValue()) {
                    this.e = (byte) 0;
                    return false;
                }
                if (getValue().isInitialized()) {
                    this.e = (byte) 1;
                    return true;
                }
                this.e = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.b & 1) == 1) {
                    codedOutputStream.writeInt32(1, this.c);
                }
                if ((this.b & 2) == 2) {
                    codedOutputStream.writeMessage(2, this.d);
                }
                codedOutputStream.writeRawBytes(this.a);
            }

            public static Builder newBuilder(Argument argument) {
                return newBuilder().mergeFrom(argument);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Argument getDefaultInstanceForType() {
                return g;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder newBuilderForType() {
                return newBuilder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder toBuilder() {
                return newBuilder(this);
            }

            private Argument(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.e = (byte) -1;
                this.f = -1;
                this.a = builder.getUnknownFields();
            }

            private Argument(boolean z) {
                this.e = (byte) -1;
                this.f = -1;
                this.a = ByteString.EMPTY;
            }

            private Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this.e = (byte) -1;
                this.f = -1;
                k();
                ByteString.Output outputNewOutput = ByteString.newOutput();
                CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 8) {
                                        this.b |= 1;
                                        this.c = codedInputStream.readInt32();
                                    } else if (tag != 18) {
                                        if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        Value.Builder builder = (this.b & 2) == 2 ? this.d.toBuilder() : null;
                                        Value value = (Value) codedInputStream.readMessage(Value.PARSER, extensionRegistryLite);
                                        this.d = value;
                                        if (builder != null) {
                                            builder.mergeFrom(value);
                                            this.d = builder.buildPartial();
                                        }
                                        this.b |= 2;
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e) {
                                throw e.setUnfinishedMessage(this);
                            }
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.a = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                try {
                    codedOutputStreamNewInstance.flush();
                } catch (IOException unused2) {
                } finally {
                    this.a = outputNewOutput.toByteString();
                }
                makeExtensionsImmutable();
            }
        }

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Annotation, Builder> implements AnnotationOrBuilder {
            private int b;
            private int c;
            private List<Argument> d = Collections.emptyList();

            private Builder() {
                d();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder b() {
                return new Builder();
            }

            private void c() {
                if ((this.b & 2) != 2) {
                    this.d = new ArrayList(this.d);
                    this.b |= 2;
                }
            }

            private void d() {
            }

            public Annotation buildPartial() {
                Annotation annotation = new Annotation(this);
                int i = (this.b & 1) != 1 ? 0 : 1;
                annotation.c = this.c;
                if ((this.b & 2) == 2) {
                    this.d = Collections.unmodifiableList(this.d);
                    this.b &= -3;
                }
                annotation.d = this.d;
                annotation.b = i;
                return annotation;
            }

            public Argument getArgument(int i) {
                return this.d.get(i);
            }

            public int getArgumentCount() {
                return this.d.size();
            }

            public boolean hasId() {
                return (this.b & 1) == 1;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasId()) {
                    return false;
                }
                for (int i = 0; i < getArgumentCount(); i++) {
                    if (!getArgument(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder setId(int i) {
                this.b |= 1;
                this.c = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Annotation build() {
                Annotation annotationBuildPartial = buildPartial();
                if (annotationBuildPartial.isInitialized()) {
                    return annotationBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(annotationBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Annotation getDefaultInstanceForType() {
                return Annotation.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4297clone() {
                return b().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Annotation annotation) {
                if (annotation == Annotation.getDefaultInstance()) {
                    return this;
                }
                if (annotation.hasId()) {
                    setId(annotation.getId());
                }
                if (!annotation.d.isEmpty()) {
                    if (this.d.isEmpty()) {
                        this.d = annotation.d;
                        this.b &= -3;
                    } else {
                        c();
                        this.d.addAll(annotation.d);
                    }
                }
                setUnknownFields(getUnknownFields().concat(annotation.a));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Annotation annotation = null;
                try {
                    try {
                        Annotation partialFrom = Annotation.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Annotation annotation2 = (Annotation) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            annotation = annotation2;
                            if (annotation != null) {
                                mergeFrom(annotation);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (annotation != null) {
                        mergeFrom(annotation);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<Annotation> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Annotation parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Annotation(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Annotation annotation = new Annotation(true);
            g = annotation;
            annotation.m();
        }

        public static Annotation getDefaultInstance() {
            return g;
        }

        private void m() {
            this.c = 0;
            this.d = Collections.emptyList();
        }

        public static Builder newBuilder() {
            return Builder.b();
        }

        public Argument getArgument(int i) {
            return this.d.get(i);
        }

        public int getArgumentCount() {
            return this.d.size();
        }

        public List<Argument> getArgumentList() {
            return this.d;
        }

        public int getId() {
            return this.c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Annotation> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.f;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.b & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.c) + 0 : 0;
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(2, this.d.get(i2));
            }
            int size = iComputeInt32Size + this.a.size();
            this.f = size;
            return size;
        }

        public boolean hasId() {
            return (this.b & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.e;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasId()) {
                this.e = (byte) 0;
                return false;
            }
            for (int i = 0; i < getArgumentCount(); i++) {
                if (!getArgument(i).isInitialized()) {
                    this.e = (byte) 0;
                    return false;
                }
            }
            this.e = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.b & 1) == 1) {
                codedOutputStream.writeInt32(1, this.c);
            }
            for (int i = 0; i < this.d.size(); i++) {
                codedOutputStream.writeMessage(2, this.d.get(i));
            }
            codedOutputStream.writeRawBytes(this.a);
        }

        public static Builder newBuilder(Annotation annotation) {
            return newBuilder().mergeFrom(annotation);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Annotation getDefaultInstanceForType() {
            return g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Annotation(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.e = (byte) -1;
            this.f = -1;
            this.a = builder.getUnknownFields();
        }

        private Annotation(boolean z) {
            this.e = (byte) -1;
            this.f = -1;
            this.a = ByteString.EMPTY;
        }

        private Annotation(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.e = (byte) -1;
            this.f = -1;
            m();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.b |= 1;
                                this.c = codedInputStream.readInt32();
                            } else if (tag != 18) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if ((i & 2) != 2) {
                                    this.d = new ArrayList();
                                    i |= 2;
                                }
                                this.d.add((Argument) codedInputStream.readMessage(Argument.PARSER, extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if ((i & 2) == 2) {
                            this.d = Collections.unmodifiableList(this.d);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.a = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((i & 2) == 2) {
                this.d = Collections.unmodifiableList(this.d);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.a = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface AnnotationOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Class extends GeneratedMessageLite.ExtendableMessage<Class> implements ClassOrBuilder {
        private static final Class B;
        public static Parser<Class> PARSER = new a();
        private int A;
        private final ByteString b;
        private int c;
        private int d;
        private int e;
        private int f;
        private List<TypeParameter> g;
        private List<Type> h;
        private List<Integer> i;
        private int j;
        private List<Integer> k;
        private int l;
        private List<Constructor> m;
        private List<Function> n;
        private List<Property> o;
        private List<TypeAlias> p;
        private List<EnumEntry> q;
        private List<Integer> r;
        private int s;
        private int t;
        private Type u;
        private int v;
        private TypeTable w;
        private List<Integer> x;
        private VersionRequirementTable y;
        private byte z;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Class, Builder> implements ClassOrBuilder {
            private int d;
            private int f;
            private int g;
            private int r;
            private int t;
            private int e = 6;
            private List<TypeParameter> h = Collections.emptyList();
            private List<Type> i = Collections.emptyList();
            private List<Integer> j = Collections.emptyList();
            private List<Integer> k = Collections.emptyList();
            private List<Constructor> l = Collections.emptyList();
            private List<Function> m = Collections.emptyList();
            private List<Property> n = Collections.emptyList();
            private List<TypeAlias> o = Collections.emptyList();
            private List<EnumEntry> p = Collections.emptyList();
            private List<Integer> q = Collections.emptyList();
            private Type s = Type.getDefaultInstance();
            private TypeTable u = TypeTable.getDefaultInstance();
            private List<Integer> v = Collections.emptyList();
            private VersionRequirementTable w = VersionRequirementTable.getDefaultInstance();

            private Builder() {
                q();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder e() {
                return new Builder();
            }

            private void f() {
                if ((this.d & 128) != 128) {
                    this.l = new ArrayList(this.l);
                    this.d |= 128;
                }
            }

            private void g() {
                if ((this.d & 2048) != 2048) {
                    this.p = new ArrayList(this.p);
                    this.d |= 2048;
                }
            }

            private void h() {
                if ((this.d & 256) != 256) {
                    this.m = new ArrayList(this.m);
                    this.d |= 256;
                }
            }

            private void i() {
                if ((this.d & 64) != 64) {
                    this.k = new ArrayList(this.k);
                    this.d |= 64;
                }
            }

            private void j() {
                if ((this.d & 512) != 512) {
                    this.n = new ArrayList(this.n);
                    this.d |= 512;
                }
            }

            private void k() {
                if ((this.d & 4096) != 4096) {
                    this.q = new ArrayList(this.q);
                    this.d |= 4096;
                }
            }

            private void l() {
                if ((this.d & 32) != 32) {
                    this.j = new ArrayList(this.j);
                    this.d |= 32;
                }
            }

            private void m() {
                if ((this.d & 16) != 16) {
                    this.i = new ArrayList(this.i);
                    this.d |= 16;
                }
            }

            private void n() {
                if ((this.d & 1024) != 1024) {
                    this.o = new ArrayList(this.o);
                    this.d |= 1024;
                }
            }

            private void o() {
                if ((this.d & 8) != 8) {
                    this.h = new ArrayList(this.h);
                    this.d |= 8;
                }
            }

            private void p() {
                if ((this.d & 131072) != 131072) {
                    this.v = new ArrayList(this.v);
                    this.d |= 131072;
                }
            }

            private void q() {
            }

            public Class buildPartial() {
                Class r0 = new Class(this);
                int i = this.d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                r0.d = this.e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                r0.e = this.f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                r0.f = this.g;
                if ((this.d & 8) == 8) {
                    this.h = Collections.unmodifiableList(this.h);
                    this.d &= -9;
                }
                r0.g = this.h;
                if ((this.d & 16) == 16) {
                    this.i = Collections.unmodifiableList(this.i);
                    this.d &= -17;
                }
                r0.h = this.i;
                if ((this.d & 32) == 32) {
                    this.j = Collections.unmodifiableList(this.j);
                    this.d &= -33;
                }
                r0.i = this.j;
                if ((this.d & 64) == 64) {
                    this.k = Collections.unmodifiableList(this.k);
                    this.d &= -65;
                }
                r0.k = this.k;
                if ((this.d & 128) == 128) {
                    this.l = Collections.unmodifiableList(this.l);
                    this.d &= -129;
                }
                r0.m = this.l;
                if ((this.d & 256) == 256) {
                    this.m = Collections.unmodifiableList(this.m);
                    this.d &= -257;
                }
                r0.n = this.m;
                if ((this.d & 512) == 512) {
                    this.n = Collections.unmodifiableList(this.n);
                    this.d &= -513;
                }
                r0.o = this.n;
                if ((this.d & 1024) == 1024) {
                    this.o = Collections.unmodifiableList(this.o);
                    this.d &= -1025;
                }
                r0.p = this.o;
                if ((this.d & 2048) == 2048) {
                    this.p = Collections.unmodifiableList(this.p);
                    this.d &= -2049;
                }
                r0.q = this.p;
                if ((this.d & 4096) == 4096) {
                    this.q = Collections.unmodifiableList(this.q);
                    this.d &= -4097;
                }
                r0.r = this.q;
                if ((i & 8192) == 8192) {
                    i2 |= 8;
                }
                r0.t = this.r;
                if ((i & 16384) == 16384) {
                    i2 |= 16;
                }
                r0.u = this.s;
                if ((i & 32768) == 32768) {
                    i2 |= 32;
                }
                r0.v = this.t;
                if ((i & 65536) == 65536) {
                    i2 |= 64;
                }
                r0.w = this.u;
                if ((this.d & 131072) == 131072) {
                    this.v = Collections.unmodifiableList(this.v);
                    this.d &= -131073;
                }
                r0.x = this.v;
                if ((i & 262144) == 262144) {
                    i2 |= 128;
                }
                r0.y = this.w;
                r0.c = i2;
                return r0;
            }

            public Constructor getConstructor(int i) {
                return this.l.get(i);
            }

            public int getConstructorCount() {
                return this.l.size();
            }

            public EnumEntry getEnumEntry(int i) {
                return this.p.get(i);
            }

            public int getEnumEntryCount() {
                return this.p.size();
            }

            public Function getFunction(int i) {
                return this.m.get(i);
            }

            public int getFunctionCount() {
                return this.m.size();
            }

            public Type getInlineClassUnderlyingType() {
                return this.s;
            }

            public Property getProperty(int i) {
                return this.n.get(i);
            }

            public int getPropertyCount() {
                return this.n.size();
            }

            public Type getSupertype(int i) {
                return this.i.get(i);
            }

            public int getSupertypeCount() {
                return this.i.size();
            }

            public TypeAlias getTypeAlias(int i) {
                return this.o.get(i);
            }

            public int getTypeAliasCount() {
                return this.o.size();
            }

            public TypeParameter getTypeParameter(int i) {
                return this.h.get(i);
            }

            public int getTypeParameterCount() {
                return this.h.size();
            }

            public TypeTable getTypeTable() {
                return this.u;
            }

            public boolean hasFqName() {
                return (this.d & 2) == 2;
            }

            public boolean hasInlineClassUnderlyingType() {
                return (this.d & 16384) == 16384;
            }

            public boolean hasTypeTable() {
                return (this.d & 65536) == 65536;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasFqName()) {
                    return false;
                }
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getSupertypeCount(); i2++) {
                    if (!getSupertype(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < getConstructorCount(); i3++) {
                    if (!getConstructor(i3).isInitialized()) {
                        return false;
                    }
                }
                for (int i4 = 0; i4 < getFunctionCount(); i4++) {
                    if (!getFunction(i4).isInitialized()) {
                        return false;
                    }
                }
                for (int i5 = 0; i5 < getPropertyCount(); i5++) {
                    if (!getProperty(i5).isInitialized()) {
                        return false;
                    }
                }
                for (int i6 = 0; i6 < getTypeAliasCount(); i6++) {
                    if (!getTypeAlias(i6).isInitialized()) {
                        return false;
                    }
                }
                for (int i7 = 0; i7 < getEnumEntryCount(); i7++) {
                    if (!getEnumEntry(i7).isInitialized()) {
                        return false;
                    }
                }
                if (!hasInlineClassUnderlyingType() || getInlineClassUnderlyingType().isInitialized()) {
                    return (!hasTypeTable() || getTypeTable().isInitialized()) && extensionsAreInitialized();
                }
                return false;
            }

            public Builder mergeInlineClassUnderlyingType(Type type) {
                if ((this.d & 16384) != 16384 || this.s == Type.getDefaultInstance()) {
                    this.s = type;
                } else {
                    this.s = Type.newBuilder(this.s).mergeFrom(type).buildPartial();
                }
                this.d |= 16384;
                return this;
            }

            public Builder mergeTypeTable(TypeTable typeTable) {
                if ((this.d & 65536) != 65536 || this.u == TypeTable.getDefaultInstance()) {
                    this.u = typeTable;
                } else {
                    this.u = TypeTable.newBuilder(this.u).mergeFrom(typeTable).buildPartial();
                }
                this.d |= 65536;
                return this;
            }

            public Builder mergeVersionRequirementTable(VersionRequirementTable versionRequirementTable) {
                if ((this.d & 262144) != 262144 || this.w == VersionRequirementTable.getDefaultInstance()) {
                    this.w = versionRequirementTable;
                } else {
                    this.w = VersionRequirementTable.newBuilder(this.w).mergeFrom(versionRequirementTable).buildPartial();
                }
                this.d |= 262144;
                return this;
            }

            public Builder setCompanionObjectName(int i) {
                this.d |= 4;
                this.g = i;
                return this;
            }

            public Builder setFlags(int i) {
                this.d |= 1;
                this.e = i;
                return this;
            }

            public Builder setFqName(int i) {
                this.d |= 2;
                this.f = i;
                return this;
            }

            public Builder setInlineClassUnderlyingPropertyName(int i) {
                this.d |= 8192;
                this.r = i;
                return this;
            }

            public Builder setInlineClassUnderlyingTypeId(int i) {
                this.d |= 32768;
                this.t = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Class build() {
                Class classBuildPartial = buildPartial();
                if (classBuildPartial.isInitialized()) {
                    return classBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(classBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Class getDefaultInstanceForType() {
                return Class.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Class r3) {
                if (r3 == Class.getDefaultInstance()) {
                    return this;
                }
                if (r3.hasFlags()) {
                    setFlags(r3.getFlags());
                }
                if (r3.hasFqName()) {
                    setFqName(r3.getFqName());
                }
                if (r3.hasCompanionObjectName()) {
                    setCompanionObjectName(r3.getCompanionObjectName());
                }
                if (!r3.g.isEmpty()) {
                    if (this.h.isEmpty()) {
                        this.h = r3.g;
                        this.d &= -9;
                    } else {
                        o();
                        this.h.addAll(r3.g);
                    }
                }
                if (!r3.h.isEmpty()) {
                    if (this.i.isEmpty()) {
                        this.i = r3.h;
                        this.d &= -17;
                    } else {
                        m();
                        this.i.addAll(r3.h);
                    }
                }
                if (!r3.i.isEmpty()) {
                    if (this.j.isEmpty()) {
                        this.j = r3.i;
                        this.d &= -33;
                    } else {
                        l();
                        this.j.addAll(r3.i);
                    }
                }
                if (!r3.k.isEmpty()) {
                    if (this.k.isEmpty()) {
                        this.k = r3.k;
                        this.d &= -65;
                    } else {
                        i();
                        this.k.addAll(r3.k);
                    }
                }
                if (!r3.m.isEmpty()) {
                    if (this.l.isEmpty()) {
                        this.l = r3.m;
                        this.d &= -129;
                    } else {
                        f();
                        this.l.addAll(r3.m);
                    }
                }
                if (!r3.n.isEmpty()) {
                    if (this.m.isEmpty()) {
                        this.m = r3.n;
                        this.d &= -257;
                    } else {
                        h();
                        this.m.addAll(r3.n);
                    }
                }
                if (!r3.o.isEmpty()) {
                    if (this.n.isEmpty()) {
                        this.n = r3.o;
                        this.d &= -513;
                    } else {
                        j();
                        this.n.addAll(r3.o);
                    }
                }
                if (!r3.p.isEmpty()) {
                    if (this.o.isEmpty()) {
                        this.o = r3.p;
                        this.d &= -1025;
                    } else {
                        n();
                        this.o.addAll(r3.p);
                    }
                }
                if (!r3.q.isEmpty()) {
                    if (this.p.isEmpty()) {
                        this.p = r3.q;
                        this.d &= -2049;
                    } else {
                        g();
                        this.p.addAll(r3.q);
                    }
                }
                if (!r3.r.isEmpty()) {
                    if (this.q.isEmpty()) {
                        this.q = r3.r;
                        this.d &= -4097;
                    } else {
                        k();
                        this.q.addAll(r3.r);
                    }
                }
                if (r3.hasInlineClassUnderlyingPropertyName()) {
                    setInlineClassUnderlyingPropertyName(r3.getInlineClassUnderlyingPropertyName());
                }
                if (r3.hasInlineClassUnderlyingType()) {
                    mergeInlineClassUnderlyingType(r3.getInlineClassUnderlyingType());
                }
                if (r3.hasInlineClassUnderlyingTypeId()) {
                    setInlineClassUnderlyingTypeId(r3.getInlineClassUnderlyingTypeId());
                }
                if (r3.hasTypeTable()) {
                    mergeTypeTable(r3.getTypeTable());
                }
                if (!r3.x.isEmpty()) {
                    if (this.v.isEmpty()) {
                        this.v = r3.x;
                        this.d &= -131073;
                    } else {
                        p();
                        this.v.addAll(r3.x);
                    }
                }
                if (r3.hasVersionRequirementTable()) {
                    mergeVersionRequirementTable(r3.getVersionRequirementTable());
                }
                mergeExtensionFields(r3);
                setUnknownFields(getUnknownFields().concat(r3.b));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4297clone() {
                return e().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Class r0 = null;
                try {
                    try {
                        Class partialFrom = Class.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Class r4 = (Class) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            r0 = r4;
                            if (r0 != null) {
                                mergeFrom(r0);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (r0 != null) {
                        mergeFrom(r0);
                    }
                    throw th;
                }
            }
        }

        public enum Kind implements Internal.EnumLite {
            CLASS(0, 0),
            INTERFACE(1, 1),
            ENUM_CLASS(2, 2),
            ENUM_ENTRY(3, 3),
            ANNOTATION_CLASS(4, 4),
            OBJECT(5, 5),
            COMPANION_OBJECT(6, 6);

            private static Internal.EnumLiteMap<Kind> internalValueMap = new a();
            private final int value;

            public static class a implements Internal.EnumLiteMap<Kind> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Kind findValueByNumber(int i) {
                    return Kind.valueOf(i);
                }
            }

            Kind(int i, int i2) {
                this.value = i2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static Kind valueOf(int i) {
                switch (i) {
                    case 0:
                        return CLASS;
                    case 1:
                        return INTERFACE;
                    case 2:
                        return ENUM_CLASS;
                    case 3:
                        return ENUM_ENTRY;
                    case 4:
                        return ANNOTATION_CLASS;
                    case 5:
                        return OBJECT;
                    case 6:
                        return COMPANION_OBJECT;
                    default:
                        return null;
                }
            }
        }

        public static class a extends AbstractParser<Class> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Class parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Class(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Class r0 = new Class(true);
            B = r0;
            r0.P();
        }

        private void P() {
            this.d = 6;
            this.e = 0;
            this.f = 0;
            this.g = Collections.emptyList();
            this.h = Collections.emptyList();
            this.i = Collections.emptyList();
            this.k = Collections.emptyList();
            this.m = Collections.emptyList();
            this.n = Collections.emptyList();
            this.o = Collections.emptyList();
            this.p = Collections.emptyList();
            this.q = Collections.emptyList();
            this.r = Collections.emptyList();
            this.t = 0;
            this.u = Type.getDefaultInstance();
            this.v = 0;
            this.w = TypeTable.getDefaultInstance();
            this.x = Collections.emptyList();
            this.y = VersionRequirementTable.getDefaultInstance();
        }

        public static Class getDefaultInstance() {
            return B;
        }

        public static Builder newBuilder() {
            return Builder.e();
        }

        public static Class parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public int getCompanionObjectName() {
            return this.f;
        }

        public Constructor getConstructor(int i) {
            return this.m.get(i);
        }

        public int getConstructorCount() {
            return this.m.size();
        }

        public List<Constructor> getConstructorList() {
            return this.m;
        }

        public EnumEntry getEnumEntry(int i) {
            return this.q.get(i);
        }

        public int getEnumEntryCount() {
            return this.q.size();
        }

        public List<EnumEntry> getEnumEntryList() {
            return this.q;
        }

        public int getFlags() {
            return this.d;
        }

        public int getFqName() {
            return this.e;
        }

        public Function getFunction(int i) {
            return this.n.get(i);
        }

        public int getFunctionCount() {
            return this.n.size();
        }

        public List<Function> getFunctionList() {
            return this.n;
        }

        public int getInlineClassUnderlyingPropertyName() {
            return this.t;
        }

        public Type getInlineClassUnderlyingType() {
            return this.u;
        }

        public int getInlineClassUnderlyingTypeId() {
            return this.v;
        }

        public List<Integer> getNestedClassNameList() {
            return this.k;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Class> getParserForType() {
            return PARSER;
        }

        public Property getProperty(int i) {
            return this.o.get(i);
        }

        public int getPropertyCount() {
            return this.o.size();
        }

        public List<Property> getPropertyList() {
            return this.o;
        }

        public List<Integer> getSealedSubclassFqNameList() {
            return this.r;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.A;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.c & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.d) + 0 : 0;
            int iComputeInt32SizeNoTag = 0;
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.i.get(i2).intValue());
            }
            int iComputeMessageSize = iComputeInt32Size + iComputeInt32SizeNoTag;
            if (!getSupertypeIdList().isEmpty()) {
                iComputeMessageSize = iComputeMessageSize + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
            }
            this.j = iComputeInt32SizeNoTag;
            if ((this.c & 2) == 2) {
                iComputeMessageSize += CodedOutputStream.computeInt32Size(3, this.e);
            }
            if ((this.c & 4) == 4) {
                iComputeMessageSize += CodedOutputStream.computeInt32Size(4, this.f);
            }
            for (int i3 = 0; i3 < this.g.size(); i3++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, this.g.get(i3));
            }
            for (int i4 = 0; i4 < this.h.size(); i4++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, this.h.get(i4));
            }
            int iComputeInt32SizeNoTag2 = 0;
            for (int i5 = 0; i5 < this.k.size(); i5++) {
                iComputeInt32SizeNoTag2 += CodedOutputStream.computeInt32SizeNoTag(this.k.get(i5).intValue());
            }
            int iComputeMessageSize2 = iComputeMessageSize + iComputeInt32SizeNoTag2;
            if (!getNestedClassNameList().isEmpty()) {
                iComputeMessageSize2 = iComputeMessageSize2 + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag2);
            }
            this.l = iComputeInt32SizeNoTag2;
            for (int i6 = 0; i6 < this.m.size(); i6++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(8, this.m.get(i6));
            }
            for (int i7 = 0; i7 < this.n.size(); i7++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(9, this.n.get(i7));
            }
            for (int i8 = 0; i8 < this.o.size(); i8++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(10, this.o.get(i8));
            }
            for (int i9 = 0; i9 < this.p.size(); i9++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(11, this.p.get(i9));
            }
            for (int i10 = 0; i10 < this.q.size(); i10++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(13, this.q.get(i10));
            }
            int iComputeInt32SizeNoTag3 = 0;
            for (int i11 = 0; i11 < this.r.size(); i11++) {
                iComputeInt32SizeNoTag3 += CodedOutputStream.computeInt32SizeNoTag(this.r.get(i11).intValue());
            }
            int iComputeMessageSize3 = iComputeMessageSize2 + iComputeInt32SizeNoTag3;
            if (!getSealedSubclassFqNameList().isEmpty()) {
                iComputeMessageSize3 = iComputeMessageSize3 + 2 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag3);
            }
            this.s = iComputeInt32SizeNoTag3;
            if ((this.c & 8) == 8) {
                iComputeMessageSize3 += CodedOutputStream.computeInt32Size(17, this.t);
            }
            if ((this.c & 16) == 16) {
                iComputeMessageSize3 += CodedOutputStream.computeMessageSize(18, this.u);
            }
            if ((this.c & 32) == 32) {
                iComputeMessageSize3 += CodedOutputStream.computeInt32Size(19, this.v);
            }
            if ((this.c & 64) == 64) {
                iComputeMessageSize3 += CodedOutputStream.computeMessageSize(30, this.w);
            }
            int iComputeInt32SizeNoTag4 = 0;
            for (int i12 = 0; i12 < this.x.size(); i12++) {
                iComputeInt32SizeNoTag4 += CodedOutputStream.computeInt32SizeNoTag(this.x.get(i12).intValue());
            }
            int size = iComputeMessageSize3 + iComputeInt32SizeNoTag4 + (getVersionRequirementList().size() * 2);
            if ((this.c & 128) == 128) {
                size += CodedOutputStream.computeMessageSize(32, this.y);
            }
            int iExtensionsSerializedSize = size + extensionsSerializedSize() + this.b.size();
            this.A = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public Type getSupertype(int i) {
            return this.h.get(i);
        }

        public int getSupertypeCount() {
            return this.h.size();
        }

        public List<Integer> getSupertypeIdList() {
            return this.i;
        }

        public List<Type> getSupertypeList() {
            return this.h;
        }

        public TypeAlias getTypeAlias(int i) {
            return this.p.get(i);
        }

        public int getTypeAliasCount() {
            return this.p.size();
        }

        public List<TypeAlias> getTypeAliasList() {
            return this.p;
        }

        public TypeParameter getTypeParameter(int i) {
            return this.g.get(i);
        }

        public int getTypeParameterCount() {
            return this.g.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.g;
        }

        public TypeTable getTypeTable() {
            return this.w;
        }

        public List<Integer> getVersionRequirementList() {
            return this.x;
        }

        public VersionRequirementTable getVersionRequirementTable() {
            return this.y;
        }

        public boolean hasCompanionObjectName() {
            return (this.c & 4) == 4;
        }

        public boolean hasFlags() {
            return (this.c & 1) == 1;
        }

        public boolean hasFqName() {
            return (this.c & 2) == 2;
        }

        public boolean hasInlineClassUnderlyingPropertyName() {
            return (this.c & 8) == 8;
        }

        public boolean hasInlineClassUnderlyingType() {
            return (this.c & 16) == 16;
        }

        public boolean hasInlineClassUnderlyingTypeId() {
            return (this.c & 32) == 32;
        }

        public boolean hasTypeTable() {
            return (this.c & 64) == 64;
        }

        public boolean hasVersionRequirementTable() {
            return (this.c & 128) == 128;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.z;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasFqName()) {
                this.z = (byte) 0;
                return false;
            }
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.z = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getSupertypeCount(); i2++) {
                if (!getSupertype(i2).isInitialized()) {
                    this.z = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getConstructorCount(); i3++) {
                if (!getConstructor(i3).isInitialized()) {
                    this.z = (byte) 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < getFunctionCount(); i4++) {
                if (!getFunction(i4).isInitialized()) {
                    this.z = (byte) 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < getPropertyCount(); i5++) {
                if (!getProperty(i5).isInitialized()) {
                    this.z = (byte) 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < getTypeAliasCount(); i6++) {
                if (!getTypeAlias(i6).isInitialized()) {
                    this.z = (byte) 0;
                    return false;
                }
            }
            for (int i7 = 0; i7 < getEnumEntryCount(); i7++) {
                if (!getEnumEntry(i7).isInitialized()) {
                    this.z = (byte) 0;
                    return false;
                }
            }
            if (hasInlineClassUnderlyingType() && !getInlineClassUnderlyingType().isInitialized()) {
                this.z = (byte) 0;
                return false;
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.z = (byte) 0;
                return false;
            }
            if (extensionsAreInitialized()) {
                this.z = (byte) 1;
                return true;
            }
            this.z = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.c & 1) == 1) {
                codedOutputStream.writeInt32(1, this.d);
            }
            if (getSupertypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(18);
                codedOutputStream.writeRawVarint32(this.j);
            }
            for (int i = 0; i < this.i.size(); i++) {
                codedOutputStream.writeInt32NoTag(this.i.get(i).intValue());
            }
            if ((this.c & 2) == 2) {
                codedOutputStream.writeInt32(3, this.e);
            }
            if ((this.c & 4) == 4) {
                codedOutputStream.writeInt32(4, this.f);
            }
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                codedOutputStream.writeMessage(5, this.g.get(i2));
            }
            for (int i3 = 0; i3 < this.h.size(); i3++) {
                codedOutputStream.writeMessage(6, this.h.get(i3));
            }
            if (getNestedClassNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(58);
                codedOutputStream.writeRawVarint32(this.l);
            }
            for (int i4 = 0; i4 < this.k.size(); i4++) {
                codedOutputStream.writeInt32NoTag(this.k.get(i4).intValue());
            }
            for (int i5 = 0; i5 < this.m.size(); i5++) {
                codedOutputStream.writeMessage(8, this.m.get(i5));
            }
            for (int i6 = 0; i6 < this.n.size(); i6++) {
                codedOutputStream.writeMessage(9, this.n.get(i6));
            }
            for (int i7 = 0; i7 < this.o.size(); i7++) {
                codedOutputStream.writeMessage(10, this.o.get(i7));
            }
            for (int i8 = 0; i8 < this.p.size(); i8++) {
                codedOutputStream.writeMessage(11, this.p.get(i8));
            }
            for (int i9 = 0; i9 < this.q.size(); i9++) {
                codedOutputStream.writeMessage(13, this.q.get(i9));
            }
            if (getSealedSubclassFqNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(130);
                codedOutputStream.writeRawVarint32(this.s);
            }
            for (int i10 = 0; i10 < this.r.size(); i10++) {
                codedOutputStream.writeInt32NoTag(this.r.get(i10).intValue());
            }
            if ((this.c & 8) == 8) {
                codedOutputStream.writeInt32(17, this.t);
            }
            if ((this.c & 16) == 16) {
                codedOutputStream.writeMessage(18, this.u);
            }
            if ((this.c & 32) == 32) {
                codedOutputStream.writeInt32(19, this.v);
            }
            if ((this.c & 64) == 64) {
                codedOutputStream.writeMessage(30, this.w);
            }
            for (int i11 = 0; i11 < this.x.size(); i11++) {
                codedOutputStream.writeInt32(31, this.x.get(i11).intValue());
            }
            if ((this.c & 128) == 128) {
                codedOutputStream.writeMessage(32, this.y);
            }
            extensionWriterNewExtensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.b);
        }

        public static Builder newBuilder(Class r1) {
            return newBuilder().mergeFrom(r1);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Class getDefaultInstanceForType() {
            return B;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Class(GeneratedMessageLite.ExtendableBuilder<Class, ?> extendableBuilder) {
            super(extendableBuilder);
            this.j = -1;
            this.l = -1;
            this.s = -1;
            this.z = (byte) -1;
            this.A = -1;
            this.b = extendableBuilder.getUnknownFields();
        }

        private Class(boolean z) {
            this.j = -1;
            this.l = -1;
            this.s = -1;
            this.z = (byte) -1;
            this.A = -1;
            this.b = ByteString.EMPTY;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Class(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.j = -1;
            this.l = -1;
            this.s = -1;
            this.z = (byte) -1;
            this.A = -1;
            P();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        switch (tag) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                this.c |= 1;
                                this.d = codedInputStream.readInt32();
                                break;
                            case 16:
                                if ((i & 32) != 32) {
                                    this.i = new ArrayList();
                                    i |= 32;
                                }
                                this.i.add(Integer.valueOf(codedInputStream.readInt32()));
                                break;
                            case 18:
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i & 32) != 32 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.i = new ArrayList();
                                    i |= 32;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.i.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                                break;
                            case 24:
                                this.c |= 2;
                                this.e = codedInputStream.readInt32();
                                break;
                            case 32:
                                this.c |= 4;
                                this.f = codedInputStream.readInt32();
                                break;
                            case 42:
                                if ((i & 8) != 8) {
                                    this.g = new ArrayList();
                                    i |= 8;
                                }
                                this.g.add((TypeParameter) codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                                break;
                            case 50:
                                if ((i & 16) != 16) {
                                    this.h = new ArrayList();
                                    i |= 16;
                                }
                                this.h.add((Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                                break;
                            case 56:
                                if ((i & 64) != 64) {
                                    this.k = new ArrayList();
                                    i |= 64;
                                }
                                this.k.add(Integer.valueOf(codedInputStream.readInt32()));
                                break;
                            case 58:
                                int iPushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i & 64) != 64 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.k = new ArrayList();
                                    i |= 64;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.k.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit2);
                                break;
                            case 66:
                                if ((i & 128) != 128) {
                                    this.m = new ArrayList();
                                    i |= 128;
                                }
                                this.m.add((Constructor) codedInputStream.readMessage(Constructor.PARSER, extensionRegistryLite));
                                break;
                            case 74:
                                if ((i & 256) != 256) {
                                    this.n = new ArrayList();
                                    i |= 256;
                                }
                                this.n.add((Function) codedInputStream.readMessage(Function.PARSER, extensionRegistryLite));
                                break;
                            case 82:
                                if ((i & 512) != 512) {
                                    this.o = new ArrayList();
                                    i |= 512;
                                }
                                this.o.add((Property) codedInputStream.readMessage(Property.PARSER, extensionRegistryLite));
                                break;
                            case 90:
                                if ((i & 1024) != 1024) {
                                    this.p = new ArrayList();
                                    i |= 1024;
                                }
                                this.p.add((TypeAlias) codedInputStream.readMessage(TypeAlias.PARSER, extensionRegistryLite));
                                break;
                            case 106:
                                if ((i & 2048) != 2048) {
                                    this.q = new ArrayList();
                                    i |= 2048;
                                }
                                this.q.add((EnumEntry) codedInputStream.readMessage(EnumEntry.PARSER, extensionRegistryLite));
                                break;
                            case 128:
                                if ((i & 4096) != 4096) {
                                    this.r = new ArrayList();
                                    i |= 4096;
                                }
                                this.r.add(Integer.valueOf(codedInputStream.readInt32()));
                                break;
                            case 130:
                                int iPushLimit3 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i & 4096) != 4096 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.r = new ArrayList();
                                    i |= 4096;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.r.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit3);
                                break;
                            case 136:
                                this.c |= 8;
                                this.t = codedInputStream.readInt32();
                                break;
                            case 146:
                                Type.Builder builder = (this.c & 16) == 16 ? this.u.toBuilder() : null;
                                Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.u = type;
                                if (builder != 0) {
                                    builder.mergeFrom(type);
                                    this.u = builder.buildPartial();
                                }
                                this.c |= 16;
                                break;
                            case 152:
                                this.c |= 32;
                                this.v = codedInputStream.readInt32();
                                break;
                            case 242:
                                TypeTable.Builder builder2 = (this.c & 64) == 64 ? this.w.toBuilder() : null;
                                TypeTable typeTable = (TypeTable) codedInputStream.readMessage(TypeTable.PARSER, extensionRegistryLite);
                                this.w = typeTable;
                                if (builder2 != 0) {
                                    builder2.mergeFrom(typeTable);
                                    this.w = builder2.buildPartial();
                                }
                                this.c |= 64;
                                break;
                            case 248:
                                if ((i & 131072) != 131072) {
                                    this.x = new ArrayList();
                                    i |= 131072;
                                }
                                this.x.add(Integer.valueOf(codedInputStream.readInt32()));
                                break;
                            case 250:
                                int iPushLimit4 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i & 131072) != 131072 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.x = new ArrayList();
                                    i |= 131072;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.x.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit4);
                                break;
                            case 258:
                                VersionRequirementTable.Builder builder3 = (this.c & 128) == 128 ? this.y.toBuilder() : null;
                                VersionRequirementTable versionRequirementTable = (VersionRequirementTable) codedInputStream.readMessage(VersionRequirementTable.PARSER, extensionRegistryLite);
                                this.y = versionRequirementTable;
                                if (builder3 != 0) {
                                    builder3.mergeFrom(versionRequirementTable);
                                    this.y = builder3.buildPartial();
                                }
                                this.c |= 128;
                                break;
                            default:
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    z = true;
                                }
                                break;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((i & 32) == 32) {
                        this.i = Collections.unmodifiableList(this.i);
                    }
                    if ((i & 8) == 8) {
                        this.g = Collections.unmodifiableList(this.g);
                    }
                    if ((i & 16) == 16) {
                        this.h = Collections.unmodifiableList(this.h);
                    }
                    if ((i & 64) == 64) {
                        this.k = Collections.unmodifiableList(this.k);
                    }
                    if ((i & 128) == 128) {
                        this.m = Collections.unmodifiableList(this.m);
                    }
                    if ((i & 256) == 256) {
                        this.n = Collections.unmodifiableList(this.n);
                    }
                    if ((i & 512) == 512) {
                        this.o = Collections.unmodifiableList(this.o);
                    }
                    if ((i & 1024) == 1024) {
                        this.p = Collections.unmodifiableList(this.p);
                    }
                    if ((i & 2048) == 2048) {
                        this.q = Collections.unmodifiableList(this.q);
                    }
                    if ((i & 4096) == 4096) {
                        this.r = Collections.unmodifiableList(this.r);
                    }
                    if ((i & 131072) == 131072) {
                        this.x = Collections.unmodifiableList(this.x);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.b = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 32) == 32) {
                this.i = Collections.unmodifiableList(this.i);
            }
            if ((i & 8) == 8) {
                this.g = Collections.unmodifiableList(this.g);
            }
            if ((i & 16) == 16) {
                this.h = Collections.unmodifiableList(this.h);
            }
            if ((i & 64) == 64) {
                this.k = Collections.unmodifiableList(this.k);
            }
            if ((i & 128) == 128) {
                this.m = Collections.unmodifiableList(this.m);
            }
            if ((i & 256) == 256) {
                this.n = Collections.unmodifiableList(this.n);
            }
            if ((i & 512) == 512) {
                this.o = Collections.unmodifiableList(this.o);
            }
            if ((i & 1024) == 1024) {
                this.p = Collections.unmodifiableList(this.p);
            }
            if ((i & 2048) == 2048) {
                this.q = Collections.unmodifiableList(this.q);
            }
            if ((i & 4096) == 4096) {
                this.r = Collections.unmodifiableList(this.r);
            }
            if ((i & 131072) == 131072) {
                this.x = Collections.unmodifiableList(this.x);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.b = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface ClassOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Constructor extends GeneratedMessageLite.ExtendableMessage<Constructor> implements ConstructorOrBuilder {
        public static Parser<Constructor> PARSER = new a();
        private static final Constructor i;
        private final ByteString b;
        private int c;
        private int d;
        private List<ValueParameter> e;
        private List<Integer> f;
        private byte g;
        private int h;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Constructor, Builder> implements ConstructorOrBuilder {
            private int d;
            private int e = 6;
            private List<ValueParameter> f = Collections.emptyList();
            private List<Integer> g = Collections.emptyList();

            private Builder() {
                h();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder e() {
                return new Builder();
            }

            private void f() {
                if ((this.d & 2) != 2) {
                    this.f = new ArrayList(this.f);
                    this.d |= 2;
                }
            }

            private void g() {
                if ((this.d & 4) != 4) {
                    this.g = new ArrayList(this.g);
                    this.d |= 4;
                }
            }

            private void h() {
            }

            public Constructor buildPartial() {
                Constructor constructor = new Constructor(this);
                int i = (this.d & 1) != 1 ? 0 : 1;
                constructor.d = this.e;
                if ((this.d & 2) == 2) {
                    this.f = Collections.unmodifiableList(this.f);
                    this.d &= -3;
                }
                constructor.e = this.f;
                if ((this.d & 4) == 4) {
                    this.g = Collections.unmodifiableList(this.g);
                    this.d &= -5;
                }
                constructor.f = this.g;
                constructor.c = i;
                return constructor;
            }

            public ValueParameter getValueParameter(int i) {
                return this.f.get(i);
            }

            public int getValueParameterCount() {
                return this.f.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getValueParameterCount(); i++) {
                    if (!getValueParameter(i).isInitialized()) {
                        return false;
                    }
                }
                return extensionsAreInitialized();
            }

            public Builder setFlags(int i) {
                this.d |= 1;
                this.e = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Constructor build() {
                Constructor constructorBuildPartial = buildPartial();
                if (constructorBuildPartial.isInitialized()) {
                    return constructorBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(constructorBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Constructor getDefaultInstanceForType() {
                return Constructor.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Constructor constructor) {
                if (constructor == Constructor.getDefaultInstance()) {
                    return this;
                }
                if (constructor.hasFlags()) {
                    setFlags(constructor.getFlags());
                }
                if (!constructor.e.isEmpty()) {
                    if (this.f.isEmpty()) {
                        this.f = constructor.e;
                        this.d &= -3;
                    } else {
                        f();
                        this.f.addAll(constructor.e);
                    }
                }
                if (!constructor.f.isEmpty()) {
                    if (this.g.isEmpty()) {
                        this.g = constructor.f;
                        this.d &= -5;
                    } else {
                        g();
                        this.g.addAll(constructor.f);
                    }
                }
                mergeExtensionFields(constructor);
                setUnknownFields(getUnknownFields().concat(constructor.b));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4297clone() {
                return e().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Constructor constructor = null;
                try {
                    try {
                        Constructor partialFrom = Constructor.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Constructor constructor2 = (Constructor) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            constructor = constructor2;
                            if (constructor != null) {
                                mergeFrom(constructor);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (constructor != null) {
                        mergeFrom(constructor);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<Constructor> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Constructor parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Constructor(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Constructor constructor = new Constructor(true);
            i = constructor;
            constructor.q();
        }

        public static Constructor getDefaultInstance() {
            return i;
        }

        public static Builder newBuilder() {
            return Builder.e();
        }

        private void q() {
            this.d = 6;
            this.e = Collections.emptyList();
            this.f = Collections.emptyList();
        }

        public int getFlags() {
            return this.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Constructor> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i2 = this.h;
            if (i2 != -1) {
                return i2;
            }
            int iComputeInt32Size = (this.c & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.d) + 0 : 0;
            for (int i3 = 0; i3 < this.e.size(); i3++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(2, this.e.get(i3));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i4 = 0; i4 < this.f.size(); i4++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.f.get(i4).intValue());
            }
            int size = iComputeInt32Size + iComputeInt32SizeNoTag + (getVersionRequirementList().size() * 2) + extensionsSerializedSize() + this.b.size();
            this.h = size;
            return size;
        }

        public ValueParameter getValueParameter(int i2) {
            return this.e.get(i2);
        }

        public int getValueParameterCount() {
            return this.e.size();
        }

        public List<ValueParameter> getValueParameterList() {
            return this.e;
        }

        public List<Integer> getVersionRequirementList() {
            return this.f;
        }

        public boolean hasFlags() {
            return (this.c & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.g;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i2 = 0; i2 < getValueParameterCount(); i2++) {
                if (!getValueParameter(i2).isInitialized()) {
                    this.g = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.g = (byte) 1;
                return true;
            }
            this.g = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.c & 1) == 1) {
                codedOutputStream.writeInt32(1, this.d);
            }
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                codedOutputStream.writeMessage(2, this.e.get(i2));
            }
            for (int i3 = 0; i3 < this.f.size(); i3++) {
                codedOutputStream.writeInt32(31, this.f.get(i3).intValue());
            }
            extensionWriterNewExtensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.b);
        }

        public static Builder newBuilder(Constructor constructor) {
            return newBuilder().mergeFrom(constructor);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Constructor getDefaultInstanceForType() {
            return i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Constructor(GeneratedMessageLite.ExtendableBuilder<Constructor, ?> extendableBuilder) {
            super(extendableBuilder);
            this.g = (byte) -1;
            this.h = -1;
            this.b = extendableBuilder.getUnknownFields();
        }

        private Constructor(boolean z) {
            this.g = (byte) -1;
            this.h = -1;
            this.b = ByteString.EMPTY;
        }

        private Constructor(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.g = (byte) -1;
            this.h = -1;
            q();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            int i2 = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.c |= 1;
                                    this.d = codedInputStream.readInt32();
                                } else if (tag == 18) {
                                    if ((i2 & 2) != 2) {
                                        this.e = new ArrayList();
                                        i2 |= 2;
                                    }
                                    this.e.add((ValueParameter) codedInputStream.readMessage(ValueParameter.PARSER, extensionRegistryLite));
                                } else if (tag == 248) {
                                    if ((i2 & 4) != 4) {
                                        this.f = new ArrayList();
                                        i2 |= 4;
                                    }
                                    this.f.add(Integer.valueOf(codedInputStream.readInt32()));
                                } else if (tag != 250) {
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i2 & 4) != 4 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f = new ArrayList();
                                        i2 |= 4;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f.add(Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((i2 & 2) == 2) {
                        this.e = Collections.unmodifiableList(this.e);
                    }
                    if ((i2 & 4) == 4) {
                        this.f = Collections.unmodifiableList(this.f);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.b = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i2 & 2) == 2) {
                this.e = Collections.unmodifiableList(this.e);
            }
            if ((i2 & 4) == 4) {
                this.f = Collections.unmodifiableList(this.f);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.b = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface ConstructorOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Contract extends GeneratedMessageLite implements ContractOrBuilder {
        public static Parser<Contract> PARSER = new a();
        private static final Contract e;
        private final ByteString a;
        private List<Effect> b;
        private byte c;
        private int d;

        public static final class Builder extends GeneratedMessageLite.Builder<Contract, Builder> implements ContractOrBuilder {
            private int b;
            private List<Effect> c = Collections.emptyList();

            private Builder() {
                d();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder b() {
                return new Builder();
            }

            private void c() {
                if ((this.b & 1) != 1) {
                    this.c = new ArrayList(this.c);
                    this.b |= 1;
                }
            }

            private void d() {
            }

            public Contract buildPartial() {
                Contract contract = new Contract(this);
                if ((this.b & 1) == 1) {
                    this.c = Collections.unmodifiableList(this.c);
                    this.b &= -2;
                }
                contract.b = this.c;
                return contract;
            }

            public Effect getEffect(int i) {
                return this.c.get(i);
            }

            public int getEffectCount() {
                return this.c.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getEffectCount(); i++) {
                    if (!getEffect(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Contract build() {
                Contract contractBuildPartial = buildPartial();
                if (contractBuildPartial.isInitialized()) {
                    return contractBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(contractBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Contract getDefaultInstanceForType() {
                return Contract.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4297clone() {
                return b().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Contract contract) {
                if (contract == Contract.getDefaultInstance()) {
                    return this;
                }
                if (!contract.b.isEmpty()) {
                    if (this.c.isEmpty()) {
                        this.c = contract.b;
                        this.b &= -2;
                    } else {
                        c();
                        this.c.addAll(contract.b);
                    }
                }
                setUnknownFields(getUnknownFields().concat(contract.a));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Contract contract = null;
                try {
                    try {
                        Contract partialFrom = Contract.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Contract contract2 = (Contract) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            contract = contract2;
                            if (contract != null) {
                                mergeFrom(contract);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (contract != null) {
                        mergeFrom(contract);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<Contract> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Contract parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Contract(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Contract contract = new Contract(true);
            e = contract;
            contract.j();
        }

        public static Contract getDefaultInstance() {
            return e;
        }

        private void j() {
            this.b = Collections.emptyList();
        }

        public static Builder newBuilder() {
            return Builder.b();
        }

        public Effect getEffect(int i) {
            return this.b.get(i);
        }

        public int getEffectCount() {
            return this.b.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Contract> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.d;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = 0;
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.b.get(i2));
            }
            int size = iComputeMessageSize + this.a.size();
            this.d = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.c;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getEffectCount(); i++) {
                if (!getEffect(i).isInitialized()) {
                    this.c = (byte) 0;
                    return false;
                }
            }
            this.c = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.b.size(); i++) {
                codedOutputStream.writeMessage(1, this.b.get(i));
            }
            codedOutputStream.writeRawBytes(this.a);
        }

        public static Builder newBuilder(Contract contract) {
            return newBuilder().mergeFrom(contract);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Contract getDefaultInstanceForType() {
            return e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Contract(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.c = (byte) -1;
            this.d = -1;
            this.a = builder.getUnknownFields();
        }

        private Contract(boolean z) {
            this.c = (byte) -1;
            this.d = -1;
            this.a = ByteString.EMPTY;
        }

        private Contract(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.c = (byte) -1;
            this.d = -1;
            j();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 10) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.b = new ArrayList();
                                    z2 |= true;
                                }
                                this.b.add((Effect) codedInputStream.readMessage(Effect.PARSER, extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if (z2 & true) {
                            this.b = Collections.unmodifiableList(this.b);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.a = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (z2 & true) {
                this.b = Collections.unmodifiableList(this.b);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.a = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface ContractOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Effect extends GeneratedMessageLite implements EffectOrBuilder {
        public static Parser<Effect> PARSER = new a();
        private static final Effect i;
        private final ByteString a;
        private int b;
        private EffectType c;
        private List<Expression> d;
        private Expression e;
        private InvocationKind f;
        private byte g;
        private int h;

        public static final class Builder extends GeneratedMessageLite.Builder<Effect, Builder> implements EffectOrBuilder {
            private int b;
            private EffectType c = EffectType.RETURNS_CONSTANT;
            private List<Expression> d = Collections.emptyList();
            private Expression e = Expression.getDefaultInstance();
            private InvocationKind f = InvocationKind.AT_MOST_ONCE;

            private Builder() {
                d();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder b() {
                return new Builder();
            }

            private void c() {
                if ((this.b & 2) != 2) {
                    this.d = new ArrayList(this.d);
                    this.b |= 2;
                }
            }

            private void d() {
            }

            public Effect buildPartial() {
                Effect effect = new Effect(this);
                int i = this.b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                effect.c = this.c;
                if ((this.b & 2) == 2) {
                    this.d = Collections.unmodifiableList(this.d);
                    this.b &= -3;
                }
                effect.d = this.d;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                effect.e = this.e;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                effect.f = this.f;
                effect.b = i2;
                return effect;
            }

            public Expression getConclusionOfConditionalEffect() {
                return this.e;
            }

            public Expression getEffectConstructorArgument(int i) {
                return this.d.get(i);
            }

            public int getEffectConstructorArgumentCount() {
                return this.d.size();
            }

            public boolean hasConclusionOfConditionalEffect() {
                return (this.b & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getEffectConstructorArgumentCount(); i++) {
                    if (!getEffectConstructorArgument(i).isInitialized()) {
                        return false;
                    }
                }
                return !hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized();
            }

            public Builder mergeConclusionOfConditionalEffect(Expression expression) {
                if ((this.b & 4) != 4 || this.e == Expression.getDefaultInstance()) {
                    this.e = expression;
                } else {
                    this.e = Expression.newBuilder(this.e).mergeFrom(expression).buildPartial();
                }
                this.b |= 4;
                return this;
            }

            public Builder setEffectType(EffectType effectType) {
                Objects.requireNonNull(effectType);
                this.b |= 1;
                this.c = effectType;
                return this;
            }

            public Builder setKind(InvocationKind invocationKind) {
                Objects.requireNonNull(invocationKind);
                this.b |= 8;
                this.f = invocationKind;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Effect build() {
                Effect effectBuildPartial = buildPartial();
                if (effectBuildPartial.isInitialized()) {
                    return effectBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(effectBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Effect getDefaultInstanceForType() {
                return Effect.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4297clone() {
                return b().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Effect effect) {
                if (effect == Effect.getDefaultInstance()) {
                    return this;
                }
                if (effect.hasEffectType()) {
                    setEffectType(effect.getEffectType());
                }
                if (!effect.d.isEmpty()) {
                    if (this.d.isEmpty()) {
                        this.d = effect.d;
                        this.b &= -3;
                    } else {
                        c();
                        this.d.addAll(effect.d);
                    }
                }
                if (effect.hasConclusionOfConditionalEffect()) {
                    mergeConclusionOfConditionalEffect(effect.getConclusionOfConditionalEffect());
                }
                if (effect.hasKind()) {
                    setKind(effect.getKind());
                }
                setUnknownFields(getUnknownFields().concat(effect.a));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Effect effect = null;
                try {
                    try {
                        Effect partialFrom = Effect.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Effect effect2 = (Effect) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            effect = effect2;
                            if (effect != null) {
                                mergeFrom(effect);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (effect != null) {
                        mergeFrom(effect);
                    }
                    throw th;
                }
            }
        }

        public enum EffectType implements Internal.EnumLite {
            RETURNS_CONSTANT(0, 0),
            CALLS(1, 1),
            RETURNS_NOT_NULL(2, 2);

            private static Internal.EnumLiteMap<EffectType> internalValueMap = new a();
            private final int value;

            public static class a implements Internal.EnumLiteMap<EffectType> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public EffectType findValueByNumber(int i) {
                    return EffectType.valueOf(i);
                }
            }

            EffectType(int i, int i2) {
                this.value = i2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static EffectType valueOf(int i) {
                if (i == 0) {
                    return RETURNS_CONSTANT;
                }
                if (i == 1) {
                    return CALLS;
                }
                if (i != 2) {
                    return null;
                }
                return RETURNS_NOT_NULL;
            }
        }

        public enum InvocationKind implements Internal.EnumLite {
            AT_MOST_ONCE(0, 0),
            EXACTLY_ONCE(1, 1),
            AT_LEAST_ONCE(2, 2);

            private static Internal.EnumLiteMap<InvocationKind> internalValueMap = new a();
            private final int value;

            public static class a implements Internal.EnumLiteMap<InvocationKind> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public InvocationKind findValueByNumber(int i) {
                    return InvocationKind.valueOf(i);
                }
            }

            InvocationKind(int i, int i2) {
                this.value = i2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static InvocationKind valueOf(int i) {
                if (i == 0) {
                    return AT_MOST_ONCE;
                }
                if (i == 1) {
                    return EXACTLY_ONCE;
                }
                if (i != 2) {
                    return null;
                }
                return AT_LEAST_ONCE;
            }
        }

        public static class a extends AbstractParser<Effect> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Effect parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Effect(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Effect effect = new Effect(true);
            i = effect;
            effect.o();
        }

        public static Effect getDefaultInstance() {
            return i;
        }

        public static Builder newBuilder() {
            return Builder.b();
        }

        private void o() {
            this.c = EffectType.RETURNS_CONSTANT;
            this.d = Collections.emptyList();
            this.e = Expression.getDefaultInstance();
            this.f = InvocationKind.AT_MOST_ONCE;
        }

        public Expression getConclusionOfConditionalEffect() {
            return this.e;
        }

        public Expression getEffectConstructorArgument(int i2) {
            return this.d.get(i2);
        }

        public int getEffectConstructorArgumentCount() {
            return this.d.size();
        }

        public EffectType getEffectType() {
            return this.c;
        }

        public InvocationKind getKind() {
            return this.f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Effect> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i2 = this.h;
            if (i2 != -1) {
                return i2;
            }
            int iComputeEnumSize = (this.b & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.c.getNumber()) + 0 : 0;
            for (int i3 = 0; i3 < this.d.size(); i3++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, this.d.get(i3));
            }
            if ((this.b & 2) == 2) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, this.e);
            }
            if ((this.b & 4) == 4) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(4, this.f.getNumber());
            }
            int size = iComputeEnumSize + this.a.size();
            this.h = size;
            return size;
        }

        public boolean hasConclusionOfConditionalEffect() {
            return (this.b & 2) == 2;
        }

        public boolean hasEffectType() {
            return (this.b & 1) == 1;
        }

        public boolean hasKind() {
            return (this.b & 4) == 4;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.g;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i2 = 0; i2 < getEffectConstructorArgumentCount(); i2++) {
                if (!getEffectConstructorArgument(i2).isInitialized()) {
                    this.g = (byte) 0;
                    return false;
                }
            }
            if (!hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized()) {
                this.g = (byte) 1;
                return true;
            }
            this.g = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.b & 1) == 1) {
                codedOutputStream.writeEnum(1, this.c.getNumber());
            }
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                codedOutputStream.writeMessage(2, this.d.get(i2));
            }
            if ((this.b & 2) == 2) {
                codedOutputStream.writeMessage(3, this.e);
            }
            if ((this.b & 4) == 4) {
                codedOutputStream.writeEnum(4, this.f.getNumber());
            }
            codedOutputStream.writeRawBytes(this.a);
        }

        public static Builder newBuilder(Effect effect) {
            return newBuilder().mergeFrom(effect);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Effect getDefaultInstanceForType() {
            return i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Effect(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.g = (byte) -1;
            this.h = -1;
            this.a = builder.getUnknownFields();
        }

        private Effect(boolean z) {
            this.g = (byte) -1;
            this.h = -1;
            this.a = ByteString.EMPTY;
        }

        private Effect(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.g = (byte) -1;
            this.h = -1;
            o();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            int i2 = 0;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                int i3 = codedInputStream.readEnum();
                                EffectType effectTypeValueOf = EffectType.valueOf(i3);
                                if (effectTypeValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i3);
                                } else {
                                    this.b |= 1;
                                    this.c = effectTypeValueOf;
                                }
                            } else if (tag == 18) {
                                if ((i2 & 2) != 2) {
                                    this.d = new ArrayList();
                                    i2 |= 2;
                                }
                                this.d.add((Expression) codedInputStream.readMessage(Expression.PARSER, extensionRegistryLite));
                            } else if (tag == 26) {
                                Expression.Builder builder = (this.b & 2) == 2 ? this.e.toBuilder() : null;
                                Expression expression = (Expression) codedInputStream.readMessage(Expression.PARSER, extensionRegistryLite);
                                this.e = expression;
                                if (builder != null) {
                                    builder.mergeFrom(expression);
                                    this.e = builder.buildPartial();
                                }
                                this.b |= 2;
                            } else if (tag != 32) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                int i4 = codedInputStream.readEnum();
                                InvocationKind invocationKindValueOf = InvocationKind.valueOf(i4);
                                if (invocationKindValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i4);
                                } else {
                                    this.b |= 4;
                                    this.f = invocationKindValueOf;
                                }
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if ((i2 & 2) == 2) {
                            this.d = Collections.unmodifiableList(this.d);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.a = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((i2 & 2) == 2) {
                this.d = Collections.unmodifiableList(this.d);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.a = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface EffectOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class EnumEntry extends GeneratedMessageLite.ExtendableMessage<EnumEntry> implements EnumEntryOrBuilder {
        public static Parser<EnumEntry> PARSER = new a();
        private static final EnumEntry g;
        private final ByteString b;
        private int c;
        private int d;
        private byte e;
        private int f;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<EnumEntry, Builder> implements EnumEntryOrBuilder {
            private int d;
            private int e;

            private Builder() {
                f();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder e() {
                return new Builder();
            }

            private void f() {
            }

            public EnumEntry buildPartial() {
                EnumEntry enumEntry = new EnumEntry(this);
                int i = (this.d & 1) != 1 ? 0 : 1;
                enumEntry.d = this.e;
                enumEntry.c = i;
                return enumEntry;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return extensionsAreInitialized();
            }

            public Builder setName(int i) {
                this.d |= 1;
                this.e = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public EnumEntry build() {
                EnumEntry enumEntryBuildPartial = buildPartial();
                if (enumEntryBuildPartial.isInitialized()) {
                    return enumEntryBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(enumEntryBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public EnumEntry getDefaultInstanceForType() {
                return EnumEntry.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(EnumEntry enumEntry) {
                if (enumEntry == EnumEntry.getDefaultInstance()) {
                    return this;
                }
                if (enumEntry.hasName()) {
                    setName(enumEntry.getName());
                }
                mergeExtensionFields(enumEntry);
                setUnknownFields(getUnknownFields().concat(enumEntry.b));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4297clone() {
                return e().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                EnumEntry enumEntry = null;
                try {
                    try {
                        EnumEntry partialFrom = EnumEntry.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        EnumEntry enumEntry2 = (EnumEntry) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            enumEntry = enumEntry2;
                            if (enumEntry != null) {
                                mergeFrom(enumEntry);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (enumEntry != null) {
                        mergeFrom(enumEntry);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<EnumEntry> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public EnumEntry parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new EnumEntry(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            EnumEntry enumEntry = new EnumEntry(true);
            g = enumEntry;
            enumEntry.m();
        }

        public static EnumEntry getDefaultInstance() {
            return g;
        }

        private void m() {
            this.d = 0;
        }

        public static Builder newBuilder() {
            return Builder.e();
        }

        public int getName() {
            return this.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<EnumEntry> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.f;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = ((this.c & 1) == 1 ? 0 + CodedOutputStream.computeInt32Size(1, this.d) : 0) + extensionsSerializedSize() + this.b.size();
            this.f = iComputeInt32Size;
            return iComputeInt32Size;
        }

        public boolean hasName() {
            return (this.c & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.e;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (extensionsAreInitialized()) {
                this.e = (byte) 1;
                return true;
            }
            this.e = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.c & 1) == 1) {
                codedOutputStream.writeInt32(1, this.d);
            }
            extensionWriterNewExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.b);
        }

        public static Builder newBuilder(EnumEntry enumEntry) {
            return newBuilder().mergeFrom(enumEntry);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public EnumEntry getDefaultInstanceForType() {
            return g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private EnumEntry(GeneratedMessageLite.ExtendableBuilder<EnumEntry, ?> extendableBuilder) {
            super(extendableBuilder);
            this.e = (byte) -1;
            this.f = -1;
            this.b = extendableBuilder.getUnknownFields();
        }

        private EnumEntry(boolean z) {
            this.e = (byte) -1;
            this.f = -1;
            this.b = ByteString.EMPTY;
        }

        private EnumEntry(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.e = (byte) -1;
            this.f = -1;
            m();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 8) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.c |= 1;
                                this.d = codedInputStream.readInt32();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.b = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.b = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface EnumEntryOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Expression extends GeneratedMessageLite implements ExpressionOrBuilder {
        public static Parser<Expression> PARSER = new a();
        private static final Expression l;
        private final ByteString a;
        private int b;
        private int c;
        private int d;
        private ConstantValue e;
        private Type f;
        private int g;
        private List<Expression> h;
        private List<Expression> i;
        private byte j;
        private int k;

        public static final class Builder extends GeneratedMessageLite.Builder<Expression, Builder> implements ExpressionOrBuilder {
            private int b;
            private int c;
            private int d;
            private int g;
            private ConstantValue e = ConstantValue.TRUE;
            private Type f = Type.getDefaultInstance();
            private List<Expression> h = Collections.emptyList();
            private List<Expression> i = Collections.emptyList();

            private Builder() {
                e();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder b() {
                return new Builder();
            }

            private void c() {
                if ((this.b & 32) != 32) {
                    this.h = new ArrayList(this.h);
                    this.b |= 32;
                }
            }

            private void d() {
                if ((this.b & 64) != 64) {
                    this.i = new ArrayList(this.i);
                    this.b |= 64;
                }
            }

            private void e() {
            }

            public Expression buildPartial() {
                Expression expression = new Expression(this);
                int i = this.b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                expression.c = this.c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                expression.d = this.d;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                expression.e = this.e;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                expression.f = this.f;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                expression.g = this.g;
                if ((this.b & 32) == 32) {
                    this.h = Collections.unmodifiableList(this.h);
                    this.b &= -33;
                }
                expression.h = this.h;
                if ((this.b & 64) == 64) {
                    this.i = Collections.unmodifiableList(this.i);
                    this.b &= -65;
                }
                expression.i = this.i;
                expression.b = i2;
                return expression;
            }

            public Expression getAndArgument(int i) {
                return this.h.get(i);
            }

            public int getAndArgumentCount() {
                return this.h.size();
            }

            public Type getIsInstanceType() {
                return this.f;
            }

            public Expression getOrArgument(int i) {
                return this.i.get(i);
            }

            public int getOrArgumentCount() {
                return this.i.size();
            }

            public boolean hasIsInstanceType() {
                return (this.b & 8) == 8;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasIsInstanceType() && !getIsInstanceType().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getAndArgumentCount(); i++) {
                    if (!getAndArgument(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getOrArgumentCount(); i2++) {
                    if (!getOrArgument(i2).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeIsInstanceType(Type type) {
                if ((this.b & 8) != 8 || this.f == Type.getDefaultInstance()) {
                    this.f = type;
                } else {
                    this.f = Type.newBuilder(this.f).mergeFrom(type).buildPartial();
                }
                this.b |= 8;
                return this;
            }

            public Builder setConstantValue(ConstantValue constantValue) {
                Objects.requireNonNull(constantValue);
                this.b |= 4;
                this.e = constantValue;
                return this;
            }

            public Builder setFlags(int i) {
                this.b |= 1;
                this.c = i;
                return this;
            }

            public Builder setIsInstanceTypeId(int i) {
                this.b |= 16;
                this.g = i;
                return this;
            }

            public Builder setValueParameterReference(int i) {
                this.b |= 2;
                this.d = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Expression build() {
                Expression expressionBuildPartial = buildPartial();
                if (expressionBuildPartial.isInitialized()) {
                    return expressionBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(expressionBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Expression getDefaultInstanceForType() {
                return Expression.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4297clone() {
                return b().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Expression expression) {
                if (expression == Expression.getDefaultInstance()) {
                    return this;
                }
                if (expression.hasFlags()) {
                    setFlags(expression.getFlags());
                }
                if (expression.hasValueParameterReference()) {
                    setValueParameterReference(expression.getValueParameterReference());
                }
                if (expression.hasConstantValue()) {
                    setConstantValue(expression.getConstantValue());
                }
                if (expression.hasIsInstanceType()) {
                    mergeIsInstanceType(expression.getIsInstanceType());
                }
                if (expression.hasIsInstanceTypeId()) {
                    setIsInstanceTypeId(expression.getIsInstanceTypeId());
                }
                if (!expression.h.isEmpty()) {
                    if (this.h.isEmpty()) {
                        this.h = expression.h;
                        this.b &= -33;
                    } else {
                        c();
                        this.h.addAll(expression.h);
                    }
                }
                if (!expression.i.isEmpty()) {
                    if (this.i.isEmpty()) {
                        this.i = expression.i;
                        this.b &= -65;
                    } else {
                        d();
                        this.i.addAll(expression.i);
                    }
                }
                setUnknownFields(getUnknownFields().concat(expression.a));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Expression expression = null;
                try {
                    try {
                        Expression partialFrom = Expression.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Expression expression2 = (Expression) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            expression = expression2;
                            if (expression != null) {
                                mergeFrom(expression);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (expression != null) {
                        mergeFrom(expression);
                    }
                    throw th;
                }
            }
        }

        public enum ConstantValue implements Internal.EnumLite {
            TRUE(0, 0),
            FALSE(1, 1),
            NULL(2, 2);

            private static Internal.EnumLiteMap<ConstantValue> internalValueMap = new a();
            private final int value;

            public static class a implements Internal.EnumLiteMap<ConstantValue> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public ConstantValue findValueByNumber(int i) {
                    return ConstantValue.valueOf(i);
                }
            }

            ConstantValue(int i, int i2) {
                this.value = i2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static ConstantValue valueOf(int i) {
                if (i == 0) {
                    return TRUE;
                }
                if (i == 1) {
                    return FALSE;
                }
                if (i != 2) {
                    return null;
                }
                return NULL;
            }
        }

        public static class a extends AbstractParser<Expression> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Expression parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Expression(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Expression expression = new Expression(true);
            l = expression;
            expression.s();
        }

        public static Expression getDefaultInstance() {
            return l;
        }

        public static Builder newBuilder() {
            return Builder.b();
        }

        private void s() {
            this.c = 0;
            this.d = 0;
            this.e = ConstantValue.TRUE;
            this.f = Type.getDefaultInstance();
            this.g = 0;
            this.h = Collections.emptyList();
            this.i = Collections.emptyList();
        }

        public Expression getAndArgument(int i) {
            return this.h.get(i);
        }

        public int getAndArgumentCount() {
            return this.h.size();
        }

        public ConstantValue getConstantValue() {
            return this.e;
        }

        public int getFlags() {
            return this.c;
        }

        public Type getIsInstanceType() {
            return this.f;
        }

        public int getIsInstanceTypeId() {
            return this.g;
        }

        public Expression getOrArgument(int i) {
            return this.i.get(i);
        }

        public int getOrArgumentCount() {
            return this.i.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Expression> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.k;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.b & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.c) + 0 : 0;
            if ((this.b & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.d);
            }
            if ((this.b & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.e.getNumber());
            }
            if ((this.b & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, this.f);
            }
            if ((this.b & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(5, this.g);
            }
            for (int i2 = 0; i2 < this.h.size(); i2++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(6, this.h.get(i2));
            }
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(7, this.i.get(i3));
            }
            int size = iComputeInt32Size + this.a.size();
            this.k = size;
            return size;
        }

        public int getValueParameterReference() {
            return this.d;
        }

        public boolean hasConstantValue() {
            return (this.b & 4) == 4;
        }

        public boolean hasFlags() {
            return (this.b & 1) == 1;
        }

        public boolean hasIsInstanceType() {
            return (this.b & 8) == 8;
        }

        public boolean hasIsInstanceTypeId() {
            return (this.b & 16) == 16;
        }

        public boolean hasValueParameterReference() {
            return (this.b & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.j;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (hasIsInstanceType() && !getIsInstanceType().isInitialized()) {
                this.j = (byte) 0;
                return false;
            }
            for (int i = 0; i < getAndArgumentCount(); i++) {
                if (!getAndArgument(i).isInitialized()) {
                    this.j = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getOrArgumentCount(); i2++) {
                if (!getOrArgument(i2).isInitialized()) {
                    this.j = (byte) 0;
                    return false;
                }
            }
            this.j = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.b & 1) == 1) {
                codedOutputStream.writeInt32(1, this.c);
            }
            if ((this.b & 2) == 2) {
                codedOutputStream.writeInt32(2, this.d);
            }
            if ((this.b & 4) == 4) {
                codedOutputStream.writeEnum(3, this.e.getNumber());
            }
            if ((this.b & 8) == 8) {
                codedOutputStream.writeMessage(4, this.f);
            }
            if ((this.b & 16) == 16) {
                codedOutputStream.writeInt32(5, this.g);
            }
            for (int i = 0; i < this.h.size(); i++) {
                codedOutputStream.writeMessage(6, this.h.get(i));
            }
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                codedOutputStream.writeMessage(7, this.i.get(i2));
            }
            codedOutputStream.writeRawBytes(this.a);
        }

        public static Builder newBuilder(Expression expression) {
            return newBuilder().mergeFrom(expression);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Expression getDefaultInstanceForType() {
            return l;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Expression(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.j = (byte) -1;
            this.k = -1;
            this.a = builder.getUnknownFields();
        }

        private Expression(boolean z) {
            this.j = (byte) -1;
            this.k = -1;
            this.a = ByteString.EMPTY;
        }

        private Expression(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.j = (byte) -1;
            this.k = -1;
            s();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.b |= 1;
                                this.c = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.b |= 2;
                                this.d = codedInputStream.readInt32();
                            } else if (tag == 24) {
                                int i2 = codedInputStream.readEnum();
                                ConstantValue constantValueValueOf = ConstantValue.valueOf(i2);
                                if (constantValueValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i2);
                                } else {
                                    this.b |= 4;
                                    this.e = constantValueValueOf;
                                }
                            } else if (tag == 34) {
                                Type.Builder builder = (this.b & 8) == 8 ? this.f.toBuilder() : null;
                                Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.f = type;
                                if (builder != null) {
                                    builder.mergeFrom(type);
                                    this.f = builder.buildPartial();
                                }
                                this.b |= 8;
                            } else if (tag == 40) {
                                this.b |= 16;
                                this.g = codedInputStream.readInt32();
                            } else if (tag == 50) {
                                if ((i & 32) != 32) {
                                    this.h = new ArrayList();
                                    i |= 32;
                                }
                                this.h.add((Expression) codedInputStream.readMessage(PARSER, extensionRegistryLite));
                            } else if (tag != 58) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if ((i & 64) != 64) {
                                    this.i = new ArrayList();
                                    i |= 64;
                                }
                                this.i.add((Expression) codedInputStream.readMessage(PARSER, extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((i & 32) == 32) {
                        this.h = Collections.unmodifiableList(this.h);
                    }
                    if ((i & 64) == 64) {
                        this.i = Collections.unmodifiableList(this.i);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.a = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 32) == 32) {
                this.h = Collections.unmodifiableList(this.h);
            }
            if ((i & 64) == 64) {
                this.i = Collections.unmodifiableList(this.i);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.a = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface ExpressionOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Function extends GeneratedMessageLite.ExtendableMessage<Function> implements FunctionOrBuilder {
        public static Parser<Function> PARSER = new a();
        private static final Function r;
        private final ByteString b;
        private int c;
        private int d;
        private int e;
        private int f;
        private Type g;
        private int h;
        private List<TypeParameter> i;
        private Type j;
        private int k;
        private List<ValueParameter> l;
        private TypeTable m;
        private List<Integer> n;
        private Contract o;
        private byte p;
        private int q;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Function, Builder> implements FunctionOrBuilder {
            private int d;
            private int g;
            private int i;
            private int l;
            private int e = 6;
            private int f = 6;
            private Type h = Type.getDefaultInstance();
            private List<TypeParameter> j = Collections.emptyList();
            private Type k = Type.getDefaultInstance();
            private List<ValueParameter> m = Collections.emptyList();
            private TypeTable n = TypeTable.getDefaultInstance();
            private List<Integer> o = Collections.emptyList();
            private Contract p = Contract.getDefaultInstance();

            private Builder() {
                i();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder e() {
                return new Builder();
            }

            private void f() {
                if ((this.d & 32) != 32) {
                    this.j = new ArrayList(this.j);
                    this.d |= 32;
                }
            }

            private void g() {
                if ((this.d & 256) != 256) {
                    this.m = new ArrayList(this.m);
                    this.d |= 256;
                }
            }

            private void h() {
                if ((this.d & 1024) != 1024) {
                    this.o = new ArrayList(this.o);
                    this.d |= 1024;
                }
            }

            private void i() {
            }

            public Function buildPartial() {
                Function function = new Function(this);
                int i = this.d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                function.d = this.e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                function.e = this.f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                function.f = this.g;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                function.g = this.h;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                function.h = this.i;
                if ((this.d & 32) == 32) {
                    this.j = Collections.unmodifiableList(this.j);
                    this.d &= -33;
                }
                function.i = this.j;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                function.j = this.k;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                function.k = this.l;
                if ((this.d & 256) == 256) {
                    this.m = Collections.unmodifiableList(this.m);
                    this.d &= -257;
                }
                function.l = this.m;
                if ((i & 512) == 512) {
                    i2 |= 128;
                }
                function.m = this.n;
                if ((this.d & 1024) == 1024) {
                    this.o = Collections.unmodifiableList(this.o);
                    this.d &= -1025;
                }
                function.n = this.o;
                if ((i & 2048) == 2048) {
                    i2 |= 256;
                }
                function.o = this.p;
                function.c = i2;
                return function;
            }

            public Contract getContract() {
                return this.p;
            }

            public Type getReceiverType() {
                return this.k;
            }

            public Type getReturnType() {
                return this.h;
            }

            public TypeParameter getTypeParameter(int i) {
                return this.j.get(i);
            }

            public int getTypeParameterCount() {
                return this.j.size();
            }

            public TypeTable getTypeTable() {
                return this.n;
            }

            public ValueParameter getValueParameter(int i) {
                return this.m.get(i);
            }

            public int getValueParameterCount() {
                return this.m.size();
            }

            public boolean hasContract() {
                return (this.d & 2048) == 2048;
            }

            public boolean hasName() {
                return (this.d & 4) == 4;
            }

            public boolean hasReceiverType() {
                return (this.d & 64) == 64;
            }

            public boolean hasReturnType() {
                return (this.d & 8) == 8;
            }

            public boolean hasTypeTable() {
                return (this.d & 512) == 512;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasReturnType() && !getReturnType().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        return false;
                    }
                }
                if (hasReceiverType() && !getReceiverType().isInitialized()) {
                    return false;
                }
                for (int i2 = 0; i2 < getValueParameterCount(); i2++) {
                    if (!getValueParameter(i2).isInitialized()) {
                        return false;
                    }
                }
                if (!hasTypeTable() || getTypeTable().isInitialized()) {
                    return (!hasContract() || getContract().isInitialized()) && extensionsAreInitialized();
                }
                return false;
            }

            public Builder mergeContract(Contract contract) {
                if ((this.d & 2048) != 2048 || this.p == Contract.getDefaultInstance()) {
                    this.p = contract;
                } else {
                    this.p = Contract.newBuilder(this.p).mergeFrom(contract).buildPartial();
                }
                this.d |= 2048;
                return this;
            }

            public Builder mergeReceiverType(Type type) {
                if ((this.d & 64) != 64 || this.k == Type.getDefaultInstance()) {
                    this.k = type;
                } else {
                    this.k = Type.newBuilder(this.k).mergeFrom(type).buildPartial();
                }
                this.d |= 64;
                return this;
            }

            public Builder mergeReturnType(Type type) {
                if ((this.d & 8) != 8 || this.h == Type.getDefaultInstance()) {
                    this.h = type;
                } else {
                    this.h = Type.newBuilder(this.h).mergeFrom(type).buildPartial();
                }
                this.d |= 8;
                return this;
            }

            public Builder mergeTypeTable(TypeTable typeTable) {
                if ((this.d & 512) != 512 || this.n == TypeTable.getDefaultInstance()) {
                    this.n = typeTable;
                } else {
                    this.n = TypeTable.newBuilder(this.n).mergeFrom(typeTable).buildPartial();
                }
                this.d |= 512;
                return this;
            }

            public Builder setFlags(int i) {
                this.d |= 1;
                this.e = i;
                return this;
            }

            public Builder setName(int i) {
                this.d |= 4;
                this.g = i;
                return this;
            }

            public Builder setOldFlags(int i) {
                this.d |= 2;
                this.f = i;
                return this;
            }

            public Builder setReceiverTypeId(int i) {
                this.d |= 128;
                this.l = i;
                return this;
            }

            public Builder setReturnTypeId(int i) {
                this.d |= 16;
                this.i = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Function build() {
                Function functionBuildPartial = buildPartial();
                if (functionBuildPartial.isInitialized()) {
                    return functionBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(functionBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Function getDefaultInstanceForType() {
                return Function.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Function function) {
                if (function == Function.getDefaultInstance()) {
                    return this;
                }
                if (function.hasFlags()) {
                    setFlags(function.getFlags());
                }
                if (function.hasOldFlags()) {
                    setOldFlags(function.getOldFlags());
                }
                if (function.hasName()) {
                    setName(function.getName());
                }
                if (function.hasReturnType()) {
                    mergeReturnType(function.getReturnType());
                }
                if (function.hasReturnTypeId()) {
                    setReturnTypeId(function.getReturnTypeId());
                }
                if (!function.i.isEmpty()) {
                    if (this.j.isEmpty()) {
                        this.j = function.i;
                        this.d &= -33;
                    } else {
                        f();
                        this.j.addAll(function.i);
                    }
                }
                if (function.hasReceiverType()) {
                    mergeReceiverType(function.getReceiverType());
                }
                if (function.hasReceiverTypeId()) {
                    setReceiverTypeId(function.getReceiverTypeId());
                }
                if (!function.l.isEmpty()) {
                    if (this.m.isEmpty()) {
                        this.m = function.l;
                        this.d &= -257;
                    } else {
                        g();
                        this.m.addAll(function.l);
                    }
                }
                if (function.hasTypeTable()) {
                    mergeTypeTable(function.getTypeTable());
                }
                if (!function.n.isEmpty()) {
                    if (this.o.isEmpty()) {
                        this.o = function.n;
                        this.d &= -1025;
                    } else {
                        h();
                        this.o.addAll(function.n);
                    }
                }
                if (function.hasContract()) {
                    mergeContract(function.getContract());
                }
                mergeExtensionFields(function);
                setUnknownFields(getUnknownFields().concat(function.b));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4297clone() {
                return e().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Function function = null;
                try {
                    try {
                        Function partialFrom = Function.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Function function2 = (Function) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            function = function2;
                            if (function != null) {
                                mergeFrom(function);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (function != null) {
                        mergeFrom(function);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<Function> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Function parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Function(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Function function = new Function(true);
            r = function;
            function.A();
        }

        private void A() {
            this.d = 6;
            this.e = 6;
            this.f = 0;
            this.g = Type.getDefaultInstance();
            this.h = 0;
            this.i = Collections.emptyList();
            this.j = Type.getDefaultInstance();
            this.k = 0;
            this.l = Collections.emptyList();
            this.m = TypeTable.getDefaultInstance();
            this.n = Collections.emptyList();
            this.o = Contract.getDefaultInstance();
        }

        public static Function getDefaultInstance() {
            return r;
        }

        public static Builder newBuilder() {
            return Builder.e();
        }

        public static Function parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public Contract getContract() {
            return this.o;
        }

        public int getFlags() {
            return this.d;
        }

        public int getName() {
            return this.f;
        }

        public int getOldFlags() {
            return this.e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Function> getParserForType() {
            return PARSER;
        }

        public Type getReceiverType() {
            return this.j;
        }

        public int getReceiverTypeId() {
            return this.k;
        }

        public Type getReturnType() {
            return this.g;
        }

        public int getReturnTypeId() {
            return this.h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.q;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.c & 2) == 2 ? CodedOutputStream.computeInt32Size(1, this.e) + 0 : 0;
            if ((this.c & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f);
            }
            if ((this.c & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, this.g);
            }
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, this.i.get(i2));
            }
            if ((this.c & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(5, this.j);
            }
            for (int i3 = 0; i3 < this.l.size(); i3++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(6, this.l.get(i3));
            }
            if ((this.c & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(7, this.h);
            }
            if ((this.c & 64) == 64) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(8, this.k);
            }
            if ((this.c & 1) == 1) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(9, this.d);
            }
            if ((this.c & 128) == 128) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(30, this.m);
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i4 = 0; i4 < this.n.size(); i4++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.n.get(i4).intValue());
            }
            int size = iComputeInt32Size + iComputeInt32SizeNoTag + (getVersionRequirementList().size() * 2);
            if ((this.c & 256) == 256) {
                size += CodedOutputStream.computeMessageSize(32, this.o);
            }
            int iExtensionsSerializedSize = size + extensionsSerializedSize() + this.b.size();
            this.q = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public TypeParameter getTypeParameter(int i) {
            return this.i.get(i);
        }

        public int getTypeParameterCount() {
            return this.i.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.i;
        }

        public TypeTable getTypeTable() {
            return this.m;
        }

        public ValueParameter getValueParameter(int i) {
            return this.l.get(i);
        }

        public int getValueParameterCount() {
            return this.l.size();
        }

        public List<ValueParameter> getValueParameterList() {
            return this.l;
        }

        public List<Integer> getVersionRequirementList() {
            return this.n;
        }

        public boolean hasContract() {
            return (this.c & 256) == 256;
        }

        public boolean hasFlags() {
            return (this.c & 1) == 1;
        }

        public boolean hasName() {
            return (this.c & 4) == 4;
        }

        public boolean hasOldFlags() {
            return (this.c & 2) == 2;
        }

        public boolean hasReceiverType() {
            return (this.c & 32) == 32;
        }

        public boolean hasReceiverTypeId() {
            return (this.c & 64) == 64;
        }

        public boolean hasReturnType() {
            return (this.c & 8) == 8;
        }

        public boolean hasReturnTypeId() {
            return (this.c & 16) == 16;
        }

        public boolean hasTypeTable() {
            return (this.c & 128) == 128;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.p;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.p = (byte) 0;
                return false;
            }
            if (hasReturnType() && !getReturnType().isInitialized()) {
                this.p = (byte) 0;
                return false;
            }
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.p = (byte) 0;
                    return false;
                }
            }
            if (hasReceiverType() && !getReceiverType().isInitialized()) {
                this.p = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < getValueParameterCount(); i2++) {
                if (!getValueParameter(i2).isInitialized()) {
                    this.p = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.p = (byte) 0;
                return false;
            }
            if (hasContract() && !getContract().isInitialized()) {
                this.p = (byte) 0;
                return false;
            }
            if (extensionsAreInitialized()) {
                this.p = (byte) 1;
                return true;
            }
            this.p = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.c & 2) == 2) {
                codedOutputStream.writeInt32(1, this.e);
            }
            if ((this.c & 4) == 4) {
                codedOutputStream.writeInt32(2, this.f);
            }
            if ((this.c & 8) == 8) {
                codedOutputStream.writeMessage(3, this.g);
            }
            for (int i = 0; i < this.i.size(); i++) {
                codedOutputStream.writeMessage(4, this.i.get(i));
            }
            if ((this.c & 32) == 32) {
                codedOutputStream.writeMessage(5, this.j);
            }
            for (int i2 = 0; i2 < this.l.size(); i2++) {
                codedOutputStream.writeMessage(6, this.l.get(i2));
            }
            if ((this.c & 16) == 16) {
                codedOutputStream.writeInt32(7, this.h);
            }
            if ((this.c & 64) == 64) {
                codedOutputStream.writeInt32(8, this.k);
            }
            if ((this.c & 1) == 1) {
                codedOutputStream.writeInt32(9, this.d);
            }
            if ((this.c & 128) == 128) {
                codedOutputStream.writeMessage(30, this.m);
            }
            for (int i3 = 0; i3 < this.n.size(); i3++) {
                codedOutputStream.writeInt32(31, this.n.get(i3).intValue());
            }
            if ((this.c & 256) == 256) {
                codedOutputStream.writeMessage(32, this.o);
            }
            extensionWriterNewExtensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.b);
        }

        public static Builder newBuilder(Function function) {
            return newBuilder().mergeFrom(function);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Function getDefaultInstanceForType() {
            return r;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Function(GeneratedMessageLite.ExtendableBuilder<Function, ?> extendableBuilder) {
            super(extendableBuilder);
            this.p = (byte) -1;
            this.q = -1;
            this.b = extendableBuilder.getUnknownFields();
        }

        private Function(boolean z) {
            this.p = (byte) -1;
            this.q = -1;
            this.b = ByteString.EMPTY;
        }

        private Function(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.p = (byte) -1;
            this.q = -1;
            A();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            switch (tag) {
                                case 0:
                                    break;
                                case 8:
                                    this.c |= 2;
                                    this.e = codedInputStream.readInt32();
                                    continue;
                                case 16:
                                    this.c |= 4;
                                    this.f = codedInputStream.readInt32();
                                    continue;
                                case 26:
                                    Type.Builder builder = (this.c & 8) == 8 ? this.g.toBuilder() : null;
                                    Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                    this.g = type;
                                    if (builder != null) {
                                        builder.mergeFrom(type);
                                        this.g = builder.buildPartial();
                                    }
                                    this.c |= 8;
                                    continue;
                                case 34:
                                    if ((i & 32) != 32) {
                                        this.i = new ArrayList();
                                        i |= 32;
                                    }
                                    this.i.add((TypeParameter) codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                                    continue;
                                case 42:
                                    Type.Builder builder2 = (this.c & 32) == 32 ? this.j.toBuilder() : null;
                                    Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                    this.j = type2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(type2);
                                        this.j = builder2.buildPartial();
                                    }
                                    this.c |= 32;
                                    continue;
                                case 50:
                                    if ((i & 256) != 256) {
                                        this.l = new ArrayList();
                                        i |= 256;
                                    }
                                    this.l.add((ValueParameter) codedInputStream.readMessage(ValueParameter.PARSER, extensionRegistryLite));
                                    continue;
                                case 56:
                                    this.c |= 16;
                                    this.h = codedInputStream.readInt32();
                                    continue;
                                case 64:
                                    this.c |= 64;
                                    this.k = codedInputStream.readInt32();
                                    continue;
                                case 72:
                                    this.c |= 1;
                                    this.d = codedInputStream.readInt32();
                                    continue;
                                case 242:
                                    TypeTable.Builder builder3 = (this.c & 128) == 128 ? this.m.toBuilder() : null;
                                    TypeTable typeTable = (TypeTable) codedInputStream.readMessage(TypeTable.PARSER, extensionRegistryLite);
                                    this.m = typeTable;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(typeTable);
                                        this.m = builder3.buildPartial();
                                    }
                                    this.c |= 128;
                                    continue;
                                case 248:
                                    if ((i & 1024) != 1024) {
                                        this.n = new ArrayList();
                                        i |= 1024;
                                    }
                                    this.n.add(Integer.valueOf(codedInputStream.readInt32()));
                                    continue;
                                case 250:
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i & 1024) != 1024 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.n = new ArrayList();
                                        i |= 1024;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.n.add(Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                    continue;
                                case 258:
                                    Contract.Builder builder4 = (this.c & 256) == 256 ? this.o.toBuilder() : null;
                                    Contract contract = (Contract) codedInputStream.readMessage(Contract.PARSER, extensionRegistryLite);
                                    this.o = contract;
                                    if (builder4 != null) {
                                        builder4.mergeFrom(contract);
                                        this.o = builder4.buildPartial();
                                    }
                                    this.c |= 256;
                                    continue;
                                default:
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                        break;
                                    }
                                    break;
                            }
                            z = true;
                        } catch (IOException e) {
                            throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((i & 32) == 32) {
                        this.i = Collections.unmodifiableList(this.i);
                    }
                    if ((i & 256) == 256) {
                        this.l = Collections.unmodifiableList(this.l);
                    }
                    if ((i & 1024) == 1024) {
                        this.n = Collections.unmodifiableList(this.n);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.b = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 32) == 32) {
                this.i = Collections.unmodifiableList(this.i);
            }
            if ((i & 256) == 256) {
                this.l = Collections.unmodifiableList(this.l);
            }
            if ((i & 1024) == 1024) {
                this.n = Collections.unmodifiableList(this.n);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.b = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface FunctionOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public enum MemberKind implements Internal.EnumLite {
        DECLARATION(0, 0),
        FAKE_OVERRIDE(1, 1),
        DELEGATION(2, 2),
        SYNTHESIZED(3, 3);

        private static Internal.EnumLiteMap<MemberKind> internalValueMap = new a();
        private final int value;

        public static class a implements Internal.EnumLiteMap<MemberKind> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public MemberKind findValueByNumber(int i) {
                return MemberKind.valueOf(i);
            }
        }

        MemberKind(int i, int i2) {
            this.value = i2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        public static MemberKind valueOf(int i) {
            if (i == 0) {
                return DECLARATION;
            }
            if (i == 1) {
                return FAKE_OVERRIDE;
            }
            if (i == 2) {
                return DELEGATION;
            }
            if (i != 3) {
                return null;
            }
            return SYNTHESIZED;
        }
    }

    public enum Modality implements Internal.EnumLite {
        FINAL(0, 0),
        OPEN(1, 1),
        ABSTRACT(2, 2),
        SEALED(3, 3);

        private static Internal.EnumLiteMap<Modality> internalValueMap = new a();
        private final int value;

        public static class a implements Internal.EnumLiteMap<Modality> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Modality findValueByNumber(int i) {
                return Modality.valueOf(i);
            }
        }

        Modality(int i, int i2) {
            this.value = i2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        public static Modality valueOf(int i) {
            if (i == 0) {
                return FINAL;
            }
            if (i == 1) {
                return OPEN;
            }
            if (i == 2) {
                return ABSTRACT;
            }
            if (i != 3) {
                return null;
            }
            return SEALED;
        }
    }

    public static final class Package extends GeneratedMessageLite.ExtendableMessage<Package> implements PackageOrBuilder {
        public static Parser<Package> PARSER = new a();
        private static final Package k;
        private final ByteString b;
        private int c;
        private List<Function> d;
        private List<Property> e;
        private List<TypeAlias> f;
        private TypeTable g;
        private VersionRequirementTable h;
        private byte i;
        private int j;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Package, Builder> implements PackageOrBuilder {
            private int d;
            private List<Function> e = Collections.emptyList();
            private List<Property> f = Collections.emptyList();
            private List<TypeAlias> g = Collections.emptyList();
            private TypeTable h = TypeTable.getDefaultInstance();
            private VersionRequirementTable i = VersionRequirementTable.getDefaultInstance();

            private Builder() {
                i();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder e() {
                return new Builder();
            }

            private void f() {
                if ((this.d & 1) != 1) {
                    this.e = new ArrayList(this.e);
                    this.d |= 1;
                }
            }

            private void g() {
                if ((this.d & 2) != 2) {
                    this.f = new ArrayList(this.f);
                    this.d |= 2;
                }
            }

            private void h() {
                if ((this.d & 4) != 4) {
                    this.g = new ArrayList(this.g);
                    this.d |= 4;
                }
            }

            private void i() {
            }

            public Package buildPartial() {
                Package r0 = new Package(this);
                int i = this.d;
                if ((i & 1) == 1) {
                    this.e = Collections.unmodifiableList(this.e);
                    this.d &= -2;
                }
                r0.d = this.e;
                if ((this.d & 2) == 2) {
                    this.f = Collections.unmodifiableList(this.f);
                    this.d &= -3;
                }
                r0.e = this.f;
                if ((this.d & 4) == 4) {
                    this.g = Collections.unmodifiableList(this.g);
                    this.d &= -5;
                }
                r0.f = this.g;
                int i2 = (i & 8) != 8 ? 0 : 1;
                r0.g = this.h;
                if ((i & 16) == 16) {
                    i2 |= 2;
                }
                r0.h = this.i;
                r0.c = i2;
                return r0;
            }

            public Function getFunction(int i) {
                return this.e.get(i);
            }

            public int getFunctionCount() {
                return this.e.size();
            }

            public Property getProperty(int i) {
                return this.f.get(i);
            }

            public int getPropertyCount() {
                return this.f.size();
            }

            public TypeAlias getTypeAlias(int i) {
                return this.g.get(i);
            }

            public int getTypeAliasCount() {
                return this.g.size();
            }

            public TypeTable getTypeTable() {
                return this.h;
            }

            public boolean hasTypeTable() {
                return (this.d & 8) == 8;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getFunctionCount(); i++) {
                    if (!getFunction(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < getPropertyCount(); i2++) {
                    if (!getProperty(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < getTypeAliasCount(); i3++) {
                    if (!getTypeAlias(i3).isInitialized()) {
                        return false;
                    }
                }
                return (!hasTypeTable() || getTypeTable().isInitialized()) && extensionsAreInitialized();
            }

            public Builder mergeTypeTable(TypeTable typeTable) {
                if ((this.d & 8) != 8 || this.h == TypeTable.getDefaultInstance()) {
                    this.h = typeTable;
                } else {
                    this.h = TypeTable.newBuilder(this.h).mergeFrom(typeTable).buildPartial();
                }
                this.d |= 8;
                return this;
            }

            public Builder mergeVersionRequirementTable(VersionRequirementTable versionRequirementTable) {
                if ((this.d & 16) != 16 || this.i == VersionRequirementTable.getDefaultInstance()) {
                    this.i = versionRequirementTable;
                } else {
                    this.i = VersionRequirementTable.newBuilder(this.i).mergeFrom(versionRequirementTable).buildPartial();
                }
                this.d |= 16;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Package build() {
                Package packageBuildPartial = buildPartial();
                if (packageBuildPartial.isInitialized()) {
                    return packageBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(packageBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Package getDefaultInstanceForType() {
                return Package.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Package r3) {
                if (r3 == Package.getDefaultInstance()) {
                    return this;
                }
                if (!r3.d.isEmpty()) {
                    if (this.e.isEmpty()) {
                        this.e = r3.d;
                        this.d &= -2;
                    } else {
                        f();
                        this.e.addAll(r3.d);
                    }
                }
                if (!r3.e.isEmpty()) {
                    if (this.f.isEmpty()) {
                        this.f = r3.e;
                        this.d &= -3;
                    } else {
                        g();
                        this.f.addAll(r3.e);
                    }
                }
                if (!r3.f.isEmpty()) {
                    if (this.g.isEmpty()) {
                        this.g = r3.f;
                        this.d &= -5;
                    } else {
                        h();
                        this.g.addAll(r3.f);
                    }
                }
                if (r3.hasTypeTable()) {
                    mergeTypeTable(r3.getTypeTable());
                }
                if (r3.hasVersionRequirementTable()) {
                    mergeVersionRequirementTable(r3.getVersionRequirementTable());
                }
                mergeExtensionFields(r3);
                setUnknownFields(getUnknownFields().concat(r3.b));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4297clone() {
                return e().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Package r0 = null;
                try {
                    try {
                        Package partialFrom = Package.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Package r4 = (Package) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            r0 = r4;
                            if (r0 != null) {
                                mergeFrom(r0);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (r0 != null) {
                        mergeFrom(r0);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<Package> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Package parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Package(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Package r0 = new Package(true);
            k = r0;
            r0.t();
        }

        public static Package getDefaultInstance() {
            return k;
        }

        public static Builder newBuilder() {
            return Builder.e();
        }

        public static Package parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        private void t() {
            this.d = Collections.emptyList();
            this.e = Collections.emptyList();
            this.f = Collections.emptyList();
            this.g = TypeTable.getDefaultInstance();
            this.h = VersionRequirementTable.getDefaultInstance();
        }

        public Function getFunction(int i) {
            return this.d.get(i);
        }

        public int getFunctionCount() {
            return this.d.size();
        }

        public List<Function> getFunctionList() {
            return this.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Package> getParserForType() {
            return PARSER;
        }

        public Property getProperty(int i) {
            return this.e.get(i);
        }

        public int getPropertyCount() {
            return this.e.size();
        }

        public List<Property> getPropertyList() {
            return this.e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.j;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = 0;
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, this.d.get(i2));
            }
            for (int i3 = 0; i3 < this.e.size(); i3++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, this.e.get(i3));
            }
            for (int i4 = 0; i4 < this.f.size(); i4++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, this.f.get(i4));
            }
            if ((this.c & 1) == 1) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(30, this.g);
            }
            if ((this.c & 2) == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(32, this.h);
            }
            int iExtensionsSerializedSize = iComputeMessageSize + extensionsSerializedSize() + this.b.size();
            this.j = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public TypeAlias getTypeAlias(int i) {
            return this.f.get(i);
        }

        public int getTypeAliasCount() {
            return this.f.size();
        }

        public List<TypeAlias> getTypeAliasList() {
            return this.f;
        }

        public TypeTable getTypeTable() {
            return this.g;
        }

        public VersionRequirementTable getVersionRequirementTable() {
            return this.h;
        }

        public boolean hasTypeTable() {
            return (this.c & 1) == 1;
        }

        public boolean hasVersionRequirementTable() {
            return (this.c & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.i;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getFunctionCount(); i++) {
                if (!getFunction(i).isInitialized()) {
                    this.i = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getPropertyCount(); i2++) {
                if (!getProperty(i2).isInitialized()) {
                    this.i = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < getTypeAliasCount(); i3++) {
                if (!getTypeAlias(i3).isInitialized()) {
                    this.i = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.i = (byte) 0;
                return false;
            }
            if (extensionsAreInitialized()) {
                this.i = (byte) 1;
                return true;
            }
            this.i = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            for (int i = 0; i < this.d.size(); i++) {
                codedOutputStream.writeMessage(3, this.d.get(i));
            }
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                codedOutputStream.writeMessage(4, this.e.get(i2));
            }
            for (int i3 = 0; i3 < this.f.size(); i3++) {
                codedOutputStream.writeMessage(5, this.f.get(i3));
            }
            if ((this.c & 1) == 1) {
                codedOutputStream.writeMessage(30, this.g);
            }
            if ((this.c & 2) == 2) {
                codedOutputStream.writeMessage(32, this.h);
            }
            extensionWriterNewExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.b);
        }

        public static Builder newBuilder(Package r1) {
            return newBuilder().mergeFrom(r1);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Package getDefaultInstanceForType() {
            return k;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Package(GeneratedMessageLite.ExtendableBuilder<Package, ?> extendableBuilder) {
            super(extendableBuilder);
            this.i = (byte) -1;
            this.j = -1;
            this.b = extendableBuilder.getUnknownFields();
        }

        private Package(boolean z) {
            this.i = (byte) -1;
            this.j = -1;
            this.b = ByteString.EMPTY;
        }

        private Package(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.i = (byte) -1;
            this.j = -1;
            t();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 26) {
                                    if ((i & 1) != 1) {
                                        this.d = new ArrayList();
                                        i |= 1;
                                    }
                                    this.d.add((Function) codedInputStream.readMessage(Function.PARSER, extensionRegistryLite));
                                } else if (tag == 34) {
                                    if ((i & 2) != 2) {
                                        this.e = new ArrayList();
                                        i |= 2;
                                    }
                                    this.e.add((Property) codedInputStream.readMessage(Property.PARSER, extensionRegistryLite));
                                } else if (tag != 42) {
                                    if (tag == 242) {
                                        TypeTable.Builder builder = (this.c & 1) == 1 ? this.g.toBuilder() : null;
                                        TypeTable typeTable = (TypeTable) codedInputStream.readMessage(TypeTable.PARSER, extensionRegistryLite);
                                        this.g = typeTable;
                                        if (builder != null) {
                                            builder.mergeFrom(typeTable);
                                            this.g = builder.buildPartial();
                                        }
                                        this.c |= 1;
                                    } else if (tag != 258) {
                                        if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        VersionRequirementTable.Builder builder2 = (this.c & 2) == 2 ? this.h.toBuilder() : null;
                                        VersionRequirementTable versionRequirementTable = (VersionRequirementTable) codedInputStream.readMessage(VersionRequirementTable.PARSER, extensionRegistryLite);
                                        this.h = versionRequirementTable;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(versionRequirementTable);
                                            this.h = builder2.buildPartial();
                                        }
                                        this.c |= 2;
                                    }
                                } else {
                                    if ((i & 4) != 4) {
                                        this.f = new ArrayList();
                                        i |= 4;
                                    }
                                    this.f.add((TypeAlias) codedInputStream.readMessage(TypeAlias.PARSER, extensionRegistryLite));
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((i & 1) == 1) {
                        this.d = Collections.unmodifiableList(this.d);
                    }
                    if ((i & 2) == 2) {
                        this.e = Collections.unmodifiableList(this.e);
                    }
                    if ((i & 4) == 4) {
                        this.f = Collections.unmodifiableList(this.f);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.b = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 1) == 1) {
                this.d = Collections.unmodifiableList(this.d);
            }
            if ((i & 2) == 2) {
                this.e = Collections.unmodifiableList(this.e);
            }
            if ((i & 4) == 4) {
                this.f = Collections.unmodifiableList(this.f);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.b = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public static final class PackageFragment extends GeneratedMessageLite.ExtendableMessage<PackageFragment> implements PackageFragmentOrBuilder {
        public static Parser<PackageFragment> PARSER = new a();
        private static final PackageFragment j;
        private final ByteString b;
        private int c;
        private StringTable d;
        private QualifiedNameTable e;
        private Package f;
        private List<Class> g;
        private byte h;
        private int i;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<PackageFragment, Builder> implements PackageFragmentOrBuilder {
            private int d;
            private StringTable e = StringTable.getDefaultInstance();
            private QualifiedNameTable f = QualifiedNameTable.getDefaultInstance();
            private Package g = Package.getDefaultInstance();
            private List<Class> h = Collections.emptyList();

            private Builder() {
                g();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder e() {
                return new Builder();
            }

            private void f() {
                if ((this.d & 8) != 8) {
                    this.h = new ArrayList(this.h);
                    this.d |= 8;
                }
            }

            private void g() {
            }

            public PackageFragment buildPartial() {
                PackageFragment packageFragment = new PackageFragment(this);
                int i = this.d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                packageFragment.d = this.e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                packageFragment.e = this.f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                packageFragment.f = this.g;
                if ((this.d & 8) == 8) {
                    this.h = Collections.unmodifiableList(this.h);
                    this.d &= -9;
                }
                packageFragment.g = this.h;
                packageFragment.c = i2;
                return packageFragment;
            }

            public Class getClass_(int i) {
                return this.h.get(i);
            }

            public int getClass_Count() {
                return this.h.size();
            }

            public Package getPackage() {
                return this.g;
            }

            public QualifiedNameTable getQualifiedNames() {
                return this.f;
            }

            public boolean hasPackage() {
                return (this.d & 4) == 4;
            }

            public boolean hasQualifiedNames() {
                return (this.d & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
                    return false;
                }
                if (hasPackage() && !getPackage().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getClass_Count(); i++) {
                    if (!getClass_(i).isInitialized()) {
                        return false;
                    }
                }
                return extensionsAreInitialized();
            }

            public Builder mergePackage(Package r4) {
                if ((this.d & 4) != 4 || this.g == Package.getDefaultInstance()) {
                    this.g = r4;
                } else {
                    this.g = Package.newBuilder(this.g).mergeFrom(r4).buildPartial();
                }
                this.d |= 4;
                return this;
            }

            public Builder mergeQualifiedNames(QualifiedNameTable qualifiedNameTable) {
                if ((this.d & 2) != 2 || this.f == QualifiedNameTable.getDefaultInstance()) {
                    this.f = qualifiedNameTable;
                } else {
                    this.f = QualifiedNameTable.newBuilder(this.f).mergeFrom(qualifiedNameTable).buildPartial();
                }
                this.d |= 2;
                return this;
            }

            public Builder mergeStrings(StringTable stringTable) {
                if ((this.d & 1) != 1 || this.e == StringTable.getDefaultInstance()) {
                    this.e = stringTable;
                } else {
                    this.e = StringTable.newBuilder(this.e).mergeFrom(stringTable).buildPartial();
                }
                this.d |= 1;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public PackageFragment build() {
                PackageFragment packageFragmentBuildPartial = buildPartial();
                if (packageFragmentBuildPartial.isInitialized()) {
                    return packageFragmentBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(packageFragmentBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public PackageFragment getDefaultInstanceForType() {
                return PackageFragment.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(PackageFragment packageFragment) {
                if (packageFragment == PackageFragment.getDefaultInstance()) {
                    return this;
                }
                if (packageFragment.hasStrings()) {
                    mergeStrings(packageFragment.getStrings());
                }
                if (packageFragment.hasQualifiedNames()) {
                    mergeQualifiedNames(packageFragment.getQualifiedNames());
                }
                if (packageFragment.hasPackage()) {
                    mergePackage(packageFragment.getPackage());
                }
                if (!packageFragment.g.isEmpty()) {
                    if (this.h.isEmpty()) {
                        this.h = packageFragment.g;
                        this.d &= -9;
                    } else {
                        f();
                        this.h.addAll(packageFragment.g);
                    }
                }
                mergeExtensionFields(packageFragment);
                setUnknownFields(getUnknownFields().concat(packageFragment.b));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4297clone() {
                return e().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                PackageFragment packageFragment = null;
                try {
                    try {
                        PackageFragment partialFrom = PackageFragment.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        PackageFragment packageFragment2 = (PackageFragment) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            packageFragment = packageFragment2;
                            if (packageFragment != null) {
                                mergeFrom(packageFragment);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (packageFragment != null) {
                        mergeFrom(packageFragment);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<PackageFragment> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public PackageFragment parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new PackageFragment(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            PackageFragment packageFragment = new PackageFragment(true);
            j = packageFragment;
            packageFragment.q();
        }

        public static PackageFragment getDefaultInstance() {
            return j;
        }

        public static Builder newBuilder() {
            return Builder.e();
        }

        public static PackageFragment parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        private void q() {
            this.d = StringTable.getDefaultInstance();
            this.e = QualifiedNameTable.getDefaultInstance();
            this.f = Package.getDefaultInstance();
            this.g = Collections.emptyList();
        }

        public Class getClass_(int i) {
            return this.g.get(i);
        }

        public int getClass_Count() {
            return this.g.size();
        }

        public List<Class> getClass_List() {
            return this.g;
        }

        public Package getPackage() {
            return this.f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<PackageFragment> getParserForType() {
            return PARSER;
        }

        public QualifiedNameTable getQualifiedNames() {
            return this.e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.i;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = (this.c & 1) == 1 ? CodedOutputStream.computeMessageSize(1, this.d) + 0 : 0;
            if ((this.c & 2) == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, this.e);
            }
            if ((this.c & 4) == 4) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, this.f);
            }
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, this.g.get(i2));
            }
            int iExtensionsSerializedSize = iComputeMessageSize + extensionsSerializedSize() + this.b.size();
            this.i = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public StringTable getStrings() {
            return this.d;
        }

        public boolean hasPackage() {
            return (this.c & 4) == 4;
        }

        public boolean hasQualifiedNames() {
            return (this.c & 2) == 2;
        }

        public boolean hasStrings() {
            return (this.c & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.h;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
                this.h = (byte) 0;
                return false;
            }
            if (hasPackage() && !getPackage().isInitialized()) {
                this.h = (byte) 0;
                return false;
            }
            for (int i = 0; i < getClass_Count(); i++) {
                if (!getClass_(i).isInitialized()) {
                    this.h = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.h = (byte) 1;
                return true;
            }
            this.h = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.c & 1) == 1) {
                codedOutputStream.writeMessage(1, this.d);
            }
            if ((this.c & 2) == 2) {
                codedOutputStream.writeMessage(2, this.e);
            }
            if ((this.c & 4) == 4) {
                codedOutputStream.writeMessage(3, this.f);
            }
            for (int i = 0; i < this.g.size(); i++) {
                codedOutputStream.writeMessage(4, this.g.get(i));
            }
            extensionWriterNewExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.b);
        }

        public static Builder newBuilder(PackageFragment packageFragment) {
            return newBuilder().mergeFrom(packageFragment);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public PackageFragment getDefaultInstanceForType() {
            return j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private PackageFragment(GeneratedMessageLite.ExtendableBuilder<PackageFragment, ?> extendableBuilder) {
            super(extendableBuilder);
            this.h = (byte) -1;
            this.i = -1;
            this.b = extendableBuilder.getUnknownFields();
        }

        private PackageFragment(boolean z) {
            this.h = (byte) -1;
            this.i = -1;
            this.b = ByteString.EMPTY;
        }

        private PackageFragment(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.h = (byte) -1;
            this.i = -1;
            q();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    StringTable.Builder builder = (this.c & 1) == 1 ? this.d.toBuilder() : null;
                                    StringTable stringTable = (StringTable) codedInputStream.readMessage(StringTable.PARSER, extensionRegistryLite);
                                    this.d = stringTable;
                                    if (builder != null) {
                                        builder.mergeFrom(stringTable);
                                        this.d = builder.buildPartial();
                                    }
                                    this.c |= 1;
                                } else if (tag == 18) {
                                    QualifiedNameTable.Builder builder2 = (this.c & 2) == 2 ? this.e.toBuilder() : null;
                                    QualifiedNameTable qualifiedNameTable = (QualifiedNameTable) codedInputStream.readMessage(QualifiedNameTable.PARSER, extensionRegistryLite);
                                    this.e = qualifiedNameTable;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(qualifiedNameTable);
                                        this.e = builder2.buildPartial();
                                    }
                                    this.c |= 2;
                                } else if (tag == 26) {
                                    Package.Builder builder3 = (this.c & 4) == 4 ? this.f.toBuilder() : null;
                                    Package r6 = (Package) codedInputStream.readMessage(Package.PARSER, extensionRegistryLite);
                                    this.f = r6;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(r6);
                                        this.f = builder3.buildPartial();
                                    }
                                    this.c |= 4;
                                } else if (tag != 34) {
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    if ((i & 8) != 8) {
                                        this.g = new ArrayList();
                                        i |= 8;
                                    }
                                    this.g.add((Class) codedInputStream.readMessage(Class.PARSER, extensionRegistryLite));
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((i & 8) == 8) {
                        this.g = Collections.unmodifiableList(this.g);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.b = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 8) == 8) {
                this.g = Collections.unmodifiableList(this.g);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.b = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface PackageFragmentOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface PackageOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Property extends GeneratedMessageLite.ExtendableMessage<Property> implements PropertyOrBuilder {
        public static Parser<Property> PARSER = new a();
        private static final Property r;
        private final ByteString b;
        private int c;
        private int d;
        private int e;
        private int f;
        private Type g;
        private int h;
        private List<TypeParameter> i;
        private Type j;
        private int k;
        private ValueParameter l;
        private int m;
        private int n;
        private List<Integer> o;
        private byte p;
        private int q;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Property, Builder> implements PropertyOrBuilder {
            private int d;
            private int g;
            private int i;
            private int l;
            private int n;
            private int o;
            private int e = 518;
            private int f = 2054;
            private Type h = Type.getDefaultInstance();
            private List<TypeParameter> j = Collections.emptyList();
            private Type k = Type.getDefaultInstance();
            private ValueParameter m = ValueParameter.getDefaultInstance();
            private List<Integer> p = Collections.emptyList();

            private Builder() {
                h();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder e() {
                return new Builder();
            }

            private void f() {
                if ((this.d & 32) != 32) {
                    this.j = new ArrayList(this.j);
                    this.d |= 32;
                }
            }

            private void g() {
                if ((this.d & 2048) != 2048) {
                    this.p = new ArrayList(this.p);
                    this.d |= 2048;
                }
            }

            private void h() {
            }

            public Property buildPartial() {
                Property property = new Property(this);
                int i = this.d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                property.d = this.e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                property.e = this.f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                property.f = this.g;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                property.g = this.h;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                property.h = this.i;
                if ((this.d & 32) == 32) {
                    this.j = Collections.unmodifiableList(this.j);
                    this.d &= -33;
                }
                property.i = this.j;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                property.j = this.k;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                property.k = this.l;
                if ((i & 256) == 256) {
                    i2 |= 128;
                }
                property.l = this.m;
                if ((i & 512) == 512) {
                    i2 |= 256;
                }
                property.m = this.n;
                if ((i & 1024) == 1024) {
                    i2 |= 512;
                }
                property.n = this.o;
                if ((this.d & 2048) == 2048) {
                    this.p = Collections.unmodifiableList(this.p);
                    this.d &= -2049;
                }
                property.o = this.p;
                property.c = i2;
                return property;
            }

            public Type getReceiverType() {
                return this.k;
            }

            public Type getReturnType() {
                return this.h;
            }

            public ValueParameter getSetterValueParameter() {
                return this.m;
            }

            public TypeParameter getTypeParameter(int i) {
                return this.j.get(i);
            }

            public int getTypeParameterCount() {
                return this.j.size();
            }

            public boolean hasName() {
                return (this.d & 4) == 4;
            }

            public boolean hasReceiverType() {
                return (this.d & 64) == 64;
            }

            public boolean hasReturnType() {
                return (this.d & 8) == 8;
            }

            public boolean hasSetterValueParameter() {
                return (this.d & 256) == 256;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasReturnType() && !getReturnType().isInitialized()) {
                    return false;
                }
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        return false;
                    }
                }
                if (!hasReceiverType() || getReceiverType().isInitialized()) {
                    return (!hasSetterValueParameter() || getSetterValueParameter().isInitialized()) && extensionsAreInitialized();
                }
                return false;
            }

            public Builder mergeReceiverType(Type type) {
                if ((this.d & 64) != 64 || this.k == Type.getDefaultInstance()) {
                    this.k = type;
                } else {
                    this.k = Type.newBuilder(this.k).mergeFrom(type).buildPartial();
                }
                this.d |= 64;
                return this;
            }

            public Builder mergeReturnType(Type type) {
                if ((this.d & 8) != 8 || this.h == Type.getDefaultInstance()) {
                    this.h = type;
                } else {
                    this.h = Type.newBuilder(this.h).mergeFrom(type).buildPartial();
                }
                this.d |= 8;
                return this;
            }

            public Builder mergeSetterValueParameter(ValueParameter valueParameter) {
                if ((this.d & 256) != 256 || this.m == ValueParameter.getDefaultInstance()) {
                    this.m = valueParameter;
                } else {
                    this.m = ValueParameter.newBuilder(this.m).mergeFrom(valueParameter).buildPartial();
                }
                this.d |= 256;
                return this;
            }

            public Builder setFlags(int i) {
                this.d |= 1;
                this.e = i;
                return this;
            }

            public Builder setGetterFlags(int i) {
                this.d |= 512;
                this.n = i;
                return this;
            }

            public Builder setName(int i) {
                this.d |= 4;
                this.g = i;
                return this;
            }

            public Builder setOldFlags(int i) {
                this.d |= 2;
                this.f = i;
                return this;
            }

            public Builder setReceiverTypeId(int i) {
                this.d |= 128;
                this.l = i;
                return this;
            }

            public Builder setReturnTypeId(int i) {
                this.d |= 16;
                this.i = i;
                return this;
            }

            public Builder setSetterFlags(int i) {
                this.d |= 1024;
                this.o = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Property build() {
                Property propertyBuildPartial = buildPartial();
                if (propertyBuildPartial.isInitialized()) {
                    return propertyBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(propertyBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Property getDefaultInstanceForType() {
                return Property.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Property property) {
                if (property == Property.getDefaultInstance()) {
                    return this;
                }
                if (property.hasFlags()) {
                    setFlags(property.getFlags());
                }
                if (property.hasOldFlags()) {
                    setOldFlags(property.getOldFlags());
                }
                if (property.hasName()) {
                    setName(property.getName());
                }
                if (property.hasReturnType()) {
                    mergeReturnType(property.getReturnType());
                }
                if (property.hasReturnTypeId()) {
                    setReturnTypeId(property.getReturnTypeId());
                }
                if (!property.i.isEmpty()) {
                    if (this.j.isEmpty()) {
                        this.j = property.i;
                        this.d &= -33;
                    } else {
                        f();
                        this.j.addAll(property.i);
                    }
                }
                if (property.hasReceiverType()) {
                    mergeReceiverType(property.getReceiverType());
                }
                if (property.hasReceiverTypeId()) {
                    setReceiverTypeId(property.getReceiverTypeId());
                }
                if (property.hasSetterValueParameter()) {
                    mergeSetterValueParameter(property.getSetterValueParameter());
                }
                if (property.hasGetterFlags()) {
                    setGetterFlags(property.getGetterFlags());
                }
                if (property.hasSetterFlags()) {
                    setSetterFlags(property.getSetterFlags());
                }
                if (!property.o.isEmpty()) {
                    if (this.p.isEmpty()) {
                        this.p = property.o;
                        this.d &= -2049;
                    } else {
                        g();
                        this.p.addAll(property.o);
                    }
                }
                mergeExtensionFields(property);
                setUnknownFields(getUnknownFields().concat(property.b));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4297clone() {
                return e().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Property property = null;
                try {
                    try {
                        Property partialFrom = Property.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Property property2 = (Property) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            property = property2;
                            if (property != null) {
                                mergeFrom(property);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (property != null) {
                        mergeFrom(property);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<Property> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Property parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Property(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Property property = new Property(true);
            r = property;
            property.z();
        }

        public static Property getDefaultInstance() {
            return r;
        }

        public static Builder newBuilder() {
            return Builder.e();
        }

        private void z() {
            this.d = 518;
            this.e = 2054;
            this.f = 0;
            this.g = Type.getDefaultInstance();
            this.h = 0;
            this.i = Collections.emptyList();
            this.j = Type.getDefaultInstance();
            this.k = 0;
            this.l = ValueParameter.getDefaultInstance();
            this.m = 0;
            this.n = 0;
            this.o = Collections.emptyList();
        }

        public int getFlags() {
            return this.d;
        }

        public int getGetterFlags() {
            return this.m;
        }

        public int getName() {
            return this.f;
        }

        public int getOldFlags() {
            return this.e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Property> getParserForType() {
            return PARSER;
        }

        public Type getReceiverType() {
            return this.j;
        }

        public int getReceiverTypeId() {
            return this.k;
        }

        public Type getReturnType() {
            return this.g;
        }

        public int getReturnTypeId() {
            return this.h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.q;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.c & 2) == 2 ? CodedOutputStream.computeInt32Size(1, this.e) + 0 : 0;
            if ((this.c & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f);
            }
            if ((this.c & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, this.g);
            }
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, this.i.get(i2));
            }
            if ((this.c & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(5, this.j);
            }
            if ((this.c & 128) == 128) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(6, this.l);
            }
            if ((this.c & 256) == 256) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(7, this.m);
            }
            if ((this.c & 512) == 512) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(8, this.n);
            }
            if ((this.c & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(9, this.h);
            }
            if ((this.c & 64) == 64) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(10, this.k);
            }
            if ((this.c & 1) == 1) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(11, this.d);
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i3 = 0; i3 < this.o.size(); i3++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.o.get(i3).intValue());
            }
            int size = iComputeInt32Size + iComputeInt32SizeNoTag + (getVersionRequirementList().size() * 2) + extensionsSerializedSize() + this.b.size();
            this.q = size;
            return size;
        }

        public int getSetterFlags() {
            return this.n;
        }

        public ValueParameter getSetterValueParameter() {
            return this.l;
        }

        public TypeParameter getTypeParameter(int i) {
            return this.i.get(i);
        }

        public int getTypeParameterCount() {
            return this.i.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.i;
        }

        public List<Integer> getVersionRequirementList() {
            return this.o;
        }

        public boolean hasFlags() {
            return (this.c & 1) == 1;
        }

        public boolean hasGetterFlags() {
            return (this.c & 256) == 256;
        }

        public boolean hasName() {
            return (this.c & 4) == 4;
        }

        public boolean hasOldFlags() {
            return (this.c & 2) == 2;
        }

        public boolean hasReceiverType() {
            return (this.c & 32) == 32;
        }

        public boolean hasReceiverTypeId() {
            return (this.c & 64) == 64;
        }

        public boolean hasReturnType() {
            return (this.c & 8) == 8;
        }

        public boolean hasReturnTypeId() {
            return (this.c & 16) == 16;
        }

        public boolean hasSetterFlags() {
            return (this.c & 512) == 512;
        }

        public boolean hasSetterValueParameter() {
            return (this.c & 128) == 128;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.p;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.p = (byte) 0;
                return false;
            }
            if (hasReturnType() && !getReturnType().isInitialized()) {
                this.p = (byte) 0;
                return false;
            }
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.p = (byte) 0;
                    return false;
                }
            }
            if (hasReceiverType() && !getReceiverType().isInitialized()) {
                this.p = (byte) 0;
                return false;
            }
            if (hasSetterValueParameter() && !getSetterValueParameter().isInitialized()) {
                this.p = (byte) 0;
                return false;
            }
            if (extensionsAreInitialized()) {
                this.p = (byte) 1;
                return true;
            }
            this.p = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.c & 2) == 2) {
                codedOutputStream.writeInt32(1, this.e);
            }
            if ((this.c & 4) == 4) {
                codedOutputStream.writeInt32(2, this.f);
            }
            if ((this.c & 8) == 8) {
                codedOutputStream.writeMessage(3, this.g);
            }
            for (int i = 0; i < this.i.size(); i++) {
                codedOutputStream.writeMessage(4, this.i.get(i));
            }
            if ((this.c & 32) == 32) {
                codedOutputStream.writeMessage(5, this.j);
            }
            if ((this.c & 128) == 128) {
                codedOutputStream.writeMessage(6, this.l);
            }
            if ((this.c & 256) == 256) {
                codedOutputStream.writeInt32(7, this.m);
            }
            if ((this.c & 512) == 512) {
                codedOutputStream.writeInt32(8, this.n);
            }
            if ((this.c & 16) == 16) {
                codedOutputStream.writeInt32(9, this.h);
            }
            if ((this.c & 64) == 64) {
                codedOutputStream.writeInt32(10, this.k);
            }
            if ((this.c & 1) == 1) {
                codedOutputStream.writeInt32(11, this.d);
            }
            for (int i2 = 0; i2 < this.o.size(); i2++) {
                codedOutputStream.writeInt32(31, this.o.get(i2).intValue());
            }
            extensionWriterNewExtensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.b);
        }

        public static Builder newBuilder(Property property) {
            return newBuilder().mergeFrom(property);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Property getDefaultInstanceForType() {
            return r;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Property(GeneratedMessageLite.ExtendableBuilder<Property, ?> extendableBuilder) {
            super(extendableBuilder);
            this.p = (byte) -1;
            this.q = -1;
            this.b = extendableBuilder.getUnknownFields();
        }

        private Property(boolean z) {
            this.p = (byte) -1;
            this.q = -1;
            this.b = ByteString.EMPTY;
        }

        private Property(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.p = (byte) -1;
            this.q = -1;
            z();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            switch (tag) {
                                case 0:
                                    break;
                                case 8:
                                    this.c |= 2;
                                    this.e = codedInputStream.readInt32();
                                    continue;
                                case 16:
                                    this.c |= 4;
                                    this.f = codedInputStream.readInt32();
                                    continue;
                                case 26:
                                    Type.Builder builder = (this.c & 8) == 8 ? this.g.toBuilder() : null;
                                    Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                    this.g = type;
                                    if (builder != null) {
                                        builder.mergeFrom(type);
                                        this.g = builder.buildPartial();
                                    }
                                    this.c |= 8;
                                    continue;
                                case 34:
                                    if ((i & 32) != 32) {
                                        this.i = new ArrayList();
                                        i |= 32;
                                    }
                                    this.i.add((TypeParameter) codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                                    continue;
                                case 42:
                                    Type.Builder builder2 = (this.c & 32) == 32 ? this.j.toBuilder() : null;
                                    Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                    this.j = type2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(type2);
                                        this.j = builder2.buildPartial();
                                    }
                                    this.c |= 32;
                                    continue;
                                case 50:
                                    ValueParameter.Builder builder3 = (this.c & 128) == 128 ? this.l.toBuilder() : null;
                                    ValueParameter valueParameter = (ValueParameter) codedInputStream.readMessage(ValueParameter.PARSER, extensionRegistryLite);
                                    this.l = valueParameter;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(valueParameter);
                                        this.l = builder3.buildPartial();
                                    }
                                    this.c |= 128;
                                    continue;
                                case 56:
                                    this.c |= 256;
                                    this.m = codedInputStream.readInt32();
                                    continue;
                                case 64:
                                    this.c |= 512;
                                    this.n = codedInputStream.readInt32();
                                    continue;
                                case 72:
                                    this.c |= 16;
                                    this.h = codedInputStream.readInt32();
                                    continue;
                                case 80:
                                    this.c |= 64;
                                    this.k = codedInputStream.readInt32();
                                    continue;
                                case 88:
                                    this.c |= 1;
                                    this.d = codedInputStream.readInt32();
                                    continue;
                                case 248:
                                    if ((i & 2048) != 2048) {
                                        this.o = new ArrayList();
                                        i |= 2048;
                                    }
                                    this.o.add(Integer.valueOf(codedInputStream.readInt32()));
                                    continue;
                                case 250:
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i & 2048) != 2048 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.o = new ArrayList();
                                        i |= 2048;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.o.add(Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                    continue;
                                default:
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                        break;
                                    }
                                    break;
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((i & 32) == 32) {
                        this.i = Collections.unmodifiableList(this.i);
                    }
                    if ((i & 2048) == 2048) {
                        this.o = Collections.unmodifiableList(this.o);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.b = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 32) == 32) {
                this.i = Collections.unmodifiableList(this.i);
            }
            if ((i & 2048) == 2048) {
                this.o = Collections.unmodifiableList(this.o);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.b = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface PropertyOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class QualifiedNameTable extends GeneratedMessageLite implements QualifiedNameTableOrBuilder {
        public static Parser<QualifiedNameTable> PARSER = new a();
        private static final QualifiedNameTable e;
        private final ByteString a;
        private List<QualifiedName> b;
        private byte c;
        private int d;

        public static final class Builder extends GeneratedMessageLite.Builder<QualifiedNameTable, Builder> implements QualifiedNameTableOrBuilder {
            private int b;
            private List<QualifiedName> c = Collections.emptyList();

            private Builder() {
                d();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder b() {
                return new Builder();
            }

            private void c() {
                if ((this.b & 1) != 1) {
                    this.c = new ArrayList(this.c);
                    this.b |= 1;
                }
            }

            private void d() {
            }

            public QualifiedNameTable buildPartial() {
                QualifiedNameTable qualifiedNameTable = new QualifiedNameTable(this);
                if ((this.b & 1) == 1) {
                    this.c = Collections.unmodifiableList(this.c);
                    this.b &= -2;
                }
                qualifiedNameTable.b = this.c;
                return qualifiedNameTable;
            }

            public QualifiedName getQualifiedName(int i) {
                return this.c.get(i);
            }

            public int getQualifiedNameCount() {
                return this.c.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getQualifiedNameCount(); i++) {
                    if (!getQualifiedName(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public QualifiedNameTable build() {
                QualifiedNameTable qualifiedNameTableBuildPartial = buildPartial();
                if (qualifiedNameTableBuildPartial.isInitialized()) {
                    return qualifiedNameTableBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(qualifiedNameTableBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public QualifiedNameTable getDefaultInstanceForType() {
                return QualifiedNameTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4297clone() {
                return b().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(QualifiedNameTable qualifiedNameTable) {
                if (qualifiedNameTable == QualifiedNameTable.getDefaultInstance()) {
                    return this;
                }
                if (!qualifiedNameTable.b.isEmpty()) {
                    if (this.c.isEmpty()) {
                        this.c = qualifiedNameTable.b;
                        this.b &= -2;
                    } else {
                        c();
                        this.c.addAll(qualifiedNameTable.b);
                    }
                }
                setUnknownFields(getUnknownFields().concat(qualifiedNameTable.a));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                QualifiedNameTable qualifiedNameTable = null;
                try {
                    try {
                        QualifiedNameTable partialFrom = QualifiedNameTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        QualifiedNameTable qualifiedNameTable2 = (QualifiedNameTable) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            qualifiedNameTable = qualifiedNameTable2;
                            if (qualifiedNameTable != null) {
                                mergeFrom(qualifiedNameTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (qualifiedNameTable != null) {
                        mergeFrom(qualifiedNameTable);
                    }
                    throw th;
                }
            }
        }

        public static final class QualifiedName extends GeneratedMessageLite implements QualifiedNameOrBuilder {
            public static Parser<QualifiedName> PARSER = new a();
            private static final QualifiedName h;
            private final ByteString a;
            private int b;
            private int c;
            private int d;
            private Kind e;
            private byte f;
            private int g;

            public static final class Builder extends GeneratedMessageLite.Builder<QualifiedName, Builder> implements QualifiedNameOrBuilder {
                private int b;
                private int d;
                private int c = -1;
                private Kind e = Kind.PACKAGE;

                private Builder() {
                    c();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static Builder b() {
                    return new Builder();
                }

                private void c() {
                }

                public QualifiedName buildPartial() {
                    QualifiedName qualifiedName = new QualifiedName(this);
                    int i = this.b;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    qualifiedName.c = this.c;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    qualifiedName.d = this.d;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    qualifiedName.e = this.e;
                    qualifiedName.b = i2;
                    return qualifiedName;
                }

                public boolean hasShortName() {
                    return (this.b & 2) == 2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasShortName();
                }

                public Builder setKind(Kind kind) {
                    Objects.requireNonNull(kind);
                    this.b |= 4;
                    this.e = kind;
                    return this;
                }

                public Builder setParentQualifiedName(int i) {
                    this.b |= 1;
                    this.c = i;
                    return this;
                }

                public Builder setShortName(int i) {
                    this.b |= 2;
                    this.d = i;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public QualifiedName build() {
                    QualifiedName qualifiedNameBuildPartial = buildPartial();
                    if (qualifiedNameBuildPartial.isInitialized()) {
                        return qualifiedNameBuildPartial;
                    }
                    throw AbstractMessageLite.Builder.newUninitializedMessageException(qualifiedNameBuildPartial);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public QualifiedName getDefaultInstanceForType() {
                    return QualifiedName.getDefaultInstance();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo4297clone() {
                    return b().mergeFrom(buildPartial());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public Builder mergeFrom(QualifiedName qualifiedName) {
                    if (qualifiedName == QualifiedName.getDefaultInstance()) {
                        return this;
                    }
                    if (qualifiedName.hasParentQualifiedName()) {
                        setParentQualifiedName(qualifiedName.getParentQualifiedName());
                    }
                    if (qualifiedName.hasShortName()) {
                        setShortName(qualifiedName.getShortName());
                    }
                    if (qualifiedName.hasKind()) {
                        setKind(qualifiedName.getKind());
                    }
                    setUnknownFields(getUnknownFields().concat(qualifiedName.a));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    QualifiedName qualifiedName = null;
                    try {
                        try {
                            QualifiedName partialFrom = QualifiedName.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (partialFrom != null) {
                                mergeFrom(partialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            QualifiedName qualifiedName2 = (QualifiedName) e.getUnfinishedMessage();
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                qualifiedName = qualifiedName2;
                                if (qualifiedName != null) {
                                    mergeFrom(qualifiedName);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (qualifiedName != null) {
                            mergeFrom(qualifiedName);
                        }
                        throw th;
                    }
                }
            }

            public enum Kind implements Internal.EnumLite {
                CLASS(0, 0),
                PACKAGE(1, 1),
                LOCAL(2, 2);

                private static Internal.EnumLiteMap<Kind> internalValueMap = new a();
                private final int value;

                public static class a implements Internal.EnumLiteMap<Kind> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Kind findValueByNumber(int i) {
                        return Kind.valueOf(i);
                    }
                }

                Kind(int i, int i2) {
                    this.value = i2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.value;
                }

                public static Kind valueOf(int i) {
                    if (i == 0) {
                        return CLASS;
                    }
                    if (i == 1) {
                        return PACKAGE;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return LOCAL;
                }
            }

            public static class a extends AbstractParser<QualifiedName> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public QualifiedName parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new QualifiedName(codedInputStream, extensionRegistryLite);
                }
            }

            static {
                QualifiedName qualifiedName = new QualifiedName(true);
                h = qualifiedName;
                qualifiedName.m();
            }

            public static QualifiedName getDefaultInstance() {
                return h;
            }

            private void m() {
                this.c = -1;
                this.d = 0;
                this.e = Kind.PACKAGE;
            }

            public static Builder newBuilder() {
                return Builder.b();
            }

            public Kind getKind() {
                return this.e;
            }

            public int getParentQualifiedName() {
                return this.c;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<QualifiedName> getParserForType() {
                return PARSER;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.g;
                if (i != -1) {
                    return i;
                }
                int iComputeInt32Size = (this.b & 1) == 1 ? 0 + CodedOutputStream.computeInt32Size(1, this.c) : 0;
                if ((this.b & 2) == 2) {
                    iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.d);
                }
                if ((this.b & 4) == 4) {
                    iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.e.getNumber());
                }
                int size = iComputeInt32Size + this.a.size();
                this.g = size;
                return size;
            }

            public int getShortName() {
                return this.d;
            }

            public boolean hasKind() {
                return (this.b & 4) == 4;
            }

            public boolean hasParentQualifiedName() {
                return (this.b & 1) == 1;
            }

            public boolean hasShortName() {
                return (this.b & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.f;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (hasShortName()) {
                    this.f = (byte) 1;
                    return true;
                }
                this.f = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.b & 1) == 1) {
                    codedOutputStream.writeInt32(1, this.c);
                }
                if ((this.b & 2) == 2) {
                    codedOutputStream.writeInt32(2, this.d);
                }
                if ((this.b & 4) == 4) {
                    codedOutputStream.writeEnum(3, this.e.getNumber());
                }
                codedOutputStream.writeRawBytes(this.a);
            }

            public static Builder newBuilder(QualifiedName qualifiedName) {
                return newBuilder().mergeFrom(qualifiedName);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public QualifiedName getDefaultInstanceForType() {
                return h;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder newBuilderForType() {
                return newBuilder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder toBuilder() {
                return newBuilder(this);
            }

            private QualifiedName(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.f = (byte) -1;
                this.g = -1;
                this.a = builder.getUnknownFields();
            }

            private QualifiedName(boolean z) {
                this.f = (byte) -1;
                this.g = -1;
                this.a = ByteString.EMPTY;
            }

            private QualifiedName(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this.f = (byte) -1;
                this.g = -1;
                m();
                ByteString.Output outputNewOutput = ByteString.newOutput();
                CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.b |= 1;
                                    this.c = codedInputStream.readInt32();
                                } else if (tag == 16) {
                                    this.b |= 2;
                                    this.d = codedInputStream.readInt32();
                                } else if (tag != 24) {
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int i = codedInputStream.readEnum();
                                    Kind kindValueOf = Kind.valueOf(i);
                                    if (kindValueOf == null) {
                                        codedOutputStreamNewInstance.writeRawVarint32(tag);
                                        codedOutputStreamNewInstance.writeRawVarint32(i);
                                    } else {
                                        this.b |= 4;
                                        this.e = kindValueOf;
                                    }
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.a = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                try {
                    codedOutputStreamNewInstance.flush();
                } catch (IOException unused2) {
                } finally {
                    this.a = outputNewOutput.toByteString();
                }
                makeExtensionsImmutable();
            }
        }

        public interface QualifiedNameOrBuilder extends MessageLiteOrBuilder {
        }

        public static class a extends AbstractParser<QualifiedNameTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public QualifiedNameTable parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new QualifiedNameTable(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            QualifiedNameTable qualifiedNameTable = new QualifiedNameTable(true);
            e = qualifiedNameTable;
            qualifiedNameTable.j();
        }

        public static QualifiedNameTable getDefaultInstance() {
            return e;
        }

        private void j() {
            this.b = Collections.emptyList();
        }

        public static Builder newBuilder() {
            return Builder.b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<QualifiedNameTable> getParserForType() {
            return PARSER;
        }

        public QualifiedName getQualifiedName(int i) {
            return this.b.get(i);
        }

        public int getQualifiedNameCount() {
            return this.b.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.d;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = 0;
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.b.get(i2));
            }
            int size = iComputeMessageSize + this.a.size();
            this.d = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.c;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getQualifiedNameCount(); i++) {
                if (!getQualifiedName(i).isInitialized()) {
                    this.c = (byte) 0;
                    return false;
                }
            }
            this.c = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.b.size(); i++) {
                codedOutputStream.writeMessage(1, this.b.get(i));
            }
            codedOutputStream.writeRawBytes(this.a);
        }

        public static Builder newBuilder(QualifiedNameTable qualifiedNameTable) {
            return newBuilder().mergeFrom(qualifiedNameTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public QualifiedNameTable getDefaultInstanceForType() {
            return e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private QualifiedNameTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.c = (byte) -1;
            this.d = -1;
            this.a = builder.getUnknownFields();
        }

        private QualifiedNameTable(boolean z) {
            this.c = (byte) -1;
            this.d = -1;
            this.a = ByteString.EMPTY;
        }

        private QualifiedNameTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.c = (byte) -1;
            this.d = -1;
            j();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 10) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.b = new ArrayList();
                                    z2 |= true;
                                }
                                this.b.add((QualifiedName) codedInputStream.readMessage(QualifiedName.PARSER, extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if (z2 & true) {
                            this.b = Collections.unmodifiableList(this.b);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.a = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (z2 & true) {
                this.b = Collections.unmodifiableList(this.b);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.a = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface QualifiedNameTableOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class StringTable extends GeneratedMessageLite implements StringTableOrBuilder {
        public static Parser<StringTable> PARSER = new a();
        private static final StringTable e;
        private final ByteString a;
        private LazyStringList b;
        private byte c;
        private int d;

        public static final class Builder extends GeneratedMessageLite.Builder<StringTable, Builder> implements StringTableOrBuilder {
            private int b;
            private LazyStringList c = LazyStringArrayList.EMPTY;

            private Builder() {
                d();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder b() {
                return new Builder();
            }

            private void c() {
                if ((this.b & 1) != 1) {
                    this.c = new LazyStringArrayList(this.c);
                    this.b |= 1;
                }
            }

            private void d() {
            }

            public StringTable buildPartial() {
                StringTable stringTable = new StringTable(this);
                if ((this.b & 1) == 1) {
                    this.c = this.c.getUnmodifiableView();
                    this.b &= -2;
                }
                stringTable.b = this.c;
                return stringTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public StringTable build() {
                StringTable stringTableBuildPartial = buildPartial();
                if (stringTableBuildPartial.isInitialized()) {
                    return stringTableBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(stringTableBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public StringTable getDefaultInstanceForType() {
                return StringTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4297clone() {
                return b().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(StringTable stringTable) {
                if (stringTable == StringTable.getDefaultInstance()) {
                    return this;
                }
                if (!stringTable.b.isEmpty()) {
                    if (this.c.isEmpty()) {
                        this.c = stringTable.b;
                        this.b &= -2;
                    } else {
                        c();
                        this.c.addAll(stringTable.b);
                    }
                }
                setUnknownFields(getUnknownFields().concat(stringTable.a));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                StringTable stringTable = null;
                try {
                    try {
                        StringTable partialFrom = StringTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        StringTable stringTable2 = (StringTable) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            stringTable = stringTable2;
                            if (stringTable != null) {
                                mergeFrom(stringTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (stringTable != null) {
                        mergeFrom(stringTable);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<StringTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public StringTable parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new StringTable(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            StringTable stringTable = new StringTable(true);
            e = stringTable;
            stringTable.j();
        }

        public static StringTable getDefaultInstance() {
            return e;
        }

        private void j() {
            this.b = LazyStringArrayList.EMPTY;
        }

        public static Builder newBuilder() {
            return Builder.b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<StringTable> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.d;
            if (i != -1) {
                return i;
            }
            int iComputeBytesSizeNoTag = 0;
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                iComputeBytesSizeNoTag += CodedOutputStream.computeBytesSizeNoTag(this.b.getByteString(i2));
            }
            int size = 0 + iComputeBytesSizeNoTag + (getStringList().size() * 1) + this.a.size();
            this.d = size;
            return size;
        }

        public String getString(int i) {
            return this.b.get(i);
        }

        public ProtocolStringList getStringList() {
            return this.b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.c;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.c = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.b.size(); i++) {
                codedOutputStream.writeBytes(1, this.b.getByteString(i));
            }
            codedOutputStream.writeRawBytes(this.a);
        }

        public static Builder newBuilder(StringTable stringTable) {
            return newBuilder().mergeFrom(stringTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public StringTable getDefaultInstanceForType() {
            return e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private StringTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.c = (byte) -1;
            this.d = -1;
            this.a = builder.getUnknownFields();
        }

        private StringTable(boolean z) {
            this.c = (byte) -1;
            this.d = -1;
            this.a = ByteString.EMPTY;
        }

        private StringTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.c = (byte) -1;
            this.d = -1;
            j();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag != 10) {
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    ByteString bytes = codedInputStream.readBytes();
                                    if (!(z2 & true)) {
                                        this.b = new LazyStringArrayList();
                                        z2 |= true;
                                    }
                                    this.b.add(bytes);
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e2) {
                            throw e2.setUnfinishedMessage(this);
                        }
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.b = this.b.getUnmodifiableView();
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.a = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.b = this.b.getUnmodifiableView();
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.a = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface StringTableOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Type extends GeneratedMessageLite.ExtendableMessage<Type> implements TypeOrBuilder {
        public static Parser<Type> PARSER = new a();
        private static final Type t;
        private final ByteString b;
        private int c;
        private List<Argument> d;
        private boolean e;
        private int f;
        private Type g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private Type m;
        private int n;
        private Type o;
        private int p;
        private int q;
        private byte r;
        private int s;

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {
            public static Parser<Argument> PARSER = new a();
            private static final Argument h;
            private final ByteString a;
            private int b;
            private Projection c;
            private Type d;
            private int e;
            private byte f;
            private int g;

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {
                private int b;
                private Projection c = Projection.INV;
                private Type d = Type.getDefaultInstance();
                private int e;

                private Builder() {
                    c();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static Builder b() {
                    return new Builder();
                }

                private void c() {
                }

                public Argument buildPartial() {
                    Argument argument = new Argument(this);
                    int i = this.b;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    argument.c = this.c;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    argument.d = this.d;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    argument.e = this.e;
                    argument.b = i2;
                    return argument;
                }

                public Type getType() {
                    return this.d;
                }

                public boolean hasType() {
                    return (this.b & 2) == 2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return !hasType() || getType().isInitialized();
                }

                public Builder mergeType(Type type) {
                    if ((this.b & 2) != 2 || this.d == Type.getDefaultInstance()) {
                        this.d = type;
                    } else {
                        this.d = Type.newBuilder(this.d).mergeFrom(type).buildPartial();
                    }
                    this.b |= 2;
                    return this;
                }

                public Builder setProjection(Projection projection) {
                    Objects.requireNonNull(projection);
                    this.b |= 1;
                    this.c = projection;
                    return this;
                }

                public Builder setTypeId(int i) {
                    this.b |= 4;
                    this.e = i;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Argument build() {
                    Argument argumentBuildPartial = buildPartial();
                    if (argumentBuildPartial.isInitialized()) {
                        return argumentBuildPartial;
                    }
                    throw AbstractMessageLite.Builder.newUninitializedMessageException(argumentBuildPartial);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public Argument getDefaultInstanceForType() {
                    return Argument.getDefaultInstance();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo4297clone() {
                    return b().mergeFrom(buildPartial());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public Builder mergeFrom(Argument argument) {
                    if (argument == Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (argument.hasProjection()) {
                        setProjection(argument.getProjection());
                    }
                    if (argument.hasType()) {
                        mergeType(argument.getType());
                    }
                    if (argument.hasTypeId()) {
                        setTypeId(argument.getTypeId());
                    }
                    setUnknownFields(getUnknownFields().concat(argument.a));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Argument argument = null;
                    try {
                        try {
                            Argument partialFrom = Argument.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (partialFrom != null) {
                                mergeFrom(partialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e) {
                            Argument argument2 = (Argument) e.getUnfinishedMessage();
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                argument = argument2;
                                if (argument != null) {
                                    mergeFrom(argument);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (argument != null) {
                            mergeFrom(argument);
                        }
                        throw th;
                    }
                }
            }

            public enum Projection implements Internal.EnumLite {
                IN(0, 0),
                OUT(1, 1),
                INV(2, 2),
                STAR(3, 3);

                private static Internal.EnumLiteMap<Projection> internalValueMap = new a();
                private final int value;

                public static class a implements Internal.EnumLiteMap<Projection> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Projection findValueByNumber(int i) {
                        return Projection.valueOf(i);
                    }
                }

                Projection(int i, int i2) {
                    this.value = i2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.value;
                }

                public static Projection valueOf(int i) {
                    if (i == 0) {
                        return IN;
                    }
                    if (i == 1) {
                        return OUT;
                    }
                    if (i == 2) {
                        return INV;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return STAR;
                }
            }

            public static class a extends AbstractParser<Argument> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public Argument parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Argument(codedInputStream, extensionRegistryLite);
                }
            }

            static {
                Argument argument = new Argument(true);
                h = argument;
                argument.m();
            }

            public static Argument getDefaultInstance() {
                return h;
            }

            private void m() {
                this.c = Projection.INV;
                this.d = Type.getDefaultInstance();
                this.e = 0;
            }

            public static Builder newBuilder() {
                return Builder.b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<Argument> getParserForType() {
                return PARSER;
            }

            public Projection getProjection() {
                return this.c;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.g;
                if (i != -1) {
                    return i;
                }
                int iComputeEnumSize = (this.b & 1) == 1 ? 0 + CodedOutputStream.computeEnumSize(1, this.c.getNumber()) : 0;
                if ((this.b & 2) == 2) {
                    iComputeEnumSize += CodedOutputStream.computeMessageSize(2, this.d);
                }
                if ((this.b & 4) == 4) {
                    iComputeEnumSize += CodedOutputStream.computeInt32Size(3, this.e);
                }
                int size = iComputeEnumSize + this.a.size();
                this.g = size;
                return size;
            }

            public Type getType() {
                return this.d;
            }

            public int getTypeId() {
                return this.e;
            }

            public boolean hasProjection() {
                return (this.b & 1) == 1;
            }

            public boolean hasType() {
                return (this.b & 2) == 2;
            }

            public boolean hasTypeId() {
                return (this.b & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.f;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!hasType() || getType().isInitialized()) {
                    this.f = (byte) 1;
                    return true;
                }
                this.f = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.b & 1) == 1) {
                    codedOutputStream.writeEnum(1, this.c.getNumber());
                }
                if ((this.b & 2) == 2) {
                    codedOutputStream.writeMessage(2, this.d);
                }
                if ((this.b & 4) == 4) {
                    codedOutputStream.writeInt32(3, this.e);
                }
                codedOutputStream.writeRawBytes(this.a);
            }

            public static Builder newBuilder(Argument argument) {
                return newBuilder().mergeFrom(argument);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Argument getDefaultInstanceForType() {
                return h;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder newBuilderForType() {
                return newBuilder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder toBuilder() {
                return newBuilder(this);
            }

            private Argument(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.f = (byte) -1;
                this.g = -1;
                this.a = builder.getUnknownFields();
            }

            private Argument(boolean z) {
                this.f = (byte) -1;
                this.g = -1;
                this.a = ByteString.EMPTY;
            }

            private Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this.f = (byte) -1;
                this.g = -1;
                m();
                ByteString.Output outputNewOutput = ByteString.newOutput();
                CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 8) {
                                        int i = codedInputStream.readEnum();
                                        Projection projectionValueOf = Projection.valueOf(i);
                                        if (projectionValueOf == null) {
                                            codedOutputStreamNewInstance.writeRawVarint32(tag);
                                            codedOutputStreamNewInstance.writeRawVarint32(i);
                                        } else {
                                            this.b |= 1;
                                            this.c = projectionValueOf;
                                        }
                                    } else if (tag == 18) {
                                        Builder builder = (this.b & 2) == 2 ? this.d.toBuilder() : null;
                                        Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                        this.d = type;
                                        if (builder != null) {
                                            builder.mergeFrom(type);
                                            this.d = builder.buildPartial();
                                        }
                                        this.b |= 2;
                                    } else if (tag != 24) {
                                        if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        this.b |= 4;
                                        this.e = codedInputStream.readInt32();
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e) {
                                throw e.setUnfinishedMessage(this);
                            }
                        } catch (IOException e2) {
                            throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.a = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                try {
                    codedOutputStreamNewInstance.flush();
                } catch (IOException unused2) {
                } finally {
                    this.a = outputNewOutput.toByteString();
                }
                makeExtensionsImmutable();
            }
        }

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Type, Builder> implements TypeOrBuilder {
            private int d;
            private boolean f;
            private int g;
            private int i;
            private int j;
            private int k;
            private int l;
            private int m;
            private int o;
            private int q;
            private int r;
            private List<Argument> e = Collections.emptyList();
            private Type h = Type.getDefaultInstance();
            private Type n = Type.getDefaultInstance();
            private Type p = Type.getDefaultInstance();

            private Builder() {
                g();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder e() {
                return new Builder();
            }

            private void f() {
                if ((this.d & 1) != 1) {
                    this.e = new ArrayList(this.e);
                    this.d |= 1;
                }
            }

            private void g() {
            }

            public Type buildPartial() {
                Type type = new Type(this);
                int i = this.d;
                if ((i & 1) == 1) {
                    this.e = Collections.unmodifiableList(this.e);
                    this.d &= -2;
                }
                type.d = this.e;
                int i2 = (i & 2) != 2 ? 0 : 1;
                type.e = this.f;
                if ((i & 4) == 4) {
                    i2 |= 2;
                }
                type.f = this.g;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                type.g = this.h;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                type.h = this.i;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                type.i = this.j;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                type.j = this.k;
                if ((i & 128) == 128) {
                    i2 |= 64;
                }
                type.k = this.l;
                if ((i & 256) == 256) {
                    i2 |= 128;
                }
                type.l = this.m;
                if ((i & 512) == 512) {
                    i2 |= 256;
                }
                type.m = this.n;
                if ((i & 1024) == 1024) {
                    i2 |= 512;
                }
                type.n = this.o;
                if ((i & 2048) == 2048) {
                    i2 |= 1024;
                }
                type.o = this.p;
                if ((i & 4096) == 4096) {
                    i2 |= 2048;
                }
                type.p = this.q;
                if ((i & 8192) == 8192) {
                    i2 |= 4096;
                }
                type.q = this.r;
                type.c = i2;
                return type;
            }

            public Type getAbbreviatedType() {
                return this.p;
            }

            public Argument getArgument(int i) {
                return this.e.get(i);
            }

            public int getArgumentCount() {
                return this.e.size();
            }

            public Type getFlexibleUpperBound() {
                return this.h;
            }

            public Type getOuterType() {
                return this.n;
            }

            public boolean hasAbbreviatedType() {
                return (this.d & 2048) == 2048;
            }

            public boolean hasFlexibleUpperBound() {
                return (this.d & 8) == 8;
            }

            public boolean hasOuterType() {
                return (this.d & 512) == 512;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getArgumentCount(); i++) {
                    if (!getArgument(i).isInitialized()) {
                        return false;
                    }
                }
                if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
                    return false;
                }
                if (!hasOuterType() || getOuterType().isInitialized()) {
                    return (!hasAbbreviatedType() || getAbbreviatedType().isInitialized()) && extensionsAreInitialized();
                }
                return false;
            }

            public Builder mergeAbbreviatedType(Type type) {
                if ((this.d & 2048) != 2048 || this.p == Type.getDefaultInstance()) {
                    this.p = type;
                } else {
                    this.p = Type.newBuilder(this.p).mergeFrom(type).buildPartial();
                }
                this.d |= 2048;
                return this;
            }

            public Builder mergeFlexibleUpperBound(Type type) {
                if ((this.d & 8) != 8 || this.h == Type.getDefaultInstance()) {
                    this.h = type;
                } else {
                    this.h = Type.newBuilder(this.h).mergeFrom(type).buildPartial();
                }
                this.d |= 8;
                return this;
            }

            public Builder mergeOuterType(Type type) {
                if ((this.d & 512) != 512 || this.n == Type.getDefaultInstance()) {
                    this.n = type;
                } else {
                    this.n = Type.newBuilder(this.n).mergeFrom(type).buildPartial();
                }
                this.d |= 512;
                return this;
            }

            public Builder setAbbreviatedTypeId(int i) {
                this.d |= 4096;
                this.q = i;
                return this;
            }

            public Builder setClassName(int i) {
                this.d |= 32;
                this.j = i;
                return this;
            }

            public Builder setFlags(int i) {
                this.d |= 8192;
                this.r = i;
                return this;
            }

            public Builder setFlexibleTypeCapabilitiesId(int i) {
                this.d |= 4;
                this.g = i;
                return this;
            }

            public Builder setFlexibleUpperBoundId(int i) {
                this.d |= 16;
                this.i = i;
                return this;
            }

            public Builder setNullable(boolean z) {
                this.d |= 2;
                this.f = z;
                return this;
            }

            public Builder setOuterTypeId(int i) {
                this.d |= 1024;
                this.o = i;
                return this;
            }

            public Builder setTypeAliasName(int i) {
                this.d |= 256;
                this.m = i;
                return this;
            }

            public Builder setTypeParameter(int i) {
                this.d |= 64;
                this.k = i;
                return this;
            }

            public Builder setTypeParameterName(int i) {
                this.d |= 128;
                this.l = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Type build() {
                Type typeBuildPartial = buildPartial();
                if (typeBuildPartial.isInitialized()) {
                    return typeBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(typeBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Type getDefaultInstanceForType() {
                return Type.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Type type) {
                if (type == Type.getDefaultInstance()) {
                    return this;
                }
                if (!type.d.isEmpty()) {
                    if (this.e.isEmpty()) {
                        this.e = type.d;
                        this.d &= -2;
                    } else {
                        f();
                        this.e.addAll(type.d);
                    }
                }
                if (type.hasNullable()) {
                    setNullable(type.getNullable());
                }
                if (type.hasFlexibleTypeCapabilitiesId()) {
                    setFlexibleTypeCapabilitiesId(type.getFlexibleTypeCapabilitiesId());
                }
                if (type.hasFlexibleUpperBound()) {
                    mergeFlexibleUpperBound(type.getFlexibleUpperBound());
                }
                if (type.hasFlexibleUpperBoundId()) {
                    setFlexibleUpperBoundId(type.getFlexibleUpperBoundId());
                }
                if (type.hasClassName()) {
                    setClassName(type.getClassName());
                }
                if (type.hasTypeParameter()) {
                    setTypeParameter(type.getTypeParameter());
                }
                if (type.hasTypeParameterName()) {
                    setTypeParameterName(type.getTypeParameterName());
                }
                if (type.hasTypeAliasName()) {
                    setTypeAliasName(type.getTypeAliasName());
                }
                if (type.hasOuterType()) {
                    mergeOuterType(type.getOuterType());
                }
                if (type.hasOuterTypeId()) {
                    setOuterTypeId(type.getOuterTypeId());
                }
                if (type.hasAbbreviatedType()) {
                    mergeAbbreviatedType(type.getAbbreviatedType());
                }
                if (type.hasAbbreviatedTypeId()) {
                    setAbbreviatedTypeId(type.getAbbreviatedTypeId());
                }
                if (type.hasFlags()) {
                    setFlags(type.getFlags());
                }
                mergeExtensionFields(type);
                setUnknownFields(getUnknownFields().concat(type.b));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4297clone() {
                return e().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Type type = null;
                try {
                    try {
                        Type partialFrom = Type.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Type type2 = (Type) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            type = type2;
                            if (type != null) {
                                mergeFrom(type);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (type != null) {
                        mergeFrom(type);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<Type> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Type parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Type(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Type type = new Type(true);
            t = type;
            type.A();
        }

        private void A() {
            this.d = Collections.emptyList();
            this.e = false;
            this.f = 0;
            this.g = getDefaultInstance();
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.l = 0;
            this.m = getDefaultInstance();
            this.n = 0;
            this.o = getDefaultInstance();
            this.p = 0;
            this.q = 0;
        }

        public static Type getDefaultInstance() {
            return t;
        }

        public static Builder newBuilder() {
            return Builder.e();
        }

        public Type getAbbreviatedType() {
            return this.o;
        }

        public int getAbbreviatedTypeId() {
            return this.p;
        }

        public Argument getArgument(int i) {
            return this.d.get(i);
        }

        public int getArgumentCount() {
            return this.d.size();
        }

        public List<Argument> getArgumentList() {
            return this.d;
        }

        public int getClassName() {
            return this.i;
        }

        public int getFlags() {
            return this.q;
        }

        public int getFlexibleTypeCapabilitiesId() {
            return this.f;
        }

        public Type getFlexibleUpperBound() {
            return this.g;
        }

        public int getFlexibleUpperBoundId() {
            return this.h;
        }

        public boolean getNullable() {
            return this.e;
        }

        public Type getOuterType() {
            return this.m;
        }

        public int getOuterTypeId() {
            return this.n;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Type> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.s;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.c & 4096) == 4096 ? CodedOutputStream.computeInt32Size(1, this.q) + 0 : 0;
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(2, this.d.get(i2));
            }
            if ((this.c & 1) == 1) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(3, this.e);
            }
            if ((this.c & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(4, this.f);
            }
            if ((this.c & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(5, this.g);
            }
            if ((this.c & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(6, this.i);
            }
            if ((this.c & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(7, this.j);
            }
            if ((this.c & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(8, this.h);
            }
            if ((this.c & 64) == 64) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(9, this.k);
            }
            if ((this.c & 256) == 256) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(10, this.m);
            }
            if ((this.c & 512) == 512) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(11, this.n);
            }
            if ((this.c & 128) == 128) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(12, this.l);
            }
            if ((this.c & 1024) == 1024) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(13, this.o);
            }
            if ((this.c & 2048) == 2048) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(14, this.p);
            }
            int iExtensionsSerializedSize = iComputeInt32Size + extensionsSerializedSize() + this.b.size();
            this.s = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public int getTypeAliasName() {
            return this.l;
        }

        public int getTypeParameter() {
            return this.j;
        }

        public int getTypeParameterName() {
            return this.k;
        }

        public boolean hasAbbreviatedType() {
            return (this.c & 1024) == 1024;
        }

        public boolean hasAbbreviatedTypeId() {
            return (this.c & 2048) == 2048;
        }

        public boolean hasClassName() {
            return (this.c & 16) == 16;
        }

        public boolean hasFlags() {
            return (this.c & 4096) == 4096;
        }

        public boolean hasFlexibleTypeCapabilitiesId() {
            return (this.c & 2) == 2;
        }

        public boolean hasFlexibleUpperBound() {
            return (this.c & 4) == 4;
        }

        public boolean hasFlexibleUpperBoundId() {
            return (this.c & 8) == 8;
        }

        public boolean hasNullable() {
            return (this.c & 1) == 1;
        }

        public boolean hasOuterType() {
            return (this.c & 256) == 256;
        }

        public boolean hasOuterTypeId() {
            return (this.c & 512) == 512;
        }

        public boolean hasTypeAliasName() {
            return (this.c & 128) == 128;
        }

        public boolean hasTypeParameter() {
            return (this.c & 32) == 32;
        }

        public boolean hasTypeParameterName() {
            return (this.c & 64) == 64;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.r;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getArgumentCount(); i++) {
                if (!getArgument(i).isInitialized()) {
                    this.r = (byte) 0;
                    return false;
                }
            }
            if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
                this.r = (byte) 0;
                return false;
            }
            if (hasOuterType() && !getOuterType().isInitialized()) {
                this.r = (byte) 0;
                return false;
            }
            if (hasAbbreviatedType() && !getAbbreviatedType().isInitialized()) {
                this.r = (byte) 0;
                return false;
            }
            if (extensionsAreInitialized()) {
                this.r = (byte) 1;
                return true;
            }
            this.r = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.c & 4096) == 4096) {
                codedOutputStream.writeInt32(1, this.q);
            }
            for (int i = 0; i < this.d.size(); i++) {
                codedOutputStream.writeMessage(2, this.d.get(i));
            }
            if ((this.c & 1) == 1) {
                codedOutputStream.writeBool(3, this.e);
            }
            if ((this.c & 2) == 2) {
                codedOutputStream.writeInt32(4, this.f);
            }
            if ((this.c & 4) == 4) {
                codedOutputStream.writeMessage(5, this.g);
            }
            if ((this.c & 16) == 16) {
                codedOutputStream.writeInt32(6, this.i);
            }
            if ((this.c & 32) == 32) {
                codedOutputStream.writeInt32(7, this.j);
            }
            if ((this.c & 8) == 8) {
                codedOutputStream.writeInt32(8, this.h);
            }
            if ((this.c & 64) == 64) {
                codedOutputStream.writeInt32(9, this.k);
            }
            if ((this.c & 256) == 256) {
                codedOutputStream.writeMessage(10, this.m);
            }
            if ((this.c & 512) == 512) {
                codedOutputStream.writeInt32(11, this.n);
            }
            if ((this.c & 128) == 128) {
                codedOutputStream.writeInt32(12, this.l);
            }
            if ((this.c & 1024) == 1024) {
                codedOutputStream.writeMessage(13, this.o);
            }
            if ((this.c & 2048) == 2048) {
                codedOutputStream.writeInt32(14, this.p);
            }
            extensionWriterNewExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.b);
        }

        public static Builder newBuilder(Type type) {
            return newBuilder().mergeFrom(type);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Type getDefaultInstanceForType() {
            return t;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private Type(GeneratedMessageLite.ExtendableBuilder<Type, ?> extendableBuilder) {
            super(extendableBuilder);
            this.r = (byte) -1;
            this.s = -1;
            this.b = extendableBuilder.getUnknownFields();
        }

        private Type(boolean z) {
            this.r = (byte) -1;
            this.s = -1;
            this.b = ByteString.EMPTY;
        }

        private Type(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builder;
            this.r = (byte) -1;
            this.s = -1;
            A();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        switch (tag) {
                            case 0:
                                break;
                            case 8:
                                this.c |= 4096;
                                this.q = codedInputStream.readInt32();
                                continue;
                            case 18:
                                if (!(z2 & true)) {
                                    this.d = new ArrayList();
                                    z2 |= true;
                                }
                                this.d.add((Argument) codedInputStream.readMessage(Argument.PARSER, extensionRegistryLite));
                                continue;
                            case 24:
                                this.c |= 1;
                                this.e = codedInputStream.readBool();
                                continue;
                            case 32:
                                this.c |= 2;
                                this.f = codedInputStream.readInt32();
                                continue;
                            case 42:
                                builder = (this.c & 4) == 4 ? this.g.toBuilder() : null;
                                Type type = (Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                                this.g = type;
                                if (builder != null) {
                                    builder.mergeFrom(type);
                                    this.g = builder.buildPartial();
                                }
                                this.c |= 4;
                                continue;
                            case 48:
                                this.c |= 16;
                                this.i = codedInputStream.readInt32();
                                continue;
                            case 56:
                                this.c |= 32;
                                this.j = codedInputStream.readInt32();
                                continue;
                            case 64:
                                this.c |= 8;
                                this.h = codedInputStream.readInt32();
                                continue;
                            case 72:
                                this.c |= 64;
                                this.k = codedInputStream.readInt32();
                                continue;
                            case 82:
                                builder = (this.c & 256) == 256 ? this.m.toBuilder() : null;
                                Type type2 = (Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                                this.m = type2;
                                if (builder != null) {
                                    builder.mergeFrom(type2);
                                    this.m = builder.buildPartial();
                                }
                                this.c |= 256;
                                continue;
                            case 88:
                                this.c |= 512;
                                this.n = codedInputStream.readInt32();
                                continue;
                            case 96:
                                this.c |= 128;
                                this.l = codedInputStream.readInt32();
                                continue;
                            case 106:
                                builder = (this.c & 1024) == 1024 ? this.o.toBuilder() : null;
                                Type type3 = (Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                                this.o = type3;
                                if (builder != null) {
                                    builder.mergeFrom(type3);
                                    this.o = builder.buildPartial();
                                }
                                this.c |= 1024;
                                continue;
                            case 112:
                                this.c |= 2048;
                                this.p = codedInputStream.readInt32();
                                continue;
                            default:
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    break;
                                }
                                break;
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (z2 & true) {
                        this.d = Collections.unmodifiableList(this.d);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.b = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 & true) {
                this.d = Collections.unmodifiableList(this.d);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.b = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public static final class TypeAlias extends GeneratedMessageLite.ExtendableMessage<TypeAlias> implements TypeAliasOrBuilder {
        public static Parser<TypeAlias> PARSER = new a();
        private static final TypeAlias o;
        private final ByteString b;
        private int c;
        private int d;
        private int e;
        private List<TypeParameter> f;
        private Type g;
        private int h;
        private Type i;
        private int j;
        private List<Annotation> k;
        private List<Integer> l;
        private byte m;
        private int n;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeAlias, Builder> implements TypeAliasOrBuilder {
            private int d;
            private int f;
            private int i;
            private int k;
            private int e = 6;
            private List<TypeParameter> g = Collections.emptyList();
            private Type h = Type.getDefaultInstance();
            private Type j = Type.getDefaultInstance();
            private List<Annotation> l = Collections.emptyList();
            private List<Integer> m = Collections.emptyList();

            private Builder() {
                i();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder e() {
                return new Builder();
            }

            private void f() {
                if ((this.d & 128) != 128) {
                    this.l = new ArrayList(this.l);
                    this.d |= 128;
                }
            }

            private void g() {
                if ((this.d & 4) != 4) {
                    this.g = new ArrayList(this.g);
                    this.d |= 4;
                }
            }

            private void h() {
                if ((this.d & 256) != 256) {
                    this.m = new ArrayList(this.m);
                    this.d |= 256;
                }
            }

            private void i() {
            }

            public TypeAlias buildPartial() {
                TypeAlias typeAlias = new TypeAlias(this);
                int i = this.d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                typeAlias.d = this.e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                typeAlias.e = this.f;
                if ((this.d & 4) == 4) {
                    this.g = Collections.unmodifiableList(this.g);
                    this.d &= -5;
                }
                typeAlias.f = this.g;
                if ((i & 8) == 8) {
                    i2 |= 4;
                }
                typeAlias.g = this.h;
                if ((i & 16) == 16) {
                    i2 |= 8;
                }
                typeAlias.h = this.i;
                if ((i & 32) == 32) {
                    i2 |= 16;
                }
                typeAlias.i = this.j;
                if ((i & 64) == 64) {
                    i2 |= 32;
                }
                typeAlias.j = this.k;
                if ((this.d & 128) == 128) {
                    this.l = Collections.unmodifiableList(this.l);
                    this.d &= -129;
                }
                typeAlias.k = this.l;
                if ((this.d & 256) == 256) {
                    this.m = Collections.unmodifiableList(this.m);
                    this.d &= -257;
                }
                typeAlias.l = this.m;
                typeAlias.c = i2;
                return typeAlias;
            }

            public Annotation getAnnotation(int i) {
                return this.l.get(i);
            }

            public int getAnnotationCount() {
                return this.l.size();
            }

            public Type getExpandedType() {
                return this.j;
            }

            public TypeParameter getTypeParameter(int i) {
                return this.g.get(i);
            }

            public int getTypeParameterCount() {
                return this.g.size();
            }

            public Type getUnderlyingType() {
                return this.h;
            }

            public boolean hasExpandedType() {
                return (this.d & 32) == 32;
            }

            public boolean hasName() {
                return (this.d & 2) == 2;
            }

            public boolean hasUnderlyingType() {
                return (this.d & 8) == 8;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                for (int i = 0; i < getTypeParameterCount(); i++) {
                    if (!getTypeParameter(i).isInitialized()) {
                        return false;
                    }
                }
                if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
                    return false;
                }
                if (hasExpandedType() && !getExpandedType().isInitialized()) {
                    return false;
                }
                for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
                    if (!getAnnotation(i2).isInitialized()) {
                        return false;
                    }
                }
                return extensionsAreInitialized();
            }

            public Builder mergeExpandedType(Type type) {
                if ((this.d & 32) != 32 || this.j == Type.getDefaultInstance()) {
                    this.j = type;
                } else {
                    this.j = Type.newBuilder(this.j).mergeFrom(type).buildPartial();
                }
                this.d |= 32;
                return this;
            }

            public Builder mergeUnderlyingType(Type type) {
                if ((this.d & 8) != 8 || this.h == Type.getDefaultInstance()) {
                    this.h = type;
                } else {
                    this.h = Type.newBuilder(this.h).mergeFrom(type).buildPartial();
                }
                this.d |= 8;
                return this;
            }

            public Builder setExpandedTypeId(int i) {
                this.d |= 64;
                this.k = i;
                return this;
            }

            public Builder setFlags(int i) {
                this.d |= 1;
                this.e = i;
                return this;
            }

            public Builder setName(int i) {
                this.d |= 2;
                this.f = i;
                return this;
            }

            public Builder setUnderlyingTypeId(int i) {
                this.d |= 16;
                this.i = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public TypeAlias build() {
                TypeAlias typeAliasBuildPartial = buildPartial();
                if (typeAliasBuildPartial.isInitialized()) {
                    return typeAliasBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(typeAliasBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public TypeAlias getDefaultInstanceForType() {
                return TypeAlias.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(TypeAlias typeAlias) {
                if (typeAlias == TypeAlias.getDefaultInstance()) {
                    return this;
                }
                if (typeAlias.hasFlags()) {
                    setFlags(typeAlias.getFlags());
                }
                if (typeAlias.hasName()) {
                    setName(typeAlias.getName());
                }
                if (!typeAlias.f.isEmpty()) {
                    if (this.g.isEmpty()) {
                        this.g = typeAlias.f;
                        this.d &= -5;
                    } else {
                        g();
                        this.g.addAll(typeAlias.f);
                    }
                }
                if (typeAlias.hasUnderlyingType()) {
                    mergeUnderlyingType(typeAlias.getUnderlyingType());
                }
                if (typeAlias.hasUnderlyingTypeId()) {
                    setUnderlyingTypeId(typeAlias.getUnderlyingTypeId());
                }
                if (typeAlias.hasExpandedType()) {
                    mergeExpandedType(typeAlias.getExpandedType());
                }
                if (typeAlias.hasExpandedTypeId()) {
                    setExpandedTypeId(typeAlias.getExpandedTypeId());
                }
                if (!typeAlias.k.isEmpty()) {
                    if (this.l.isEmpty()) {
                        this.l = typeAlias.k;
                        this.d &= -129;
                    } else {
                        f();
                        this.l.addAll(typeAlias.k);
                    }
                }
                if (!typeAlias.l.isEmpty()) {
                    if (this.m.isEmpty()) {
                        this.m = typeAlias.l;
                        this.d &= -257;
                    } else {
                        h();
                        this.m.addAll(typeAlias.l);
                    }
                }
                mergeExtensionFields(typeAlias);
                setUnknownFields(getUnknownFields().concat(typeAlias.b));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4297clone() {
                return e().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TypeAlias typeAlias = null;
                try {
                    try {
                        TypeAlias partialFrom = TypeAlias.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        TypeAlias typeAlias2 = (TypeAlias) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            typeAlias = typeAlias2;
                            if (typeAlias != null) {
                                mergeFrom(typeAlias);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (typeAlias != null) {
                        mergeFrom(typeAlias);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<TypeAlias> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public TypeAlias parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TypeAlias(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            TypeAlias typeAlias = new TypeAlias(true);
            o = typeAlias;
            typeAlias.x();
        }

        public static TypeAlias getDefaultInstance() {
            return o;
        }

        public static Builder newBuilder() {
            return Builder.e();
        }

        public static TypeAlias parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        private void x() {
            this.d = 6;
            this.e = 0;
            this.f = Collections.emptyList();
            this.g = Type.getDefaultInstance();
            this.h = 0;
            this.i = Type.getDefaultInstance();
            this.j = 0;
            this.k = Collections.emptyList();
            this.l = Collections.emptyList();
        }

        public Annotation getAnnotation(int i) {
            return this.k.get(i);
        }

        public int getAnnotationCount() {
            return this.k.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.k;
        }

        public Type getExpandedType() {
            return this.i;
        }

        public int getExpandedTypeId() {
            return this.j;
        }

        public int getFlags() {
            return this.d;
        }

        public int getName() {
            return this.e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeAlias> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.n;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.c & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.d) + 0 : 0;
            if ((this.c & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.e);
            }
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, this.f.get(i2));
            }
            if ((this.c & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, this.g);
            }
            if ((this.c & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(5, this.h);
            }
            if ((this.c & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(6, this.i);
            }
            if ((this.c & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(7, this.j);
            }
            for (int i3 = 0; i3 < this.k.size(); i3++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(8, this.k.get(i3));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i4 = 0; i4 < this.l.size(); i4++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.l.get(i4).intValue());
            }
            int size = iComputeInt32Size + iComputeInt32SizeNoTag + (getVersionRequirementList().size() * 2) + extensionsSerializedSize() + this.b.size();
            this.n = size;
            return size;
        }

        public TypeParameter getTypeParameter(int i) {
            return this.f.get(i);
        }

        public int getTypeParameterCount() {
            return this.f.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.f;
        }

        public Type getUnderlyingType() {
            return this.g;
        }

        public int getUnderlyingTypeId() {
            return this.h;
        }

        public List<Integer> getVersionRequirementList() {
            return this.l;
        }

        public boolean hasExpandedType() {
            return (this.c & 16) == 16;
        }

        public boolean hasExpandedTypeId() {
            return (this.c & 32) == 32;
        }

        public boolean hasFlags() {
            return (this.c & 1) == 1;
        }

        public boolean hasName() {
            return (this.c & 2) == 2;
        }

        public boolean hasUnderlyingType() {
            return (this.c & 4) == 4;
        }

        public boolean hasUnderlyingTypeId() {
            return (this.c & 8) == 8;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.m;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.m = (byte) 0;
                return false;
            }
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.m = (byte) 0;
                    return false;
                }
            }
            if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
                this.m = (byte) 0;
                return false;
            }
            if (hasExpandedType() && !getExpandedType().isInitialized()) {
                this.m = (byte) 0;
                return false;
            }
            for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
                if (!getAnnotation(i2).isInitialized()) {
                    this.m = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.m = (byte) 1;
                return true;
            }
            this.m = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.c & 1) == 1) {
                codedOutputStream.writeInt32(1, this.d);
            }
            if ((this.c & 2) == 2) {
                codedOutputStream.writeInt32(2, this.e);
            }
            for (int i = 0; i < this.f.size(); i++) {
                codedOutputStream.writeMessage(3, this.f.get(i));
            }
            if ((this.c & 4) == 4) {
                codedOutputStream.writeMessage(4, this.g);
            }
            if ((this.c & 8) == 8) {
                codedOutputStream.writeInt32(5, this.h);
            }
            if ((this.c & 16) == 16) {
                codedOutputStream.writeMessage(6, this.i);
            }
            if ((this.c & 32) == 32) {
                codedOutputStream.writeInt32(7, this.j);
            }
            for (int i2 = 0; i2 < this.k.size(); i2++) {
                codedOutputStream.writeMessage(8, this.k.get(i2));
            }
            for (int i3 = 0; i3 < this.l.size(); i3++) {
                codedOutputStream.writeInt32(31, this.l.get(i3).intValue());
            }
            extensionWriterNewExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.b);
        }

        public static Builder newBuilder(TypeAlias typeAlias) {
            return newBuilder().mergeFrom(typeAlias);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public TypeAlias getDefaultInstanceForType() {
            return o;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private TypeAlias(GeneratedMessageLite.ExtendableBuilder<TypeAlias, ?> extendableBuilder) {
            super(extendableBuilder);
            this.m = (byte) -1;
            this.n = -1;
            this.b = extendableBuilder.getUnknownFields();
        }

        private TypeAlias(boolean z) {
            this.m = (byte) -1;
            this.n = -1;
            this.b = ByteString.EMPTY;
        }

        private TypeAlias(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Type.Builder builder;
            this.m = (byte) -1;
            this.n = -1;
            x();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            switch (tag) {
                                case 0:
                                    break;
                                case 8:
                                    this.c |= 1;
                                    this.d = codedInputStream.readInt32();
                                    continue;
                                case 16:
                                    this.c |= 2;
                                    this.e = codedInputStream.readInt32();
                                    continue;
                                case 26:
                                    if ((i & 4) != 4) {
                                        this.f = new ArrayList();
                                        i |= 4;
                                    }
                                    this.f.add((TypeParameter) codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                                    continue;
                                case 34:
                                    builder = (this.c & 4) == 4 ? this.g.toBuilder() : null;
                                    Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                    this.g = type;
                                    if (builder != null) {
                                        builder.mergeFrom(type);
                                        this.g = builder.buildPartial();
                                    }
                                    this.c |= 4;
                                    continue;
                                case 40:
                                    this.c |= 8;
                                    this.h = codedInputStream.readInt32();
                                    continue;
                                case 50:
                                    builder = (this.c & 16) == 16 ? this.i.toBuilder() : null;
                                    Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                    this.i = type2;
                                    if (builder != null) {
                                        builder.mergeFrom(type2);
                                        this.i = builder.buildPartial();
                                    }
                                    this.c |= 16;
                                    continue;
                                case 56:
                                    this.c |= 32;
                                    this.j = codedInputStream.readInt32();
                                    continue;
                                case 66:
                                    if ((i & 128) != 128) {
                                        this.k = new ArrayList();
                                        i |= 128;
                                    }
                                    this.k.add((Annotation) codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                                    continue;
                                case 248:
                                    if ((i & 256) != 256) {
                                        this.l = new ArrayList();
                                        i |= 256;
                                    }
                                    this.l.add(Integer.valueOf(codedInputStream.readInt32()));
                                    continue;
                                case 250:
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i & 256) != 256 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.l = new ArrayList();
                                        i |= 256;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.l.add(Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                    continue;
                                default:
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                        break;
                                    }
                                    break;
                            }
                            z = true;
                        } catch (IOException e) {
                            throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((i & 4) == 4) {
                        this.f = Collections.unmodifiableList(this.f);
                    }
                    if ((i & 128) == 128) {
                        this.k = Collections.unmodifiableList(this.k);
                    }
                    if ((i & 256) == 256) {
                        this.l = Collections.unmodifiableList(this.l);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.b = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 4) == 4) {
                this.f = Collections.unmodifiableList(this.f);
            }
            if ((i & 128) == 128) {
                this.k = Collections.unmodifiableList(this.k);
            }
            if ((i & 256) == 256) {
                this.l = Collections.unmodifiableList(this.l);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.b = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface TypeAliasOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class TypeParameter extends GeneratedMessageLite.ExtendableMessage<TypeParameter> implements TypeParameterOrBuilder {
        public static Parser<TypeParameter> PARSER = new a();
        private static final TypeParameter m;
        private final ByteString b;
        private int c;
        private int d;
        private int e;
        private boolean f;
        private Variance g;
        private List<Type> h;
        private List<Integer> i;
        private int j;
        private byte k;
        private int l;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeParameter, Builder> implements TypeParameterOrBuilder {
            private int d;
            private int e;
            private int f;
            private boolean g;
            private Variance h = Variance.INV;
            private List<Type> i = Collections.emptyList();
            private List<Integer> j = Collections.emptyList();

            private Builder() {
                h();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder e() {
                return new Builder();
            }

            private void f() {
                if ((this.d & 32) != 32) {
                    this.j = new ArrayList(this.j);
                    this.d |= 32;
                }
            }

            private void g() {
                if ((this.d & 16) != 16) {
                    this.i = new ArrayList(this.i);
                    this.d |= 16;
                }
            }

            private void h() {
            }

            public TypeParameter buildPartial() {
                TypeParameter typeParameter = new TypeParameter(this);
                int i = this.d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                typeParameter.d = this.e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                typeParameter.e = this.f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                typeParameter.f = this.g;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                typeParameter.g = this.h;
                if ((this.d & 16) == 16) {
                    this.i = Collections.unmodifiableList(this.i);
                    this.d &= -17;
                }
                typeParameter.h = this.i;
                if ((this.d & 32) == 32) {
                    this.j = Collections.unmodifiableList(this.j);
                    this.d &= -33;
                }
                typeParameter.i = this.j;
                typeParameter.c = i2;
                return typeParameter;
            }

            public Type getUpperBound(int i) {
                return this.i.get(i);
            }

            public int getUpperBoundCount() {
                return this.i.size();
            }

            public boolean hasId() {
                return (this.d & 1) == 1;
            }

            public boolean hasName() {
                return (this.d & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasId() || !hasName()) {
                    return false;
                }
                for (int i = 0; i < getUpperBoundCount(); i++) {
                    if (!getUpperBound(i).isInitialized()) {
                        return false;
                    }
                }
                return extensionsAreInitialized();
            }

            public Builder setId(int i) {
                this.d |= 1;
                this.e = i;
                return this;
            }

            public Builder setName(int i) {
                this.d |= 2;
                this.f = i;
                return this;
            }

            public Builder setReified(boolean z) {
                this.d |= 4;
                this.g = z;
                return this;
            }

            public Builder setVariance(Variance variance) {
                Objects.requireNonNull(variance);
                this.d |= 8;
                this.h = variance;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public TypeParameter build() {
                TypeParameter typeParameterBuildPartial = buildPartial();
                if (typeParameterBuildPartial.isInitialized()) {
                    return typeParameterBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(typeParameterBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public TypeParameter getDefaultInstanceForType() {
                return TypeParameter.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(TypeParameter typeParameter) {
                if (typeParameter == TypeParameter.getDefaultInstance()) {
                    return this;
                }
                if (typeParameter.hasId()) {
                    setId(typeParameter.getId());
                }
                if (typeParameter.hasName()) {
                    setName(typeParameter.getName());
                }
                if (typeParameter.hasReified()) {
                    setReified(typeParameter.getReified());
                }
                if (typeParameter.hasVariance()) {
                    setVariance(typeParameter.getVariance());
                }
                if (!typeParameter.h.isEmpty()) {
                    if (this.i.isEmpty()) {
                        this.i = typeParameter.h;
                        this.d &= -17;
                    } else {
                        g();
                        this.i.addAll(typeParameter.h);
                    }
                }
                if (!typeParameter.i.isEmpty()) {
                    if (this.j.isEmpty()) {
                        this.j = typeParameter.i;
                        this.d &= -33;
                    } else {
                        f();
                        this.j.addAll(typeParameter.i);
                    }
                }
                mergeExtensionFields(typeParameter);
                setUnknownFields(getUnknownFields().concat(typeParameter.b));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4297clone() {
                return e().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TypeParameter typeParameter = null;
                try {
                    try {
                        TypeParameter partialFrom = TypeParameter.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        TypeParameter typeParameter2 = (TypeParameter) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            typeParameter = typeParameter2;
                            if (typeParameter != null) {
                                mergeFrom(typeParameter);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (typeParameter != null) {
                        mergeFrom(typeParameter);
                    }
                    throw th;
                }
            }
        }

        public enum Variance implements Internal.EnumLite {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2);

            private static Internal.EnumLiteMap<Variance> internalValueMap = new a();
            private final int value;

            public static class a implements Internal.EnumLiteMap<Variance> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Variance findValueByNumber(int i) {
                    return Variance.valueOf(i);
                }
            }

            Variance(int i, int i2) {
                this.value = i2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static Variance valueOf(int i) {
                if (i == 0) {
                    return IN;
                }
                if (i == 1) {
                    return OUT;
                }
                if (i != 2) {
                    return null;
                }
                return INV;
            }
        }

        public static class a extends AbstractParser<TypeParameter> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public TypeParameter parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TypeParameter(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            TypeParameter typeParameter = new TypeParameter(true);
            m = typeParameter;
            typeParameter.t();
        }

        public static TypeParameter getDefaultInstance() {
            return m;
        }

        public static Builder newBuilder() {
            return Builder.e();
        }

        private void t() {
            this.d = 0;
            this.e = 0;
            this.f = false;
            this.g = Variance.INV;
            this.h = Collections.emptyList();
            this.i = Collections.emptyList();
        }

        public int getId() {
            return this.d;
        }

        public int getName() {
            return this.e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeParameter> getParserForType() {
            return PARSER;
        }

        public boolean getReified() {
            return this.f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.l;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.c & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.d) + 0 : 0;
            if ((this.c & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.e);
            }
            if ((this.c & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(3, this.f);
            }
            if ((this.c & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(4, this.g.getNumber());
            }
            for (int i2 = 0; i2 < this.h.size(); i2++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(5, this.h.get(i2));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.i.get(i3).intValue());
            }
            int iComputeInt32SizeNoTag2 = iComputeInt32Size + iComputeInt32SizeNoTag;
            if (!getUpperBoundIdList().isEmpty()) {
                iComputeInt32SizeNoTag2 = iComputeInt32SizeNoTag2 + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
            }
            this.j = iComputeInt32SizeNoTag;
            int iExtensionsSerializedSize = iComputeInt32SizeNoTag2 + extensionsSerializedSize() + this.b.size();
            this.l = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public Type getUpperBound(int i) {
            return this.h.get(i);
        }

        public int getUpperBoundCount() {
            return this.h.size();
        }

        public List<Integer> getUpperBoundIdList() {
            return this.i;
        }

        public List<Type> getUpperBoundList() {
            return this.h;
        }

        public Variance getVariance() {
            return this.g;
        }

        public boolean hasId() {
            return (this.c & 1) == 1;
        }

        public boolean hasName() {
            return (this.c & 2) == 2;
        }

        public boolean hasReified() {
            return (this.c & 4) == 4;
        }

        public boolean hasVariance() {
            return (this.c & 8) == 8;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.k;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasId()) {
                this.k = (byte) 0;
                return false;
            }
            if (!hasName()) {
                this.k = (byte) 0;
                return false;
            }
            for (int i = 0; i < getUpperBoundCount(); i++) {
                if (!getUpperBound(i).isInitialized()) {
                    this.k = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.k = (byte) 1;
                return true;
            }
            this.k = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.c & 1) == 1) {
                codedOutputStream.writeInt32(1, this.d);
            }
            if ((this.c & 2) == 2) {
                codedOutputStream.writeInt32(2, this.e);
            }
            if ((this.c & 4) == 4) {
                codedOutputStream.writeBool(3, this.f);
            }
            if ((this.c & 8) == 8) {
                codedOutputStream.writeEnum(4, this.g.getNumber());
            }
            for (int i = 0; i < this.h.size(); i++) {
                codedOutputStream.writeMessage(5, this.h.get(i));
            }
            if (getUpperBoundIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(50);
                codedOutputStream.writeRawVarint32(this.j);
            }
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                codedOutputStream.writeInt32NoTag(this.i.get(i2).intValue());
            }
            extensionWriterNewExtensionWriter.writeUntil(1000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.b);
        }

        public static Builder newBuilder(TypeParameter typeParameter) {
            return newBuilder().mergeFrom(typeParameter);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public TypeParameter getDefaultInstanceForType() {
            return m;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private TypeParameter(GeneratedMessageLite.ExtendableBuilder<TypeParameter, ?> extendableBuilder) {
            super(extendableBuilder);
            this.j = -1;
            this.k = (byte) -1;
            this.l = -1;
            this.b = extendableBuilder.getUnknownFields();
        }

        private TypeParameter(boolean z) {
            this.j = -1;
            this.k = (byte) -1;
            this.l = -1;
            this.b = ByteString.EMPTY;
        }

        private TypeParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.j = -1;
            this.k = (byte) -1;
            this.l = -1;
            t();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.c |= 1;
                                    this.d = codedInputStream.readInt32();
                                } else if (tag == 16) {
                                    this.c |= 2;
                                    this.e = codedInputStream.readInt32();
                                } else if (tag == 24) {
                                    this.c |= 4;
                                    this.f = codedInputStream.readBool();
                                } else if (tag == 32) {
                                    int i2 = codedInputStream.readEnum();
                                    Variance varianceValueOf = Variance.valueOf(i2);
                                    if (varianceValueOf == null) {
                                        codedOutputStreamNewInstance.writeRawVarint32(tag);
                                        codedOutputStreamNewInstance.writeRawVarint32(i2);
                                    } else {
                                        this.c |= 8;
                                        this.g = varianceValueOf;
                                    }
                                } else if (tag == 42) {
                                    if ((i & 16) != 16) {
                                        this.h = new ArrayList();
                                        i |= 16;
                                    }
                                    this.h.add((Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                                } else if (tag == 48) {
                                    if ((i & 32) != 32) {
                                        this.i = new ArrayList();
                                        i |= 32;
                                    }
                                    this.i.add(Integer.valueOf(codedInputStream.readInt32()));
                                } else if (tag != 50) {
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i & 32) != 32 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.i = new ArrayList();
                                        i |= 32;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.i.add(Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((i & 16) == 16) {
                        this.h = Collections.unmodifiableList(this.h);
                    }
                    if ((i & 32) == 32) {
                        this.i = Collections.unmodifiableList(this.i);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.b = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 16) == 16) {
                this.h = Collections.unmodifiableList(this.h);
            }
            if ((i & 32) == 32) {
                this.i = Collections.unmodifiableList(this.i);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.b = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface TypeParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class TypeTable extends GeneratedMessageLite implements TypeTableOrBuilder {
        public static Parser<TypeTable> PARSER = new a();
        private static final TypeTable g;
        private final ByteString a;
        private int b;
        private List<Type> c;
        private int d;
        private byte e;
        private int f;

        public static final class Builder extends GeneratedMessageLite.Builder<TypeTable, Builder> implements TypeTableOrBuilder {
            private int b;
            private List<Type> c = Collections.emptyList();
            private int d = -1;

            private Builder() {
                d();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder b() {
                return new Builder();
            }

            private void c() {
                if ((this.b & 1) != 1) {
                    this.c = new ArrayList(this.c);
                    this.b |= 1;
                }
            }

            private void d() {
            }

            public TypeTable buildPartial() {
                TypeTable typeTable = new TypeTable(this);
                int i = this.b;
                if ((i & 1) == 1) {
                    this.c = Collections.unmodifiableList(this.c);
                    this.b &= -2;
                }
                typeTable.c = this.c;
                int i2 = (i & 2) != 2 ? 0 : 1;
                typeTable.d = this.d;
                typeTable.b = i2;
                return typeTable;
            }

            public Type getType(int i) {
                return this.c.get(i);
            }

            public int getTypeCount() {
                return this.c.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i = 0; i < getTypeCount(); i++) {
                    if (!getType(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder setFirstNullable(int i) {
                this.b |= 2;
                this.d = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public TypeTable build() {
                TypeTable typeTableBuildPartial = buildPartial();
                if (typeTableBuildPartial.isInitialized()) {
                    return typeTableBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(typeTableBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public TypeTable getDefaultInstanceForType() {
                return TypeTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4297clone() {
                return b().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(TypeTable typeTable) {
                if (typeTable == TypeTable.getDefaultInstance()) {
                    return this;
                }
                if (!typeTable.c.isEmpty()) {
                    if (this.c.isEmpty()) {
                        this.c = typeTable.c;
                        this.b &= -2;
                    } else {
                        c();
                        this.c.addAll(typeTable.c);
                    }
                }
                if (typeTable.hasFirstNullable()) {
                    setFirstNullable(typeTable.getFirstNullable());
                }
                setUnknownFields(getUnknownFields().concat(typeTable.a));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TypeTable typeTable = null;
                try {
                    try {
                        TypeTable partialFrom = TypeTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        TypeTable typeTable2 = (TypeTable) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            typeTable = typeTable2;
                            if (typeTable != null) {
                                mergeFrom(typeTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (typeTable != null) {
                        mergeFrom(typeTable);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<TypeTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public TypeTable parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TypeTable(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            TypeTable typeTable = new TypeTable(true);
            g = typeTable;
            typeTable.m();
        }

        public static TypeTable getDefaultInstance() {
            return g;
        }

        private void m() {
            this.c = Collections.emptyList();
            this.d = -1;
        }

        public static Builder newBuilder() {
            return Builder.b();
        }

        public int getFirstNullable() {
            return this.d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeTable> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.f;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = 0;
            for (int i2 = 0; i2 < this.c.size(); i2++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(1, this.c.get(i2));
            }
            if ((this.b & 1) == 1) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.d);
            }
            int size = iComputeInt32Size + this.a.size();
            this.f = size;
            return size;
        }

        public Type getType(int i) {
            return this.c.get(i);
        }

        public int getTypeCount() {
            return this.c.size();
        }

        public List<Type> getTypeList() {
            return this.c;
        }

        public boolean hasFirstNullable() {
            return (this.b & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.e;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getTypeCount(); i++) {
                if (!getType(i).isInitialized()) {
                    this.e = (byte) 0;
                    return false;
                }
            }
            this.e = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.c.size(); i++) {
                codedOutputStream.writeMessage(1, this.c.get(i));
            }
            if ((this.b & 1) == 1) {
                codedOutputStream.writeInt32(2, this.d);
            }
            codedOutputStream.writeRawBytes(this.a);
        }

        public static Builder newBuilder(TypeTable typeTable) {
            return newBuilder().mergeFrom(typeTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public TypeTable getDefaultInstanceForType() {
            return g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private TypeTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.e = (byte) -1;
            this.f = -1;
            this.a = builder.getUnknownFields();
        }

        private TypeTable(boolean z) {
            this.e = (byte) -1;
            this.f = -1;
            this.a = ByteString.EMPTY;
        }

        private TypeTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.e = (byte) -1;
            this.f = -1;
            m();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                if (!(z2 & true)) {
                                    this.c = new ArrayList();
                                    z2 |= true;
                                }
                                this.c.add((Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                            } else if (tag != 16) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.b |= 1;
                                this.d = codedInputStream.readInt32();
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if (z2 & true) {
                            this.c = Collections.unmodifiableList(this.c);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.a = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (z2 & true) {
                this.c = Collections.unmodifiableList(this.c);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.a = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface TypeTableOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class ValueParameter extends GeneratedMessageLite.ExtendableMessage<ValueParameter> implements ValueParameterOrBuilder {
        public static Parser<ValueParameter> PARSER = new a();
        private static final ValueParameter l;
        private final ByteString b;
        private int c;
        private int d;
        private int e;
        private Type f;
        private int g;
        private Type h;
        private int i;
        private byte j;
        private int k;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<ValueParameter, Builder> implements ValueParameterOrBuilder {
            private int d;
            private int e;
            private int f;
            private int h;
            private int j;
            private Type g = Type.getDefaultInstance();
            private Type i = Type.getDefaultInstance();

            private Builder() {
                f();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder e() {
                return new Builder();
            }

            private void f() {
            }

            public ValueParameter buildPartial() {
                ValueParameter valueParameter = new ValueParameter(this);
                int i = this.d;
                int i2 = (i & 1) != 1 ? 0 : 1;
                valueParameter.d = this.e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                valueParameter.e = this.f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                valueParameter.f = this.g;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                valueParameter.g = this.h;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                valueParameter.h = this.i;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                valueParameter.i = this.j;
                valueParameter.c = i2;
                return valueParameter;
            }

            public Type getType() {
                return this.g;
            }

            public Type getVarargElementType() {
                return this.i;
            }

            public boolean hasName() {
                return (this.d & 2) == 2;
            }

            public boolean hasType() {
                return (this.d & 4) == 4;
            }

            public boolean hasVarargElementType() {
                return (this.d & 16) == 16;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (!hasType() || getType().isInitialized()) {
                    return (!hasVarargElementType() || getVarargElementType().isInitialized()) && extensionsAreInitialized();
                }
                return false;
            }

            public Builder mergeType(Type type) {
                if ((this.d & 4) != 4 || this.g == Type.getDefaultInstance()) {
                    this.g = type;
                } else {
                    this.g = Type.newBuilder(this.g).mergeFrom(type).buildPartial();
                }
                this.d |= 4;
                return this;
            }

            public Builder mergeVarargElementType(Type type) {
                if ((this.d & 16) != 16 || this.i == Type.getDefaultInstance()) {
                    this.i = type;
                } else {
                    this.i = Type.newBuilder(this.i).mergeFrom(type).buildPartial();
                }
                this.d |= 16;
                return this;
            }

            public Builder setFlags(int i) {
                this.d |= 1;
                this.e = i;
                return this;
            }

            public Builder setName(int i) {
                this.d |= 2;
                this.f = i;
                return this;
            }

            public Builder setTypeId(int i) {
                this.d |= 8;
                this.h = i;
                return this;
            }

            public Builder setVarargElementTypeId(int i) {
                this.d |= 32;
                this.j = i;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public ValueParameter build() {
                ValueParameter valueParameterBuildPartial = buildPartial();
                if (valueParameterBuildPartial.isInitialized()) {
                    return valueParameterBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(valueParameterBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public ValueParameter getDefaultInstanceForType() {
                return ValueParameter.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(ValueParameter valueParameter) {
                if (valueParameter == ValueParameter.getDefaultInstance()) {
                    return this;
                }
                if (valueParameter.hasFlags()) {
                    setFlags(valueParameter.getFlags());
                }
                if (valueParameter.hasName()) {
                    setName(valueParameter.getName());
                }
                if (valueParameter.hasType()) {
                    mergeType(valueParameter.getType());
                }
                if (valueParameter.hasTypeId()) {
                    setTypeId(valueParameter.getTypeId());
                }
                if (valueParameter.hasVarargElementType()) {
                    mergeVarargElementType(valueParameter.getVarargElementType());
                }
                if (valueParameter.hasVarargElementTypeId()) {
                    setVarargElementTypeId(valueParameter.getVarargElementTypeId());
                }
                mergeExtensionFields(valueParameter);
                setUnknownFields(getUnknownFields().concat(valueParameter.b));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4297clone() {
                return e().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                ValueParameter valueParameter = null;
                try {
                    try {
                        ValueParameter partialFrom = ValueParameter.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        ValueParameter valueParameter2 = (ValueParameter) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            valueParameter = valueParameter2;
                            if (valueParameter != null) {
                                mergeFrom(valueParameter);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (valueParameter != null) {
                        mergeFrom(valueParameter);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<ValueParameter> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public ValueParameter parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new ValueParameter(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            ValueParameter valueParameter = new ValueParameter(true);
            l = valueParameter;
            valueParameter.r();
        }

        public static ValueParameter getDefaultInstance() {
            return l;
        }

        public static Builder newBuilder() {
            return Builder.e();
        }

        private void r() {
            this.d = 0;
            this.e = 0;
            this.f = Type.getDefaultInstance();
            this.g = 0;
            this.h = Type.getDefaultInstance();
            this.i = 0;
        }

        public int getFlags() {
            return this.d;
        }

        public int getName() {
            return this.e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<ValueParameter> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.k;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.c & 1) == 1 ? 0 + CodedOutputStream.computeInt32Size(1, this.d) : 0;
            if ((this.c & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.e);
            }
            if ((this.c & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, this.f);
            }
            if ((this.c & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, this.h);
            }
            if ((this.c & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(5, this.g);
            }
            if ((this.c & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(6, this.i);
            }
            int iExtensionsSerializedSize = iComputeInt32Size + extensionsSerializedSize() + this.b.size();
            this.k = iExtensionsSerializedSize;
            return iExtensionsSerializedSize;
        }

        public Type getType() {
            return this.f;
        }

        public int getTypeId() {
            return this.g;
        }

        public Type getVarargElementType() {
            return this.h;
        }

        public int getVarargElementTypeId() {
            return this.i;
        }

        public boolean hasFlags() {
            return (this.c & 1) == 1;
        }

        public boolean hasName() {
            return (this.c & 2) == 2;
        }

        public boolean hasType() {
            return (this.c & 4) == 4;
        }

        public boolean hasTypeId() {
            return (this.c & 8) == 8;
        }

        public boolean hasVarargElementType() {
            return (this.c & 16) == 16;
        }

        public boolean hasVarargElementTypeId() {
            return (this.c & 32) == 32;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.j;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.j = (byte) 0;
                return false;
            }
            if (hasType() && !getType().isInitialized()) {
                this.j = (byte) 0;
                return false;
            }
            if (hasVarargElementType() && !getVarargElementType().isInitialized()) {
                this.j = (byte) 0;
                return false;
            }
            if (extensionsAreInitialized()) {
                this.j = (byte) 1;
                return true;
            }
            this.j = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.c & 1) == 1) {
                codedOutputStream.writeInt32(1, this.d);
            }
            if ((this.c & 2) == 2) {
                codedOutputStream.writeInt32(2, this.e);
            }
            if ((this.c & 4) == 4) {
                codedOutputStream.writeMessage(3, this.f);
            }
            if ((this.c & 16) == 16) {
                codedOutputStream.writeMessage(4, this.h);
            }
            if ((this.c & 8) == 8) {
                codedOutputStream.writeInt32(5, this.g);
            }
            if ((this.c & 32) == 32) {
                codedOutputStream.writeInt32(6, this.i);
            }
            extensionWriterNewExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.b);
        }

        public static Builder newBuilder(ValueParameter valueParameter) {
            return newBuilder().mergeFrom(valueParameter);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public ValueParameter getDefaultInstanceForType() {
            return l;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private ValueParameter(GeneratedMessageLite.ExtendableBuilder<ValueParameter, ?> extendableBuilder) {
            super(extendableBuilder);
            this.j = (byte) -1;
            this.k = -1;
            this.b = extendableBuilder.getUnknownFields();
        }

        private ValueParameter(boolean z) {
            this.j = (byte) -1;
            this.k = -1;
            this.b = ByteString.EMPTY;
        }

        private ValueParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Type.Builder builder;
            this.j = (byte) -1;
            this.k = -1;
            r();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.c |= 1;
                                    this.d = codedInputStream.readInt32();
                                } else if (tag != 16) {
                                    if (tag == 26) {
                                        builder = (this.c & 4) == 4 ? this.f.toBuilder() : null;
                                        Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                        this.f = type;
                                        if (builder != null) {
                                            builder.mergeFrom(type);
                                            this.f = builder.buildPartial();
                                        }
                                        this.c |= 4;
                                    } else if (tag == 34) {
                                        builder = (this.c & 16) == 16 ? this.h.toBuilder() : null;
                                        Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                        this.h = type2;
                                        if (builder != null) {
                                            builder.mergeFrom(type2);
                                            this.h = builder.buildPartial();
                                        }
                                        this.c |= 16;
                                    } else if (tag == 40) {
                                        this.c |= 8;
                                        this.g = codedInputStream.readInt32();
                                    } else if (tag != 48) {
                                        if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        this.c |= 32;
                                        this.i = codedInputStream.readInt32();
                                    }
                                } else {
                                    this.c |= 2;
                                    this.e = codedInputStream.readInt32();
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.b = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.b = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface ValueParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class VersionRequirement extends GeneratedMessageLite implements VersionRequirementOrBuilder {
        public static Parser<VersionRequirement> PARSER = new a();
        private static final VersionRequirement k;
        private final ByteString a;
        private int b;
        private int c;
        private int d;
        private Level e;
        private int f;
        private int g;
        private VersionKind h;
        private byte i;
        private int j;

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirement, Builder> implements VersionRequirementOrBuilder {
            private int b;
            private int c;
            private int d;
            private int f;
            private int g;
            private Level e = Level.ERROR;
            private VersionKind h = VersionKind.LANGUAGE_VERSION;

            private Builder() {
                c();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder b() {
                return new Builder();
            }

            private void c() {
            }

            public VersionRequirement buildPartial() {
                VersionRequirement versionRequirement = new VersionRequirement(this);
                int i = this.b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                versionRequirement.c = this.c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                versionRequirement.d = this.d;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                versionRequirement.e = this.e;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                versionRequirement.f = this.f;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                versionRequirement.g = this.g;
                if ((i & 32) == 32) {
                    i2 |= 32;
                }
                versionRequirement.h = this.h;
                versionRequirement.b = i2;
                return versionRequirement;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setErrorCode(int i) {
                this.b |= 8;
                this.f = i;
                return this;
            }

            public Builder setLevel(Level level) {
                Objects.requireNonNull(level);
                this.b |= 4;
                this.e = level;
                return this;
            }

            public Builder setMessage(int i) {
                this.b |= 16;
                this.g = i;
                return this;
            }

            public Builder setVersion(int i) {
                this.b |= 1;
                this.c = i;
                return this;
            }

            public Builder setVersionFull(int i) {
                this.b |= 2;
                this.d = i;
                return this;
            }

            public Builder setVersionKind(VersionKind versionKind) {
                Objects.requireNonNull(versionKind);
                this.b |= 32;
                this.h = versionKind;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public VersionRequirement build() {
                VersionRequirement versionRequirementBuildPartial = buildPartial();
                if (versionRequirementBuildPartial.isInitialized()) {
                    return versionRequirementBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(versionRequirementBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public VersionRequirement getDefaultInstanceForType() {
                return VersionRequirement.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4297clone() {
                return b().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(VersionRequirement versionRequirement) {
                if (versionRequirement == VersionRequirement.getDefaultInstance()) {
                    return this;
                }
                if (versionRequirement.hasVersion()) {
                    setVersion(versionRequirement.getVersion());
                }
                if (versionRequirement.hasVersionFull()) {
                    setVersionFull(versionRequirement.getVersionFull());
                }
                if (versionRequirement.hasLevel()) {
                    setLevel(versionRequirement.getLevel());
                }
                if (versionRequirement.hasErrorCode()) {
                    setErrorCode(versionRequirement.getErrorCode());
                }
                if (versionRequirement.hasMessage()) {
                    setMessage(versionRequirement.getMessage());
                }
                if (versionRequirement.hasVersionKind()) {
                    setVersionKind(versionRequirement.getVersionKind());
                }
                setUnknownFields(getUnknownFields().concat(versionRequirement.a));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                VersionRequirement versionRequirement = null;
                try {
                    try {
                        VersionRequirement partialFrom = VersionRequirement.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        VersionRequirement versionRequirement2 = (VersionRequirement) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            versionRequirement = versionRequirement2;
                            if (versionRequirement != null) {
                                mergeFrom(versionRequirement);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (versionRequirement != null) {
                        mergeFrom(versionRequirement);
                    }
                    throw th;
                }
            }
        }

        public enum Level implements Internal.EnumLite {
            WARNING(0, 0),
            ERROR(1, 1),
            HIDDEN(2, 2);

            private static Internal.EnumLiteMap<Level> internalValueMap = new a();
            private final int value;

            public static class a implements Internal.EnumLiteMap<Level> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Level findValueByNumber(int i) {
                    return Level.valueOf(i);
                }
            }

            Level(int i, int i2) {
                this.value = i2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static Level valueOf(int i) {
                if (i == 0) {
                    return WARNING;
                }
                if (i == 1) {
                    return ERROR;
                }
                if (i != 2) {
                    return null;
                }
                return HIDDEN;
            }
        }

        public enum VersionKind implements Internal.EnumLite {
            LANGUAGE_VERSION(0, 0),
            COMPILER_VERSION(1, 1),
            API_VERSION(2, 2);

            private static Internal.EnumLiteMap<VersionKind> internalValueMap = new a();
            private final int value;

            public static class a implements Internal.EnumLiteMap<VersionKind> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public VersionKind findValueByNumber(int i) {
                    return VersionKind.valueOf(i);
                }
            }

            VersionKind(int i, int i2) {
                this.value = i2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static VersionKind valueOf(int i) {
                if (i == 0) {
                    return LANGUAGE_VERSION;
                }
                if (i == 1) {
                    return COMPILER_VERSION;
                }
                if (i != 2) {
                    return null;
                }
                return API_VERSION;
            }
        }

        public static class a extends AbstractParser<VersionRequirement> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public VersionRequirement parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new VersionRequirement(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            VersionRequirement versionRequirement = new VersionRequirement(true);
            k = versionRequirement;
            versionRequirement.p();
        }

        public static VersionRequirement getDefaultInstance() {
            return k;
        }

        public static Builder newBuilder() {
            return Builder.b();
        }

        private void p() {
            this.c = 0;
            this.d = 0;
            this.e = Level.ERROR;
            this.f = 0;
            this.g = 0;
            this.h = VersionKind.LANGUAGE_VERSION;
        }

        public int getErrorCode() {
            return this.f;
        }

        public Level getLevel() {
            return this.e;
        }

        public int getMessage() {
            return this.g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<VersionRequirement> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.j;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.b & 1) == 1 ? 0 + CodedOutputStream.computeInt32Size(1, this.c) : 0;
            if ((this.b & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.d);
            }
            if ((this.b & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.e.getNumber());
            }
            if ((this.b & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(4, this.f);
            }
            if ((this.b & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(5, this.g);
            }
            if ((this.b & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(6, this.h.getNumber());
            }
            int size = iComputeInt32Size + this.a.size();
            this.j = size;
            return size;
        }

        public int getVersion() {
            return this.c;
        }

        public int getVersionFull() {
            return this.d;
        }

        public VersionKind getVersionKind() {
            return this.h;
        }

        public boolean hasErrorCode() {
            return (this.b & 8) == 8;
        }

        public boolean hasLevel() {
            return (this.b & 4) == 4;
        }

        public boolean hasMessage() {
            return (this.b & 16) == 16;
        }

        public boolean hasVersion() {
            return (this.b & 1) == 1;
        }

        public boolean hasVersionFull() {
            return (this.b & 2) == 2;
        }

        public boolean hasVersionKind() {
            return (this.b & 32) == 32;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.i;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.i = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.b & 1) == 1) {
                codedOutputStream.writeInt32(1, this.c);
            }
            if ((this.b & 2) == 2) {
                codedOutputStream.writeInt32(2, this.d);
            }
            if ((this.b & 4) == 4) {
                codedOutputStream.writeEnum(3, this.e.getNumber());
            }
            if ((this.b & 8) == 8) {
                codedOutputStream.writeInt32(4, this.f);
            }
            if ((this.b & 16) == 16) {
                codedOutputStream.writeInt32(5, this.g);
            }
            if ((this.b & 32) == 32) {
                codedOutputStream.writeEnum(6, this.h.getNumber());
            }
            codedOutputStream.writeRawBytes(this.a);
        }

        public static Builder newBuilder(VersionRequirement versionRequirement) {
            return newBuilder().mergeFrom(versionRequirement);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public VersionRequirement getDefaultInstanceForType() {
            return k;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private VersionRequirement(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.i = (byte) -1;
            this.j = -1;
            this.a = builder.getUnknownFields();
        }

        private VersionRequirement(boolean z) {
            this.i = (byte) -1;
            this.j = -1;
            this.a = ByteString.EMPTY;
        }

        private VersionRequirement(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.i = (byte) -1;
            this.j = -1;
            p();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.b |= 1;
                                this.c = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.b |= 2;
                                this.d = codedInputStream.readInt32();
                            } else if (tag == 24) {
                                int i = codedInputStream.readEnum();
                                Level levelValueOf = Level.valueOf(i);
                                if (levelValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i);
                                } else {
                                    this.b |= 4;
                                    this.e = levelValueOf;
                                }
                            } else if (tag == 32) {
                                this.b |= 8;
                                this.f = codedInputStream.readInt32();
                            } else if (tag == 40) {
                                this.b |= 16;
                                this.g = codedInputStream.readInt32();
                            } else if (tag != 48) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                int i2 = codedInputStream.readEnum();
                                VersionKind versionKindValueOf = VersionKind.valueOf(i2);
                                if (versionKindValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i2);
                                } else {
                                    this.b |= 32;
                                    this.h = versionKindValueOf;
                                }
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.a = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.a = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface VersionRequirementOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class VersionRequirementTable extends GeneratedMessageLite implements VersionRequirementTableOrBuilder {
        public static Parser<VersionRequirementTable> PARSER = new a();
        private static final VersionRequirementTable e;
        private final ByteString a;
        private List<VersionRequirement> b;
        private byte c;
        private int d;

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirementTable, Builder> implements VersionRequirementTableOrBuilder {
            private int b;
            private List<VersionRequirement> c = Collections.emptyList();

            private Builder() {
                d();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder b() {
                return new Builder();
            }

            private void c() {
                if ((this.b & 1) != 1) {
                    this.c = new ArrayList(this.c);
                    this.b |= 1;
                }
            }

            private void d() {
            }

            public VersionRequirementTable buildPartial() {
                VersionRequirementTable versionRequirementTable = new VersionRequirementTable(this);
                if ((this.b & 1) == 1) {
                    this.c = Collections.unmodifiableList(this.c);
                    this.b &= -2;
                }
                versionRequirementTable.b = this.c;
                return versionRequirementTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public VersionRequirementTable build() {
                VersionRequirementTable versionRequirementTableBuildPartial = buildPartial();
                if (versionRequirementTableBuildPartial.isInitialized()) {
                    return versionRequirementTableBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(versionRequirementTableBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public VersionRequirementTable getDefaultInstanceForType() {
                return VersionRequirementTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4297clone() {
                return b().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(VersionRequirementTable versionRequirementTable) {
                if (versionRequirementTable == VersionRequirementTable.getDefaultInstance()) {
                    return this;
                }
                if (!versionRequirementTable.b.isEmpty()) {
                    if (this.c.isEmpty()) {
                        this.c = versionRequirementTable.b;
                        this.b &= -2;
                    } else {
                        c();
                        this.c.addAll(versionRequirementTable.b);
                    }
                }
                setUnknownFields(getUnknownFields().concat(versionRequirementTable.a));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                VersionRequirementTable versionRequirementTable = null;
                try {
                    try {
                        VersionRequirementTable partialFrom = VersionRequirementTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        VersionRequirementTable versionRequirementTable2 = (VersionRequirementTable) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            versionRequirementTable = versionRequirementTable2;
                            if (versionRequirementTable != null) {
                                mergeFrom(versionRequirementTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (versionRequirementTable != null) {
                        mergeFrom(versionRequirementTable);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<VersionRequirementTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public VersionRequirementTable parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new VersionRequirementTable(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            VersionRequirementTable versionRequirementTable = new VersionRequirementTable(true);
            e = versionRequirementTable;
            versionRequirementTable.j();
        }

        public static VersionRequirementTable getDefaultInstance() {
            return e;
        }

        private void j() {
            this.b = Collections.emptyList();
        }

        public static Builder newBuilder() {
            return Builder.b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<VersionRequirementTable> getParserForType() {
            return PARSER;
        }

        public int getRequirementCount() {
            return this.b.size();
        }

        public List<VersionRequirement> getRequirementList() {
            return this.b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.d;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = 0;
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.b.get(i2));
            }
            int size = iComputeMessageSize + this.a.size();
            this.d = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.c;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.c = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.b.size(); i++) {
                codedOutputStream.writeMessage(1, this.b.get(i));
            }
            codedOutputStream.writeRawBytes(this.a);
        }

        public static Builder newBuilder(VersionRequirementTable versionRequirementTable) {
            return newBuilder().mergeFrom(versionRequirementTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public VersionRequirementTable getDefaultInstanceForType() {
            return e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        private VersionRequirementTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.c = (byte) -1;
            this.d = -1;
            this.a = builder.getUnknownFields();
        }

        private VersionRequirementTable(boolean z) {
            this.c = (byte) -1;
            this.d = -1;
            this.a = ByteString.EMPTY;
        }

        private VersionRequirementTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.c = (byte) -1;
            this.d = -1;
            j();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 10) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if (!(z2 & true)) {
                                    this.b = new ArrayList();
                                    z2 |= true;
                                }
                                this.b.add((VersionRequirement) codedInputStream.readMessage(VersionRequirement.PARSER, extensionRegistryLite));
                            }
                        }
                        z = true;
                    } catch (Throwable th) {
                        if (z2 & true) {
                            this.b = Collections.unmodifiableList(this.b);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.a = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (z2 & true) {
                this.b = Collections.unmodifiableList(this.b);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.a = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface VersionRequirementTableOrBuilder extends MessageLiteOrBuilder {
    }

    public enum Visibility implements Internal.EnumLite {
        INTERNAL(0, 0),
        PRIVATE(1, 1),
        PROTECTED(2, 2),
        PUBLIC(3, 3),
        PRIVATE_TO_THIS(4, 4),
        LOCAL(5, 5);

        private static Internal.EnumLiteMap<Visibility> internalValueMap = new a();
        private final int value;

        public static class a implements Internal.EnumLiteMap<Visibility> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Visibility findValueByNumber(int i) {
                return Visibility.valueOf(i);
            }
        }

        Visibility(int i, int i2) {
            this.value = i2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        public static Visibility valueOf(int i) {
            if (i == 0) {
                return INTERNAL;
            }
            if (i == 1) {
                return PRIVATE;
            }
            if (i == 2) {
                return PROTECTED;
            }
            if (i == 3) {
                return PUBLIC;
            }
            if (i == 4) {
                return PRIVATE_TO_THIS;
            }
            if (i != 5) {
                return null;
            }
            return LOCAL;
        }
    }
}
