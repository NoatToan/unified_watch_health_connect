package kv1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.network.FBTPlansRepo", f = "FBTPlansRepo.kt", l = {46, 47, 54}, m = "getActivityPolyline", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f106736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ps.m f106737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f106738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f106739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f106740e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f106739d = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f106738c = obj;
        this.f106740e |= Integer.MIN_VALUE;
        return this.f106739d.a(0L, this);
    }
}
