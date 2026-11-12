package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.MedalConfigInfo;
import com.huawei.pluginachievement.manager.service.AchieveMedalResDownloadObserver;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes13.dex */
public class otg {
    public static void d(final otl otlVar, Context context) {
        if (otlVar == null) {
            return;
        }
        List<osf> listD = otlVar.d(9, new HashMap(2));
        otlVar.c(new AchieveMedalResDownloadObserver(context));
        if (listD != null) {
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            for (osf osfVar : listD) {
                if (osfVar instanceof MedalConfigInfo) {
                    MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVar;
                    if (pax.k(medalConfigInfo.acquireMedalType()) && TextUtils.isEmpty(medalConfigInfo.acquireEndTime())) {
                        final String strValueOf = String.valueOf(medalConfigInfo.acquireActivityId());
                        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: oti
                            @Override // java.lang.Runnable
                            public final void run() {
                                otg.c(otlVar, strValueOf);
                            }
                        });
                    }
                }
            }
            executorServiceNewSingleThreadExecutor.shutdown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(otl otlVar, String str) {
        LogUtil.a("PLGACHIEVE_AchieveActivityMedalService", "processActivityMedal acquireActivityId=", str);
        HashMap map = new HashMap(1);
        map.put("activityId", str);
        otlVar.a(10, map);
    }
}
