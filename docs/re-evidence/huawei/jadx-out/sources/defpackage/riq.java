package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.callback.BackLogCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/* JADX INFO: loaded from: classes17.dex */
public class riq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static DeviceInfo f47363a;

    public void a(DeviceInfo deviceInfo, final BackLogCallback<List<dse>> backLogCallback) {
        new riw().requestBacklog(deviceInfo).thenCombineAsync((CompletionStage) new rjf().requestBacklog(deviceInfo), (BiFunction<? super List<dse>, ? super U, ? extends V>) new BiFunction<List<dse>, List<dse>, List<dse>>() { // from class: riq.4
            @Override // java.util.function.BiFunction
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public List<dse> apply(List<dse> list, List<dse> list2) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (dse dseVar : list2) {
                    if (dseVar.c() != null && dseVar.c().j()) {
                        arrayList.add(dseVar);
                    } else {
                        arrayList2.add(dseVar);
                    }
                }
                arrayList.sort(Comparator.comparingInt(new ris()).reversed());
                arrayList2.sort(Comparator.comparingInt(new ris()).reversed());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(arrayList);
                arrayList3.addAll(list);
                arrayList3.addAll(arrayList2);
                return arrayList3;
            }
        }, (Executor) ThreadPoolManager.c()).whenComplete((BiConsumer<? super V, ? super Throwable>) new BiConsumer<List<dse>, Throwable>() { // from class: riq.2
            @Override // java.util.function.BiConsumer
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void accept(List<dse> list, Throwable th) {
                if (th == null) {
                    backLogCallback.onSuccess(list);
                } else {
                    lqw.e("Backlogmanager", "queryBacklogEvent resultWrapper", th);
                    backLogCallback.onFailure(-1, "queryBacklogEvent failed");
                }
            }
        });
    }

    public void b(DeviceInfo deviceInfo, String str, BackLogCallback<Boolean> backLogCallback) {
        if (str != null && str.startsWith("marketing_")) {
            new rjf().updateVisitedStatus(deviceInfo, str, backLogCallback);
        } else {
            new riw().updateVisitedStatus(deviceInfo, str, backLogCallback);
        }
    }

    public void c(DeviceInfo deviceInfo, String str, BackLogCallback<Boolean> backLogCallback) {
        if (str != null && str.startsWith("marketing_")) {
            new rjf().updateDeleteStatus(deviceInfo, str, backLogCallback);
        } else {
            new riw().updateDeleteStatus(deviceInfo, str, backLogCallback);
        }
    }

    public void b(String str, String str2, BackLogCallback<Integer> backLogCallback) {
        BacklogEvent backlogEventD = rir.d(str2);
        if (backlogEventD == null) {
            backLogCallback.onFailure(-1, "backlogType error");
        } else {
            backlogEventD.onBacklogClick(str, backLogCallback);
        }
    }

    public void a(final String str) {
        ThreadPoolManager.c().a("Backlogmanager", new Runnable() { // from class: rip
            @Override // java.lang.Runnable
            public final void run() {
                riq.c(str);
            }
        });
    }

    static /* synthetic */ void c(String str) {
        String str2 = "Pending_Setting_moduleId_" + lsp.b(BaseApplication.b(), str);
        LogUtil.a("Backlogmanager", "deleteBackLogCache moduleId:", str2);
        SharedPreferenceManager.i(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), str2);
    }

    public boolean d(String str) {
        return rir.d(str) != null;
    }

    public static void a(DeviceInfo deviceInfo) {
        if (deviceInfo != null) {
            f47363a = deviceInfo;
        }
    }

    public static DeviceInfo a() {
        return f47363a;
    }
}
