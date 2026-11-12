package com.huawei.health.knit.section.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.health.knit.section.adapter.Section1_1Card_01_Outer_Adapter;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.dkf;
import defpackage.fpb;
import defpackage.fts;
import defpackage.qqw;
import defpackage.qsp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class Section1_1Card_01 extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Object> f7646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f7647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, Object> f7648c;
    private boolean d;
    private List<Object> e;
    private View f;
    private int g;
    private List<Object> h;
    private String i;
    private OnClickSectionListener j;
    private List<Object> k;
    private List<Map<Object, Object>> l;
    private HealthSubHeader m;
    private Section1_1Card_01_Outer_Adapter n;
    private HealthRecycleView o;

    public Section1_1Card_01(Context context) {
        this(context, null);
    }

    public Section1_1Card_01(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Section1_1Card_01(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = false;
        this.f7648c = new HashMap<>();
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        if (map == null || map.size() == 0) {
            LogUtil.a("Section_Section1_1Card_01", "no need to bind");
            return;
        }
        if (this.o == null) {
            LogUtil.a("Section_Section1_1Card_01", "hide section");
            qsp.c(this.f, 8);
            return;
        }
        this.d = !fts.d(map, this.f7648c);
        this.f7648c.putAll(map);
        this.g = qqw.c(map, "PAGE_TYPE", 0);
        setTittle(qqw.b(map, "TITLE", null));
        setSubTittleVisiBle(qqw.b(map, "SUBTITLE", null));
        this.k = qqw.a((Map) map, "SERIES_COURSE_TITLE", Object.class, (List) new ArrayList());
        this.h = qqw.a((Map) map, "SERIES_COURSE_SUBTITLE", Object.class, (List) new ArrayList());
        this.f7646a = qqw.a((Map) map, "BACKGROUND", Object.class, (List) new ArrayList());
        this.l = (List) qqw.b(map, "RECYCLERVIEW", new ArrayList());
        this.e = qqw.a((Map) map, "SHOWMORE", Object.class, (List) new ArrayList());
        setClickListenerEvent(qqw.b(map, "CLICK_EVENT_LISTENER", null));
        c();
        this.o.setOnScrollListener(new MarketingBiUtils.FitnessOnScrollListener(this.g, this.i, 9));
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("Section_Section1_1Card_01", "attachContentView");
        this.f7647b = context;
        a();
        HealthSubHeader healthSubHeader = (HealthSubHeader) this.f.findViewById(R.id.section_sub_header);
        this.m = healthSubHeader;
        healthSubHeader.setMoreTextVisibility(4);
        this.m.setSubHeaderBackgroundColor(context.getResources().getColor(R.color.common_transparent));
        HealthRecycleView healthRecycleView = this.o;
        if (healthRecycleView != null) {
            dkf.d(healthRecycleView);
        }
        return this.f;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LogUtil.a("Section_Section1_1Card_01", "onConfigurationChanged");
        a();
    }

    private void a() {
        if (this.f == null) {
            View viewInflate = LayoutInflater.from(this.f7647b).inflate(R.layout.section1_1card_layout, (ViewGroup) this, false);
            this.f = viewInflate;
            this.o = (HealthRecycleView) viewInflate.findViewById(R.id.fragment_series_course_recycler_view);
        }
        HealthRecycleView healthRecycleView = this.o;
        if (healthRecycleView == null) {
            LogUtil.j("Section_Section1_1Card_01", "recyclerView is null");
            return;
        }
        if (healthRecycleView.getItemDecorationCount() > 0 && this.o.getItemDecorationAt(0) != null) {
            this.o.removeItemDecorationAt(0);
        }
        this.o.setLayoutManager(new HealthLinearLayoutManager(this.f7647b, 0, false));
    }

    @Override // com.huawei.health.knit.section.view.BaseSection, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.section_sub_header) {
            onClick("SUBTITLE");
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section_Section1_1Card_01";
    }

    private void c() {
        if (this.n == null) {
            this.n = new Section1_1Card_01_Outer_Adapter(this.f7647b);
        }
        if (this.d) {
            this.n.d(new fpb(this.f7646a, this.k, this.h, this.l, this.e, this.j));
            this.o.setAdapter(this.n);
        }
    }

    private void setClickListenerEvent(Object obj) {
        if (this.m == null || !fts.e(obj)) {
            return;
        }
        this.j = (OnClickSectionListener) obj;
        this.m.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.Section1_1Card_01.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Section1_1Card_01.this.j.onClick("SUBTITILE_CLICK_EVENT");
            }
        });
    }

    private void setSubTittleVisiBle(Object obj) {
        HealthSubHeader healthSubHeader = this.m;
        if (healthSubHeader == null || obj == null) {
            return;
        }
        if (obj instanceof String) {
            healthSubHeader.setMoreTextVisibility(0);
            this.m.setMoreText((String) obj);
        } else {
            healthSubHeader.setMoreTextVisibility(4);
        }
    }

    private void setTittle(Object obj) {
        if (this.m == null || !fts.j(obj)) {
            return;
        }
        String str = (String) obj;
        this.i = str;
        this.m.setHeadTitleText(str);
    }
}
