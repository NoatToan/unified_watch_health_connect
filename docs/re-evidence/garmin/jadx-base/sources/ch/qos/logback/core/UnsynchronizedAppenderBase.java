package ch.qos.logback.core;

import am.j;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.FilterAttachableImpl;
import ch.qos.logback.core.spi.FilterReply;
import ch.qos.logback.core.status.WarnStatus;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class UnsynchronizedAppenderBase<E> extends ContextAwareBase implements Appender<E> {
    static final int ALLOWED_REPEATS = 3;
    protected String name;
    protected boolean started = false;
    private ThreadLocal<Boolean> guard = new ThreadLocal<>();
    private FilterAttachableImpl<E> fai = new FilterAttachableImpl<>();
    private int statusRepeatCount = 0;
    private int exceptionCount = 0;

    @Override // ch.qos.logback.core.spi.FilterAttachable
    public void addFilter(Filter<E> filter) {
        this.fai.addFilter(filter);
    }

    public abstract void append(E e4);

    @Override // ch.qos.logback.core.spi.FilterAttachable
    public void clearAllFilters() {
        this.fai.clearAllFilters();
    }

    @Override // ch.qos.logback.core.Appender
    public void doAppend(E e4) {
        Boolean bool = Boolean.TRUE;
        if (bool.equals(this.guard.get())) {
            return;
        }
        try {
            try {
                this.guard.set(bool);
                if (!this.started) {
                    int i14 = this.statusRepeatCount;
                    this.statusRepeatCount = i14 + 1;
                    if (i14 < 3) {
                        addStatus(new WarnStatus("Attempted to append to non started appender [" + this.name + "].", this));
                    }
                } else if (getFilterChainDecision(e4) != FilterReply.DENY) {
                    append(e4);
                }
            } catch (Exception e14) {
                int i15 = this.exceptionCount;
                this.exceptionCount = i15 + 1;
                if (i15 < 3) {
                    addError("Appender [" + this.name + "] failed to append.", e14);
                }
            }
        } finally {
            this.guard.set(Boolean.FALSE);
        }
    }

    @Override // ch.qos.logback.core.spi.FilterAttachable
    public List<Filter<E>> getCopyOfAttachedFiltersList() {
        return this.fai.getCopyOfAttachedFiltersList();
    }

    @Override // ch.qos.logback.core.spi.FilterAttachable
    public FilterReply getFilterChainDecision(E e4) {
        return this.fai.getFilterChainDecision(e4);
    }

    @Override // ch.qos.logback.core.Appender
    public String getName() {
        return this.name;
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public boolean isStarted() {
        return this.started;
    }

    @Override // ch.qos.logback.core.Appender
    public void setName(String str) {
        this.name = str;
    }

    public void start() {
        this.started = true;
    }

    public void stop() {
        this.started = false;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getClass().getName());
        sb3.append("[");
        return j.o(this.name, "]", sb3);
    }
}
