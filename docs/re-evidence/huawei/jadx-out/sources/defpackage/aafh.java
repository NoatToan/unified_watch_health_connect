package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.event.LoggingEvent;

/* JADX INFO: loaded from: classes20.dex */
public class aafh implements Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Boolean f164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private aaew f165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Queue<aafd> f166c;
    private volatile Logger d;
    private final boolean e;
    private Method g;
    private final String i;

    public aafh(String str, Queue<aafd> queue, boolean z) {
        this.i = str;
        this.f166c = queue;
        this.e = z;
    }

    @Override // org.slf4j.Logger
    public String getName() {
        return this.i;
    }

    @Override // org.slf4j.Logger
    public boolean isTraceEnabled() {
        return d().isTraceEnabled();
    }

    @Override // org.slf4j.Logger
    public void trace(String str) {
        d().trace(str);
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Object obj) {
        d().trace(str, obj);
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Object obj, Object obj2) {
        d().trace(str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Object... objArr) {
        d().trace(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Throwable th) {
        d().trace(str, th);
    }

    @Override // org.slf4j.Logger
    public boolean isTraceEnabled(Marker marker) {
        return d().isTraceEnabled(marker);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str) {
        d().trace(marker, str);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str, Object obj) {
        d().trace(marker, str, obj);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str, Object obj, Object obj2) {
        d().trace(marker, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str, Object... objArr) {
        d().trace(marker, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str, Throwable th) {
        d().trace(marker, str, th);
    }

    @Override // org.slf4j.Logger
    public boolean isDebugEnabled() {
        return d().isDebugEnabled();
    }

    @Override // org.slf4j.Logger
    public void debug(String str) {
        d().debug(str);
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Object obj) {
        d().debug(str, obj);
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Object obj, Object obj2) {
        d().debug(str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Object... objArr) {
        d().debug(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Throwable th) {
        d().debug(str, th);
    }

    @Override // org.slf4j.Logger
    public boolean isDebugEnabled(Marker marker) {
        return d().isDebugEnabled(marker);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str) {
        d().debug(marker, str);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str, Object obj) {
        d().debug(marker, str, obj);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str, Object obj, Object obj2) {
        d().debug(marker, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str, Object... objArr) {
        d().debug(marker, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str, Throwable th) {
        d().debug(marker, str, th);
    }

    @Override // org.slf4j.Logger
    public boolean isInfoEnabled() {
        return d().isInfoEnabled();
    }

    @Override // org.slf4j.Logger
    public void info(String str) {
        d().info(str);
    }

    @Override // org.slf4j.Logger
    public void info(String str, Object obj) {
        d().info(str, obj);
    }

    @Override // org.slf4j.Logger
    public void info(String str, Object obj, Object obj2) {
        d().info(str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void info(String str, Object... objArr) {
        d().info(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void info(String str, Throwable th) {
        d().info(str, th);
    }

    @Override // org.slf4j.Logger
    public boolean isInfoEnabled(Marker marker) {
        return d().isInfoEnabled(marker);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str) {
        d().info(marker, str);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str, Object obj) {
        d().info(marker, str, obj);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str, Object obj, Object obj2) {
        d().info(marker, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str, Object... objArr) {
        d().info(marker, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str, Throwable th) {
        d().info(marker, str, th);
    }

    @Override // org.slf4j.Logger
    public boolean isWarnEnabled() {
        return d().isWarnEnabled();
    }

    @Override // org.slf4j.Logger
    public void warn(String str) {
        d().warn(str);
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Object obj) {
        d().warn(str, obj);
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Object obj, Object obj2) {
        d().warn(str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Object... objArr) {
        d().warn(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Throwable th) {
        d().warn(str, th);
    }

    @Override // org.slf4j.Logger
    public boolean isWarnEnabled(Marker marker) {
        return d().isWarnEnabled(marker);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str) {
        d().warn(marker, str);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str, Object obj) {
        d().warn(marker, str, obj);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str, Object obj, Object obj2) {
        d().warn(marker, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str, Object... objArr) {
        d().warn(marker, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str, Throwable th) {
        d().warn(marker, str, th);
    }

    @Override // org.slf4j.Logger
    public boolean isErrorEnabled() {
        return d().isErrorEnabled();
    }

    @Override // org.slf4j.Logger
    public void error(String str) {
        d().error(str);
    }

    @Override // org.slf4j.Logger
    public void error(String str, Object obj) {
        d().error(str, obj);
    }

    @Override // org.slf4j.Logger
    public void error(String str, Object obj, Object obj2) {
        d().error(str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void error(String str, Object... objArr) {
        d().error(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void error(String str, Throwable th) {
        d().error(str, th);
    }

    @Override // org.slf4j.Logger
    public boolean isErrorEnabled(Marker marker) {
        return d().isErrorEnabled(marker);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str) {
        d().error(marker, str);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str, Object obj) {
        d().error(marker, str, obj);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str, Object obj, Object obj2) {
        d().error(marker, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str, Object... objArr) {
        d().error(marker, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str, Throwable th) {
        d().error(marker, str, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.i.equals(((aafh) obj).i);
    }

    public int hashCode() {
        return this.i.hashCode();
    }

    Logger d() {
        if (this.d != null) {
            return this.d;
        }
        if (this.e) {
            return aafa.d;
        }
        return c();
    }

    private Logger c() {
        if (this.f165b == null) {
            this.f165b = new aaew(this, this.f166c);
        }
        return this.f165b;
    }

    public void c(Logger logger) {
        this.d = logger;
    }

    public boolean e() {
        Boolean bool = this.f164a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.g = this.d.getClass().getMethod("log", LoggingEvent.class);
            this.f164a = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f164a = Boolean.FALSE;
        }
        return this.f164a.booleanValue();
    }

    public void b(LoggingEvent loggingEvent) {
        if (e()) {
            try {
                this.g.invoke(this.d, loggingEvent);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public boolean a() {
        return this.d == null;
    }

    public boolean b() {
        return this.d instanceof aafa;
    }
}
