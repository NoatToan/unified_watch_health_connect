package com.huawei.health.knit.section.view;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.ftc;
import defpackage.njy;
import defpackage.qqw;
import defpackage.qre;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionEntryCard extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f7779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7781c;
    private int d;
    private boolean e;
    private LinearLayout f;
    private LinearLayout g;
    private ViewTreeObserver.OnGlobalLayoutListener h;
    private LinearLayout i;
    private LinearLayout j;
    private ImageView k;
    private LinearLayout l;
    private LinearLayout m;
    private ImageView n;
    private ImageView o;
    private ImageView p;
    private HealthTextView q;
    private HealthTextView r;
    private HealthTextView s;
    private HealthTextView t;

    @Override // com.huawei.health.knit.section.view.BaseSection
    public boolean isSupportShare() {
        return false;
    }

    public SectionEntryCard(Context context) {
        this(context, null);
    }

    public SectionEntryCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionEntryCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = true;
        this.f7781c = true;
        this.f7779a = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.knit.section.view.SectionEntryCard.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                SectionEntryCard sectionEntryCard = SectionEntryCard.this;
                sectionEntryCard.a(sectionEntryCard.i, SectionEntryCard.this.g);
            }
        };
        this.h = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.knit.section.view.SectionEntryCard.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                SectionEntryCard sectionEntryCard = SectionEntryCard.this;
                sectionEntryCard.a(sectionEntryCard.i, SectionEntryCard.this.g);
            }
        };
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("Section_Entry_Card", "onCreateView");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_entry_card_layout, (ViewGroup) this, false);
        this.j = (LinearLayout) viewInflate.findViewById(R.id.section_button_view1);
        this.k = (ImageView) viewInflate.findViewById(R.id.section_icon1);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.section_title1);
        this.r = healthTextView;
        healthTextView.setSplittable(false);
        this.f = (LinearLayout) viewInflate.findViewById(R.id.section_button_view2);
        this.o = (ImageView) viewInflate.findViewById(R.id.section_icon2);
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.section_title2);
        this.s = healthTextView2;
        healthTextView2.setSplittable(false);
        this.m = (LinearLayout) viewInflate.findViewById(R.id.section_button_view3);
        this.n = (ImageView) viewInflate.findViewById(R.id.section_icon3);
        HealthTextView healthTextView3 = (HealthTextView) viewInflate.findViewById(R.id.section_title3);
        this.t = healthTextView3;
        healthTextView3.setSplittable(false);
        this.l = (LinearLayout) viewInflate.findViewById(R.id.section_button_view4);
        this.p = (ImageView) viewInflate.findViewById(R.id.section_icon4);
        HealthTextView healthTextView4 = (HealthTextView) viewInflate.findViewById(R.id.section_title4);
        this.q = healthTextView4;
        healthTextView4.setSplittable(false);
        setTextSizeForOversea(context);
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(HealthTextView healthTextView) {
        Layout layout = healthTextView.getLayout();
        return layout != null && layout.getLineCount() > 1;
    }

    private void setTextSizeForOversea(Context context) {
        if (LanguageUtil.au(context) || LanguageUtil.j(context)) {
            this.r.setTextSize(1, 11.0f);
            this.s.setTextSize(1, 11.0f);
            this.t.setTextSize(1, 11.0f);
            this.q.setTextSize(1, 11.0f);
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        if (map == null || map.size() == 0) {
            LogUtil.a("Section_Entry_Card", "no need to bind");
            return;
        }
        LogUtil.a("Section_Entry_Card", map);
        List listA = qqw.a((Map) map, "SECTION_ENTRY_BUTTON_BEAN_LIST", ftc.class, (List) null);
        if (njy.e(listA)) {
            LogUtil.a("Section_Entry_Card", "beanList is empty");
            return;
        }
        int size = listA.size();
        this.f7780b = size;
        if (size > 4) {
            throw new IllegalArgumentException("The item number of SectionEntryButtonBean List more than 4");
        }
        if (this.e) {
            this.e = false;
            ObserverManagerUtil.e("SectionEntryCardVisible", Integer.valueOf(size));
        }
        int i = this.f7780b;
        if (i == 1) {
            this.f.setVisibility(8);
            this.m.setVisibility(8);
            this.l.setVisibility(8);
            b((ftc) listA.get(0), this.j, this.k, this.r);
            return;
        }
        if (i == 2) {
            this.m.setVisibility(8);
            this.l.setVisibility(8);
            setSubTitle(map);
            ftc ftcVar = (ftc) listA.get(0);
            ftc ftcVar2 = (ftc) listA.get(1);
            b(ftcVar, this.j, this.k, this.r);
            b(ftcVar2, this.f, this.o, this.s);
            d(this.j, this.f);
            return;
        }
        if (i == 3) {
            this.f.setVisibility(8);
            ftc ftcVar3 = (ftc) listA.get(0);
            ftc ftcVar4 = (ftc) listA.get(1);
            ftc ftcVar5 = (ftc) listA.get(2);
            b(ftcVar3, this.j, this.k, this.r);
            b(ftcVar4, this.m, this.n, this.t);
            b(ftcVar5, this.l, this.p, this.q);
            d(this.m, this.l);
            return;
        }
        ftc ftcVar6 = (ftc) listA.get(0);
        ftc ftcVar7 = (ftc) listA.get(1);
        ftc ftcVar8 = (ftc) listA.get(2);
        ftc ftcVar9 = (ftc) listA.get(3);
        b(ftcVar6, this.j, this.k, this.r);
        b(ftcVar7, this.f, this.o, this.s);
        b(ftcVar8, this.m, this.n, this.t);
        b(ftcVar9, this.l, this.p, this.q);
    }

    private void setSubTitle(HashMap<String, Object> map) {
        if (!map.containsKey("RIGHT_ICON_TEXT")) {
            LogUtil.j("Section_Entry_Card", "not right_icon_text");
            return;
        }
        if (LanguageUtil.f(BaseApplication.getContext())) {
            qsp.c(findViewById(R.id.section_subtitle1), 0);
            qsp.b((TextView) findViewById(R.id.section_subtitle1), getContext().getString(qqw.c(map, "RIGHT_ICON_TEXT", 0)));
        } else {
            qsp.c(findViewById(R.id.section_subtitle2), 0);
            qsp.b((TextView) findViewById(R.id.section_subtitle2), getContext().getString(qqw.c(map, "RIGHT_ICON_TEXT", 0)));
        }
        final HealthTextView healthTextView = (HealthTextView) findViewById(R.id.section_subtitle1);
        healthTextView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.knit.section.view.SectionEntryCard.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                healthTextView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (SectionEntryCard.this.a(healthTextView)) {
                    SectionEntryCard.this.c();
                } else {
                    LogUtil.a("Section_Entry_Card", "text not truncated");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        ((LinearLayout) findViewById(R.id.section_button_view_top_layout)).setOrientation(1);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.j.getLayoutParams();
        layoutParams.weight = 0.0f;
        layoutParams.width = -1;
        this.j.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f.getLayoutParams();
        layoutParams2.setMarginStart((int) qre.a(R.dimen.cardMarginMiddle));
        layoutParams2.weight = 0.0f;
        layoutParams2.topMargin = (int) qre.a(R.dimen.health_common_0_8dp);
        layoutParams2.width = -1;
        this.f.setLayoutParams(layoutParams2);
    }

    private void d(LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.d = 2;
        this.i = linearLayout;
        this.g = linearLayout2;
        linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(this.f7779a);
        this.g.getViewTreeObserver().addOnGlobalLayoutListener(this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(LinearLayout linearLayout, LinearLayout linearLayout2) {
        int i = this.d - 1;
        this.d = i;
        if (i == 0 && (linearLayout.getLayoutParams() instanceof LinearLayout.LayoutParams) && (linearLayout2.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) linearLayout2.getLayoutParams();
            int height = linearLayout.getHeight();
            int height2 = linearLayout2.getHeight();
            if (height == 0 || height2 == 0) {
                return;
            }
            if (height > height2) {
                layoutParams2.height = height;
                linearLayout2.setLayoutParams(layoutParams2);
            } else {
                layoutParams.height = height2;
                linearLayout.setLayoutParams(layoutParams);
            }
            linearLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this.f7779a);
            linearLayout2.getViewTreeObserver().removeOnGlobalLayoutListener(this.h);
        }
    }

    private void b(ftc ftcVar, LinearLayout linearLayout, ImageView imageView, HealthTextView healthTextView) {
        qsp.c(linearLayout, getContext().getDrawable(ftcVar.d()));
        qsp.c(imageView, getContext().getDrawable(ftcVar.e()));
        if (LanguageUtil.ba(getContext())) {
            imageView.setScaleX(-1.0f);
        }
        qsp.b(healthTextView, getContext().getString(ftcVar.b()));
        qsp.b(linearLayout, ftcVar.a());
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section_Entry_Card";
    }
}
