package com.google.protobuf;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class k0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b<K, V> f9681a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9682a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f9682a = iArr;
            try {
                iArr[WireFormat.FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9682a[WireFormat.FieldType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9682a[WireFormat.FieldType.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WireFormat.FieldType f9683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f9684b;
        public final WireFormat.FieldType c;
        public final V d;

        public b(WireFormat.FieldType fieldType, K k2, WireFormat.FieldType fieldType2, V v) {
            this.f9683a = fieldType;
            this.f9684b = k2;
            this.c = fieldType2;
            this.d = v;
        }
    }

    public static <K, V> int b(b<K, V> bVar, K k2, V v) {
        return a0.m(bVar.f9683a, 1, k2) + a0.m(bVar.c, 2, v);
    }

    public static <K, V> Map.Entry<K, V> d(j jVar, b<K, V> bVar, t tVar) throws IOException {
        Object objE = bVar.f9684b;
        Object objE2 = bVar.d;
        while (true) {
            int iJ = jVar.J();
            if (iJ == 0) {
                break;
            }
            if (iJ == WireFormat.c(1, bVar.f9683a.getWireType())) {
                objE = e(jVar, tVar, bVar.f9683a, objE);
            } else if (iJ == WireFormat.c(2, bVar.c.getWireType())) {
                objE2 = e(jVar, tVar, bVar.c, objE2);
            } else if (!jVar.N(iJ)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(objE, objE2);
    }

    public static <T> T e(j jVar, t tVar, WireFormat.FieldType fieldType, T t) throws IOException {
        int i = a.f9682a[fieldType.ordinal()];
        if (i == 1) {
            q0.a builder = ((q0) t).toBuilder();
            jVar.A(builder, tVar);
            return (T) builder.buildPartial();
        }
        if (i == 2) {
            return (T) Integer.valueOf(jVar.s());
        }
        if (i != 3) {
            return (T) a0.L(jVar, fieldType, true);
        }
        throw new RuntimeException("Groups are not allowed in maps.");
    }

    public static <K, V> void f(CodedOutputStream codedOutputStream, b<K, V> bVar, K k2, V v) throws IOException {
        a0.O(codedOutputStream, bVar.f9683a, 1, k2);
        a0.O(codedOutputStream, bVar.c, 2, v);
    }

    public int a(int i, K k2, V v) {
        return CodedOutputStream.X(i) + CodedOutputStream.E(b(this.f9681a, k2, v));
    }

    public b<K, V> c() {
        return this.f9681a;
    }
}
