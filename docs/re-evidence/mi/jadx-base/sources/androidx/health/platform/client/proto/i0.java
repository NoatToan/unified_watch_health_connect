package androidx.health.platform.client.proto;

import defpackage.pee;
import defpackage.vaq;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class i0 extends c<String> implements pee, RandomAccess {
    public static final i0 c;

    @Deprecated
    public static final pee d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Object> f2505b;

    static {
        i0 i0Var = new i0();
        c = i0Var;
        i0Var.b();
        d = i0Var;
    }

    public i0() {
        this(10);
    }

    public static String g(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof ByteString ? ((ByteString) obj).toStringUtf8() : f0.j((byte[]) obj);
    }

    @Override // defpackage.pee
    public void N(ByteString byteString) {
        e();
        this.f2505b.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // androidx.health.platform.client.proto.c, androidx.health.platform.client.proto.f0.i
    public /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        e();
        this.f2505b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.pee
    public Object d(int i) {
        return this.f2505b.get(i);
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i, String str) {
        e();
        this.f2505b.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.pee
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f2505b);
    }

    @Override // defpackage.pee
    public pee getUnmodifiableView() {
        return c() ? new vaq(this) : this;
    }

    @Override // androidx.health.platform.client.proto.f0.i
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public i0 a(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f2505b);
        return new i0((ArrayList<Object>) arrayList);
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public String remove(int i) {
        e();
        Object objRemove = this.f2505b.remove(i);
        ((AbstractList) this).modCount++;
        return g(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public String set(int i, String str) {
        e();
        return g(this.f2505b.set(i, str));
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2505b.size();
    }

    public i0(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        e();
        if (collection instanceof pee) {
            collection = ((pee) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f2505b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        Object obj = this.f2505b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f2505b.set(i, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String strJ = f0.j(bArr);
        if (f0.g(bArr)) {
            this.f2505b.set(i, strJ);
        }
        return strJ;
    }

    @Override // androidx.health.platform.client.proto.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public i0(ArrayList<Object> arrayList) {
        this.f2505b = arrayList;
    }
}
