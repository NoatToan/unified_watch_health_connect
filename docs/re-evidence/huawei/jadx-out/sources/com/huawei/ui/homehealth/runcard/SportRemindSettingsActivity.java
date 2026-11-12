package com.huawei.ui.homehealth.runcard;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.fitnessadvice.api.FitnessAdviceApi;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.adapter.GroupBtnSelectedAdapter;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.timepicker.HealthTimePickerDialog;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.homehealth.R;
import defpackage.lmf;
import defpackage.qrk;
import defpackage.qrs;
import defpackage.szr;
import defpackage.vym;
import health.compact.a.CommonUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class SportRemindSettingsActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthDivider f25811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f25812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthDivider f25813c;
    private boolean d;
    private boolean e;
    private HealthRecycleView f;
    private int g;
    private int i;
    private boolean j;
    private HealthSwitchButton k;
    private String l;
    private LinearLayout m;
    private String n;
    private GroupBtnSelectedAdapter o;
    private int p;
    private String q;
    private RelativeLayout r;
    private int t;
    private HealthTextView x;
    private boolean[] s = new boolean[7];
    private UiCallback h = new UiCallback<Map<String, String>>() { // from class: com.huawei.ui.homehealth.runcard.SportRemindSettingsActivity.2
        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("Track_SportRemindSettingsActivity", "mRemindDataUiCallback onFailure");
            SportRemindSettingsActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.SportRemindSettingsActivity.2.3
                @Override // java.lang.Runnable
                public void run() {
                    SportRemindSettingsActivity.this.j();
                }
            });
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Map<String, String> map) {
            LogUtil.a("Track_SportRemindSettingsActivity", "mRemindDataUiCallback onSuccess");
            if (map != null) {
                LogUtil.j("Track_SportRemindSettingsActivity", "onSuccess data != null ");
                SportRemindSettingsActivity.this.l = map.get("sport_remind_time");
                SportRemindSettingsActivity.this.n = map.get("sport_remind_period");
            }
            LogUtil.a("Track_SportRemindSettingsActivity", "mRemindDataUiCallback mRemindTime ", SportRemindSettingsActivity.this.l, " mRemindPeriod ", SportRemindSettingsActivity.this.n);
            SportRemindSettingsActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.SportRemindSettingsActivity.2.4
                @Override // java.lang.Runnable
                public void run() {
                    SportRemindSettingsActivity.this.j();
                    SportRemindSettingsActivity.this.c();
                }
            });
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("Track_SportRemindSettingsActivity", "onCreate");
        setContentView(R.layout.activity_sport_remind_settings);
        this.f25812b = this;
        d();
        a();
    }

    private void d() {
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("sport_remind_value", 0);
        this.p = intExtra;
        LogUtil.a("Track_SportRemindSettingsActivity", "initView() intent mSportRemindValue: ", Integer.valueOf(intExtra));
        ((CustomTitleBar) findViewById(R.id.title_bar_sport_remind_setting)).setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.SportRemindSettingsActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SportRemindSettingsActivity.this.finish();
            }
        });
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.sport_remind_time_container);
        this.r = relativeLayout;
        BaseActivity.setViewSafeRegion(false, relativeLayout);
        this.r.setOnClickListener(this);
        this.x = (HealthTextView) findViewById(R.id.sport_remind_time);
        ImageView imageView = (ImageView) findViewById(R.id.sport_remind_time_arrow);
        if (LanguageUtil.ba(this.f25812b)) {
            imageView.setImageResource(R.drawable.common_ui_arrow_left);
        } else {
            imageView.setImageResource(R.drawable.common_ui_arrow_right);
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.sport_remind_period_layout);
        this.m = linearLayout;
        BaseActivity.setViewSafeRegion(false, linearLayout);
        this.f = (HealthRecycleView) findViewById(R.id.period_reminder_layout);
        this.f25813c = (HealthDivider) findViewById(R.id.sport_remind_divider1);
        this.f25811a = (HealthDivider) findViewById(R.id.sport_remind_divider2);
    }

    private void a() {
        HealthSwitchButton healthSwitchButton = (HealthSwitchButton) findViewById(R.id.sport_remind_switch);
        this.k = healthSwitchButton;
        if (this.p == 0) {
            healthSwitchButton.setChecked(false);
            e();
        } else {
            healthSwitchButton.setChecked(true);
            szr.e((UiCallback<Map<String, String>>) this.h);
        }
        this.k.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.homehealth.runcard.SportRemindSettingsActivity.3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                LogUtil.a("Track_SportRemindSettingsActivity", "mRemindSwitch onCheckedChanged() isChecked: ", Boolean.valueOf(z));
                SportRemindSettingsActivity.this.e(z);
                if (z) {
                    SportRemindSettingsActivity.this.n = null;
                    SportRemindSettingsActivity.this.l = null;
                    SportRemindSettingsActivity.this.j();
                    SportRemindSettingsActivity.this.c();
                } else {
                    SportRemindSettingsActivity.this.e();
                    SportRemindSettingsActivity.this.b();
                    ((FitnessAdviceApi) Services.b("PluginFitnessAdvice", FitnessAdviceApi.class)).deleteFitnessCard();
                }
                if (compoundButton.isPressed()) {
                    SportRemindSettingsActivity.this.j = true;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.r.setVisibility(8);
        this.m.setVisibility(8);
        this.f25813c.setVisibility(8);
        this.f25811a.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        f();
        i();
        this.f25813c.setVisibility(0);
        this.f25811a.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        String string;
        if (z) {
            string = Integer.toString(1);
            this.t = 1;
            this.p = 1;
        } else {
            string = Integer.toString(0);
            this.t = 0;
            this.p = 0;
        }
        SharedPreferenceManager.e(this.f25812b, Integer.toString(20002), "sport_remind_is_opened", string, null);
    }

    private void f() {
        int iJ;
        this.r.setVisibility(0);
        LogUtil.a("Track_SportRemindSettingsActivity", "remindTime ", this.l);
        if (!TextUtils.isEmpty(this.l)) {
            iJ = CommonUtils.j(this.l);
        } else {
            String strE = SharedPreferenceManager.e(this.f25812b, Integer.toString(20002), "sport_remind_reminder_time");
            LogUtil.a("Track_SportRemindSettingsActivity", "value ", strE);
            iJ = !TextUtils.isEmpty(strE) ? CommonUtils.j(strE) : 66600;
        }
        LogUtil.a("Track_SportRemindSettingsActivity", "showRemindTimeText() remindTimeValue: ", Integer.valueOf(iJ));
        SharedPreferenceManager.e(this.f25812b, Integer.toString(20002), "sport_remind_reminder_time", Integer.toString(iJ), null);
        this.g = iJ / 3600;
        this.i = (iJ % 3600) / 60;
        h();
    }

    private void i() {
        this.m.setVisibility(0);
        LogUtil.a("Track_SportRemindSettingsActivity", "mRemindPeriod ", this.n);
        int length = this.s.length;
        if (TextUtils.isEmpty(this.n)) {
            d(length);
        } else if (this.n.length() == 1) {
            szr.a(this.n, length, this.s);
        } else {
            szr.b(this.n, this.s);
        }
        a(new String[]{this.f25812b.getString(com.huawei.ui.device.R.string.IDS_monday), this.f25812b.getString(com.huawei.ui.device.R.string.IDS_tuesday), this.f25812b.getString(com.huawei.ui.device.R.string.IDS_wednesday), this.f25812b.getString(com.huawei.ui.device.R.string.IDS_thursday), this.f25812b.getString(com.huawei.ui.device.R.string.IDS_friday), this.f25812b.getString(com.huawei.ui.device.R.string.IDS_saturday), this.f25812b.getString(com.huawei.ui.device.R.string.IDS_sunday)});
    }

    private void a(String[] strArr) {
        final GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f25812b, 4) { // from class: com.huawei.ui.homehealth.runcard.SportRemindSettingsActivity.4
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        };
        this.f.setLayoutManager(gridLayoutManager);
        GroupBtnSelectedAdapter groupBtnSelectedAdapter = new GroupBtnSelectedAdapter(this.f25812b, strArr, this.s);
        this.o = groupBtnSelectedAdapter;
        groupBtnSelectedAdapter.c(this.f25812b.getResources().getDrawable(R.drawable.train_date_unselect_bg), this.f25812b.getResources().getColor(R.color.textColorPrimary));
        this.o.d(this.f25812b.getResources().getDrawable(R.drawable.train_date_selected_bg), this.f25812b.getResources().getColor(R.color.textColorPrimaryInverse));
        this.f.setAdapter(this.o);
        if (!this.d) {
            this.d = true;
            this.f.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.huawei.ui.homehealth.runcard.SportRemindSettingsActivity.1
                @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
                public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    GridLayoutManager gridLayoutManager2 = gridLayoutManager;
                    if (gridLayoutManager2 == null || gridLayoutManager2.getSpanCount() <= 1) {
                        return;
                    }
                    int spanCount = gridLayoutManager.getSpanCount();
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                    int dimensionPixelSize = SportRemindSettingsActivity.this.f25812b.getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.health_common_16dp);
                    int dimensionPixelSize2 = SportRemindSettingsActivity.this.f25812b.getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.dialog_btn_padding_left_right);
                    if (childAdapterPosition < spanCount) {
                        rect.bottom = dimensionPixelSize2;
                    } else {
                        rect.top = dimensionPixelSize2;
                    }
                    int i = ((spanCount - 1) * dimensionPixelSize) / spanCount;
                    int i2 = (childAdapterPosition % spanCount) * (dimensionPixelSize - i);
                    rect.left = i2;
                    rect.right = i - i2;
                }
            });
        }
        this.o.d(new GroupBtnSelectedAdapter.OnItemClickListener() { // from class: com.huawei.ui.homehealth.runcard.SportRemindSettingsActivity.7
            @Override // com.huawei.ui.commonui.adapter.GroupBtnSelectedAdapter.OnItemClickListener
            public void onItemClick(View view, HealthButton healthButton, int i) {
                SportRemindSettingsActivity.this.s[i] = !SportRemindSettingsActivity.this.s[i];
                SportRemindSettingsActivity.this.o.d(view, healthButton, i);
                SportRemindSettingsActivity.this.c();
                SportRemindSettingsActivity.this.e = true;
            }
        });
    }

    private void d(int i) {
        String strE = SharedPreferenceManager.e(this.f25812b, Integer.toString(20002), "sport_remind_reminder_period");
        LogUtil.a("Track_SportRemindSettingsActivity", "showRemindPeriodLayout() get remindPeriodStr: ", strE);
        if (TextUtils.isEmpty(strE)) {
            c(i);
        } else if (strE.length() == 1) {
            szr.a(strE, i, this.s);
        } else {
            szr.b(strE, this.s);
        }
    }

    private void c(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 != 5) {
                this.s[i2] = true;
            } else {
                this.s[i2] = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        int i = 0;
        while (true) {
            boolean[] zArr = this.s;
            if (i >= zArr.length) {
                break;
            }
            if (zArr[i]) {
                sb.append((i + 1) + "_");
                z = false;
            }
            i++;
        }
        this.q = "";
        if (z) {
            this.k.setChecked(false);
        } else {
            String string = sb.toString();
            this.q = string.substring(0, string.length() - 1);
        }
        LogUtil.a("Track_SportRemindSettingsActivity", "saveRemindPeriodData() save mSportPeriodValueStr: ", this.q);
        SharedPreferenceManager.e(this.f25812b, Integer.toString(20002), "sport_remind_reminder_period", this.q, null);
        d(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        if (z) {
            return;
        }
        int i = 0;
        while (true) {
            boolean[] zArr = this.s;
            if (i >= zArr.length) {
                return;
            }
            int i2 = i + 1;
            if (zArr[i]) {
                a(i2);
            } else {
                LogUtil.a("Track_SportRemindSettingsActivity", "updateRemindPeriodNotifyData() cancelReminder selectArrayDay: ", Integer.valueOf(i2));
                vym.c(i + 1001);
            }
            i = i2;
        }
    }

    private void a(int i) {
        szr.e(i, this.g, this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        for (int i = 0; i < this.s.length; i++) {
            vym.c(i + 1001);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null || qrs.c(500)) {
            return;
        }
        if (view.getId() == R.id.sport_remind_time_container) {
            g();
        } else {
            LogUtil.j("Track_SportRemindSettingsActivity", "wrong view id");
        }
    }

    private void g() {
        LogUtil.a("Track_SportRemindSettingsActivity", "showSportRemindTimeDialog()");
        if (!(this.f25812b.getSystemService("layout_inflater") instanceof LayoutInflater)) {
            LogUtil.e("Track_SportRemindSettingsActivity", "showSportRemindTimeDialog() object is invalid type");
            return;
        }
        HealthTimePickerDialog healthTimePickerDialog = new HealthTimePickerDialog(this, new HealthTimePickerDialog.TimeSelectedListener() { // from class: com.huawei.ui.homehealth.runcard.SportRemindSettingsActivity.8
            @Override // com.huawei.ui.commonui.timepicker.HealthTimePickerDialog.TimeSelectedListener
            public void onTimeSelected(int i, int i2) {
                SportRemindSettingsActivity.this.e = true;
                if (i != SportRemindSettingsActivity.this.g || i2 != SportRemindSettingsActivity.this.i) {
                    SportRemindSettingsActivity.this.g = i;
                    SportRemindSettingsActivity.this.i = i2;
                    int i3 = SportRemindSettingsActivity.this.g;
                    int i4 = SportRemindSettingsActivity.this.i;
                    SportRemindSettingsActivity.this.h();
                    String string = Integer.toString((i3 * 3600) + (i4 * 60));
                    LogUtil.a("Track_SportRemindSettingsActivity", "showSportRemindTimeDialog() save time: ", string);
                    SharedPreferenceManager.e(SportRemindSettingsActivity.this.f25812b, Integer.toString(20002), "sport_remind_reminder_time", string, null);
                    SportRemindSettingsActivity.this.d(false);
                    return;
                }
                LogUtil.a("Track_SportRemindSettingsActivity", "showSportRemindTimeDialog() select some time");
            }
        });
        healthTimePickerDialog.b(0, 0, 0, this.g, this.i);
        healthTimePickerDialog.e(getString(com.huawei.ui.main.R.string.IDS_track_remind_time));
        healthTimePickerDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, this.g);
        calendar.set(12, this.i);
        this.x.setText(qrk.a(this.f25812b, calendar.getTimeInMillis(), 1));
        calendar.clear();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        int i = (this.g * 3600) + (this.i * 60);
        HashMap map = new HashMap();
        map.put("sport_remind_switch_status", Integer.toString(this.p));
        map.put("sport_remind_period", this.q);
        map.put("sport_remind_time", Integer.toString(i));
        szr.d(map);
        if (this.e || this.j) {
            ((FitnessAdviceApi) Services.b("PluginFitnessAdvice", FitnessAdviceApi.class)).donateBySportRemind(map);
        }
        if (this.e) {
            HashMap map2 = new HashMap(4);
            map2.put("click", 1);
            map2.put("type", 2);
            map2.put("time", Integer.valueOf(i));
            map2.put(TypedValues.CycleType.S_WAVE_PERIOD, this.q);
            lmf.d().c(this.f25812b, AnalyticsValue.REMIND_SPORT_SELECT_TIME_AND_PERIOD.value(), map2, 0);
        }
        if (this.j) {
            HashMap map3 = new HashMap(2);
            map3.put("click", 1);
            map3.put("type", Integer.valueOf(this.t));
            lmf.d().c(this.f25812b, AnalyticsValue.REMIND_SPORT_CLICK_SWITCH_COUNT.value(), map3, 0);
        }
        super.onDestroy();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
