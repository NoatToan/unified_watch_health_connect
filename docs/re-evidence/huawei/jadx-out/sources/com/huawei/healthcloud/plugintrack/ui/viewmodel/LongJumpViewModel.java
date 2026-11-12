package com.huawei.healthcloud.plugintrack.ui.viewmodel;

import android.media.Image;
import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.healthcloud.plugintrack.ui.fragment.LongJumpFragment;
import com.huawei.healthcloud.plugintrack.ui.fragment.LongJumpIntroduceFragment;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class LongJumpViewModel extends SportExamViewModel implements SportDataNotify {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Integer> f11414a = new ArrayList(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f11415b = false;

    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel
    protected void playPreSportTipsVoice() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel, com.huawei.healthcloud.plugintrack.ui.view.glrender.util.Camera2Helper.OnPreviewListener
    public void onPreviewFrame(Image image, int i, int i2) {
        if (this.f11415b) {
            super.onPreviewFrame(image, i, i2);
        }
    }

    public void d(boolean z) {
        this.f11415b = z;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void initFragment() {
        addFragment(new LongJumpFragment());
        addFragment(new LongJumpIntroduceFragment());
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void initReceivedDataHandlers() {
        super.initReceivedDataHandlers();
        receivedAllData();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel
    protected void handlePostSportExamScore(int i) {
        if (i < 50) {
            LogUtil.a("Track_LongJumpViewModel", "handlePostSportExamScore score < 50");
            super.handlePostSportExamScore(i);
        } else {
            this.f11414a.add(Integer.valueOf(i));
            super.handlePostSportExamScore(i);
        }
    }

    public List<Integer> d() {
        if (this.f11414a == null) {
            this.f11414a = new ArrayList(3);
        }
        return this.f11414a;
    }

    public boolean a() {
        if (this.f11414a.size() <= 1) {
            return false;
        }
        List<Integer> list = this.f11414a;
        int iIntValue = list.get(list.size() - 1).intValue();
        List<Integer> list2 = this.f11414a;
        return iIntValue > list2.get(list2.size() + (-2)).intValue();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public String getTag() {
        return "Track_LongJumpViewModel";
    }
}
