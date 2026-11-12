package com.huawei.health.knit.section.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.threecircle.manager.WheelChairStateManager;
import com.huawei.ui.commonui.bubblelayout.HealthBubbleLayout;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.columnlayout.HealthColumnLinearLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.view.threeCircle.ThreeCircleView;
import defpackage.fsv;
import defpackage.ftz;
import defpackage.qho;
import defpackage.qli;
import defpackage.qqp;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrr;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.qth;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class SectionActiveRecordThreeCircle extends BaseSection implements WheelChairStateManager.SwitchStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7723a;
    private PopupWindow aa;
    private View ab;
    private View ac;
    private ImageView ad;
    private HealthTextView ae;
    private HealthTextView af;
    private ImageView ag;
    private HealthTextView ah;
    private HealthTextView ai;
    private HealthColumnLinearLayout aj;
    private LinearLayout ak;
    private HealthTextView al;
    private ThreeCircleView am;
    private HealthCardView an;
    private HealthTextView ap;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f7724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthBubbleLayout f7725c;
    private HealthTextView d;
    HealthTextView e;
    private RelativeLayout f;
    private HealthTextView g;
    private HealthCardView h;
    private HealthTextView i;
    private LinearLayout j;
    private HealthTextView k;
    private RelativeLayout l;
    private HealthTextView m;
    private LinearLayout n;
    private Context o;
    private int p;
    private HealthTextView q;
    private LinearLayout r;
    private int s;
    private HealthTextView t;
    private HealthTextView u;
    private HealthTextView v;
    private View w;
    private boolean x;
    private HealthImageView y;
    private ImageView z;

    public SectionActiveRecordThreeCircle(Context context) {
        super(context);
    }

    public SectionActiveRecordThreeCircle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SectionActiveRecordThreeCircle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        if (this.ac == null) {
            this.o = context;
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_active_record_three_circle, (ViewGroup) this, false);
            this.ac = viewInflate;
            ThreeCircleView threeCircleView = (ThreeCircleView) viewInflate.findViewById(R.id.three_circle_layout);
            this.am = threeCircleView;
            threeCircleView.setIsAnimator(true);
            b();
            a();
            HealthCardView healthCardView = (HealthCardView) this.ac.findViewById(R.id.distance_heat_floor_layout);
            this.h = healthCardView;
            this.n = (LinearLayout) healthCardView.findViewById(R.id.hw_health_steps_card_distance);
            ImageView imageView = (ImageView) this.h.findViewById(R.id.sport_distance_icon);
            this.ag = imageView;
            imageView.setVisibility(8);
            this.m = (HealthTextView) this.ac.findViewById(R.id.distance);
            this.f7724b = (LinearLayout) this.h.findViewById(R.id.hw_health_steps_card_calories);
            ImageView imageView2 = (ImageView) this.h.findViewById(R.id.sport_calorie_icon);
            this.ad = imageView2;
            imageView2.setVisibility(8);
            this.g = (HealthTextView) this.ac.findViewById(R.id.calories);
            this.d = (HealthTextView) this.ac.findViewById(R.id.unit_calories);
            this.j = (LinearLayout) this.h.findViewById(R.id.floor_layout);
            ImageView imageView3 = (ImageView) this.h.findViewById(R.id.sport_climbed_icon);
            this.z = imageView3;
            imageView3.setVisibility(8);
            HealthTextView healthTextView = (HealthTextView) this.h.findViewById(R.id.climb_title);
            this.i = healthTextView;
            healthTextView.setText(context.getString(R.string.IDS_start_leisure_sports_type_climbing_stairs));
            this.ah = (HealthTextView) this.h.findViewById(R.id.tv_calorie_title);
            this.al = (HealthTextView) this.h.findViewById(R.id.tv_distance_title);
            this.t = (HealthTextView) this.ac.findViewById(R.id.floor);
            this.q = (HealthTextView) this.ac.findViewById(R.id.unit_meter);
            this.k = (HealthTextView) this.ac.findViewById(R.id.unit_distance);
            this.l = (RelativeLayout) this.h.findViewById(R.id.distance_root_layout);
            this.f = (RelativeLayout) this.h.findViewById(R.id.cal_root_layout);
            this.r = (LinearLayout) this.h.findViewById(R.id.hw_health_steps_card_floors);
            View viewFindViewById = this.h.findViewById(R.id.floors_split_line);
            this.w = viewFindViewById;
            viewFindViewById.setVisibility(8);
            this.r.setVisibility(8);
            i();
            a(this.o);
            this.aj = (HealthColumnLinearLayout) this.ac.findViewById(R.id.three_circle_root);
            c();
            e();
        }
        return this.ac;
    }

    private void e() {
        this.an = (HealthCardView) this.ac.findViewById(R.id.wheel_chair_bar_layout);
        h();
        this.ap = (HealthTextView) this.an.findViewById(R.id.pushes_val);
        WheelChairStateManager.a().b((WheelChairStateManager.SwitchStateListener) this);
        qsp.c((ImageView) this.ac.findViewById(R.id.sport_wheel_icon), qqz.c(getContext(), R.drawable.wheel_chair_push));
    }

    private void h() {
        if (this.h == null || this.an == null) {
            return;
        }
        if (WheelChairStateManager.a().d()) {
            this.h.setVisibility(8);
            this.an.setVisibility(0);
        } else {
            this.h.setVisibility(0);
            this.an.setVisibility(8);
        }
        HealthTextView healthTextView = this.e;
        if (healthTextView != null) {
            healthTextView.setText(qho.e(R.string.IDS_three_circle_card_activity_hours));
        }
        if (this.am != null) {
            if (WheelChairStateManager.a().d()) {
                this.am.a("secondCircle", R.drawable.wheel_excise_icon);
                this.am.a("thirdCircle", R.drawable.wheel_activity_icon);
            } else {
                this.am.a("secondCircle", R.drawable.ic_time_xxxhdpi);
                this.am.a("thirdCircle", R.drawable.ic_excise_xxxhdpi);
            }
        }
    }

    private void b(fsv fsvVar) {
        LogUtil.a("SectionActiveRecordThreeCircle", "pushesValView :", Integer.valueOf(fsvVar.g()));
        String strE = UnitUtil.e(fsvVar.g(), 1, 0);
        this.ap.setText(e(qre.e(R.plurals.IDS_wheel_chair_value_unit, fsvVar.g(), strE), strE));
        this.an.setOnClickListener(fsvVar.f());
    }

    protected SpannableString e(String str, String str2) {
        SpannableString spannableString = new SpannableString(str);
        int iIndexOf = spannableString.toString().indexOf(str2);
        if (iIndexOf != -1) {
            spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), R.color.textColorPrimary)), iIndexOf, str2.length() + iIndexOf, 33);
            spannableString.setSpan(new AbsoluteSizeSpan(getContext().getResources().getDimensionPixelSize(R.dimen.textSizeBody3)), iIndexOf, str2.length() + iIndexOf, 33);
            spannableString.setSpan(new qli(qrr.e()), iIndexOf, str2.length() + iIndexOf, 17);
        }
        return spannableString;
    }

    private void c() {
        View viewInflate = View.inflate(this.o, R.layout.pop_threecircle_achieve, null);
        this.ab = viewInflate;
        this.v = (HealthTextView) viewInflate.findViewById(R.id.pop_title);
        this.u = (HealthTextView) this.ab.findViewById(R.id.pop_content);
        this.y = (HealthImageView) this.ab.findViewById(R.id.pop_close_tips);
        this.f7725c = (HealthBubbleLayout) this.ab.findViewById(R.id.route_draw_switch_bubble);
        this.y.setOnClickListener(new View.OnClickListener() { // from class: fvj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.b(view);
            }
        });
    }

    public /* synthetic */ void b(View view) {
        PopupWindow popupWindow = this.aa;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public void c(fsv fsvVar) {
        LinkedHashMap<String, qth> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < 3; i++) {
            fsv.b bVarE = fsvVar.e(i);
            qth qthVarC = new qth.b().d(bVarE.h).e(bVarE.e).d(bVarE.f34514c).c();
            if (i == 0) {
                linkedHashMap.put("firstCircle", qthVarC);
            } else if (i == 1) {
                linkedHashMap.put("secondCircle", qthVarC);
            } else {
                linkedHashMap.put("thirdCircle", qthVarC);
            }
        }
        this.am.e(linkedHashMap);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionActiveRecordThreeCircle";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        if (map == null || map.size() == 0) {
            LogUtil.a("SectionActiveRecordThreeCircle", "no need to bind");
            return;
        }
        Object obj = map.get("SECTION_HEALTH_DICT_BEAN");
        if (obj instanceof fsv) {
            fsv fsvVar = (fsv) obj;
            this.x = fsvVar.j();
            c(fsvVar);
            setThreeCircleData(fsvVar);
            setPopWindowData(fsvVar);
            b(fsvVar);
        }
    }

    private void setPopWindowData(fsv fsvVar) {
        fsv.c cVarI = fsvVar.i();
        if (cVarI == null) {
            return;
        }
        if (!cVarI.e) {
            ReleaseLogUtil.d("SectionActiveRecordThreeCircle", "setPopWindowData isShowPop false");
            return;
        }
        String str = cVarI.f34516c;
        String str2 = cVarI.d;
        if (TextUtils.isEmpty(str2)) {
            this.u.setVisibility(8);
        } else {
            this.u.setVisibility(0);
            this.u.setText(str2);
        }
        this.v.setText(str);
        d(cVarI.f34515a);
    }

    private void d(final String str) {
        ThreeCircleView threeCircleView = this.am;
        if (threeCircleView != null) {
            threeCircleView.post(new Runnable() { // from class: fvk
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.c(str);
                }
            });
        }
    }

    public /* synthetic */ void c(String str) {
        if (this.aa != null || this.ab == null) {
            ReleaseLogUtil.d("SectionActiveRecordThreeCircle", "mPopupWindow is created or mPopupWindowContentView is null");
            return;
        }
        Context context = this.o;
        if (!(context instanceof Activity)) {
            ReleaseLogUtil.e("SectionActiveRecordThreeCircle", "mContext null");
            return;
        }
        if (((Activity) context).isDestroyed() || ((Activity) this.o).isFinishing()) {
            ReleaseLogUtil.e("SectionActiveRecordThreeCircle", "mContext isFinishing");
            return;
        }
        int width = this.ak.getWidth() - this.am.getWidth();
        this.f7725c.setArrowPosition(1);
        if (LanguageUtil.ba(this.o)) {
            this.f7725c.setArrowPosition(2);
        }
        int width2 = this.am.getWidth() / 2;
        int i = width + width2;
        LogUtil.a("SectionActiveRecordThreeCircle", "left:", Integer.valueOf(width), "width:", Integer.valueOf(width2));
        int bubbleRadius = this.f7725c.getBubbleRadius();
        int iSqrt = (int) ((2.0d - Math.sqrt(2.0d)) * 2.0d * ((double) bubbleRadius));
        int iB = ((i - iSqrt) - qre.b(R.dimen.health_common_12dp)) - (qre.b(R.dimen.health_common_22dp) / 2);
        LogUtil.a("SectionActiveRecordThreeCircle", "circleViewX:", Integer.valueOf(i), "mRadius:", Integer.valueOf(iSqrt), "arrowX:", Integer.valueOf(iB), "bubbleRadius:", Integer.valueOf(bubbleRadius));
        this.f7725c.setArrowPosition(iB);
        PopupWindow popupWindow = new PopupWindow(this.o);
        this.aa = popupWindow;
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        this.aa.setContentView(this.ab);
        this.aa.setOutsideTouchable(true);
        this.aa.setFocusable(true);
        int i2 = qrs.i(this.o);
        this.aa.setWidth((i2 - (qre.b(R.dimen.maxPaddingStart) * 2)) + (qre.b(R.dimen.health_common_8dp) * 2));
        this.aa.setHeight(-2);
        this.aa.showAsDropDown(this.aj, qre.b(R.dimen.health_common_4dp), -qre.b(R.dimen.health_common_8dp), 17);
        Context context2 = this.o;
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        SharedPreferenceManager.e(context2, String.valueOf(10000), str, String.valueOf(iA), new StorageParams());
        ReleaseLogUtil.d("SectionActiveRecordThreeCircle", "popWindow:", Integer.valueOf(this.aa.getWidth()), " screenWidth:", Integer.valueOf(i2));
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
        PopupWindow popupWindow = this.aa;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    private void b() {
        View view = this.ac;
        if (view == null) {
            ReleaseLogUtil.a("SectionActiveRecordThreeCircle", "mRootView is null in adaptBigScaleAndWide");
            return;
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.three_circle_linear_layout);
        this.ak = linearLayout;
        if (this.o == null || !(linearLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ReleaseLogUtil.a("SectionActiveRecordThreeCircle", "mContext is null or LayoutParams error");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.ak.getLayoutParams();
        int i = R.dimen.health_common_32dp;
        if (qrs.af(this.o)) {
            i = R.dimen.health_common_48dp;
        } else if (Build.BRAND.toLowerCase(Locale.ENGLISH).contains("vivo") && qrs.a(3.1f)) {
            LogUtil.a("SectionActiveRecordThreeCircle", "isLargeScaledDensityMode by vivo");
            i = R.dimen.health_common_12dp;
        } else if (ftz.b() && qrs.a(3.1f)) {
            LogUtil.a("SectionActiveRecordThreeCircle", "isLargeScaledDensityMode");
            i = R.dimen.health_common_16dp;
        }
        marginLayoutParams.setMarginEnd((int) this.o.getResources().getDimension(i));
        this.ak.setLayoutParams(marginLayoutParams);
    }

    private void a(fsv fsvVar) {
        HealthTextView healthTextView;
        LinearLayout linearLayout = (LinearLayout) this.ac.findViewById(R.id.right_item_step);
        if (linearLayout == null) {
            return;
        }
        linearLayout.setOnClickListener(fsvVar.e(0).f34512a);
        HealthTextView healthTextView2 = (HealthTextView) linearLayout.findViewById(R.id.htv_item_title);
        if (healthTextView2 == null) {
            return;
        }
        healthTextView2.setText(fsvVar.e(0).f34513b);
        ((HealthImageView) linearLayout.findViewById(R.id.hiv_item_icon)).setBackground(ContextCompat.getDrawable(this.o, fsvVar.e(0).i));
        LinearLayout linearLayout2 = (LinearLayout) this.ac.findViewById(R.id.right_item_strength);
        if (linearLayout2 == null || (healthTextView = (HealthTextView) linearLayout2.findViewById(R.id.htv_item_title)) == null) {
            return;
        }
        linearLayout2.setOnClickListener(fsvVar.e(1).f34512a);
        HealthImageView healthImageView = (HealthImageView) linearLayout2.findViewById(R.id.hiv_item_icon);
        if (healthImageView == null) {
            return;
        }
        healthImageView.setBackground(ContextCompat.getDrawable(this.o, fsvVar.e(1).i));
        healthTextView.setText(fsvVar.e(1).f34513b);
        LinearLayout linearLayout3 = (LinearLayout) this.ac.findViewById(R.id.right_item_stand);
        if (linearLayout3 == null) {
            return;
        }
        HealthTextView healthTextView3 = (HealthTextView) linearLayout3.findViewById(R.id.htv_item_title);
        linearLayout3.setOnClickListener(fsvVar.e(2).f34512a);
        if (healthTextView3 == null) {
            return;
        }
        healthTextView3.setText(fsvVar.e(2).f34513b);
        ((HealthImageView) linearLayout3.findViewById(R.id.hiv_item_icon)).setBackground(ContextCompat.getDrawable(this.o, fsvVar.e(2).i));
    }

    private void a() {
        LinearLayout linearLayout = (LinearLayout) this.ac.findViewById(R.id.right_item_step);
        ((HealthTextView) linearLayout.findViewById(R.id.htv_item_title)).setText(this.o.getResources().getString(R.string.IDS_start_track_target_type_calorie));
        ((HealthImageView) linearLayout.findViewById(R.id.hiv_item_icon)).setBackground(ContextCompat.getDrawable(this.o, R.drawable.ic_health_red));
        this.af = (HealthTextView) linearLayout.findViewById(R.id.htv_item_content);
        LinearLayout linearLayout2 = (LinearLayout) this.ac.findViewById(R.id.right_item_strength);
        ((HealthTextView) linearLayout2.findViewById(R.id.htv_item_title)).setText(this.o.getResources().getString(R.string.IDS_intensity_new));
        ((HealthImageView) linearLayout2.findViewById(R.id.hiv_item_icon)).setBackground(ContextCompat.getDrawable(this.o, R.drawable.ic_health_orange));
        this.ae = (HealthTextView) linearLayout2.findViewById(R.id.htv_item_content);
        LinearLayout linearLayout3 = (LinearLayout) this.ac.findViewById(R.id.right_item_stand);
        HealthTextView healthTextView = (HealthTextView) linearLayout3.findViewById(R.id.htv_item_title);
        this.e = healthTextView;
        healthTextView.setText(qho.e(R.string.IDS_three_circle_card_activity_hours));
        ((HealthImageView) linearLayout3.findViewById(R.id.hiv_item_icon)).setBackground(ContextCompat.getDrawable(this.o, R.drawable.ic_health_blue));
        this.ai = (HealthTextView) linearLayout3.findViewById(R.id.htv_item_content);
    }

    private void setThreeCircleData(fsv fsvVar) {
        this.am.a("firstCircle", fsvVar.e(0).j, fsvVar.e(0).g);
        this.am.a("secondCircle", fsvVar.e(1).j, fsvVar.e(1).g);
        this.am.a("thirdCircle", fsvVar.e(2).j, fsvVar.e(2).g);
        setRightContent(fsvVar);
        setBottomContent(fsvVar);
        a(fsvVar);
    }

    private void i() {
        LinearLayout linearLayout = (LinearLayout) this.h.findViewById(R.id.distance_value_unit);
        LinearLayout linearLayout2 = (LinearLayout) this.h.findViewById(R.id.calories_value_unit);
        LinearLayout linearLayout3 = (LinearLayout) this.h.findViewById(R.id.floor_value_unit);
        b(this.n, linearLayout);
        b(this.f7724b, linearLayout2);
        b(this.j, linearLayout3);
    }

    private void b(LinearLayout linearLayout, LinearLayout linearLayout2) {
        if (qrs.v()) {
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout2.setOrientation(1);
            linearLayout2.setGravity(1);
            a(this.ag, this.al, 0);
            a(this.m, 0);
            a(this.ad, this.ah, 0);
            a(this.g, 0);
            a(this.z, this.i, 0);
            a(this.t, 0);
            return;
        }
        if (qrs.y()) {
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout2.setOrientation(0);
            a(this.ag, this.al, 0);
            a(this.m, 2);
            this.ah.setGravity(1);
            a(this.ad, this.ah, 0);
            a(this.g, 2);
            a(this.z, this.i, 0);
            a(this.t, 2);
            return;
        }
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout2.setOrientation(0);
        a(this.ag, this.al, 2);
        a(this.m, 2);
        a(this.ad, this.ah, 2);
        a(this.g, 2);
        a(this.z, this.i, 4);
        a(this.t, 2);
    }

    private void a(HealthTextView healthTextView, int i) {
        if (healthTextView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) healthTextView.getLayoutParams();
            layoutParams.setMarginEnd(qqp.a(this.o, i));
            healthTextView.setLayoutParams(layoutParams);
        }
    }

    private void a(ImageView imageView, HealthTextView healthTextView, int i) {
        if (imageView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.setMarginEnd(qqp.a(this.o, i));
            imageView.setLayoutParams(layoutParams);
        }
        if (healthTextView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) healthTextView.getLayoutParams();
            layoutParams2.setMarginEnd(qqp.a(this.o, i));
            healthTextView.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        this.p = this.n.getWidth();
        this.f7723a = this.f7724b.getWidth();
        this.s = this.j.getWidth();
        if (z) {
            int width = this.h.getWidth();
            int i = this.p;
            int i2 = (((width - i) - this.f7723a) - this.s) / 3;
            c(this.l, i + i2);
            c(this.f, this.f7723a + i2);
            a(this.r, this.s + i2);
            return;
        }
        int width2 = this.h.getWidth();
        int i3 = this.p;
        int i4 = ((width2 - i3) - this.f7723a) / 2;
        c(this.l, i3 + i4);
        c(this.f, this.f7723a + i4);
    }

    private void c(RelativeLayout relativeLayout, int i) {
        if (relativeLayout.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.width = i;
            relativeLayout.setLayoutParams(layoutParams);
        }
    }

    private void a(LinearLayout linearLayout, int i) {
        if (linearLayout.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.width = i;
            linearLayout.setLayoutParams(layoutParams);
        }
    }

    private void a(Context context) {
        if (LanguageUtil.l(context)) {
            this.al.setVisibility(0);
            this.ag.setVisibility(8);
            this.ah.setVisibility(0);
            this.ad.setVisibility(8);
            this.i.setVisibility(0);
            this.z.setVisibility(8);
            return;
        }
        this.al.setVisibility(8);
        this.ag.setVisibility(0);
        this.ah.setVisibility(8);
        this.ad.setVisibility(0);
        this.i.setVisibility(8);
        this.z.setVisibility(0);
    }

    private void e(fsv fsvVar) {
        d(this.ag, fsvVar.e().f34510b);
        d(this.ad, fsvVar.b().f34510b);
        d(this.z, R.drawable.ic_health_climb);
    }

    private void d(ImageView imageView, int i) {
        if (LanguageUtil.ba(this.o)) {
            imageView.setBackground(qqz.e(this.o, i));
        } else {
            imageView.setBackgroundResource(i);
        }
    }

    private void setRightContent(fsv fsvVar) {
        this.af.setText(fsvVar.e(0).d);
        this.ae.setText(fsvVar.e(1).d);
        this.ai.setText(fsvVar.e(2).d);
    }

    private void setBottomContent(fsv fsvVar) {
        e(fsvVar);
        this.n.setVisibility(0);
        this.n.setOnClickListener(fsvVar.e().f34509a);
        this.f7724b.setVisibility(0);
        this.f7724b.setOnClickListener(fsvVar.b().f34509a);
        this.r.setVisibility(fsvVar.j() ? 0 : 8);
        this.w.setVisibility(fsvVar.j() ? 0 : 8);
        c(fsvVar.j());
        this.r.setOnClickListener(fsvVar.a());
        f();
        if (UnitUtil.f()) {
            this.t.setText(UnitUtil.e(UnitUtil.e(fsvVar.c(), 1), 1, 2));
            this.q.setText(this.o.getResources().getString(R.string.IDS_ft));
        } else {
            this.t.setText(UnitUtil.e(fsvVar.c(), 1, 1));
        }
        this.al.setText(fsvVar.e().d);
        this.ah.setText(fsvVar.b().d);
        this.m.setText(fsvVar.e().e);
        this.g.setText(fsvVar.b().e);
        this.k.setText(fsvVar.e().f34511c);
        this.d.setText(fsvVar.b().f34511c);
        if (this.n.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.n.getLayoutParams();
            if (!fsvVar.j()) {
                layoutParams.addRule(13, -1);
            } else {
                layoutParams.removeRule(13);
            }
            this.n.setLayoutParams(layoutParams);
        }
    }

    private void f() {
        this.h.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.knit.section.view.SectionActiveRecordThreeCircle.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                LogUtil.a("SectionActiveRecordThreeCircle", "update distance cal floor width");
                if (SectionActiveRecordThreeCircle.this.d()) {
                    SectionActiveRecordThreeCircle.this.h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    SectionActiveRecordThreeCircle sectionActiveRecordThreeCircle = SectionActiveRecordThreeCircle.this;
                    sectionActiveRecordThreeCircle.c(sectionActiveRecordThreeCircle.x);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        return this.p == this.n.getWidth() && this.f7723a == this.f7724b.getWidth() && this.s == this.j.getWidth();
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void clear() {
        super.clear();
        WheelChairStateManager.a().c((WheelChairStateManager.SwitchStateListener) this);
    }

    @Override // com.huawei.threecircle.manager.WheelChairStateManager.SwitchStateListener
    public void onSwitchStateChanged(boolean z) {
        h();
    }
}
