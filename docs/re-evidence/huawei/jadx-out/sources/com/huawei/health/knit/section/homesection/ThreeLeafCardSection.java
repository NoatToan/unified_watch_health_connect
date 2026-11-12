package com.huawei.health.knit.section.homesection;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.healthmodel.HealthModelApi;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.health.healthmodel.bean.HealthLifeTaskBean;
import com.huawei.health.servicesui.R;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ucd.cloveranimation.AddFrameListener;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.view.Clover;
import defpackage.fft;
import defpackage.ffv;
import defpackage.fsg;
import defpackage.fsh;
import defpackage.grv;
import defpackage.lrd;
import defpackage.lua;
import defpackage.njy;
import defpackage.qgr;
import defpackage.qji;
import defpackage.qqs;
import defpackage.qqw;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrr;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ThreeLeafCardSection extends ModelBaseCardSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected View.OnClickListener f7518a;
    private HealthTextView aa;
    private View.OnClickListener ab;
    private String ac;
    private ImageView ad;
    private LinearLayout ae;
    private HealthTextView af;
    private HealthTextView ag;
    private LinearLayout ah;
    private int[] ai;
    private String ak;
    private FrameLayout am;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected View.OnClickListener f7519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected View.OnClickListener f7520c;
    protected View.OnClickListener d;
    protected View.OnClickListener e;
    private int f;
    private HealthTextView g;
    private boolean h;
    private LinearLayout i;
    private HealthTextView j;
    private LinearLayout k;
    private LinearLayout l;
    private ImageView m;
    private Clover n;
    private HealthTextView o;
    private boolean p;
    private boolean q;
    private boolean r;
    private List<HealthLifeTaskBean> s;
    private boolean t;
    private HealthTextView u;
    private HealthTextView v;
    private float[] w;
    private fsh x;
    private HealthTextView y;
    private View.OnClickListener z;

    public ThreeLeafCardSection(Context context) {
        super(context);
        this.s = new ArrayList();
        this.ai = new int[]{0, 0, -1, -1};
        this.f = 2;
        this.w = new float[3];
        this.ak = "";
        this.ac = "";
        this.h = true;
    }

    @Override // com.huawei.health.knit.section.homesection.ModelBaseCardSection, android.view.View
    public String getTag() {
        return "ThreeLeafCardSection";
    }

    public void b(String str, String str2, String str3) {
        this.mHeatValueLayout.setVisibility(0);
        this.mSleepArrayLayout.setVisibility(8);
        this.mHeatIcon.setBackground(getContext().getResources().getDrawable(R.drawable.ic_health_sleep_point));
        this.mHeatTextView.setText(str);
        this.mHeatText.setText(str2);
        this.mHeatUnit.setText(str3);
        n();
        lrd.b(this.mHeatValueLayout, qre.a(R.string.IDS_settings_alarm_comma, str2, str3));
    }

    @Override // com.huawei.health.knit.section.homesection.ModelBaseCardSection
    protected void initModel(View view) {
        View viewFindViewById;
        ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.three_leaf_layout);
        if (viewStub.getParent() != null) {
            viewFindViewById = viewStub.inflate();
        } else {
            viewFindViewById = this.itemView.findViewById(R.id.three_leaf_layout_inflated);
        }
        if (viewFindViewById instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) viewFindViewById;
            this.am = frameLayout;
            frameLayout.setVisibility(0);
            this.n = (Clover) this.am.findViewById(R.id.view_task_status_clover);
        }
        this.g = (HealthTextView) this.itemView.findViewById(R.id.activity_hours);
        this.mHeatIcon.setBackground(getContext().getResources().getDrawable(R.drawable.ic_health_sleep_point));
    }

    public void e(String str, String str2, boolean z) {
        this.mHeatValueLayout.setVisibility(8);
        this.mSleepArrayLayout.setVisibility(0);
        this.mHeatTextView.setText(str);
        this.aa.setText(str2);
        lrd.b(this.mSleepArrayLayout, str2);
        if (z) {
            this.ad.setVisibility(8);
            Drawable drawableO = o();
            drawableO.setBounds(0, 0, getContext().getResources().getDimensionPixelSize(R.dimen.health_common_8dp), getContext().getResources().getDimensionPixelSize(R.dimen.health_common_16dp));
            this.aa.setCompoundDrawablesRelative(null, null, drawableO, null);
            return;
        }
        this.ad.setVisibility(8);
    }

    private Drawable o() {
        if (qqs.e(getContext())) {
            if (LanguageUtil.ba(getContext())) {
                return qqz.e(getContext(), R.drawable.ic_right_grey_update_dark);
            }
            return getContext().getResources().getDrawable(R.drawable.ic_right_grey_update_dark);
        }
        if (LanguageUtil.ba(getContext())) {
            return qqz.e(getContext(), R.drawable.ic_right_grey_update);
        }
        return getContext().getResources().getDrawable(R.drawable.ic_right_grey_update);
    }

    public void c(int i, int i2, int i3) {
        this.mSportIntensityIcon.setBackground(getContext().getResources().getDrawable(R.drawable.ic_health_point_sport));
        this.mSportIntensityText.setText(getContext().getResources().getString(i));
        String strE = UnitUtil.e(i2, 1, 0);
        this.mTimeText.setText(strE);
        lrd.b(this.mStrengthLayoutMiddle, qre.e(i3, i2, strE.replaceAll(",", "")));
        String strE2 = qre.e(i3, i2, "");
        this.mTimeTextRight.setText(strE2.startsWith(" ") ? strE2.substring(1) : strE2);
        LogUtil.a("ThreeLeafCardSection", "bindThreeLeafSportLayout value: ", Integer.valueOf(i2), strE2);
    }

    @Override // com.huawei.health.knit.section.homesection.ModelBaseCardSection
    public void setFitnessDataOriginIcon2Visible(int i) {
        this.mFitnessDataOriginIcon2Layout.setVisibility(i);
    }

    public void c(int i) {
        this.mActivityIcon.setBackground(getContext().getResources().getDrawable(R.drawable.ic_health_point_emotion));
        getActivityTitleText().setText(getContext().getResources().getString(i));
    }

    public void a(int i, int i2, String str, String str2, int i3) {
        this.mActivityIcon.setBackground(getContext().getResources().getDrawable(R.drawable.ic_health_point_emotion));
        getActivityTitleText().setText(getContext().getResources().getString(i));
        this.k.setVisibility(0);
        this.l.setVisibility(8);
        this.i.setVisibility(8);
        this.u.setText(getContext().getResources().getString(i2));
        this.v.setText(str);
        this.y.setText(str2);
        this.y.setTextColor(i3);
        n();
        lrd.b(this.k, qre.a(R.string.accessibility_status_theme_description_join, this.u.getText(), this.v.getText(), this.y.getText()));
    }

    public void c(int i, String str) {
        this.k.setVisibility(8);
        this.l.setVisibility(0);
        this.i.setVisibility(8);
        double d = i;
        this.mBreathCountValue.setText(UnitUtil.e(d, 1, 0));
        this.j.setText(str);
        n();
        lrd.b(this.l, qre.e(R.plurals.IDS_breath_task_count, i, UnitUtil.e(d, 1, 0)));
    }

    public void b(int i) {
        this.k.setVisibility(8);
        this.l.setVisibility(8);
        this.i.setVisibility(0);
        Drawable drawableO = o();
        this.o.setText(getContext().getResources().getString(i));
        lrd.b(this.i, qre.f(i));
        drawableO.setBounds(0, 0, getContext().getResources().getDimensionPixelSize(R.dimen.health_common_8dp), getContext().getResources().getDimensionPixelSize(R.dimen.health_common_16dp));
        this.o.setCompoundDrawablesRelative(null, null, drawableO, null);
    }

    public void d() {
        this.ae.setVisibility(8);
        this.ah.setVisibility(0);
        String strF = qre.f(R.string.IDS_hw_health_open_health_clover);
        String strA = qre.a(R.string.IDS_introduce_health_model, strF);
        int iIndexOf = strA.indexOf(strF);
        if (iIndexOf <= -1) {
            this.af.setText(strA);
            return;
        }
        SpannableString spannableString = new SpannableString(strA);
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(BaseApplication.b(), R.color.common_colorAccent)), iIndexOf, strF.length() + iIndexOf, 17);
        this.af.setText(spannableString);
    }

    public void setHealthModelDataLayoutVisible(int i) {
        if (i == 0) {
            this.ae.setVisibility(0);
            this.mCardViewForChinese.setVisibility(0);
            this.ah.setVisibility(8);
        } else {
            this.ae.setVisibility(8);
            this.mCardViewForChinese.setVisibility(8);
            this.ah.setVisibility(0);
            d();
            lua.a(fft.f34005c, "perfect_three_leaf", 0L);
        }
    }

    @Override // com.huawei.health.knit.section.homesection.ModelBaseCardSection
    protected void initStrengthLayoutVisible(LinearLayout linearLayout) {
        this.ae = linearLayout;
        ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.three_leaf_default_layout);
        if (viewStub.getParent() != null) {
            this.ah = (LinearLayout) viewStub.inflate();
        } else {
            this.ah = (LinearLayout) this.itemView.findViewById(R.id.three_leaf_default_layout_inflated);
        }
        this.ah.setVisibility(8);
        this.ag = (HealthTextView) this.ah.findViewById(R.id.default_health_model_title);
        this.af = (HealthTextView) this.ah.findViewById(R.id.default_health_model_des);
    }

    @Override // com.huawei.health.knit.section.homesection.ModelBaseCardSection
    protected void initActivityContentVisible(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4) {
        linearLayout.setVisibility(8);
        linearLayout2.setVisibility(8);
        linearLayout3.setVisibility(8);
        linearLayout4.setVisibility(8);
        this.k = linearLayout2;
        this.l = linearLayout3;
        this.i = linearLayout4;
        i();
    }

    public View getEmotionPressureLayout() {
        return this.k;
    }

    public View getBreathCountLayout() {
        return this.l;
    }

    public View getBreathArrayLayout() {
        return this.i;
    }

    @Override // com.huawei.health.knit.section.homesection.ModelBaseCardSection
    protected void initSleepLayout() {
        this.aa = (HealthTextView) this.mSleepArrayLayout.findViewById(R.id.sleep_text);
        this.ad = (ImageView) this.mSleepArrayLayout.findViewById(R.id.sleep_array);
        d(this.aa);
    }

    private void d(HealthTextView healthTextView) {
        if (qrs.v()) {
            healthTextView.setTextSize(1, 21.0f);
        } else {
            healthTextView.setTextSize(2, 12.0f);
        }
    }

    private void i() {
        Typeface typefaceC = qrr.c();
        this.u = (HealthTextView) this.k.findViewById(R.id.pressure_title);
        HealthTextView healthTextView = (HealthTextView) this.k.findViewById(R.id.pressure_value);
        this.v = healthTextView;
        healthTextView.setTypeface(typefaceC);
        this.y = (HealthTextView) this.k.findViewById(R.id.pressure_des);
        this.mBreathCountValue = (HealthTextView) this.l.findViewById(R.id.breath_count_value);
        this.mBreathCountValue.setTypeface(typefaceC);
        this.j = (HealthTextView) this.l.findViewById(R.id.breath_count_des);
        this.o = (HealthTextView) this.i.findViewById(R.id.breath_train);
        this.m = (ImageView) this.i.findViewById(R.id.breath_array);
        d(this.o);
    }

    @Override // com.huawei.health.knit.section.homesection.ModelBaseCardSection
    protected void refreshActivityLayout() {
        setLayoutParamsThreeLine(this.k, this.y, false);
        setLayoutParamsThreeLine(this.l, this.j, false);
    }

    @Override // com.huawei.health.knit.section.homesection.ModelBaseCardSection
    public ImageView getFitnessDataOriginIcon() {
        return this.mFitnessDataOriginIcon2;
    }

    @Override // com.huawei.health.knit.section.homesection.ModelBaseCardSection
    public LinearLayout getFitnessDataOriginIconLayout() {
        return this.mFitnessDataOriginIcon2Layout;
    }

    public Clover getClover() {
        return this.n;
    }

    public FrameLayout getThreeLeafLayout() {
        return this.am;
    }

    public HealthTextView getActivityTitleText() {
        return this.g;
    }

    public LinearLayout getThreeLeafDefaultLayout() {
        return this.ah;
    }

    @Override // com.huawei.health.knit.section.homesection.ModelBaseCardSection
    public void initBottomStepLayout() {
        this.mBottomText.setText(getContext().getString(R.string.IDS_three_leaf_todo_title));
        Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.ic_health_three_leef_task);
        if (LanguageUtil.ba(getContext())) {
            BitmapDrawable bitmapDrawableE = qqz.e(getContext(), drawable);
            this.mBottomIcon.setBackground(bitmapDrawableE);
            this.mDefaultMsgInfo.d(bitmapDrawableE);
        } else {
            this.mBottomIcon.setBackground(drawable);
            this.mDefaultMsgInfo.d(drawable);
        }
        setBottomClickListener(qji.b(new View.OnClickListener() { // from class: fsf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34471a.e(view);
            }
        }, (BaseActivity) getContext(), true, ""));
        this.mDefaultMsgInfo.a(getContext().getString(R.string.IDS_three_leaf_todo_title));
        this.mDefaultMsgInfo.e(R.dimen.textSizeBody3);
    }

    public /* synthetic */ void e(View view) {
        ffv.a(getContext(), Uri.parse("").buildUpon().appendQueryParameter("from", "cloverLife").build());
    }

    @Override // com.huawei.health.knit.section.homesection.ModelBaseCardSection
    public void updateBottomData(int i, int i2) {
        LogUtil.a("ThreeLeafCardSection", "updateBottomData curValue=", Integer.valueOf(i), "  goal=", Integer.valueOf(i2));
        String strE = UnitUtil.e(i2, 1, 0);
        String strE2 = UnitUtil.e(i, 1, 0);
        SpannableString spannableStringLightBottomCurrentText = lightBottomCurrentText(qre.a(R.string.IDS_three_leaf_todo_pro, strE2, strE), strE2);
        this.mDefaultMsgInfo.c(spannableStringLightBottomCurrentText);
        fsh fshVar = this.x;
        if (fshVar != null && !fshVar.a()) {
            LogUtil.j("ThreeLeafCardSection", "has showing message animate");
            return;
        }
        fsh fshVar2 = this.x;
        LinearLayout linearLayoutB = fshVar2 == null ? this.mBottomCapsuleLayout : fshVar2.b();
        HealthTextView healthTextView = (HealthTextView) linearLayoutB.findViewById(R.id.bottom_step_value);
        if (healthTextView == null) {
            LogUtil.j("ThreeLeafCardSection", "updateBottomData bottomValue is null, return");
            return;
        }
        healthTextView.setText(spannableStringLightBottomCurrentText);
        healthTextView.setVisibility(0);
        lrd.b(healthTextView, spannableStringLightBottomCurrentText);
        boolean zCheckBottomLayoutNeedLine = checkBottomLayoutNeedLine(linearLayoutB);
        this.q = zCheckBottomLayoutNeedLine;
        fsh fshVar3 = this.x;
        if (fshVar3 != null) {
            fshVar3.d(zCheckBottomLayoutNeedLine);
        }
    }

    public void setMessageList(List<fsg> list) {
        if (this.p) {
            LogUtil.j("ThreeLeafCardSection", "setMessageList page is destroyed");
        } else {
            this.x.e(list, this.t && qgr.c(this.mContext));
        }
    }

    public void setBottomClickListener(View.OnClickListener onClickListener) {
        this.mBottomCapsuleLayout.setOnClickListener(onClickListener);
        this.mDefaultMsgInfo.d(onClickListener);
        if (this.mBottomValue == null) {
            ReleaseLogUtil.d("ThreeLeafCardSection", "setBottomClickListener mBottomValue is null");
        } else {
            this.mBottomValue.setOnClickListener(onClickListener);
        }
    }

    private void a(boolean z) {
        this.t = z;
        if (!qgr.c(this.mContext)) {
            LogUtil.j("ThreeLeafCardSection", "updateLeafCardShowStatus  Three leaf card not show");
        } else {
            if (this.p) {
                return;
            }
            if (z) {
                this.x.e();
            } else {
                this.x.c();
            }
        }
    }

    public void c(boolean z) {
        if (z) {
            this.x.e();
        } else {
            this.x.c();
        }
    }

    public void g() {
        this.p = true;
        this.x.d();
    }

    private void n() {
        if (qrs.u() || !LanguageUtil.f(getContext())) {
            LogUtil.a("ThreeLeafCardSection", "wrapLineForThreeLeaf");
            this.mStepLayoutMiddle.setOrientation(1);
            this.mStrengthLayoutMiddle.setOrientation(1);
            this.k.setOrientation(1);
            this.l.setOrientation(1);
            this.mHeatValueLayout.setOrientation(1);
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "ThreeLeafCardSection";
    }

    @Override // com.huawei.health.knit.section.homesection.ModelBaseCardSection, com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        super.onCreateView(context);
        this.x = new fsh(this.mBottomCapsuleLayout, this.mBottomCapsuleLayout2, this.mDefaultMsgInfo, this.mCardViewForChinese, this.q);
        Clover clover = this.n;
        if (clover != null) {
            clover.setMaxOutsideScale(1.02f);
            this.n.setCloverWithIcon(0.0f, 0.0f, 0.0f);
        }
        a();
        b();
        return this.itemView;
    }

    @Override // com.huawei.health.knit.section.homesection.ModelBaseCardSection, com.huawei.health.knit.section.view.BaseSection
    public void bindParamsToView(HashMap<String, Object> map) {
        List listA = qqw.a((Map) map, "HEALTH_LIFE_TASK", HealthLifeTaskBean.class, (List) null);
        if (listA != null) {
            this.s.clear();
            this.s.addAll(listA);
        }
        int[] iArr = (int[]) qqw.a(map, "THREE_LEAF_DATA", (Class<Object>) int[].class, (Object) null);
        if (iArr != null) {
            this.ai = iArr;
        }
        int iC = qqw.c(map, "SPORT_TASK_ID", -1);
        if (iC != -1) {
            this.f = iC;
        }
        float[] fArr = (float[]) qqw.a(map, "LAST_THREE_LEAF_RATIO", (Class<Object>) float[].class, (Object) null);
        if (fArr != null) {
            this.w = fArr;
        }
        if (map != null && map.containsKey("LAST_IS_PERFECT")) {
            this.r = qqw.a(map, "LAST_IS_PERFECT", false);
        }
        super.bindParamsToView(map);
    }

    @Override // com.huawei.health.knit.section.homesection.ModelBaseCardSection
    protected void setTextAndListener(HashMap<String, Object> map) {
        super.setTextAndListener(map);
        String strD = qqw.d((Map) map, "SHOW_MAIN_HOME_PAGE_SLEEP", (String) null);
        if (strD != null) {
            this.ak = strD;
        }
        String strD2 = qqw.d((Map) map, "HEALTH_SHOW_HEALTH_DATA_INPUT", (String) null);
        if (strD2 != null) {
            this.ac = strD2;
        }
        setListener(map);
    }

    private void setListener(HashMap<String, Object> map) {
        View.OnClickListener onClickListener = (View.OnClickListener) qqw.a(map, "CLICK_SLEEP_AREA_LISTENER", (Class<Object>) View.OnClickListener.class, (Object) null);
        if (onClickListener != null) {
            this.e = onClickListener;
        }
        View.OnClickListener onClickListener2 = (View.OnClickListener) qqw.a(map, "CLICK_STEP_AREA_LISTENER", (Class<Object>) View.OnClickListener.class, (Object) null);
        if (onClickListener2 != null) {
            this.f7519b = onClickListener2;
        }
        View.OnClickListener onClickListener3 = (View.OnClickListener) qqw.a(map, "CLICK_MOOD_AREA_LISTENER", (Class<Object>) View.OnClickListener.class, (Object) null);
        if (onClickListener3 != null) {
            this.f7520c = onClickListener3;
        }
        View.OnClickListener onClickListener4 = (View.OnClickListener) qqw.a(map, "JUMP_TO_HEALTH_MODEL_LISTENER", (Class<Object>) View.OnClickListener.class, (Object) null);
        if (onClickListener4 != null) {
            this.d = onClickListener4;
        }
        View.OnClickListener onClickListener5 = (View.OnClickListener) qqw.a(map, "CONFIGURATION_CHANGED", (Class<Object>) View.OnClickListener.class, (Object) null);
        if (onClickListener5 != null) {
            this.f7518a = onClickListener5;
        }
        View.OnClickListener onClickListener6 = (View.OnClickListener) qqw.a(map, "REFRESH_UI_WITH_ANIMATION", (Class<Object>) View.OnClickListener.class, (Object) null);
        if (onClickListener6 != null) {
            this.ab = onClickListener6;
        }
        View.OnClickListener onClickListener7 = (View.OnClickListener) qqw.a(map, "REFRESH_UI_FOR_VISIBLE", (Class<Object>) View.OnClickListener.class, (Object) null);
        if (onClickListener7 != null) {
            this.z = onClickListener7;
        }
        View.OnClickListener onClickListener8 = (View.OnClickListener) qqw.a(map, "CHECK_MSG_RED_DOT_TEXT", (Class<Object>) View.OnClickListener.class, (Object) null);
        if (onClickListener8 != null) {
            HealthTextView healthTextView = this.mMessageRedDot;
            if (healthTextView != null && healthTextView.getVisibility() == 0) {
                onClickListener8.onClick(this.itemView);
            }
            lrd.b(this.mThreeLeafIconBackground, 8);
        }
    }

    @Override // com.huawei.health.knit.section.homesection.ModelBaseCardSection
    protected void execFunction(HashMap<String, Object> map) {
        super.execFunction(map);
        List<fsg> listA = qqw.a((Map) map, "SET_MESSAGE_LIST", fsg.class, (List) null);
        if (listA != null) {
            setMessageList(listA);
        }
        List listA2 = qqw.a((Map) map, "UPDATE_BOTTOM_DATA_THREE_LEAF", Integer.class, (List) null);
        if (listA2 != null && listA2.size() == 2) {
            updateBottomData(((Integer) listA2.get(0)).intValue(), ((Integer) listA2.get(1)).intValue());
        }
        int iC = qqw.c(map, "BIND_CARD_DATA", -1);
        if (iC != -1) {
            d(iC, qqw.d((Map) map, "MOOD_VALUE_SCORE", ""));
        }
        e(map);
        if (map != null && map.containsKey("STOP_OR_START_ANIMATE")) {
            c(qqw.a(map, "STOP_OR_START_ANIMATE", false));
        }
        if (map == null || !map.containsKey("UPDATE_LEAF_CARD_SHOW_STATUS")) {
            return;
        }
        a(qqw.a(map, "UPDATE_LEAF_CARD_SHOW_STATUS", false));
    }

    private void e(HashMap<String, Object> map) {
        if (qqw.a(map, "BIND_SPORT_LAYOUT", false)) {
            f();
        }
        if (qqw.a(map, "ON_DESTROY", false)) {
            g();
        }
        if (qqw.a(map, "GROW_ALL_CLOVER", false)) {
            j();
        }
        if (qqw.a(map, "GROW_ONE_CLOVER", false)) {
            h();
        }
        if (qqw.a(map, "SHOW_CLOVER_WITHOUT_ANIMATION", false)) {
            l();
        }
    }

    private void f() {
        if (this.f == 2) {
            c(R.string.IDS_settings_steps, this.ai[0], R.plurals.IDS_single_circle_walk_target_desc);
        } else {
            setFitnessDataOriginIcon2Visible(8);
            c(R.string.IDS_intensity_new, this.ai[1], R.plurals.IDS_single_circle_intensity_target_desc);
        }
    }

    protected void a() {
        ImageView imageView = this.mThreeLeafIcon;
        if (imageView != null) {
            imageView.setBackground(ContextCompat.getDrawable(BaseApplication.b(), R.drawable.icon_three_circle));
            lrd.b(this.mThreeLeafIconBackground, qre.f(R.string.IDS_three_circle_title));
        }
    }

    private void b(Clover clover, boolean z) {
        if (clover.getVisibility() != 0) {
            clover.setVisibility(0);
        }
        clover.b();
        clover.setPlayAllFrameAnimation(true);
        clover.setAllFull(z);
    }

    private void l() {
        if (this.n == null) {
            LogUtil.a("ThreeLeafCardSection", "Clover is null, show Clover fail");
            return;
        }
        float[] fArr = this.w;
        LogUtil.a("ThreeLeafCardSection", "showCloverWithoutAnimation top:", Float.valueOf(fArr[0]), " left:", Float.valueOf(fArr[1]), " right:", Float.valueOf(fArr[2]), " isPerfect:", Boolean.valueOf(this.r));
        b(this.n, this.r);
        Clover clover = this.n;
        float[] fArr2 = this.w;
        clover.setCloverWithIcon(fArr2[0], fArr2[1], fArr2[2]);
    }

    private void h() {
        if (this.n == null) {
            LogUtil.a("ThreeLeafCardSection", "Clover is null, grow Clover fail");
            return;
        }
        float[] fArr = this.w;
        LogUtil.a("ThreeLeafCardSection", "growOneClover top:", Float.valueOf(fArr[0]), " left:", Float.valueOf(fArr[1]), " right:", Float.valueOf(fArr[2]), " isPerfect:", Boolean.valueOf(this.r));
        b(this.n, this.r);
        if (!qgr.c(this.mContext)) {
            Clover clover = this.n;
            float[] fArr2 = this.w;
            clover.setCloverWithIcon(fArr2[0], fArr2[1], fArr2[2]);
            return;
        }
        if (Float.compare(this.w[0], 1.0f) == 0 && Float.compare(this.w[1], 1.0f) == 0 && Float.compare(this.w[2], 1.0f) == 0) {
            Clover clover2 = this.n;
            float[] fArr3 = this.w;
            clover2.setCloverRunAnimator(0.999f, fArr3[1], fArr3[2]);
        } else {
            Clover clover3 = this.n;
            float[] fArr4 = this.w;
            clover3.setCloverRunAnimator(fArr4[0], fArr4[1], fArr4[2]);
        }
        this.n.postDelayed(new Runnable() { // from class: fse
            @Override // java.lang.Runnable
            public final void run() {
                this.f34470b.c();
            }
        }, 550L);
    }

    public /* synthetic */ void c() {
        Clover clover = this.n;
        float[] fArr = this.w;
        clover.setCloverWithIcon(fArr[0], fArr[1], fArr[2]);
    }

    private void j() {
        if (this.n == null) {
            LogUtil.a("ThreeLeafCardSection", "Clover is null, grow Clover fail");
            return;
        }
        float[] fArr = this.w;
        LogUtil.a("ThreeLeafCardSection", "growAllClover top:", Float.valueOf(fArr[0]), " left:", Float.valueOf(fArr[1]), " right:", Float.valueOf(fArr[2]), " isPerfect:", Boolean.valueOf(this.r));
        b(this.n, this.r);
        if (!qgr.c(this.mContext)) {
            Clover clover = this.n;
            float[] fArr2 = this.w;
            clover.setCloverWithIcon(fArr2[0], fArr2[1], fArr2[2]);
        } else {
            Clover clover2 = this.n;
            float[] fArr3 = this.w;
            clover2.setCloverRunGrowAnimator(fArr3[0], fArr3[1], fArr3[2]);
            this.n.setAnimEndListener(new AddFrameListener() { // from class: fsi
                @Override // com.huawei.ucd.cloveranimation.AddFrameListener
                public final void onFinished() {
                    LogUtil.a("ThreeLeafCardSection", "growAllClover finished.");
                }
            });
        }
    }

    private void d(int i, String str) {
        setHealthModelDataLayoutVisible((ffv.n() || njy.b(this.s)) ? 0 : 8);
        k();
        f();
        setMoodValue(str);
    }

    private HealthLifeTaskBean a(int i) {
        List<HealthLifeTaskBean> list = this.s;
        if (njy.e(list)) {
            LogUtil.j("ThreeLeafCardSection", "getHealthLifeTaskById list ", list);
            return null;
        }
        for (HealthLifeTaskBean healthLifeTaskBean : list) {
            if (healthLifeTaskBean != null && healthLifeTaskBean.getHealthLifeBean() != null && healthLifeTaskBean.getId() == i) {
                return healthLifeTaskBean;
            }
        }
        return null;
    }

    private void k() {
        HealthLifeTaskBean healthLifeTaskBeanA = a(6);
        if (healthLifeTaskBeanA == null || healthLifeTaskBeanA.getHealthLifeBean() == null) {
            e(this.ak, this.ac, true);
            return;
        }
        HealthLifeBean healthLifeBean = healthLifeTaskBeanA.getHealthLifeBean();
        LogUtil.a("ThreeLeafCardSection", "wake up:", healthLifeBean.getResult(), " ", Integer.valueOf(healthLifeBean.getRecordDay()), " complete:", Integer.valueOf(healthLifeBean.getComplete()));
        String strD = ffv.d(healthLifeBean.getResult());
        if (healthLifeBean.getComplete() == 3) {
            e(this.ak, getContext().getResources().getString(R.string.IDS_plugin_course_completed), false);
        } else {
            if (TextUtils.isEmpty(strD)) {
                e(this.ak, this.ac, true);
                return;
            }
            b(this.ak, UnitUtil.e(ffv.b(strD), 129), getContext().getResources().getString(R.string.IDS_sleep_record_get_up_time));
        }
    }

    private void setMoodValue(String str) {
        HealthLifeTaskBean healthLifeTaskBeanA = a(5);
        if (healthLifeTaskBeanA == null || healthLifeTaskBeanA.getHealthLifeBean() == null) {
            c(R.string.IDS_mood);
            b(R.string.IDS_breath_train);
            return;
        }
        HealthLifeBean healthLifeBean = healthLifeTaskBeanA.getHealthLifeBean();
        if (ffv.c(healthLifeBean)) {
            grv grvVar = (grv) HiJsonUtil.d(healthLifeBean.getExtendInfo(), grv.class);
            a(R.string.IDS_mood, R.string.IDS_settings_one_level_menu_settings_item_text_id14, UnitUtil.e(grvVar.c(), 1, 0), str, ffv.e(grvVar.e()));
            return;
        }
        if (CommonUtil.j(healthLifeBean.getResult()) == 0) {
            c(R.string.IDS_mood);
            b(R.string.IDS_breath_train);
        } else {
            c(R.string.IDS_mood);
            int iJ = CommonUtil.j(healthLifeBean.getResult());
            c(iJ, qre.e(R.plurals.IDS_breath_task_count, iJ, ""));
        }
    }

    protected void b() {
        View.OnClickListener onClickListenerB = this.mContext instanceof BaseActivity ? qji.b(this, (BaseActivity) this.mContext, true, "") : this;
        a(this.mActivityLayout, onClickListenerB);
        a(this.mHeatLayout, onClickListenerB);
        a(this.mTimeStrengthLayout, onClickListenerB);
        a(getThreeLeafLayout(), onClickListenerB);
        a(getThreeLeafDefaultLayout(), onClickListenerB);
        setBottomClickListener(onClickListenerB);
        setFitnessDataOriginIcon2Visible(8);
    }

    private void a(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            ReleaseLogUtil.d("ThreeLeafCardSection", "setOnClickListener view is null");
        } else {
            view.setOnClickListener(onClickListener);
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        HealthModelApi healthModelApiC = ffv.c();
        if (view == null || healthModelApiC == null) {
            LogUtil.e("ThreeLeafCardSection", "onClick view == null");
            return;
        }
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("ThreeLeafCardSection", "onClick view ", view);
        if (qrs.e(view)) {
            return;
        }
        b(view);
    }

    private void b(View view) {
        int id = view.getId();
        if (id == R.id.stepLayout || id == R.id.data_layout_sleep_array || id == R.id.data_layout_step_layout) {
            this.e.onClick(view);
            return;
        }
        if (id == R.id.time_strength_layout) {
            this.f7519b.onClick(view);
            return;
        }
        if (id == R.id.activityLayout || id == R.id.data_layout_emotion_pressure || id == R.id.data_layout_emotion_breath_count || id == R.id.data_layout_emotion_breath_array) {
            this.f7520c.onClick(view);
            return;
        }
        if (id == R.id.three_leaf_layout || id == R.id.three_leaf_layout_inflated || id == R.id.three_leaf_default_layout || id == R.id.three_leaf_default_layout_inflated) {
            e("cloverLife");
        } else if (id == R.id.bottom_step_layout || id == R.id.bottom_step_layout_2 || id == R.id.bottom_step_value) {
            e("HOME_HEALTH_LIFE_COMPLETE_TODAY");
        } else {
            LogUtil.a("ThreeLeafCardSection", "click others.");
        }
    }

    private void e(String str) {
        this.d.onClick(this.itemView);
        ffv.a(this.mContext, Uri.parse("").buildUpon().appendQueryParameter("from", str).build());
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        LogUtil.a("ThreeLeafCardSection", "oonConfigurationChanged");
        this.f7518a.onClick(this.itemView);
        super.onConfigurationChanged(configuration);
        updateLayout();
    }

    @Override // com.huawei.health.knit.section.homesection.ModelBaseCardSection
    public void refreshUiForVisible() {
        this.z.onClick(this.itemView);
    }
}
