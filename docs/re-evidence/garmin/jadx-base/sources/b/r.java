package b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lb/r;", "", "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/Function0;", "", "reportFullyDrawn", "<init>", "(Ljava/util/concurrent/Executor;Le23/a;)V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f13812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<Unit> f13813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f13816e;

    public r(Executor executor, e23.a<Unit> aVar) {
        executor.getClass();
        aVar.getClass();
        this.f13812a = executor;
        this.f13813b = aVar;
        this.f13814c = new Object();
        this.f13816e = new ArrayList();
    }

    public final void a() {
        synchronized (this.f13814c) {
            try {
                this.f13815d = true;
                Iterator it = this.f13816e.iterator();
                while (it.hasNext()) {
                    ((e23.a) it.next()).invoke();
                }
                this.f13816e.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
