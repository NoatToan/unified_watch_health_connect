package com.xiaomi.hm.health.device;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.bluetooth.profile.channel.module.settings.entity.screenlock.ScreenLockAndPassword;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringData;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseui.BaseTitleBarExtKt;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.OffWistSettingActivity;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wist.OffWistSettingViewModel;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b'\u0010(J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\b\u0010\f\u001a\u00020\u0006H\u0002J\b\u0010\r\u001a\u00020\u0006H\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0002J\b\u0010\u0010\u001a\u00020\u0006H\u0002J\b\u0010\u0011\u001a\u00020\u0006H\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0002J\u0012\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0016\u001a\u00020\u0006H\u0014J\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018J\b\u0010\u001b\u001a\u00020\u0006H\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0014R\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010%¨\u0006*"}, d2 = {"Lcom/xiaomi/hm/health/device/OffWistSettingActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Landroid/widget/ImageView;", "imageView", "", "color", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "", "enable", "y", "u", "w", "C", "B", DTransferConstants.SEARCH_KEY, com.google.android.exoplayer2.text.ttml.b.r, "z", "t", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onStart", "updateUI", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onClick", "onBackPressed", "onDestroy", "Lcom/xiaomi/hm/health/device/OffWistConfig;", "x", "Lcom/xiaomi/hm/health/device/OffWistConfig;", "offWistConfig", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/wist/OffWistSettingViewModel;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/wist/OffWistSettingViewModel;", "viewModel", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class OffWistSettingActivity extends BaseTitleActivity {

    @NotNull
    private static final String A = "OffWistSettingActivity";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private OffWistConfig offWistConfig;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog loadingDialog;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    private OffWistSettingViewModel viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/device/OffWistSettingActivity$Companion;", "", "Landroid/content/Context;", "ctx", "", WebConstant.QueryParam.LAUNCH, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context ctx) {
            ctx.startActivity(new Intent(ctx, (Class<?>) OffWistSettingActivity.class));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "not save when ZeppOS";
        }
    }

    private final void A(ImageView imageView, @ColorInt int color) {
        Drawable drawableWrap = DrawableCompat.wrap(imageView.getDrawable().mutate());
        DrawableCompat.setTint(drawableWrap, color);
        DrawableCompat.setTintMode(drawableWrap, PorterDuff.Mode.SRC_IN);
        imageView.setImageDrawable(drawableWrap);
    }

    private final void B() {
        OffWistPasswordSettingActivity.Companion.launch$default(OffWistPasswordSettingActivity.INSTANCE, this, false, false, 4, null);
    }

    private final void C() {
        OffWistPasswordSettingActivity.Companion.launch$default(OffWistPasswordSettingActivity.INSTANCE, this, true, false, 4, null);
    }

    private final void p() {
        OffWistSettingViewModel offWistSettingViewModel;
        HMBaseDevice device = BFCallback.getHMDeviceManager().getDevice(HMDeviceType.MILI);
        Objects.requireNonNull(device, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
        final HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) device;
        HMCallback<Object> hMCallback = new HMCallback<Object>() { // from class: com.xiaomi.hm.health.device.OffWistSettingActivity$closeOffWistLock$callBack$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ boolean a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(boolean z) {
                    super(0);
                    this.a = z;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "Close off wist " + this.a;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public static final b a = new b();

                public b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "closeOffWistLock not save when ZeppOS";
                }
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                HMLog.info("OffWistSettingActivity", new a(result));
                if (result) {
                    this.a.offWistConfig = new OffWistConfig(false, "");
                    if (hMMiLiProDevice.isHuamiOs()) {
                        HMLog.info("OffWistSettingActivity", b.a);
                    } else {
                        OffWistConfig.Companion companion = OffWistConfig.INSTANCE;
                        OffWistConfig offWistConfig = this.a.offWistConfig;
                        Objects.requireNonNull(offWistConfig);
                        companion.saveOffWistConfig(offWistConfig);
                    }
                    IconToast.showSuccess(this.a, R.string.save_success);
                    this.a.updateUI();
                } else {
                    IconToast.showError(this.a, R.string.save_failed);
                }
                this.a.t();
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onStart() {
                this.a.z();
            }
        };
        OffWistConfig offWistConfig = this.offWistConfig;
        Objects.requireNonNull(offWistConfig);
        hMMiLiProDevice.setUnwearPassword(false, offWistConfig.getPassword(), hMCallback);
        if (!hMMiLiProDevice.supportWatchSettings() || (offWistSettingViewModel = this.viewModel) == null) {
            return;
        }
        offWistSettingViewModel.updateDisplayBrightnessSetting(false, "", Boolean.FALSE);
    }

    private final void q() {
        new AlertDialogFragment.Builder(this).setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: pj5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                OffWistSettingActivity.r(dialogInterface, i);
            }
        }).setPositiveButton(getString(R.string.confirm), new DialogInterface.OnClickListener() { // from class: oj5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                OffWistSettingActivity.s(this.a, dialogInterface, i);
            }
        }).setMessage(getString(R.string.mili_setting_off_wist_lock_close_tip)).setCancelable(false).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(OffWistSettingActivity offWistSettingActivity, DialogInterface dialogInterface, int i) {
        offWistSettingActivity.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.dismiss();
    }

    private final void u() {
        LiveData<ScreenLockAndPassword> screenLockAndPassword;
        BFCallback.IHMDeviceManager hMDeviceManager = BFCallback.getHMDeviceManager();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        HMBaseDevice device = hMDeviceManager.getDevice(hMDeviceType);
        Objects.requireNonNull(device, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
        final HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) device;
        if (hMMiLiProDevice.supportWatchSettings()) {
            OffWistSettingViewModel offWistSettingViewModel = (OffWistSettingViewModel) new ViewModelProvider(this).get(OffWistSettingViewModel.class);
            this.viewModel = offWistSettingViewModel;
            if (offWistSettingViewModel != null) {
                offWistSettingViewModel.initJob(hMDeviceType);
            }
            OffWistSettingViewModel offWistSettingViewModel2 = this.viewModel;
            if (offWistSettingViewModel2 == null || (screenLockAndPassword = offWistSettingViewModel2.getScreenLockAndPassword()) == null) {
                return;
            }
            screenLockAndPassword.observe(this, new Observer() { // from class: rj5
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    OffWistSettingActivity.v(this.a, hMMiLiProDevice, (ScreenLockAndPassword) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    public static final void v(OffWistSettingActivity offWistSettingActivity, HMMiLiProDevice hMMiLiProDevice, ScreenLockAndPassword screenLockAndPassword) {
        StringData password;
        String stringData;
        Boolean bool;
        if (screenLockAndPassword == null) {
            return;
        }
        boolean z = false;
        boolean z2 = true;
        if (screenLockAndPassword.getSwitch() != null) {
            Boolean bool2 = screenLockAndPassword.getSwitch();
            OffWistConfig offWistConfig = offWistSettingActivity.offWistConfig;
            Objects.requireNonNull(offWistConfig);
            if (!Intrinsics.areEqual(bool2, Boolean.valueOf(offWistConfig.getEnabled())) && (bool = screenLockAndPassword.getSwitch()) != null) {
                boolean zBooleanValue = bool.booleanValue();
                OffWistConfig offWistConfig2 = offWistSettingActivity.offWistConfig;
                Objects.requireNonNull(offWistConfig2);
                offWistConfig2.setEnabled(zBooleanValue);
                z = true;
            }
        }
        StringData password2 = screenLockAndPassword.getPassword();
        if ((password2 == null ? null : password2.getStringData()) == null) {
            z2 = z;
        } else {
            StringData password3 = screenLockAndPassword.getPassword();
            String stringData2 = password3 != null ? password3.getStringData() : null;
            OffWistConfig offWistConfig3 = offWistSettingActivity.offWistConfig;
            Objects.requireNonNull(offWistConfig3);
            if (Intrinsics.areEqual(stringData2, offWistConfig3.getPassword()) || (password = screenLockAndPassword.getPassword()) == null || (stringData = password.getStringData()) == null) {
                z2 = z;
            } else {
                OffWistConfig offWistConfig4 = offWistSettingActivity.offWistConfig;
                Objects.requireNonNull(offWistConfig4);
                offWistConfig4.setPassword(stringData);
            }
        }
        if (z2) {
            if (hMMiLiProDevice.isHuamiOs()) {
                HMLog.info(A, a.a);
            } else {
                OffWistConfig.Companion companion = OffWistConfig.INSTANCE;
                OffWistConfig offWistConfig5 = offWistSettingActivity.offWistConfig;
                Objects.requireNonNull(offWistConfig5);
                companion.saveOffWistConfig(offWistConfig5);
            }
            offWistSettingActivity.updateUI();
        }
    }

    private final void w() {
        setResult(-1);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(OffWistSettingActivity offWistSettingActivity, View view) {
        offWistSettingActivity.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(boolean enable) {
        ((ListTile) findViewById(R.id.off_lock_item)).setEnabled(enable);
        ((ListTile) findViewById(R.id.off_lock_close_item)).setEnabled(enable);
        ((ListTile) findViewById(R.id.off_lock_modify_password_item)).setEnabled(enable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.saving));
        this.loadingDialog = loadingDialogShowDialog;
        if (loadingDialogShowDialog != null) {
            loadingDialogShowDialog.setCancelable(false);
        }
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.show();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        w();
    }

    public final void onClick(@NotNull View view) {
        int id = view.getId();
        if (id == R.id.off_lock_item) {
            C();
        } else if (id == R.id.off_lock_close_item) {
            q();
        } else if (id == R.id.off_lock_modify_password_item) {
            B();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_off_wist_lock);
        u();
        BaseTitleBarExtKt.setTitleBar(this, getString(R.string.mili_setting_off_wist_lock_activity_title), null, R.color.s15, BaseTitleActivity.STYLE.BACK_AND_TITLE);
        getLeft().setOnClickListener(new View.OnClickListener() { // from class: qj5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OffWistSettingActivity.x(this.a, view);
            }
        });
        BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager()).setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.OffWistSettingActivity.onCreate.2
            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                OffWistSettingActivity.this.y(enable);
            }
        });
        if (ConfigHelperKt.hasMiliFeature(Feature.ROUND_WATCH_S)) {
            ((ImageView) findViewById(R.id.off_wist_lock_img)).setImageResource(R.drawable.img_lock_from_wrist_gt);
        } else if (HMDeviceConfig.isL66Series()) {
            ((ImageView) findViewById(R.id.off_wist_lock_img)).setImageResource(R.drawable.img_lock_from_wrist);
        }
        if (GlobalConfig.get().isBuildMidong()) {
            A(getLeft(), ContextCompat.getColor(this, R.color.s38));
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        OffWistSettingViewModel offWistSettingViewModel = this.viewModel;
        if (offWistSettingViewModel == null) {
            return;
        }
        offWistSettingViewModel.removeListener();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        OffWistSettingViewModel offWistSettingViewModel = this.viewModel;
        if (offWistSettingViewModel != null) {
            OffWistSettingViewModel.querySettings$default(offWistSettingViewModel, false, 1, null);
        }
        this.offWistConfig = OffWistConfig.INSTANCE.offWistConfig();
        updateUI();
    }

    public final void updateUI() {
        ListTile listTile = (ListTile) findViewById(R.id.off_lock_item);
        OffWistConfig offWistConfig = this.offWistConfig;
        Objects.requireNonNull(offWistConfig);
        listTile.setVisibility(offWistConfig.getEnabled() ? 8 : 0);
        ListTile listTile2 = (ListTile) findViewById(R.id.off_lock_close_item);
        OffWistConfig offWistConfig2 = this.offWistConfig;
        Objects.requireNonNull(offWistConfig2);
        listTile2.setVisibility(offWistConfig2.getEnabled() ? 0 : 8);
        ListTile listTile3 = (ListTile) findViewById(R.id.off_lock_modify_password_item);
        OffWistConfig offWistConfig3 = this.offWistConfig;
        Objects.requireNonNull(offWistConfig3);
        listTile3.setVisibility(offWistConfig3.getEnabled() ? 0 : 8);
    }
}
