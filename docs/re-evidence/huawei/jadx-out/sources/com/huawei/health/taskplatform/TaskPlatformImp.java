package com.huawei.health.taskplatform;

import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.taskplatform.TaskPlatformMgr;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.taskplatform.api.TaskPlatformApi;
import defpackage.ijk;
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

/* JADX INFO: loaded from: classes31.dex */
@ApiDefine(uri = TaskPlatformApi.class)
public class TaskPlatformImp implements TaskPlatformApi {
    @Override // com.huawei.taskplatform.api.TaskPlatformApi
    public void createPlan(qex qexVar, ResponseCallback<qey> responseCallback) {
        TaskPlatformMgr.d().b(qexVar, responseCallback);
    }

    @Override // com.huawei.taskplatform.api.TaskPlatformApi
    public void updatePlanStatus(qfb qfbVar, ResponseCallback<String> responseCallback) {
        TaskPlatformMgr.d().b(qfbVar, responseCallback);
    }

    @Override // com.huawei.taskplatform.api.TaskPlatformApi
    public void queryPlan(qev qevVar, ResponseCallback<List<qey>> responseCallback) {
        TaskPlatformMgr.d().b(qevVar, responseCallback);
    }

    @Override // com.huawei.taskplatform.api.TaskPlatformApi
    public void createTask(qfv qfvVar, ResponseCallback<qgc> responseCallback) {
        TaskPlatformMgr.d().c(qfvVar, responseCallback);
    }

    @Override // com.huawei.taskplatform.api.TaskPlatformApi
    public void queryTask(qga qgaVar, ResponseCallback<qgc> responseCallback) {
        TaskPlatformMgr.d().c(qgaVar, responseCallback);
    }

    @Override // com.huawei.taskplatform.api.TaskPlatformApi
    public void querySchedule(qfn qfnVar, ResponseCallback<qfj> responseCallback) {
        TaskPlatformMgr.d().a(qfnVar, responseCallback);
    }

    @Override // com.huawei.taskplatform.api.TaskPlatformApi
    public void updateSchedule(qfo qfoVar, ResponseCallback<qfr> responseCallback) {
        TaskPlatformMgr.d().a(qfoVar, responseCallback);
    }

    @Override // com.huawei.taskplatform.api.TaskPlatformApi
    public void updateSchedule(int i, List<String> list, qfj qfjVar, ResponseCallback<qfo> responseCallback) {
        ijk.c(i, list, qfjVar, responseCallback);
    }

    @Override // com.huawei.taskplatform.api.TaskPlatformApi
    public List<Integer> getSubscribeTypeList(qfj qfjVar) {
        return ijk.a(qfjVar);
    }

    @Override // com.huawei.taskplatform.api.TaskPlatformApi
    public List<String> getTaskIdListBySubscribeType(qfj qfjVar, int i) {
        return ijk.d(qfjVar, i);
    }

    @Override // com.huawei.taskplatform.api.TaskPlatformApi
    public void uploadSnapshots() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: igg
            @Override // java.lang.Runnable
            public final void run() {
                TaskPlatformMgr.d().e();
            }
        });
    }
}
