package com.xiaomi.hm.health.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.huami.android.design.dialog.choice.ChoiceView;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.hmwatchmanager.R;
import com.huami.watch.transport.Transporter;
import com.xiaomi.hm.health.baseui.GlobalTitleStyle;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.usernew.WeightUnit;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.model.WeatherSetting;
import com.xiaomi.hm.health.eventbus.EventUnitChanged;
import com.xiaomi.hm.health.manager.UnitManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.SetUnitActivity;
import com.xiaomi.hm.health.ui.unit.UnitFunctionsKt;
import com.xiaomi.hm.health.weather.utils.SetTemperatureUnitUtil;
import de.greenrobot.event.EventBus;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public class SetUnitActivity extends BaseTitleActivity {
    private static final String C = "SetUnitActivity";
    public static final /* synthetic */ boolean D = false;

    @UnitManager.WEIGHT
    private int A;
    private boolean B;
    private UnitManager x;
    private ChoiceView y;

    @UnitManager.LENGTH
    private int z;

    public class a extends HMCallback<Boolean> {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(boolean z) {
            return "setDistanceUnitToMiLiPro:" + z;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(final boolean result) {
            super.onFinish(result);
            HMLog.info(SetUnitActivity.C, new Function0() { // from class: com.xiaomi.hm.health.ui.g
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return SetUnitActivity.a.b(result);
                }
            });
        }
    }

    public class b extends HMCallback<Boolean> {
        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(boolean z) {
            return "ret: " + z;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(final boolean result) {
            HMLog.info(SetUnitActivity.C, new Function0() { // from class: com.xiaomi.hm.health.ui.h
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return SetUnitActivity.b.b(result);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String A() {
        return "not support";
    }

    private void B(byte unit, HMCallback<Boolean> callback) {
        HMDeviceSource featureProDevice = HMDeviceConfig.getFeatureProDevice();
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(featureProDevice.getType());
        if (featureProDevice == HMDeviceSource.VDEVICE || device == null || !device.isConnected()) {
            return;
        }
        ((HMMiLiProDevice) device).setTempUnit(unit, callback);
    }

    private void C(boolean isMetric) {
        HMDeviceSource featureProDevice = HMDeviceConfig.getFeatureProDevice();
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(featureProDevice.getType());
        if (featureProDevice == HMDeviceSource.VDEVICE || device == null || !device.isConnected()) {
            return;
        }
        ((HMMiLiProDevice) device).setDistanceUnit(isMetric, new a());
    }

    private void D() {
        ChoiceView choiceView = (ChoiceView) findViewById(R.id.length_unit);
        choiceView.setBuilder(ChoiceView.Builder.with(this).setTitles(R.array.length_unit_titles).setChoiceItem(r(this.z)));
        choiceView.setOnItemClickedListener(new AdapterView.OnItemClickListener() { // from class: qq6
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                this.a.x(adapterView, view, i, j);
            }
        });
        this.y = (ChoiceView) findViewById(R.id.weight_unit);
        this.y.setBuilder(ChoiceView.Builder.with(this).setTitles(R.array.weight_unit_titles).setChoiceItem(t(this.A)));
        this.y.setOnItemClickedListener(new AdapterView.OnItemClickListener() { // from class: pq6
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                this.a.y(adapterView, view, i, j);
            }
        });
        final WeatherSetting weatherSettingFromJsonString = WeatherSetting.fromJsonString(HMPersonInfo.getInstance().getMiliConfig().getWeatherSetting());
        ChoiceView choiceView2 = (ChoiceView) findViewById(R.id.temperature_unit);
        if (!v()) {
            ((View) choiceView2.getParent()).setVisibility(8);
        }
        choiceView2.setBuilder(ChoiceView.Builder.with(this).setTitles(R.array.temperature_unit_titles).setChoiceItem(weatherSettingFromJsonString.getTemperatureUnit()));
        choiceView2.setOnItemClickedListener(new AdapterView.OnItemClickListener() { // from class: oq6
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                SetUnitActivity.z(weatherSettingFromJsonString, adapterView, view, i, j);
            }
        });
        TextView textView = (TextView) findViewById(R.id.unit_tip);
        if (!this.B) {
            textView.setVisibility(8);
            this.y.setMaskViewShow(s(false));
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.MINE_SETTING_SCALES_BIND_STATUS).setValue("Unbind"));
        } else {
            textView.setVisibility(0);
            textView.setText(getString(R.string.setting_unit_tip, new Object[]{getString(R.string.weight_setting_weight)}));
            this.y.setMaskViewShow(s(true));
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.MINE_SETTING_SCALES_BIND_STATUS).setValue(StatEvent.EventParams.BIND));
        }
    }

    private void E() {
        if (DeviceManager.getManager(this).isBoundDeviceConnected()) {
            SyncUtil.syncUnitToWatch(getApplicationContext(), Transporter.get(getApplicationContext(), "com.huami.watch.companion"));
        }
    }

    private void F(WeightUnit weightUnit) {
        HMMiLiProDevice miliProDevice = HMDeviceManager.getInstance().getMiliProDevice();
        if (miliProDevice == null || !miliProDevice.isHuamiOs()) {
            HMLog.info(C, new Function0() { // from class: rq6
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return SetUnitActivity.A();
                }
            });
        } else {
            miliProDevice.setWeightUnit(weightUnit, new b());
        }
    }

    private int r(@UnitManager.LENGTH int unit) {
        return unit == 1 ? 1 : 0;
    }

    @SuppressLint({"SwitchIntDef"})
    private boolean[] s(boolean hasBindWeight) {
        if (!hasBindWeight) {
            return new boolean[]{false, false, false};
        }
        int i = this.A;
        if (i != 1) {
            return i != 16 ? new boolean[]{false, true, true} : new boolean[]{true, true, false};
        }
        return new boolean[]{true, false, true};
    }

    @SuppressLint({"SwitchIntDef"})
    private int t(@UnitManager.WEIGHT int unit) {
        if (unit == 1) {
            return 1;
        }
        if (unit != 16) {
            return unit != 17 ? 0 : 3;
        }
        return 2;
    }

    private void u() {
        UnitManager unitManager = UnitManager.getInstance();
        this.x = unitManager;
        this.z = unitManager.getLengthUnit();
        this.A = this.x.getWeightUnit();
    }

    private boolean v() {
        return HMDeviceConfig.getFeatureProDevice() != HMDeviceSource.VDEVICE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String w() {
        return "HMDeviceWeightValueEvent";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(AdapterView adapterView, View view, int i, long j) {
        if (i == 0) {
            this.x.setLengthUnit(0);
            C(true);
        } else if (i == 1) {
            this.x.setLengthUnit(1);
            C(false);
        }
        E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(AdapterView adapterView, View view, int i, long j) {
        if (i == 0) {
            this.x.setWeightUnit(0);
        } else if (i == 1) {
            this.x.setWeightUnit(1);
        } else if (i == 2) {
            this.x.setWeightUnit(16);
        } else if (i == 3) {
            this.x.setWeightUnit(17);
        }
        F(UnitFunctionsKt.toBleWeightUnit(this.x.getWeightUnit()));
        E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z(WeatherSetting weatherSetting, AdapterView adapterView, View view, int i, long j) {
        SetTemperatureUnitUtil.INSTANCE.setTemperatureUnit(weatherSetting, (i == 0 || i != 1) ? (byte) 0 : (byte) 1);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        HMPersonInfo.getInstance().saveInfoAsync();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        setTheme(2132017904);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_unit);
        EventBus.getDefault().register(this);
        GlobalTitleStyle.setUnifyTitleStyle(this, getString(R.string.setting_unit));
        this.B = HMDeviceManager.getInstance().hasBound(HMDeviceSource.WEIGHT);
        u();
        D();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }

    public void onEvent(EventUnitChanged event) {
        HMLog.debug(C, new Function0() { // from class: sq6
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return SetUnitActivity.w();
            }
        });
        this.z = event.lengthUnit;
        this.A = event.weightUnit;
        this.y.setMaskViewShow(s(this.B));
    }
}
