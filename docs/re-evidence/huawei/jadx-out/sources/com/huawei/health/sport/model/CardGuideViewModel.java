package com.huawei.health.sport.model;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import defpackage.lmf;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public class CardGuideViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MutableLiveData<a> f8799a = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WorkoutRecord f8800b;

    public void d(LifecycleOwner lifecycleOwner) {
        LogUtil.a("CardGuideViewModel", "removeObserve");
        this.f8799a.removeObservers(lifecycleOwner);
    }

    public void e(int i) {
        HashMap map = new HashMap(10);
        WorkoutRecord workoutRecord = this.f8800b;
        int iAcquireCategory = workoutRecord != null ? workoutRecord.acquireCategory() : 0;
        if (iAcquireCategory == 0) {
            map.put(BleConstants.SPORT_TYPE, 10001);
        } else {
            map.put(BleConstants.SPORT_TYPE, Integer.valueOf(iAcquireCategory));
        }
        map.put("click", 1);
        map.put("event", Integer.valueOf(i));
        map.put("entrance", "1");
        LogUtil.a("CardGuideViewModel", "uploadBiEvent, SPORT_CALORIE_CONSUMPTION_2160140: ", map.toString());
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SPORT_CALORIE_CONSUMPTION_2160140.value(), map, 0);
    }

    /* JADX INFO: loaded from: classes31.dex */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8801a;
        public int d;
        public int e;

        public int d() {
            return this.d;
        }

        public int c() {
            return this.e;
        }

        public int e() {
            return this.f8801a;
        }
    }
}
