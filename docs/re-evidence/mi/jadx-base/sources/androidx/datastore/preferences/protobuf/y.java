package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class y<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<K, V> f2262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f2263b;
    public final V c;

    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WireFormat.FieldType f2264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f2265b;
        public final WireFormat.FieldType c;
        public final V d;

        public a(WireFormat.FieldType fieldType, K k2, WireFormat.FieldType fieldType2, V v) {
            this.f2264a = fieldType;
            this.f2265b = k2;
            this.c = fieldType2;
            this.d = v;
        }
    }

    public y(WireFormat.FieldType fieldType, K k2, WireFormat.FieldType fieldType2, V v) {
        this.f2262a = new a<>(fieldType, k2, fieldType2, v);
        this.f2263b = k2;
        this.c = v;
    }

    public static <K, V> int b(a<K, V> aVar, K k2, V v) {
        return p.d(aVar.f2264a, 1, k2) + p.d(aVar.c, 2, v);
    }

    public static <K, V> y<K, V> d(WireFormat.FieldType fieldType, K k2, WireFormat.FieldType fieldType2, V v) {
        return new y<>(fieldType, k2, fieldType2, v);
    }

    public static <K, V> void e(CodedOutputStream codedOutputStream, a<K, V> aVar, K k2, V v) throws IOException {
        p.z(codedOutputStream, aVar.f2264a, 1, k2);
        p.z(codedOutputStream, aVar.c, 2, v);
    }

    public int a(int i, K k2, V v) {
        return CodedOutputStream.W(i) + CodedOutputStream.D(b(this.f2262a, k2, v));
    }

    public a<K, V> c() {
        return this.f2262a;
    }
}
