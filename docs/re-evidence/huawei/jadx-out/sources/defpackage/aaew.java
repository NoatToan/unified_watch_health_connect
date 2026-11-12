package defpackage;

import java.util.Queue;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.event.Level;

/* JADX INFO: loaded from: classes20.dex */
public class aaew implements Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    aafh f155a;
    String d;
    Queue<aafd> e;

    @Override // org.slf4j.Logger
    public boolean isDebugEnabled() {
        return true;
    }

    @Override // org.slf4j.Logger
    public boolean isDebugEnabled(Marker marker) {
        return true;
    }

    @Override // org.slf4j.Logger
    public boolean isErrorEnabled() {
        return true;
    }

    @Override // org.slf4j.Logger
    public boolean isErrorEnabled(Marker marker) {
        return true;
    }

    @Override // org.slf4j.Logger
    public boolean isInfoEnabled() {
        return true;
    }

    @Override // org.slf4j.Logger
    public boolean isInfoEnabled(Marker marker) {
        return true;
    }

    @Override // org.slf4j.Logger
    public boolean isTraceEnabled() {
        return true;
    }

    @Override // org.slf4j.Logger
    public boolean isTraceEnabled(Marker marker) {
        return true;
    }

    @Override // org.slf4j.Logger
    public boolean isWarnEnabled() {
        return true;
    }

    @Override // org.slf4j.Logger
    public boolean isWarnEnabled(Marker marker) {
        return true;
    }

    public aaew(aafh aafhVar, Queue<aafd> queue) {
        this.f155a = aafhVar;
        this.d = aafhVar.getName();
        this.e = queue;
    }

    @Override // org.slf4j.Logger
    public String getName() {
        return this.d;
    }

    @Override // org.slf4j.Logger
    public void trace(String str) {
        c(Level.TRACE, null, str, null);
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Object obj) {
        e(Level.TRACE, null, str, obj);
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Object obj, Object obj2) {
        a(Level.TRACE, null, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Object... objArr) {
        a(Level.TRACE, null, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Throwable th) {
        c(Level.TRACE, null, str, th);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str) {
        c(Level.TRACE, marker, str, null);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str, Object obj) {
        e(Level.TRACE, marker, str, obj);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str, Object obj, Object obj2) {
        a(Level.TRACE, marker, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str, Object... objArr) {
        a(Level.TRACE, marker, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str, Throwable th) {
        c(Level.TRACE, marker, str, th);
    }

    @Override // org.slf4j.Logger
    public void debug(String str) {
        c(Level.DEBUG, null, str, null);
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Object obj) {
        e(Level.DEBUG, null, str, obj);
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Object obj, Object obj2) {
        a(Level.DEBUG, null, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Object... objArr) {
        a(Level.DEBUG, null, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Throwable th) {
        c(Level.DEBUG, null, str, th);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str) {
        c(Level.DEBUG, marker, str, null);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str, Object obj) {
        e(Level.DEBUG, marker, str, obj);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str, Object obj, Object obj2) {
        a(Level.DEBUG, marker, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str, Object... objArr) {
        a(Level.DEBUG, marker, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str, Throwable th) {
        c(Level.DEBUG, marker, str, th);
    }

    @Override // org.slf4j.Logger
    public void info(String str) {
        c(Level.INFO, null, str, null);
    }

    @Override // org.slf4j.Logger
    public void info(String str, Object obj) {
        e(Level.INFO, null, str, obj);
    }

    @Override // org.slf4j.Logger
    public void info(String str, Object obj, Object obj2) {
        a(Level.INFO, null, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void info(String str, Object... objArr) {
        a(Level.INFO, null, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void info(String str, Throwable th) {
        c(Level.INFO, null, str, th);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str) {
        c(Level.INFO, marker, str, null);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str, Object obj) {
        e(Level.INFO, marker, str, obj);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str, Object obj, Object obj2) {
        a(Level.INFO, marker, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str, Object... objArr) {
        a(Level.INFO, marker, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str, Throwable th) {
        c(Level.INFO, marker, str, th);
    }

    @Override // org.slf4j.Logger
    public void warn(String str) {
        c(Level.WARN, null, str, null);
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Object obj) {
        e(Level.WARN, null, str, obj);
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Object obj, Object obj2) {
        a(Level.WARN, null, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Object... objArr) {
        a(Level.WARN, null, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Throwable th) {
        c(Level.WARN, null, str, th);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str) {
        c(Level.WARN, marker, str, null);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str, Object obj) {
        e(Level.WARN, marker, str, obj);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str, Object obj, Object obj2) {
        a(Level.WARN, marker, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str, Object... objArr) {
        a(Level.WARN, marker, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str, Throwable th) {
        c(Level.WARN, marker, str, th);
    }

    @Override // org.slf4j.Logger
    public void error(String str) {
        c(Level.ERROR, null, str, null);
    }

    @Override // org.slf4j.Logger
    public void error(String str, Object obj) {
        e(Level.ERROR, null, str, obj);
    }

    @Override // org.slf4j.Logger
    public void error(String str, Object obj, Object obj2) {
        a(Level.ERROR, null, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void error(String str, Object... objArr) {
        a(Level.ERROR, null, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void error(String str, Throwable th) {
        c(Level.ERROR, null, str, th);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str) {
        c(Level.ERROR, marker, str, null);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str, Object obj) {
        e(Level.ERROR, marker, str, obj);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str, Object obj, Object obj2) {
        a(Level.ERROR, marker, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str, Object... objArr) {
        a(Level.ERROR, marker, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str, Throwable th) {
        c(Level.ERROR, marker, str, th);
    }

    private void c(Level level, Marker marker, String str, Throwable th) {
        e(level, marker, str, null, th);
    }

    private void e(Level level, Marker marker, String str, Object obj) {
        e(level, marker, str, new Object[]{obj}, null);
    }

    private void a(Level level, Marker marker, String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            e(level, marker, str, new Object[]{obj}, (Throwable) obj2);
        } else {
            e(level, marker, str, new Object[]{obj, obj2}, null);
        }
    }

    private void a(Level level, Marker marker, String str, Object[] objArr) {
        Throwable thB = aafb.b(objArr);
        if (thB != null) {
            e(level, marker, str, aafb.a(objArr), thB);
        } else {
            e(level, marker, str, objArr, null);
        }
    }

    private void e(Level level, Marker marker, String str, Object[] objArr, Throwable th) {
        aafd aafdVar = new aafd();
        aafdVar.d(System.currentTimeMillis());
        aafdVar.c(level);
        aafdVar.d(this.f155a);
        aafdVar.b(this.d);
        aafdVar.b(marker);
        aafdVar.e(str);
        aafdVar.c(Thread.currentThread().getName());
        aafdVar.d(objArr);
        aafdVar.d(th);
        this.e.add(aafdVar);
    }
}
