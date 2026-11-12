package com.xiaomi.hm.health.device;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.AccountWebExtApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.ListTile;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.model.WeatherSetting;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.utils.UIStandardUtilKt;
import com.xiaomi.hm.health.weather.utils.SetTemperatureUnitUtil;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMWeatherSettingActivity extends BaseTitleActivity implements View.OnClickListener {
    private WeatherSetting x = null;
    private HMPersonInfo y = null;
    private HMMiliConfig z = null;
    private ListTile A = null;
    private ListTile B = null;
    private final Lazy<AccountWebExtApi> C = KoinJavaComponent.inject(AccountWebExtApi.class);
    private final Lazy<DeviceManagerApi> D = KoinJavaComponent.inject(DeviceManagerApi.class);
    private final Lazy<DeviceXNavigator> E = KoinJavaComponent.inject(DeviceXNavigator.class);

    public class a extends BLEStatueListenerAdapter {
        public final /* synthetic */ ListTile a;

        public a(ListTile listTile) {
            this.a = listTile;
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void onEnableChange(boolean z) {
            HMWeatherSettingActivity.this.A.setEnabled(z);
            HMWeatherSettingActivity.this.B.setEnabled(z);
            this.a.setEnabled(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            WeatherSetting weatherSettingFromJsonString = WeatherSetting.fromJsonString(this.z.getWeatherSetting());
            this.x = weatherSettingFromJsonString;
            weatherSettingFromJsonString.setAlertEnable(z);
            this.z.setWeatherSetting(this.x.toJsonString());
            this.y.saveInfo(2);
            if (z) {
                DeviceXFunctionsKt.getWeatherApi().updateAlert();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(DialogInterface dialogInterface, int i) {
        if (this.x.getTemperatureUnit() == i) {
            return;
        }
        SetTemperatureUnitUtil.INSTANCE.setTemperatureUnit(this.x, (byte) i);
        s(this.x.getTemperatureUnit());
    }

    private void r() {
        new AlertDialogFragment.Builder(this).setTitle(R.string.setting_weather_temp).setNeutralButton(R.string.cancel, (DialogInterface.OnClickListener) null).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItems(R.array.setting_weather_temp_unit_array).setItemChoice(this.x.getTemperatureUnit()), new DialogInterface.OnClickListener() { // from class: wo3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.q(dialogInterface, i);
            }
        }).setCancelable(true).show(getSupportFragmentManager());
    }

    private void s(int i) {
        this.B.setTips(i == 0 ? R.string.setting_weather_temp_c : R.string.setting_weather_temp_f);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.weather_city) {
            this.E.getValue().startHMSelectCityActivity(this);
        } else if (id == R.id.weather_temp) {
            r();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_weather_setting);
        UIStandardUtilKt.setUnifyTitleStyle(this, getString(R.string.setting_weather));
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        this.y = hMPersonInfo;
        HMMiliConfig miliConfig = hMPersonInfo.getMiliConfig();
        this.z = miliConfig;
        this.x = WeatherSetting.fromJsonString(miliConfig.getWeatherSetting());
        this.A = (ListTile) findViewById(R.id.weather_city);
        this.B = (ListTile) findViewById(R.id.weather_temp);
        s(this.x.getTemperatureUnit());
        ListTile listTile = (ListTile) findViewById(R.id.weather_alert);
        if (this.D.getValue().getBoundDeviceSource(HMDeviceType.MILI) == HMDeviceSource.MILI_TOKYO) {
            listTile.setVisibility(8);
        }
        listTile.setChecked(this.x.isAlertEnable());
        listTile.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xo3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.p(compoundButton, z);
            }
        });
        BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager()).setBLEStatusListener(new a(listTile));
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        this.y = hMPersonInfo;
        HMMiliConfig miliConfig = hMPersonInfo.getMiliConfig();
        this.z = miliConfig;
        WeatherSetting weatherSettingFromJsonString = WeatherSetting.fromJsonString(miliConfig.getWeatherSetting());
        this.x = weatherSettingFromJsonString;
        this.A.setTips(weatherSettingFromJsonString.getDisplayCity());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.C.getValue().updateProfile(false);
    }
}
