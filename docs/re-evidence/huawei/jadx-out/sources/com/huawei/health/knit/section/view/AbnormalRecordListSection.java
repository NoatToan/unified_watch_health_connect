package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import java.util.HashMap;

/* JADX INFO: loaded from: classes29.dex */
public class AbnormalRecordListSection extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f7557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthSubHeader f7558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f7559c;
    private HealthRecycleView d;
    private View e;

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
    }

    public AbnormalRecordListSection(Context context) {
        super(context);
    }

    public AbnormalRecordListSection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbnormalRecordListSection(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        this.f7559c = context;
        if (this.e == null) {
            LogUtil.j("AbnormalRecordListSection", "initView mainView is null, start to inflate");
            View viewInflate = LayoutInflater.from(this.f7559c).inflate(R.layout.section_abnormal_record_list_layout, (ViewGroup) this, false);
            this.e = viewInflate;
            this.f7557a = (LinearLayout) viewInflate.findViewById(R.id.section_abnormal_record_root);
            this.f7558b = (HealthSubHeader) this.e.findViewById(R.id.section_abnormal_record_cardview);
            this.d = (HealthRecycleView) this.e.findViewById(R.id.section_abnormal_record_recyclerview);
        }
        return this.e;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "AbnormalRecordListSection";
    }
}
