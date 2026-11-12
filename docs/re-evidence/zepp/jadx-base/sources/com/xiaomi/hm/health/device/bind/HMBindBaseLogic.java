package com.xiaomi.hm.health.device.bind;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.account.HMLoginManager;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.BuildConfigApi;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.basic.MiuiFnApi;
import com.huami.devicex.injection.data.PropertyStoreApi;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.huami.watch.util.Rx;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.device.Status;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.ife.IDetailedConnectionCallback;
import com.xiaomi.hm.health.bt.model.HMDisplaySetting;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.profile.auth.TinkerAuthCallback;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.mili.model.UserInfo;
import com.xiaomi.hm.health.bt.scan.AdvData;
import com.xiaomi.hm.health.bt.scan.BleScanOption;
import com.xiaomi.hm.health.bt.scan.IBleScanCallback;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.EarbudEnableHelper;
import com.xiaomi.hm.health.device.H5UrlSource;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMTreadmillSettingActivity;
import com.xiaomi.hm.health.device.PairCCBActivity;
import com.xiaomi.hm.health.device.bind.HMBindBaseLogic;
import com.xiaomi.hm.health.device.bind.analytic.ConstantKt;
import com.xiaomi.hm.health.device.bind.analytic.events.BindEvent;
import com.xiaomi.hm.health.device.bind.analytic.events.BindFail;
import com.xiaomi.hm.health.device.bind.analytic.events.BindSuccess;
import com.xiaomi.hm.health.device.bind.analytic.events.SetUserInfoSuccess;
import com.xiaomi.hm.health.device.bind.analytic.events.UploadBindSuccess;
import com.xiaomi.hm.health.device.bolt.TreadmillStartListener;
import com.xiaomi.hm.health.device.bolt.TreadmillStartTask;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.fw_upgrade.Md5FileUtils;
import com.xiaomi.hm.health.device.model.HMBrandType;
import com.xiaomi.hm.health.device.setting.appsort.HMAppSortDataManager;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import com.xiaomi.hm.health.device.webapi.device.HMWebBindInfo;
import com.xiaomi.hm.health.device.webapi.device.NewDeviceWebAPI;
import com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.utils.DeviceManualUtils;
import de.greenrobot.event.EventBus;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMBindBaseLogic extends TinkerAuthCallback implements IBleScanCallback, IDetailedConnectionCallback {
    public static final int ADDRESS_SCAN_TIME = 30000;
    public static final String BIND_ADDRESS_KEY = "bind_address";
    public static final int BIND_ALL_WATCH = 24;
    public static final int BIND_AMAZFIT_WATCH = 5;
    public static final int BIND_ANETO = 22;
    public static final int BIND_BLUE_MONKEY = 6;
    public static final int BIND_BOLT = 18;
    public static final String BIND_BRAND_TYPE = "bind_brand_type";
    public static final int BIND_CHAOHU = 4;
    public static final int BIND_CHAOHU_SREIES = 10;
    public static final int BIND_COMO_NESS = 27;
    public static final String BIND_DEVICE_KEY = "bind_device";
    public static final String BIND_DEVICE_SOURCE = "bind_device_source";
    public static final int BIND_DONGTINGHU = 7;
    public static final int BIND_EARBUD = 25;
    public static final int BIND_EVEREST = 14;
    public static final int BIND_EVEREST_2 = 13;
    public static final int BIND_GT = 11;
    public static final int BIND_GTS = 12;
    public static final int BIND_HEADSET = 20;
    public static final int BIND_HEADSET_NEW = 28;
    public static final int BIND_HUANGHE = 16;
    public static final int BIND_LONDON = 23;
    public static final int BIND_MILI = 0;
    public static final int BIND_NORMANDY = 3;
    public static final int BIND_PYH = 8;
    public static final int BIND_QOG = 15;
    public static final int BIND_SHOES = 2;
    public static final String BIND_SN_KEY = "bind_sn";
    public static final int BIND_TOKYO = 26;
    public static final String BIND_TYPE_KEY = "bind_type";
    public static final int BIND_VENICE = 21;
    public static final int BIND_VULTURE = 19;
    public static final int BIND_WEIGHT = 1;
    public static final int BIND_XIHU = 17;
    public static final int MAX_SCAN_TIME = 60000;
    public static final String TAG = "HMBindBaseLogic";
    public static final String TAG_BIND = "TAG_BIND";
    public static final List<HMDeviceSource> UPLOAD_DEVICE_INFO_STATISTICS_ONLY;
    private static final List<HMDeviceSource> f;
    private static final int g = 9;
    public static final int h = -90;
    public static final int i = -60;
    public static final int j = -45;
    private static HMBaseDevice k;
    private HMDeviceType b;
    private HashMap<String, HMDeviceType> c;

    @SuppressLint({"StaticFieldLeak"})
    public Context mContext;
    private static final DeviceXNavigator e = (DeviceXNavigator) KoinJavaComponent.get(DeviceXNavigator.class);
    public static final Lazy<BuildConfigApi> buildConfigApiLazy = KoinJavaComponent.inject(BuildConfigApi.class);
    public static final Lazy<DeviceManagerApi> deviceManagerApiLazy = KoinJavaComponent.inject(DeviceManagerApi.class);
    public static final Lazy<DeviceUtilsApi> deviceUtilsApiLazy = KoinJavaComponent.inject(DeviceUtilsApi.class);
    public static final Lazy<PropertyStoreApi> propertyStoreApiLazy = KoinJavaComponent.inject(PropertyStoreApi.class);
    public static final Lazy<MiuiFnApi> miuiFnApiLazy = KoinJavaComponent.inject(MiuiFnApi.class);
    public static final Lazy<BindServiceApi> bindServiceApiLazy = KoinJavaComponent.inject(BindServiceApi.class);
    public static final Lazy<KeeperProxyApi> keeperProxyApiLazy = KoinJavaComponent.inject(KeeperProxyApi.class);
    public final Lazy<SupportNameApi> supportNameApiLazy = KoinJavaComponent.inject(SupportNameApi.class);
    public UserInfo mUserInfo = null;
    private volatile boolean a = false;
    public HMBaseDevice mBleDevice = null;
    public IBindListener mListener = null;
    public AtomicBoolean mHasStop = new AtomicBoolean(false);
    private final Lazy<DeviceRepositoryApi> d = KoinJavaComponent.inject(DeviceRepositoryApi.class);
    public Handler mHandler = new a(Looper.getMainLooper());

    public enum BindError {
        SCAN_ERROR,
        NO_DEVICE,
        NO_LEFT_DEVICE,
        NO_RIGHT_DEVICE,
        UNKNOW_DEVICE_TYPE,
        DISCONNECTED,
        LEFT_DISCONNECTED,
        RIGHT_DISCONNECTED,
        NET_ERROR,
        NULL_DEVICE_NAME,
        AUTH_FAILED,
        AUTH_DENY,
        HAS_BOUND,
        MORE_DEVICES,
        HAS_DEVICE,
        NEED_RESET,
        SPORT_ON_GOING,
        USING_BY_OTHER_GUY;

        private String nickName = null;
        private HMDeviceSource deviceSource = null;
        private boolean couldResetOnDevice = false;

        BindError() {
        }

        public HMDeviceSource getDeviceSource() {
            return this.deviceSource;
        }

        public String getNickName() {
            return this.nickName;
        }

        public boolean isCouldResetOnDevice() {
            return this.couldResetOnDevice;
        }

        public BindError setCouldResetOnDevice(boolean z) {
            this.couldResetOnDevice = z;
            return this;
        }

        public BindError setDeviceSource(HMDeviceSource hMDeviceSource) {
            this.deviceSource = hMDeviceSource;
            return this;
        }

        public BindError setNickName(String str) {
            this.nickName = str;
            return this;
        }
    }

    public interface IBindListener {
        void onBindFailure(BindError bindError, HMDeviceType hMDeviceType);

        void onBindSuccess(HMBaseDevice hMBaseDevice, Device device);
    }

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[HMDeviceType.values().length];
            c = iArr;
            try {
                iArr[HMDeviceType.MILI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[HMDeviceType.SHOES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[HMDeviceType.WEIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[HMDeviceType.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[HMDeviceType.TREADMILL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                c[HMDeviceType.HEADSET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                c[HMDeviceType.EARBUD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[HMDeviceSource.values().length];
            b = iArr2;
            try {
                iArr2[HMDeviceSource.MILI_WUHAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[HMDeviceSource.MILI_CHONGQING.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[HMDeviceSource.MILI_CINCO.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[HMDeviceSource.MILI_KONGMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[HMDeviceSource.MILI_KONGMING_PRO.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[HMDeviceSource.MILI_KONGMING_PRO_L.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[HMDeviceSource.MILI_PANGU.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[HMDeviceSource.EARBUD_CHOPIN.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[HMDeviceSource.MILI_CINCO_L.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[HMDeviceSource.MILI_KONGMING_L.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[HMDeviceSource.MILI_KONGMING_LITE.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                b[HMDeviceSource.MILI_PANGU_L.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                b[HMDeviceSource.MILI_RIO.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                b[HMDeviceSource.OTHER_MOZART.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                b[HMDeviceSource.OTHER_HAYDN.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                b[HMDeviceSource.OTHER_LULLABY.ordinal()] = 16;
            } catch (NoSuchFieldError unused23) {
            }
            int[] iArr3 = new int[Status.values().length];
            a = iArr3;
            try {
                iArr3[Status.AUTH_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[Status.AUTH_SUCCESS_WITHOUT_DEVICE_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[Status.DISCONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
        }
    }

    static {
        HMDeviceSource hMDeviceSource = HMDeviceSource.OTHER_MOZART;
        HMDeviceSource hMDeviceSource2 = HMDeviceSource.OTHER_HAYDN;
        HMDeviceSource hMDeviceSource3 = HMDeviceSource.OTHER_LULLABY;
        UPLOAD_DEVICE_INFO_STATISTICS_ONLY = Arrays.asList(hMDeviceSource, hMDeviceSource2, hMDeviceSource3);
        f = Arrays.asList(hMDeviceSource, hMDeviceSource2, hMDeviceSource3);
        k = null;
    }

    public HMBindBaseLogic(Context context, HMDeviceType hMDeviceType) {
        this.mContext = null;
        this.b = hMDeviceType;
        this.mContext = context.getApplicationContext();
        this.c = deviceManagerApiLazy.getValue().getBoundDevices(hMDeviceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A(Activity activity, Device device, Throwable th) throws Exception {
        HMLog.i(TAG, "enable earbud error:" + th.getLocalizedMessage(), new Object[0]);
        e.navigateToUnused(activity, device);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String B(HMDeviceSource hMDeviceSource) {
        return "userInfo null: " + hMDeviceSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String C(BindError bindError) {
        return "bind fail: " + bindError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String D() {
        return "error of handleBindFailed";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(BindError bindError) {
        try {
            q();
            IBindListener iBindListener = this.mListener;
            if (iBindListener != null) {
                iBindListener.onBindFailure(bindError, this.b);
            }
        } catch (Throwable th) {
            HMLog.error(TAG, "", th, new Function0() { // from class: xk2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMBindBaseLogic.D();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String F(Device device) {
        String device_address;
        HMDeviceSource hMDeviceSourceFromValue = null;
        if (device != null) {
            hMDeviceSourceFromValue = HMDeviceSource.fromValue(device.getDevice_source().intValue());
            device_address = device.getDevice_address();
        } else {
            device_address = null;
        }
        return "bind success, source: " + hMDeviceSourceFromValue + ", address: " + device_address;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(HMBaseDevice hMBaseDevice, Device device) {
        k = hMBaseDevice;
        IBindListener iBindListener = this.mListener;
        if (iBindListener != null) {
            iBindListener.onBindSuccess(hMBaseDevice, device);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String H(HMDeviceType hMDeviceType, Status status) {
        return "onConnectionStatusChanged:" + hMDeviceType + "," + status;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String I() {
        return "bleDevice null!";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String J() {
        return "deviceInfo null";
    }

    private void K(HMDeviceType hMDeviceType) {
        HMLog.i(TAG, "onDeviceDisconnected:" + hMDeviceType, new Object[0]);
        destroyBleDevice();
        handleBindFailed(BindError.DISCONNECTED);
    }

    private void L(@Nullable HMBindMiLiLogic hMBindMiLiLogic, BindEvent bindEvent) {
        if (hMBindMiLiLogic != null) {
            hMBindMiLiLogic.analytic(bindEvent);
        }
    }

    public static Device createDbDevice(@NonNull HMBaseDevice hMBaseDevice, int i2, int i3) {
        DeviceInfo deviceInfo = hMBaseDevice.getDeviceInfo();
        Calendar calendar = Calendar.getInstance();
        Device device = new Device(deviceInfo.getDeviceID());
        AuthInfo authInfo = hMBaseDevice.getAuthInfo();
        device.setAuthkey(authInfo != null ? authInfo.getKey() : "");
        device.setDevice_address(hMBaseDevice.getBluetoothDevice().getAddress());
        device.setDevice_bind_status(1);
        device.setDevice_bind_time(Long.valueOf(calendar.getTimeInMillis()));
        device.setTime_zone(Integer.valueOf(ProfileUtils.getTimezoneKey(calendar.getTimeZone())));
        device.setDevice_sync_data_time(Long.valueOf(calendar.getTimeInMillis()));
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        device.setDevice_source(Integer.valueOf(deviceSource.getValue()));
        device.setDevice_type(Integer.valueOf(deviceSource.getType().getValue()));
        device.setFirmware_version(deviceInfo.getFirmwareVersionStr());
        device.setUserId(String.valueOf(u(deviceSource).booleanValue() ? HMLoginManager.getValidUid() : HMLoginManager.getMiIdIfExistsOrHuamiID()));
        device.setSn(deviceInfo.getSerialNumber());
        device.setActiveStatus(Integer.valueOf(i2));
        device.setProductId(Integer.valueOf(deviceInfo.getProductId()));
        device.setProductVersion(Integer.valueOf(deviceInfo.getProductVersion()));
        device.setHardwareVersion(deviceInfo.getHardwareVersionStr());
        device.setBrandType(Integer.valueOf(i3));
        return device;
    }

    public static void doNext(Activity activity, Device device, LoadingDialog loadingDialog) {
        doNext(activity, device, loadingDialog, true);
    }

    public static HMBaseDevice getBleDevice() {
        return k;
    }

    public static void goNext(Activity activity, boolean z, Device device) {
        goNext(activity, device, true, z);
    }

    public static boolean isBindingWatch(int i2) {
        return i2 == 4 || i2 == 7 || i2 == 8 || i2 == 9 || i2 == 10;
    }

    private NewDeviceWebAPI.Result o(@Nullable DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return NewDeviceWebAPI.getFail();
        }
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        return buildConfigApiLazy.getValue().supportNewBindApi() ? new NewDeviceWebAPI().bindDevice(getBindInfo(deviceInfo, deviceSource, getDefaultActiveStatus(deviceSource))) : new NewDeviceWebAPI.Result(bindDeviceToWeb(deviceInfo));
    }

    private static HMWebBindInfo p(Context context, HMBaseDevice hMBaseDevice, int i2) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            str = "";
        }
        String str2 = str;
        DeviceInfo deviceInfo = hMBaseDevice.getDeviceInfo();
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        HMWebBindInfo hMWebBindInfoCreateBindInfo = HMWebBindInfo.createBindInfo(deviceSource.getType().getValue(), deviceSource.getValue(), deviceInfo.getDeviceID(), deviceInfo.getFirmwareVersionStr(), str2, hMBaseDevice.getBluetoothDevice().getAddress(), System.currentTimeMillis());
        hMWebBindInfoCreateBindInfo.setEnableMultiDevice(true);
        hMWebBindInfoCreateBindInfo.setProductId(deviceInfo.getProductId());
        hMWebBindInfoCreateBindInfo.setProductVersion(deviceInfo.getProductVersion());
        hMWebBindInfoCreateBindInfo.setActiveStatus(i2);
        return hMWebBindInfoCreateBindInfo;
    }

    private void q() {
        try {
            try {
                if (this.mBleDevice != null) {
                    HMLog.i(TAG, "destroy bind ble device", new Object[0]);
                    this.mBleDevice.setConnectionCallback(null);
                    this.mBleDevice.setAuthCallback(null);
                    this.mBleDevice.setAutoReconnect(false);
                    this.mBleDevice.destroy();
                }
            } catch (Exception e2) {
                HMLog.error(TAG, "", e2, new Function0() { // from class: wk2
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return HMBindBaseLogic.w();
                    }
                });
            }
        } finally {
            this.mBleDevice = null;
        }
    }

    private static void r(final Activity activity, final Device device) {
        Rx.io(new ObservableOnSubscribe() { // from class: yk2
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                HMBindBaseLogic.y(device, observableEmitter);
            }
        }).subscribe(new Consumer() { // from class: zk2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                HMBindBaseLogic.z(activity, device, (Boolean) obj);
            }
        }, new Consumer() { // from class: al2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                HMBindBaseLogic.A(activity, device, (Throwable) obj);
            }
        });
    }

    private static void s(Context context, HMDeviceType hMDeviceType, Device device, boolean z) {
        switch (b.c[hMDeviceType.ordinal()]) {
            case 1:
                e.navigateToDeviceSetting(context, HMDeviceSource.fromValue(device.getDevice_source().intValue()));
                break;
            case 2:
                e.startHMShoesUseActivity(context);
                break;
            case 3:
                e.startHMWeightSettingActivity(context, Boolean.TRUE, Boolean.valueOf(z));
                break;
            case 4:
                e.startHMBlueMonkeySettingActivity(context);
                break;
            case 5:
                context.startActivity(new Intent(context, (Class<?>) HMTreadmillSettingActivity.class));
                break;
            case 6:
                e.startHMHeadsetSettingActivity(context, device.getDevice_address());
                break;
            case 7:
                e.startHmEarbudMusicActivity(context);
                break;
        }
    }

    public static void startUseDevice(Activity activity, Device device, boolean z) {
        deviceManagerApiLazy.getValue().bindDevice(k, device);
        HMDeviceType hMDeviceTypeFromValue = HMDeviceType.fromValue(device.getDevice_type().intValue());
        goNext(activity, device, z, true);
        EventBus.getDefault().postSticky(new HMDeviceBindEvent(true, hMDeviceTypeFromValue));
    }

    private static void t(Activity activity, HMDeviceSource hMDeviceSource) {
        switch (b.b[hMDeviceSource.ordinal()]) {
            case 1:
            case 2:
                e.startMiBand3InstructionActivity(activity);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                if (Language.isSimplifiedChinese()) {
                    DeviceManualUtils.showDeviceManual(activity, hMDeviceSource);
                }
                if (deviceUtilsApiLazy.getValue().xiaoAiReginAccess()) {
                    keeperProxyApiLazy.getValue().setUserHaveBoundDeviceFirstlyShowMiotPermissionInDeviceIntroduceActivity(HMLoginManager.getValidUid(), true);
                }
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                DeviceManualUtils.showDeviceManual(activity, hMDeviceSource);
                break;
            case 13:
                if (Language.isEnglish()) {
                    DeviceManualUtils.showDeviceManual(activity, hMDeviceSource);
                }
                break;
            case 14:
            case 15:
            case 16:
                String playUrl = H5UrlSource.INSTANCE.getMozartH5UrlStatic(hMDeviceSource).getPlayUrl();
                if (playUrl != null) {
                    WebHelper.launch(playUrl);
                }
                break;
        }
    }

    private static Boolean u(HMDeviceSource hMDeviceSource) {
        return hMDeviceSource == HMDeviceSource.OTHER_HAYDN ? Boolean.TRUE : Boolean.FALSE;
    }

    private static void v(Activity activity) {
        DeviceXFunctionsKt.getAppStateApi().jumpToTreadmillSportPage(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String w() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(LoadingDialog loadingDialog, Activity activity, Device device, boolean z) {
        loadingDialog.dismiss();
        activity.finish();
        if (z) {
            e.startToolNavigateActivity(activity, 5);
        } else {
            e.navigateToUnused(activity, device);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y(Device device, ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(Boolean.valueOf(EarbudEnableHelper.INSTANCE.enableEarbud(device, k)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z(Activity activity, Device device, Boolean bool) throws Exception {
        HMLog.i(TAG, "enable earbud result:" + bool, new Object[0]);
        if (bool.booleanValue()) {
            goNext(activity, true, device);
        } else {
            e.navigateToUnused(activity, device);
        }
    }

    public boolean bindDeviceToWeb(@Nullable DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return false;
        }
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        boolean zBindDeviceToWeb = HMDeviceWebAPI.bindDeviceToWeb(getBindInfo(deviceInfo, deviceSource, getDefaultActiveStatus(deviceSource)));
        HMLog.i(TAG, "bindDeviceToWeb: " + zBindDeviceToWeb, new Object[0]);
        return zBindDeviceToWeb;
    }

    public void destroyBleDevice() {
        if (k != this.mBleDevice) {
            q();
        }
    }

    public boolean exist(String str) {
        HashMap<String, HMDeviceType> map = this.c;
        return (map == null || map.get(str) == null) ? false : true;
    }

    public HMWebBindInfo getBindInfo(DeviceInfo deviceInfo, final HMDeviceSource hMDeviceSource, int i2) {
        HMWebBindInfo hMWebBindInfoP = p(this.mContext, this.mBleDevice, i2);
        hMWebBindInfoP.setHardwareVersion(deviceInfo.getHardwareVersionStr().trim());
        hMWebBindInfoP.setProductId(deviceInfo.getProductId());
        hMWebBindInfoP.setProductVersion(deviceInfo.getProductVersion());
        if (!TextUtils.isEmpty(getSN())) {
            hMWebBindInfoP.setSN(getSN().trim());
        } else if (!TextUtils.isEmpty(deviceInfo.getSerialNumber())) {
            hMWebBindInfoP.setSN(deviceInfo.getSerialNumber().trim());
        }
        hMWebBindInfoP.setBrandType(getBrandType());
        if (hMWebBindInfoP.getDeviceSource() == HMDeviceSource.SHOES_CHILD.getValue()) {
            hMWebBindInfoP.setBrandType(HMBrandType.BRAND_SHOES_CHILD.getValue());
        } else if (hMWebBindInfoP.getDeviceSource() == HMDeviceSource.SHOES.getValue()) {
            hMWebBindInfoP.setBrandType(HMBrandType.BRAND_SHOES.getValue());
        } else if (hMWebBindInfoP.getDeviceSource() == HMDeviceSource.SHOES_SPRANDI.getValue()) {
            hMWebBindInfoP.setBrandType(HMBrandType.BRAND_SHOES_SPRANDI.getValue());
        } else if (hMWebBindInfoP.getDeviceSource() == HMDeviceSource.SHOES_LIGHT.getValue()) {
            hMWebBindInfoP.setBrandType(HMBrandType.BRAND_SHOES_LIGHT.getValue());
        }
        if (HMDeviceConfig.hasFeatureAuth(hMDeviceSource)) {
            AuthInfo authInfo = this.mBleDevice.getAuthInfo();
            if (authInfo != null) {
                authInfo.setPair(false);
                hMWebBindInfoP.setAuthKey(authInfo.getKey());
            }
        } else if (hMDeviceSource.getType() == HMDeviceType.MILI) {
            AuthInfo authInfo2 = this.mBleDevice.getAuthInfo();
            if (authInfo2 != null) {
                UserInfo userInfo = authInfo2.getUserInfo();
                if (userInfo != null) {
                    userInfo.setType((byte) 0);
                    String strValueOf = String.valueOf(userInfo.uid);
                    hMWebBindInfoP.setAuthKey(strValueOf);
                    authInfo2.setKey(strValueOf);
                } else {
                    HMLog.error(TAG, new Function0() { // from class: dl2
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: invoke */
                        public final Object getA() {
                            return HMBindBaseLogic.B(hMDeviceSource);
                        }
                    });
                }
            }
            if (hMDeviceSource == HMDeviceSource.MILI_1S) {
                hMWebBindInfoP.setHrFwVersion(deviceInfo.getFirmware2VersionStr());
            }
            if (hMDeviceSource == HMDeviceSource.MILI_AMAZFIT) {
                byte[] bArr = new byte[4];
                Objects.requireNonNull(authInfo2);
                GattUtils.writeLE(bArr, 0, authInfo2.getUserInfo().uid);
                hMWebBindInfoP.setUidCrc(GattUtils.crc8(bArr));
            }
        } else if (hMDeviceSource.getType() == HMDeviceType.SHOES) {
            hMWebBindInfoP.setAuthKey(null);
        }
        return hMWebBindInfoP;
    }

    public int getBrandType() {
        return HMBrandType.BRAND_DEFAULT.getValue();
    }

    public int getDefaultActiveStatus(@NonNull HMDeviceSource hMDeviceSource) {
        if (f.contains(hMDeviceSource)) {
            return 1;
        }
        return deviceManagerApiLazy.getValue().getActiveStatus(hMDeviceSource.getType());
    }

    public String getSN() {
        return "";
    }

    public UserInfo getUserInfo() {
        return this.mUserInfo;
    }

    public void handleBindFailed(final BindError bindError) {
        HMLog.info(TAG_BIND, new Function0() { // from class: gl2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMBindBaseLogic.C(bindError);
            }
        });
        this.mHandler.post(new Runnable() { // from class: cl2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.E(bindError);
            }
        });
    }

    public void handleBindSuccess(final HMBaseDevice hMBaseDevice, final Device device) {
        HMLog.info(TAG_BIND, new Function0() { // from class: fl2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMBindBaseLogic.F(device);
            }
        });
        this.mHandler.post(new Runnable() { // from class: bl2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.G(hMBaseDevice, device);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.ife.IHMConnectionCallback
    public void onConnectionStatusChanged(BluetoothDevice bluetoothDevice, final HMDeviceType hMDeviceType, final Status status) {
        HMLog.info(TAG, new Function0() { // from class: el2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMBindBaseLogic.H(hMDeviceType, status);
            }
        });
        int i2 = b.a[status.ordinal()];
        if (i2 == 1 || i2 == 2) {
            if (this.a) {
                return;
            }
            onDeviceConnected(bluetoothDevice, hMDeviceType, status);
        } else {
            if (i2 != 3) {
                return;
            }
            K(hMDeviceType);
        }
    }

    public void onDeviceConnected(BluetoothDevice bluetoothDevice, HMDeviceType hMDeviceType, Status status) {
        boolean userInfo;
        boolean success;
        HMLog.i(TAG, "onDeviceConnected:" + hMDeviceType, new Object[0]);
        boolean zSupportNewBindApi = buildConfigApiLazy.getValue().supportNewBindApi();
        if (this.mHasStop.get()) {
            return;
        }
        HMBindMiLiLogic hMBindMiLiLogic = this instanceof HMBindMiLiLogic ? (HMBindMiLiLogic) this : null;
        HMBaseDevice hMBaseDevice = this.mBleDevice;
        if (hMBaseDevice == null) {
            L(hMBindMiLiLogic, new BindFail(ConstantKt.STAGE_SET_USER_INFO));
            HMLog.error(TAG, new Function0() { // from class: uk2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMBindBaseLogic.I();
                }
            });
            destroyBleDevice();
            handleBindFailed(BindError.NET_ERROR);
            return;
        }
        DeviceInfo deviceInfo = hMBaseDevice.getDeviceInfo();
        if (deviceInfo == null) {
            L(hMBindMiLiLogic, new BindFail(ConstantKt.STAGE_SET_USER_INFO));
            HMLog.error(TAG, new Function0() { // from class: vk2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMBindBaseLogic.J();
                }
            });
            destroyBleDevice();
            handleBindFailed(BindError.AUTH_FAILED);
            return;
        }
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        if (deviceSource == HMDeviceSource.MILI_CINCO_L) {
            HMLog.i(TAG, "ret: " + ((HMMiLiProDevice) hMBaseDevice).setPagesSync(deviceUtilsApiLazy.getValue().transFromHMDisplaySetting(new HMDisplaySetting(10, true))), new Object[0]);
        }
        if (zSupportNewBindApi) {
            userInfo = true;
        } else {
            userInfo = new BindLogicExtends().setUserInfo(hMBaseDevice);
            L(hMBindMiLiLogic, userInfo ? new SetUserInfoSuccess() : new BindFail(ConstantKt.STAGE_SET_USER_INFO));
        }
        int defaultActiveStatus = getDefaultActiveStatus(deviceSource);
        boolean zIsNetworkConnected = NetUtil.isNetworkConnected(this.mContext);
        if (!zIsNetworkConnected) {
            L(hMBindMiLiLogic, new BindFail(ConstantKt.STAGE_UPLOAD_BIND, ConstantKt.UPLOAD_BIND_FAIL_NO_NETWORK));
        }
        if (userInfo && zIsNetworkConnected) {
            NewDeviceWebAPI.Result resultO = o(deviceInfo);
            if (zSupportNewBindApi) {
                new BindLogicExtends().onBindApiDone(resultO, hMBaseDevice, hMBindMiLiLogic);
            }
            success = resultO.getSuccess();
            if (!success) {
                L(hMBindMiLiLogic, new BindFail(ConstantKt.STAGE_UPLOAD_BIND, ConstantKt.UPLOAD_BIND_FAIL_CLOUD_FAIL));
            }
        } else {
            success = false;
        }
        if (!success) {
            destroyBleDevice();
            handleBindFailed(BindError.NET_ERROR);
            return;
        }
        L(hMBindMiLiLogic, new UploadBindSuccess());
        L(hMBindMiLiLogic, new BindSuccess());
        Device deviceCreateDbDevice = createDbDevice(hMBaseDevice, defaultActiveStatus, getBrandType());
        HMAppSortDataManager.getInstance().checkResetDisplaySetting(deviceSource);
        this.d.getValue().insertOrReplace(deviceCreateDbDevice);
        HMLog.i(TAG, "insert when connected: source: " + deviceCreateDbDevice.getDevice_source() + "; adress: " + deviceCreateDbDevice.getDevice_address(), new Object[0]);
        handleBindSuccess(hMBaseDevice, deviceCreateDbDevice);
        if (status == Status.AUTH_SUCCESS_WITHOUT_DEVICE_INFO && (hMBaseDevice instanceof HMBaseBleDevice)) {
            HMBaseBleDevice hMBaseBleDevice = (HMBaseBleDevice) hMBaseDevice;
            hMBaseBleDevice.updateExternalDeviceInfo();
            this.a = true;
            hMBaseBleDevice.handleStatusChanged(Status.AUTH_SUCCESS);
        }
    }

    @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanError(BleScanOption bleScanOption) {
    }

    @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanStart(BleScanOption bleScanOption) {
    }

    @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanStop(BleScanOption bleScanOption) {
    }

    @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public void onScanedDevice(AdvData advData, BleScanOption bleScanOption) {
    }

    public String randomKey() {
        return Md5FileUtils.getMD5String(UUID.randomUUID().toString());
    }

    public void setUserInfo(UserInfo userInfo) {
        this.mUserInfo = userInfo;
    }

    public void startBind(IBindListener iBindListener) {
        this.mListener = iBindListener;
        this.a = false;
        this.mHasStop.set(false);
    }

    public void stopBind() {
        HMLog.i(TAG, "stopBind", new Object[0]);
        this.mListener = null;
        this.mHasStop.set(true);
    }

    public static void doNext(final Activity activity, final Device device, final LoadingDialog loadingDialog, boolean z) {
        if (device.getActiveStatus().intValue() == 1) {
            startUseDevice(activity, device, z);
            activity.finish();
        } else if (device.getDevice_type().intValue() == HMDeviceType.EARBUD.getValue()) {
            r(activity, device);
        } else if (ConfigHelperKt.hasFeature(HMDeviceSource.fromValue(device.getDevice_source().intValue()), Feature.BOLT_SERIES)) {
            new TreadmillStartTask(getBleDevice(), deviceManagerApiLazy.getValue().getConflictDevice(HMDeviceSource.OTHER_BOLT), device, new TreadmillStartListener() { // from class: tk2
                @Override // com.xiaomi.hm.health.device.bolt.TreadmillStartListener
                public final void onFinish(boolean z2) {
                    HMBindBaseLogic.x(loadingDialog, activity, device, z2);
                }
            }).execute(new Void[0]);
        } else {
            bindServiceApiLazy.getValue().useDeviceActivityStart(activity, device);
            activity.finish();
        }
    }

    public static void goNext(Activity activity, Device device, boolean z, boolean z2) {
        HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(device.getDevice_source().intValue());
        HMDeviceType type = hMDeviceSourceFromValue.getType();
        s(activity, type, device, z2);
        if (z) {
            t(activity, hMDeviceSourceFromValue);
        }
        if (hMDeviceSourceFromValue == HMDeviceSource.MILI_NFC && Language.isSimplifiedChinese()) {
            activity.startActivity(new Intent(activity, (Class<?>) PairCCBActivity.class));
        }
        if (HMDeviceType.MILI == type) {
            miuiFnApiLazy.getValue().checkMiuiNotify(activity);
            e.startRestoreDeviceConfigActivity(activity, hMDeviceSourceFromValue);
        }
        if (ConfigHelperKt.hasFeature(hMDeviceSourceFromValue, Feature.BOLT_SERIES)) {
            e.startToolNavigateActivity(activity, 5);
        }
    }
}
