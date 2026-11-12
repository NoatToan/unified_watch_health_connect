package com.huawei.ui.commonui.titlebar;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.spinner.HealthSpinner;
import defpackage.lrd;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrr;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class CustomTitleBar extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f23922a;
    private View aa;
    private ViewStub ab;
    private HealthTextView ac;
    private String ad;
    private HealthTextView ae;
    private int af;
    private HealthSpinner ag;
    private ViewStub ah;
    private int ai;
    private int aj;
    private HealthSpinner ak;
    private int am;
    private HealthTextView an;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f23923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f23924c;
    private RelativeLayout d;
    private BackToTopListener e;
    private ImageView f;
    private Boolean g;
    private String h;
    private Drawable i;
    private Boolean j;
    private String k;
    private int l;
    private Drawable m;
    private ViewStub n;
    private LinearLayout o;
    private ImageView p;
    private LinearLayout q;
    private ImageView r;
    private ImageView s;
    private ImageView t;
    private LinearLayout u;
    private ViewStub v;
    private ViewStub w;
    private LinearLayout x;
    private LinearLayout y;
    private ViewStub z;

    public interface BackToTopListener {
        void backToTop();
    }

    public CustomTitleBar(Context context) {
        this(context, null);
        this.f23923b = context;
        d();
    }

    public CustomTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.aj = -1;
        this.l = -1;
        if (attributeSet == null) {
            return;
        }
        this.f23923b = context;
        this.ai = context.getResources().getColor(R.color.colorPrimary);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.custom_title_bar);
        if (typedArrayObtainStyledAttributes != null) {
            this.aj = typedArrayObtainStyledAttributes.getInteger(R.styleable.custom_title_bar_custom_type, 2);
            this.ad = typedArrayObtainStyledAttributes.getString(R.styleable.custom_title_bar_titleBarText);
            this.f23922a = typedArrayObtainStyledAttributes.getDrawable(R.styleable.custom_title_bar_titleBarBg);
            this.af = typedArrayObtainStyledAttributes.getColor(R.styleable.custom_title_bar_titleBarBgColor, context.getResources().getColor(R.color.colorStatusbarBg));
            this.l = typedArrayObtainStyledAttributes.getInteger(R.styleable.custom_title_bar_leftSoftkey_visibility, 0);
            this.i = typedArrayObtainStyledAttributes.getDrawable(R.styleable.custom_title_bar_leftIcon);
            this.h = typedArrayObtainStyledAttributes.getString(R.styleable.custom_title_bar_leftIconContentDescription);
            this.m = typedArrayObtainStyledAttributes.getDrawable(R.styleable.custom_title_bar_rightIcon);
            this.k = typedArrayObtainStyledAttributes.getString(R.styleable.custom_title_bar_rightIconContentDescription);
            this.f23924c = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(R.styleable.custom_title_bar_titleBarLeftIconTint, true));
            this.g = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(R.styleable.custom_title_bar_titleBarRightIconTint, true));
            this.j = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(R.styleable.custom_title_bar_titleBarTint, true));
            try {
                this.am = typedArrayObtainStyledAttributes.getColor(R.styleable.custom_title_bar_titleBarTextColor, this.f23923b.getResources().getColor(R.color.colorAppbarTitle));
            } catch (Resources.NotFoundException unused) {
                LogUtil.e("CustomTitleBar", "Resources.NotFoundException.");
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        d();
    }

    private void d() {
        ((LayoutInflater) this.f23923b.getSystemService("layout_inflater")).inflate(R.layout.health_commonui_app_bar, this);
        this.d = (RelativeLayout) findViewById(R.id.app_titlebar);
        this.aa = findViewById(R.id.statusbar_panel);
        this.n = (ViewStub) findViewById(R.id.hwtoolbar_icon1);
        this.v = (ViewStub) findViewById(R.id.hwtoolbar_icon2);
        this.z = (ViewStub) findViewById(R.id.hwtoolbar_icon3);
        this.ab = (ViewStub) findViewById(R.id.hwtoolbar_icon4);
        this.w = (ViewStub) findViewById(R.id.hwtoolbar_icon5);
        this.an = (HealthTextView) findViewById(R.id.action_bar_title);
        this.ae = (HealthTextView) findViewById(R.id.action_bar_subtitle);
        this.ah = (ViewStub) findViewById(R.id.titleSpinner_layout);
        this.ac = (HealthTextView) findViewById(R.id.hwtoolbar_right_text);
        g();
        this.an.setTextColor(this.am);
        LogUtil.a("CustomTitleBar", "mTypeIndex: ", Integer.valueOf(this.aj));
        int i = this.aj;
        if (i == 0) {
            a();
        } else if (i == 1 || (i != 2 && i == 3)) {
            c();
        } else {
            b();
        }
        if (this.aj == 4) {
            i();
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        LogUtil.a("CustomTitleBar", "onConfigurationChanged");
        super.onConfigurationChanged(configuration);
        l();
    }

    private void j() {
        TypedArray typedArrayObtainStyledAttributes;
        Drawable drawable = this.f23922a;
        if (drawable != null) {
            this.d.setBackgroundDrawable(drawable);
            return;
        }
        int i = this.af;
        if (i != 0) {
            this.d.setBackgroundColor(i);
            return;
        }
        Resources.Theme theme = this.f23923b.getTheme();
        if (theme == null || (typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(new int[]{R.attr.titleBarBgColor})) == null) {
            return;
        }
        this.d.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, ContextCompat.getColor(this.f23923b, R.color.colorStatusbarBg)));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void h() {
        HealthTextView healthTextView = this.ae;
        if (healthTextView != null && healthTextView.getVisibility() != 8) {
            this.an.setSingleLine(true);
            this.an.setAutoTextSize(2, 20.0f);
            this.an.setAutoTextInfo(14, 2, 2);
        } else {
            this.an.setAutoTextSize(2, 20.0f);
            this.an.setAutoTextInfo(14, 2, 2);
            this.an.setSingleLine(false);
            this.an.setMaxLines(2);
        }
    }

    private void b() {
        String str = this.ad;
        if (str != null) {
            this.an.setText(str);
        }
        this.f.setVisibility(0);
        this.p.setVisibility(8);
        this.s.setVisibility(8);
        this.t.setVisibility(8);
        Drawable drawable = this.i;
        if (drawable != null) {
            this.f.setImageDrawable(drawable);
        } else {
            e();
        }
        lrd.b(this.f, this.h);
        this.o.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.commonui.titlebar.CustomTitleBar.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Activity activity = (Activity) CustomTitleBar.this.f23923b;
                LogUtil.a("CustomTitleBar", "Finish Acitivity for cause: left soft key clicked");
                activity.finish();
            }
        });
    }

    private void a() {
        String str = this.ad;
        if (str != null) {
            this.an.setText(str);
        }
        this.f.setVisibility(8);
        this.p.setVisibility(4);
        this.s.setVisibility(8);
        this.t.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.titleContainer);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.setMarginStart(qrs.d(this.f23923b, 24.0f));
        linearLayout.setLayoutParams(layoutParams);
    }

    private void c() {
        String str = this.ad;
        if (str != null) {
            this.an.setText(str);
        }
        this.f.setVisibility(0);
        if (this.i != null) {
            lrd.b(this.f, this.h);
            this.f.setImageDrawable(this.i);
        } else if (this.aj == 1) {
            lrd.b(this.f, qre.i(R.string.accessibility_cancel));
            this.f.setImageDrawable(this.f23923b.getResources().getDrawable(R.drawable.ic_public_select_cancel));
        } else {
            lrd.b(this.f, this.h);
            e();
        }
        setLeftSoftkeyVisibility(this.o);
        this.p.setVisibility(0);
        Drawable drawable = this.m;
        if (drawable != null) {
            this.p.setImageDrawable(drawable);
            lrd.b(this.p, this.k);
        } else if (this.aj == 1) {
            f();
            lrd.b(this.p, this.k);
        } else {
            this.p.setVisibility(8);
            LogUtil.a("CustomTitleBar", "mRightIconDrawable == null.");
        }
        this.s.setVisibility(8);
        this.t.setVisibility(8);
        this.o.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.commonui.titlebar.CustomTitleBar.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Activity activity = (Activity) CustomTitleBar.this.f23923b;
                LogUtil.a("CustomTitleBar", "Finish Acitivity for cause: left soft key clicked");
                activity.finish();
            }
        });
    }

    private void g() {
        LinearLayout linearLayout = (LinearLayout) this.n.inflate();
        this.o = linearLayout;
        this.f = (ImageView) linearLayout.findViewById(R.id.hwappbarpattern_cancel_icon);
        if (LanguageUtil.c(this.f23923b) || LanguageUtil.bs(this.f23923b)) {
            this.o.setLayoutDirection(1);
        }
        LinearLayout linearLayout2 = (LinearLayout) this.v.inflate();
        this.q = linearLayout2;
        this.p = (ImageView) linearLayout2.findViewById(R.id.hwappbarpattern_ok_icon);
        LinearLayout linearLayout3 = (LinearLayout) this.z.inflate();
        this.x = linearLayout3;
        ImageView imageView = (ImageView) linearLayout3.findViewById(R.id.hwappbarpattern_menu_icon);
        this.s = imageView;
        imageView.setContentDescription(this.f23923b.getResources().getString(R.string.IDS_global_search_button));
        LinearLayout linearLayout4 = (LinearLayout) this.ab.inflate();
        this.y = linearLayout4;
        ImageView imageView2 = (ImageView) linearLayout4.findViewById(R.id.hwappbarpattern_menu_icon);
        this.t = imageView2;
        imageView2.setContentDescription(this.f23923b.getResources().getString(R.string.IDS_global_search_button));
        LinearLayout linearLayout5 = (LinearLayout) this.w.inflate();
        this.u = linearLayout5;
        ImageView imageView3 = (ImageView) linearLayout5.findViewById(R.id.hwappbarpattern_menu_icon);
        this.r = imageView3;
        imageView3.setContentDescription(this.f23923b.getResources().getString(R.string.IDS_global_search_button));
        if (this.j.booleanValue()) {
            if (this.f23924c.booleanValue()) {
                this.f.setImageTintList(ColorStateList.valueOf(this.ai));
            }
            if (this.g.booleanValue()) {
                this.p.setImageTintList(ColorStateList.valueOf(this.ai));
                this.s.setImageTintList(ColorStateList.valueOf(this.ai));
                this.t.setImageTintList(ColorStateList.valueOf(this.ai));
                this.r.setImageTintList(ColorStateList.valueOf(this.ai));
            }
        }
        l();
        j();
        if (qrs.v()) {
            this.an.setTextSize(1, 35.0f);
        } else {
            h();
        }
        BaseActivity.setViewSafeRegion(false, this.d);
    }

    private void i() {
        HealthTextView healthTextView = this.an;
        if (healthTextView != null) {
            healthTextView.setVisibility(8);
        }
        if (this.ah.getParent() != null) {
            View viewInflate = this.ah.inflate();
            this.ag = (HealthSpinner) viewInflate.findViewById(R.id.titleSpinner);
            this.ak = (HealthSpinner) viewInflate.findViewById(R.id.titleSpinners);
        }
        HealthSpinner healthSpinner = this.ag;
        if (healthSpinner != null) {
            healthSpinner.setVisibility(0);
        }
        HealthSpinner healthSpinner2 = this.ak;
        if (healthSpinner2 != null) {
            healthSpinner2.setVisibility(8);
        }
    }

    private void e() {
        TypedArray typedArrayObtainStyledAttributes;
        Resources.Theme theme = this.f23923b.getTheme();
        if (theme != null) {
            if (LanguageUtil.ba(this.f23923b)) {
                LogUtil.a("CustomTitleBar", "loadLeftCrossIconByThemeSet isRTLLanguage");
                typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(new int[]{R.attr.titleBarRTLLanguageBackIcon});
            } else {
                typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(new int[]{R.attr.titleBarBackIcon});
            }
            if (typedArrayObtainStyledAttributes != null) {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
                if (drawable != null) {
                    this.f.setImageDrawable(drawable);
                } else {
                    LogUtil.a("CustomTitleBar", "loadLeftCrossIconByThemeSet drawableLeft is null");
                    if (LanguageUtil.ba(this.f23923b)) {
                        this.f.setImageDrawable(ContextCompat.getDrawable(this.f23923b, R.drawable.health_navbar_rtl_back_selector));
                    } else {
                        this.f.setImageDrawable(ContextCompat.getDrawable(this.f23923b, R.drawable.health_navbar_back_selector));
                    }
                }
                lrd.b(this.f, qre.i(R.string.accessibility_go_back));
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    private void f() {
        TypedArray typedArrayObtainStyledAttributes;
        Resources.Theme theme = this.f23923b.getTheme();
        if (theme == null || (typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(new int[]{R.attr.titleBarTickIcon})) == null) {
            return;
        }
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            LogUtil.a("CustomTitleBar", "loadRightIconByThemeSet drawableRight is not null");
            this.p.setImageDrawable(drawable);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setLeftSoftkeyVisibility(LinearLayout linearLayout) {
        int i = this.l;
        if (i == 0) {
            linearLayout.setVisibility(0);
        } else if (i == 4) {
            linearLayout.setVisibility(4);
        } else {
            if (i != 8) {
                return;
            }
            linearLayout.setVisibility(8);
        }
    }

    private void l() {
        RelativeLayout.LayoutParams layoutParamsU = qrs.u(this.f23923b);
        View view = this.aa;
        if (view != null) {
            view.setLayoutParams(layoutParamsU);
        }
    }

    public void setHeadTitleAndLeftButton(String str) {
        if (str != null) {
            setTitleText(str);
        }
        setHeadTitleTypeface(qrr.d(), 1);
        setLeftButtonDrawable(qqz.c(BaseApplication.b(), R.drawable.ic_bg_back), qre.f(R.string.accessibility_go_back));
        setTitleMarginStart(qre.b(R.dimen.health_common_8dp));
    }

    public void setBackToTopListener(BackToTopListener backToTopListener) {
        this.e = backToTopListener;
    }

    public void setDoubleClickEnable(boolean z) {
        if (z) {
            this.an.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.commonui.titlebar.CustomTitleBar.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (!qrs.r() || CustomTitleBar.this.e == null) {
                        return;
                    }
                    CustomTitleBar.this.e.backToTop();
                }
            });
        }
    }

    public void setTitleBarBackgroundColor(int i) {
        this.d.setBackgroundColor(i);
    }

    public void setTitleText(String str) {
        HealthTextView healthTextView = this.an;
        if (healthTextView == null) {
            return;
        }
        healthTextView.setText(str);
    }

    public void setTitleSize(float f) {
        HealthTextView healthTextView = this.an;
        if (healthTextView == null) {
            return;
        }
        healthTextView.setAutoTextSize(1, qrs.e(this.f23923b, f));
    }

    public void setHeadTitleTypeface(Typeface typeface, int i) {
        HealthTextView healthTextView = this.an;
        if (healthTextView == null || typeface == null) {
            return;
        }
        healthTextView.setTypeface(typeface, i);
    }

    public void setTitleMarginStart(int i) {
        HealthTextView healthTextView = this.an;
        if (healthTextView == null) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) healthTextView.getLayoutParams();
        layoutParams.setMarginStart(i);
        this.an.setLayoutParams(layoutParams);
    }

    public void setTitleTextColor(int i) {
        HealthTextView healthTextView = this.an;
        if (healthTextView == null) {
            return;
        }
        healthTextView.setTextColor(i);
    }

    private void d(ImageView imageView, Drawable drawable, CharSequence charSequence) {
        if (imageView == null || drawable == null) {
            ReleaseLogUtil.d("CustomTitleBar", "setDrawable imageView ", imageView, " drawable ", drawable);
            return;
        }
        imageView.setImageDrawable(drawable);
        if (TextUtils.isEmpty(charSequence)) {
            ReleaseLogUtil.d("CustomTitleBar", "setDrawable contentDescription ", charSequence);
        } else {
            lrd.b(imageView, charSequence);
        }
    }

    public void setLeftButtonVisibility(int i) {
        ViewStub viewStub = this.n;
        if (viewStub != null) {
            viewStub.setVisibility(i);
        }
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
    }

    public void setLeftButtonDrawable(Drawable drawable, CharSequence charSequence) {
        d(this.f, drawable, charSequence);
    }

    public void setLeftButtonTextColor(Drawable drawable, int i, CharSequence charSequence) {
        setLeftButtonTextColor(drawable, i, this.f23924c.booleanValue(), charSequence);
    }

    public void setLeftButtonTextColor(Drawable drawable, int i, boolean z, CharSequence charSequence) {
        setTitleTextColor(i);
        ImageView imageView = this.f;
        if (imageView == null) {
            ReleaseLogUtil.d("CustomTitleBar", "setLeftButtonTextColor mLeftIconImage is null");
        } else {
            imageView.setImageTintList(z ? ColorStateList.valueOf(this.ai) : null);
            d(this.f, drawable, charSequence);
        }
    }

    public void setLeftButtonClickable(boolean z) {
        ViewStub viewStub = this.n;
        if (viewStub != null) {
            viewStub.setClickable(z);
        }
    }

    public void setLeftButtonOnClickListener(View.OnClickListener onClickListener) {
        LinearLayout linearLayout = this.o;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(onClickListener);
        }
    }

    public void setRightButtonVisibility(int i) {
        ViewStub viewStub = this.v;
        if (viewStub == null) {
            return;
        }
        viewStub.setVisibility(i);
        if (this.q == null) {
            LinearLayout linearLayout = (LinearLayout) this.v.inflate();
            this.q = linearLayout;
            linearLayout.setVisibility(i);
            this.p = (ImageView) this.q.findViewById(R.id.hwappbarpattern_ok_icon);
        }
        ImageView imageView = this.p;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
    }

    public void setRightButtonDrawable(Drawable drawable, CharSequence charSequence) {
        d(this.p, drawable, charSequence);
    }

    public void setRightButtonClickable(boolean z) {
        LinearLayout linearLayout = this.q;
        if (linearLayout != null) {
            linearLayout.setClickable(z);
        }
    }

    public void setRightButtonOnClickListener(View.OnClickListener onClickListener) {
        LinearLayout linearLayout = this.q;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(onClickListener);
        }
    }

    public void setRightFourKeyVisibility(int i) {
        ViewStub viewStub = this.w;
        if (viewStub == null) {
            return;
        }
        viewStub.setVisibility(i);
        if (this.u == null && (this.w.inflate() instanceof LinearLayout)) {
            LinearLayout linearLayout = (LinearLayout) this.w.inflate();
            this.u = linearLayout;
            this.r = (ImageView) linearLayout.findViewById(R.id.hwappbarpattern_menu_icon);
        }
        ImageView imageView = this.r;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
    }

    public void setRightFourKeyBackground(Drawable drawable, CharSequence charSequence) {
        d(this.r, drawable, charSequence);
    }

    public void setRightFourKeyOnClickListener(View.OnClickListener onClickListener) {
        LinearLayout linearLayout = this.u;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(onClickListener);
        }
    }

    public void setRightThirdKeyVisibility(int i) {
        ViewStub viewStub = this.ab;
        if (viewStub == null) {
            return;
        }
        viewStub.setVisibility(i);
        if (this.y == null) {
            LinearLayout linearLayout = (LinearLayout) this.z.inflate();
            this.y = linearLayout;
            this.t = (ImageView) linearLayout.findViewById(R.id.hwappbarpattern_menu_icon);
        }
        ImageView imageView = this.t;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
    }

    public void setRightThirdKeyBackground(Drawable drawable, CharSequence charSequence) {
        d(this.t, drawable, charSequence);
    }

    public void setRightThirdKeyOnClickListener(View.OnClickListener onClickListener) {
        LinearLayout linearLayout = this.y;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(onClickListener);
        }
    }

    public void setRightSoftkeyVisibility(int i) {
        ViewStub viewStub = this.z;
        if (viewStub == null) {
            return;
        }
        viewStub.setVisibility(i);
        if (this.x == null) {
            LinearLayout linearLayout = (LinearLayout) this.z.inflate();
            this.x = linearLayout;
            this.s = (ImageView) linearLayout.findViewById(R.id.hwappbarpattern_menu_icon);
        }
        ImageView imageView = this.s;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
    }

    public void setRightSoftkeyBackground(Drawable drawable, CharSequence charSequence) {
        d(this.s, drawable, charSequence);
    }

    public void setRightSoftkeyOnClickListener(View.OnClickListener onClickListener) {
        LinearLayout linearLayout = this.x;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(onClickListener);
        }
    }

    public void setRightTextButtonVisibility(int i) {
        setRightButtonVisibility(i);
    }

    public void setRightTextButtonClickable(boolean z) {
        setRightButtonClickable(z);
    }

    public void setRightTextButtonOnClickListener(View.OnClickListener onClickListener) {
        setRightButtonOnClickListener(onClickListener);
    }

    public HealthTextView getViewTitle() {
        return this.an;
    }

    public HealthSpinner getTitleSpinner() {
        if (this.aj != 4) {
            LogUtil.e("CustomTitleBar", "getTitleSpinner is null");
            return null;
        }
        return this.ag;
    }

    public View getRightIconImage() {
        setRightButtonVisibility(0);
        this.q.setVisibility(8);
        return this.q;
    }

    public void setAppBarVisible(boolean z) {
        RelativeLayout.LayoutParams layoutParams;
        RelativeLayout relativeLayout = this.d;
        if (relativeLayout != null) {
            if (z) {
                relativeLayout.setVisibility(0);
                layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            } else {
                relativeLayout.setVisibility(4);
                layoutParams = new RelativeLayout.LayoutParams(-1, qrs.s(this.f23923b));
            }
            this.d.setLayoutParams(layoutParams);
        }
    }

    public void setCustomTitleBarTypeNormal() {
        a();
    }

    public void setRightTextVisible(int i) {
        this.ac.setVisibility(i);
    }

    public void setRightTextSize(float f) {
        this.ac.setTextSize(1, f);
    }

    public void setRightTextColor(int i) {
        this.ac.setTextColor(i);
    }

    public void setRightTextContent(String str) {
        this.ac.setText(str);
    }

    public void setRightTextOnClickListener(View.OnClickListener onClickListener) {
        this.ac.setOnClickListener(onClickListener);
    }

    public View getRightSoftKey() {
        return this.x;
    }

    public View getRightThirdKey() {
        return this.y;
    }
}
