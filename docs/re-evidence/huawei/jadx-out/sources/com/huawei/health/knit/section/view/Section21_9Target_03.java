package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Utils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class Section21_9Target_03 extends BaseSection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Section21_9Target_03Impl f7672b;

    public Section21_9Target_03(Context context) {
        this(context, null);
        b(context);
    }

    private void b(Context context) {
        this.f7672b = !Utils.o() ? new Section21_9Target_03ChinaImpl(context) : new Section21_9Target_03OverseaImpl(context);
    }

    public Section21_9Target_03(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        b(context);
    }

    public Section21_9Target_03(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(context);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        return this.f7672b.onCreateView(context, this);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        this.f7672b.bindParamsToView(map);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.section_sub_header) {
            onClick("MORE_CLICK_EVENT");
        } else {
            LogUtil.e("view id is invalid", new Object[0]);
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section_Section21_9Target_03";
    }
}
