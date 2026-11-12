package defpackage;

import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.taskplatform.impl.BaseImp;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ihl extends BaseImp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ihg f37623a = new ihg();
    private final iia d = new iia();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f37624b = BaseApplication.b();

    @Override // com.huawei.health.taskplatform.impl.BaseImp
    public void createPlan(qex qexVar, final ResponseCallback<qey> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.a("R_TaskPlatform_DefaultImp", "createPlan, callback is null");
            return;
        }
        if (qexVar == null) {
            ReleaseLogUtil.a("R_TaskPlatform_DefaultImp", "createPlan, req is null");
            responseCallback.onResponse(-1, null);
        } else if (b()) {
            this.d.createPlan(qexVar, responseCallback);
        } else {
            this.f37623a.createPlan(qexVar, new ResponseCallback() { // from class: ihs
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.d.d(responseCallback, i, (qey) obj);
                }
            });
        }
    }

    /* synthetic */ void d(ResponseCallback responseCallback, int i, qey qeyVar) {
        responseCallback.onResponse(i, qeyVar);
        if (qeyVar != null) {
            c(Collections.singletonList(qeyVar));
        }
    }

    @Override // com.huawei.health.taskplatform.impl.BaseImp
    public void updatePlanStatus(final qfb qfbVar, final ResponseCallback<String> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.a("R_TaskPlatform_DefaultImp", "updatePlan, callback is null");
            return;
        }
        if (qfbVar == null) {
            ReleaseLogUtil.a("R_TaskPlatform_DefaultImp", "updatePlan, req is null");
            responseCallback.onResponse(-1, null);
        } else if (b() || d()) {
            this.d.updatePlanStatus(qfbVar, responseCallback);
        } else {
            this.f37623a.updatePlanStatus(qfbVar, new ResponseCallback() { // from class: iho
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.d.c(responseCallback, qfbVar, i, (String) obj);
                }
            });
        }
    }

    /* synthetic */ void c(ResponseCallback responseCallback, qfb qfbVar, int i, String str) {
        responseCallback.onResponse(i, str);
        a(qfbVar);
    }

    @Override // com.huawei.health.taskplatform.impl.BaseImp
    public void queryPlan(qev qevVar, final ResponseCallback<List<qey>> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.a("R_TaskPlatform_DefaultImp", "queryPlan, callback is null");
            return;
        }
        if (qevVar == null) {
            ReleaseLogUtil.a("R_TaskPlatform_DefaultImp", "queryPlan, req is null");
            responseCallback.onResponse(-1, null);
        } else if (b() || d()) {
            this.d.queryPlan(qevVar, responseCallback);
        } else {
            this.f37623a.queryPlan(qevVar, new ResponseCallback() { // from class: ihr
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.e.a(responseCallback, i, (List) obj);
                }
            });
        }
    }

    /* synthetic */ void a(ResponseCallback responseCallback, int i, List list) {
        responseCallback.onResponse(i, list);
        c((List<qey>) list);
    }

    @Override // com.huawei.health.taskplatform.impl.BaseImp
    public void createTask(qfv qfvVar, final ResponseCallback<qgc> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.a("R_TaskPlatform_DefaultImp", "createTask, callback is null");
            return;
        }
        if (qfvVar == null) {
            ReleaseLogUtil.a("R_TaskPlatform_DefaultImp", "createTask, req is null");
            responseCallback.onResponse(-1, null);
            return;
        }
        boolean zE = ijk.e();
        if (b() || d() || zE || ijk.b()) {
            ReleaseLogUtil.d("R_TaskPlatform_DefaultImp", "createTask with local");
            this.d.createTask(qfvVar, responseCallback);
        } else {
            this.f37623a.createTask(qfvVar, new ResponseCallback() { // from class: ihw
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    responseCallback.onResponse(i, (qgc) obj);
                }
            });
        }
    }

    @Override // com.huawei.health.taskplatform.impl.BaseImp
    public void queryTask(qga qgaVar, final ResponseCallback<qgc> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.a("R_TaskPlatform_DefaultImp", "queryTask, callback is null");
            return;
        }
        if (qgaVar == null) {
            ReleaseLogUtil.a("R_TaskPlatform_DefaultImp", "queryTask, req is null");
            responseCallback.onResponse(-1, null);
            return;
        }
        boolean zE = ijk.e();
        if (b() || d() || ijk.b() || zE) {
            ReleaseLogUtil.d("R_TaskPlatform_DefaultImp", "queryTask with local");
            this.d.queryTask(qgaVar, responseCallback);
        } else {
            this.f37623a.queryTask(qgaVar, new ResponseCallback() { // from class: ihn
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    responseCallback.onResponse(i, (qgc) obj);
                }
            });
        }
    }

    @Override // com.huawei.health.taskplatform.impl.BaseImp
    public void querySchedule(final qfn qfnVar, final ResponseCallback<qfj> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.a("R_TaskPlatform_DefaultImp", "querySchedule, callback is null");
            return;
        }
        if (qfnVar == null) {
            ReleaseLogUtil.a("R_TaskPlatform_DefaultImp", "querySchedule, req is null");
            responseCallback.onResponse(-1, null);
            return;
        }
        boolean zE = ijk.e();
        if (b() || d() || ijk.b() || zE) {
            ReleaseLogUtil.d("R_TaskPlatform_DefaultImp", "querySchedule with local");
            this.d.querySchedule(qfnVar, new ResponseCallback() { // from class: ihx
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) throws Throwable {
                    this.f37638c.a(responseCallback, qfnVar, i, (qfj) obj);
                }
            });
        } else {
            d(qfnVar, responseCallback);
        }
    }

    /* synthetic */ void a(ResponseCallback responseCallback, qfn qfnVar, int i, qfj qfjVar) throws Throwable {
        if (qfjVar != null && njy.b(qfjVar.i())) {
            ReleaseLogUtil.d("R_TaskPlatform_DefaultImp", "querySchedule with local,getSchedules size is：", Integer.valueOf(qfjVar.i().size()));
            responseCallback.onResponse(i, qfjVar);
            return;
        }
        qfp qfpVarB = this.d.b();
        boolean z = qfpVarB == null || qfpVarB.a() > qfnVar.b();
        if (!b() && !d() && z) {
            ReleaseLogUtil.d("R_TaskPlatform_DefaultImp", "querySchedule local schedule is empty");
            d(qfnVar, responseCallback);
        } else {
            responseCallback.onResponse(i, qfjVar);
        }
    }

    private void d(final qfn qfnVar, final ResponseCallback<qfj> responseCallback) {
        ReleaseLogUtil.d("R_TaskPlatform_DefaultImp", "queryScheduleFromCloud");
        this.f37623a.querySchedule(qfnVar, new ResponseCallback() { // from class: ihq
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f37628a.e(responseCallback, qfnVar, i, (qfj) obj);
            }
        });
    }

    /* synthetic */ void e(ResponseCallback responseCallback, final qfn qfnVar, int i, qfj qfjVar) {
        final String strD = HiJsonUtil.d(qfjVar);
        responseCallback.onResponse(i, qfjVar);
        ThreadPoolManager.c().execute(new Runnable() { // from class: ihv
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f37634a.e(strD, qfnVar);
            }
        });
    }

    /* synthetic */ void e(String str, qfn qfnVar) throws Throwable {
        this.d.e(qfnVar, (qfj) HiJsonUtil.d(str, qfj.class));
    }

    @Override // com.huawei.health.taskplatform.impl.BaseImp
    public void updateSchedule(qfo qfoVar, final ResponseCallback<qfr> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.a("R_TaskPlatform_DefaultImp", "updateSchedule, callback is null");
            return;
        }
        if (qfoVar == null) {
            ReleaseLogUtil.a("R_TaskPlatform_DefaultImp", "updateSchedule, req is null");
            responseCallback.onResponse(-1, null);
            return;
        }
        boolean zE = ijk.e();
        if (b() || d() || ijk.b() || zE) {
            ReleaseLogUtil.d("R_TaskPlatform_DefaultImp", "updateSchedule with local");
            this.d.updateSchedule(qfoVar, responseCallback);
        } else {
            this.f37623a.updateSchedule(qfoVar, new ResponseCallback() { // from class: iib
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.e.d(responseCallback, i, (qfr) obj);
                }
            });
        }
    }

    /* synthetic */ void d(ResponseCallback responseCallback, int i, qfr qfrVar) {
        responseCallback.onResponse(i, qfrVar);
        this.d.b(qfrVar);
    }

    private void a(final qfb qfbVar) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: iht
            @Override // java.lang.Runnable
            public final void run() {
                this.f37632a.c(qfbVar);
            }
        });
    }

    /* synthetic */ void c(qfb qfbVar) {
        this.d.updatePlanStatus(qfbVar, new ResponseCallback() { // from class: ihu
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                LogUtil.a("TaskPlatform_DefaultImp", "local updatePlan status", Integer.valueOf(i));
            }
        });
    }

    private void c(final List<qey> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.e("TaskPlatform_DefaultImp", "insertPlan, planDetails is empty");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: ihp
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.e.d(list);
                }
            });
        }
    }

    /* synthetic */ void d(List list) throws Throwable {
        ReleaseLogUtil.d("TaskPlatform_DefaultImp", "insertPlan, planDetails size:", Integer.valueOf(list.size()));
        String accountInfo = LoginInit.getInstance(null).getAccountInfo(1011);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qey qeyVar = (qey) it.next();
            if (qeyVar != null) {
                this.d.a(qeyVar, accountInfo);
            }
        }
    }

    private boolean d() {
        return !CommonUtil.ab(this.f37624b);
    }

    private boolean b() {
        return Utils.k();
    }
}
