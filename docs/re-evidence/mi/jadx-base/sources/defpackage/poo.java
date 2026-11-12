package defpackage;

import org.slf4j.helpers.NOPLogger;

/* JADX INFO: loaded from: classes3.dex */
public class poo implements qpe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile qpe f30591b;

    public poo(String str) {
        this.f30590a = str;
    }

    public qpe b() {
        return this.f30591b != null ? this.f30591b : NOPLogger.NOP_LOGGER;
    }

    public void c(qpe qpeVar) {
        this.f30591b = qpeVar;
    }

    @Override // defpackage.qpe
    public void debug(String str) {
        b().debug(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f30590a.equals(((poo) obj).f30590a);
    }

    @Override // defpackage.qpe
    public void error(String str) {
        b().error(str);
    }

    @Override // defpackage.qpe
    public String getName() {
        return this.f30590a;
    }

    public int hashCode() {
        return this.f30590a.hashCode();
    }

    @Override // defpackage.qpe
    public void info(String str) {
        b().info(str);
    }

    @Override // defpackage.qpe
    public boolean isDebugEnabled() {
        return b().isDebugEnabled();
    }

    @Override // defpackage.qpe
    public boolean isErrorEnabled() {
        return b().isErrorEnabled();
    }

    @Override // defpackage.qpe
    public boolean isInfoEnabled() {
        return b().isInfoEnabled();
    }

    @Override // defpackage.qpe
    public boolean isTraceEnabled() {
        return b().isTraceEnabled();
    }

    @Override // defpackage.qpe
    public boolean isWarnEnabled() {
        return b().isWarnEnabled();
    }

    @Override // defpackage.qpe
    public void trace(String str) {
        b().trace(str);
    }

    @Override // defpackage.qpe
    public void warn(String str) {
        b().warn(str);
    }

    @Override // defpackage.qpe
    public void debug(String str, Object obj) {
        b().debug(str, obj);
    }

    @Override // defpackage.qpe
    public void error(String str, Object obj) {
        b().error(str, obj);
    }

    @Override // defpackage.qpe
    public void info(String str, Object obj) {
        b().info(str, obj);
    }

    @Override // defpackage.qpe
    public void trace(String str, Object obj) {
        b().trace(str, obj);
    }

    @Override // defpackage.qpe
    public void warn(String str, Object obj) {
        b().warn(str, obj);
    }

    @Override // defpackage.qpe
    public void debug(String str, Object obj, Object obj2) {
        b().debug(str, obj, obj2);
    }

    @Override // defpackage.qpe
    public void error(String str, Object obj, Object obj2) {
        b().error(str, obj, obj2);
    }

    @Override // defpackage.qpe
    public void info(String str, Object obj, Object obj2) {
        b().info(str, obj, obj2);
    }

    @Override // defpackage.qpe
    public void trace(String str, Object obj, Object obj2) {
        b().trace(str, obj, obj2);
    }

    @Override // defpackage.qpe
    public void warn(String str, Object obj, Object obj2) {
        b().warn(str, obj, obj2);
    }

    @Override // defpackage.qpe
    public void debug(String str, Object... objArr) {
        b().debug(str, objArr);
    }

    @Override // defpackage.qpe
    public void error(String str, Object... objArr) {
        b().error(str, objArr);
    }

    @Override // defpackage.qpe
    public void info(String str, Object... objArr) {
        b().info(str, objArr);
    }

    @Override // defpackage.qpe
    public void trace(String str, Object... objArr) {
        b().trace(str, objArr);
    }

    @Override // defpackage.qpe
    public void warn(String str, Object... objArr) {
        b().warn(str, objArr);
    }

    @Override // defpackage.qpe
    public void debug(String str, Throwable th) {
        b().debug(str, th);
    }

    @Override // defpackage.qpe
    public void error(String str, Throwable th) {
        b().error(str, th);
    }

    @Override // defpackage.qpe
    public void info(String str, Throwable th) {
        b().info(str, th);
    }

    @Override // defpackage.qpe
    public void trace(String str, Throwable th) {
        b().trace(str, th);
    }

    @Override // defpackage.qpe
    public void warn(String str, Throwable th) {
        b().warn(str, th);
    }
}
