package com.alipay.android.phone.mrpc.core;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
final class m extends FutureTask<u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ q f5750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f5751b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, Callable callable, q qVar) {
        super(callable);
        this.f5751b = lVar;
        this.f5750a = qVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        o oVarA = this.f5750a.a();
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
        } catch (InterruptedException e) {
            e.toString();
        } catch (CancellationException unused) {
            oVarA.g();
        } catch (ExecutionException e2) {
            if (e2.getCause() == null || !(e2.getCause() instanceof HttpException)) {
                e2.toString();
                return;
            }
            HttpException httpException = (HttpException) e2.getCause();
            httpException.getCode();
            httpException.getMsg();
        } catch (Throwable th) {
            throw new RuntimeException("An error occured while executing http request", th);
        }
    }
}
