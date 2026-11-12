package org.slf4j.impl;

import android.util.Log;
import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MarkerIgnoringBase;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: loaded from: classes23.dex */
class a extends MarkerIgnoringBase {
    private static final long serialVersionUID = -1227274521521287937L;

    public a(String str) {
        this.name = str;
    }

    private void a(int i, String str, Object... objArr) {
        if (b(i)) {
            FormattingTuple formattingTupleArrayFormat = MessageFormatter.arrayFormat(str, objArr);
            e(i, formattingTupleArrayFormat.getMessage(), formattingTupleArrayFormat.getThrowable());
        }
    }

    private boolean b(int i) {
        return Log.isLoggable(this.name, i);
    }

    private void c(int i, String str, Throwable th) {
        if (b(i)) {
            e(i, str, th);
        }
    }

    private void e(int i, String str, Throwable th) {
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        Log.println(i, this.name, str);
    }

    @Override // org.slf4j.Logger
    public void debug(String str) {
        c(3, str, null);
    }

    @Override // org.slf4j.Logger
    public void error(String str) {
        c(6, str, null);
    }

    @Override // org.slf4j.Logger
    public void info(String str) {
        c(4, str, null);
    }

    @Override // org.slf4j.Logger
    public boolean isDebugEnabled() {
        return b(3);
    }

    @Override // org.slf4j.Logger
    public boolean isErrorEnabled() {
        return b(6);
    }

    @Override // org.slf4j.Logger
    public boolean isInfoEnabled() {
        return b(4);
    }

    @Override // org.slf4j.Logger
    public boolean isTraceEnabled() {
        return b(2);
    }

    @Override // org.slf4j.Logger
    public boolean isWarnEnabled() {
        return b(5);
    }

    @Override // org.slf4j.Logger
    public void trace(String str) {
        c(2, str, null);
    }

    @Override // org.slf4j.Logger
    public void warn(String str) {
        c(5, str, null);
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Object obj) {
        a(3, str, obj);
    }

    @Override // org.slf4j.Logger
    public void error(String str, Object obj) {
        a(6, str, obj);
    }

    @Override // org.slf4j.Logger
    public void info(String str, Object obj) {
        a(4, str, obj);
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Object obj) {
        a(2, str, obj);
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Object obj) {
        a(5, str, obj);
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Object obj, Object obj2) {
        a(3, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void error(String str, Object obj, Object obj2) {
        a(6, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void info(String str, Object obj, Object obj2) {
        a(4, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Object obj, Object obj2) {
        a(2, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Object obj, Object obj2) {
        a(5, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Object... objArr) {
        a(3, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void error(String str, Object... objArr) {
        a(6, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void info(String str, Object... objArr) {
        a(4, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Object... objArr) {
        a(2, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Object... objArr) {
        a(5, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Throwable th) {
        c(2, str, th);
    }

    @Override // org.slf4j.Logger
    public void error(String str, Throwable th) {
        c(6, str, th);
    }

    @Override // org.slf4j.Logger
    public void info(String str, Throwable th) {
        c(4, str, th);
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Throwable th) {
        c(2, str, th);
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Throwable th) {
        c(5, str, th);
    }
}
