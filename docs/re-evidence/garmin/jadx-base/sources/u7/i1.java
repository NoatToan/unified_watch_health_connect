package u7;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.datastore.core.RunOnce", f = "DataStoreImpl.kt", l = {544, 497}, m = "runIfNeeded")
public final class i1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j1 f169164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.a f169165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f169166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1 f169167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f169168e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(j1 j1Var, t13.d<? super i1> dVar) {
        super(dVar);
        this.f169167d = j1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f169166c = obj;
        this.f169168e |= Integer.MIN_VALUE;
        return this.f169167d.b(this);
    }
}
