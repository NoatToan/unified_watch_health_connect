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
public class SectionIntroductionCard extends BaseSection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f7805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f7806c;
    private HealthTextView e;

    public SectionIntroductionCard(Context context) {
        super(context);
    }

    public SectionIntroductionCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SectionIntroductionCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_introduction_card, (ViewGroup) this, false);
        this.f7806c = viewInflate;
        this.e = (HealthTextView) viewInflate.findViewById(R.id.hsh_introduction_title);
        this.f7805b = (HealthTextView) this.f7806c.findViewById(R.id.htv_introduction_content);
        return this.f7806c;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionIntroductionCard";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        if (map == null || map.size() == 0) {
            LogUtil.j("SectionIntroductionCard", "no need to bind");
            return;
        }
        LogUtil.a("SectionIntroductionCard", "bindParamsToView");
        qsp.b(this.e, qqw.d((Map) map, "STAND_WHAT", ""));
        qsp.a(this.f7805b, qqw.d((Map) map, "STAND_EXPLAIN", ""), true);
    }
}
