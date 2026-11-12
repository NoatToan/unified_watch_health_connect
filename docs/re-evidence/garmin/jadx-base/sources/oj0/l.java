package oj0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.data.GCPlusRepository", f = "GCPlusRepository.kt", l = {292}, m = "fetchGCPlusImage", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f132320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f132321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f132322c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(f fVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f132321b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f132320a = obj;
        this.f132322c |= Integer.MIN_VALUE;
        int i14 = f.f132279m;
        return this.f132321b.h(null, this);
    }
}
