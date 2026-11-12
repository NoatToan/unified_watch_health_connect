package com.google.android.gms.internal.fitness;

import java.util.Iterator;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
final class u1<E> extends zzfh<E> {
    private final transient E c;
    private transient int d;

    public u1(E e) {
        this.c = (E) zzez.checkNotNull(e);
    }

    @Override // com.google.android.gms.internal.fitness.zzfd, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.equals(obj);
    }

    @Override // com.google.android.gms.internal.fitness.zzfd
    public final boolean e() {
        return false;
    }

    @Override // com.google.android.gms.internal.fitness.zzfd
    public final int f(Object[] objArr, int i) {
        objArr[0] = this.c;
        return 1;
    }

    @Override // com.google.android.gms.internal.fitness.zzfh
    public final boolean g() {
        return this.d != 0;
    }

    @Override // com.google.android.gms.internal.fitness.zzfh
    public final zzfc<E> h() {
        return zzfc.zzb(this.c);
    }

    @Override // com.google.android.gms.internal.fitness.zzfh, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.c.hashCode();
        this.d = iHashCode;
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.fitness.zzfh, com.google.android.gms.internal.fitness.zzfd, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.c.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append(JsonLexerKt.BEGIN_LIST);
        sb.append(string);
        sb.append(JsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.fitness.zzfd
    /* JADX INFO: renamed from: zzae */
    public final zzfm<E> iterator() {
        return new r1(this.c);
    }

    public u1(E e, int i) {
        this.c = e;
        this.d = i;
    }
}
