package com.xiaomi.fitness.devicesettings.huami.healthmonitor;

import android.app.Application;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrHuaMiSettingFragment;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrHuaMiSettingViewModel;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrMode;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.utils.HrUtils;
import com.xiaomi.fitness.devicesettings.widget.CommonTwoSetPicker;
import com.xiaomi.fitness.settingitem.settingitem.HRDetect;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.eh6;
import defpackage.eui;
import defpackage.g64;
import defpackage.ld8;
import defpackage.q8h;
import defpackage.qyi;
import defpackage.wz5;
import defpackage.wzi;
import defpackage.zqi;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated(message = "see subclass of BaseHuamiHealthMonitorFragment")
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\bR\u0010\u000fJ\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u000fJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\u000fJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010\u000fJ\u0017\u0010#\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b#\u0010$J!\u0010)\u001a\u00020\u00072\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00072\u0006\u0010+\u001a\u00020%H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0007H\u0014¢\u0006\u0004\b.\u0010\u000fJ\u000f\u0010/\u001a\u00020\u0007H\u0014¢\u0006\u0004\b/\u0010\u000fR\u001c\u00101\u001a\b\u0012\u0002\b\u0003\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00109R\u001c\u0010;\u001a\b\u0012\u0002\b\u0003\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00102R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001c\u0010?\u001a\b\u0012\u0002\b\u0003\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00102R\u0016\u0010@\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010CR\u0016\u0010G\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010ER\u0016\u0010H\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010ER\u0016\u0010J\u001a\u0004\u0018\u00010I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010M\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006U²\u0006\u0012\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00150S8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrHuaMiSettingFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrHuaMiSettingViewModel;", "Leh6;", "Landroid/view/View$OnClickListener;", "Lcom/xiaomi/fitness/settingitem/settingitem/HRDetect;", "hr", "", "setViews", "(Lcom/xiaomi/fitness/settingitem/settingitem/HRDetect;)V", "", "open", "onPressureChange", "(Z)V", "save2Remote", "()V", "onActiveChange", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrHuaMiSettingViewModel$WarnRet;", "value", "onWarnChanged", "(Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrHuaMiSettingViewModel$WarnRet;)V", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrMode;", "mode", "save", "onModeChange", "(Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrMode;Z)V", "", "interval", "onIntervalChange", "(I)V", "onIntervalClick", "onWarnViewClick", "batteryTip", "(Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrMode;)V", "onModeClick", "modeOpen", "(Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrMode;)Z", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "v", "onClick", "(Landroid/view/View;)V", "onVisible", "onInvisible", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "frequencyDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "detectModeDialog", "Lwz5;", "modeAdapter", "Lwz5;", "", "intervals", "[I", "warningValues", "warningValueDialog", "Lcom/xiaomi/fitness/devicesettings/widget/CommonTwoSetPicker;", "warningPicker", "Lcom/xiaomi/fitness/devicesettings/widget/CommonTwoSetPicker;", "warningDialog", "curMode", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrMode;", "curInterval", "I", "curWarnState", "Z", "curWarnValue", "curActive", DailyRecordKey.curPressure, "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "device", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "", "mHrHuaMiSettingFragmentVisibleTime", "J", "getLayoutId", "()I", "layoutId", "<init>", "Ljava/util/ArrayList;", "modes", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nHrHuaMiSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HrHuaMiSettingFragment.kt\ncom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrHuaMiSettingFragment\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,409:1\n37#2:410\n36#2,3:411\n*S KotlinDebug\n*F\n+ 1 HrHuaMiSettingFragment.kt\ncom/xiaomi/fitness/devicesettings/huami/healthmonitor/HrHuaMiSettingFragment\n*L\n283#1:410\n283#1:411,3\n*E\n"})
public final class HrHuaMiSettingFragment extends BaseLoadableBindingFragment<HrHuaMiSettingViewModel, eh6> implements View.OnClickListener {
    private boolean curActive;
    private int curInterval;
    private boolean curPressure;
    private boolean curWarnState;

    @Nullable
    private CommonDialog<?> detectModeDialog;

    @Nullable
    private CommonDialog<?> frequencyDialog;

    @NotNull
    private final int[] intervals;
    private long mHrHuaMiSettingFragmentVisibleTime;

    @Nullable
    private wz5 modeAdapter;

    @Nullable
    private CommonDialog<?> warningDialog;

    @Nullable
    private CommonTwoSetPicker warningPicker;

    @Nullable
    private CommonDialog<?> warningValueDialog;

    @NotNull
    private final int[] warningValues = {100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150};

    @NotNull
    private HrMode curMode = HrMode.Close.INSTANCE;
    private int curWarnValue = 100;

    @Nullable
    private final WearableDeviceModel device = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();

    public HrHuaMiSettingFragment() {
        int[] iArr = {1, 5, 10, 30};
        this.intervals = iArr;
        this.curInterval = iArr[iArr.length - 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ HrHuaMiSettingViewModel access$getMViewModel(HrHuaMiSettingFragment hrHuaMiSettingFragment) {
        return (HrHuaMiSettingViewModel) hrHuaMiSettingFragment.getMViewModel();
    }

    private final void batteryTip(final HrMode mode) {
        CommonDialog<?> commonDialog = this.warningDialog;
        if (commonDialog != null) {
            Intrinsics.checkNotNull(commonDialog);
            commonDialog.showIfNeed(getParentFragmentManager());
            return;
        }
        CommonDialog<?> commonDialogCreate = new CommonDialog.c("warning_dialog").setDialogTitle(wzi.G0).setDialogDescription(wzi.d3).setCancelable(false).setNegativeText(wzi.e).setPositiveText(wzi.g).create();
        this.warningDialog = commonDialogCreate;
        if (commonDialogCreate != null) {
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrHuaMiSettingFragment.batteryTip.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -1) {
                        HrHuaMiSettingFragment.access$getMViewModel(HrHuaMiSettingFragment.this).syncMode(mode, HrHuaMiSettingFragment.this.curInterval);
                    }
                }
            });
        }
        CommonDialog<?> commonDialog2 = this.warningDialog;
        if (commonDialog2 != null) {
            commonDialog2.showIfNeed(getParentFragmentManager());
        }
    }

    private final boolean modeOpen(HrMode mode) {
        return !Intrinsics.areEqual(mode, HrMode.Close.INSTANCE);
    }

    private final void onActiveChange(boolean open) {
        this.curActive = open;
        save2Remote();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onIntervalChange(int interval) {
        this.curInterval = interval;
        RightArrowTwoLineTextView rightArrowTwoLineTextView = ((eh6) getMBinding()).B;
        Application application = ApplicationExtKt.getApplication();
        int i = qyi.d;
        int i2 = this.curInterval;
        rightArrowTwoLineTextView.setRemindText(ResourceExtKt.getQuantityString(application, i, i2, Integer.valueOf(i2)));
        save2Remote();
    }

    private final void onIntervalClick() {
        int[] iArr = this.intervals;
        String[] strArr = new String[iArr.length];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            Application application = ApplicationExtKt.getApplication();
            int i2 = qyi.d;
            int i3 = this.intervals[i];
            strArr[i] = ResourceExtKt.getQuantityString(application, i2, i3, Integer.valueOf(i3));
        }
        CommonDialog<?> commonDialogCreate = new CommonDialog.c("frequencyDialog").setDialogTitle(wzi.V2).setItems(strArr).setItemsCheckedIndex(ArraysKt___ArraysKt.indexOf(this.intervals, this.curInterval)).create();
        this.frequencyDialog = commonDialogCreate;
        if (commonDialogCreate != null) {
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrHuaMiSettingFragment.onIntervalClick.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    HrHuaMiSettingFragment.access$getMViewModel(HrHuaMiSettingFragment.this).syncInterval(HrHuaMiSettingFragment.this.curMode, HrHuaMiSettingFragment.this.intervals[which]);
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            });
        }
        CommonDialog<?> commonDialog = this.frequencyDialog;
        Intrinsics.checkNotNull(commonDialog);
        commonDialog.showIfNeed(getParentFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onModeChange(HrMode mode, boolean save) {
        this.curMode = mode;
        boolean z = false;
        boolean z2 = modeOpen(mode) && !Intrinsics.areEqual(mode, HrMode.Sleep.INSTANCE);
        ((eh6) getMBinding()).B.setEnable(z2);
        ((eh6) getMBinding()).A.setEnable(z2);
        ((eh6) getMBinding()).D.setEnable(z2);
        ((eh6) getMBinding()).F.setEnable(z2);
        RightArrowTwoLineTextView rightArrowTwoLineTextView = ((eh6) getMBinding()).G;
        if (z2 && this.curWarnState) {
            z = true;
        }
        rightArrowTwoLineTextView.setEnable(z);
        ((eh6) getMBinding()).C.setRemindText(this.curMode.title);
        if (save) {
            save2Remote();
        }
        ld8.c().l(new HrModeChanged(mode));
    }

    private final void onModeClick() {
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: bcc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HrHuaMiSettingFragment.onModeClick$lambda$10();
            }
        });
        View viewInflate = LayoutInflater.from(getMActivity()).inflate(eui.f3, (ViewGroup) null);
        viewInflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View viewFindViewById = viewInflate.findViewById(zqi.h7);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        wz5 wz5Var = new wz5(getMActivity(), onModeClick$lambda$11(lazy));
        this.modeAdapter = wz5Var;
        Intrinsics.checkNotNull(wz5Var);
        wz5Var.setOnItemClickListener(new q8h() { // from class: ccc
            @Override // defpackage.q8h
            public final void onItemClick(View view, int i) {
                HrHuaMiSettingFragment.onModeClick$lambda$12(this.f5181a, lazy, view, i);
            }
        });
        wz5 wz5Var2 = this.modeAdapter;
        Intrinsics.checkNotNull(wz5Var2);
        wz5Var2.setSelectIndex(onModeClick$lambda$11(lazy).indexOf(this.curMode));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        linearLayoutManager.setOrientation(1);
        recyclerView.setAdapter(this.modeAdapter);
        recyclerView.addItemDecoration(new g64(0, false));
        CommonDialog<?> commonDialogCreate = new CommonDialog.c("detect_mode_dialog").setCanceledOnTouchOutside(true).setDialogTitle(wzi.Z2).setCustomView(viewInflate).setNegativeText(wzi.e).create();
        this.detectModeDialog = commonDialogCreate;
        Intrinsics.checkNotNull(commonDialogCreate);
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList onModeClick$lambda$10() {
        return CollectionsKt__CollectionsKt.arrayListOf(HrModeKt.getMode(2), HrModeKt.getMode(1), HrModeKt.getMode(3), HrModeKt.getMode(0));
    }

    private static final ArrayList<HrMode> onModeClick$lambda$11(Lazy<? extends ArrayList<HrMode>> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onModeClick$lambda$12(HrHuaMiSettingFragment this$0, Lazy modes$delegate, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(modes$delegate, "$modes$delegate");
        CommonDialog<?> commonDialog = this$0.detectModeDialog;
        Intrinsics.checkNotNull(commonDialog);
        commonDialog.dismiss();
        HrMode hrMode = onModeClick$lambda$11(modes$delegate).get(i);
        Intrinsics.checkNotNullExpressionValue(hrMode, "get(...)");
        HrMode hrMode2 = hrMode;
        if (Intrinsics.areEqual(this$0.curMode, hrMode2)) {
            return;
        }
        this$0.curMode = hrMode2;
        Logger.d(BaseFragment.TAG, "onModeClick: mode = " + hrMode2 + "; pos = " + i);
        if (!this$0.modeOpen(this$0.curMode) && this$0.modeOpen(hrMode2)) {
            this$0.batteryTip(hrMode2);
        } else {
            this$0.showLoading();
            ((HrHuaMiSettingViewModel) this$0.getMViewModel()).syncMode(hrMode2, this$0.curInterval);
        }
    }

    private final void onPressureChange(boolean open) {
        this.curPressure = open;
        save2Remote();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(HrHuaMiSettingFragment this$0, HRDetect hRDetect) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setViews(hRDetect);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarnChanged(HrHuaMiSettingViewModel.WarnRet value) {
        hideLoading();
        if (!value.getSuccess()) {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.common_set_error);
            }
            if (value.isSwitch()) {
                ((eh6) getMBinding()).F.setSwitch(!((eh6) getMBinding()).F.getSwitch());
                ((eh6) getMBinding()).G.setEnabled(((eh6) getMBinding()).F.getSwitch());
                return;
            }
            return;
        }
        this.curWarnValue = value.getHr();
        this.curWarnState = ((eh6) getMBinding()).F.getSwitch();
        ((eh6) getMBinding()).G.setEnabled(((eh6) getMBinding()).F.getSwitch());
        RightArrowTwoLineTextView rightArrowTwoLineTextView = ((eh6) getMBinding()).G;
        Resources resources = getResources();
        int i = qyi.e;
        int i2 = this.curWarnValue;
        rightArrowTwoLineTextView.setRemindText(resources.getQuantityString(i, i2, Integer.valueOf(i2)));
        save2Remote();
    }

    private final void onWarnViewClick() {
        ArrayList arrayList = new ArrayList();
        int i = 100;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(100, 150, 5);
        if (100 <= progressionLastElement) {
            while (true) {
                arrayList.add(String.valueOf(i));
                if (i == progressionLastElement) {
                    break;
                } else {
                    i += 5;
                }
            }
        }
        CommonTwoSetPicker commonTwoSetPicker = new CommonTwoSetPicker(getMActivity());
        commonTwoSetPicker.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        commonTwoSetPicker.h(true, false);
        commonTwoSetPicker.f((String[]) arrayList.toArray(new String[0]), ArraysKt___ArraysKt.indexOf(this.warningValues, this.curWarnValue), true);
        commonTwoSetPicker.g(commonTwoSetPicker.getResources().getQuantityString(qyi.w, this.curWarnValue), null);
        this.warningPicker = commonTwoSetPicker;
        CommonDialog<?> commonDialogCreate = new CommonDialog.c("warningValueDialog").setDialogTitle(wzi.e3).setCustomView(this.warningPicker).setPositiveText(wzi.g).setNegativeText(wzi.e).create();
        this.warningValueDialog = commonDialogCreate;
        if (commonDialogCreate != null) {
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrHuaMiSettingFragment.onWarnViewClick.2
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -1) {
                        HrHuaMiSettingFragment.this.showLoading();
                        HrHuaMiSettingViewModel hrHuaMiSettingViewModelAccess$getMViewModel = HrHuaMiSettingFragment.access$getMViewModel(HrHuaMiSettingFragment.this);
                        boolean z = HrHuaMiSettingFragment.this.curWarnState;
                        int[] iArr = HrHuaMiSettingFragment.this.warningValues;
                        CommonTwoSetPicker commonTwoSetPicker2 = HrHuaMiSettingFragment.this.warningPicker;
                        Intrinsics.checkNotNull(commonTwoSetPicker2);
                        hrHuaMiSettingViewModelAccess$getMViewModel.syncWarn(false, z, iArr[commonTwoSetPicker2.getCurrentLeftValue()]);
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            });
        }
        CommonDialog<?> commonDialog = this.warningValueDialog;
        if (commonDialog != null) {
            commonDialog.showIfNeed(getParentFragmentManager());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void save2Remote() {
        ((HrHuaMiSettingViewModel) getMViewModel()).save2Remote(this.curMode.getMode(), this.curInterval, this.curActive, this.curPressure, this.curWarnState, this.curWarnValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setViews(HRDetect hr) {
        hideLoading();
        if (hr == null) {
            hr = HrUtils.INSTANCE.defaultKongMingConfig();
        }
        this.curMode = HrModeKt.getMode(hr.getType());
        ((HrHuaMiSettingViewModel) getMViewModel()).getModeObserver().observe(getViewLifecycleOwner(), new HrHuaMiSettingFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: sbc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HrHuaMiSettingFragment.setViews$lambda$1(this.f33482a, (HrMode) obj);
            }
        }));
        ((eh6) getMBinding()).C.setOnClickListener(this);
        this.curInterval = hr.getFreq() <= 0 ? ArraysKt___ArraysKt.last(this.intervals) : hr.getFreq();
        Application application = ApplicationExtKt.getApplication();
        int i = qyi.d;
        int i2 = this.curInterval;
        ((eh6) getMBinding()).B.setRemindText(ResourceExtKt.getQuantityString(application, i, i2, Integer.valueOf(i2)));
        ((HrHuaMiSettingViewModel) getMViewModel()).getFreqObserver().observe(getViewLifecycleOwner(), new HrHuaMiSettingFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ubc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HrHuaMiSettingFragment.setViews$lambda$2(this.f35596a, (Integer) obj);
            }
        }));
        ((eh6) getMBinding()).B.setOnClickListener(this);
        this.curWarnState = hr.isWarningEnable();
        this.curWarnValue = hr.getWarningValue() <= 0 ? 100 : hr.getWarningValue();
        ((eh6) getMBinding()).F.setSwitch(this.curWarnState);
        RightArrowTwoLineTextView rightArrowTwoLineTextView = ((eh6) getMBinding()).G;
        Resources resources = getResources();
        int i3 = qyi.e;
        int i4 = this.curWarnValue;
        rightArrowTwoLineTextView.setRemindText(resources.getQuantityString(i3, i4, Integer.valueOf(i4)));
        ((eh6) getMBinding()).F.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: vbc
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                HrHuaMiSettingFragment.setViews$lambda$3(this.f36713a, z, iSwitchButton);
            }
        });
        ((HrHuaMiSettingViewModel) getMViewModel()).getWarnObserver().observe(getViewLifecycleOwner(), new HrHuaMiSettingFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: wbc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HrHuaMiSettingFragment.setViews$lambda$4(this.f37806a, (HrHuaMiSettingViewModel.WarnRet) obj);
            }
        }));
        ((eh6) getMBinding()).G.setOnClickListener(this);
        this.curPressure = hr.isPressureEnable();
        ((eh6) getMBinding()).D.setSwitch(this.curPressure);
        ((eh6) getMBinding()).D.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: xbc
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                HrHuaMiSettingFragment.setViews$lambda$5(this.f38942a, z, iSwitchButton);
            }
        });
        ((HrHuaMiSettingViewModel) getMViewModel()).getPressureObserver().observe(getViewLifecycleOwner(), new HrHuaMiSettingFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ybc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HrHuaMiSettingFragment.setViews$lambda$6(this.f40014a, (Boolean) obj);
            }
        }));
        this.curActive = hr.isActiveEnable();
        ((eh6) getMBinding()).A.setSwitch(this.curActive);
        ((HrHuaMiSettingViewModel) getMViewModel()).getActiveObserver().observe(getViewLifecycleOwner(), new HrHuaMiSettingFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: zbc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HrHuaMiSettingFragment.setViews$lambda$7(this.f41095a, (Boolean) obj);
            }
        }));
        ((eh6) getMBinding()).A.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: acc
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                HrHuaMiSettingFragment.setViews$lambda$8(this.f876a, z, iSwitchButton);
            }
        });
        onModeChange(this.curMode, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViews$lambda$1(HrHuaMiSettingFragment this$0, HrMode hrMode) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (hrMode != null) {
            this$0.onModeChange(hrMode, true);
        } else {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.common_set_error);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViews$lambda$2(HrHuaMiSettingFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (num.intValue() > 0) {
            Intrinsics.checkNotNull(num);
            this$0.onIntervalChange(num.intValue());
        } else {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.common_set_error);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setViews$lambda$3(HrHuaMiSettingFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel wearableDeviceModel = this$0.device;
        if (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected()) {
            ((HrHuaMiSettingViewModel) this$0.getMViewModel()).syncWarn(true, z, this$0.curWarnValue);
            return;
        }
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            ToastExtKt.toastShort(mActivity, wzi.u);
        }
        ((eh6) this$0.getMBinding()).F.setSwitch(!z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViews$lambda$4(HrHuaMiSettingFragment this$0, HrHuaMiSettingViewModel.WarnRet warnRet) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        Intrinsics.checkNotNull(warnRet);
        this$0.onWarnChanged(warnRet);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setViews$lambda$5(HrHuaMiSettingFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel wearableDeviceModel = this$0.device;
        if (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected()) {
            ((HrHuaMiSettingViewModel) this$0.getMViewModel()).syncPressure(z);
            return;
        }
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            ToastExtKt.toastShort(mActivity, wzi.u);
        }
        ((eh6) this$0.getMBinding()).D.setSwitch(!z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setViews$lambda$6(HrHuaMiSettingFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        Logger.d(BaseFragment.TAG, "pressureObserver: " + bool);
        if (bool.booleanValue()) {
            this$0.onPressureChange(((eh6) this$0.getMBinding()).D.getSwitch());
        } else {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.common_set_error);
            }
            ((eh6) this$0.getMBinding()).D.setSwitch(!((eh6) this$0.getMBinding()).D.getSwitch());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setViews$lambda$7(HrHuaMiSettingFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        Logger.d(BaseFragment.TAG, "active: " + bool);
        if (bool.booleanValue()) {
            this$0.onActiveChange(((eh6) this$0.getMBinding()).A.getSwitch());
        } else {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.common_set_error);
            }
            ((eh6) this$0.getMBinding()).A.setSwitch(!((eh6) this$0.getMBinding()).A.getSwitch());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setViews$lambda$8(HrHuaMiSettingFragment this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel wearableDeviceModel = this$0.device;
        if (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected()) {
            ((HrHuaMiSettingViewModel) this$0.getMViewModel()).syncActive(z);
            return;
        }
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            ToastExtKt.toastShort(mActivity, wzi.u);
        }
        ((eh6) this$0.getMBinding()).A.setSwitch(!z);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.j0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        WearableDeviceModel wearableDeviceModel = this.device;
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.u);
                return;
            }
            return;
        }
        int id = v.getId();
        if (id == zqi.m5) {
            onModeClick();
        } else if (id == zqi.c4) {
            onIntervalClick();
        } else if (id == zqi.Ya) {
            onWarnViewClick();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        if (this.device == null) {
            this.mHrHuaMiSettingFragmentVisibleTime = 0L;
        } else {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("c_pa_v3", "56.51.1.1.21561"), "name", "heart_rate_setting_detail_page", "title", getString(wzi.N4), "duration_sec", Long.valueOf((System.currentTimeMillis() - this.mHrHuaMiSettingFragmentVisibleTime) / ((long) 1000)), "device_model", DeviceModelExtKt.getModel(this.device));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.W4);
        showLoading();
        ((HrHuaMiSettingViewModel) getMViewModel()).getConfigObserver().observe(getViewLifecycleOwner(), new HrHuaMiSettingFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: tbc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HrHuaMiSettingFragment.onViewCreated$lambda$0(this.f34536a, (HRDetect) obj);
            }
        }));
        ((HrHuaMiSettingViewModel) getMViewModel()).readConfig();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        this.mHrHuaMiSettingFragmentVisibleTime = System.currentTimeMillis();
    }
}
