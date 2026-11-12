package ch.qos.logback.core;

import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.FilterAttachable;
import ch.qos.logback.core.spi.LifeCycle;

/* JADX INFO: loaded from: classes7.dex */
public interface Appender<E> extends LifeCycle, ContextAware, FilterAttachable<E> {
    void doAppend(E e4);

    String getName();

    void setName(String str);
}
