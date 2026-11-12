package com.huawei.health.marketing.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.marketing.datatype.MultiTabHorizontalTemplate;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleGrid4Tab;
import com.huawei.health.marketing.datatype.SingleTab;
import com.huawei.health.marketing.datatype.templates.BaseTemplate;
import com.huawei.health.marketing.datatype.templates.CornerTemplate;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.fya;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class MultiTabHorizontalLayout extends BaseLifeCycleLinearLayout implements ResourceBriefInfoOwnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthRecycleView f8376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, List<SingleGrid4Tab>> f8378c;
    private final Context d;
    private c e;
    private String f;
    private ResourceBriefInfo g;
    private HealthImageView h;
    private int i;
    private String j;
    private List<SingleTab> k;
    private View l;
    private b m;
    private long n;
    private HealthRecycleView o;
    private MultiTabHorizontalTemplate p;

    public MultiTabHorizontalLayout(Context context) {
        this(context, null);
    }

    public MultiTabHorizontalLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MultiTabHorizontalLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MultiTabHorizontalLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f8378c = new HashMap();
        this.f8377b = 0;
        this.d = context;
    }

    public void e(int i, ResourceBriefInfo resourceBriefInfo, BaseTemplate baseTemplate) {
        LogUtil.a("MultiTabHorizontalLayout", "initData");
        if (resourceBriefInfo != null) {
            LogUtil.a("MultiTabHorizontalLayout", "resourceBriefInfo: " + resourceBriefInfo.toString());
        }
        this.i = i;
        this.g = resourceBriefInfo;
        if (resourceBriefInfo != null) {
            this.f = resourceBriefInfo.getResourceId();
            this.j = this.g.getResourceName();
        }
        this.n = System.currentTimeMillis();
        if (baseTemplate instanceof MultiTabHorizontalTemplate) {
            MultiTabHorizontalTemplate multiTabHorizontalTemplate = (MultiTabHorizontalTemplate) baseTemplate;
            this.p = multiTabHorizontalTemplate;
            this.k = multiTabHorizontalTemplate.getTabs();
            List<SingleGrid4Tab> gridContents = this.p.getGridContents();
            if (gridContents == null) {
                return;
            }
            for (SingleGrid4Tab singleGrid4Tab : gridContents) {
                if (singleGrid4Tab != null) {
                    String tabName = singleGrid4Tab.getTabName();
                    if (!this.f8378c.containsKey(tabName)) {
                        this.f8378c.put(tabName, new ArrayList());
                    }
                    this.f8378c.get(tabName).add(singleGrid4Tab);
                }
            }
            Iterator<String> it = this.f8378c.keySet().iterator();
            while (it.hasNext()) {
                List<SingleGrid4Tab> list = this.f8378c.get(it.next());
                if (list != null) {
                    Collections.sort(list, new Comparator<SingleGrid4Tab>() { // from class: com.huawei.health.marketing.views.MultiTabHorizontalLayout.4
                        @Override // java.util.Comparator
                        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                        public int compare(SingleGrid4Tab singleGrid4Tab2, SingleGrid4Tab singleGrid4Tab3) {
                            return singleGrid4Tab3.getPriority() - singleGrid4Tab2.getPriority();
                        }
                    });
                }
            }
        }
        if (this.f8378c.size() == 0) {
            return;
        }
        b();
    }

    private void b() {
        View viewInflate = LayoutInflater.from(this.d).inflate(R.layout.multi_tab_horizontal_layout, this);
        this.l = viewInflate;
        this.o = (HealthRecycleView) viewInflate.findViewById(R.id.tab_recycler_view);
        this.h = (HealthImageView) this.l.findViewById(R.id.tab_right_btn);
        this.f8376a = (HealthRecycleView) this.l.findViewById(R.id.grid_recycler_view);
        qsp.a(this.h, fya.c());
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.marketing.views.MultiTabHorizontalLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (njy.e(MultiTabHorizontalLayout.this.k, MultiTabHorizontalLayout.this.f8377b) || MultiTabHorizontalLayout.this.k.get(MultiTabHorizontalLayout.this.f8377b) == null) {
                    return;
                }
                MultiTabHorizontalLayout multiTabHorizontalLayout = MultiTabHorizontalLayout.this;
                multiTabHorizontalLayout.d(((SingleTab) multiTabHorizontalLayout.k.get(MultiTabHorizontalLayout.this.f8377b)).getTabLink());
            }
        });
        this.o.setLayoutManager(new HealthLinearLayoutManager(this.d, 0, false));
        this.f8376a.setLayoutManager(new HealthLinearLayoutManager(this.d, 0, false));
        this.m = new b();
        this.e = new c();
        this.o.setAdapter(this.m);
        this.f8376a.setAdapter(this.e);
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public boolean isOwnedByBriefInfo(ResourceBriefInfo resourceBriefInfo) {
        boolean z = (resourceBriefInfo == null || this.g == null || !resourceBriefInfo.getResourceId().equals(this.g.getResourceId())) ? false : true;
        LogUtil.a("MultiTabHorizontalLayout", "isOwnedByBriefInfo: " + z);
        return z;
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public int getResourceBriefPriority() {
        ResourceBriefInfo resourceBriefInfo = this.g;
        if (resourceBriefInfo != null) {
            return resourceBriefInfo.getPriority();
        }
        return 0;
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public int getResourcePositionId() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        ((MarketRouterApi) Services.b("FeatureMarketing", MarketRouterApi.class)).router(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, String str, String str2) {
        HashMap map = new HashMap();
        map.put("resourcePositionId", Integer.valueOf(this.i));
        map.put("resourceId", this.f);
        map.put("resourceName", this.j);
        map.put("event", Integer.valueOf(i));
        map.put("itemCardName", str);
        LogUtil.a("MultiTabHorizontalLayout", "biEvent, event: ", Integer.valueOf(i), " name: ", str);
        if (i == 2) {
            map.put("durationTime", Long.valueOf(System.currentTimeMillis() - this.n));
            this.n = System.currentTimeMillis();
        }
        if (this.g != null) {
            map.put("algId", "");
            map.put("smartRecommend", Boolean.valueOf(this.g.getSmartRecommend()));
        }
        if (!TextUtils.isEmpty(str2)) {
            map.put("itemId", str2);
        }
        map.put("pullOrder", 1);
        lmf.d().c(this.d, AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
    }

    class b extends RecyclerView.Adapter<e> {
        private b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new e(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.multi_tab_horizontal_tab_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(e eVar, final int i) {
            if (njy.e(MultiTabHorizontalLayout.this.k, i) || MultiTabHorizontalLayout.this.k.get(i) == null || eVar.e == null) {
                return;
            }
            qsp.c(eVar.f8387a, i == getItemCount() - 1 ? 8 : 0);
            if (i == 0) {
                ((RelativeLayout.LayoutParams) eVar.e.getLayoutParams()).leftMargin = 0;
            }
            boolean z = MultiTabHorizontalLayout.this.f8377b == i;
            eVar.e.setText(((SingleTab) MultiTabHorizontalLayout.this.k.get(i)).getTabName());
            eVar.e.setTextColor(ContextCompat.getColor(BaseApplication.b(), z ? R.color.textColorPrimary : R.color.textColorSecondary));
            eVar.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.marketing.views.MultiTabHorizontalLayout.b.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (MultiTabHorizontalLayout.this.f8377b == i) {
                        LogUtil.a("MultiTabHorizontalLayout", "same position, do nothing");
                        return;
                    }
                    MultiTabHorizontalLayout.this.f8377b = i;
                    if (MultiTabHorizontalLayout.this.m != null) {
                        MultiTabHorizontalLayout.this.m.notifyDataSetChanged();
                    }
                    if (MultiTabHorizontalLayout.this.e != null) {
                        MultiTabHorizontalLayout.this.e.notifyDataSetChanged();
                    }
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (MultiTabHorizontalLayout.this.k != null) {
                return MultiTabHorizontalLayout.this.k.size();
            }
            return 0;
        }
    }

    static class e extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f8387a;
        private final HealthTextView e;

        public e(View view) {
            super(view);
            this.e = (HealthTextView) view.findViewById(R.id.multi_tab_tab);
            this.f8387a = view.findViewById(R.id.multi_tab_line);
        }
    }

    class c extends RecyclerView.Adapter<a> {
        private c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a onCreateViewHolder(ViewGroup viewGroup, int i) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_marketing_multi_tab_slide, viewGroup, false);
            qsp.c(viewInflate.findViewById(R.id.item_square_landscape_icon), 8);
            qsp.c(viewInflate.findViewById(R.id.item_square_landscape_hot_amount), 8);
            return new a(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(a aVar, int i) {
            final SingleGrid4Tab singleGrid4Tab;
            if (njy.e(MultiTabHorizontalLayout.this.k, MultiTabHorizontalLayout.this.f8377b) || MultiTabHorizontalLayout.this.k.get(MultiTabHorizontalLayout.this.f8377b) == null) {
                return;
            }
            List list = (List) MultiTabHorizontalLayout.this.f8378c.get(((SingleTab) MultiTabHorizontalLayout.this.k.get(MultiTabHorizontalLayout.this.f8377b)).getTabName());
            if (njy.e(list, i) || (singleGrid4Tab = (SingleGrid4Tab) list.get(i)) == null) {
                return;
            }
            int iD = qrs.d(MultiTabHorizontalLayout.this.d, 84.0f);
            ViewGroup.LayoutParams layoutParams = aVar.f8380a.getLayoutParams();
            layoutParams.width = iD;
            layoutParams.height = iD;
            aVar.f8380a.setLayoutParams(layoutParams);
            qqf.e(aVar.f8380a, singleGrid4Tab.getPicture(), 0, 1, 0);
            fya.e(aVar.f8381b, singleGrid4Tab.getTheme(), singleGrid4Tab.isThemeVisibility());
            fya.b(aVar.f8382c, (CornerTemplate) singleGrid4Tab, true);
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) aVar.e.getLayoutParams();
            layoutParams2.setMarginStart(i == 0 ? qrs.d(MultiTabHorizontalLayout.this.d, 12.0f) : 0);
            layoutParams2.setMarginEnd(qrs.d(MultiTabHorizontalLayout.this.d, 12.0f));
            layoutParams2.width = iD;
            layoutParams2.height = -2;
            aVar.e.setLayoutParams(layoutParams2);
            aVar.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.marketing.views.MultiTabHorizontalLayout.c.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    MultiTabHorizontalLayout.this.d(singleGrid4Tab.getLinkValue());
                    MultiTabHorizontalLayout.this.b(2, singleGrid4Tab.getTheme(), singleGrid4Tab.getDynamicDataId());
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            SingleTab singleTab;
            if (njy.e(MultiTabHorizontalLayout.this.k, MultiTabHorizontalLayout.this.f8377b) || (singleTab = (SingleTab) MultiTabHorizontalLayout.this.k.get(MultiTabHorizontalLayout.this.f8377b)) == null || MultiTabHorizontalLayout.this.f8378c.get(singleTab.getTabName()) == null) {
                return 0;
            }
            return ((List) MultiTabHorizontalLayout.this.f8378c.get(singleTab.getTabName())).size();
        }
    }

    static class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HealthImageView f8380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HealthTextView f8381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HealthTextView f8382c;
        private final View e;

        public a(View view) {
            super(view);
            this.e = view.findViewById(R.id.item_square_landscape_slide_root_layout);
            this.f8381b = (HealthTextView) view.findViewById(R.id.item_square_landscape_slide_title);
            this.f8380a = (HealthImageView) view.findViewById(R.id.item_square_landscape_slide_image);
            this.f8382c = (HealthTextView) view.findViewById(R.id.item_square_landscape_corner);
        }
    }
}
