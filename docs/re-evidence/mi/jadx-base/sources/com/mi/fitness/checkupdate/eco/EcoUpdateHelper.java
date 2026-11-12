package com.mi.fitness.checkupdate.eco;

import android.content.Context;
import androidx.core.os.BundleKt;
import com.mi.fitness.checkupdate.eco.EcoUpdateHelper;
import com.mi.fitness.checkupdate.eco.bluetooth.EcoBluetoothUpgradeFragment;
import com.mi.fitness.checkupdate.eco.util.EcoDeviceSender;
import com.mi.fitness.checkupdate.model.LatestVersion;
import com.mi.fitness.checkupdate.net.CheckUpdateRequest;
import com.mi.fitness.checkupdate.util.CheckUpdatePreferenceSupport;
import com.mi.fitness.checkupdate.util.CheckUpdateUtil;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppVersionUtil;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.net.response.ApiException;
import dagger.hilt.android.EntryPointAccessors;
import defpackage.dih;
import defpackage.pb2;
import defpackage.two;
import java.io.Serializable;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001(B\t\b\u0002¢\u0006\u0004\b&\u0010'JO\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0001\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019JM\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/mi/fitness/checkupdate/eco/EcoUpdateHelper;", "", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "deviceModel", "", "firmwareVersion", "localSportType", "Lkotlin/Function1;", "Ljava/io/Serializable;", "", "success", "Lcom/xiaomi/fitness/net/response/ApiException;", "error", "requestRopeLatestVersion", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "reportEcoDeviceFirmwareVersion", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "", "strId", "showToast", "(Landroid/content/Context;I)V", "result", "goRopeUpgradeFragment", "(Landroid/content/Context;Ljava/io/Serializable;Ljava/lang/String;)V", "Ltwo;", "deviceInfo", "doCheckRopeUpdate", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;Ltwo;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "TAG", "Ljava/lang/String;", "Lcom/mi/fitness/checkupdate/net/CheckUpdateRequest;", "checkUpdateRequest$delegate", "Lkotlin/Lazy;", "getCheckUpdateRequest", "()Lcom/mi/fitness/checkupdate/net/CheckUpdateRequest;", "checkUpdateRequest", "<init>", "()V", "UpdateRequestPoint", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EcoUpdateHelper {

    @NotNull
    public static final String TAG = "EcoUpdateHelper";

    @NotNull
    public static final EcoUpdateHelper INSTANCE = new EcoUpdateHelper();

    /* JADX INFO: renamed from: checkUpdateRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy checkUpdateRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: nz7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoUpdateHelper.checkUpdateRequest_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/mi/fitness/checkupdate/eco/EcoUpdateHelper$UpdateRequestPoint;", "", "getCheckUpdateRequest", "Lcom/mi/fitness/checkupdate/net/CheckUpdateRequest;", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface UpdateRequestPoint {
        @NotNull
        CheckUpdateRequest getCheckUpdateRequest();
    }

    private EcoUpdateHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckUpdateRequest checkUpdateRequest_delegate$lambda$0() {
        return ((UpdateRequestPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), UpdateRequestPoint.class)).getCheckUpdateRequest();
    }

    private final CheckUpdateRequest getCheckUpdateRequest() {
        return (CheckUpdateRequest) checkUpdateRequest.getValue();
    }

    private final void reportEcoDeviceFirmwareVersion(EcoDeviceModel deviceModel, String firmwareVersion) {
        getCheckUpdateRequest().reportDeviceInfo(deviceModel.getDid(), firmwareVersion, new Function1() { // from class: lz7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoUpdateHelper.reportEcoDeviceFirmwareVersion$lambda$4((pb2) obj);
            }
        }, new Function1() { // from class: mz7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoUpdateHelper.reportEcoDeviceFirmwareVersion$lambda$5((Exception) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reportEcoDeviceFirmwareVersion$lambda$4(pb2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "reportEcoDeviceFirmwareVersion: " + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reportEcoDeviceFirmwareVersion$lambda$5(Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "reportEcoDeviceFirmwareVersion: " + it.getMessage());
        it.printStackTrace();
        return Unit.INSTANCE;
    }

    private final void requestRopeLatestVersion(EcoDeviceModel deviceModel, final String firmwareVersion, final String localSportType, final Function1<? super Serializable, Unit> success, final Function1<? super ApiException, Unit> error) {
        getCheckUpdateRequest().getLatestVersion("", EcoDeviceModelExtKt.getModel(deviceModel), AppVersionUtil.INSTANCE.getAppVersionCode(), firmwareVersion, new Function1() { // from class: oz7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoUpdateHelper.requestRopeLatestVersion$lambda$2(localSportType, firmwareVersion, success, (LatestVersion) obj);
            }
        }, new Function1() { // from class: pz7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoUpdateHelper.requestRopeLatestVersion$lambda$3(error, (ApiException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestRopeLatestVersion$lambda$2(String localSportType, String firmwareVersion, Function1 success, LatestVersion result) {
        EcoDeviceInfo deviceInfo;
        List listSplit$default;
        Intrinsics.checkNotNullParameter(localSportType, "$localSportType");
        Intrinsics.checkNotNullParameter(firmwareVersion, "$firmwareVersion");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(result, "result");
        Logger.i(TAG, "requestRopeLatestVersion getLatestVersion success " + result);
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(localSportType);
        if (result.isValid()) {
            String version = result.getVersion();
            boolean z = false;
            String str = (version == null || (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) version, new String[]{RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR}, false, 0, 6, (Object) null)) == null) ? null : (String) listSplit$default.get(0);
            if (CheckUpdateUtil.INSTANCE.compareFirmwareVersion2(str, firmwareVersion) > 0) {
                if (result.getForce() && str != null) {
                    EcoDeviceSender.INSTANCE.notifyEcoForceUpgrade(localDeviceModel != null ? localDeviceModel.getDid() : null, str);
                }
                if (localDeviceModel != null && (deviceInfo = localDeviceModel.getDeviceInfo()) != null) {
                    deviceInfo.updateFirmwareUpgradeTipTimestamp();
                }
                z = true;
            }
            result.setNeedUpdate(z);
        }
        success.invoke2(result);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestRopeLatestVersion$lambda$3(Function1 error, ApiException exception) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Logger.i(TAG, "requestRopeLatestVersion failed:" + exception);
        error.invoke2(exception);
        return Unit.INSTANCE;
    }

    public final void doCheckRopeUpdate(@NotNull EcoDeviceModel deviceModel, @NotNull two deviceInfo, @NotNull String localSportType, @NotNull Function1<? super Serializable, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(localSportType, "localSportType");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        CheckUpdatePreferenceSupport.INSTANCE.saveLatestVersion(deviceModel.getDid(), deviceInfo.d);
        String firmwareVersion = deviceInfo.d;
        Intrinsics.checkNotNullExpressionValue(firmwareVersion, "firmwareVersion");
        requestRopeLatestVersion(deviceModel, firmwareVersion, localSportType, success, error);
        String firmwareVersion2 = deviceInfo.d;
        Intrinsics.checkNotNullExpressionValue(firmwareVersion2, "firmwareVersion");
        reportEcoDeviceFirmwareVersion(deviceModel, firmwareVersion2);
    }

    public final void goRopeUpgradeFragment(@Nullable Context context, @NotNull Serializable result, @NotNull String localSportType) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(localSportType, "localSportType");
        if (result instanceof LatestVersion) {
            dih.a().e(context, new FragmentParams.b().c(BundleKt.bundleOf(new Pair("key_latest_version", result), new Pair(EcoBluetoothUpgradeFragment.LOCAL_SPORT_TYPE, localSportType))).e(EcoBluetoothUpgradeFragment.class).b());
        }
    }

    public final void showToast(@Nullable Context context, int strId) {
        if (context != null) {
            ToastExtKt.toastShort(context, strId);
        }
    }
}
