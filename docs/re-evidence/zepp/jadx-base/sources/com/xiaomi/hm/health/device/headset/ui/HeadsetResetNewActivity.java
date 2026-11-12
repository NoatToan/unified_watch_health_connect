package com.xiaomi.hm.health.device.headset.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.OnLifecycleEvent;
import androidx.p008lifecycle.ViewModelProvider;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.bluetooth.device.HeadsetDevice;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.LullabyDevice;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.event.HMActiveDeviceEvent;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.headset.HeadsetResetViewModel;
import com.xiaomi.hm.health.device.headset.ui.HeadsetResetNewActivity;
import com.xiaomi.hm.health.imageload.DisplayConfig;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.imageload.ext.ImageLoadExtentionsKt;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u007f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u00019\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001BB\u0007¢\u0006\u0004\b@\u0010AJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002J\f\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002J\u0012\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0011H\u0014J\b\u0010\u0016\u001a\u00020\u0007H\u0014J\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001d\u00108\u001a\u0002038B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010?\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010>¨\u0006C"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/ui/HeadsetResetNewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lorg/koin/core/component/KoinComponent;", "", "m", "l", "result", "", DTransferConstants.SEARCH_KEY, SOAP.XMLNS, "i", "Landroid/app/Activity;", "activity", "r", "Lcom/xiaomi/hm/health/databases/model/Device;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", hl.k, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "outState", "onSaveInstanceState", "onDestroy", "Lcom/huami/bluetooth/device/HeadsetDevice$HeadsetDeviceState;", "state", "onEventMainThread", "Lcom/xiaomi/hm/health/device/event/HMDeviceConnectionEvent;", "event", "Lcom/xiaomi/hm/health/device/event/HMActiveDeviceEvent;", "Lcom/xiaomi/hm/health/device/headset/HeadsetResetViewModel;", "a", "Lcom/xiaomi/hm/health/device/headset/HeadsetResetViewModel;", "viewModel", "", "b", "Ljava/lang/String;", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "c", "Lcom/xiaomi/hm/health/databases/model/Device;", "device", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "e", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "dialog", "Lcom/huami/android/design/dialog/AlertDialogFragment$Builder;", "f", "Lcom/huami/android/design/dialog/AlertDialogFragment$Builder;", "builder", "Lcom/huami/devicex/manager/DeviceManagerApi;", "g", "Lkotlin/Lazy;", z.j, "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "com/xiaomi/hm/health/device/headset/ui/HeadsetResetNewActivity$hrLifecycleObserver$1", "h", "Lcom/xiaomi/hm/health/device/headset/ui/HeadsetResetNewActivity$hrLifecycleObserver$1;", "hrLifecycleObserver", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mCheckingDialog", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HeadsetResetNewActivity extends AppCompatActivity implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String j = "HeadsetResetNewActivity";

    @NotNull
    private static final String k = "device_address";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private HeadsetResetViewModel viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String address;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Device device;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private HMDeviceType deviceType = HMDeviceType.VDevice;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment dialog;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment.Builder builder;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private HeadsetResetNewActivity$hrLifecycleObserver$1 hrLifecycleObserver;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mCheckingDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/ui/HeadsetResetNewActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "", "start", "Landroid/content/Intent;", "newIntent", "EXTRA_DEVICE_ADDRESS", "Ljava/lang/String;", "TAG", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Intent newIntent(@NotNull Context context, @NotNull String address) {
            Intent intent = new Intent(context, (Class<?>) HeadsetResetNewActivity.class);
            intent.putExtra(HeadsetResetNewActivity.k, address);
            return intent;
        }

        @JvmStatic
        public final void start(@NotNull Context context, @NotNull String address) {
            context.startActivity(newIntent(context, address));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.xiaomi.hm.health.device.headset.ui.HeadsetResetNewActivity$hrLifecycleObserver$1] */
    public HeadsetResetNewActivity() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.headset.ui.HeadsetResetNewActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        this.hrLifecycleObserver = new LifecycleObserver() { // from class: com.xiaomi.hm.health.device.headset.ui.HeadsetResetNewActivity$hrLifecycleObserver$1
            @OnLifecycleEvent(Lifecycle.Event.ON_START)
            public final void onStart() {
                View view;
                AlertDialogFragment alertDialogFragment = this.a.dialog;
                TextView textView = null;
                if (alertDialogFragment != null && (view = alertDialogFragment.getView()) != null) {
                    textView = (TextView) view.findViewById(R.id.dialog_message);
                }
                if (textView == null) {
                    return;
                }
                textView.setGravity(17);
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
            public final void onStop() {
                Lifecycle lifecycle;
                AlertDialogFragment alertDialogFragment = this.a.dialog;
                if (alertDialogFragment == null || (lifecycle = alertDialogFragment.getLifecycle()) == null) {
                    return;
                }
                lifecycle.removeObserver(this);
            }
        };
    }

    private final void i() {
        AlertDialogFragment alertDialogFragment;
        AlertDialogFragment alertDialogFragment2 = this.dialog;
        boolean z = false;
        if (alertDialogFragment2 != null && alertDialogFragment2.isShowing()) {
            z = true;
        }
        if (!z || (alertDialogFragment = this.dialog) == null) {
            return;
        }
        alertDialogFragment.dismiss();
    }

    private final DeviceManagerApi j() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final HMDeviceType k(Device device) {
        return HMDeviceType.fromValue(device.getDevice_type().intValue());
    }

    private final boolean l() {
        return j().isActive(this.device);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0013  */
    private final boolean m() {
        HeadsetDevice.HeadsetDeviceState headsetState;
        boolean zIsDualConnected;
        if (!l()) {
            return false;
        }
        IHMAuthCallback device = j().getDevice(HMDeviceType.HEADSET);
        if (device == null) {
            zIsDualConnected = false;
        } else if (device instanceof LullabyDevice) {
            zIsDualConnected = ((LullabyDevice) device).isConnected();
        } else if (!(device instanceof HeadsetDevice) || (headsetState = ((HeadsetDevice) device).getHeadsetState()) == null) {
            zIsDualConnected = false;
        } else {
            zIsDualConnected = headsetState.isDualConnected();
        }
        return zIsDualConnected;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(HeadsetResetNewActivity headsetResetNewActivity, View view) {
        headsetResetNewActivity.finish();
    }

    @JvmStatic
    @NotNull
    public static final Intent newIntent(@NotNull Context context, @NotNull String str) {
        return INSTANCE.newIntent(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(HeadsetResetNewActivity headsetResetNewActivity, Boolean bool) {
        headsetResetNewActivity.q(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(HeadsetResetNewActivity headsetResetNewActivity, Boolean bool) {
        if (bool.booleanValue()) {
            headsetResetNewActivity.s();
        } else {
            headsetResetNewActivity.i();
        }
    }

    private final void q(boolean result) {
        LoadingDialog loadingDialog = this.mCheckingDialog;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
        }
        if (!result) {
            IconToast.showError(this, R.string.headset_reset_failed);
            return;
        }
        IconToast.showSuccess(this, R.string.headset_reset_success);
        setResult(-1);
        finish();
    }

    private final void r(Activity activity) {
        if (activity.isDestroyed()) {
            return;
        }
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(activity, getString(R.string.headset_reseting));
        this.mCheckingDialog = loadingDialogShowDialog;
        if (loadingDialogShowDialog != null) {
            loadingDialogShowDialog.setCancelable(false);
        }
        LoadingDialog loadingDialog = this.mCheckingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.show();
    }

    private final void s() {
        Lifecycle lifecycle;
        AlertDialogFragment.Builder positiveButton;
        AlertDialogFragment.Builder title;
        AlertDialogFragment.Builder cancelable;
        boolean z = false;
        if (this.builder == null) {
            AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(this);
            this.builder = builder;
            AlertDialogFragment.Builder message = builder.setMessage(R.string.headset_reset_factory_des);
            if (message != null && (title = message.setTitle(R.string.headset_reset_factory_title)) != null && (cancelable = title.setCancelable(false)) != null) {
                cancelable.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: au3
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        HeadsetResetNewActivity.t(dialogInterface);
                    }
                });
            }
            AlertDialogFragment alertDialogFragment = this.dialog;
            if (alertDialogFragment != null) {
                alertDialogFragment.dismiss();
            }
            this.dialog = null;
        }
        AlertDialogFragment.Builder builder2 = this.builder;
        if (builder2 != null && (positiveButton = builder2.setPositiveButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: yt3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HeadsetResetNewActivity.u(this.a, dialogInterface, i);
            }
        })) != null) {
            positiveButton.setNegativeButton(getString(R.string.headset_reset_factory_sure), new DialogInterface.OnClickListener() { // from class: zt3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    HeadsetResetNewActivity.v(this.a, dialogInterface, i);
                }
            });
        }
        if (this.dialog == null) {
            AlertDialogFragment.Builder builder3 = this.builder;
            this.dialog = builder3 != null ? builder3.create() : null;
        }
        AlertDialogFragment alertDialogFragment2 = this.dialog;
        if (alertDialogFragment2 != null && alertDialogFragment2.isShowing()) {
            z = true;
        }
        if (z) {
            return;
        }
        AlertDialogFragment alertDialogFragment3 = this.dialog;
        if (alertDialogFragment3 != null && (lifecycle = alertDialogFragment3.getLifecycle()) != null) {
            lifecycle.addObserver(this.hrLifecycleObserver);
        }
        AlertDialogFragment alertDialogFragment4 = this.dialog;
        if (alertDialogFragment4 == null) {
            return;
        }
        alertDialogFragment4.show(getSupportFragmentManager());
    }

    @JvmStatic
    public static final void start(@NotNull Context context, @NotNull String str) {
        INSTANCE.start(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(DialogInterface dialogInterface) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(HeadsetResetNewActivity headsetResetNewActivity, DialogInterface dialogInterface, int i) {
        headsetResetNewActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(HeadsetResetNewActivity headsetResetNewActivity, DialogInterface dialogInterface, int i) {
        if (headsetResetNewActivity.m()) {
            headsetResetNewActivity.r(headsetResetNewActivity);
            HeadsetResetViewModel headsetResetViewModel = headsetResetNewActivity.viewModel;
            Objects.requireNonNull(headsetResetViewModel);
            headsetResetViewModel.reset();
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        Device device = null;
        if (savedInstanceState == null) {
            Intent intent = getIntent();
            savedInstanceState = intent == null ? null : intent.getExtras();
        }
        String string = savedInstanceState == null ? null : savedInstanceState.getString(k);
        if (string == null) {
            finish();
            return;
        }
        this.address = string;
        Device bindDevice = j().getBindDevice(HMDeviceType.HEADSET, string);
        if (bindDevice != null) {
            this.deviceType = HMDeviceType.fromValue(bindDevice.getDevice_type().intValue());
            Unit unit = Unit.INSTANCE;
            device = bindDevice;
        }
        this.device = device;
        setContentView(R.layout.activity_headset_reset_new);
        ImageView imageView = (ImageView) findViewById(R.id.bind_headset_search_image);
        try {
            DisplayConfig.ConfigBuilder configBuilderWith = HMImageLoader.with(imageView);
            DisplayConfig.ConfigBuilder.DiskCacheStrategy diskCacheStrategy = DisplayConfig.ConfigBuilder.DiskCacheStrategy.ALL;
            configBuilderWith.diskCacheStrategy(diskCacheStrategy).load(R.drawable.gif_headset_search_loading).diskCacheStrategy(diskCacheStrategy).crossFade().into(imageView);
        } catch (Exception e) {
            HMLog.e(ImageLoadExtentionsKt.TAG, e);
        }
        ((RainbowTitleBar) findViewById(R.id.tv_title_bar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: bu3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeadsetResetNewActivity.n(this.a, view);
            }
        });
        HeadsetResetViewModel headsetResetViewModel = (HeadsetResetViewModel) new ViewModelProvider(this).get(HeadsetResetViewModel.class);
        this.viewModel = headsetResetViewModel;
        Objects.requireNonNull(headsetResetViewModel);
        headsetResetViewModel.getResetResultLiveData().observe(this, new Observer() { // from class: du3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HeadsetResetNewActivity.o(this.a, (Boolean) obj);
            }
        });
        HeadsetResetViewModel headsetResetViewModel2 = this.viewModel;
        Objects.requireNonNull(headsetResetViewModel2);
        headsetResetViewModel2.isReady().observe(this, new Observer() { // from class: cu3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HeadsetResetNewActivity.p(this.a, (Boolean) obj);
            }
        });
        if (m()) {
            s();
        }
        EventBus.getDefault().register(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }

    public final void onEventMainThread(@NotNull HeadsetDevice.HeadsetDeviceState state) {
        if (l()) {
            HeadsetResetViewModel headsetResetViewModel = this.viewModel;
            Objects.requireNonNull(headsetResetViewModel);
            headsetResetViewModel.isReady(m());
        }
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String str = this.address;
        Objects.requireNonNull(str);
        outState.putString(k, str);
    }

    public final void onEventMainThread(@NotNull HMDeviceConnectionEvent event) {
        HMDeviceType deviceType = event.getDeviceType();
        Device device = this.device;
        if (deviceType != (device == null ? null : k(device))) {
            return;
        }
        HeadsetResetViewModel headsetResetViewModel = this.viewModel;
        Objects.requireNonNull(headsetResetViewModel);
        headsetResetViewModel.isReady(m());
    }

    public final void onEventMainThread(@NotNull HMActiveDeviceEvent event) {
        HMDeviceType deviceType = event.getDeviceType();
        Device device = this.device;
        if (deviceType != (device == null ? null : k(device))) {
            return;
        }
        HeadsetResetViewModel headsetResetViewModel = this.viewModel;
        Objects.requireNonNull(headsetResetViewModel);
        headsetResetViewModel.isReady(m());
    }
}
