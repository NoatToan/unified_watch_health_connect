package com.huami.mifit.analytics.builder;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.huami.mifit.analytics.bean.ExceptionEvent;

/* JADX INFO: loaded from: classes11.dex */
public class ExceptionEventBuilder implements EventBuilder<ExceptionEvent> {
    private boolean a = true;
    private boolean b = false;
    private boolean c = false;
    private String d;
    private Throwable e;

    public ExceptionEventBuilder(@NonNull String str) {
        this.d = str;
    }

    @VisibleForTesting
    public String getMessage() {
        return this.d;
    }

    @VisibleForTesting
    public Throwable getThrowable() {
        return this.e;
    }

    @VisibleForTesting
    public boolean isAnonymous() {
        return this.a;
    }

    @VisibleForTesting
    public boolean isRealTimeRecord() {
        return this.c;
    }

    @Deprecated
    public ExceptionEventBuilder setAnonymous(boolean z) {
        this.a = z;
        return this;
    }

    public ExceptionEventBuilder setException(@NonNull Throwable th) {
        this.e = th;
        return this;
    }

    @Deprecated
    public ExceptionEventBuilder setIdentified(boolean z) {
        this.b = z;
        return this;
    }

    public ExceptionEventBuilder setMessage(@NonNull String str) {
        this.d = str;
        return this;
    }

    public ExceptionEventBuilder setRealTimeRecord(boolean z) {
        this.c = z;
        return this;
    }

    @Override // com.huami.mifit.analytics.builder.EventBuilder
    @NonNull
    public ExceptionEvent build() {
        ExceptionEvent exceptionEvent = new ExceptionEvent();
        exceptionEvent.anonymous = this.a;
        exceptionEvent.identified = this.b;
        exceptionEvent.message = this.d;
        exceptionEvent.throwable = this.e;
        exceptionEvent.isRealTimeRecord = this.c;
        return exceptionEvent;
    }

    public ExceptionEventBuilder(@NonNull Throwable th) {
        this.e = th;
    }

    public ExceptionEventBuilder(@NonNull String str, @NonNull Throwable th) {
        this.d = str;
        this.e = th;
    }
}
