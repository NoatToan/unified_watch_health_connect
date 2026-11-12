package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes5.dex */
public final class WireFormat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f9367a = c(1, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f9368b = c(1, 4);
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

        public final enum a extends FieldType {
            public a(String str, int i, JavaType javaType, int i2) {
                super(str, i, javaType, i2);
            }

            @Override // com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType
            public boolean isPackable() {
                return false;
            }
        }

        public final enum b extends FieldType {
            public b(String str, int i, JavaType javaType, int i2) {
                super(str, i, javaType, i2);
            }

            @Override // com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType
            public boolean isPackable() {
                return false;
            }
        }

        public final enum c extends FieldType {
            public c(String str, int i, JavaType javaType, int i2) {
                super(str, i, javaType, i2);
            }

            @Override // com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType
            public boolean isPackable() {
                return false;
            }
        }

        public final enum d extends FieldType {
            public d(String str, int i, JavaType javaType, int i2) {
                super(str, i, javaType, i2);
            }

            @Override // com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType
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

        public static FieldType valueOf(String str) {
            return (FieldType) Enum.valueOf(FieldType.class, str);
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

    public static int a(int i) {
        return i >>> 3;
    }

    public static int b(int i) {
        return i & 7;
    }

    public static int c(int i, int i2) {
        return (i << 3) | i2;
    }
}
