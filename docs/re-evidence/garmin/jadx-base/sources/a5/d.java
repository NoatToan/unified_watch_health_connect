package a5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {199}, m = "dispatchPreFling-QWom1Mo", v = 1)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f1214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1215c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f1214b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f1213a = obj;
        this.f1215c |= Integer.MIN_VALUE;
        return this.f1214b.c(0L, this);
    }
}
