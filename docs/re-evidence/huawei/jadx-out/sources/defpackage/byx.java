package defpackage;

import com.huawei.basichealthmodel.listener.TaskDayDataListener;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes23.dex */
public class byx implements TaskDayDataListener {
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TaskDayDataListener f1338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1340c;
    private final List<HealthLifeBean> e = Collections.synchronizedList(new ArrayList());
    private final AtomicInteger j = new AtomicInteger();
    private final String i = cbg.q();

    public byx(int i, int i2, TaskDayDataListener taskDayDataListener) {
        this.f1340c = i;
        this.f1339b = i2;
        this.f1338a = taskDayDataListener;
        LogUtil.a("HL_TaskDayData", "TaskDayData numTotal ", Integer.valueOf(i), " recordDay ", Integer.valueOf(i2), " listener ", taskDayDataListener);
    }

    @Override // com.huawei.basichealthmodel.listener.TaskDayDataListener
    public void onAllDataChange(int i, List<HealthLifeBean> list) {
        LogUtil.a("HL_TaskDayData", "onAllDataChange result ", Integer.valueOf(i), " list ", list);
        if (list == null || list.size() < this.f1340c) {
            TaskDayDataListener taskDayDataListener = this.f1338a;
            if (taskDayDataListener != null) {
                taskDayDataListener.onAllDataChange(-1, new ArrayList());
                return;
            }
            return;
        }
        a(new CopyOnWriteArrayList<>(list));
    }

    @Override // com.huawei.basichealthmodel.listener.TaskDayDataListener
    public void onDataChange(int i, HealthLifeBean healthLifeBean) {
        if (healthLifeBean == null) {
            TaskDayDataListener taskDayDataListener = this.f1338a;
            if (taskDayDataListener != null) {
                taskDayDataListener.onDataChange(-1, null);
            }
        } else {
            TaskDayDataListener taskDayDataListener2 = this.f1338a;
            if (taskDayDataListener2 != null) {
                taskDayDataListener2.onDataChange(0, healthLifeBean);
            }
            this.e.add(healthLifeBean);
        }
        synchronized (d) {
            this.j.addAndGet(1);
            LogUtil.a("HL_TaskDayData", "onDataChange mResultNum ", Integer.valueOf(this.j.get()), " mNumTotal ", Integer.valueOf(this.f1340c));
            if (this.j.get() >= this.f1340c) {
                onAllDataChange(0, this.e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(final CopyOnWriteArrayList<HealthLifeBean> copyOnWriteArrayList) {
        if (HandlerExecutor.c()) {
            cbg.c(ThreadPoolManager.c(), "HealthModelInsertOneDayTask", new Runnable() { // from class: byv
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1336c.a(copyOnWriteArrayList);
                }
            });
            return;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("");
        ArrayList<Integer> arrayListA = byu.c().a();
        int i = 0;
        int i2 = 0;
        for (HealthLifeBean healthLifeBean : copyOnWriteArrayList) {
            if (healthLifeBean != null) {
                int id = healthLifeBean.getId();
                if ("".equals(sb.toString())) {
                    sb.append(id);
                } else {
                    sb.append(",");
                    sb.append(id);
                }
                if (healthLifeBean.getComplete() >= 1) {
                    i++;
                    if (arrayListA.contains(Integer.valueOf(id))) {
                        i2++;
                    }
                }
                if (healthLifeBean.getIsUpdated()) {
                    arrayList.add(healthLifeBean);
                }
            }
        }
        HealthLifeBean healthLifeBeanA = cfu.a(sb.toString(), this.f1339b, i == copyOnWriteArrayList.size() ? 1 : 0, 1, this.i);
        if (copyOnWriteArrayList.size() >= 3) {
            arrayList.add(healthLifeBeanA);
        }
        e(i2, sb, copyOnWriteArrayList.size(), arrayList);
        LogUtil.a("HL_TaskDayData", "onAllTaskDataChange mListener ", this.f1338a);
        TaskDayDataListener taskDayDataListener = this.f1338a;
        if (taskDayDataListener != null) {
            taskDayDataListener.onAllDataChange(0, this.e);
            this.e.clear();
        }
    }

    private void e(int i, StringBuilder sb, int i2, List<HealthLifeBean> list) {
        int iW = cbg.w();
        if (iW != 0 && this.f1339b >= iW) {
            HealthLifeBean healthLifeBeanA = cfu.a(sb.toString(), this.f1339b, i == 3 ? 1 : 0, 100001, this.i);
            if (i2 >= 3) {
                list.add(healthLifeBeanA);
            }
        }
        if (njy.b(list)) {
            LogUtil.a("HL_TaskDayData", "onAllTaskDataChange insertTaskList result is ", Long.valueOf(bxc.a(list, this.i)));
        } else {
            LogUtil.a("HL_TaskDayData", "onAllTaskDataChange insertTaskList is empty.");
        }
    }
}
