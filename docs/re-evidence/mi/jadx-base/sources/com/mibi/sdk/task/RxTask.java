package com.mibi.sdk.task;

import com.mibi.sdk.common.exception.PaymentException;
import defpackage.n4h;
import defpackage.s88;
import defpackage.w9h;

/* JADX INFO: loaded from: classes5.dex */
public abstract class RxTask<R> implements w9h<R> {
    private Class<R> mResultClazz;

    public RxTask(Class<R> cls) {
        this.mResultClazz = cls;
        if (cls != null && Void.class.equals(cls)) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w9h
    public void call(s88<? super R> s88Var) {
        try {
            R rNewInstance = this.mResultClazz.newInstance();
            doLoad(rNewInstance);
            s88Var.e(rNewInstance);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (Exception e3) {
            s88Var.d(e3);
        }
    }

    public abstract void doLoad(R r2) throws PaymentException;

    public n4h<R> getObservable() {
        return n4h.a(this);
    }
}
