package com.xiaomi.fitness.sport.view.justdance.control;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import coil.Coil;
import coil.ComponentRegistry;
import coil.ImageLoader;
import coil.decode.GifDecoder;
import coil.decode.ImageDecoderDecoder;
import coil.request.ImageRequest;
import com.miui.circulate.device.api.DeviceInfo;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport.view.justdance.JustDanceImpl;
import com.xiaomi.fitness.sport.view.justdance.PauseSliderData;
import com.xiaomi.fitness.sport.view.justdance.control.JustDanceControlActivity;
import com.xiaomi.fitness.sport.view.justdance.launch.JDLaunchHelper;
import com.xiaomi.fitness.sport_export.IJustDanceApi;
import com.xiaomi.fitness.sport_export.JustDanceExtKt;
import com.xiaomi.fitness.sport_xms_export.SportXmsHelper;
import com.xiaomi.fitness.sport_xms_export.SportXmsHelperExtKt;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.c1j;
import defpackage.clb;
import defpackage.cpn;
import defpackage.dvi;
import defpackage.eoi;
import defpackage.epn;
import defpackage.l34;
import defpackage.nv1;
import defpackage.t9n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b*\u0002(,\b\u0007\u0018\u0000 62\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00016B\u0007¢\u0006\u0004\b5\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u0019\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0006J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001a\u0010\u0006R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001dR\u0014\u0010$\u001a\u00020\u001b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\u000f\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010!R\u0016\u0010\r\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010!R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00101¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/sport/view/justdance/control/JustDanceControlActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/sport/view/justdance/control/JustDanceControlViewModel;", "Lt9n;", "", "loadCloudImage", "()V", "connectSwitch", "showHasOngoingSportDialog", "computeQRCode", "showQRCodeDialog", "addDeviceStatusListener", "waitForDeviceConnect", "showDeviceDisconnectDialog", "showSettingDialog", "showDisconnectDialog", "tryDisconnect", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", LifecycleConstantKt.ON_DESTROY, "", DeviceInfo.Builder.PrivateDataKey.IP, "Ljava/lang/String;", com.xiaomi.onetrack.api.b.F, "", "fromLaunch", "Z", "sportDid", "TAG$1", "TAG", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "com/xiaomi/fitness/sport/view/justdance/control/JustDanceControlActivity$deviceStatusListener$1", "deviceStatusListener", "Lcom/xiaomi/fitness/sport/view/justdance/control/JustDanceControlActivity$deviceStatusListener$1;", "sportDeviceDisconnect", "com/xiaomi/fitness/sport/view/justdance/control/JustDanceControlActivity$receiver$1", "receiver", "Lcom/xiaomi/fitness/sport/view/justdance/control/JustDanceControlActivity$receiver$1;", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nJustDanceControlActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JustDanceControlActivity.kt\ncom/xiaomi/fitness/sport/view/justdance/control/JustDanceControlActivity\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n+ 4 ImageLoader.kt\ncoil/ImageLoader$Builder\n*L\n1#1,405:1\n54#2,3:406\n24#2:409\n57#2,6:410\n63#2,2:417\n54#2,9:420\n63#2,2:430\n57#3:416\n57#3:429\n192#4:419\n*S KotlinDebug\n*F\n+ 1 JustDanceControlActivity.kt\ncom/xiaomi/fitness/sport/view/justdance/control/JustDanceControlActivity\n*L\n153#1:406,3\n153#1:409\n153#1:410,6\n153#1:417,2\n162#1:420,9\n162#1:430,2\n153#1:416\n162#1:429\n154#1:419\n*E\n"})
public final class JustDanceControlActivity extends Hilt_JustDanceControlActivity<JustDanceControlViewModel, t9n> {

    @NotNull
    private static final String CONTROL_PANEL_ORIGIN = "https://cdn.cnbj1.fds.api.mi-img.com/hlth-operate/appres/images/justdance/control_panel_origin.png?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=fhD8SGGN1YZ9GlJdvu6MMG/HU6A=";

    @NotNull
    public static final String EXTRA_IP = "extra_ip";

    @NotNull
    public static final String EXTRA_PORT = "extra_port";

    @NotNull
    public static final String FROM_LAUNCH = "from_launch";
    private static final long RETRY_TIME = 10000;

    @NotNull
    private static final String TAG = "JustDanceControlActivity";

    @NotNull
    private static final String TOUCH_AREA_GUIDE = "https://cdn.cnbj1.fds.api.mi-img.com/hlth-operate/appres/images/justdance/HAND_anima_bg.gif?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=UeCGAvKviDw6lKSddzfWamBHGk0=";
    private boolean fromLaunch;
    private boolean showDeviceDisconnectDialog;
    private boolean showDisconnectDialog;
    private boolean sportDeviceDisconnect;

    @Nullable
    private String sportDid;

    @NotNull
    private String ip = "";

    @NotNull
    private String port = "";

    /* JADX INFO: renamed from: TAG$1, reason: from kotlin metadata */
    @NotNull
    private final String TAG = TAG;

    @NotNull
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    @NotNull
    private final JustDanceControlActivity$deviceStatusListener$1 deviceStatusListener = new OnDeviceFullStatusListener() { // from class: com.xiaomi.fitness.sport.view.justdance.control.JustDanceControlActivity$deviceStatusListener$1
        @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectSuccess(String did) {
            super.onConnectSuccess(did);
            Logger.i(this.this$0.TAG, "onConnectSuccess: " + did + " sportDeviceDisconnect: " + this.this$0.sportDeviceDisconnect);
            if (did == null || this.this$0.sportDid == null || !Intrinsics.areEqual(did, this.this$0.sportDid) || !this.this$0.sportDeviceDisconnect || this.this$0.showDeviceDisconnectDialog) {
                return;
            }
            this.this$0.mHandler.removeCallbacksAndMessages(null);
            SportXmsHelperExtKt.getInstance(SportXmsHelper.INSTANCE).resumeSport(did);
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceFullStatusListener, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onDisconnect(String did) {
            super.onDisconnect(did);
            Logger.i(this.this$0.TAG, "onDisconnect: " + did);
            if (did == null || this.this$0.sportDid == null || !Intrinsics.areEqual(did, this.this$0.sportDid)) {
                return;
            }
            this.this$0.sportDeviceDisconnect = true;
            if (JustDanceControlActivity.access$getMViewModel(this.this$0).getMModel().getShowControl().get()) {
                this.this$0.waitForDeviceConnect();
            } else {
                this.this$0.showDeviceDisconnectDialog();
            }
        }
    };

    @NotNull
    private final JustDanceControlActivity$receiver$1 receiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.sport.view.justdance.control.JustDanceControlActivity$receiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, "android.os.action.DEVICE_IDLE_MODE_CHANGED")) {
                Object systemService = context != null ? context.getSystemService("power") : null;
                PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
                Logger.i(this.this$0.TAG, "doze mode change: " + (powerManager != null ? Boolean.valueOf(powerManager.isDeviceIdleMode()) : null));
            }
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ t9n access$getMBinding(JustDanceControlActivity justDanceControlActivity) {
        return (t9n) justDanceControlActivity.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ JustDanceControlViewModel access$getMViewModel(JustDanceControlActivity justDanceControlActivity) {
        return (JustDanceControlViewModel) justDanceControlActivity.getMViewModel();
    }

    private final void addDeviceStatusListener() {
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(this.deviceStatusListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void computeQRCode() {
        ((t9n) getMBinding()).X.setOnClickListener(new View.OnClickListener() { // from class: cwd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JustDanceControlActivity.computeQRCode$lambda$15(this.f14800a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void computeQRCode$lambda$15(JustDanceControlActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showQRCodeDialog();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void connectSwitch() {
        ((JustDanceControlViewModel) getMViewModel()).connectSwitch(this.ip, this.port, new Function1() { // from class: rwd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return JustDanceControlActivity.connectSwitch$lambda$14(this.f32966a, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit connectSwitch$lambda$14(JustDanceControlActivity this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 1000) {
            ((JustDanceControlViewModel) this$0.getMViewModel()).stopSport();
        } else if (i == 0) {
            AnyExtKt.main$default(null, new JustDanceControlActivity$connectSwitch$1$1(this$0, null), 1, null);
        } else if (!this$0.showDisconnectDialog) {
            this$0.showDisconnectDialog = true;
            AnyExtKt.main$default(null, new JustDanceControlActivity$connectSwitch$1$2(this$0, null), 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadCloudImage() {
        JustDanceClickAreaView clickArea = ((t9n) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(clickArea, "clickArea");
        Coil.imageLoader(clickArea.getContext()).enqueue(new ImageRequest.Builder(clickArea.getContext()).data(CONTROL_PANEL_ORIGIN).target(clickArea).build());
        ImageLoader.Builder builder = new ImageLoader.Builder(this);
        ComponentRegistry.Builder builder2 = new ComponentRegistry.Builder();
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i = 1;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28) {
            builder2.add(new ImageDecoderDecoder.Factory(z, i, defaultConstructorMarker));
        } else {
            builder2.add(new GifDecoder.Factory(z, i, defaultConstructorMarker));
        }
        ImageLoader imageLoaderBuild = builder.components(builder2.build()).build();
        ImageView touchGuide = ((t9n) getMBinding()).h0;
        Intrinsics.checkNotNullExpressionValue(touchGuide, "touchGuide");
        imageLoaderBuild.enqueue(new ImageRequest.Builder(touchGuide.getContext()).data(TOUCH_AREA_GUIDE).target(touchGuide).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(JustDanceControlActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.tryDisconnect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$1(JustDanceControlActivity this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((JustDanceControlViewModel) this$0.getMViewModel()).getMModel().getTouchGuide().set(false);
        if (((JustDanceControlViewModel) this$0.getMViewModel()).getMModel().getEnableVibrate().get()) {
            clb.a(this$0);
        }
        if (i == 1) {
            ((JustDanceControlViewModel) this$0.getMViewModel()).sendCmd(((JustDanceControlViewModel) this$0.getMViewModel()).getMModel().getWsCommand().getUP());
        } else if (i == 2) {
            ((JustDanceControlViewModel) this$0.getMViewModel()).sendCmd(((JustDanceControlViewModel) this$0.getMViewModel()).getMModel().getWsCommand().getDOWN());
        } else if (i == 3) {
            ((JustDanceControlViewModel) this$0.getMViewModel()).sendCmd(((JustDanceControlViewModel) this$0.getMViewModel()).getMModel().getWsCommand().getRIGHT());
        } else if (i == 4) {
            ((JustDanceControlViewModel) this$0.getMViewModel()).sendCmd(((JustDanceControlViewModel) this$0.getMViewModel()).getMModel().getWsCommand().getLEFT());
        } else if (i == 5) {
            ((JustDanceControlViewModel) this$0.getMViewModel()).sendCmd(((JustDanceControlViewModel) this$0.getMViewModel()).getMModel().getWsCommand().getVALID());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$10(JustDanceControlActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((JustDanceControlViewModel) this$0.getMViewModel()).getMModel().getTouchGuide().set(!((JustDanceControlViewModel) this$0.getMViewModel()).getMModel().getTouchGuide().get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$11(JustDanceControlActivity this$0, Long l) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$2(JustDanceControlActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        JustDanceControlViewModel justDanceControlViewModel = (JustDanceControlViewModel) this$0.getMViewModel();
        PauseSliderData pauseSliderData = ((JustDanceControlViewModel) this$0.getMViewModel()).getMModel().getPhoneUiSetupData().get();
        justDanceControlViewModel.sendCmd(pauseSliderData != null ? pauseSliderData.getCommand() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$3(JustDanceControlActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = ((t9n) this$0.getMBinding()).P.getText().toString();
        if (string.length() == 0) {
            ToastExtKt.toastShort(this$0, c1j.T1);
            return;
        }
        Object systemService = this$0.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(((t9n) this$0.getMBinding()).P.getWindowToken(), 0);
        ((JustDanceControlViewModel) this$0.getMViewModel()).sendKeyBoardText(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$5(JustDanceControlActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String shareUrl = ((JustDanceControlViewModel) this$0.getMViewModel()).getMModel().getSongData().getShareUrl();
        if (shareUrl != null) {
            JustDanceShareWebViewActivity.INSTANCE.start(this$0, shareUrl, ((JustDanceControlViewModel) this$0.getMViewModel()).getMModel().getSongData().getSongName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$6(JustDanceControlActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!((JustDanceControlViewModel) this$0.getMViewModel()).getMModel().getIsMaster().get()) {
            ((JustDanceControlViewModel) this$0.getMViewModel()).getMModel().getShowPlayerList().set(false);
            ((JustDanceControlViewModel) this$0.getMViewModel()).getMModel().getShowRecap().set(false);
        } else {
            ((JustDanceControlViewModel) this$0.getMViewModel()).sendCmd(((JustDanceControlViewModel) this$0.getMViewModel()).getMModel().getWsCommand().getVALID());
            ((JustDanceControlViewModel) this$0.getMViewModel()).getMModel().getShowPlayerList().set(false);
            ((JustDanceControlViewModel) this$0.getMViewModel()).getMModel().refreshShowTouchArea();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$7(JustDanceControlActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showSettingDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$8(JustDanceControlActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((JustDanceControlViewModel) this$0.getMViewModel()).sendCmd("{\"root\":{\"__class\":\"JD_Custom_PhoneCommandData\",\"identifier\":\"SHORTCUT_BACK\"}}");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$9(JustDanceControlActivity this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((JustDanceControlViewModel) this$0.getMViewModel()).getMModel().getEnableVibrate().get()) {
            clb.a(this$0);
        }
        if (i == 1) {
            ((JustDanceControlViewModel) this$0.getMViewModel()).sendCmd(((JustDanceControlViewModel) this$0.getMViewModel()).getMModel().getWsCommand().getUP());
        } else if (i == 2) {
            ((JustDanceControlViewModel) this$0.getMViewModel()).sendCmd(((JustDanceControlViewModel) this$0.getMViewModel()).getMModel().getWsCommand().getDOWN());
        } else if (i == 3) {
            ((JustDanceControlViewModel) this$0.getMViewModel()).sendCmd(((JustDanceControlViewModel) this$0.getMViewModel()).getMModel().getWsCommand().getRIGHT());
        } else if (i == 4) {
            ((JustDanceControlViewModel) this$0.getMViewModel()).sendCmd(((JustDanceControlViewModel) this$0.getMViewModel()).getMModel().getWsCommand().getLEFT());
        } else if (i == 5) {
            ((JustDanceControlViewModel) this$0.getMViewModel()).sendCmd(((JustDanceControlViewModel) this$0.getMViewModel()).getMModel().getWsCommand().getVALID());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void showDeviceDisconnectDialog() {
        final boolean z = ((JustDanceControlViewModel) getMViewModel()).getMModel().getShowConnect().get() && !((JustDanceControlViewModel) getMViewModel()).getMModel().getShowControl().get();
        final PauseSliderData pauseSliderData = ((JustDanceControlViewModel) getMViewModel()).getMModel().getPhoneUiSetupData().get();
        this.showDeviceDisconnectDialog = true;
        JDLaunchHelper jDLaunchHelper = JDLaunchHelper.INSTANCE;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        jDLaunchHelper.showDeviceDisconnectDialog(supportFragmentManager, new Function0() { // from class: iwd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JustDanceControlActivity.showDeviceDisconnectDialog$lambda$19(pauseSliderData, this);
            }
        }, new Function0() { // from class: jwd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JustDanceControlActivity.showDeviceDisconnectDialog$lambda$20(this.f23201a, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showDeviceDisconnectDialog$lambda$19(PauseSliderData pauseSliderData, JustDanceControlActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String command = pauseSliderData != null ? pauseSliderData.getCommand() : null;
        if (command != null && command.length() != 0) {
            JustDanceControlViewModel justDanceControlViewModel = (JustDanceControlViewModel) this$0.getMViewModel();
            Intrinsics.checkNotNull(pauseSliderData);
            justDanceControlViewModel.sendCmd(pauseSliderData.getCommand());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showDeviceDisconnectDialog$lambda$20(JustDanceControlActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((JustDanceControlViewModel) this$0.getMViewModel()).destroyWebSocket();
        if (z) {
            ((JustDanceControlViewModel) this$0.getMViewModel()).stopSport();
            this$0.finish();
            if (!this$0.fromLaunch) {
                IJustDanceApi justDanceExtKt = JustDanceExtKt.getInstance(IJustDanceApi.INSTANCE);
                Intrinsics.checkNotNull(justDanceExtKt, "null cannot be cast to non-null type com.xiaomi.fitness.sport.view.justdance.JustDanceImpl");
                ((JustDanceImpl) justDanceExtKt).gotoLaunchActivity(this$0);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDisconnectDialog() {
        new CommonDialog.c("jd disconnect").setDialogTitle(c1j.Y1).setDialogDescription(c1j.X1).setPositiveText(c1j.h).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.view.justdance.control.JustDanceControlActivity.showDisconnectDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    JustDanceControlActivity.access$getMViewModel(JustDanceControlActivity.this).stopSport();
                    JustDanceControlActivity.this.finish();
                    if (JustDanceControlActivity.this.fromLaunch) {
                        return;
                    }
                    IJustDanceApi justDanceExtKt = JustDanceExtKt.getInstance(IJustDanceApi.INSTANCE);
                    Intrinsics.checkNotNull(justDanceExtKt, "null cannot be cast to non-null type com.xiaomi.fitness.sport.view.justdance.JustDanceImpl");
                    ((JustDanceImpl) justDanceExtKt).gotoLaunchActivity(JustDanceControlActivity.this);
                }
            }
        }).showIfNeed(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showHasOngoingSportDialog() {
        new CommonDialog.c("").setDialogDescription(c1j.g2).setPositiveText(c1j.g).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.view.justdance.control.JustDanceControlActivity.showHasOngoingSportDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which != -1 || dialog == null) {
                    return;
                }
                dialog.dismiss();
            }
        }).showIfNeed(getSupportFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showQRCodeDialog() {
        if (((JustDanceControlViewModel) getMViewModel()).getMModel().getIsMaster().get()) {
            ((JustDanceControlViewModel) getMViewModel()).sendCmd(((JustDanceControlViewModel) getMViewModel()).getMModel().getWsCommand().getPAUSE_GAME());
        }
        Bitmap bitmapB = l34.b("https://jd.ubicdn.com/mp?ip=" + this.ip + "&port=" + this.port, ExtUtilsKt.getDp(176));
        cpn cpnVarA0 = cpn.A0(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(cpnVarA0, "inflate(...)");
        final CommonDialog commonDialogCreate = new CommonDialog.c("").setCustomView(cpnVarA0.getRoot()).create();
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
        cpnVarA0.B.setImageBitmap(bitmapB);
        cpnVarA0.A.setOnClickListener(new View.OnClickListener() { // from class: hwd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                commonDialogCreate.dismiss();
            }
        });
    }

    private final void showSettingDialog() {
        epn epnVarA0 = epn.A0(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(epnVarA0, "inflate(...)");
        epnVarA0.q0(nv1.l, getMViewModel());
        final CommonDialog commonDialogCreate = new CommonDialog.c("").setCustomView(epnVarA0.getRoot()).create();
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
        epnVarA0.B.setOnClickListener(new View.OnClickListener() { // from class: kwd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                commonDialogCreate.dismiss();
            }
        });
        epnVarA0.F.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: lwd
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                JustDanceControlActivity.showSettingDialog$lambda$27$lambda$22(this.f25492a, z, iSwitchButton);
            }
        });
        epnVarA0.E.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: mwd
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                JustDanceControlActivity.showSettingDialog$lambda$27$lambda$23(this.f27284a, z, iSwitchButton);
            }
        });
        epnVarA0.D.setOnClickListener(new View.OnClickListener() { // from class: owd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JustDanceControlActivity.showSettingDialog$lambda$27$lambda$24(this.f29759a, view);
            }
        });
        epnVarA0.G.setOnClickListener(new View.OnClickListener() { // from class: pwd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JustDanceControlActivity.showSettingDialog$lambda$27$lambda$25(this.f30856a, view);
            }
        });
        epnVarA0.A.setOnClickListener(new View.OnClickListener() { // from class: qwd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JustDanceControlActivity.showSettingDialog$lambda$27$lambda$26(commonDialogCreate, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showSettingDialog$lambda$27$lambda$22(JustDanceControlActivity this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((JustDanceControlViewModel) this$0.getMViewModel()).getMModel().getEnableVibrate().set(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showSettingDialog$lambda$27$lambda$23(JustDanceControlActivity this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((JustDanceControlViewModel) this$0.getMViewModel()).getMModel().getSlideMirror().set(z);
        ((t9n) this$0.getMBinding()).e0.setReverseX(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showSettingDialog$lambda$27$lambda$24(JustDanceControlActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((JustDanceControlViewModel) this$0.getMViewModel()).getMModel().getEnableSlide().set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showSettingDialog$lambda$27$lambda$25(JustDanceControlActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((JustDanceControlViewModel) this$0.getMViewModel()).getMModel().getEnableSlide().set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSettingDialog$lambda$27$lambda$26(CommonDialog commonDialog, JustDanceControlActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        commonDialog.dismiss();
        this$0.tryDisconnect();
    }

    private final void tryDisconnect() {
        new CommonDialog.c("").setDialogDescription(c1j.R1).setNegativeText(c1j.f).setPositiveText(c1j.S1).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.view.justdance.control.JustDanceControlActivity.tryDisconnect.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which != -2) {
                    if (which != -1) {
                        return;
                    }
                    JustDanceControlActivity.this.finish();
                } else if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }).showIfNeed(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void waitForDeviceConnect() {
        this.mHandler.postDelayed(new Runnable() { // from class: nwd
            @Override // java.lang.Runnable
            public final void run() {
                JustDanceControlActivity.waitForDeviceConnect$lambda$18(this.f28503a);
            }
        }, 10000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void waitForDeviceConnect$lambda$18(JustDanceControlActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showDeviceDisconnectDialog();
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return dvi.L;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return nv1.l;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        tryDisconnect();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        ((JustDanceControlViewModel) getMViewModel()).getMModel().getNightMode().set(UIUtils.isNightMode(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.view.justdance.control.Hilt_JustDanceControlActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.d(this.TAG, "create JustDanceControlActivity: " + hashCode());
        setActionBarNormalTitleMode();
        setTitle(c1j.l2);
        String stringExtra = getIntent().getStringExtra(EXTRA_IP);
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.ip = stringExtra;
        String stringExtra2 = getIntent().getStringExtra(EXTRA_PORT);
        this.port = stringExtra2 != null ? stringExtra2 : "";
        this.fromLaunch = getIntent().getBooleanExtra(FROM_LAUNCH, false);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        this.sportDid = wearableDeviceModel != null ? wearableDeviceModel.getDid() : null;
        loadCloudImage();
        connectSwitch();
        hideBack();
        addDeviceStatusListener();
        IActionBar.DefaultImpls.setStartView$default(this, 0, eoi.d, null, new View.OnClickListener() { // from class: swd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JustDanceControlActivity.onCreate$lambda$0(this.f34054a, view);
            }
        }, 5, null);
        ((t9n) getMBinding()).e0.setOnToucheAreaListener(new Function1() { // from class: uwd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return JustDanceControlActivity.onCreate$lambda$1(this.f36214a, ((Integer) obj).intValue());
            }
        });
        ((t9n) getMBinding()).R.setLayoutManager(new LinearLayoutManager(this, 0, false));
        ((t9n) getMBinding()).S.setOnPauseSliderTriggerListener(new Function0() { // from class: vwd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JustDanceControlActivity.onCreate$lambda$2(this.f37303a);
            }
        });
        ((t9n) getMBinding()).O.setOnClickListener(new View.OnClickListener() { // from class: wwd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JustDanceControlActivity.onCreate$lambda$3(this.f38426a, view);
            }
        });
        ((t9n) getMBinding()).W.setOnClickListener(new View.OnClickListener() { // from class: xwd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JustDanceControlActivity.onCreate$lambda$5(this.f39532a, view);
            }
        });
        ((t9n) getMBinding()).T.setOnClickListener(new View.OnClickListener() { // from class: ywd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JustDanceControlActivity.onCreate$lambda$6(this.f40639a, view);
            }
        });
        ((t9n) getMBinding()).Z.setOnClickListener(new View.OnClickListener() { // from class: dwd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JustDanceControlActivity.onCreate$lambda$7(this.f15987a, view);
            }
        });
        ((t9n) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: ewd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JustDanceControlActivity.onCreate$lambda$8(this.f17127a, view);
            }
        });
        ((t9n) getMBinding()).C.setOnClickAreaListener(new Function1() { // from class: fwd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return JustDanceControlActivity.onCreate$lambda$9(this.f18316a, ((Integer) obj).intValue());
            }
        });
        ((t9n) getMBinding()).i0.setOnClickListener(new View.OnClickListener() { // from class: gwd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JustDanceControlActivity.onCreate$lambda$10(this.f19397a, view);
            }
        });
        computeQRCode();
        ((JustDanceControlViewModel) getMViewModel()).getRecordEmitter().observe(this, new JustDanceControlActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: twd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return JustDanceControlActivity.onCreate$lambda$11(this.f35132a, (Long) obj);
            }
        }));
        JustDanceControlActivity$receiver$1 justDanceControlActivity$receiver$1 = this.receiver;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        Unit unit = Unit.INSTANCE;
        registerReceiver(justDanceControlActivity$receiver$1, intentFilter);
        ((JustDanceControlViewModel) getMViewModel()).getMModel().getNightMode().set(UIUtils.isNightMode(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.view.justdance.control.Hilt_JustDanceControlActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.receiver);
        ((JustDanceControlViewModel) getMViewModel()).destroyWebSocket();
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(this.deviceStatusListener);
        this.mHandler.removeCallbacksAndMessages(null);
    }
}
