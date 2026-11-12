package com.google.protobuf;

import defpackage.ree;
import defpackage.xaq;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
public class g0 extends d<String> implements ree, RandomAccess {
    public static final g0 c;
    public static final ree d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Object> f9642b;

    static {
        g0 g0Var = new g0();
        c = g0Var;
        g0Var.b();
        d = g0Var;
    }

    public g0() {
        this(10);
    }

    public static ByteString g(Object obj) {
        if (obj instanceof ByteString) {
            return (ByteString) obj;
        }
        return obj instanceof String ? ByteString.copyFromUtf8((String) obj) : ByteString.copyFrom((byte[]) obj);
    }

    public static String h(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof ByteString ? ((ByteString) obj).toStringUtf8() : d0.m((byte[]) obj);
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.protobuf.d, com.google.protobuf.d0.i
    public /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        e();
        this.f9642b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.ree
    public Object d(int i) {
        return this.f9642b.get(i);
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i, String str) {
        e();
        this.f9642b.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.ree
    public ByteString getByteString(int i) {
        Object obj = this.f9642b.get(i);
        ByteString byteStringG = g(obj);
        if (byteStringG != obj) {
            this.f9642b.set(i, byteStringG);
        }
        return byteStringG;
    }

    @Override // defpackage.ree
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f9642b);
    }

    @Override // defpackage.ree
    public ree getUnmodifiableView() {
        return c() ? new xaq(this) : this;
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.protobuf.d0.i, com.google.protobuf.d0.f
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public g0 a2(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f9642b);
        return new g0((ArrayList<Object>) arrayList);
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public String remove(int i) {
        e();
        Object objRemove = this.f9642b.remove(i);
        ((AbstractList) this).modCount++;
        return h(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public String set(int i, String str) {
        e();
        return h(this.f9642b.set(i, str));
    }

    @Override // defpackage.ree
    public void n(ByteString byteString) {
        e();
        this.f9642b.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f9642b.size();
    }

    public g0(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    @Override // com.google.protobuf.d, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        e();
        if (collection instanceof ree) {
            collection = ((ree) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f9642b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        Object obj = this.f9642b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f9642b.set(i, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String strM = d0.m(bArr);
        if (d0.j(bArr)) {
            this.f9642b.set(i, strM);
        }
        return strM;
    }

    @Override // com.google.protobuf.d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public g0(ree reeVar) {
        this.f9642b = new ArrayList(reeVar.size());
        addAll(reeVar);
    }

    public g0(ArrayList<Object> arrayList) {
        this.f9642b = arrayList;
    }
}
