package com.huawei.ui.main.stories.fitness.activity.active;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.util.ArrayUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouterUtils;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.threecircle.manager.WheelChairStateManager;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.numberpicker.HealthNumberPicker;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import defpackage.cyf;
import defpackage.iov;
import defpackage.qgm;
import defpackage.qgt;
import defpackage.qgv;
import defpackage.qho;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.ujq;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class ActiveTargetActivity extends BaseActivity implements View.OnClickListener {
    private ConstraintLayout aa;
    private HealthImageView ab;
    private HealthTextView ac;
    private HealthTextView ad;
    private int ae;
    private LinearLayout af;
    private ConstraintLayout ag;
    private ConstraintLayout ah;
    private ConstraintLayout ai;
    private HealthImageView aj;
    private int ak;
    private HealthTextView al;
    private int am;
    private HealthTextView an;
    private HealthTextView i;
    private HealthTextView k;
    private HealthTextView l;
    private HealthTextView m;
    private int n;
    private HealthImageView o;
    private int p;
    private int q;
    private int r;
    private HealthDivider s;
    private HealthImageView t;
    private HealthTextView u;
    private HealthTextView v;
    private int w;
    private a x = new a(this);
    private HealthTextView y;
    private int z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f26502a = R.plurals.IDS_kcal_day_value;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f26504c = R.plurals.IDS_minute_day_value;
    private static final int j = R.plurals.IDS_hour_day_value;
    private static final int h = R.string.IDS_setting_active_caloric;
    private static final int f = R.string.IDS_setting_active_workout;
    private static final int g = R.string.IDS_setting_active_hours;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f26503b = d();
    private static final int[] e = {10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90};
    private static final int[] d = {6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

    @Retention(RetentionPolicy.SOURCE)
    public @interface PickerType {
    }

    private static int[] d() {
        ArrayList arrayList = new ArrayList();
        for (int i = 50; i <= 5000; i += 10) {
            arrayList.add(Integer.valueOf(i));
        }
        int[] iArr = new int[arrayList.size()];
        return arrayList.stream().mapToInt(new cyf()).toArray();
    }

    public static void b(Context context, int i) {
        a(context, i, 0);
    }

    public static void e(Context context, int i, int i2) {
        a(context, i, i2);
    }

    private static void a(Context context, int i, int i2) {
        Intent intent = new Intent(BaseApplication.b(), (Class<?>) ActiveTargetActivity.class);
        intent.putExtra("from", i);
        if (i2 > 0) {
            intent.putExtra("key_picker_view", i2);
        }
        iov.d(context, intent);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_active_target);
        i();
        f();
        j();
    }

    private void i() {
        ((CustomTitleBar) findViewById(R.id.ctb_active_target_title)).setTitleBarBackgroundColor(ContextCompat.getColor(this, R.color.common_transparent));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout_suggestion_caloric);
        this.af = linearLayout;
        linearLayout.setVisibility(8);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.layout_suggestion_caloric_target);
        this.ah = constraintLayout;
        this.an = (HealthTextView) constraintLayout.findViewById(R.id.htv_item_left_text);
        this.al = (HealthTextView) this.ah.findViewById(R.id.htv_item_right_text);
        this.aj = (HealthImageView) this.ah.findViewById(R.id.hiv_right_arrow);
        this.i = (HealthTextView) findViewById(R.id.htv_caloric_suggestion);
        this.k = (HealthTextView) findViewById(R.id.htv_caloric_suggestion_change);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) findViewById(R.id.layout_caloric_target);
        this.ai = constraintLayout2;
        this.v = (HealthTextView) constraintLayout2.findViewById(R.id.htv_item_left_text);
        this.u = (HealthTextView) this.ai.findViewById(R.id.htv_item_right_text);
        this.t = (HealthImageView) this.ai.findViewById(R.id.hiv_right_arrow);
        this.s = (HealthDivider) findViewById(R.id.caloric_divider);
        ConstraintLayout constraintLayout3 = (ConstraintLayout) findViewById(R.id.layout_intensity_target);
        this.ag = constraintLayout3;
        this.ac = (HealthTextView) constraintLayout3.findViewById(R.id.htv_item_left_text);
        this.ad = (HealthTextView) this.ag.findViewById(R.id.htv_item_right_text);
        this.ab = (HealthImageView) this.ag.findViewById(R.id.hiv_right_arrow);
        ConstraintLayout constraintLayout4 = (ConstraintLayout) findViewById(R.id.layout_active_hours_target);
        this.aa = constraintLayout4;
        this.m = (HealthTextView) constraintLayout4.findViewById(R.id.htv_item_left_text);
        this.l = (HealthTextView) this.aa.findViewById(R.id.htv_item_right_text);
        this.o = (HealthImageView) this.aa.findViewById(R.id.hiv_right_arrow);
    }

    private void f() {
        Intent intent = getIntent();
        if (intent != null) {
            this.w = intent.getIntExtra("from", -1);
            this.ae = intent.getIntExtra("key_picker_view", 0);
            Uri uriB = AppRouterUtils.b(intent);
            if (uriB != null) {
                this.n = CommonUtil.j(uriB.getQueryParameter("caloricTarget"));
                this.p = CommonUtil.j(uriB.getQueryParameter("intensityTarget"));
                this.q = CommonUtil.j(uriB.getQueryParameter("standTarget"));
                m();
            }
        }
        g();
        h();
    }

    private void j() {
        this.ah.setOnClickListener(this);
        this.k.setOnClickListener(this);
        this.ai.setOnClickListener(this);
        this.ag.setOnClickListener(this);
        this.aa.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (qrs.c(500)) {
            LogUtil.j("SCUI_ActiveTargetActivity", "click too fast");
            return;
        }
        if (view == this.ai) {
            LogUtil.a("SCUI_ActiveTargetActivity", "onClick click view mLayoutCaloricTarget");
            c(f26502a, f26503b, h, this.u);
            return;
        }
        if (view == this.ah) {
            LogUtil.a("SCUI_ActiveTargetActivity", "onClick click view mLayoutSuggestionCaloricTarget");
            c(f26502a, f26503b, h, this.al);
            return;
        }
        if (view == this.ag) {
            LogUtil.a("SCUI_ActiveTargetActivity", "onClick click view mLayoutIntensityTarget");
            c(f26504c, e, f, this.ad);
            return;
        }
        if (view == this.aa) {
            LogUtil.a("SCUI_ActiveTargetActivity", "onClick click view mLayoutActiveHours");
            c(j, d, e(), this.l);
        } else {
            if (view == this.k) {
                LogUtil.a("SCUI_ActiveTargetActivity", "onClick click view mActiveCaloricSuggestionChange");
                a(this.am);
                c();
                a("900200007", this.am);
                c(4, this.am);
                qpx.e(BaseApplication.b(), getResources().getString(R.string.IDS_change_success));
                return;
            }
            LogUtil.a("SCUI_ActiveTargetActivity", "onClick click view else");
        }
    }

    private int e() {
        if (WheelChairStateManager.a().d()) {
            return R.string.IDS_active_hours_wheel;
        }
        return g;
    }

    private void c(int i, int[] iArr, int i2, HealthTextView healthTextView) {
        this.y = healthTextView;
        e(iArr, e(e(i), iArr), i2, i);
        c(i);
    }

    private int e(int i) {
        if (i == f26504c) {
            return this.z;
        }
        if (i == j) {
            return this.ak;
        }
        return this.af.getVisibility() == 0 ? this.am : this.r;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add("900200007");
        arrayList.add("900200008");
        arrayList.add("900200009");
        qgm.a(arrayList, new c());
    }

    private void m() {
        LogUtil.a("SCUI_ActiveTargetActivity", "setTargetValue mActiveCaloricValue is ", Integer.valueOf(this.n), ", mActiveIntensityValue is ", Integer.valueOf(this.p), ", mActiveStandValue is ", Integer.valueOf(this.q));
        if (ArrayUtils.contains(f26503b, this.n)) {
            a("900200007", this.n);
        }
        if (ArrayUtils.contains(e, this.p)) {
            a("900200008", this.p);
        }
        if (ArrayUtils.contains(d, this.q)) {
            a("900200009", this.q);
        }
    }

    private void k() {
        LogUtil.a("SCUI_ActiveTargetActivity", "showTargetPickerView mShowTarget ", Integer.valueOf(this.ae));
        int i = this.ae;
        if (i == 2) {
            c(f26504c, e, f, this.ad);
        } else if (i == 3) {
            c(j, d, e(), this.l);
        } else if (i == 4) {
            c(f26502a, f26503b, h, this.u);
        }
        this.ae = 0;
    }

    private void g() {
        this.an.setText(getString(R.string.IDS_active_caloric));
        this.v.setText(getString(R.string.IDS_active_caloric));
        a(270);
        this.ac.setText(getString(R.string.IDS_active_workout));
        this.ad.setText(getResources().getQuantityString(f26504c, 25, d(25)));
        this.m.setText(qho.e(R.string.IDS_active_hours));
        this.l.setText(getResources().getQuantityString(j, 12, d(12)));
    }

    private String d(int i) {
        return UnitUtil.e(i, 1, 0);
    }

    private void h() {
        if (LanguageUtil.ba(this)) {
            Drawable drawable = getResources().getDrawable(R.drawable.common_ui_arrow_left);
            this.aj.setBackground(drawable);
            this.t.setBackground(drawable);
            this.ab.setBackground(drawable);
            this.o.setBackground(drawable);
            return;
        }
        Drawable drawable2 = getResources().getDrawable(R.drawable.common_ui_arrow_right);
        this.aj.setBackground(drawable2);
        this.t.setBackground(drawable2);
        this.ab.setBackground(drawable2);
        this.o.setBackground(drawable2);
    }

    private String[] c(int i, int[] iArr) {
        int length = iArr.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            Resources resources = getResources();
            int i3 = iArr[i2];
            strArr[i2] = resources.getQuantityString(i, i3, d(i3));
        }
        return strArr;
    }

    private int e(int i, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < iArr.length - 1; i3++) {
            if (i > iArr[i3]) {
                int i4 = i3 + 1;
                if (i <= iArr[i4]) {
                    i2 = i4;
                    break;
                }
            }
        }
        LogUtil.a("SCUI_ActiveTargetActivity", "getDefaultPosition position is ", Integer.valueOf(i2));
        return i2;
    }

    private void e(final int[] iArr, int i, final int i2, final int i3) {
        final HealthNumberPicker healthNumberPicker = new HealthNumberPicker(this);
        final String[] strArrC = c(i3, iArr);
        healthNumberPicker.setDisplayedValues(strArrC);
        healthNumberPicker.setMaxValue(iArr.length - 1);
        healthNumberPicker.setMinValue(0);
        healthNumberPicker.setValue(i);
        healthNumberPicker.setWrapSelectorWheel(true);
        healthNumberPicker.setSelectionDivider(ContextCompat.getDrawable(this, R.drawable.numberpicker_line_title));
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this);
        builder.d(i2).a(healthNumberPicker).d(R.string.IDS_hw_common_ui_dialog_confirm, new DialogInterface.OnClickListener() { // from class: tsu
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                this.e.c(healthNumberPicker, iArr, strArrC, i3, i2, dialogInterface, i4);
            }
        }).a(R.string.IDS_hw_common_ui_dialog_cancel, new DialogInterface.OnClickListener() { // from class: tst
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                LogUtil.a("SCUI_ActiveTargetActivity", "showPickerView click negative button");
            }
        });
        CustomAlertDialog customAlertDialogB = builder.b();
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.show();
    }

    public /* synthetic */ void c(HealthNumberPicker healthNumberPicker, int[] iArr, String[] strArr, int i, int i2, DialogInterface dialogInterface, int i3) {
        LogUtil.a("SCUI_ActiveTargetActivity", "showPickerView click positive button");
        int value = healthNumberPicker.getValue();
        if (value < 0 || value > iArr.length - 1) {
            LogUtil.e("SCUI_ActiveTargetActivity", "showPickerView index out of bounds");
            return;
        }
        d(strArr[value].trim());
        if (iArr[value] != e(i)) {
            e(i2, healthNumberPicker.getValue());
        }
    }

    private void d(String str) {
        HealthTextView healthTextView = this.al;
        HealthTextView healthTextView2 = this.y;
        if (healthTextView == healthTextView2) {
            this.u.setText(str);
            c();
        } else {
            healthTextView2.setText(str);
        }
    }

    private void a(int i) {
        HealthTextView healthTextView = this.u;
        Resources resources = getResources();
        int i2 = f26502a;
        healthTextView.setText(resources.getQuantityString(i2, i, d(i)));
        this.al.setText(getResources().getQuantityString(i2, i, d(i)));
    }

    private void c(int i, HealthTextView healthTextView, int i2, int i3) {
        if (i > 0) {
            healthTextView.setText(getResources().getQuantityString(i2, i, d(i)));
        } else {
            healthTextView.setText(getResources().getQuantityString(i2, i3, d(i3)));
        }
    }

    private void e(int i, int i2) {
        if (i == h) {
            int[] iArr = f26503b;
            a("900200007", iArr[i2]);
            c(4, iArr[i2]);
        } else if (i == f) {
            int[] iArr2 = e;
            a("900200008", iArr2[i2]);
            c(2, iArr2[i2]);
        } else if (i == g || i == R.string.IDS_active_hours_wheel) {
            int[] iArr3 = d;
            a("900200009", iArr3[i2]);
            c(3, iArr3[i2]);
        } else {
            LogUtil.j("SCUI_ActiveTargetActivity", "saveTargetDataByTitleId else");
        }
        qpx.e(BaseApplication.b(), getResources().getString(R.string.IDS_change_success));
    }

    private void a(String str, int i) {
        LogUtil.a("SCUI_ActiveTargetActivity", "saveGoalValueToUserPreference key is ", str, " goalValue is ", Integer.valueOf(i));
        if ("900200007".equals(str)) {
            i *= 1000;
        }
        qgm.b(str, i);
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class a extends BaseHandler<ActiveTargetActivity> {
        a(ActiveTargetActivity activeTargetActivity) {
            super(activeTargetActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(ActiveTargetActivity activeTargetActivity, Message message) {
            if (message.what == 101) {
                Object obj = message.obj;
                if (obj instanceof HashMap) {
                    activeTargetActivity.c((HashMap<String, Integer>) obj);
                    activeTargetActivity.b();
                    return;
                }
                return;
            }
            if (message.what == 102) {
                Object obj2 = message.obj;
                if (obj2 instanceof HashMap) {
                    activeTargetActivity.a((HashMap<String, qgt>) obj2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("900200007");
        qgv.a(arrayList, 1, new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HashMap<String, qgt> map) {
        if (map.containsKey("900200007")) {
            int iD = map.get("900200007").d() / 1000;
            this.am = iD;
            if (iD <= 0 || this.r == iD) {
                return;
            }
            a();
            this.af.setVisibility(0);
            this.ai.setVisibility(8);
            this.s.setVisibility(8);
            Resources resources = getResources();
            int i = f26502a;
            int i2 = this.r;
            String quantityString = resources.getQuantityString(i, i2, d(i2));
            Resources resources2 = getResources();
            int i3 = R.plurals.IDS_kcal_day_value_ar;
            int i4 = this.am;
            this.i.setText(getString(R.string.IDS_caloric_suggestion, new Object[]{quantityString, resources2.getQuantityString(i3, i4, d(i4))}));
            this.k.setText(getString(R.string.IDS_modify_now).toUpperCase(Locale.ROOT));
            ujq.a(1);
        }
    }

    private void a() {
        Intent intent = getIntent();
        if (intent == null || intent.getIntExtra("key_picker_view", 0) != 4) {
            return;
        }
        this.y = this.al;
    }

    private void c() {
        this.af.setVisibility(8);
        this.ai.setVisibility(0);
        this.s.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(HashMap<String, Integer> map) {
        this.r = qgm.d(map, "900200007", 270000) / 1000;
        int i = ArrayUtils.contains(f26503b, this.n) ? this.n : this.r;
        this.r = i;
        a(i);
        this.z = qgm.d(map, "900200008", 25);
        int i2 = ArrayUtils.contains(e, this.p) ? this.p : this.z;
        this.z = i2;
        c(i2, this.ad, f26504c, 25);
        this.ak = qgm.d(map, "900200009", 12);
        int i3 = ArrayUtils.contains(d, this.q) ? this.q : this.ak;
        this.ak = i3;
        c(i3, this.l, j, 12);
        LogUtil.a("SCUI_ActiveTargetActivity", "showTargetContent: stepGoalValue = ", Integer.valueOf(this.r), " , intensityGoalValue = ", Integer.valueOf(this.z), " , standGoalValue = ", Integer.valueOf(this.ak));
        k();
        this.n = 0;
        this.p = 0;
        this.q = 0;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        a aVar = this.x;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
            this.x = null;
        }
    }

    private void c(int i) {
        int i2;
        if (i == f26504c) {
            i2 = 2;
        } else {
            i2 = i == j ? 3 : 4;
        }
        if (i2 != 4 || (this.ae > 0 && this.am <= 0)) {
            ujq.e(this.w, i2);
            return;
        }
        int i3 = this.w;
        int i4 = this.am;
        ujq.a(i3, i2, i4 > 0 && i4 != this.r);
    }

    private int d(int i, int i2, int i3) {
        return ujq.b(i, i2, i3, this.am);
    }

    private void c(int i, int i2) {
        LogUtil.a("SCUI_ActiveTargetActivity", "save goal type is ", Integer.valueOf(i), " value is ", Integer.valueOf(i2));
        d(i, i2);
        if (i == 2) {
            this.z = i2;
        } else if (i == 3) {
            this.ak = i2;
        } else {
            this.am = 0;
            this.r = i2;
        }
    }

    private void d(int i, int i2) {
        int iD;
        if (i == 2) {
            iD = d(this.z, i2, i);
        } else if (i == 3) {
            iD = d(this.ak, i2, i);
        } else {
            iD = d(this.r, i2, i);
        }
        ujq.e(i, this.w, iD, i2);
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class c implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<ActiveTargetActivity> f26505a;

        private c(ActiveTargetActivity activeTargetActivity) {
            this.f26505a = new WeakReference<>(activeTargetActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            ReleaseLogUtil.d("SCUI_ActiveTargetActivity", "onResponse: ", obj == null ? null : obj.toString());
            ActiveTargetActivity activeTargetActivity = this.f26505a.get();
            if (activeTargetActivity != null) {
                a aVar = activeTargetActivity.x;
                if (!(obj instanceof HashMap)) {
                    LogUtil.j("SCUI_ActiveTargetActivity", "onResponse: objData is not instanceof HashMap");
                    return;
                }
                if (aVar == null) {
                    ReleaseLogUtil.a("SCUI_ActiveTargetActivity", "handler is null");
                    return;
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                messageObtain.obj = (HashMap) obj;
                aVar.sendMessage(messageObtain);
                return;
            }
            LogUtil.j("SCUI_ActiveTargetActivity", "onResponse: activity is null");
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class e implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<ActiveTargetActivity> f26506c;

        private e(ActiveTargetActivity activeTargetActivity) {
            this.f26506c = new WeakReference<>(activeTargetActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            ActiveTargetActivity activeTargetActivity = this.f26506c.get();
            if (activeTargetActivity == null) {
                LogUtil.j("SCUI_ActiveTargetActivity", "CalorieRecommendDataCallback, onResponse: activity is null");
                return;
            }
            if (obj instanceof HashMap) {
                if (activeTargetActivity.x == null) {
                    ReleaseLogUtil.a("SCUI_ActiveTargetActivity", "handler is null");
                    return;
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = 102;
                messageObtain.obj = (HashMap) obj;
                activeTargetActivity.x.sendMessage(messageObtain);
                return;
            }
            LogUtil.j("SCUI_ActiveTargetActivity", "CalorieRecommendDataCallback, onResponse: objData is not instanceof HashMap");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
