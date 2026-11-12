package com.mi.fitness.checkupdate.ui.bluetooth;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.mi.fitness.checkupdate.model.LatestVersion;
import com.mi.fitness.checkupdate.ota.OtaResultTrack;
import com.mi.fitness.checkupdate.ui.UpgradeSettingFragment;
import com.mi.fitness.checkupdate.ui.bluetooth.BluetoothUpgradeFragment;
import com.mi.fitness.checkupdate.util.CheckUpdatePreferenceSupport;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.a4i;
import defpackage.av6;
import defpackage.gpi;
import defpackage.hv3;
import defpackage.lwi;
import defpackage.yyi;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 C2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001CB\u0007¢\u0006\u0004\bB\u0010\u0011J#\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\rJ#\u0010\u000f\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\tJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00072\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010$\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0007H\u0016¢\u0006\u0004\b&\u0010\u0011J\u001d\u0010*\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\n¢\u0006\u0004\b*\u0010+JG\u00102\u001a\u00020\u00072\b\b\u0001\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u00042\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00070.2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00070.¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0007H\u0014¢\u0006\u0004\b4\u0010\u0011J\u000f\u00105\u001a\u00020'H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0007H\u0014¢\u0006\u0004\b7\u0010\u0011J\u000f\u00108\u001a\u00020\u0007H\u0014¢\u0006\u0004\b8\u0010\u0011J\r\u00109\u001a\u00020\u0007¢\u0006\u0004\b9\u0010\u0011R\u0016\u0010:\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006D"}, d2 = {"Lcom/mi/fitness/checkupdate/ui/bluetooth/BluetoothUpgradeFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/mi/fitness/checkupdate/ui/bluetooth/BluetoothUpgradeViewModel;", "Lhv3;", "", "version", "log", "", "handleNoUpdate", "(Ljava/lang/String;Ljava/lang/String;)V", "", "percent", "handleUpdateProgress", "(I)V", "handleDownloadProgress", "handleNewVersion", "doDownload", "()V", "Lkotlin/Function0;", "block", "showMobileNetWorkDialogIfNeed", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/view/View;", "anchor", "", "menuList", "showPopUpMenu", "(Landroid/content/Context;Landroid/view/View;Ljava/util/List;)V", "context", "onAttach", "(Landroid/content/Context;)V", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "", "result", "code", "updateFirmware", "(ZI)V", "title", "message", "Lkotlin/Function1;", "Landroid/content/DialogInterface;", "positiveClick", "negativeClick", "showDialog", "(ILjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "setListener", "onBackPressed", "()Z", "onVisible", "onInvisible", "goToVersionHistoryList", "isFirmWareUpdating", "Z", "", "mBluetoothUpgradeFragmentVisibleTime", "J", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBluetoothUpgradeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothUpgradeFragment.kt\ncom/mi/fitness/checkupdate/ui/bluetooth/BluetoothUpgradeFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,463:1\n1872#2,3:464\n1#3:467\n*S KotlinDebug\n*F\n+ 1 BluetoothUpgradeFragment.kt\ncom/mi/fitness/checkupdate/ui/bluetooth/BluetoothUpgradeFragment\n*L\n426#1:464,3\n*E\n"})
public final class BluetoothUpgradeFragment extends BaseBindingFragment<BluetoothUpgradeViewModel, hv3> {

    @NotNull
    public static final String KEY_LATEST_VERSION = "key_latest_version";

    @NotNull
    public static final String KEY_SD_UPGRADE_PATH = "key_sd_upgrade_path";
    private boolean isFirmWareUpdating;
    private long mBluetoothUpgradeFragmentVisibleTime;

    /* JADX WARN: Multi-variable type inference failed */
    private final void doDownload() {
        if (((BluetoothUpgradeViewModel) getMViewModel()).isFirmwareDownLoaded()) {
            this.isFirmWareUpdating = true;
            ((BluetoothUpgradeViewModel) getMViewModel()).installFirmWare();
        } else if (NetworkExtKt.isNetworkAvailable()) {
            showMobileNetWorkDialogIfNeed(new Function0() { // from class: m33
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BluetoothUpgradeFragment.doDownload$lambda$12(this.f25701a);
                }
            });
        } else {
            ToastUtil.showShortToast(yyi.common_hint_network_unavailable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit doDownload$lambda$12(BluetoothUpgradeFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMBinding().F.setVisibility(0);
        this$0.getMBinding().L.setVisibility(0);
        this$0.getMBinding().K.setEnabled(false);
        this$0.getMBinding().K.setText(yyi.g0);
        ((BluetoothUpgradeViewModel) this$0.getMViewModel()).downLoadFirmWareAndUpdate();
        return Unit.INSTANCE;
    }

    private final void handleDownloadProgress(int percent) {
        if (percent == -1) {
            getMBinding().L.setVisibility(8);
            getMBinding().F.setVisibility(8);
            getMBinding().K.setVisibility(0);
            getMBinding().K.setEnabled(true);
            getMBinding().K.setText(yyi.common_retry);
            getMBinding().K.setKeepScreenOn(false);
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastLong(context, yyi.j0);
                return;
            }
            return;
        }
        if (percent == 100) {
            getMBinding().L.setVisibility(8);
            getMBinding().F.setVisibility(8);
            getMBinding().K.setVisibility(0);
            getMBinding().K.setEnabled(true);
            getMBinding().K.setText(yyi.E);
            getMBinding().K.setKeepScreenOn(false);
            return;
        }
        getMBinding().F.setVisibility(0);
        getMBinding().L.setVisibility(0);
        getMBinding().K.setVisibility(8);
        getMBinding().K.setEnabled(false);
        getMBinding().K.setText(yyi.g0);
        getMBinding().L.setProgress(percent);
        getMBinding().F.setText(getString(yyi.o0, Integer.valueOf(percent)));
    }

    private final void handleNewVersion(String version, String log) {
        getMBinding().G.setImageResource(gpi.f19216b);
        getMBinding().M.setText((version == null || version.length() == 0) ? "" : version);
        getMBinding().D.setText(getString(yyi.P, version));
        getMBinding().H.setText(yyi.i0);
        getMBinding().B.setText(log);
        getMBinding().K.setText(yyi.p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleNoUpdate(String version, String log) {
        getMBinding().G.setImageResource(gpi.f19216b);
        getMBinding().M.setText((version == null || version.length() == 0) ? "" : ((BluetoothUpgradeViewModel) getMViewModel()).getCurrentVersion());
        TextView statusInfo = getMBinding().H;
        Intrinsics.checkNotNullExpressionValue(statusInfo, "statusInfo");
        ViewExtKt.visible(statusInfo);
        getMBinding().H.setText(getString(yyi.O));
        getMBinding().D.setText(getString(yyi.P, version));
        TextView changeLogTitle = getMBinding().D;
        Intrinsics.checkNotNullExpressionValue(changeLogTitle, "changeLogTitle");
        ViewExtKt.visible(changeLogTitle);
        getMBinding().B.setText(log);
        TextView changeLog = getMBinding().B;
        Intrinsics.checkNotNullExpressionValue(changeLog, "changeLog");
        ViewExtKt.visible(changeLog);
        TextView upgradeBtn = getMBinding().K;
        Intrinsics.checkNotNullExpressionValue(upgradeBtn, "upgradeBtn");
        ViewExtKt.gone(upgradeBtn);
    }

    private final void handleUpdateProgress(int percent) {
        if (percent != 0) {
            getMBinding().F.setVisibility(0);
            getMBinding().L.setVisibility(0);
            getMBinding().K.setVisibility(8);
            getMBinding().K.setEnabled(false);
            getMBinding().K.setText(yyi.E);
            getMBinding().L.setProgress(percent);
            getMBinding().I.setVisibility(0);
            getMBinding().F.setText(getString(yyi.C, Integer.valueOf(percent)));
            return;
        }
        this.isFirmWareUpdating = true;
        getMBinding().F.setVisibility(0);
        getMBinding().L.setVisibility(0);
        getMBinding().L.setProgress(0);
        getMBinding().K.setVisibility(8);
        getMBinding().K.setEnabled(false);
        getMBinding().K.setText(yyi.E);
        getMBinding().K.setKeepScreenOn(true);
        getMBinding().I.setVisibility(0);
        getMBinding().F.setText(getString(yyi.I));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(BluetoothUpgradeFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(str);
        if (str.length() > 0) {
            this$0.handleNewVersion("999.999.999", "SD本地版本更新");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(BluetoothUpgradeFragment this$0, LatestVersion latestVersion) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (latestVersion.getIsNeedUpdate()) {
            this$0.handleNewVersion(latestVersion.getVersion(), latestVersion.getChangeLog());
            if (latestVersion.getForce()) {
                this$0.hideBack();
                this$0.doDownload();
            }
        } else {
            this$0.handleNoUpdate(latestVersion.getVersion(), latestVersion.getChangeLog());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(BluetoothUpgradeFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(num);
        this$0.handleDownloadProgress(num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(BluetoothUpgradeFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(BaseFragment.TAG, "otaProgressLiveData " + num);
        Intrinsics.checkNotNull(num);
        this$0.handleUpdateProgress(num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(BluetoothUpgradeFragment this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateFirmware(((Boolean) pair.getFirst()).booleanValue(), ((Number) pair.getSecond()).intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7(final BluetoothUpgradeFragment this$0, final List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View endView$default = IActionBar.DefaultImpls.setEndView$default(this$0, 0, gpi.e, this$0.getString(yyi.p0), new View.OnClickListener() { // from class: c33
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BluetoothUpgradeFragment.onViewCreated$lambda$7$lambda$6(this.f4880a, list, view);
            }
        }, 1, null);
        if (endView$default != null) {
            ExtUtilsKt.setVisible(endView$default, list.size() > 0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$7$lambda$6(BluetoothUpgradeFragment this$0, List list, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            Intrinsics.checkNotNull(view);
            Intrinsics.checkNotNull(list);
            this$0.showPopUpMenu(mActivity, view, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$11(BluetoothUpgradeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected()) {
            this$0.doDownload();
            return;
        }
        Context context = this$0.getContext();
        if (context != null) {
            ToastExtKt.toastLong(context, yyi.h);
        }
    }

    private final void showMobileNetWorkDialogIfNeed(final Function0<Unit> block) {
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            if (!NetUtil.INSTANCE.isMobileAva(mActivity)) {
                Logger.i(BaseFragment.TAG, "check Network is WIFI net, do Download");
                if (block != null) {
                    block.invoke();
                    return;
                }
                return;
            }
            Logger.i(BaseFragment.TAG, "check Network is Mobile net, Show Dialog");
            CommonDialog commonDialogCreate = new CommonDialog.c("update Mobile Network").setDialogTitle(yyi.T).setDialogDescription(yyi.S).setNegativeText(yyi.e).setPositiveText(yyi.g).create();
            Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.mi.fitness.checkupdate.ui.bluetooth.BluetoothUpgradeFragment$showMobileNetWorkDialogIfNeed$1$1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                    Intrinsics.checkNotNullParameter(dialog, "dialog");
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -2) {
                        dialog.dismiss();
                        return;
                    }
                    if (which != -1) {
                        return;
                    }
                    Logger.i(BaseFragment.TAG, "check Network is Mobile net, confirm do Download");
                    if (!NetworkExtKt.isNetworkAvailable()) {
                        ToastUtil.showShortToast(yyi.common_hint_network_unavailable);
                        return;
                    }
                    Function0<Unit> function0 = block;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            });
            commonDialogCreate.showIfNeed(getChildFragmentManager());
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
            menuD.add(0, iIntValue, i, ((BluetoothUpgradeViewModel) getMViewModel()).getMenuTitle(iIntValue));
            i = i2;
        }
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: com.mi.fitness.checkupdate.ui.bluetooth.BluetoothUpgradeFragment.showPopUpMenu.2
            @Override // a4i.c
            public boolean onMenuItemClick(MenuItem menuItem) {
                if (menuItem == null) {
                    return false;
                }
                BluetoothUpgradeFragment bluetoothUpgradeFragment = BluetoothUpgradeFragment.this;
                int itemId = menuItem.getItemId();
                if (itemId == 1) {
                    bluetoothUpgradeFragment.goToVersionHistoryList();
                    return true;
                }
                if (itemId != 2) {
                    return false;
                }
                BaseFragmentExKt.gotoPage(bluetoothUpgradeFragment, UpgradeSettingFragment.class, null);
                return true;
            }
        });
        a4iVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateFirmware$lambda$10(DialogInterface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateFirmware$lambda$8(BluetoothUpgradeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            mActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateFirmware$lambda$9(DialogInterface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return lwi.f25498a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void goToVersionHistoryList() {
        String versionHistoryH5Url = ((BluetoothUpgradeViewModel) getMViewModel()).getVersionHistoryH5Url();
        if (versionHistoryH5Url.length() > 0) {
            WebViewUtilKt.startWebView$default(versionHistoryH5Url, getString(yyi.X), false, false, null, false, null, false, 252, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ((BluetoothUpgradeViewModel) getMViewModel()).attach(getArguments());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        LatestVersion value;
        LatestVersion value2;
        if (((BluetoothUpgradeViewModel) getMViewModel()).getLatestVersionLiveData().getValue() != null && (value = ((BluetoothUpgradeViewModel) getMViewModel()).getLatestVersionLiveData().getValue()) != null && value.getForce() && (value2 = ((BluetoothUpgradeViewModel) getMViewModel()).getLatestVersionLiveData().getValue()) != null && value2.getIsNeedUpdate()) {
            return true;
        }
        if (!this.isFirmWareUpdating) {
            return super.onBackPressed();
        }
        Context context = getContext();
        if (context != null) {
            ToastExtKt.toastLong(context, yyi.u);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Logger.i("BluetoothUpgrade", "onDestroyView");
        ((BluetoothUpgradeViewModel) getMViewModel()).getLatestVersionLiveData().removeObservers(getViewLifecycleOwner());
        ((BluetoothUpgradeViewModel) getMViewModel()).getSdUpgradePathLiveData().removeObservers(getViewLifecycleOwner());
        ((BluetoothUpgradeViewModel) getMViewModel()).getDownloadProgressLiveData().removeObservers(getViewLifecycleOwner());
        ((BluetoothUpgradeViewModel) getMViewModel()).getOtaProgressLiveData().removeObservers(getViewLifecycleOwner());
        ((BluetoothUpgradeViewModel) getMViewModel()).getUpdateFirmwareLiveData().removeObservers(getViewLifecycleOwner());
        ((BluetoothUpgradeViewModel) getMViewModel()).getSupportSilentOtaSetting().removeObservers(getViewLifecycleOwner());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            this.mBluetoothUpgradeFragmentVisibleTime = 0L;
            return;
        }
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("c_pa_v3", "56.51.1.1.21561"), "name", "check_update_detail_page", "title", getString(yyi.f), "duration_sec", Long.valueOf((System.currentTimeMillis() - this.mBluetoothUpgradeFragmentVisibleTime) / ((long) 1000)), "device_model", DeviceModelExtKt.getModel(wearableDeviceModel));
        ((BluetoothUpgradeViewModel) getMViewModel()).notifyUpgradeVisibility(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Logger.i("BluetoothUpgrade", "onViewCreated");
        setTitle(yyi.f);
        ((BluetoothUpgradeViewModel) getMViewModel()).getSdUpgradePathLiveData().observe(getViewLifecycleOwner(), new BluetoothUpgradeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: g33
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BluetoothUpgradeFragment.onViewCreated$lambda$0(this.f18538a, (String) obj);
            }
        }));
        ((BluetoothUpgradeViewModel) getMViewModel()).getLatestVersionLiveData().observe(getViewLifecycleOwner(), new BluetoothUpgradeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: h33
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BluetoothUpgradeFragment.onViewCreated$lambda$1(this.f19641a, (LatestVersion) obj);
            }
        }));
        ((BluetoothUpgradeViewModel) getMViewModel()).getDownloadProgressLiveData().observe(getViewLifecycleOwner(), new BluetoothUpgradeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: i33
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BluetoothUpgradeFragment.onViewCreated$lambda$2(this.f20726a, (Integer) obj);
            }
        }));
        ((BluetoothUpgradeViewModel) getMViewModel()).getOtaProgressLiveData().observe(getViewLifecycleOwner(), new BluetoothUpgradeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: j33
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BluetoothUpgradeFragment.onViewCreated$lambda$3(this.f22369a, (Integer) obj);
            }
        }));
        ((BluetoothUpgradeViewModel) getMViewModel()).getUpdateFirmwareLiveData().observe(getViewLifecycleOwner(), new BluetoothUpgradeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: k33
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BluetoothUpgradeFragment.onViewCreated$lambda$4(this.f23374a, (Pair) obj);
            }
        }));
        ((BluetoothUpgradeViewModel) getMViewModel()).getMenuList().observe(getViewLifecycleOwner(), new BluetoothUpgradeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: l33
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BluetoothUpgradeFragment.onViewCreated$lambda$7(this.f24592a, (List) obj);
            }
        }));
        ((BluetoothUpgradeViewModel) getMViewModel()).supportSilentOta();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        this.mBluetoothUpgradeFragmentVisibleTime = System.currentTimeMillis();
        ((BluetoothUpgradeViewModel) getMViewModel()).notifyUpgradeVisibility(true);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        getMBinding().K.setOnClickListener(new View.OnClickListener() { // from class: d33
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BluetoothUpgradeFragment.setListener$lambda$11(this.f15026a, view);
            }
        });
    }

    public final void showDialog(int title, @NotNull String message, @NotNull Function1<? super DialogInterface, Unit> positiveClick, @NotNull Function1<? super DialogInterface, Unit> negativeClick) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(positiveClick, "positiveClick");
        Intrinsics.checkNotNullParameter(negativeClick, "negativeClick");
        new CommonDialog.c("commonDialog").setDialogTitle(title).setDialogDescriptionString(new DialogParams.DialogDescriptionString(message)).setNegativeText(yyi.e).setPositiveText(yyi.g).create().addDialogCallback(new av6() { // from class: com.mi.fitness.checkupdate.ui.bluetooth.BluetoothUpgradeFragment.showDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else if (which == -1 && dialog != null) {
                    dialog.dismiss();
                }
            }
        }).show(getChildFragmentManager(), "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateFirmware(boolean result, int code) {
        String model;
        String version;
        String firmwareVersion;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        Pair<Integer, String> otaFailReason = ((BluetoothUpgradeViewModel) getMViewModel()).getOtaFailReason(result, code);
        OtaResultTrack otaResultTrack = OtaResultTrack.INSTANCE;
        if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
            model = "";
        }
        String str = (wearableDeviceModel == null || (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel)) == null) ? "" : firmwareVersion;
        LatestVersion value = ((BluetoothUpgradeViewModel) getMViewModel()).getLatestVersionLiveData().getValue();
        otaResultTrack.otaFinish(result, model, str, (value == null || (version = value.getVersion()) == null) ? "" : version, (64 & 16) != 0 ? 0 : otaFailReason.getFirst().intValue(), (64 & 32) != 0 ? "" : otaFailReason.getSecond(), (64 & 64) != 0 ? 0 : 0);
        getMBinding().K.setKeepScreenOn(false);
        if (result) {
            WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
            if (wearableDeviceModel2 == null) {
                return;
            }
            LatestVersion value2 = ((BluetoothUpgradeViewModel) getMViewModel()).getLatestVersionLiveData().getValue();
            if ((value2 != null ? value2.getVersion() : null) != null) {
                wearableDeviceModel2.getDeviceInfo().setFirmwareVersion(value2.getVersion());
                CheckUpdatePreferenceSupport.INSTANCE.saveLatestVersion(wearableDeviceModel2.getDid(), value2.getVersion());
                Logger.d("|Version|" + value2.getVersion(), new Object[0]);
            }
            getMBinding().G.setImageResource(gpi.d);
            getMBinding().H.setText(yyi.D);
            getMBinding().K.setVisibility(0);
            getMBinding().K.setEnabled(true);
            getMBinding().K.setText(yyi.common_complete);
            getMBinding().K.setOnClickListener(new View.OnClickListener() { // from class: b33
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BluetoothUpgradeFragment.updateFirmware$lambda$8(this.f3738a, view);
                }
            });
            new CommonDialog.c("commonDialog").setDialogTitle(yyi.f40689b).setDialogDescription(yyi.f40688a).setNeutralText(yyi.g).create().addDialogCallback(new av6() { // from class: com.mi.fitness.checkupdate.ui.bluetooth.BluetoothUpgradeFragment.updateFirmware.2
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -3) {
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        FragmentActivity activity = BluetoothUpgradeFragment.this.getActivity();
                        if (activity != null) {
                            activity.finish();
                        }
                    }
                }
            }).show(getChildFragmentManager(), "");
            return;
        }
        this.isFirmWareUpdating = false;
        getMBinding().L.setVisibility(8);
        getMBinding().I.setVisibility(8);
        getMBinding().F.setVisibility(8);
        getMBinding().K.setVisibility(0);
        getMBinding().K.setEnabled(true);
        getMBinding().K.setText(yyi.E);
        if (code == -2) {
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, yyi.n0);
            }
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        if (code == 5) {
            getMBinding().K.setText(yyi.common_retry);
            Context context2 = getContext();
            if (context2 != null) {
                ToastExtKt.toastShort(context2, yyi.l0);
                return;
            }
            return;
        }
        if (code == 7) {
            int i = yyi.c;
            String string = getString(yyi.d, Integer.valueOf(((BluetoothUpgradeViewModel) getMViewModel()).getMinBattery()));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            showDialog(i, string, new Function1() { // from class: e33
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BluetoothUpgradeFragment.updateFirmware$lambda$9((DialogInterface) obj);
                }
            }, new Function1() { // from class: f33
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BluetoothUpgradeFragment.updateFirmware$lambda$10((DialogInterface) obj);
                }
            });
            return;
        }
        if (code == 8) {
            Context context3 = getContext();
            if (context3 != null) {
                ToastExtKt.toastShort(context3, yyi.h0);
                return;
            }
            return;
        }
        getMBinding().K.setText(yyi.common_retry);
        Context context4 = getContext();
        if (context4 != null) {
            ToastExtKt.toastShort(context4, yyi.k0);
        }
    }
}
