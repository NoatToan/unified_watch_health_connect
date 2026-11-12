package ch.qos.logback.core.spi;

/* JADX INFO: loaded from: classes7.dex */
public interface LifeCycle {
    boolean isStarted();

    void start();

    void stop();
}
