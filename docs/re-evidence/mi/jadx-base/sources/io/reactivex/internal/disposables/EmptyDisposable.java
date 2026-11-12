package io.reactivex.internal.disposables;

import defpackage.bgi;
import defpackage.ea4;
import defpackage.kem;
import defpackage.s9f;
import defpackage.z5h;

/* JADX INFO: loaded from: classes2.dex */
public enum EmptyDisposable implements bgi<Object> {
    INSTANCE,
    NEVER;

    public static void complete(z5h<?> z5hVar) {
        z5hVar.onSubscribe(INSTANCE);
        z5hVar.onComplete();
    }

    public static void error(Throwable th, z5h<?> z5hVar) {
        z5hVar.onSubscribe(INSTANCE);
        z5hVar.onError(th);
    }

    @Override // defpackage.jdm
    public void clear() {
    }

    @Override // defpackage.jz6
    public void dispose() {
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        return this == INSTANCE;
    }

    @Override // defpackage.jdm
    public boolean isEmpty() {
        return true;
    }

    @Override // defpackage.jdm
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.jdm
    public Object poll() throws Exception {
        return null;
    }

    @Override // defpackage.dgi
    public int requestFusion(int i) {
        return i & 2;
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(s9f<?> s9fVar) {
        s9fVar.onSubscribe(INSTANCE);
        s9fVar.onComplete();
    }

    public static void error(Throwable th, ea4 ea4Var) {
        ea4Var.onSubscribe(INSTANCE);
        ea4Var.onError(th);
    }

    public static void complete(ea4 ea4Var) {
        ea4Var.onSubscribe(INSTANCE);
        ea4Var.onComplete();
    }

    public static void error(Throwable th, kem<?> kemVar) {
        kemVar.onSubscribe(INSTANCE);
        kemVar.onError(th);
    }

    public static void error(Throwable th, s9f<?> s9fVar) {
        s9fVar.onSubscribe(INSTANCE);
        s9fVar.onError(th);
    }
}
