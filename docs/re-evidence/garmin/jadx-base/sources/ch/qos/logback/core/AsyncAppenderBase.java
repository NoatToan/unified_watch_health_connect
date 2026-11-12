package ch.qos.logback.core;

import ch.qos.logback.core.spi.AppenderAttachable;
import ch.qos.logback.core.spi.AppenderAttachableImpl;
import ch.qos.logback.core.util.InterruptUtil;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes7.dex */
public class AsyncAppenderBase<E> extends UnsynchronizedAppenderBase<E> implements AppenderAttachable<E> {
    public static final int DEFAULT_MAX_FLUSH_TIME = 1000;
    public static final int DEFAULT_QUEUE_SIZE = 256;
    static final int UNDEFINED = -1;
    BlockingQueue<E> blockingQueue;
    AppenderAttachableImpl<E> aai = new AppenderAttachableImpl<>();
    int queueSize = 256;
    int appenderCount = 0;
    int discardingThreshold = -1;
    boolean neverBlock = false;
    AsyncAppenderBase<E>.Worker worker = new Worker();
    int maxFlushTime = 1000;

    public class Worker extends Thread {
        public Worker() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AsyncAppenderBase asyncAppenderBase = AsyncAppenderBase.this;
            AppenderAttachableImpl<E> appenderAttachableImpl = asyncAppenderBase.aai;
            while (asyncAppenderBase.isStarted()) {
                try {
                    appenderAttachableImpl.appendLoopOnAppenders(asyncAppenderBase.blockingQueue.take());
                } catch (InterruptedException unused) {
                }
            }
            AsyncAppenderBase.this.addInfo("Worker thread will flush remaining events before exiting.");
            for (E e4 : asyncAppenderBase.blockingQueue) {
                appenderAttachableImpl.appendLoopOnAppenders(e4);
                asyncAppenderBase.blockingQueue.remove(e4);
            }
            appenderAttachableImpl.detachAndStopAllAppenders();
        }
    }

    private boolean isQueueBelowDiscardingThreshold() {
        return this.blockingQueue.remainingCapacity() < this.discardingThreshold;
    }

    private void put(E e4) {
        if (this.neverBlock) {
            this.blockingQueue.offer(e4);
        } else {
            putUninterruptibly(e4);
        }
    }

    private void putUninterruptibly(E e4) {
        boolean z14 = false;
        while (true) {
            try {
                this.blockingQueue.put(e4);
                break;
            } catch (InterruptedException unused) {
                z14 = true;
            } catch (Throwable th3) {
                if (z14) {
                    Thread.currentThread().interrupt();
                }
                throw th3;
            }
        }
        if (z14) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public void addAppender(Appender<E> appender) {
        int i14 = this.appenderCount;
        if (i14 != 0) {
            addWarn("One and only one appender may be attached to AsyncAppender.");
            addWarn("Ignoring additional appender named [" + appender.getName() + "]");
            return;
        }
        this.appenderCount = i14 + 1;
        addInfo("Attaching appender named [" + appender.getName() + "] to AsyncAppender.");
        this.aai.addAppender(appender);
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase
    public void append(E e4) {
        if (isQueueBelowDiscardingThreshold() && isDiscardable(e4)) {
            return;
        }
        preprocess(e4);
        put(e4);
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public void detachAndStopAllAppenders() {
        this.aai.detachAndStopAllAppenders();
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean detachAppender(Appender<E> appender) {
        return this.aai.detachAppender(appender);
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public Appender<E> getAppender(String str) {
        return this.aai.getAppender(str);
    }

    public int getDiscardingThreshold() {
        return this.discardingThreshold;
    }

    public int getMaxFlushTime() {
        return this.maxFlushTime;
    }

    public int getNumberOfElementsInQueue() {
        return this.blockingQueue.size();
    }

    public int getQueueSize() {
        return this.queueSize;
    }

    public int getRemainingCapacity() {
        return this.blockingQueue.remainingCapacity();
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean isAttached(Appender<E> appender) {
        return this.aai.isAttached(appender);
    }

    public boolean isDiscardable(E e4) {
        return false;
    }

    public boolean isNeverBlock() {
        return this.neverBlock;
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public Iterator<Appender<E>> iteratorForAppenders() {
        return this.aai.iteratorForAppenders();
    }

    public void preprocess(E e4) {
    }

    public void setDiscardingThreshold(int i14) {
        this.discardingThreshold = i14;
    }

    public void setMaxFlushTime(int i14) {
        this.maxFlushTime = i14;
    }

    public void setNeverBlock(boolean z14) {
        this.neverBlock = z14;
    }

    public void setQueueSize(int i14) {
        this.queueSize = i14;
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (isStarted()) {
            return;
        }
        if (this.appenderCount == 0) {
            addError("No attached appenders found.");
            return;
        }
        if (this.queueSize < 1) {
            addError("Invalid queue size [" + this.queueSize + "]");
            return;
        }
        this.blockingQueue = new ArrayBlockingQueue(this.queueSize);
        if (this.discardingThreshold == -1) {
            this.discardingThreshold = this.queueSize / 5;
        }
        addInfo("Setting discardingThreshold to " + this.discardingThreshold);
        this.worker.setDaemon(true);
        this.worker.setName("AsyncAppender-Worker-" + getName());
        super.start();
        this.worker.start();
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        if (isStarted()) {
            super.stop();
            this.worker.interrupt();
            InterruptUtil interruptUtil = new InterruptUtil(this.context);
            try {
                interruptUtil.maskInterruptFlag();
                this.worker.join(this.maxFlushTime);
                if (this.worker.isAlive()) {
                    addWarn("Max queue flush timeout (" + this.maxFlushTime + " ms) exceeded. " + this.blockingQueue.size() + " queued events were possibly discarded.");
                } else {
                    addInfo("Queue flush finished successfully within timeout.");
                }
            } catch (InterruptedException e4) {
                addError("Failed to join worker thread. " + this.blockingQueue.size() + " queued events may be discarded.", e4);
            } finally {
                interruptUtil.unmaskInterruptFlag();
            }
        }
    }

    @Override // ch.qos.logback.core.spi.AppenderAttachable
    public boolean detachAppender(String str) {
        return this.aai.detachAppender(str);
    }
}
