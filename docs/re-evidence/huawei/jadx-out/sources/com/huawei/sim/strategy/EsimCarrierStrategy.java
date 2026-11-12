package com.huawei.sim.strategy;

import android.content.Context;
import android.os.Handler;
import defpackage.pxp;

/* JADX INFO: loaded from: classes15.dex */
public interface EsimCarrierStrategy {
    void activateEsim();

    void authenticate();

    void deactivateEsim();

    void getEsimStatus();

    void init(Context context, Handler handler);

    void setRequest(pxp pxpVar);
}
