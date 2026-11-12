package com.mi.fitness.checkupdate.eco.bluetooth;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.mi.fitness.checkupdate.eco.bluetooth.EcoBluetoothUpgradeFragment;
import com.mi.fitness.checkupdate.model.LatestVersion;
import com.mi.fitness.checkupdate.ota.OtaResultTrack;
import com.mi.fitness.checkupdate.ui.UpgradeSettingFragment;
import com.mi.fitness.checkupdate.util.CheckUpdatePreferenceSupport;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.av6;
import defpackage.gpi;
import defpackage.hv3;
import defpackage.lwi;
import defpackage.yyi;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 62\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00016B\u0007¢\u0006\u0004\b5\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJG\u0010&\u001a\u00020\u00042\b\b\u0001\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00112\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00040\"2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00040\"¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0004H\u0014¢\u0006\u0004\b(\u0010\u0006J\u000f\u0010)\u001a\u00020\u0007H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0004H\u0014¢\u0006\u0004\b+\u0010\u0006J\u000f\u0010,\u001a\u00020\u0004H\u0014¢\u0006\u0004\b,\u0010\u0006R\u0016\u0010-\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/mi/fitness/checkupdate/eco/bluetooth/EcoBluetoothUpgradeFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/mi/fitness/checkupdate/eco/bluetooth/EcoBluetoothUpgradeViewModel;", "Lhv3;", "", "handleNoUpdate", "()V", "", "result", "", "code", "updateFirmware", "(ZI)V", "percent", "handleUpdateProgress", "(I)V", "handleDownloadProgress", "", "version", "log", "handleNewVersion", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "title", "message", "Lkotlin/Function1;", "Landroid/content/DialogInterface;", "positiveClick", "negativeClick", "showDialog", "(ILjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "setListener", "onBackPressed", "()Z", "onVisible", "onInvisible", "isFirmWareUpdating", "Z", "", "mBluetoothUpgradeFragmentVisibleTime", "J", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EcoBluetoothUpgradeFragment extends BaseBindingFragment<EcoBluetoothUpgradeViewModel, hv3> {

    @NotNull
    public static final String KEY_LATEST_VERSION = "key_latest_version";

    @NotNull
    public static final String KEY_SD_UPGRADE_PATH = "key_sd_upgrade_path";

    @NotNull
    public static final String LOCAL_SPORT_TYPE = "local_sport_type";
    private boolean isFirmWareUpdating;
    private long mBluetoothUpgradeFragmentVisibleTime;

    private final void handleDownloadProgress(int percent) {
        if (percent == -1) {
            getMBinding().L.setVisibility(8);
            getMBinding().F.setVisibility(8);
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
            getMBinding().K.setEnabled(true);
            getMBinding().K.setText(yyi.E);
            getMBinding().K.setKeepScreenOn(false);
            return;
        }
        getMBinding().F.setVisibility(0);
        getMBinding().L.setVisibility(0);
        getMBinding().K.setEnabled(false);
        getMBinding().K.setText(yyi.g0);
        getMBinding().L.setProgress(percent);
        getMBinding().F.setText(getString(yyi.o0, Integer.valueOf(percent)));
    }

    private final void handleNewVersion(String version, String log) {
        getMBinding().G.setImageResource(gpi.f19216b);
        getMBinding().M.setText(version);
        getMBinding().H.setText(yyi.i0);
        getMBinding().B.setText(log);
        getMBinding().K.setText(yyi.p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleNoUpdate() {
        getMBinding().G.setImageResource(gpi.f19216b);
        getMBinding().M.setText(((EcoBluetoothUpgradeViewModel) getMViewModel()).getCurrentVersion());
        TextView statusInfo = getMBinding().H;
        Intrinsics.checkNotNullExpressionValue(statusInfo, "statusInfo");
        ViewExtKt.visible(statusInfo);
        getMBinding().H.setText(getString(yyi.O));
        TextView changeLogTitle = getMBinding().D;
        Intrinsics.checkNotNullExpressionValue(changeLogTitle, "changeLogTitle");
        ViewExtKt.gone(changeLogTitle);
        TextView changeLog = getMBinding().B;
        Intrinsics.checkNotNullExpressionValue(changeLog, "changeLog");
        ViewExtKt.gone(changeLog);
        TextView upgradeBtn = getMBinding().K;
        Intrinsics.checkNotNullExpressionValue(upgradeBtn, "upgradeBtn");
        ViewExtKt.gone(upgradeBtn);
    }

    private final void handleUpdateProgress(int percent) {
        if (percent != 0) {
            getMBinding().F.setVisibility(0);
            getMBinding().L.setVisibility(0);
            getMBinding().K.setEnabled(false);
            getMBinding().K.setText(yyi.E);
            getMBinding().L.setProgress(percent);
            getMBinding().F.setText(getString(yyi.C, Integer.valueOf(percent)));
            return;
        }
        this.isFirmWareUpdating = true;
        getMBinding().F.setVisibility(0);
        getMBinding().L.setVisibility(0);
        getMBinding().L.setProgress(0);
        getMBinding().K.setEnabled(false);
        getMBinding().K.setText(yyi.E);
        getMBinding().K.setKeepScreenOn(true);
        getMBinding().F.setText(getString(yyi.I));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(EcoBluetoothUpgradeFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(str);
        if (str.length() > 0) {
            this$0.handleNewVersion("999.999.999", "SD本地版本更新");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(EcoBluetoothUpgradeFragment this$0, LatestVersion latestVersion) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (latestVersion.getIsNeedUpdate()) {
            this$0.handleNewVersion(latestVersion.getVersion(), latestVersion.getChangeLog());
            if (latestVersion.getForce()) {
                this$0.hideBack();
            }
        } else {
            this$0.handleNoUpdate();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(EcoBluetoothUpgradeFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(num);
        this$0.handleDownloadProgress(num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(EcoBluetoothUpgradeFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(num);
        this$0.handleUpdateProgress(num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(EcoBluetoothUpgradeFragment this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateFirmware(((Boolean) pair.getFirst()).booleanValue(), ((Number) pair.getSecond()).intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(final EcoBluetoothUpgradeFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            IActionBar.DefaultImpls.setEndView$default(this$0, 0, gpi.c, null, new View.OnClickListener() { // from class: fj7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EcoBluetoothUpgradeFragment.onViewCreated$lambda$6$lambda$5(this.f17841a, view);
                }
            }, 5, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$6$lambda$5(EcoBluetoothUpgradeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoPage(this$0, UpgradeSettingFragment.class, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$10(EcoBluetoothUpgradeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcoDeviceModel deviceModel = ((EcoBluetoothUpgradeViewModel) this$0.getMViewModel()).getDeviceModel();
        if (deviceModel == null || !deviceModel.getIsDeviceConnected()) {
            Context context = this$0.getContext();
            if (context != null) {
                ToastExtKt.toastLong(context, yyi.h);
                return;
            }
            return;
        }
        if (((EcoBluetoothUpgradeViewModel) this$0.getMViewModel()).isFirmwareDownLoaded()) {
            this$0.isFirmWareUpdating = true;
            ((EcoBluetoothUpgradeViewModel) this$0.getMViewModel()).installFirmWare();
            return;
        }
        this$0.getMBinding().F.setVisibility(0);
        this$0.getMBinding().L.setVisibility(0);
        this$0.getMBinding().K.setEnabled(false);
        this$0.getMBinding().K.setText(yyi.g0);
        ((EcoBluetoothUpgradeViewModel) this$0.getMViewModel()).downLoadFirmWareAndUpdate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateFirmware(boolean result, int code) {
        String version;
        String firmwareVersion;
        String model;
        EcoDeviceModel deviceModel = ((EcoBluetoothUpgradeViewModel) getMViewModel()).getDeviceModel();
        Pair<Integer, String> otaFailReason = ((EcoBluetoothUpgradeViewModel) getMViewModel()).getOtaFailReason(result, code);
        OtaResultTrack otaResultTrack = OtaResultTrack.INSTANCE;
        String str = (deviceModel == null || (model = EcoDeviceModelExtKt.getModel(deviceModel)) == null) ? "" : model;
        String str2 = (deviceModel == null || (firmwareVersion = EcoDeviceModelExtKt.getFirmwareVersion(deviceModel)) == null) ? "" : firmwareVersion;
        LatestVersion value = ((EcoBluetoothUpgradeViewModel) getMViewModel()).getLatestVersionLiveData().getValue();
        otaResultTrack.otaFinish(result, str, str2, (value == null || (version = value.getVersion()) == null) ? "" : version, (64 & 16) != 0 ? 0 : otaFailReason.getFirst().intValue(), (64 & 32) != 0 ? "" : otaFailReason.getSecond(), (64 & 64) != 0 ? 0 : 0);
        getMBinding().K.setKeepScreenOn(false);
        if (result) {
            EcoDeviceModel deviceModel2 = ((EcoBluetoothUpgradeViewModel) getMViewModel()).getDeviceModel();
            if (deviceModel2 == null) {
                return;
            }
            LatestVersion value2 = ((EcoBluetoothUpgradeViewModel) getMViewModel()).getLatestVersionLiveData().getValue();
            if ((value2 != null ? value2.getVersion() : null) != null) {
                deviceModel2.getDeviceInfo().setFirmwareVersion(value2.getVersion());
                CheckUpdatePreferenceSupport.INSTANCE.saveLatestVersion(deviceModel2.getDid(), value2.getVersion());
                Logger.d("|Version|" + value2.getVersion(), new Object[0]);
            }
            getMBinding().G.setImageResource(gpi.d);
            getMBinding().H.setText(yyi.D);
            getMBinding().K.setEnabled(true);
            getMBinding().K.setText(yyi.common_complete);
            getMBinding().K.setOnClickListener(new View.OnClickListener() { // from class: cj7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EcoBluetoothUpgradeFragment.updateFirmware$lambda$7(this.f5397a, view);
                }
            });
            new CommonDialog.c("commonDialog").setDialogTitle(yyi.f40689b).setDialogDescription(yyi.f40688a).setNeutralText(yyi.g).create().addDialogCallback(new av6() { // from class: com.mi.fitness.checkupdate.eco.bluetooth.EcoBluetoothUpgradeFragment.updateFirmware.2
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -3) {
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        FragmentActivity activity = EcoBluetoothUpgradeFragment.this.getActivity();
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
        getMBinding().F.setVisibility(8);
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
        if (code == 7) {
            int i = yyi.c;
            String string = getString(yyi.d, Integer.valueOf(((EcoBluetoothUpgradeViewModel) getMViewModel()).getMinBattery()));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            showDialog(i, string, new Function1() { // from class: dj7
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EcoBluetoothUpgradeFragment.updateFirmware$lambda$8((DialogInterface) obj);
                }
            }, new Function1() { // from class: ej7
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EcoBluetoothUpgradeFragment.updateFirmware$lambda$9((DialogInterface) obj);
                }
            });
            return;
        }
        if (code == 8) {
            Context context2 = getContext();
            if (context2 != null) {
                ToastExtKt.toastShort(context2, yyi.h0);
                return;
            }
            return;
        }
        getMBinding().K.setText(yyi.common_retry);
        Context context3 = getContext();
        if (context3 != null) {
            ToastExtKt.toastShort(context3, yyi.k0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateFirmware$lambda$7(EcoBluetoothUpgradeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            mActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateFirmware$lambda$8(DialogInterface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
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
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ((EcoBluetoothUpgradeViewModel) getMViewModel()).attach(getArguments());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        LatestVersion value;
        if (((EcoBluetoothUpgradeViewModel) getMViewModel()).getLatestVersionLiveData().getValue() != null && (value = ((EcoBluetoothUpgradeViewModel) getMViewModel()).getLatestVersionLiveData().getValue()) != null && value.getForce()) {
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
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        if (((EcoBluetoothUpgradeViewModel) getMViewModel()).getDeviceModel() == null) {
            this.mBluetoothUpgradeFragmentVisibleTime = 0L;
            return;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.mBluetoothUpgradeFragmentVisibleTime) / ((long) 1000);
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("c_pa_v3", "56.51.1.1.21561");
        String string = getString(yyi.f);
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        EcoDeviceModel deviceModel = ((EcoBluetoothUpgradeViewModel) getMViewModel()).getDeviceModel();
        Intrinsics.checkNotNull(deviceModel);
        oneTrackExtKt.reportData(oneTrackStatBean, "name", "check_update_detail_page", "title", string, "duration_sec", lValueOf, "device_model", EcoDeviceModelExtKt.getModel(deviceModel));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(yyi.f);
        ((EcoBluetoothUpgradeViewModel) getMViewModel()).getSdUpgradePathLiveData().observe(getViewLifecycleOwner(), new EcoBluetoothUpgradeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: vi7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoBluetoothUpgradeFragment.onViewCreated$lambda$0(this.f36918a, (String) obj);
            }
        }));
        ((EcoBluetoothUpgradeViewModel) getMViewModel()).getLatestVersionLiveData().observe(getViewLifecycleOwner(), new EcoBluetoothUpgradeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: xi7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoBluetoothUpgradeFragment.onViewCreated$lambda$1(this.f39151a, (LatestVersion) obj);
            }
        }));
        ((EcoBluetoothUpgradeViewModel) getMViewModel()).getDownloadProgressLiveData().observe(getViewLifecycleOwner(), new EcoBluetoothUpgradeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: yi7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoBluetoothUpgradeFragment.onViewCreated$lambda$2(this.f40206a, (Integer) obj);
            }
        }));
        ((EcoBluetoothUpgradeViewModel) getMViewModel()).getOtaProgressLiveData().observe(getViewLifecycleOwner(), new EcoBluetoothUpgradeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: zi7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoBluetoothUpgradeFragment.onViewCreated$lambda$3(this.f41307a, (Integer) obj);
            }
        }));
        ((EcoBluetoothUpgradeViewModel) getMViewModel()).getUpdateFirmwareLiveData().observe(getViewLifecycleOwner(), new EcoBluetoothUpgradeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: aj7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoBluetoothUpgradeFragment.onViewCreated$lambda$4(this.f1084a, (Pair) obj);
            }
        }));
        ((EcoBluetoothUpgradeViewModel) getMViewModel()).getSupportSilentOtaSetting().observe(getViewLifecycleOwner(), new EcoBluetoothUpgradeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: bj7
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcoBluetoothUpgradeFragment.onViewCreated$lambda$6(this.f4278a, (Boolean) obj);
            }
        }));
        ((EcoBluetoothUpgradeViewModel) getMViewModel()).supportSilentOta();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        this.mBluetoothUpgradeFragmentVisibleTime = System.currentTimeMillis();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        getMBinding().K.setOnClickListener(new View.OnClickListener() { // from class: wi7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcoBluetoothUpgradeFragment.setListener$lambda$10(this.f37999a, view);
            }
        });
    }

    public final void showDialog(int title, @NotNull String message, @NotNull Function1<? super DialogInterface, Unit> positiveClick, @NotNull Function1<? super DialogInterface, Unit> negativeClick) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(positiveClick, "positiveClick");
        Intrinsics.checkNotNullParameter(negativeClick, "negativeClick");
        new CommonDialog.c("commonDialog").setDialogTitle(title).setDialogDescriptionString(new DialogParams.DialogDescriptionString(message)).setNegativeText(yyi.e).setPositiveText(yyi.g).create().addDialogCallback(new av6() { // from class: com.mi.fitness.checkupdate.eco.bluetooth.EcoBluetoothUpgradeFragment.showDialog.1
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
}
