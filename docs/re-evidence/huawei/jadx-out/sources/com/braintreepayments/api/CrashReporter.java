package com.braintreepayments.api;

import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import defpackage.sh;
import defpackage.zcm;
import defpackage.zcp;
import defpackage.zes;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0001H\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\u0006\u0010\u0014\u001a\u00020\u000eJ\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\fH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/braintreepayments/api/CrashReporter;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "braintreeClient", "Lcom/braintreepayments/api/BraintreeClient;", "(Lcom/braintreepayments/api/BraintreeClient;)V", "braintreeClientRef", "Ljava/lang/ref/WeakReference;", "(Ljava/lang/ref/WeakReference;)V", "defaultExceptionHandler", "determineExceptionCause", "", "ex", "", "handleExceptionWithDefaultBehavior", "", "thread", "Ljava/lang/Thread;", "registerExceptionHandler", "handler", "restoreDefaultExceptionHandler", "start", "uncaughtException", TrackConstants$Events.EXCEPTION, "Cause", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CrashReporter implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f4021c = new a(null);
    private final WeakReference<sh> d;
    private Thread.UncaughtExceptionHandler e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/braintreepayments/api/CrashReporter$Cause;", "", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface Cause {
    }

    public CrashReporter(WeakReference<sh> weakReference) {
        zcp.c(weakReference, "");
        this.d = weakReference;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CrashReporter(sh shVar) {
        this((WeakReference<sh>) new WeakReference(shVar));
        zcp.c(shVar, "");
    }

    private final void d(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.e = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
    }

    private final void d() {
        Thread.setDefaultUncaughtExceptionHandler(this.e);
        this.e = null;
    }

    private final int d(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        zcp.b((Object) string, "");
        if (zes.b((CharSequence) string, (CharSequence) "com.braintreepayments", false, 2, (Object) null)) {
            return 2;
        }
        String string2 = stringWriter.toString();
        zcp.b((Object) string2, "");
        return zes.b((CharSequence) string2, (CharSequence) "com.paypal", false, 2, (Object) null) ? 1 : 0;
    }

    private final void c(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.e;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    public final void e() {
        d(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable exception) {
        zcp.c(thread, "");
        zcp.c(exception, "");
        sh shVar = this.d.get();
        if (shVar == null) {
            c(thread, exception);
            d();
            return;
        }
        int iD = d(exception);
        if (iD == 1 || iD == 2) {
            shVar.d();
        }
        c(thread, exception);
    }

    /* JADX INFO: loaded from: classes21.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/braintreepayments/api/CrashReporter$Companion;", "", "()V", "CAUSE_RELATED_TO_BRAINTREE", "", "CAUSE_RELATED_TO_PAYPAL", "CAUSE_UNKNOWN", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(zcm zcmVar) {
            this();
        }
    }
}
