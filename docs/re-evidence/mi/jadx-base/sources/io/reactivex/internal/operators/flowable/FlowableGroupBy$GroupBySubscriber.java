package io.reactivex.internal.operators.flowable;

import defpackage.bua;
import defpackage.bz9;
import defpackage.c8o;
import defpackage.gx1;
import defpackage.joo;
import defpackage.qf8;
import defpackage.t5l;
import defpackage.w3b;
import defpackage.x3h;
import defpackage.yno;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableGroupBy$GroupBySubscriber<T, K, V> extends BasicIntQueueSubscription<w3b<K, V>> implements yno {
    static final Object NULL_KEY = new Object();
    private static final long serialVersionUID = -3688291656102519502L;
    final int bufferSize;
    final boolean delayError;
    boolean done;
    final yno<? super w3b<K, V>> downstream;
    Throwable error;
    final Queue<bz9<K, V>> evictedGroups;
    volatile boolean finished;
    final Map<Object, bz9<K, V>> groups;
    final bua<? super T, ? extends K> keySelector;
    boolean outputFused;
    final c8o<w3b<K, V>> queue;
    joo upstream;
    final bua<? super T, ? extends V> valueSelector;
    final AtomicBoolean cancelled = new AtomicBoolean();
    final AtomicLong requested = new AtomicLong();
    final AtomicInteger groupCount = new AtomicInteger(1);

    public FlowableGroupBy$GroupBySubscriber(yno<? super w3b<K, V>> ynoVar, bua<? super T, ? extends K> buaVar, bua<? super T, ? extends V> buaVar2, int i, boolean z, Map<Object, bz9<K, V>> map, Queue<bz9<K, V>> queue) {
        this.downstream = ynoVar;
        this.keySelector = buaVar;
        this.valueSelector = buaVar2;
        this.bufferSize = i;
        this.delayError = z;
        this.groups = map;
        this.evictedGroups = queue;
        this.queue = new c8o<>(i);
    }

    private void completeEvictions() {
        if (this.evictedGroups != null) {
            int i = 0;
            while (true) {
                bz9<K, V> bz9VarPoll = this.evictedGroups.poll();
                if (bz9VarPoll == null) {
                    break;
                }
                bz9VarPoll.g();
                i++;
            }
            if (i != 0) {
                this.groupCount.addAndGet(-i);
            }
        }
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, defpackage.joo
    public void cancel() {
        if (this.cancelled.compareAndSet(false, true)) {
            completeEvictions();
            if (this.groupCount.decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    public boolean checkTerminated(boolean z, boolean z2, yno<?> ynoVar, c8o<?> c8oVar) {
        if (this.cancelled.get()) {
            c8oVar.clear();
            return true;
        }
        if (this.delayError) {
            if (!z || !z2) {
                return false;
            }
            Throwable th = this.error;
            if (th != null) {
                ynoVar.onError(th);
            } else {
                ynoVar.onComplete();
            }
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th2 = this.error;
        if (th2 != null) {
            c8oVar.clear();
            ynoVar.onError(th2);
            return true;
        }
        if (!z2) {
            return false;
        }
        ynoVar.onComplete();
        return true;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, defpackage.jdm
    public void clear() {
        this.queue.clear();
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        if (this.outputFused) {
            drainFused();
        } else {
            drainNormal();
        }
    }

    public void drainFused() {
        Throwable th;
        c8o<w3b<K, V>> c8oVar = this.queue;
        yno<? super w3b<K, V>> ynoVar = this.downstream;
        int iAddAndGet = 1;
        while (!this.cancelled.get()) {
            boolean z = this.finished;
            if (z && !this.delayError && (th = this.error) != null) {
                c8oVar.clear();
                ynoVar.onError(th);
                return;
            }
            ynoVar.onNext(null);
            if (z) {
                Throwable th2 = this.error;
                if (th2 != null) {
                    ynoVar.onError(th2);
                    return;
                } else {
                    ynoVar.onComplete();
                    return;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    public void drainNormal() {
        c8o<w3b<K, V>> c8oVar = this.queue;
        yno<? super w3b<K, V>> ynoVar = this.downstream;
        int iAddAndGet = 1;
        do {
            long j = this.requested.get();
            long j2 = 0;
            while (j2 != j) {
                boolean z = this.finished;
                w3b<K, V> w3bVarPoll = c8oVar.poll();
                boolean z2 = w3bVarPoll == null;
                if (checkTerminated(z, z2, ynoVar, c8oVar)) {
                    return;
                }
                if (z2) {
                    break;
                }
                ynoVar.onNext(w3bVarPoll);
                j2++;
            }
            if (j2 == j && checkTerminated(this.finished, c8oVar.isEmpty(), ynoVar, c8oVar)) {
                return;
            }
            if (j2 != 0) {
                if (j != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j2);
                }
                this.upstream.request(j2);
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, defpackage.jdm
    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    @Override // defpackage.yno
    public void onComplete() {
        if (this.done) {
            return;
        }
        Iterator<bz9<K, V>> it = this.groups.values().iterator();
        while (it.hasNext()) {
            it.next().g();
        }
        this.groups.clear();
        Queue<bz9<K, V>> queue = this.evictedGroups;
        if (queue != null) {
            queue.clear();
        }
        this.done = true;
        this.finished = true;
        drain();
    }

    @Override // defpackage.yno
    public void onError(Throwable th) {
        if (this.done) {
            t5l.p(th);
            return;
        }
        this.done = true;
        Iterator<bz9<K, V>> it = this.groups.values().iterator();
        while (it.hasNext()) {
            it.next().h(th);
        }
        this.groups.clear();
        Queue<bz9<K, V>> queue = this.evictedGroups;
        if (queue != null) {
            queue.clear();
        }
        this.error = th;
        this.finished = true;
        drain();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.yno
    public void onNext(T t) {
        boolean z;
        bz9 bz9Var;
        if (this.done) {
            return;
        }
        c8o<w3b<K, V>> c8oVar = this.queue;
        try {
            K kApply = this.keySelector.apply(t);
            Object obj = kApply != null ? kApply : NULL_KEY;
            bz9<K, V> bz9Var2 = this.groups.get(obj);
            if (bz9Var2 != null) {
                z = false;
                bz9Var = bz9Var2;
            } else {
                if (this.cancelled.get()) {
                    return;
                }
                bz9 bz9VarF = bz9.f(kApply, this.bufferSize, this, this.delayError);
                this.groups.put(obj, bz9VarF);
                this.groupCount.getAndIncrement();
                z = true;
                bz9Var = bz9VarF;
            }
            try {
                bz9Var.i(x3h.d(this.valueSelector.apply(t), "The valueSelector returned null"));
                completeEvictions();
                if (z) {
                    c8oVar.offer(bz9Var);
                    drain();
                }
            } catch (Throwable th) {
                qf8.b(th);
                this.upstream.cancel();
                onError(th);
            }
        } catch (Throwable th2) {
            qf8.b(th2);
            this.upstream.cancel();
            onError(th2);
        }
    }

    @Override // defpackage.yno
    public void onSubscribe(joo jooVar) {
        if (SubscriptionHelper.validate(this.upstream, jooVar)) {
            this.upstream = jooVar;
            this.downstream.onSubscribe(this);
            jooVar.request(this.bufferSize);
        }
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, defpackage.joo
    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            gx1.a(this.requested, j);
            drain();
        }
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, defpackage.dgi
    public int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        this.outputFused = true;
        return 2;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, defpackage.jdm
    public w3b<K, V> poll() {
        return this.queue.poll();
    }

    public void cancel(K k2) {
        if (k2 == null) {
            k2 = (K) NULL_KEY;
        }
        this.groups.remove(k2);
        if (this.groupCount.decrementAndGet() == 0) {
            this.upstream.cancel();
            if (this.outputFused || getAndIncrement() != 0) {
                return;
            }
            this.queue.clear();
        }
    }
}
