package com.huami.watch.companion.firstbeat;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import com.huami.watch.companion.R;
import com.huami.watch.companion.dataflow.FirstbeatData;
import com.huami.watch.dataflow.model.firstbeat.SportLoadManager;
import com.huami.watch.dataflow.model.firstbeat.bean.SportLoadDataItem;
import com.huami.watch.util.DateDay;

/* JADX INFO: loaded from: classes16.dex */
public class SportLoadFragment extends BaseFirstbeatFragment {
    private SportLoadView a;

    private void c(SportLoadDataItem sportLoadDataItem) {
        if (sportLoadDataItem == null) {
            return;
        }
        int weeklyTLSum = sportLoadDataItem.getWeeklyTLSum();
        int weeklyTLSumOverreaching = sportLoadDataItem.getWeeklyTLSumOverreaching();
        if (weeklyTLSum != -1) {
            this.a.setSportsLoadValue(weeklyTLSum);
        }
        if (weeklyTLSumOverreaching != 0) {
            this.a.setPercent(FirstBeatUtil.calculateSportLoadPercent(sportLoadDataItem.getWeeklyTLSum(), sportLoadDataItem.getWeeklyTLSumOptimalMin(), sportLoadDataItem.getWeeklyTLSumOptimalMax(), sportLoadDataItem.getWeeklyTLSumOverreaching()));
        }
        this.a.setSportsLoadDvLevel(FirstBeatUtil.getSuggestTextByCurrentLoad(getActivity(), sportLoadDataItem.getWeeklyTLSum(), sportLoadDataItem.getWeeklyTLSumOptimalMin(), sportLoadDataItem.getWeeklyTLSumOptimalMax(), sportLoadDataItem.getWeeklyTLSumOverreaching()));
    }

    @Override // com.huami.watch.companion.firstbeat.BaseFirstbeatFragment
    public int getLayout() {
        return R.layout.fragment_sports_load;
    }

    @Override // com.huami.watch.companion.firstbeat.BaseFirstbeatFragment
    public void initView(View view) {
        this.a = (SportLoadView) view.findViewById(R.id.sports_load_view);
    }

    @Override // com.huami.watch.companion.firstbeat.BaseFirstbeatFragment
    public boolean isExistData() {
        return FirstbeatData.existSportLoadData();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        c(SportLoadManager.getManager().get(DateDay.today().toString()));
    }

    @Override // com.huami.watch.companion.firstbeat.BaseFirstbeatFragment
    public void updateTips() {
    }
}
