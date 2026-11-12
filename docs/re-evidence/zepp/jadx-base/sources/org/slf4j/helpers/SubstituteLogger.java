package org.slf4j.helpers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.event.EventRecodingLogger;
import org.slf4j.event.LoggingEvent;
import org.slf4j.event.SubstituteLoggingEvent;

/* JADX INFO: loaded from: classes23.dex */
public class SubstituteLogger implements Logger {
    private final String a;
    private volatile Logger b;
    private Boolean c;
    private Method d;
    private EventRecodingLogger e;
    private Queue<SubstituteLoggingEvent> f;
    private final boolean g;

    public SubstituteLogger(String str, Queue<SubstituteLoggingEvent> queue, boolean z) {
        this.a = str;
        this.f = queue;
        this.g = z;
    }

    private Logger b() {
        if (this.e == null) {
            this.e = new EventRecodingLogger(this, this.f);
        }
        return this.e;
    }

    public Logger a() {
        if (this.b != null) {
            return this.b;
        }
        return this.g ? NOPLogger.NOP_LOGGER : b();
    }

    @Override // org.slf4j.Logger
    public void debug(String str) {
        a().debug(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a.equals(((SubstituteLogger) obj).a);
    }

    @Override // org.slf4j.Logger
    public void error(String str) {
        a().error(str);
    }

    @Override // org.slf4j.Logger
    public String getName() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // org.slf4j.Logger
    public void info(String str) {
        a().info(str);
    }

    @Override // org.slf4j.Logger
    public boolean isDebugEnabled() {
        return a().isDebugEnabled();
    }

    public boolean isDelegateEventAware() {
        Boolean bool = this.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.d = this.b.getClass().getMethod("log", LoggingEvent.class);
            this.c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.c = Boolean.FALSE;
        }
        return this.c.booleanValue();
    }

    public boolean isDelegateNOP() {
        return this.b instanceof NOPLogger;
    }

    public boolean isDelegateNull() {
        return this.b == null;
    }

    @Override // org.slf4j.Logger
    public boolean isErrorEnabled() {
        return a().isErrorEnabled();
    }

    @Override // org.slf4j.Logger
    public boolean isInfoEnabled() {
        return a().isInfoEnabled();
    }

    @Override // org.slf4j.Logger
    public boolean isTraceEnabled() {
        return a().isTraceEnabled();
    }

    @Override // org.slf4j.Logger
    public boolean isWarnEnabled() {
        return a().isWarnEnabled();
    }

    public void log(LoggingEvent loggingEvent) {
        if (isDelegateEventAware()) {
            try {
                this.d.invoke(this.b, loggingEvent);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public void setDelegate(Logger logger) {
        this.b = logger;
    }

    @Override // org.slf4j.Logger
    public void trace(String str) {
        a().trace(str);
    }

    @Override // org.slf4j.Logger
    public void warn(String str) {
        a().warn(str);
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Object obj) {
        a().debug(str, obj);
    }

    @Override // org.slf4j.Logger
    public void error(String str, Object obj) {
        a().error(str, obj);
    }

    @Override // org.slf4j.Logger
    public void info(String str, Object obj) {
        a().info(str, obj);
    }

    @Override // org.slf4j.Logger
    public boolean isDebugEnabled(Marker marker) {
        return a().isDebugEnabled(marker);
    }

    @Override // org.slf4j.Logger
    public boolean isErrorEnabled(Marker marker) {
        return a().isErrorEnabled(marker);
    }

    @Override // org.slf4j.Logger
    public boolean isInfoEnabled(Marker marker) {
        return a().isInfoEnabled(marker);
    }

    @Override // org.slf4j.Logger
    public boolean isTraceEnabled(Marker marker) {
        return a().isTraceEnabled(marker);
    }

    @Override // org.slf4j.Logger
    public boolean isWarnEnabled(Marker marker) {
        return a().isWarnEnabled(marker);
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Object obj) {
        a().trace(str, obj);
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Object obj) {
        a().warn(str, obj);
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Object obj, Object obj2) {
        a().debug(str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void error(String str, Object obj, Object obj2) {
        a().error(str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void info(String str, Object obj, Object obj2) {
        a().info(str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Object obj, Object obj2) {
        a().trace(str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Object obj, Object obj2) {
        a().warn(str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Object... objArr) {
        a().debug(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void error(String str, Object... objArr) {
        a().error(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void info(String str, Object... objArr) {
        a().info(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Object... objArr) {
        a().trace(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Object... objArr) {
        a().warn(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Throwable th) {
        a().debug(str, th);
    }

    @Override // org.slf4j.Logger
    public void error(String str, Throwable th) {
        a().error(str, th);
    }

    @Override // org.slf4j.Logger
    public void info(String str, Throwable th) {
        a().info(str, th);
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Throwable th) {
        a().trace(str, th);
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Throwable th) {
        a().warn(str, th);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str) {
        a().debug(marker, str);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str) {
        a().error(marker, str);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str) {
        a().info(marker, str);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str) {
        a().trace(marker, str);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str) {
        a().warn(marker, str);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str, Object obj) {
        a().debug(marker, str, obj);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str, Object obj) {
        a().error(marker, str, obj);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str, Object obj) {
        a().info(marker, str, obj);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str, Object obj) {
        a().trace(marker, str, obj);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str, Object obj) {
        a().warn(marker, str, obj);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str, Object obj, Object obj2) {
        a().debug(marker, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str, Object obj, Object obj2) {
        a().error(marker, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str, Object obj, Object obj2) {
        a().info(marker, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str, Object obj, Object obj2) {
        a().trace(marker, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str, Object obj, Object obj2) {
        a().warn(marker, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str, Object... objArr) {
        a().debug(marker, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str, Object... objArr) {
        a().error(marker, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str, Object... objArr) {
        a().info(marker, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str, Object... objArr) {
        a().trace(marker, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str, Object... objArr) {
        a().warn(marker, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str, Throwable th) {
        a().debug(marker, str, th);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str, Throwable th) {
        a().error(marker, str, th);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str, Throwable th) {
        a().info(marker, str, th);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str, Throwable th) {
        a().trace(marker, str, th);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str, Throwable th) {
        a().warn(marker, str, th);
    }
}
