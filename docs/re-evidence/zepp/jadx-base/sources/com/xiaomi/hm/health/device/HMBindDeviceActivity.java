package com.xiaomi.hm.health.device;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.huami.account.HMLoginManager;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.web.container.event.EventWebViewExit;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseui.BaseTitleBarExtKt;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.bt.profile.mili.model.UserInfo;
import com.xiaomi.hm.health.bt.profile.weight.WeightBfsProfile;
import com.xiaomi.hm.health.bt.scan.AdvData;
import com.xiaomi.hm.health.bt.scan.BleScanCenter;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMBindDeviceActivity;
import com.xiaomi.hm.health.device.amazfit_watch.HMSelectWatchActivityNew;
import com.xiaomi.hm.health.device.bind.BindServiceApi;
import com.xiaomi.hm.health.device.bind.HMBindBaseLogic;
import com.xiaomi.hm.health.device.bind.HMBindMiLiLogic;
import com.xiaomi.hm.health.device.bind.HMBindNormandyLogic;
import com.xiaomi.hm.health.device.bind.HMBindShoesLogic;
import com.xiaomi.hm.health.device.bind.HMBindWeightLogic;
import com.xiaomi.hm.health.device.bind.HmBindEarbudLogic;
import com.xiaomi.hm.health.device.bind.analytic.ConstantKt;
import com.xiaomi.hm.health.device.bind.analytic.events.CancelBind;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.earbud.util.EarbudUtil;
import com.xiaomi.hm.health.device.earbud.view.EarbudImageView;
import com.xiaomi.hm.health.device.event.BindNotUseEvent;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.headset.BindHeadsetUpgradeFragment;
import com.xiaomi.hm.health.device.headset.BindSingleHeadsetFragment;
import com.xiaomi.hm.health.device.headset.BindSingleHeadsetViewModel;
import com.xiaomi.hm.health.device.headset.PairedDeviceViewModel;
import com.xiaomi.hm.health.device.headset.SingleHeadsetUpgradeActivity;
import com.xiaomi.hm.health.device.headset.help.HeadSetConnectHelp;
import com.xiaomi.hm.health.device.headset.help.NetWorkBluetoothLifeComponent;
import com.xiaomi.hm.health.device.headset.ui.fragment.HeadsetBindHintFragment;
import com.xiaomi.hm.health.device.introduce.BindIntroEvent;
import com.xiaomi.hm.health.device.introduce.BindIntroExtendsKt;
import com.xiaomi.hm.health.device.introduce.BindIntroStatus;
import com.xiaomi.hm.health.device.introduce.BindIntroduceMainFragment;
import com.xiaomi.hm.health.device.model.HMBrandType;
import com.xiaomi.hm.health.device.reset.HMResetDeviceActivity;
import com.xiaomi.hm.health.device.view.HMLoadingView;
import com.xiaomi.hm.health.devicex.manage.api.core.manager.UserInfoProvider;
import com.xiaomi.hm.health.imageload.DisplayConfig;
import com.xiaomi.hm.health.imageload.ext.ImageLoadExtentionsKt;
import com.xiaomi.hm.health.manager.UnitManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import de.greenrobot.event.EventBus;
import defpackage.em2;
import defpackage.km2;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMBindDeviceActivity extends BaseTitleActivity implements HMBindMiLiLogic.IBindMiliListener, HMBindWeightLogic.IBindWeightListener, HMBindShoesLogic.IBindShoesListener, HMBindNormandyLogic.IBindNormandyListener, HmBindEarbudLogic.EarbudBindListener {
    private static final String C0 = "HMBindDeviceActivity";
    private static final String D0 = "bind_headset_fragment";
    private static final Lazy<BindServiceApi> E0 = KoinJavaComponent.inject(BindServiceApi.class);
    private HMBindHeadsetLogic.BindListener A0;
    private Device B0;
    private FrameLayout N;
    private HMDeviceSource s0;
    private HMDeviceSource t0;
    private BindIntroduceMainFragment u0;
    private PairedDeviceViewModel v0;
    private boolean w0;
    private final Lazy<UserInfoProvider> x0;
    private final Lazy<DeviceUtilsApi> y0;
    private boolean z0;
    private HMLoadingView x = null;
    private ImageView y = null;
    private ImageView z = null;
    private AnimatorSet A = null;
    private ImageView B = null;
    private TextView C = null;
    private TextView D = null;
    private TextView E = null;
    private TextView F = null;
    private RelativeLayout G = null;
    private TextView H = null;
    private TextView I = null;
    private EarbudImageView J = null;
    private View K = null;
    private TextView L = null;
    private TextView M = null;
    private LoadingDialog O = null;
    private ImageView P = null;
    private TextView Q = null;
    private int R = 0;
    private HMBindMiLiLogic S = null;
    private HMBindWeightLogic T = null;
    private HMBindShoesLogic U = null;
    private HMBindNormandyLogic V = null;
    private HmBindEarbudLogic W = null;
    private HMBindBaseLogic X = null;
    private BluetoothDevice Y = null;
    private boolean Z = false;
    private boolean m0 = true;
    private BottomSheetDialog n0 = null;
    private AlertDialogFragment o0 = null;
    private BluetoothDevice p0 = null;
    private HMDeviceSource q0 = null;
    private int r0 = 1;

    public class a implements HMBindHeadsetLogic.BindListener {
        public a() {
        }

        @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic.IBindListener
        public void onBindFailure(HMBindBaseLogic.BindError bindError, HMDeviceType hMDeviceType) {
            HMBindDeviceActivity.this.onBindFailure(bindError, hMDeviceType);
        }

        @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic.IBindListener
        public void onBindSuccess(HMBaseDevice hMBaseDevice, Device device) {
            HMBindDeviceActivity.this.onBindSuccess(hMBaseDevice, device);
        }

        @Override // com.xiaomi.hm.health.device.HMBindHeadsetLogic.BindListener
        public void onDeviceFound(@NotNull BluetoothDevice bluetoothDevice) {
            HMBindDeviceActivity.this.q2(bluetoothDevice);
        }

        @Override // com.xiaomi.hm.health.device.HMBindHeadsetLogic.BindListener
        public void onSingleBind(@NotNull HMBaseDevice hMBaseDevice) {
            HMBindDeviceActivity.this.L2(false);
            HMBindDeviceActivity.this.H2(new BindSingleHeadsetFragment());
        }

        @Override // com.xiaomi.hm.health.device.HMBindHeadsetLogic.BindListener
        public void onVersionDiverseBind(@NotNull HMBaseDevice hMBaseDevice) {
            HMBindDeviceActivity.this.L2(false);
            HMBindDeviceActivity.this.H2(new BindHeadsetUpgradeFragment());
        }
    }

    public class b extends BroadcastReceiver {
        private boolean a = false;
        private boolean b = false;
        public final /* synthetic */ BluetoothDevice c;
        public final /* synthetic */ Runnable d;
        public final /* synthetic */ Runnable e;
        public final /* synthetic */ Runnable f;

        public b(BluetoothDevice bluetoothDevice, Runnable runnable, Runnable runnable2, Runnable runnable3) {
            this.c = bluetoothDevice;
            this.d = runnable;
            this.e = runnable2;
            this.f = runnable3;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            HMDeviceSource deviceSource;
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice == null || !bluetoothDevice.getAddress().equals(this.c.getAddress())) {
                return;
            }
            if ((HMBindDeviceActivity.this.X instanceof HMBindHeadsetLogic) && (deviceSource = ((HMBindHeadsetLogic) HMBindDeviceActivity.this.X).getDeviceSource(bluetoothDevice.getName())) != null) {
                this.b = ConfigHelperKt.hasFeature(deviceSource, Feature.BOUND_REFUSE_RETRY);
            }
            boolean z = false;
            if ("android.bluetooth.device.action.PAIRING_REQUEST".equals(intent.getAction())) {
                this.d.run();
                this.a = true;
                HMBindDeviceActivity.this.L.setEnabled(false);
                HMBindDeviceActivity.this.M.setEnabled(false);
                return;
            }
            int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", 10);
            int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", 10);
            boolean z2 = intExtra2 == 11 && intExtra == 10;
            if (intExtra2 == 11 && intExtra == 12) {
                z = true;
            }
            if (!z2) {
                if (z) {
                    this.d.run();
                    HMBindDeviceActivity.this.unregisterReceiver(this);
                    HMBindDeviceActivity.this.K.setVisibility(8);
                    this.f.run();
                    return;
                }
                return;
            }
            this.d.run();
            HMBindDeviceActivity.this.unregisterReceiver(this);
            HMBindDeviceActivity.this.L.setEnabled(true);
            HMBindDeviceActivity.this.M.setEnabled(true);
            if (!this.a || this.b) {
                this.e.run();
            }
        }
    }

    public class c implements Animator.AnimatorListener {
        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (HMBindDeviceActivity.this.z.getVisibility() == 0) {
                HMBindDeviceActivity.this.A.start();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HMBindBaseLogic.BindError.values().length];
            a = iArr;
            try {
                iArr[HMBindBaseLogic.BindError.MORE_DEVICES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HMBindBaseLogic.BindError.NO_DEVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HMBindBaseLogic.BindError.HAS_BOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[HMBindBaseLogic.BindError.NEED_RESET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[HMBindBaseLogic.BindError.NET_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[HMBindBaseLogic.BindError.AUTH_DENY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[HMBindBaseLogic.BindError.SPORT_ON_GOING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[HMBindBaseLogic.BindError.USING_BY_OTHER_GUY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[HMBindBaseLogic.BindError.LEFT_DISCONNECTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[HMBindBaseLogic.BindError.NO_LEFT_DEVICE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[HMBindBaseLogic.BindError.RIGHT_DISCONNECTED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[HMBindBaseLogic.BindError.NO_RIGHT_DEVICE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public HMBindDeviceActivity() {
        HMDeviceSource hMDeviceSource = HMDeviceSource.VDEVICE;
        this.s0 = hMDeviceSource;
        this.t0 = hMDeviceSource;
        this.w0 = false;
        this.x0 = KoinJavaComponent.inject(UserInfoProvider.class);
        this.y0 = KoinJavaComponent.inject(DeviceUtilsApi.class);
        this.z0 = false;
        this.A0 = new a();
        this.B0 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A1(DialogInterface dialogInterface, int i) {
        this.S.stopBind();
        finish();
    }

    private void A2(String str, @DrawableRes int i) {
        this.E.setText(str);
        this.F.setText(R.string.bind_earbud_no_device_tip);
        this.y.setImageResource(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B1(View view) {
        HMDeviceHelperActivity.show(this, 5, 2);
    }

    private void B2(HMBindBaseLogic.BindError bindError, int i) {
        switch (i) {
            case 0:
                V0(bindError);
                break;
            case 1:
                Z0(bindError);
                break;
            case 2:
                X0(bindError);
                break;
            case 3:
                W0(bindError);
                break;
            case 6:
                P0(bindError);
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 19:
            case 21:
            case 22:
            case 23:
            case 26:
            case 27:
                Y0(bindError);
                break;
            case 18:
                R0(bindError);
                break;
            case 20:
            case 28:
                U0(bindError, i);
                break;
            case 25:
                T0(bindError);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C1(DialogInterface dialogInterface, int i) {
        startActivity(new Intent(this, (Class<?>) HMUnifySelectDeviceActivity.class));
        finish();
    }

    private void C2() {
        this.x.stopLoading();
        AlertDialogFragment alertDialogFragment = this.o0;
        if (alertDialogFragment == null || !alertDialogFragment.isShowing()) {
            AlertDialogFragment alertDialogFragmentCreate = new AlertDialogFragment.Builder(this).setTitle(R.string.bind_device_has_bound_2).setCancelable(false).setNegativeButton(R.string.bind_not_right_now, new DialogInterface.OnClickListener() { // from class: tn2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.a.J1(dialogInterface, i);
                }
            }).setPositiveButton(R.string.bind_restore_factory, new DialogInterface.OnClickListener() { // from class: sn2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.a.K1(dialogInterface, i);
                }
            }).create();
            this.o0 = alertDialogFragmentCreate;
            alertDialogFragmentCreate.show(getSupportFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D1(DialogInterface dialogInterface, int i) {
        this.S.stopBind();
        i3();
        this.S.improve();
        this.S.startBind(this, this.p0, this.q0);
    }

    private void D2() {
        this.x.stopLoading();
        AlertDialogFragment alertDialogFragment = this.o0;
        if (alertDialogFragment == null || !alertDialogFragment.isShowing()) {
            AlertDialogFragment alertDialogFragmentCreate = new AlertDialogFragment.Builder(this).setTitle(R.string.device_reset_tips).setCancelable(false).setNeutralButton(R.string.got_it, new DialogInterface.OnClickListener() { // from class: kn2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.a.L1(dialogInterface, i);
                }
            }).create();
            this.o0 = alertDialogFragmentCreate;
            alertDialogFragmentCreate.show(getSupportFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E1(DialogInterface dialogInterface, int i) {
        this.S.stopBind();
        finish();
    }

    private void E2(String str, String str2) {
        R2(str, str2, new Runnable() { // from class: vm2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.M1();
            }
        }, new Runnable() { // from class: qm2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.N1();
            }
        }, new Runnable() { // from class: um2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.O1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F1(View view) {
        HMTreadmillSettingActivity.INSTANCE.jumpToTreadmillFaq(this);
    }

    private void F2(String str, String str2) {
        R2(str, str2, new Runnable() { // from class: pm2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.P1();
            }
        }, new Runnable() { // from class: hm2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.Q1();
            }
        }, new Runnable() { // from class: rm2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.R1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G1() {
        if (!PhoneEnvActivity.testPhoneEnv((Context) this, true, 25)) {
            this.W.stopBind();
            finish();
        } else {
            this.W.stopBind();
            j3();
            this.W.improve();
            this.W.startBind((HmBindEarbudLogic.EarbudBindListener) this);
        }
    }

    private void G2(String str) {
        R2(str, getString(R.string.bind_get_help), new Runnable() { // from class: im2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.S1();
            }
        }, new Runnable() { // from class: gm2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.T1();
            }
        }, new Runnable() { // from class: tm2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.U1();
            }
        });
    }

    private void H0(int i) {
        if (i == 20) {
            P2(getString(R.string.bind_headset_tips_no_device), R.string.retry, new km2(this), R.string.not_bind_now, new em2(this));
            return;
        }
        HeadsetBindHintFragment headsetBindHintFragment = new HeadsetBindHintFragment(this.q0);
        headsetBindHintFragment.setDismissListener(new Function0() { // from class: jn2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return this.a.e1();
            }
        });
        headsetBindHintFragment.setCancelable(false);
        headsetBindHintFragment.show(getSupportFragmentManager(), HeadsetBindHintFragment.TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H1() {
        this.W.stopBind();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H2(@NonNull Fragment fragment) {
        BaseTitleBarExtKt.setTitleBar(this, "", null, R.color.s36, BaseTitleActivity.STYLE.SINGLE_BACK);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.add(R.id.device_bind_rl, fragment, D0);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    private void I0(String str, String str2) {
        Analytics.recordEvent(new CountEventBuilder(str).setValue(str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I1() {
        EarbudUtil.INSTANCE.showEarbudHelp(this);
    }

    private void I2(final Device device) {
        final LoadingDialog loadingDialogShowDialog;
        this.x.stopLoading();
        if (this.Z || !this.m0) {
            loadingDialogShowDialog = null;
        } else {
            t2();
            loadingDialogShowDialog = LoadingDialog.showDialog(this);
            loadingDialogShowDialog.setSuccess(getString(R.string.device_bind_success));
            loadingDialogShowDialog.setCancelable(false);
        }
        final Runnable runnable = new Runnable() { // from class: dn2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.V1(loadingDialogShowDialog, device);
            }
        };
        if (this.Z) {
            runnable.run();
        } else {
            this.E.postDelayed(new Runnable() { // from class: gn2
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.W1(runnable);
                }
            }, this.m0 ? 1500L : 0L);
        }
    }

    private void J0() {
        if (!this.Z) {
            L2(true);
        }
        Observable.fromCallable(new Callable() { // from class: in2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.f1();
            }
        }).subscribeOn(Schedulers.io()).subscribe();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J1(DialogInterface dialogInterface, int i) {
        startActivity(new Intent(this, (Class<?>) HMUnifySelectDeviceActivity.class));
        this.S.stopBind();
        finish();
    }

    private void J2(int i) {
        String string = getString(R.string.bind_get_help);
        K2(getString(i, new Object[]{string}), string);
    }

    private void K0() {
        HMSwitchDeviceActivity.destroyDevice(getStartDevice(), HMBindBaseLogic.getBleDevice());
        EventBus.getDefault().post(new BindIntroEvent(BindIntroStatus.RECOVER_OVER, false));
        EventBus.getDefault().post(new BindNotUseEvent(HMDeviceSource.fromValue(this.B0.getDevice_source().intValue())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K1(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent(this, (Class<?>) HMResetDeviceActivity.class);
        intent.putExtra("bind_device", this.S.getBluetoothDevice());
        startActivity(intent);
        this.S.stopBind();
        finish();
        HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_PRO;
        HMDeviceSource hMDeviceSource2 = this.s0;
        if (hMDeviceSource == hMDeviceSource2) {
            I0(StatEvent.EVENT_RESET_CLICK_NUM, StatEvent.VALUE_BAND2);
        } else if (HMDeviceSource.MILI_WUHAN == hMDeviceSource2) {
            I0(StatEvent.EVENT_RESET_CLICK_NUM, StatEvent.VALUE_BAND3);
        }
    }

    private void K2(String str, String str2) {
        R2(str, str2, new Runnable() { // from class: fm2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.X1();
            }
        }, new Runnable() { // from class: sm2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.Y1();
            }
        }, new Runnable() { // from class: lm2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.Z1();
            }
        });
    }

    private void L0(Device device, LoadingDialog loadingDialog) {
        if (!ConfigHelperKt.hasFeature(Feature.HEADSET_MOZART_SOURCE_S, HMDeviceSource.fromValue(device.getDevice_source().intValue()))) {
            E0.getValue().doNext(this, device, loadingDialog, true);
            return;
        }
        device.setActiveStatus(1);
        E0.getValue().doNext(this, device, loadingDialog, true ^ this.Z);
        if (this.Z) {
            startActivity(SingleHeadsetUpgradeActivity.newInstance(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L1(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L2(boolean z) {
        if (z) {
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this);
            this.O = loadingDialogShowDialog;
            loadingDialogShowDialog.setMessage(getResources().getString(R.string.device_binding));
            this.O.setCancelable(false);
            return;
        }
        LoadingDialog loadingDialog = this.O;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
            this.O = null;
        }
    }

    private int M0(BluetoothDevice bluetoothDevice) {
        HMDeviceSource hMDeviceSourceNameToDeviceSource = this.q0;
        if (hMDeviceSourceNameToDeviceSource == null) {
            hMDeviceSourceNameToDeviceSource = this.y0.getValue().nameToDeviceSource(GattUtils.getBluetoothDeviceName(bluetoothDevice));
        }
        if (hMDeviceSourceNameToDeviceSource == null) {
            return R.drawable.img_amazfitwatch;
        }
        int deviceIcon = ConfigHelperKt.getDeviceIcon(hMDeviceSourceNameToDeviceSource);
        return deviceIcon == -1 ? R.drawable.img_amazfitwatch : deviceIcon;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M1() {
        if (this.u0 != null) {
            getSupportFragmentManager().beginTransaction().remove(this.u0);
            this.N.setVisibility(8);
        }
        this.S.stopBind();
        k3();
        this.S.improve();
        this.S.startBind(this, this.p0, this.q0);
    }

    private void M2(boolean z, @StringRes int i) {
        L2(z);
        if (z) {
            this.O.setMessage(getResources().getString(i));
        }
    }

    @NonNull
    private String N0(HMUserInfo hMUserInfo) {
        String nickname = hMUserInfo.getNickname();
        if (nickname != null) {
            return nickname;
        }
        HMLog.error(C0, new Function0() { // from class: nn2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMBindDeviceActivity.g1();
            }
        });
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N1() {
        this.S.stopBind();
        finish();
    }

    private void N2() {
        x2(R.string.blue_monkey_not_shake);
    }

    private String O0(int i) {
        String[] stringArray = getResources().getStringArray(R.array.weight_unit);
        if (i == 16) {
            return stringArray[1];
        }
        return i == 1 ? stringArray[2] : stringArray[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O1() {
        HMDeviceHelperActivity.show(this, E0.getValue().isBindingWatch(this.R) ? 4 : 0, 2);
    }

    private void O2(final BluetoothDevice bluetoothDevice, boolean z, String str, String str2) {
        this.x.stopLoading();
        String string = getString(R.string.bind_weight_found_title);
        String string2 = getString(R.string.bind_tip_of_weight_device_name);
        if (z) {
            string = getString(R.string.bind_weight_bfs_found_title);
            string2 = getString(R.string.bind_tip_of_weight_bfs_device_name);
        }
        new AlertDialogFragment.Builder(this).setTitle(string).setMessage(getString(R.string.bind_weight_found_tips, new Object[]{string2, str, str2})).setCancelable(false).setPositiveButton(R.string.bind_weight_confirm, new DialogInterface.OnClickListener() { // from class: kl2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.a2(bluetoothDevice, dialogInterface, i);
            }
        }).setNegativeButton(R.string.bind_weight_research, new DialogInterface.OnClickListener() { // from class: rn2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.b2(dialogInterface, i);
            }
        }).create().show(getSupportFragmentManager());
    }

    private void P0(HMBindBaseLogic.BindError bindError) {
        int i = d.a[bindError.ordinal()];
        if (i == 1) {
            x2(R.string.blue_monkey_bind_fail_keep_away);
            return;
        }
        if (i == 2) {
            x2(R.string.blue_monkey_bind_fail_no_device);
            return;
        }
        if (i == 3) {
            x2(R.string.bind_device_has_bound);
        } else if (i != 5) {
            x2(R.string.blue_monkey_bind_fail_close_to_phone);
        } else {
            x2(R.string.bind_failed_net_error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P1() {
        this.V.stopBind();
        this.D.setVisibility(0);
        this.C.setVisibility(8);
        this.B.setVisibility(8);
        findViewById(R.id.accept_img).setVisibility(8);
        findViewById(R.id.normandy_left_img).setVisibility(8);
        findViewById(R.id.normandy_right_img).setVisibility(8);
        this.E.setText(R.string.normandy_searching);
        this.F.setText(getString(R.string.normandy_searching_tips, new Object[]{getString(R.string.chip_device_name)}));
        this.y.setImageResource(R.drawable.img_h_mchip);
        this.x.startLoading();
        this.V.improve();
        this.V.startBind((HMBindNormandyLogic.IBindNormandyListener) this);
    }

    private void P2(String str, int i, Runnable runnable, int i2, Runnable runnable2) {
        Q2(str, null, null, i, runnable, i2, runnable2);
    }

    private void Q0() {
        this.x.stopLoading();
        this.x.setVisibility(8);
        this.D.setVisibility(8);
        this.C.setVisibility(0);
        this.B.setVisibility(8);
        findViewById(R.id.accept_img).setVisibility(8);
        this.C.setText(R.string.blue_monkey_not_shaked);
        this.y.setImageResource(R.drawable.img_blue_monkey);
        findViewById(R.id.blue_monkey_vibrate_rl).setVisibility(0);
        this.x.stopLoading();
        this.E.setText(R.string.blue_monkey_shake);
        this.F.setText(R.string.blue_monkey_shake_tips);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q1() {
        this.V.stopBind();
        finish();
    }

    private void Q2(String str, String str2, final Runnable runnable, int i, final Runnable runnable2, int i2, final Runnable runnable3) {
        HMLog.i(C0, "showFailureDialog, msg: " + str + ", linkText: " + str2 + ", isFailDlgShowing: " + this.w0, new Object[0]);
        if (this.w0) {
            return;
        }
        AlertDialogFragment alertDialogFragment = this.o0;
        if (alertDialogFragment == null || !alertDialogFragment.isShowing()) {
            AlertDialogFragment.Builder onDismissListener = new AlertDialogFragment.Builder(this).setMessage(str).setPositiveButton(i, new DialogInterface.OnClickListener() { // from class: nl2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    runnable2.run();
                }
            }).setNegativeButton(i2, new DialogInterface.OnClickListener() { // from class: ml2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    runnable3.run();
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ol2
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.a.e2(dialogInterface);
                }
            });
            if (!TextUtils.isEmpty(str2)) {
                onDismissListener.setLink(str2, new View.OnClickListener() { // from class: yl2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        runnable.run();
                    }
                });
            }
            BindIntroduceMainFragment bindIntroduceMainFragment = this.u0;
            boolean z = bindIntroduceMainFragment != null && bindIntroduceMainFragment.isWorking();
            HMLog.i(C0, "introWorking: " + z, new Object[0]);
            if (isFinishing() || isDestroyed() || z) {
                return;
            }
            AlertDialogFragment alertDialogFragmentCreate = onDismissListener.create();
            this.o0 = alertDialogFragmentCreate;
            alertDialogFragmentCreate.show(getSupportFragmentManager());
            this.w0 = true;
        }
    }

    private void R0(HMBindBaseLogic.BindError bindError) {
        int i = d.a[bindError.ordinal()];
        if (i == 1) {
            y2(R.string.blue_monkey_bind_fail_keep_away);
            return;
        }
        if (i == 2) {
            y2(R.string.bolt_bind_fail_no_device);
            return;
        }
        if (i == 3) {
            y2(R.string.bind_device_has_bound);
            return;
        }
        if (i == 5) {
            y2(R.string.bind_failed_net_error);
            return;
        }
        if (i == 7) {
            y2(R.string.bolt_sport_on_going);
        } else if (i != 8) {
            y2(R.string.bolt_bind_fail_close_to_phone);
        } else {
            y2(R.string.bolt_using_by_other_guy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R1() {
        HMDeviceHelperActivity.show(this, 3, 2);
    }

    private void R2(String str, String str2, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        this.x.stopLoading();
        Q2(str, str2, runnable3, R.string.bind_try_again, runnable, R.string.not_bind_now, runnable2);
    }

    private void S0() {
        this.x.stopLoading();
        this.x.setVisibility(8);
        this.D.setVisibility(8);
        this.C.setVisibility(0);
        this.B.setVisibility(8);
        findViewById(R.id.accept_img).setVisibility(8);
        this.C.setText(R.string.bolt_bind_not_knock);
        this.y.setImageResource(R.drawable.treadmill_search);
        this.x.stopLoading();
        this.E.setText(R.string.bolt_bind_knock_title);
        this.F.setText(R.string.bolt_bind_knock_tips);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S1() {
        this.U.stopBind();
        finish();
        startActivity(new Intent(this, (Class<?>) HMCaptureShoesActivity.class));
    }

    private void S2(String str) {
        T2(str, false);
    }

    private void T0(HMBindBaseLogic.BindError bindError) {
        this.x.stopLoading();
        int i = d.a[bindError.ordinal()];
        if (i == 2) {
            this.J.setLeftConnect(false);
            this.J.setRightConnect(false);
            A2(getString(R.string.bind_earbud_no_left_and_right), R.drawable.img_earbud);
            z2(getString(R.string.bind_earbud_no_left_and_right_msg), "");
        }
        if (i == 3) {
            T2(getString(R.string.bind_earbud_other), true);
            return;
        }
        if (i == 5) {
            T2(getString(R.string.bind_failed_net_error), true);
            return;
        }
        switch (i) {
            case 9:
            case 10:
                this.J.setLeftConnect(false);
                this.J.setRightConnect(true);
                A2(getString(R.string.bind_earbud_no_left), R.drawable.img_earbud);
                z2(getString(R.string.bind_earbud_no_left_msg), "");
                break;
            case 11:
            case 12:
                this.J.setLeftConnect(true);
                this.J.setRightConnect(false);
                A2(getString(R.string.bind_earbud_no_right), R.drawable.img_earbud);
                z2(getString(R.string.bind_earbud_no_right_msg), "");
                break;
            default:
                this.J.setLeftConnect(false);
                this.J.setRightConnect(false);
                z2(getString(R.string.bind_earbud_fail_message), getString(R.string.bind_get_help));
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T1() {
        this.U.stopBind();
        finish();
    }

    private void T2(String str, final boolean z) {
        this.x.stopLoading();
        AlertDialogFragment alertDialogFragment = this.o0;
        if (alertDialogFragment == null || !alertDialogFragment.isShowing()) {
            AlertDialogFragment alertDialogFragmentCreate = new AlertDialogFragment.Builder(this).setTitle(str).setCancelable(false).setNeutralButton(R.string.gotit, new DialogInterface.OnClickListener() { // from class: ll2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.a.g2(z, dialogInterface, i);
                }
            }).create();
            this.o0 = alertDialogFragmentCreate;
            alertDialogFragmentCreate.show(getSupportFragmentManager());
        }
    }

    private void U0(@NotNull final HMBindBaseLogic.BindError bindError, int i) {
        c3();
        int i2 = d.a[bindError.ordinal()];
        if (i2 == 1) {
            b3();
            g3(getString(R.string.bind_headset_tips_more_device), getString(R.string.bind_headset_tips_more_device_msg), R.drawable.img_bind_mozart_more_devices, getString(R.string.retry), new km2(this));
        } else if (i2 != 2) {
            P2(getString(R.string.bind_headset_tips_pair_failed), R.string.retry, new Runnable() { // from class: fn2
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.h1(bindError);
                }
            }, R.string.cancel, new em2(this));
        } else {
            H0(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U1() {
        HMDeviceHelperActivity.show(this, 3, 2);
    }

    private void U2() {
        I0(StatEvent.BIND_CHIP2_ERROR, StatEvent.BIND_ERROR_NOT_VIBRATE);
        int i = R.string.normandy_not_shake_help;
        int i2 = R.string.chip_device_name;
        F2(getString(i, new Object[]{getString(i2), getString(i2)}), null);
    }

    private void V0(HMBindBaseLogic.BindError bindError) {
        switch (d.a[bindError.ordinal()]) {
            case 1:
                E2(getString(R.string.bind_mili_more_devices_tips), null);
                I0(StatEvent.BIND_BAND_ERROR, StatEvent.BIND_ERROR_HAS_BOUND);
                break;
            case 2:
                showBindMiLiFailureUI(R.string.bind_mili_not_found_tips, R.string.bind_get_help);
                I0(StatEvent.BIND_BAND_ERROR, StatEvent.BIND_ERROR_NOT_FIND);
                break;
            case 3:
                S2(getString(R.string.bind_device_has_bound));
                I0(StatEvent.BIND_BAND_ERROR, StatEvent.BIND_ERROR_HAS_BOUND);
                break;
            case 4:
                this.s0 = bindError.getDeviceSource();
                if ((d1() && !bindError.isCouldResetOnDevice()) || HMDeviceSource.MILI_PRO == this.s0) {
                    C2();
                } else {
                    D2();
                }
                I0(StatEvent.BIND_BAND_ERROR, StatEvent.BIND_ERROR_HAS_BOUND);
                break;
            case 5:
                S2(getString(R.string.bind_failed_net_error));
                I0(StatEvent.BIND_BAND_ERROR, "ErrorByNet");
                break;
            case 6:
                S2(getString(R.string.bind_failed_auth_deny));
                I0(StatEvent.BIND_BAND_ERROR, "OtherError");
                break;
            default:
                int i = R.string.band_bind_failed_help;
                int i2 = R.string.bind_get_help;
                E2(getString(i, new Object[]{getString(R.string.device_band), getString(i2)}), getString(i2));
                I0(StatEvent.BIND_BAND_ERROR, "OtherError");
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V1(LoadingDialog loadingDialog, Device device) {
        if (loadingDialog != null) {
            loadingDialog.dismiss();
        }
        finish();
        L0(device, loadingDialog);
    }

    private void V2() {
        Lazy<BindServiceApi> lazy = E0;
        I0(lazy.getValue().isBindingWatch(this.R) ? StatEvent.BIND_CHAOHU_ERROR : StatEvent.BIND_BAND_ERROR, StatEvent.BIND_ERROR_NOT_VIBRATE);
        E2(getString(lazy.getValue().isBindingWatch(this.R) ? R.string.bind_chaohu_more_devices_tips : R.string.bind_mili_not_shake_help), null);
    }

    @SuppressLint({"StringFormatMatches", "StringFormatInvalid"})
    private void W0(HMBindBaseLogic.BindError bindError) {
        int i = d.a[bindError.ordinal()];
        if (i == 1) {
            int i2 = R.string.normandy_not_shake_help;
            int i3 = R.string.chip_device_name;
            F2(getString(i2, new Object[]{getString(i3), getString(i3)}), null);
            I0(StatEvent.BIND_CHIP2_ERROR, StatEvent.BIND_ERROR_HAS_BOUND);
            return;
        }
        if (i == 2) {
            int i4 = R.string.normandy_not_found_tips;
            int i5 = R.string.chip_device_name;
            int i6 = R.string.bind_get_help;
            F2(getString(i4, new Object[]{getString(i5, new Object[]{getString(i6)}), getString(i6)}), getString(i6));
            I0(StatEvent.BIND_CHIP2_ERROR, StatEvent.BIND_ERROR_NOT_FIND);
            return;
        }
        if (i == 3) {
            S2(getString(R.string.bind_device_has_bound));
            I0(StatEvent.BIND_CHIP2_ERROR, StatEvent.BIND_ERROR_HAS_BOUND);
        } else if (i == 5) {
            S2(getString(R.string.bind_failed_net_error));
            I0(StatEvent.BIND_CHIP2_ERROR, "ErrorByNet");
        } else {
            int i7 = R.string.normandy_bind_failed_help;
            int i8 = R.string.bind_get_help;
            F2(getString(i7, new Object[]{getString(R.string.chip_device_name), getString(i8)}), getString(i8));
            I0(StatEvent.BIND_CHIP2_ERROR, "OtherError");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W1(Runnable runnable) {
        if (isDestroyed()) {
            return;
        }
        runnable.run();
    }

    private void W2(HMDeviceSource hMDeviceSource) {
        final boolean zIsForeground = DeviceXFunctionsKt.getAppStateApi().isForeground();
        HMLog.info(C0, new Function0() { // from class: mn2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMBindDeviceActivity.h2(zIsForeground);
            }
        });
        if (!zIsForeground) {
            K0();
        } else {
            new AlertDialogFragment.Builder(this).setMessage(getString(R.string.unuse_other_tips, new Object[]{this.y0.getValue().getDeviceDescription(HMDeviceManager.getInstance().getConflictDevice(hMDeviceSource))})).setPositiveButton(R.string.smart_alarm_diaog_continue, new DialogInterface.OnClickListener() { // from class: il2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.a.i2(dialogInterface, i);
                }
            }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: zm2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.a.j2(dialogInterface, i);
                }
            }).show(getSupportFragmentManager());
        }
    }

    private void X0(HMBindBaseLogic.BindError bindError) {
        int i = d.a[bindError.ordinal()];
        if (i == 2) {
            int i2 = R.string.bind_shoes_not_found_tips;
            int i3 = R.string.chip_device_name;
            G2(getString(i2, new Object[]{getString(i3), getString(i3)}));
            I0(StatEvent.BIND_CHIP_ERROR, StatEvent.BIND_ERROR_NOT_FIND);
            return;
        }
        if (i != 5) {
            G2(getString(R.string.shoe_bind_failed_help, new Object[]{getString(R.string.chip_device_name)}));
            I0(StatEvent.BIND_CHIP_ERROR, "OtherError");
        } else {
            S2(getString(R.string.bind_failed_net_error));
            I0(StatEvent.BIND_CHIP_ERROR, "ErrorByNet");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X1() {
        this.x.startLoading();
        this.T.reSearch();
    }

    private void X2() {
        HMUserInfo userInfo = HMPersonInfo.getInstance().getUserInfo();
        try {
            UserInfo userInfo2 = new UserInfo((int) HMLoginManager.getValidUid(), (byte) userInfo.getGender(), (byte) userInfo.getAge(), (byte) userInfo.getHeight(), (byte) userInfo.getWeight(), (byte) 1, N0(userInfo).getBytes(Charset.defaultCharset()));
            switch (this.R) {
                case 0:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 18:
                case 19:
                case 21:
                case 22:
                case 23:
                case 26:
                case 27:
                    BleScanCenter.getInstance().setContinuousScan(true);
                    HMBindMiLiLogic hMBindMiLiLogic = new HMBindMiLiLogic(this, this.R, this.r0);
                    this.S = hMBindMiLiLogic;
                    hMBindMiLiLogic.setUserInfo(userInfo2);
                    this.S.startBind(this, this.p0, this.q0);
                    break;
                case 1:
                    BleScanCenter.getInstance().setContinuousScan(false);
                    HMBindWeightLogic hMBindWeightLogic = new HMBindWeightLogic(this);
                    this.T = hMBindWeightLogic;
                    hMBindWeightLogic.setUserInfo(userInfo2);
                    this.T.startBind((HMBindWeightLogic.IBindWeightListener) this);
                    break;
                case 2:
                    BleScanCenter.getInstance().setContinuousScan(true);
                    HMBindShoesLogic hMBindShoesLogic = new HMBindShoesLogic(this);
                    this.U = hMBindShoesLogic;
                    hMBindShoesLogic.setSN(getIntent().getStringExtra("bind_sn"));
                    this.U.startBind(getIntent().getStringExtra("bind_address"), this);
                    break;
                case 3:
                    HMBindNormandyLogic hMBindNormandyLogic = new HMBindNormandyLogic(this);
                    this.V = hMBindNormandyLogic;
                    hMBindNormandyLogic.setBrandType(getIntent().getIntExtra("bind_brand_type", HMBrandType.BRAND_MIJIA.getValue()));
                    this.V.startBind((HMBindNormandyLogic.IBindNormandyListener) this);
                    break;
                case 20:
                case 28:
                    b1();
                    HMDeviceSource hMDeviceSource = this.q0;
                    if (hMDeviceSource == null) {
                        hMDeviceSource = HMDeviceSource.OTHER_MOZART;
                    }
                    HMBindHeadsetLogic hMBindHeadsetLogic = new HMBindHeadsetLogic(this, hMDeviceSource);
                    this.X = hMBindHeadsetLogic;
                    hMBindHeadsetLogic.setUserInfo(userInfo2);
                    if (this.R != 28) {
                        this.X.startBind(this.A0);
                    } else {
                        a1();
                    }
                    break;
                case 25:
                    HmBindEarbudLogic hmBindEarbudLogic = new HmBindEarbudLogic(this);
                    this.W = hmBindEarbudLogic;
                    hmBindEarbudLogic.setUserInfo(userInfo2);
                    this.W.startBind((HmBindEarbudLogic.EarbudBindListener) this);
                    break;
            }
        } catch (Exception e) {
            HMLog.error(C0, new Function0() { // from class: ln2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMBindDeviceActivity.k2(e);
                }
            });
            B2(HMBindBaseLogic.BindError.NET_ERROR, this.R);
        }
    }

    private void Y0(HMBindBaseLogic.BindError bindError) {
        int i = d.a[bindError.ordinal()];
        if (i == 1) {
            E2(getString(R.string.bind_chaohu_more_devices_tips), null);
            I0(StatEvent.BIND_CHAOHU_ERROR, StatEvent.BIND_ERROR_HAS_BOUND);
            return;
        }
        if (i == 2) {
            showBindMiLiFailureUI(R.string.bind_chaohu_not_found_tips, R.string.bind_get_help);
            I0(StatEvent.BIND_CHAOHU_ERROR, StatEvent.BIND_ERROR_NOT_FIND);
            return;
        }
        if (i == 3) {
            S2(getString(R.string.bind_device_has_bound));
            I0(StatEvent.BIND_CHAOHU_ERROR, StatEvent.BIND_ERROR_HAS_BOUND);
            return;
        }
        if (i == 5) {
            S2(getString(R.string.bind_failed_net_error));
            I0(StatEvent.BIND_CHAOHU_ERROR, "ErrorByNet");
            return;
        }
        if (i == 6) {
            S2(getString(R.string.bind_failed_auth_deny));
            I0(StatEvent.BIND_CHAOHU_ERROR, "OtherError");
        } else {
            if (bindError == HMBindBaseLogic.BindError.NEED_RESET) {
                D2();
                return;
            }
            int i2 = R.string.watch_bind_failed_help;
            int i3 = R.string.bind_get_help;
            E2(getString(i2, new Object[]{getString(R.string.device_watch), getString(i3)}), getString(i3));
            I0(StatEvent.BIND_CHAOHU_ERROR, "OtherError");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y1() {
        this.T.stopBind();
        finish();
    }

    private void Y2() {
        ImageView imageView = this.z;
        if (imageView == null) {
            ImageView imageView2 = new ImageView(this);
            this.z = imageView2;
            if (this.R == 28) {
                imageView2.setImageResource(R.drawable.private_haydn_placeholder_img);
            } else {
                imageView2.setImageResource(R.drawable.img_bind_headset_guide);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.y.getLayoutParams());
            layoutParams.gravity = 17;
            ((FrameLayout) findViewById(R.id.container)).addView(this.z, layoutParams);
        } else {
            imageView.setVisibility(0);
        }
        if (this.A == null) {
            AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.anim_headset_bind_searching);
            this.A = animatorSet;
            animatorSet.setTarget(this.z);
            this.A.addListener(new c());
        }
        this.A.start();
    }

    private void Z0(HMBindBaseLogic.BindError bindError) {
        int i = d.a[bindError.ordinal()];
        if (i == 2) {
            J2(R.string.bind_weight_bfs_not_found_tips);
            I0(StatEvent.BIND_SCALE_ERROR, StatEvent.BIND_ERROR_NOT_FIND);
        } else if (i != 5) {
            J2(R.string.bind_failed_scale_help);
            I0(StatEvent.BIND_SCALE_ERROR, "OtherError");
        } else {
            S2(getString(R.string.bind_failed_net_error));
            I0(StatEvent.BIND_SCALE_ERROR, "OtherError");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z1() {
        HMDeviceHelperActivity.show(this, 1, 2);
    }

    private void Z2() {
        this.x.setVisibility(0);
        this.x.startLoading();
    }

    private void a1() {
        if (this.X == null) {
            return;
        }
        NetWorkBluetoothLifeComponent netWorkBluetoothLifeComponent = new NetWorkBluetoothLifeComponent(this, this.q0, this.R);
        final HeadSetConnectHelp headSetConnectHelp = new HeadSetConnectHelp(DeviceXFunctionsKt.getContext());
        PairedDeviceViewModel pairedDeviceViewModel = (PairedDeviceViewModel) new ViewModelProvider(this).get(PairedDeviceViewModel.class);
        this.v0 = pairedDeviceViewModel;
        pairedDeviceViewModel.setSource(this.q0);
        this.v0.getBoundDeviceListLiveData().observe(this, new Observer() { // from class: am2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.i1((List) obj);
            }
        });
        this.v0.getBoundPairedDevice();
        this.v0.getDeviceListLiveData().observe(this, new Observer() { // from class: bm2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.k1(headSetConnectHelp, (List) obj);
            }
        });
        getLifecycle().addObserver(netWorkBluetoothLifeComponent);
        this.v0.load();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a2(BluetoothDevice bluetoothDevice, DialogInterface dialogInterface, int i) {
        this.T.bind(bluetoothDevice);
        L2(true);
    }

    private void a3() {
        switch (this.R) {
            case 0:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 18:
            case 19:
            case 21:
            case 22:
            case 23:
            case 26:
            case 27:
                HMBindMiLiLogic hMBindMiLiLogic = this.S;
                if (hMBindMiLiLogic != null) {
                    hMBindMiLiLogic.stopBind();
                    this.S = null;
                }
                BleScanCenter.getInstance().setContinuousScan(false);
                return;
            case 1:
                HMBindWeightLogic hMBindWeightLogic = this.T;
                if (hMBindWeightLogic != null) {
                    hMBindWeightLogic.stopBind();
                    this.T = null;
                    return;
                }
                return;
            case 2:
                HMBindShoesLogic hMBindShoesLogic = this.U;
                if (hMBindShoesLogic != null) {
                    hMBindShoesLogic.stopBind();
                    this.U = null;
                }
                BleScanCenter.getInstance().setContinuousScan(false);
                return;
            case 3:
                HMBindNormandyLogic hMBindNormandyLogic = this.V;
                if (hMBindNormandyLogic != null) {
                    hMBindNormandyLogic.stopBind();
                    this.V = null;
                    return;
                }
                return;
            case 25:
                HmBindEarbudLogic hmBindEarbudLogic = this.W;
                if (hmBindEarbudLogic != null) {
                    hmBindEarbudLogic.stopBind();
                    this.W = null;
                }
                break;
        }
        HMBindBaseLogic hMBindBaseLogic = this.X;
        if (hMBindBaseLogic == null) {
            return;
        }
        hMBindBaseLogic.stopBind();
        this.X = null;
    }

    private void b1() {
        ((BindSingleHeadsetViewModel) new ViewModelProvider(this).get(BindSingleHeadsetViewModel.class)).getBindLiveData().observe(this, new Observer() { // from class: zl2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.l1((Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b2(DialogInterface dialogInterface, int i) {
        I0(StatEvent.BIND_SCALE_ERROR, StatEvent.BIND_SCALE_ERROR_NOT_MINE);
        this.x.startLoading();
        this.T.reSearch();
    }

    private void b3() {
        ImageView imageView = this.z;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }

    private void c1() {
        this.x = (HMLoadingView) findViewById(R.id.loading_view);
        this.y = (ImageView) findViewById(R.id.device_img);
        this.B = (ImageView) findViewById(R.id.vibrate_img);
        this.C = (TextView) findViewById(R.id.bottom_tv);
        this.D = (TextView) findViewById(R.id.cancel_tv);
        this.E = (TextView) findViewById(R.id.title_tv);
        this.F = (TextView) findViewById(R.id.sub_title_tv);
        this.K = findViewById(R.id.ll_bottom);
        this.L = (TextView) findViewById(R.id.tv_bottom_left);
        this.M = (TextView) findViewById(R.id.tv_bottom_right);
        this.D.setOnClickListener(new View.OnClickListener() { // from class: vl2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.m1(view);
            }
        });
        this.N = (FrameLayout) findViewById(R.id.introduce_fragment);
        if (this.R == 3) {
            this.C.setText(getString(R.string.normandy_not_light, new Object[]{getString(R.string.chip_device_name)}));
        } else if (E0.getValue().isBindingWatch(this.R)) {
            this.C.setText(R.string.bind_chaohu_not_shake);
        }
        this.C.setOnClickListener(new View.OnClickListener() { // from class: rl2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.n1(view);
            }
        });
        this.G = (RelativeLayout) findViewById(R.id.bind_weight_rl);
        this.H = (TextView) findViewById(R.id.bind_weight_value);
        this.I = (TextView) findViewById(R.id.bind_weight_value_unit);
        this.J = (EarbudImageView) findViewById(R.id.earbud_device_img);
        if (this.R == 28) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.E.getLayoutParams();
            layoutParams.topMargin = (int) BaseTitleActivity.dp2px(this, 11.0f);
            this.E.setLayoutParams(layoutParams);
            this.E.setTextSize(17.0f);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.F.getLayoutParams();
            layoutParams2.topMargin = (int) BaseTitleActivity.dp2px(this, 6.0f);
            this.F.setLayoutParams(layoutParams2);
            ViewStub viewStub = (ViewStub) findViewById(R.id.viewstub_bind_headset);
            if (viewStub != null) {
                View viewInflate = viewStub.inflate();
                this.P = (ImageView) viewInflate.findViewById(R.id.bind_headset_search_image);
                this.Q = (TextView) viewInflate.findViewById(R.id.bind_headset_search_hint_text);
                ImageLoadExtentionsKt.loadWithProcess(this.P, new Function1() { // from class: on2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return this.a.o1((DisplayConfig.ConfigBuilder) obj);
                    }
                });
            }
        }
    }

    private void c3() {
        this.x.stopLoading();
        this.x.setVisibility(8);
    }

    private boolean d1() {
        HMDeviceSource hMDeviceSource = this.s0;
        return hMDeviceSource == HMDeviceSource.MILI_WUHAN || hMDeviceSource == HMDeviceSource.MILI_CHONGQING;
    }

    private void d3() {
        this.x.setVisibility(8);
        this.D.setVisibility(8);
        this.K.setVisibility(8);
        this.L.setVisibility(8);
        this.M.setVisibility(8);
        HMDeviceSource hMDeviceSource = this.q0;
        HMDeviceSource hMDeviceSource2 = HMDeviceSource.OTHER_LULLABY;
        int i = hMDeviceSource == hMDeviceSource2 ? R.string.title_start_bind : R.string.headset_bind_title_open_box;
        int i2 = hMDeviceSource == hMDeviceSource2 ? R.string.headset_lullbay_bind_light_msg : R.string.bind_headset_subhead_title;
        this.E.setText(i);
        this.F.setTextSize(0, getResources().getDimension(R.dimen.logout_title_text_size));
        this.F.setText(i2);
        this.y.setImageResource(R.drawable.private_haydn_img_bind_headset_searching);
        ImageLoadExtentionsKt.loadWithProcess(this.P, new Function1() { // from class: pn2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.a.l2((DisplayConfig.ConfigBuilder) obj);
            }
        });
        this.Q.setText(R.string.bind_headset_search_loaind_text);
        Y2();
    }

    private void dismissDialog() {
        LoadingDialog loadingDialog = this.O;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.O.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit e1() {
        u2();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e2(DialogInterface dialogInterface) {
        HMLog.i(C0, "failDlgDismiss: " + this.w0, new Object[0]);
        this.w0 = false;
    }

    private void e3() {
        if (this.R == 28) {
            d3();
            return;
        }
        Z2();
        this.D.setVisibility(0);
        this.K.setVisibility(8);
        this.L.setVisibility(8);
        this.M.setVisibility(8);
        this.E.setText(R.string.normandy_searching);
        this.F.setTextSize(0, getResources().getDimension(R.dimen.logout_title_text_size));
        this.F.setText(R.string.bind_headset_tips_search_msg);
        this.y.setImageResource(R.drawable.img_bind_headset_searching);
        this.D.setText(R.string.not_bind_now);
        Y2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object f1() throws Exception {
        HMBindBaseLogic hMBindBaseLogic = this.X;
        if (!(hMBindBaseLogic instanceof HMBindHeadsetLogic)) {
            return null;
        }
        ((HMBindHeadsetLogic) hMBindBaseLogic).doBind();
        return null;
    }

    private void f3(@NonNull final Runnable runnable) {
        if (this.n0 == null) {
            this.n0 = new BottomSheetDialog(this, R.style.CustomBottomSheetDialogTheme);
            View viewInflate = LayoutInflater.from(this).inflate(R.layout.bind_headset_search_result, (ViewGroup) null, false);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            TextView textView = (TextView) viewInflate.findViewById(R.id.bind_headset_search_device_name);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.bind_headset_device_search_image);
            ((ImageButton) viewInflate.findViewById(R.id.bind_headset_device_cancel)).setOnClickListener(new View.OnClickListener() { // from class: ql2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.m2(view);
                }
            });
            textView.setText(ConfigHelperKt.getDeviceDesc(this.q0));
            imageView.setImageResource(ConfigHelperKt.getDeviceIcon(this.q0));
            this.n0.setContentView(viewInflate, layoutParams);
            this.n0.setCancelable(false);
        }
        Button button = (Button) this.n0.getDelegate().findViewById(R.id.bind_headset_device_sure);
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: wl2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.n2(runnable, view);
                }
            });
        }
        if (isFinishing() || this.n0.isShowing()) {
            return;
        }
        this.n0.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g1() {
        return "nickName null!";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g2(boolean z, DialogInterface dialogInterface, int i) {
        if (!z) {
            startActivity(new Intent(this, (Class<?>) HMUnifySelectDeviceActivity.class));
        }
        finish();
    }

    private void g3(String str, String str2, @DrawableRes int i, String str3, @NonNull final Runnable runnable) {
        this.E.setText(str);
        this.F.setText(str2);
        this.y.setImageResource(i);
        this.D.setVisibility(8);
        this.K.setVisibility(0);
        this.L.setVisibility(0);
        this.M.setVisibility(0);
        this.L.setText(R.string.not_bind_now);
        this.L.setOnClickListener(new View.OnClickListener() { // from class: pl2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.o2(view);
            }
        });
        this.M.setText(str3);
        this.M.setOnClickListener(new View.OnClickListener() { // from class: xl2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                runnable.run();
            }
        });
    }

    public static int getBindType(@NonNull HMDeviceType hMDeviceType) {
        return E0.getValue().getBindType(hMDeviceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h1(HMBindBaseLogic.BindError bindError) {
        if (bindError == HMBindBaseLogic.BindError.UNKNOW_DEVICE_TYPE || bindError == HMBindBaseLogic.BindError.NULL_DEVICE_NAME || bindError == HMBindBaseLogic.BindError.DISCONNECTED) {
            this.Y = null;
        }
        t2();
        u2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h2(boolean z) {
        return "showStopDlg, app foreground: " + z;
    }

    private void h3() {
        this.F.setVisibility(0);
        l3();
        this.D.setVisibility(0);
        this.C.setVisibility(8);
        findViewById(R.id.blue_monkey_vibrate_rl).setVisibility(8);
        this.x.setVisibility(0);
        this.x.startLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i1(List list) {
        HMBindBaseLogic hMBindBaseLogic = this.X;
        if (hMBindBaseLogic instanceof HMBindHeadsetLogic) {
            ((HMBindHeadsetLogic) hMBindBaseLogic).setPairedDevice(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i2(DialogInterface dialogInterface, int i) {
        if (NetUtil.isNetworkConnected(this)) {
            EventBus.getDefault().post(new BindIntroEvent(BindIntroStatus.STOP_START, true));
            return;
        }
        HMSwitchDeviceActivity.destroyDevice(getStartDevice(), HMBindBaseLogic.getBleDevice());
        IconToast.showError(this, getString(R.string.no_network_connection));
        EventBus.getDefault().post(new BindIntroEvent(BindIntroStatus.RECOVER_OVER, false));
    }

    private void i3() {
        this.F.setVisibility(0);
        l3();
        this.D.setVisibility(0);
        this.C.setVisibility(8);
        this.x.setVisibility(0);
        this.x.startLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit j1(HeadSetConnectHelp headSetConnectHelp, BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice != null) {
            headSetConnectHelp.connectHeadset(bluetoothDevice);
            ((HMBindHeadsetLogic) this.X).onBoundedDeviceBind(this.A0, bluetoothDevice);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j2(DialogInterface dialogInterface, int i) {
        K0();
    }

    private void j3() {
        l3();
        this.x.setVisibility(0);
        this.x.startLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k1(final HeadSetConnectHelp headSetConnectHelp, List list) {
        if (list == null || list.isEmpty()) {
            this.X.startBind(this.A0);
        } else {
            headSetConnectHelp.findFirstDevice(list, new Function1() { // from class: qn2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return this.a.j1(headSetConnectHelp, (BluetoothDevice) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String k2(Exception exc) {
        return "create UserInfo fail: " + exc;
    }

    private void k3() {
        this.F.setVisibility(0);
        l3();
        this.D.setVisibility(0);
        this.C.setVisibility(8);
        this.B.setVisibility(8);
        findViewById(R.id.accept_img).setVisibility(8);
        this.x.setVisibility(0);
        this.x.startLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l1(Boolean bool) {
        this.Z = bool.booleanValue();
        J0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit l2(DisplayConfig.ConfigBuilder configBuilder) {
        configBuilder.load(R.drawable.gif_headset_search_loading).diskCacheStrategy(DisplayConfig.ConfigBuilder.DiskCacheStrategy.ALL).crossFade().centerCrop().into(this.P);
        return null;
    }

    private void l3() {
        if (GlobalConfig.get().isBuildMidong()) {
            int color = ContextCompat.getColor(this, R.color.p4);
            this.x.setStartColor(color);
            this.x.setProgressColor(color);
            this.x.setEndColor(ContextCompat.getColor(this, R.color.trans));
        }
        switch (this.R) {
            case 0:
                this.E.setText(this.p0 == null ? R.string.bind_mili_search_title : R.string.bind_mili_connecting);
                this.F.setText(R.string.bind_mili_search_tips);
                this.y.setImageResource(R.drawable.img_miband);
                break;
            case 1:
                this.E.setText(R.string.bind_weight_search_title);
                this.F.setText(R.string.bind_weight_search_tips);
                this.F.setVisibility(0);
                this.G.setVisibility(0);
                this.x.setStyle(1);
                break;
            case 2:
                this.E.setText(R.string.bind_shoes_search_title);
                this.F.setText(getString(R.string.bind_shoes_search_tips, new Object[]{getString(R.string.chip_device_name)}));
                this.y.setImageResource(R.drawable.img_h_mchip);
                break;
            case 3:
                this.E.setText(R.string.normandy_searching);
                this.F.setTextSize(0, getResources().getDimension(R.dimen.logout_title_text_size));
                this.F.setText(getString(R.string.normandy_searching_tips, new Object[]{getString(R.string.chip_device_name)}));
                this.y.setImageResource(R.drawable.img_h_mchip);
                break;
            case 6:
                this.E.setText(R.string.normandy_searching);
                this.F.setTextSize(0, getResources().getDimension(R.dimen.logout_title_text_size));
                this.F.setText(R.string.blue_monkey_bind_tips);
                this.y.setImageResource(R.drawable.img_blue_monkey);
                break;
            case 7:
            case 8:
            case 10:
            case 26:
                w2();
                break;
            case 11:
            case 12:
            case 19:
            case 21:
            case 22:
            case 23:
            case 27:
                if (this.p0 != null) {
                    v2();
                } else {
                    w2();
                }
                break;
            case 18:
                this.E.setText(R.string.normandy_searching);
                this.F.setTextSize(0, getResources().getDimension(R.dimen.logout_title_text_size));
                this.F.setText(R.string.bolt_bind_tips);
                this.y.setImageResource(R.drawable.treadmill_search);
                this.D.setText(R.string.bind_not_right_now);
                break;
            case 20:
            case 28:
                e3();
                break;
            case 25:
                this.D.setText(R.string.bind_not_right_now);
                this.E.setText(R.string.normandy_searching);
                this.F.setTextSize(0, getResources().getDimension(R.dimen.logout_title_text_size));
                this.F.setText(R.string.bind_earbud_start_tip);
                this.y.setVisibility(8);
                this.J.setVisibility(0);
                this.J.setLeftConnect(false);
                this.J.setRightConnect(false);
                break;
        }
        int i = this.R;
        if (i != 20 && i != 28) {
            this.x.startLoading();
        }
        if (this.R == 28) {
            BaseTitleBarExtKt.setTitleBar(this, "", null, R.color.s36, BaseTitleActivity.STYLE.SINGLE_BACK);
        } else {
            BaseTitleBarExtKt.setTitleBar(this, "", null, R.color.s36, BaseTitleActivity.STYLE.NONE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m1(View view) {
        HMBindMiLiLogic hMBindMiLiLogic = this.S;
        if (hMBindMiLiLogic != null) {
            hMBindMiLiLogic.analytic(new CancelBind("normal"));
            this.S.stopBind();
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m2(View view) {
        this.n0.dismiss();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n1(View view) {
        HMBindMiLiLogic hMBindMiLiLogic = this.S;
        if (hMBindMiLiLogic != null) {
            hMBindMiLiLogic.analytic(new CancelBind(ConstantKt.CANCEL_REASON_NOT_SHAKE));
        }
        if (this.R == 0 || E0.getValue().isBindingWatch(this.R)) {
            this.S.stopBind();
            V2();
            return;
        }
        int i = this.R;
        if (i == 3) {
            this.V.stopBind();
            U2();
        } else if (i == 6) {
            N2();
        } else if (i == 18) {
            i3();
            this.S.stopBind();
            this.S.startBind(this, this.p0, this.q0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n2(Runnable runnable, View view) {
        runnable.run();
        this.n0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit o1(DisplayConfig.ConfigBuilder configBuilder) {
        configBuilder.load(R.drawable.gif_headset_search_loading).diskCacheStrategy(DisplayConfig.ConfigBuilder.DiskCacheStrategy.ALL).crossFade().centerCrop().into(this.P);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o2(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p1() {
        EventBus.getDefault().post(new BindIntroEvent(BindIntroStatus.CHOOSE_RECOVER, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q2(@NotNull final BluetoothDevice bluetoothDevice) {
        if (this.R != 20) {
            b3();
            f3(new Runnable() { // from class: wm2
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.r1(bluetoothDevice);
                }
            });
        } else {
            c3();
            b3();
            g3(getString(R.string.bind_headset_tips_find_device, new Object[]{getString(R.string.headset_mozart)}), getString(R.string.bind_headset_tips_find_device_msg), R.drawable.img_mozart, getString(R.string.confirm), new Runnable() { // from class: xm2
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.q1(bluetoothDevice);
                }
            });
        }
    }

    private void r2(final Device device) {
        final LoadingDialog loadingDialogShowDialog;
        if (this.m0) {
            loadingDialogShowDialog = LoadingDialog.showDialog(this);
            loadingDialogShowDialog.setSuccess(getString(R.string.device_bind_success));
            loadingDialogShowDialog.setCancelable(false);
        } else {
            loadingDialogShowDialog = null;
        }
        this.E.postDelayed(new Runnable() { // from class: cn2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.s1(loadingDialogShowDialog, device);
            }
        }, this.m0 ? 1500L : 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s1(LoadingDialog loadingDialog, Device device) {
        if (isDestroyed()) {
            return;
        }
        if (loadingDialog != null && this.m0 && loadingDialog.isShowing()) {
            loadingDialog.dismiss();
        }
        finish();
        E0.getValue().goNext(this, device, true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void r1(@NotNull final BluetoothDevice bluetoothDevice) {
        final Device boundDevice = HMDeviceManager.getInstance().getBoundDevice(bluetoothDevice, HMDeviceType.HEADSET);
        if (boundDevice != null && boundDevice.getActiveStatus().intValue() != 1) {
            boundDevice.setActiveStatus(1);
            HMDeviceManager.getInstance().updateDevice(boundDevice);
        }
        Runnable runnable = new Runnable() { // from class: en2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.t1(boundDevice, bluetoothDevice);
            }
        };
        if (bluetoothDevice.getBondState() == 12) {
            runnable.run();
            return;
        }
        final LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this);
        loadingDialogShowDialog.setMessage(getResources().getString(R.string.wait));
        loadingDialogShowDialog.setCancelable(false);
        Runnable runnable2 = new Runnable() { // from class: cm2
            @Override // java.lang.Runnable
            public final void run() {
                HMBindDeviceActivity.u1(loadingDialogShowDialog);
            }
        };
        Runnable runnable3 = new Runnable() { // from class: bn2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.x1(bluetoothDevice, boundDevice);
            }
        };
        b bVar = new b(bluetoothDevice, runnable2, runnable3, runnable);
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.PAIRING_REQUEST");
        if (!bluetoothDevice.createBond()) {
            runnable3.run();
        } else {
            registerReceiver(bVar, intentFilter);
            loadingDialogShowDialog.show();
        }
    }

    public static void startBind(@NonNull Context context, @NonNull HMDeviceType hMDeviceType) {
        Intent intent = new Intent(context, (Class<?>) HMBindDeviceActivity.class);
        intent.putExtra("bind_type", getBindType(hMDeviceType));
        context.startActivity(intent);
    }

    public static void startBindEarbud(Context context) {
        Intent intent = new Intent(context, (Class<?>) HMBindDeviceActivity.class);
        intent.putExtra("bind_type", 25);
        context.startActivity(intent);
    }

    public static void startBindHeadSet(Context context) {
        Intent intent = new Intent(context, (Class<?>) HMBindDeviceActivity.class);
        intent.putExtra("bind_type", 20);
        context.startActivity(intent);
    }

    public static void startBindHeadSetNew(Context context, HMDeviceSource hMDeviceSource) {
        Intent intent = new Intent(context, (Class<?>) HMBindDeviceActivity.class);
        intent.putExtra("bind_type", 28);
        intent.putExtra("bind_device_source", hMDeviceSource);
        context.startActivity(intent);
    }

    public static void startBindMiLi(Context context, BluetoothDevice bluetoothDevice) {
        Intent intent = new Intent(context, (Class<?>) HMBindDeviceActivity.class);
        intent.putExtra("bind_type", 0);
        intent.putExtra("bind_device", bluetoothDevice);
        context.startActivity(intent);
    }

    public static void startBindNormandy(Context context, HMBrandType hMBrandType) {
        Intent intent = new Intent(context, (Class<?>) HMBindDeviceActivity.class);
        intent.putExtra("bind_type", 3);
        intent.putExtra("bind_brand_type", hMBrandType.getValue());
        context.startActivity(intent);
    }

    public static void startBindShoes(Context context) {
        context.startActivity(new Intent(context, (Class<?>) HMCaptureShoesActivity.class));
    }

    public static void startBindWatch(Context context, BluetoothDevice bluetoothDevice, int i) {
        Intent intent = new Intent(context, (Class<?>) HMBindDeviceActivity.class);
        intent.putExtra("bind_type", i);
        if (bluetoothDevice != null) {
            intent.putExtra("bind_device", bluetoothDevice);
        }
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t1(Device device, BluetoothDevice bluetoothDevice) {
        if (device != null) {
            r2(device);
            return;
        }
        this.Y = bluetoothDevice;
        this.Z = false;
        HMDeviceSource deviceSource = ((HMBindHeadsetLogic) this.X).getDeviceSource(bluetoothDevice.getName());
        if (HMDeviceSource.OTHER_HAYDN == deviceSource || HMDeviceSource.OTHER_LULLABY == deviceSource) {
            this.m0 = false;
            M2(true, R.string.wait);
        } else {
            L2(true);
        }
        ((HMBindHeadsetLogic) this.X).bind(bluetoothDevice);
    }

    private void t2() {
        Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag(D0);
        if (fragmentFindFragmentByTag == null) {
            return;
        }
        BaseTitleBarExtKt.setTitleBar(this, "", null, R.color.s36, BaseTitleActivity.STYLE.NONE);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.remove(fragmentFindFragmentByTag);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u1(LoadingDialog loadingDialog) {
        if (loadingDialog.isShowing()) {
            loadingDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u2() {
        if (this.Y != null) {
            r1(BluetoothAdapter.getDefaultAdapter().getRemoteDevice(this.Y.getAddress()));
            return;
        }
        e3();
        this.Z = false;
        ((HMBindHeadsetLogic) this.X).retry(this.A0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v1(BluetoothDevice bluetoothDevice) {
        r1(BluetoothAdapter.getDefaultAdapter().getRemoteDevice(bluetoothDevice.getAddress()));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    private void v2() {
        int iM0;
        this.E.setText(R.string.bind_shoes_search_title);
        this.F.setText(R.string.bind_chaohu_search_tips);
        int i = this.R;
        if (i == 11) {
            iM0 = M0(this.p0);
        } else if (i == 12) {
            iM0 = R.drawable.img_midong_watch_lite;
        } else if (i == 21 || i == 23) {
            iM0 = R.drawable.img_venice;
        } else if (i != 27) {
            iM0 = R.drawable.img_amazfitwatch;
        } else {
            iM0 = M0(this.p0);
        }
        this.y.setImageDrawable(ContextCompat.getDrawable(this, iM0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w1(BluetoothDevice bluetoothDevice, Device device) {
        HMDeviceSource deviceSource;
        HMBindBaseLogic hMBindBaseLogic = this.X;
        if ((hMBindBaseLogic instanceof HMBindHeadsetLogic) && (deviceSource = ((HMBindHeadsetLogic) hMBindBaseLogic).getDeviceSource(bluetoothDevice.getName())) != null && ConfigHelperKt.hasFeature(deviceSource, Feature.BOUND_REFUSE_RETRY)) {
            if (device != null) {
                HMDeviceManager.getInstance().unbindDevice(device);
            }
            finish();
        }
    }

    private void w2() {
        this.E.setText(this.p0 == null ? R.string.bind_mili_search_title : R.string.bind_mili_connecting);
        this.F.setText(R.string.bind_chaohu_search_tips);
        int i = this.R;
        if (i == 8 || i == 11 || i == 19 || i == 22) {
            this.y.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.img_amazfitwatch));
            return;
        }
        if (i == 26) {
            this.y.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.tokyo_img_miband_tokyo));
        } else if (i == 21 || i == 23) {
            this.y.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.img_venice));
        } else {
            this.y.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.img_midong_watch_lite));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x1(final BluetoothDevice bluetoothDevice, final Device device) {
        P2(getString(R.string.bind_headset_tips_pair_failed), R.string.retry, new Runnable() { // from class: ym2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.v1(bluetoothDevice);
            }
        }, R.string.cancel, new Runnable() { // from class: an2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.w1(bluetoothDevice, device);
            }
        });
    }

    private void x2(int i) {
        this.x.stopLoading();
        AlertDialogFragment alertDialogFragment = this.o0;
        if (alertDialogFragment == null || !alertDialogFragment.isShowing()) {
            boolean z = i == R.string.blue_monkey_bind_fail_no_device || i == R.string.blue_monkey_bind_fail_close_to_phone;
            String string = z ? getString(i, new Object[]{getString(R.string.bind_get_help)}) : getString(i);
            AlertDialogFragment.Builder neutralButton = (i == R.string.bind_device_has_bound || i == R.string.bind_failed_net_error) ? new AlertDialogFragment.Builder(this).setNeutralButton(R.string.gotit, new DialogInterface.OnClickListener() { // from class: om2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.a.y1(dialogInterface, i2);
                }
            }) : new AlertDialogFragment.Builder(this).setPositiveButton(R.string.bind_try_again, new DialogInterface.OnClickListener() { // from class: hl2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.a.z1(dialogInterface, i2);
                }
            }).setNegativeButton(R.string.not_bind_now, new DialogInterface.OnClickListener() { // from class: un2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.a.A1(dialogInterface, i2);
                }
            });
            if (!TextUtils.isEmpty(string)) {
                neutralButton.setMessage(string);
            }
            if (z) {
                neutralButton.setLink(getString(R.string.bind_get_help), new View.OnClickListener() { // from class: tl2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.B1(view);
                    }
                });
            }
            if (isFinishing() || isDestroyed()) {
                return;
            }
            AlertDialogFragment alertDialogFragmentCreate = neutralButton.create();
            this.o0 = alertDialogFragmentCreate;
            alertDialogFragmentCreate.show(getSupportFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y1(DialogInterface dialogInterface, int i) {
        startActivity(new Intent(this, (Class<?>) HMUnifySelectDeviceActivity.class));
        finish();
    }

    private void y2(int i) {
        this.x.stopLoading();
        AlertDialogFragment alertDialogFragment = this.o0;
        if (alertDialogFragment == null || !alertDialogFragment.isShowing()) {
            boolean z = i == R.string.bolt_bind_fail_no_device || i == R.string.bolt_bind_fail_close_to_phone;
            String string = z ? getString(i, new Object[]{getString(R.string.bind_get_help)}) : getString(i);
            AlertDialogFragment.Builder neutralButton = (i == R.string.bind_device_has_bound || i == R.string.bind_failed_net_error || i == R.string.bolt_using_by_other_guy || i == R.string.bolt_sport_on_going) ? new AlertDialogFragment.Builder(this).setNeutralButton(R.string.gotit, new DialogInterface.OnClickListener() { // from class: dm2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.a.C1(dialogInterface, i2);
                }
            }) : new AlertDialogFragment.Builder(this).setPositiveButton(R.string.bind_try_again, new DialogInterface.OnClickListener() { // from class: jl2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.a.D1(dialogInterface, i2);
                }
            }).setNegativeButton(R.string.not_bind_now, new DialogInterface.OnClickListener() { // from class: sl2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.a.E1(dialogInterface, i2);
                }
            });
            if (!TextUtils.isEmpty(string)) {
                neutralButton.setMessage(string);
            }
            if (z) {
                neutralButton.setLink(getString(R.string.bind_get_help), new View.OnClickListener() { // from class: ul2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.F1(view);
                    }
                });
            }
            if (isFinishing() || isDestroyed()) {
                return;
            }
            AlertDialogFragment alertDialogFragmentCreate = neutralButton.create();
            this.o0 = alertDialogFragmentCreate;
            alertDialogFragmentCreate.show(getSupportFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z1(DialogInterface dialogInterface, int i) {
        this.S.stopBind();
        h3();
        this.S.improve();
        this.S.startBind(this, this.p0, this.q0);
    }

    private void z2(String str, String str2) {
        R2(str, str2, new Runnable() { // from class: nm2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.G1();
            }
        }, new Runnable() { // from class: jm2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.H1();
            }
        }, new Runnable() { // from class: mm2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.I1();
            }
        });
    }

    public Device getStartDevice() {
        return this.B0;
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getSupportFragmentManager().findFragmentByTag(D0) != null) {
            finish();
        }
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindMiLiLogic.IBindMiliListener
    public void onBindDenied() {
        D2();
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic.IBindListener
    public void onBindFailure(HMBindBaseLogic.BindError bindError, HMDeviceType hMDeviceType) {
        HMLog.d(C0, "onBindFailure:" + bindError + "," + hMDeviceType, new Object[0]);
        L2(false);
        B2(bindError, this.R);
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindMiLiLogic.IBindMiliListener
    public void onBindMiLiKnock(HMDeviceSource hMDeviceSource) {
        this.D.setVisibility(8);
        this.x.stopLoading();
        this.x.setVisibility(8);
        this.B.setVisibility(0);
        this.C.setVisibility(0);
        if (E0.getValue().isBindingWatch(this.R)) {
            Integer bindingHintTitle = ConfigHelperKt.getBindingHintTitle(hMDeviceSource);
            this.E.setText(getString(bindingHintTitle == null ? R.string.bind_chaohu_found_title : bindingHintTitle.intValue()));
            this.B.setVisibility(8);
            ImageView imageView = (ImageView) findViewById(R.id.accept_img);
            if (this.R == 26) {
                int[] iArr = new int[2];
                this.y.getLocationInWindow(iArr);
                imageView.setImageResource(R.drawable.tokyo_img_miband_tokyo_select);
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    layoutParams2.topMargin = iArr[1] - ((int) BaseTitleActivity.dp2px(this, 43.0f));
                    layoutParams2.setMarginStart(iArr[0] - ((int) BaseTitleActivity.dp2px(this, 20.0f)));
                }
                imageView.setLayoutParams(layoutParams);
            }
            imageView.setVisibility(0);
            this.F.setVisibility(8);
            return;
        }
        if (HMDeviceConfig.hasFeatureBandConfirmOnScreen(hMDeviceSource)) {
            this.E.setText(getString(R.string.bind_mili_found_title_tempo));
            this.C.setText(R.string.bind_mili_found_not_shake);
            this.F.setVisibility(8);
            this.B.setVisibility(8);
            findViewById(R.id.accept_img).setVisibility(0);
            return;
        }
        if (ConfigHelperKt.hasFeature(hMDeviceSource, Feature.BOLT_SERIES)) {
            S0();
            return;
        }
        if (hMDeviceSource == HMDeviceSource.OTHER_BM) {
            Q0();
        } else if (HMDeviceConfig.hasFeaturePro(hMDeviceSource)) {
            this.E.setText(getString(R.string.bind_mili_found_title_pro_click));
            this.F.setText(getString(R.string.bind_mili_found_tips_pro));
        } else {
            this.E.setText(getString(R.string.bind_mili_found_title));
            this.F.setText(getString(R.string.bind_mili_found_tips));
        }
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindMiLiLogic.IBindMiliListener
    public void onBindMiLiKnockSuccess(HMDeviceSource hMDeviceSource) {
        if (!BindIntroExtendsKt.supportBindIntro(hMDeviceSource)) {
            L2(true);
            return;
        }
        this.t0 = hMDeviceSource;
        this.N.setVisibility(0);
        this.u0 = BindIntroduceMainFragment.newInstance(this.t0);
        getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_in, R.anim.slide_out).replace(R.id.introduce_fragment, this.u0).commitAllowingStateLoss();
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindNormandyLogic.IBindNormandyListener
    public void onBindNormandyKnock() {
        this.D.setVisibility(8);
        this.C.setVisibility(0);
        this.B.setVisibility(8);
        findViewById(R.id.accept_img).setVisibility(8);
        findViewById(R.id.normandy_left_img).setVisibility(0);
        findViewById(R.id.normandy_right_img).setVisibility(0);
        this.y.setImageResource(R.drawable.img_midong_chip_2);
        this.x.stopLoading();
        TextView textView = this.E;
        int i = R.string.normandy_found_title;
        int i2 = R.string.chip_device_name;
        textView.setText(getString(i, new Object[]{getString(i2)}));
        this.F.setText(getString(R.string.normandy_found_tips, new Object[]{getString(i2)}));
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindNormandyLogic.IBindNormandyListener
    public void onBindNormandyKnockSuccess() {
        L2(true);
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindBaseLogic.IBindListener
    public void onBindSuccess(HMBaseDevice hMBaseDevice, Device device) {
        if (!BindIntroExtendsKt.supportBindIntro(this.t0)) {
            if (this.K.getVisibility() == 0) {
                this.K.setVisibility(4);
            }
            L2(false);
            I2(device);
            return;
        }
        BindIntroduceMainFragment bindIntroduceMainFragment = this.u0;
        if (bindIntroduceMainFragment != null) {
            bindIntroduceMainFragment.setWorking(true);
        }
        if (!BindIntroExtendsKt.isActive(device)) {
            this.B0 = device;
            W2(this.t0);
            return;
        }
        EventBus.getDefault().post(new BindIntroEvent(BindIntroStatus.BIND_SUCCESS, true));
        HMDeviceManager.getInstance().bindDevice(HMBindBaseLogic.getBleDevice(), device);
        EventBus.getDefault().postSticky(new HMDeviceBindEvent(true, HMDeviceType.fromValue(device.getDevice_type().intValue())));
        this.E.postDelayed(new Runnable() { // from class: hn2
            @Override // java.lang.Runnable
            public final void run() {
                HMBindDeviceActivity.p1();
            }
        }, 1500L);
    }

    @Override // com.xiaomi.hm.health.device.bind.HMBindWeightLogic.IBindWeightListener
    public void onBindWeigthValue(AdvData advData, boolean z) {
        BluetoothDevice bluetoothDevice = advData.device;
        boolean zIsMatchUUID = advData.isMatchUUID(WeightBfsProfile.UUID_SERVICE_BODY_COMPOSITION_SERVICE);
        float value = advData.weightData.getValue();
        int type = advData.weightData.getType();
        boolean zIsStable = advData.weightData.isStable();
        boolean zIsFinish = advData.weightData.isFinish();
        boolean zIsOverload = advData.weightData.isOverload();
        HMLog.d(C0, "isBfs:" + zIsMatchUUID + ",onWeigthValue:" + value + ",stable:" + zIsStable + ",only:" + z + ",isOverload:" + zIsOverload, new Object[0]);
        String weightUnitString = UnitManager.getInstance().getWeightUnitString(type);
        if (zIsOverload) {
            this.H.setText(R.string.bind_weight_overload_sym);
            this.I.setText("");
            K2(getString(R.string.bind_weight_overload, new Object[]{((int) WeightAdvData.getMax(type, advData.weightData.isAmazfitScale())) + weightUnitString}), null);
            return;
        }
        String weightValueStringForDisplay = HMWeightUtils.getWeightValueStringForDisplay(HMWeightUtils.convertToKg(value, type), type);
        this.H.setText(weightValueStringForDisplay);
        this.I.setText(weightUnitString);
        if (!zIsStable || zIsFinish) {
            return;
        }
        if (!z) {
            O2(bluetoothDevice, zIsMatchUUID, weightValueStringForDisplay, weightUnitString);
        } else {
            this.T.bind(bluetoothDevice);
            L2(true);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_bind_mili);
        Intent intent = getIntent();
        if (intent != null) {
            this.R = intent.getIntExtra("bind_type", 1);
            this.p0 = (BluetoothDevice) intent.getParcelableExtra("bind_device");
            this.q0 = (HMDeviceSource) intent.getSerializableExtra("bind_device_source");
            this.r0 = intent.getIntExtra(ConstantKt.KEY_BIND_MODE, 2);
        }
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this);
        }
        this.z0 = RainbowUtils.isDarkMode(this);
        c1();
        l3();
        X2();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
        dismissDialog();
        a3();
        this.x.stopLoading();
    }

    @Override // com.xiaomi.hm.health.device.bind.HmBindEarbudLogic.EarbudBindListener
    public void onEarbudBindProgerss(AdvData advData, AdvData advData2) {
        this.J.setLeftConnect(true);
        this.J.setRightConnect(true);
        if (advData == null && advData2 == null) {
            this.J.setLeftConnect(false);
            this.J.setRightConnect(false);
            this.F.setText(R.string.bind_earbud_start_tip);
        } else if (advData == null) {
            this.E.setText(R.string.bind_earbud_search_left);
            this.F.setText(R.string.bind_earbud_close_to_phone);
            this.J.setLeftConnect(false);
        } else if (advData2 != null) {
            this.E.setText(R.string.bind_earbud_start);
            L2(true);
        } else {
            this.E.setText(R.string.bind_earbud_search_right);
            this.F.setText(R.string.bind_earbud_close_to_phone);
            this.J.setRightConnect(false);
        }
    }

    public void onEventMainThread(EventWebViewExit eventWebViewExit) {
        Intent intent = new Intent(this, (Class<?>) HMSelectWatchActivityNew.class);
        intent.addFlags(536870912);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    public void showBindMiLiFailureUI(int i, int i2) {
        String string = getString(i2);
        E2(getString(i, new Object[]{string}), string);
    }

    public static void startBindMiLi(Context context) {
        Intent intent = new Intent(context, (Class<?>) HMBindDeviceActivity.class);
        intent.putExtra("bind_type", 0);
        context.startActivity(intent);
    }

    public static void startBindWatch(Context context, BluetoothDevice bluetoothDevice, HMDeviceSource hMDeviceSource) {
        Intent intent = new Intent(context, (Class<?>) HMBindDeviceActivity.class);
        intent.putExtra("bind_type", ((BindServiceApi) KoinJavaComponent.get(BindServiceApi.class)).sourceToWatchType(hMDeviceSource));
        intent.putExtra(ConstantKt.KEY_BIND_MODE, 1);
        intent.putExtra("bind_device_source", hMDeviceSource);
        if (bluetoothDevice != null) {
            intent.putExtra("bind_device", bluetoothDevice);
        }
        context.startActivity(intent);
    }
}
