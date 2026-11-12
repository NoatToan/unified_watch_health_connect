package oj0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.data.GCPlusApiImpl", f = "GCPlusApi.kt", l = {18}, m = "fetchGCPlusImage", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f132273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f132274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f132275c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, t13.d<? super b> dVar2) {
        super(dVar2);
        this.f132274b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f132273a = obj;
        this.f132275c |= Integer.MIN_VALUE;
        return this.f132274b.a(null, this);
    }
}
