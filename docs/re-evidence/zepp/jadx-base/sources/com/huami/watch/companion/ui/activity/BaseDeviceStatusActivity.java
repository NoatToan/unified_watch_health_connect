package com.huami.watch.companion.ui.activity;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.signature.ObjectKey;
import com.google.gson.Gson;
import com.huami.assistant.ui.activity.AlarmListActivity;
import com.huami.device.feature.unlock.MiuiUnlockAPI;
import com.huami.midong.webview.ui.JsBridgeActivity;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.R;
import com.huami.watch.companion.about.DeviceManualFaqWebApi;
import com.huami.watch.companion.account.Account;
import com.huami.watch.companion.battery.BatteryInfoHelper;
import com.huami.watch.companion.battery.BatteryInfoView;
import com.huami.watch.companion.battery.bean.BatteryInfo;
import com.huami.watch.companion.bind.BindUtil;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.device.config.DeviceFeature;
import com.huami.watch.companion.device.config.FeatureConfig;
import com.huami.watch.companion.esim.ui.activity.EsimActivity;
import com.huami.watch.companion.event.ConnectedEvent;
import com.huami.watch.companion.event.DeviceMainSwitchEvent;
import com.huami.watch.companion.event.DisconnectedEvent;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import com.huami.watch.companion.initial.InitialState;
import com.huami.watch.companion.notification.NotificationManager;
import com.huami.watch.companion.settings.WebActivity;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.companion.sync.ble.SyncBleBatteryInfoHelper;
import com.huami.watch.companion.sync.ble.SyncBleUtil;
import com.huami.watch.companion.transport.CompanionModule;
import com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity;
import com.huami.watch.companion.ui.adapter.AppSettingAdapter;
import com.huami.watch.companion.ui.bean.AppInfo;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.companion.ui.view.SettingItemView;
import com.huami.watch.companion.ui.view.ToastWithIcon;
import com.huami.watch.companion.unlock.UnlockScanHelper;
import com.huami.watch.companion.unlock.UnlockUtil;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.companion.watchface.WatchFaceActivity;
import com.huami.watch.companion.watchface.bean.WatchFaceCloud;
import com.huami.watch.companion.watchface.bean.WatchFaceCloudResult;
import com.huami.watch.companion.watchface.utils.WatchFaceHelper;
import com.huami.watch.companion.ximalaya.XimaCategoryActivity;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.AndroidPermissions;
import com.huami.watch.util.Box;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import com.huami.watch.util.RxBus;
import com.huami.watch.wififtp.FileManagerActivity;
import com.xiaomi.hm.health.imageload.GlideApp;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseDeviceStatusActivity extends AppCompatActivity implements View.OnClickListener, AppSettingAdapter.OnItemClickListener {
    public static final String KEY_AREA = "area";
    public static final String KEY_DEVICE = "Device";
    private static final String d = "BaseDeviceStatusActivity";
    private static final String e = "com.huami.midong.wallet";
    private Disposable a;
    public String area;
    private Disposable b;
    public Transporter c;
    public String deviceFaqUrl;
    public boolean isConnect;
    public AppSettingAdapter mAdapter;
    public Map<String, AppInfo> mAppMap;
    public BatteryInfoView mBatteryInfoView;
    public TextView mConnectText;
    public Device mDevice;
    public SettingItemView mFaqView;
    public View mMainDeviceView;
    public View mMaskViewBottom;
    public View mMaskViewTop;
    public RecyclerView mRecyclerView;
    public SettingItemView mSimSettingView;
    public TextView mStorageText;
    public SettingItemView mUnlockSettingView;
    public TextView mVersionText;
    public ImageView mWatchBgImage;
    public SettingItemView mWatchFaceSettingView;
    public ImageView mWatchFaceView;
    public SettingItemView mWidgetSetting;
    public final String AREA_UNKNOWN = "unknown";
    public List<AppInfo> mAppList = new ArrayList();
    public Transporter.ChannelListener mChannelListener = new a();
    public Transporter.DataListener mDataListener = new b();

    public class a implements Transporter.ChannelListener {
        public a() {
        }

        @Override // com.huami.watch.transport.Transporter.ChannelListener
        public void onChannelChanged(boolean z) {
            if (z) {
                SyncUtil.syncRequestBattery(BaseDeviceStatusActivity.this.c, true);
                BaseDeviceStatusActivity baseDeviceStatusActivity = BaseDeviceStatusActivity.this;
                SyncUtil.syncRequestDeviceStorage(baseDeviceStatusActivity, baseDeviceStatusActivity.c);
                if (DeviceFeature.isSupportCloudWatchFaceList(BaseDeviceStatusActivity.this.mDevice) && DeviceSource.isModelQogir(BaseDeviceStatusActivity.this.mDevice)) {
                    BaseDeviceStatusActivity.this.c.send(CompanionModule.ACTION_QUERY_CURRENT_WATCHFACE);
                }
            }
        }
    }

    public class b implements Transporter.DataListener {
        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(DataBundle dataBundle) {
            if (BaseDeviceStatusActivity.this.mBatteryInfoView != null) {
                BaseDeviceStatusActivity.this.updateBatteryInfo(BatteryInfoHelper.getBatteryInfo(dataBundle));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d() {
            BaseDeviceStatusActivity.this.d0();
        }

        @Override // com.huami.watch.transport.Transporter.DataListener
        public void onDataReceived(TransportDataItem transportDataItem) {
            if (!BaseDeviceStatusActivity.this.mDevice.isActive()) {
                Log.w(BaseDeviceStatusActivity.d, "Device is Inactivated, Ignore!!", new Object[0]);
                return;
            }
            BaseDeviceStatusActivity.this.O(transportDataItem);
            String action = transportDataItem.getAction();
            final DataBundle data = transportDataItem.getData();
            if (CompanionModule.ACTION_SYNC_BATTERY.equals(action)) {
                Rx.mainThread(new Runnable() { // from class: com.huami.watch.companion.ui.activity.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.c(data);
                    }
                });
            } else if (CompanionModule.ACTION_SYNC_DEVICE_INFO_STORAGE.equals(action)) {
                BaseDeviceStatusActivity baseDeviceStatusActivity = BaseDeviceStatusActivity.this;
                DeviceUtil.saveStorageInfo(baseDeviceStatusActivity, baseDeviceStatusActivity.mDevice, data);
                Rx.mainThread(new Runnable() { // from class: com.huami.watch.companion.ui.activity.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.d();
                    }
                });
            }
        }
    }

    public class c implements DeviceManualFaqWebApi.Callback {
        public c() {
        }

        @Override // com.huami.watch.companion.about.DeviceManualFaqWebApi.Callback
        public void hide() {
            BaseDeviceStatusActivity.this.mFaqView.setVisibility(8);
        }

        @Override // com.huami.watch.companion.about.DeviceManualFaqWebApi.Callback
        public void show(String str) {
            BaseDeviceStatusActivity baseDeviceStatusActivity = BaseDeviceStatusActivity.this;
            baseDeviceStatusActivity.deviceFaqUrl = str;
            baseDeviceStatusActivity.mFaqView.setVisibility(0);
        }
    }

    public class d implements Observer<WatchFaceCloudResult<WatchFaceCloud>> {
        public d() {
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(WatchFaceCloudResult<WatchFaceCloud> watchFaceCloudResult) {
            if (!watchFaceCloudResult.isSuccessful()) {
                Log.e(BaseDeviceStatusActivity.d, "获取对应资源失败", new Object[0]);
                Toast.makeText(BaseDeviceStatusActivity.this, R.string.get_watch_face_failed, 0).show();
                return;
            }
            WatchFaceCloud data = watchFaceCloudResult.getData();
            if (data != null) {
                BaseDeviceStatusActivity.this.loadImage(data.getImage());
            } else {
                Log.d(BaseDeviceStatusActivity.d, "没有找到对应的资源", new Object[0]);
                BaseDeviceStatusActivity.this.setNotFindCloudWatchFaceImage();
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            Log.e(BaseDeviceStatusActivity.d, "获取资源:Error", new Object[0]);
            Toast.makeText(BaseDeviceStatusActivity.this, R.string.get_watch_face_failed, 0).show();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            BaseDeviceStatusActivity.this.b = disposable;
        }
    }

    private void A() {
        this.a = RxBus.get().toObservable().subscribe(new Consumer() { // from class: vp
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.D(obj);
            }
        }, new Consumer() { // from class: wp
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BaseDeviceStatusActivity.F((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(ObservableEmitter observableEmitter) throws Exception {
        WatchFaceCloudResult<List<WatchFaceCloud>> watchFaceCloudResult;
        int localSelectWatchFaceId = WatchFaceHelper.getLocalSelectWatchFaceId(this.mDevice.getCpuId());
        WatchFaceCloud watchFaceCloud = null;
        if (localSelectWatchFaceId != 0) {
            watchFaceCloudResult = WatchFaceHelper.getCloudWatchFaceIds(this, String.valueOf(localSelectWatchFaceId));
            List<WatchFaceCloud> data = watchFaceCloudResult.getData();
            if (data != null && data.size() > 0) {
                watchFaceCloud = data.get(0);
            }
        } else {
            watchFaceCloudResult = new WatchFaceCloudResult<>(true);
        }
        observableEmitter.onNext(new WatchFaceCloudResult(watchFaceCloudResult.isSuccessful(), watchFaceCloud));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(WatchFaceHelper.getLocalSelectWatchFace(this.mDevice.getCpuId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(Object obj) throws Exception {
        if (obj instanceof ConnectedEvent) {
            onConnected(((ConnectedEvent) obj).address);
            return;
        }
        if (obj instanceof DisconnectedEvent) {
            onDisconnected(((DisconnectedEvent) obj).address);
        } else if (obj instanceof WatchFaceArrivingEvent) {
            onWatchFaceArrived((WatchFaceArrivingEvent) obj);
        } else if (obj instanceof DeviceMainSwitchEvent) {
            g0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String E() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F(Throwable th) throws Exception {
        HMLog.warn(d, th, new Function0() { // from class: xp
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return BaseDeviceStatusActivity.E();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(View view) {
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(View view) {
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(BatteryInfo batteryInfo) {
        if (this.mBatteryInfoView != null) {
            updateBatteryInfo(batteryInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(BatteryInfo batteryInfo) {
        if (this.mBatteryInfoView != null) {
            updateBatteryInfo(batteryInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        WebActivity.open(this, getString(R.string.nfc_not_support_oversea_title), "https://api-watch.huami.com/pages/huami.watch.nfcbus.alert01");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(View view) {
        S();
    }

    private void P(int i) {
        this.mMaskViewTop.setVisibility(i);
        this.mMaskViewBottom.setVisibility(i);
    }

    private void Q() {
        s(this);
        AndroidPermissions.request(this, x());
    }

    private void R() {
        Intent intent = new Intent(this, (Class<?>) AlarmListActivity.class);
        intent.addFlags(536870912);
        startActivity(intent);
    }

    private void S() {
        EsimActivity.open(this, false);
    }

    private void T() {
        startActivity(new Intent(this, (Class<?>) HealthSettingActivity.class));
    }

    private void U() {
        startActivity(new Intent(this, (Class<?>) HeartRateAndStressSettingActivity.class));
    }

    private void V() {
        if (DeviceFeature.isSupportAllDayStress(this.mDevice)) {
            U();
        } else {
            startActivity(new Intent(this, (Class<?>) HeartRateSettingActivity.class));
        }
    }

    private void W() {
        startActivity(new Intent(this, (Class<?>) LvMiSettingsActivity.class));
    }

    private void X() {
        Intent intent = new Intent(this, (Class<?>) SportSettingActivity.class);
        intent.addFlags(536870912);
        intent.putExtra("deviceModel", this.mDevice.info().getHuamiModel());
        startActivity(intent);
    }

    private void Y() {
        if (Account.isOversea(getApplicationContext())) {
            AlertDialog.setMessage(getString(R.string.nfc_not_support_oversea_message)).setPositiveBtn(getString(R.string.view_help), new DialogInterface.OnClickListener() { // from class: zp
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.a.L(dialogInterface, i);
                }
            }).setNegativeBtn(getString(R.string.confirm), new DialogInterface.OnClickListener() { // from class: aq
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).show(this, "buscard_not_support");
        } else {
            try {
                startActivity(new Intent(e));
            } catch (ActivityNotFoundException e2) {
                e2.printStackTrace();
            }
        }
        Analytics.event(this, AnalyticsEvents.EVENT_CLICK_SET_CARD);
    }

    private void Z() {
        Intent intent = new Intent(this, (Class<?>) WeatherActivity.class);
        intent.addFlags(536870912);
        startActivity(intent);
    }

    private void a0() {
        Intent intent = new Intent(this, (Class<?>) XimaCategoryActivity.class);
        intent.addFlags(536870912);
        startActivity(intent);
    }

    private void b0() {
        DeviceManualFaqWebApi.isDeviceManualFaqShow(getApplicationContext(), this.area, new c());
    }

    private void c0() {
        String string;
        if (this.mDevice.isConnected()) {
            if (this.mDevice.isMcuMode()) {
                string = getString(R.string.device_ultra_mode) + " " + getString(R.string.connect_status_connect);
            } else {
                string = getString(R.string.connect_status_connect);
            }
            this.mConnectText.setText(string);
            this.mBatteryInfoView.onDeviceConnected();
            f0();
            d0();
        } else {
            this.mConnectText.setText(R.string.connect_status_disconnect);
            this.mBatteryInfoView.onDeviceDisconnected();
            f0();
            d0();
        }
        h0();
        if (!this.mDevice.isActive()) {
            this.mMainDeviceView.setVisibility(0);
        }
        if (DeviceUtil.isSupportESim(this.mDevice)) {
            this.mSimSettingView.setOnClickListener(new View.OnClickListener() { // from class: cq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.N(view);
                }
            });
        } else {
            this.mSimSettingView.setVisibility(8);
        }
        if (this.mDevice.isMcuMode()) {
            findViewById(R.id.setting_more).setVisibility(4);
            findViewById(R.id.setting_notification).setVisibility(4);
        } else {
            findViewById(R.id.setting_more).setVisibility(0);
            findViewById(R.id.setting_notification).setVisibility(0);
        }
        if (!DeviceCompatibility.isSupportUnlockScreen(this)) {
            this.mUnlockSettingView.setVisibility(8);
        }
        if (DeviceSource.isSeriesXihu(this.mDevice)) {
            Log.i(d, "Is Xihu series, diable MIUI unlock Now!!", new Object[0]);
            this.mUnlockSettingView.setVisibility(8);
        }
        z();
        this.mAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0() {
        String str;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Device device = this.mDevice;
        if (device.info().storageAvailable() < 0 || device.info().storageTotal() < 0) {
            str = "";
        } else {
            str = decimalFormat.format((device.info().storageAvailable() / 1024.0f) / 1024.0f) + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + decimalFormat.format((device.info().storageTotal() / 1024.0f) / 1024.0f) + " " + getString(R.string.storage_g);
        }
        if (TextUtils.isEmpty(str)) {
            this.mStorageText.setText(getString(R.string.watch_storage_info, new Object[]{getString(R.string.device_status_value_unknown)}));
        } else {
            this.mStorageText.setText(getString(R.string.watch_storage_info, new Object[]{str}));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    private void e0() {
        if (DeviceSource.isSeriesXihu(this.mDevice)) {
            Log.i(d, "Is Xihu series, diable MIUI unlock Now!!", new Object[0]);
            return;
        }
        if (DeviceSource.isSeriesEverest2(this.mDevice) || !DeviceCompatibility.isSupportUnlockScreen(this)) {
            this.mUnlockSettingView.setVisibility(8);
            return;
        }
        Device device = this.mDevice;
        UnlockScanHelper.getHelper(this).checkHasConnected();
        String watchRandomAddress = UnlockUtil.hasUnlockByWatch(this, device.addressShort()) ? Box.getWatchRandomAddress() : "";
        ?? IsUnlockEnabled = !TextUtils.isEmpty(watchRandomAddress) ? MiuiUnlockAPI.isUnlockEnabled(this, watchRandomAddress) : 0;
        this.mUnlockSettingView.setVisibility(0);
        this.mUnlockSettingView.setInfoText(getString(IsUnlockEnabled != 0 ? R.string.alert_enable : R.string.alert_disable));
        if (!device.isActive() || UnlockUtil.readScreenUnlockEnable(this) == IsUnlockEnabled) {
            return;
        }
        UnlockUtil.saveScreenUnlockEnable(this, IsUnlockEnabled);
        Log.d(d, "Save Unlock Screen Enable : " + IsUnlockEnabled, new Object[0]);
        if (IsUnlockEnabled == 0) {
            UnlockScanHelper.getHelper(this).showCloseUnlockDialog(this);
        }
    }

    private void f0() {
        String romVersion = DeviceUtil.getRomVersion(this.mDevice);
        if (TextUtils.isEmpty(romVersion)) {
            this.mVersionText.setText(getString(R.string.watch_version_info, new Object[]{getString(R.string.device_status_value_unknown)}));
        } else {
            this.mVersionText.setText(getString(R.string.watch_version_info, new Object[]{romVersion}));
        }
    }

    private void g0() {
        Device device = this.mDevice;
        if (device != null) {
            if (DeviceSource.isSeriesEverest2(device)) {
                if (DeviceSource.isModelEverest2StarWar(this.mDevice)) {
                    this.mWatchBgImage.setImageResource(R.drawable.device_everest2_starwar_bg);
                    return;
                } else {
                    this.mWatchBgImage.setImageResource(R.drawable.device_everest2_watch_bg);
                    return;
                }
            }
            if (DeviceSource.isModelEverest(this.mDevice)) {
                if (DeviceSource.isModelEverestS(this.mDevice)) {
                    this.mWatchBgImage.setImageResource(R.drawable.device_everest_s_watch_bg);
                    return;
                } else {
                    this.mWatchBgImage.setImageResource(R.drawable.device_everest_watch_bg);
                    return;
                }
            }
            if (DeviceSource.isModelQogir(this.mDevice)) {
                this.mWatchBgImage.setImageResource(R.drawable.device_qogir_watch_bg);
                return;
            }
            if (!DeviceSource.isSeriesXihu(this.mDevice)) {
                this.mWatchBgImage.setImageResource(R.drawable.device_watch_bg);
                return;
            }
            if (DeviceSource.isModelXihuE(this.mDevice)) {
                this.mWatchBgImage.setImageResource(R.drawable.device_xihu_e_watch_bg);
            } else if (DeviceSource.isModelXihuDisney(this.mDevice)) {
                this.mWatchBgImage.setImageResource(R.drawable.device_xihu_disney_watch_bg);
            } else {
                this.mWatchBgImage.setImageResource(R.drawable.device_xihu_watch_bg);
            }
        }
    }

    private void h0() {
        this.mWatchFaceSettingView.setVisibility((DeviceFeature.isSupportWatchFaceSetting(this.mDevice) && DeviceUtil.isRomSupportWatchFaceShop(this.mDevice)) ? 0 : 8);
        this.mWatchFaceSettingView.setTitleText(getString(R.string.facestore_title));
    }

    private void initViews() {
        this.mMainDeviceView = findViewById(R.id.setting_main_device);
        this.mSimSettingView = (SettingItemView) findViewById(R.id.setting_sim);
        this.mWatchFaceView = (ImageView) findViewById(R.id.watch_face);
        this.mWatchBgImage = (ImageView) findViewById(R.id.device_watch_bg);
        this.mWatchFaceSettingView = (SettingItemView) findViewById(R.id.setting_watchface);
        this.mUnlockSettingView = (SettingItemView) findViewById(R.id.setting_screen_unlock);
        this.mBatteryInfoView = (BatteryInfoView) findViewById(R.id.battery_info_root_layout);
        this.mConnectText = (TextView) findViewById(R.id.connect_state);
        this.mVersionText = (TextView) findViewById(R.id.version_info);
        this.mMaskViewTop = findViewById(R.id.mask_view_top);
        this.mMaskViewBottom = findViewById(R.id.mask_view_bottom);
        this.mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        this.mStorageText = (TextView) findViewById(R.id.storage_info);
        SettingItemView settingItemView = (SettingItemView) findViewById(R.id.setting_faq);
        this.mFaqView = settingItemView;
        settingItemView.setOnClickListener(this);
        this.mMaskViewTop.setOnClickListener(new View.OnClickListener() { // from class: bq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.G(view);
            }
        });
        this.mMaskViewBottom.setOnClickListener(new View.OnClickListener() { // from class: eq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.H(view);
            }
        });
        this.mRecyclerView.setLayoutManager(new GridLayoutManager(this, Config.isLocaleChina(this) ? 5 : 4));
        AppSettingAdapter appSettingAdapter = new AppSettingAdapter(this, this.mAppList);
        this.mAdapter = appSettingAdapter;
        appSettingAdapter.setOnItemClickListener(this);
        this.mRecyclerView.setAdapter(this.mAdapter);
        g0();
        setWatchFacePreviewImage(false);
        if (this.mDevice.isConnected()) {
            this.mConnectText.setText(R.string.connect_status_connect);
            this.mBatteryInfoView.onDeviceConnected();
            f0();
            d0();
            b0();
        } else {
            this.mConnectText.setText(R.string.connect_status_disconnect);
            this.mBatteryInfoView.onDeviceDisconnected();
            f0();
            d0();
        }
        h0();
        this.mWatchFaceSettingView.setOnClickListener(this);
        this.mUnlockSettingView.setOnClickListener(this);
        this.mMainDeviceView.setOnClickListener(this);
        if (!this.mDevice.isActive()) {
            this.mMainDeviceView.setVisibility(0);
        }
        SettingItemView settingItemView2 = (SettingItemView) findViewById(R.id.setting_widget_order);
        this.mWidgetSetting = settingItemView2;
        settingItemView2.setTitleText(y(this.mDevice));
        this.mWidgetSetting.setOnClickListener(this);
        findViewById(R.id.setting_more).setOnClickListener(this);
        findViewById(R.id.setting_notification).setOnClickListener(this);
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.actionbar);
        actionbarLayout.setTitleText(DeviceSource.getDeviceName(this, this.mDevice));
        Device device = this.mDevice;
        if (device != null && DeviceSource.isModelXihuDisney(device)) {
            actionbarLayout.setTitleTextSize(14);
        }
        actionbarLayout.setBackArrowClickListener(new View.OnClickListener() { // from class: dq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.I(view);
            }
        });
        c0();
    }

    public static void invokeDeviceStatusActivity(Context context, String str, Bundle bundle) {
        startDeviceStatusActivity(context, t(context, str), bundle);
    }

    private void r() {
        if (DeviceManager.getManager(this).isBoundDeviceConnected()) {
            return;
        }
        ToastWithIcon.showShort(this, getString(com.huami.assistant.R.string.connect_watch_toast), com.huami.assistant.R.drawable.toast_icon_attention);
    }

    private static void s(Context context) {
        if (InitialState.isNeedShowNLSTip() && DeviceManager.getManager(context).hasBoundDevice()) {
            boolean zIsSystemNLSPermissionEnabled = NotificationManager.getManager(context).isSystemNLSPermissionEnabled(context);
            boolean zIsUserON = NotificationManager.getManager(context).isUserON();
            if (zIsSystemNLSPermissionEnabled || !zIsUserON) {
                return;
            }
            InitialState.toEnableSystemNLSPermissionTip(context);
            InitialState.setNeedShowNLSTip(false);
        }
    }

    public static void startDeviceStatusActivity(Context context, Device device, Bundle bundle) {
        if (device == null || context == null) {
            return;
        }
        Intent intent = DeviceSource.isSeriesXihu(device) ? new Intent(context, (Class<?>) XiHuDeviceStatusActivity.class) : new Intent(context, (Class<?>) DeviceStatusActivity.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        context.startActivity(intent);
    }

    private static Device t(Context context, String str) {
        DeviceManager manager = DeviceManager.getManager(context);
        if (!TextUtils.isEmpty(str)) {
            return manager.find(str);
        }
        Device currentDevice = manager.getCurrentDevice();
        return (currentDevice != null || manager.getAllCount() <= 0) ? currentDevice : manager.getAll().get(0);
    }

    private void v() {
        setWatchFaceImage(Rx.io(new ObservableOnSubscribe() { // from class: up
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.B(observableEmitter);
            }
        }).observable());
    }

    private String[] x() {
        String[] strArr = {"android.permission.READ_PHONE_STATE", "android.permission.READ_CONTACTS", "android.permission.READ_CALL_LOG", "android.permission.CALL_PHONE"};
        if (!DeviceCompatibility.isO()) {
            return strArr;
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, 5);
        strArr2[strArr2.length - 1] = "android.permission.ANSWER_PHONE_CALLS";
        return strArr2;
    }

    private String y(Device device) {
        if (DeviceSource.isSeriesEverest2(device)) {
            return getString(R.string.widget_manage);
        }
        return getString(DeviceUtil.isSupportWidgetManager2(this.mDevice) ? R.string.widget_only_title : R.string.widget_order_hide);
    }

    abstract void O(TransportDataItem transportDataItem);

    public void getWatchFaceImage() {
        setWatchFaceImage(Rx.io(new ObservableOnSubscribe() { // from class: tp
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.C(observableEmitter);
            }
        }).observable());
        v();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.xiaomi.hm.health.imageload.GlideRequest] */
    public void loadImage(String str) {
        GlideApp.with((FragmentActivity) this).load(str).signature(new ObjectKey(str)).skipMemoryCache(false).placeholder(R.drawable.watch_face_list_default).optionalCircleCrop().into(this.mWatchFaceView);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.setting_watchface) {
            onSettingWatchfaceClick();
            return;
        }
        if (id == R.id.setting_widget_order) {
            onSettingWidgetClick();
            return;
        }
        if (id == R.id.setting_screen_unlock) {
            onSettingMiuiUnlockClick();
            return;
        }
        if (id == R.id.setting_more) {
            onSettingMoreClick();
            return;
        }
        if (id == R.id.setting_main_device) {
            onSwitchToMainDeviceClick();
        } else if (id == R.id.setting_notification) {
            onNotificationSettingClick();
        } else if (id == R.id.setting_faq) {
            onDeviceFaqClick();
        }
    }

    public void onConnected(String str) {
        if (!str.equals(this.mDevice.address())) {
            Log.d(d, "OnConnected : " + str + ", " + this.mDevice, new Object[0]);
            P(0);
            return;
        }
        this.isConnect = true;
        P(8);
        this.mBatteryInfoView.onDeviceConnected();
        c0();
        e0();
        b0();
        if (this.mDevice.isMcuMode()) {
            SyncBleBatteryInfoHelper.getHelper().listener(new SyncBleBatteryInfoHelper.BatteryChangedListener() { // from class: fq
                @Override // com.huami.watch.companion.sync.ble.SyncBleBatteryInfoHelper.BatteryChangedListener
                public final void onBatteryChanged(BatteryInfo batteryInfo) {
                    this.a.J(batteryInfo);
                }
            }).start();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(w());
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        String string = "unknown";
        if (getIntent() != null && getIntent().getExtras() != null) {
            string = getIntent().getExtras().getString(KEY_AREA);
        }
        this.area = string;
        String string2 = null;
        if (getIntent() != null && getIntent().getExtras() != null) {
            string2 = getIntent().getExtras().getString(KEY_DEVICE);
        }
        Device deviceT = t(this, string2);
        this.mDevice = deviceT;
        if (deviceT == null) {
            Log.w(d, "No Device for : " + string2 + ", Abort!!", new Object[0]);
            return;
        }
        Log.d(d, "Device : " + this.mDevice + ", " + new Gson().toJson(this.mDevice, Device.class), new Object[0]);
        u();
        initViews();
        A();
        Transporter transporter = Transporter.get(getApplicationContext(), "com.huami.watch.companion");
        this.c = transporter;
        transporter.addChannelListener(this.mChannelListener);
        this.c.addDataListener(this.mDataListener);
        if (this.mDevice.isConnected()) {
            onConnected(this.mDevice.address());
        } else {
            onDisconnected(this.mDevice.address());
        }
        Q();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        UnlockScanHelper.getHelper(this).release();
        Disposable disposable = this.a;
        if (disposable != null) {
            disposable.dispose();
            this.a = null;
        }
        Disposable disposable2 = this.b;
        if (disposable2 != null) {
            disposable2.dispose();
            this.b = null;
        }
        Transporter transporter = this.c;
        if (transporter != null) {
            transporter.removeChannelListener(this.mChannelListener);
            this.c.removeDataListener(this.mDataListener);
        }
        super.onDestroy();
    }

    public void onDeviceFaqClick() {
        JsBridgeActivity.load(this, this.deviceFaqUrl);
    }

    public void onDisconnected(String str) {
        P(0);
        if (str.equals(this.mDevice.address())) {
            this.isConnect = false;
            this.mBatteryInfoView.onDeviceDisconnected();
            this.mConnectText.setText(R.string.connect_status_disconnect);
            e0();
            f0();
            d0();
            return;
        }
        Log.d(d, "OnDisconnected : " + str + ", " + this.mDevice, new Object[0]);
    }

    @Override // com.huami.watch.companion.ui.adapter.AppSettingAdapter.OnItemClickListener
    public void onItemClick(int i, AppInfo appInfo) {
        String pkgname = appInfo.getPkgname();
        pkgname.hashCode();
        switch (pkgname) {
            case "com.huami.watch.deskclock":
                R();
                break;
            case "com.huami.watch.wallet":
                Y();
                break;
            case "com.huami.watch.lvmi":
                W();
                break;
            case "com.huami.watch.xmly":
                a0();
                break;
            case "com.huami.watch.find.watch":
                toFindWatch();
                break;
            case "com.huami.watch.fitness":
            case "com.huami.watch.health":
                T();
                break;
            case "com.huami.watch.health/com.huami.watch.health.HeartLauncherActivity":
                V();
                break;
            case "com.huami.watch.file.transport":
                toFileManager();
                break;
            case "com.huami.watch.weather":
                Z();
                break;
            case "com.huami.watch.newsport":
                X();
                break;
            default:
                Toast.makeText(this, R.string.xihu_setting_app_not_config, 0).show();
                break;
        }
    }

    @Override // com.huami.watch.companion.ui.adapter.AppSettingAdapter.OnItemClickListener
    public void onItemDelete(int i, AppInfo appInfo) {
    }

    public void onNotificationSettingClick() {
        startActivity(new Intent(this, (Class<?>) NotificationSettingActivity.class));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Device device = this.mDevice;
        if (device == null || !device.isActive()) {
            return;
        }
        if (!this.mDevice.isMcuMode()) {
            SyncUtil.syncRequestBattery(this.c, false);
        }
        SyncBleBatteryInfoHelper.getHelper().release();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Device device = this.mDevice;
        if (device == null || !device.isActive()) {
            return;
        }
        if (this.mDevice.isConnected()) {
            SyncUtil.syncRequestDeviceStorage(this, this.c);
            if (this.mDevice.isMcuMode()) {
                SyncBleBatteryInfoHelper.getHelper().listener(new SyncBleBatteryInfoHelper.BatteryChangedListener() { // from class: gq
                    @Override // com.huami.watch.companion.sync.ble.SyncBleBatteryInfoHelper.BatteryChangedListener
                    public final void onBatteryChanged(BatteryInfo batteryInfo) {
                        this.a.K(batteryInfo);
                    }
                }).start();
            } else {
                SyncUtil.syncRequestBattery(this.c, true);
            }
        }
        e0();
    }

    public void onSettingMiuiUnlockClick() {
        if (DeviceUtil.isRomSupportUnlock(this)) {
            UnlockScanHelper.getHelper(this).checkWatchRandomAddress(this);
        } else {
            Toast.makeText(this, R.string.unsupport_unlock_rom_tips, 0).show();
        }
        Analytics.event(this, "ScreenUnlock");
    }

    public void onSettingMoreClick() {
        Intent intent = new Intent(this, (Class<?>) DeviceMoreSettingActivity.class);
        intent.putExtra(KEY_DEVICE, this.mDevice.address());
        startActivity(intent);
    }

    public void onSettingWatchfaceClick() {
        WatchFaceActivity.to(this, this.mDevice.getCpuId());
    }

    public void onSettingWidgetClick() {
        Intent intent = new Intent(this, (Class<?>) WidgetAndAppActivity.class);
        intent.putExtra("deviceModel", DeviceUtil.getHuamiModel(this.mDevice));
        intent.addFlags(536870912);
        startActivity(intent);
    }

    public void onSwitchToMainDeviceClick() {
        BindUtil.switchMainDevice(this, this.mDevice.address());
        if (this.mDevice.isActive()) {
            this.mMainDeviceView.setVisibility(8);
            FeatureConfig.get().load(this.mDevice);
            RxBus.get().post(new DeviceMainSwitchEvent(this.mDevice.address()));
        }
    }

    public void onWatchFaceArrived(WatchFaceArrivingEvent watchFaceArrivingEvent) {
        if ("reply".equalsIgnoreCase(watchFaceArrivingEvent.getCmd())) {
            setWatchFacePreviewImage(false);
        } else if (WatchFaceArrivingEvent.CMD_SET.equalsIgnoreCase(watchFaceArrivingEvent.getCmd())) {
            setWatchFacePreviewImage(false);
        }
    }

    public void setDefaultWatchFaceImage() {
        this.mWatchFaceView.setImageResource(WatchFaceHelper.getDefaultWatchFace(this, this.mDevice.getCpuId()).getLocalImage());
    }

    public void setNotFindCloudWatchFaceImage() {
        setDefaultWatchFaceImage();
    }

    public void setWatchFaceImage(Observable<WatchFaceCloudResult<WatchFaceCloud>> observable) {
        if (observable == null) {
            return;
        }
        observable.observeOn(AndroidSchedulers.mainThread()).subscribe(new d());
    }

    public void setWatchFacePreviewImage(boolean z) {
    }

    public void toFileManager() {
        Intent intent = new Intent(this, (Class<?>) FileManagerActivity.class);
        intent.addFlags(536870912);
        startActivity(intent);
    }

    public void toFindWatch() {
        if (DeviceSource.isSeriesEverest2(this.mDevice)) {
            SyncBleUtil.sendAlertFindWatch();
        } else {
            startActivity(new Intent(this, (Class<?>) FindWatchActivity.class));
        }
    }

    public abstract void u();

    public void updateBatteryInfo(BatteryInfo batteryInfo) {
        this.mBatteryInfoView.updateBatteryViews(getApplicationContext(), batteryInfo);
    }

    abstract int w();

    public abstract void z();
}
