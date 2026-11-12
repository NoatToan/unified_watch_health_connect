package com.huawei.ui.main.stories.fitness.activity.heartrate.provider;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.main.R;
import defpackage.uid;
import health.compact.a.util.LogUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class HeartRateCardSelectProvider extends MinorProvider<uid> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DataInfos f26925c = DataInfos.NoDataPlaceHolder;

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        sectionBean.c(e(BaseApplication.getContext()));
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, uid uidVar) {
        LogUtil.a("HeartRateCardSelectProvider", "parseParams");
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(uidVar.a());
        arrayList.add(uidVar.d());
        arrayList.add(uidVar.c());
        arrayList.add(uidVar.i());
        map.put("CARD_DATA_TEXT", arrayList);
    }

    private void d() {
        Bundle extra = getExtra();
        DataInfos dataInfos = DataInfos.NoDataPlaceHolder;
        if (extra != null) {
            Serializable serializable = extra.getSerializable("key_bundle_health_line_chart_data_infos");
            if (serializable instanceof DataInfos) {
                dataInfos = (DataInfos) serializable;
            }
        }
        this.f26925c = dataInfos;
    }

    private HashMap<String, Object> e(Context context) {
        d();
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(context.getResources().getString(R.string.IDS_hw_health_show_healthdata_heartrate_range));
        if (this.f26925c == DataInfos.HeartRateDayDetail) {
            arrayList.add(context.getResources().getString(R.string.IDS_resting_heart_rate_string));
        } else {
            arrayList.add(context.getResources().getString(R.string.IDS_hw_health_show_healthdata_avg_rest_heartrate));
        }
        arrayList.add(context.getResources().getString(R.string.IDS_heartrate_raise_alarm));
        arrayList.add(context.getResources().getString(R.string.IDS_heartrate_bradycardia_alarm));
        HashMap<String, Object> map = new HashMap<>();
        map.put("CARD_TITLE_TEXT", arrayList);
        ArrayList arrayList2 = new ArrayList(4);
        arrayList2.add(context.getResources().getString(R.string.IDS_main_watch_heart_rate_unit_string));
        arrayList2.add(context.getResources().getString(R.string.IDS_main_watch_heart_rate_unit_string));
        arrayList2.add(context.getResources().getString(R.string.IDS_main_watch_heart_rate_unit_string));
        arrayList2.add(context.getResources().getString(R.string.IDS_main_watch_heart_rate_unit_string));
        map.put("CARD_PIECE_TEXT", arrayList2);
        map.put("RECYCLERVIEW_STYLE", 1);
        map.put("SELECTED_BACKGROUND", Integer.valueOf(R.drawable.bakground_charteye_select));
        map.put("UNSELECTED_BACKGROUND", Integer.valueOf(R.drawable.background_charteye));
        map.put("SELECTED_TEXT_COLOR", Integer.valueOf(context.getColor(R.color.textColorPrimaryInverse)));
        map.put("UNSELECTED_TEXT_COLOR", Integer.valueOf(context.getColor(R.color.textColorSecondary)));
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.provider.HeartRateCardSelectProvider.4
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
                ObserverManagerUtil.e("CARD_ITEM_INDEX", Integer.valueOf(i));
            }
        });
        return map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.knit.data.MinorProvider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onSetSectionBeanData(SectionBean sectionBean, uid uidVar) {
        LogUtil.a("HeartRateCardSelectProvider", "onSetSectionBeanData");
        sectionBean.c(uidVar);
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "HeartRateCardSelectProvider";
    }
}
