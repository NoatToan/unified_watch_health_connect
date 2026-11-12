package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.health.knit.data.KnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.njy;
import defpackage.qqw;
import defpackage.qsp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class CollapsibleSectionGroup_01 extends SectionGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f7590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f7591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthCardView f7592c;
    private LinearLayout d;
    private ImageView e;
    private List<BaseSection> f;
    private View g;
    private boolean h;

    @Override // com.huawei.health.knit.section.view.SectionGroup, com.huawei.health.knit.section.view.BaseSection
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.huawei.health.knit.section.view.SectionGroup
    public /* bridge */ /* synthetic */ HealthCardView getCardView() {
        return super.getCardView();
    }

    @Override // com.huawei.health.knit.section.view.SectionGroup, com.huawei.health.knit.section.view.BaseSection
    public /* bridge */ /* synthetic */ KnitFragment getKnitFragment() {
        return super.getKnitFragment();
    }

    @Override // com.huawei.health.knit.section.view.SectionGroup, android.view.View
    public /* bridge */ /* synthetic */ LinearLayout getRootView() {
        return super.getRootView();
    }

    @Override // com.huawei.health.knit.section.view.SectionGroup
    public /* bridge */ /* synthetic */ List getSectionList() {
        return super.getSectionList();
    }

    @Override // com.huawei.health.knit.section.view.SectionGroup, com.huawei.health.knit.section.view.BaseSection
    public /* bridge */ /* synthetic */ View onCreateView(Context context) {
        return super.onCreateView(context);
    }

    public CollapsibleSectionGroup_01(Context context) {
        super(context);
    }

    public CollapsibleSectionGroup_01(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CollapsibleSectionGroup_01(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7590a = context;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "CollapsibleSectionGroup_01";
    }

    @Override // com.huawei.health.knit.section.view.SectionGroup, com.huawei.health.knit.section.view.BaseSection
    public void initView(KnitFragment knitFragment, int i) {
        super.initView(knitFragment, i);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.collapsible_section_group_button_layout, (ViewGroup) getRootView(), false);
        this.g = viewInflate;
        this.f7591b = (HealthTextView) viewInflate.findViewById(R.id.sleep_expand_title);
        this.f7592c = getCardView();
        LinearLayout linearLayout = (LinearLayout) this.g.findViewById(R.id.sleep_expand_btn_layout);
        this.d = linearLayout;
        linearLayout.setBackgroundColor(getContext().getResources().getColor(R.color.transparent));
        this.e = (ImageView) this.d.findViewById(R.id.sleep_service_expand);
        this.h = false;
    }

    @Override // com.huawei.health.knit.section.view.SectionGroup, com.huawei.health.knit.section.view.BaseSection
    public void onBind(SectionBean sectionBean) {
        super.onBind(sectionBean);
        ViewParent parent = this.g.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.g);
        }
        getRootView().addView(this.g);
        KnitDataProvider knitDataProviderC = sectionBean.c();
        if (knitDataProviderC != null) {
            knitDataProviderC.parseParams(getContextRef(), getViewMap(), sectionBean.d());
            bindParamsToView(getViewMap());
        }
        b(getViewMap());
    }

    private void e() {
        for (BaseSection baseSection : this.f) {
            LogUtil.a("CollapsibleSectionGroup_01", "updateSection : ", baseSection.getClass().getSimpleName());
            String simpleName = baseSection.getClass().getSimpleName();
            simpleName.hashCode();
            if (simpleName.equals("SectionStatistic")) {
                if (this.h) {
                    SectionStatistic sectionStatistic = (SectionStatistic) baseSection;
                    sectionStatistic.setPieChartLayoutVisibility(0);
                    sectionStatistic.setPressureAdviceTvVisibility(0);
                } else {
                    SectionStatistic sectionStatistic2 = (SectionStatistic) baseSection;
                    sectionStatistic2.setPieChartLayoutVisibility(8);
                    sectionStatistic2.setPressureAdviceTvVisibility(8);
                }
            }
        }
    }

    private void b(final HashMap<String, Object> map) {
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.CollapsibleSectionGroup_01.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CollapsibleSectionGroup_01 collapsibleSectionGroup_01 = CollapsibleSectionGroup_01.this;
                collapsibleSectionGroup_01.h = !collapsibleSectionGroup_01.h;
                CollapsibleSectionGroup_01.this.a(map);
                if (CollapsibleSectionGroup_01.this.h) {
                    return;
                }
                CollapsibleSectionGroup_01.this.getKnitFragment().getHealthScrollView().fling(0);
                CollapsibleSectionGroup_01.this.getKnitFragment().getHealthScrollView().smoothScrollTo(0, 0);
            }
        });
        a(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HashMap<String, Object> map) {
        if (this.h) {
            this.e.setImageDrawable(getContext().getResources().getDrawable(R.drawable.fold_arrow_up));
            qsp.b(this.f7591b, qqw.d((Map) map, "ITEM_BUTTON_TEXT", ""));
        } else {
            this.e.setImageDrawable(getContext().getResources().getDrawable(R.drawable.fold_arrow_down));
            qsp.b(this.f7591b, qqw.d((Map) map, "BUTTON_TEXT", ""));
        }
        if (njy.e(this.f)) {
            return;
        }
        e();
        for (SectionGroup.d dVar : this.mViewList) {
            if (dVar.d() == 8) {
                LogUtil.a("CollapsibleSectionGroup_01", "set view gone, view: " + dVar.e() + ", visibility: " + dVar.d());
                dVar.e().setVisibility(8);
            }
        }
    }

    @Override // com.huawei.health.knit.section.view.SectionGroup, com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            key.hashCode();
            if (key.equals("IS_GROUP_ARRAY_VISIBILITY") && (value instanceof Integer)) {
                StringBuilder sb = new StringBuilder("set array visibility: ");
                Integer num = (Integer) value;
                sb.append(num.intValue());
                LogUtil.a("CollapsibleSectionGroup_01", sb.toString());
                this.d.setVisibility(num.intValue());
            }
        }
    }

    @Override // com.huawei.health.knit.section.view.SectionGroup
    protected void bindParamsToView(int i, HashMap<String, Object> map) {
        List<BaseSection> sectionList = getSectionList();
        this.f = sectionList;
        if (njy.e(sectionList, i)) {
            LogUtil.e("CollapsibleSectionGroup_01", "position is out of bounds");
        } else {
            this.f.get(i).bindParamsToView(map);
        }
    }

    @Override // com.huawei.health.knit.section.view.SectionGroup
    protected void setSectionGroupCardColor(int i) {
        HealthCardView cardView = getCardView();
        this.f7592c = cardView;
        if (cardView != null) {
            cardView.setBackgroundColor(getContext().getResources().getColor(i));
        }
    }
}
