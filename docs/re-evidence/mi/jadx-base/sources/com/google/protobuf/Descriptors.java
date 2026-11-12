package com.google.protobuf;

import com.xiaomi.fitness.login.region.RegionManagerImpl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
public final class Descriptors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f9481a = Logger.getLogger(Descriptors.class.getName());

    public static class DescriptorValidationException extends Exception {
        private static final long serialVersionUID = 5750205775490483148L;
        private final String description;
        private final String name;
        private final p0 proto;

        public /* synthetic */ DescriptorValidationException(FileDescriptor fileDescriptor, String str, a aVar) {
            this(fileDescriptor, str);
        }

        public String getDescription() {
            return this.description;
        }

        public p0 getProblemProto() {
            return this.proto;
        }

        public String getProblemSymbolName() {
            return this.name;
        }

        public /* synthetic */ DescriptorValidationException(f fVar, String str, a aVar) {
            this(fVar, str);
        }

        public /* synthetic */ DescriptorValidationException(f fVar, String str, Throwable th, a aVar) {
            this(fVar, str, th);
        }

        private DescriptorValidationException(f fVar, String str) {
            super(fVar.b() + ": " + str);
            this.name = fVar.b();
            this.proto = fVar.d();
            this.description = str;
        }

        private DescriptorValidationException(f fVar, String str, Throwable th) {
            this(fVar, str);
            initCause(th);
        }

        private DescriptorValidationException(FileDescriptor fileDescriptor, String str) {
            super(fileDescriptor.c() + ": " + str);
            this.name = fileDescriptor.c();
            this.proto = fileDescriptor.d();
            this.description = str;
        }
    }

    public static final class FieldDescriptor extends f implements Comparable<FieldDescriptor>, a0.c<FieldDescriptor> {
        public static final WireFormat.FieldType[] n = WireFormat.FieldType.values();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public DescriptorProtos.FieldDescriptorProto f9483b;
        public final String c;
        public final String d;
        public final FileDescriptor e;
        public final b f;
        public final boolean g;
        public Type h;
        public b i;
        public b j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public h f9484k;
        public d l;
        public Object m;

        public enum JavaType {
            INT(0),
            LONG(0L),
            FLOAT(Float.valueOf(0.0f)),
            DOUBLE(Double.valueOf(0.0d)),
            BOOLEAN(Boolean.FALSE),
            STRING(""),
            BYTE_STRING(ByteString.EMPTY),
            ENUM(null),
            MESSAGE(null);

            private final Object defaultDefault;

            JavaType(Object obj) {
                this.defaultDefault = obj;
            }
        }

        /* JADX WARN: Enum visitor error
        jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
        	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
        	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
        	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
        	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
         */
        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        public static final class Type {
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type BOOL;
            public static final Type BYTES;
            public static final Type DOUBLE;
            public static final Type ENUM;
            public static final Type FIXED32;
            public static final Type FIXED64;
            public static final Type FLOAT;
            public static final Type GROUP;
            public static final Type INT32;
            public static final Type INT64;
            public static final Type MESSAGE;
            public static final Type SFIXED32;
            public static final Type SFIXED64;
            public static final Type SINT32;
            public static final Type SINT64;
            public static final Type STRING;
            public static final Type UINT32;
            public static final Type UINT64;
            private JavaType javaType;

            static {
                Type type = new Type("DOUBLE", 0, JavaType.DOUBLE);
                DOUBLE = type;
                Type type2 = new Type("FLOAT", 1, JavaType.FLOAT);
                FLOAT = type2;
                JavaType javaType = JavaType.LONG;
                Type type3 = new Type("INT64", 2, javaType);
                INT64 = type3;
                Type type4 = new Type("UINT64", 3, javaType);
                UINT64 = type4;
                JavaType javaType2 = JavaType.INT;
                Type type5 = new Type("INT32", 4, javaType2);
                INT32 = type5;
                Type type6 = new Type("FIXED64", 5, javaType);
                FIXED64 = type6;
                Type type7 = new Type("FIXED32", 6, javaType2);
                FIXED32 = type7;
                Type type8 = new Type("BOOL", 7, JavaType.BOOLEAN);
                BOOL = type8;
                Type type9 = new Type("STRING", 8, JavaType.STRING);
                STRING = type9;
                JavaType javaType3 = JavaType.MESSAGE;
                Type type10 = new Type("GROUP", 9, javaType3);
                GROUP = type10;
                Type type11 = new Type("MESSAGE", 10, javaType3);
                MESSAGE = type11;
                Type type12 = new Type("BYTES", 11, JavaType.BYTE_STRING);
                BYTES = type12;
                Type type13 = new Type("UINT32", 12, javaType2);
                UINT32 = type13;
                Type type14 = new Type("ENUM", 13, JavaType.ENUM);
                ENUM = type14;
                Type type15 = new Type("SFIXED32", 14, javaType2);
                SFIXED32 = type15;
                Type type16 = new Type("SFIXED64", 15, javaType);
                SFIXED64 = type16;
                Type type17 = new Type("SINT32", 16, javaType2);
                SINT32 = type17;
                Type type18 = new Type("SINT64", 17, javaType);
                SINT64 = type18;
                $VALUES = new Type[]{type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18};
            }

            private Type(String str, int i, JavaType javaType) {
                super(str, i);
                this.javaType = javaType;
            }

            public static Type valueOf(String str) {
                return (Type) java.lang.Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }

            public JavaType getJavaType() {
                return this.javaType;
            }

            public DescriptorProtos.FieldDescriptorProto.Type toProto() {
                return DescriptorProtos.FieldDescriptorProto.Type.forNumber(ordinal() + 1);
            }

            public static Type valueOf(DescriptorProtos.FieldDescriptorProto.Type type) {
                return values()[type.getNumber() - 1];
            }
        }

        static {
            if (Type.values().length != DescriptorProtos.FieldDescriptorProto.Type.values().length) {
                throw new RuntimeException("descriptor.proto has a new declared type but Descriptors.java wasn't updated.");
            }
        }

        public /* synthetic */ FieldDescriptor(DescriptorProtos.FieldDescriptorProto fieldDescriptorProto, FileDescriptor fileDescriptor, b bVar, int i, boolean z, a aVar) throws DescriptorValidationException {
            this(fieldDescriptorProto, fileDescriptor, bVar, i, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public void l() throws DescriptorValidationException {
            a aVar = null;
            if (this.f9483b.hasExtendee()) {
                f fVarL = this.e.h.l(this.f9483b.getExtendee(), this, c.EnumC0255c.TYPES_ONLY);
                if (!(fVarL instanceof b)) {
                    throw new DescriptorValidationException(this, '\"' + this.f9483b.getExtendee() + "\" is not a message type.", aVar);
                }
                this.i = (b) fVarL;
                if (!o().w(getNumber())) {
                    throw new DescriptorValidationException(this, '\"' + o().b() + "\" does not declare " + getNumber() + " as an extension number.", aVar);
                }
            }
            if (this.f9483b.hasTypeName()) {
                f fVarL2 = this.e.h.l(this.f9483b.getTypeName(), this, c.EnumC0255c.TYPES_ONLY);
                if (!this.f9483b.hasType()) {
                    if (fVarL2 instanceof b) {
                        this.h = Type.MESSAGE;
                    } else {
                        if (!(fVarL2 instanceof d)) {
                            throw new DescriptorValidationException(this, '\"' + this.f9483b.getTypeName() + "\" is not a type.", aVar);
                        }
                        this.h = Type.ENUM;
                    }
                }
                if (w() == JavaType.MESSAGE) {
                    if (!(fVarL2 instanceof b)) {
                        throw new DescriptorValidationException(this, '\"' + this.f9483b.getTypeName() + "\" is not a message type.", aVar);
                    }
                    this.j = (b) fVarL2;
                    if (this.f9483b.hasDefaultValue()) {
                        throw new DescriptorValidationException(this, "Messages can't have default values.", aVar);
                    }
                } else {
                    if (w() != JavaType.ENUM) {
                        throw new DescriptorValidationException(this, "Field with primitive type has type_name.", aVar);
                    }
                    if (!(fVarL2 instanceof d)) {
                        throw new DescriptorValidationException(this, '\"' + this.f9483b.getTypeName() + "\" is not an enum type.", aVar);
                    }
                    this.l = (d) fVarL2;
                }
            } else if (w() == JavaType.MESSAGE || w() == JavaType.ENUM) {
                throw new DescriptorValidationException(this, "Field with message or enum type missing type_name.", aVar);
            }
            if (this.f9483b.getOptions().getPacked() && !E()) {
                throw new DescriptorValidationException(this, "[packed = true] can only be specified for repeated primitive fields.", aVar);
            }
            if (this.f9483b.hasDefaultValue()) {
                if (isRepeated()) {
                    throw new DescriptorValidationException(this, "Repeated fields cannot have default values.", aVar);
                }
                try {
                    switch (a.f9487a[z().ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                            this.m = Integer.valueOf(TextFormat.j(this.f9483b.getDefaultValue()));
                            break;
                        case 4:
                        case 5:
                            this.m = Integer.valueOf(TextFormat.m(this.f9483b.getDefaultValue()));
                            break;
                        case 6:
                        case 7:
                        case 8:
                            this.m = Long.valueOf(TextFormat.k(this.f9483b.getDefaultValue()));
                            break;
                        case 9:
                        case 10:
                            this.m = Long.valueOf(TextFormat.n(this.f9483b.getDefaultValue()));
                            break;
                        case 11:
                            if (this.f9483b.getDefaultValue().equals("inf")) {
                                this.m = Float.valueOf(Float.POSITIVE_INFINITY);
                            } else if (this.f9483b.getDefaultValue().equals("-inf")) {
                                this.m = Float.valueOf(Float.NEGATIVE_INFINITY);
                            } else if (!this.f9483b.getDefaultValue().equals("nan")) {
                                this.m = Float.valueOf(this.f9483b.getDefaultValue());
                            } else {
                                this.m = Float.valueOf(Float.NaN);
                            }
                            break;
                        case 12:
                            if (this.f9483b.getDefaultValue().equals("inf")) {
                                this.m = Double.valueOf(Double.POSITIVE_INFINITY);
                            } else if (this.f9483b.getDefaultValue().equals("-inf")) {
                                this.m = Double.valueOf(Double.NEGATIVE_INFINITY);
                            } else if (!this.f9483b.getDefaultValue().equals("nan")) {
                                this.m = Double.valueOf(this.f9483b.getDefaultValue());
                            } else {
                                this.m = Double.valueOf(Double.NaN);
                            }
                            break;
                        case 13:
                            this.m = Boolean.valueOf(this.f9483b.getDefaultValue());
                            break;
                        case 14:
                            this.m = this.f9483b.getDefaultValue();
                            break;
                        case 15:
                            try {
                                this.m = TextFormat.p(this.f9483b.getDefaultValue());
                            } catch (TextFormat.InvalidEscapeSequenceException e) {
                                throw new DescriptorValidationException(this, "Couldn't parse default value: " + e.getMessage(), e, aVar);
                            }
                            break;
                        case 16:
                            e eVarH = this.l.h(this.f9483b.getDefaultValue());
                            this.m = eVarH;
                            if (eVarH == null) {
                                throw new DescriptorValidationException(this, "Unknown enum default value: \"" + this.f9483b.getDefaultValue() + '\"', aVar);
                            }
                            break;
                            break;
                        case 17:
                        case 18:
                            throw new DescriptorValidationException(this, "Message type had default value.", aVar);
                    }
                } catch (NumberFormatException e2) {
                    throw new DescriptorValidationException(this, "Could not parse default value: \"" + this.f9483b.getDefaultValue() + '\"', e2, aVar);
                }
            } else if (isRepeated()) {
                this.m = Collections.emptyList();
            } else {
                int i = a.f9488b[w().ordinal()];
                if (i == 1) {
                    this.m = this.l.l().get(0);
                } else if (i != 2) {
                    this.m = w().defaultDefault;
                } else {
                    this.m = null;
                }
            }
            if (!B()) {
                this.e.h.d(this);
            }
            b bVar = this.i;
            if (bVar == null || !bVar.s().getMessageSetWireFormat()) {
                return;
            }
            if (!B()) {
                throw new DescriptorValidationException(this, "MessageSets cannot have fields, only extensions.", aVar);
            }
            if (!D() || z() != Type.MESSAGE) {
                throw new DescriptorValidationException(this, "Extensions of MessageSets must be optional messages.", aVar);
            }
        }

        public static String m(String str) {
            int length = str.length();
            StringBuilder sb = new StringBuilder(length);
            boolean z = false;
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '_') {
                    z = true;
                } else if (z) {
                    if ('a' <= cCharAt && cCharAt <= 'z') {
                        cCharAt = (char) (cCharAt - ' ');
                    }
                    sb.append(cCharAt);
                    z = false;
                } else {
                    sb.append(cCharAt);
                }
            }
            return sb.toString();
        }

        public boolean A() {
            return this.g || (this.e.r() == FileDescriptor.Syntax.PROTO2 && D() && n() == null);
        }

        public boolean B() {
            return this.f9483b.hasExtendee();
        }

        public boolean C() {
            return z() == Type.MESSAGE && isRepeated() && x().s().getMapEntry();
        }

        public boolean D() {
            return this.f9483b.getLabel() == DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL;
        }

        public boolean E() {
            return isRepeated() && getLiteType().isPackable();
        }

        public boolean F() {
            return this.f9483b.getLabel() == DescriptorProtos.FieldDescriptorProto.Label.LABEL_REQUIRED;
        }

        public boolean G() {
            if (this.h != Type.STRING) {
                return false;
            }
            if (o().s().getMapEntry() || a().r() == FileDescriptor.Syntax.PROTO3) {
                return true;
            }
            return a().n().getJavaStringCheckUtf8();
        }

        public final void H(DescriptorProtos.FieldDescriptorProto fieldDescriptorProto) {
            this.f9483b = fieldDescriptorProto;
        }

        @Override // com.google.protobuf.Descriptors.f
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public DescriptorProtos.FieldDescriptorProto d() {
            return this.f9483b;
        }

        @Override // com.google.protobuf.Descriptors.f
        public FileDescriptor a() {
            return this.e;
        }

        @Override // com.google.protobuf.Descriptors.f
        public String b() {
            return this.c;
        }

        @Override // com.google.protobuf.Descriptors.f
        public String c() {
            return this.f9483b.getName();
        }

        @Override // com.google.protobuf.a0.c
        public q0.a f(q0.a aVar, q0 q0Var) {
            return ((p0.a) aVar).mergeFrom((p0) q0Var);
        }

        @Override // com.google.protobuf.a0.c
        public WireFormat.JavaType getLiteJavaType() {
            return getLiteType().getJavaType();
        }

        @Override // com.google.protobuf.a0.c
        public WireFormat.FieldType getLiteType() {
            return n[this.h.ordinal()];
        }

        @Override // com.google.protobuf.a0.c
        public int getNumber() {
            return this.f9483b.getNumber();
        }

        @Override // com.google.protobuf.a0.c
        public boolean isPacked() {
            if (!E()) {
                return false;
            }
            if (a().r() == FileDescriptor.Syntax.PROTO2) {
                return y().getPacked();
            }
            return !y().hasPacked() || y().getPacked();
        }

        @Override // com.google.protobuf.a0.c
        public boolean isRepeated() {
            return this.f9483b.getLabel() == DescriptorProtos.FieldDescriptorProto.Label.LABEL_REPEATED;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compareTo(FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.i == this.i) {
                return getNumber() - fieldDescriptor.getNumber();
            }
            throw new IllegalArgumentException("FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.");
        }

        public h n() {
            return this.f9484k;
        }

        public b o() {
            return this.i;
        }

        public Object p() {
            if (w() != JavaType.MESSAGE) {
                return this.m;
            }
            throw new UnsupportedOperationException("FieldDescriptor.getDefaultValue() called on an embedded message field.");
        }

        public d r() {
            if (w() == JavaType.ENUM) {
                return this.l;
            }
            throw new UnsupportedOperationException(String.format("This field is not of enum type. (%s)", this.c));
        }

        public b s() {
            if (B()) {
                return this.f;
            }
            throw new UnsupportedOperationException(String.format("This field is not an extension. (%s)", this.c));
        }

        public String toString() {
            return b();
        }

        public int u() {
            return this.f9482a;
        }

        public JavaType w() {
            return this.h.getJavaType();
        }

        public b x() {
            if (w() == JavaType.MESSAGE) {
                return this.j;
            }
            throw new UnsupportedOperationException(String.format("This field is not of message type. (%s)", this.c));
        }

        public DescriptorProtos.FieldOptions y() {
            return this.f9483b.getOptions();
        }

        public Type z() {
            return this.h;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public FieldDescriptor(DescriptorProtos.FieldDescriptorProto fieldDescriptorProto, FileDescriptor fileDescriptor, b bVar, int i, boolean z) throws DescriptorValidationException {
            a aVar = null;
            super(aVar);
            this.f9482a = i;
            this.f9483b = fieldDescriptorProto;
            this.c = Descriptors.c(fileDescriptor, bVar, fieldDescriptorProto.getName());
            this.e = fileDescriptor;
            if (fieldDescriptorProto.hasJsonName()) {
                this.d = fieldDescriptorProto.getJsonName();
            } else {
                this.d = m(fieldDescriptorProto.getName());
            }
            if (fieldDescriptorProto.hasType()) {
                this.h = Type.valueOf(fieldDescriptorProto.getType());
            }
            this.g = fieldDescriptorProto.getProto3Optional();
            if (getNumber() <= 0) {
                throw new DescriptorValidationException(this, "Field numbers must be positive integers.", aVar);
            }
            if (z) {
                if (!fieldDescriptorProto.hasExtendee()) {
                    throw new DescriptorValidationException(this, "FieldDescriptorProto.extendee not set for extension field.", aVar);
                }
                this.i = null;
                if (bVar != null) {
                    this.f = bVar;
                } else {
                    this.f = null;
                }
                if (fieldDescriptorProto.hasOneofIndex()) {
                    throw new DescriptorValidationException(this, "FieldDescriptorProto.oneof_index set for extension field.", aVar);
                }
                this.f9484k = null;
            } else {
                if (fieldDescriptorProto.hasExtendee()) {
                    throw new DescriptorValidationException(this, "FieldDescriptorProto.extendee set for non-extension field.", aVar);
                }
                this.i = bVar;
                if (!fieldDescriptorProto.hasOneofIndex()) {
                    this.f9484k = null;
                } else {
                    if (fieldDescriptorProto.getOneofIndex() < 0 || fieldDescriptorProto.getOneofIndex() >= bVar.d().getOneofDeclCount()) {
                        throw new DescriptorValidationException(this, "FieldDescriptorProto.oneof_index is out of range for type " + bVar.c(), aVar);
                    }
                    h hVar = bVar.r().get(fieldDescriptorProto.getOneofIndex());
                    this.f9484k = hVar;
                    h.k(hVar);
                }
                this.f = null;
            }
            fileDescriptor.h.f(this);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f9488b;

        static {
            int[] iArr = new int[FieldDescriptor.JavaType.values().length];
            f9488b = iArr;
            try {
                iArr[FieldDescriptor.JavaType.ENUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9488b[FieldDescriptor.JavaType.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[FieldDescriptor.Type.values().length];
            f9487a = iArr2;
            try {
                iArr2[FieldDescriptor.Type.INT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9487a[FieldDescriptor.Type.SINT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9487a[FieldDescriptor.Type.SFIXED32.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9487a[FieldDescriptor.Type.UINT32.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9487a[FieldDescriptor.Type.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9487a[FieldDescriptor.Type.INT64.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9487a[FieldDescriptor.Type.SINT64.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9487a[FieldDescriptor.Type.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9487a[FieldDescriptor.Type.UINT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9487a[FieldDescriptor.Type.FIXED64.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9487a[FieldDescriptor.Type.FLOAT.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9487a[FieldDescriptor.Type.DOUBLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9487a[FieldDescriptor.Type.BOOL.ordinal()] = 13;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9487a[FieldDescriptor.Type.STRING.ordinal()] = 14;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9487a[FieldDescriptor.Type.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f9487a[FieldDescriptor.Type.ENUM.ordinal()] = 16;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f9487a[FieldDescriptor.Type.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f9487a[FieldDescriptor.Type.GROUP.ordinal()] = 18;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    public static final class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public DescriptorProtos.DescriptorProto f9490b;
        public final String c;
        public final FileDescriptor d;
        public final b e;
        public final b[] f;
        public final d[] g;
        public final FieldDescriptor[] h;
        public final FieldDescriptor[] i;
        public final h[] j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f9491k;

        public /* synthetic */ b(DescriptorProtos.DescriptorProto descriptorProto, FileDescriptor fileDescriptor, b bVar, int i, a aVar) throws DescriptorValidationException {
            this(descriptorProto, fileDescriptor, bVar, i);
        }

        @Override // com.google.protobuf.Descriptors.f
        public FileDescriptor a() {
            return this.d;
        }

        @Override // com.google.protobuf.Descriptors.f
        public String b() {
            return this.c;
        }

        @Override // com.google.protobuf.Descriptors.f
        public String c() {
            return this.f9490b.getName();
        }

        public final void i() throws DescriptorValidationException {
            for (b bVar : this.f) {
                bVar.i();
            }
            for (FieldDescriptor fieldDescriptor : this.h) {
                fieldDescriptor.l();
            }
            for (FieldDescriptor fieldDescriptor2 : this.i) {
                fieldDescriptor2.l();
            }
        }

        public FieldDescriptor k(String str) {
            f fVarG = this.d.h.g(this.c + '.' + str);
            if (fVarG instanceof FieldDescriptor) {
                return (FieldDescriptor) fVarG;
            }
            return null;
        }

        public FieldDescriptor l(int i) {
            return (FieldDescriptor) this.d.h.d.get(new c.a(this, i));
        }

        public List<d> m() {
            return Collections.unmodifiableList(Arrays.asList(this.g));
        }

        public List<FieldDescriptor> n() {
            return Collections.unmodifiableList(Arrays.asList(this.i));
        }

        public List<FieldDescriptor> o() {
            return Collections.unmodifiableList(Arrays.asList(this.h));
        }

        public List<b> p() {
            return Collections.unmodifiableList(Arrays.asList(this.f));
        }

        public List<h> r() {
            return Collections.unmodifiableList(Arrays.asList(this.j));
        }

        public DescriptorProtos.MessageOptions s() {
            return this.f9490b.getOptions();
        }

        public boolean u() {
            return !this.f9490b.getExtensionRangeList().isEmpty();
        }

        public boolean w(int i) {
            for (DescriptorProtos.DescriptorProto.ExtensionRange extensionRange : this.f9490b.getExtensionRangeList()) {
                if (extensionRange.getStart() <= i && i < extensionRange.getEnd()) {
                    return true;
                }
            }
            return false;
        }

        public final void x(DescriptorProtos.DescriptorProto descriptorProto) {
            this.f9490b = descriptorProto;
            int i = 0;
            int i2 = 0;
            while (true) {
                b[] bVarArr = this.f;
                if (i2 >= bVarArr.length) {
                    break;
                }
                bVarArr[i2].x(descriptorProto.getNestedType(i2));
                i2++;
            }
            int i3 = 0;
            while (true) {
                h[] hVarArr = this.j;
                if (i3 >= hVarArr.length) {
                    break;
                }
                hVarArr[i3].s(descriptorProto.getOneofDecl(i3));
                i3++;
            }
            int i4 = 0;
            while (true) {
                d[] dVarArr = this.g;
                if (i4 >= dVarArr.length) {
                    break;
                }
                dVarArr[i4].m(descriptorProto.getEnumType(i4));
                i4++;
            }
            int i5 = 0;
            while (true) {
                FieldDescriptor[] fieldDescriptorArr = this.h;
                if (i5 >= fieldDescriptorArr.length) {
                    break;
                }
                fieldDescriptorArr[i5].H(descriptorProto.getField(i5));
                i5++;
            }
            while (true) {
                FieldDescriptor[] fieldDescriptorArr2 = this.i;
                if (i >= fieldDescriptorArr2.length) {
                    return;
                }
                fieldDescriptorArr2[i].H(descriptorProto.getExtension(i));
                i++;
            }
        }

        @Override // com.google.protobuf.Descriptors.f
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public DescriptorProtos.DescriptorProto d() {
            return this.f9490b;
        }

        public b(String str) throws DescriptorValidationException {
            String strSubstring;
            String strSubstring2;
            super(null);
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf != -1) {
                strSubstring2 = str.substring(iLastIndexOf + 1);
                strSubstring = str.substring(0, iLastIndexOf);
            } else {
                strSubstring = "";
                strSubstring2 = str;
            }
            this.f9489a = 0;
            this.f9490b = DescriptorProtos.DescriptorProto.newBuilder().W(strSubstring2).n(DescriptorProtos.DescriptorProto.ExtensionRange.newBuilder().G(1).D(536870912).build()).build();
            this.c = str;
            this.e = null;
            this.f = new b[0];
            this.g = new d[0];
            this.h = new FieldDescriptor[0];
            this.i = new FieldDescriptor[0];
            this.j = new h[0];
            this.f9491k = 0;
            this.d = new FileDescriptor(strSubstring, this);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public b(DescriptorProtos.DescriptorProto descriptorProto, FileDescriptor fileDescriptor, b bVar, int i) throws DescriptorValidationException {
            a aVar = null;
            super(aVar);
            this.f9489a = i;
            this.f9490b = descriptorProto;
            this.c = Descriptors.c(fileDescriptor, bVar, descriptorProto.getName());
            this.d = fileDescriptor;
            this.e = bVar;
            this.j = new h[descriptorProto.getOneofDeclCount()];
            for (int i2 = 0; i2 < descriptorProto.getOneofDeclCount(); i2++) {
                this.j[i2] = new h(descriptorProto.getOneofDecl(i2), fileDescriptor, this, i2, null);
            }
            this.f = new b[descriptorProto.getNestedTypeCount()];
            for (int i3 = 0; i3 < descriptorProto.getNestedTypeCount(); i3++) {
                this.f[i3] = new b(descriptorProto.getNestedType(i3), fileDescriptor, this, i3);
            }
            this.g = new d[descriptorProto.getEnumTypeCount()];
            for (int i4 = 0; i4 < descriptorProto.getEnumTypeCount(); i4++) {
                this.g[i4] = new d(descriptorProto.getEnumType(i4), fileDescriptor, this, i4, null);
            }
            this.h = new FieldDescriptor[descriptorProto.getFieldCount()];
            for (int i5 = 0; i5 < descriptorProto.getFieldCount(); i5++) {
                this.h[i5] = new FieldDescriptor(descriptorProto.getField(i5), fileDescriptor, this, i5, false, null);
            }
            this.i = new FieldDescriptor[descriptorProto.getExtensionCount()];
            for (int i6 = 0; i6 < descriptorProto.getExtensionCount(); i6++) {
                this.i[i6] = new FieldDescriptor(descriptorProto.getExtension(i6), fileDescriptor, this, i6, true, null);
            }
            for (int i7 = 0; i7 < descriptorProto.getOneofDeclCount(); i7++) {
                h hVar = this.j[i7];
                hVar.g = new FieldDescriptor[hVar.n()];
                this.j[i7].f = 0;
            }
            for (int i8 = 0; i8 < descriptorProto.getFieldCount(); i8++) {
                h hVarN = this.h[i8].n();
                if (hVarN != null) {
                    hVarN.g[h.k(hVarN)] = this.h[i8];
                }
            }
            int i9 = 0;
            for (h hVar2 : this.j) {
                if (hVar2.r()) {
                    i9++;
                } else if (i9 > 0) {
                    throw new DescriptorValidationException(this, "Synthetic oneofs must come last.", aVar);
                }
            }
            this.f9491k = this.j.length - i9;
            fileDescriptor.h.f(this);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f9493b;
        public final Map<String, f> c = new HashMap();
        public final Map<a, FieldDescriptor> d = new HashMap();
        public final Map<a, e> e = new HashMap();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<FileDescriptor> f9492a = new HashSet();

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final f f9494a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f9495b;

            public a(f fVar, int i) {
                this.f9494a = fVar;
                this.f9495b = i;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f9494a == aVar.f9494a && this.f9495b == aVar.f9495b;
            }

            public int hashCode() {
                return (this.f9494a.hashCode() * 65535) + this.f9495b;
            }
        }

        public static final class b extends f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f9496a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f9497b;
            public final FileDescriptor c;

            public b(String str, String str2, FileDescriptor fileDescriptor) {
                super(null);
                this.c = fileDescriptor;
                this.f9497b = str2;
                this.f9496a = str;
            }

            @Override // com.google.protobuf.Descriptors.f
            public FileDescriptor a() {
                return this.c;
            }

            @Override // com.google.protobuf.Descriptors.f
            public String b() {
                return this.f9497b;
            }

            @Override // com.google.protobuf.Descriptors.f
            public String c() {
                return this.f9496a;
            }

            @Override // com.google.protobuf.Descriptors.f
            public p0 d() {
                return this.c.d();
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.Descriptors$c$c, reason: collision with other inner class name */
        public enum EnumC0255c {
            TYPES_ONLY,
            AGGREGATES_ONLY,
            ALL_SYMBOLS
        }

        public c(FileDescriptor[] fileDescriptorArr, boolean z) {
            this.f9493b = z;
            for (FileDescriptor fileDescriptor : fileDescriptorArr) {
                this.f9492a.add(fileDescriptor);
                i(fileDescriptor);
            }
            for (FileDescriptor fileDescriptor2 : this.f9492a) {
                try {
                    e(fileDescriptor2.o(), fileDescriptor2);
                } catch (DescriptorValidationException e) {
                    throw new AssertionError(e);
                }
            }
        }

        public static void m(f fVar) throws DescriptorValidationException {
            String strC = fVar.c();
            a aVar = null;
            if (strC.length() == 0) {
                throw new DescriptorValidationException(fVar, "Missing name.", aVar);
            }
            for (int i = 0; i < strC.length(); i++) {
                char cCharAt = strC.charAt(i);
                if (('a' > cCharAt || cCharAt > 'z') && (('A' > cCharAt || cCharAt > 'Z') && cCharAt != '_' && ('0' > cCharAt || cCharAt > '9' || i <= 0))) {
                    throw new DescriptorValidationException(fVar, '\"' + strC + "\" is not a valid identifier.", aVar);
                }
            }
        }

        public void c(e eVar) {
            a aVar = new a(eVar.i(), eVar.getNumber());
            e eVarPut = this.e.put(aVar, eVar);
            if (eVarPut != null) {
                this.e.put(aVar, eVarPut);
            }
        }

        public void d(FieldDescriptor fieldDescriptor) throws DescriptorValidationException {
            a aVar = new a(fieldDescriptor.o(), fieldDescriptor.getNumber());
            FieldDescriptor fieldDescriptorPut = this.d.put(aVar, fieldDescriptor);
            if (fieldDescriptorPut == null) {
                return;
            }
            this.d.put(aVar, fieldDescriptorPut);
            throw new DescriptorValidationException(fieldDescriptor, "Field number " + fieldDescriptor.getNumber() + " has already been used in \"" + fieldDescriptor.o().b() + "\" by field \"" + fieldDescriptorPut.c() + "\".", (a) null);
        }

        public void e(String str, FileDescriptor fileDescriptor) throws DescriptorValidationException {
            String strSubstring;
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf == -1) {
                strSubstring = str;
            } else {
                e(str.substring(0, iLastIndexOf), fileDescriptor);
                strSubstring = str.substring(iLastIndexOf + 1);
            }
            f fVarPut = this.c.put(str, new b(strSubstring, str, fileDescriptor));
            if (fVarPut != null) {
                this.c.put(str, fVarPut);
                if (fVarPut instanceof b) {
                    return;
                }
                throw new DescriptorValidationException(fileDescriptor, '\"' + strSubstring + "\" is already defined (as something other than a package) in file \"" + fVarPut.a().c() + "\".", (a) null);
            }
        }

        public void f(f fVar) throws DescriptorValidationException {
            m(fVar);
            String strB = fVar.b();
            f fVarPut = this.c.put(strB, fVar);
            if (fVarPut != null) {
                this.c.put(strB, fVarPut);
                a aVar = null;
                if (fVar.a() != fVarPut.a()) {
                    throw new DescriptorValidationException(fVar, '\"' + strB + "\" is already defined in file \"" + fVarPut.a().c() + "\".", aVar);
                }
                int iLastIndexOf = strB.lastIndexOf(46);
                if (iLastIndexOf == -1) {
                    throw new DescriptorValidationException(fVar, '\"' + strB + "\" is already defined.", aVar);
                }
                throw new DescriptorValidationException(fVar, '\"' + strB.substring(iLastIndexOf + 1) + "\" is already defined in \"" + strB.substring(0, iLastIndexOf) + "\".", aVar);
            }
        }

        public f g(String str) {
            return h(str, EnumC0255c.ALL_SYMBOLS);
        }

        public f h(String str, EnumC0255c enumC0255c) {
            f fVar = this.c.get(str);
            if (fVar != null && (enumC0255c == EnumC0255c.ALL_SYMBOLS || ((enumC0255c == EnumC0255c.TYPES_ONLY && k(fVar)) || (enumC0255c == EnumC0255c.AGGREGATES_ONLY && j(fVar))))) {
                return fVar;
            }
            Iterator<FileDescriptor> it = this.f9492a.iterator();
            while (it.hasNext()) {
                f fVar2 = it.next().h.c.get(str);
                if (fVar2 != null && (enumC0255c == EnumC0255c.ALL_SYMBOLS || ((enumC0255c == EnumC0255c.TYPES_ONLY && k(fVar2)) || (enumC0255c == EnumC0255c.AGGREGATES_ONLY && j(fVar2))))) {
                    return fVar2;
                }
            }
            return null;
        }

        public final void i(FileDescriptor fileDescriptor) {
            for (FileDescriptor fileDescriptor2 : fileDescriptor.p()) {
                if (this.f9492a.add(fileDescriptor2)) {
                    i(fileDescriptor2);
                }
            }
        }

        public boolean j(f fVar) {
            return (fVar instanceof b) || (fVar instanceof d) || (fVar instanceof b) || (fVar instanceof i);
        }

        public boolean k(f fVar) {
            return (fVar instanceof b) || (fVar instanceof d);
        }

        public f l(String str, f fVar, EnumC0255c enumC0255c) throws DescriptorValidationException {
            f fVarH;
            String string;
            if (str.startsWith(".")) {
                string = str.substring(1);
                fVarH = h(string, enumC0255c);
            } else {
                int iIndexOf = str.indexOf(46);
                String strSubstring = iIndexOf == -1 ? str : str.substring(0, iIndexOf);
                StringBuilder sb = new StringBuilder(fVar.b());
                while (true) {
                    int iLastIndexOf = sb.lastIndexOf(".");
                    if (iLastIndexOf == -1) {
                        fVarH = h(str, enumC0255c);
                        string = str;
                        break;
                    }
                    int i = iLastIndexOf + 1;
                    sb.setLength(i);
                    sb.append(strSubstring);
                    f fVarH2 = h(sb.toString(), EnumC0255c.AGGREGATES_ONLY);
                    if (fVarH2 != null) {
                        if (iIndexOf != -1) {
                            sb.setLength(i);
                            sb.append(str);
                            fVarH = h(sb.toString(), enumC0255c);
                        } else {
                            fVarH = fVarH2;
                        }
                        string = sb.toString();
                        break;
                    }
                    sb.setLength(iLastIndexOf);
                }
            }
            if (fVarH != null) {
                return fVarH;
            }
            if (!this.f9493b || enumC0255c != EnumC0255c.TYPES_ONLY) {
                throw new DescriptorValidationException(fVar, '\"' + str + "\" is not defined.", (a) null);
            }
            Descriptors.f9481a.warning("The descriptor for message type \"" + str + "\" can not be found and a placeholder is created for it");
            b bVar = new b(string);
            this.f9492a.add(bVar.a());
            return bVar;
        }
    }

    public static final class d extends f implements d0.d<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public DescriptorProtos.EnumDescriptorProto f9501b;
        public final String c;
        public final FileDescriptor d;
        public final b e;
        public e[] f;
        public final WeakHashMap<Integer, WeakReference<e>> g;

        public /* synthetic */ d(DescriptorProtos.EnumDescriptorProto enumDescriptorProto, FileDescriptor fileDescriptor, b bVar, int i, a aVar) throws DescriptorValidationException {
            this(enumDescriptorProto, fileDescriptor, bVar, i);
        }

        @Override // com.google.protobuf.Descriptors.f
        public FileDescriptor a() {
            return this.d;
        }

        @Override // com.google.protobuf.Descriptors.f
        public String b() {
            return this.c;
        }

        @Override // com.google.protobuf.Descriptors.f
        public String c() {
            return this.f9501b.getName();
        }

        public e h(String str) {
            f fVarG = this.d.h.g(this.c + '.' + str);
            if (fVarG instanceof e) {
                return (e) fVarG;
            }
            return null;
        }

        @Override // com.google.protobuf.d0.d
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public e findValueByNumber(int i) {
            return (e) this.d.h.e.get(new c.a(this, i));
        }

        public e k(int i) {
            e eVarFindValueByNumber = findValueByNumber(i);
            if (eVarFindValueByNumber != null) {
                return eVarFindValueByNumber;
            }
            synchronized (this) {
                try {
                    Integer num = new Integer(i);
                    WeakReference<e> weakReference = this.g.get(num);
                    if (weakReference != null) {
                        eVarFindValueByNumber = weakReference.get();
                    }
                    if (eVarFindValueByNumber == null) {
                        eVarFindValueByNumber = new e(this.d, this, num, (a) null);
                        this.g.put(num, new WeakReference<>(eVarFindValueByNumber));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return eVarFindValueByNumber;
        }

        public List<e> l() {
            return Collections.unmodifiableList(Arrays.asList(this.f));
        }

        public final void m(DescriptorProtos.EnumDescriptorProto enumDescriptorProto) {
            this.f9501b = enumDescriptorProto;
            int i = 0;
            while (true) {
                e[] eVarArr = this.f;
                if (i >= eVarArr.length) {
                    return;
                }
                eVarArr[i].k(enumDescriptorProto.getValue(i));
                i++;
            }
        }

        @Override // com.google.protobuf.Descriptors.f
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public DescriptorProtos.EnumDescriptorProto d() {
            return this.f9501b;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public d(DescriptorProtos.EnumDescriptorProto enumDescriptorProto, FileDescriptor fileDescriptor, b bVar, int i) throws DescriptorValidationException {
            a aVar = null;
            super(aVar);
            this.g = new WeakHashMap<>();
            this.f9500a = i;
            this.f9501b = enumDescriptorProto;
            this.c = Descriptors.c(fileDescriptor, bVar, enumDescriptorProto.getName());
            this.d = fileDescriptor;
            this.e = bVar;
            if (enumDescriptorProto.getValueCount() == 0) {
                throw new DescriptorValidationException(this, "Enums must contain at least one value.", aVar);
            }
            this.f = new e[enumDescriptorProto.getValueCount()];
            for (int i2 = 0; i2 < enumDescriptorProto.getValueCount(); i2++) {
                this.f[i2] = new e(enumDescriptorProto.getValue(i2), fileDescriptor, this, i2, null);
            }
            fileDescriptor.h.f(this);
        }
    }

    public static final class e extends f implements d0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public DescriptorProtos.EnumValueDescriptorProto f9503b;
        public final String c;
        public final FileDescriptor d;
        public final d e;

        public /* synthetic */ e(DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto, FileDescriptor fileDescriptor, d dVar, int i, a aVar) throws DescriptorValidationException {
            this(enumValueDescriptorProto, fileDescriptor, dVar, i);
        }

        @Override // com.google.protobuf.Descriptors.f
        public FileDescriptor a() {
            return this.d;
        }

        @Override // com.google.protobuf.Descriptors.f
        public String b() {
            return this.c;
        }

        @Override // com.google.protobuf.Descriptors.f
        public String c() {
            return this.f9503b.getName();
        }

        @Override // com.google.protobuf.d0.c
        public int getNumber() {
            return this.f9503b.getNumber();
        }

        public int h() {
            return this.f9502a;
        }

        public d i() {
            return this.e;
        }

        public final void k(DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto) {
            this.f9503b = enumValueDescriptorProto;
        }

        @Override // com.google.protobuf.Descriptors.f
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public DescriptorProtos.EnumValueDescriptorProto d() {
            return this.f9503b;
        }

        public String toString() {
            return this.f9503b.getName();
        }

        public /* synthetic */ e(FileDescriptor fileDescriptor, d dVar, Integer num, a aVar) {
            this(fileDescriptor, dVar, num);
        }

        public e(DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto, FileDescriptor fileDescriptor, d dVar, int i) throws DescriptorValidationException {
            super(null);
            this.f9502a = i;
            this.f9503b = enumValueDescriptorProto;
            this.d = fileDescriptor;
            this.e = dVar;
            this.c = dVar.b() + '.' + enumValueDescriptorProto.getName();
            fileDescriptor.h.f(this);
            fileDescriptor.h.c(this);
        }

        public e(FileDescriptor fileDescriptor, d dVar, Integer num) {
            super(null);
            DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProtoP = DescriptorProtos.EnumValueDescriptorProto.newBuilder().F("UNKNOWN_ENUM_VALUE_" + dVar.c() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + num).G(num.intValue()).build();
            this.f9502a = -1;
            this.f9503b = enumValueDescriptorProtoP;
            this.d = fileDescriptor;
            this.e = dVar;
            this.c = dVar.b() + '.' + enumValueDescriptorProtoP.getName();
        }
    }

    public static abstract class f {
        public f() {
        }

        public /* synthetic */ f(a aVar) {
            this();
        }

        public abstract FileDescriptor a();

        public abstract String b();

        public abstract String c();

        public abstract p0 d();
    }

    public static final class g extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public DescriptorProtos.MethodDescriptorProto f9505b;
        public final String c;
        public final FileDescriptor d;
        public final i e;
        public b f;
        public b g;

        public /* synthetic */ g(DescriptorProtos.MethodDescriptorProto methodDescriptorProto, FileDescriptor fileDescriptor, i iVar, int i, a aVar) throws DescriptorValidationException {
            this(methodDescriptorProto, fileDescriptor, iVar, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i() throws DescriptorValidationException {
            c cVar = this.d.h;
            String inputType = this.f9505b.getInputType();
            c.EnumC0255c enumC0255c = c.EnumC0255c.TYPES_ONLY;
            f fVarL = cVar.l(inputType, this, enumC0255c);
            a aVar = null;
            if (!(fVarL instanceof b)) {
                throw new DescriptorValidationException(this, '\"' + this.f9505b.getInputType() + "\" is not a message type.", aVar);
            }
            this.f = (b) fVarL;
            f fVarL2 = this.d.h.l(this.f9505b.getOutputType(), this, enumC0255c);
            if (fVarL2 instanceof b) {
                this.g = (b) fVarL2;
                return;
            }
            throw new DescriptorValidationException(this, '\"' + this.f9505b.getOutputType() + "\" is not a message type.", aVar);
        }

        @Override // com.google.protobuf.Descriptors.f
        public FileDescriptor a() {
            return this.d;
        }

        @Override // com.google.protobuf.Descriptors.f
        public String b() {
            return this.c;
        }

        @Override // com.google.protobuf.Descriptors.f
        public String c() {
            return this.f9505b.getName();
        }

        public final void k(DescriptorProtos.MethodDescriptorProto methodDescriptorProto) {
            this.f9505b = methodDescriptorProto;
        }

        @Override // com.google.protobuf.Descriptors.f
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public DescriptorProtos.MethodDescriptorProto d() {
            return this.f9505b;
        }

        public g(DescriptorProtos.MethodDescriptorProto methodDescriptorProto, FileDescriptor fileDescriptor, i iVar, int i) throws DescriptorValidationException {
            super(null);
            this.f9504a = i;
            this.f9505b = methodDescriptorProto;
            this.d = fileDescriptor;
            this.e = iVar;
            this.c = iVar.b() + '.' + methodDescriptorProto.getName();
            fileDescriptor.h.f(this);
        }
    }

    public static final class h extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public DescriptorProtos.OneofDescriptorProto f9507b;
        public final String c;
        public final FileDescriptor d;
        public b e;
        public int f;
        public FieldDescriptor[] g;

        public /* synthetic */ h(DescriptorProtos.OneofDescriptorProto oneofDescriptorProto, FileDescriptor fileDescriptor, b bVar, int i, a aVar) throws DescriptorValidationException {
            this(oneofDescriptorProto, fileDescriptor, bVar, i);
        }

        public static /* synthetic */ int k(h hVar) {
            int i = hVar.f;
            hVar.f = i + 1;
            return i;
        }

        @Override // com.google.protobuf.Descriptors.f
        public FileDescriptor a() {
            return this.d;
        }

        @Override // com.google.protobuf.Descriptors.f
        public String b() {
            return this.c;
        }

        @Override // com.google.protobuf.Descriptors.f
        public String c() {
            return this.f9507b.getName();
        }

        public b m() {
            return this.e;
        }

        public int n() {
            return this.f;
        }

        public List<FieldDescriptor> o() {
            return Collections.unmodifiableList(Arrays.asList(this.g));
        }

        public int p() {
            return this.f9506a;
        }

        public boolean r() {
            FieldDescriptor[] fieldDescriptorArr = this.g;
            return fieldDescriptorArr.length == 1 && fieldDescriptorArr[0].g;
        }

        public final void s(DescriptorProtos.OneofDescriptorProto oneofDescriptorProto) {
            this.f9507b = oneofDescriptorProto;
        }

        @Override // com.google.protobuf.Descriptors.f
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public DescriptorProtos.OneofDescriptorProto d() {
            return this.f9507b;
        }

        public h(DescriptorProtos.OneofDescriptorProto oneofDescriptorProto, FileDescriptor fileDescriptor, b bVar, int i) throws DescriptorValidationException {
            super(null);
            this.f9507b = oneofDescriptorProto;
            this.c = Descriptors.c(fileDescriptor, bVar, oneofDescriptorProto.getName());
            this.d = fileDescriptor;
            this.f9506a = i;
            this.e = bVar;
            this.f = 0;
        }
    }

    public static final class i extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public DescriptorProtos.ServiceDescriptorProto f9509b;
        public final String c;
        public final FileDescriptor d;
        public g[] e;

        public /* synthetic */ i(DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto, FileDescriptor fileDescriptor, int i, a aVar) throws DescriptorValidationException {
            this(serviceDescriptorProto, fileDescriptor, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i() throws DescriptorValidationException {
            for (g gVar : this.e) {
                gVar.i();
            }
        }

        @Override // com.google.protobuf.Descriptors.f
        public FileDescriptor a() {
            return this.d;
        }

        @Override // com.google.protobuf.Descriptors.f
        public String b() {
            return this.c;
        }

        @Override // com.google.protobuf.Descriptors.f
        public String c() {
            return this.f9509b.getName();
        }

        public final void k(DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto) {
            this.f9509b = serviceDescriptorProto;
            int i = 0;
            while (true) {
                g[] gVarArr = this.e;
                if (i >= gVarArr.length) {
                    return;
                }
                gVarArr[i].k(serviceDescriptorProto.getMethod(i));
                i++;
            }
        }

        @Override // com.google.protobuf.Descriptors.f
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public DescriptorProtos.ServiceDescriptorProto d() {
            return this.f9509b;
        }

        public i(DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto, FileDescriptor fileDescriptor, int i) throws DescriptorValidationException {
            super(null);
            this.f9508a = i;
            this.f9509b = serviceDescriptorProto;
            this.c = Descriptors.c(fileDescriptor, null, serviceDescriptorProto.getName());
            this.d = fileDescriptor;
            this.e = new g[serviceDescriptorProto.getMethodCount()];
            for (int i2 = 0; i2 < serviceDescriptorProto.getMethodCount(); i2++) {
                this.e[i2] = new g(serviceDescriptorProto.getMethod(i2), fileDescriptor, this, i2, null);
            }
            fileDescriptor.h.f(this);
        }
    }

    public static String c(FileDescriptor fileDescriptor, b bVar, String str) {
        if (bVar != null) {
            return bVar.b() + '.' + str;
        }
        String strO = fileDescriptor.o();
        if (strO.isEmpty()) {
            return str;
        }
        return strO + '.' + str;
    }

    public static final class FileDescriptor extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public DescriptorProtos.FileDescriptorProto f9485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b[] f9486b;
        public final d[] c;
        public final i[] d;
        public final FieldDescriptor[] e;
        public final FileDescriptor[] f;
        public final FileDescriptor[] g;
        public final c h;

        public enum Syntax {
            UNKNOWN("unknown"),
            PROTO2("proto2"),
            PROTO3("proto3");

            private final String name;

            Syntax(String str) {
                this.name = str;
            }
        }

        @Deprecated
        public interface a {
            s assignDescriptors(FileDescriptor fileDescriptor);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public FileDescriptor(DescriptorProtos.FileDescriptorProto fileDescriptorProto, FileDescriptor[] fileDescriptorArr, c cVar, boolean z) throws DescriptorValidationException {
            a aVar = null;
            super(aVar);
            this.h = cVar;
            this.f9485a = fileDescriptorProto;
            this.f = (FileDescriptor[]) fileDescriptorArr.clone();
            HashMap map = new HashMap();
            for (FileDescriptor fileDescriptor : fileDescriptorArr) {
                map.put(fileDescriptor.c(), fileDescriptor);
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < fileDescriptorProto.getPublicDependencyCount(); i++) {
                int publicDependency = fileDescriptorProto.getPublicDependency(i);
                if (publicDependency < 0 || publicDependency >= fileDescriptorProto.getDependencyCount()) {
                    throw new DescriptorValidationException(this, "Invalid public dependency index.", aVar);
                }
                String dependency = fileDescriptorProto.getDependency(publicDependency);
                FileDescriptor fileDescriptor2 = (FileDescriptor) map.get(dependency);
                if (fileDescriptor2 != null) {
                    arrayList.add(fileDescriptor2);
                } else if (!z) {
                    throw new DescriptorValidationException(this, "Invalid public dependency: " + dependency, aVar);
                }
            }
            FileDescriptor[] fileDescriptorArr2 = new FileDescriptor[arrayList.size()];
            this.g = fileDescriptorArr2;
            arrayList.toArray(fileDescriptorArr2);
            cVar.e(o(), this);
            this.f9486b = new b[fileDescriptorProto.getMessageTypeCount()];
            for (int i2 = 0; i2 < fileDescriptorProto.getMessageTypeCount(); i2++) {
                this.f9486b[i2] = new b(fileDescriptorProto.getMessageType(i2), this, null, i2, null);
            }
            this.c = new d[fileDescriptorProto.getEnumTypeCount()];
            for (int i3 = 0; i3 < fileDescriptorProto.getEnumTypeCount(); i3++) {
                this.c[i3] = new d(fileDescriptorProto.getEnumType(i3), this, null, i3, null);
            }
            this.d = new i[fileDescriptorProto.getServiceCount()];
            for (int i4 = 0; i4 < fileDescriptorProto.getServiceCount(); i4++) {
                this.d[i4] = new i(fileDescriptorProto.getService(i4), this, i4, aVar);
            }
            this.e = new FieldDescriptor[fileDescriptorProto.getExtensionCount()];
            for (int i5 = 0; i5 < fileDescriptorProto.getExtensionCount(); i5++) {
                this.e[i5] = new FieldDescriptor(fileDescriptorProto.getExtension(i5), this, null, i5, true, null);
            }
        }

        public static FileDescriptor h(DescriptorProtos.FileDescriptorProto fileDescriptorProto, FileDescriptor[] fileDescriptorArr, boolean z) throws DescriptorValidationException {
            FileDescriptor fileDescriptor = new FileDescriptor(fileDescriptorProto, fileDescriptorArr, new c(fileDescriptorArr, z), z);
            fileDescriptor.i();
            return fileDescriptor;
        }

        private void i() throws DescriptorValidationException {
            for (b bVar : this.f9486b) {
                bVar.i();
            }
            for (i iVar : this.d) {
                iVar.i();
            }
            for (FieldDescriptor fieldDescriptor : this.e) {
                fieldDescriptor.l();
            }
        }

        public static FileDescriptor s(String[] strArr, FileDescriptor[] fileDescriptorArr) {
            try {
                DescriptorProtos.FileDescriptorProto from = DescriptorProtos.FileDescriptorProto.parseFrom(w(strArr));
                try {
                    return h(from, fileDescriptorArr, true);
                } catch (DescriptorValidationException e) {
                    throw new IllegalArgumentException("Invalid embedded descriptor for \"" + from.getName() + "\".", e);
                }
            } catch (InvalidProtocolBufferException e2) {
                throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e2);
            }
        }

        @Deprecated
        public static void u(String[] strArr, FileDescriptor[] fileDescriptorArr, a aVar) {
            byte[] bArrW = w(strArr);
            try {
                DescriptorProtos.FileDescriptorProto from = DescriptorProtos.FileDescriptorProto.parseFrom(bArrW);
                try {
                    FileDescriptor fileDescriptorH = h(from, fileDescriptorArr, true);
                    s sVarAssignDescriptors = aVar.assignDescriptors(fileDescriptorH);
                    if (sVarAssignDescriptors != null) {
                        try {
                            fileDescriptorH.x(DescriptorProtos.FileDescriptorProto.parseFrom(bArrW, sVarAssignDescriptors));
                        } catch (InvalidProtocolBufferException e) {
                            throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e);
                        }
                    }
                } catch (DescriptorValidationException e2) {
                    throw new IllegalArgumentException("Invalid embedded descriptor for \"" + from.getName() + "\".", e2);
                }
            } catch (InvalidProtocolBufferException e3) {
                throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e3);
            }
        }

        public static byte[] w(String[] strArr) {
            if (strArr.length == 1) {
                return strArr[0].getBytes(d0.f9619b);
            }
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                sb.append(str);
            }
            return sb.toString().getBytes(d0.f9619b);
        }

        @Override // com.google.protobuf.Descriptors.f
        public FileDescriptor a() {
            return this;
        }

        @Override // com.google.protobuf.Descriptors.f
        public String b() {
            return this.f9485a.getName();
        }

        @Override // com.google.protobuf.Descriptors.f
        public String c() {
            return this.f9485a.getName();
        }

        public FieldDescriptor k(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            String strO = o();
            if (!strO.isEmpty()) {
                str = strO + '.' + str;
            }
            f fVarG = this.h.g(str);
            if ((fVarG instanceof FieldDescriptor) && fVarG.a() == this) {
                return (FieldDescriptor) fVarG;
            }
            return null;
        }

        public List<d> l() {
            return Collections.unmodifiableList(Arrays.asList(this.c));
        }

        public List<b> m() {
            return Collections.unmodifiableList(Arrays.asList(this.f9486b));
        }

        public DescriptorProtos.FileOptions n() {
            return this.f9485a.getOptions();
        }

        public String o() {
            return this.f9485a.getPackage();
        }

        public List<FileDescriptor> p() {
            return Collections.unmodifiableList(Arrays.asList(this.g));
        }

        public Syntax r() {
            Syntax syntax = Syntax.PROTO3;
            return syntax.name.equals(this.f9485a.getSyntax()) ? syntax : Syntax.PROTO2;
        }

        public final void x(DescriptorProtos.FileDescriptorProto fileDescriptorProto) {
            this.f9485a = fileDescriptorProto;
            int i = 0;
            int i2 = 0;
            while (true) {
                b[] bVarArr = this.f9486b;
                if (i2 >= bVarArr.length) {
                    break;
                }
                bVarArr[i2].x(fileDescriptorProto.getMessageType(i2));
                i2++;
            }
            int i3 = 0;
            while (true) {
                d[] dVarArr = this.c;
                if (i3 >= dVarArr.length) {
                    break;
                }
                dVarArr[i3].m(fileDescriptorProto.getEnumType(i3));
                i3++;
            }
            int i4 = 0;
            while (true) {
                i[] iVarArr = this.d;
                if (i4 >= iVarArr.length) {
                    break;
                }
                iVarArr[i4].k(fileDescriptorProto.getService(i4));
                i4++;
            }
            while (true) {
                FieldDescriptor[] fieldDescriptorArr = this.e;
                if (i >= fieldDescriptorArr.length) {
                    return;
                }
                fieldDescriptorArr[i].H(fileDescriptorProto.getExtension(i));
                i++;
            }
        }

        public boolean y() {
            return r() == Syntax.PROTO3;
        }

        @Override // com.google.protobuf.Descriptors.f
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public DescriptorProtos.FileDescriptorProto d() {
            return this.f9485a;
        }

        public FileDescriptor(String str, b bVar) throws DescriptorValidationException {
            super(null);
            c cVar = new c(new FileDescriptor[0], true);
            this.h = cVar;
            this.f9485a = DescriptorProtos.FileDescriptorProto.newBuilder().V(bVar.b() + ".placeholder.proto").W(str).n(bVar.d()).build();
            this.f = new FileDescriptor[0];
            this.g = new FileDescriptor[0];
            this.f9486b = new b[]{bVar};
            this.c = new d[0];
            this.d = new i[0];
            this.e = new FieldDescriptor[0];
            cVar.e(str, this);
            cVar.f(bVar);
        }
    }
}
