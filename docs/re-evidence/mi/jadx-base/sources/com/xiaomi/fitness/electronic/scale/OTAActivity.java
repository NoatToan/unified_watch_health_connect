package com.xiaomi.fitness.electronic.scale;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.configwifi.WifiPBApi;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.electronic.scale.OTAActivity;
import com.xiaomi.fitness.electronic.scale.event.ScaleEventBusIds;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.electronic.scale.model.DeviceVersionInfo;
import com.xiaomi.fitness.electronic.scale.model.LocalDeviceUpgradeModel;
import com.xiaomi.fitness.electronic.scale.request.OTARequest;
import com.xiaomi.fitness.electronic.scale.request.OTARequestKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.av1;
import defpackage.av6;
import defpackage.cz7;
import defpackage.dk0;
import defpackage.f4b;
import defpackage.gui;
import defpackage.jz7;
import defpackage.ld8;
import defpackage.t48;
import defpackage.u7r;
import defpackage.uno;
import defpackage.zzi;
import java.io.Serializable;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Route(path = ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_OTA)
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\b\u0007\u0018\u0000 O2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002OPB\u0007¢\u0006\u0004\bN\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u001b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u0006J\u000f\u0010\u001c\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u0006J\u0019\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0014¢\u0006\u0004\b!\u0010\u0006J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0016\u0010)\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0016\u0010*\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0018\u00103\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101R\u0016\u00104\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010+R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010E\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010'R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010HR\u0014\u0010K\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010J¨\u0006Q"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/OTAActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/electronic/scale/OTAViewModel;", "Ldk0;", "", "initView", "()V", "", "configWifi", "()Z", "batteryEnough", "showOTAFail", "", BroadcastsKt.SILENT_PUSHING_PROGRESS, "handleProgress", "(I)V", "checkUpdateStatusScheduled", "Landroid/os/Handler;", "handler", "Lcom/xiaomi/fitness/electronic/scale/OTAActivity$ProgressCallback;", "callback", "checkStatus", "(Landroid/os/Handler;Lcom/xiaomi/fitness/electronic/scale/OTAActivity$ProgressCallback;)V", "startUpdate", "showPushFinishDialog", "showLowBatteryDialog", "showConfigWifiDialog", "getWifiByPb", "isTimeOut", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnBatteryChangeEvent;", "event", "onBatteryChange", "(Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnBatteryChangeEvent;)V", "waitFirmwareReportCurrentVersion", "Z", "everRetry", "wifiIsConfigured", "preProgress", "I", "Lcom/xiaomi/fitness/electronic/scale/model/LocalDeviceUpgradeModel$CheckUpgradeRequest;", "latestVersion", "Lcom/xiaomi/fitness/electronic/scale/model/LocalDeviceUpgradeModel$CheckUpgradeRequest;", "", "did", "Ljava/lang/String;", "didOnly", "mDeviceDid", Column.BATTERY, "Lcom/xiaomi/fitness/electronic/scale/request/OTARequest;", "mRequest$delegate", "Lkotlin/Lazy;", "getMRequest", "()Lcom/xiaomi/fitness/electronic/scale/request/OTARequest;", "mRequest", "Ljava/util/TimerTask;", "timerTask", "Ljava/util/TimerTask;", "Ljava/util/Timer;", "timer", "Ljava/util/Timer;", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "mDeviceModel", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "", "startUpdateTime", "J", "isTimeOutDialogShowed", "Landroid/os/Handler;", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "ProgressCallback", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nOTAActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OTAActivity.kt\ncom/xiaomi/fitness/electronic/scale/OTAActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,495:1\n1#2:496\n*E\n"})
public final class OTAActivity extends BaseBindingActivity<OTAViewModel, dk0> {
    public static final long CHECK_INTERVAL = 3000;
    public static final int OTA_SUCCESS = 5;
    public static final int PROGRESS_STATUS = 1;
    public static final int SHOW_DOWNLOADING = 4;
    public static final int SHOW_OTA_FAIL = 3;

    @NotNull
    public static final String TAG = "OTAActivity";
    public static final int UPDATE_RELEASE_INFO = 2;
    private int battery;

    @Nullable
    private String did;

    @Nullable
    private String didOnly;
    private boolean everRetry;
    private boolean isTimeOutDialogShowed;

    @Nullable
    private LocalDeviceUpgradeModel.CheckUpgradeRequest latestVersion;

    @Nullable
    private String mDeviceDid;
    private EcoDeviceModel mDeviceModel;

    @Nullable
    private TimerTask timerTask;
    private boolean waitFirmwareReportCurrentVersion;
    private boolean wifiIsConfigured;
    private int preProgress = -1;

    /* JADX INFO: renamed from: mRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: h3h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OTAActivity.mRequest_delegate$lambda$0();
        }
    });

    @NotNull
    private final Timer timer = new Timer();
    private long startUpdateTime = -1;

    @NotNull
    private final Handler handler = new OTAActivity$handler$1(this, Looper.getMainLooper());

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/OTAActivity$ProgressCallback;", "", "onResultProgress", "", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ProgressCallback {
        void onResultProgress(int progress);
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.OTAActivity$checkStatus$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/xiaomi/fitness/electronic/scale/OTAActivity$checkStatus$1", "Ljava/util/TimerTask;", "run", "", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 extends TimerTask {
        final /* synthetic */ ProgressCallback $callback;
        final /* synthetic */ Handler $handler;

        public AnonymousClass1(Handler handler, ProgressCallback progressCallback) {
            this.$handler = handler;
            this.$callback = progressCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
        public static final Unit run$lambda$2$lambda$1(OTAActivity this$0, Handler handler, ProgressCallback callback, DeviceVersionInfo deviceVersionInfo) {
            boolean z;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(handler, "$handler");
            Intrinsics.checkNotNullParameter(callback, "$callback");
            if (deviceVersionInfo != null) {
                boolean z2 = this$0.latestVersion == null;
                Serializable versionInfo = deviceVersionInfo.getVersionInfo();
                Intrinsics.checkNotNull(versionInfo, "null cannot be cast to non-null type com.xiaomi.fitness.electronic.scale.model.LocalDeviceUpgradeModel.CheckUpgradeRequest");
                this$0.latestVersion = (LocalDeviceUpgradeModel.CheckUpgradeRequest) versionInfo;
                OTALogExtKt.logi("checkStatus", "upgrade info: " + f4b.c(this$0.latestVersion));
                if (z2) {
                    Message message = new Message();
                    message.what = 2;
                    handler.sendMessage(message);
                    LocalDeviceUpgradeModel.CheckUpgradeRequest checkUpgradeRequest = this$0.latestVersion;
                    if (checkUpgradeRequest != null && checkUpgradeRequest.isDownloading()) {
                        Message message2 = new Message();
                        message2.what = 4;
                        handler.sendMessage(message2);
                    }
                    String str = t48.c().f34293a;
                    LocalDeviceUpgradeModel.CheckUpgradeRequest checkUpgradeRequest2 = this$0.latestVersion;
                    String currentVersion = checkUpgradeRequest2 != null ? checkUpgradeRequest2.getCurrentVersion(str) : null;
                    if (currentVersion == null || currentVersion.length() == 0) {
                        z = false;
                    } else {
                        LocalDeviceUpgradeModel.CheckUpgradeRequest checkUpgradeRequest3 = this$0.latestVersion;
                        String currentVersion2 = checkUpgradeRequest3 != null ? checkUpgradeRequest3.getCurrentVersion(str) : null;
                        LocalDeviceUpgradeModel.CheckUpgradeRequest checkUpgradeRequest4 = this$0.latestVersion;
                        if (Intrinsics.areEqual(currentVersion2, checkUpgradeRequest4 != null ? checkUpgradeRequest4.latestVersion : null)) {
                            z = false;
                        } else {
                            z = true;
                        }
                    }
                    this$0.waitFirmwareReportCurrentVersion = z;
                }
                if (this$0.latestVersion != null) {
                    LocalDeviceUpgradeModel.CheckUpgradeRequest checkUpgradeRequest5 = this$0.latestVersion;
                    Intrinsics.checkNotNull(checkUpgradeRequest5, "null cannot be cast to non-null type com.xiaomi.fitness.electronic.scale.model.LocalDeviceUpgradeModel.CheckUpgradeRequest");
                    if (checkUpgradeRequest5.isOTAFail()) {
                        Message message3 = new Message();
                        message3.what = 3;
                        handler.sendMessage(message3);
                    } else {
                        if (this$0.waitFirmwareReportCurrentVersion && Intrinsics.areEqual(checkUpgradeRequest5.getCurrentVersion(t48.c().f34293a), checkUpgradeRequest5.latestVersion)) {
                            Message message4 = new Message();
                            message4.what = 5;
                            handler.sendMessage(message4);
                            this$0.waitFirmwareReportCurrentVersion = false;
                        }
                        int i = checkUpgradeRequest5.progress;
                        callback.onResultProgress(i);
                        Message message5 = new Message();
                        message5.what = 1;
                        message5.arg1 = i;
                        handler.sendMessage(message5);
                    }
                }
            } else {
                OTALogExtKt.loge("OTAActivity check download status failed");
            }
            return Unit.INSTANCE;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            String str = OTAActivity.this.did;
            if (str != null) {
                final OTAActivity oTAActivity = OTAActivity.this;
                final Handler handler = this.$handler;
                final ProgressCallback progressCallback = this.$callback;
                oTAActivity.getMRequest().getDeviceVersionInfo(str, new Function1() { // from class: i3h
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return OTAActivity.AnonymousClass1.run$lambda$2$lambda$1(oTAActivity, handler, progressCallback, (DeviceVersionInfo) obj);
                    }
                });
            }
        }
    }

    private final boolean batteryEnough() {
        return this.battery > 30;
    }

    private final void checkStatus(Handler handler, ProgressCallback callback) {
        if (this.timerTask != null) {
            return;
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(handler, callback);
        this.timerTask = anonymousClass1;
        this.timer.schedule(anonymousClass1, 0L, 3000L);
    }

    private final void checkUpdateStatusScheduled() {
        OTALogExtKt.logi(TAG, "checkUpdateStatusScheduled");
        checkStatus(this.handler, new ProgressCallback() { // from class: com.xiaomi.fitness.electronic.scale.OTAActivity.checkUpdateStatusScheduled.1
            @Override // com.xiaomi.fitness.electronic.scale.OTAActivity.ProgressCallback
            public void onResultProgress(int progress) {
            }
        });
    }

    /* JADX INFO: renamed from: configWifi, reason: from getter */
    private final boolean getWifiIsConfigured() {
        return this.wifiIsConfigured;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OTARequest getMRequest() {
        return (OTARequest) this.mRequest.getValue();
    }

    private final void getWifiByPb() {
        String str = this.did;
        if (str == null) {
            OTALogExtKt.loge(TAG, "getWifiByPb, did == null");
            return;
        }
        WifiPBApi wifiPBApi = WifiPBApi.INSTANCE;
        Intrinsics.checkNotNull(str);
        wifiPBApi.getWifi(str, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.electronic.scale.OTAActivity.getWifiByPb.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                OTALogExtKt.logi(OTAActivity.TAG, "getWifiByPb, onError, did: " + did + " , type: " + type + ", code: " + code + " " + WifiPBApi.INSTANCE.toStrErrorCode(code));
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            @SuppressLint({"SetTextI18n"})
            public void onSuccess(String did, int type, EcoSyncResult result) {
                u7r packet;
                cz7 cz7VarP;
                jz7 jz7VarT;
                OTALogExtKt.logi(OTAActivity.TAG, "getWifiByPb, onSuccess, result" + f4b.c(result));
                OTAActivity oTAActivity = OTAActivity.this;
                boolean z = false;
                if (result != null && (packet = result.getPacket()) != null && (cz7VarP = packet.p()) != null && (jz7VarT = cz7VarP.t()) != null && WifiStatusExtKt.isConfigured(jz7VarT)) {
                    z = true;
                }
                oTAActivity.wifiIsConfigured = z;
                if (OTAActivity.this.wifiIsConfigured) {
                    return;
                }
                OTAActivity.this.showConfigWifiDialog();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleProgress(int progress) {
        if (progress < 0 || progress > 100) {
            return;
        }
        getMBinding().I.setText(String.valueOf(progress));
        getMBinding().G.setProgress(progress);
        this.preProgress = progress;
    }

    private final void initView() {
        setTitle(zzi.k4);
        this.battery = getIntent().getIntExtra(ElectronicScaleManagerExtKt.PARAM_BATTERY, 0);
        getMBinding().O.setOnClickListener(new View.OnClickListener() { // from class: d3h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OTAActivity.initView$lambda$1(this.f15035a, view);
            }
        });
        getMBinding().N.setOnClickListener(new View.OnClickListener() { // from class: e3h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OTAActivity.initView$lambda$2(this.f16222a, view);
            }
        });
        getMBinding().H.setOnClickListener(new View.OnClickListener() { // from class: f3h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OTAActivity.initView$lambda$3(this.f17364a, view);
            }
        });
        String stringExtra = getIntent().getStringExtra(ElectronicScaleManagerExtKt.PARAM_ONlY_DID);
        this.didOnly = stringExtra;
        if (stringExtra == null || stringExtra.length() == 0) {
            String stringExtra2 = getIntent().getStringExtra("did");
            this.mDeviceDid = stringExtra2;
            OTALogExtKt.logi(TAG, "device did : " + stringExtra2);
            String str = this.mDeviceDid;
            EcoDeviceModel ecoDeviceModel = null;
            EcoDeviceModel ecoDeviceModel2 = str != null ? (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(str) : null;
            Intrinsics.checkNotNull(ecoDeviceModel2);
            this.mDeviceModel = ecoDeviceModel2;
            if (ecoDeviceModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDeviceModel");
            } else {
                ecoDeviceModel = ecoDeviceModel2;
            }
            this.did = ecoDeviceModel.getDid();
        } else {
            String str2 = this.didOnly;
            Intrinsics.checkNotNull(str2, "null cannot be cast to non-null type kotlin.String");
            this.did = str2;
        }
        checkUpdateStatusScheduled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(OTAActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.batteryEnough()) {
            this$0.showLowBatteryDialog();
        } else {
            if (!this$0.getWifiIsConfigured()) {
                this$0.showConfigWifiDialog();
                return;
            }
            this$0.getMBinding().F.setVisibility(8);
            this$0.getMBinding().E.setVisibility(0);
            this$0.startUpdate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(OTAActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startUpdate();
        LinearLayout llOtaFail = this$0.getMBinding().C;
        Intrinsics.checkNotNullExpressionValue(llOtaFail, "llOtaFail");
        ViewExtKt.setVisible(llOtaFail, false);
        LinearLayout llVersionInfo = this$0.getMBinding().F;
        Intrinsics.checkNotNullExpressionValue(llVersionInfo, "llVersionInfo");
        ViewExtKt.setVisible(llVersionInfo, true);
        this$0.everRetry = false;
        this$0.preProgress = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(OTAActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) OTAHelpActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void isTimeOut() {
        if (this.startUpdateTime == -1 || this.isTimeOutDialogShowed) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Logger.i(TAG, "isTimeOut disTime : " + (jCurrentTimeMillis - this.startUpdateTime));
        if (jCurrentTimeMillis - this.startUpdateTime >= 480000) {
            this.isTimeOutDialogShowed = true;
            new CommonDialog.c("timeout").setDialogTitle(zzi.e1).setDialogDescription(zzi.v4).setNeutralText(zzi.n4).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.OTAActivity.isTimeOut.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -3) {
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        OTAActivity.this.finish();
                    }
                }
            }).show(getSupportFragmentManager(), "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OTARequest mRequest_delegate$lambda$0() {
        return OTARequestKt.getInstance(OTARequest.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showConfigWifiDialog() {
        new CommonDialog.c("commonDialog").setDialogTitle(zzi.B0).setDialogDescription(zzi.l4).setNegativeText(zzi.f41831b).setPositiveText(zzi.f41833r).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.OTAActivity.showConfigWifiDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    OTAActivity.this.finish();
                } else {
                    if (which != -1) {
                        return;
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    ElectronicScaleManager electronicScaleManagerExtKt = ElectronicScaleManagerExtKt.getInstance(ElectronicScaleManager.INSTANCE);
                    OTAActivity oTAActivity = OTAActivity.this;
                    electronicScaleManagerExtKt.startConfigWifiActivity(oTAActivity, oTAActivity.mDeviceDid, null);
                    OTAActivity.this.finish();
                }
            }
        }).show(getSupportFragmentManager(), "");
    }

    private final void showLowBatteryDialog() {
        new CommonDialog.c("commonDialog").setDialogTitle(zzi.q4).setDialogDescription(zzi.r4).setNeutralText(zzi.n4).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.OTAActivity.showLowBatteryDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which != -3 || dialog == null) {
                    return;
                }
                dialog.dismiss();
            }
        }).show(getSupportFragmentManager(), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showOTAFail() {
        RelativeLayout llUpgrading = getMBinding().E;
        Intrinsics.checkNotNullExpressionValue(llUpgrading, "llUpgrading");
        ViewExtKt.setVisible(llUpgrading, false);
        LinearLayout llVersionInfo = getMBinding().F;
        Intrinsics.checkNotNullExpressionValue(llVersionInfo, "llVersionInfo");
        ViewExtKt.setVisible(llVersionInfo, false);
        LinearLayout llOtaFail = getMBinding().C;
        Intrinsics.checkNotNullExpressionValue(llOtaFail, "llOtaFail");
        ViewExtKt.setVisible(llOtaFail, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPushFinishDialog() {
        new CommonDialog.c("commonDialog").setDialogTitle(zzi.s4).setDialogDescription(zzi.t4).setNeutralText(zzi.n4).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.OTAActivity.showPushFinishDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which != -3 || dialog == null) {
                    return;
                }
                dialog.dismiss();
            }
        }).show(getSupportFragmentManager(), "");
    }

    private final void startUpdate() {
        if (!NetworkExtKt.isNetworkAvailable()) {
            ToastUtil.showShortToast(getResources().getString(zzi.g4));
            return;
        }
        String str = this.did;
        if (str != null) {
            getMRequest().updateFirmware(str, new Function2() { // from class: g3h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OTAActivity.startUpdate$lambda$7$lambda$6(this.f18550a, ((Boolean) obj).booleanValue(), (ApiException) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startUpdate$lambda$7$lambda$6(OTAActivity this$0, boolean z, ApiException apiException) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OTALogExtKt.loge(TAG, "startUpdate success: " + z + ", throwable: " + apiException);
        if (z) {
            this$0.startUpdateTime = System.currentTimeMillis();
            return Unit.INSTANCE;
        }
        if (this$0.everRetry) {
            Message message = new Message();
            message.what = 3;
            this$0.handler.sendMessage(message);
        } else {
            this$0.startUpdate();
            this$0.everRetry = true;
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return gui.n;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return av1.f3479a;
    }

    @uno(threadMode = ThreadMode.MAIN)
    public final void onBatteryChange(@NotNull ScaleEventBusIds.OnBatteryChangeEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Logger.i(TAG, "onBatteryChange : " + event.getBattery());
        this.battery = event.getBattery();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ld8.c().p(this);
        initView();
        getWifiByPb();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ld8.c().r(this);
        TimerTask timerTask = this.timerTask;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.timer.cancel();
        this.handler.removeCallbacksAndMessages(null);
    }
}
