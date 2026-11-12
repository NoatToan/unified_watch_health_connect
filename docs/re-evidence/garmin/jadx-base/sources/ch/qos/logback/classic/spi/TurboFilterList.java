package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.turbo.TurboFilter;
import ch.qos.logback.core.spi.FilterReply;
import java.util.concurrent.CopyOnWriteArrayList;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes7.dex */
public final class TurboFilterList extends CopyOnWriteArrayList<TurboFilter> {
    private static final long serialVersionUID = 1;

    public FilterReply getTurboFilterChainDecision(Marker marker, Logger logger, Level level, String str, Object[] objArr, Throwable th3) {
        if (size() == 1) {
            try {
                return get(0).decide(marker, logger, level, str, objArr, th3);
            } catch (IndexOutOfBoundsException unused) {
                return FilterReply.NEUTRAL;
            }
        }
        Logger logger2 = logger;
        Level level2 = level;
        String str2 = str;
        Object[] objArr2 = objArr;
        for (Object obj : toArray()) {
            Logger logger3 = logger2;
            Level level3 = level2;
            String str3 = str2;
            Object[] objArr3 = objArr2;
            FilterReply filterReplyDecide = ((TurboFilter) obj).decide(marker, logger3, level3, str3, objArr3, th3);
            objArr2 = objArr3;
            str2 = str3;
            level2 = level3;
            logger2 = logger3;
            if (filterReplyDecide == FilterReply.DENY || filterReplyDecide == FilterReply.ACCEPT) {
                return filterReplyDecide;
            }
        }
        return FilterReply.NEUTRAL;
    }
}
