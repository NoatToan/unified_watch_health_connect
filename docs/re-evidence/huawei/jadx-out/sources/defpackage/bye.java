package defpackage;

import android.util.SparseArray;
import com.huawei.basichealthmodel.listener.TaskDataListener;
import com.huawei.basichealthmodel.listener.TaskDayDataListener;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class bye extends bxw {
    @Override // defpackage.bxw, com.huawei.basichealthmodel.listener.TaskInterface
    public void getRecord(HealthLifeBean healthLifeBean, final TaskDayDataListener taskDayDataListener) {
        if (taskDayDataListener == null) {
            LogUtil.j("HL_DietManager", "getRecord listener is null");
            return;
        }
        if (healthLifeBean == null) {
            LogUtil.j("HL_DietManager", "getRecord bean is null");
            taskDayDataListener.onDataChange(-1, null);
        } else {
            final int recordDay = healthLifeBean.getRecordDay();
            final SparseArray<HealthLifeBean> sparseArray = new SparseArray<>();
            sparseArray.append(recordDay, healthLifeBean);
            e(recordDay, recordDay, sparseArray, new ResponseCallback() { // from class: byh
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    taskDayDataListener.onDataChange(i, (HealthLifeBean) sparseArray.get(recordDay));
                }
            });
        }
    }

    @Override // defpackage.bxw, com.huawei.basichealthmodel.listener.TaskInterface
    public void getRecord(final SparseArray<HealthLifeBean> sparseArray, final TaskDataListener taskDataListener) {
        if (taskDataListener == null) {
            LogUtil.j("HL_DietManager", "getRecord listener is null");
            return;
        }
        if (sparseArray == null) {
            LogUtil.j("HL_DietManager", "getRecord sparseArray is null");
            taskDataListener.onDataChange(-1, null);
        } else if (sparseArray.size() <= 0) {
            LogUtil.j("HL_DietManager", "getRecord sparseArray ", sparseArray);
            taskDataListener.onDataChange(-1, sparseArray);
        } else {
            e(sparseArray.keyAt(0), sparseArray.keyAt(sparseArray.size() - 1), sparseArray, new ResponseCallback() { // from class: byk
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    taskDataListener.onDataChange(i, sparseArray);
                }
            });
        }
    }

    private void e(int i, int i2, final SparseArray<HealthLifeBean> sparseArray, final ResponseCallback<SparseArray<HealthLifeBean>> responseCallback) {
        iun.a(i, i2, (ResponseCallback<List<vgo>>) new ResponseCallback() { // from class: byg
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i3, Object obj) {
                this.f1313b.b(sparseArray, responseCallback, i3, (List) obj);
            }
        });
    }

    /* synthetic */ void b(SparseArray sparseArray, ResponseCallback responseCallback, int i, List list) {
        if (njy.b(list)) {
            HashMap map = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                vgo vgoVar = (vgo) it.next();
                if (vgoVar != null) {
                    map.put(Integer.valueOf(vgoVar.c()), vgoVar);
                }
            }
            if (map.size() > 0) {
                d(map, sparseArray);
            }
        }
        responseCallback.onResponse(i, sparseArray);
    }

    private void d(Map<Integer, vgo> map, SparseArray<HealthLifeBean> sparseArray) {
        vgo vgoVar;
        int i;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            HealthLifeBean healthLifeBean = sparseArray.get(iKeyAt);
            if (healthLifeBean != null && map.containsKey(Integer.valueOf(iKeyAt)) && (vgoVar = map.get(Integer.valueOf(iKeyAt))) != null) {
                List<vgw> listA = vgoVar.a();
                if (!njy.e(listA)) {
                    int i3 = 0;
                    for (vgw vgwVar : listA) {
                        if (vgwVar != null && ((i = vgwVar.i()) == 10 || i == 20 || i == 30)) {
                            if (vgwVar.e() > 0.0f || njy.b(vgwVar.c())) {
                                i3++;
                            }
                        }
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (healthLifeBean.getComplete() <= 0 && i3 >= 3) {
                        healthLifeBean.setComplete(1);
                        if (healthLifeBean.getRecordDay() == DateFormatUtil.a(jCurrentTimeMillis)) {
                            cbk.c(healthLifeBean.getId(), healthLifeBean.getComplete());
                        }
                    }
                    healthLifeBean.setIsUpdated(true);
                    healthLifeBean.setResult(String.valueOf(i3));
                    healthLifeBean.setTimestamp(jCurrentTimeMillis);
                    healthLifeBean.setTimeZone(lsl.q(jCurrentTimeMillis));
                    healthLifeBean.setSyncStatus(0);
                }
            }
        }
    }
}
