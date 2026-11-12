package com.google.protobuf;

import defpackage.vkh;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
public final class j0<K, V> extends com.google.protobuf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f9671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f9672b;
    public final c<K, V> c;
    public volatile int d;

    public static final class c<K, V> extends k0.b<K, V> {
        public final Descriptors.b e;
        public final vkh<j0<K, V>> f;

        public class a extends com.google.protobuf.c<j0<K, V>> {
            public a() {
            }

            @Override // defpackage.vkh
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public j0<K, V> parsePartialFrom(j jVar, t tVar) throws InvalidProtocolBufferException {
                return new j0<>(c.this, jVar, tVar);
            }
        }

        public c(Descriptors.b bVar, j0<K, V> j0Var, WireFormat.FieldType fieldType, WireFormat.FieldType fieldType2) {
            super(fieldType, j0Var.f9671a, fieldType2, j0Var.f9672b);
            this.e = bVar;
            this.f = new a();
        }
    }

    private void c(Descriptors.FieldDescriptor fieldDescriptor) {
        if (fieldDescriptor.o() == this.c.e) {
            return;
        }
        throw new RuntimeException("Wrong FieldDescriptor \"" + fieldDescriptor.b() + "\" used in message \"" + this.c.e.b());
    }

    public static <V> boolean h(c cVar, V v) {
        if (cVar.c.getJavaType() == WireFormat.JavaType.MESSAGE) {
            return ((q0) v).isInitialized();
        }
        return true;
    }

    public static <K, V> j0<K, V> j(Descriptors.b bVar, WireFormat.FieldType fieldType, K k2, WireFormat.FieldType fieldType2, V v) {
        return new j0<>(bVar, fieldType, k2, fieldType2, v);
    }

    @Override // defpackage.bsf, com.google.protobuf.s0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public j0<K, V> getDefaultInstanceForType() {
        c<K, V> cVar = this.c;
        return new j0<>(cVar, cVar.f9684b, cVar.d);
    }

    public K e() {
        return this.f9671a;
    }

    public final c<K, V> f() {
        return this.c;
    }

    public V g() {
        return this.f9672b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.s0
    public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
        TreeMap treeMap = new TreeMap();
        for (Descriptors.FieldDescriptor fieldDescriptor : this.c.e.o()) {
            if (hasField(fieldDescriptor)) {
                treeMap.put(fieldDescriptor, getField(fieldDescriptor));
            }
        }
        return Collections.unmodifiableMap(treeMap);
    }

    @Override // com.google.protobuf.s0
    public Descriptors.b getDescriptorForType() {
        return this.c.e;
    }

    @Override // com.google.protobuf.s0
    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        c(fieldDescriptor);
        Object objE = fieldDescriptor.getNumber() == 1 ? e() : g();
        return fieldDescriptor.z() == Descriptors.FieldDescriptor.Type.ENUM ? fieldDescriptor.r().k(((Integer) objE).intValue()) : objE;
    }

    @Override // com.google.protobuf.q0, com.google.protobuf.p0
    public vkh<j0<K, V>> getParserForType() {
        return this.c.f;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.q0
    public int getSerializedSize() {
        if (this.d != -1) {
            return this.d;
        }
        int iB = k0.b(this.c, this.f9671a, this.f9672b);
        this.d = iB;
        return iB;
    }

    @Override // com.google.protobuf.s0
    public r1 getUnknownFields() {
        return r1.c();
    }

    @Override // com.google.protobuf.s0
    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        c(fieldDescriptor);
        return true;
    }

    @Override // com.google.protobuf.q0, com.google.protobuf.p0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public b<K, V> newBuilderForType() {
        return new b<>(this.c);
    }

    @Override // com.google.protobuf.a, defpackage.bsf
    public boolean isInitialized() {
        return h(this.c, this.f9672b);
    }

    @Override // com.google.protobuf.q0, com.google.protobuf.p0
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public b<K, V> toBuilder() {
        return new b<>(this.c, this.f9671a, this.f9672b, true, true);
    }

    @Override // com.google.protobuf.a, com.google.protobuf.q0
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        k0.f(codedOutputStream, this.c, this.f9671a, this.f9672b);
    }

    public static class b<K, V> extends com.google.protobuf.a.AbstractC0258a<b<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c<K, V> f9673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public K f9674b;
        public V c;
        public boolean d;
        public boolean e;

        @Override // com.google.protobuf.p0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b<K, V> addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j0<K, V> build() {
            j0<K, V> j0VarBuildPartial = buildPartial();
            if (j0VarBuildPartial.isInitialized()) {
                return j0VarBuildPartial;
            }
            throw com.google.protobuf.a.AbstractC0258a.newUninitializedMessageException((p0) j0VarBuildPartial);
        }

        @Override // com.google.protobuf.q0.a, com.google.protobuf.p0.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public j0<K, V> buildPartial() {
            return new j0<>(this.f9673a, this.f9674b, this.c);
        }

        public final void d(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.o() == this.f9673a.e) {
                return;
            }
            throw new RuntimeException("Wrong FieldDescriptor \"" + fieldDescriptor.b() + "\" used in message \"" + this.f9673a.e.b());
        }

        @Override // com.google.protobuf.p0.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public b<K, V> clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            d(fieldDescriptor);
            if (fieldDescriptor.getNumber() == 1) {
                f();
            } else {
                g();
            }
            return this;
        }

        public b<K, V> f() {
            this.f9674b = this.f9673a.f9684b;
            this.d = false;
            return this;
        }

        public b<K, V> g() {
            this.c = this.f9673a.d;
            this.e = false;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.s0
        public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
            TreeMap treeMap = new TreeMap();
            for (Descriptors.FieldDescriptor fieldDescriptor : this.f9673a.e.o()) {
                if (hasField(fieldDescriptor)) {
                    treeMap.put(fieldDescriptor, getField(fieldDescriptor));
                }
            }
            return Collections.unmodifiableMap(treeMap);
        }

        @Override // com.google.protobuf.p0.a, com.google.protobuf.s0
        public Descriptors.b getDescriptorForType() {
            return this.f9673a.e;
        }

        @Override // com.google.protobuf.s0
        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            d(fieldDescriptor);
            Object objJ = fieldDescriptor.getNumber() == 1 ? j() : k();
            return fieldDescriptor.z() == Descriptors.FieldDescriptor.Type.ENUM ? fieldDescriptor.r().k(((Integer) objJ).intValue()) : objJ;
        }

        @Override // com.google.protobuf.s0
        public r1 getUnknownFields() {
            return r1.c();
        }

        @Override // com.google.protobuf.a.AbstractC0258a, com.google.protobuf.b.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b<K, V> mo144clone() {
            return new b<>(this.f9673a, this.f9674b, this.c, this.d, this.e);
        }

        @Override // com.google.protobuf.s0
        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            d(fieldDescriptor);
            return fieldDescriptor.getNumber() == 1 ? this.d : this.e;
        }

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public j0<K, V> getDefaultInstanceForType() {
            c<K, V> cVar = this.f9673a;
            return new j0<>(cVar, cVar.f9684b, cVar.d);
        }

        public K j() {
            return this.f9674b;
        }

        public V k() {
            return this.c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.p0.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public b<K, V> setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            d(fieldDescriptor);
            if (fieldDescriptor.getNumber() == 1) {
                n(obj);
            } else {
                if (fieldDescriptor.z() == Descriptors.FieldDescriptor.Type.ENUM) {
                    obj = Integer.valueOf(((Descriptors.e) obj).getNumber());
                } else if (fieldDescriptor.z() == Descriptors.FieldDescriptor.Type.MESSAGE && obj != null && !this.f9673a.d.getClass().isInstance(obj)) {
                    obj = ((p0) this.f9673a.d).toBuilder().mergeFrom((p0) obj).build();
                }
                q(obj);
            }
            return this;
        }

        public b<K, V> n(K k2) {
            this.f9674b = k2;
            this.d = true;
            return this;
        }

        @Override // com.google.protobuf.p0.a
        public p0.a newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
            d(fieldDescriptor);
            if (fieldDescriptor.getNumber() == 2 && fieldDescriptor.w() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                return ((p0) this.c).newBuilderForType();
            }
            throw new RuntimeException("\"" + fieldDescriptor.b() + "\" is not a message value field.");
        }

        @Override // com.google.protobuf.p0.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public b<K, V> setUnknownFields(r1 r1Var) {
            return this;
        }

        public b<K, V> q(V v) {
            this.c = v;
            this.e = true;
            return this;
        }

        public b(c<K, V> cVar) {
            this(cVar, cVar.f9684b, cVar.d, false, false);
        }

        public b(c<K, V> cVar, K k2, V v, boolean z, boolean z2) {
            this.f9673a = cVar;
            this.f9674b = k2;
            this.c = v;
            this.d = z;
            this.e = z2;
        }
    }

    public j0(Descriptors.b bVar, WireFormat.FieldType fieldType, K k2, WireFormat.FieldType fieldType2, V v) {
        this.d = -1;
        this.f9671a = k2;
        this.f9672b = v;
        this.c = new c<>(bVar, this, fieldType, fieldType2);
    }

    public j0(c cVar, K k2, V v) {
        this.d = -1;
        this.f9671a = k2;
        this.f9672b = v;
        this.c = cVar;
    }

    public j0(c<K, V> cVar, j jVar, t tVar) throws InvalidProtocolBufferException {
        this.d = -1;
        try {
            this.c = cVar;
            Map.Entry entryD = k0.d(jVar, cVar, tVar);
            this.f9671a = (K) entryD.getKey();
            this.f9672b = (V) entryD.getValue();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
        }
    }
}
