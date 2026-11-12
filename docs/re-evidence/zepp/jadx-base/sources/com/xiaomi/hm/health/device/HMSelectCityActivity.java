package com.xiaomi.hm.health.device;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.account.HMLoginManager;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.Country;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMOtherVersion;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.device.model.WeatherSetting;
import com.xiaomi.hm.health.locweather.HMWeatherUpdater;
import com.xiaomi.hm.health.locweather.model.CityInfo;
import com.xiaomi.hm.health.locweather.model.WeatherInfos;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.utils.WeatherUtils;
import com.xiaomi.mipush.sdk.Constants;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMSelectCityActivity extends BaseTitleActivity implements View.OnClickListener {
    private static final String W = "HMSelectCityActivity";
    private static final String X = "android.net.conn.CONNECTIVITY_CHANGE";
    private static final int Y = 3;
    private static final int Z = 0;
    private static final int m0 = 1;
    private static final int n0 = 2;
    private static final int o0 = 3;
    private ImageView A;
    private ListTile B;
    private TextView C;
    private TextView D;
    private TextView E;
    private ImageView F;
    private ViewGroup G;
    private RecyclerView H;
    private ViewGroup I;
    private ViewGroup J;
    private ViewGroup K;
    private ViewGroup L;
    private d M;
    private ArrayList<CityInfo> N;
    private WeatherSetting Q;
    private BroadcastReceiver S;
    private LoadingDialog T;
    private String[] y;
    private EditText z;
    private int x = 0;
    private HMPersonInfo O = null;
    private HMMiliConfig P = null;
    private boolean R = false;
    private final Lazy<DeviceUtilsApi> U = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private final Lazy<DeviceManagerApi> V = KoinJavaComponent.inject(DeviceManagerApi.class);

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (NetUtil.isNetworkConnected(HMSelectCityActivity.this) && HMSelectCityActivity.this.R) {
                DeviceXFunctionsKt.getWeatherApi().requestLocationOnly();
                HMSelectCityActivity.this.B.setSubtitle(R.string.locating);
                HMSelectCityActivity.this.R = false;
            }
        }
    }

    public class b extends RecyclerView.Adapter<a> {

        public class a extends RecyclerView.ViewHolder {
            private final TextView a;

            public a(View view) {
                super(view);
                this.a = (TextView) view.findViewById(R.id.city_tv);
            }
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i, View view) {
            HMLog.i(HMSelectCityActivity.W, "click common city list search.", new Object[0]);
            if (!NetUtil.isNetworkConnected(HMSelectCityActivity.this)) {
                HMSelectCityActivity hMSelectCityActivity = HMSelectCityActivity.this;
                IconToast.showError(hMSelectCityActivity, hMSelectCityActivity.getString(R.string.no_network_connection));
            } else {
                HMSelectCityActivity.this.x = 1;
                HMSelectCityActivity hMSelectCityActivity2 = HMSelectCityActivity.this;
                hMSelectCityActivity2.X(hMSelectCityActivity2.y[i], true);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull a aVar, final int i) {
            aVar.a.setText(HMSelectCityActivity.this.y[i]);
            aVar.a.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.b(i, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.city_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            return HMSelectCityActivity.this.y.length;
        }
    }

    public class c extends AsyncTask<String, Void, List<CityInfo>> {
        private final boolean a;

        public c(boolean z) {
            this.a = z;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<CityInfo> doInBackground(String... strArr) {
            if (HMWeatherUpdater.isBlank(strArr[0])) {
                return null;
            }
            return DeviceXFunctionsKt.getWeatherApi().searchCities(strArr[0], ((DeviceManagerApi) HMSelectCityActivity.this.V.getValue()).getBoundDeviceSource(HMDeviceType.MILI).getValue());
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List<CityInfo> list) {
            HMSelectCityActivity.this.A.setEnabled(true);
            HMSelectCityActivity.this.F.setEnabled(true);
            if (HMSelectCityActivity.this.x != 1) {
                return;
            }
            if (list == null || list.size() == 0) {
                if (!this.a) {
                    HMLog.i(HMSelectCityActivity.W, "no cityInfo from server.", new Object[0]);
                    HMSelectCityActivity.this.J();
                    return;
                } else {
                    HMSelectCityActivity.this.hideLoadingDialog();
                    HMSelectCityActivity hMSelectCityActivity = HMSelectCityActivity.this;
                    IconToast.showError(hMSelectCityActivity, hMSelectCityActivity.getString(R.string.loading_error));
                    return;
                }
            }
            HMLog.i(HMSelectCityActivity.W, "cityInfo from server.", new Object[0]);
            if (this.a) {
                HMSelectCityActivity.this.hideLoadingDialog();
                HMSelectCityActivity.this.W(list.get(0));
                HMSelectCityActivity.this.finish();
            } else {
                HMSelectCityActivity.this.N.clear();
                HMSelectCityActivity.this.N.addAll(list);
                HMSelectCityActivity.this.M.notifyDataSetChanged();
                HMSelectCityActivity.this.L();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            HMSelectCityActivity.closeKeyboard(HMSelectCityActivity.this);
            if (this.a) {
                HMSelectCityActivity.this.showLoadingDialog();
                return;
            }
            HMSelectCityActivity.this.x = 1;
            HMSelectCityActivity.this.H.setVisibility(8);
            HMSelectCityActivity.this.J.setVisibility(0);
            HMSelectCityActivity.this.C.setText(R.string.searching_city);
            HMSelectCityActivity.this.A.setEnabled(false);
            HMSelectCityActivity.this.F.setEnabled(false);
        }
    }

    public class d extends RecyclerView.Adapter<a> {

        public class a extends RecyclerView.ViewHolder {
            private final TextView a;
            private final View b;
            private final ViewGroup c;

            public a(View view) {
                super(view);
                this.a = (TextView) view.findViewById(R.id.result_tv);
                this.b = view.findViewById(R.id.divider);
                this.c = (ViewGroup) view.findViewById(R.id.result_container);
            }
        }

        private d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i, View view) {
            HMSelectCityActivity hMSelectCityActivity = HMSelectCityActivity.this;
            hMSelectCityActivity.W((CityInfo) hMSelectCityActivity.N.get(i));
            HMSelectCityActivity.this.finish();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull a aVar, final int i) {
            if (TextUtils.isEmpty(((CityInfo) HMSelectCityActivity.this.N.get(i)).getAffiliation())) {
                aVar.a.setText(((CityInfo) HMSelectCityActivity.this.N.get(i)).getName());
            } else {
                aVar.a.setText(String.format("%s-%s", ((CityInfo) HMSelectCityActivity.this.N.get(i)).getName(), ((CityInfo) HMSelectCityActivity.this.N.get(i)).getAffiliation()));
            }
            aVar.b.setVisibility(i == HMSelectCityActivity.this.N.size() - 1 ? 8 : 0);
            aVar.c.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.b(i, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_city_result, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            return HMSelectCityActivity.this.N.size();
        }
    }

    private void I(boolean z) {
        int i = 8;
        if (!z) {
            this.L.setVisibility(8);
            return;
        }
        if (Y()) {
            this.L.setVisibility(Q() ? 0 : 8);
            return;
        }
        ViewGroup viewGroup = this.L;
        if (Country.isChina() && HMLoginManager.isInChina()) {
            i = 0;
        }
        viewGroup.setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        this.x = 3;
        this.B.setVisibility(8);
        I(false);
        this.H.setVisibility(8);
        this.J.setVisibility(0);
        this.C.setText(R.string.no_match_city);
        this.G.setVisibility(8);
    }

    private void K() {
        this.z.setText("");
        this.x = 0;
        I(true);
        this.B.setVisibility(WeatherUtils.isKoreaUser() ? 8 : 0);
        this.J.setVisibility(8);
        this.H.setVisibility(8);
        this.G.setVisibility(0);
        this.K.setVisibility(8);
        this.I.setVisibility(0);
        Z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        if (this.x == 2) {
            return;
        }
        this.x = 2;
        I(false);
        this.B.setVisibility(8);
        this.J.setVisibility(8);
        this.H.setVisibility(0);
        this.G.setVisibility(8);
        this.K.setVisibility(0);
        this.I.setVisibility(8);
        this.E.setVisibility(8);
        this.D.setVisibility(8);
    }

    private void M() {
        this.x = 1;
        I(false);
        this.G.setVisibility(8);
        this.B.setVisibility(8);
        this.J.setVisibility(8);
        this.H.setVisibility(8);
        this.K.setVisibility(0);
        this.I.setVisibility(8);
        this.E.setVisibility(8);
        this.D.setVisibility(8);
        this.z.requestFocus();
        openKeyboard(this, this.z);
    }

    private String N(CityInfo cityInfo) {
        String name = cityInfo.getName();
        String affiliation = cityInfo.getAffiliation();
        if (TextUtils.isEmpty(affiliation)) {
            return name;
        }
        String str = affiliation.split(", ")[0];
        if (TextUtils.equals(name, str)) {
            return name;
        }
        return name + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str;
    }

    private void O(boolean z) {
        int i = z ? 8 : 0;
        I(!z);
        this.G.setVisibility(i);
    }

    private void P() {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        this.O = hMPersonInfo;
        HMMiliConfig miliConfig = hMPersonInfo.getMiliConfig();
        this.P = miliConfig;
        this.Q = WeatherSetting.fromJsonString(miliConfig.getWeatherSetting());
    }

    private boolean Q() {
        DeviceInfo deviceInfo;
        HMOtherVersion otherVersion;
        HMBaseDevice device = this.V.getValue().getDevice(HMDeviceType.MILI);
        return (device == null || (deviceInfo = device.getDeviceInfo()) == null || (otherVersion = deviceInfo.getOtherVersion()) == null || otherVersion.getLanguage().getLanguage() != 0) ? false : true;
    }

    private void R() {
        int i = this.x;
        if (i == 0) {
            finish();
        } else if (i == 1 || i == 2 || i == 3) {
            closeKeyboard(this);
            K();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean S(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        HMLog.i(W, "keyboard search.", new Object[0]);
        X(this.z.getText().toString(), false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            WeatherSetting weatherSettingFromJsonString = WeatherSetting.fromJsonString(this.P.getWeatherSetting());
            this.Q = weatherSettingFromJsonString;
            weatherSettingFromJsonString.setAutoLocate(z);
            this.P.setWeatherSetting(this.Q.toJsonString());
            this.O.saveInfo(2);
            O(z);
            this.R = z;
            if (z) {
                DeviceXFunctionsKt.getWeatherApi().requestLocation();
                this.B.setSubtitle(R.string.locating);
            }
            Z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U(DialogInterface dialogInterface, int i) {
        this.U.getValue().startAppSettings(this);
    }

    private void V() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        a aVar = new a();
        this.S = aVar;
        registerReceiver(aVar, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(CityInfo cityInfo) {
        if (!WeatherUtils.isXiaomiSeries()) {
            this.Q.setIsNeedMigrationWeatherWay(false);
        }
        this.Q.setCity(cityInfo.getName());
        this.Q.setAutoLocate(false);
        this.Q.setAffiliation(cityInfo.getAffiliation());
        this.Q.setLocationKey(cityInfo.getLocationKey());
        this.P.setWeatherSetting(this.Q.toJsonString());
        this.O.saveInfo(2);
        DeviceXFunctionsKt.getWeatherApi().requestLocation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(String str, boolean z) {
        if (str == null || str.equals("")) {
            HMLog.i(W, "city name is null, return.", new Object[0]);
        } else {
            new c(z).execute(str);
        }
    }

    private boolean Y() {
        return HMDevicePropertyCache.getInstance().getMiliFeature().hasSw(0);
    }

    private void Z() {
        WeatherSetting weatherSettingFromJsonString = WeatherSetting.fromJsonString(HMPersonInfo.getInstance().getMiliConfig().getWeatherSetting());
        if (weatherSettingFromJsonString.getAutoLocate() || TextUtils.isEmpty(weatherSettingFromJsonString.getCity()) || this.x != 0) {
            this.D.setVisibility(8);
            this.E.setVisibility(8);
        } else {
            this.D.setVisibility(0);
            this.E.setVisibility(0);
            this.E.setText(weatherSettingFromJsonString.getDisplayCity());
        }
    }

    public static void closeKeyboard(@Nullable Activity activity) {
        InputMethodManager inputMethodManager;
        if (activity == null || (inputMethodManager = (InputMethodManager) activity.getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(activity.getWindow().getDecorView().getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideLoadingDialog() {
        LoadingDialog loadingDialog = this.T;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.T.dismiss();
        this.T = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        this.C = (TextView) findViewById(R.id.no_result_text);
        this.F = (ImageView) findViewById(R.id.edit_search_img);
        this.A = (ImageView) findViewById(R.id.close_img);
        this.F.setOnClickListener(this);
        this.A.setOnClickListener(this);
        this.K = (ViewGroup) findViewById(R.id.search_title_container);
        this.I = (ViewGroup) findViewById(R.id.title_container);
        findViewById(R.id.title_back_img).setOnClickListener(this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.search_city_edit);
        this.G = viewGroup;
        viewGroup.setOnClickListener(this);
        EditText editText = (EditText) findViewById(R.id.city_edit);
        this.z = editText;
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: re3
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.a.S(textView, i, keyEvent);
            }
        });
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.quick_select_list);
        this.L = (ViewGroup) findViewById(R.id.quick_select_container);
        this.H = (RecyclerView) findViewById(R.id.search_result_list);
        this.J = (ViewGroup) findViewById(R.id.no_result_container);
        this.y = getResources().getStringArray(R.array.common_cities);
        this.N = new ArrayList<>();
        recyclerView.setAdapter(new b());
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        I(true);
        RecyclerView recyclerView2 = this.H;
        d dVar = new d();
        this.M = dVar;
        recyclerView2.setAdapter(dVar);
        this.H.setLayoutManager(new LinearLayoutManager(this));
        findViewById(R.id.back_img).setOnClickListener(this);
        this.D = (TextView) findViewById(R.id.current_selected_tv);
        this.E = (TextView) findViewById(R.id.selected_city_tv);
        this.B = (ListTile) findViewById(R.id.auto_locate);
        K();
        this.B.setSubtitle(R.string.locating);
        boolean autoLocate = this.Q.getAutoLocate();
        this.B.setChecked(autoLocate);
        O(autoLocate && !WeatherUtils.isKoreaUser());
        this.B.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: qe3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.T(compoundButton, z);
            }
        });
    }

    public static void openKeyboard(@Nullable Context context, EditText editText) {
        InputMethodManager inputMethodManager;
        if (context == null || (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.showSoftInput(editText, 2);
    }

    private void showBeforeMsgLocationPermissionDialog() {
        new AlertDialogFragment.Builder(this).setTitle(R.string.running_no_locate_permission_title).setMessage(R.string.locate_content).setPositiveButton(R.string.open, new DialogInterface.OnClickListener() { // from class: pe3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.U(dialogInterface, i);
            }
        }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showLoadingDialog() {
        if (this.T == null) {
            this.T = LoadingDialog.showDialog(this, getString(R.string.loading));
        }
        this.T.setMessage(getString(R.string.loading));
        this.T.setCancelable(true);
        this.T.show();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        R();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.back_img) {
            closeKeyboard(this);
            R();
            return;
        }
        if (id == R.id.title_back_img) {
            R();
            return;
        }
        if (id == R.id.search_city_edit) {
            M();
            return;
        }
        if (id == R.id.close_img) {
            this.H.setVisibility(8);
            this.x = 1;
            this.z.setText("");
        } else if (id == R.id.edit_search_img) {
            X(this.z.getText().toString(), false);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setStyle(BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(this, R.color.s38), !RainbowUtils.isDarkMode(this));
        setContentView(R.layout.activity_select_city);
        if (!NetUtil.isNetworkConnected(this)) {
            IconToast.showError(this, getString(R.string.no_network_connection));
        }
        P();
        init();
        if (!this.U.getValue().checkPermission("android.permission.ACCESS_FINE_LOCATION") && this.Q.getAutoLocate()) {
            showBeforeMsgLocationPermissionDialog();
        }
        DeviceXFunctionsKt.getWeatherApi().requestLocationOnly();
        V();
        EventBus.getDefault().register(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BroadcastReceiver broadcastReceiver = this.S;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
        EventBus.getDefault().unregister(this);
    }

    public void onEventMainThread(WeatherInfos weatherInfos) {
        CityInfo cityInfo = weatherInfos.getCityInfo();
        if (cityInfo == null) {
            return;
        }
        this.B.setSubtitle(getString(R.string.located_city_now, new Object[]{N(cityInfo)}));
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Z();
    }
}
