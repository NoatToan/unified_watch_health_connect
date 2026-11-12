package com.mi.fitness.checkupdate.ui.huami;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.mi.fitness.checkupdate.model.OtaUpgradeResult;
import com.mi.fitness.checkupdate.ota.DownloadListener;
import com.mi.fitness.checkupdate.ota.OtaResultTrack;
import com.mi.fitness.checkupdate.ota.SilentUpgradeExtKt;
import com.mi.fitness.checkupdate.ui.huami.HuamiUpgradeViewModel;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.sdk.fw.FwType;
import com.xiaomi.hm.health.bt.sdk.fw.IFirmwareProgressCallback;
import com.xiaomi.wearable.hm.BroadcastsKt;
import com.xiaomi.wearable.hm.HuamiDataWrapper;
import com.xiaomi.wearable.hm.p;
import defpackage.yyi;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 F2\u00020\u0001:\u0002FGB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020+H\u0002J\u0012\u0010-\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u0004\u0018\u000101J\u0006\u00102\u001a\u00020\fJ\u0006\u00103\u001a\u00020+J\u0006\u00104\u001a\u00020+J\u0006\u00105\u001a\u00020+J\u0006\u00106\u001a\u00020+J\u000e\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0011J\u0018\u0010:\u001a\u0002082\u0006\u0010;\u001a\u00020\u00122\b\u00109\u001a\u0004\u0018\u00010\u0011J\u0006\u0010<\u001a\u00020+J\u0006\u0010=\u001a\u00020+J\u0010\u0010>\u001a\u00020+2\u0006\u0010?\u001a\u00020\u0012H\u0002J\u000e\u0010@\u001a\u0002082\u0006\u0010A\u001a\u00020\u0012J\u0006\u0010B\u001a\u000208J\u0010\u0010C\u001a\u00020+2\u0006\u0010D\u001a\u00020EH\u0016R\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR%\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\bR#\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\bR\u0019\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\bR\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR!\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b!\u0010\bR+\u0010$\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0012 &*\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010%0%0\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\bR\u0012\u0010(\u001a\u00060)R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/mi/fitness/checkupdate/ui/huami/HuamiUpgradeViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "otaUpgradeResultLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/mi/fitness/checkupdate/model/OtaUpgradeResult;", "getOtaUpgradeResultLiveData", "()Landroidx/lifecycle/MutableLiveData;", "huamiOtaHelper", "Lcom/mi/fitness/checkupdate/ui/huami/HuamiOtaManager;", "isFailure", "", "downloadCompletedLiveData", "getDownloadCompletedLiveData", "downloadProgressLiveData", "Lkotlin/Pair;", "Lcom/xiaomi/hm/health/bt/sdk/fw/FwType;", "", "getDownloadProgressLiveData", "updateProgressLiveData", "getUpdateProgressLiveData", "updateFailureLiveData", "getUpdateFailureLiveData", "updatePreConditionLiveData", "getUpdatePreConditionLiveData", "updateFinishLiveData", "getUpdateFinishLiveData", "mainHandler", "Landroid/os/Handler;", "getMainHandler", "()Landroid/os/Handler;", "supportSilentOtaSetting", "getSupportSilentOtaSetting", "supportSilentOtaSetting$delegate", "Lkotlin/Lazy;", "menuList", "", "kotlin.jvm.PlatformType", "getMenuList", "upgradeProgressReceiver", "Lcom/mi/fitness/checkupdate/ui/huami/HuamiUpgradeViewModel$ProgressReceiver;", "registerSilentUpgradeReceiver", "", "unregisterSilentUpgradeReceiver", "attach", "savedInstanceState", "Landroid/os/Bundle;", "getHuamiApi", "Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "isDownloadPrepared", "startDownload", "retryUpdate", "startUpdate", "cancelUpdate", "getFirmWareUpdateName", "", "fwType", "getFirmWareVersionInfo", "versionExpression", "startDeviceUpgrade", "supportSilentOta", "menuAddItem", "tag", "getMenuTitle", "itemId", "getVersionHistoryH5Url", LifecycleConstantKt.ON_DESTROY, CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "Companion", "ProgressReceiver", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HuamiUpgradeViewModel extends AbsViewModel {
    public static final int MENU_ITEM_HISTORY = 1;
    public static final int MENU_ITEM_SILENT_OTA = 2;

    @Nullable
    private HuamiOtaManager huamiOtaHelper;
    private boolean isFailure;

    @NotNull
    private final MutableLiveData<OtaUpgradeResult> otaUpgradeResultLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Boolean> downloadCompletedLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Pair<FwType, Integer>> downloadProgressLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Pair<FwType, Integer>> updateProgressLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<FwType> updateFailureLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Integer> updatePreConditionLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Boolean> updateFinishLiveData = new MutableLiveData<>();

    @NotNull
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: supportSilentOtaSetting$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy supportSilentOtaSetting = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: inc
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HuamiUpgradeViewModel.supportSilentOtaSetting_delegate$lambda$0();
        }
    });

    @NotNull
    private final MutableLiveData<List<Integer>> menuList = new MutableLiveData<>(new ArrayList());

    @NotNull
    private final ProgressReceiver upgradeProgressReceiver = new ProgressReceiver();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lcom/mi/fitness/checkupdate/ui/huami/HuamiUpgradeViewModel$ProgressReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lcom/mi/fitness/checkupdate/ui/huami/HuamiUpgradeViewModel;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class ProgressReceiver extends BroadcastReceiver {
        public ProgressReceiver() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            String action;
            if (intent == null || (action = intent.getAction()) == null || !Intrinsics.areEqual(action, BroadcastsKt.SILENT_PUSHING_ACTION)) {
            }
            Logger.i(HuamiUpgradeFragment.TAG, "onReceive() called with: context = " + context + ", intent = " + intent);
            String stringExtra = intent.getStringExtra("state");
            if (stringExtra != null) {
                switch (stringExtra.hashCode()) {
                    case -1274442605:
                        if (stringExtra.equals("finish")) {
                            Logger.i(HuamiUpgradeFragment.TAG, "onFwFinish");
                            HuamiUpgradeViewModel.this.getUpdateFinishLiveData().postValue(Boolean.TRUE);
                            HuamiUpgradeViewModel.this.startDeviceUpgrade();
                            break;
                        }
                        break;
                    case -1001078227:
                        if (stringExtra.equals(BroadcastsKt.SILENT_PUSHING_PROGRESS)) {
                            Serializable serializableExtra = intent.getSerializableExtra(BroadcastsKt.SILENT_PUSHING_PROGRESS);
                            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.profile.mili.model.Progress");
                            Progress progress = (Progress) serializableExtra;
                            Serializable serializableExtra2 = intent.getSerializableExtra("fw_type");
                            Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.sdk.fw.FwType");
                            Logger.i(HuamiUpgradeFragment.TAG, "onFwProgress " + progress.getPercent());
                            HuamiUpgradeViewModel.this.getUpdateProgressLiveData().postValue(new Pair<>((FwType) serializableExtra2, Integer.valueOf(progress.getPercent())));
                            break;
                        }
                        break;
                    case 3540994:
                        if (stringExtra.equals(BroadcastsKt.SILENT_PUSHING_STOP)) {
                            boolean booleanExtra = intent.getBooleanExtra("result", false);
                            Serializable serializableExtra3 = intent.getSerializableExtra("fw_type");
                            Intrinsics.checkNotNull(serializableExtra3, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.sdk.fw.FwType");
                            FwType fwType = (FwType) serializableExtra3;
                            Logger.i(HuamiUpgradeFragment.TAG, "onFwStop " + booleanExtra);
                            if (!booleanExtra) {
                                HuamiUpgradeViewModel.this.getUpdateFailureLiveData().postValue(fwType);
                            }
                            break;
                        }
                        break;
                    case 96784904:
                        if (stringExtra.equals("error")) {
                            HuamiUpgradeViewModel.this.getUpdatePreConditionLiveData().postValue(0);
                            break;
                        }
                        break;
                }
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FwType.values().length];
            try {
                iArr[FwType.FIRMWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FwType.FONT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FwType.FIRMWARE_GPS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FwType.RESOURCE_BASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FwType.RESOURCE_COMPRESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.mi.fitness.checkupdate.ui.huami.HuamiUpgradeViewModel$startUpdate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016¨\u0006\u0012"}, d2 = {"com/mi/fitness/checkupdate/ui/huami/HuamiUpgradeViewModel$startUpdate$1", "Lcom/xiaomi/hm/health/bt/sdk/fw/IFirmwareProgressCallback;", "onFwStart", "", "fwType", "Lcom/xiaomi/hm/health/bt/sdk/fw/FwType;", "onFwStop", "result", "", "onFwProgress", BroadcastsKt.SILENT_PUSHING_PROGRESS, "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "onFwFinish", "onCancel", "onError", "errorCode", "", "onTransmissionFinish", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C13811 implements IFirmwareProgressCallback {
        final /* synthetic */ WearableDeviceModel $deviceModel;
        final /* synthetic */ HuamiUpgradeViewModel this$0;

        public C13811(WearableDeviceModel wearableDeviceModel, HuamiUpgradeViewModel huamiUpgradeViewModel) {
            this.$deviceModel = wearableDeviceModel;
            this.this$0 = huamiUpgradeViewModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onFwFinish$lambda$2(HuamiUpgradeViewModel this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.getUpdateFinishLiveData().setValue(Boolean.TRUE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onFwProgress$lambda$1(HuamiUpgradeViewModel this$0, FwType fwType, Progress progress) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(fwType, "$fwType");
            Intrinsics.checkNotNullParameter(progress, "$progress");
            this$0.getUpdateProgressLiveData().setValue(new Pair<>(fwType, Integer.valueOf(progress.getPercent())));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onFwStop$lambda$0(HuamiUpgradeViewModel this$0, FwType fwType) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.getUpdateFailureLiveData().setValue(fwType);
        }

        @Override // com.xiaomi.hm.health.bt.sdk.fw.IFirmwareProgressCallback
        public void onCancel() {
        }

        @Override // com.xiaomi.hm.health.bt.sdk.fw.IFirmwareProgressCallback
        public void onError(int errorCode) {
            Logger.i(HuamiUpgradeFragment.TAG, "onError() called with: errorCode = " + errorCode);
            this.this$0.getUpdatePreConditionLiveData().postValue(Integer.valueOf(errorCode));
        }

        @Override // com.xiaomi.hm.health.bt.sdk.fw.IFirmwareProgressCallback
        public void onFwFinish() {
            String firmwareVersion;
            Logger.i(HuamiUpgradeFragment.TAG, "onFwFinish");
            OtaResultTrack otaResultTrack = OtaResultTrack.INSTANCE;
            String model = DeviceModelExtKt.getModel(this.$deviceModel);
            String firmwareVersion2 = DeviceModelExtKt.getFirmwareVersion(this.$deviceModel);
            String str = firmwareVersion2 == null ? "" : firmwareVersion2;
            OtaUpgradeResult value = this.this$0.getOtaUpgradeResultLiveData().getValue();
            otaResultTrack.otaFinish(true, model, str, (value == null || (firmwareVersion = value.getFirmwareVersion()) == null) ? "" : firmwareVersion, (64 & 16) != 0 ? 0 : 0, (64 & 32) != 0 ? "" : null, (64 & 64) != 0 ? 0 : 0);
            Handler mainHandler = this.this$0.getMainHandler();
            final HuamiUpgradeViewModel huamiUpgradeViewModel = this.this$0;
            mainHandler.post(new Runnable() { // from class: lnc
                @Override // java.lang.Runnable
                public final void run() {
                    HuamiUpgradeViewModel.C13811.onFwFinish$lambda$2(huamiUpgradeViewModel);
                }
            });
        }

        @Override // com.xiaomi.hm.health.bt.sdk.fw.IFirmwareProgressCallback
        public void onFwProgress(final Progress progress, final FwType fwType) {
            Intrinsics.checkNotNullParameter(progress, "progress");
            Intrinsics.checkNotNullParameter(fwType, "fwType");
            Logger.i(HuamiUpgradeFragment.TAG, "onFwProgress " + progress.getPercent());
            Handler mainHandler = this.this$0.getMainHandler();
            final HuamiUpgradeViewModel huamiUpgradeViewModel = this.this$0;
            mainHandler.post(new Runnable() { // from class: jnc
                @Override // java.lang.Runnable
                public final void run() {
                    HuamiUpgradeViewModel.C13811.onFwProgress$lambda$1(huamiUpgradeViewModel, fwType, progress);
                }
            });
        }

        @Override // com.xiaomi.hm.health.bt.sdk.fw.IFirmwareProgressCallback
        public void onFwStart(FwType fwType) {
        }

        @Override // com.xiaomi.hm.health.bt.sdk.fw.IFirmwareProgressCallback
        public void onFwStop(boolean result, final FwType fwType) {
            String firmwareVersion;
            Logger.i(HuamiUpgradeFragment.TAG, "onFwStop " + result);
            OtaResultTrack otaResultTrack = OtaResultTrack.INSTANCE;
            String model = DeviceModelExtKt.getModel(this.$deviceModel);
            String firmwareVersion2 = DeviceModelExtKt.getFirmwareVersion(this.$deviceModel);
            String str = firmwareVersion2 == null ? "" : firmwareVersion2;
            OtaUpgradeResult value = this.this$0.getOtaUpgradeResultLiveData().getValue();
            otaResultTrack.otaFinish(false, model, str, (value == null || (firmwareVersion = value.getFirmwareVersion()) == null) ? "" : firmwareVersion, (64 & 16) != 0 ? 0 : 0, (64 & 32) != 0 ? "" : null, (64 & 64) != 0 ? 0 : 0);
            if (result) {
                return;
            }
            Handler mainHandler = this.this$0.getMainHandler();
            final HuamiUpgradeViewModel huamiUpgradeViewModel = this.this$0;
            mainHandler.post(new Runnable() { // from class: knc
                @Override // java.lang.Runnable
                public final void run() {
                    HuamiUpgradeViewModel.C13811.onFwStop$lambda$0(huamiUpgradeViewModel, fwType);
                }
            });
        }

        @Override // com.xiaomi.hm.health.bt.sdk.fw.IFirmwareProgressCallback
        public void onTransmissionFinish() {
        }
    }

    /* JADX INFO: renamed from: com.mi.fitness.checkupdate.ui.huami.HuamiUpgradeViewModel$supportSilentOta$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.fitness.checkupdate.ui.huami.HuamiUpgradeViewModel$supportSilentOta$1", f = "HuamiUpgradeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WearableDeviceModel $deviceModel;
        int label;
        final /* synthetic */ HuamiUpgradeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13821(WearableDeviceModel wearableDeviceModel, HuamiUpgradeViewModel huamiUpgradeViewModel, Continuation<? super C13821> continuation) {
            super(2, continuation);
            this.$deviceModel = wearableDeviceModel;
            this.this$0 = huamiUpgradeViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C13821(this.$deviceModel, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (SilentUpgradeExtKt.supportSilentUpgrade(this.$deviceModel)) {
                this.this$0.menuAddItem(2);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C13821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void menuAddItem(int tag) {
        List<Integer> value = this.menuList.getValue();
        if (value != null && !value.contains(Integer.valueOf(tag))) {
            value.add(Integer.valueOf(tag));
        }
        this.menuList.postValue(value);
    }

    private final void registerSilentUpgradeReceiver() {
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                ApplicationExtKt.getApplication().registerReceiver(this.upgradeProgressReceiver, new IntentFilter(BroadcastsKt.SILENT_PUSHING_ACTION), 4);
            } else {
                ApplicationExtKt.getApplication().registerReceiver(this.upgradeProgressReceiver, new IntentFilter(BroadcastsKt.SILENT_PUSHING_ACTION));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData supportSilentOtaSetting_delegate$lambda$0() {
        return new MutableLiveData();
    }

    private final void unregisterSilentUpgradeReceiver() {
        try {
            ApplicationExtKt.getApplication().unregisterReceiver(this.upgradeProgressReceiver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            return;
        }
        Object obj = savedInstanceState.get(HuamiUpgradeFragment.KEY_OTA_UPGRADE_RESULT);
        Logger.i(HuamiUpgradeFragment.TAG, "attach: otaUpgradeResult = " + obj);
        if (obj != null) {
            OtaUpgradeResult otaUpgradeResult = (OtaUpgradeResult) obj;
            this.huamiOtaHelper = new HuamiOtaManager(otaUpgradeResult);
            this.otaUpgradeResultLiveData.setValue(otaUpgradeResult);
        }
        registerSilentUpgradeReceiver();
        if (RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            menuAddItem(1);
        }
    }

    public final void cancelUpdate() {
        HuamiApiCaller huaMiApiCaller;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (huaMiApiCaller = DeviceManagerExtKt.getInstance(companion).getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel))) == null) {
            return;
        }
        huaMiApiCaller.cancelFwUpgrade();
    }

    @NotNull
    public final MutableLiveData<Boolean> getDownloadCompletedLiveData() {
        return this.downloadCompletedLiveData;
    }

    @NotNull
    public final MutableLiveData<Pair<FwType, Integer>> getDownloadProgressLiveData() {
        return this.downloadProgressLiveData;
    }

    @NotNull
    public final String getFirmWareUpdateName(@NotNull FwType fwType) {
        Intrinsics.checkNotNullParameter(fwType, "fwType");
        int i = WhenMappings.$EnumSwitchMapping$0[fwType.ordinal()];
        if (i == 1) {
            String string = ApplicationExtKt.getApplication().getString(yyi.j);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (i == 2) {
            String string2 = ApplicationExtKt.getApplication().getString(yyi.v);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i == 3) {
            String string3 = ApplicationExtKt.getApplication().getString(yyi.w);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (i != 4 && i != 5) {
            return "";
        }
        String string4 = ApplicationExtKt.getApplication().getString(yyi.F);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return string4;
    }

    @NotNull
    public final String getFirmWareVersionInfo(int versionExpression, @Nullable FwType fwType) {
        int i;
        if (versionExpression == 0) {
            i = fwType != null ? WhenMappings.$EnumSwitchMapping$0[fwType.ordinal()] : -1;
            if (i == 1) {
                String string = ApplicationExtKt.getApplication().getString(yyi.q);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            }
            if (i == 2) {
                String string2 = ApplicationExtKt.getApplication().getString(yyi.f40691r);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }
            if (i == 3) {
                String string3 = ApplicationExtKt.getApplication().getString(yyi.s);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            }
            if (i != 4 && i != 5) {
                return "";
            }
            String string4 = ApplicationExtKt.getApplication().getString(yyi.t);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return string4;
        }
        if (versionExpression == 1) {
            i = fwType != null ? WhenMappings.$EnumSwitchMapping$0[fwType.ordinal()] : -1;
            if (i == 1) {
                String string5 = ApplicationExtKt.getApplication().getString(yyi.K);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            }
            if (i == 2) {
                String string6 = ApplicationExtKt.getApplication().getString(yyi.L);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                return string6;
            }
            if (i == 3) {
                String string7 = ApplicationExtKt.getApplication().getString(yyi.M);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                return string7;
            }
            if (i != 4 && i != 5) {
                return "";
            }
            String string8 = ApplicationExtKt.getApplication().getString(yyi.N);
            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
            return string8;
        }
        if (versionExpression != 2) {
            return "";
        }
        i = fwType != null ? WhenMappings.$EnumSwitchMapping$0[fwType.ordinal()] : -1;
        if (i == 1) {
            String string9 = ApplicationExtKt.getApplication().getString(yyi.a0);
            Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
            return string9;
        }
        if (i == 2) {
            String string10 = ApplicationExtKt.getApplication().getString(yyi.b0);
            Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
            return string10;
        }
        if (i == 3) {
            String string11 = ApplicationExtKt.getApplication().getString(yyi.c0);
            Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
            return string11;
        }
        if (i != 4 && i != 5) {
            return "";
        }
        String string12 = ApplicationExtKt.getApplication().getString(yyi.d0);
        Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
        return string12;
    }

    @Nullable
    public final HuamiApiCaller getHuamiApi() {
        String mac;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(companion);
        if (wearableDeviceModel == null || (mac = DeviceModelExtKt.getMac(wearableDeviceModel)) == null) {
            mac = "";
        }
        return deviceManagerExtKt.getHuaMiApiCaller(mac);
    }

    @NotNull
    public final Handler getMainHandler() {
        return this.mainHandler;
    }

    @NotNull
    public final MutableLiveData<List<Integer>> getMenuList() {
        return this.menuList;
    }

    @NotNull
    public final String getMenuTitle(int itemId) {
        if (itemId != 1) {
            return itemId != 2 ? "" : ResourceExtKt.getString(yyi.R);
        }
        return ResourceExtKt.getString(yyi.Q);
    }

    @NotNull
    public final MutableLiveData<OtaUpgradeResult> getOtaUpgradeResultLiveData() {
        return this.otaUpgradeResultLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSupportSilentOtaSetting() {
        return (MutableLiveData) this.supportSilentOtaSetting.getValue();
    }

    @NotNull
    public final MutableLiveData<FwType> getUpdateFailureLiveData() {
        return this.updateFailureLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getUpdateFinishLiveData() {
        return this.updateFinishLiveData;
    }

    @NotNull
    public final MutableLiveData<Integer> getUpdatePreConditionLiveData() {
        return this.updatePreConditionLiveData;
    }

    @NotNull
    public final MutableLiveData<Pair<FwType, Integer>> getUpdateProgressLiveData() {
        return this.updateProgressLiveData;
    }

    @NotNull
    public final String getVersionHistoryH5Url() {
        String str;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return "";
        }
        String currentRegion = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = currentRegion.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (Intrinsics.areEqual(lowerCase, "cn")) {
            str = "";
        } else {
            str = lowerCase + ".";
        }
        String model = DeviceModelExtKt.getModel(wearableDeviceModel);
        if (model == null) {
            return "";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("https://" + str + "watch.iot.mi.com/html/appfw-versions/index.html?model=" + model + "&locale=%s", Arrays.copyOf(new Object[]{LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    public final boolean isDownloadPrepared() {
        HuamiOtaManager huamiOtaManager = this.huamiOtaHelper;
        List<HuamiUpdateInfo> updateInfoList = huamiOtaManager != null ? huamiOtaManager.getUpdateInfoList() : null;
        if (updateInfoList == null || !updateInfoList.isEmpty()) {
            return true;
        }
        ToastExtKt.toastShort(ApplicationExtKt.getApplication(), yyi.k0);
        Logger.i(HuamiUpgradeFragment.TAG, "firmware not need to update");
        return false;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        unregisterSilentUpgradeReceiver();
    }

    public final void retryUpdate() {
        HuamiApiCaller huaMiApiCaller;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (huaMiApiCaller = DeviceManagerExtKt.getInstance(companion).getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel))) == null) {
            return;
        }
        huaMiApiCaller.retryFwUpgrade();
    }

    public final void startDeviceUpgrade() {
        Logger.i(HuamiUpgradeFragment.TAG, "startDeviceUpgrade() called");
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(companion).getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel));
        Logger.i(HuamiUpgradeFragment.TAG, "startDeviceUpgrade() called device " + huaMiApiCaller);
        this.huamiOtaHelper = null;
        this.otaUpgradeResultLiveData.setValue(null);
        if (huaMiApiCaller != null) {
            huaMiApiCaller.invokeUpgrade(new p.a() { // from class: com.mi.fitness.checkupdate.ui.huami.HuamiUpgradeViewModel.startDeviceUpgrade.1
                @Override // com.xiaomi.wearable.hm.p
                public void onError(int var1) {
                    Logger.i(HuamiUpgradeFragment.TAG, "onError() called with: var1 = " + var1);
                    HuamiUpgradeViewModel.this.getUpdatePreConditionLiveData().postValue(Integer.valueOf(var1));
                }

                @Override // com.xiaomi.wearable.hm.p
                public void onFwProgressa(HuamiDataWrapper var1) {
                    Logger.i(HuamiUpgradeFragment.TAG, "onFwProgressa() called with: var1 = " + var1);
                }

                @Override // com.xiaomi.wearable.hm.p
                public void onFwStart() {
                    Logger.i(HuamiUpgradeFragment.TAG, "onFwStart() called");
                }

                @Override // com.xiaomi.wearable.hm.p
                public void onFwStopa(boolean var1) {
                    Logger.i(HuamiUpgradeFragment.TAG, "onFwStopa() called with: var1 = " + var1);
                }

                @Override // com.xiaomi.wearable.hm.p
                public void upgradingProgress(HuamiDataWrapper var1, HuamiDataWrapper var2) {
                    Logger.i(HuamiUpgradeFragment.TAG, "upgradingProgress() called with: var1 = " + var1 + ", var2 = " + var2);
                }
            });
        }
    }

    public final void startDownload() {
        Logger.i(HuamiUpgradeFragment.TAG, "startDownload: " + this.huamiOtaHelper);
        HuamiOtaManager huamiOtaManager = this.huamiOtaHelper;
        if (huamiOtaManager != null) {
            huamiOtaManager.startDownload(ViewModelKt.getViewModelScope(this), new DownloadListener() { // from class: com.mi.fitness.checkupdate.ui.huami.HuamiUpgradeViewModel.startDownload.1
                @Override // com.mi.fitness.checkupdate.ota.DownloadListener
                public void onFinish(boolean result) {
                    HuamiUpgradeViewModel.this.getDownloadCompletedLiveData().postValue(Boolean.valueOf(result));
                }

                @Override // com.mi.fitness.checkupdate.ota.DownloadListener
                public void onProgress(FwType type, int progress) {
                    HuamiUpgradeViewModel.this.getDownloadProgressLiveData().postValue(new Pair<>(type, Integer.valueOf(progress)));
                }
            });
        }
    }

    public final void startUpdate() {
        String changeLog;
        HuamiOtaManager huamiOtaManager = this.huamiOtaHelper;
        Logger.i(HuamiUpgradeFragment.TAG, "startUpdate " + (huamiOtaManager != null ? huamiOtaManager.getFirmwareUpdateMap() : null));
        HuamiOtaManager huamiOtaManager2 = this.huamiOtaHelper;
        if (huamiOtaManager2 == null) {
            Logger.i(HuamiUpgradeFragment.TAG, "startUpdate: huamiOtaHelper = null");
            return;
        }
        HashMap<FwType, String> firmwareUpdateMap = huamiOtaManager2 != null ? huamiOtaManager2.getFirmwareUpdateMap() : null;
        if (firmwareUpdateMap == null || firmwareUpdateMap.isEmpty()) {
            Logger.i(HuamiUpgradeFragment.TAG, "startUpdate: update info null");
            return;
        }
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(companion).getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel));
        OtaResultTrack.INSTANCE.otaStart();
        if (huaMiApiCaller != null) {
            OtaUpgradeResult value = this.otaUpgradeResultLiveData.getValue();
            if (value == null || (changeLog = value.getChangeLog()) == null) {
                changeLog = "";
            }
            huaMiApiCaller.updateFwUpgrade(true, 0, firmwareUpdateMap, changeLog, new C13811(wearableDeviceModel, this));
        }
    }

    public final void supportSilentOta() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C13821(wearableDeviceModel, this, null), 3, null);
    }
}
