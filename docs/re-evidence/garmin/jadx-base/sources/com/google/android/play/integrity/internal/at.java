package com.google.android.play.integrity.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
final class at extends ar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final ar f53434a = new at(new Object[0], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final transient Object[] f53435b;

    public at(Object[] objArr, int i14) {
        this.f53435b = objArr;
    }

    @Override // com.google.android.play.integrity.internal.ar, com.google.android.play.integrity.internal.ao
    public final int a(Object[] objArr, int i14) {
        System.arraycopy(this.f53435b, 0, objArr, 0, 0);
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

    @Override // com.google.android.play.integrity.internal.ao
    public final Object[] e() {
        return this.f53435b;
    }

    @Override // java.util.List
    public final Object get(int i14) {
        al.a(i14, 0, FirebaseAnalytics.Param.INDEX);
        Object obj = this.f53435b[i14];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
