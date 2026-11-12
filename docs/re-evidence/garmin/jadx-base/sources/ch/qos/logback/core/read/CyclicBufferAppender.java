package ch.qos.logback.core.read;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.helpers.CyclicBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class CyclicBufferAppender<E> extends AppenderBase<E> {

    /* JADX INFO: renamed from: cb, reason: collision with root package name */
    CyclicBuffer<E> f27283cb;
    int maxSize = 512;

    @Override // ch.qos.logback.core.AppenderBase
    public void append(E e4) {
        if (isStarted()) {
            this.f27283cb.add(e4);
        }
    }

    public E get(int i14) {
        if (isStarted()) {
            return this.f27283cb.get(i14);
        }
        return null;
    }

    public int getLength() {
        if (isStarted()) {
            return this.f27283cb.length();
        }
        return 0;
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public void reset() {
        this.f27283cb.clear();
    }

    public void setMaxSize(int i14) {
        this.maxSize = i14;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        this.f27283cb = new CyclicBuffer<>(this.maxSize);
        super.start();
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.f27283cb = null;
        super.stop();
    }
}
