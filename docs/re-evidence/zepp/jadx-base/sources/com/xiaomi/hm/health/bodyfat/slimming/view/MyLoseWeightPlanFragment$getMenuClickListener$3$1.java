package com.xiaomi.hm.health.bodyfat.slimming.view;

import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.xiaomi.hm.health.bodyfat.slimming.repo.LoseWeightPlan;
import com.xiaomi.hm.health.bodyfat.slimming.view.MyLoseWeightPlanFragment$getMenuClickListener$3$1;
import com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightSportDetail;
import com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightViewModel;
import com.xiaomi.hm.health.bodyfat.utils.StatEvent;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/xiaomi/hm/health/bodyfat/slimming/view/MyLoseWeightPlanFragment$getMenuClickListener$3$1", "Lcom/xiaomi/hm/health/bodyfat/slimming/view/OnCheckCallback;", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "weightInfo", "", "onNextStep", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class MyLoseWeightPlanFragment$getMenuClickListener$3$1 implements OnCheckCallback {
    public final /* synthetic */ MyLoseWeightPlanFragment a;

    public MyLoseWeightPlanFragment$getMenuClickListener$3$1(MyLoseWeightPlanFragment myLoseWeightPlanFragment) {
        this.a = myLoseWeightPlanFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(MyLoseWeightPlanFragment myLoseWeightPlanFragment, ArrayList arrayList) {
        myLoseWeightPlanFragment.n(arrayList, myLoseWeightPlanFragment.k().getCurrentLoseWeightWeightInfo(), 101);
    }

    @Override // com.xiaomi.hm.health.bodyfat.slimming.view.OnCheckCallback
    public void onNextStep(@NotNull WeightInfos weightInfo) {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.SLIM_EDITTIME_BUTTON_C));
        LoseWeightViewModel loseWeightViewModelK = this.a.k();
        LoseWeightPlan loseWeightPlan = this.a.loseWeightPlan;
        MutableLiveData<ArrayList<List<LoseWeightSportDetail>>> loseWeightPlan2 = loseWeightViewModelK.getLoseWeightPlan(loseWeightPlan == null ? 0 : loseWeightPlan.getLoseWeight(), weightInfo);
        FragmentActivity fragmentActivityRequireActivity = this.a.requireActivity();
        final MyLoseWeightPlanFragment myLoseWeightPlanFragment = this.a;
        loseWeightPlan2.observe(fragmentActivityRequireActivity, new Observer() { // from class: ya5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MyLoseWeightPlanFragment$getMenuClickListener$3$1.b(myLoseWeightPlanFragment, (ArrayList) obj);
            }
        });
    }
}
