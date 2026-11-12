package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.eventbus.Dispatcher;
import com.google.common.eventbus.ElementTypesAreNonnullByDefault;
import com.google.common.eventbus.SubscriberExceptionHandler;
import com.huawei.hms.network.embedded.g4;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public class aoi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f629c = Logger.getLogger(aoi.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SubscriberExceptionHandler f630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f631b;
    private final String d;
    private final Dispatcher e;
    private final aoe j;

    public aoi() {
        this("default");
    }

    public aoi(String str) {
        this(str, aqx.e(), Dispatcher.perThreadDispatchQueue(), e.e);
    }

    aoi(String str, Executor executor, Dispatcher dispatcher, SubscriberExceptionHandler subscriberExceptionHandler) {
        this.j = new aoe(this);
        this.d = (String) Preconditions.checkNotNull(str);
        this.f631b = (Executor) Preconditions.checkNotNull(executor);
        this.e = (Dispatcher) Preconditions.checkNotNull(dispatcher);
        this.f630a = (SubscriberExceptionHandler) Preconditions.checkNotNull(subscriberExceptionHandler);
    }

    public final String b() {
        return this.d;
    }

    void a(Throwable th, aog aogVar) {
        Preconditions.checkNotNull(th);
        Preconditions.checkNotNull(aogVar);
        try {
            this.f630a.handleException(th, aogVar);
        } catch (Throwable th2) {
            f629c.log(Level.SEVERE, String.format(Locale.ROOT, "Exception %s thrown while handling exception: %s", th2, th), th2);
        }
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).addValue(this.d).toString();
    }

    static final class e implements SubscriberExceptionHandler {
        static final e e = new e();

        e() {
        }

        @Override // com.google.common.eventbus.SubscriberExceptionHandler
        public void handleException(Throwable th, aog aogVar) {
            Logger loggerD = d(aogVar);
            if (loggerD.isLoggable(Level.SEVERE)) {
                loggerD.log(Level.SEVERE, a(aogVar), th);
            }
        }

        private static Logger d(aog aogVar) {
            return Logger.getLogger(aoi.class.getName() + "." + aogVar.a().b());
        }

        private static String a(aog aogVar) {
            Method methodE = aogVar.e();
            return "Exception thrown by subscriber method " + methodE.getName() + g4.k + methodE.getParameterTypes()[0].getName() + ") on subscriber " + aogVar.b() + " when dispatching event: " + aogVar.c();
        }
    }
}
