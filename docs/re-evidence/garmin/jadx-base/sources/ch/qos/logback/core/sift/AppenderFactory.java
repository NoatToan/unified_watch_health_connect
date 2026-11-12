package ch.qos.logback.core.sift;

import ch.qos.logback.core.Appender;
import ch.qos.logback.core.Context;

/* JADX INFO: loaded from: classes7.dex */
public interface AppenderFactory<E> {
    Appender<E> buildAppender(Context context, String str);
}
