package defpackage;

import org.slf4j.Marker;
import org.slf4j.event.Level;
import org.slf4j.event.LoggingEvent;

/* JADX INFO: loaded from: classes20.dex */
public class aafd implements LoggingEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Marker f159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object[] f160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Level f161c;
    aafh d;
    String e;
    String f;
    Throwable g;
    long i;
    String j;

    @Override // org.slf4j.event.LoggingEvent
    public Level getLevel() {
        return this.f161c;
    }

    public void c(Level level) {
        this.f161c = level;
    }

    @Override // org.slf4j.event.LoggingEvent
    public Marker getMarker() {
        return this.f159a;
    }

    public void b(Marker marker) {
        this.f159a = marker;
    }

    @Override // org.slf4j.event.LoggingEvent
    public String getLoggerName() {
        return this.e;
    }

    public void b(String str) {
        this.e = str;
    }

    public aafh e() {
        return this.d;
    }

    public void d(aafh aafhVar) {
        this.d = aafhVar;
    }

    @Override // org.slf4j.event.LoggingEvent
    public String getMessage() {
        return this.f;
    }

    public void e(String str) {
        this.f = str;
    }

    @Override // org.slf4j.event.LoggingEvent
    public Object[] getArgumentArray() {
        return this.f160b;
    }

    public void d(Object[] objArr) {
        this.f160b = objArr;
    }

    @Override // org.slf4j.event.LoggingEvent
    public long getTimeStamp() {
        return this.i;
    }

    public void d(long j) {
        this.i = j;
    }

    @Override // org.slf4j.event.LoggingEvent
    public String getThreadName() {
        return this.j;
    }

    public void c(String str) {
        this.j = str;
    }

    @Override // org.slf4j.event.LoggingEvent
    public Throwable getThrowable() {
        return this.g;
    }

    public void d(Throwable th) {
        this.g = th;
    }
}
