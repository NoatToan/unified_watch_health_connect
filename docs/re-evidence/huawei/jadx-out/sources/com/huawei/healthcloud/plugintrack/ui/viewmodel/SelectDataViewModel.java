package com.huawei.healthcloud.plugintrack.ui.viewmodel;

import android.os.Bundle;
import android.os.Message;
import com.huawei.health.basesport.viewmodel.BaseSportingViewModel;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.hbw;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class SelectDataViewModel extends BaseSportingViewModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11416c = false;

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void initFragment() {
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void init(Bundle bundle) {
        super.init(bundle);
        addSportDataMap("selectAllData");
        this.f11416c = getDataSource() == 100;
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void initReceivedDataHandlers() {
        b();
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public String getTag() {
        return "Track_SelectDataViewModel";
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public List<String> getSubscribeTagList() {
        LogUtil.a("Track_SelectDataViewModel", "getSubscribeTagList enter ");
        ArrayList arrayList = new ArrayList();
        arrayList.add("DISTANCE_DATA");
        arrayList.add("TIME_ONE_SECOND_DURATION");
        arrayList.add("HEART_RATE_DATA");
        arrayList.add("CALORIES_DATA");
        arrayList.add("ACTIVE_CALORIES_DATA");
        arrayList.add("CREEP_DATA");
        arrayList.add("DESCENT_DATA");
        arrayList.add("ALTITUDE_DATA");
        arrayList.add("SPEED_DATA");
        arrayList.add("AVG_SPEED_DATA");
        arrayList.add("MAX_SPEED_DATA");
        arrayList.add("CADENCE_DATA");
        arrayList.add("POWER_DATA");
        arrayList.add("ANALOG_POWER_DATA");
        arrayList.add("INCLINATION_DATA");
        arrayList.add("ANALOG_CADENCE_DATA");
        arrayList.add("THREE_SEC_POWER_DATA");
        arrayList.add("THREE_SEC_ANALOG_POWER_DATA");
        arrayList.add("AVG_POWER_DATA");
        arrayList.add("AVG_ANALOG_POWER_DATA");
        arrayList.add("AVG_CADENCE_DATA");
        arrayList.add("AVG_ANALOG_CADENCE_DATA");
        LogUtil.a("Track_SelectDataViewModel", "getSubscribeTagList enter ,", arrayList);
        return arrayList;
    }

    private void b() {
        this.mReceivedDataHandlers.add(new BaseSportingViewModel.ReceivedDataHandler<Long>(this, "TIME_ONE_SECOND_DURATION", "selectAllData", Long.class) { // from class: com.huawei.healthcloud.plugintrack.ui.viewmodel.SelectDataViewModel.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel.ReceivedDataHandler
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void handleInner(Long l, Map map) {
                SelectDataViewModel.this.postValue(this.mViewModelTag, hbw.e(map, SelectDataViewModel.this.getSportType(), SelectDataViewModel.this.f11416c));
            }
        });
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        ReleaseLogUtil.d("Track_SelectDataViewModel", "onCleared()");
        unregisterAll();
        if (this.mExtendHandler != null) {
            this.mExtendHandler.quit(true);
        }
    }
}
