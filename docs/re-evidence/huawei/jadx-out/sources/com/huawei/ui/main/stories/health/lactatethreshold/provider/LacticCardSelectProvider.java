package com.huawei.ui.main.stories.health.lactatethreshold.provider;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.data.BaseKnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.main.R;
import defpackage.fok;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class LacticCardSelectProvider extends BaseKnitDataProvider {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DataInfos f27988c = DataInfos.NoDataPlaceHolder;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        sectionBean.c(e(BaseApplication.getContext()));
        sectionBean.c(new Object());
    }

    private void a() {
        Bundle extra = getExtra();
        DataInfos dataInfos = DataInfos.NoDataPlaceHolder;
        if (extra != null) {
            Serializable serializable = extra.getSerializable("key_bundle_health_line_chart_data_infos");
            if (serializable instanceof DataInfos) {
                dataInfos = (DataInfos) serializable;
            }
        }
        this.f27988c = dataInfos;
    }

    private HashMap<String, Object> e(Context context) {
        a();
        HashMap<String, Object> map = new HashMap<>();
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(context.getResources().getString(R.string.IDS_lactate_threshold_heart_rate));
        arrayList.add(context.getResources().getString(R.string.IDS_lactate_threshold_pace));
        map.put("LEFT_MIDDLE_TEXT", arrayList);
        map.put("SELECTED_BACKGROUND", Integer.valueOf(R.drawable.rq_state_category_item_click));
        map.put("UNSELECTED_BACKGROUND", Integer.valueOf(R.drawable.rq_state_category_item));
        map.put("SELECTED_TEXT_COLOR", Integer.valueOf(context.getColor(R.color.textColorPrimaryInverse)));
        map.put("UNSELECTED_TEXT_COLOR", Integer.valueOf(context.getColor(R.color.textColorSecondary)));
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.health.lactatethreshold.provider.LacticCardSelectProvider.2
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
                ObserverManagerUtil.e(fok.b(LacticCardSelectProvider.this.f27988c), Integer.valueOf(i));
            }
        });
        return map;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "LacticCardSelectProvider";
    }
}
