package com.alipay.android.phone.mrpc.core;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends FutureTask<u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f28307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f28308b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, Callable callable, q qVar) {
        super(callable);
        this.f28308b = lVar;
        this.f28307a = qVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        o oVarA = this.f28307a.a();
        if (oVarA.f() == null) {
            super.done();
            return;
        }
        try {
            get();
            if (!isCancelled() && !oVarA.h()) {
                return;
            }
            oVarA.g();
            if (isCancelled() && isDone()) {
                return;
            }
            cancel(false);
        } catch (InterruptedException e4) {
            e4.toString();
        } catch (CancellationException unused) {
            oVarA.g();
        } catch (ExecutionException e14) {
            if (e14.getCause() == null || !(e14.getCause() instanceof HttpException)) {
                e14.toString();
                return;
            }
            HttpException httpException = (HttpException) e14.getCause();
            httpException.getCode();
            httpException.getMsg();
        } catch (Throwable th3) {
            q2.v("An error occured while executing http request", th3);
        }
    }
}
