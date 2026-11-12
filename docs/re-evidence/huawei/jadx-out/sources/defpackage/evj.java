package defpackage;

import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.datatype.MarketingOption;
import com.huawei.health.marketing.datatype.PositionIdSet;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import health.compact.a.LogUtil;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes28.dex */
public class evj {
    private static volatile evj d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, Task<Map<Integer, ResourceResultInfo>>> f33527a = new ConcurrentHashMap<>();

    private evj() {
    }

    public static evj b() {
        if (d == null) {
            synchronized (evj.class) {
                if (d == null) {
                    d = new evj();
                }
            }
        }
        return d;
    }

    public void b(String str, Task<Map<Integer, ResourceResultInfo>> task) {
        this.f33527a.put(str, task);
        if (this.f33527a.size() > 10) {
            LogUtil.e("MarketingTaskManager", "MarketingTaskManager size: " + this.f33527a.size());
        }
    }

    public void e(final MarketingOption marketingOption, int i, final int i2) {
        if (this.f33527a.isEmpty()) {
            LogUtil.b("MarketingTaskManager", "mTaskMap is empty. ");
            return;
        }
        Task<Map<Integer, ResourceResultInfo>> task = this.f33527a.get(String.valueOf(i));
        if (task == null) {
            LogUtil.b("MarketingTaskManager", "task is empty. ");
        } else if (task.isSuccessful()) {
            d(euz.a(PositionIdSet.getPositionIdList(i)), i2, marketingOption);
        } else {
            task.addOnSuccessListener(new OnSuccessListener<Map<Integer, ResourceResultInfo>>() { // from class: evj.5
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onSuccess(final Map<Integer, ResourceResultInfo> map) {
                    if (map == null) {
                        LogUtil.e("MarketingTaskManager", "result invalid");
                    } else {
                        ThreadPoolManager.c().execute(new Runnable() { // from class: evj.5.2
                            @Override // java.lang.Runnable
                            public void run() {
                                evj.this.d(map, i2, marketingOption);
                            }
                        });
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Map<Integer, ResourceResultInfo> map, int i, MarketingOption marketingOption) {
        LogUtil.b("MarketingTaskManager", "doTriggering... eventType: " + i);
        new evh(marketingOption).d(i, evc.a(map, marketingOption.getTriggerEventParams(), i), marketingOption.getTriggerEventParams());
    }
}
