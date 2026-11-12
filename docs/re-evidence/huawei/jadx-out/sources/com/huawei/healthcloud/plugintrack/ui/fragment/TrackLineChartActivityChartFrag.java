package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.model.SportDetailChartDataType;
import com.huawei.healthcloud.plugintrack.ui.view.CustomTrackChartTitleBar;
import com.huawei.healthcloud.plugintrack.ui.view.linechart.HorizontalMarkerView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.bubblelayout.HealthBubbleLayout;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.commonui.view.trackview.TrackLineChartHolder;
import defpackage.jpq;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qmc;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class TrackLineChartActivityChartFrag extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f11126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthBubbleLayout f11127b;
    private SportDetailChartDataType e;
    private boolean i;
    private CustomTrackChartTitleBar g = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HwHealthBaseCombinedChart f11128c = null;
    private TrackLineChartHolder m = null;
    private View n = null;
    private int h = 0;
    private int d = -1;
    private int k = 0;
    private HorizontalMarkerView f = null;
    private Map<SportDetailChartDataType, HwHealthBaseBarLineDataSet> j = new HashMap(16);

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater == null) {
            LogUtil.e("Track_TrackLineChartActivityChartFrag", "inflater is null");
            return null;
        }
        this.f11126a = getContext();
        if (qrs.af(BaseApplication.getContext())) {
            this.n = layoutInflater.inflate(R.layout.track_linechart_frag_bigcd, (ViewGroup) null);
        } else {
            this.n = layoutInflater.inflate(R.layout.track_linechart_frag, (ViewGroup) null);
        }
        TrackLineChartHolder trackLineChartHolder = TrackLineChartHolder.getInstance();
        this.m = trackLineChartHolder;
        if (trackLineChartHolder == null) {
            LogUtil.j("Track_TrackLineChartActivityChartFrag", "mTrackLineChartHolder null,destroy!!! kill by mine");
            Intent intent = new Intent();
            intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.health.MainActivity");
            intent.setFlags(268468224);
            startActivity(intent);
            requireActivity().finish();
            return null;
        }
        h();
        this.f11128c = (HwHealthBaseCombinedChart) this.n.findViewById(R.id.track_new_heartview);
        i();
        Intent intent2 = getActivity().getIntent();
        if (intent2 == null) {
            LogUtil.j("Track_TrackLineChartActivityChartFrag", "intent null,return");
            return this.n;
        }
        Bundle extras = intent2.getExtras();
        if (extras == null) {
            LogUtil.j("Track_TrackLineChartActivityChartFrag", "bundle isEmpty,return");
            return this.n;
        }
        String str = (String) extras.getCharSequence("KEY_BASELINE");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Track_TrackLineChartActivityChartFrag", "baseLine isEmpty,return");
            return this.n;
        }
        d(str);
        c(extras);
        f();
        return this.n;
    }

    private void c(Bundle bundle) {
        g();
        List<SportDetailChartDataType> listE = e(bundle);
        if (this.m.isExistBoltData()) {
            this.g.setShowMode(1);
        }
        this.g.setIconClickable(listE);
        this.k = listE.size();
        this.h = 1;
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackLineChartActivityChartFrag.1
            @Override // java.lang.Runnable
            public void run() {
                TrackLineChartActivityChartFrag.this.c();
            }
        });
    }

    private void g() {
        this.g.setOnLineStatusChangedListener(new CustomTrackChartTitleBar.OnLineStatusChangedListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackLineChartActivityChartFrag.3
            @Override // com.huawei.healthcloud.plugintrack.ui.view.CustomTrackChartTitleBar.OnLineStatusChangedListener
            public void onLineStatusChanged(SportDetailChartDataType sportDetailChartDataType, boolean z) {
                if (sportDetailChartDataType == null) {
                    LogUtil.e("Track_TrackLineChartActivityChartFrag", "chartLayerType is null");
                    return;
                }
                LogUtil.a("Track_TrackLineChartActivityChartFrag", "onLineStatusChanged refresh");
                TrackLineChartActivityChartFrag.this.a(sportDetailChartDataType, z);
                HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet = (HwHealthBaseBarLineDataSet) TrackLineChartActivityChartFrag.this.j.get(sportDetailChartDataType);
                if (hwHealthBaseBarLineDataSet != null && !z) {
                    TrackLineChartActivityChartFrag.this.m.removeDataSet(TrackLineChartActivityChartFrag.this.f11128c, hwHealthBaseBarLineDataSet);
                    TrackLineChartActivityChartFrag.this.j.put(sportDetailChartDataType, null);
                    TrackLineChartActivityChartFrag.this.c(false);
                } else if (hwHealthBaseBarLineDataSet != null || !z) {
                    LogUtil.d("Track_TrackLineChartActivityChartFrag", "dataSet is null and is Selected is false");
                } else {
                    HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSetE = TrackLineChartActivityChartFrag.this.e(sportDetailChartDataType);
                    TrackLineChartActivityChartFrag.this.c(true);
                    TrackLineChartActivityChartFrag.this.j.put(sportDetailChartDataType, hwHealthBaseBarLineDataSetE);
                }
                TrackLineChartActivityChartFrag.this.f11128c.refresh();
                TrackLineChartActivityChartFrag.this.d();
                TrackLineChartActivityChartFrag.this.a();
            }
        });
        this.g.setOnBackListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackLineChartActivityChartFrag.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TrackLineChartActivityChartFrag.this.getActivity().finish();
            }
        });
    }

    private void f() {
        boolean z = this.f11126a.getSharedPreferences("retrack_file", 0).getBoolean("is_first_time_use_add_comparison_data", true);
        this.i = z;
        if (z && this.k > 1) {
            this.f11127b.setVisibility(0);
            this.f11127b.setOnClickListener(new View.OnClickListener() { // from class: jos
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f38777a.b(view);
                }
            });
        } else {
            this.f11127b.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        a();
    }

    public void a() {
        HealthBubbleLayout healthBubbleLayout;
        if (this.f11126a == null || (healthBubbleLayout = this.f11127b) == null || healthBubbleLayout.getVisibility() == 8) {
            return;
        }
        this.f11127b.setVisibility(8);
        SharedPreferences.Editor editorEdit = this.f11126a.getSharedPreferences("retrack_file", 0).edit();
        editorEdit.putBoolean("is_first_time_use_add_comparison_data", false);
        editorEdit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet;
        SportDetailChartDataType sportDetailChartDataTypeB = b();
        if (sportDetailChartDataTypeB == null || (hwHealthBaseBarLineDataSet = this.j.get(sportDetailChartDataTypeB)) == null) {
            return;
        }
        hwHealthBaseBarLineDataSet.setColor(c(hwHealthBaseBarLineDataSet.getColor(), z));
    }

    private SportDetailChartDataType b() {
        int i = 0;
        SportDetailChartDataType key = null;
        for (Map.Entry<SportDetailChartDataType, HwHealthBaseBarLineDataSet> entry : this.j.entrySet()) {
            if (entry.getValue() != null) {
                key = entry.getKey();
                i++;
            }
        }
        if (i == 1) {
            return key;
        }
        return null;
    }

    private int c(int i, boolean z) {
        return Color.argb(z ? 127 : 255, (16711680 & i) >> 16, (65280 & i) >> 8, i & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        HwHealthBaseCombinedChart hwHealthBaseCombinedChart;
        if (this.g == null || (hwHealthBaseCombinedChart = this.f11128c) == null) {
            return;
        }
        List<T> dataSets = ((qmc) hwHealthBaseCombinedChart.getData()).getDataSets();
        if (njy.e(dataSets)) {
            LogUtil.j("Track_TrackLineChartActivityChartFrag", "setTitle not find data,lineDataSets size zero,return");
            return;
        }
        ArrayList arrayList = new ArrayList(dataSets.size());
        for (T t : dataSets) {
            if (t instanceof HwHealthLineDataSet) {
                arrayList.add(((HwHealthLineDataSet) t).e().b());
            } else if (t instanceof HwHealthBarDataSet) {
                arrayList.add(((HwHealthBarDataSet) t).a().b());
            } else {
                LogUtil.e("Track_TrackLineChartActivityChartFrag", "dataSet type is error. pls check");
            }
        }
        int size = arrayList.size();
        String str = "";
        if (size == 1) {
            str = "" + ((String) arrayList.get(0));
        } else if (size == 2) {
            str = "" + String.format(BaseApplication.getContext().getResources().getString(R.string.IDS_chart_title_two), arrayList.get(0), arrayList.get(1));
        } else if (size == 3) {
            str = "" + String.format(BaseApplication.getContext().getResources().getString(R.string.IDS_chart_title_three), arrayList.get(0), arrayList.get(1), arrayList.get(2));
        } else {
            LogUtil.j("Track_TrackLineChartActivityChartFrag", "lineDataSets.size not support:", Integer.valueOf(arrayList.size()));
        }
        this.g.setTitle(str);
    }

    private void h() {
        this.g = (CustomTrackChartTitleBar) this.n.findViewById(R.id.linechart_titlebar);
        this.f = new HorizontalMarkerView(BaseApplication.getContext());
        this.f11127b = (HealthBubbleLayout) this.n.findViewById(R.id.track_click_add_comparison_data_layout);
        LinearLayout linearLayout = (LinearLayout) this.n.findViewById(R.id.markerview);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        linearLayout.addView(this.f, layoutParams);
    }

    private List<SportDetailChartDataType> e(Bundle bundle) {
        int i;
        ArrayList arrayList = new ArrayList(16);
        if (this.m.isExistHeartRateData()) {
            arrayList.add(SportDetailChartDataType.HEART_RATE);
        }
        if (this.m.isExistStepRateData()) {
            arrayList.add(SportDetailChartDataType.STEP_RATE);
        }
        if (this.m.isExistCadenceRateData()) {
            arrayList.add(SportDetailChartDataType.CADENCE);
        }
        if (this.m.isExistPaddleFreqData()) {
            arrayList.add(SportDetailChartDataType.PADDLE_FREQUENCY);
        }
        if (this.m.isExistAltitudeData()) {
            arrayList.add(SportDetailChartDataType.ALTITUDE);
        }
        if (bundle != null) {
            i = bundle.getInt(BleConstants.SPORT_TYPE);
        } else {
            LogUtil.j("Track_TrackLineChartActivityChartFrag", "constructExistLine(), bundle == null");
            i = 0;
        }
        if (this.m.isExistSpeedData() && jpq.i(i)) {
            arrayList.add(SportDetailChartDataType.SPEED_RATE);
        }
        d(arrayList, i);
        return arrayList;
    }

    private void d(List<SportDetailChartDataType> list, int i) {
        if (this.m.isExistSwolfData()) {
            list.add(SportDetailChartDataType.SWOLF);
        }
        if (this.m.isExistPullFreqData()) {
            list.add(SportDetailChartDataType.PULL_FREQ);
        }
        if (this.m.isExistRealTimePaceData() && !jpq.i(i)) {
            list.add(SportDetailChartDataType.REALTIME_PACE);
        }
        if (this.m.isExistRunningPostureData()) {
            if (this.m.isContractTimeValid()) {
                list.add(SportDetailChartDataType.GROUND_CONTACT_TIME);
            }
            b(list);
            if (this.m.isGroundImpactAccelerationValid()) {
                list.add(SportDetailChartDataType.GROUND_IMPACT_ACCELERATION);
            }
        }
        if (this.m.isExistSpo2Data()) {
            list.add(SportDetailChartDataType.SPO2);
        }
        if (this.m.isExistPowerData()) {
            list.add(SportDetailChartDataType.POWER);
        }
        if (this.m.isExistAnalogPowerData()) {
            list.add(SportDetailChartDataType.ANALOG_POWER);
        }
        if (this.m.isExistAnalogCadenceData()) {
            list.add(SportDetailChartDataType.ANALOG_CADENCE);
        }
        if (this.m.isExistSkippingSpeedData()) {
            list.add(SportDetailChartDataType.SKIPPING_SPEED);
        }
        if (this.m.isExistWeightFreqData()) {
            list.add(SportDetailChartDataType.PEAK_WEIGHT);
        }
    }

    private void b(List<SportDetailChartDataType> list) {
        if (this.m.isHangTimeValid()) {
            list.add(SportDetailChartDataType.HANG_TIME);
        }
        if (this.m.isImpactHangRateValid()) {
            list.add(SportDetailChartDataType.GROUND_HANG_TIME_RATE);
        }
        if (this.m.isVerticalOscillationValid()) {
            list.add(SportDetailChartDataType.VERTICAL_OSCILLATION);
        }
        if (this.m.isVerticalRatioValid()) {
            list.add(SportDetailChartDataType.VERTICAL_RATIO);
        }
        if (this.m.isActivePeakValid()) {
            list.add(SportDetailChartDataType.ACTIVE_PEAK);
        }
        if (this.m.isGcBalanceValid()) {
            list.add(SportDetailChartDataType.GC_TIME_BALANCE);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x008a  */
    private void d(String str) {
        str.hashCode();
        switch (str) {
            case "BASELINE_HEART_RATE":
                this.e = SportDetailChartDataType.HEART_RATE;
                this.d = 0;
                break;
            case "BASELINE_GROUND_CONTACT_TIME":
                this.e = SportDetailChartDataType.GROUND_CONTACT_TIME;
                this.d = 7;
                break;
            case "BASELINE_PULL_FREQ":
                this.e = SportDetailChartDataType.PULL_FREQ;
                this.d = 5;
                break;
            case "BASELINE_SWOLF":
                this.e = SportDetailChartDataType.SWOLF;
                this.d = 4;
                break;
            case "BASELINE_STEP_FRE":
                this.e = SportDetailChartDataType.STEP_RATE;
                this.d = 1;
                break;
            case "BASELINE_CADENCE_FRE":
                this.e = SportDetailChartDataType.CADENCE;
                this.d = 12;
                break;
            case "BASELINE_ALTITUDE":
                this.e = SportDetailChartDataType.ALTITUDE;
                this.d = 2;
                break;
            case "BASELINE_REALTIME_PACE":
                this.e = SportDetailChartDataType.REALTIME_PACE;
                this.d = 6;
                break;
            case "BASELINE_PADDLE_FRE":
                this.e = SportDetailChartDataType.PADDLE_FREQUENCY;
                this.d = 13;
                break;
            case "BASELINE_SPEED_RATE":
                this.e = SportDetailChartDataType.SPEED_RATE;
                this.d = 3;
                break;
            default:
                b(str);
                break;
        }
        this.g.setBaseLine(this.e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    private void b(String str) {
        str.hashCode();
        switch (str) {
            case "BASELINE_SPO2":
                this.e = SportDetailChartDataType.SPO2;
                this.d = 9;
                break;
            case "BASELINE_VERTICAL_OSCILLATION":
                this.e = SportDetailChartDataType.VERTICAL_OSCILLATION;
                this.d = 18;
                break;
            case "BASELINE_GROUND_IMPACT_ACCELERATION":
                this.e = SportDetailChartDataType.GROUND_IMPACT_ACCELERATION;
                this.d = 8;
                break;
            case "BASELINE_GC_TIME_BALANCE":
                this.e = SportDetailChartDataType.GC_TIME_BALANCE;
                this.d = 19;
                break;
            case "BASELINE_ACTIVE_PEAK":
                this.e = SportDetailChartDataType.ACTIVE_PEAK;
                this.d = 21;
                break;
            case "BASELINE_VERTICAL_RATIO":
                this.e = SportDetailChartDataType.VERTICAL_RATIO;
                this.d = 20;
                break;
            case "BASELINE_HANG_TIME":
                this.e = SportDetailChartDataType.HANG_TIME;
                this.d = 16;
                break;
            case "BASELINE_GROUND_HANG_TIME_RATE":
                this.e = SportDetailChartDataType.GROUND_HANG_TIME_RATE;
                this.d = 17;
                break;
            default:
                c(str);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    private void c(String str) {
        str.hashCode();
        switch (str) {
            case "BASELINE_ANALOG_POWER":
                this.e = SportDetailChartDataType.ANALOG_POWER;
                this.d = 41;
                break;
            case "BASELINE_JUMP_TIME":
                this.e = SportDetailChartDataType.JUMP_TIME;
                this.d = 10;
                break;
            case "BASELINE_POWER":
                this.e = SportDetailChartDataType.POWER;
                this.d = 14;
                break;
            case "BASELINE_SKIPPING_SPEED":
                this.e = SportDetailChartDataType.SKIPPING_SPEED;
                this.d = 15;
                break;
            case "BASELINE_ANALOG_CADENCE":
                this.e = SportDetailChartDataType.ANALOG_CADENCE;
                this.d = 42;
                break;
            case "BASELINE_WEIGHT":
                this.e = SportDetailChartDataType.PEAK_WEIGHT;
                this.d = 18;
                break;
            case "BASELINE_JUMP_HEIGHT":
                this.e = SportDetailChartDataType.JUMP_HEIGHT;
                this.d = 11;
                break;
            default:
                LogUtil.j("Track_TrackLineChartActivityChartFrag", "baseLine unrecognized!!!");
                break;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LogUtil.e("Track_TrackLineChartActivityChartFrag", "onStart ---- --------------");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.e("Track_TrackLineChartActivityChartFrag", "initData ---- --------------");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackLineChartActivityChartFrag.4
            @Override // java.lang.Runnable
            public void run() {
                TrackLineChartActivityChartFrag.this.j();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        e();
    }

    private void e() {
        HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSetE = e(this.e);
        if (hwHealthBaseBarLineDataSetE == null) {
            return;
        }
        this.j.put(this.e, hwHealthBaseBarLineDataSetE);
        LogUtil.a("Track_TrackLineChartActivityChartFrag", "initBaseLine refresh");
        this.f11128c.refresh();
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HwHealthBaseBarLineDataSet e(SportDetailChartDataType sportDetailChartDataType) {
        switch (AnonymousClass7.f11132c[sportDetailChartDataType.ordinal()]) {
            case 1:
                return this.m.addHeartRateDataLayer(this.f11128c, new TrackLineChartHolder.c().b(true), Float.MAX_VALUE);
            case 2:
                return this.m.addStepRateDataLayer(this.f11128c, new TrackLineChartHolder.c().b(true), Float.MAX_VALUE);
            case 3:
                return this.m.addCadenceRateDataLayer(this.f11128c, new TrackLineChartHolder.c().b(true));
            case 4:
                return this.m.addPaddleFreqDataLayer(this.f11128c, new TrackLineChartHolder.c().b(true));
            case 5:
                return this.m.addTrackAltitudeDataLayer(this.f11128c, new TrackLineChartHolder.c().b(true));
            case 6:
                return this.m.addTrackSpeedDataLayer(this.f11128c, new TrackLineChartHolder.c().b(true));
            case 7:
                return this.m.addTrackSwolfDataLayer(this.f11128c, new TrackLineChartHolder.c().b(true));
            case 8:
                return this.m.addTrackPullFreqDataLayer(this.f11128c, new TrackLineChartHolder.c().b(true));
            case 9:
                return this.m.addTrackRealTimePaceDataLayer(this.f11128c, new TrackLineChartHolder.c().b(true), Float.MAX_VALUE);
            case 10:
                return this.m.addRunningPostureDataLayer(this.f11128c, new TrackLineChartHolder.c().b(true).c(true), 7);
            case 11:
                return this.m.addRunningPostureDataLayer(this.f11128c, new TrackLineChartHolder.c().b(true).c(true), 16);
            default:
                return c(sportDetailChartDataType);
        }
    }

    private HwHealthBaseBarLineDataSet c(SportDetailChartDataType sportDetailChartDataType) {
        switch (sportDetailChartDataType) {
            case GROUND_HANG_TIME_RATE:
                return this.m.addRunningPostureDataLayer(this.f11128c, new TrackLineChartHolder.c().b(true).c(true), 17);
            case GROUND_IMPACT_ACCELERATION:
                return this.m.addRunningPostureDataLayer(this.f11128c, new TrackLineChartHolder.c().b(true), 8);
            case GC_TIME_BALANCE:
                return this.m.addRunningPostureDataLayer(this.f11128c, new TrackLineChartHolder.c().b(true).c(true), 19);
            case VERTICAL_OSCILLATION:
                return this.m.addRunningPostureDataLayer(this.f11128c, new TrackLineChartHolder.c().b(true).c(true), 18);
            case VERTICAL_RATIO:
                return this.m.addRunningPostureDataLayer(this.f11128c, new TrackLineChartHolder.c().b(true).c(true), 20);
            case ACTIVE_PEAK:
                return this.m.addRunningPostureDataLayer(this.f11128c, new TrackLineChartHolder.c().b(true).c(true), 21);
            case SPO2:
                return this.m.addSpo2DataLayer(this.f11128c, new TrackLineChartHolder.c().b(true));
            case JUMP_TIME:
                return this.m.addJumpTimeDataLayer(this.f11128c, new TrackLineChartHolder.c().b(true));
            case JUMP_HEIGHT:
                return this.m.addJumpHeightDataLayer(this.f11128c, new TrackLineChartHolder.c().b(true));
            case POWER:
                return this.m.addPowerDataLayer(this.f11128c, new TrackLineChartHolder.c().b(true));
            case ANALOG_POWER:
                return this.m.addAnalogPowerDataLayer(this.f11128c, new TrackLineChartHolder.c().b(true));
            default:
                return d(sportDetailChartDataType);
        }
    }

    private HwHealthBaseBarLineDataSet d(SportDetailChartDataType sportDetailChartDataType) {
        switch (sportDetailChartDataType) {
            case SKIPPING_SPEED:
                return this.m.addSkippingSpeedDataLayer(this.f11128c, new TrackLineChartHolder.c().b(true));
            case PEAK_WEIGHT:
                return this.m.addWeightDataLayer(this.f11128c, new TrackLineChartHolder.c().b(true));
            case ANALOG_CADENCE:
                return this.m.addAnalogCadenceDataLayer(this.f11128c, new TrackLineChartHolder.c().b(true));
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SportDetailChartDataType sportDetailChartDataType, boolean z) {
        HashMap map = new HashMap(16);
        if (z) {
            this.h++;
            map.put("click", 1);
        } else {
            this.h--;
            map.put("click", 0);
        }
        int i = AnonymousClass7.f11132c[sportDetailChartDataType.ordinal()];
        if (i == 21) {
            map.put("clickButton", 14);
        } else if (i == 22) {
            map.put("clickButton", 41);
        } else if (i != 25) {
            switch (i) {
                case 1:
                    map.put("clickButton", 0);
                    break;
                case 2:
                    map.put("clickButton", 1);
                    break;
                case 3:
                    map.put("clickButton", 12);
                    break;
                case 4:
                    map.put("clickButton", 13);
                    break;
                case 5:
                    map.put("clickButton", 2);
                    break;
                case 6:
                    map.put("clickButton", 3);
                    break;
                default:
                    map.put("clickButton", -1);
                    break;
            }
        } else {
            map.put("clickButton", 42);
        }
        map.put("base", Integer.valueOf(this.d));
        map.put("totalChart", Integer.valueOf(this.k));
        map.put("layerNums", Integer.valueOf(this.h));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.BI_TRACK_ADD_CHART_LAYER_1040033.value(), map, 0);
    }

    private void i() {
        this.f11128c.setOnMarkViewTextNotify(new HwHealthMarkerView.OnMarkViewTextNotify() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackLineChartActivityChartFrag.2
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthMarkerView.OnMarkViewTextNotify
            public void onTextChanged(String str, List<HwHealthMarkerView.d> list) {
                if (str == null || list == null) {
                    throw new AssertionError("LayoutInflater not found.");
                }
                if (list.size() != 1) {
                    if (list.size() != 2) {
                        if (list.size() != 3) {
                            LogUtil.e("Track_TrackLineChartActivityChartFrag", "data size is more than 3");
                            return;
                        } else {
                            TrackLineChartActivityChartFrag.this.f.d(str, list.get(0), list.get(1), list.get(2));
                            return;
                        }
                    }
                    TrackLineChartActivityChartFrag.this.f.e(str, list.get(0), list.get(1));
                    return;
                }
                TrackLineChartActivityChartFrag.this.f.e(str, list.get(0));
            }
        });
    }
}
