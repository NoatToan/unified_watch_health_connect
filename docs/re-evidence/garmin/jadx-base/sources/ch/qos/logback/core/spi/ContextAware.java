package ch.qos.logback.core.spi;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.status.Status;

/* JADX INFO: loaded from: classes7.dex */
public interface ContextAware {
    void addError(String str);

    void addError(String str, Throwable th3);

    void addInfo(String str);

    void addInfo(String str, Throwable th3);

    void addStatus(Status status);

    void addWarn(String str);

    void addWarn(String str, Throwable th3);

    Context getContext();

    void setContext(Context context);
}
