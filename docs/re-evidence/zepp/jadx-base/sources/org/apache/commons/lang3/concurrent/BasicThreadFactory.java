package org.apache.commons.lang3.concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.lang3.Validate;

/* JADX INFO: loaded from: classes23.dex */
public class BasicThreadFactory implements ThreadFactory {
    private final AtomicLong a;
    private final ThreadFactory b;
    private final Thread.UncaughtExceptionHandler c;
    private final String d;
    private final Integer e;
    private final Boolean f;

    public static class Builder implements org.apache.commons.lang3.builder.Builder<BasicThreadFactory> {
        private ThreadFactory a;
        private Thread.UncaughtExceptionHandler b;
        private String c;
        private Integer d;
        private Boolean e;

        public Builder daemon(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public Builder namingPattern(String str) {
            Validate.notNull(str, "Naming pattern must not be null!", new Object[0]);
            this.c = str;
            return this;
        }

        public Builder priority(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        public void reset() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }

        public Builder uncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            Validate.notNull(uncaughtExceptionHandler, "Uncaught exception handler must not be null!", new Object[0]);
            this.b = uncaughtExceptionHandler;
            return this;
        }

        public Builder wrappedFactory(ThreadFactory threadFactory) {
            Validate.notNull(threadFactory, "Wrapped ThreadFactory must not be null!", new Object[0]);
            this.a = threadFactory;
            return this;
        }

        @Override // org.apache.commons.lang3.builder.Builder
        public BasicThreadFactory build() {
            BasicThreadFactory basicThreadFactory = new BasicThreadFactory(this);
            reset();
            return basicThreadFactory;
        }
    }

    private void a(Thread thread) {
        if (getNamingPattern() != null) {
            thread.setName(String.format(getNamingPattern(), Long.valueOf(this.a.incrementAndGet())));
        }
        if (getUncaughtExceptionHandler() != null) {
            thread.setUncaughtExceptionHandler(getUncaughtExceptionHandler());
        }
        if (getPriority() != null) {
            thread.setPriority(getPriority().intValue());
        }
        if (getDaemonFlag() != null) {
            thread.setDaemon(getDaemonFlag().booleanValue());
        }
    }

    public final Boolean getDaemonFlag() {
        return this.f;
    }

    public final String getNamingPattern() {
        return this.d;
    }

    public final Integer getPriority() {
        return this.e;
    }

    public long getThreadCount() {
        return this.a.get();
    }

    public final Thread.UncaughtExceptionHandler getUncaughtExceptionHandler() {
        return this.c;
    }

    public final ThreadFactory getWrappedFactory() {
        return this.b;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadNewThread = getWrappedFactory().newThread(runnable);
        a(threadNewThread);
        return threadNewThread;
    }

    private BasicThreadFactory(Builder builder) {
        if (builder.a == null) {
            this.b = Executors.defaultThreadFactory();
        } else {
            this.b = builder.a;
        }
        this.d = builder.c;
        this.e = builder.d;
        this.f = builder.e;
        this.c = builder.b;
        this.a = new AtomicLong();
    }
}
