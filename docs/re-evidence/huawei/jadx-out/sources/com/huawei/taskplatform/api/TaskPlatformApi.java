package com.huawei.taskplatform.api;

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

/* JADX INFO: loaded from: classes43.dex */
public interface TaskPlatformApi {
    void createPlan(qex qexVar, ResponseCallback<qey> responseCallback);

    void createTask(qfv qfvVar, ResponseCallback<qgc> responseCallback);

    List<Integer> getSubscribeTypeList(qfj qfjVar);

    List<String> getTaskIdListBySubscribeType(qfj qfjVar, int i);

    void queryPlan(qev qevVar, ResponseCallback<List<qey>> responseCallback);

    void querySchedule(qfn qfnVar, ResponseCallback<qfj> responseCallback);

    void queryTask(qga qgaVar, ResponseCallback<qgc> responseCallback);

    void updatePlanStatus(qfb qfbVar, ResponseCallback<String> responseCallback);

    void updateSchedule(int i, List<String> list, qfj qfjVar, ResponseCallback<qfo> responseCallback);

    void updateSchedule(qfo qfoVar, ResponseCallback<qfr> responseCallback);

    void uploadSnapshots();
}
