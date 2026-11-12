package com.huawei.healthcloud.plugintrack.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.manager.inteface.ISportDataFragmentListener;
import com.huawei.healthcloud.plugintrack.ui.adapter.TrackGridViewAdapter;
import com.huawei.healthcloud.plugintrack.ui.viewholder.TrackMainFragmentShowType;
import com.huawei.healthcloud.plugintrack.ui.viewmodel.SelectDataViewModel;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.NoTitleHarmonyAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.interval.Interval;
import com.huawei.ui.commonui.interval.IntervalData;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.recycleview.RecyclerItemDecoration;
import com.huawei.ui.commonui.scrollview.HealthNestedScrollView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.iwy;
import defpackage.jhi;
import defpackage.jtz;
import defpackage.jue;
import defpackage.jvw;
import defpackage.jxk;
import defpackage.qlm;
import defpackage.qlq;
import defpackage.qqn;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class TrackGridActivity extends BaseActivity implements ISportDataFragmentListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f10898b = {R.color.heart_rate_warm_up, R.color.heart_rate_fat_burning, R.color.heart_rate_aerobic, R.color.heart_rate_anaerobic, R.color.heart_rate_limit};
    private static final int[] e = {R.color.heart_rate_warm_up, R.color.power_aerobic, R.color.heart_rate_fat_burning, R.color.heart_rate_aerobic, R.color.power_vomax, R.color.power_anaerobic, R.color.heart_rate_limit};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile String f10899a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TrackGridViewAdapter f10900c;
    private HealthCheckBox f;
    private boolean g;
    private HealthTextView h;
    private String i;
    private HealthTextView j;
    private boolean l;
    private HealthRecycleView n;
    private HealthCheckBox o;
    private Map<TrackMainFragmentShowType, jvw> p;
    private HealthCheckBox q;
    private NoTitleHarmonyAlertDialog r;
    private int s;
    private CustomTitleBar v;
    private SelectDataViewModel w;
    private HealthButton x;
    private final Map<TrackMainFragmentShowType, Boolean> m = new HashMap();
    private final Map<TrackMainFragmentShowType, HealthCheckBox> d = new HashMap();
    private int t = 0;
    private boolean k = true;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_track_grid);
        cancelAdaptRingRegion();
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.c("TrackGridActivity", "getIntentData, intent is null");
            return;
        }
        this.t = intent.getIntExtra("map_tracking_sport_type_sportting", 0);
        this.s = intent.getIntExtra("sport_data_source_sportting", 0);
        this.i = intent.getStringExtra("current_show_type");
        this.l = intent.getBooleanExtra("sport_with_link", false);
        this.k = intent.getBooleanExtra("power_zone_exist", true);
        this.g = intent.getBooleanExtra("jump_select_source", false);
        this.f10899a = this.i;
        int i = this.t;
        int i2 = this.s;
        LogUtil.a("TrackGridActivity", "mSportType: ", Integer.valueOf(i), ", mSportModel: ", Integer.valueOf(i2), ", mFirstShowTypeStr: ", this.i);
        h();
        b();
        c();
        a();
    }

    private void h() {
        if (this.s != 100) {
            return;
        }
        this.w = (SelectDataViewModel) new ViewModelProvider(this).get(SelectDataViewModel.class);
        ReleaseLogUtil.c("TrackGridActivity", "initViewModel enter sportType ", Integer.valueOf(this.t), " sportMode ", Integer.valueOf(this.s));
        Bundle bundle = new Bundle();
        bundle.putInt("map_tracking_sport_type_sportting", this.t);
        bundle.putInt("sport_data_source_sportting", this.s);
        this.w.init(bundle);
        this.w.requestData();
    }

    private void c() {
        if (getIntent() != null) {
            this.p = jue.e(getIntent().getBundleExtra("current_sport_data"));
        }
        TrackMainFragmentShowType trackMainFragmentShowTypeD = d();
        this.f10900c.e();
        for (int i = 0; i < this.f10900c.getItemCount(); i++) {
            TrackGridViewAdapter.b bVarB = this.f10900c.b(i);
            if (bVarB == null) {
                LogUtil.d("TrackGridActivity", "initData holder is null");
            } else {
                bVarB.c(bVarB.c() == trackMainFragmentShowTypeD);
            }
        }
        this.f10900c.notifyDataSetChanged();
        a(trackMainFragmentShowTypeD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TrackMainFragmentShowType d() {
        try {
            return TrackMainFragmentShowType.valueOf(this.f10899a);
        } catch (IllegalArgumentException e2) {
            ReleaseLogUtil.e("TrackGridActivity", "getTrackMainFragmentShowType exception ", ExceptionUtils.c(e2));
            return TrackMainFragmentShowType.TOTAL_TIME;
        }
    }

    private void b() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.titlebar_edit_data);
        this.v = customTitleBar;
        customTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: jlm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(view);
            }
        });
        this.v.setHeadTitleAndLeftButton(null);
        this.j = (HealthTextView) findViewById(R.id.data_value);
        this.h = (HealthTextView) findViewById(R.id.data_name);
        this.x = (HealthButton) findViewById(R.id.submit_button);
        this.n = (HealthRecycleView) findViewById(R.id.recycler_view);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.small_card_layout);
        TrackGridViewAdapter trackGridViewAdapter = new TrackGridViewAdapter(this, jtz.b().getValueHolderList(this.t, this.s, this.l, this.k), false);
        this.f10900c = trackGridViewAdapter;
        this.n.setAdapter(trackGridViewAdapter);
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(0);
        this.n.addItemDecoration(new RecyclerItemDecoration(qre.b(R.dimen.hw_show_public_size_8), qre.b(R.dimen.hw_show_public_size_0), arrayList));
        this.n.setHasFixedSize(true);
        this.n.setLayoutManager(new GridLayoutManager(this, this, 3, 1, false) { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackGridActivity.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        if (this.g) {
            this.n.setEnabled(false);
            this.n.setClickable(false);
            this.n.setAlpha(0.6f);
            constraintLayout.setFocusable(true);
            constraintLayout.setFocusableInTouchMode(true);
            constraintLayout.requestFocus();
            final HealthNestedScrollView healthNestedScrollView = (HealthNestedScrollView) findViewById(R.id.data_select_scroll_view);
            healthNestedScrollView.post(new Runnable() { // from class: jll
                @Override // java.lang.Runnable
                public final void run() {
                    healthNestedScrollView.fullScroll(130);
                }
            });
        }
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        finish();
    }

    private void e() {
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.small_card_layout);
        this.f = (HealthCheckBox) findViewById(R.id.heart_rate_check);
        this.o = (HealthCheckBox) findViewById(R.id.power_check);
        this.q = (HealthCheckBox) findViewById(R.id.single_check);
        if (((Boolean) jxk.f39164c.first).booleanValue() && ((Boolean) jxk.f39164c.second).booleanValue()) {
            this.d.put(TrackMainFragmentShowType.HEART_RATE, this.f);
            this.d.put(TrackMainFragmentShowType.POWER, this.o);
            this.m.put(TrackMainFragmentShowType.HEART_RATE, (Boolean) jxk.e.first);
            this.m.put(TrackMainFragmentShowType.POWER, (Boolean) jxk.e.second);
            this.f.setChecked(((Boolean) jxk.e.first).booleanValue());
            this.o.setChecked(((Boolean) jxk.e.second).booleanValue());
            i();
            j();
            return;
        }
        if (((Boolean) jxk.f39164c.first).booleanValue()) {
            this.d.put(TrackMainFragmentShowType.HEART_RATE, this.q);
            this.m.put(TrackMainFragmentShowType.HEART_RATE, (Boolean) jxk.e.first);
            this.q.setChecked(((Boolean) jxk.e.first).booleanValue());
            e(TrackMainFragmentShowType.HEART_RATE);
            return;
        }
        if (((Boolean) jxk.f39164c.second).booleanValue()) {
            this.d.put(TrackMainFragmentShowType.POWER, this.q);
            this.m.put(TrackMainFragmentShowType.POWER, (Boolean) jxk.e.second);
            this.q.setChecked(((Boolean) jxk.e.second).booleanValue());
            e(TrackMainFragmentShowType.POWER);
            return;
        }
        constraintLayout.setVisibility(8);
    }

    private void i() {
        final HealthCardView healthCardView = (HealthCardView) findViewById(R.id.cardView_heart);
        final Interval interval = (Interval) findViewById(R.id.heart_zone_interval);
        healthCardView.setVisibility(0);
        healthCardView.post(new Runnable() { // from class: jlj
            @Override // java.lang.Runnable
            public final void run() {
                this.e.d(healthCardView, interval);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(HealthCardView healthCardView, Interval interval) {
        d(interval, a(f10898b, qre.f(R.string.IDS_rate_zone_warmup_threshold), 0, (healthCardView.getWidth() - qrs.d((Context) this, 28.0f)) / 7), this.f);
    }

    private void j() {
        final HealthCardView healthCardView = (HealthCardView) findViewById(R.id.cardView_power_zone);
        final Interval interval = (Interval) findViewById(R.id.power_interval);
        healthCardView.setVisibility(0);
        healthCardView.post(new Runnable() { // from class: jlp
            @Override // java.lang.Runnable
            public final void run() {
                this.f38709b.c(healthCardView, interval);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(HealthCardView healthCardView, Interval interval) {
        d(interval, a(e, qre.f(R.string.IDS_power_zone_level_begin), 0, (healthCardView.getWidth() - qrs.d((Context) this, 28.0f)) / 9), this.o);
    }

    private void e(TrackMainFragmentShowType trackMainFragmentShowType) {
        String strF;
        String strF2;
        if (trackMainFragmentShowType == TrackMainFragmentShowType.HEART_RATE) {
            strF = qre.f(R.string.IDS_rate_zone_text);
            strF2 = qre.f(R.string.IDS_rate_zone_aerobic_threshold);
        } else if (trackMainFragmentShowType == TrackMainFragmentShowType.POWER) {
            strF = qre.f(R.string.IDS_power_zone);
            strF2 = qre.f(R.string.IDS_power_zone_level_rhythm);
        } else {
            ReleaseLogUtil.b("TrackGridActivity", "This type does not support display.");
            return;
        }
        HealthCardView healthCardView = (HealthCardView) findViewById(R.id.signal_heart_layout);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.single_card_text);
        Interval interval = (Interval) findViewById(R.id.heart_signal_interval);
        healthCardView.setVisibility(0);
        healthTextView.setText(strF);
        d(interval, a(f10898b, strF2, 2, qre.a(R.dimen.health_common_23dp)), this.q);
    }

    private void d(final Interval interval, final List<IntervalData> list, HealthCheckBox healthCheckBox) {
        if (interval == null || healthCheckBox == null) {
            LogUtil.c("TrackGridActivity", "param is null");
        } else {
            e(interval, list, healthCheckBox.isChecked());
            healthCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackGridActivity.2
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    TrackGridActivity.this.e(interval, list, z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Interval interval, List<IntervalData> list, boolean z) {
        if (interval == null) {
            LogUtil.c("TrackGridActivity", "interval is null");
            return;
        }
        if (z) {
            interval.setIntervalAlpha(1.0f);
        } else {
            interval.setIntervalAlpha(0.6f);
        }
        interval.setIntervalDataList(list);
    }

    private List<IntervalData> a(int[] iArr, String str, int i, float f) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            IntervalData intervalData = new IntervalData();
            int i3 = iArr[i2];
            intervalData.c(i3);
            if (i2 == i) {
                c(intervalData, str, f);
            } else {
                intervalData.d(f);
            }
            intervalData.a(qqn.b(qre.e(i3), 0.25f));
            intervalData.b(R.color.common_white_0alpha);
            if (i2 == 0) {
                intervalData.d(IntervalData.RoundCornerType.EDGE_START);
            } else if (i2 == iArr.length - 1) {
                intervalData.d(IntervalData.RoundCornerType.EDGE_END);
            }
            arrayList.add(intervalData);
        }
        return arrayList;
    }

    private void c(IntervalData intervalData, String str, float f) {
        qlm qlmVar = new qlm();
        qlmVar.b(true);
        qlmVar.e(qre.c(com.huawei.ui.commonui.R.drawable.icon_cursor_triangle_down));
        qlmVar.c(0.5f);
        intervalData.e(qlmVar);
        intervalData.d(f * 3.0f);
        qlq qlqVar = new qlq();
        qlqVar.a(str);
        qlqVar.a(R.dimen.health_common_14dp);
        qlqVar.b(intervalData.d(BaseApplication.b()));
        intervalData.b(qlqVar);
    }

    private void a() {
        this.v.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackGridActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!TrackGridActivity.this.g()) {
                    TrackGridActivity.this.finish();
                } else {
                    TrackGridActivity.this.f();
                }
            }
        });
        if (!this.g) {
            this.f10900c.d(new TrackGridViewAdapter.OnItemClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackGridActivity.3
                @Override // com.huawei.healthcloud.plugintrack.ui.adapter.TrackGridViewAdapter.OnItemClickListener
                public void onItemClick(View view, int i) {
                    TrackGridActivity.this.d(i);
                }
            });
        }
        this.x.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackGridActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TrackGridActivity.this.n();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        TrackGridViewAdapter trackGridViewAdapter = this.f10900c;
        if (trackGridViewAdapter == null) {
            LogUtil.d("TrackGridActivity", "clickItem mAdapter is null");
            return;
        }
        TrackGridViewAdapter.b bVarB = trackGridViewAdapter.b(i);
        if (bVarB == null) {
            LogUtil.d("TrackGridActivity", "clickItem holder is null");
            return;
        }
        TrackMainFragmentShowType trackMainFragmentShowTypeC = bVarB.c();
        this.f10899a = trackMainFragmentShowTypeC.name();
        a(trackMainFragmentShowTypeC);
        this.f10900c.e();
        bVarB.c(true);
        this.f10900c.notifyDataSetChanged();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.s == 100 && this.w != null) {
            LogUtil.a("TrackGridActivity", "mirror linkage subscribe to sports data");
            this.w.observeSportingData("selectAllData", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackGridActivity$$ExternalSyntheticLambda2
                @Override // androidx.lifecycle.Observer
                /* JADX INFO: renamed from: onChanged */
                public final void b(Object obj) {
                    this.f10901b.e(obj);
                }
            });
        } else {
            LogUtil.a("TrackGridActivity", "subscribe to sports data");
            iwy.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Object obj) {
        if (obj instanceof Bundle) {
            updateSportViewFragment((Bundle) obj);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ISportDataFragmentListener
    public void updateSportViewFragment(final Bundle bundle) {
        if (bundle == null) {
            return;
        }
        runOnUiThread(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackGridActivity.7
            @Override // java.lang.Runnable
            public void run() {
                TrackGridActivity.this.p = jue.e(bundle);
                TrackGridActivity.this.a(TrackGridActivity.this.d());
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (g()) {
            f();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        for (Map.Entry<TrackMainFragmentShowType, HealthCheckBox> entry : this.d.entrySet()) {
            TrackMainFragmentShowType key = entry.getKey();
            HealthCheckBox value = entry.getValue();
            if (key != null && value != null && this.m.containsKey(key) && Boolean.TRUE.equals(this.m.get(key)) != value.isChecked()) {
                return true;
            }
        }
        if (TextUtils.isEmpty(this.f10899a)) {
            LogUtil.c("TrackGridActivity", "mCurrentShowType is empty error");
            return false;
        }
        return !this.f10899a.equals(this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        for (Map.Entry<TrackMainFragmentShowType, HealthCheckBox> entry : this.d.entrySet()) {
            TrackMainFragmentShowType key = entry.getKey();
            HealthCheckBox value = entry.getValue();
            if (value != null) {
                int i = AnonymousClass10.f10902a[key.ordinal()];
                if (i == 1) {
                    jxk.d(value.isChecked(), this.t, this.s);
                    jxk.e = new Pair<>(Boolean.valueOf(value.isChecked()), (Boolean) jxk.e.second);
                } else if (i == 2) {
                    jxk.e(value.isChecked(), this.t, this.s);
                    jxk.e = new Pair<>((Boolean) jxk.e.first, Boolean.valueOf(value.isChecked()));
                }
            }
        }
        if (g()) {
            Intent intent = new Intent();
            intent.putExtra("current_show_type", this.g ? null : this.f10899a);
            setResult(-1, intent);
        }
        finish();
    }

    /* JADX INFO: renamed from: com.huawei.healthcloud.plugintrack.ui.activity.TrackGridActivity$10, reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10902a;

        static {
            int[] iArr = new int[TrackMainFragmentShowType.values().length];
            f10902a = iArr;
            try {
                iArr[TrackMainFragmentShowType.HEART_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10902a[TrackMainFragmentShowType.POWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        b(this.r);
        NoTitleHarmonyAlertDialog noTitleHarmonyAlertDialogD = new NoTitleHarmonyAlertDialog.Builder(this).e(getString(R.string.IDS_pace_range_exit_save_content)).c(getString(R.string.IDS_settings_button_cancal), new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackGridActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TrackGridActivity.this.finish();
            }
        }).b(getString(R.string.IDS_save), new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackGridActivity.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TrackGridActivity.this.n();
            }
        }).d();
        this.r = noTitleHarmonyAlertDialogD;
        noTitleHarmonyAlertDialogD.show();
    }

    private void b(BaseDialog baseDialog) {
        if (baseDialog == null || !baseDialog.isShowing()) {
            return;
        }
        baseDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TrackMainFragmentShowType trackMainFragmentShowType) {
        synchronized (this) {
            Map<TrackMainFragmentShowType, jvw> map = this.p;
            if (map != null && trackMainFragmentShowType != null) {
                jvw jvwVar = map.get(trackMainFragmentShowType);
                if (jvwVar == null) {
                    LogUtil.c("TrackGridActivity", "trackShowItemValue is null error");
                    return;
                }
                String strC = jvwVar.c();
                String strD = jvwVar.d();
                LogUtil.a("TrackGridActivity", "value: ", strC, ", valueInfo: ", strD);
                this.j.setText(strC);
                this.h.setText(strD);
                return;
            }
            LogUtil.c("TrackGridActivity", "mShowItemValueMap: ", map, ", showType: ", trackMainFragmentShowType);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.a("TrackGridActivity", BaseDialog.LIFE_CYCLE_ON_RESUME);
        if (jxk.a(this.t)) {
            jhi.b(getWindow(), true);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        LogUtil.a("TrackGridActivity", BaseDialog.LIFE_CYCLE_ON_PAUSE);
        if (jxk.a(this.t)) {
            jhi.b(getWindow(), false);
        }
        iwy.b(this);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
