package com.google.protobuf;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class MapEntryLite<K, V> {
    private static final int d = 1;
    private static final int e = 2;
    private final b<K, V> a;
    private final K b;
    private final V c;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            a = iArr;
            try {
                iArr[WireFormat.FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WireFormat.FieldType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[WireFormat.FieldType.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class b<K, V> {
        public final WireFormat.FieldType a;
        public final K b;
        public final WireFormat.FieldType c;
        public final V d;

        public b(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
            this.a = fieldType;
            this.b = k;
            this.c = fieldType2;
            this.d = v;
        }
    }

    private MapEntryLite(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        this.a = new b<>(fieldType, k, fieldType2, v);
        this.b = k;
        this.c = v;
    }

    public static <K, V> int a(b<K, V> bVar, K k, V v) {
        return FieldSet.o(bVar.a, 1, k) + FieldSet.o(bVar.c, 2, v);
    }

    public static <K, V> Map.Entry<K, V> c(CodedInputStream codedInputStream, b<K, V> bVar, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        Object objD = bVar.b;
        Object objD2 = bVar.d;
        while (true) {
            int tag = codedInputStream.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == WireFormat.a(1, bVar.a.getWireType())) {
                objD = d(codedInputStream, extensionRegistryLite, bVar.a, objD);
            } else if (tag == WireFormat.a(2, bVar.c.getWireType())) {
                objD2 = d(codedInputStream, extensionRegistryLite, bVar.c, objD2);
            } else if (!codedInputStream.skipField(tag)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(objD, objD2);
    }

    public static <T> T d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, WireFormat.FieldType fieldType, T t) throws IOException {
        int i = a.a[fieldType.ordinal()];
        if (i == 1) {
            MessageLite.Builder builder = ((MessageLite) t).toBuilder();
            codedInputStream.readMessage(builder, extensionRegistryLite);
            return (T) builder.buildPartial();
        }
        if (i == 2) {
            return (T) Integer.valueOf(codedInputStream.readEnum());
        }
        if (i != 3) {
            return (T) FieldSet.N(codedInputStream, fieldType, true);
        }
        throw new RuntimeException("Groups are not allowed in maps.");
    }

    public static <K, V> void e(CodedOutputStream codedOutputStream, b<K, V> bVar, K k, V v) throws IOException {
        FieldSet.R(codedOutputStream, bVar.a, 1, k);
        FieldSet.R(codedOutputStream, bVar.c, 2, v);
    }

    public static <K, V> MapEntryLite<K, V> newDefaultInstance(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        return new MapEntryLite<>(fieldType, k, fieldType2, v);
    }

    public b<K, V> b() {
        return this.a;
    }

    public int computeMessageSize(int i, K k, V v) {
        return CodedOutputStream.computeTagSize(i) + CodedOutputStream.computeLengthDelimitedFieldSize(a(this.a, k, v));
    }

    public K getKey() {
        return this.b;
    }

    public V getValue() {
        return this.c;
    }

    public Map.Entry<K, V> parseEntry(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return c(byteString.newCodedInput(), this.a, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parseInto(MapFieldLite<K, V> mapFieldLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
        b<K, V> bVar = this.a;
        Object objD = bVar.b;
        Object objD2 = bVar.d;
        while (true) {
            int tag = codedInputStream.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == WireFormat.a(1, this.a.a.getWireType())) {
                objD = d(codedInputStream, extensionRegistryLite, this.a.a, objD);
            } else if (tag == WireFormat.a(2, this.a.c.getWireType())) {
                objD2 = d(codedInputStream, extensionRegistryLite, this.a.c, objD2);
            } else if (!codedInputStream.skipField(tag)) {
                break;
            }
        }
        codedInputStream.checkLastTagWas(0);
        codedInputStream.popLimit(iPushLimit);
        mapFieldLite.put(objD, objD2);
    }

    public void serializeTo(CodedOutputStream codedOutputStream, int i, K k, V v) throws IOException {
        codedOutputStream.writeTag(i, 2);
        codedOutputStream.writeUInt32NoTag(a(this.a, k, v));
        e(codedOutputStream, this.a, k, v);
    }

    private MapEntryLite(b<K, V> bVar, K k, V v) {
        this.a = bVar;
        this.b = k;
        this.c = v;
    }
}
