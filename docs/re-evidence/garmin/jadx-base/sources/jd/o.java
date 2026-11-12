package jd;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.room.coroutines.Pool", f = "ConnectionPoolImpl.kt", l = {231}, m = "acquireWithTimeout-KLykuaI")
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f98268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e23.a f98269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r0 f98270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f98271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f98272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f98273f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f98272e = qVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f98271d = obj;
        this.f98273f |= Integer.MIN_VALUE;
        return this.f98272e.b(0L, null, this);
    }
}
