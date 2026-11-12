package com.huawei.health.knit.section.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.ratingbar.HealthStarRatingBar;
import defpackage.fts;
import defpackage.qqs;
import defpackage.qqw;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionScoring extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected LinearLayout f7907a;
    private HealthTextView aa;
    private LinearLayout ab;
    private HealthTextView ac;
    private ImageView ad;
    private HealthTextView ae;
    private HealthTextView af;
    private LinearLayout ag;
    private HealthTextView ah;
    private HealthStarRatingBar ai;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected HealthCardView f7908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected LinearLayout f7909c;
    protected boolean d;
    protected LinearLayout e;
    protected LinearLayout f;
    protected boolean g;
    protected LinearLayout h;
    protected boolean i;
    protected LinearLayout j;
    protected HealthTextView k;
    protected HealthTextView l;
    protected HealthTextView m;
    protected HealthTextView n;
    protected HealthTextView o;
    protected HealthTextView p;
    protected HealthTextView q;
    protected HealthTextView r;
    protected HealthTextView s;
    protected LinearLayout t;
    protected LinearLayout u;
    private HealthTextView v;
    protected LinearLayout w;
    protected HealthTextView x;
    private HealthTextView y;
    private HealthTextView z;

    public SectionScoring(Context context) {
        this(context, null);
    }

    public SectionScoring(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionScoring(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = false;
        this.d = false;
        this.g = false;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(final Context context) {
        LogUtil.a("Section_Scoring", "onCreateView");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_scoring_layout, (ViewGroup) this, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.section_root_view);
        this.ag = linearLayout;
        linearLayout.post(new Runnable() { // from class: fwh
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a(context);
            }
        });
        this.f7907a = (LinearLayout) viewInflate.findViewById(R.id.core_sleep_scoring_layout);
        this.w = (LinearLayout) viewInflate.findViewById(R.id.suggest_title_layout);
        HealthCardView healthCardView = (HealthCardView) viewInflate.findViewById(R.id.chart_layout);
        this.f7908b = healthCardView;
        healthCardView.setVisibility(8);
        this.t = (LinearLayout) viewInflate.findViewById(R.id.scoring_layout);
        this.u = (LinearLayout) viewInflate.findViewById(R.id.suggest_root_layout);
        this.f7909c = (LinearLayout) viewInflate.findViewById(R.id.detect_abnormal_layout);
        this.h = (LinearLayout) viewInflate.findViewById(R.id.level_layout);
        this.o = (HealthTextView) viewInflate.findViewById(R.id.level_title);
        this.l = (HealthTextView) viewInflate.findViewById(R.id.level_value);
        this.f = (LinearLayout) viewInflate.findViewById(R.id.level_layout_week_month);
        this.k = (HealthTextView) viewInflate.findViewById(R.id.level_title_week_month);
        this.q = (HealthTextView) viewInflate.findViewById(R.id.level_value_week_month);
        this.s = (HealthTextView) viewInflate.findViewById(R.id.scoring_title);
        this.r = (HealthTextView) viewInflate.findViewById(R.id.scoring_value);
        this.ae = (HealthTextView) viewInflate.findViewById(R.id.scoring_unit);
        this.ai = (HealthStarRatingBar) viewInflate.findViewById(R.id.scoring_rating);
        this.p = (HealthTextView) viewInflate.findViewById(R.id.scoring_desc);
        this.x = (HealthTextView) viewInflate.findViewById(R.id.suggest_title);
        this.af = (HealthTextView) viewInflate.findViewById(R.id.suggest_content);
        this.aa = (HealthTextView) viewInflate.findViewById(R.id.detect_abnormal);
        if (qqs.e(context)) {
            this.aa.setTextColor(context.getColor(R.color.common_white_60alpha));
        } else {
            this.aa.setTextColor(context.getColor(R.color.common_black_60alpha));
        }
        this.ab = (LinearLayout) viewInflate.findViewById(R.id.harvard_logo_layout);
        this.ad = (ImageView) viewInflate.findViewById(R.id.harvard_image);
        this.ah = (HealthTextView) viewInflate.findViewById(R.id.harvard_logo_text);
        this.e = (LinearLayout) viewInflate.findViewById(R.id.common_sleep_scoring_layout);
        this.z = (HealthTextView) viewInflate.findViewById(R.id.common_sleep_total_sleep_title);
        this.ac = (HealthTextView) viewInflate.findViewById(R.id.common_sleep_sleep_time);
        b();
        return viewInflate;
    }

    public /* synthetic */ void a(Context context) {
        this.ag.setMinimumWidth(qrs.i(context));
    }

    private void b() {
        if (LanguageUtil.bm(BaseApplication.getContext())) {
            this.x.setBreakStrategy(2);
            this.x.setHyphenationFrequency(2);
            this.af.setBreakStrategy(2);
            this.af.setHyphenationFrequency(2);
        }
    }

    private void c() {
        Context context = BaseApplication.getContext();
        if (LanguageUtil.av(context) || LanguageUtil.bd(context) || LanguageUtil.bn(context) || LanguageUtil.ao(context) || LanguageUtil.az(context) || LanguageUtil.bg(context) || LanguageUtil.k(context) || LanguageUtil.p(context) || LanguageUtil.as(context) || LanguageUtil.bq(context)) {
            this.n.setBreakStrategy(2);
            this.n.setHyphenationFrequency(2);
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("Section_Scoring", "bindParamsToView");
        this.f7909c.setVisibility(8);
        this.d = false;
        setLayoutVisible(map);
        setScoringContent(map);
        setHarvardContent(map);
        setSuggestContent(map);
        setCommonContent(map);
        setLevelContent(map);
        setDetectAbnormal(map);
    }

    protected void setLayoutVisible(Map<String, Object> map) {
        this.g = qqw.a(map, "IS_DATA_TYPE_DAY", false);
        e();
        Object obj = map.get("IS_CORE_SLEEP");
        if (obj instanceof Boolean) {
            d(((Boolean) obj).booleanValue());
        }
        Object obj2 = map.get("IS_PILLOW");
        if (obj2 instanceof Boolean) {
            this.i = ((Boolean) obj2).booleanValue();
            a();
        }
        Object obj3 = map.get("IS_PHONE_SLEEP");
        if (obj3 instanceof Boolean) {
            c(((Boolean) obj3).booleanValue());
        }
    }

    protected void e() {
        qsp.c((View) this.h, 8);
        qsp.c((View) this.f, 8);
        if (this.g) {
            this.j = this.h;
            this.m = this.o;
            this.n = this.l;
        } else {
            this.j = this.f;
            this.m = this.k;
            this.n = this.q;
        }
        c();
        LogUtil.a("Section_Scoring", "mIsDataTypeDay: ", Boolean.valueOf(this.g));
    }

    protected void setScoringContent(Map<String, Object> map) {
        HealthTextView healthTextView;
        HealthTextView healthTextView2;
        if (map.containsKey("SCORING_TITLE") && fts.j(map.get("SCORING_TITLE")) && (healthTextView2 = this.s) != null) {
            healthTextView2.setText((String) map.get("SCORING_TITLE"));
        }
        if (map.containsKey("SCORING_VALUE") && fts.j(map.get("SCORING_VALUE")) && (healthTextView = this.r) != null) {
            healthTextView.setText((String) map.get("SCORING_VALUE"));
            this.n.setText((CharSequence) null);
        }
        if (map.containsKey("SCORING_UNIT") && this.ae != null) {
            if (fts.j(map.get("SCORING_UNIT"))) {
                this.ae.setText((String) map.get("SCORING_UNIT"));
                this.ae.setVisibility(0);
            } else {
                this.ae.setVisibility(8);
            }
        }
        if (map.containsKey("SCORING_RATING") && this.ai != null) {
            if (fts.a(map.get("SCORING_RATING"))) {
                this.ai.setStar(((Integer) map.get("SCORING_RATING")).intValue());
                this.ai.setVisibility(0);
            } else {
                this.ai.setVisibility(8);
            }
        }
        if (!map.containsKey("SCORING_DESC") || this.p == null) {
            return;
        }
        if (fts.j(map.get("SCORING_DESC"))) {
            this.p.setText((String) map.get("SCORING_DESC"));
            this.p.setVisibility(0);
        } else {
            this.p.setVisibility(8);
        }
    }

    private void setHarvardContent(Map<String, Object> map) {
        if (map.containsKey("HARVARD_LOGO_TEXT") && this.ah != null && this.ab != null) {
            if (fts.j(map.get("HARVARD_LOGO_TEXT"))) {
                this.ah.setText((String) map.get("HARVARD_LOGO_TEXT"));
                this.ab.setVisibility(0);
            } else {
                this.ab.setVisibility(8);
            }
        }
        if (!map.containsKey("HARVARD_IMAGE") || this.ad == null) {
            return;
        }
        if (map.get("HARVARD_IMAGE") instanceof Drawable) {
            this.ad.setVisibility(0);
            this.ad.setImageDrawable((Drawable) map.get("HARVARD_IMAGE"));
        } else {
            this.ad.setVisibility(8);
        }
    }

    protected void setSuggestContent(Map<String, Object> map) {
        HealthTextView healthTextView;
        HealthTextView healthTextView2;
        if (map.containsKey("SUGGEST_TITLE") && fts.j(map.get("SUGGEST_TITLE")) && (healthTextView2 = this.x) != null) {
            healthTextView2.setText((String) map.get("SUGGEST_TITLE"));
        }
        if (map.containsKey("SUGGEST_CONTENT") && fts.j(map.get("SUGGEST_CONTENT")) && (healthTextView = this.af) != null) {
            healthTextView.setText((String) map.get("SUGGEST_CONTENT"));
        }
    }

    protected void setCommonContent(Map<String, Object> map) {
        HealthTextView healthTextView;
        HealthTextView healthTextView2;
        if (map.containsKey("COMMON_TITLE_TEXT") && fts.j(map.get("COMMON_TITLE_TEXT")) && (healthTextView2 = this.z) != null) {
            healthTextView2.setText((String) map.get("COMMON_TITLE_TEXT"));
        }
        if (map.containsKey("COMMON_SLEEP_TEXT") && fts.d(map.get("COMMON_SLEEP_TEXT")) && (healthTextView = this.ac) != null) {
            healthTextView.setText((SpannableString) map.get("COMMON_SLEEP_TEXT"));
            this.r.setText((CharSequence) null);
        }
    }

    protected void setLevelContent(Map<String, Object> map) {
        HealthTextView healthTextView;
        HealthTextView healthTextView2;
        HealthTextView healthTextView3;
        if (map.containsKey("LEVEL_TITLE") && fts.j(map.get("LEVEL_TITLE")) && (healthTextView3 = this.m) != null) {
            healthTextView3.setText((String) map.get("LEVEL_TITLE"));
        }
        if (map.containsKey("LEVEL_VALUE") && fts.j(map.get("LEVEL_VALUE")) && (healthTextView2 = this.n) != null) {
            healthTextView2.setText((String) map.get("LEVEL_VALUE"));
            this.r.setText((CharSequence) null);
        }
        if (map.containsKey("LEVEL_VALUE_COLOR") && fts.a(map.get("LEVEL_VALUE_COLOR")) && (healthTextView = this.n) != null) {
            healthTextView.setTextColor(((Integer) map.get("LEVEL_VALUE_COLOR")).intValue());
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    protected void setDetectAbnormal(final Map<String, Object> map) {
        HealthTextView healthTextView;
        if (map.containsKey("DETECT_ABNORMAL")) {
            Object obj = map.get("DETECT_ABNORMAL");
            this.d = true;
            this.f7909c.setVisibility(0);
            if (map.containsKey("DETECT_ABNORMAL_JUMP") && fts.j(map.get("DETECT_ABNORMAL_JUMP")) && fts.j(obj) && this.aa != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String str = (String) obj;
                spannableStringBuilder.append((CharSequence) str);
                spannableStringBuilder.append((CharSequence) map.get("DETECT_ABNORMAL_JUMP"));
                spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.huawei.health.knit.section.view.SectionScoring.1
                    @Override // android.text.style.ClickableSpan
                    public void onClick(View view) {
                        if (fts.e(map.get("CLICK_EVENT_LISTENER"))) {
                            ((OnClickSectionListener) map.get("CLICK_EVENT_LISTENER")).onClick("COMMON_CLICK_EVENT");
                        }
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public void updateDrawState(TextPaint textPaint) {
                        super.updateDrawState(textPaint);
                        textPaint.setUnderlineText(false);
                    }
                }, str.length(), str.length() + ((String) map.get("DETECT_ABNORMAL_JUMP")).length(), 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(BaseApplication.getContext().getColor(R.color.emui_accent)), str.length(), str.length() + ((String) map.get("DETECT_ABNORMAL_JUMP")).length(), 33);
                this.aa.setMovementMethod(LinkMovementMethod.getInstance());
                this.aa.setText(spannableStringBuilder);
                return;
            }
            if (!fts.j(obj) || (healthTextView = this.aa) == null) {
                return;
            }
            healthTextView.setText((String) obj);
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section_Scoring";
    }

    public void setSuggestRootLayoutVisibility(int i) {
        LinearLayout linearLayout = this.u;
        if (linearLayout != null) {
            if (this.i) {
                linearLayout.setVisibility(8);
                this.f7909c.setVisibility(8);
                return;
            }
            linearLayout.setVisibility(i);
            if (i == 0 && this.d) {
                this.f7909c.setVisibility(0);
            } else {
                this.f7909c.setVisibility(8);
            }
        }
    }

    public String getSleepScoring() {
        HealthTextView healthTextView = this.r;
        if (healthTextView != null) {
            return healthTextView.getText().toString().trim();
        }
        return "";
    }

    public String getSleepStatus() {
        HealthTextView healthTextView = this.n;
        if (healthTextView != null) {
            return healthTextView.getText().toString().trim();
        }
        return "";
    }

    public String getScoringDesc() {
        HealthTextView healthTextView = this.p;
        if (healthTextView != null) {
            return healthTextView.getText().toString().trim();
        }
        return "";
    }

    public String getSleepTimeHour() {
        HealthTextView healthTextView = this.v;
        if (healthTextView != null) {
            return healthTextView.getText().toString().trim();
        }
        return "";
    }

    public String getCommonSleepText() {
        HealthTextView healthTextView = this.ac;
        if (healthTextView != null) {
            return healthTextView.getText().toString().trim();
        }
        return "";
    }

    public String getSleepTimeMinute() {
        HealthTextView healthTextView = this.y;
        if (healthTextView != null) {
            return healthTextView.getText().toString().trim();
        }
        return "";
    }

    protected void d(boolean z) {
        LinearLayout linearLayout;
        HealthTextView healthTextView;
        LinearLayout linearLayout2 = this.f7907a;
        if (linearLayout2 == null || this.e == null || this.j == null || (linearLayout = this.t) == null) {
            return;
        }
        if (z) {
            linearLayout2.setVisibility(0);
            if (this.g && (healthTextView = this.s) != null) {
                healthTextView.setVisibility(8);
            }
            this.e.setVisibility(8);
            this.j.setVisibility(8);
            this.t.setVisibility(0);
            return;
        }
        linearLayout.setVisibility(8);
        this.f7907a.setVisibility(8);
        this.e.setVisibility(0);
    }

    protected void c(boolean z) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2 = this.f7907a;
        if (linearLayout2 == null || this.e == null || (linearLayout = this.j) == null || this.t == null) {
            return;
        }
        if (z) {
            linearLayout2.setVisibility(0);
            this.e.setVisibility(8);
            this.j.setVisibility(0);
            this.t.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(8);
        this.f7907a.setVisibility(8);
        this.e.setVisibility(0);
    }

    protected void a() {
        if (this.j == null || this.t == null || this.u == null || this.w == null || !this.i) {
            return;
        }
        this.j.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.j.setVisibility(0);
        this.t.setVisibility(8);
        this.u.setVisibility(8);
        this.w.setVisibility(8);
    }
}
