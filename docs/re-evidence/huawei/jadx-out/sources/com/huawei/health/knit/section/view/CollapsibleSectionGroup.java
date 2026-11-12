package com.huawei.health.knit.section.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.data.KnitDataProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.health.servicesui.R;
import com.huawei.hiar.ARImageMetadata;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import defpackage.ftt;
import defpackage.fua;
import defpackage.njy;
import defpackage.qqw;
import defpackage.qrs;
import defpackage.qsp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class CollapsibleSectionGroup extends SectionGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected LinearLayout f7586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f7587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected List<BaseSection> f7588c;
    protected HealthCardView d;
    protected boolean e;
    private Context f;
    private HealthTextView g;
    private View h;
    private LinearLayout i;
    private int j;
    private boolean k;
    private int o;

    protected void b() {
    }

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

    public CollapsibleSectionGroup(Context context) {
        this(context, null);
    }

    public CollapsibleSectionGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CollapsibleSectionGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = 0;
        this.j = 0;
        this.f = context;
    }

    @Override // com.huawei.health.knit.section.view.SectionGroup, com.huawei.health.knit.section.view.BaseSection
    public void initView(KnitFragment knitFragment, int i) {
        super.initView(knitFragment, i);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.collapsible_section_group_button_layout, (ViewGroup) getRootView(), false);
        this.h = viewInflate;
        this.i = (LinearLayout) viewInflate.findViewById(R.id.expand_root_layout);
        this.f7586a = (LinearLayout) this.h.findViewById(R.id.sleep_expand_btn_layout);
        this.f7587b = (ImageView) this.h.findViewById(R.id.sleep_service_expand);
        this.g = (HealthTextView) this.h.findViewById(R.id.sleep_expand_title);
        if (fua.f()) {
            getKnitFragment().setRecyclerViewDescendantFocusability(ARImageMetadata.HOT_PIXEL_MODE);
        }
    }

    @Override // com.huawei.health.knit.section.view.SectionGroup, com.huawei.health.knit.section.view.BaseSection
    public void onBind(SectionBean sectionBean) {
        super.onBind(sectionBean);
        ViewParent parent = this.h.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.h);
        }
        getRootView().addView(this.h);
        KnitDataProvider knitDataProviderC = sectionBean.c();
        if (knitDataProviderC != null) {
            knitDataProviderC.parseParams(getContextRef(), getViewMap(), sectionBean.d());
            bindParamsToView(getViewMap());
        }
        b();
    }

    @Override // com.huawei.health.knit.section.view.SectionGroup, com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        if (map == null) {
            return;
        }
        this.k = (map.containsKey("IS_DATA_TYPE_DAY") && (map.get("IS_DATA_TYPE_DAY") instanceof Boolean)) ? ((Boolean) map.get("IS_DATA_TYPE_DAY")).booleanValue() : false;
        this.j = a(map, "Dreamtalknumber");
        this.o = a(map, "Snorenumber");
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            key.hashCode();
            if (key.equals("IS_GROUP_ARRAY_VISIBILITY")) {
                if (value instanceof Integer) {
                    StringBuilder sb = new StringBuilder("set array visibility: ");
                    Integer num = (Integer) value;
                    sb.append(num.intValue());
                    LogUtil.a("CollapsibleSectionGroup", sb.toString());
                    this.h.setVisibility(num.intValue());
                }
            } else if (key.equals("IS_SECTION_GROUP_EXPAND") && (value instanceof Boolean)) {
                StringBuilder sb2 = new StringBuilder("IsGroupExpand: ");
                Boolean bool = (Boolean) value;
                sb2.append(bool.booleanValue());
                LogUtil.a("CollapsibleSectionGroup", sb2.toString());
                this.e = bool.booleanValue();
                c(map);
            }
        }
    }

    private int a(HashMap<String, Object> map, String str) {
        if (map.containsKey(str)) {
            return ((Integer) map.get(str)).intValue();
        }
        return 0;
    }

    @Override // com.huawei.health.knit.section.view.SectionGroup
    protected void bindParamsToView(int i, HashMap<String, Object> map) {
        List<BaseSection> sectionList = getSectionList();
        this.f7588c = sectionList;
        if (njy.e(sectionList, i)) {
            LogUtil.e("CollapsibleSectionGroup", "position is out of bounds");
        } else {
            this.f7588c.get(i).bindParamsToView(map);
        }
    }

    @Override // com.huawei.health.knit.section.view.SectionGroup
    protected void setSectionGroupCardColor(int i) {
        HealthCardView cardView = getCardView();
        this.d = cardView;
        if (cardView != null) {
            cardView.setBackgroundColor(getContext().getResources().getColor(i));
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "CollapsibleSectionGroup";
    }

    protected void c(final HashMap<String, Object> map) {
        this.i.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.CollapsibleSectionGroup.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("CollapsibleSectionGroup", "button is clicked, mIsExpand: ", Boolean.valueOf(CollapsibleSectionGroup.this.e));
                CollapsibleSectionGroup collapsibleSectionGroup = CollapsibleSectionGroup.this;
                collapsibleSectionGroup.e = !collapsibleSectionGroup.e;
                ObserverManagerUtil.e("group_array_clicked_label", Boolean.valueOf(CollapsibleSectionGroup.this.e));
                ObserverManagerUtil.e("SLEEP_MORE_ANALYSIS", AnalyticsValue.HEALTH_SLEEP_CORE_SLEEP_TIME_2030111.value());
                CollapsibleSectionGroup.this.b(map);
                if (CollapsibleSectionGroup.this.e) {
                    return;
                }
                CollapsibleSectionGroup.this.getKnitFragment().getHealthScrollView().fling(0);
                CollapsibleSectionGroup.this.getKnitFragment().getHealthScrollView().smoothScrollTo(0, 0);
            }
        });
        b(map);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public List<Bitmap> getShareBitmap() {
        ArrayList arrayList = new ArrayList();
        if (!isSupportShare()) {
            return arrayList;
        }
        e(arrayList);
        return arrayList;
    }

    private void e(List<Bitmap> list) {
        for (BaseSection baseSection : this.f7588c) {
            List<Bitmap> arrayList = new ArrayList<>();
            if (!this.e && (baseSection instanceof SectionScoring) && !(baseSection instanceof SectionScoringMgmt)) {
                SectionScoring sectionScoring = (SectionScoring) baseSection;
                sectionScoring.setSuggestRootLayoutVisibility(0);
                View view = this.h;
                if (view != null) {
                    view.setVisibility(8);
                }
                Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
                measure(View.MeasureSpec.makeMeasureSpec((qrs.q() - (BaseApplication.getContext().getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.defaultPaddingStart) + ((Integer) safeRegionWidth.first).intValue())) - (BaseApplication.getContext().getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.defaultPaddingEnd) + ((Integer) safeRegionWidth.second).intValue()), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(qrs.m(), Integer.MIN_VALUE));
                layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getContext().getResources().getDisplayMetrics().widthPixels, getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.drawColor(getContext().getColor(R.color.health_share_section_bg_color));
                canvas.save();
                draw(canvas);
                canvas.restore();
                if (bitmapCreateBitmap != null) {
                    arrayList.add(bitmapCreateBitmap);
                    this.h.setVisibility(0);
                    sectionScoring.setSuggestRootLayoutVisibility(8);
                    list.addAll(arrayList);
                }
            } else {
                arrayList = baseSection.getShareBitmap();
                if (!njy.e(arrayList)) {
                    list.addAll(arrayList);
                }
            }
        }
    }

    protected void b(HashMap<String, Object> map) {
        if (this.e) {
            this.f7587b.setImageDrawable(getContext().getResources().getDrawable(R.drawable.fold_arrow_up));
            this.f7586a.setBackgroundColor(this.f.getColor(R.color.transparent));
            qsp.b(this.g, qqw.d((Map) map, "ITEM_BUTTON_TEXT", ""));
        } else {
            this.f7587b.setImageDrawable(getContext().getResources().getDrawable(R.drawable.fold_arrow_down));
            this.f7586a.setBackgroundColor(this.f.getColor(R.color.transparent));
            qsp.b(this.g, qqw.d((Map) map, "BUTTON_TEXT", ""));
        }
        if (njy.e(this.f7588c)) {
            return;
        }
        e(map);
    }

    protected void e(HashMap<String, Object> map) {
        Iterator<BaseSection> it = this.f7588c.iterator();
        while (it.hasNext()) {
            setSectionVisibility(it.next());
        }
        HashMap map2 = new HashMap(16);
        for (SectionGroup.d dVar : this.mViewList) {
            if (dVar.d() == 8) {
                LogUtil.a("CollapsibleSectionGroup", "set view gone, view: " + dVar.e() + ", visibility: " + dVar.d());
                dVar.e().setVisibility(8);
            } else {
                c(map2, dVar);
            }
        }
        map2.put("Snorenumber", Integer.valueOf(this.o));
        map2.put("Dreamtalknumber", Integer.valueOf(this.j));
        if (this.e) {
            ObserverManagerUtil.e("SLEEP_MORE_ANALYSIS", AnalyticsValue.SLEEP_MONITORING_RESULTS_21300045.value(), map2);
        }
    }

    private void setSectionVisibility(BaseSection baseSection) {
        int i = !this.e ? 8 : 0;
        if (VersionControlUtil.isSupportSleepManagement() && this.k) {
            if (baseSection instanceof SectionExpandReport) {
                ((SectionExpandReport) baseSection).setTopItemVisibility(i);
                return;
            } else {
                if ((baseSection instanceof SectionWebview) || (baseSection instanceof SectionEnvNoiseLineChart) || (baseSection instanceof Section_SleepReport_Text_01) || (baseSection instanceof Section_SleepOrigin_Text)) {
                    baseSection.setVisibility(i);
                    return;
                }
                return;
            }
        }
        if (baseSection instanceof SectionExpandReport) {
            ((SectionExpandReport) baseSection).setTopItemVisibility(i);
        } else if (baseSection instanceof SectionScoring) {
            ((SectionScoring) baseSection).setSuggestRootLayoutVisibility(i);
        } else {
            baseSection.setVisibility(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    public void c(Map map, SectionGroup.d dVar) {
        byte b2;
        if (this.e) {
            map.put("click", "1");
            String simpleName = dVar.e().getClass().getSimpleName();
            simpleName.hashCode();
            int iHashCode = simpleName.hashCode();
            if (iHashCode != -1867610764) {
                if (iHashCode != 577569880) {
                    if (iHashCode == 946680393 && simpleName.equals("SectionRingChart")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (simpleName.equals("SectionEnvNoiseLineChart")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (simpleName.equals("SectionWebview")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
            if (b2 != 0) {
                if (b2 == 1) {
                    map.put("type", "3");
                    return;
                } else {
                    if (b2 != 2) {
                        return;
                    }
                    map.put("type", "0");
                    return;
                }
            }
            int iA = ftt.a() != 0 ? ftt.a() : 2;
            if (iA == 1) {
                map.put("type", "2");
            } else {
                if (iA != 2) {
                    return;
                }
                map.put("type", "1");
            }
        }
    }
}
