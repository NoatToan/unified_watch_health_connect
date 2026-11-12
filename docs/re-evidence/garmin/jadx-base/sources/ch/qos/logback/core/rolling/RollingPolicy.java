package ch.qos.logback.core.rolling;

import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.rolling.helper.CompressionMode;
import ch.qos.logback.core.spi.LifeCycle;

/* JADX INFO: loaded from: classes7.dex */
public interface RollingPolicy extends LifeCycle {
    String getActiveFileName();

    CompressionMode getCompressionMode();

    void rollover();

    void setParent(FileAppender<?> fileAppender);
}
