package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.qqw;
import health.compact.a.CommonUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class SectionNoNetWork extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f7857a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7858c;
    private View d;

    public SectionNoNetWork(Context context) {
        super(context);
    }

    public SectionNoNetWork(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SectionNoNetWork(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public boolean isActivated() {
        return !CommonUtil.ab((Context) null);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_no_network_layout, (ViewGroup) this, false);
        this.f7857a = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.no_network_layout);
        this.d = viewFindViewById;
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionNoNetWork.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!CommonUtil.ab((Context) null)) {
                    LogUtil.j("SectionNoNetWork", "Network not connected");
                    return;
                }
                ObserverManagerUtil.e("RELOAD_ONLINE_SECTION" + SectionNoNetWork.this.f7858c, true);
                SectionNoNetWork.this.f7857a.setVisibility(8);
            }
        });
        LogUtil.a("SectionNoNetWork", "onCreateView");
        return this.f7857a;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionNoNetWork";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        this.f7858c = qqw.c(map, "POSITION_ID", 0);
    }
}
