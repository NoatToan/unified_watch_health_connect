package q53;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {3117}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f142971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b<Object> f142972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f142973c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b<Object> bVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f142972b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f142971a = obj;
        this.f142973c |= Integer.MIN_VALUE;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f142949d;
        Object objF = this.f142972b.F(null, 0, 0L, this);
        return objF == u13.a.COROUTINE_SUSPENDED ? objF : m.a(objF);
    }
}
