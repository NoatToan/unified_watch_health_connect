package com.huawei.health.section.section;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.health.knit.section.view.BaseSection;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.fpw;
import defpackage.fts;
import defpackage.gvi;
import defpackage.njy;
import defpackage.qqw;
import defpackage.qsp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class Section1_1Search_03 extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f8756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f8757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f8758c;
    private LinearLayout d;
    private List<fpw> e;
    private LinearLayout f;
    private HealthTextView g;
    private HealthTextView h;
    private LinearLayout i;
    private HealthTextView j;
    private OnClickSectionListener k;
    private HealthTextView l;
    private HealthTextView[] m;
    private View n;
    private HealthTextView o;
    private final View.OnClickListener q;

    public Section1_1Search_03(Context context) {
        this(context, null);
    }

    public Section1_1Search_03(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Section1_1Search_03(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.q = new View.OnClickListener() { // from class: com.huawei.health.section.section.Section1_1Search_03.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (view == Section1_1Search_03.this.g || view == Section1_1Search_03.this.h || view == Section1_1Search_03.this.j) {
                    Section1_1Search_03.this.setSelectedTextView((HealthTextView) view);
                } else if ((view == Section1_1Search_03.this.o || view == Section1_1Search_03.this.l || view == Section1_1Search_03.this.f8758c) && Section1_1Search_03.this.k != null) {
                    Section1_1Search_03.this.k.onClick("COMMON_CLICK_EVENT");
                }
            }
        };
        this.f8757b = context;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section1_1search_03_layout, (ViewGroup) this, false);
        this.n = viewInflate;
        this.o = (HealthTextView) viewInflate.findViewById(R.id.section_sub_header);
        this.l = (HealthTextView) this.n.findViewById(R.id.section_sub_title);
        this.f8756a = (LinearLayout) this.n.findViewById(R.id.left_area);
        this.g = (HealthTextView) this.n.findViewById(R.id.left_text);
        this.i = (LinearLayout) this.n.findViewById(R.id.right_area);
        this.j = (HealthTextView) this.n.findViewById(R.id.right_text);
        this.f = (LinearLayout) this.n.findViewById(R.id.middle_area);
        this.h = (HealthTextView) this.n.findViewById(R.id.middle_text);
        this.f8758c = (HealthTextView) this.n.findViewById(R.id.brief_content);
        this.m = new HealthTextView[]{this.g, this.h, this.j};
        LinearLayout linearLayout = (LinearLayout) this.n.findViewById(R.id.gradient_layout);
        this.d = linearLayout;
        linearLayout.getBackground().setAlpha(179);
        return this.n;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section1_1Search_03";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("Section1_1Search_03", "bindParamsToView ");
        this.f8756a.setVisibility(8);
        this.f.setVisibility(8);
        this.i.setVisibility(8);
        this.l.setVisibility(8);
        qsp.b(this.o, qqw.d((Map) map, "TITLE", ""));
        setSubTitle(qqw.b(map, "SUBTITLE", null));
        this.e = qqw.a((Map) map, "SECTION_HEALTH_DICT_BEAN", fpw.class, (List) new ArrayList());
        this.k = qqw.c(map, "CLICK_EVENT_LISTENER", (OnClickSectionListener) null);
        c();
        a();
        setBiEvent(qqw.b(map, "ITEM_BI_EVENT_MAP", null));
    }

    private void setBiEvent(Object obj) {
        if (obj instanceof Map) {
            gvi.e(this.f8757b, (Map<String, Object>) obj);
        }
    }

    private void setSubTitle(Object obj) {
        if (fts.j(obj)) {
            qsp.a(this.l, (String) obj, true);
        } else {
            qsp.c((View) this.l, 8);
        }
    }

    private void c() {
        if (njy.e(this.e)) {
            return;
        }
        qsp.c((View) this.f8756a, 0);
        qsp.b(this.g, this.e.get(0).a());
        c(this.g, true);
        if (this.e.size() > 1) {
            qsp.c((View) this.f, 0);
            qsp.b(this.h, this.e.get(1).a());
            c(this.h, false);
        }
        if (this.e.size() > 2) {
            qsp.c((View) this.i, 0);
            qsp.b(this.j, this.e.get(2).a());
            c(this.j, false);
        }
        qsp.b(this.f8758c, this.e.get(0).b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectedTextView(HealthTextView healthTextView) {
        if (this.m == null) {
            return;
        }
        int i = 0;
        while (true) {
            HealthTextView[] healthTextViewArr = this.m;
            if (i >= healthTextViewArr.length) {
                return;
            }
            HealthTextView healthTextView2 = healthTextViewArr[i];
            boolean z = healthTextView2 == healthTextView;
            c(healthTextView2, z);
            if (z && njy.c(this.e, i)) {
                this.f8758c.setText(this.e.get(i).b());
            }
            i++;
        }
    }

    private void c(HealthTextView healthTextView, boolean z) {
        if (healthTextView == null) {
            return;
        }
        healthTextView.setTextColor(ContextCompat.getColor(this.f8757b, z ? R.color.textColorPrimary : R.color.textColorTertiary));
        healthTextView.setTypeface(Typeface.create(getResources().getString(z ? R.string.textFontFamilyMedium : R.string.textFontFamilyRegular), 0));
    }

    private void a() {
        qsp.b(this.g, this.q);
        qsp.b(this.h, this.q);
        qsp.b(this.j, this.q);
        qsp.b(this.o, this.q);
        qsp.b(this.l, this.q);
        qsp.b(this.f8758c, this.q);
    }
}
