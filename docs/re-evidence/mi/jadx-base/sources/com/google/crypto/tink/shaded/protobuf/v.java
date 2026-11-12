package com.google.crypto.tink.shaded.protobuf;

import defpackage.qee;
import defpackage.waq;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
public class v extends c<String> implements qee, RandomAccess {
    public static final v c;
    public static final qee d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Object> f9440b;

    static {
        v vVar = new v();
        c = vVar;
        vVar.b();
        d = vVar;
    }

    public v() {
        this(10);
    }

    public static String g(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof ByteString ? ((ByteString) obj).toStringUtf8() : s.j((byte[]) obj);
    }

    @Override // defpackage.qee
    public void D(ByteString byteString) {
        e();
        this.f9440b.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, com.google.crypto.tink.shaded.protobuf.s.i
    public /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        e();
        this.f9440b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.qee
    public Object d(int i) {
        return this.f9440b.get(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i, String str) {
        e();
        this.f9440b.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.qee
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f9440b);
    }

    @Override // defpackage.qee
    public qee getUnmodifiableView() {
        return c() ? new waq(this) : this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s.i
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public v a(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f9440b);
        return new v((ArrayList<Object>) arrayList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public String remove(int i) {
        e();
        Object objRemove = this.f9440b.remove(i);
        ((AbstractList) this).modCount++;
        return g(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public String set(int i, String str) {
        e();
        return g(this.f9440b.set(i, str));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f9440b.size();
    }

    public v(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        e();
        if (collection instanceof qee) {
            collection = ((qee) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f9440b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        Object obj = this.f9440b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f9440b.set(i, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String strJ = s.j(bArr);
        if (s.g(bArr)) {
            this.f9440b.set(i, strJ);
        }
        return strJ;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public v(ArrayList<Object> arrayList) {
        this.f9440b = arrayList;
    }
}
