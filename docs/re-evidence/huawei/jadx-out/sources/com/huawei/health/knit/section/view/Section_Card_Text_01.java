package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.qqw;
import defpackage.qsp;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class Section_Card_Text_01 extends BaseSection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f7980b;
    private HealthSubHeader e;

    public Section_Card_Text_01(Context context) {
        this(context, null);
    }

    public Section_Card_Text_01(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Section_Card_Text_01(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_card_text_1_layout, (ViewGroup) this, false);
        HealthSubHeader healthSubHeader = (HealthSubHeader) viewInflate.findViewById(R.id.sub_header);
        this.e = healthSubHeader;
        healthSubHeader.setSubHeaderBackgroundColor(context.getColor(R.color.common_transparent));
        this.f7980b = (HealthTextView) viewInflate.findViewById(R.id.text1);
        return viewInflate;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        if (map == null || map.size() == 0) {
            LogUtil.a("Section_Card_Text_01", "no need to bind");
            return;
        }
        this.e.setHeadTitleText(qqw.d((Map) map, "TITLE", ""));
        int iC = qqw.c(map, "SUB_HEADER_MAX_LINES", -1);
        if (iC != -1) {
            this.e.setHeadTitleMaxLine(iC);
        }
        qsp.a(this.f7980b, qqw.d((Map) map, "TEXT1", ""), true);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section_Card_Text_01";
    }
}
