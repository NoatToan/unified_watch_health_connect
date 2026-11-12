package q53;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {759}, m = "receiveCatching-JP2dKIU$suspendImpl")
public final class e<E> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f142968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b<E> f142969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f142970c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b<E> bVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f142969b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f142968a = obj;
        this.f142970c |= Integer.MIN_VALUE;
        Object objE = b.E(this.f142969b, this);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : m.a(objE);
    }
}
