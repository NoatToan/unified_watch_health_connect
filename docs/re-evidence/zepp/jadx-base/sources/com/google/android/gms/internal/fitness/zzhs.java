package com.google.android.gms.internal.fitness;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhs extends v1<String> implements zzhr, RandomAccess {
    private static final zzhs c;
    private static final zzhr d;
    private final List<Object> b;

    static {
        zzhs zzhsVar = new zzhs();
        c = zzhsVar;
        zzhsVar.zzar();
        d = zzhsVar;
    }

    public zzhs() {
        this(10);
    }

    private static String a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof zzfx ? ((zzfx) obj).zzav() : zzhc.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.fitness.v1, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        zzas();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.fitness.v1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.fitness.v1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzas();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.fitness.v1, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Object obj = this.b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzfx) {
            zzfx zzfxVar = (zzfx) obj;
            String strZzav = zzfxVar.zzav();
            if (zzfxVar.zzaw()) {
                this.b.set(i, strZzav);
            }
            return strZzav;
        }
        byte[] bArr = (byte[]) obj;
        String strZzd = zzhc.zzd(bArr);
        if (zzhc.zzc(bArr)) {
            this.b.set(i, strZzd);
        }
        return strZzd;
    }

    @Override // com.google.android.gms.internal.fitness.v1, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.fitness.v1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.android.gms.internal.fitness.v1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.fitness.v1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.google.android.gms.internal.fitness.v1, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        zzas();
        return a(this.b.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // com.google.android.gms.internal.fitness.zzhh
    public final /* synthetic */ zzhh zzae(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.b);
        return new zzhs((ArrayList<Object>) arrayList);
    }

    @Override // com.google.android.gms.internal.fitness.zzhr
    public final Object zzaf(int i) {
        return this.b.get(i);
    }

    @Override // com.google.android.gms.internal.fitness.v1, com.google.android.gms.internal.fitness.zzhh
    public final /* bridge */ /* synthetic */ boolean zzaq() {
        return super.zzaq();
    }

    @Override // com.google.android.gms.internal.fitness.zzhr
    public final List<?> zzch() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // com.google.android.gms.internal.fitness.zzhr
    public final zzhr zzci() {
        return zzaq() ? new zzjt(this) : this;
    }

    public zzhs(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    @Override // com.google.android.gms.internal.fitness.v1, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        zzas();
        if (collection instanceof zzhr) {
            collection = ((zzhr) collection).zzch();
        }
        boolean zAddAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.fitness.v1, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zzas();
        Object objRemove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        return a(objRemove);
    }

    private zzhs(ArrayList<Object> arrayList) {
        this.b = arrayList;
    }

    @Override // com.google.android.gms.internal.fitness.v1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }
}
