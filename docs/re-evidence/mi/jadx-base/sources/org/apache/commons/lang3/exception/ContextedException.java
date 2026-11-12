package org.apache.commons.lang3.exception;

import defpackage.gf8;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.tuple.Pair;

/* JADX INFO: loaded from: classes3.dex */
public class ContextedException extends Exception implements gf8 {
    private static final long serialVersionUID = 20110706;
    private final gf8 exceptionContext;

    public ContextedException() {
        this.exceptionContext = new DefaultExceptionContext();
    }

    @Override // defpackage.gf8
    public List<Pair<String, Object>> getContextEntries() {
        return this.exceptionContext.getContextEntries();
    }

    @Override // defpackage.gf8
    public Set<String> getContextLabels() {
        return this.exceptionContext.getContextLabels();
    }

    @Override // defpackage.gf8
    public List<Object> getContextValues(String str) {
        return this.exceptionContext.getContextValues(str);
    }

    @Override // defpackage.gf8
    public Object getFirstContextValue(String str) {
        return this.exceptionContext.getFirstContextValue(str);
    }

    @Override // defpackage.gf8
    public String getFormattedExceptionMessage(String str) {
        return this.exceptionContext.getFormattedExceptionMessage(str);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return getFormattedExceptionMessage(super.getMessage());
    }

    public String getRawMessage() {
        return super.getMessage();
    }

    @Override // defpackage.gf8
    public ContextedException addContextValue(String str, Object obj) {
        this.exceptionContext.addContextValue(str, obj);
        return this;
    }

    @Override // defpackage.gf8
    public ContextedException setContextValue(String str, Object obj) {
        this.exceptionContext.setContextValue(str, obj);
        return this;
    }

    public ContextedException(String str) {
        super(str);
        this.exceptionContext = new DefaultExceptionContext();
    }

    public ContextedException(Throwable th) {
        super(th);
        this.exceptionContext = new DefaultExceptionContext();
    }

    public ContextedException(String str, Throwable th) {
        super(str, th);
        this.exceptionContext = new DefaultExceptionContext();
    }

    public ContextedException(String str, Throwable th, gf8 gf8Var) {
        super(str, th);
        this.exceptionContext = gf8Var == null ? new DefaultExceptionContext() : gf8Var;
    }
}
