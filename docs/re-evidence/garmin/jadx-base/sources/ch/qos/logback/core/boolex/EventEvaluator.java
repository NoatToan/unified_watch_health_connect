package ch.qos.logback.core.boolex;

import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.LifeCycle;

/* JADX INFO: loaded from: classes7.dex */
public interface EventEvaluator<E> extends ContextAware, LifeCycle {
    boolean evaluate(E e4);

    String getName();

    void setName(String str);
}
