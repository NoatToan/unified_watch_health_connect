package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class WireFormat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f9593a = c(1, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f9594b = c(1, 4);
    public static final int c = c(2, 0);
    public static final int d = c(3, 2);

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
    public static class FieldType {
        private static final /* synthetic */ FieldType[] $VALUES;
        public static final FieldType BOOL;
        public static final FieldType BYTES;
        public static final FieldType DOUBLE;
        public static final FieldType ENUM;
        public static final FieldType FIXED32;
        public static final FieldType FIXED64;
        public static final FieldType FLOAT;
        public static final FieldType GROUP;
        public static final FieldType INT32;
        public static final FieldType INT64;
        public static final FieldType MESSAGE;
        public static final FieldType SFIXED32;
        public static final FieldType SFIXED64;
        public static final FieldType SINT32;
        public static final FieldType SINT64;
        public static final FieldType STRING;
        public static final FieldType UINT32;
        public static final FieldType UINT64;
        private final JavaType javaType;
        private final int wireType;

        public static enum a extends FieldType {
            public a(String str, int i, JavaType javaType, int i2) {
                super(str, i, javaType, i2, null);
            }

            @Override // com.google.protobuf.WireFormat.FieldType
            public boolean isPackable() {
                return false;
            }
        }

        public static enum b extends FieldType {
            public b(String str, int i, JavaType javaType, int i2) {
                super(str, i, javaType, i2, null);
            }

            @Override // com.google.protobuf.WireFormat.FieldType
            public boolean isPackable() {
                return false;
            }
        }

        public static enum c extends FieldType {
            public c(String str, int i, JavaType javaType, int i2) {
                super(str, i, javaType, i2, null);
            }

            @Override // com.google.protobuf.WireFormat.FieldType
            public boolean isPackable() {
                return false;
            }
        }

        public static enum d extends FieldType {
            public d(String str, int i, JavaType javaType, int i2) {
                super(str, i, javaType, i2, null);
            }

            @Override // com.google.protobuf.WireFormat.FieldType
            public boolean isPackable() {
                return false;
            }
        }

        static {
            FieldType fieldType = new FieldType("DOUBLE", 0, JavaType.DOUBLE, 1);
            DOUBLE = fieldType;
            FieldType fieldType2 = new FieldType("FLOAT", 1, JavaType.FLOAT, 5);
            FLOAT = fieldType2;
            JavaType javaType = JavaType.LONG;
            FieldType fieldType3 = new FieldType("INT64", 2, javaType, 0);
            INT64 = fieldType3;
            FieldType fieldType4 = new FieldType("UINT64", 3, javaType, 0);
            UINT64 = fieldType4;
            JavaType javaType2 = JavaType.INT;
            FieldType fieldType5 = new FieldType("INT32", 4, javaType2, 0);
            INT32 = fieldType5;
            FieldType fieldType6 = new FieldType("FIXED64", 5, javaType, 1);
            FIXED64 = fieldType6;
            FieldType fieldType7 = new FieldType("FIXED32", 6, javaType2, 5);
            FIXED32 = fieldType7;
            FieldType fieldType8 = new FieldType("BOOL", 7, JavaType.BOOLEAN, 0);
            BOOL = fieldType8;
            a aVar = new a("STRING", 8, JavaType.STRING, 2);
            STRING = aVar;
            JavaType javaType3 = JavaType.MESSAGE;
            b bVar = new b("GROUP", 9, javaType3, 3);
            GROUP = bVar;
            c cVar = new c("MESSAGE", 10, javaType3, 2);
            MESSAGE = cVar;
            d dVar = new d("BYTES", 11, JavaType.BYTE_STRING, 2);
            BYTES = dVar;
            FieldType fieldType9 = new FieldType("UINT32", 12, javaType2, 0);
            UINT32 = fieldType9;
            FieldType fieldType10 = new FieldType("ENUM", 13, JavaType.ENUM, 0);
            ENUM = fieldType10;
            FieldType fieldType11 = new FieldType("SFIXED32", 14, javaType2, 5);
            SFIXED32 = fieldType11;
            FieldType fieldType12 = new FieldType("SFIXED64", 15, javaType, 1);
            SFIXED64 = fieldType12;
            FieldType fieldType13 = new FieldType("SINT32", 16, javaType2, 0);
            SINT32 = fieldType13;
            FieldType fieldType14 = new FieldType("SINT64", 17, javaType, 0);
            SINT64 = fieldType14;
            $VALUES = new FieldType[]{fieldType, fieldType2, fieldType3, fieldType4, fieldType5, fieldType6, fieldType7, fieldType8, aVar, bVar, cVar, dVar, fieldType9, fieldType10, fieldType11, fieldType12, fieldType13, fieldType14};
        }

        public /* synthetic */ FieldType(String str, int i, JavaType javaType, int i2, a aVar) {
            this(str, i, javaType, i2);
        }

        public static FieldType valueOf(String str) {
            return (FieldType) java.lang.Enum.valueOf(FieldType.class, str);
        }

        public static FieldType[] values() {
            return (FieldType[]) $VALUES.clone();
        }

        public JavaType getJavaType() {
            return this.javaType;
        }

        public int getWireType() {
            return this.wireType;
        }

        public boolean isPackable() {
            return true;
        }

        private FieldType(String str, int i, JavaType javaType, int i2) {
            super(str, i);
            this.javaType = javaType;
            this.wireType = i2;
        }
    }

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

        public Object getDefaultDefault() {
            return this.defaultDefault;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9595a;

        static {
            int[] iArr = new int[FieldType.values().length];
            f9595a = iArr;
            try {
                iArr[FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9595a[FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9595a[FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9595a[FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9595a[FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9595a[FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9595a[FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9595a[FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9595a[FieldType.BYTES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9595a[FieldType.UINT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9595a[FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9595a[FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9595a[FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9595a[FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9595a[FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9595a[FieldType.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9595a[FieldType.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f9595a[FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f9596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f9597b;
        public static final b c;
        public static final /* synthetic */ b[] d;

        public static enum a extends b {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.protobuf.WireFormat.b
            public Object a(j jVar) throws IOException {
                return jVar.H();
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.WireFormat$b$b, reason: collision with other inner class name */
        public static enum C0257b extends b {
            public C0257b(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.protobuf.WireFormat.b
            public Object a(j jVar) throws IOException {
                return jVar.I();
            }
        }

        public static enum c extends b {
            public c(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.protobuf.WireFormat.b
            public Object a(j jVar) throws IOException {
                return jVar.q();
            }
        }

        static {
            a aVar = new a("LOOSE", 0);
            f9596a = aVar;
            C0257b c0257b = new C0257b("STRICT", 1);
            f9597b = c0257b;
            c cVar = new c("LAZY", 2);
            c = cVar;
            d = new b[]{aVar, c0257b, cVar};
        }

        public b(String str, int i) {
            super(str, i);
        }

        public static b valueOf(String str) {
            return (b) java.lang.Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }

        public abstract Object a(j jVar) throws IOException;

        public /* synthetic */ b(String str, int i, a aVar) {
            this(str, i);
        }
    }

    public static int a(int i) {
        return i >>> 3;
    }

    public static int b(int i) {
        return i & 7;
    }

    public static int c(int i, int i2) {
        return (i << 3) | i2;
    }

    public static Object d(j jVar, FieldType fieldType, b bVar) throws IOException {
        switch (a.f9595a[fieldType.ordinal()]) {
            case 1:
                return Double.valueOf(jVar.r());
            case 2:
                return Float.valueOf(jVar.v());
            case 3:
                return Long.valueOf(jVar.y());
            case 4:
                return Long.valueOf(jVar.L());
            case 5:
                return Integer.valueOf(jVar.x());
            case 6:
                return Long.valueOf(jVar.u());
            case 7:
                return Integer.valueOf(jVar.t());
            case 8:
                return Boolean.valueOf(jVar.p());
            case 9:
                return jVar.q();
            case 10:
                return Integer.valueOf(jVar.K());
            case 11:
                return Integer.valueOf(jVar.D());
            case 12:
                return Long.valueOf(jVar.E());
            case 13:
                return Integer.valueOf(jVar.F());
            case 14:
                return Long.valueOf(jVar.G());
            case 15:
                return bVar.a(jVar);
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
