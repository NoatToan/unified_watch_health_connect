package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qqw;
import defpackage.qsp;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionActiveStandDataCard extends BaseSection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f7739c;
    private HealthTextView d;
    private HealthTextView e;

    public SectionActiveStandDataCard(Context context) {
        super(context);
    }

    public SectionActiveStandDataCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SectionActiveStandDataCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_active_stand_data_card, (ViewGroup) this, false);
        this.f7739c = viewInflate;
        this.d = (HealthTextView) viewInflate.findViewById(R.id.section_active_stand_data_card_sum_value);
        this.e = (HealthTextView) this.f7739c.findViewById(R.id.section_active_stand_data_card_average_value);
        return this.f7739c;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SCUI_SectionActiveStandDataCard";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        if (map == null || map.size() == 0) {
            LogUtil.j("SCUI_SectionActiveStandDataCard", "no need to bind");
            return;
        }
        LogUtil.a("SCUI_SectionActiveStandDataCard", "bindParamsToView");
        qsp.b(this.d, qqw.d((Map) map, "CUMULATIVE_SUM", (CharSequence) ""));
        qsp.b(this.e, qqw.d((Map) map, "DAILY_AVERAGE", (CharSequence) ""));
    }
}
