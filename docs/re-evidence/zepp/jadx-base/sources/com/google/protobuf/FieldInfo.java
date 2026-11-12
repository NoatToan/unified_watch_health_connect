package com.google.protobuf;

/* JADX INFO: loaded from: classes4.dex */
final class FieldInfo implements Comparable<FieldInfo> {
    private final java.lang.reflect.Field a;
    private final FieldType b;
    private final Class<?> c;
    private final int d;
    private final java.lang.reflect.Field e;
    private final int f;
    private final boolean g;
    private final boolean h;
    private final o i;
    private final java.lang.reflect.Field j;
    private final Class<?> k;
    private final Object l;
    private final Internal.EnumVerifier m;

    public static final class Builder {
        private java.lang.reflect.Field a;
        private FieldType b;
        private int c;
        private java.lang.reflect.Field d;
        private int e;
        private boolean f;
        private boolean g;
        private o h;
        private Class<?> i;
        private Object j;
        private Internal.EnumVerifier k;
        private java.lang.reflect.Field l;

        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public FieldInfo build() {
            o oVar = this.h;
            if (oVar != null) {
                return FieldInfo.f(this.c, this.b, oVar, this.i, this.g, this.k);
            }
            Object obj = this.j;
            if (obj != null) {
                return FieldInfo.e(this.a, this.c, obj, this.k);
            }
            java.lang.reflect.Field field = this.d;
            if (field != null) {
                return this.f ? FieldInfo.j(this.a, this.c, this.b, field, this.e, this.g, this.k) : FieldInfo.i(this.a, this.c, this.b, field, this.e, this.g, this.k);
            }
            Internal.EnumVerifier enumVerifier = this.k;
            if (enumVerifier != null) {
                java.lang.reflect.Field field2 = this.l;
                return field2 == null ? FieldInfo.d(this.a, this.c, this.b, enumVerifier) : FieldInfo.h(this.a, this.c, this.b, enumVerifier, field2);
            }
            java.lang.reflect.Field field3 = this.l;
            return field3 == null ? FieldInfo.c(this.a, this.c, this.b, this.g) : FieldInfo.g(this.a, this.c, this.b, field3);
        }

        public Builder withCachedSizeField(java.lang.reflect.Field field) {
            this.l = field;
            return this;
        }

        public Builder withEnforceUtf8(boolean z) {
            this.g = z;
            return this;
        }

        public Builder withEnumVerifier(Internal.EnumVerifier enumVerifier) {
            this.k = enumVerifier;
            return this;
        }

        public Builder withField(java.lang.reflect.Field field) {
            if (this.h != null) {
                throw new IllegalStateException("Cannot set field when building a oneof.");
            }
            this.a = field;
            return this;
        }

        public Builder withFieldNumber(int i) {
            this.c = i;
            return this;
        }

        public Builder withMapDefaultEntry(Object obj) {
            this.j = obj;
            return this;
        }

        public Builder withOneof(o oVar, Class<?> cls) {
            if (this.a != null || this.d != null) {
                throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
            }
            this.h = oVar;
            this.i = cls;
            return this;
        }

        public Builder withPresence(java.lang.reflect.Field field, int i) {
            this.d = (java.lang.reflect.Field) Internal.b(field, "presenceField");
            this.e = i;
            return this;
        }

        public Builder withRequired(boolean z) {
            this.f = z;
            return this;
        }

        public Builder withType(FieldType fieldType) {
            this.b = fieldType;
            return this;
        }

        private Builder() {
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[FieldType.values().length];
            a = iArr;
            try {
                iArr[FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[FieldType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[FieldType.MESSAGE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[FieldType.GROUP_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private FieldInfo(java.lang.reflect.Field field, int i, FieldType fieldType, Class<?> cls, java.lang.reflect.Field field2, int i2, boolean z, boolean z2, o oVar, Class<?> cls2, Object obj, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field3) {
        this.a = field;
        this.b = fieldType;
        this.c = cls;
        this.d = i;
        this.e = field2;
        this.f = i2;
        this.g = z;
        this.h = z2;
        this.i = oVar;
        this.k = cls2;
        this.l = obj;
        this.m = enumVerifier;
        this.j = field3;
    }

    public static Builder A() {
        return new Builder(null);
    }

    private static void a(int i) {
        if (i > 0) {
            return;
        }
        throw new IllegalArgumentException("fieldNumber must be positive: " + i);
    }

    public static FieldInfo c(java.lang.reflect.Field field, int i, FieldType fieldType, boolean z) {
        a(i);
        Internal.b(field, "field");
        Internal.b(fieldType, "fieldType");
        if (fieldType == FieldType.MESSAGE_LIST || fieldType == FieldType.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new FieldInfo(field, i, fieldType, null, null, 0, false, z, null, null, null, null, null);
    }

    public static FieldInfo d(java.lang.reflect.Field field, int i, FieldType fieldType, Internal.EnumVerifier enumVerifier) {
        a(i);
        Internal.b(field, "field");
        return new FieldInfo(field, i, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, null);
    }

    public static FieldInfo e(java.lang.reflect.Field field, int i, Object obj, Internal.EnumVerifier enumVerifier) {
        Internal.b(obj, "mapDefaultEntry");
        a(i);
        Internal.b(field, "field");
        return new FieldInfo(field, i, FieldType.MAP, null, null, 0, false, true, null, null, obj, enumVerifier, null);
    }

    public static FieldInfo f(int i, FieldType fieldType, o oVar, Class<?> cls, boolean z, Internal.EnumVerifier enumVerifier) {
        a(i);
        Internal.b(fieldType, "fieldType");
        Internal.b(oVar, "oneof");
        Internal.b(cls, "oneofStoredType");
        if (fieldType.isScalar()) {
            return new FieldInfo(null, i, fieldType, null, null, 0, false, z, oVar, cls, null, enumVerifier, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i + " is of type " + fieldType);
    }

    public static FieldInfo g(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2) {
        a(i);
        Internal.b(field, "field");
        Internal.b(fieldType, "fieldType");
        if (fieldType == FieldType.MESSAGE_LIST || fieldType == FieldType.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new FieldInfo(field, i, fieldType, null, null, 0, false, false, null, null, null, null, field2);
    }

    public static FieldInfo h(java.lang.reflect.Field field, int i, FieldType fieldType, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field2) {
        a(i);
        Internal.b(field, "field");
        return new FieldInfo(field, i, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, field2);
    }

    public static FieldInfo i(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2, int i2, boolean z, Internal.EnumVerifier enumVerifier) {
        a(i);
        Internal.b(field, "field");
        Internal.b(fieldType, "fieldType");
        Internal.b(field2, "presenceField");
        if (field2 == null || y(i2)) {
            return new FieldInfo(field, i, fieldType, null, field2, i2, false, z, null, null, null, enumVerifier, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i2);
    }

    public static FieldInfo j(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2, int i2, boolean z, Internal.EnumVerifier enumVerifier) {
        a(i);
        Internal.b(field, "field");
        Internal.b(fieldType, "fieldType");
        Internal.b(field2, "presenceField");
        if (field2 == null || y(i2)) {
            return new FieldInfo(field, i, fieldType, null, field2, i2, true, z, null, null, null, enumVerifier, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i2);
    }

    public static FieldInfo k(java.lang.reflect.Field field, int i, FieldType fieldType, Class<?> cls) {
        a(i);
        Internal.b(field, "field");
        Internal.b(fieldType, "fieldType");
        Internal.b(cls, "messageClass");
        return new FieldInfo(field, i, fieldType, cls, null, 0, false, false, null, null, null, null, null);
    }

    private static boolean y(int i) {
        return i != 0 && (i & (i + (-1))) == 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(FieldInfo fieldInfo) {
        return this.d - fieldInfo.d;
    }

    public java.lang.reflect.Field l() {
        return this.j;
    }

    public Internal.EnumVerifier m() {
        return this.m;
    }

    public java.lang.reflect.Field n() {
        return this.a;
    }

    public int o() {
        return this.d;
    }

    public Class<?> p() {
        return this.c;
    }

    public Object q() {
        return this.l;
    }

    public Class<?> r() {
        int i = a.a[this.b.ordinal()];
        if (i == 1 || i == 2) {
            java.lang.reflect.Field field = this.a;
            return field != null ? field.getType() : this.k;
        }
        if (i == 3 || i == 4) {
            return this.c;
        }
        return null;
    }

    public o s() {
        return this.i;
    }

    public Class<?> t() {
        return this.k;
    }

    public java.lang.reflect.Field u() {
        return this.e;
    }

    public int v() {
        return this.f;
    }

    public FieldType w() {
        return this.b;
    }

    public boolean x() {
        return this.h;
    }

    public boolean z() {
        return this.g;
    }
}
