package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class SectionConfigurationArea extends BaseSection {
    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected boolean isSupportSafeRegion() {
        return false;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public boolean isSupportShare() {
        return false;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        return null;
    }

    public SectionConfigurationArea(Context context) {
        super(context);
    }

    public SectionConfigurationArea(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SectionConfigurationArea(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionConfigurationArea";
    }
}
