package androidx.health.platform.client.proto;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class l0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<K, V> f2514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f2515b;
    public final V c;

    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WireFormat.FieldType f2516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f2517b;
        public final WireFormat.FieldType c;
        public final V d;

        public a(WireFormat.FieldType fieldType, K k2, WireFormat.FieldType fieldType2, V v) {
            this.f2516a = fieldType;
            this.f2517b = k2;
            this.c = fieldType2;
            this.d = v;
        }
    }

    public l0(WireFormat.FieldType fieldType, K k2, WireFormat.FieldType fieldType2, V v) {
        this.f2514a = new a<>(fieldType, k2, fieldType2, v);
        this.f2515b = k2;
        this.c = v;
    }

    public static <K, V> int b(a<K, V> aVar, K k2, V v) {
        return c0.d(aVar.f2516a, 1, k2) + c0.d(aVar.c, 2, v);
    }

    public static <K, V> l0<K, V> d(WireFormat.FieldType fieldType, K k2, WireFormat.FieldType fieldType2, V v) {
        return new l0<>(fieldType, k2, fieldType2, v);
    }

    public static <K, V> void e(CodedOutputStream codedOutputStream, a<K, V> aVar, K k2, V v) throws IOException {
        c0.A(codedOutputStream, aVar.f2516a, 1, k2);
        c0.A(codedOutputStream, aVar.c, 2, v);
    }

    public int a(int i, K k2, V v) {
        return CodedOutputStream.U(i) + CodedOutputStream.D(b(this.f2514a, k2, v));
    }

    public a<K, V> c() {
        return this.f2514a;
    }
}
