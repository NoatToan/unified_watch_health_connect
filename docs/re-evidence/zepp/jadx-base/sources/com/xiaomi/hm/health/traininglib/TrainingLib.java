package com.xiaomi.hm.health.traininglib;

import android.content.Context;
import com.xiaomi.hm.health.traininglib.ad.TrainingAdManager;
import com.xiaomi.hm.health.traininglib.delegate.TrainingDelegate;
import com.xiaomi.hm.health.traininglib.event.EventReloadCourseData;
import com.xiaomi.hm.health.traininglib.util.TrainingKeeper;
import de.greenrobot.event.EventBus;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingLib {
    private static TrainingDelegate a;

    public static TrainingDelegate getTrainingDelegate() {
        return a;
    }

    public static void init(Context context) {
        TrainingAdManager.getInstance().init(context);
    }

    public static void login() {
        TrainingKeeper.setNeedReloadCourseInfo(true);
        EventBus.getDefault().post(new EventReloadCourseData());
    }

    public static void logout() {
        TrainingKeeper.clear();
        TrainingAdManager.getInstance().clear();
    }

    public static void setTrainingDelegate(TrainingDelegate trainingDelegate) {
        a = trainingDelegate;
    }
}
