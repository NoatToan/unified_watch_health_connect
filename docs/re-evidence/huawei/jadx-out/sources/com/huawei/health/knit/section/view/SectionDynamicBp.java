package com.huawei.health.knit.section.view;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.health.bloodpressure.constant.DynamicBpStatus;
import com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.seekbar.HealthSeekBarExtend;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.lmf;
import defpackage.qqw;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionDynamicBp extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f7776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f7777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f7778c;
    private HealthTextView d;
    private HealthCardView e;
    private Context f;
    private View g;
    private HealthTextView h;
    private HealthTextView i;
    private HealthTextView j;
    private LinearLayout k;
    private HealthImageView l;
    private FrameLayout m;
    private RelativeLayout n;
    private LinearLayout o;
    private Typeface p;
    private View q;
    private Map<String, Object> r;
    private ImageView s;
    private HealthTextView t;
    private HealthProgressBar u;
    private HealthSeekBarExtend v;
    private HealthTextView w;
    private HealthTextView x;
    private HealthSubHeader y;

    public SectionDynamicBp(Context context) {
        super(context);
        this.r = new HashMap();
    }

    public SectionDynamicBp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r = new HashMap();
    }

    public SectionDynamicBp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.r = new HashMap();
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        this.f = context;
        d();
        return this.q;
    }

    private void d() {
        View viewInflate = LayoutInflater.from(this.f).inflate(R.layout.section_dynamic_bloodpressure, (ViewGroup) this, false);
        this.q = viewInflate;
        this.y = (HealthSubHeader) viewInflate.findViewById(R.id.section_blood_pressure_dynamic_sub_header);
        this.f7776a = (ImageView) this.q.findViewById(R.id.dynamic_head_arrow);
        this.x = (HealthTextView) this.q.findViewById(R.id.dynamic_head_subtitle);
        this.v = (HealthSeekBarExtend) this.q.findViewById(R.id.dynamic_seek_bar_extend);
        this.u = (HealthProgressBar) this.q.findViewById(R.id.dynamic_progress_bar);
        this.k = (LinearLayout) this.q.findViewById(R.id.dynamic_plan_progress_layout);
        this.n = (RelativeLayout) this.q.findViewById(R.id.dynamic_content_layout);
        this.f7778c = (HealthTextView) this.q.findViewById(R.id.dynamic_content_desc);
        this.d = (HealthTextView) this.q.findViewById(R.id.dynamic_bottom_des_one);
        this.f7777b = (HealthTextView) this.q.findViewById(R.id.dynamic_bottom_des_two);
        this.t = (HealthTextView) this.q.findViewById(R.id.dynamic_head_date);
        this.h = (HealthTextView) this.q.findViewById(R.id.dynamic_content_value);
        this.j = (HealthTextView) this.q.findViewById(R.id.dynamic_content_unit);
        this.i = (HealthTextView) this.q.findViewById(R.id.dynamic_content_level);
        this.g = this.q.findViewById(R.id.dynamic_content_divide_line);
        this.w = (HealthTextView) this.q.findViewById(R.id.dynamic_plan_progress);
        this.e = (HealthCardView) this.q.findViewById(R.id.dynamic_bp_cardview);
        this.s = (ImageView) this.q.findViewById(R.id.dynamic_head_pic);
        this.l = (HealthImageView) this.q.findViewById(R.id.dynamic_red_dot);
        this.o = (LinearLayout) this.q.findViewById(R.id.dynamic_content_left);
        this.m = (FrameLayout) this.q.findViewById(R.id.dynamic_chart);
        a();
        e();
    }

    private void a() {
        if (LanguageUtil.t(this.f) || LanguageUtil.v(this.f) || LanguageUtil.ax(this.f) || LanguageUtil.ai(this.f) || LanguageUtil.u(this.f) || LanguageUtil.h(this.f) || LanguageUtil.at(this.f)) {
            this.x.setTextSize(1, 12.0f);
            this.t.setTextSize(1, 12.0f);
        } else if (LanguageUtil.f(this.f) || LanguageUtil.bs(this.f) || LanguageUtil.x(this.f)) {
            this.x.setTextSize(1, 16.0f);
        }
    }

    private void e() {
        if (qrs.y()) {
            this.h.setTextSize(1, 22.0f);
            this.j.setTextSize(1, 18.0f);
            this.i.setTextSize(1, 16.0f);
            this.x.setTextSize(1, 16.0f);
            this.t.setTextSize(1, 14.0f);
            this.o.setOrientation(1);
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionDynamicBp";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("SectionDynamicBp", "start to bindViewParams");
        if (map == null || map.size() == 0) {
            LogUtil.e("SectionDynamicBp", "currentParams is empty");
            return;
        }
        b();
        d(map);
        DynamicBpStatus dynamicBpStatus = (DynamicBpStatus) qqw.a(map, "PLAN_STATUS", (Class<DynamicBpStatus>) DynamicBpStatus.class, DynamicBpStatus.NO_PLAN_DATA);
        LogUtil.a("SectionDynamicBp", "planType: ", dynamicBpStatus);
        switch (AnonymousClass1.d[dynamicBpStatus.ordinal()]) {
            case 1:
                qsp.c((View) this.n, 8);
                qsp.c((View) this.f7778c, 0);
                qsp.c((View) this.t, 8);
                qsp.b(this.f7778c, qqw.d((Map) map, "PLAN_DESC", ""));
                break;
            case 2:
                setFuturePlanView(map);
                break;
            case 3:
                setNoValidDataView(map);
                break;
            case 4:
            case 5:
                qsp.c((View) this.f7777b, 0);
                qsp.b(this.f7777b, qqw.d((Map) map, "PLAN_DESC_TWO", ""));
            case 6:
                setCompletePlanView(map);
                break;
            case 7:
                setInProgressView(map);
                break;
            case 8:
                setNoDataView(map);
                break;
        }
        a(map);
    }

    /* JADX INFO: renamed from: com.huawei.health.knit.section.view.SectionDynamicBp$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[DynamicBpStatus.values().length];
            d = iArr;
            try {
                iArr[DynamicBpStatus.NO_PLAN_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[DynamicBpStatus.FUTURE_PLAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[DynamicBpStatus.FINISH_NO_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[DynamicBpStatus.NOT_ENOUGH_DATA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[DynamicBpStatus.PLAN_TERMINATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[DynamicBpStatus.COMPLETE_PLAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                d[DynamicBpStatus.PLAN_IN_PROGRESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                d[DynamicBpStatus.PLAN_IN_PROGRESS_NO_DATA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private void a(HashMap<String, Object> map) {
        LogUtil.a("SectionDynamicBp", "bindViewTreeObserver");
        Object objB = qqw.b(map, "READ_BIMAP", null);
        if (objB instanceof HashMap) {
            this.r = (HashMap) objB;
        }
        View view = this.q;
        ViewTreeVisibilityListener.c(view, new ViewTreeVisibilityListener(view, this));
    }

    private void d(HashMap<String, Object> map) {
        Object objB = qqw.b(map, "CLICK_EVENT_LISTENER", null);
        if (objB instanceof View.OnClickListener) {
            this.e.setOnClickListener((View.OnClickListener) objB);
        }
        qsp.d(this.y, 0, qqw.d((Map) map, "TITLE", ""), 8, 8);
        qsp.b(this.x, qqw.d((Map) map, "SUBTITLE", ""));
        this.f7776a.setImageResource(((Integer) qqw.a(map, "RIGHT_ICON", (Class<Object>) Integer.class, (Object) null)).intValue());
        this.s.setImageDrawable(qqw.c(map, "HEAD_PIC", (Drawable) null));
        qsp.b(this.t, qqw.d((Map) map, "PLAN_TIME", ""));
        this.l.setVisibility(8);
    }

    private void setCompletePlanView(HashMap<String, Object> map) {
        qsp.c((View) this.d, 0);
        qsp.c((View) this.v, 0);
        a(12, 15);
        setDataUnit(map);
        qsp.b(this.i, qqw.d((Map) map, "LEVEL", ""));
        qsp.c((TextView) this.i, this.f.getColor(qqw.c(map, "LEVEL_COLOR", R.color.dynamic_blood_pressure_normal)));
        qsp.b(this.d, qqw.d((Map) map, "PLAN_DESC_ONE", ""));
        this.l.setVisibility(((Boolean) qqw.a(map, "READ_STATUS", (Class<boolean>) Boolean.class, true)).booleanValue() ? 8 : 0);
        this.v.setProgress((int) qqw.e((Map) map, "PROGRESS", 0.0f));
    }

    private void a(int i, int i2) {
        FrameLayout frameLayout = this.m;
        if (frameLayout != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.removeRule(i);
            layoutParams.addRule(i2);
            this.m.setLayoutParams(layoutParams);
        }
    }

    private void setInProgressView(HashMap<String, Object> map) {
        qsp.c((View) this.d, 0);
        qsp.c((View) this.k, 0);
        a(15, 12);
        qsp.c(this.g, 8);
        qsp.c((View) this.i, 8);
        setDataUnit(map);
        qsp.b(this.d, qqw.d((Map) map, "PLAN_DESC_ONE", ""));
        this.u.setProgress(qqw.c(map, "PROGRESS", 0));
        qsp.b(this.w, qqw.d((Map) map, "PROGRESS_DESC", (CharSequence) ""));
    }

    private void setFuturePlanView(HashMap<String, Object> map) {
        qsp.c((View) this.n, 8);
        qsp.c((View) this.f7778c, 0);
        qsp.c((View) this.d, 0);
        qsp.b(this.f7778c, qqw.d((Map) map, "PLAN_DESC", ""));
        Typeface typefaceCreate = Typeface.create(this.f.getString(R.string.textFontFamilyMedium), 0);
        this.p = typefaceCreate;
        this.f7778c.setTypeface(typefaceCreate);
        qsp.b(this.d, qqw.d((Map) map, "FUTURE_PLAN_DESC", ""));
    }

    private void setNoDataView(HashMap<String, Object> map) {
        qsp.c((View) this.k, 0);
        a(15, 12);
        this.u.setProgress(qqw.c(map, "PROGRESS", 0));
        qsp.b(this.w, qqw.d((Map) map, "PROGRESS_DESC", (CharSequence) ""));
        qsp.b(this.h, qqw.d((Map) map, "VALUE", ""));
        qsp.b(this.j, qqw.d((Map) map, "UNIT", ""));
        qsp.c((View) this.i, 8);
        qsp.c(this.g, 8);
    }

    private void setNoValidDataView(HashMap<String, Object> map) {
        qsp.c((View) this.d, 0);
        setDataUnit(map);
        qsp.c((View) this.i, 8);
        qsp.c(this.g, 8);
        qsp.b(this.d, qqw.d((Map) map, "PLAN_DESC_ONE", ""));
    }

    private void b() {
        qsp.c((View) this.f7778c, 8);
        qsp.c((View) this.v, 8);
        qsp.c((View) this.k, 8);
        qsp.c((View) this.d, 8);
        qsp.c((View) this.f7777b, 8);
        qsp.c((View) this.t, 0);
        qsp.c((View) this.i, 0);
        qsp.c(this.g, 0);
        qsp.c((View) this.n, 0);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection, com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener.ViewTreeListenee
    public void biEvent() {
        e(0);
    }

    private void e(int i) {
        this.r.put("event", Integer.valueOf(i));
        LogUtil.a("SectionDynamicBp", "uploadBiEvent card , BLOOD_PRESSURE_DETAIL_2010025: ", this.r.toString());
        lmf.d().c(this.f, AnalyticsValue.HEALTH_HOME_BLOOD_PRESSURE_DETAIL_2010025.value(), this.r, 0);
    }

    private void setDataUnit(HashMap<String, Object> map) {
        CharSequence charSequenceD = qqw.d((Map) map, "UNIT", (CharSequence) "");
        CharSequence charSequenceD2 = qqw.d((Map) map, "VALUE", (CharSequence) "");
        if (TextUtils.isEmpty(charSequenceD)) {
            qsp.c((View) this.h, 8);
            qsp.b(this.j, charSequenceD2);
            return;
        }
        if (LanguageUtil.z(BaseApplication.getContext()) || LanguageUtil.bs(BaseApplication.getContext())) {
            if (qrs.y()) {
                this.j.setTextSize(1, 22.0f);
                this.h.setTextSize(1, 18.0f);
            } else {
                this.j.setTextSize(2, 18.0f);
                this.h.setTextSize(2, 12.0f);
            }
            this.j.setTextColor(this.f.getColor(R.color.textColorPrimary));
            qsp.b(this.j, charSequenceD2);
            this.h.setTextColor(this.f.getColor(R.color.textColorSecondary));
            qsp.b(this.h, charSequenceD);
            return;
        }
        qsp.b(this.h, charSequenceD2);
        qsp.b(this.j, charSequenceD);
        qsp.c((View) this.h, 0);
    }
}
