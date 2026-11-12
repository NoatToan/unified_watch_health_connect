package com.mi.fitness.checkupdate.ui.huami;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.mi.fitness.checkupdate.model.OtaUpgradeResult;
import com.mi.fitness.checkupdate.ui.UpgradeSettingFragment;
import com.mi.fitness.checkupdate.ui.huami.HuamiUpgradeFragment;
import com.mi.fitness.checkupdate.util.Constants;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.hm.health.bt.sdk.data.DeviceBatteryInfo;
import com.xiaomi.hm.health.bt.sdk.fw.FwType;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.a4i;
import defpackage.av6;
import defpackage.gpi;
import defpackage.hv3;
import defpackage.lwi;
import defpackage.s33;
import defpackage.yyi;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 Y2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001YB\u0007¢\u0006\u0004\bX\u0010\u000bJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u000bJ\u000f\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ!\u0010\u0019\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u0010J-\u0010$\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0007H\u0002¢\u0006\u0004\b&\u0010\u000bJ\u0017\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b(\u0010)J!\u0010-\u001a\u00020\u00072\u0006\u0010*\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0007H\u0014¢\u0006\u0004\b/\u0010\u000bJ\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J)\u00107\u001a\u00020\u00072\u0006\u00103\u001a\u00020\r2\u0006\u00104\u001a\u00020\r2\b\u00106\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0007H\u0014¢\u0006\u0004\b9\u0010\u000bJ\u000f\u0010:\u001a\u00020\u0007H\u0016¢\u0006\u0004\b:\u0010\u000bJ\r\u0010;\u001a\u00020\u0007¢\u0006\u0004\b;\u0010\u000bJ\r\u0010<\u001a\u00020\u0007¢\u0006\u0004\b<\u0010\u000bJ\u0017\u0010=\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0007¢\u0006\u0004\b?\u0010\u000bJ\u0019\u0010B\u001a\u00020\u00072\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bB\u0010CJ)\u0010F\u001a\u00020\u00072\b\u0010A\u001a\u0004\u0018\u00010@2\u0006\u0010D\u001a\u00020\r2\u0006\u0010E\u001a\u00020\rH\u0016¢\u0006\u0004\bF\u0010GJ\u0019\u0010H\u001a\u00020\u00072\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bH\u0010CJ\u0019\u0010I\u001a\u00020\u00072\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bI\u0010CJ\u000f\u0010J\u001a\u00020\u0007H\u0014¢\u0006\u0004\bJ\u0010\u000bR\u001e\u0010M\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u001e\u0010O\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010NR\u0016\u0010P\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010S\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006Z"}, d2 = {"Lcom/mi/fitness/checkupdate/ui/huami/HuamiUpgradeFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/mi/fitness/checkupdate/ui/huami/HuamiUpgradeViewModel;", "Lhv3;", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "Lcom/mi/fitness/checkupdate/model/OtaUpgradeResult;", "latestVersion", "", "handleNoUpdate", "(Lcom/mi/fitness/checkupdate/model/OtaUpgradeResult;)V", "initOnNormal", "()V", "initOnUpgrade", "", Column.BATTERY, "onLowBattery", "(I)V", "toUpdate", "toDownload", "onDownLoadPrepare", "onDownloadComplete", "goBluetoothSettings", "Lcom/xiaomi/hm/health/bt/sdk/fw/FwType;", "fwType", BroadcastsKt.SILENT_PUSHING_PROGRESS, "handleDownloadProgress", "(Lcom/xiaomi/hm/health/bt/sdk/fw/FwType;I)V", "handleUpdateProgress", "reason", "onUpdatePreConditionError", "Landroid/content/Context;", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/view/View;", "anchor", "", "menuList", "showPopUpMenu", "(Landroid/content/Context;Landroid/view/View;Ljava/util/List;)V", "cancelDialog", "context", "onAttach", "(Landroid/content/Context;)V", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onVisible", "", "onBackPressed", "()Z", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "setListener", "onDestroyView", "onUpdatePrepare", "onUpdateFinish", "onUpdateFailure", "(Lcom/xiaomi/hm/health/bt/sdk/fw/FwType;)V", "goToVersionHistoryList", "", "did", "onConnectStart", "(Ljava/lang/String;)V", "errorCode", "retryTimes", "onConnectFailure", "(Ljava/lang/String;II)V", "onConnectSuccess", "onDisconnect", "onInvisible", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "deviceUpdateFailDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "retryDialog", "isFirmWareUpdating", "Z", "", "mHuamiUpgradeFragmentVisibleTime", "J", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nHuamiUpgradeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HuamiUpgradeFragment.kt\ncom/mi/fitness/checkupdate/ui/huami/HuamiUpgradeFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,600:1\n1872#2,3:601\n1#3:604\n*S KotlinDebug\n*F\n+ 1 HuamiUpgradeFragment.kt\ncom/mi/fitness/checkupdate/ui/huami/HuamiUpgradeFragment\n*L\n512#1:601,3\n*E\n"})
public final class HuamiUpgradeFragment extends BaseBindingFragment<HuamiUpgradeViewModel, hv3> implements OnDeviceStatusListener {

    @NotNull
    public static final String DONE_TAG = "done";

    @NotNull
    public static final String DOWNLOAD_FiNISH_TAG = "download_finish";

    @NotNull
    public static final String DOWNLOAD_TAG = "downLoad";
    public static final int FIRMWARE_DOWNLOAD = 0;
    public static final int FIRMWARE_TRANSFER = 1;
    public static final int FIRMWARE_UPDATE = 2;

    @NotNull
    public static final String KEY_OTA_UPGRADE_RESULT = "key_ota_upgrade_result";

    @NotNull
    public static final String LOW_BATTERY_TAG = "low_battery";

    @NotNull
    public static final String PUSHED_TAG = "pushed";
    public static final int REQUEST_CODE_BLUETOOTH_SETTINGS = 1006;

    @NotNull
    public static final String TAG = "HuamiCheckUpdate";

    @NotNull
    public static final String UPDATE_TAG = "update";

    @Nullable
    private CommonDialog<DialogParams> deviceUpdateFailDialog;
    private boolean isFirmWareUpdating;
    private long mHuamiUpgradeFragmentVisibleTime;

    @Nullable
    private CommonDialog<DialogParams> retryDialog;

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ HuamiUpgradeViewModel access$getMViewModel(HuamiUpgradeFragment huamiUpgradeFragment) {
        return (HuamiUpgradeViewModel) huamiUpgradeFragment.getMViewModel();
    }

    private final void cancelDialog() {
        CommonDialog<DialogParams> commonDialog;
        CommonDialog<DialogParams> commonDialog2 = this.retryDialog;
        if (commonDialog2 == null || !commonDialog2.isShowing() || (commonDialog = this.retryDialog) == null) {
            return;
        }
        commonDialog.dismiss();
    }

    private final void goBluetoothSettings() {
        Intent intent = new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.startActivityForResult(intent, 1006);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleDownloadProgress(FwType fwType, int progress) {
        Context context;
        if (progress != -1) {
            getMBinding().M.setText(((HuamiUpgradeViewModel) getMViewModel()).getFirmWareVersionInfo(0, fwType));
            getMBinding().L.setProgress(progress);
            getMBinding().F.setText(getString(yyi.o, Integer.valueOf(progress)));
            getMBinding().M.setVisibility(0);
            getMBinding().F.setVisibility(0);
            return;
        }
        getMBinding().L.setVisibility(8);
        getMBinding().F.setVisibility(8);
        getMBinding().J.setVisibility(8);
        getMBinding().K.setEnabled(true);
        getMBinding().K.setText(yyi.common_retry);
        this.isFirmWareUpdating = false;
        getMBinding().K.setKeepScreenOn(false);
        getMBinding().M.setText(yyi.n);
        getMBinding().H.setVisibility(8);
        if (fwType == null || (context = getContext()) == null) {
            return;
        }
        ToastExtKt.toastShort(context, yyi.j0);
    }

    private final void handleNoUpdate(OtaUpgradeResult latestVersion) {
        String firmwareVersion;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel)) == null) {
            firmwareVersion = "";
        }
        getMBinding().G.setImageResource(gpi.f19216b);
        getMBinding().M.setText(firmwareVersion);
        getMBinding().H.setText(getString(yyi.O));
        TextView upgradeBtn = getMBinding().K;
        Intrinsics.checkNotNullExpressionValue(upgradeBtn, "upgradeBtn");
        ViewExtKt.gone(upgradeBtn);
        TextView changeLogTitle = getMBinding().D;
        Intrinsics.checkNotNullExpressionValue(changeLogTitle, "changeLogTitle");
        ViewExtKt.visible(changeLogTitle);
        getMBinding().D.setText(getString(yyi.P, firmwareVersion));
        TextView textView = getMBinding().B;
        String changeLog = latestVersion.getChangeLog();
        textView.setText(changeLog != null ? changeLog : "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleUpdateProgress(FwType fwType, int progress) {
        Context context;
        if (progress == -1) {
            getMBinding().L.setVisibility(8);
            getMBinding().F.setVisibility(8);
            getMBinding().J.setVisibility(8);
            getMBinding().K.setEnabled(true);
            getMBinding().K.setText(yyi.common_retry);
            this.isFirmWareUpdating = false;
            getMBinding().K.setKeepScreenOn(false);
            getMBinding().M.setText(yyi.y);
            getMBinding().H.setVisibility(8);
            if (!Intrinsics.areEqual(getMBinding().K.getTag().toString(), "update") || (context = getContext()) == null) {
                return;
            }
            ToastExtKt.toastShort(context, yyi.k0);
            return;
        }
        if (progress != 100) {
            getMBinding().H.setText(getString(yyi.e0));
            getMBinding().M.setText(((HuamiUpgradeViewModel) getMViewModel()).getFirmWareVersionInfo(1, fwType));
            getMBinding().L.setVisibility(0);
            getMBinding().F.setVisibility(0);
            getMBinding().L.setProgress(progress);
            getMBinding().J.setVisibility(8);
            getMBinding().F.setText(getString(yyi.J, Integer.valueOf(progress)));
            return;
        }
        getMBinding().F.setVisibility(8);
        getMBinding().L.setProgress(100);
        getMBinding().L.setVisibility(8);
        getMBinding().M.setText(((HuamiUpgradeViewModel) getMViewModel()).getFirmWareVersionInfo(2, fwType));
        getMBinding().F.setText(getString(yyi.J, 100));
        getMBinding().H.setText(getString(yyi.z));
        getMBinding().J.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initOnNormal() {
        OtaUpgradeResult value = ((HuamiUpgradeViewModel) getMViewModel()).getOtaUpgradeResultLiveData().getValue();
        String firmwareVersion = value != null ? value.getFirmwareVersion() : null;
        getMBinding().K.setTag(DOWNLOAD_TAG);
        getMBinding().K.setEnabled(true);
        getMBinding().M.setText(firmwareVersion);
        getMBinding().H.setText(yyi.W);
        getMBinding().K.setText(yyi.p);
    }

    private final void initOnUpgrade() {
        getMBinding().K.setTag(PUSHED_TAG);
        getMBinding().K.setEnabled(true);
        getMBinding().M.setText(yyi.W);
        getMBinding().H.setText(getString(yyi.e0));
        getMBinding().H.setVisibility(8);
        getMBinding().K.setText(yyi.g0);
    }

    private final void onDownLoadPrepare() {
        this.isFirmWareUpdating = true;
        getMBinding().K.setText(yyi.common_complete);
        getMBinding().K.setEnabled(false);
        getMBinding().L.setVisibility(0);
        getMBinding().F.setVisibility(0);
        getMBinding().M.setVisibility(0);
        getMBinding().L.setProgress(0);
        getMBinding().K.setTag(DOWNLOAD_TAG);
    }

    private final void onDownloadComplete() {
        getMBinding().K.setTag(DOWNLOAD_FiNISH_TAG);
        if (s33.e()) {
            toUpdate();
        } else {
            goBluetoothSettings();
        }
    }

    private final void onLowBattery(int battery) {
        getMBinding().M.setText(yyi.B);
        getMBinding().H.setText(getString(yyi.A, Integer.valueOf(battery)));
        getMBinding().K.setText(yyi.common_known);
        getMBinding().H.setVisibility(0);
        getMBinding().K.setEnabled(true);
        getMBinding().K.setTag(LOW_BATTERY_TAG);
    }

    private final void onUpdatePreConditionError(int reason) {
        CommonDialog<DialogParams> commonDialog;
        CommonDialog<DialogParams> commonDialog2 = this.retryDialog;
        if (commonDialog2 != null && commonDialog2.isShowing() && (commonDialog = this.retryDialog) != null) {
            commonDialog.dismissAllowingStateLoss();
        }
        Pair pair = reason == 71 ? new Pair(Integer.valueOf(yyi.m), Integer.valueOf(yyi.l)) : new Pair(Integer.valueOf(yyi.y), Integer.valueOf(yyi.G));
        if (this.deviceUpdateFailDialog == null) {
            this.deviceUpdateFailDialog = new CommonDialog.c("upgradeOnErrorDialog").setDialogTitle(((Number) pair.getFirst()).intValue()).setDialogDescription(((Number) pair.getSecond()).intValue()).setPositiveText(yyi.g).create().addDialogCallback(new av6() { // from class: com.mi.fitness.checkupdate.ui.huami.HuamiUpgradeFragment.onUpdatePreConditionError.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -1) {
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        HuamiUpgradeFragment.this.finish();
                    }
                }
            });
        }
        CommonDialog<DialogParams> commonDialog3 = this.deviceUpdateFailDialog;
        if (commonDialog3 != null) {
            commonDialog3.show(getChildFragmentManager(), "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$0(HuamiUpgradeFragment this$0, OtaUpgradeResult otaUpgradeResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (otaUpgradeResult == null) {
            return Unit.INSTANCE;
        }
        if (otaUpgradeResult.isNeedUpdate()) {
            if (otaUpgradeResult.isForce()) {
                this$0.hideBack();
            }
            this$0.getMBinding().G.setImageResource(gpi.f19216b);
            this$0.getMBinding().B.setText(otaUpgradeResult.getChangeLog());
            TextView changeLogTitle = this$0.getMBinding().D;
            Intrinsics.checkNotNullExpressionValue(changeLogTitle, "changeLogTitle");
            ViewExtKt.visible(changeLogTitle);
            this$0.getMBinding().D.setText(this$0.getString(yyi.P, otaUpgradeResult.getFirmwareVersion()));
            HuamiApiCaller huamiApi = ((HuamiUpgradeViewModel) this$0.getMViewModel()).getHuamiApi();
            if (otaUpgradeResult.isForce() || huamiApi == null || !huamiApi.isSilentUpgradePushed()) {
                this$0.initOnNormal();
            } else {
                this$0.initOnUpgrade();
            }
        } else {
            this$0.handleNoUpdate(otaUpgradeResult);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(HuamiUpgradeFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            this$0.onDownloadComplete();
        } else {
            this$0.handleDownloadProgress(null, -1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$11(final HuamiUpgradeFragment this$0, final List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View endView$default = IActionBar.DefaultImpls.setEndView$default(this$0, 0, gpi.e, this$0.getString(yyi.p0), new View.OnClickListener() { // from class: wmc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HuamiUpgradeFragment.onViewCreated$lambda$11$lambda$10(this.f38125a, list, view);
            }
        }, 1, null);
        if (endView$default != null) {
            ExtUtilsKt.setVisible(endView$default, list.size() > 0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$11$lambda$10(HuamiUpgradeFragment this$0, List list, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            Intrinsics.checkNotNull(view);
            Intrinsics.checkNotNull(list);
            this$0.showPopUpMenu(mActivity, view, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(HuamiUpgradeFragment this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.handleDownloadProgress((FwType) pair.getFirst(), ((Number) pair.getSecond()).intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(HuamiUpgradeFragment this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.handleUpdateProgress((FwType) pair.getFirst(), ((Number) pair.getSecond()).intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(HuamiUpgradeFragment this$0, FwType fwType) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onUpdateFailure(fwType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5(HuamiUpgradeFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(num);
        this$0.onUpdatePreConditionError(num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(HuamiUpgradeFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onUpdateFinish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$8(final HuamiUpgradeFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            IActionBar.DefaultImpls.setEndView$default(this$0, 0, gpi.c, null, new View.OnClickListener() { // from class: zmc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HuamiUpgradeFragment.onViewCreated$lambda$8$lambda$7(this.f41457a, view);
                }
            }, 5, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$8$lambda$7(HuamiUpgradeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, UpgradeSettingFragment.class, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$12(HuamiUpgradeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object tag = this$0.getMBinding().K.getTag();
        if (StringsKt__StringsJVMKt.equals$default(tag != null ? tag.toString() : null, DOWNLOAD_TAG, false, 2, null)) {
            this$0.toDownload();
            return;
        }
        Object tag2 = this$0.getMBinding().K.getTag();
        if (!StringsKt__StringsJVMKt.equals$default(tag2 != null ? tag2.toString() : null, DONE_TAG, false, 2, null)) {
            Object tag3 = this$0.getMBinding().K.getTag();
            if (!StringsKt__StringsJVMKt.equals$default(tag3 != null ? tag3.toString() : null, LOW_BATTERY_TAG, false, 2, null)) {
                Object tag4 = this$0.getMBinding().K.getTag();
                if (!StringsKt__StringsJVMKt.equals$default(tag4 != null ? tag4.toString() : null, PUSHED_TAG, false, 2, null)) {
                    this$0.toUpdate();
                    return;
                }
                ((HuamiUpgradeViewModel) this$0.getMViewModel()).startDeviceUpgrade();
                ToastExtKt.toastLong(ApplicationExtKt.getApplication(), yyi.u);
                this$0.getMBinding().K.setTag(DONE_TAG);
                FragmentActivity activity = this$0.getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
        }
        FragmentActivity activity2 = this$0.getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showPopUpMenu(Context activity, View anchor, List<Integer> menuList) {
        a4i a4iVar = new a4i(activity, anchor);
        Menu menuD = a4iVar.d();
        int i = 0;
        for (Object obj : menuList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            int iIntValue = ((Number) obj).intValue();
            menuD.add(0, iIntValue, i, ((HuamiUpgradeViewModel) getMViewModel()).getMenuTitle(iIntValue));
            i = i2;
        }
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: com.mi.fitness.checkupdate.ui.huami.HuamiUpgradeFragment.showPopUpMenu.2
            @Override // a4i.c
            public boolean onMenuItemClick(MenuItem menuItem) {
                if (menuItem == null) {
                    return false;
                }
                HuamiUpgradeFragment huamiUpgradeFragment = HuamiUpgradeFragment.this;
                int itemId = menuItem.getItemId();
                if (itemId == 1) {
                    huamiUpgradeFragment.goToVersionHistoryList();
                    return true;
                }
                if (itemId != 2) {
                    return false;
                }
                BaseFragmentExKt.gotoPage(huamiUpgradeFragment, UpgradeSettingFragment.class, null);
                return true;
            }
        });
        a4iVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void toDownload() {
        getMBinding().F.setText(getString(yyi.H));
        getMBinding().H.setVisibility(8);
        getMBinding().F.setVisibility(0);
        if (!NetUtil.INSTANCE.getNetWorkAvailable(ApplicationExtKt.getApplication())) {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), yyi.common_hint_network_unavailable);
            handleDownloadProgress(null, -1);
        } else if (((HuamiUpgradeViewModel) getMViewModel()).isDownloadPrepared()) {
            onDownLoadPrepare();
            ((HuamiUpgradeViewModel) getMViewModel()).startDownload();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void toUpdate() {
        String string;
        Object tag = getMBinding().K.getTag();
        if (tag == null || (string = tag.toString()) == null) {
            string = "";
        }
        if (Intrinsics.areEqual(DONE_TAG, string)) {
            return;
        }
        if (Intrinsics.areEqual("update", string)) {
            Logger.d(TAG, "retry update");
            onUpdatePrepare();
            ((HuamiUpgradeViewModel) getMViewModel()).startUpdate();
        } else {
            Logger.d("HuamiCheckUpdateupdate", new Object[0]);
            onUpdatePrepare();
            ((HuamiUpgradeViewModel) getMViewModel()).startUpdate();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return lwi.f25498a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void goToVersionHistoryList() {
        String versionHistoryH5Url = ((HuamiUpgradeViewModel) getMViewModel()).getVersionHistoryH5Url();
        if (versionHistoryH5Url.length() > 0) {
            WebViewUtilKt.startWebView$default(versionHistoryH5Url, getString(yyi.X), false, false, null, false, null, false, 252, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1006) {
            if (!s33.e()) {
                ((HuamiUpgradeViewModel) getMViewModel()).cancelUpdate();
                FragmentActivity mActivity = getMActivity();
                if (mActivity != null) {
                    mActivity.finish();
                    return;
                }
                return;
            }
            cancelDialog();
            PageState.DefaultImpls.showLoading$default(this, getString(yyi.i) + Constants.ELLIPSE, 0, false, 6, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ((HuamiUpgradeViewModel) getMViewModel()).attach(getArguments());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        OtaUpgradeResult value = ((HuamiUpgradeViewModel) getMViewModel()).getOtaUpgradeResultLiveData().getValue();
        if (value != null && value.isForce()) {
            return true;
        }
        if (!this.isFirmWareUpdating) {
            return super.onBackPressed();
        }
        Context context = getContext();
        if (context != null) {
            ToastExtKt.toastShort(context, yyi.u);
        }
        return true;
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectFailure(@Nullable String did, int errorCode, int retryTimes) {
        hideLoading();
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectStart(@Nullable String did) {
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectSuccess(@Nullable String did) {
        Logger.i(TAG, "onConnectSuccess() called with: did = " + did);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && Intrinsics.areEqual(wearableDeviceModel.getDid(), did)) {
            hideLoading();
        }
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(this);
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onDisconnect(@Nullable String did) {
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            this.mHuamiUpgradeFragmentVisibleTime = 0L;
        } else {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("c_pa_v3", "56.51.1.1.21561"), "name", "check_update_detail_page", "title", getString(yyi.f), "duration_sec", Long.valueOf((System.currentTimeMillis() - this.mHuamiUpgradeFragmentVisibleTime) / ((long) 1000)), "device_model", DeviceModelExtKt.getModel(wearableDeviceModel));
        }
    }

    public final void onUpdateFailure(@Nullable FwType fwType) {
        handleUpdateProgress(fwType, -1);
        if (!s33.e()) {
            goBluetoothSettings();
            return;
        }
        if (fwType == null) {
            PageState.DefaultImpls.showLoading$default(this, getString(yyi.i) + Constants.ELLIPSE, 0, false, 6, null);
            return;
        }
        CommonDialog<DialogParams> commonDialog = this.deviceUpdateFailDialog;
        if (commonDialog != null) {
            Intrinsics.checkNotNull(commonDialog);
            if (commonDialog.isShowing()) {
                return;
            }
        }
        if (this.retryDialog == null) {
            this.retryDialog = new CommonDialog.c("commonDialog").setDialogTitle(yyi.y).setDialogDescription(yyi.G).setNegativeText(yyi.e).setPositiveText(yyi.g).create().addDialogCallback(new av6() { // from class: com.mi.fitness.checkupdate.ui.huami.HuamiUpgradeFragment.onUpdateFailure.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -2) {
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        HuamiUpgradeFragment.access$getMViewModel(HuamiUpgradeFragment.this).cancelUpdate();
                    } else {
                        if (which != -1) {
                            return;
                        }
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        HuamiUpgradeFragment.this.toUpdate();
                    }
                }
            });
        }
        CommonDialog<DialogParams> commonDialog2 = this.retryDialog;
        if (commonDialog2 != null) {
            commonDialog2.show(getChildFragmentManager(), "");
        }
    }

    public final void onUpdateFinish() {
        this.isFirmWareUpdating = false;
        getMBinding().K.setKeepScreenOn(false);
        getMBinding().L.setVisibility(8);
        getMBinding().F.setVisibility(8);
        getMBinding().K.setEnabled(true);
        getMBinding().G.setImageResource(gpi.d);
        getMBinding().J.setVisibility(8);
        getMBinding().M.setText(yyi.D);
        getMBinding().H.setVisibility(8);
        getMBinding().K.setText(yyi.common_complete);
        getMBinding().K.setTag(DONE_TAG);
    }

    public final void onUpdatePrepare() {
        this.isFirmWareUpdating = true;
        getMBinding().F.setVisibility(0);
        getMBinding().L.setVisibility(0);
        getMBinding().L.setProgress(0);
        getMBinding().K.setEnabled(false);
        getMBinding().K.setText(yyi.common_complete);
        getMBinding().M.setVisibility(0);
        getMBinding().H.setVisibility(0);
        getMBinding().K.setTag("update");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(yyi.f);
        ((HuamiUpgradeViewModel) getMViewModel()).getOtaUpgradeResultLiveData().observe(getViewLifecycleOwner(), new HuamiUpgradeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: bnc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuamiUpgradeFragment.onViewCreated$lambda$0(this.f4392a, (OtaUpgradeResult) obj);
            }
        }));
        ((HuamiUpgradeViewModel) getMViewModel()).getDownloadCompletedLiveData().observe(getViewLifecycleOwner(), new HuamiUpgradeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: cnc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuamiUpgradeFragment.onViewCreated$lambda$1(this.f5573a, (Boolean) obj);
            }
        }));
        ((HuamiUpgradeViewModel) getMViewModel()).getDownloadProgressLiveData().observe(getViewLifecycleOwner(), new HuamiUpgradeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: dnc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuamiUpgradeFragment.onViewCreated$lambda$2(this.f15717a, (Pair) obj);
            }
        }));
        ((HuamiUpgradeViewModel) getMViewModel()).getUpdateProgressLiveData().observe(getViewLifecycleOwner(), new HuamiUpgradeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: enc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuamiUpgradeFragment.onViewCreated$lambda$3(this.f16840a, (Pair) obj);
            }
        }));
        ((HuamiUpgradeViewModel) getMViewModel()).getUpdateFailureLiveData().observe(getViewLifecycleOwner(), new HuamiUpgradeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: fnc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuamiUpgradeFragment.onViewCreated$lambda$4(this.f17953a, (FwType) obj);
            }
        }));
        ((HuamiUpgradeViewModel) getMViewModel()).getUpdatePreConditionLiveData().observe(getViewLifecycleOwner(), new HuamiUpgradeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: gnc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuamiUpgradeFragment.onViewCreated$lambda$5(this.f19158a, (Integer) obj);
            }
        }));
        ((HuamiUpgradeViewModel) getMViewModel()).getUpdateFinishLiveData().observe(getViewLifecycleOwner(), new HuamiUpgradeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: hnc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuamiUpgradeFragment.onViewCreated$lambda$6(this.f20258a, (Boolean) obj);
            }
        }));
        ((HuamiUpgradeViewModel) getMViewModel()).getSupportSilentOtaSetting().observe(getViewLifecycleOwner(), new HuamiUpgradeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: xmc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuamiUpgradeFragment.onViewCreated$lambda$8(this.f39263a, (Boolean) obj);
            }
        }));
        ((HuamiUpgradeViewModel) getMViewModel()).getMenuList().observe(getViewLifecycleOwner(), new HuamiUpgradeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ymc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuamiUpgradeFragment.onViewCreated$lambda$11(this.f40322a, (List) obj);
            }
        }));
        ((HuamiUpgradeViewModel) getMViewModel()).supportSilentOta();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        DeviceBatteryInfo batteryLevel;
        super.onVisible();
        this.mHuamiUpgradeFragmentVisibleTime = System.currentTimeMillis();
        if (this.isFirmWareUpdating) {
            return;
        }
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(companion).getHuaMiApiCaller(DeviceModelExtKt.getMac(wearableDeviceModel));
        if (!wearableDeviceModel.getIsDeviceConnected()) {
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, yyi.h);
                return;
            }
            return;
        }
        int level = (huaMiApiCaller == null || (batteryLevel = huaMiApiCaller.getBatteryLevel()) == null) ? 0 : batteryLevel.getLevel();
        int i = DeviceModelExtKt.isL66(wearableDeviceModel) ? 30 : 10;
        if (level <= i) {
            onLowBattery(i);
        } else {
            if (getMBinding().K.getTag() == null || !getMBinding().K.getTag().equals(LOW_BATTERY_TAG)) {
                return;
            }
            initOnNormal();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        getMBinding().K.setOnClickListener(new View.OnClickListener() { // from class: anc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HuamiUpgradeFragment.setListener$lambda$12(this.f1236a, view);
            }
        });
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(this);
    }
}
