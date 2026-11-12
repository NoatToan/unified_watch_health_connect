package com.huawei.health.sportservice.manager;

import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 1, name = ComponentName.SPORT_STATUS_MANAGER)
public class SportStatusManager implements ManagerComponent {
    private static final String TAG = "SportService_SportStatusManager";
    private int mStatus = 0;
    private final Map<String, SportLifecycle> mListeners = Collections.synchronizedMap(new LinkedHashMap());

    public int registerStatusListener(String str, SportLifecycle sportLifecycle) {
        if (sportLifecycle != null && str != null && this != sportLifecycle) {
            LogUtil.b(TAG, "registerStatusListener() tag = ", str, " sportLifecycle = ", sportLifecycle);
            this.mListeners.put(str, sportLifecycle);
        } else {
            ReleaseLogUtil.c(TAG, "registerStatusListener() wrong ", str, "sportLifecycle is null", Boolean.valueOf(sportLifecycle == null));
        }
        return this.mStatus;
    }

    public void unRegisterStatus(String str) {
        if (str == null || !this.mListeners.containsKey(str)) {
            ReleaseLogUtil.c(TAG, "unRegisterStatus wrong, tag = ", str);
        } else {
            LogUtil.b(TAG, "unRegisterStatus  mListeners, tag = ", str, " observe = ", this.mListeners.get(str));
            this.mListeners.remove(str);
        }
    }

    public int getSportStatus() {
        return this.mStatus;
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport(String str) {
        this.mStatus = 7;
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.mListeners);
        LogUtil.b(TAG, "onPreSport() tempListeners ", linkedHashMap, " source ", str);
        for (SportLifecycle sportLifecycle : linkedHashMap.values()) {
            try {
                sportLifecycle.onPreSport(str);
            } catch (Exception e) {
                LogUtil.d(TAG, "onPreSport() listener: ", sportLifecycle, ", caused by: ", LogUtil.c(e));
            }
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onCountDown(String str) {
        this.mStatus = 6;
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.mListeners);
        LogUtil.b(TAG, "onCountDown() tempListeners ", linkedHashMap, " source ", str);
        for (SportLifecycle sportLifecycle : linkedHashMap.values()) {
            try {
                sportLifecycle.onCountDown(str);
            } catch (Exception e) {
                LogUtil.d(TAG, "onCountDown() listener: ", sportLifecycle, ", caused by: ", LogUtil.c(e));
            }
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport(String str) {
        this.mStatus = 1;
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.mListeners);
        LogUtil.b(TAG, "onStartSport() tempListeners ", linkedHashMap, " source ", str);
        for (SportLifecycle sportLifecycle : linkedHashMap.values()) {
            try {
                sportLifecycle.onStartSport(str);
            } catch (Exception e) {
                LogUtil.d(TAG, "onStartSport() listener: ", sportLifecycle, ", caused by: ", LogUtil.c(e));
            }
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport(String str) {
        this.mStatus = 1;
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.mListeners);
        LogUtil.b(TAG, "onResumeSport() tmpListenerMap ", linkedHashMap, " source ", str);
        for (SportLifecycle sportLifecycle : linkedHashMap.values()) {
            try {
                sportLifecycle.onResumeSport(str);
            } catch (Exception e) {
                LogUtil.d(TAG, "onResumeSport() listener: ", sportLifecycle, ", caused by: ", LogUtil.c(e));
            }
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport(String str) {
        this.mStatus = 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.mListeners);
        LogUtil.b(TAG, "onPauseSport() tmpListenerMap ", linkedHashMap, " source ", str);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            try {
                ((SportLifecycle) entry.getValue()).onPauseSport(str);
            } catch (Exception e) {
                LogUtil.d(TAG, "onPauseSport() listener: ", entry.getValue(), ", caused by: ", LogUtil.c(e));
            }
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStopSport(String str) {
        this.mStatus = 3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.mListeners);
        LogUtil.b(TAG, "onStopSport() tmpListenerMap: ", linkedHashMap, " source ", str);
        for (SportLifecycle sportLifecycle : linkedHashMap.values()) {
            try {
                sportLifecycle.onStopSport(str);
            } catch (Exception e) {
                LogUtil.d(TAG, "onStopSport() listener: ", sportLifecycle, ", caused by: ", LogUtil.c(e));
            }
        }
    }
}
