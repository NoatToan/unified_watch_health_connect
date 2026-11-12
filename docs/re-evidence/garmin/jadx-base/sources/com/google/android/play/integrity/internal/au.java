package com.google.android.play.integrity.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
final class au extends as {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final au f53436a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object[] f53437d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final transient Object[] f53438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f53439c;

    static {
        Object[] objArr = new Object[0];
        f53437d = objArr;
        f53436a = new au(objArr, 0, objArr, 0, 0);
    }

    public au(Object[] objArr, int i14, Object[] objArr2, int i15, int i16) {
        this.f53438b = objArr;
        this.f53439c = objArr2;
    }

    @Override // com.google.android.play.integrity.internal.ao
    public final int a(Object[] objArr, int i14) {
        System.arraycopy(this.f53438b, 0, objArr, 0, 0);
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.ao
    public final int b() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.ao
    public final int c() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.f53439c.length;
        return false;
    }

    @Override // com.google.android.play.integrity.internal.as, com.google.android.play.integrity.internal.ao
    /* JADX INFO: renamed from: d */
    public final av iterator() {
        return f().listIterator(0);
    }

    @Override // com.google.android.play.integrity.internal.ao
    public final Object[] e() {
        return this.f53438b;
    }

    @Override // com.google.android.play.integrity.internal.as
    public final ar g() {
        int i14 = ar.f53432d;
        return at.f53434a;
    }

    @Override // com.google.android.play.integrity.internal.as, java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.as
    public final boolean i() {
        return true;
    }

    @Override // com.google.android.play.integrity.internal.as, com.google.android.play.integrity.internal.ao, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}
