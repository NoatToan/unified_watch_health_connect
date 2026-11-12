package com.huawei.ui.main.stories.health.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.view.HealthBodyBarView;
import com.huawei.ui.main.R;
import defpackage.qtd;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes19.dex */
public class HealthBodyBarData extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f28179a;
    private HealthTextView aa;
    private HealthBodyBarView ab;
    private View ac;
    private HealthTextView ad;
    private HealthBodyBarView af;
    private View ag;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthBodyBarView f28180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f28181c;
    private HealthTextView d;
    private HealthBodyBarView e;
    private HealthTextView f;
    private View g;
    private HealthBodyBarView h;
    private HealthTextView i;
    private Context j;
    private View k;
    private HealthBodyBarView l;
    private HealthTextView m;
    private HealthBodyBarView n;
    private int o;
    private HealthBodyBarView p;
    private HealthTextView q;
    private HealthTextView r;
    private View s;
    private HealthTextView t;
    private HealthTextView u;
    private HealthBodyBarView v;
    private HealthTextView w;
    private HealthBodyBarView x;
    private HealthTextView y;
    private HealthTextView z;

    public HealthBodyBarData(Context context) {
        this(context, null);
        e(context);
    }

    public HealthBodyBarData(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet == null) {
            LogUtil.j("CommonUI_HealthBodyBarData", "HealthBodyDetailData AttributeSet is null");
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HealthBodyBarData);
        try {
            this.o = typedArrayObtainStyledAttributes.getInteger(R.styleable.HealthBodyBarData_bar_detail_or_report, 0);
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("CommonUI_HealthBodyBarData", "HealthBodyBarData Resources NotFoundException.");
        }
        typedArrayObtainStyledAttributes.recycle();
        e(context);
    }

    private void e(Context context) {
        View viewInflate;
        if (context == null) {
            LogUtil.j("CommonUI_HealthBodyBarData", "initBodyBarView Context is null");
            return;
        }
        this.j = context;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (layoutInflater == null) {
            LogUtil.j("CommonUI_HealthBodyBarData", "initBodyBarView LayoutInflater is null");
            return;
        }
        if (this.o == 0) {
            viewInflate = layoutInflater.inflate(R.layout.health_body_bar_view, this);
        } else {
            viewInflate = layoutInflater.inflate(R.layout.health_body_bar_view_report, this);
        }
        d(viewInflate);
    }

    private void d(View view) {
        this.g = view.findViewById(R.id.bmi_include_content_layout);
        this.k = view.findViewById(R.id.fat_include_content_layout);
        this.ag = view.findViewById(R.id.visceral_fat_include_content_layout);
        this.ac = view.findViewById(R.id.muscle_include_content_layout);
        this.s = view.findViewById(R.id.limb_include_content_layout);
        this.e = (HealthBodyBarView) this.g.findViewById(R.id.targetBarView);
        HealthBodyBarView healthBodyBarView = (HealthBodyBarView) this.k.findViewById(R.id.targetBarView);
        this.h = healthBodyBarView;
        healthBodyBarView.setFatData(true);
        this.ab = (HealthBodyBarView) this.ag.findViewById(R.id.targetBarView);
        this.v = (HealthBodyBarView) this.ac.findViewById(R.id.targetBarView);
        this.l = (HealthBodyBarView) this.s.findViewById(R.id.targetBarView);
        this.f28180b = (HealthBodyBarView) this.g.findViewById(R.id.targetBarViewGray);
        HealthBodyBarView healthBodyBarView2 = (HealthBodyBarView) this.k.findViewById(R.id.targetBarViewGray);
        this.n = healthBodyBarView2;
        healthBodyBarView2.setFatData(true);
        this.af = (HealthBodyBarView) this.ag.findViewById(R.id.targetBarViewGray);
        this.x = (HealthBodyBarView) this.ac.findViewById(R.id.targetBarViewGray);
        this.p = (HealthBodyBarView) this.s.findViewById(R.id.targetBarViewGray);
        this.f28179a = (HealthTextView) this.g.findViewById(R.id.indicate_name);
        this.i = (HealthTextView) this.k.findViewById(R.id.indicate_name);
        this.ad = (HealthTextView) this.ag.findViewById(R.id.indicate_name);
        this.w = (HealthTextView) this.ac.findViewById(R.id.indicate_name);
        this.r = (HealthTextView) this.s.findViewById(R.id.indicate_name);
        this.f28181c = (HealthTextView) this.g.findViewById(R.id.indicate_unit);
        this.m = (HealthTextView) this.k.findViewById(R.id.indicate_unit);
        this.aa = (HealthTextView) this.ag.findViewById(R.id.indicate_unit);
        this.y = (HealthTextView) this.ac.findViewById(R.id.indicate_unit);
        this.q = (HealthTextView) this.s.findViewById(R.id.indicate_unit);
        this.d = (HealthTextView) this.g.findViewById(R.id.indicate_content);
        this.f = (HealthTextView) this.k.findViewById(R.id.indicate_content);
        this.z = (HealthTextView) this.ag.findViewById(R.id.indicate_content);
        this.u = (HealthTextView) this.ac.findViewById(R.id.indicate_content);
        this.t = (HealthTextView) this.s.findViewById(R.id.indicate_content);
    }

    public void setBmiBar(qtd qtdVar) {
        if (qtdVar == null) {
            this.g.setVisibility(8);
            return;
        }
        this.e.setBarData(qtdVar, 0);
        this.f28180b.setBarData(qtdVar, 1);
        c(this.f28179a, this.f28181c, qtdVar.i(), qtdVar.g());
        this.d.setText(qtdVar.b());
        this.g.setVisibility(0);
    }

    public void setFatBar(qtd qtdVar) {
        if (qtdVar == null) {
            this.k.setVisibility(8);
            return;
        }
        this.h.setBarData(qtdVar, 0);
        this.n.setBarData(qtdVar, 1);
        if (LanguageUtil.c(this.j)) {
            c(this.i, this.m, qtdVar.i(), "");
        } else {
            c(this.i, this.m, qtdVar.i(), qtdVar.g());
        }
        this.f.setText(qtdVar.b());
        this.k.setVisibility(0);
    }

    public void setVisceralBar(qtd qtdVar) {
        if (qtdVar == null) {
            this.ag.setVisibility(8);
            return;
        }
        this.ab.setBarData(qtdVar, 0);
        this.af.setBarData(qtdVar, 1);
        c(this.ad, this.aa, qtdVar.i(), qtdVar.g());
        this.z.setText(qtdVar.b());
        this.ag.setVisibility(0);
    }

    public void setMuscleBar(qtd qtdVar) {
        if (qtdVar == null) {
            this.ac.setVisibility(8);
            return;
        }
        this.v.setBarData(qtdVar, 0);
        this.x.setBarData(qtdVar, 1);
        c(this.w, this.y, qtdVar.i(), qtdVar.g());
        this.u.setText(qtdVar.b());
        this.ac.setVisibility(0);
    }

    public void setLimbBar(qtd qtdVar) {
        if (qtdVar == null) {
            this.s.setVisibility(8);
            return;
        }
        this.l.setBarData(qtdVar, 0);
        this.p.setBarData(qtdVar, 1);
        c(this.r, this.q, qtdVar.i(), qtdVar.g());
        this.t.setText(qtdVar.b());
        this.s.setVisibility(0);
    }

    private void c(HealthTextView healthTextView, HealthTextView healthTextView2, String str, String str2) {
        if (LanguageUtil.o(BaseApplication.getContext())) {
            healthTextView.setText(d(str, str2));
            healthTextView2.setVisibility(8);
            return;
        }
        healthTextView.setSplittable(true);
        healthTextView.setText(str);
        if (TextUtils.isEmpty(str2)) {
            healthTextView2.setVisibility(8);
        } else {
            healthTextView2.setVisibility(0);
            healthTextView2.setText(str2);
        }
    }

    private SpannableString d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        int i = R.style.weight_indicate_name_text;
        int i2 = R.style.weight_indicate_content_text;
        if (this.o != 0) {
            i = R.style.weight_indicate_name_text_report;
            i2 = R.style.weight_indicate_content_text_report;
        }
        Context context = BaseApplication.getContext();
        SpannableString spannableString = new SpannableString(str + str2);
        spannableString.setSpan(new TextAppearanceSpan(context, i), 0, str.length(), 33);
        spannableString.setSpan(new TextAppearanceSpan(context, i2), str.length(), spannableString.length(), 33);
        return spannableString;
    }
}
