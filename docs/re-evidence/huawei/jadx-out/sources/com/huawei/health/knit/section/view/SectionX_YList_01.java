package com.huawei.health.knit.section.view;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.huawei.android.airsharing.api.PlayInfo;
import com.huawei.health.section.adapter.SectionX_YList_01Adapter;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.dkf;
import defpackage.fsz;
import defpackage.fta;
import defpackage.fts;
import defpackage.qqf;
import defpackage.qqt;
import defpackage.qqw;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class SectionX_YList_01 extends BaseSection {
    private static final String TAG = "SectionX_YList_01";
    public Context context;
    private boolean mIsNoMoreDataVisible;
    private fta mLastData;
    public int mPageType;
    private SectionX_YList_01Adapter mSectionListAdapter;
    public String mSubHeaderTitle;
    private ConstraintLayout noDataBackground;
    private HealthButton noDataButton;
    private HealthTextView noDataContent;
    private HealthTextView noDataName;
    private LinearLayout noDataView;
    private RelativeLayout recycleViewRootLayout;
    private LinearLayout rootLayout;
    public HealthRecycleView sectionRecycleView;
    private HealthSubHeader subHeader;

    protected abstract SectionX_YList_01Adapter getSectionListAdapter(Context context, fta ftaVar);

    protected abstract View layoutInflater();

    protected abstract void setRecyclerViewLayout(fta ftaVar);

    public SectionX_YList_01(Context context) {
        this(context, null);
    }

    public SectionX_YList_01(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionX_YList_01(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.context = context;
    }

    private boolean isLoadDefaultView(HashMap<String, Object> map) {
        return map.containsKey("IS_LOAD_DEFAULT_VIEW") && (map.get("IS_LOAD_DEFAULT_VIEW") instanceof Boolean) && ((Boolean) map.get("IS_LOAD_DEFAULT_VIEW")).booleanValue();
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        View viewLayoutInflater = layoutInflater();
        this.rootLayout = (LinearLayout) viewLayoutInflater.findViewById(R.id.section_root_view);
        this.subHeader = (HealthSubHeader) viewLayoutInflater.findViewById(R.id.section_sub_header);
        this.recycleViewRootLayout = (RelativeLayout) viewLayoutInflater.findViewById(R.id.section1_1list_01_recycler_layout);
        this.sectionRecycleView = (HealthRecycleView) viewLayoutInflater.findViewById(R.id.section1_1list_01_recycler_view);
        this.noDataView = (LinearLayout) viewLayoutInflater.findViewById(R.id.section1_1list_01_no_data_view);
        this.noDataBackground = (ConstraintLayout) viewLayoutInflater.findViewById(R.id.no_data_root_view);
        this.noDataName = (HealthTextView) viewLayoutInflater.findViewById(R.id.no_data_name);
        this.noDataContent = (HealthTextView) viewLayoutInflater.findViewById(R.id.no_data_content);
        this.noDataButton = (HealthButton) viewLayoutInflater.findViewById(R.id.no_data_button);
        return viewLayoutInflater;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        fts.b(this.context, this.sectionRecycleView, this.mSectionListAdapter);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a(TAG, "bindViewParams");
        if (isLoadDefaultView(map)) {
            loadDefaultView();
            bindDefaultView(map);
        } else {
            loadView();
            bindView(map);
        }
    }

    private void bindView(HashMap<String, Object> map) {
        LogUtil.a(TAG, "bindView");
        this.mPageType = qqw.c(map, "PAGE_TYPE", 0);
        setSubHeaderTitle(qqw.b(map, "TITLE", null));
        setSubViewStatus(qqw.b(map, "SUBTITLE", null));
        setNoMoreData(qqw.b(map, "NO_MORE_DATA", null));
        fta ftaVar = new fta();
        setClickEvent(qqw.b(map, "CLICK_EVENT_LISTENER", null), ftaVar);
        ftaVar.i(qqw.a((Map) map, "NAME", String.class, (List) new ArrayList()));
        ftaVar.d(qqw.a((Map) map, "IMAGE", Object.class, (List) new ArrayList()));
        setImageSize(qqw.b(map, "IMAGE_SIZE", null), ftaVar);
        ftaVar.b(qqw.a((Map) map, "INTERVALS", String.class, (List) new ArrayList()));
        setDifficulty(qqw.b(map, "DIFFICULTY", null), ftaVar);
        setDurationData(qqw.b(map, PlayInfo.KEY_DURATION, null), ftaVar);
        ftaVar.h(qqw.a((Map) map, "ITEM_TAG", fsz.class, (List) new ArrayList()));
        if (this.mLastData == null || !TextUtils.equals(qqt.b(ftaVar), qqt.b(this.mLastData))) {
            setRecyclerViewLayout(ftaVar);
            setRecyclerViewData(ftaVar);
            this.mLastData = ftaVar;
        }
    }

    public void setSubHeaderClick(HealthSubHeader healthSubHeader, final Object obj) {
        if (this.mIsNoMoreDataVisible) {
            LogUtil.a(TAG, "No more data type without SubHeaderClick");
            healthSubHeader.setClickable(false);
        } else {
            healthSubHeader.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionX_YList_01.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ((OnClickSectionListener) obj).onClick("MORE_CLICK_EVENT");
                }
            });
        }
    }

    private void setSubTitle(Object obj) {
        if (this.subHeader != null) {
            if (fts.j(obj)) {
                LogUtil.a(TAG, "subtitle is set");
                this.subHeader.setMoreTextVisibility(0);
                this.subHeader.setMoreText((String) obj);
            } else {
                LogUtil.a(TAG, "subtitle is invisible");
                this.subHeader.setMoreTextVisibility(4);
            }
        }
    }

    private void bindDefaultView(HashMap<String, Object> map) {
        LogUtil.a(TAG, "bindDefaultView");
        this.mPageType = qqw.c(map, "PAGE_TYPE", 0);
        setSubHeaderTitle(qqw.b(map, "TITLE", null));
        setSubTitle(qqw.b(map, "SUBTITLE", null));
        setDefaultClickEvent(qqw.b(map, "CLICK_EVENT_LISTENER", null));
        setNoDataImage(qqw.b(map, "NO_DATA_IMAGE", null));
        setNoDataName(qqw.b(map, "NO_DATA_NAME", null));
        setNoDataContent(qqw.b(map, "NO_DATA_CONTENT", null));
        setNoDataButton(qqw.b(map, "NO_DATA_BUTTON", null));
    }

    protected void loadView() {
        LogUtil.a(TAG, "loadView");
        this.rootLayout.post(new Runnable() { // from class: com.huawei.health.knit.section.view.SectionX_YList_01.3
            @Override // java.lang.Runnable
            public void run() {
                SectionX_YList_01.this.rootLayout.setMinimumWidth(qrs.i(SectionX_YList_01.this.context));
            }
        });
        RelativeLayout relativeLayout = this.recycleViewRootLayout;
        if (relativeLayout == null) {
            LogUtil.a(TAG, "loadView, recycleViewRootLayout is null");
            return;
        }
        relativeLayout.setVisibility(0);
        this.noDataView.setVisibility(8);
        this.subHeader.setMoreTextVisibility(4);
        this.subHeader.setSubHeaderBackgroundColor(this.context.getResources().getColor(R.color.common_transparent));
        initRecycleView();
    }

    private void initRecycleView() {
        this.sectionRecycleView.setHasFixedSize(true);
        this.sectionRecycleView.setNestedScrollingEnabled(false);
        this.sectionRecycleView.b(false);
        this.sectionRecycleView.e(false);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.sectionRecycleView.setItemAnimator(defaultItemAnimator);
    }

    protected void loadDefaultView() {
        LogUtil.a(TAG, "loadDefaultView");
        this.rootLayout.post(new Runnable() { // from class: com.huawei.health.knit.section.view.SectionX_YList_01.5
            @Override // java.lang.Runnable
            public void run() {
                SectionX_YList_01.this.rootLayout.setMinimumWidth(qrs.i(SectionX_YList_01.this.context));
            }
        });
        this.recycleViewRootLayout.setVisibility(8);
        this.noDataView.setVisibility(0);
        this.subHeader.setMoreTextVisibility(4);
        this.subHeader.setSubHeaderBackgroundColor(this.context.getResources().getColor(R.color.common_transparent));
    }

    @Override // com.huawei.health.knit.section.view.BaseSection, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.section_sub_header) {
            onClick("MORE_CLICK_EVENT");
        } else if (id == R.id.no_data_button) {
            onClick("NO_DATA_BUTTON_CLICK_EVENT");
        } else {
            LogUtil.e("view id is invalid", new Object[0]);
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return TAG;
    }

    private void setRecyclerViewData(fta ftaVar) {
        SectionX_YList_01Adapter sectionX_YList_01Adapter = this.mSectionListAdapter;
        if (sectionX_YList_01Adapter == null) {
            SectionX_YList_01Adapter sectionListAdapter = getSectionListAdapter(this.context, ftaVar);
            this.mSectionListAdapter = sectionListAdapter;
            this.sectionRecycleView.setAdapter(sectionListAdapter);
            return;
        }
        sectionX_YList_01Adapter.setData(ftaVar);
    }

    private void setClickEvent(Object obj, fta ftaVar) {
        if (!fts.e(obj) || this.subHeader == null) {
            return;
        }
        LogUtil.a(TAG, "click event is set");
        setSubHeaderClick(this.subHeader, obj);
        ftaVar.c((OnClickSectionListener) obj);
    }

    private void setSubViewStatus(Object obj) {
        HealthSubHeader healthSubHeader;
        if (obj == null || (healthSubHeader = this.subHeader) == null) {
            return;
        }
        dkf.e(obj, healthSubHeader, "Section_Section1_1List_01", 8, "gone");
    }

    private void setSubHeaderTitle(Object obj) {
        if (!fts.j(obj) || this.subHeader == null) {
            return;
        }
        LogUtil.a(TAG, "title is set");
        String str = (String) obj;
        this.mSubHeaderTitle = str;
        this.subHeader.setHeadTitleText(str);
    }

    private void setNoMoreData(Object obj) {
        LogUtil.a(TAG, "subHeader viewVisible" + obj);
        if (this.subHeader == null || !(obj instanceof Boolean)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        this.mIsNoMoreDataVisible = zBooleanValue;
        int i = zBooleanValue ? 8 : 0;
        LogUtil.a(TAG, "subHeader no more data is set" + i);
        this.subHeader.setRightArrayVisibility(i);
    }

    private void setImageSize(Object obj, fta ftaVar) {
        if (fts.c(obj)) {
            LogUtil.a(TAG, "image size is set");
            ftaVar.e((List) obj);
        }
    }

    private void setDurationData(Object obj, fta ftaVar) {
        if (fts.g(obj)) {
            LogUtil.a(TAG, "duration list is set");
            ftaVar.c((List<String>) obj);
        }
    }

    private void setDifficulty(Object obj, fta ftaVar) {
        if (fts.g(obj)) {
            LogUtil.a(TAG, "difficulty list is set");
            ftaVar.a((List) obj);
        }
    }

    private void setNoDataName(Object obj) {
        if (!fts.j(obj) || this.noDataName == null) {
            return;
        }
        LogUtil.a(TAG, "no data name is set");
        this.noDataName.setText((String) obj);
    }

    private void setNoDataContent(Object obj) {
        if (!fts.j(obj) || this.noDataContent == null) {
            return;
        }
        LogUtil.a(TAG, "no data content is set");
        this.noDataContent.setText((String) obj);
    }

    private void setNoDataImage(Object obj) {
        LogUtil.a(TAG, "no data image is set");
        if (fts.j(obj)) {
            String str = (String) obj;
            if (str.length() > 0 && this.noDataBackground != null) {
                qqf.b(str, new CustomTarget<Drawable>() { // from class: com.huawei.health.knit.section.view.SectionX_YList_01.2
                    @Override // com.bumptech.glide.request.target.Target
                    public void onLoadCleared(Drawable drawable) {
                    }

                    @Override // com.bumptech.glide.request.target.Target
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void onResourceReady(Drawable drawable, Transition<? super Drawable> transition) {
                        SectionX_YList_01.this.noDataBackground.setBackground(drawable);
                    }

                    @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
                    public void onLoadFailed(Drawable drawable) {
                        LogUtil.j(SectionX_YList_01.TAG, "loadRoundRectangle onLoadFailed");
                    }
                });
            }
        }
        if (fts.a(obj)) {
            int iIntValue = ((Integer) obj).intValue();
            ConstraintLayout constraintLayout = this.noDataBackground;
            if (constraintLayout != null) {
                constraintLayout.setBackgroundResource(iIntValue);
            }
        }
    }

    private void setNoDataButton(Object obj) {
        if (!fts.j(obj) || this.noDataButton == null) {
            return;
        }
        LogUtil.a(TAG, "no data button is set");
        this.noDataButton.setText((String) obj);
        if (qrs.v()) {
            ViewGroup.LayoutParams layoutParams = this.noDataButton.getLayoutParams();
            layoutParams.height = -2;
            this.noDataButton.setLayoutParams(layoutParams);
        }
    }

    private void setDefaultClickEvent(final Object obj) {
        if (!fts.e(obj) || this.subHeader == null || this.noDataButton == null) {
            return;
        }
        LogUtil.a(TAG, "click event is set");
        setSubHeaderClick(this.subHeader, obj);
        this.noDataButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionX_YList_01.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((OnClickSectionListener) obj).onClick("NO_DATA_BUTTON_CLICK_EVENT");
            }
        });
    }
}
