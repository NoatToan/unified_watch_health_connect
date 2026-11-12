package yc;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.paging.AsyncPagingDataDiffer$presenter$1", f = "AsyncPagingDataDiffer.kt", l = {183}, m = "presentPagingDataEvent")
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f.e f195963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f195964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z2.e f195965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f195966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f.e f195967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f195968f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f.e eVar, t13.d dVar) {
        super(dVar);
        this.f195967e = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f195966d = obj;
        this.f195968f |= Integer.MIN_VALUE;
        return this.f195967e.c(null, this);
    }
}
