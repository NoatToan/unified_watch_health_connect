package com.xiaomi.hm.health.device;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.bluetooth.profile.channel.module.settings.DeviceNotSupportStartDeviceException;
import com.huami.bluetooth.profile.channel.module.settings.entity.general.GeneralOperatorFactory;
import com.huami.bluetooth.profile.channel.module.settings.entity.general.IGeneralOperator;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.view.scroll.HMExpandHeadView;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.util.Rx;
import com.huami.web.container.WebActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseui.DarkModeUtilKt;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.baseutil.SpanUtils;
import com.xiaomi.hm.health.bodyfat.activity.InstructScale2Activity;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.Status;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.ife.IHMConnectionCallback;
import com.xiaomi.hm.health.bt.profile.auth.HMAuthState;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMUnusedDeviceActivity;
import com.xiaomi.hm.health.device.amazfit_watch.DownloadAmazfitActivity;
import com.xiaomi.hm.health.device.bind.BindServiceApi;
import com.xiaomi.hm.health.device.bind.HMUnbindBaseLogic;
import com.xiaomi.hm.health.device.bind.IUnbindListener;
import com.xiaomi.hm.health.device.bind.UnbindError;
import com.xiaomi.hm.health.device.bolt.TreadmillStartListener;
import com.xiaomi.hm.health.device.bolt.TreadmillStartTask;
import com.xiaomi.hm.health.device.callback.MyAuthCallback;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeManager;
import com.xiaomi.hm.health.device.model.HMBrandType;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.device.view.EditDeviceDisplayNameDialog;
import com.xiaomi.hm.health.device.weight.InstructionWeightActivity;
import com.xiaomi.hm.health.device.weight.InstructionWeightBfsActivity;
import com.xiaomi.hm.health.devicex.manage.api.core.manager.DeviceConnectManger;
import com.xiaomi.hm.health.utils.DeviceManualUtils;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMUnusedDeviceActivity extends BaseTitleActivity implements View.OnClickListener, IUnbindListener {
    private static final String E = "HMUnusedDeviceActivity";
    private static final Lazy<BindServiceApi> F = KoinJavaComponent.inject(BindServiceApi.class);
    private static final Lazy<DeviceXNavigator> G = KoinJavaComponent.inject(DeviceXNavigator.class);
    public static final /* synthetic */ boolean H = false;
    public static final String KEY_DB_DEVICE = "db_device";
    private LoadingDialog A = null;
    private final Lazy<DeviceConnectManger> B = KoinJavaComponent.inject(DeviceConnectManger.class);
    private final Lazy<DeviceManagerApi> C = KoinJavaComponent.inject(DeviceManagerApi.class);
    private final Lazy<DeviceUtilsApi> D = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private Device x;
    private HMDeviceSource y;
    private HMExpandHeadView z;

    @SuppressLint({"StaticFieldLeak"})
    public static class MyConnectTask extends AsyncTask<Void, Integer, HMBaseDevice> {
        private static final int f = 60000;
        private static final int g = 2000;
        private static final int h = -3;
        private final WeakReference<AppCompatActivity> a;
        private Device b;
        private LoadingDialog c = null;
        private boolean d;
        private DeviceConnectManger e;

        public class a extends MyAuthCallback {
            public a() {
            }

            @Override // com.xiaomi.hm.health.device.callback.MyAuthCallback, com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback
            public void onAuthentication(HMAuthState hMAuthState) {
                MyConnectTask.this.publishProgress(Integer.valueOf(hMAuthState.getState()));
            }
        }

        public MyConnectTask(AppCompatActivity appCompatActivity, Device device, DeviceConnectManger deviceConnectManger) {
            this.a = new WeakReference<>(appCompatActivity);
            this.b = device;
            this.d = HMDeviceConfig.hasFeatureG2(HMDeviceSource.fromValue(device.getDevice_source().intValue()));
            this.e = deviceConnectManger;
        }

        private boolean l(HMBaseDevice hMBaseDevice) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(5, -3);
            if (!hMBaseDevice.setDateTimeSync(calendar)) {
                return false;
            }
            try {
                Thread.sleep(2000L);
            } catch (Exception unused) {
            }
            return hMBaseDevice.setDateTimeSync(Calendar.getInstance());
        }

        private void m() {
            AppCompatActivity appCompatActivityN = n();
            if (appCompatActivityN == null) {
                return;
            }
            new MyConnectTask(appCompatActivityN, this.b, this.e).execute(new Void[0]);
        }

        @Nullable
        private AppCompatActivity n() {
            AppCompatActivity appCompatActivity = this.a.get();
            if (appCompatActivity == null) {
                HMLog.error(HMUnusedDeviceActivity.E, new Function0() { // from class: ln3
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return HMUnusedDeviceActivity.MyConnectTask.v();
                    }
                });
            }
            return appCompatActivity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String o() {
            return "start connect device: " + this.b.getDevice_address();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String p(Status status) {
            return "status: " + status;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void q(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, BluetoothDevice bluetoothDevice, HMDeviceType hMDeviceType, final Status status) {
            HMLog.info(HMSwitchDeviceActivity.TAG_ENABLE, new Function0() { // from class: fn3
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMUnusedDeviceActivity.MyConnectTask.p(status);
                }
            });
            if (status == Status.AUTH_SUCCESS) {
                atomicBoolean.set(true);
                countDownLatch.countDown();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String r() {
            return "没有启用设备接口";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String s() {
            return "Device not support start api";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String t(Exception exc) {
            return "Exception while start device:" + exc.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String u() {
            return "Start device failed";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String v() {
            return "activity recycled";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void w(DialogInterface dialogInterface, int i) {
            m();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            AppCompatActivity appCompatActivityN = n();
            if (appCompatActivityN == null) {
                return;
            }
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(appCompatActivityN, appCompatActivityN.getString(R.string.device_connecting));
            this.c = loadingDialogShowDialog;
            loadingDialogShowDialog.setCancelable(false);
        }

        @Override // android.os.AsyncTask
        public HMBaseDevice doInBackground(Void... voidArr) {
            boolean zHasFeatureG2 = HMDeviceConfig.hasFeatureG2(HMDeviceSource.fromValue(this.b.getDevice_source().intValue()));
            HMLog.info(HMSwitchDeviceActivity.TAG_ENABLE, new Function0() { // from class: gn3
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return this.a.o();
                }
            });
            HMBaseDevice hMBaseDeviceCreateDevice = this.e.createDevice(this.b, zHasFeatureG2);
            if (hMBaseDeviceCreateDevice == null) {
                return null;
            }
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            boolean zStartDevice = false;
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            hMBaseDeviceCreateDevice.setAuthCallback(new a());
            hMBaseDeviceCreateDevice.setConnectionCallback(new IHMConnectionCallback() { // from class: en3
                @Override // com.xiaomi.hm.health.bt.ife.IHMConnectionCallback
                public final void onConnectionStatusChanged(BluetoothDevice bluetoothDevice, HMDeviceType hMDeviceType, Status status) {
                    HMUnusedDeviceActivity.MyConnectTask.q(atomicBoolean, countDownLatch, bluetoothDevice, hMDeviceType, status);
                }
            });
            try {
                countDownLatch.await(60000L, TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
            }
            if (!atomicBoolean.get()) {
                hMBaseDeviceCreateDevice.destroy();
                return null;
            }
            if (zHasFeatureG2) {
                zStartDevice = l(hMBaseDeviceCreateDevice);
            } else {
                IGeneralOperator iGeneralOperatorCreateGeneralOperator = GeneralOperatorFactory.INSTANCE.createGeneralOperator(hMBaseDeviceCreateDevice);
                try {
                    if (iGeneralOperatorCreateGeneralOperator != null) {
                        zStartDevice = iGeneralOperatorCreateGeneralOperator.startDevice();
                    } else {
                        HMLog.info(HMUnusedDeviceActivity.E, new Function0() { // from class: in3
                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: invoke */
                            public final Object getA() {
                                return HMUnusedDeviceActivity.MyConnectTask.r();
                            }
                        });
                    }
                } catch (DeviceNotSupportStartDeviceException unused2) {
                    HMLog.info(HMUnusedDeviceActivity.E, new Function0() { // from class: jn3
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: invoke */
                        public final Object getA() {
                            return HMUnusedDeviceActivity.MyConnectTask.s();
                        }
                    });
                    return hMBaseDeviceCreateDevice;
                } catch (Exception e) {
                    HMLog.info(HMUnusedDeviceActivity.E, new Function0() { // from class: hn3
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: invoke */
                        public final Object getA() {
                            return HMUnusedDeviceActivity.MyConnectTask.t(e);
                        }
                    });
                }
            }
            if (zStartDevice) {
                return hMBaseDeviceCreateDevice;
            }
            HMLog.info(HMUnusedDeviceActivity.E, new Function0() { // from class: kn3
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMUnusedDeviceActivity.MyConnectTask.u();
                }
            });
            hMBaseDeviceCreateDevice.destroy();
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(HMBaseDevice hMBaseDevice) {
            super.onPostExecute(hMBaseDevice);
            final AppCompatActivity appCompatActivityN = n();
            if (appCompatActivityN == null) {
                return;
            }
            this.c.dismiss();
            if (hMBaseDevice == null) {
                AlertDialogFragment.Builder negativeButton = new AlertDialogFragment.Builder(appCompatActivityN).setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() { // from class: dn3
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.a.w(dialogInterface, i);
                    }
                }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: cn3
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        appCompatActivityN.finish();
                    }
                });
                negativeButton.setMessage(R.string.no_connection);
                negativeButton.create().show(appCompatActivityN.getSupportFragmentManager());
            } else {
                if (HMDeviceConfig.hasFeatureG2(HMDeviceSource.fromValue(this.b.getDevice_source().intValue()))) {
                    hMBaseDevice.getAuthInfo().setPair(false);
                }
                ((BindServiceApi) HMUnusedDeviceActivity.F.getValue()).startUseDevice(appCompatActivityN, this.b, hMBaseDevice, false);
            }
        }

        @Override // android.os.AsyncTask
        public void onProgressUpdate(Integer... numArr) {
            super.onProgressUpdate((Object[]) numArr);
            AppCompatActivity appCompatActivityN = n();
            if (appCompatActivityN == null) {
                return;
            }
            if (numArr == null || numArr.length <= 0 || numArr[0].intValue() != 2) {
                this.c.setMessage(appCompatActivityN.getString(R.string.device_connecting));
            } else {
                this.c.setMessage(appCompatActivityN.getString(this.d ? R.string.bind_mili_found_title_pro : R.string.bind_mili_found_title));
            }
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[HMDeviceType.values().length];
            b = iArr;
            try {
                iArr[HMDeviceType.MILI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[HMDeviceType.WEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[HMDeviceType.SHOES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[HMDeviceType.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[HMDeviceType.WATCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[HMDeviceType.EARBUD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[HMDeviceType.TREADMILL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[HMDeviceSource.values().length];
            a = iArr2;
            try {
                iArr2[HMDeviceSource.MILI.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[HMDeviceSource.MILI_1A.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[HMDeviceSource.MILI_1S.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[HMDeviceSource.MILI_PRO.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[HMDeviceSource.MILI_PRO_I.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[HMDeviceSource.MILI_WUHAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[HMDeviceSource.MILI_CHONGQING.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[HMDeviceSource.MILI_RIO.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[HMDeviceSource.MILI_PEYTO.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[HMDeviceSource.MILI_DTH.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[HMDeviceSource.MILI_DTH_W.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[HMDeviceSource.MILI_TONLESAP.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[HMDeviceSource.MILI_TONLESAP_L.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[HMDeviceSource.MILI_TONLESAP_O.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[HMDeviceSource.MILI_TONLESAP_OL.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[HMDeviceSource.MILI_ROCKY.ordinal()] = 16;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[HMDeviceSource.MILI_NFC.ordinal()] = 17;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[HMDeviceSource.MILI_TEMPO.ordinal()] = 18;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[HMDeviceSource.MILI_QINLING.ordinal()] = 19;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[HMDeviceSource.MILI_AMAZFIT.ordinal()] = 20;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                a[HMDeviceSource.MILI_CINCO.ordinal()] = 21;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                a[HMDeviceSource.MILI_CINCO_L.ordinal()] = 22;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                a[HMDeviceSource.MILI_PYH.ordinal()] = 23;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                a[HMDeviceSource.MILI_PYH_W.ordinal()] = 24;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                a[HMDeviceSource.MILI_FALCON.ordinal()] = 25;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                a[HMDeviceSource.MILI_FALCON_W.ordinal()] = 26;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                a[HMDeviceSource.WEIGHT.ordinal()] = 27;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                a[HMDeviceSource.WEIGHT_BODYFAT.ordinal()] = 28;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                a[HMDeviceSource.WEIGHT_BFS.ordinal()] = 29;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                a[HMDeviceSource.WEIGHT_SCALE2.ordinal()] = 30;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                a[HMDeviceSource.SHOES.ordinal()] = 31;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                a[HMDeviceSource.SHOES_CHILD.ordinal()] = 32;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                a[HMDeviceSource.SHOES_MARS.ordinal()] = 33;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                a[HMDeviceSource.SHOES_LIGHT.ordinal()] = 34;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                a[HMDeviceSource.SHOES_SPRANDI.ordinal()] = 35;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                a[HMDeviceSource.EARBUD_CHOPIN.ordinal()] = 36;
            } catch (NoSuchFieldError unused43) {
            }
        }
    }

    private void C() {
        new MyConnectTask(this, this.x, this.B.getValue()).execute(new Void[0]);
    }

    private void D() {
        if (!NetUtil.isNetworkConnected(this)) {
            IconToast.showError(this, getString(R.string.no_network));
            return;
        }
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.earbud_start_device));
        this.A = loadingDialogShowDialog;
        loadingDialogShowDialog.setCancelable(false);
        Rx.io(new ObservableOnSubscribe() { // from class: an3
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.G(observableEmitter);
            }
        }).subscribe(new Consumer() { // from class: bn3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.H((Boolean) obj);
            }
        }, new Consumer() { // from class: nm3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.I((Throwable) obj);
            }
        });
    }

    private String E() {
        if (this.x.getDevice_type().intValue() != HMDeviceType.EARBUD.getValue()) {
            return this.x.getDevice_address();
        }
        String device_address = this.x.getDevice_address();
        return getString(R.string.earbud_mac_detail, new Object[]{device_address, device_address.substring(0, device_address.length() - 2) + "02"});
    }

    private void F() {
        Intent intent = new Intent(this, (Class<?>) DownloadAmazfitActivity.class);
        intent.putExtra(DownloadAmazfitActivity.DOWNLOAD_EXTRA, true);
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(Boolean.valueOf(EarbudEnableHelper.INSTANCE.enableEarbud(this.x, this.B.getValue().createDevice(this.x, false))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(Boolean bool) throws Exception {
        if (!bool.booleanValue()) {
            this.A.setFailed(getString(R.string.start_device_failed));
            return;
        }
        this.A.dismiss();
        G.getValue().startHmEarbudMusicActivity(this);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(Throwable th) throws Exception {
        HMLog.e("StartEarbud", "启用耳机异常", th);
        this.A.setFailed(getString(R.string.start_device_failed));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(View view) {
        W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(View view) {
        X();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(String str) {
        if (str == null || str.trim().length() <= 0) {
            getSubTitleTextView().setVisibility(8);
        } else {
            getSubTitleTextView().setVisibility(0);
            Y(getSubTitleTextView(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(View view) {
        AlertDialogFragment alertDialogFragmentNewInstance = EditDeviceDisplayNameDialog.newInstance(this.x, getBaseContext(), new EditDeviceDisplayNameDialog.IDisplayNameListener() { // from class: zm3
            @Override // com.xiaomi.hm.health.device.view.EditDeviceDisplayNameDialog.IDisplayNameListener
            public final void onDisplayNameChanged(String str) {
                this.a.L(str);
            }
        });
        if (alertDialogFragmentNewInstance != null) {
            alertDialogFragmentNewInstance.show(getSupportFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(View view) {
        G.getValue().jumpToTreadmillFaq(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(DialogInterface dialogInterface, int i) {
        HMUnbindBaseLogic.unbind(this.x, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P() {
        LoadingDialog loadingDialog = this.A;
        if (loadingDialog != null) {
            loadingDialog.setFailed(getString(R.string.device_unbind_failed));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q() {
        LoadingDialog loadingDialog = this.A;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
            this.A = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R() {
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.device_unbinding));
        this.A = loadingDialogShowDialog;
        loadingDialogShowDialog.setCancelable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S() {
        LoadingDialog loadingDialog = this.A;
        if (loadingDialog != null) {
            loadingDialog.setSuccess(getString(R.string.device_unbind_success));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T() {
        LoadingDialog loadingDialog = this.A;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
            this.A = null;
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U(View view) {
        boolean z = false;
        try {
            if (getPackageManager().getPackageInfo("com.huami.watch.hmwatchmanager", 0) != null) {
                z = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!z) {
            F();
            return;
        }
        try {
            startActivity(new Intent(DownloadAmazfitActivity.AMAZFIT_WATCH_BIND_ACTION));
        } catch (Exception e2) {
            e2.printStackTrace();
            F();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(boolean z) {
        if (!z) {
            this.A.setFailed(getString(R.string.start_device_failed));
            return;
        }
        this.A.dismiss();
        G.getValue().startHMTreadmillSettingActivity(this);
        finish();
    }

    private void W() {
        int i = a.a[this.y.ordinal()];
        if (i == 4) {
            G.getValue().startMiBand2InstructionActivity(this);
        }
        if (i == 6) {
            G.getValue().startMiBand3InstructionActivity(this);
            return;
        }
        if (i == 18) {
            WebActivity.launch(this, this.D.getValue().getDthBeatsChaohuTempoPlayUrl(HMDeviceSource.MILI_TEMPO));
            return;
        }
        if (i == 36) {
            DeviceManualUtils.showDeviceManual(this, this.y);
            return;
        }
        switch (i) {
            case 27:
                startActivity(new Intent(this, (Class<?>) InstructionWeightActivity.class));
                break;
            case 28:
            case 29:
                InstructionWeightBfsActivity.startMe(this, this.y);
                break;
            case 30:
                startActivity(new Intent(this, (Class<?>) InstructScale2Activity.class));
                break;
        }
    }

    private void X() {
        String string;
        if (!NetUtil.isNetworkConnected(this)) {
            IconToast.showError(this, getString(R.string.no_network));
            return;
        }
        String[] stringArray = getResources().getStringArray(R.array.unbind_device_description);
        switch (a.b[HMDeviceType.fromValue(this.x.getDevice_type().intValue()).ordinal()]) {
            case 1:
                string = !HMDeviceConfig.isWatch(HMDeviceSource.fromValue(this.x.getDevice_source().intValue())) ? stringArray[0] : stringArray[3];
                break;
            case 2:
                string = !HMDeviceConfig.isBfs(HMDeviceSource.fromValue(this.x.getDevice_source().intValue())) ? stringArray[1] : getResources().getString(R.string.weight_bfs);
                break;
            case 3:
                string = stringArray[2];
                break;
            case 4:
                string = stringArray[4];
                break;
            case 5:
                string = stringArray[3];
                break;
            case 6:
                string = getString(R.string.earbud_chopin);
                break;
            case 7:
                string = getString(R.string.other_bolt_offical);
                break;
            default:
                string = null;
                break;
        }
        new AlertDialogFragment.Builder(this).setMessage(getString(R.string.device_unbind_confirm, new Object[]{string})).setPositiveButton(R.string.device_unbind, new DialogInterface.OnClickListener() { // from class: mm3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.O(dialogInterface, i);
            }
        }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).show(getSupportFragmentManager());
    }

    private void Y(TextView textView, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    private void Z() {
        String string = getString(R.string.amazfit_watch_app);
        String string2 = getString(R.string.go_to_activate);
        String str = String.format(getString(R.string.activate_watch_tips), string, string2);
        int iIndexOf = str.indexOf(string2);
        int length = string2.length() + iIndexOf;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpanUtils.setSpan(spannableStringBuilder, iIndexOf, length, ContextCompat.getColor(this, R.color.dark_sky_blue_three), new View.OnClickListener() { // from class: xm3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.U(view);
            }
        });
        SpanUtils.setText((TextView) findViewById(R.id.activate_amazfit_watch_tips), spannableStringBuilder);
    }

    private void a0() {
        int i;
        switch (a.a[this.y.ordinal()]) {
            case 1:
            case 2:
            case 3:
                i = R.drawable.img_head_bg_mili;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                i = R.drawable.sub_bg_head;
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i = R.drawable.img_chaohu_bg;
                break;
            case 16:
            case 17:
                i = R.drawable.img_head_bg_arc;
                break;
            case 18:
                i = R.drawable.img_head_bg_tempo;
                break;
            case 19:
            case 20:
                i = R.drawable.img_head_bg_default;
                break;
            case 21:
            case 22:
                i = R.drawable.img_bg_cinco;
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                i = R.drawable.img_bg_pyh;
                break;
            case 27:
            case 28:
            case 29:
            case 30:
                i = R.drawable.weight_bg_head;
                break;
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                i = R.drawable.img_shoes_bg;
                break;
            default:
                i = R.drawable.img_head_bg_default;
                break;
        }
        this.z.getBackgroundImage().setBackgroundResource(i);
    }

    private void b0() {
        HMFwUpgradeManager.addIgnoreActivity(getClass());
        HMDeviceType hMDeviceTypeFromValue = HMDeviceType.fromValue(this.x.getDevice_type().intValue());
        if (hMDeviceTypeFromValue == HMDeviceType.TREADMILL) {
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.device_using));
            this.A = loadingDialogShowDialog;
            loadingDialogShowDialog.setCancelable(false);
            new TreadmillStartTask(null, this.C.getValue().getConflictDevice(this.y), this.x, new TreadmillStartListener() { // from class: ym3
                @Override // com.xiaomi.hm.health.device.bolt.TreadmillStartListener
                public final void onFinish(boolean z) {
                    this.a.V(z);
                }
            }).execute(new Void[0]);
            return;
        }
        if (hMDeviceTypeFromValue == HMDeviceType.WEIGHT || hMDeviceTypeFromValue == HMDeviceType.WATCH) {
            F.getValue().startUseDevice(this, this.x, null, false);
        } else if (hMDeviceTypeFromValue == HMDeviceType.EARBUD) {
            D();
        } else {
            C();
        }
    }

    private void initViews() {
        String huamiDeviceDescription = (GlobalConfig.get().isBuildMidong() && this.C.getValue().isUseWearCompanionName(this.x)) ? this.D.getValue().getHuamiDeviceDescription(this.x) : this.D.getValue().getDeviceDescription(this.y, HMBrandType.fromValue(this.x.getBrandType().intValue()));
        setTitleText(huamiDeviceDescription);
        getTitleTextView().setFocusableInTouchMode(true);
        getTitleTextView().setEllipsize(TextUtils.TruncateAt.MARQUEE);
        getTitleTextView().setMarqueeRepeatLimit(1);
        ListTile listTile = (ListTile) findViewById(R.id.play_with_device);
        if (this.D.getValue().shouldShowPlay(this.y)) {
            listTile.setVisibility(0);
            listTile.setTitle(getString(R.string.play_with_device, new Object[]{huamiDeviceDescription}));
            listTile.setOnClickListener(new View.OnClickListener() { // from class: um3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.J(view);
                }
            });
        }
        ListTile listTile2 = (ListTile) findViewById(R.id.mac_address);
        ListTile listTile3 = (ListTile) findViewById(R.id.firmware_version);
        Button button = (Button) findViewById(R.id.unbind);
        listTile2.setTips(E());
        listTile3.setTips(this.x.getFirmware_version());
        button.setOnClickListener(new View.OnClickListener() { // from class: wm3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.K(view);
            }
        });
        ListTile listTile4 = (ListTile) findViewById(R.id.use_device);
        HMDeviceSource hMDeviceSource = this.y;
        if (hMDeviceSource == HMDeviceSource.WEIGHT || hMDeviceSource == HMDeviceSource.WEIGHT_SCALE2) {
            listTile4.setSubtitle(R.string.use_device_tips_weight);
        } else if (hMDeviceSource == HMDeviceSource.WEIGHT_AMAZFIT_SCALE || hMDeviceSource == HMDeviceSource.WEIGHT_BODYFAT || hMDeviceSource == HMDeviceSource.WEIGHT_BFS) {
            listTile4.setSubtitle(R.string.use_device_tips_weight_bfs);
        } else if (hMDeviceSource.getType() == HMDeviceType.SHOES || this.y.getType() == HMDeviceType.MILI || this.y.getType() == HMDeviceType.WATCH) {
            listTile4.setSubtitle(R.string.use_device_tips);
        } else if (this.y.getType() == HMDeviceType.EARBUD) {
            listTile4.setSubtitle(R.string.use_earbud_tips);
        } else if (this.y.getType() == HMDeviceType.TREADMILL) {
            listTile4.setSubtitle(R.string.bolt_use_device_tip);
        }
        this.z = (HMExpandHeadView) findViewById(R.id.unused_device_head_view);
        if (!GlobalConfig.get().isBuildMidong()) {
            a0();
        }
        getRightImage().setOnClickListener(new View.OnClickListener() { // from class: tm3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.M(view);
            }
        });
        if (this.y.getType() == HMDeviceType.TREADMILL) {
            ListTile listTile5 = (ListTile) findViewById(R.id.faq_item);
            listTile5.setVisibility(0);
            listTile5.setOnClickListener(new View.OnClickListener() { // from class: vm3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.N(view);
                }
            });
        }
    }

    public static void start(Context context, Device device) {
        Intent intent = new Intent(context, (Class<?>) HMUnusedDeviceActivity.class);
        intent.putExtra("db_device", device);
        context.startActivity(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1024 && i2 == -1) {
            finish();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.use_device) {
            if (!NetUtil.isNetworkConnected(this)) {
                IconToast.showError(this, getString(R.string.no_network_connection));
            } else if (GattUtils.isBluetoothEnable()) {
                b0();
            } else {
                IconToast.showError(this, getString(R.string.ble_not_open));
            }
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_unused_device);
        DarkModeUtilKt.setDeviceSettingUnifyTitleStyle(this, "");
        updateTitleLayout();
        Device device = (Device) getIntent().getSerializableExtra("db_device");
        this.x = device;
        this.y = HMDeviceSource.fromValue(device.getDevice_source().intValue());
        Device device2 = this.x;
        if (device2 == null || TextUtils.isEmpty(device2.getDisplayName()) || this.x.getDisplayName().trim().length() <= 0) {
            getSubTitleTextView().setVisibility(8);
        } else {
            Y(getSubTitleTextView(), this.x.getDisplayName());
        }
        initViews();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.xiaomi.hm.health.device.bind.IUnbindListener
    public void onUnbindFailure(UnbindError unbindError, HMDeviceType hMDeviceType) {
        this.z.post(new Runnable() { // from class: pm3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.P();
            }
        });
        this.z.postDelayed(new Runnable() { // from class: sm3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.Q();
            }
        }, 1500L);
    }

    @Override // com.xiaomi.hm.health.device.bind.IUnbindListener
    public void onUnbindStart(HMDeviceType hMDeviceType) {
        this.z.post(new Runnable() { // from class: om3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.R();
            }
        });
    }

    @Override // com.xiaomi.hm.health.device.bind.IUnbindListener
    public void onUnbindSuccess(HMDeviceType hMDeviceType) {
        this.z.post(new Runnable() { // from class: qm3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.S();
            }
        });
        this.z.postDelayed(new Runnable() { // from class: rm3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.T();
            }
        }, 1500L);
    }
}
