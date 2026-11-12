package com.xiaomi.hm.health.device.reset;

import android.app.Application;
import android.bluetooth.BluetoothDevice;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.device.Status;
import com.xiaomi.hm.health.bt.ife.IHMConnectionCallback;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.profile.auth.HMAuthState;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.device.callback.MyAuthCallback;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.reset.ResetDeviceViewModel;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes18.dex */
public class ResetDeviceViewModel extends AndroidViewModel implements IHMConnectionCallback {
    private static final String l = "ResetDeviceViewModel";
    private static final String m = "V1.0.0.21";
    private static final String n = "V1.0.1.60";
    private static final String o = "V1.0.0.2";
    public static final int p = 0;
    public static final int q = 1;
    public static final int r = 2;
    public static final int s = 3;
    private static final long t = 40000;
    private Application a;
    private HMMiLiProDevice b;
    private HMDeviceSource c;
    private int d;
    private long e;
    private MutableLiveData<String> f;
    private MutableLiveData<String> g;
    private MutableLiveData<Integer> h;
    private MutableLiveData<DialogResource<DialogContent>> i;
    private final Lazy<DeviceManagerApi> j;
    public IHMAuthCallback k;

    public class a extends HMCallback {
        public a(boolean z) {
            super(z);
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            HMLog.i(ResetDeviceViewModel.l, "setResetMiliPro = " + z, new Object[0]);
            if (z) {
                ResetDeviceViewModel.this.W();
            } else {
                ResetDeviceViewModel.this.V();
            }
        }
    }

    public class b extends MyAuthCallback {
        public b() {
        }

        @Override // com.xiaomi.hm.health.device.callback.MyAuthCallback, com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback
        public void onAuthentication(HMAuthState hMAuthState) {
            int state = hMAuthState.getState();
            if (state == 0) {
                HMLog.i(ResetDeviceViewModel.l, "onAuthentication = 认证成功", new Object[0]);
                ResetDeviceViewModel.this.d = hMAuthState.getRandomSimple();
                ResetDeviceViewModel.this.e = System.currentTimeMillis();
                return;
            }
            if (state == 1) {
                HMLog.i(ResetDeviceViewModel.l, "onAuthentication = 认证失败", new Object[0]);
                ResetDeviceViewModel.this.z();
                return;
            }
            if (state == 2) {
                HMLog.i(ResetDeviceViewModel.l, "onAuthentication = 需要敲击验证", new Object[0]);
                ResetDeviceViewModel.this.A(R.string.bind_mili_found_next, R.string.bind_mili_found_sub, 1);
            } else if (state == 3) {
                HMLog.i(ResetDeviceViewModel.l, "onAuthentication = 敲击成功", new Object[0]);
            } else if (state != 4) {
                HMLog.i(ResetDeviceViewModel.l, "onAuthentication = 各种ERROR", new Object[0]);
                ResetDeviceViewModel.this.z();
            } else {
                HMLog.i(ResetDeviceViewModel.l, "onAuthentication = 认证被拒绝", new Object[0]);
                ResetDeviceViewModel.this.z();
            }
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            a = iArr;
            try {
                iArr[Status.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Status.SCANNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Status.GATT_CONNECTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Status.GATT_CONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Status.GATT_CONNECT_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[Status.GATT_DISCONNECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[Status.CONNECTING_TIMEOUT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[Status.DISCONNECTED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[Status.INIT_SUCCESS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[Status.INIT_FAILED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[Status.AUTH_SUCCESS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[Status.AUTH_FAILED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public ResetDeviceViewModel(@NonNull Application application) {
        super(application);
        this.f = new MutableLiveData<>();
        this.g = new MutableLiveData<>();
        this.h = new MutableLiveData<>();
        this.i = new MutableLiveData<>();
        this.j = KoinJavaComponent.inject(DeviceManagerApi.class);
        this.k = new b();
        this.a = application;
        C(R.string.bind_mili_connecting, R.string.bind_mili_search_tips, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(@StringRes final int i, @StringRes final int i2, final int i3) {
        Observable.create(new Observable.OnSubscribe() { // from class: zd6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                ((Subscriber) obj).onNext(null);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: od6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.K(i, i2, i3, (Void) obj);
            }
        }, new Action1() { // from class: pd6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                ResetDeviceViewModel.I((Throwable) obj);
            }
        });
    }

    private void B() {
        Y(DialogResource.loading(new DialogContent(R.string.bind_mili_reset)));
        this.b.reset(new a(true));
    }

    private void C(@StringRes int i, @StringRes int i2, int i3) {
        this.f.setValue(this.a.getResources().getString(i));
        this.g.setValue(this.a.getResources().getString(i2));
        this.h.setValue(Integer.valueOf(i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(Void r1) {
        V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String F() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void G(Throwable th) {
        HMLog.error(l, "", th, new Function0() { // from class: td6
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return ResetDeviceViewModel.F();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String H() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void I(Throwable th) {
        HMLog.error(l, "", th, new Function0() { // from class: md6
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return ResetDeviceViewModel.H();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(int i, int i2, int i3, Void r4) {
        C(i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(Void r1) {
        B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String N() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void O(Throwable th) {
        HMLog.error(l, "", th, new Function0() { // from class: ud6
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return ResetDeviceViewModel.N();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(Void r3) {
        Y(DialogResource.success(new DialogContent(R.string.bing_mili_reset_un_support, R.string.got_it)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String R() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void S(Throwable th) {
        HMLog.error(l, "", th, new Function0() { // from class: vd6
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return ResetDeviceViewModel.R();
            }
        });
    }

    private void T() {
        A(R.string.bind_mili_input_number, R.string.bind_mili_input_sub, 2);
    }

    private void U() {
        Observable.create(new Observable.OnSubscribe() { // from class: wd6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                ((Subscriber) obj).onNext(null);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: ae6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.Q((Void) obj);
            }
        }, new Action1() { // from class: sd6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                ResetDeviceViewModel.S((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        Y(DialogResource.failure(new DialogContent(R.string.bind_mili_reset_failure, R.string.cancel, R.string.retry)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        Y(DialogResource.success(new DialogContent(R.string.bind_mili_reset_success, R.string.got_it)));
        HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_PRO;
        HMDeviceSource hMDeviceSource2 = this.c;
        if (hMDeviceSource == hMDeviceSource2) {
            Analytics.event(this.a, StatEvent.EVENT_RESET_SUCCESS_NUM, StatEvent.VALUE_BAND2);
        } else if (HMDeviceSource.MILI_WUHAN == hMDeviceSource2) {
            Analytics.event(this.a, StatEvent.EVENT_RESET_SUCCESS_NUM, StatEvent.VALUE_BAND3);
        }
    }

    private void Y(DialogResource<DialogContent> dialogResource) {
        this.i.setValue(dialogResource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        Observable.create(new Observable.OnSubscribe() { // from class: yd6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                ((Subscriber) obj).onNext(null);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: be6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.E((Void) obj);
            }
        }, new Action1() { // from class: qd6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                ResetDeviceViewModel.G((Throwable) obj);
            }
        });
    }

    public void X(BluetoothDevice bluetoothDevice) {
        a0();
        C(R.string.bind_mili_connecting, R.string.bind_mili_search_tips, 0);
        Z(bluetoothDevice);
    }

    public void Z(BluetoothDevice bluetoothDevice) {
        HMMiLiProDevice hMMiLiProDevice = new HMMiLiProDevice(this.a, bluetoothDevice);
        this.b = hMMiLiProDevice;
        hMMiLiProDevice.setConnectionCallback(this);
        this.b.setAutoReconnect(false);
        this.b.setAuthCallback(this.k);
        this.b.setAuthInfo(new AuthInfo(UUID.randomUUID().toString(), true, (byte) 12));
        this.b.create(false);
    }

    public void a0() {
        HMMiLiProDevice hMMiLiProDevice = this.b;
        if (hMMiLiProDevice != null) {
            hMMiLiProDevice.destroy();
            this.b = null;
        }
    }

    public LiveData<Integer> getPosition() {
        return this.h;
    }

    public LiveData<DialogResource<DialogContent>> getStatus() {
        return this.i;
    }

    public LiveData<String> getSubTitle() {
        return this.g;
    }

    public LiveData<String> getTitle() {
        return this.f;
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
    }

    @Override // com.xiaomi.hm.health.bt.ife.IHMConnectionCallback
    public void onConnectionStatusChanged(BluetoothDevice bluetoothDevice, HMDeviceType hMDeviceType, Status status) {
        switch (c.a[status.ordinal()]) {
            case 1:
                HMLog.i(l, "onConnectionStatusChanged = 初始状态", new Object[0]);
                break;
            case 2:
                HMLog.i(l, "onConnectionStatusChanged = 开始扫描", new Object[0]);
                break;
            case 3:
                HMLog.i(l, "onConnectionStatusChanged = 开始连接GATT", new Object[0]);
                break;
            case 4:
                HMLog.i(l, "onConnectionStatusChanged = 已连上GATT", new Object[0]);
                break;
            case 5:
                HMLog.i(l, "onConnectionStatusChanged = GATT连接失败", new Object[0]);
                z();
                break;
            case 6:
                HMLog.i(l, "onConnectionStatusChanged = GATT断开连接", new Object[0]);
                z();
                break;
            case 7:
                HMLog.i(l, "onConnectionStatusChanged = 连接超时", new Object[0]);
                z();
                break;
            case 8:
                HMLog.i(l, "onConnectionStatusChanged = 连接断开，如蓝牙关闭，非自动重连设备连接失败", new Object[0]);
                if (!this.j.getValue().isBluetoothEnable()) {
                    A(R.string.ble_not_open, R.string.ble_open_bluetooth_tip, 3);
                } else {
                    z();
                }
                break;
            case 9:
                HMLog.i(l, "onConnectionStatusChanged = 初始化设备成功", new Object[0]);
                break;
            case 10:
                HMLog.i(l, "onConnectionStatusChanged = 初始化设备失败", new Object[0]);
                z();
                break;
            case 11:
                HMLog.i(l, "onConnectionStatusChanged = 认证成功，表示连接成功", new Object[0]);
                DeviceInfo deviceInfo = this.b.getDeviceInfo();
                this.c = deviceInfo.getDeviceSource();
                int firmwareVersion = deviceInfo.getFirmwareVersion();
                HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_PRO;
                HMDeviceSource hMDeviceSource2 = this.c;
                if (hMDeviceSource != hMDeviceSource2) {
                    if (HMDeviceSource.MILI_WUHAN != hMDeviceSource2) {
                        if (HMDeviceSource.MILI_CHONGQING == hMDeviceSource2) {
                            T();
                        }
                    } else if (firmwareVersion >= ProfileUtils.getVersionCodeFromVersionName(o)) {
                        T();
                    } else {
                        U();
                    }
                } else if (firmwareVersion < ProfileUtils.getVersionCodeFromVersionName(m)) {
                    U();
                } else if (firmwareVersion >= ProfileUtils.getVersionCodeFromVersionName(n)) {
                    T();
                } else {
                    Observable.create(new Observable.OnSubscribe() { // from class: xd6
                        @Override // rx.functions.Action1
                        public final void call(Object obj) {
                            ((Subscriber) obj).onNext(null);
                        }
                    }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: nd6
                        @Override // rx.functions.Action1
                        public final void call(Object obj) {
                            this.a.M((Void) obj);
                        }
                    }, new Action1() { // from class: rd6
                        @Override // rx.functions.Action1
                        public final void call(Object obj) {
                            ResetDeviceViewModel.O((Throwable) obj);
                        }
                    });
                }
                break;
            case 12:
                HMLog.i(l, "onConnectionStatusChanged = 认证失败", new Object[0]);
                z();
                break;
            default:
                HMLog.i(l, "onConnectionStatusChanged = 未知问题", new Object[0]);
                z();
                break;
        }
    }

    public void y(int i) {
        if (System.currentTimeMillis() - this.e > t) {
            Y(DialogResource.failure(new DialogContent(R.string.bind_mili_time_out, R.string.cancel, R.string.retry)));
        } else if (this.d == i) {
            B();
        } else {
            Y(DialogResource.warning(new DialogContent(R.string.bind_mili_pair_failure)));
        }
    }
}
