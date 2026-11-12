package io.reactivex.internal.util;

import defpackage.ea4;
import defpackage.joo;
import defpackage.jz6;
import defpackage.kem;
import defpackage.s9f;
import defpackage.t5l;
import defpackage.yno;
import defpackage.z5h;

/* JADX INFO: loaded from: classes2.dex */
public enum EmptyComponent implements yno, z5h<Object>, s9f<Object>, kem<Object>, ea4, joo, jz6 {
    INSTANCE;

    public static <T> z5h<T> asObserver() {
        return INSTANCE;
    }

    public static <T> yno<T> asSubscriber() {
        return INSTANCE;
    }

    @Override // defpackage.joo
    public void cancel() {
    }

    @Override // defpackage.jz6
    public void dispose() {
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        return true;
    }

    @Override // defpackage.yno
    public void onComplete() {
    }

    @Override // defpackage.yno
    public void onError(Throwable th) {
        t5l.p(th);
    }

    @Override // defpackage.yno
    public void onNext(Object obj) {
    }

    @Override // defpackage.z5h
    public void onSubscribe(jz6 jz6Var) {
        jz6Var.dispose();
    }

    public void onSuccess(Object obj) {
    }

    @Override // defpackage.joo
    public void request(long j) {
    }

    @Override // defpackage.yno
    public void onSubscribe(joo jooVar) {
        jooVar.cancel();
    }
}
