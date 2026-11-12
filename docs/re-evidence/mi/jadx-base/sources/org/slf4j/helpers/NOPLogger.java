package org.slf4j.helpers;

/* JADX INFO: loaded from: classes3.dex */
public class NOPLogger extends MarkerIgnoringBase {
    public static final NOPLogger NOP_LOGGER = new NOPLogger();
    private static final long serialVersionUID = -517220405410904473L;

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final void debug(String str) {
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final void error(String str) {
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.pgg, defpackage.qpe
    public String getName() {
        return "NOP";
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final void info(String str) {
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final boolean isDebugEnabled() {
        return false;
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final boolean isErrorEnabled() {
        return false;
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final boolean isInfoEnabled() {
        return false;
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final boolean isTraceEnabled() {
        return false;
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final boolean isWarnEnabled() {
        return false;
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final void trace(String str) {
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final void warn(String str) {
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final void debug(String str, Object obj) {
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final void error(String str, Object obj) {
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final void info(String str, Object obj) {
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final void trace(String str, Object obj) {
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final void warn(String str, Object obj) {
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final void debug(String str, Object obj, Object obj2) {
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final void error(String str, Object obj, Object obj2) {
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final void info(String str, Object obj, Object obj2) {
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final void trace(String str, Object obj, Object obj2) {
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final void warn(String str, Object obj, Object obj2) {
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final void debug(String str, Throwable th) {
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final void error(String str, Throwable th) {
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final void info(String str, Throwable th) {
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final void trace(String str, Throwable th) {
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final void warn(String str, Throwable th) {
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final void debug(String str, Object... objArr) {
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final void error(String str, Object... objArr) {
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final void info(String str, Object... objArr) {
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final void trace(String str, Object... objArr) {
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, defpackage.qpe
    public final void warn(String str, Object... objArr) {
    }
}
