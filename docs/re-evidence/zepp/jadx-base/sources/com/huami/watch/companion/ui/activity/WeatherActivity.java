package com.huami.watch.companion.ui.activity;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.huami.watch.companion.R;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.location.Location;
import com.huami.watch.companion.location.LocationListener;
import com.huami.watch.companion.location.LocationManager;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.companion.ui.view.WheelAdapter;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.companion.weather.WeatherManager;
import com.huami.watch.companion.weather.WeatherService;
import com.huami.watch.companion.weather.WeatherWatchExtender;
import com.huami.watch.companion.weather.bean.WeatherCity;
import com.huami.watch.hmwatchmanager.view.AlertDialogFragment;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.Log;
import com.huami.widget.wheelview.WheelView;

/* JADX INFO: loaded from: classes16.dex */
public class WeatherActivity extends WeatherBaseActivity {
    public static final int REQUEST_CITY_PICK = 1;
    private static final String h = "Weather-Activity";
    private LocationListener c = new a();
    private TextView d;
    private TextView e;
    private Switch f;
    private Switch g;

    public static class WeatherTempUnitPickFragment extends Fragment {
        private View a;
        private WheelView b;

        private void a() {
            this.b = (WheelView) this.a.findViewById(R.id.picker);
            Activity activity = getActivity();
            WheelView wheelView = this.b;
            int color = getResources().getColor(R.color.wheel_center_color);
            Resources resources = getResources();
            int i = R.color.wheel_dark_color;
            WheelAdapter wheelAdapter = new WheelAdapter(activity, 0, 1, wheelView, color, resources.getColor(i), getResources().getColor(i), false, 64, 8, 6, 6);
            wheelAdapter.setMode(20);
            this.b.setVisibleItems(3).setCenterDrawable(R.color.transparent).setViewAdapter(wheelAdapter);
            if (WeatherWatchExtender.isUnitFahrenheit(getActivity())) {
                this.b.setCurrentItem(1);
            } else {
                this.b.setCurrentItem(0);
            }
        }

        public boolean isF() {
            return this.b.getCurrentItem() == 1;
        }

        @Override // android.app.Fragment
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            this.a = layoutInflater.inflate(R.layout.fragment_weather_temp_unit_picker, viewGroup, false);
            a();
            return this.a;
        }
    }

    public class a implements LocationListener {
        public a() {
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
        @Override // com.huami.watch.companion.location.LocationListener
        public void onLocationError(int i) {
            if (i == 2) {
                WeatherActivity weatherActivity = WeatherActivity.this;
                weatherActivity.showLBSPermissionTipDialog(weatherActivity);
            }
        }

        @Override // com.huami.watch.companion.location.LocationListener
        public void onLocationReceived(@NonNull Location location) {
            WeatherActivity.this.dismissLBSPermissionTipDialog();
            WeatherActivity weatherActivity = WeatherActivity.this;
            if (WeatherManager.getManager(weatherActivity).isUserCity()) {
                Log.d(WeatherActivity.h, "OnLocReceived, UserCity Now, ignore!!", new Object[0]);
            } else {
                WeatherActivity weatherActivity2 = WeatherActivity.this;
                weatherActivity2.refreshCurrentWeatherCityLbs(weatherActivity, weatherActivity2.d, location);
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WeatherActivity.this.finish();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WeatherManager.getManager(null).cleanSavedWeatherInfo();
            Analytics.event(WeatherActivity.this, "WeatherTest");
            WeatherService.start(WeatherActivity.this);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Analytics.event(WeatherActivity.this, AnalyticsEvents.EVENT_TURN_WEATHER_SWITCH, 1);
            WeatherActivity.this.f.setChecked(!WeatherActivity.this.f.isChecked());
        }
    }

    public class e implements CompoundButton.OnCheckedChangeListener {
        public e() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            WeatherWatchExtender.enableDailyNotification(WeatherActivity.this, z);
            WeatherWatchExtender.cleanLastSyncTime(WeatherActivity.this);
            WeatherService.start(WeatherActivity.this);
            SyncUtil.syncWeatherConfigToWatch(WeatherActivity.this);
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Analytics.event(WeatherActivity.this, AnalyticsEvents.EVENT_TURN_WEATHER_WARNING_SWITCH, 1);
            WeatherActivity.this.g.setChecked(!WeatherActivity.this.g.isChecked());
        }
    }

    public class g implements CompoundButton.OnCheckedChangeListener {
        public g() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            WeatherWatchExtender.enableWarningNotification(WeatherActivity.this, z);
            WeatherWatchExtender.cleanLastSyncTime(WeatherActivity.this);
            WeatherService.start(WeatherActivity.this);
            SyncUtil.syncWeatherConfigToWatch(WeatherActivity.this);
            Analytics.event(WeatherActivity.this, AnalyticsEvents.EVENT_TURN_PRE_WARNING_SWITCH, 1);
        }
    }

    public class h implements View.OnClickListener {
        public final /* synthetic */ WeatherTempUnitPickFragment a;
        public final /* synthetic */ AlertDialogFragment b;

        public h(WeatherTempUnitPickFragment weatherTempUnitPickFragment, AlertDialogFragment alertDialogFragment) {
            this.a = weatherTempUnitPickFragment;
            this.b = alertDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WeatherActivity.this.h(this.a.isF());
            this.b.dismiss();
        }
    }

    public class i implements View.OnClickListener {
        public final /* synthetic */ AlertDialogFragment a;

        public i(AlertDialogFragment alertDialogFragment) {
            this.a = alertDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(boolean z) {
        if (z != WeatherWatchExtender.isUnitFahrenheit(this)) {
            WeatherWatchExtender.setWeatherFahrenheit(this, z);
            i(this.e);
            if (DeviceManager.getManager(this).isCurrentDeviceBLE()) {
                WeatherWatchExtender.syncLastWeatherBleToWatch(this, false, false);
            } else {
                WeatherWatchExtender.syncLastWeatherToWatch(this, Transporter.get(this, "com.huami.watch.companion"), false, false);
            }
            SyncUtil.syncWeatherConfigToWatch(this);
        }
    }

    private void i(TextView textView) {
        if (WeatherWatchExtender.isUnitFahrenheit(this)) {
            textView.setText(R.string.weather_temp_unit_f);
        } else {
            textView.setText(R.string.weather_temp_unit_c);
        }
    }

    private void initViews() {
        this.d = (TextView) findViewById(R.id.weather_location_title);
        if (Config.isUserKR(this)) {
            this.d.setText(getString(R.string.kr_choose_city));
        }
        this.e = (TextView) findViewById(R.id.weather_temp_unit_value);
        this.f = (Switch) findViewById(R.id.enable_daily_notification);
        findViewById(R.id.enable_daily_notification_layout).setOnClickListener(new d());
        this.f.setChecked(WeatherWatchExtender.isDailyNotificationEnabled(this));
        this.f.setOnCheckedChangeListener(new e());
        findViewById(R.id.llyt_weather_wraning_notification).setOnClickListener(new f());
        Switch r0 = (Switch) findViewById(R.id.switch_weather_wraning_notification);
        this.g = r0;
        r0.setChecked(WeatherWatchExtender.isWarningNotificationEnabled(this));
        this.g.setOnCheckedChangeListener(new g());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 1 && i3 == -1) {
            if (intent.getBooleanExtra("ByLBS", false)) {
                WeatherManager.getManager(this).cleanUserCity();
            } else {
                WeatherCity weatherCity = new WeatherCity();
                weatherCity.setCityName(intent.getStringExtra("CityName"));
                weatherCity.setLocationKey(intent.getStringExtra("LocationKey"));
                WeatherManager.getManager(this).saveUserCity(weatherCity);
            }
            SyncUtil.syncWeatherCityToWatch(this);
            refreshCurrentWeatherCity(this, this.d);
            WeatherManager.getManager(this).cleanSavedWeatherInfo();
            WeatherService.start(this);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_weather);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.actionbar);
        actionbarLayout.setTitleText(getString(R.string.widget_weather_setting));
        actionbarLayout.setBackArrowClickListener(new b());
        if (Config.isTestMode()) {
            actionbarLayout.findViewById(R.id.title).setOnClickListener(new c());
        }
        initViews();
        i(this.e);
        refreshCurrentWeatherCity(this, this.d);
        if (!Config.isUserKR(this) || WeatherManager.getManager(this).getUserCity() != null) {
            LocationManager.getManager(this).addLocationListener(this.c);
        }
        WeatherManager.getManager(this).cleanSavedWeatherInfo();
        WeatherService.start(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LocationManager.getManager(this).removeLocationListener(this.c);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Analytics.endSession(this);
    }

    @Override // com.huami.watch.companion.ui.activity.WeatherBaseActivity
    public void onRefreshCurrentWeatherCity(TextView textView, @NonNull WeatherCity weatherCity, boolean z) {
        String cityName = weatherCity.getCityName();
        if (z) {
            cityName = getString(R.string.weather_city_by_lbs, new Object[]{cityName});
        }
        textView.setText(cityName);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Analytics.startSession(this);
        LocationManager.getManager(this).requestLocation();
    }

    public void onWeatherLocationClick(View view) {
        startActivityForResult(new Intent(this, (Class<?>) WeatherCityPickActivity.class), 1);
        Analytics.event(this, AnalyticsEvents.EVENT_CHOOSE_WEATHER_CITY, 1);
    }

    public void onWeatherTempUnitClick(View view) {
        Analytics.event(this, AnalyticsEvents.EVENT_CHOOSE_TEMPERATURE_UNIT, 1);
        showWeatherTempUnitPickDialog();
    }

    @Override // com.huami.watch.companion.ui.activity.WeatherBaseActivity
    public boolean refreshCurrentWeatherCity(Context context, TextView textView) {
        WeatherManager manager = WeatherManager.getManager(context);
        if (manager.isUserCity()) {
            WeatherCity lastCity = manager.getLastCity();
            if (lastCity != null) {
                onRefreshCurrentWeatherCity(textView, lastCity, false);
            }
        } else {
            refreshCurrentWeatherCityLbs(context, textView);
        }
        return false;
    }

    public void showWeatherTempUnitPickDialog() {
        AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(5);
        FragmentTransaction fragmentTransactionBeginTransaction = getFragmentManager().beginTransaction();
        WeatherTempUnitPickFragment weatherTempUnitPickFragment = new WeatherTempUnitPickFragment();
        alertDialogFragmentNewInstance.setContent(weatherTempUnitPickFragment);
        alertDialogFragmentNewInstance.setTitle(getString(R.string.weather_temp_unit));
        alertDialogFragmentNewInstance.setConfirm(getString(R.string.btn_set), new h(weatherTempUnitPickFragment, alertDialogFragmentNewInstance));
        alertDialogFragmentNewInstance.setCancel(getString(R.string.btn_cancel), new i(alertDialogFragmentNewInstance));
        alertDialogFragmentNewInstance.show(fragmentTransactionBeginTransaction, "WeatherTempUnitPick");
    }

    @Override // com.huami.watch.companion.ui.activity.WeatherBaseActivity
    public String tag() {
        return h;
    }
}
