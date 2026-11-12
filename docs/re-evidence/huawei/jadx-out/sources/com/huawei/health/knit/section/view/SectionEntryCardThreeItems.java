package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.ftc;
import defpackage.njy;
import defpackage.qqw;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionEntryCardThreeItems extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f7784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f7786c;
    private LinearLayout d;
    private LinearLayout e;
    private HealthTextView f;
    private HealthTextView g;
    private HealthTextView h;
    private ImageView i;
    private ImageView j;

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected boolean isSupportSafeRegion() {
        return false;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public boolean isSupportShare() {
        return false;
    }

    public SectionEntryCardThreeItems(Context context) {
        this(context, null);
    }

    public SectionEntryCardThreeItems(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionEntryCardThreeItems(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7785b = true;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("Section_Entry_Card_ThreeViews", "onCreateView");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_entry_card_threeitems, (ViewGroup) this, false);
        this.d = (LinearLayout) viewInflate.findViewById(R.id.section_button_view1);
        this.f7786c = (ImageView) viewInflate.findViewById(R.id.section_icon1);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.section_title1);
        this.f = healthTextView;
        healthTextView.setSplittable(false);
        this.f7784a = (LinearLayout) viewInflate.findViewById(R.id.section_button_view2);
        this.j = (ImageView) viewInflate.findViewById(R.id.section_icon2);
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.section_title2);
        this.g = healthTextView2;
        healthTextView2.setSplittable(false);
        this.e = (LinearLayout) viewInflate.findViewById(R.id.section_button_view3);
        this.i = (ImageView) viewInflate.findViewById(R.id.section_icon3);
        HealthTextView healthTextView3 = (HealthTextView) viewInflate.findViewById(R.id.section_title3);
        this.h = healthTextView3;
        healthTextView3.setSplittable(false);
        setTextSizeForOversea(context);
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        int dimensionPixelSize = BaseApplication.getContext().getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.defaultPaddingStart);
        viewInflate.setPadding(((Integer) safeRegionWidth.first).intValue() + dimensionPixelSize, 0, dimensionPixelSize + ((Integer) safeRegionWidth.first).intValue(), 0);
        return viewInflate;
    }

    private void setTextSizeForOversea(Context context) {
        if (LanguageUtil.au(context) || LanguageUtil.j(context)) {
            this.f.setTextSize(1, 11.0f);
            this.g.setTextSize(1, 11.0f);
            this.h.setTextSize(1, 11.0f);
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section_Entry_Card_ThreeViews";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        if (map == null || map.size() == 0) {
            LogUtil.a("Section_Entry_Card_ThreeViews", "no need to bind");
            return;
        }
        LogUtil.a("Section_Entry_Card_ThreeViews", map);
        List listA = qqw.a((Map) map, "SECTION_ENTRY_BUTTON_BEAN_LIST", ftc.class, (List) null);
        if (njy.e(listA)) {
            LogUtil.a("Section_Entry_Card_ThreeViews", "beanList is empty");
            return;
        }
        int size = listA.size();
        if (size > 4) {
            LogUtil.a("Section_Entry_Card_ThreeViews", "buttonNum is ", Integer.valueOf(size));
            return;
        }
        if (this.f7785b) {
            this.f7785b = false;
            ObserverManagerUtil.e("SectionEntryCardVisible", Integer.valueOf(size));
        }
        if (size == 1) {
            this.f7784a.setVisibility(8);
            this.e.setVisibility(8);
            e((ftc) listA.get(0), this.d, this.f7786c, this.f);
            return;
        }
        if (size == 2) {
            this.e.setVisibility(8);
            ftc ftcVar = (ftc) listA.get(0);
            ftc ftcVar2 = (ftc) listA.get(1);
            e(ftcVar, this.d, this.f7786c, this.f);
            e(ftcVar2, this.f7784a, this.j, this.g);
            return;
        }
        if (size == 3) {
            ftc ftcVar3 = (ftc) listA.get(0);
            ftc ftcVar4 = (ftc) listA.get(1);
            ftc ftcVar5 = (ftc) listA.get(2);
            e(ftcVar3, this.d, this.f7786c, this.f);
            e(ftcVar4, this.f7784a, this.j, this.g);
            e(ftcVar5, this.e, this.i, this.h);
        }
    }

    private void e(ftc ftcVar, LinearLayout linearLayout, ImageView imageView, HealthTextView healthTextView) {
        qsp.c(linearLayout, getContext().getDrawable(ftcVar.d()));
        qsp.e(imageView, ftcVar.e());
        if (LanguageUtil.ba(getContext())) {
            imageView.setScaleX(-1.0f);
        }
        qsp.b(healthTextView, getContext().getString(ftcVar.b()));
        qsp.b(linearLayout, ftcVar.a());
    }
}
