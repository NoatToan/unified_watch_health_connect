package com.huawei.ui.main.stories.fitness.activity.active.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.threecircle.ThreeCircleConfigUtil;
import com.huawei.threecircle.manager.WheelChairStateManager;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.numberpicker.HealthNumberPicker;
import com.huawei.ui.commonui.utils.ScrollUtil;
import com.huawei.ui.commonui.view.threeCircle.ThreeCircleView;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.R;
import defpackage.lmf;
import defpackage.qgm;
import defpackage.qgt;
import defpackage.qgv;
import defpackage.qho;
import defpackage.qre;
import defpackage.qrs;
import defpackage.ttl;
import defpackage.tux;
import defpackage.ujq;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class GoalSettingDialog extends BaseDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f26566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f26568c;
    private int d;
    private HealthButton e;
    private int f;
    private TextView g;
    private boolean h;
    private HealthNumberPicker i;
    private Context j;
    private TextView k;
    private ttl l;
    private ThreeCircleView m;
    private LinearLayout n;
    private List<ttl> o;
    private TextView q;
    private View t;

    static /* synthetic */ int b(GoalSettingDialog goalSettingDialog) {
        int i = goalSettingDialog.d;
        goalSettingDialog.d = i + 1;
        return i;
    }

    public GoalSettingDialog(Context context) {
        super(context, R.style.DialogFullScreen, 0);
        this.d = 0;
        this.o = new ArrayList();
        this.j = context;
        d();
        h();
        this.h = qrs.af(this.j);
    }

    private void h() {
        LogUtil.a("GoalSettingDialog", "initView");
        this.t = ((LayoutInflater) this.j.getSystemService("layout_inflater")).inflate(R.layout.goal_setting_dialog, (ViewGroup) null);
        b();
        e();
        c();
        setContentView(this.t);
        j();
        m();
    }

    private void d() {
        ttl ttlVarD = d(0, qre.f(R.string.IDS_active_caloric), qre.f(R.string.IDS_three_leaf_set_target_9), R.plurals.IDS_kcal_day_dialog_value, R.color.new_goal_calorie_color);
        ttl ttlVarD2 = d(1, qre.f(R.string.IDS_active_workout), String.format(Locale.ENGLISH, qre.f(R.string.IDS_three_leaf_set_target_10), 150, 75), R.plurals.IDS_minute_day_dialog_value, R.color.new_goal_intensity_color);
        ttl ttlVarD3 = d(2, qho.e(R.string.IDS_active_hours), a(), R.plurals.IDS_hour_day_value, R.color.new_goal_activity_time_color);
        ttlVarD3.e(this.j.getDrawable(R.drawable.health_commonui_healthbutton_emphasize));
        ttlVarD3.c(qre.f(R.string.IDS_three_leaf_set_target_7));
        ttlVarD3.e(this.j.getColor(R.color.me_non_vip_btn_text_color));
        this.o.add(ttlVarD);
        this.o.add(ttlVarD2);
        this.o.add(ttlVarD3);
        this.l = this.o.get(0);
    }

    private String a() {
        if (WheelChairStateManager.a().d()) {
            return qre.f(R.string.IDS_three_leaf_set_target_11_wc);
        }
        return String.format(Locale.ENGLISH, qre.f(R.string.IDS_three_leaf_set_target_11), 1);
    }

    private ttl d(int i, String str, String str2, int i2, int i3) {
        ttl ttlVar = new ttl();
        ttlVar.c(qgm.d(i));
        ttlVar.b(str);
        ttlVar.d(str2);
        ttlVar.a(i2);
        ttlVar.d(i3);
        ttlVar.d(qgm.e(i));
        return ttlVar;
    }

    private void b() {
        this.n = (LinearLayout) this.t.findViewById(R.id.goal_setting_drag_layout);
        this.f26568c = (RelativeLayout) this.t.findViewById(R.id.goal_setting_drag_view);
        this.m = (ThreeCircleView) this.t.findViewById(R.id.goal_setting_three_circle_view);
        this.k = (TextView) this.t.findViewById(R.id.goal_title_text);
        this.g = (TextView) this.t.findViewById(R.id.goal_description_text);
        this.q = (TextView) this.t.findViewById(R.id.goal_setting_unit);
        if (WheelChairStateManager.a().d()) {
            this.m.a("secondCircle", R.drawable.wheel_excise_icon);
            this.m.a("thirdCircle", R.drawable.wheel_activity_icon);
        }
    }

    private void e() {
        HealthNumberPicker healthNumberPicker = (HealthNumberPicker) this.t.findViewById(R.id.goal_setting_number_picker);
        this.i = healthNumberPicker;
        healthNumberPicker.setOnValuePickedListener(new HealthNumberPicker.OnPickedListener() { // from class: tuw
            @Override // com.huawei.ui.commonui.numberpicker.HealthNumberPicker.OnPickedListener
            public final void onValuePicked(int i, int i2) {
                this.d.b(i, i2);
            }
        });
    }

    public /* synthetic */ void b(int i, int i2) {
        ttl ttlVar = this.l;
        ttlVar.c(CommonUtil.n(this.j, ttlVar.j()[this.i.getValue()]));
        LogUtil.a("GoalSettingDialog", "type now = ", Integer.valueOf(this.d), "; getGoalValue = ", Integer.valueOf(this.l.d()));
    }

    private void c() {
        tux tuxVar = new tux();
        final HealthViewPager healthViewPager = new HealthViewPager(this.j);
        healthViewPager.setAdapter(tuxVar);
        final HealthDotsPageIndicator healthDotsPageIndicator = (HealthDotsPageIndicator) this.t.findViewById(R.id.goal_setting_indicator);
        healthDotsPageIndicator.setViewPager(healthViewPager);
        HealthButton healthButton = (HealthButton) this.t.findViewById(R.id.goal_setting_button);
        this.e = healthButton;
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.active.view.GoalSettingDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                GoalSettingDialog.this.k();
                if (GoalSettingDialog.this.d < GoalSettingDialog.this.o.size() - 1) {
                    GoalSettingDialog.b(GoalSettingDialog.this);
                    GoalSettingDialog goalSettingDialog = GoalSettingDialog.this;
                    goalSettingDialog.l = (ttl) goalSettingDialog.o.get(GoalSettingDialog.this.d);
                    healthViewPager.setCurrentItem(GoalSettingDialog.this.d);
                    healthDotsPageIndicator.onPageSelected(GoalSettingDialog.this.d);
                    GoalSettingDialog goalSettingDialog2 = GoalSettingDialog.this;
                    goalSettingDialog2.b(goalSettingDialog2.d);
                    GoalSettingDialog goalSettingDialog3 = GoalSettingDialog.this;
                    goalSettingDialog3.c(goalSettingDialog3.d);
                    GoalSettingDialog goalSettingDialog4 = GoalSettingDialog.this;
                    goalSettingDialog4.c(2, goalSettingDialog4.d);
                    return;
                }
                GoalSettingDialog goalSettingDialog5 = GoalSettingDialog.this;
                goalSettingDialog5.c(3, goalSettingDialog5.d + 1);
                GoalSettingDialog.this.n();
            }
        });
        ImageView imageView = (ImageView) this.t.findViewById(R.id.goal_setting_cancel);
        imageView.setBackground(this.j.getResources().getDrawable(R.drawable.btn_close_light));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.active.view.GoalSettingDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("GoalSettingDialog", "cancel setting");
                GoalSettingDialog.this.dismiss();
                GoalSettingDialog goalSettingDialog = GoalSettingDialog.this;
                goalSettingDialog.c(1, goalSettingDialog.d + 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        int iD = this.l.d();
        LogUtil.a("GoalSettingDialog", "setGoalView. type = ", Integer.valueOf(i), "; goal = ", Integer.valueOf(iD));
        String[] strArrJ = this.l.j();
        this.k.setText(this.l.g());
        this.g.setText(this.l.h());
        this.q.setText(this.j.getResources().getQuantityString(this.l.f(), iD, ""));
        this.i.setSelectorPaintColor(ContextCompat.getColor(this.j, this.l.c()));
        this.i.setDisplayedValues(strArrJ);
        this.i.setMaxValue(strArrJ.length - 1);
        this.i.setMinValue(0);
        int iE = qgm.e(iD, strArrJ);
        LogUtil.a("GoalSettingDialog", "setGoalView position = ", Integer.valueOf(iE), "; mPickArray.length = ", Integer.valueOf(strArrJ.length));
        this.i.setValue(iE);
        this.i.setWrapSelectorWheel(true);
        i();
        d(i);
    }

    private void i() {
        if (this.l.a() != null) {
            this.e.setBackground(this.l.a());
        }
        if (this.l.b() != 0) {
            this.e.setTextColor(this.l.b());
        }
        if (TextUtils.isEmpty(this.l.e())) {
            return;
        }
        this.e.setText(this.l.e());
    }

    private void d(int i) {
        int i2;
        int iD = this.l.d();
        int i3 = 0;
        if (i == 0) {
            i2 = 0;
        } else if (i == 1) {
            i2 = iD;
            iD = 0;
        } else if (i == 2) {
            i2 = 0;
            i3 = iD;
            iD = 0;
        } else {
            LogUtil.j("GoalSettingDialog", "updateCircleProgress wrong type. type = ", Integer.valueOf(i));
            iD = 0;
            i2 = iD;
            iD = 0;
        }
        this.m.a("firstCircle", iD, iD);
        this.m.a("secondCircle", i2, i2);
        this.m.a("thirdCircle", i3, i3);
    }

    private void m() {
        b(0);
        c(0);
        LogUtil.a("GoalSettingDialog", "settingDialog start");
        if (LoginInit.getInstance(this.j).isBrowseMode()) {
            LogUtil.a("GoalSettingDialog", "not login, use defaultGoal.");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("900200007");
        arrayList.add("900200008");
        arrayList.add("900200009");
        qgv.a(arrayList, 0, new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.fitness.activity.active.view.GoalSettingDialog.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("GoalSettingDialog", "settingDialog onResponse: ", obj == null ? null : obj.toString());
                if (!(obj instanceof HashMap)) {
                    LogUtil.j("GoalSettingDialog", "onResponse: objData is not instanceof HashMap");
                    return;
                }
                Map map = (Map) obj;
                int iD = GoalSettingDialog.this.d(0, "900200007", (Map<String, qgt>) map);
                int iD2 = GoalSettingDialog.this.d(1, "900200008", (Map<String, qgt>) map);
                int iD3 = GoalSettingDialog.this.d(2, "900200009", (Map<String, qgt>) map);
                ((ttl) GoalSettingDialog.this.o.get(0)).c(iD / 1000);
                ((ttl) GoalSettingDialog.this.o.get(1)).c(iD2);
                ((ttl) GoalSettingDialog.this.o.get(2)).c(iD3);
                GoalSettingDialog.this.b(iD, iD2, iD3);
                HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.active.view.GoalSettingDialog.4.4
                    @Override // java.lang.Runnable
                    public void run() {
                        GoalSettingDialog.this.b(GoalSettingDialog.this.d);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, int i2, int i3) {
        this.f26566a = i / 1000;
        this.f = i2;
        this.f26567b = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: tur
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.d.a(i, obj);
            }
        }, "");
    }

    public /* synthetic */ void a(int i, Object obj) {
        if (i == 0) {
            g();
            ThreeCircleConfigUtil.a(true);
            dismiss();
            return;
        }
        LogUtil.j("GoalSettingDialog", "setGoalAndFinish login fail. ErrorCode = ", Integer.valueOf(i));
    }

    private void g() {
        int iD = this.o.get(0).d() * 1000;
        int iD2 = this.o.get(1).d();
        int iD3 = this.o.get(2).d();
        qgm.b("900200007", iD);
        qgm.b("900200008", iD2);
        qgm.b("900200009", iD3);
        LogUtil.a("GoalSettingDialog", "saveGoal caloricGoal = ", Integer.valueOf(iD), "; intensityGoal = ", Integer.valueOf(iD2), "; activityHourGoal = ", Integer.valueOf(iD3));
        d(iD, iD2, iD3);
        e(iD, iD2, iD3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        int i2 = 2;
        if (i != 1) {
            i2 = i == 2 ? 3 : 4;
        }
        ujq.e(7, i2);
    }

    private void e(int i, int i2, int i3) {
        a(this.f26566a, i / 1000, 4);
        a(this.f, i2, 2);
        a(this.f26567b, i3, 3);
    }

    private void a(int i, int i2, int i3) {
        ujq.e(i3, 7, i == i2 ? 2 : ujq.b(i, i2, i3, 0), i2);
    }

    private void d(int i, int i2, int i3) {
        HashMap map = new HashMap(3);
        map.put("900200007", Integer.valueOf(i));
        map.put("900200008", Integer.valueOf(i2));
        map.put("900200009", Integer.valueOf(i3));
        ObserverManagerUtil.e("GOAL_UPDATE_FROM_DIALOG", map);
    }

    private void j() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26568c, "translationY", 1200.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat);
        animatorSet.setDuration(400L);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.n, "alpha", 1.0f, 0.1f);
        objectAnimatorOfFloat.setDuration(400L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.n, "alpha", 0.1f, 1.0f);
        objectAnimatorOfFloat2.setDuration(400L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.start();
    }

    private void l() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (!qrs.af(this.j)) {
            attributes.width = ScrollUtil.b(this.j);
        }
        attributes.y = 0;
        window.setAttributes(attributes);
        window.setGravity(80);
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog, android.app.Dialog
    public void show() {
        super.show();
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d(int i, String str, Map<String, qgt> map) {
        int iD = qgm.d(i);
        if (map == null) {
            LogUtil.j("GoalSettingDialog", "goalMap is null, return");
            return iD;
        }
        if (map.get(str) == null) {
            LogUtil.j("GoalSettingDialog", "fail to get RecommendGoal, type = ", Integer.valueOf(i));
            return iD;
        }
        int iD2 = map.get(str).d();
        LogUtil.a("GoalSettingDialog", "get recommended type: ,", Integer.valueOf(i), "; goal = ", Integer.valueOf(iD2));
        return iD2 == 0 ? iD : iD2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, int i2) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("event", Integer.valueOf(i));
        map.put("page", Integer.valueOf(i2));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_CIRCLE_RING_GUIDE_1040114.value(), map, 0);
    }

    private void f() {
        int iC;
        LogUtil.j("GoalSettingDialog", "setCenterCardLayout() ");
        View view = this.t;
        if (view == null) {
            LogUtil.j("GoalSettingDialog", "setCenterCardLayout() mTextContainer is null.");
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (qrs.af(this.j)) {
            HealthColumnSystem healthColumnSystem = new HealthColumnSystem(BaseApplication.getContext());
            iC = (int) (healthColumnSystem.c() + healthColumnSystem.f() + healthColumnSystem.b());
            LogUtil.a("GoalSettingDialog", "setCenterCardLayout() healthColumnSystem count = ", Integer.valueOf(healthColumnSystem.j()), " SingleColumnWidth:", Float.valueOf(healthColumnSystem.f()));
            LogUtil.a("GoalSettingDialog", "setCenterCardLayout() marginLeft = ", Integer.valueOf(iC));
        } else {
            iC = 0;
        }
        if (layoutParams2 != null) {
            layoutParams2.leftMargin = iC;
            layoutParams2.rightMargin = iC;
            this.t.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog
    public void configDialog() {
        if (this.h) {
            f();
        }
    }
}
