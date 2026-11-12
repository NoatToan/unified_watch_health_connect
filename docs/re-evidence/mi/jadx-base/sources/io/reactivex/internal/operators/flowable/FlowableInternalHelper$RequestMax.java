package io.reactivex.internal.operators.flowable;

import defpackage.bg4;
import defpackage.joo;

/* JADX INFO: loaded from: classes2.dex */
public enum FlowableInternalHelper$RequestMax implements bg4<joo> {
    INSTANCE;

    @Override // defpackage.bg4
    public void accept(joo jooVar) throws Exception {
        jooVar.request(Long.MAX_VALUE);
    }
}
