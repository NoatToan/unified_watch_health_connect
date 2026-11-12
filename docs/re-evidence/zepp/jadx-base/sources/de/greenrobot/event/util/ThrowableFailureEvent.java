package de.greenrobot.event.util;

/* JADX INFO: loaded from: classes22.dex */
public class ThrowableFailureEvent implements HasExecutionScope {
    private Object a;
    public final boolean suppressErrorUi;
    public final Throwable throwable;

    public ThrowableFailureEvent(Throwable th) {
        this.throwable = th;
        this.suppressErrorUi = false;
    }

    @Override // de.greenrobot.event.util.HasExecutionScope
    public Object getExecutionScope() {
        return this.a;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public boolean isSuppressErrorUi() {
        return this.suppressErrorUi;
    }

    @Override // de.greenrobot.event.util.HasExecutionScope
    public void setExecutionScope(Object obj) {
        this.a = obj;
    }

    public ThrowableFailureEvent(Throwable th, boolean z) {
        this.throwable = th;
        this.suppressErrorUi = z;
    }
}
