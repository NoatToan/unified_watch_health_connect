package com.huawei.ui.main.stories.fitness.activity.heartrate.provider;

import android.content.Context;
import android.view.View;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.heartrate.BradycardiaAlarmActivity;
import com.huawei.ui.main.stories.fitness.activity.heartrate.WarningHRActivity;
import defpackage.uid;
import health.compact.a.util.LogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class HeartRateHistoryRecordProvider extends MinorProvider<uid> {
    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void parseParams(final Context context, HashMap<String, Object> map, uid uidVar) {
        LogUtil.a("HeartRateHistoryRecordButtonProvider", "parseParams");
        map.put("SINGLE_BUTTON", context.getString(R.string.IDS_hw_base_health_data_history));
        map.put("CARD_INDEX", Integer.valueOf(uidVar.b()));
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.provider.HeartRateHistoryRecordProvider.2
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
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
                if (i == 2) {
                    WarningHRActivity.c(context);
                } else if (i == 3) {
                    BradycardiaAlarmActivity.a(context);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.knit.data.MinorProvider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onSetSectionBeanData(SectionBean sectionBean, uid uidVar) {
        LogUtil.a("HeartRateHistoryRecordButtonProvider", "onSetSectionBeanData");
        sectionBean.c(uidVar);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "HeartRateHistoryRecordButtonProvider";
    }
}
