package com.huawei.health.knit.section.view;

import android.content.Context;
import android.content.res.Configuration;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener;
import com.huawei.health.knit.section.adapter.HorizontalAdapter;
import com.huawei.health.marketing.utils.ColumnLayoutItemDecoration;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.fol;
import defpackage.ftl;
import defpackage.lmf;
import defpackage.qll;
import defpackage.qqf;
import defpackage.qqw;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes29.dex */
public class GoodThingsBaseSection extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f7598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f7600c;
    private String d;
    private BaseRecyclerAdapter e;
    private HorizontalAdapter f;
    private HealthRecycleView g;
    private Context h;
    private View i;
    private OnClickSectionListener j;
    private String k;
    private String l;
    private LinearLayout m;
    private HealthTextView n;
    private String o;
    private Button p;

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected boolean isSupportSafeRegion() {
        return false;
    }

    public GoodThingsBaseSection(Context context) {
        super(context);
        this.f7599b = false;
    }

    public GoodThingsBaseSection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7599b = false;
    }

    public GoodThingsBaseSection(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7599b = false;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section1_1list_02_layout, (ViewGroup) this, false);
        this.i = viewInflate;
        d(viewInflate);
        this.h = context;
        return this.i;
    }

    private void d(View view) {
        LogUtil.a("GoodThingsBaseSection", "intView");
        this.p = (Button) view.findViewById(R.id.not_interest_button);
        HealthRecycleView healthRecycleView = (HealthRecycleView) view.findViewById(R.id.section1_1list_02_recycler_view);
        this.g = healthRecycleView;
        healthRecycleView.setHasFixedSize(true);
        this.g.setNestedScrollingEnabled(false);
        this.g.b(false);
        this.g.e(false);
        this.f7598a = (HealthTextView) view.findViewById(R.id.section_bottom_text);
        this.n = (HealthTextView) view.findViewById(R.id.title);
        this.m = (LinearLayout) view.findViewById(R.id.lin_recycleview);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void bindParamsToView(HashMap<String, Object> map) {
        this.j = qqw.c(map, "CLICK_EVENT_LISTENER", (OnClickSectionListener) null);
        setSupportShare(qqw.a(map, "IS_SUPPORT_SHARE", false));
        d(map);
        c(map);
        e(map);
        b(map);
    }

    private void b(HashMap<String, Object> map) {
        LogUtil.a("GoodThingsBaseSection", "bindViewTreeObserver");
        this.o = qqw.d((Map) map, "RESOURCE_ID", "");
        this.f7600c = qqw.c(map, "POSITION_ID", 0);
        this.l = qqw.d((Map) map, "RESOURCE_NAME", "");
        this.d = qqw.d((Map) map, "algId", "");
        this.k = qqw.d((Map) map, "smartRecommend", "");
        ViewTreeVisibilityListener.c(this.i, new ViewTreeVisibilityListener(this.i, this));
    }

    private void c(HashMap<String, Object> map) {
        LogUtil.a("GoodThingsBaseSection", "bindBottomView");
        if (qqw.c(map, "RECYCLER_LAYOUT_MANAGER_ORITENTION", 1) == 0) {
            this.f7598a.setVisibility(8);
            b();
        } else {
            this.m.setBackground(getResources().getDrawable(R.drawable.good_things_background_radius));
            this.f7598a.setText(qqw.d((Map) map, "BOTTOM_TEXT", (String) null));
            this.f7598a.setOnClickListener(new View.OnClickListener() { // from class: fuc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34580b.e(view);
                }
            });
        }
    }

    public /* synthetic */ void e(View view) {
        OnClickSectionListener onClickSectionListener = this.j;
        if (onClickSectionListener != null) {
            onClickSectionListener.onClick("BOTTOM_BUTTON_CLICKED");
        }
    }

    private void b() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        this.m.setPadding(0, 0, 0, 0);
        this.m.setLayoutParams(layoutParams);
        this.g.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huawei.health.knit.section.view.GoodThingsBaseSection.1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                LogUtil.d("GoodThingsBaseSection", "bindBottomView newState: ", Integer.valueOf(i));
                if (GoodThingsBaseSection.this.g.getLayoutManager() instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) GoodThingsBaseSection.this.g.getLayoutManager();
                    int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                    int itemCount = linearLayoutManager.getItemCount();
                    LogUtil.d("GoodThingsBaseSection", "bindBottomView lastItem: ", Integer.valueOf(iFindLastCompletelyVisibleItemPosition), " ", Integer.valueOf(itemCount));
                    if (i != 0 || iFindLastCompletelyVisibleItemPosition != itemCount - 1 || GoodThingsBaseSection.this.j == null || GoodThingsBaseSection.this.f7599b) {
                        return;
                    }
                    LogUtil.d("GoodThingsBaseSection", "bindBottomView last: ");
                    GoodThingsBaseSection.this.j.onClick("BOTTOM_BUTTON_CLICKED");
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
            }
        });
    }

    private void d(HashMap<String, Object> map) {
        LogUtil.a("GoodThingsBaseSection", "bindSubHeader");
        this.n.setText(qqw.d((Map) map, "TITLE", (String) null));
        this.p.setOnClickListener(new View.OnClickListener() { // from class: fue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.b(view);
            }
        });
    }

    public /* synthetic */ void b(View view) {
        OnClickSectionListener onClickSectionListener = this.j;
        if (onClickSectionListener != null) {
            onClickSectionListener.onClick("SUBHEADER_ACTION_CLICKED");
        }
    }

    private void e(HashMap<String, Object> map) {
        int iC = qqw.c(map, "RECYCLER_LAYOUT_MANAGER_ORITENTION", 1);
        List<fol> listA = qqw.a((Map) map, "RECYCLER_LIST", fol.class, (List) new ArrayList());
        this.f7599b = qqw.a(map, "HORIZONTAL_DATA_HAS_NEXT", false);
        int iC2 = qqw.c(map, "HORIZONTAL_DATA_ITEM_SIZE", 0);
        if (iC == 0) {
            LogUtil.a("GoodThingsBaseSection", "bindRecyclerView: ", Boolean.valueOf(this.f7599b));
            if (this.f == null) {
                HorizontalAdapter horizontalAdapter = new HorizontalAdapter(this.h, listA);
                this.f = horizontalAdapter;
                horizontalAdapter.b((!this.f7599b || listA.size() < 4) ? listA.size() : Integer.MAX_VALUE);
                this.g.setLayoutManager(new HealthLinearLayoutManager(getContext(), 0, false));
                this.g.setAdapter(this.f);
                this.f.b(new HorizontalAdapter.OnItemClickListener() { // from class: fug
                    @Override // com.huawei.health.knit.section.adapter.HorizontalAdapter.OnItemClickListener
                    public final void onItemClick(View view, int i) {
                        this.f34581a.c(view, i);
                    }
                });
                return;
            }
            LogUtil.a("GoodThingsBaseSection", "bindRecyclerView again: ", Boolean.valueOf(this.f7599b));
            this.f.b((!this.f7599b || listA.size() < 4) ? listA.size() : Integer.MAX_VALUE);
            this.f.a(listA);
            this.f.notifyItemRangeInserted(iC2, listA.size());
            return;
        }
        BaseRecyclerAdapter baseRecyclerAdapter = this.e;
        if (baseRecyclerAdapter == null) {
            a(map);
            BaseRecyclerAdapter baseRecyclerAdapterA = a(qqw.c(map, "RECYCLER_LIST_ITEM_RESID", 0), listA, iC);
            this.e = baseRecyclerAdapterA;
            this.g.setAdapter(baseRecyclerAdapterA);
            return;
        }
        baseRecyclerAdapter.refreshDataChange(listA);
    }

    public /* synthetic */ void c(View view, int i) {
        OnClickSectionListener onClickSectionListener = this.j;
        if (onClickSectionListener != null) {
            onClickSectionListener.onClick(i);
        }
    }

    private void a(HashMap<String, Object> map) {
        this.g.setLayoutManager(new HealthLinearLayoutManager(getContext(), qqw.c(map, "RECYCLER_LAYOUT_MANAGER_ORITENTION", 1), false));
        this.g.addItemDecoration(new ColumnLayoutItemDecoration(getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle), 0, 1, new int[]{getResources().getDimensionPixelSize(R.dimen.cardMarginStart), 0, getResources().getDimensionPixelSize(R.dimen.cardMarginEnd), 0}));
    }

    private BaseRecyclerAdapter a(int i, List<fol> list, final int i2) {
        BaseRecyclerAdapter<fol> baseRecyclerAdapter = new BaseRecyclerAdapter<fol>(list, new int[]{i}) { // from class: com.huawei.health.knit.section.view.GoodThingsBaseSection.3
            @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void convert(RecyclerHolder recyclerHolder, int i3, fol folVar) {
                ViewGroup.LayoutParams layoutParams = recyclerHolder.itemView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -2;
                    layoutParams.width = -2;
                    ((HealthTextView) recyclerHolder.itemView.findViewById(R.id.provider)).setTextSize(1, 10.0f);
                }
                GoodThingsBaseSection.this.d(recyclerHolder);
                recyclerHolder.a(R.id.title, folVar.g());
                recyclerHolder.a(R.id.provider, folVar.i());
                recyclerHolder.a(R.id.couponInfo, GoodThingsBaseSection.this.a(folVar));
                recyclerHolder.a(R.id.desc, folVar.d());
                String strD = GoodThingsBaseSection.this.d(folVar);
                recyclerHolder.a(R.id.sales_num, strD);
                recyclerHolder.e(R.id.couponInfo, TextUtils.isEmpty(folVar.a()) ? 8 : 0);
                recyclerHolder.e(R.id.desc, TextUtils.isEmpty(folVar.d()) ? 8 : 0);
                recyclerHolder.e(R.id.sales_num, TextUtils.isEmpty(strD) ? 8 : 0);
                recyclerHolder.a(R.id.text1, ftl.d(folVar.h(), folVar.c(), GoodThingsBaseSection.this.getResources().getDimensionPixelSize(R.dimen.health_common_10dp)));
                String strJ = folVar.j();
                if (strJ != null) {
                    SpannableString spannableString = new SpannableString(strJ);
                    spannableString.setSpan(new StrikethroughSpan(), 0, strJ.length(), 17);
                    recyclerHolder.a(R.id.text2, spannableString);
                }
                GoodThingsBaseSection.this.c(recyclerHolder, strJ);
                recyclerHolder.d(R.id.image, folVar.e(), qqf.e);
                int i4 = (int) ((GoodThingsBaseSection.this.getContext().getResources().getDisplayMetrics().density * 8.0f) + 0.5f);
                if (i2 == 1) {
                    float f = i4;
                    qqf.d(folVar.e(), (HealthImageView) recyclerHolder.d(R.id.image), f, f, f, f);
                } else {
                    float f2 = i4;
                    qqf.d(folVar.e(), (HealthImageView) recyclerHolder.d(R.id.image), f2, f2, 0.0f, 0.0f);
                }
                if (recyclerHolder.d(R.id.divider) != null) {
                    recyclerHolder.d(R.id.divider).setVisibility(i3 != getItemCount() - 1 ? 0 : 8);
                }
            }
        };
        baseRecyclerAdapter.setOnItemClickListener(new BaseRecyclerAdapter.OnItemClickListener() { // from class: fuf
            @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter.OnItemClickListener
            public final void onItemClicked(RecyclerHolder recyclerHolder, int i3, Object obj) {
                this.d.d(recyclerHolder, i3, obj);
            }
        });
        return baseRecyclerAdapter;
    }

    public /* synthetic */ void d(RecyclerHolder recyclerHolder, int i, Object obj) {
        OnClickSectionListener onClickSectionListener = this.j;
        if (onClickSectionListener != null) {
            onClickSectionListener.onClick(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(RecyclerHolder recyclerHolder) {
        HealthTextView healthTextView = (HealthTextView) recyclerHolder.itemView.findViewById(R.id.title);
        if (qrs.d(1.45f)) {
            LogUtil.a("GoodThingsBaseSection", "largeFontLayout : ", Float.valueOf(qrs.i()));
            if (qrs.v()) {
                ((LinearLayout) recyclerHolder.itemView.findViewById(R.id.center_layout)).setVisibility(8);
                float fConvertDpToPixel = Utils.convertDpToPixel(qrs.i() * 2.0f * qrs.i());
                ((LinearLayout) recyclerHolder.itemView.findViewById(R.id.product_msg)).getLayoutParams().height = ((int) fConvertDpToPixel) + this.h.getResources().getDimensionPixelOffset(R.dimen.health_common_92dp);
            }
            healthTextView.setMaxLines(1);
            return;
        }
        healthTextView.setMaxLines(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(RecyclerHolder recyclerHolder, String str) {
        final HealthTextView healthTextView = (HealthTextView) recyclerHolder.d(R.id.text2);
        if (healthTextView == null) {
            return;
        }
        recyclerHolder.e(R.id.text2, TextUtils.isEmpty(str) ? 8 : 0);
        healthTextView.post(new Runnable() { // from class: com.huawei.health.knit.section.view.GoodThingsBaseSection.2
            @Override // java.lang.Runnable
            public void run() {
                healthTextView.requestLayout();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(fol folVar) {
        String strB = folVar.b();
        LogUtil.d("GoodThingsBaseSection", "salesNum: ", strB);
        if (TextUtils.isEmpty(strB)) {
            LogUtil.j("GoodThingsBaseSection", "handleSoldNum salesNum is empty");
            return "";
        }
        int length = strB.length();
        switch (length) {
            case 1:
                return Integer.parseInt(strB) == 0 ? "" : getResources().getString(R.string.IDS_sold_desc, Integer.valueOf(Integer.parseInt(strB)));
            case 2:
            case 3:
            case 4:
                char cCharAt = strB.charAt(0);
                return getResources().getString(R.string.IDS_sold_desc, Integer.valueOf((cCharAt - '0') * ((int) Math.pow(10.0d, length - 1)))) + Marker.ANY_NON_NULL_MARKER;
            case 5:
            case 6:
                return getResources().getString(R.string.IDS_sold_thousand_desc, Integer.valueOf((strB.charAt(0) - '0') * ((int) Math.pow(10.0d, length - 5))));
            default:
                return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SpannableString a(fol folVar) {
        String strA = folVar.a();
        LogUtil.d("GoodThingsBaseSection", "coupon message: ", strA);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        SpannableString spannableString = new SpannableString(strA + " ");
        int color = ContextCompat.getColor(getContext(), R.color.color_99FB6522);
        int color2 = ContextCompat.getColor(getContext(), R.color.emui_accent);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.health_common_4dp);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.health_common_2dp);
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.health_common_1dp);
        spannableString.setSpan(new qll.d().c(color).d(dimensionPixelSize).a(dimensionPixelOffset).e(getResources().getDimensionPixelSize(R.dimen.defaultCornerRadiusXS)).b(getResources().getDimensionPixelSize(R.dimen.health_common_4dp)).i(getResources().getDimensionPixelSize(R.dimen.textSizeCaption1)).a(dimensionPixelSize2).j(color2).c(), 0, strA.length(), 17);
        return spannableString;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "GoodThingsBaseSection";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection, com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener.ViewTreeListenee
    public void biEvent() {
        c(this.f7600c, this.o, this.l);
    }

    private void c(int i, String str, String str2) {
        HashMap map = new HashMap();
        map.put("event", 1);
        map.put("resourceId", str);
        map.put("resourcePositionId", Integer.valueOf(i));
        map.put("resourceName", str2);
        map.put("pullOrder", 1);
        map.put("algId", this.d);
        map.put("smartRecommend", this.k);
        lmf.d().c(BaseApplication.b(), AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
    }
}
