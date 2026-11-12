package com.huawei.health.suggestion.ui.fitness.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.gson.Gson;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.datatype.templates.TopBannerTemplate;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.seekbar.HealthSeekBar;
import com.huawei.ui.commonui.woundplastadview.WoundPlast;
import defpackage.buh;
import defpackage.fxl;
import defpackage.lrd;
import defpackage.pao;
import defpackage.qqf;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class CoachPauseRestView extends RelativeLayout implements HealthSeekBar.OnSeekBarChangeListener, SwitchView.OnSwitchStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f9348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f9349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f9350c;
    private LinearLayout d;
    private HealthTextView e;
    private ImageView f;
    private HealthTextView g;
    private HealthSeekBar h;
    private HealthSeekBar i;
    private HealthSeekBar j;
    private RelativeLayout k;
    private ImageView l;
    private ImageView m;
    private HealthTextView n;
    private LinearLayout o;
    private ImageView p;
    private RelativeLayout q;
    private HealthTextView r;
    private ImageView s;
    private TimeProgressPlus t;
    private RelativeLayout u;
    private HealthTextView v;
    private SwitchView.OnSwitchStateChangeListener w;
    private long x;
    private LinearLayout y;

    @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
    public void onProgressChanged(HealthSeekBar healthSeekBar, int i, boolean z) {
    }

    @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(HealthSeekBar healthSeekBar) {
    }

    @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(HealthSeekBar healthSeekBar) {
    }

    public CoachPauseRestView(Context context) {
        super(context);
    }

    public CoachPauseRestView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoachPauseRestView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackgroundColor(getResources().getColor(R.color.common_black_60alpha));
        setClickable(true);
        View viewInflate = LayoutInflater.from(getContext()).inflate(com.huawei.health.suggestion.R.layout.sug_coach_view_setting, this);
        this.u = (RelativeLayout) viewInflate.findViewById(com.huawei.health.suggestion.R.id.sug_coach_set_ll_volice_set);
        this.i = (HealthSeekBar) viewInflate.findViewById(com.huawei.health.suggestion.R.id.sug_coach_set_pb_count);
        this.j = (HealthSeekBar) viewInflate.findViewById(com.huawei.health.suggestion.R.id.sug_coach_set_pb_guide);
        this.h = (HealthSeekBar) viewInflate.findViewById(com.huawei.health.suggestion.R.id.sug_coach_set_pb_bg);
        this.p = (ImageView) viewInflate.findViewById(com.huawei.health.suggestion.R.id.coach_set_iv_bg_pre);
        this.s = (ImageView) viewInflate.findViewById(com.huawei.health.suggestion.R.id.sug_coach_set_iv_stop);
        this.f = (ImageView) viewInflate.findViewById(com.huawei.health.suggestion.R.id.sug_coach_set_iv_continue);
        this.l = (ImageView) viewInflate.findViewById(com.huawei.health.suggestion.R.id.sug_coach_set_voice_ok);
        this.m = (ImageView) viewInflate.findViewById(com.huawei.health.suggestion.R.id.coach_set_iv_bg_nex);
        this.n = (HealthTextView) viewInflate.findViewById(com.huawei.health.suggestion.R.id.coach_set_tv_bg);
        this.g = (HealthTextView) viewInflate.findViewById(com.huawei.health.suggestion.R.id.sug_coach_set_tv_motion);
        this.f9348a = (HealthTextView) viewInflate.findViewById(com.huawei.health.suggestion.R.id.sug_coach_set_tv_motionkcal);
        this.e = (HealthTextView) viewInflate.findViewById(com.huawei.health.suggestion.R.id.sug_coach_set_tv_motiontime);
        this.f9350c = (HealthTextView) viewInflate.findViewById(com.huawei.health.suggestion.R.id.sug_coach_set_tv_motionname);
        this.f9349b = (ImageView) viewInflate.findViewById(com.huawei.health.suggestion.R.id.sug_coach_set_iv_motion);
        this.t = (TimeProgressPlus) viewInflate.findViewById(com.huawei.health.suggestion.R.id.sug_coach_set_tp_countdown);
        this.r = (HealthTextView) viewInflate.findViewById(com.huawei.health.suggestion.R.id.sug_coach_set_tv_worn);
        this.y = (LinearLayout) viewInflate.findViewById(com.huawei.health.suggestion.R.id.marketing_wound_plast_coach);
        this.k = (RelativeLayout) viewInflate.findViewById(com.huawei.health.suggestion.R.id.sug_coach_set_ll_show_pause);
        this.q = (RelativeLayout) viewInflate.findViewById(com.huawei.health.suggestion.R.id.sug_coach_set_rl_coach_rest);
        this.o = (LinearLayout) viewInflate.findViewById(com.huawei.health.suggestion.R.id.sug_rl_coach_set_pause);
        this.v = (HealthTextView) viewInflate.findViewById(com.huawei.health.suggestion.R.id.sug_coach_equipment_tip);
        this.d = (LinearLayout) viewInflate.findViewById(com.huawei.health.suggestion.R.id.click_continue);
        g();
        lrd.a(this.d, qre.i(com.huawei.health.suggestion.R.string.sug_coach_continue), (Class<?>) Button.class);
        lrd.a((LinearLayout) viewInflate.findViewById(com.huawei.health.suggestion.R.id.click_finish), qre.i(com.huawei.health.suggestion.R.string.sug_finish), (Class<?>) Button.class);
        ((HealthTextView) viewInflate.findViewById(com.huawei.health.suggestion.R.id.sug_coach_set_tv_continue)).setText(viewInflate.getResources().getString(com.huawei.health.suggestion.R.string.sug_coach_continue).toUpperCase());
        j();
        i();
        if (LanguageUtil.ba(getContext())) {
            f();
        }
    }

    private void g() {
        FrameLayout frameLayout = (FrameLayout) findViewById(com.huawei.health.suggestion.R.id.sug_coach_view_pause_layout);
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            LogUtil.a("Suggestion_CoachPauseRestView", "onFinishInflate scaledDensity：", Float.valueOf(qrs.n()));
            if (qrs.a(2.1f) && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, 0, pao.e(getContext(), 5.0f));
                frameLayout.setLayoutParams(layoutParams);
            }
        }
    }

    private void f() {
        e(com.huawei.health.suggestion.R.id.sug_coach_volume_swh_count, com.huawei.health.suggestion.R.drawable.sug_fitness_volume_normal);
        e(com.huawei.health.suggestion.R.id.sug_coach_volume_swh_guide, com.huawei.health.suggestion.R.drawable.sug_fitness_volume_normal);
        e(com.huawei.health.suggestion.R.id.sug_coach_volume_swh_bg, com.huawei.health.suggestion.R.drawable.sug_fitness_volume_normal);
    }

    private void e(int i, int i2) {
        ((ImageView) findViewById(i)).setImageDrawable(qqz.e(getContext(), i2));
    }

    private void j() {
        this.i.setMax(1000);
        this.j.setMax(1000);
        this.h.setMax(1000);
        String strE = buh.e("voicecoachviewcount");
        if (TextUtils.isEmpty(strE)) {
            strE = "1000";
        }
        String strE2 = buh.e("voicecoachviewbg");
        if (TextUtils.isEmpty(strE2)) {
            strE2 = "1000";
        }
        String strE3 = buh.e("voicecoachviewguide");
        String str = TextUtils.isEmpty(strE3) ? "1000" : strE3;
        try {
            this.i.setProgress(Integer.parseInt(strE));
            this.i.setTouchable(true);
            this.j.setProgress(Integer.parseInt(str));
            this.j.setTouchable(true);
            this.h.setProgress(Integer.parseInt(strE2));
            this.h.setTouchable(true);
        } catch (NumberFormatException e) {
            LogUtil.e("Suggestion_CoachPauseRestView", "NumberFormatException:", LogAnonymous.b(e));
        }
    }

    private void i() {
        ((SwitchView) findViewById(com.huawei.health.suggestion.R.id.sug_coach_set_swh_count)).d(true).setOnSwitchStateChangeListener(this);
        ((SwitchView) findViewById(com.huawei.health.suggestion.R.id.sug_coach_set_swh_bg)).d(true).setOnSwitchStateChangeListener(this);
        ((SwitchView) findViewById(com.huawei.health.suggestion.R.id.sug_coach_set_swh_guide)).d(true).setOnSwitchStateChangeListener(this);
    }

    private void b(final int i) {
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi == null) {
            LogUtil.a("Suggestion_CoachPauseRestView", "marketingApi is null.");
        } else {
            LogUtil.a("Suggestion_CoachPauseRestView", "coach pause rest view start band play");
            marketingApi.getResourceResultInfo(i).addOnSuccessListener(new OnSuccessListener<Map<Integer, ResourceResultInfo>>() { // from class: com.huawei.health.suggestion.ui.fitness.module.CoachPauseRestView.2
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Map<Integer, ResourceResultInfo> map) {
                    ResourceResultInfo resourceResultInfo = marketingApi.filterMarketingRules(map).get(Integer.valueOf(i));
                    if (resourceResultInfo == null || resourceResultInfo.getTotalNum() == 0) {
                        LogUtil.j("Suggestion_CoachPauseRestView", "resourceResultInfo is null");
                        return;
                    }
                    CoachPauseRestView.this.y.addView(CoachPauseRestView.this.d(i, resourceResultInfo.getResources().get(0)));
                    CoachPauseRestView.this.f9349b.setVisibility(8);
                    CoachPauseRestView.this.y.setVisibility(0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WoundPlast d(final int i, final ResourceBriefInfo resourceBriefInfo) {
        final TopBannerTemplate topBannerTemplate = (TopBannerTemplate) new Gson().fromJson(resourceBriefInfo.getContent().getContent(), TopBannerTemplate.class);
        WoundPlast woundPlast = new WoundPlast(getContext());
        woundPlast.setAdImage(topBannerTemplate.getPicture());
        woundPlast.setImageSizeMode(WoundPlast.ImageSizeMode.NORMAL_IMAGE);
        this.x = System.currentTimeMillis();
        woundPlast.setAdClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.module.CoachPauseRestView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MarketingBiUtils.c(i, resourceBriefInfo, CoachPauseRestView.this.x);
                fxl.d(topBannerTemplate.getLinkValue(), i, resourceBriefInfo);
                CoachPauseRestView.this.x = System.currentTimeMillis();
            }
        });
        woundPlast.setCloseBtnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.module.CoachPauseRestView.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                fxl.b(i, 1, resourceBriefInfo);
                CoachPauseRestView.this.y.setVisibility(8);
                CoachPauseRestView.this.f9349b.setVisibility(0);
                MarketingBiUtils.b(i, resourceBriefInfo, CoachPauseRestView.this.x);
                CoachPauseRestView.this.x = System.currentTimeMillis();
            }
        });
        return woundPlast;
    }

    public HealthSeekBar getCoachSetCountVoice() {
        return this.i;
    }

    public HealthSeekBar getCoachSetGuideVoice() {
        return this.j;
    }

    public HealthSeekBar getCoachSetBackgroundVoice() {
        return this.h;
    }

    public ImageView getCoachSetPreButton() {
        return this.p;
    }

    public HealthTextView getCoachSetMotionText() {
        return this.n;
    }

    public ImageView getCoachSetNextButton() {
        return this.m;
    }

    public RelativeLayout getCoachSetPausePage() {
        return this.k;
    }

    public ImageView getCoachSetStop() {
        return this.s;
    }

    public ImageView getCoachSetOk() {
        return this.l;
    }

    public ImageView getCoachSetContinue() {
        return this.f;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.module.SwitchView.OnSwitchStateChangeListener
    public void onSwitchStateChange(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        if (id == com.huawei.health.suggestion.R.id.sug_coach_set_swh_bg) {
            buh.d("coachviewbg", String.valueOf(z));
            this.h.setEnabled(z);
            if (this.w != null) {
                view.setTag(2);
                this.w.onSwitchStateChange(view, z);
                return;
            }
            return;
        }
        if (id == com.huawei.health.suggestion.R.id.sug_coach_set_swh_guide) {
            buh.d("coachviewguide", String.valueOf(z));
            this.j.setEnabled(z);
            if (this.w != null) {
                view.setTag(1);
                this.w.onSwitchStateChange(view, z);
                return;
            }
            return;
        }
        if (this.w != null) {
            view.setTag(0);
            this.w.onSwitchStateChange(view, z);
        }
        buh.d("coachviewcount", String.valueOf(z));
        this.i.setEnabled(z);
    }

    public void b(int i, boolean z, String str, String str2, String str3, String str4, String str5) {
        a();
        this.t.d(i);
        if (!z) {
            this.g.setText(getContext().getResources().getString(com.huawei.health.suggestion.R.string.sug_last_exe));
        } else {
            this.g.setText(getContext().getResources().getString(com.huawei.health.suggestion.R.string.sug_next_exe));
        }
        d(str, str2, str3, str4, str5);
    }

    public void a() {
        setVisibility(0);
        this.u.setVisibility(8);
        this.k.setVisibility(0);
        this.o.setVisibility(4);
        this.q.setVisibility(0);
    }

    public void e() {
        setVisibility(4);
        this.t.c();
    }

    public void a(String str, String str2, String str3, String str4, String str5) {
        setVisibility(0);
        this.u.setVisibility(8);
        this.k.setVisibility(0);
        this.q.setVisibility(4);
        this.o.setVisibility(0);
        this.g.setText(getContext().getString(com.huawei.health.suggestion.R.string.sug_curr_action));
        d(str, str2, str3, str4, str5);
    }

    public void c(String str, String str2, String str3, String str4, String str5) {
        setVisibility(0);
        this.u.setVisibility(8);
        this.k.setVisibility(0);
        this.q.setVisibility(4);
        this.o.setVisibility(0);
        this.g.setText(getContext().getString(com.huawei.health.suggestion.R.string.sug_curr_exercise));
        d(str, str2, str3, str4, str5);
    }

    private void d(String str, String str2, String str3, String str4, String str5) {
        this.f9350c.setText(str);
        qqf.b(str5, this.f9349b.getWidth(), this.f9349b.getHeight(), this.f9349b);
        this.r.setText(str4);
        this.f9348a.setText(str2);
        this.e.setText(str3);
        b(10002);
    }

    public void d() {
        setVisibility(0);
        this.k.setVisibility(4);
        this.u.setVisibility(0);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 4) {
            buh.d("voicecoachviewcount", String.valueOf(this.i.getProgress()));
            buh.d("voicecoachviewbg", String.valueOf(this.h.getProgress()));
            buh.d("voicecoachviewguide", String.valueOf(this.j.getProgress()));
        }
    }

    public void c(SwitchView.OnSwitchStateChangeListener onSwitchStateChangeListener) {
        this.w = onSwitchStateChangeListener;
    }

    public TimeProgressPlus b() {
        return this.t;
    }

    public void setEquipmentPauseTips(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Suggestion_CoachPauseRestView", "pauseTips is isEmpty");
        } else {
            this.v.setText(str);
        }
    }

    public void c() {
        this.d.setVisibility(8);
    }
}
