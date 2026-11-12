package org.eclipse.californium.elements.util;

import defpackage.zzp;
import defpackage.zzr;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes20.dex */
public abstract class CounterStatisticManager {
    protected final zzr.d align;
    private final ScheduledExecutorService executor;
    private final long interval;
    private AtomicLong lastTransfer;
    private final List<String> orderedKeys;
    private AtomicBoolean running;
    private final ConcurrentMap<String, zzr> statistics;
    protected final String tag;
    private ScheduledFuture<?> taskHandle;
    private final TimeUnit unit;

    public abstract void dump();

    public abstract boolean isEnabled();

    public CounterStatisticManager(String str) {
        this.align = new zzr.d();
        this.statistics = new ConcurrentHashMap();
        this.orderedKeys = new CopyOnWriteArrayList();
        this.running = new AtomicBoolean();
        this.lastTransfer = new AtomicLong(ClockUtil.c());
        this.tag = zzp.j(str);
        this.interval = 0L;
        this.unit = null;
        this.executor = null;
    }

    public CounterStatisticManager(String str, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        this.align = new zzr.d();
        this.statistics = new ConcurrentHashMap();
        this.orderedKeys = new CopyOnWriteArrayList();
        this.running = new AtomicBoolean();
        this.lastTransfer = new AtomicLong(ClockUtil.c());
        if (scheduledExecutorService == null) {
            throw new NullPointerException("executor must not be null!");
        }
        this.tag = zzp.j(str);
        if (isEnabled()) {
            this.interval = j;
            this.unit = timeUnit;
            this.executor = j <= 0 ? null : scheduledExecutorService;
        } else {
            this.interval = 0L;
            this.unit = null;
            this.executor = null;
        }
    }

    protected void add(String str, zzr zzrVar) {
        addByKey(str + zzrVar.d(), zzrVar);
    }

    protected void add(zzr zzrVar) {
        addByKey(zzrVar.d(), zzrVar);
    }

    protected void addByKey(String str, zzr zzrVar) {
        if (this.statistics.put(str, zzrVar) != null) {
            this.orderedKeys.remove(str);
        }
        this.orderedKeys.add(str);
    }

    protected void removeByKey(String str, zzr zzrVar) {
        if (this.statistics.remove(str, zzrVar)) {
            this.orderedKeys.remove(str);
        }
    }

    protected void removeByKey(String str) {
        if (this.statistics.containsKey(str)) {
            this.statistics.remove(str);
            this.orderedKeys.remove(str);
        }
    }

    protected zzr get(String str) {
        return this.statistics.get(str);
    }

    public zzr getByKey(String str) {
        return this.statistics.get(str);
    }

    public List<String> getKeys() {
        return Collections.unmodifiableList(this.orderedKeys);
    }

    public void start() {
        synchronized (this) {
            if (this.executor != null && this.taskHandle == null) {
                this.running.set(true);
                ScheduledExecutorService scheduledExecutorService = this.executor;
                Runnable runnable = new Runnable() { // from class: org.eclipse.californium.elements.util.CounterStatisticManager.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (CounterStatisticManager.this.running.get()) {
                            CounterStatisticManager.this.dump();
                        }
                    }
                };
                long j = this.interval;
                this.taskHandle = scheduledExecutorService.scheduleAtFixedRate(runnable, j, j, this.unit);
            }
        }
    }

    public boolean stop() {
        synchronized (this) {
            if (this.taskHandle == null) {
                return false;
            }
            this.running.set(false);
            this.taskHandle.cancel(false);
            this.taskHandle = null;
            return true;
        }
    }

    public long getLastTransferTime() {
        return this.lastTransfer.get();
    }

    public void transferCounter() {
        Iterator<zzr> it = this.statistics.values().iterator();
        while (it.hasNext()) {
            it.next().h();
        }
        this.lastTransfer.set(ClockUtil.c());
    }

    public void reset() {
        Iterator<zzr> it = this.statistics.values().iterator();
        while (it.hasNext()) {
            it.next().i();
        }
        this.lastTransfer.set(ClockUtil.c());
    }

    public long getCounter(String str) {
        return getByKey(str).a();
    }

    public long getCounterByKey(String str) {
        return getByKey(str).a();
    }

    public String getTag() {
        return this.tag;
    }
}
