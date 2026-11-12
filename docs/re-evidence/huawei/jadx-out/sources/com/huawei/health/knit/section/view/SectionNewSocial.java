package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class SectionNewSocial extends BaseSection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f7856b;
    private View d;
    private Context e;

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return null;
    }

    public SectionNewSocial(Context context) {
        super(context);
        this.f7856b = "RESOURCE_BRIEF_INFO";
    }

    public SectionNewSocial(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7856b = "RESOURCE_BRIEF_INFO";
    }

    public SectionNewSocial(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7856b = "RESOURCE_BRIEF_INFO";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        this.e = context;
        if (this.d == null) {
            LogUtil.j("SectionNewSocial", "initView mainView is null, start to inflate");
            this.d = LayoutInflater.from(this.e).inflate(R.layout.section_new_social_layout, (ViewGroup) this, false);
        }
        return this.d;
    }
}
