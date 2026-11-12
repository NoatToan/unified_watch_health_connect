package jd;

import androidx.room.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {629}, m = "beginTransaction")
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u0.a f98299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f98300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f98301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f98302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f98303e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r rVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f98302d = rVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f98301c = obj;
        this.f98303e |= Integer.MIN_VALUE;
        return this.f98302d.e(null, this);
    }
}
