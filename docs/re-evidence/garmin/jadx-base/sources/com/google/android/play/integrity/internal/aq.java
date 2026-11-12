package com.google.android.play.integrity.internal;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes14.dex */
final class aq extends ar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final transient int f53428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final transient int f53429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ar f53430c;

    public aq(ar arVar, int i14, int i15) {
        this.f53430c = arVar;
        this.f53428a = i14;
        this.f53429b = i15;
    }

    @Override // com.google.android.play.integrity.internal.ao
    public final int b() {
        return this.f53430c.c() + this.f53428a + this.f53429b;
    }

    @Override // com.google.android.play.integrity.internal.ao
    public final int c() {
        return this.f53430c.c() + this.f53428a;
    }

    @Override // com.google.android.play.integrity.internal.ao
    public final Object[] e() {
        return this.f53430c.e();
    }

    @Override // com.google.android.play.integrity.internal.ar, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final ar subList(int i14, int i15) {
        al.c(i14, i15, this.f53429b);
        int i16 = this.f53428a;
        return this.f53430c.subList(i14 + i16, i15 + i16);
    }

    @Override // java.util.List
    public final Object get(int i14) {
        al.a(i14, this.f53429b, FirebaseAnalytics.Param.INDEX);
        return this.f53430c.get(i14 + this.f53428a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f53429b;
    }
}
