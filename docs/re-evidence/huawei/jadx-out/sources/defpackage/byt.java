package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.basichealthmodel.listener.TaskDataListener;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes23.dex */
public class byt implements TaskDataListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TaskDataListener f1326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1327b;
    private final int e;
    private final String g;
    private final SparseArray<List<HealthLifeBean>> d = new SparseArray<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<SparseArray<HealthLifeBean>> f1328c = Collections.synchronizedList(new ArrayList());
    private final AtomicInteger j = new AtomicInteger();

    public byt(String str, int i, TaskDataListener taskDataListener, int i2) {
        this.f1326a = taskDataListener;
        this.f1327b = i2;
        this.e = i;
        this.g = str;
    }

    @Override // com.huawei.basichealthmodel.listener.TaskDataListener
    public void onAllDataChange(int i, SparseArray<List<HealthLifeBean>> sparseArray) {
        if (sparseArray == null || sparseArray.size() == 0) {
            TaskDataListener taskDataListener = this.f1326a;
            if (taskDataListener != null) {
                taskDataListener.onAllDataChange(-1, sparseArray);
            }
            LogUtil.j("HL_TaskData", "WeekTaskManagerListener OneDayTaskManagerListener healthTaskBeanList is null.");
            return;
        }
        LogUtil.a("HL_TaskData", "WeekTaskManagerListener WeekTaskManagerListener onAllTaskDataChange healthTaskBeanList", Integer.valueOf(sparseArray.size()));
        e(sparseArray);
    }

    @Override // com.huawei.basichealthmodel.listener.TaskDataListener
    public void onDataChange(int i, SparseArray<HealthLifeBean> sparseArray) {
        if (sparseArray == null) {
            TaskDataListener taskDataListener = this.f1326a;
            if (taskDataListener != null) {
                taskDataListener.onDataChange(-1, null);
            }
            LogUtil.j("HL_TaskData", "onWeekOneTaskDataChange healthTaskBeanList is null");
            sparseArray = new SparseArray<>();
        }
        this.f1328c.add(sparseArray);
        if (this.j.addAndGet(1) >= this.f1327b) {
            e();
            onAllDataChange(0, this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void e(final SparseArray<List<HealthLifeBean>> sparseArray) {
        if (HandlerExecutor.c()) {
            cbg.c(ThreadPoolManager.c(), "HealthModelInsertWeekTask", new Runnable() { // from class: byw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1337c.e(sparseArray);
                }
            });
            return;
        }
        List<HealthLifeBean> listB = b(sparseArray);
        LogUtil.a("HL_TaskData", "insertBeanList result ", Long.valueOf(njy.b(listB) ? bxc.a(listB, this.g) : -1L));
        TaskDataListener taskDataListener = this.f1326a;
        if (taskDataListener != null) {
            taskDataListener.onAllDataChange(0, sparseArray);
            this.d.clear();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - ccy.a("health_life_last_sync_time_millis")) < 180000) {
            return;
        }
        bys.c().b(this.g, DateFormatUtil.a(lsl.e(DateFormatUtil.d(this.e), 1, 0)), DateFormatUtil.a(jCurrentTimeMillis), 4);
        ccy.b("health_life_last_sync_time_millis", jCurrentTimeMillis);
    }

    private List<HealthLifeBean> b(SparseArray<List<HealthLifeBean>> sparseArray) {
        boolean z;
        int id;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < sparseArray.size(); i++) {
            int iKeyAt = sparseArray.keyAt(i);
            List<HealthLifeBean> list = sparseArray.get(iKeyAt);
            if (!njy.e(list) && list.size() >= 3) {
                Iterator<HealthLifeBean> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    HealthLifeBean next = it.next();
                    if (next != null && next.getTaskType() == 1) {
                        LogUtil.a("HL_TaskData", "getInsertDbBeanList isBasicType bean ", next);
                        z = true;
                        break;
                    }
                }
                ArrayList<Integer> arrayListC = cbg.c(list);
                StringBuilder sb = new StringBuilder();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                for (HealthLifeBean healthLifeBean : list) {
                    if (healthLifeBean != null && (id = healthLifeBean.getId()) != 1 && id != 100001) {
                        i3++;
                        if (TextUtils.isEmpty(sb.toString())) {
                            sb.append(id);
                        } else {
                            sb.append(",");
                            sb.append(id);
                        }
                        if (healthLifeBean.getComplete() > 0) {
                            i2++;
                            if (!z ? arrayListC.contains(Integer.valueOf(id)) : healthLifeBean.getTaskType() == 1) {
                                i4++;
                            }
                        }
                        if (healthLifeBean.getIsUpdated()) {
                            arrayList.add(healthLifeBean);
                        }
                    }
                }
                arrayList.add(cfu.a(sb.toString(), iKeyAt, i2 == i3 ? 1 : 0, 1, this.g));
                int iW = cbg.w();
                if (iW > 0 && iKeyAt >= iW) {
                    arrayList.add(cfu.a(sb.toString(), iKeyAt, i4 != 3 ? 0 : 1, 100001, this.g));
                }
            }
        }
        return arrayList;
    }

    private void e() {
        LogUtil.a("HL_TaskData", "mAllTasksList size ", Integer.valueOf(this.f1328c.size()));
        for (SparseArray<HealthLifeBean> sparseArray : this.f1328c) {
            for (int i = 0; i < sparseArray.size(); i++) {
                int iKeyAt = sparseArray.keyAt(i);
                List<HealthLifeBean> arrayList = this.d.get(iKeyAt);
                if (njy.e(arrayList)) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(sparseArray.get(iKeyAt));
                this.d.put(iKeyAt, arrayList);
            }
        }
    }
}
