package com.huawei.health.knit.section.view;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.dkf;
import defpackage.fov;
import defpackage.fts;
import defpackage.fxk;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qqp;
import defpackage.qqs;
import defpackage.qqw;
import defpackage.qqz;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class Section16_9Card_01 extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f7628a = 300;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f7629b = 100;
    private static int e = 130;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthImageView f7630c;
    private HealthColumnSystem d;
    private fov f;
    private ImageView g;
    private HealthTextView h;
    private HealthTextView i;
    private ConstraintLayout j;
    private HealthDotsPageIndicator k;
    private HealthViewPager l;
    private Context m;
    private ConstraintLayout n;
    private fov o;
    private FrameLayout p;
    private View q;
    private List<Object> r;
    private Pair<Integer, Integer> s;
    private HealthViewPager t;
    private LinearLayout v;
    private HealthButton w;
    private HealthTextView x;

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void overrideParamsByOnlineData(SectionBean sectionBean, HashMap<String, Object> map) {
    }

    public Section16_9Card_01(Context context) {
        this(context, null);
    }

    public Section16_9Card_01(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Section16_9Card_01(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.r = new ArrayList(10);
        this.s = BaseActivity.getSafeRegionWidth();
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("Section16_9Card_01", "loadView");
        this.m = context;
        a();
        return this.q;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section16_9Card_01";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("Section16_9Card_01", "start to bindViewParams");
        if (map == null || map.size() == 0) {
            LogUtil.a("Section16_9Card_01", "no need to bind");
            return;
        }
        j();
        setBackGround(qqw.b(map, "BACKGROUND", null));
        setRTLLanguage(qqw.b(map, "LEFT_TOP_VALUE", null));
        setLeftBottomText(qqw.b(map, "LEFT_BOTTOM_TEXT", null));
        setRightCombingText(qqw.b(map, "RIGHT_COMBINE_TEXT", null));
        setRightTopButton(qqw.b(map, "RIGHT_TOP_BUTTON", null));
        setBackgroundColor(qqw.b(map, "BACKGROUNDCOLOR", null));
        this.r = qqw.a((Map) map, "SECTION16_9CARD_01_BANNER_DATA", Object.class, (List) new ArrayList());
        setClickListenerEvent(qqw.b(map, "CLICK_EVENT_LISTENER", null));
        setRightTopButtonDrawable(qqw.b(map, "RIGHT_TOP_BUTTON_ICON", null));
        d();
    }

    private void j() {
        int color;
        this.g.setImageDrawable(qqz.c(this.m, qqs.e(this.m) ? R.drawable.sport_tab_arrow_right_white : R.drawable.sport_tab_arrow_right));
        if (qqs.e(this.m)) {
            color = this.m.getResources().getColor(R.color.textColorPrimaryInverse);
        } else {
            color = this.m.getResources().getColor(R.color.textColorPrimary);
        }
        this.i.setTextColor(color);
        this.h.setTextColor(color);
    }

    private void setBackGround(Object obj) {
        if (fts.c(obj)) {
            List list = (List) obj;
            if (list.size() == 2) {
                if (qrs.af(this.m)) {
                    LogUtil.a("Section16_9Card_01", "start to loadRoundRectangle tahitiBackground");
                    c(list.get(1));
                } else {
                    LogUtil.a("Section16_9Card_01", "start to loadRoundRectangle background");
                    c(list.get(0));
                }
            }
        }
    }

    private void setRightTopButtonDrawable(Object obj) {
        if (this.w == null || !fts.a(obj)) {
            return;
        }
        this.w.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(((Integer) obj).intValue(), null), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    private void setRTLLanguage(Object obj) {
        if (this.i == null || !fts.b(obj)) {
            return;
        }
        this.i.setText(UnitUtil.e(((Long) obj).longValue(), 1, 0));
    }

    private void setLeftBottomText(Object obj) {
        if (this.h == null || !fts.j(obj)) {
            return;
        }
        LogUtil.a("Section16_9Card_01", "start to set button leftBottomText");
        this.h.setText(String.valueOf(obj));
    }

    private void setRightCombingText(Object obj) {
        if (this.x == null || !(obj instanceof CharSequence)) {
            return;
        }
        LogUtil.a("Section16_9Card_01", "start to set button rightCombineText");
        this.x.setText((CharSequence) obj);
    }

    private void setRightTopButton(Object obj) {
        if (this.w == null || !fts.j(obj)) {
            return;
        }
        LogUtil.a("Section16_9Card_01", "start to set rightTopButton");
        this.w.setText(String.valueOf(obj));
    }

    private void setBackgroundColor(Object obj) {
        if (this.f7630c == null || !fts.a(obj)) {
            return;
        }
        LogUtil.a("Section16_9Card_01", "start to set backgroundColor");
        this.f7630c.setBackgroundColor(((Integer) obj).intValue());
    }

    private void c(Object obj) {
        HealthImageView healthImageView = this.f7630c;
        if (healthImageView == null) {
            return;
        }
        if (obj instanceof Integer) {
            qqf.e(healthImageView, ((Integer) obj).intValue(), qqf.d, 0, 0);
        }
        if (obj instanceof String) {
            qqf.e(this.f7630c, (String) obj, qqf.d, 0, 0);
        }
    }

    private void setClickListenerEvent(Object obj) {
        if (fts.e(obj)) {
            final OnClickSectionListener onClickSectionListener = (OnClickSectionListener) obj;
            LogUtil.a("Section16_9Card_01", "start to set button click event");
            ConstraintLayout constraintLayout = this.j;
            if (constraintLayout != null) {
                constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.Section16_9Card_01.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        LogUtil.a("Section16_9Card_01", "set subtitleClickEvent onClick");
                        onClickSectionListener.onClick("ACCUMULATED_DURATION_CLICK_VIEW");
                    }
                });
            }
            HealthButton healthButton = this.w;
            if (healthButton != null) {
                healthButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.Section16_9Card_01.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        LogUtil.a("Section16_9Card_01", "set button onClick");
                        onClickSectionListener.onClick("ITEM_BUTTON_TEXT");
                    }
                });
            }
        }
    }

    private void a() {
        if (this.q == null) {
            LogUtil.j("Section16_9Card_01", "initView mainView is null, start to inflate");
            this.q = LayoutInflater.from(this.m).inflate(R.layout.section16_9card_layout, (ViewGroup) this, false);
        }
        if (this.d == null) {
            this.d = new HealthColumnSystem(this.m, 1);
        }
        this.f7630c = (HealthImageView) this.q.findViewById(R.id.common_background);
        this.i = (HealthTextView) this.q.findViewById(R.id.left_top_value);
        this.h = (HealthTextView) this.q.findViewById(R.id.left_bottom_text);
        this.x = (HealthTextView) this.q.findViewById(R.id.right_combine_text);
        this.w = (HealthButton) this.q.findViewById(R.id.right_top_button);
        this.j = (ConstraintLayout) this.q.findViewById(R.id.left_click_area);
        this.v = (LinearLayout) this.q.findViewById(R.id.subtitle_arrow_area);
        this.g = (ImageView) this.q.findViewById(R.id.left_bottom_text_arrow);
        if (this.x.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
            this.x.setLayoutParams((ConstraintLayout.LayoutParams) this.x.getLayoutParams());
        }
        if (LanguageUtil.ba(this.m)) {
            this.v.setLayoutDirection(1);
            this.g.setImageResource(R.drawable.ic_arrows_left_black);
        }
        i();
        this.n = (ConstraintLayout) this.q.findViewById(R.id.normal_view);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.common_middle_click_view) {
            onClick("ACCUMULATED_DURATION_CLICK_VIEW");
        } else if (view.getId() == R.id.common_card_button) {
            onClick("ITEM_BUTTON_TEXT");
        }
    }

    private void i() {
        this.i.setTypeface(Typeface.createFromAsset(BaseApplication.getContext().getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf"));
    }

    private void d() {
        this.p = (FrameLayout) this.q.findViewById(R.id.banner_root);
        this.t = (HealthViewPager) this.q.findViewById(R.id.view_pager_banner);
        this.l = (HealthViewPager) this.q.findViewById(R.id.view_pager_banner_cant_loop);
        this.k = (HealthDotsPageIndicator) this.q.findViewById(R.id.indicator);
        b();
    }

    private void b() {
        e();
        if (this.t == null || this.l == null || njy.e(this.r)) {
            return;
        }
        c(this.r.size());
        m();
    }

    private void e() {
        if (this.p == null || this.n == null) {
            LogUtil.j("Section16_9Card_01", "changLayoutHeight mRootView == null || mContentLayout == null");
            return;
        }
        boolean zE = njy.e(this.r);
        ReleaseLogUtil.d("Section16_9Card_01", "changLayoutHeight", Boolean.valueOf(zE));
        if (zE) {
            this.p.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = this.n.getLayoutParams();
            if (qrs.d(1.1f)) {
                layoutParams.height = qqp.a(this.m, e);
            } else {
                layoutParams.height = qqp.a(this.m, f7629b);
            }
            this.n.setLayoutParams(layoutParams);
            return;
        }
        this.p.setVisibility(0);
        ViewGroup.LayoutParams layoutParams2 = this.n.getLayoutParams();
        layoutParams2.height = qqp.a(this.m, f7628a);
        this.n.setLayoutParams(layoutParams2);
    }

    private void c(int i) {
        if (i == 1) {
            g();
            return;
        }
        if (i == 2) {
            if (qrs.af(this.m)) {
                g();
                return;
            } else {
                h();
                return;
            }
        }
        h();
    }

    private void h() {
        this.l.setVisibility(8);
        this.t.setVisibility(0);
        this.k.setVisibility(0);
        fov fovVar = new fov(this.t, this.m);
        this.f = fovVar;
        fovVar.b(this.r);
        this.t.setOffscreenPageLimit(this.r.size());
        this.t.setAdapter(this.f);
        this.k.setViewPager(this.t);
        b(this.t);
        f();
        this.t.setOnTouchListener(new View.OnTouchListener() { // from class: com.huawei.health.knit.section.view.Section16_9Card_01.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Section16_9Card_01.this.b(motionEvent);
                return false;
            }
        });
    }

    private void g() {
        this.l.setVisibility(0);
        this.t.setVisibility(8);
        this.k.setVisibility(8);
        fov fovVar = new fov(this.l, this.m);
        this.o = fovVar;
        fovVar.b(this.r);
        this.l.setAdapter(this.o);
        b(this.l);
        f();
        this.l.setOnTouchListener(new View.OnTouchListener() { // from class: com.huawei.health.knit.section.view.Section16_9Card_01.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Section16_9Card_01.this.b(motionEvent);
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3 || action == 4) {
            m();
        } else if (action == 0) {
            c();
        } else {
            LogUtil.a("Section16_9Card_01", "not need deal");
        }
    }

    private void f() {
        ViewGroup.LayoutParams layoutParams = this.p.getLayoutParams();
        int iB = fxk.b();
        LogUtil.a("Section16_9Card_01", "width = ", Integer.valueOf(iB));
        int dimension = (int) this.m.getResources().getDimension(R.dimen.health_common_200dp);
        if (qrs.y()) {
            dimension = (int) this.m.getResources().getDimension(R.dimen.health_common_168dp);
            LogUtil.a("Section16_9Card_01", "isMoreThanOneFontScale, maxHeight = ", Integer.valueOf(dimension));
        }
        int i = (iB * 9) / 16;
        if (i <= dimension) {
            dimension = i;
        }
        if (qrs.af(this.m) && qrs.t()) {
            dimension = (int) this.m.getResources().getDimension(R.dimen.health_common_180dp);
            if (qrs.y()) {
                dimension = (int) this.m.getResources().getDimension(R.dimen.health_common_168dp);
                LogUtil.a("Section16_9Card_01", "isMoreThanOneFontScale, height = ", Integer.valueOf(dimension));
            }
        }
        layoutParams.height = dimension;
        LogUtil.a("Section16_9Card_01", "result width = ", Integer.valueOf(iB), ", height=", Integer.valueOf(dimension));
        this.p.setLayoutParams(layoutParams);
    }

    private void b(HealthViewPager healthViewPager) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (njy.e(this.r)) {
            LogUtil.j("Section16_9Card_01", "resizeViewPager() mADImageShowList is empty.");
            return;
        }
        int iQ = qrs.q();
        int iIntValue = 0;
        if (qrs.af(this.m)) {
            int iB = fxk.b();
            int iB2 = qqp.b(this.m);
            int size = this.r.size();
            if (size == 1) {
                healthViewPager.setIsScroll(false);
            } else {
                if (size == 2) {
                    int i6 = (int) ((qrs.i(this.m) - BaseApplication.getContext().getResources().getDimension(R.dimen.defaultPaddingStart)) - BaseApplication.getContext().getResources().getDimension(R.dimen.defaultPaddingEnd));
                    int i7 = ((i6 - (iB * 2)) - iB2) / 2;
                    i4 = (i6 - iB) - i7;
                    healthViewPager.setIsScroll(false);
                    i5 = i7;
                } else if (size >= 3) {
                    i4 = (iQ - iB) / 2;
                    healthViewPager.setIsScroll(true);
                    i5 = i4;
                } else {
                    LogUtil.j("Section16_9Card_01", "resizeViewPager() imageListSize <= 0.");
                }
                i2 = i5;
                iIntValue = iB2;
                i3 = i4;
                i = iIntValue;
            }
            i4 = 0;
            i2 = 0;
            i3 = i4;
            i = iIntValue;
        } else {
            int size2 = this.r.size();
            int dimension = (int) this.m.getResources().getDimension(R.dimen.defaultPaddingStart);
            int iIntValue2 = ((Integer) this.s.first).intValue();
            int iIntValue3 = ((Integer) this.s.second).intValue();
            iIntValue = size2 > 1 ? ((Integer) this.s.first).intValue() : 0;
            dkf.d(size2, healthViewPager, 1);
            i = dimension + iIntValue2 + iIntValue3;
            i2 = iIntValue;
            i3 = i2;
        }
        LogUtil.a("Section16_9Card_01", "resizeViewPager() pageMargin = ", Integer.valueOf(i), ", startPadding = ", Integer.valueOf(i2), ", endPadding = ", Integer.valueOf(i3));
        dkf.b(healthViewPager, i, "Section16_9Card_01", i2, i3, 0);
    }

    private void m() {
        HealthDotsPageIndicator healthDotsPageIndicator = this.k;
        if (healthDotsPageIndicator != null) {
            healthDotsPageIndicator.b(4000);
        }
    }

    private void c() {
        HealthDotsPageIndicator healthDotsPageIndicator = this.k;
        if (healthDotsPageIndicator != null) {
            healthDotsPageIndicator.d();
        }
    }
}
