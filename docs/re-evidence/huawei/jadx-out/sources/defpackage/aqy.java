package defpackage;

import com.google.common.util.concurrent.ElementTypesAreNonnullByDefault;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class aqy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f708b;
    private volatile Logger d;

    public aqy(Class<?> cls) {
        this.f708b = cls.getName();
    }

    public Logger b() {
        Logger logger = this.d;
        if (logger != null) {
            return logger;
        }
        synchronized (this) {
            Logger logger2 = this.d;
            if (logger2 != null) {
                return logger2;
            }
            Logger logger3 = Logger.getLogger(this.f708b);
            this.d = logger3;
            return logger3;
        }
    }
}
