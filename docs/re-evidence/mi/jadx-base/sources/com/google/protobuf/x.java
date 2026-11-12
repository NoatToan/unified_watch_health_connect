package com.google.protobuf;

import defpackage.uah;

/* JADX INFO: loaded from: classes5.dex */
public final class x implements Comparable<x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Field f9767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FieldType f9768b;
    public final Class<?> c;
    public final int d;
    public final java.lang.reflect.Field e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final uah i;
    public final java.lang.reflect.Field j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Class<?> f9769k;
    public final Object l;
    public final d0.e m;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9770a;

        static {
            int[] iArr = new int[FieldType.values().length];
            f9770a = iArr;
            try {
                iArr[FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9770a[FieldType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9770a[FieldType.MESSAGE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9770a[FieldType.GROUP_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public x(java.lang.reflect.Field field, int i, FieldType fieldType, Class<?> cls, java.lang.reflect.Field field2, int i2, boolean z, boolean z2, uah uahVar, Class<?> cls2, Object obj, d0.e eVar, java.lang.reflect.Field field3) {
        this.f9767a = field;
        this.f9768b = fieldType;
        this.c = cls;
        this.d = i;
        this.e = field2;
        this.f = i2;
        this.g = z;
        this.h = z2;
        this.i = uahVar;
        this.f9769k = cls2;
        this.l = obj;
        this.m = eVar;
        this.j = field3;
    }

    public static boolean C(int i) {
        return i != 0 && (i & (i + (-1))) == 0;
    }

    public static void a(int i) {
        if (i > 0) {
            return;
        }
        throw new IllegalArgumentException("fieldNumber must be positive: " + i);
    }

    public static x c(java.lang.reflect.Field field, int i, FieldType fieldType, boolean z) {
        a(i);
        d0.b(field, "field");
        d0.b(fieldType, "fieldType");
        if (fieldType == FieldType.MESSAGE_LIST || fieldType == FieldType.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new x(field, i, fieldType, null, null, 0, false, z, null, null, null, null, null);
    }

    public static x d(java.lang.reflect.Field field, int i, FieldType fieldType, d0.e eVar) {
        a(i);
        d0.b(field, "field");
        return new x(field, i, fieldType, null, null, 0, false, false, null, null, null, eVar, null);
    }

    public static x e(java.lang.reflect.Field field, int i, Object obj, d0.e eVar) {
        d0.b(obj, "mapDefaultEntry");
        a(i);
        d0.b(field, "field");
        return new x(field, i, FieldType.MAP, null, null, 0, false, true, null, null, obj, eVar, null);
    }

    public static x h(int i, FieldType fieldType, uah uahVar, Class<?> cls, boolean z, d0.e eVar) {
        a(i);
        d0.b(fieldType, "fieldType");
        d0.b(uahVar, "oneof");
        d0.b(cls, "oneofStoredType");
        if (fieldType.isScalar()) {
            return new x(null, i, fieldType, null, null, 0, false, z, uahVar, cls, null, eVar, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i + " is of type " + fieldType);
    }

    public static x i(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2) {
        a(i);
        d0.b(field, "field");
        d0.b(fieldType, "fieldType");
        if (fieldType == FieldType.MESSAGE_LIST || fieldType == FieldType.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new x(field, i, fieldType, null, null, 0, false, false, null, null, null, null, field2);
    }

    public static x k(java.lang.reflect.Field field, int i, FieldType fieldType, d0.e eVar, java.lang.reflect.Field field2) {
        a(i);
        d0.b(field, "field");
        return new x(field, i, fieldType, null, null, 0, false, false, null, null, null, eVar, field2);
    }

    public static x l(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2, int i2, boolean z, d0.e eVar) {
        a(i);
        d0.b(field, "field");
        d0.b(fieldType, "fieldType");
        d0.b(field2, "presenceField");
        if (field2 == null || C(i2)) {
            return new x(field, i, fieldType, null, field2, i2, false, z, null, null, null, eVar, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i2);
    }

    public static x m(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2, int i2, boolean z, d0.e eVar) {
        a(i);
        d0.b(field, "field");
        d0.b(fieldType, "fieldType");
        d0.b(field2, "presenceField");
        if (field2 == null || C(i2)) {
            return new x(field, i, fieldType, null, field2, i2, true, z, null, null, null, eVar, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i2);
    }

    public static x n(java.lang.reflect.Field field, int i, FieldType fieldType, Class<?> cls) {
        a(i);
        d0.b(field, "field");
        d0.b(fieldType, "fieldType");
        d0.b(cls, "messageClass");
        return new x(field, i, fieldType, cls, null, 0, false, false, null, null, null, null, null);
    }

    public FieldType A() {
        return this.f9768b;
    }

    public boolean B() {
        return this.h;
    }

    public boolean D() {
        return this.g;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(x xVar) {
        return this.d - xVar.d;
    }

    public java.lang.reflect.Field o() {
        return this.j;
    }

    public d0.e p() {
        return this.m;
    }

    public java.lang.reflect.Field r() {
        return this.f9767a;
    }

    public int s() {
        return this.d;
    }

    public Object u() {
        return this.l;
    }

    public Class<?> w() {
        int i = a.f9770a[this.f9768b.ordinal()];
        if (i == 1 || i == 2) {
            java.lang.reflect.Field field = this.f9767a;
            return field != null ? field.getType() : this.f9769k;
        }
        if (i == 3 || i == 4) {
            return this.c;
        }
        return null;
    }

    public uah x() {
        return this.i;
    }

    public java.lang.reflect.Field y() {
        return this.e;
    }

    public int z() {
        return this.f;
    }
}
