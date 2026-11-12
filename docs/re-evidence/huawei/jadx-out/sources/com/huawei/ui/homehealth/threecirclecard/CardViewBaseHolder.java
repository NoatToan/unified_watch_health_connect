package com.huawei.ui.homehealth.threecirclecard;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.refreshcard.CardViewHolder;
import defpackage.lrd;
import defpackage.qqp;
import defpackage.qqs;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrr;
import defpackage.qrs;
import defpackage.qsk;
import defpackage.tbf;
import defpackage.tdr;
import defpackage.tdy;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes17.dex */
public class CardViewBaseHolder extends CardViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected LinearLayout f26109a;
    protected HealthTextView aa;
    protected HealthTextView ab;
    protected LinearLayout ac;
    protected View ad;
    protected HealthTextView ae;
    protected LinearLayout af;
    protected LinearLayout ag;
    protected HealthTextView ah;
    protected ImageView ai;
    protected HealthTextView aj;
    protected HealthTextView ak;
    protected HealthTextView al;
    protected LinearLayout am;
    protected ImageView an;
    protected HealthTextView ao;
    protected LinearLayout ap;
    protected RelativeLayout aq;
    protected LinearLayout ar;
    protected ImageView as;
    private HealthColumnSystem at;
    protected LinearLayout au;
    private int av;
    private View aw;
    protected ImageView ax;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected RelativeLayout f26110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected LinearLayout f26111c;
    protected ImageView d;
    protected LinearLayout e;
    protected LinearLayout f;
    protected HealthTextView g;
    protected ImageView h;
    protected HealthTextView i;
    protected HealthTextView j;
    protected tdr k;
    protected LinearLayout l;
    protected HealthTextView m;
    protected HealthCardView n;
    protected LinearLayout o;
    protected HealthTextView p;
    protected HealthTextView q;
    protected ImageView r;
    protected LinearLayout s;
    protected LinearLayout t;
    protected LinearLayout u;
    protected ImageView v;
    protected LinearLayout w;
    protected HealthTextView x;
    protected HealthTextView y;
    protected FrameLayout z;

    protected void f() {
    }

    protected String b() {
        return "CardViewBaseHolder";
    }

    public CardViewBaseHolder(View view, Context context, boolean z) {
        super(view, context, z);
        this.av = 0;
        this.k = new tdr();
        HealthColumnSystem healthColumnSystem = new HealthColumnSystem(getContext(), 1);
        this.at = healthColumnSystem;
        this.av = healthColumnSystem.j();
        c(view);
        j();
        if (s()) {
            t();
        }
    }

    private void c(View view) {
        if (this.itemView instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.removeAllViews();
            viewGroup.addView(LayoutInflater.from(getContext()).inflate(qsk.c(R.layout.home_item_layout_three_circle), (ViewGroup) null));
        }
    }

    protected void j() {
        this.z = (FrameLayout) this.itemView.findViewById(R.id.home_item_three_circle_card_layout);
        this.aq = (RelativeLayout) this.itemView.findViewById(R.id.three_circle_card_layout);
        this.ac = (LinearLayout) this.itemView.findViewById(R.id.marketing_layout);
        this.l = (LinearLayout) this.itemView.findViewById(R.id.model_and_data);
        this.ar = (LinearLayout) this.itemView.findViewById(R.id.three_circle_layout_container);
        this.o = (LinearLayout) this.itemView.findViewById(R.id.data_layout);
        this.ab = (HealthTextView) this.itemView.findViewById(R.id.message_count_new);
        this.f26111c = (LinearLayout) this.itemView.findViewById(R.id.step_strength_activity_layout);
        f();
        m();
        n();
        k();
        l();
        q();
        p();
    }

    private void k() {
        this.ax = (ImageView) this.itemView.findViewById(R.id.three_circle_icon_background);
        this.au = (LinearLayout) this.itemView.findViewById(R.id.switch_button_area);
        this.as = (ImageView) this.itemView.findViewById(R.id.three_circle_icon);
        if (LanguageUtil.ba(getContext())) {
            this.ax.setBackground(qqz.e(getContext(), R.drawable.three_leaf_background));
        } else {
            this.ax.setBackgroundResource(R.drawable.three_leaf_background);
        }
        lrd.b(this.ax, qre.f(R.string.IDS_health_clover_title));
    }

    private void l() {
        this.f26110b = (RelativeLayout) this.itemView.findViewById(R.id.hw_health_home_dameon_beta_version_no_expire);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (CommonUtil.ap() && CommonUtil.d() <= jCurrentTimeMillis && jCurrentTimeMillis <= CommonUtil.b()) {
            this.f26110b.setVisibility(0);
        } else {
            this.f26110b.setVisibility(8);
        }
        if (LanguageUtil.ba(getContext())) {
            this.f26110b.setBackgroundResource(R.drawable.ic_beta_tip_logo);
        }
    }

    private void q() {
        if (tbf.b()) {
            LogUtil.j(b(), "already switch before");
            return;
        }
        LogUtil.a(b(), "initSwitchBubble");
        this.i = (HealthTextView) this.itemView.findViewById(R.id.switch_bubble_text);
        int i = R.string.IDS_health_life_bubble_common_text;
        this.i.setText(qre.f(i));
        lrd.d(this.i, qre.f(i), false);
        if (LanguageUtil.ba(getContext())) {
            this.i.setBackgroundResource(R.drawable.sleep_toast_bg);
        } else {
            this.i.setBackgroundResource(R.drawable.toast_bg_right);
        }
        this.i.setOnClickListener(new View.OnClickListener() { // from class: tbj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48946b.b(view);
            }
        });
    }

    public /* synthetic */ void b(View view) {
        LogUtil.a(b(), "bubble is clicked");
    }

    private void m() {
        LogUtil.a(b(), "initMiddleLayout");
        this.s = (LinearLayout) this.itemView.findViewById(R.id.item_step_layout);
        this.ag = (LinearLayout) this.itemView.findViewById(R.id.item_strength_layout);
        this.am = (LinearLayout) this.itemView.findViewById(R.id.item_activity_layout);
        this.u = (LinearLayout) this.itemView.findViewById(R.id.item_diet_layout);
        this.r = (ImageView) this.s.findViewById(R.id.title_point);
        this.q = (HealthTextView) this.s.findViewById(R.id.title_text);
        this.m = (HealthTextView) this.s.findViewById(R.id.value_text);
        this.p = (HealthTextView) this.s.findViewById(R.id.goal_text);
        this.t = (LinearLayout) this.s.findViewById(R.id.item_data_layout);
        this.ai = (ImageView) this.ag.findViewById(R.id.title_point);
        this.ae = (HealthTextView) this.ag.findViewById(R.id.title_text);
        this.ah = (HealthTextView) this.ag.findViewById(R.id.value_text);
        this.al = (HealthTextView) this.ag.findViewById(R.id.goal_text);
        this.af = (LinearLayout) this.ag.findViewById(R.id.item_data_layout);
        this.an = (ImageView) this.am.findViewById(R.id.title_point);
        this.ak = (HealthTextView) this.am.findViewById(R.id.title_text);
        this.aj = (HealthTextView) this.am.findViewById(R.id.value_text);
        this.ao = (HealthTextView) this.am.findViewById(R.id.goal_text);
        this.ap = (LinearLayout) this.am.findViewById(R.id.item_data_layout);
        this.ad = this.itemView.findViewById(R.id.item_diet_divider);
        this.v = (ImageView) this.u.findViewById(R.id.title_point);
        this.y = (HealthTextView) this.u.findViewById(R.id.title_text);
        this.x = (HealthTextView) this.u.findViewById(R.id.value_text);
        this.aa = (HealthTextView) this.u.findViewById(R.id.goal_text);
        this.w = (LinearLayout) this.u.findViewById(R.id.item_data_layout);
        Typeface typefaceC = qrr.c();
        this.m.setTypeface(typefaceC);
        this.ah.setTypeface(typefaceC);
        this.aj.setTypeface(typefaceC);
        this.x.setTypeface(typefaceC);
    }

    private void n() {
        LogUtil.a(b(), "initBottomLayout");
        this.n = (HealthCardView) this.itemView.findViewById(R.id.distance_heat_floor_layout_for_chinese);
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.bottom_step_layout);
        this.e = linearLayout;
        this.d = (ImageView) linearLayout.findViewById(R.id.bottom_step_icon);
        this.g = (HealthTextView) this.e.findViewById(R.id.bottom_step_text);
        this.j = (HealthTextView) this.e.findViewById(R.id.bottom_step_value);
        this.h = (ImageView) this.itemView.findViewById(R.id.bottom_step_tip_icon);
        this.f = (LinearLayout) this.itemView.findViewById(R.id.bottom_step_tip_layout);
        if (qqs.e(getContext())) {
            this.n.setCardBackgroundColor(qre.e(R.color.common_white_5alpha));
            this.k.e(R.color.common_white_5alpha);
        } else {
            this.n.setCardBackgroundColor(qre.e(R.color.common_black_5alpha));
            this.k.e(R.color.common_black_5alpha);
        }
        if (!LanguageUtil.an(BaseApplication.getContext())) {
            ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams).setMarginEnd(getContext().getResources().getDimensionPixelOffset(R.dimen.health_common_6dp));
            }
        }
        this.f26109a = (LinearLayout) this.itemView.findViewById(R.id.bottom_step_layout_2);
    }

    public boolean o() {
        LogUtil.a(b(), "updateLayout");
        this.at.b(getContext());
        if (this.av == this.at.j()) {
            return true;
        }
        this.av = this.at.j();
        x();
        if (s()) {
            return t();
        }
        return r();
    }

    private void x() {
        LinearLayout linearLayout = this.ac;
        if (linearLayout == null || this.aq == null || linearLayout.getVisibility() != 0) {
            LogUtil.j(b(), "updateMarketingLayout mMarketingLayout not show");
        } else {
            LogUtil.a(b(), "updateMarketingLayout");
            this.aq.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.ui.homehealth.threecirclecard.CardViewBaseHolder.4
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    LogUtil.a(CardViewBaseHolder.this.b(), "updateMarketingLayout onGlobalLayout");
                    CardViewBaseHolder cardViewBaseHolder = CardViewBaseHolder.this;
                    cardViewBaseHolder.d(cardViewBaseHolder.aw);
                    CardViewBaseHolder.this.aq.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
        }
    }

    private boolean t() {
        LogUtil.a(b(), "open to wide screen");
        LinearLayout linearLayout = this.l;
        if (linearLayout == null) {
            LogUtil.j(b(), "showWideScreen mCircleAndDataLayout is null");
            return false;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
            return false;
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(0, qqp.a(getContext(), 12.0f), 0, 0);
        this.l.setLayoutParams(layoutParams2);
        this.l.setOrientation(0);
        this.l.setGravity(16);
        ViewGroup.LayoutParams layoutParams3 = this.n.getLayoutParams();
        if (!(layoutParams3 instanceof LinearLayout.LayoutParams)) {
            return false;
        }
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.setMargins(0, qqp.a(getContext(), 16.0f), 0, 0);
        this.n.setLayoutParams(layoutParams4);
        ViewGroup.LayoutParams layoutParams5 = this.ar.getLayoutParams();
        if (!(layoutParams5 instanceof LinearLayout.LayoutParams)) {
            return false;
        }
        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
        layoutParams6.width = -2;
        layoutParams6.height = -2;
        layoutParams6.gravity = 16;
        layoutParams6.setMargins(qqp.a(getContext(), 32.0f), 0, qqp.a(getContext(), 24.0f), 0);
        this.ar.setLayoutParams(layoutParams6);
        ViewGroup.LayoutParams layoutParams7 = this.o.getLayoutParams();
        if (!(layoutParams7 instanceof LinearLayout.LayoutParams)) {
            return false;
        }
        LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
        layoutParams8.width = -1;
        layoutParams8.height = -2;
        layoutParams8.gravity = 16;
        layoutParams8.setMargins(0, 0, qqp.a(getContext(), 48.0f), 0);
        this.o.setLayoutParams(layoutParams8);
        this.o.setOrientation(0);
        this.o.setGravity(16);
        return true;
    }

    private boolean r() {
        LogUtil.a(b(), "close to single screen");
        ViewGroup.LayoutParams layoutParams = this.l.getLayoutParams();
        if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
            return false;
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(0, 0, 0, 0);
        this.l.setLayoutParams(layoutParams2);
        this.l.setOrientation(1);
        this.l.setGravity(1);
        ViewGroup.LayoutParams layoutParams3 = this.n.getLayoutParams();
        if (!(layoutParams3 instanceof LinearLayout.LayoutParams)) {
            return false;
        }
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.setMargins(0, qqp.a(getContext(), 8.0f), 0, 0);
        this.n.setLayoutParams(layoutParams4);
        ViewGroup.LayoutParams layoutParams5 = this.ar.getLayoutParams();
        if (!(layoutParams5 instanceof LinearLayout.LayoutParams)) {
            return false;
        }
        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
        layoutParams6.width = -1;
        layoutParams6.height = -2;
        layoutParams6.gravity = 1;
        layoutParams6.setMargins(0, 0, 0, qqp.a(getContext(), -5.0f));
        this.ar.setLayoutParams(layoutParams6);
        ViewGroup.LayoutParams layoutParams7 = this.o.getLayoutParams();
        if (!(layoutParams7 instanceof LinearLayout.LayoutParams)) {
            return false;
        }
        LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
        layoutParams8.width = -1;
        layoutParams8.height = -2;
        layoutParams8.gravity = 1;
        layoutParams8.setMargins(0, 0, 0, 0);
        this.o.setLayoutParams(layoutParams8);
        this.o.setOrientation(1);
        this.o.setGravity(1);
        return true;
    }

    private void p() {
        a(this.t, this.p, false);
        a(this.af, this.al, false);
        a(this.ap, this.ao, false);
        a(this.w, this.aa, false);
    }

    protected void a(LinearLayout linearLayout, HealthTextView healthTextView, boolean z) {
        if (healthTextView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            if (tdy.b() || qrs.u() || !LanguageUtil.f(getContext()) || z) {
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) healthTextView.getLayoutParams();
                layoutParams.setMargins(0, qqp.a(getContext(), 2.0f), 0, 0);
                layoutParams.setMarginStart(0);
                healthTextView.setLayoutParams(layoutParams);
                healthTextView.setGravity(GravityCompat.START);
                return;
            }
            linearLayout.setOrientation(0);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) healthTextView.getLayoutParams();
            layoutParams2.setMargins(qqp.a(getContext(), 2.0f), 0, 0, qqp.a(getContext(), 2.0f));
            healthTextView.setLayoutParams(layoutParams2);
            healthTextView.setGravity(80);
        }
    }

    protected boolean b(LinearLayout linearLayout) {
        HealthTextView healthTextView = (HealthTextView) linearLayout.findViewById(R.id.bottom_step_text);
        HealthTextView healthTextView2 = (HealthTextView) linearLayout.findViewById(R.id.bottom_step_value);
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.bottom_step_tip_icon);
        if (healthTextView2 == null || imageView == null) {
            LogUtil.j(b(), "checkBottomLayoutNeedLine bottomValue is null ,return");
            return false;
        }
        int width = linearLayout.getWidth();
        int measureWidth = (int) healthTextView.getMeasureWidth();
        int width2 = healthTextView2.getWidth();
        if (width <= 0 || measureWidth <= 0 || width2 <= 0) {
            LogUtil.j(b(), "updateBottomLayoutOrientation Width = 0 return");
            return false;
        }
        float dimension = imageView.getVisibility() == 0 ? getContext().getResources().getDimension(R.dimen.health_common_30dp) : 0.0f;
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R.dimen.health_common_52dp);
        int i = width - dimensionPixelOffset;
        LogUtil.a(b(), " titleWidth=" + measureWidth, " stepWidth=" + width2, " tipWidth=", Float.valueOf(dimension), " containerWidth=", Integer.valueOf(i));
        if (measureWidth + dimension + width2 >= i) {
            linearLayout.setOrientation(1);
            return true;
        }
        linearLayout.setOrientation(0);
        return false;
    }

    public void c(View.OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
        HealthTextView healthTextView = this.j;
        if (healthTextView == null) {
            ReleaseLogUtil.d(b(), "setBottomClickListener mBottomValue is null");
        } else {
            healthTextView.setOnClickListener(onClickListener);
        }
    }

    public void d(int i, View.OnClickListener onClickListener) {
        if (i == 0) {
            this.s.setOnClickListener(onClickListener);
            return;
        }
        if (i == 1) {
            this.ag.setOnClickListener(onClickListener);
        } else if (i == 2) {
            this.am.setOnClickListener(onClickListener);
        } else {
            if (i != 3) {
                return;
            }
            this.u.setOnClickListener(onClickListener);
        }
    }

    public void b(View view, boolean z) {
        LogUtil.a(b(), "showMarketingLayout");
        if (this.ac == null || this.aq == null) {
            ReleaseLogUtil.d(b(), "showMarketingLayout mMarketingLayout is null");
            return;
        }
        e(view);
        if (view == null) {
            this.ac.removeAllViews();
            this.ac.setVisibility(8);
            return;
        }
        this.ac.setVisibility(0);
        if (this.aq.getHeight() == 0 || z) {
            LogUtil.a(b(), "showMarketingLayout mCircleAndDataLayout height is 0");
            x();
        } else {
            d(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(View view) {
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            viewGroup.removeView(view);
            viewGroup.setVisibility(8);
        }
        int height = this.aq.getHeight();
        this.ac.removeAllViews();
        this.ac.addView(view, -1, height);
        this.ac.setVisibility(0);
        LogUtil.a(b(), "updateMarketingLayout height :", Integer.valueOf(height));
    }

    public void e(View view) {
        this.aw = view;
    }

    public View e() {
        return this.aw;
    }

    public ImageView g() {
        return this.as;
    }

    public void b(int i) {
        HealthTextView healthTextView = this.i;
        if (healthTextView == null) {
            return;
        }
        healthTextView.setText(qre.f(i));
    }

    public LinearLayout h() {
        return this.au;
    }

    public LinearLayout a() {
        return this.f;
    }

    public ImageView c() {
        return this.h;
    }

    public void d(int i) {
        this.h.setVisibility(i);
    }

    public RelativeLayout d() {
        return this.aq;
    }

    public void i() {
        HealthTextView healthTextView = this.i;
        if (healthTextView == null) {
            LogUtil.j(b(), "mBubbleText is null");
        } else {
            healthTextView.setVisibility(8);
        }
    }

    public void b(String str) {
        this.ab.setText(str);
    }

    public void c(int i) {
        this.ab.setVisibility(i);
    }

    private boolean s() {
        return this.av >= 8;
    }
}
