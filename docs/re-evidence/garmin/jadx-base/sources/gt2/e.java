package gt2;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.rolling.RollingFileAppender;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lgt2/e;", "Lch/qos/logback/core/rolling/RollingFileAppender;", "Lch/qos/logback/classic/spi/ILoggingEvent;", "<init>", "()V", "glogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class e extends RollingFileAppender<ILoggingEvent> {
    @Override // ch.qos.logback.core.FileAppender
    public final boolean checkForFileCollisionInPreviousFileAppenders() {
        return false;
    }
}
