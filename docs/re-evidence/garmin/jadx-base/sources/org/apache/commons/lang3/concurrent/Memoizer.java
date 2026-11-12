package org.apache.commons.lang3.concurrent;

import com.airbnb.lottie.animation.keyframe.a;
import com.google.firebase.remoteconfig.b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes3.dex */
public class Memoizer<I, O> implements Computable<I, O> {
    private final ConcurrentMap<I, Future<O>> cache;
    private final Computable<I, O> computable;
    private final boolean recalculate;

    public Memoizer(Computable<I, O> computable, boolean z14) {
        this.cache = new ConcurrentHashMap();
        this.computable = computable;
        this.recalculate = z14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$compute$0(Object obj) {
        return this.computable.compute(obj);
    }

    private RuntimeException launderException(Throwable th3) {
        if (th3 instanceof RuntimeException) {
            return (RuntimeException) th3;
        }
        if (th3 instanceof Error) {
            throw ((Error) th3);
        }
        a.x("Unchecked exception", th3);
        return null;
    }

    @Override // org.apache.commons.lang3.concurrent.Computable
    public O compute(I i14) {
        FutureTask futureTask;
        while (true) {
            Future<O> futurePutIfAbsent = this.cache.get(i14);
            if (futurePutIfAbsent == null && (futurePutIfAbsent = this.cache.putIfAbsent(i14, (futureTask = new FutureTask(new b(4, this, i14))))) == null) {
                futureTask.run();
                futurePutIfAbsent = futureTask;
            }
            try {
                continue;
                return futurePutIfAbsent.get();
            } catch (CancellationException unused) {
                this.cache.remove(i14, futurePutIfAbsent);
            } catch (ExecutionException e4) {
                if (this.recalculate) {
                    this.cache.remove(i14, futurePutIfAbsent);
                }
                throw launderException(e4.getCause());
            }
        }
    }

    public Memoizer(Computable<I, O> computable) {
        this(computable, false);
    }
}
