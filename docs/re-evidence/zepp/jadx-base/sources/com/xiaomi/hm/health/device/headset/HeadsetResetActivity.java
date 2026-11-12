package com.xiaomi.hm.health.device.headset;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.Observer;
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
import com.huami.widget.toast.IconToast;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.event.HMActiveDeviceEvent;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.headset.HeadsetResetActivity;
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

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00017B\u0007¢\u0006\u0004\b5\u00106J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002J\f\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002J\u0012\u0010\u0013\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0011H\u0014J\b\u0010\u0016\u001a\u00020\u0003H\u0014J\u000e\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u00100\u001a\u00020+8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00068"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/HeadsetResetActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lorg/koin/core/component/KoinComponent;", "", "initViews", "", "o", GoogleApiAvailabilityLight.b, "result", "r", "t", "Landroid/app/Activity;", "activity", SOAP.XMLNS, "Lcom/xiaomi/hm/health/databases/model/Device;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", hl.k, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "outState", "onSaveInstanceState", "onDestroy", "Lcom/huami/bluetooth/device/HeadsetDevice$HeadsetDeviceState;", "state", "onEventMainThread", "Lcom/xiaomi/hm/health/device/event/HMDeviceConnectionEvent;", "event", "Lcom/xiaomi/hm/health/device/event/HMActiveDeviceEvent;", "Lcom/xiaomi/hm/health/device/headset/HeadsetResetViewModel;", "a", "Lcom/xiaomi/hm/health/device/headset/HeadsetResetViewModel;", "viewModel", "", "b", "Ljava/lang/String;", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "c", "Lcom/xiaomi/hm/health/databases/model/Device;", "device", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "Lcom/huami/devicex/manager/DeviceManagerApi;", "e", "Lkotlin/Lazy;", z.j, "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "f", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mCheckingDialog", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HeadsetResetActivity extends AppCompatActivity implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String g = "HeadsetSportSettingActivity";

    @NotNull
    private static final String h = "device_address";

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
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mCheckingDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/HeadsetResetActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "", "start", "Landroid/content/Intent;", "newIntent", "EXTRA_DEVICE_ADDRESS", "Ljava/lang/String;", "TAG", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Intent newIntent(@NotNull Context context, @NotNull String address) {
            Intent intent = new Intent(context, (Class<?>) HeadsetResetActivity.class);
            intent.putExtra(HeadsetResetActivity.h, address);
            return intent;
        }

        @JvmStatic
        public final void start(@NotNull Context context, @NotNull String address) {
            context.startActivity(newIntent(context, address));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HeadsetResetActivity() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.headset.HeadsetResetActivity$special$$inlined$inject$default$1
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
    }

    private final void initViews() {
        ((TextView) findViewById(R.id.headset_reset_cancel_bt)).setOnClickListener(new View.OnClickListener() { // from class: ut3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeadsetResetActivity.l(this.a, view);
            }
        });
        int i = R.id.headset_reset_bt;
        ((TextView) findViewById(i)).setOnClickListener(new View.OnClickListener() { // from class: vt3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeadsetResetActivity.m(this.a, view);
            }
        });
        ((TextView) findViewById(i)).setEnabled(o());
    }

    private final DeviceManagerApi j() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final HMDeviceType k(Device device) {
        return HMDeviceType.fromValue(device.getDevice_type().intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(HeadsetResetActivity headsetResetActivity, View view) {
        headsetResetActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(HeadsetResetActivity headsetResetActivity, View view) {
        headsetResetActivity.t();
    }

    private final boolean n() {
        return j().isActive(this.device);
    }

    @JvmStatic
    @NotNull
    public static final Intent newIntent(@NotNull Context context, @NotNull String str) {
        return INSTANCE.newIntent(context, str);
    }

    private final boolean o() {
        HeadsetDevice.HeadsetDeviceState headsetState;
        if (!n()) {
            return false;
        }
        IHMAuthCallback device = j().getDevice(HMDeviceType.HEADSET);
        return (device != null && (device instanceof HeadsetDevice) && (headsetState = ((HeadsetDevice) device).getHeadsetState()) != null) ? headsetState.isDualConnected() : false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(HeadsetResetActivity headsetResetActivity, View view) {
        headsetResetActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(HeadsetResetActivity headsetResetActivity, Boolean bool) {
        headsetResetActivity.r(bool.booleanValue());
    }

    private final void r(boolean result) {
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

    private final void s(Activity activity) {
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

    @JvmStatic
    public static final void start(@NotNull Context context, @NotNull String str) {
        INSTANCE.start(context, str);
    }

    private final void t() {
        new AlertDialogFragment.Builder(this).setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: rt3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HeadsetResetActivity.u(this.a, dialogInterface, i);
            }
        }).setPositiveButton(getString(R.string.confirm), new DialogInterface.OnClickListener() { // from class: st3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HeadsetResetActivity.v(this.a, dialogInterface, i);
            }
        }).setMessage(R.string.headset_reset_confirm).setCancelable(false).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: tt3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                HeadsetResetActivity.w(dialogInterface);
            }
        }).create().show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(HeadsetResetActivity headsetResetActivity, DialogInterface dialogInterface, int i) {
        headsetResetActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(HeadsetResetActivity headsetResetActivity, DialogInterface dialogInterface, int i) {
        if (headsetResetActivity.o()) {
            headsetResetActivity.s(headsetResetActivity);
            HeadsetResetViewModel headsetResetViewModel = headsetResetActivity.viewModel;
            Objects.requireNonNull(headsetResetViewModel);
            headsetResetViewModel.reset();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(DialogInterface dialogInterface) {
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
        String string = savedInstanceState == null ? null : savedInstanceState.getString(h);
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
        setContentView(R.layout.activity_headset_reset);
        ((RainbowTitleBar) findViewById(R.id.tv_title_bar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: wt3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeadsetResetActivity.p(this.a, view);
            }
        });
        initViews();
        HeadsetResetViewModel headsetResetViewModel = (HeadsetResetViewModel) new ViewModelProvider(this).get(HeadsetResetViewModel.class);
        this.viewModel = headsetResetViewModel;
        Objects.requireNonNull(headsetResetViewModel);
        headsetResetViewModel.getResetResultLiveData().observe(this, new Observer() { // from class: xt3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HeadsetResetActivity.q(this.a, (Boolean) obj);
            }
        });
        EventBus.getDefault().register(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }

    public final void onEventMainThread(@NotNull HeadsetDevice.HeadsetDeviceState state) {
        if (n()) {
            ((TextView) findViewById(R.id.headset_reset_bt)).setEnabled(o());
        }
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String str = this.address;
        Objects.requireNonNull(str);
        outState.putString(h, str);
    }

    public final void onEventMainThread(@NotNull HMDeviceConnectionEvent event) {
        HMDeviceType deviceType = event.getDeviceType();
        Device device = this.device;
        if (deviceType != (device == null ? null : k(device))) {
            return;
        }
        ((TextView) findViewById(R.id.headset_reset_bt)).setEnabled(o());
    }

    public final void onEventMainThread(@NotNull HMActiveDeviceEvent event) {
        HMDeviceType deviceType = event.getDeviceType();
        Device device = this.device;
        if (deviceType != (device == null ? null : k(device))) {
            return;
        }
        ((TextView) findViewById(R.id.headset_reset_bt)).setEnabled(o());
    }
}
