package defpackage;

import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.taskplatform.task.BaseTask;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.taskplatform.TaskEnum;
import health.compact.a.CommonUtils;
import health.compact.a.LogUtil;
import health.compact.a.UnitUtil;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class iiu extends BaseTask {
    @Override // com.huawei.health.taskplatform.task.BaseTask
    public void getTaskValue(int i, List<String> list, List<qfq> list2, ResponseCallback<List<String>> responseCallback) {
    }

    public iiu(TaskEnum taskEnum) {
        super(taskEnum);
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public String getTag() {
        return "TaskPlatform_CaloriesIntake";
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getHiHealthType() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getHiStatType() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getSubscribeType() {
        return Collections.singletonList(Integer.valueOf(DicDataTypeUtil.DataType.DIET_RECORD_SET.value()));
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public List<Integer> getGoalSubscribeType() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public boolean isSubscribeType(int i) {
        return i == DicDataTypeUtil.DataType.DIET_RECORD_SET.value();
    }

    @Override // com.huawei.health.taskplatform.task.BaseTask
    public void getTaskValue(final int i, List<String> list, final qfk qfkVar, final ResponseCallback<List<String>> responseCallback) {
        if (!isNeedUpdate(list, TaskEnum.CALORIES_INTAKE.getTaskId())) {
            onResponse(responseCallback, 0, Collections.EMPTY_LIST);
        } else {
            iun.a(i, i, (ResponseCallback<List<vgo>>) new ResponseCallback() { // from class: iiy
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i2, Object obj) {
                    this.e.a(responseCallback, i, qfkVar, i2, (List) obj);
                }
            });
        }
    }

    /* synthetic */ void a(ResponseCallback responseCallback, int i, qfk qfkVar, int i2, List list) {
        vfy vfyVarD;
        String strRefreshObjectiveResult;
        if (i2 != 0) {
            onResponse(responseCallback, i2, Collections.EMPTY_LIST);
            return;
        }
        Iterator it = list.iterator();
        while (true) {
            int i3 = 0;
            if (it.hasNext()) {
                vgo vgoVar = (vgo) it.next();
                if (vgoVar != null && vgoVar.c() == i && (vfyVarD = vgoVar.d()) != null) {
                    int iD = (int) UnitUtil.d(vfyVarD.h(), 0);
                    boolean zE = e(vgoVar);
                    LogUtil.b("TaskPlatform_CaloriesIntake", "getTaskValue onResult intake ", Integer.valueOf(iD), " isHasMeal ", Boolean.valueOf(zE));
                    if (qfkVar == null) {
                        strRefreshObjectiveResult = "";
                    } else {
                        if (zE && iD <= CommonUtils.j(qfkVar.j())) {
                            i3 = 1;
                        }
                        strRefreshObjectiveResult = refreshObjectiveResult(i, qfkVar, String.valueOf(iD), i3, "");
                    }
                    onResponse(responseCallback, i2, Collections.singletonList(strRefreshObjectiveResult));
                    return;
                }
            } else {
                onResponse(responseCallback, i2, Collections.singletonList(refreshObjectiveResult(i, qfkVar, String.valueOf(0), 0, "")));
                return;
            }
        }
    }

    private static boolean e(vgo vgoVar) {
        List<vgw> listA = vgoVar.a();
        if (CollectionUtils.a(listA)) {
            return false;
        }
        for (vgw vgwVar : listA) {
            if (vgwVar != null && (!CollectionUtils.a(vgwVar.c()) || vgwVar.e() > 0.0f)) {
                return true;
            }
        }
        return false;
    }
}
