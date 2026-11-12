package com.huawei.healthcloud.plugintrack.ui.viewmodel;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.huawei.health.basesport.viewmodel.BaseSportingViewModel;
import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.healthcloud.plugintrack.ui.fragment.CrossJumpFragment;
import com.huawei.healthcloud.plugintrack.ui.fragment.CrossJumpIntroduceFragment;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import defpackage.jcm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class CrossJumpViewModel extends SportExamViewModel implements SportDataNotify {
    private int d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Integer, Bitmap> f11412a = new HashMap();
    private int e = 0;

    public boolean d(int i) {
        return i >= 110;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel
    protected void playPreSportTipsVoice() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void initFragment() {
        addFragment(new CrossJumpFragment());
        addFragment(new CrossJumpIntroduceFragment());
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void init(Bundle bundle) {
        super.init(bundle);
        addSportDataMap("COMPLETE_ONE_GROUP");
        addSportDataMap("OVER_TIME_JUMP");
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public List<String> getSubscribeTagList() {
        ArrayList arrayList = new ArrayList(super.getSubscribeTagList());
        arrayList.add("CROSS_JUMP_GROUP_DATA");
        arrayList.add("AI_SPORT_UI_UPDATE_SIGNAL");
        return arrayList;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void initReceivedDataHandlers() {
        super.initReceivedDataHandlers();
        d();
        e();
        receivedAllData();
    }

    private void d() {
        this.mReceivedData.add(new BaseSportingViewModel.ReceivedDataHandler<Integer>(this, "AI_SPORT_UI_UPDATE_SIGNAL", "OVER_TIME_JUMP", Integer.class) { // from class: com.huawei.healthcloud.plugintrack.ui.viewmodel.CrossJumpViewModel.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel.ReceivedDataHandler
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void handleInner(Integer num, Map<String, Object> map) {
                CrossJumpViewModel.this.postValue("OVER_TIME_JUMP", num);
            }
        });
    }

    private void e() {
        this.mReceivedData.add(new BaseSportingViewModel.ReceivedDataHandler<Integer>(this, "CROSS_JUMP_GROUP_DATA", "COMPLETE_ONE_GROUP", Integer.class) { // from class: com.huawei.healthcloud.plugintrack.ui.viewmodel.CrossJumpViewModel.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel.ReceivedDataHandler
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void handleInner(Integer num, Map<String, Object> map) {
                CrossJumpViewModel.this.e = num.intValue();
                CrossJumpViewModel.this.postValue("COMPLETE_ONE_GROUP", num);
            }
        });
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel
    protected void sendSportTime(int i) {
        this.d = i;
        postValue(ParsedFieldTag.NPES_SPORT_TIME, Integer.valueOf(i));
    }

    public int a() {
        return Math.min(this.e, 10);
    }

    public boolean b() {
        return this.d >= 120;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void requestLocalData() {
        super.requestLocalData();
        c();
    }

    private void c() {
        this.f11412a.put(1, jcm.b().c("public_square_first"));
        this.f11412a.put(2, jcm.b().c("public_square_second"));
        this.f11412a.put(3, jcm.b().c("public_square_third"));
        this.f11412a.put(4, jcm.b().c("public_square_fourth"));
        this.f11412a.put(-4002, jcm.b().c("public_jump_error"));
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public String getTag() {
        return "Track_CrossJumpViewModel";
    }

    public Bitmap b(int i) {
        if (this.f11412a.containsKey(Integer.valueOf(i))) {
            return this.f11412a.get(Integer.valueOf(i));
        }
        return jcm.b().c("public_square_first");
    }
}
