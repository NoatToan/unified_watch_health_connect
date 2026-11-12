package com.huawei.healthcloud.plugintrack.ui.viewmodel;

import android.os.Bundle;
import com.huawei.health.basesport.viewmodel.BaseSportingViewModel;
import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.healthcloud.plugintrack.ui.fragment.StandFlexIntroduceFragment;
import com.huawei.healthcloud.plugintrack.ui.fragment.StandingFlexionFragment;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsportmodel.SportAchieveSubscribe;
import com.huawei.hwsportmodel.StandFlexionAchieveType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class StandingFlexionViewModel extends SportExamViewModel implements SportDataNotify {
    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void init(Bundle bundle) {
        super.init(bundle);
        addSportDataMap("standFlexionScore");
        addSportDataMap("maxFlexionScore");
        addSportDataMap("isShowBend");
        addSportDataMap("isLegalScore");
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel
    protected void playPreSportTipsVoice() {
        speakNativeVoice("L002");
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void initFragment() {
        addFragment(new StandingFlexionFragment());
        addFragment(new StandFlexIntroduceFragment());
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void requestData() {
        super.requestData();
        if (this.mSportDataOutputApi == null) {
            LogUtil.j("Track_StandingFlexionViewModel", "requestData failed, mSportDataOutputApi is null");
        } else {
            this.mSportDataOutputApi.registerAchieveLevel(getTag(), new SportAchieveSubscribe() { // from class: jvx
                @Override // com.huawei.hwsportmodel.SportAchieveSubscribe
                public final void onChange(Object obj) {
                    this.f39129a.e(obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Object obj) {
        if (obj instanceof StandFlexionAchieveType) {
            postValue("encourageType", Integer.valueOf(((StandFlexionAchieveType) obj).getScore()));
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public String getTag() {
        return "Track_StandingFlexionViewModel";
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void initReceivedDataHandlers() {
        super.initReceivedDataHandlers();
        d();
        c();
        e();
        b();
        receivedAllData();
    }

    private void e() {
        this.mReceivedData.add(new BaseSportingViewModel.ReceivedDataHandler<Boolean>(this, "STAND_FLEXION_BEND_SHOW", "isShowBend", Boolean.class) { // from class: com.huawei.healthcloud.plugintrack.ui.viewmodel.StandingFlexionViewModel.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel.ReceivedDataHandler
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void handleInner(Boolean bool, Map<String, Object> map) {
                LogUtil.a("Track_StandingFlexionViewModel", "receivedDataHandleBend", bool);
                StandingFlexionViewModel.this.postValue("isShowBend", bool);
            }
        });
    }

    private void b() {
        this.mReceivedData.add(new BaseSportingViewModel.ReceivedDataHandler<Boolean>(this, "STAND_FLEXION_IS_LEGAL_SCORE", "isLegalScore", Boolean.class) { // from class: com.huawei.healthcloud.plugintrack.ui.viewmodel.StandingFlexionViewModel.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel.ReceivedDataHandler
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void handleInner(Boolean bool, Map<String, Object> map) {
                LogUtil.a("Track_StandingFlexionViewModel", "receivedDataHandleIsLegalScore", bool);
                StandingFlexionViewModel.this.postValue("isLegalScore", bool);
            }
        });
    }

    private void c() {
        this.mReceivedData.add(new BaseSportingViewModel.ReceivedDataHandler<Integer>(this, "STAND_FLEXION_HIGHEST_SCORE", "maxFlexionScore", Integer.class) { // from class: com.huawei.healthcloud.plugintrack.ui.viewmodel.StandingFlexionViewModel.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel.ReceivedDataHandler
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void handleInner(Integer num, Map<String, Object> map) {
                LogUtil.a("Track_StandingFlexionViewModel", "highestScore:", num);
                StandingFlexionViewModel.this.postValue("maxFlexionScore", num);
            }
        });
    }

    private void d() {
        this.mReceivedData.add(new BaseSportingViewModel.ReceivedDataHandler<Integer>(this, "STAND_FLEXION_SCORE_DATA", "standFlexionScore", Integer.class) { // from class: com.huawei.healthcloud.plugintrack.ui.viewmodel.StandingFlexionViewModel.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel.ReceivedDataHandler
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void handleInner(Integer num, Map<String, Object> map) {
                StandingFlexionViewModel.this.postValue("standFlexionScore", num);
            }
        });
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public List<String> getSubscribeTagList() {
        ArrayList arrayList = new ArrayList(super.getSubscribeTagList());
        arrayList.add("STAND_FLEXION_SCORE_DATA");
        arrayList.add("STAND_FLEXION_HIGHEST_SCORE");
        arrayList.add("STAND_FLEXION_IS_LEGAL_SCORE");
        arrayList.add("STAND_FLEXION_BEND_SHOW");
        arrayList.add("STAND_FLEXION_HIGHEST_SCORE_TEMP");
        return arrayList;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void requestLocalData() {
        super.requestLocalData();
        postValue("standFlexionScore", 0);
        postValue("maxFlexionScore", 0);
    }
}
