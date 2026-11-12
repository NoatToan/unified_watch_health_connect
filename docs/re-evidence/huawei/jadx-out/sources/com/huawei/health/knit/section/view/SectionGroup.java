package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.huawei.health.knit.data.KnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.cardview.HealthCardView;
import defpackage.ftb;
import defpackage.fts;
import defpackage.fvz;
import defpackage.njy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
abstract class SectionGroup extends BaseSection {
    private static final String TAG = "SectionGroup";
    private HealthCardView mCardView;
    private LinearLayout mCardViewLayout;
    private KnitFragment mKnitFragment;
    private LinearLayout mRootView;
    private List<BaseSection> mSectionList;
    protected List<d> mViewList;
    private int mViewType;

    protected abstract void bindParamsToView(int i, HashMap<String, Object> map);

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected boolean isSupportSafeRegion() {
        return false;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        return null;
    }

    protected abstract void setSectionGroupCardColor(int i);

    public SectionGroup(Context context) {
        super(context);
        this.mViewList = new ArrayList();
        this.mSectionList = new ArrayList();
    }

    public SectionGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mViewList = new ArrayList();
        this.mSectionList = new ArrayList();
    }

    public SectionGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mViewList = new ArrayList();
        this.mSectionList = new ArrayList();
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void initView(KnitFragment knitFragment, int i) {
        LogUtil.a(TAG, "initView");
        this.mViewType = i;
        this.mKnitFragment = knitFragment;
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.knit_section_group_layout, (ViewGroup) this, false);
        this.mRootView = (LinearLayout) viewInflate.findViewById(R.id.section_group_root_layout);
        this.mCardViewLayout = (LinearLayout) viewInflate.findViewById(R.id.section_group_card_layout);
        this.mCardView = (HealthCardView) viewInflate.findViewById(R.id.section_group_card_view);
        int dimensionPixelSize = BaseApplication.getContext().getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.defaultPaddingStart);
        int dimensionPixelSize2 = BaseApplication.getContext().getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.defaultPaddingEnd);
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        if (this.mCardView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mCardView.getLayoutParams();
            layoutParams.setMarginStart(dimensionPixelSize + ((Integer) safeRegionWidth.first).intValue());
            layoutParams.setMarginEnd(dimensionPixelSize2 + ((Integer) safeRegionWidth.second).intValue());
            this.mCardView.setLayoutParams(layoutParams);
        }
        addView(viewInflate);
        initSectionList(i);
    }

    private void initSectionList(int i) {
        List<Class<? extends BaseSection>> listA = fvz.a(i);
        if (njy.e(listA)) {
            LogUtil.a(TAG, "sectionClzList is empty");
            return;
        }
        Iterator<Class<? extends BaseSection>> it = listA.iterator();
        while (it.hasNext()) {
            BaseSection baseSectionA = fts.a(getContext(), it.next());
            if (baseSectionA != null) {
                this.mSectionList.add(baseSectionA);
            }
        }
        for (int i2 = 0; i2 < this.mSectionList.size(); i2++) {
            addSection(i2);
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void onBind(SectionBean sectionBean) {
        LogUtil.a(TAG, "onBind");
        if (sectionBean == null) {
            return;
        }
        sectionBean.d(this);
        if (njy.e(this.mSectionList)) {
            LogUtil.a(TAG, "sectionList is empty");
            return;
        }
        initRootView();
        KnitDataProvider knitDataProviderC = sectionBean.c();
        if (knitDataProviderC == null || njy.e(knitDataProviderC.getDataProviderList())) {
            return;
        }
        List dataProviderList = knitDataProviderC.getDataProviderList();
        if (dataProviderList.size() != getSectionList().size()) {
            LogUtil.a(TAG, "size not match");
            throw new IllegalStateException("section size not match data provider size");
        }
        initViewList();
        LogUtil.a(TAG, "section size: " + this.mSectionList.size());
        for (int i = 0; i < dataProviderList.size(); i++) {
            KnitDataProvider knitDataProvider = (KnitDataProvider) dataProviderList.get(i);
            BaseSection baseSection = this.mSectionList.get(i);
            if (!knitDataProvider.isActive(getContext())) {
                LogUtil.a(TAG, "dp is not active: " + i);
                baseSection.setSupportShare(false);
            } else {
                ftb.c cVarE = sectionBean.e(knitDataProvider);
                if (cVarE == null || cVarE.d() == null) {
                    LogUtil.a(TAG, "dp has no valid data: " + i);
                    baseSection.setSupportShare(false);
                } else {
                    LogUtil.a(TAG, "dp is valid: ", Integer.valueOf(i));
                    this.mViewList.get(i).c(0);
                    baseSection.setSupportShare(true);
                    knitDataProvider.parseParams(getContextRef(), cVarE.d(), cVarE.c());
                    overrideParamsByOnlineData(sectionBean, cVarE.d());
                    bindParamsToView(i, cVarE.d());
                }
            }
        }
    }

    private void initViewList() {
        Iterator<d> it = this.mViewList.iterator();
        while (it.hasNext()) {
            it.next().c(8);
        }
    }

    private void initRootView() {
        for (int i = 0; i < this.mRootView.getChildCount(); i++) {
            if (this.mRootView.getChildAt(i) != null) {
                this.mRootView.getChildAt(i).setVisibility(0);
            }
        }
    }

    private void addSection(int i) {
        if (this.mSectionList.size() <= i) {
            LogUtil.a(TAG, "index is invalid");
            return;
        }
        BaseSection baseSection = this.mSectionList.get(i);
        View viewOnCreateView = baseSection.onCreateView(getContext());
        if (viewOnCreateView == null) {
            LogUtil.a(TAG, "parameter view is null");
            return;
        }
        ViewParent parent = viewOnCreateView.getParent();
        if (parent != this) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(viewOnCreateView);
            }
            LogUtil.a(TAG, "add section: " + i);
            this.mViewList.add(new d(baseSection, 8));
            baseSection.addView(viewOnCreateView);
            this.mRootView.addView(baseSection, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void clear() {
        super.clear();
        if (njy.e(this.mSectionList)) {
            return;
        }
        for (BaseSection baseSection : this.mSectionList) {
            if (baseSection != null) {
                baseSection.clear();
            }
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public KnitFragment getKnitFragment() {
        return this.mKnitFragment;
    }

    public List<BaseSection> getSectionList() {
        return this.mSectionList;
    }

    @Override // android.view.View
    public LinearLayout getRootView() {
        return this.mRootView;
    }

    public HealthCardView getCardView() {
        return this.mCardView;
    }

    public class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f7800b;
        private View e;

        d(View view, int i) {
            this.e = view;
            this.f7800b = i;
        }

        public void c(int i) {
            this.f7800b = i;
        }

        public View e() {
            return this.e;
        }

        public int d() {
            return this.f7800b;
        }
    }
}
