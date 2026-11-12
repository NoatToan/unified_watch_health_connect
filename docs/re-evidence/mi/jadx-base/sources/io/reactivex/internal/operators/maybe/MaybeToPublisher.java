package io.reactivex.internal.operators.maybe;

import defpackage.bua;
import defpackage.pei;
import defpackage.t9f;
import defpackage.u9f;

/* JADX INFO: loaded from: classes2.dex */
public enum MaybeToPublisher implements bua<t9f<Object>, pei<Object>> {
    INSTANCE;

    public static <T> bua<t9f<T>, pei<T>> instance() {
        return INSTANCE;
    }

    @Override // defpackage.bua
    public pei<Object> apply(t9f<Object> t9fVar) throws Exception {
        return new u9f(t9fVar);
    }
}
