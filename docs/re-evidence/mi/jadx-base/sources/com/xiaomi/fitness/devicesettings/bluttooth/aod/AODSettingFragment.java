package com.xiaomi.fitness.devicesettings.bluttooth.aod;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.aod.AODSettingFragment;
import com.xiaomi.fitness.devicesettings.common.TimePickerDialog;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import defpackage.av6;
import defpackage.cji;
import defpackage.eui;
import defpackage.ffp;
import defpackage.t64;
import defpackage.td6;
import defpackage.wzi;
import defpackage.yxo;
import defpackage.zqi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b:\u0010\u0013J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0013J?\u0010 \u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020\u0006*\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010(\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u0014\u0010.\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u0010/\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010,R\u0016\u00100\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000204038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00109\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/aod/AODSettingFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/aod/AODSettingViewModel;", "Ltd6;", "", "isStart", "", "showSelectTimeDialog", "(Z)V", "", "hour", "minute", "updateTimeValue", "(ZII)V", "Lyxo;", "timingSetting", "handleTimingSetting", "(Lyxo;)V", "updateStartTime", "()V", "updateEndTime", "updateModeView", "showSelectStateDialog", "syncInfo", "Landroid/widget/ImageView;", "offIcon", "Landroid/widget/TextView;", "offText", "smartIcon", "smartText", "customIcon", "customText", "updateModeSelectItem", "(Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;)V", "bindView", "(Ltd6;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lt64;", "startTime", "Lt64;", "endTime", "startTimeCal", "endTimeCal", "state", "I", "stateCal", "", "", "mAODStateItem", "Ljava/util/List;", "getLayoutId", "()I", "layoutId", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AODSettingFragment extends BaseLoadableBindingFragment<AODSettingViewModel, td6> {

    @NotNull
    private final t64 startTime = new t64();

    @NotNull
    private final t64 endTime = new t64();

    @NotNull
    private final t64 startTimeCal = new t64();

    @NotNull
    private final t64 endTimeCal = new t64();
    private int state = 2;
    private int stateCal = 2;

    @NotNull
    private final List<String> mAODStateItem = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(AODSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showSelectStateDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(AODSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showSelectTimeDialog(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$2(AODSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showSelectTimeDialog(false);
    }

    private final void handleTimingSetting(yxo timingSetting) {
        hideLoading();
        if (timingSetting == null) {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.Ra);
                return;
            }
            return;
        }
        int i = timingSetting.c;
        this.state = i;
        this.stateCal = i;
        updateModeView();
        t64 t64Var = this.startTime;
        t64 t64Var2 = timingSetting.d;
        t64Var.c = t64Var2.c;
        t64Var.d = t64Var2.d;
        t64 t64Var3 = this.startTimeCal;
        t64Var3.c = t64Var2.c;
        t64Var3.d = t64Var2.d;
        updateStartTime();
        t64 t64Var4 = this.endTime;
        t64 t64Var5 = timingSetting.e;
        t64Var4.c = t64Var5.c;
        t64Var4.d = t64Var5.d;
        t64 t64Var6 = this.endTimeCal;
        t64Var6.c = t64Var5.c;
        t64Var6.d = t64Var5.d;
        updateEndTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(AODSettingFragment this$0, yxo yxoVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.handleTimingSetting(yxoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$4(AODSettingFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (!Intrinsics.areEqual(bool, Boolean.TRUE)) {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.common_set_error);
                return;
            }
            return;
        }
        t64 t64Var = this$0.startTime;
        t64 t64Var2 = this$0.startTimeCal;
        t64Var.c = t64Var2.c;
        t64Var.d = t64Var2.d;
        t64 t64Var3 = this$0.endTime;
        t64 t64Var4 = this$0.endTimeCal;
        t64Var3.c = t64Var4.c;
        t64Var3.d = t64Var4.d;
        this$0.state = this$0.stateCal;
        this$0.updateModeView();
        this$0.updateStartTime();
        this$0.updateEndTime();
    }

    private final void showSelectStateDialog() {
        View viewInflate = requireActivity().getLayoutInflater().inflate(eui.n, (ViewGroup) null);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate.findViewById(zqi.B1);
        final ImageView imageView = (ImageView) viewInflate.findViewById(zqi.C1);
        TextView textView = (TextView) viewInflate.findViewById(zqi.D1);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate.findViewById(zqi.E1);
        final ImageView imageView2 = (ImageView) viewInflate.findViewById(zqi.F1);
        TextView textView2 = (TextView) viewInflate.findViewById(zqi.G1);
        ConstraintLayout constraintLayout3 = (ConstraintLayout) viewInflate.findViewById(zqi.y1);
        final ImageView imageView3 = (ImageView) viewInflate.findViewById(zqi.z1);
        TextView textView3 = (TextView) viewInflate.findViewById(zqi.A1);
        final CommonDialog commonDialogCreate = new CommonDialog.c("commonDialog").setDialogTitle(wzi.R).setCustomView(viewInflate).setCanceledOnTouchOutside(true).create();
        commonDialogCreate.show(getParentFragmentManager(), "");
        Intrinsics.checkNotNull(imageView);
        Intrinsics.checkNotNull(textView);
        Intrinsics.checkNotNull(imageView2);
        Intrinsics.checkNotNull(textView2);
        Intrinsics.checkNotNull(imageView3);
        Intrinsics.checkNotNull(textView3);
        updateModeSelectItem(imageView, textView, imageView2, textView2, imageView3, textView3);
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: l6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AODSettingFragment.showSelectStateDialog$lambda$5(imageView, imageView2, imageView3, this, commonDialogCreate, view);
            }
        });
        constraintLayout2.setOnClickListener(new View.OnClickListener() { // from class: p6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AODSettingFragment.showSelectStateDialog$lambda$6(imageView2, imageView, imageView3, this, commonDialogCreate, view);
            }
        });
        constraintLayout3.setOnClickListener(new View.OnClickListener() { // from class: q6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AODSettingFragment.showSelectStateDialog$lambda$7(imageView3, imageView, imageView2, this, commonDialogCreate, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSelectStateDialog$lambda$5(ImageView imageView, ImageView imageView2, ImageView imageView3, AODSettingFragment this$0, CommonDialog commonDialog, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(imageView);
        if (ExtUtilsKt.isVisible(imageView)) {
            return;
        }
        ExtUtilsKt.setVisible(imageView, true);
        Intrinsics.checkNotNull(imageView2);
        ExtUtilsKt.setVisible(imageView2, false);
        Intrinsics.checkNotNull(imageView3);
        ExtUtilsKt.setVisible(imageView3, false);
        this$0.stateCal = 2;
        Dialog dialog = commonDialog.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
        this$0.syncInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSelectStateDialog$lambda$6(ImageView imageView, ImageView imageView2, ImageView imageView3, AODSettingFragment this$0, CommonDialog commonDialog, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(imageView);
        if (ExtUtilsKt.isVisible(imageView)) {
            return;
        }
        ExtUtilsKt.setVisible(imageView, true);
        Intrinsics.checkNotNull(imageView2);
        ExtUtilsKt.setVisible(imageView2, false);
        Intrinsics.checkNotNull(imageView3);
        ExtUtilsKt.setVisible(imageView3, false);
        this$0.stateCal = 3;
        Dialog dialog = commonDialog.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
        this$0.syncInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSelectStateDialog$lambda$7(ImageView imageView, ImageView imageView2, ImageView imageView3, AODSettingFragment this$0, CommonDialog commonDialog, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(imageView);
        if (ExtUtilsKt.isVisible(imageView)) {
            return;
        }
        ExtUtilsKt.setVisible(imageView, true);
        Intrinsics.checkNotNull(imageView2);
        ExtUtilsKt.setVisible(imageView2, false);
        Intrinsics.checkNotNull(imageView3);
        ExtUtilsKt.setVisible(imageView3, false);
        this$0.stateCal = 1;
        Dialog dialog = commonDialog.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
        this$0.syncInfo();
    }

    private final void showSelectTimeDialog(final boolean isStart) {
        final TimePickerDialog currentMinute = TimePickerDialog.INSTANCE.defaultBuilder("time picker").setDialogTitle(isStart ? wzi.Ia : wzi.Ha).setNegativeText(wzi.e).setPositiveText(wzi.g).create().setIs24HourView(true).setCurrentHour((isStart ? this.startTime : this.endTime).c).setCurrentMinute((isStart ? this.startTime : this.endTime).d);
        currentMinute.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.aod.AODSettingFragment.showSelectTimeDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    this.updateTimeValue(isStart, currentMinute.getCurrentHour(), currentMinute.getCurrentMinute());
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        currentMinute.showIfNeed(getParentFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void syncInfo() {
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 5, null);
        ((AODSettingViewModel) getMViewModel()).updateAODSetting(this.stateCal, this.startTimeCal, this.endTimeCal);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateEndTime() {
        String str;
        t64 t64Var = this.endTime;
        int i = t64Var.c;
        t64 t64Var2 = this.startTime;
        int i2 = t64Var2.c;
        if (i <= i2 && (i != i2 || t64Var.d <= t64Var2.d)) {
            String string = getString(wzi.S5);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str2 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(this.endTime.c), Integer.valueOf(this.endTime.d)}, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            str = string + " " + str2;
        } else {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(this.endTime.d)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        }
        ((td6) getMBinding()).A.setRemindText(str);
    }

    private final void updateModeSelectItem(ImageView offIcon, TextView offText, ImageView smartIcon, TextView smartText, ImageView customIcon, TextView customText) {
        int i = this.state;
        if (i == 2) {
            ExtUtilsKt.setVisible(offIcon, true);
            offText.setTextColor(BaseFragmentExtKt.getColor(this, cji.i));
            ExtUtilsKt.setVisible(smartIcon, false);
            smartText.setTextColor(BaseFragmentExtKt.getColor(this, cji.D));
            ExtUtilsKt.setVisible(customIcon, false);
            customText.setTextColor(BaseFragmentExtKt.getColor(this, cji.D));
            return;
        }
        if (i != 3) {
            ExtUtilsKt.setVisible(customIcon, true);
            customText.setTextColor(BaseFragmentExtKt.getColor(this, cji.i));
            ExtUtilsKt.setVisible(offIcon, false);
            offText.setTextColor(BaseFragmentExtKt.getColor(this, cji.D));
            ExtUtilsKt.setVisible(smartIcon, false);
            smartText.setTextColor(BaseFragmentExtKt.getColor(this, cji.D));
            return;
        }
        ExtUtilsKt.setVisible(smartIcon, true);
        smartText.setTextColor(BaseFragmentExtKt.getColor(this, cji.i));
        ExtUtilsKt.setVisible(offIcon, false);
        offText.setTextColor(BaseFragmentExtKt.getColor(this, cji.D));
        ExtUtilsKt.setVisible(customIcon, false);
        customText.setTextColor(BaseFragmentExtKt.getColor(this, cji.D));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateModeView() {
        int i = this.state;
        if (i == 2) {
            ((td6) getMBinding()).D.setRemindText(this.mAODStateItem.get(0));
            RightArrowTwoLineTextView startView = ((td6) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(startView, "startView");
            ExtUtilsKt.setVisible(startView, false);
            RightArrowTwoLineTextView endView = ((td6) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(endView, "endView");
            ExtUtilsKt.setVisible(endView, false);
            return;
        }
        if (i != 3) {
            ((td6) getMBinding()).D.setRemindText(this.mAODStateItem.get(2));
            RightArrowTwoLineTextView startView2 = ((td6) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(startView2, "startView");
            ExtUtilsKt.setVisible(startView2, true);
            RightArrowTwoLineTextView endView2 = ((td6) getMBinding()).A;
            Intrinsics.checkNotNullExpressionValue(endView2, "endView");
            ExtUtilsKt.setVisible(endView2, true);
            return;
        }
        ((td6) getMBinding()).D.setRemindText(this.mAODStateItem.get(1));
        RightArrowTwoLineTextView startView3 = ((td6) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(startView3, "startView");
        ExtUtilsKt.setVisible(startView3, false);
        RightArrowTwoLineTextView endView3 = ((td6) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(endView3, "endView");
        ExtUtilsKt.setVisible(endView3, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateStartTime() {
        RightArrowTwoLineTextView rightArrowTwoLineTextView = ((td6) getMBinding()).C;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(this.startTime.c), Integer.valueOf(this.startTime.d)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        rightArrowTwoLineTextView.setRemindText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTimeValue(boolean isStart, int hour, int minute) {
        t64 t64Var = this.startTimeCal;
        t64 t64Var2 = this.startTime;
        t64Var.d = t64Var2.d;
        t64Var.c = t64Var2.c;
        t64 t64Var3 = this.endTimeCal;
        t64 t64Var4 = this.endTime;
        t64Var3.d = t64Var4.d;
        t64Var3.c = t64Var4.c;
        if (isStart) {
            t64Var.c = hour;
            t64Var.d = minute;
        } else {
            t64Var3.c = hour;
            t64Var3.d = minute;
        }
        if (ffp.a(t64Var.c, t64Var.d, t64Var3.c, t64Var3.d) < 3600000) {
            if (isStart) {
                t64 t64Var5 = this.endTimeCal;
                t64 t64Var6 = this.startTimeCal;
                t64Var5.c = (t64Var6.c + 1) % 24;
                t64Var5.d = t64Var6.d;
            } else {
                t64 t64Var7 = this.startTimeCal;
                t64 t64Var8 = this.endTimeCal;
                t64Var7.c = (t64Var8.c + 23) % 24;
                t64Var7.d = t64Var8.d;
            }
        }
        syncInfo();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull td6 td6Var) {
        Intrinsics.checkNotNullParameter(td6Var, "<this>");
        setTitle(wzi.R);
        td6Var.D.setOnClickListener(new View.OnClickListener() { // from class: x6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AODSettingFragment.bindView$lambda$0(this.f38737a, view);
            }
        });
        td6Var.C.setOnClickListener(new View.OnClickListener() { // from class: a7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AODSettingFragment.bindView$lambda$1(this.f697a, view);
            }
        });
        td6Var.A.setOnClickListener(new View.OnClickListener() { // from class: b7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AODSettingFragment.bindView$lambda$2(this.f3872a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        List<String> list = this.mAODStateItem;
        String string = getString(wzi.T);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        list.add(string);
        List<String> list2 = this.mAODStateItem;
        String string2 = getString(wzi.U);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        list2.add(string2);
        List<String> list3 = this.mAODStateItem;
        String string3 = getString(wzi.S);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        list3.add(string3);
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 5, null);
        ((AODSettingViewModel) getMViewModel()).getAODSetting();
        ((AODSettingViewModel) getMViewModel()).getMTimingSetting().observe(getViewLifecycleOwner(), new Observer() { // from class: r6
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                AODSettingFragment.onViewCreated$lambda$3(this.f32223a, (yxo) obj);
            }
        });
        ((AODSettingViewModel) getMViewModel()).getUpdateResult().observe(getViewLifecycleOwner(), new Observer() { // from class: s6
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                AODSettingFragment.onViewCreated$lambda$4(this.f33334a, (Boolean) obj);
            }
        });
    }
}
