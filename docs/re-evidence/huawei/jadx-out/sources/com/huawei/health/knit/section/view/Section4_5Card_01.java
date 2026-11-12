package com.huawei.health.knit.section.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.knit.section.view.Section4_5Card_01;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.health.servicesui.R;
import com.huawei.hiar.ARImageMetadata;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.bubblelayout.HealthBubbleLayout;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.fua;
import defpackage.iov;
import defpackage.lrd;
import defpackage.lua;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qqs;
import defpackage.qqw;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qri;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class Section4_5Card_01 extends BaseSection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f7683c = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7684a;
    private RelativeLayout aa;
    private List<Object> ab;
    private HealthTextView ac;
    private HealthTextView ad;
    private View ae;
    private ImageView af;
    private PopupWindow ag;
    private int ah;
    private View ai;
    private View aj;
    private View ak;
    private ImageView al;
    private final a am;
    private final ViewOutlineProvider an;
    private RelativeLayout ao;
    private RelativeLayout ap;
    private ImageView aq;
    private List<Object> ar;
    private ImageView as;
    private ImageView at;
    private String au;
    private View av;
    private List<Object> aw;
    private boolean ax;
    private HealthTextView ay;
    private LinearLayout az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f7685b;
    private ImageView ba;
    private View bb;
    private LinearLayout bc;
    private ImageView bd;
    private LinearLayout be;
    private HealthTextView bf;
    private LinearLayout bg;
    private HealthTextView bh;
    private View bi;
    private HealthTextView bj;
    private LinearLayout bk;
    private View bl;
    private HealthTextView bm;
    private HealthTextView bo;
    private HealthTextView bq;
    private int d;
    private int e;
    private HealthImageView f;
    private HealthImageView g;
    private HealthButton h;
    private HealthTextView i;
    private List<Object> j;
    private View k;
    private HealthTextView l;
    private HealthButton m;
    private HealthTextView n;
    private HealthTextView o;
    private boolean p;
    private boolean q;
    private HealthColumnSystem r;
    private ImageView s;
    private ImageView t;
    private ImageView u;
    private List<Object> v;
    private LinearLayout w;
    private HealthTextView x;
    private boolean y;
    private Context z;

    public Section4_5Card_01(Context context) {
        this(context, null);
    }

    public Section4_5Card_01(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Section4_5Card_01(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.am = new a(this);
        this.p = false;
        this.q = false;
        this.au = "";
        this.f7685b = "";
        this.f7684a = 6;
        this.d = 2;
        this.e = 16;
        this.ah = -1;
        this.an = new ViewOutlineProvider() { // from class: com.huawei.health.knit.section.view.Section4_5Card_01.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                if (outline == null || view == null) {
                    return;
                }
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), qqf.d);
            }
        };
        this.z = context;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void overrideParamsByOnlineData(SectionBean sectionBean, HashMap<String, Object> map) {
        List<String> listB = sectionBean.b();
        if (njy.e(listB)) {
            return;
        }
        map.put("BACKGROUND", listB);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("Section_Section4_5Card_01", "start to bindViewParams");
        if (map == null || map.size() == 0) {
            LogUtil.a("Section_Section4_5Card_01", "no need to bind");
            return;
        }
        LogUtil.a("Section_Section4_5Card_01", "default gone");
        Object objB = qqw.b(map, "SECTION_STYLE", null);
        boolean zA = qqw.a(map, "RIGHT_TOP_ICON_SHOW", false);
        if (objB instanceof String) {
            String str = (String) objB;
            a(str, zA);
            w(str);
        }
        d(qqw.a((Map) map, "BACKGROUND", Object.class, (List) new ArrayList()));
        e(qqw.b(map, "MARKER", null));
        i(qqw.b(map, "MARKER", null));
        c(qqw.b(map, "RIGHT_TOP_IMAGE", null), qqw.b(map, "RIGHT_TOP_IMAGE_DESC", null));
        p(qqw.b(map, "RIGHT_TOP_IMAGE_SECOND", null));
        t(qqw.b(map, "RIGHT_TOP_SECOND_BUBBLE", null));
        r(qqw.b(map, "RIGHT_TOP_TITLE", null));
        x(qqw.b(map, "RIGHT_TOP_TITLE_SECOND", null));
        d();
        c(qqw.b(map, "ACCUMULATED_DURATION", null));
        g(qqw.b(map, "ACCUMULATED_DURATION", null));
        h(qqw.b(map, "ACCUMULATED_DURATION_TEXT", null));
        a(qqw.b(map, "ACCUMULATED_DURATION_TEXT", null));
        o(qqw.a((Map) map, "GUIDE_BUBBLE_TEXT", Object.class, (List) new ArrayList()));
        b(qqw.a((Map) map, "CANCEL_GUIDE_BUBBLE_TEXT", Object.class, (List) new ArrayList()));
        m(Boolean.valueOf(qqw.a(map, "IS_GOAL_BUTTON_SHOW", true)));
        n(qqw.b(map, "GOAL_BUTTON", null));
        f(qqw.c(map, "CLICK_EVENT_LISTENER", (OnClickSectionListener) null));
        d(qqw.d((Map) map, "ADVERTISEMENT_TEXT", ""));
        s(qqw.b(map, "RIGHT_TOP_BUBBLE", null));
        setButtonStyleLayout(map);
    }

    private void setButtonStyleLayout(HashMap<String, Object> map) {
        if (this.ao != null && this.i != null) {
            b(map);
        }
        if (this.bi != null) {
            l(qqw.a((Map) map, "LEFT_IMAGEVIEW", Object.class, (List) new ArrayList()));
            a(qqw.a((Map) map, "MIDDLE_IMAGEVIEW", Object.class, (List) new ArrayList()), qqw.b(map, "MIDDLE_IMAGEVIEW_DESC", null));
            k(qqw.a((Map) map, "RIGHT_IMAGEVIEW", Object.class, (List) new ArrayList()));
            q(qqw.b(map, "RIGHT_LAYOUT_VISIBLE", null));
        }
        setContentDescription(lrd.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentDescription(boolean z) {
        HealthTextView healthTextView;
        CharSequence text;
        String strE;
        View view = this.ak;
        if (view == null || (healthTextView = this.bo) == null) {
            ReleaseLogUtil.d("Section_Section4_5Card_01", "setContentDescription mSubtitleClickEventFitnessAccessibility ", view, " titleFitness ", this.bo);
            return;
        }
        if (!z) {
            view.setVisibility(8);
            return;
        }
        if (this.ah >= 0) {
            int i = R.plurals.accessibility_sport_duration_minute;
            int i2 = this.ah;
            strE = qre.e(i, i2, UnitUtil.e(i2, 1, 0));
        } else {
            CharSequence text2 = healthTextView.getText();
            if (TextUtils.isEmpty(text2)) {
                ReleaseLogUtil.d("Section_Section4_5Card_01", "setContentDescription durationMinuteText ", text2);
                return;
            }
            HealthTextView healthTextView2 = this.bm;
            if (healthTextView2 == null) {
                text = "";
            } else {
                text = healthTextView2.getText();
            }
            strE = text2.toString() + ((Object) text);
        }
        this.ak.setVisibility(0);
        lrd.b(this.ak, strE);
    }

    private void b(HashMap<String, Object> map) {
        int iC = qqw.c(map, "FITNESS_DURATION", 0);
        int iC2 = qqw.c(map, "ACCUMULATED_DAYS", 0);
        int iC3 = qqw.c(map, "ACCUMULATED_TIMES", 0);
        String strE = qre.e(R.plurals.IDS_sleep_minute, iC, UnitUtil.e(iC, 1, 0));
        String strE2 = qre.e(R.plurals.IDS_user_profile_achieve_num_day, iC2, UnitUtil.e(iC2, 1, 0));
        String strE3 = qre.e(R.plurals.IDS_diving_times, iC3, UnitUtil.e(iC3, 1, 0));
        SpannableString spannableString = new SpannableString(qre.a(R.string.IDS_fitness_today_text, strE));
        qri.e(qqs.c() ? R.style.fitness_basic_textview_flyme : R.style.fitness_basic_textview, spannableString);
        this.i.setText(spannableString);
        SpannableString spannableString2 = new SpannableString(qre.a(R.string.IDS_fitness_total_text, strE2));
        qri.e(qqs.c() ? R.style.fitness_basic_textview_flyme : R.style.fitness_basic_textview, spannableString2);
        this.n.setText(spannableString2);
        SpannableString spannableString3 = new SpannableString(strE3);
        qri.e(qqs.c() ? R.style.fitness_basic_textview_flyme : R.style.fitness_basic_textview, spannableString3);
        this.l.setText(spannableString3);
        j(qqw.b(map, "BUTTON_TEXT", null));
        if (qqs.c()) {
            setFlymeTextStyle(this.i);
            setFlymeTextStyle(this.n);
            setFlymeTextStyle(this.l);
        }
    }

    private void j() {
        BitmapDrawable bitmapDrawableE;
        RelativeLayout relativeLayout = this.ao;
        if (relativeLayout == null || this.ap == null) {
            return;
        }
        relativeLayout.setVisibility(0);
        this.ap.setVisibility(8);
        this.h = (HealthButton) this.aj.findViewById(R.id.common_card_button_fitness);
        if (LanguageUtil.ba(getContext()) && (bitmapDrawableE = qqz.e(getContext(), R.drawable.ic_kecheng)) != null && this.h != null) {
            bitmapDrawableE.setBounds(0, 0, bitmapDrawableE.getMinimumWidth(), bitmapDrawableE.getMinimumHeight());
            this.h.setCompoundDrawablesRelative(bitmapDrawableE, null, null, null);
        }
        this.i = (HealthTextView) this.aj.findViewById(R.id.common_courses_data_unit);
        this.n = (HealthTextView) this.aj.findViewById(R.id.common_courses_data_unit_days);
        this.l = (HealthTextView) this.aj.findViewById(R.id.common_courses_data_unit_times);
    }

    private boolean a(String str) {
        return BaseSection.OUTDOOR_RUN_STYLE.equals(str) || BaseSection.BIKE_STYLE.equals(str);
    }

    private void a(String str, boolean z) {
        if (a(str) && z) {
            if (this.av != null) {
                return;
            }
            View viewInflate = ((ViewStub) this.aj.findViewById(R.id.outdoor_right_top_icon_layout_area)).inflate();
            this.av = viewInflate;
            this.bg = (LinearLayout) viewInflate.findViewById(R.id.right_top_layout);
            this.az = (LinearLayout) this.av.findViewById(R.id.right_top_image_layout);
            this.be = (LinearLayout) this.av.findViewById(R.id.right_top_image_layout_second);
            this.ba = (ImageView) this.av.findViewById(R.id.right_top_image);
            this.bf = (HealthTextView) this.av.findViewById(R.id.right_top_title);
            this.bd = (ImageView) this.av.findViewById(R.id.right_top_image_second);
            this.bh = (HealthTextView) this.av.findViewById(R.id.right_top_title_second);
            this.ai = ((ViewStub) this.aj.findViewById(R.id.outdoor_right_top_bubble)).inflate();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(3, R.id.right_top_layout);
            layoutParams.addRule(21);
            layoutParams.setMargins(0, (int) getResources().getDimension(R.dimen.health_common_8dp), 0, 0);
            this.ai.setLayoutParams(layoutParams);
            this.ai.bringToFront();
            f();
        } else if (b()) {
            return;
        }
        n();
    }

    private boolean b() {
        if (this.bb != null) {
            return true;
        }
        View viewInflate = ((ViewStub) this.aj.findViewById(R.id.right_top_icon_layout_area)).inflate();
        this.bb = viewInflate;
        this.bg = (LinearLayout) viewInflate.findViewById(R.id.right_top_layout);
        this.az = (LinearLayout) this.bb.findViewById(R.id.right_top_image_layout);
        this.be = (LinearLayout) this.bb.findViewById(R.id.right_top_image_layout_second);
        this.ba = (ImageView) this.bb.findViewById(R.id.right_top_image);
        this.bf = (HealthTextView) this.bb.findViewById(R.id.right_top_title);
        this.bd = (ImageView) this.bb.findViewById(R.id.right_top_image_second);
        this.bh = (HealthTextView) this.bb.findViewById(R.id.right_top_title_second);
        this.ai = ((ViewStub) this.aj.findViewById(R.id.right_top_bubble)).inflate();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(3, R.id.right_top_layout);
        layoutParams.setMargins(0, (int) getResources().getDimension(R.dimen.health_common_8dp), (int) getResources().getDimension(R.dimen.health_common_4dp), 0);
        layoutParams.addRule(21);
        this.ai.setLayoutParams(layoutParams);
        this.ai.bringToFront();
        return false;
    }

    private void n() {
        this.ba.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.knit.section.view.Section4_5Card_01.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                Section4_5Card_01.this.ba.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int[] iArr = new int[2];
                Section4_5Card_01.this.getKnitFragment().getHealthScrollView().getLocationOnScreen(iArr);
                LogUtil.a("Section_Section4_5Card_01", "scrollView x =", Integer.valueOf(iArr[0]));
                LogUtil.a("Section_Section4_5Card_01", "scrollView y =", Integer.valueOf(iArr[1]));
                int[] iArr2 = new int[2];
                Section4_5Card_01.this.aj.getLocationOnScreen(iArr2);
                LogUtil.a("Section_Section4_5Card_01", "mainView x =", Integer.valueOf(iArr2[0]));
                LogUtil.a("Section_Section4_5Card_01", "mainView y =", Integer.valueOf(iArr2[1]));
                int[] iArr3 = {iArr2[0], (iArr2[1] + iArr[1]) - Section4_5Card_01.this.ba.getHeight()};
                LogUtil.a("Section_Section4_5Card_01", "newPoint x =", Integer.valueOf(iArr3[0]));
                LogUtil.a("Section_Section4_5Card_01", "newPoint y =", Integer.valueOf(iArr3[1]));
                Section4_5Card_01.this.getKnitFragment().setPuppetsView(iArr3);
            }
        });
    }

    private void f() {
        this.ae = ((ViewStub) this.aj.findViewById(R.id.outdoor_right_top_exp_bubble)).inflate();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(3, R.id.right_top_layout);
        layoutParams.addRule(21);
        layoutParams.setMargins(0, (int) getResources().getDimension(R.dimen.health_common_8dp), 0, 0);
        this.ae.setLayoutParams(layoutParams);
        this.ae.bringToFront();
    }

    private void a() {
        if (this.bi != null) {
            return;
        }
        RelativeLayout relativeLayout = this.ap;
        if (relativeLayout != null && this.ao != null) {
            relativeLayout.setVisibility(0);
            this.ao.setVisibility(8);
        }
        View viewInflate = ((ViewStub) this.aj.findViewById(R.id.round_btn_area)).inflate();
        this.bi = viewInflate;
        this.w = (LinearLayout) viewInflate.findViewById(R.id.section_img_sport_entrance_warmup);
        this.u = (ImageView) this.bi.findViewById(R.id.section_img_sport_entrance_warmup_icon);
        this.x = (HealthTextView) this.bi.findViewById(R.id.section_img_sport_entrance_warmup_text);
        this.as = (ImageView) this.bi.findViewById(R.id.section_img_sport_entrance_begin);
        if (LanguageUtil.ba(getContext())) {
            this.as.setRotationY(180.0f);
        }
        this.bc = (LinearLayout) this.bi.findViewById(R.id.section_img_sport_entrance_music);
        this.at = (ImageView) this.bi.findViewById(R.id.section_img_sport_entrance_music_icon);
        this.ay = (HealthTextView) this.bi.findViewById(R.id.section_img_sport_entrance_music_text);
        this.k = this.bi.findViewById(R.id.goal_card_area);
        this.m = (HealthButton) this.bi.findViewById(R.id.goal_card_button);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    private void w(Object obj) {
        byte b2;
        LogUtil.a("Section_Section4_5Card_01", "start to set section style, current is " + obj);
        String str = (String) obj;
        str.hashCode();
        switch (str) {
            case "YOGA_STYLE":
                b2 = 0;
                break;
            case "BIKE_STYLE":
                b2 = 1;
                break;
            case "WALK_STYLE":
                b2 = 2;
                break;
            case "INDOOR_RUN_STYLE":
                b2 = 3;
                break;
            case "ROPE_SKIPPING_STYLE":
                b2 = 4;
                break;
            case "OUTDOOR_RUN_STYLE":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            LogUtil.a("Section_Section4_5Card_01", "current style is yoga");
            j();
            setDarkModeColor(false);
            e();
            return;
        }
        if (b2 == 1) {
            LogUtil.a("Section_Section4_5Card_01", "current style is bike");
            a();
            setDarkModeColor(true);
            return;
        }
        if (b2 == 2) {
            LogUtil.a("Section_Section4_5Card_01", "current style is walk");
            a();
            setDarkModeColor(true);
            return;
        }
        if (b2 == 3) {
            LogUtil.a("Section_Section4_5Card_01", "current style is indoor run");
            a();
            setDarkModeColor(false);
            e();
            return;
        }
        if (b2 == 4) {
            LogUtil.a("Section_Section4_5Card_01", "current style is rope skipping");
            a();
            setDarkModeColor(false);
            e();
            return;
        }
        if (b2 == 5) {
            LogUtil.a("Section_Section4_5Card_01", "current style is outdoor run");
            a();
            setDarkModeColor(true);
            return;
        }
        v(obj);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    private void v(Object obj) {
        byte b2;
        String str = (String) obj;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != 617956442) {
            if (iHashCode != 1310151527) {
                if (iHashCode == 1409752685 && str.equals(BaseSection.HIKE_STYLE)) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals(BaseSection.CLIMB_STYLE)) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals(BaseSection.FITNESS_STYLE)) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            LogUtil.a("Section_Section4_5Card_01", "current style is fitness");
            j();
            setDarkModeColor(false);
            e();
            return;
        }
        if (b2 == 1) {
            LogUtil.a("Section_Section4_5Card_01", "current style is climb");
            a();
            setDarkModeColor(true);
            qsp.c((View) this.w, 8);
            return;
        }
        if (b2 != 2) {
            LogUtil.a("Section_Section4_5Card_01", "unknown sport style");
            return;
        }
        LogUtil.a("Section_Section4_5Card_01", "current style is hike");
        a();
        setDarkModeColor(true);
        qsp.c((View) this.w, 8);
    }

    private void d(Object obj) {
        if (obj instanceof List) {
            List<Object> list = (List) obj;
            this.j = list;
            if (list.size() == 2) {
                if (qrs.af(this.z)) {
                    LogUtil.a("Section_Section4_5Card_01", "start to loadRoundRectangle tahitiBackground");
                    aa(this.j.get(1));
                } else {
                    LogUtil.a("Section_Section4_5Card_01", "start to loadRoundRectangle background");
                    aa(this.j.get(0));
                }
            }
        }
    }

    private void aa(Object obj) {
        RelativeLayout relativeLayout = this.ap;
        if (relativeLayout == null || this.ao == null || obj == null) {
            return;
        }
        if (relativeLayout.getVisibility() == 0) {
            y(obj);
        }
        if (this.ao.getVisibility() == 0) {
            u(obj);
        }
    }

    public void e(Object obj) {
        if (this.al == null || !(obj instanceof Integer)) {
            return;
        }
        LogUtil.a("Section_Section4_5Card_01", "start to set marker");
        this.al.setImageResource(((Integer) obj).intValue());
    }

    private void i(Object obj) {
        if (this.aq == null || !(obj instanceof Integer)) {
            return;
        }
        LogUtil.a("Section_Section4_5Card_01", "start to set marker");
        this.aq.setImageResource(((Integer) obj).intValue());
    }

    private void c(Object obj, Object obj2) {
        ImageView imageView = this.ba;
        if (imageView != null && (obj instanceof Integer) && obj != null) {
            LogUtil.a("Section_Section4_5Card_01", "start to set right top image");
            this.ba.setImageResource(((Integer) obj).intValue());
            qsp.c((View) this.ba, 0);
            this.p = true;
        } else {
            qsp.c((View) imageView, 8);
        }
        if (obj2 instanceof String) {
            lrd.b(this.ba, (String) obj2);
        }
    }

    private void p(Object obj) {
        ImageView imageView = this.bd;
        if (imageView != null && (obj instanceof Integer) && obj != null) {
            LogUtil.a("Section_Section4_5Card_01", "start to set right top imageSecond");
            this.bd.setImageResource(((Integer) obj).intValue());
            qsp.c((View) this.bd, 0);
            this.q = true;
            return;
        }
        this.q = false;
        qsp.c((View) imageView, 8);
    }

    public static PopupWindow b(Context context, View view, String str) {
        LinearLayout linearLayout = (LinearLayout) View.inflate(context, R.layout.section4_5card_exp_up_bubble, null);
        if (linearLayout == null || view == null) {
            LogUtil.a("Section_Section4_5Card_01", "bubbleLayout is null");
            return null;
        }
        HealthBubbleLayout healthBubbleLayout = (HealthBubbleLayout) linearLayout.findViewById(R.id.icon_exp_bubble_up_layout);
        ((TextView) linearLayout.findViewById(R.id.tip_content)).setText(str);
        healthBubbleLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        f7683c = healthBubbleLayout.getMeasuredHeight();
        final PopupWindow popupWindow = new PopupWindow(context);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setContentView(linearLayout);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchable(true);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: fus
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Section4_5Card_01.d(popupWindow, view2);
            }
        });
        return popupWindow;
    }

    public static /* synthetic */ void d(PopupWindow popupWindow, View view) {
        popupWindow.dismiss();
        lua.d(Integer.toString(10000), "exp_guide_bubble", true);
    }

    private void s(Object obj) {
        if (this.q && this.p) {
            g();
            return;
        }
        View view = this.ae;
        if (view != null && view.getVisibility() == 0) {
            LogUtil.a("Section_Section4_5Card_01", "mExpBubbleLayout is showing");
            return;
        }
        boolean zA = lua.a(Integer.toString(10000), "exp_guide_bubble", false);
        LogUtil.a("Section_Section4_5Card_01", "start to set right top exp bubble ", Boolean.valueOf(zA));
        View view2 = this.ae;
        if (view2 != null && (obj instanceof String) && !zA) {
            HealthTextView healthTextView = (HealthTextView) view2.findViewById(R.id.tip_content);
            this.ae.setOnClickListener(new View.OnClickListener() { // from class: fva
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.f34603a.e(view3);
                }
            });
            healthTextView.setText((String) obj);
            qsp.c(this.ae, 0);
            return;
        }
        qsp.c(view2, 8);
    }

    public /* synthetic */ void e(View view) {
        View view2 = this.ae;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        lua.d(Integer.toString(10000), "exp_guide_bubble", true);
    }

    private void g() {
        View view = this.ae;
        if (view != null) {
            view.setVisibility(8);
        }
        if (this.ag == null) {
            this.ag = b(this.z, this.bg, qre.f(R.string.IDS_exp_route_launching));
        }
        if (lua.a(Integer.toString(10000), "exp_guide_bubble", false)) {
            LogUtil.a("Section_Section4_5Card_01", "hasShowExpBubble");
        } else {
            a((View) this.bg);
        }
    }

    private void a(final View view) {
        if (this.ag == null || f7683c == -1) {
            return;
        }
        this.bg.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.knit.section.view.Section4_5Card_01.9
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                Section4_5Card_01.this.bg.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                Section4_5Card_01.this.d(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final View view) {
        KnitFragment knitFragment = getKnitFragment();
        if (knitFragment == null || !knitFragment.getIsVisibleToUser()) {
            LogUtil.a("Section_Section4_5Card_01", "knitFragment is null or is invisible");
        } else {
            HandlerExecutor.c(new Runnable() { // from class: fuy
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b(view);
                }
            }, 150L);
        }
    }

    public /* synthetic */ void b(View view) {
        int width;
        if (this.ag == null) {
            LogUtil.a("Section_Section4_5Card_01", "popupWindow is null");
            return;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = 0;
        if (iArr[0] < qrs.i(this.z) / 2) {
            if (LanguageUtil.ba(this.z)) {
                width = iArr[0] + view.getWidth();
            } else {
                width = iArr[0];
            }
            i = -width;
        }
        Context context = this.z;
        if (!(context instanceof Activity)) {
            ReleaseLogUtil.d("R_Section_Section4_5Card_01", "changeBubblePosition mContext ", context);
            return;
        }
        Activity activity = (Activity) context;
        if (!iov.d(activity)) {
            ReleaseLogUtil.d("R_Section_Section4_5Card_01", "changeBubblePosition activity ", activity);
        } else {
            this.ag.showAsDropDown(view, i, -(view.getHeight() + f7683c + qre.b(R.dimen.health_common_9dp)));
        }
    }

    private void t(Object obj) {
        final int iC = SharedPreferenceManager.c(Integer.toString(10000), "is_not_avail_bolt_tag", 0);
        LogUtil.a("Section_Section4_5Card_01", "start to set right top bubble，", Integer.valueOf(iC));
        View view = this.ai;
        if (view != null && (obj instanceof String) && iC < 1) {
            HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.tip_content);
            HealthTextView healthTextView2 = (HealthTextView) this.ai.findViewById(R.id.ok_text);
            if (qrs.u()) {
                healthTextView.setTextSize(2, 10.0f);
                healthTextView2.setTextSize(2, 10.0f);
            }
            healthTextView2.setOnClickListener(new View.OnClickListener() { // from class: fuu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f34595a.d(iC, view2);
                }
            });
            healthTextView.setText((String) obj);
            qsp.c(this.ai, 0);
            return;
        }
        qsp.c(view, 8);
    }

    public /* synthetic */ void d(int i, View view) {
        View view2 = this.ai;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        SharedPreferenceManager.d(Integer.toString(10000), "is_not_avail_bolt_tag", i + 1);
    }

    private void d() {
        if (this.p) {
            qsp.c((View) this.az, 0);
        } else {
            qsp.c((View) this.az, 8);
        }
        if (this.q) {
            qsp.c((View) this.be, 0);
        } else {
            qsp.c((View) this.be, 8);
        }
        if (this.p || this.q) {
            qsp.c((View) this.bg, 0);
        } else {
            qsp.c((View) this.bg, 8);
        }
    }

    private void r(Object obj) {
        HealthTextView healthTextView = this.bf;
        if (healthTextView != null && (obj instanceof String) && obj != null) {
            LogUtil.a("Section_Section4_5Card_01", "start to set right top title");
            this.bf.setText(String.valueOf(obj));
            this.bf.setVisibility(0);
        } else if (healthTextView == null) {
            LogUtil.j("Section_Section4_5Card_01", "rightTopTitle==null");
        } else {
            healthTextView.setVisibility(8);
        }
    }

    private void x(Object obj) {
        HealthTextView healthTextView = this.bh;
        if (healthTextView == null) {
            return;
        }
        if ((obj instanceof String) && obj != null) {
            LogUtil.a("Section_Section4_5Card_01", "start to set right top titleSecond");
            this.bh.setText(String.valueOf(obj));
            this.bh.setVisibility(0);
            return;
        }
        healthTextView.setVisibility(8);
    }

    private void g(Object obj) {
        LogUtil.a("Section_Section4_5Card_01", "handleFitnessAccumulatedDuration subViewTypeValue ", obj, " titleFitness ", this.bo);
        if (this.bo != null && (obj instanceof Integer)) {
            int iIntValue = ((Integer) obj).intValue();
            this.ah = iIntValue;
            this.bo.setText(UnitUtil.e(iIntValue, 1, 0));
        }
        HealthTextView healthTextView = this.bo;
        if (healthTextView == null || !(obj instanceof String)) {
            return;
        }
        healthTextView.setText(String.valueOf(obj));
    }

    private void c(Object obj) {
        if (this.bq != null && (obj instanceof Integer)) {
            LogUtil.a("Section_Section4_5Card_01", "start to set button title");
            this.bq.setText(UnitUtil.e(((Integer) obj).intValue(), 1, 0));
        }
        if (this.bq == null || !(obj instanceof String)) {
            return;
        }
        LogUtil.a("Section_Section4_5Card_01", "start to set button title");
        this.bq.setText(String.valueOf(obj));
    }

    private void h(Object obj) {
        if (this.bm == null || !(obj instanceof String)) {
            return;
        }
        LogUtil.a("Section_Section4_5Card_01", "start to set button subtitleFitness");
        this.bm.setText(String.valueOf(obj));
    }

    private void a(Object obj) {
        if (this.bj == null || !(obj instanceof String)) {
            return;
        }
        LogUtil.a("Section_Section4_5Card_01", "start to set button subtitle");
        this.bj.setText(String.valueOf(obj));
    }

    private void o(Object obj) {
        if (this.o == null || !(obj instanceof List)) {
            return;
        }
        List list = (List) obj;
        if (list.size() == 2) {
            LogUtil.a("Section_Section4_5Card_01", "start to set text guide bubble");
            Object obj2 = list.get(0);
            Object obj3 = list.get(1);
            if ((obj2 instanceof String) && TextUtils.equals("true", (String) obj2) && (obj3 instanceof String)) {
                this.o.setText(String.valueOf(obj3));
                this.o.setVisibility(0);
            } else {
                this.o.setVisibility(8);
            }
        }
    }

    private void b(Object obj) {
        if (this.aa == null || !(obj instanceof List)) {
            return;
        }
        List<Object> list = (List) obj;
        if (list.size() == 4) {
            LogUtil.a("Section_Section4_5Card_01", "start to set cancel guide bubble");
            this.ab = list;
            Object obj2 = list.get(0);
            Object obj3 = this.ab.get(1);
            if ((obj2 instanceof String) && TextUtils.equals("true", (String) obj2) && (obj3 instanceof String)) {
                LogUtil.a("Section_Section4_5Card_01", "isFirstLoading");
                this.ac.setText(String.valueOf(obj3));
                StateListDrawable stateListDrawableC = c(((Integer) this.ab.get(2)).intValue(), ((Integer) this.ab.get(3)).intValue());
                if (stateListDrawableC != null) {
                    this.af.setBackground(stateListDrawableC);
                }
                this.aa.setVisibility(0);
                return;
            }
            this.aa.setVisibility(8);
        }
    }

    private void m(Object obj) {
        if (this.k == null || !(obj instanceof Boolean)) {
            return;
        }
        LogUtil.a("Section_Section4_5Card_01", "start to set goal button visiblity");
        this.k.setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
    }

    private void n(Object obj) {
        if (this.m == null || !(obj instanceof String)) {
            return;
        }
        LogUtil.a("Section_Section4_5Card_01", "start to set button goalButton");
        this.m.setText(String.valueOf(obj));
        if (qrs.v()) {
            ViewGroup.LayoutParams layoutParams = this.m.getLayoutParams();
            layoutParams.height = -2;
            this.m.setLayoutParams(layoutParams);
        }
    }

    private void j(Object obj) {
        if (this.h == null || !(obj instanceof String)) {
            return;
        }
        LogUtil.a("Section_Section4_5Card_01", "start to set buttonFitness text");
        this.h.setText(String.valueOf(obj));
    }

    private void l(Object obj) {
        if (obj instanceof List) {
            List<Object> list = (List) obj;
            this.v = list;
            if (list.size() > 0 && (this.v.get(0) instanceof Integer)) {
                LogUtil.a("Section_Section4_5Card_01", "start to set left imageview");
                if (LanguageUtil.l(this.z)) {
                    this.x.setVisibility(0);
                    this.u.setVisibility(0);
                    o();
                    StateListDrawable stateListDrawableC = c(((Integer) this.v.get(0)).intValue(), ((Integer) this.v.get(1)).intValue());
                    if (stateListDrawableC != null) {
                        this.w.setBackground(stateListDrawableC);
                    }
                    if (this.v.get(2) instanceof Integer) {
                        this.u.setImageDrawable(this.z.getDrawable(((Integer) this.v.get(2)).intValue()));
                    }
                    if (this.v.get(3) instanceof Integer) {
                        this.x.setText(this.z.getResources().getString(((Integer) this.v.get(3)).intValue()));
                        return;
                    }
                    return;
                }
                this.x.setVisibility(8);
                this.w.setVisibility(8);
                this.x.setVisibility(8);
                return;
            }
            this.w.setVisibility(8);
            this.u.setVisibility(8);
            this.x.setVisibility(8);
        }
    }

    private void a(Object obj, Object obj2) {
        if (obj instanceof List) {
            List<Object> list = (List) obj;
            this.ar = list;
            if (list.size() == 2 && (this.ar.get(0) instanceof Integer)) {
                LogUtil.a("Section_Section4_5Card_01", "start to set middle button");
                StateListDrawable stateListDrawableC = c(((Integer) this.ar.get(0)).intValue(), ((Integer) this.ar.get(1)).intValue());
                if (stateListDrawableC != null) {
                    this.as.setBackground(stateListDrawableC);
                }
            } else if (this.ar.size() == 1 && (this.ar.get(0) instanceof String)) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.as.getLayoutParams();
                layoutParams.width = (int) BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_110dp);
                layoutParams.height = (int) BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_100dp);
                this.as.setLayoutParams(layoutParams);
                qqf.c((String) this.ar.get(0), this.as, 0);
            }
        }
        if (obj2 instanceof String) {
            this.as.setContentDescription((String) obj2);
        }
    }

    private void k(Object obj) {
        if (obj instanceof List) {
            List<Object> list = (List) obj;
            this.aw = list;
            if (list.size() > 0 && (this.aw.get(0) instanceof Integer)) {
                LogUtil.a("Section_Section4_5Card_01", "start to set right imageview");
                this.bc.setVisibility(0);
                this.at.setVisibility(0);
                if (LanguageUtil.l(this.z)) {
                    this.ay.setVisibility(0);
                } else {
                    this.ay.setVisibility(8);
                }
                k();
                StateListDrawable stateListDrawableC = c(((Integer) this.aw.get(0)).intValue(), ((Integer) this.aw.get(1)).intValue());
                if (stateListDrawableC != null) {
                    this.bc.setBackground(stateListDrawableC);
                }
                if (this.aw.get(2) instanceof Integer) {
                    this.at.setImageDrawable(this.z.getDrawable(((Integer) this.aw.get(2)).intValue()));
                }
                if (this.aw.get(3) instanceof Integer) {
                    this.ay.setText(this.z.getResources().getString(((Integer) this.aw.get(3)).intValue()));
                    return;
                }
                return;
            }
            if (this.aw.size() > 0 && (this.aw.get(0) instanceof Bitmap)) {
                this.bc.setVisibility(0);
                this.at.setVisibility(8);
                this.ay.setVisibility(8);
                m();
                this.bc.setBackground(new BitmapDrawable(this.z.getResources(), (Bitmap) this.aw.get(0)));
                return;
            }
            this.bc.setVisibility(8);
            this.at.setVisibility(8);
            this.ay.setVisibility(8);
        }
    }

    private void d(String str) {
        qsp.a(this.ad, str, true);
    }

    private void q(Object obj) {
        if (obj instanceof Integer) {
            LogUtil.a("Section_Section4_5Card_01", "start to set rightLayout visibility");
            this.bc.setVisibility(((Integer) obj).intValue());
        }
    }

    private void f(Object obj) {
        LogUtil.a("Section_Section4_5Card_01", "start to set click event");
        setClickListenerEvent(obj);
    }

    private void u(Object obj) {
        HealthImageView healthImageView = this.f;
        if (healthImageView == null) {
            return;
        }
        if (obj instanceof Integer) {
            healthImageView.setImageResource(((Integer) obj).intValue());
        }
        if (obj instanceof String) {
            qqf.e(this.f, (String) obj, qqf.d, 0, 0);
        }
    }

    private void y(Object obj) {
        HealthImageView healthImageView = this.g;
        if (healthImageView == null) {
            return;
        }
        if (obj instanceof Integer) {
            healthImageView.setImageResource(((Integer) obj).intValue());
        }
        if (obj instanceof String) {
            qqf.e(this.g, (String) obj, qqf.d, 0, 0);
        }
    }

    private void setClickListenerEvent(Object obj) {
        if (obj instanceof OnClickSectionListener) {
            final OnClickSectionListener onClickSectionListener = (OnClickSectionListener) obj;
            LogUtil.a("Section_Section4_5Card_01", "start to set button click event");
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.Section4_5Card_01.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("Section_Section4_5Card_01", "set subtitleClickEvent onClick");
                    onClickSectionListener.onClick("ACCUMULATED_DURATION_CLICK_VIEW");
                }
            };
            qsp.b(this.bl, onClickListener);
            qsp.b(this.bo, onClickListener);
            qsp.b(this.bk, onClickListener);
            qsp.b(this.ak, onClickListener);
            setFitnessButtonClick(onClickSectionListener);
            setListener(onClickSectionListener);
            setLayoutClickListener(onClickSectionListener);
        }
    }

    private void setListener(final OnClickSectionListener onClickSectionListener) {
        LinearLayout linearLayout = this.az;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.Section4_5Card_01.10
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("Section_Section4_5Card_01", "set rightTopImageLayoutFirst onClick");
                    onClickSectionListener.onClick("RIGHT_TOP_IMAGE");
                    Section4_5Card_01.this.i();
                }
            });
        }
        ImageView imageView = this.bd;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.Section4_5Card_01.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("Section_Section4_5Card_01", "set rightTopImageSecond onClick");
                    onClickSectionListener.onClick("RIGHT_TOP_IMAGE_SECOND");
                }
            });
        }
        HealthTextView healthTextView = this.o;
        if (healthTextView != null) {
            healthTextView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.Section4_5Card_01.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("Section_Section4_5Card_01", "set guideBubbleText onClick");
                    onClickSectionListener.onClick("GUIDE_BUBBLE_TEXT");
                }
            });
        }
        ImageView imageView2 = this.af;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.Section4_5Card_01.12
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("Section_Section4_5Card_01", "set cancelBubbleText onClick");
                    onClickSectionListener.onClick("CANCEL_GUIDE_BUBBLE_TEXT");
                    if (Section4_5Card_01.this.aa != null) {
                        Section4_5Card_01.this.aa.setVisibility(8);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.ag == null && this.ae == null) {
            return;
        }
        View view = this.ae;
        if (view != null) {
            view.setVisibility(8);
        }
        PopupWindow popupWindow = this.ag;
        if (popupWindow != null) {
            popupWindow.dismiss();
            this.ag = null;
        }
        lua.d(Integer.toString(10000), "exp_guide_bubble", true);
    }

    private StateListDrawable c(int i, int i2) {
        LogUtil.a("Section_Section4_5Card_01", "addStateDrawable");
        Resources resources = this.z.getResources();
        if (resources != null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawable = i == -1 ? null : resources.getDrawable(i, null);
            Drawable drawable2 = i2 != -1 ? resources.getDrawable(i2, null) : null;
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled}, drawable2);
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, drawable2);
            stateListDrawable.addState(new int[]{android.R.attr.state_enabled}, drawable);
            stateListDrawable.addState(new int[0], drawable);
            return stateListDrawable;
        }
        LogUtil.a("Section_Section4_5Card_01", "get StateListDrawable fail");
        return null;
    }

    private void setDarkModeColor(boolean z) {
        if (z) {
            int i = qqs.e(this.z) ? R.drawable.sport_tab_arrow_right_white : R.drawable.sport_tab_arrow_right;
            this.t.setImageResource(i);
            this.s.setImageResource(i);
        } else {
            int color = this.z.getResources().getColor(R.color.textColorPrimaryNoInverse);
            this.bq.setTextColor(color);
            this.bo.setTextColor(color);
            this.bj.setTextColor(color);
            this.bm.setTextColor(color);
        }
    }

    private void e() {
        if (qqs.c()) {
            setFlymeTextStyle(this.bq);
            setFlymeTextStyle(this.bo);
            setFlymeTextStyle(this.bj);
            setFlymeTextStyle(this.bm);
            ImageView imageView = this.t;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.sport_tab_arrow_right_flyme);
            }
            ImageView imageView2 = this.s;
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.sport_tab_arrow_right_flyme);
            }
        }
    }

    private void setFlymeTextStyle(HealthTextView healthTextView) {
        if (healthTextView == null) {
            return;
        }
        healthTextView.setTextColor(qre.e(R.color.flyme_sport_tab_text_color));
    }

    private void h() {
        if (this.aj == null) {
            LogUtil.j("Section_Section4_5Card_01", "initView mainView is null, start to inflate");
            this.aj = LayoutInflater.from(this.z).inflate(R.layout.section4_5card_layout, (ViewGroup) this, false);
        }
        if (this.r == null) {
            this.r = new HealthColumnSystem(this.z, 1);
        }
        c(this.aj);
        l();
        c();
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(BaseApplication.getContext().getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf");
        this.bq.setTypeface(typefaceCreateFromAsset);
        this.bo.setTypeface(typefaceCreateFromAsset);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("Section_Section4_5Card_01", "loadView");
        this.z = context;
        h();
        if (fua.f()) {
            getKnitFragment().setRecyclerViewDescendantFocusability(ARImageMetadata.HOT_PIXEL_MODE);
        }
        return this.aj;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.common_middle_click_view || id == R.id.common_middle_click_view_fitness || id == R.id.common_middle_fitness_accessibility) {
            onClick("ACCUMULATED_DURATION_CLICK_VIEW");
            return;
        }
        if (id == R.id.common_card_button || id == R.id.common_card_button_fitness) {
            onClick("BUTTON_TEXT");
        } else if (id == R.id.auxiliary_card_button) {
            onClick("AUXILIARY_BUTTON_TEXT");
        } else {
            LogUtil.a("Section_Section4_5Card_01", "onClick viewId ", Integer.valueOf(id));
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        List<Object> list = this.j;
        if (list != null && list.size() == 2) {
            if (qrs.af(this.z)) {
                LogUtil.a("Section_Section4_5Card_01", "start to loadRoundRectangle tahitiBackground");
                aa(this.j.get(1));
            } else {
                LogUtil.a("Section_Section4_5Card_01", "start to loadRoundRectangle background");
                aa(this.j.get(0));
            }
        }
        LinearLayout linearLayout = this.bg;
        if (linearLayout != null && this.q && this.p) {
            a((View) linearLayout);
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section_Section4_5Card_01";
    }

    private void o() {
        float dimension;
        if (this.w.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.w.getLayoutParams();
            layoutParams.height = qrs.d(this.z, 80.0f);
            layoutParams.width = qrs.d(this.z, 80.0f);
            if (qrs.af(this.z)) {
                dimension = qrs.d(this.z, 56.0f);
            } else {
                dimension = getResources().getDimension(R.dimen.elementsMarginVerticalM);
            }
            layoutParams.setMarginEnd((int) dimension);
            layoutParams.bottomMargin = qrs.d(this.z, 14.0f);
            return;
        }
        LogUtil.a("Section_Section4_5Card_01", "rightLayout type error");
    }

    private void k() {
        float dimension;
        if (this.bc.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.bc.getLayoutParams();
            layoutParams.height = qrs.d(this.z, 80.0f);
            layoutParams.width = qrs.d(this.z, 80.0f);
            if (qrs.af(this.z)) {
                dimension = qrs.d(this.z, 56.0f);
            } else {
                dimension = getResources().getDimension(R.dimen.elementsMarginVerticalM);
            }
            layoutParams.setMarginStart((int) dimension);
            layoutParams.bottomMargin = qrs.d(this.z, 14.0f);
            return;
        }
        LogUtil.a("Section_Section4_5Card_01", "rightLayout type error");
    }

    private void m() {
        float dimension;
        if (this.bc.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.bc.getLayoutParams();
            layoutParams.width = qrs.d(this.z, 56.0f);
            layoutParams.height = qrs.d(this.z, 56.0f);
            if (qrs.af(this.z)) {
                dimension = qrs.d(this.z, 56.0f);
            } else {
                dimension = getResources().getDimension(R.dimen.elementsMarginVerticalM);
            }
            layoutParams.setMarginStart(((int) dimension) + qrs.d(this.z, 12.0f));
            layoutParams.bottomMargin = qrs.d(this.z, 28.0f);
            this.bc.setLayoutParams(layoutParams);
        }
    }

    private void c() {
        if (LanguageUtil.ab(this.z)) {
            this.bj.setTextSize(0, qrs.d(this.z, 12.0f));
            this.bm.setTextSize(0, qrs.d(this.z, 12.0f));
        }
    }

    private void setLayoutClickListener(final OnClickSectionListener onClickSectionListener) {
        HealthButton healthButton = this.m;
        if (healthButton != null) {
            healthButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.Section4_5Card_01.15
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("Section_Section4_5Card_01", "set goalButton onClick");
                    onClickSectionListener.onClick("GOAL_BUTTON");
                }
            });
        }
        LinearLayout linearLayout = this.w;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.Section4_5Card_01.13
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    onClickSectionListener.onClick("LEFT_IMAGEVIEW");
                    if (Section4_5Card_01.this.w == null || Section4_5Card_01.this.v == null || Section4_5Card_01.this.v.size() < 2) {
                        return;
                    }
                    LogUtil.a("Section_Section4_5Card_01", "start to change left button image");
                    if (Section4_5Card_01.this.y || Section4_5Card_01.this.v.get(1) == null || !(Section4_5Card_01.this.v.get(1) instanceof Integer)) {
                        if (Section4_5Card_01.this.y && Section4_5Card_01.this.v.get(0) != null && (Section4_5Card_01.this.v.get(0) instanceof Integer)) {
                            Section4_5Card_01.this.y = false;
                            return;
                        } else {
                            LogUtil.a("Section_Section4_5Card_01", "left button setImageResource fail");
                            return;
                        }
                    }
                    Section4_5Card_01.this.y = true;
                }
            });
        }
        ImageView imageView = this.as;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.Section4_5Card_01.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("Section_Section4_5Card_01", "set middleButton onClick");
                    onClickSectionListener.onClick("MIDDLE_IMAGEVIEW");
                }
            });
        }
        setRightClick(onClickSectionListener);
    }

    private void setRightClick(final OnClickSectionListener onClickSectionListener) {
        LinearLayout linearLayout = this.bc;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.Section4_5Card_01.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    onClickSectionListener.onClick("RIGHT_IMAGEVIEW");
                    if (Section4_5Card_01.this.bc == null || Section4_5Card_01.this.aw == null || Section4_5Card_01.this.aw.size() < 2) {
                        return;
                    }
                    LogUtil.a("Section_Section4_5Card_01", "start to change right button image");
                    if (Section4_5Card_01.this.ax || Section4_5Card_01.this.aw.get(1) == null || !(Section4_5Card_01.this.aw.get(1) instanceof Integer)) {
                        if (Section4_5Card_01.this.ax && Section4_5Card_01.this.aw.get(0) != null && (Section4_5Card_01.this.aw.get(0) instanceof Integer)) {
                            Section4_5Card_01.this.ax = false;
                            return;
                        } else {
                            LogUtil.a("Section_Section4_5Card_01", "right button setImageResource fail");
                            return;
                        }
                    }
                    Section4_5Card_01.this.ax = true;
                }
            });
        }
    }

    private void setFitnessButtonClick(final OnClickSectionListener onClickSectionListener) {
        HealthButton healthButton = this.h;
        if (healthButton != null) {
            healthButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.Section4_5Card_01.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("Section_Section4_5Card_01", "set buttonFitness onClick");
                    onClickSectionListener.onClick("BUTTON_TEXT");
                }
            });
        }
    }

    private void c(View view) {
        this.ap = (RelativeLayout) view.findViewById(R.id.normal_view);
        this.ao = (RelativeLayout) view.findViewById(R.id.normal_view_fitness);
        HealthImageView healthImageView = (HealthImageView) view.findViewById(R.id.common_background);
        this.g = healthImageView;
        healthImageView.setOutlineProvider(this.an);
        this.g.setClipToOutline(true);
        HealthImageView healthImageView2 = (HealthImageView) view.findViewById(R.id.common_background_fitness);
        this.f = healthImageView2;
        healthImageView2.setOutlineProvider(this.an);
        this.f.setClipToOutline(true);
        if (LanguageUtil.ba(getContext())) {
            this.g.setRotationY(180.0f);
            this.f.setRotationY(180.0f);
        }
        this.bq = (HealthTextView) view.findViewById(R.id.common_card_title);
        this.bo = (HealthTextView) view.findViewById(R.id.common_card_title_fitness);
        this.bj = (HealthTextView) view.findViewById(R.id.common_card_subtitle);
        this.bm = (HealthTextView) view.findViewById(R.id.common_card_subtitle_fitness);
        this.t = (ImageView) view.findViewById(R.id.common_accumulated_duration_arrow);
        this.s = (ImageView) view.findViewById(R.id.common_accumulated_duration_arrow_fitness);
        if (LanguageUtil.ba(getContext())) {
            this.t.setRotationY(180.0f);
            this.s.setRotationY(180.0f);
        }
        this.o = (HealthTextView) view.findViewById(R.id.guide_bubble_textview);
        this.aa = (RelativeLayout) view.findViewById(R.id.cancel_guide_bubble);
        this.af = (ImageView) view.findViewById(R.id.never_tips);
        this.ac = (HealthTextView) view.findViewById(R.id.cancel_guide_bubble_text);
        this.bl = view.findViewById(R.id.common_middle_click_view);
        this.ak = view.findViewById(R.id.common_middle_fitness_accessibility);
        this.bk = (LinearLayout) view.findViewById(R.id.subtitle_arrow_area_fitness);
        this.al = (ImageView) view.findViewById(R.id.marker_image);
        this.aq = (ImageView) view.findViewById(R.id.marker_image_fitness);
        this.ad = (HealthTextView) view.findViewById(R.id.advertisement);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ReleaseLogUtil.c("Section_Section4_5Card_01", "onAttachedToWindow");
        lrd.c(this.am);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ReleaseLogUtil.c("Section_Section4_5Card_01", "onDetachedFromWindow");
        lrd.b(this.am);
    }

    private void l() {
        if (qrs.v()) {
            qsp.b((TextView) this.bq, 56.0f);
            qsp.b((TextView) this.bo, 56.0f);
            qsp.b((TextView) this.bj, 28.0f);
            qsp.b((TextView) this.bm, 28.0f);
            HealthButton healthButton = this.m;
            if (healthButton != null) {
                healthButton.setAutoTextInfo(17, 1, 1);
                if (this.m.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.m.getLayoutParams();
                    layoutParams.height = -2;
                    this.m.setLayoutParams(layoutParams);
                }
            }
            HealthButton healthButton2 = this.h;
            if (healthButton2 != null) {
                healthButton2.setAutoTextInfo(17, 1, 1);
                this.h.setPadding(0, qrs.d(BaseApplication.getContext(), -3.0f), 0, 0);
            }
        }
    }

    static class a implements AccessibilityManager.TouchExplorationStateChangeListener {
        private final WeakReference<Section4_5Card_01> e;

        a(Section4_5Card_01 section4_5Card_01) {
            this.e = new WeakReference<>(section4_5Card_01);
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            Section4_5Card_01 section4_5Card_01 = this.e.get();
            if (section4_5Card_01 == null) {
                ReleaseLogUtil.d("Section_Section4_5Card_01", "TouchExplorationStateChangeListener onTouchExplorationStateChanged section is null");
            } else {
                LogUtil.a("Section_Section4_5Card_01", "TouchExplorationStateChangeListener onTouchExplorationStateChanged enabled ", Boolean.valueOf(z));
                section4_5Card_01.setContentDescription(z);
            }
        }
    }
}
