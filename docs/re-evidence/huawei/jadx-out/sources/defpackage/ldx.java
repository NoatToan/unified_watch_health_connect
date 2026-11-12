package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.huawei.hihealth.model.EventTypeInfo;
import com.huawei.hihealth.model.Goal;
import com.huawei.hihealth.model.GoalInfo;
import com.huawei.hihealth.model.MetricGoal;
import com.huawei.hihealth.model.Subscriber;
import com.huawei.hihealthservice.hihealthkit.model.DataObservableNoCallback;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class ldx extends DataObservableNoCallback<Subscriber> {
    private static ldx instance;
    private static Context sContext;
    private static List<Integer> sDataTypeSupported = new ArrayList();
    private static Map<Integer, String> sGoalTypeToBundleKey = new HashMap();

    static {
        sDataTypeSupported.add(40002);
        sDataTypeSupported.add(40003);
        sDataTypeSupported.add(40004);
        sGoalTypeToBundleKey.put(40002, "step");
        sGoalTypeToBundleKey.put(40003, "carior");
        sGoalTypeToBundleKey.put(40004, "distance");
    }

    private ldx() {
    }

    public static ldx getInstance(Context context) {
        ldx ldxVar;
        synchronized (ldx.class) {
            if (instance == null) {
                instance = new ldx();
                sContext = context;
            }
            ldxVar = instance;
        }
        return ldxVar;
    }

    public static boolean containDataType(int i) {
        return sDataTypeSupported.contains(Integer.valueOf(i));
    }

    public boolean registerObserver(EventTypeInfo eventTypeInfo, Subscriber subscriber) {
        return super.registerObserver((Parcelable) eventTypeInfo, subscriber) && lez.a(this);
    }

    public boolean unregisterObserver(EventTypeInfo eventTypeInfo, Subscriber subscriber) {
        if (super.unregisterObserver((Parcelable) eventTypeInfo, subscriber)) {
            if (!isEmpty()) {
                return true;
            }
            clearObserver();
            lez.c(this);
            return true;
        }
        ReleaseLogUtil.a("HiH_OpenSdkObservable", "unregisterObserver failed");
        return false;
    }

    @Override // com.huawei.hihealthservice.hihealthkit.model.DataObservableNoCallback
    public void notifyDataChanged(Object obj) {
        if (!(obj instanceof Bundle)) {
            ReleaseLogUtil.e("HiH_OpenSdkObservable", "wrong data construct");
            return;
        }
        for (EventTypeInfo eventTypeInfo : this.eventInfos.keySet()) {
            if (eventTypeInfo instanceof GoalInfo) {
                GoalInfo goalInfo = (GoalInfo) eventTypeInfo;
                if (!goalInfo.isAllAchieved() || !isAllSubscriberNotified(eventTypeInfo)) {
                    notifyGoalInfo(goalInfo, (Set) this.eventInfos.get(eventTypeInfo), (Bundle) obj);
                }
            }
        }
        for (EventTypeInfo eventTypeInfo2 : this.eventInfos.keySet()) {
            if (!((GoalInfo) eventTypeInfo2).isAllAchieved() || !isAllSubscriberNotified(eventTypeInfo2)) {
                return;
            }
        }
        lez.k();
    }

    public void clearSubscribeEvent() {
        clearObserver();
        lez.c(this);
    }

    private void notifyGoalInfo(GoalInfo goalInfo, Set<Subscriber> set, Bundle bundle) {
        synchronized (goalInfo) {
            for (Goal goal : goalInfo.getGoals()) {
                if (goal instanceof MetricGoal) {
                    MetricGoal metricGoal = (MetricGoal) goal;
                    metricGoal.setAchievedFlag(false);
                    if (bundle.getInt(sGoalTypeToBundleKey.get(Integer.valueOf(metricGoal.getDataType()))) > metricGoal.getValue()) {
                        metricGoal.setAchievedFlag(true);
                    }
                    if (goalInfo.isAllAchieved()) {
                        ley.e(sContext, goalInfo, set);
                    }
                }
            }
        }
    }
}
