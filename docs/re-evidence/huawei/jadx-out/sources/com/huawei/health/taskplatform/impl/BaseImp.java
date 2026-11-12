package com.huawei.health.taskplatform.impl;

import com.huawei.hwbasemgr.ResponseCallback;
import defpackage.qev;
import defpackage.qex;
import defpackage.qey;
import defpackage.qfb;
import defpackage.qfj;
import defpackage.qfn;
import defpackage.qfo;
import defpackage.qfr;
import defpackage.qfv;
import defpackage.qga;
import defpackage.qgc;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BaseImp {
    public abstract void createPlan(qex qexVar, ResponseCallback<qey> responseCallback);

    public abstract void createTask(qfv qfvVar, ResponseCallback<qgc> responseCallback);

    public abstract void queryPlan(qev qevVar, ResponseCallback<List<qey>> responseCallback);

    public abstract void querySchedule(qfn qfnVar, ResponseCallback<qfj> responseCallback);

    public abstract void queryTask(qga qgaVar, ResponseCallback<qgc> responseCallback);

    public abstract void updatePlanStatus(qfb qfbVar, ResponseCallback<String> responseCallback);

    public abstract void updateSchedule(qfo qfoVar, ResponseCallback<qfr> responseCallback);
}
