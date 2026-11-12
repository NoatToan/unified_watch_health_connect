package yc;

import java.util.concurrent.locks.ReentrantLock;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyc/b;", "", "Key", "Value", "<init>", "()V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f195759a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r53.p2 f195760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a<Key, Value> f195761c;

    public b() {
        b1.f195767f.getClass();
        this.f195760b = r53.q2.a(b1.f195768g);
        this.f195761c = new a<>();
    }

    public final <R> R a(e23.l<? super a<Key, Value>, ? extends R> lVar) {
        a<Key, Value> aVar = this.f195761c;
        lVar.getClass();
        ReentrantLock reentrantLock = this.f195759a;
        try {
            reentrantLock.lock();
            R rInvoke = lVar.invoke(aVar);
            r53.p2 p2Var = this.f195760b;
            aVar.getClass();
            p2Var.k(null, new b1(aVar.b(c1.REFRESH), aVar.b(c1.PREPEND), aVar.b(c1.APPEND)));
            return rInvoke;
        } finally {
            reentrantLock.unlock();
        }
    }
}
