package defpackage;

import android.text.TextUtils;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class czm {
    public static void e(String str, final IBaseResponseCallback iBaseResponseCallback) {
        czk czkVar = new czk();
        czkVar.d(lsl.q(System.currentTimeMillis()));
        HealthDataCloudFactory healthDataCloudFactory = new HealthDataCloudFactory(BaseApplication.getContext());
        Map<String, Object> body = healthDataCloudFactory.getBody(czkVar);
        if (!TextUtils.isEmpty(str)) {
            body.put("toDoType", str);
        }
        oet.d().c(czkVar.getUrl() + "/list", healthDataCloudFactory.getHeaders(), ofe.c(body), czf.class, new ResultCallback<czf>() { // from class: czm.4
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(czf czfVar) {
                LogUtil.a("CalBalanceTodoManager", "getTodoList success. data: ", czfVar.getResultCode());
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(czfVar.getResultCode().intValue(), czfVar.d());
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.j("CalBalanceTodoManager", "getTodoList onFailure. throwable: ", th.toString());
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(-1, th.toString());
                }
            }
        });
    }

    public static void b(ikw ikwVar, final IBaseResponseCallback iBaseResponseCallback) {
        if (ikwVar == null) {
            LogUtil.j("CalBalanceTodoManager", "updateTodoInfo todoModel is null");
            return;
        }
        LogUtil.a("CalBalanceTodoManager", "updateTodoInfo todo name = ", ikwVar.o());
        czk czkVar = new czk();
        czkVar.d(lsl.q(System.currentTimeMillis()));
        HealthDataCloudFactory healthDataCloudFactory = new HealthDataCloudFactory(BaseApplication.getContext());
        Map<String, Object> body = healthDataCloudFactory.getBody(czkVar);
        body.put("toDoId", String.valueOf(ikwVar.b()));
        body.put("title", ikwVar.o());
        body.put("todoContent", ikwVar.k());
        body.put("status", String.valueOf(ikwVar.j()));
        body.put("linkUrl", ikwVar.c());
        body.put(WorkoutRecord.Extend.COURSE_TARGET_VALUE, ikwVar.h());
        body.put("currentValue", ikwVar.a());
        body.put("targetUnit", ikwVar.f());
        oet.d().c(czkVar.getUrl() + "/updateToDoContent", healthDataCloudFactory.getHeaders(), ofe.c(body), CloudCommonReponse.class, new ResultCallback<CloudCommonReponse>() { // from class: czm.5
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(CloudCommonReponse cloudCommonReponse) {
                LogUtil.a("CalBalanceTodoManager", "updateTodoInfo success. data: ", cloudCommonReponse.getResultCode());
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(cloudCommonReponse.getResultCode().intValue(), cloudCommonReponse.getResultDesc());
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.j("CalBalanceTodoManager", "updateTodoInfo onFailure. throwable: ", th.toString());
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(-1, th.toString());
                }
            }
        });
    }

    public static void c(ikw ikwVar, final IBaseResponseCallback iBaseResponseCallback) {
        if (ikwVar == null) {
            LogUtil.j("CalBalanceTodoManager", "addNewTodoInfo todoModel is null");
            return;
        }
        LogUtil.a("CalBalanceTodoManager", "addNewTodoInfo todo name = ", ikwVar.o());
        czk czkVar = new czk();
        czkVar.d(lsl.q(System.currentTimeMillis()));
        HealthDataCloudFactory healthDataCloudFactory = new HealthDataCloudFactory(BaseApplication.getContext());
        Map<String, Object> body = healthDataCloudFactory.getBody(czkVar);
        body.put("toDoType", String.valueOf(ikwVar.l()));
        body.put("title", ikwVar.o());
        body.put("todoContent", ikwVar.k());
        body.put("status", String.valueOf(ikwVar.j()));
        body.put("linkUrl", ikwVar.c());
        body.put(WorkoutRecord.Extend.COURSE_TARGET_VALUE, ikwVar.h());
        body.put("currentValue", ikwVar.a());
        body.put("targetUnit", ikwVar.f());
        body.put("requestId", Long.valueOf(System.currentTimeMillis()));
        oet.d().c(czkVar.getUrl() + "/addToDoContent", healthDataCloudFactory.getHeaders(), ofe.c(body), czi.class, new ResultCallback<czi>() { // from class: czm.1
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(czi cziVar) {
                LogUtil.a("CalBalanceTodoManager", "addNewTodoInfo success. data: ", cziVar.getResultCode());
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(cziVar.getResultCode().intValue(), cziVar.getResultDesc());
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.j("CalBalanceTodoManager", "addNewTodoInfo onFailure. throwable: ", th.toString());
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(-1, th.toString());
                }
            }
        });
    }
}
