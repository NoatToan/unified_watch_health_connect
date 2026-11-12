package com.huawei.health.suggestion.ui.tabfragments.provider;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.activity.FitnessActionLibraryActivity;
import com.huawei.health.suggestion.ui.fitness.activity.FitnessActionTypeActivity;
import com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.fsu;
import defpackage.idy;
import defpackage.njy;
import defpackage.qrk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class ActionLibraryProvider extends FitnessEntranceProvider<List<FitWorkout>> {
    private List<fsu> d;

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getCourseCategory() {
        return 137;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getPageType() {
        return 22;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public int getType() {
        return 137;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public boolean isCustomActive(Context context) {
        return true;
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadData(Context context, SectionBean sectionBean) {
        sectionBean.c(new ArrayList());
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, List<FitWorkout> list) {
        c(context, map, list);
    }

    private void c(final Context context, HashMap<String, Object> map, List<FitWorkout> list) {
        c();
        map.put("PAGE_TYPE", Integer.valueOf(getPageType()));
        map.put("TITLE", context.getString(R.string.sug_action_lib));
        map.put("SUBTITLE", context.getString(R.string.IDS_user_profile_more));
        map.put("SECTION1_1CARD_02_BEAN", this.d);
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.health.suggestion.ui.tabfragments.provider.ActionLibraryProvider.3
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, int i2) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, String str) {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                if (str.equals("SUBTITLE")) {
                    ActionLibraryProvider.this.e(context);
                }
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
                if (njy.e(ActionLibraryProvider.this.d, i)) {
                    LogUtil.e("Track_Provider_ActionLibraryProvider", "position is out of bounds");
                } else {
                    ActionLibraryProvider actionLibraryProvider = ActionLibraryProvider.this;
                    actionLibraryProvider.a(context, (fsu) actionLibraryProvider.d.get(i));
                }
            }
        });
    }

    private void c() {
        this.d = new ArrayList(10);
        int[] iArr = {R.string.sug_action_whole_body, R.string.sug_action_chest, R.string.sug_action_shoulder, R.string.sug_action_back, R.string.sug_action_arm, R.string.sug_action_abdomen, R.string.sug_action_waist, R.string.sug_action_hips, R.string.sug_action_leg, R.string.sug_action_neck};
        int[] iArr2 = {R.drawable.fitness_action_body, R.drawable.fitness_action_chest, R.drawable.fitness_action_shoulder, R.drawable.fitness_action_back, R.drawable.fitness_action_arm, R.drawable.fitness_action_abdomen, R.drawable.fitness_action_waist, R.drawable.fitness_action_hips, R.drawable.fitness_action_foot, R.drawable.fitness_action_neck};
        int[] iArr3 = {1, 2, 16, 4, 128, 256, 32, 64, 8, 512};
        for (int i = 0; i < 10; i++) {
            fsu fsuVar = new fsu();
            fsuVar.d(iArr[i]);
            fsuVar.a(iArr2[i]);
            fsuVar.e(iArr3[i]);
            this.d.add(fsuVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, fsu fsuVar) {
        MarketingBiUtils.c(getPageType(), getSubViewTitle(), 11);
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put("date", qrk.b());
        map.put("type", Integer.valueOf(fsuVar.e()));
        idy.b(AnalyticsValue.HEALTH_FITNESS_ACTION_TYPE_1130028.value(), map);
        Intent intent = new Intent(context, (Class<?>) FitnessActionTypeActivity.class);
        intent.putExtra("body_title", context.getString(fsuVar.b()));
        intent.putExtra("body_title_type", fsuVar.e());
        intent.setFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("Track_Provider_ActionLibraryProvider", "startFitnessActionTypeActivity exception" + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        HashMap map = new HashMap(1);
        map.put("click", 1);
        idy.b(AnalyticsValue.HEALTH_FITNESS_ACTION_LIBRARY_1130027.value(), map);
        Intent intent = new Intent(context, (Class<?>) FitnessActionLibraryActivity.class);
        intent.setFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("Track_Provider_ActionLibraryProvider", "startActivityForActionLib exception" + e.getMessage());
        }
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider, com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "Track_Provider_ActionLibraryProvider";
    }

    @Override // com.huawei.health.suggestion.ui.tabfragments.provider.abstractproviders.FitnessEntranceProvider
    public String getSubViewTitle() {
        return BaseApplication.getContext().getResources().getString(R.string.sug_my_yoga_class);
    }
}
