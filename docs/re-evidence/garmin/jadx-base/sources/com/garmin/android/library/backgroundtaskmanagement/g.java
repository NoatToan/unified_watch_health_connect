package com.garmin.android.library.backgroundtaskmanagement;

/* JADX INFO: loaded from: classes11.dex */
public class g<T> implements b.InterfaceC0995b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final pd2.d f50133b = new pd2.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b.InterfaceC0995b<T> f50134a;

    public g(b.InterfaceC0995b<T> interfaceC0995b) {
        this.f50134a = interfaceC0995b;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, b.c cVar) {
        this.f50134a.onComplete(j8, cVar);
        f50133b.f137397a.remove(this);
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, b.e eVar, T t7) {
        this.f50134a.onResults(j8, eVar, t7);
    }
}
