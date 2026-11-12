package kr;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.data.repository.ActivityImageDataSource", f = "ActivityImageDataSource.kt", l = {16}, m = "processImage", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f106217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f106218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f106219c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f106218b = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f106217a = obj;
        this.f106219c |= Integer.MIN_VALUE;
        return this.f106218b.a(0L, null, this);
    }
}
