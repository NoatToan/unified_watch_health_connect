package jd;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.room.coroutines.Pool", f = "ConnectionPoolImpl.kt", l = {253}, m = "acquire")
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f98265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f98266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f98267c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f98266b = qVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f98265a = obj;
        this.f98267c |= Integer.MIN_VALUE;
        return this.f98266b.a(this);
    }
}
