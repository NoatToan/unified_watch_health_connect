package org.slf4j.helpers;

import defpackage.pgg;
import defpackage.qpe;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MarkerIgnoringBase extends pgg implements qpe {
    private static final long serialVersionUID = 9044267456635152283L;

    @Override // defpackage.qpe
    public abstract /* synthetic */ void debug(String str);

    @Override // defpackage.qpe
    public abstract /* synthetic */ void debug(String str, Object obj);

    @Override // defpackage.qpe
    public abstract /* synthetic */ void debug(String str, Object obj, Object obj2);

    @Override // defpackage.qpe
    public abstract /* synthetic */ void debug(String str, Throwable th);

    @Override // defpackage.qpe
    public abstract /* synthetic */ void debug(String str, Object... objArr);

    public void debug(Marker marker, String str) {
        debug(str);
    }

    @Override // defpackage.qpe
    public abstract /* synthetic */ void error(String str);

    @Override // defpackage.qpe
    public abstract /* synthetic */ void error(String str, Object obj);

    @Override // defpackage.qpe
    public abstract /* synthetic */ void error(String str, Object obj, Object obj2);

    @Override // defpackage.qpe
    public abstract /* synthetic */ void error(String str, Throwable th);

    @Override // defpackage.qpe
    public abstract /* synthetic */ void error(String str, Object... objArr);

    public void error(Marker marker, String str) {
        error(str);
    }

    @Override // defpackage.pgg, defpackage.qpe
    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    @Override // defpackage.qpe
    public abstract /* synthetic */ void info(String str);

    @Override // defpackage.qpe
    public abstract /* synthetic */ void info(String str, Object obj);

    @Override // defpackage.qpe
    public abstract /* synthetic */ void info(String str, Object obj, Object obj2);

    @Override // defpackage.qpe
    public abstract /* synthetic */ void info(String str, Throwable th);

    @Override // defpackage.qpe
    public abstract /* synthetic */ void info(String str, Object... objArr);

    public void info(Marker marker, String str) {
        info(str);
    }

    @Override // defpackage.qpe
    public abstract /* synthetic */ boolean isDebugEnabled();

    public boolean isDebugEnabled(Marker marker) {
        return isDebugEnabled();
    }

    @Override // defpackage.qpe
    public abstract /* synthetic */ boolean isErrorEnabled();

    public boolean isErrorEnabled(Marker marker) {
        return isErrorEnabled();
    }

    @Override // defpackage.qpe
    public abstract /* synthetic */ boolean isInfoEnabled();

    public boolean isInfoEnabled(Marker marker) {
        return isInfoEnabled();
    }

    @Override // defpackage.qpe
    public abstract /* synthetic */ boolean isTraceEnabled();

    public boolean isTraceEnabled(Marker marker) {
        return isTraceEnabled();
    }

    @Override // defpackage.qpe
    public abstract /* synthetic */ boolean isWarnEnabled();

    public boolean isWarnEnabled(Marker marker) {
        return isWarnEnabled();
    }

    public String toString() {
        return getClass().getName() + "(" + getName() + ")";
    }

    @Override // defpackage.qpe
    public abstract /* synthetic */ void trace(String str);

    @Override // defpackage.qpe
    public abstract /* synthetic */ void trace(String str, Object obj);

    @Override // defpackage.qpe
    public abstract /* synthetic */ void trace(String str, Object obj, Object obj2);

    @Override // defpackage.qpe
    public abstract /* synthetic */ void trace(String str, Throwable th);

    @Override // defpackage.qpe
    public abstract /* synthetic */ void trace(String str, Object... objArr);

    public void trace(Marker marker, String str) {
        trace(str);
    }

    @Override // defpackage.qpe
    public abstract /* synthetic */ void warn(String str);

    @Override // defpackage.qpe
    public abstract /* synthetic */ void warn(String str, Object obj);

    @Override // defpackage.qpe
    public abstract /* synthetic */ void warn(String str, Object obj, Object obj2);

    @Override // defpackage.qpe
    public abstract /* synthetic */ void warn(String str, Throwable th);

    @Override // defpackage.qpe
    public abstract /* synthetic */ void warn(String str, Object... objArr);

    public void warn(Marker marker, String str) {
        warn(str);
    }

    public void debug(Marker marker, String str, Object obj) {
        debug(str, obj);
    }

    public void error(Marker marker, String str, Object obj) {
        error(str, obj);
    }

    public void info(Marker marker, String str, Object obj) {
        info(str, obj);
    }

    public void trace(Marker marker, String str, Object obj) {
        trace(str, obj);
    }

    public void warn(Marker marker, String str, Object obj) {
        warn(str, obj);
    }

    public void debug(Marker marker, String str, Object obj, Object obj2) {
        debug(str, obj, obj2);
    }

    public void error(Marker marker, String str, Object obj, Object obj2) {
        error(str, obj, obj2);
    }

    public void info(Marker marker, String str, Object obj, Object obj2) {
        info(str, obj, obj2);
    }

    public void trace(Marker marker, String str, Object obj, Object obj2) {
        trace(str, obj, obj2);
    }

    public void warn(Marker marker, String str, Object obj, Object obj2) {
        warn(str, obj, obj2);
    }

    public void debug(Marker marker, String str, Object... objArr) {
        debug(str, objArr);
    }

    public void error(Marker marker, String str, Object... objArr) {
        error(str, objArr);
    }

    public void info(Marker marker, String str, Object... objArr) {
        info(str, objArr);
    }

    public void trace(Marker marker, String str, Object... objArr) {
        trace(str, objArr);
    }

    public void warn(Marker marker, String str, Object... objArr) {
        warn(str, objArr);
    }

    public void debug(Marker marker, String str, Throwable th) {
        debug(str, th);
    }

    public void error(Marker marker, String str, Throwable th) {
        error(str, th);
    }

    public void info(Marker marker, String str, Throwable th) {
        info(str, th);
    }

    public void trace(Marker marker, String str, Throwable th) {
        trace(str, th);
    }

    public void warn(Marker marker, String str, Throwable th) {
        warn(str, th);
    }
}
