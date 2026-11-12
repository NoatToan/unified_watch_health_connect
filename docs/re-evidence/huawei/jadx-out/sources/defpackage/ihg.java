package defpackage;

import android.text.TextUtils;
import com.huawei.health.taskplatform.impl.BaseImp;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ihg extends BaseImp {
    @Override // com.huawei.health.taskplatform.impl.BaseImp
    public void createPlan(qex qexVar, final ResponseCallback<qey> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.a("R_TaskPlatform_CloudImp", "createPlan, callback is null");
            return;
        }
        LogUtil.a("TaskPlatform_CloudImp", "createPlan with: ", qexVar);
        if (qexVar == null) {
            ReleaseLogUtil.a("R_TaskPlatform_CloudImp", "createPlan, req is null");
            responseCallback.onResponse(-1, null);
        } else {
            igx.e().d(qexVar, new ResponseCallback() { // from class: ihh
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    ihg.a(responseCallback, i, (String) obj);
                }
            });
        }
    }

    static /* synthetic */ void a(ResponseCallback responseCallback, int i, String str) {
        LogUtil.a("TaskPlatform_CloudImp", "createPlan with status: ", Integer.valueOf(i));
        qew qewVar = (qew) HiJsonUtil.d(str, qew.class);
        responseCallback.onResponse(i, qewVar == null ? null : qewVar.c());
    }

    @Override // com.huawei.health.taskplatform.impl.BaseImp
    public void updatePlanStatus(qfb qfbVar, final ResponseCallback<String> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.a("R_TaskPlatform_CloudImp", "updatePlan, callback is null");
        } else if (qfbVar == null || TextUtils.isEmpty(qfbVar.d())) {
            ReleaseLogUtil.a("R_TaskPlatform_CloudImp", "updatePlan, req is null: ", Boolean.valueOf(qfbVar == null));
            responseCallback.onResponse(-1, null);
        } else {
            igx.e().d(qfbVar, new ResponseCallback() { // from class: ihf
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    ihg.f(responseCallback, i, (String) obj);
                }
            });
        }
    }

    static /* synthetic */ void f(ResponseCallback responseCallback, int i, String str) {
        LogUtil.a("TaskPlatform_CloudImp", "updatePlan with status: ", Integer.valueOf(i));
        responseCallback.onResponse(i, str);
    }

    @Override // com.huawei.health.taskplatform.impl.BaseImp
    public void queryPlan(qev qevVar, final ResponseCallback<List<qey>> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.a("R_TaskPlatform_CloudImp", "queryPlan, callback is null");
            return;
        }
        LogUtil.a("TaskPlatform_CloudImp", "queryPlan with: ", qevVar);
        if (qevVar == null) {
            ReleaseLogUtil.a("R_TaskPlatform_CloudImp", "queryPlan, req is null");
            responseCallback.onResponse(-1, null);
        } else {
            igx.e().e(qevVar.d(), qevVar.getUrl(), new ResponseCallback() { // from class: ihd
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    ihg.c(responseCallback, i, (String) obj);
                }
            });
        }
    }

    static /* synthetic */ void c(ResponseCallback responseCallback, int i, String str) {
        LogUtil.a("TaskPlatform_CloudImp", "queryPlan with status: ", Integer.valueOf(i));
        qez qezVar = (qez) HiJsonUtil.d(str, qez.class);
        responseCallback.onResponse(i, qezVar == null ? null : qezVar.b());
    }

    @Override // com.huawei.health.taskplatform.impl.BaseImp
    public void createTask(qfv qfvVar, final ResponseCallback<qgc> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.a("R_TaskPlatform_CloudImp", "createTask, callback is null");
            return;
        }
        LogUtil.a("TaskPlatform_CloudImp", "createTask with: ", qfvVar);
        if (qfvVar == null || TextUtils.isEmpty(qfvVar.d())) {
            ReleaseLogUtil.a("R_TaskPlatform_CloudImp", "createTask, req is null: ", Boolean.valueOf(qfvVar == null));
            responseCallback.onResponse(-1, null);
        } else {
            igx.e().d(qfvVar, new ResponseCallback() { // from class: ihm
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    ihg.e(responseCallback, i, (String) obj);
                }
            });
        }
    }

    static /* synthetic */ void e(ResponseCallback responseCallback, int i, String str) {
        LogUtil.a("TaskPlatform_CloudImp", "createTask with status: ", Integer.valueOf(i));
        responseCallback.onResponse(i, (qgc) HiJsonUtil.d(str, qgc.class));
    }

    @Override // com.huawei.health.taskplatform.impl.BaseImp
    public void queryTask(qga qgaVar, final ResponseCallback<qgc> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.a("R_TaskPlatform_CloudImp", "queryTask, callback is null");
            return;
        }
        LogUtil.a("TaskPlatform_CloudImp", "queryTask with: ", qgaVar);
        if (qgaVar == null || TextUtils.isEmpty(qgaVar.b())) {
            ReleaseLogUtil.a("R_TaskPlatform_CloudImp", "queryTask, req is null: ", Boolean.valueOf(qgaVar == null));
            responseCallback.onResponse(-1, null);
        } else {
            igx.e().e(qgaVar.d(), qgaVar.getUrl(), new ResponseCallback() { // from class: ihi
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    ihg.b(responseCallback, i, (String) obj);
                }
            });
        }
    }

    static /* synthetic */ void b(ResponseCallback responseCallback, int i, String str) {
        LogUtil.a("TaskPlatform_CloudImp", "queryTask with status: ", Integer.valueOf(i));
        responseCallback.onResponse(i, (qgc) HiJsonUtil.d(str, qgc.class));
    }

    @Override // com.huawei.health.taskplatform.impl.BaseImp
    public void querySchedule(qfn qfnVar, final ResponseCallback<qfj> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.a("R_TaskPlatform_CloudImp", "querySchedule, callback is null");
            return;
        }
        LogUtil.a("TaskPlatform_CloudImp", "querySchedule with: ", qfnVar);
        if (qfnVar == null || TextUtils.isEmpty(qfnVar.a())) {
            ReleaseLogUtil.a("R_TaskPlatform_CloudImp", "querySchedule, req is null: ", Boolean.valueOf(qfnVar == null));
            responseCallback.onResponse(-1, null);
            return;
        }
        int iB = qfnVar.b();
        if (iB < 20140101 || iB > 29991231) {
            ReleaseLogUtil.a("R_TaskPlatform_CloudImp", "querySchedule, day is invalid: ", Integer.valueOf(iB));
            responseCallback.onResponse(-1, null);
        } else if (c(qfnVar.g()) || c(qfnVar.d())) {
            ReleaseLogUtil.a("R_TaskPlatform_CloudImp", "querySchedule, start day or end day is invalid");
            responseCallback.onResponse(-1, null);
        } else {
            igx.e().e(qfnVar.c(), qfnVar.getUrl(), new ResponseCallback() { // from class: ihj
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    ihg.d(responseCallback, i, (String) obj);
                }
            });
        }
    }

    static /* synthetic */ void d(ResponseCallback responseCallback, int i, String str) {
        LogUtil.a("TaskPlatform_CloudImp", "querySchedule with status: ", Integer.valueOf(i));
        responseCallback.onResponse(i, (qfj) HiJsonUtil.d(str, qfj.class));
    }

    @Override // com.huawei.health.taskplatform.impl.BaseImp
    public void updateSchedule(qfo qfoVar, final ResponseCallback<qfr> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.a("R_TaskPlatform_CloudImp", "updateSchedule, callback is null");
            return;
        }
        LogUtil.a("TaskPlatform_CloudImp", "updateSchedule with: ", qfoVar);
        if (qfoVar == null) {
            ReleaseLogUtil.a("R_TaskPlatform_CloudImp", "updateSchedule, req is null");
            responseCallback.onResponse(-1, null);
        } else {
            igx.e().e(HiJsonUtil.d(qfoVar.c()), qfoVar.getUrl(), new ResponseCallback() { // from class: ihk
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    ihg.h(responseCallback, i, (String) obj);
                }
            });
        }
    }

    static /* synthetic */ void h(ResponseCallback responseCallback, int i, String str) {
        LogUtil.a("TaskPlatform_CloudImp", "updateSchedule with status: ", Integer.valueOf(i));
        responseCallback.onResponse(i, (qfr) HiJsonUtil.d(str, qfr.class));
    }

    private boolean c(Integer num) {
        if (num == null) {
            return false;
        }
        return num.intValue() < 20140101 || num.intValue() > 29991231;
    }
}
