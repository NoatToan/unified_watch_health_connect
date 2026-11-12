package com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.hr;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.PickerDialog;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.hr.BleHrSettingFragment;
import com.xiaomi.fitness.devicesettings.common.SubTitleDialog;
import com.xiaomi.fitness.devicesettings.common.extensions.HeartRateMonitorExtKt;
import com.xiaomi.fitness.devicesettings.utils.UtilsKt;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.av9;
import defpackage.eui;
import defpackage.ls9;
import defpackage.wf6;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b)\u0010#J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJF\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0014\b\u0004\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\fH\u0082\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\rH\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\rH\u0014¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\rH\u0014¢\u0006\u0004\b%\u0010#R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/hr/BleHrSettingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/BaseHealthMonitorFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/hr/BleHrSettingViewModel;", "Lwf6;", "", "warningValue", "Lcom/xiaomi/fitness/baseui/dialog/PickerDialog;", "createSportHrWarningDialog", "(I)Lcom/xiaomi/fitness/baseui/dialog/PickerDialog;", "titleRes", "", "warningRange", "Lkotlin/Function1;", "", "onItemChooseListener", "createChooseWarningFreqDialog", "(IILjava/util/List;Lkotlin/jvm/functions/Function1;)Lcom/xiaomi/fitness/baseui/dialog/PickerDialog;", "", "checked", "onHeartHealthyCheckedChange", "(Z)V", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "createHrSettingDialog", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "isHigh", "isOpen", "showHrWarningDialog", "(IZZ)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "()V", "onVisible", "onInvisible", "", "mBleHrSettingFragmentVisibleTime", "J", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBleHrSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleHrSettingFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/hr/BleHrSettingFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,217:1\n112#1,25:218\n1557#2:243\n1628#2,3:244\n37#3:247\n36#3,3:248\n*S KotlinDebug\n*F\n+ 1 BleHrSettingFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/healthmonitor/hr/BleHrSettingFragment\n*L\n99#1:218,25\n155#1:243\n155#1:244,3\n155#1:247\n155#1:248,3\n*E\n"})
public final class BleHrSettingFragment extends Hilt_BleHrSettingFragment<BleHrSettingViewModel, wf6> {
    private long mBleHrSettingFragmentVisibleTime;

    public BleHrSettingFragment() {
        super(eui.S);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ BleHrSettingViewModel access$getMViewModel(BleHrSettingFragment bleHrSettingFragment) {
        return (BleHrSettingViewModel) bleHrSettingFragment.getMViewModel();
    }

    private final PickerDialog createChooseWarningFreqDialog(int titleRes, int warningValue, List<Integer> warningRange, final Function1<? super Integer, Unit> onItemChooseListener) {
        final PickerDialog pickerDialogCreate = new PickerDialog.b("hr_picker").setDialogTitle(titleRes).setCustomLayoutId(eui.e3).setCanceledOnTouchOutside(true).setCancelable(true).setPositiveText(wzi.g).setNegativeText(wzi.e).c(new BleHrSettingFragment$createChooseWarningFreqDialog$freqDialog$1(warningRange)).create();
        pickerDialogCreate.setValue(warningValue);
        pickerDialogCreate.setPickerHintText(getString(wzi.X4));
        pickerDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.hr.BleHrSettingFragment.createChooseWarningFreqDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    onItemChooseListener.invoke2(Integer.valueOf(pickerDialogCreate.getValue()));
                }
            }
        });
        Intrinsics.checkNotNull(pickerDialogCreate);
        return pickerDialogCreate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final CommonDialog<?> createHrSettingDialog() {
        List<Integer> hrFreq = ((BleHrSettingViewModel) getMViewModel()).getHeartRateModel().getHrFreq();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(hrFreq, 10));
        Iterator<T> it = hrFreq.iterator();
        while (it.hasNext()) {
            arrayList.add(HeartRateMonitorExtKt.getHrFreqStr(true, ((Number) it.next()).intValue()));
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        SubTitleDialog subTitleDialogCreate = SubTitleDialog.INSTANCE.defaultBuilder("hr_mode").setTitle(wzi.e5).setSubTitle(wzi.f5).setItems(strArr).setItemsCheckedIndex(((BleHrSettingViewModel) getMViewModel()).getHeartRateModel().getCurHrFreqIndex()).create();
        subTitleDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.hr.BleHrSettingFragment.createHrSettingDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                BleHrSettingFragment.access$getMViewModel(BleHrSettingFragment.this).setHrFreq(BleHrSettingFragment.access$getMViewModel(BleHrSettingFragment.this).getHeartRateModel().getHrFreq().get(which).intValue());
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        Intrinsics.checkNotNull(subTitleDialogCreate);
        return subTitleDialogCreate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final PickerDialog createSportHrWarningDialog(int warningValue) {
        final PickerDialog pickerDialogCreate = new PickerDialog.b("hr_picker").setDialogTitle(wzi.Z4).setCustomLayoutId(eui.e3).setCanceledOnTouchOutside(true).setCancelable(true).setPositiveText(wzi.g).setNegativeText(wzi.e).c(new BleHrSettingFragment$createChooseWarningFreqDialog$freqDialog$1(((BleHrSettingViewModel) getMViewModel()).getHeartRateModel().getWarningSportFreq())).create();
        pickerDialogCreate.setValue(warningValue);
        pickerDialogCreate.setPickerHintText(getString(wzi.X4));
        pickerDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.hr.BleHrSettingFragment$createSportHrWarningDialog$$inlined$createChooseWarningFreqDialog$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    BleHrSettingFragment.access$getMViewModel(this).setSportHrWarningFreq(pickerDialogCreate.getValue());
                }
            }
        });
        Intrinsics.checkNotNull(pickerDialogCreate);
        return pickerDialogCreate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onHeartHealthyCheckedChange(final boolean checked) {
        if (!checked) {
            ((BleHrSettingViewModel) getMViewModel()).setHrHeathySwitch(checked);
            return;
        }
        int i = wzi.I8;
        int i2 = wzi.X2;
        Function0 function0 = new Function0() { // from class: cr2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BleHrSettingFragment.onHeartHealthyCheckedChange$lambda$9(this.f14634a, checked);
            }
        };
        Function0 function1 = new Function0() { // from class: dr2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        };
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        UtilsKt.showEnsureDialog(i, i2, function0, function1, parentFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onHeartHealthyCheckedChange$lambda$9(BleHrSettingFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((BleHrSettingViewModel) this$0.getMViewModel()).setHrHeathySwitch(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$0(BleHrSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (UtilsKt.isDeviceNotConnection()) {
            ToastUtil.showShortToast(wzi.u);
        } else {
            this$0.createHrSettingDialog().showIfNeed(this$0.getParentFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$2(BleHrSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (UtilsKt.isDeviceNotConnection()) {
            ToastUtil.showShortToast(wzi.u);
            return;
        }
        ls9 value = ((BleHrSettingViewModel) this$0.getMViewModel()).getHeartRateModel().getHrConfig().getValue();
        if (value != null) {
            this$0.showHrWarningDialog(value.g, true, value.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$4(BleHrSettingFragment this$0, View view) {
        av9 av9Var;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (UtilsKt.isDeviceNotConnection()) {
            ToastUtil.showShortToast(wzi.u);
            return;
        }
        ls9 value = ((BleHrSettingViewModel) this$0.getMViewModel()).getHeartRateModel().getHrConfig().getValue();
        if (value == null || (av9Var = value.h) == null) {
            return;
        }
        this$0.showHrWarningDialog(av9Var.d, false, av9Var.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$5(BleHrSettingFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        iSwitchButton.setChecked(!z);
        if (UtilsKt.isDeviceNotConnection()) {
            ToastUtil.showShortToast(wzi.u);
        } else {
            ((BleHrSettingViewModel) this$0.getMViewModel()).setSportHrWarningSwitch(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$6(BleHrSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (UtilsKt.isDeviceNotConnection()) {
            ToastUtil.showShortToast(wzi.u);
        } else {
            this$0.createSportHrWarningDialog(((BleHrSettingViewModel) this$0.getMViewModel()).getHeartRateModel().getCurSportWarningValue()).showIfNeed(this$0.getParentFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$7(BleHrSettingFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        iSwitchButton.setChecked(!z);
        if (UtilsKt.isDeviceNotConnection()) {
            ToastUtil.showShortToast(wzi.u);
        } else {
            this$0.onHeartHealthyCheckedChange(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showHrWarningDialog(int warningValue, final boolean isHigh, boolean isOpen) {
        Pair<String[], Integer> frequencyStr = ((BleHrSettingViewModel) getMViewModel()).getHeartRateModel().getFrequencyStr(warningValue, isHigh, isOpen);
        SubTitleDialog subTitleDialogCreate = SubTitleDialog.INSTANCE.defaultBuilder("showHrWarningDialog").setDialogTitle(wzi.e3).setItems(frequencyStr.getFirst()).setItemsCheckedIndex(frequencyStr.getSecond().intValue()).create();
        subTitleDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.hr.BleHrSettingFragment.showHrWarningDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                Logger.d("onDialogClick " + which, new Object[0]);
                int frequencyValue = BleHrSettingFragment.access$getMViewModel(BleHrSettingFragment.this).getHeartRateModel().getFrequencyValue(which, isHigh);
                if (frequencyValue == -1) {
                    BleHrSettingFragment.access$getMViewModel(BleHrSettingFragment.this).setWarningSwitch(false, isHigh);
                } else {
                    BleHrSettingFragment.access$getMViewModel(BleHrSettingFragment.this).setWarningFreq(frequencyValue, isHigh);
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        subTitleDialogCreate.showIfNeed(getParentFragmentManager());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            this.mBleHrSettingFragmentVisibleTime = 0L;
        } else {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("c_pa_v3", "56.51.1.1.21561"), "name", "heart_rate_setting_detail_page", "title", getString(wzi.W4), "duration_sec", Long.valueOf((System.currentTimeMillis() - this.mBleHrSettingFragmentVisibleTime) / ((long) 1000)), "device_model", DeviceModelExtKt.getModel(wearableDeviceModel));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.BaseHealthMonitorFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.W4);
        ((BleHrSettingViewModel) getMViewModel()).loadHeartRateSettingConfig();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        this.mBleHrSettingFragmentVisibleTime = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((wf6) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: wq2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BleHrSettingFragment.setListener$lambda$0(this.f38244a, view);
            }
        });
        ((wf6) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: xq2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BleHrSettingFragment.setListener$lambda$2(this.f39345a, view);
            }
        });
        ((wf6) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: yq2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BleHrSettingFragment.setListener$lambda$4(this.f40419a, view);
            }
        });
        ((wf6) getMBinding()).F.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: zq2
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                BleHrSettingFragment.setListener$lambda$5(this.f41559a, z, iSwitchButton);
            }
        });
        ((wf6) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: ar2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BleHrSettingFragment.setListener$lambda$6(this.f3373a, view);
            }
        });
        ((wf6) getMBinding()).A.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: br2
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                BleHrSettingFragment.setListener$lambda$7(this.f4505a, z, iSwitchButton);
            }
        });
    }
}
