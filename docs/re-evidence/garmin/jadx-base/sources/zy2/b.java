package zy2;

import com.nimbusds.jose.HeaderParameterNames;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzy2/b;", "Lzy2/k;", "", HeaderParameterNames.AUTHENTICATION_TAG, "Lorg/slf4j/Logger;", "logger", "<init>", "(Ljava/lang/String;Lorg/slf4j/Logger;)V", "util-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f207526a;

    public b(String str, Logger logger) {
        str.getClass();
        logger.getClass();
        this.f207526a = logger;
    }

    @Override // zy2.k
    public final void a(Exception exc, String str) {
        Logger logger = this.f207526a;
        if (exc != null) {
            logger.warn(str, (Throwable) exc);
        } else {
            logger.warn(str);
        }
    }

    @Override // zy2.k
    public final void debug(String str) {
        str.getClass();
        c.f207527a.getClass();
        this.f207526a.debug(str);
    }

    @Override // zy2.k
    public final void error(String str, Throwable th3) {
        Logger logger = this.f207526a;
        if (th3 != null) {
            logger.error(str, th3);
        } else {
            logger.error(str);
        }
    }

    @Override // zy2.k
    public final void info(String str) {
        c.f207527a.getClass();
        this.f207526a.info(str);
    }

    @Override // zy2.k
    public final void trace(String str) {
        c.f207527a.getClass();
        this.f207526a.trace(str);
    }
}
