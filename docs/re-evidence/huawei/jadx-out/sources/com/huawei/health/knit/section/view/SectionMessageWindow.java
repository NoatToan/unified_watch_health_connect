package com.huawei.health.knit.section.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.activetips.ActiveTipsView;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.utils.ScrollUtil;
import defpackage.fts;
import defpackage.qqf;
import defpackage.qqw;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionMessageWindow extends BaseSection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f7837c = (int) BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_8dp);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f7838a;
    private HealthTextView aa;
    private ImageView ab;
    private HealthTextView ac;
    private String ad;
    private ImageView ae;
    private HealthTextView af;
    private ImageView ag;
    private HealthTextView ah;
    private HealthSubHeader ai;
    private HealthTextView al;
    private HealthCardView am;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<String, Object> f7839b;
    private HealthTextView d;
    private boolean e;
    private Context f;
    private HealthCardView g;
    private HealthScrollView h;
    private boolean i;
    private ActiveTipsView j;
    private HealthTextView k;
    private HealthCardView l;
    private boolean m;
    private boolean n;
    private LinearLayout o;
    private HealthTextView p;
    private HealthTextView q;
    private ImageView r;
    private ImageView s;
    private HealthTextView t;
    private b u;
    private HealthCardView v;
    private View w;
    private LinearLayout x;
    private OnClickSectionListener y;
    private HealthTextView z;

    public SectionMessageWindow(Context context) {
        super(context);
        this.ad = "";
        this.e = false;
        this.i = false;
        this.f7839b = new HashMap<>();
    }

    public SectionMessageWindow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ad = "";
        this.e = false;
        this.i = false;
        this.f7839b = new HashMap<>();
    }

    public SectionMessageWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ad = "";
        this.e = false;
        this.i = false;
        this.f7839b = new HashMap<>();
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("SectionMessageWindow", "onCreateView");
        this.f = context;
        d();
        return this.w;
    }

    private void d() {
        View viewInflate = LayoutInflater.from(this.f).inflate(R.layout.section_message_window, (ViewGroup) this, false);
        this.w = viewInflate;
        this.am = (HealthCardView) viewInflate.findViewById(R.id.section_window_root);
        this.z = (HealthTextView) this.w.findViewById(R.id.doctor_icon);
        this.ah = (HealthTextView) this.w.findViewById(R.id.doctor_name);
        this.d = (HealthTextView) this.w.findViewById(R.id.doctor_describe);
        this.aa = (HealthTextView) this.w.findViewById(R.id.doctor_message);
        this.f7838a = (HealthTextView) this.w.findViewById(R.id.doctor_button);
        this.ab = (ImageView) this.w.findViewById(R.id.doctor_avatar);
        this.ae = (ImageView) this.w.findViewById(R.id.message_picture);
        this.o = (LinearLayout) this.w.findViewById(R.id.health_model_not_sign_doctor_container);
        this.r = (ImageView) this.w.findViewById(R.id.not_sign_doctor);
        this.q = (HealthTextView) this.w.findViewById(R.id.no_doctor_message);
        if (qrs.u()) {
            this.q.setTextSize(1, 14.0f);
        }
        this.k = (HealthTextView) this.w.findViewById(R.id.no_doctor_button);
        this.v = (HealthCardView) this.w.findViewById(R.id.section_window_not_sign_doctor);
        this.j = (ActiveTipsView) this.w.findViewById(R.id.active_tips_view);
        this.h = getKnitFragment().getHealthScrollView();
        HealthCardView healthCardView = (HealthCardView) this.w.findViewById(R.id.section_challenge_plan_view);
        this.g = healthCardView;
        healthCardView.post(new Runnable() { // from class: fvy
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a();
            }
        });
        this.l = (HealthCardView) this.w.findViewById(R.id.section_measure_plan_view);
        this.t = (HealthTextView) this.w.findViewById(R.id.section_right_button_description_top);
        this.p = (HealthTextView) this.w.findViewById(R.id.section_right_button_description_bottom);
        this.s = (ImageView) this.w.findViewById(R.id.section_right_button_icon);
        HealthSubHeader healthSubHeader = (HealthSubHeader) this.w.findViewById(R.id.section_sub_header);
        this.ai = healthSubHeader;
        healthSubHeader.setGuideLine();
        this.ag = (ImageView) this.w.findViewById(R.id.section_icon);
        this.af = (HealthTextView) this.w.findViewById(R.id.section_description_top);
        this.ac = (HealthTextView) this.w.findViewById(R.id.section_description_bottom);
        this.x = (LinearLayout) this.w.findViewById(R.id.weekly_report_entrance);
        this.al = (HealthTextView) this.w.findViewById(R.id.weekly_report_text);
        this.v.setVisibility(8);
        ((LinearLayout) this.w.findViewById(R.id.measure_plan_card_layout)).setVisibility(8);
    }

    public /* synthetic */ void a() {
        this.g.setMinimumWidth(qrs.i(this.f));
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("SectionMessageWindow", "start to bindViewParams");
        if (map == null || map.size() == 0) {
            LogUtil.e("SectionMessageWindow", "no need to bind");
            return;
        }
        qsp.b(this.z, qqw.d((Map) map, "RIGHT_ICON_TEXT", ""));
        qsp.c((View) this.z, (Drawable) qqw.a(map, "RIGHT_ICON_IMAGE", (Class<Object>) Drawable.class, (Object) null));
        qsp.c(this.ae, (Drawable) qqw.a(map, "MIDDLE_ICON_IMAGE", (Class<Object>) Drawable.class, (Object) null));
        qsp.b(this.aa, qqw.d((Map) map, "GUIDE_BUBBLE_TEXT", ""));
        qsp.b(this.f7838a, qqw.d((Map) map, "ITEM_BUTTON_TEXT", ""));
        if (!LanguageUtil.l(this.f) || !LanguageUtil.q(this.f)) {
            this.f7838a.setAllCaps(true);
        }
        qsp.b(this.t, qqw.d((Map) map, "RIGHT_BUTTON_TOP_DES", ""));
        qsp.b(this.p, qqw.d((Map) map, "RIGHT_BUTTON_BOTTOM_DES", ""));
        qsp.a(this.s, qqw.c(map, "RIGHT_BUTTON_IMAGE", (Drawable) null));
        b bVar = (b) qqw.a(map, "TOP_CARD_BEAN", (Class<Object>) b.class, (Object) null);
        this.u = bVar;
        if (bVar != null) {
            qsp.b(this.ah, bVar.c());
            qsp.b(this.d, this.u.e());
            this.m = this.u.d();
            boolean zB = this.u.b();
            this.n = zB;
            LogUtil.a("SectionMessageWindow", "mIsJoindPrivilege is ：", Boolean.valueOf(this.m), "mIsShowHasDoctorCardType is ：", Boolean.valueOf(zB));
        }
        c();
        this.y = (OnClickSectionListener) qqw.a(map, "CLICK_EVENT_LISTENER", (Class<Object>) OnClickSectionListener.class, (Object) null);
        b();
        setDoctorCardType(map);
        this.i = !fts.d(map, this.f7839b);
        this.f7839b.putAll(map);
        if (this.i) {
            setViewData(map);
        }
        e(map);
    }

    private void e(HashMap<String, Object> map) {
        LogUtil.a("SectionMessageWindow", "bindBannerView");
        if (map == null || map.size() == 0) {
            LogUtil.a("SectionMessageWindow", "no need to bind");
            return;
        }
        LogUtil.a("SectionMessageWindow", "isShowBanner: " + qqw.a(map, "IS_REMIND_SHOW", false) + ", mActiveTipsView visibility: " + this.j.getVisibility());
        this.j.setVisibility(8);
    }

    public void setActiveTipsViewVisibleFocusListener() {
        HealthScrollView healthScrollView = this.h;
        if (healthScrollView != null) {
            healthScrollView.setScrollChangeOtherListener(new HealthScrollView.ScrollChangeOtherListener() { // from class: com.huawei.health.knit.section.view.SectionMessageWindow.2
                @Override // com.huawei.ui.commonui.scrollview.HealthScrollView.ScrollChangeOtherListener
                public void scrollChangeOtherListener() {
                    boolean zB = ScrollUtil.b(SectionMessageWindow.this.h, SectionMessageWindow.this.j);
                    LogUtil.a("SectionMessageWindow", "setActiveTipsViewVisibleFocusListener isVisibleArea = ", Boolean.valueOf(zB));
                    SectionMessageWindow.this.j.setSelected(zB);
                }
            });
        } else {
            LogUtil.e("SectionMessageWindow", "setActiveTipsViewVisibleFocusListener mHealthScrollView is null");
        }
    }

    private void c() {
        b bVar = this.u;
        if (bVar == null) {
            LogUtil.a("SectionMessageWindow", "setDoctorImg mTopCardBean is null");
            return;
        }
        String strA = bVar.a();
        if (strA.length() <= 0 || strA.equals(this.ad)) {
            return;
        }
        qqf.b(this.ab, strA, f7837c, 0, 0);
        this.ad = strA;
    }

    private void setDoctorCardType(HashMap<String, Object> map) {
        this.z.setVisibility(4);
        if (this.m) {
            LogUtil.a("SectionMessageWindow", "has bind doctor");
            qsp.c((View) this.ai, 0);
            if (this.n) {
                this.v.setVisibility(8);
                this.am.setVisibility(0);
                return;
            }
            this.v.setVisibility(0);
            this.am.setVisibility(8);
            this.r.setImageResource(R.drawable.health_no_doctor_picture);
            qsp.b(this.k, qqw.d((Map) map, "ITEM_BUTTON_TEXT", ""));
            qsp.b(this.q, qqw.d((Map) map, "GUIDE_BUBBLE_TEXT", ""));
            return;
        }
        LogUtil.a("SectionMessageWindow", "has not bind doctor");
        qsp.c((View) this.ai, 8);
        this.am.setVisibility(8);
        this.v.setVisibility(8);
    }

    private boolean b(HashMap<String, Object> map) {
        return map.containsKey("IS_LOAD_DEFAULT_VIEW") && (map.get("IS_LOAD_DEFAULT_VIEW") instanceof Boolean) && ((Boolean) map.get("IS_LOAD_DEFAULT_VIEW")).booleanValue();
    }

    private void setViewData(HashMap<String, Object> map) {
        qsp.c((View) this.ai, 0);
        qsp.d(this.ai, 0, qqw.d((Map) map, "TITLE", ""), 8, 8);
        qsp.a(this.ag, (Drawable) qqw.a(map, "LEFT_ICON_IMAGE", (Class<Object>) Drawable.class, (Object) null));
        qsp.b(this.al, qqw.d((Map) map, "BUTTON_TEXT", ""));
        setWeeklyReport(map);
        if (TextUtils.isEmpty(qqw.d((Map) map, "BUTTON_TEXT", ""))) {
            qsp.c((View) this.x, 8);
            qsp.c((View) this.al, 8);
            qsp.c((View) this.ac, 0);
        } else {
            qsp.c((View) this.x, 0);
            qsp.c((View) this.al, 0);
            qsp.c((View) this.ac, 8);
        }
    }

    private void setWeeklyReport(HashMap<String, Object> map) {
        LogUtil.a("SectionMessageWindow", "setSectionButton");
        if (b(map)) {
            qsp.b(this.af, qqw.d((Map) map, "ITEM_DESCRIPTION", ""));
        } else {
            Object objB = qqw.b(map, "ITEM_DESCRIPTION", null);
            if (objB instanceof SpannableString) {
                SpannableString spannableString = (SpannableString) objB;
                if (spannableString.length() != 0) {
                    qsp.b(this.af, spannableString);
                } else {
                    qsp.b(this.af, "");
                }
            } else if (objB instanceof String) {
                qsp.b(this.af, (String) objB);
            } else {
                qsp.b(this.af, "");
            }
        }
        qsp.b(this.ac, qqw.d((Map) map, "ITEM_DESCRIPTION_BOTTOM", ""));
    }

    private void b() {
        HealthCardView healthCardView = this.g;
        if (healthCardView != null) {
            healthCardView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionMessageWindow.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("SectionMessageWindow", "joined or has doctor plan");
                    SectionMessageWindow.this.y.onClick("ALL_CLICK_EVENT");
                }
            });
        }
        LinearLayout linearLayout = this.x;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionMessageWindow.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("SectionMessageWindow", "set button weekly report");
                    SectionMessageWindow.this.y.onClick("BUTTON_CLICK_EVENT");
                }
            });
        }
        HealthCardView healthCardView2 = this.l;
        if (healthCardView2 != null) {
            healthCardView2.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionMessageWindow.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    SectionMessageWindow.this.y.onClick("MEASURE_PLAN_BUTTON_CLICK_EVENT");
                }
            });
        }
        HealthCardView healthCardView3 = this.am;
        if (healthCardView3 != null) {
            healthCardView3.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionMessageWindow.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    SectionMessageWindow.this.y.onClick("DOCTOR_BUTTON_CLICK_EVENT");
                }
            });
        }
        ActiveTipsView activeTipsView = this.j;
        if (activeTipsView != null) {
            activeTipsView.setClickBannerListener(new View.OnClickListener() { // from class: fvw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34625c.c(view);
                }
            });
        }
        HealthCardView healthCardView4 = this.v;
        if (healthCardView4 != null) {
            healthCardView4.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionMessageWindow.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    SectionMessageWindow.this.y.onClick("RIGHT_BOTTOM_TEXT");
                }
            });
        }
    }

    public /* synthetic */ void c(View view) {
        this.y.onClick("BANNER_CARD_SUBMIT_CLICK_EVENT");
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionMessageWindow";
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f7844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f7845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f7846c;
        private boolean d;
        private boolean e;

        public boolean c(b bVar) {
            if (bVar != null) {
                return this.f7844a.equals(bVar.f7844a) && this.f7845b.equals(bVar.f7845b) && this.f7846c.equals(bVar.f7846c) && this.e == bVar.e && this.d == bVar.d;
            }
            LogUtil.a("SectionMessageWindow", "topCardBean is null");
            return false;
        }

        public String c() {
            return this.f7844a;
        }

        public void a(String str) {
            this.f7844a = str;
        }

        public String e() {
            return this.f7845b;
        }

        public void d(String str) {
            this.f7845b = str;
        }

        public String a() {
            return this.f7846c;
        }

        public void c(String str) {
            this.f7846c = str;
        }

        public boolean d() {
            return this.d;
        }

        public void a(boolean z) {
            this.d = z;
        }

        public boolean b() {
            return this.e;
        }

        public void c(boolean z) {
            this.e = z;
        }
    }
}
