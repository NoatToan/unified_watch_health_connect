package org.acra.builder;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public final class ReportBuilder {
    private String a;
    private Thread b;
    private Throwable c;
    private final Map<String, String> d = new HashMap();
    private boolean e = false;
    private boolean f = false;

    public void build(@NonNull ReportExecutor reportExecutor) {
        if (this.a == null && this.c == null) {
            this.a = "Report requested by developer";
        }
        reportExecutor.execute(this);
    }

    @NonNull
    public ReportBuilder customData(@NonNull Map<String, String> map) {
        this.d.putAll(map);
        return this;
    }

    @NonNull
    public ReportBuilder endApplication() {
        this.f = true;
        return this;
    }

    @NonNull
    public ReportBuilder exception(@Nullable Throwable th) {
        this.c = th;
        return this;
    }

    @NonNull
    public Map<String, String> getCustomData() {
        return new HashMap(this.d);
    }

    @Nullable
    public Throwable getException() {
        return this.c;
    }

    @Nullable
    public String getMessage() {
        return this.a;
    }

    @Nullable
    public Thread getUncaughtExceptionThread() {
        return this.b;
    }

    public boolean isEndApplication() {
        return this.f;
    }

    public boolean isSendSilently() {
        return this.e;
    }

    @NonNull
    public ReportBuilder message(@Nullable String str) {
        this.a = str;
        return this;
    }

    @NonNull
    public ReportBuilder sendSilently() {
        this.e = true;
        return this;
    }

    @NonNull
    public ReportBuilder uncaughtExceptionThread(@Nullable Thread thread) {
        this.b = thread;
        return this;
    }

    @NonNull
    public ReportBuilder customData(@NonNull String str, String str2) {
        this.d.put(str, str2);
        return this;
    }
}
