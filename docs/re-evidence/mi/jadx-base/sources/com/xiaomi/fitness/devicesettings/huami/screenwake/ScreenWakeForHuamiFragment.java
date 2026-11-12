package com.xiaomi.fitness.devicesettings.huami.screenwake;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Observer;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment;
import com.xiaomi.fitness.devicesettings.common.TimePickerDialog;
import com.xiaomi.fitness.devicesettings.huami.screenwake.ScreenWakeForHuamiFragment;
import com.xiaomi.fitness.settingitem.settingitem.LiftWristBrightView;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import defpackage.av6;
import defpackage.eui;
import defpackage.ffp;
import defpackage.qe6;
import defpackage.wzi;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001$B\u0007¢\u0006\u0004\b#\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0006J!\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001c\u0010\u0006R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/screenwake/ScreenWakeForHuamiFragment;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/huami/screenwake/ScreenWakeForHuamiViewModel;", "Lqe6;", "", "alertWristSensitive", "()V", "", "isStart", "alertTimePick", "(Z)V", "updateLegalTime", "alertWristStatus", "", "which", "dealWristStatus", "(I)V", "updateLiftWristBrightConfig", "setViewStatus", "startAndStopIsSameToday", "()Z", "initActionBar", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "Lcom/xiaomi/fitness/settingitem/settingitem/LiftWristBrightView;", "wristConfig", "Lcom/xiaomi/fitness/settingitem/settingitem/LiftWristBrightView;", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ScreenWakeForHuamiFragment extends BaseLoadableBindingFragment<ScreenWakeForHuamiViewModel, qe6> {

    @NotNull
    private static final String TAG = "ScreenWakeForHuamiFragment";

    @NotNull
    private LiftWristBrightView wristConfig = new LiftWristBrightView();

    private final void alertTimePick(final boolean isStart) {
        LiftWristBrightView liftWristBrightView = this.wristConfig;
        if (liftWristBrightView == null) {
            return;
        }
        final TimePickerDialog currentMinute = TimePickerDialog.INSTANCE.defaultBuilder("time picker").setDialogTitle(isStart ? wzi.Fa : wzi.za).setNegativeText(wzi.e).setPositiveText(wzi.g).create().setIs24HourView(true).setCurrentHour(isStart ? liftWristBrightView.getStart() / 60 : liftWristBrightView.getStop() / 60).setCurrentMinute(isStart ? this.wristConfig.getStart() % 60 : this.wristConfig.getStop() % 60);
        currentMinute.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.huami.screenwake.ScreenWakeForHuamiFragment.alertTimePick.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    if (isStart) {
                        this.wristConfig.setStart((currentMinute.getCurrentHour() * 60) + currentMinute.getCurrentMinute());
                    } else {
                        this.wristConfig.setStop((currentMinute.getCurrentHour() * 60) + currentMinute.getCurrentMinute());
                    }
                    this.updateLegalTime(isStart);
                    this.updateLiftWristBrightConfig();
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        currentMinute.showIfNeed(getParentFragmentManager());
    }

    private final void alertWristSensitive() {
        String string = getString(wzi.Ca);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(wzi.Ea);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        new CommonDialog.c("commonDialog").setDialogTitle(wzi.Ba).setItems(new String[]{string, string2}).setItemsCheckedIndex(this.wristConfig.getSensitivity() == 0 ? 0 : 1).setCanceledOnTouchOutside(true).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.huami.screenwake.ScreenWakeForHuamiFragment.alertWristSensitive.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                ScreenWakeForHuamiFragment.this.wristConfig.setSensitivity(which);
                ScreenWakeForHuamiFragment.this.updateLiftWristBrightConfig();
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }).show(getParentFragmentManager(), "");
    }

    private final void alertWristStatus() {
        int i;
        String string = getString(wzi.ya);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(wzi.wa);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = getString(wzi.va);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        if (this.wristConfig.isEnable()) {
            i = this.wristConfig.isAllday() ? 0 : 1;
        } else {
            i = 2;
        }
        new CommonDialog.c("commonDialog").setDialogTitle(wzi.Aa).setItems(new String[]{string, string2, string3}).setItemsCheckedIndex(i).setCanceledOnTouchOutside(true).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.huami.screenwake.ScreenWakeForHuamiFragment.alertWristStatus.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                ScreenWakeForHuamiFragment.this.dealWristStatus(which);
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }).show(getParentFragmentManager(), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dealWristStatus(int which) {
        if (which == 0) {
            this.wristConfig.setEnable(true);
            this.wristConfig.setAllday(true);
        } else if (which == 1) {
            this.wristConfig.setEnable(true);
            this.wristConfig.setAllday(false);
        } else if (which == 2) {
            this.wristConfig.setEnable(false);
            this.wristConfig.setAllday(false);
        }
        updateLiftWristBrightConfig();
    }

    private final void initActionBar() {
        setTitle(wzi.Aa);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(ScreenWakeForHuamiFragment this$0, LiftWristBrightView liftWristBrightView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.wristConfig = liftWristBrightView;
        this$0.setViewStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$1(ScreenWakeForHuamiFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.alertWristStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2(ScreenWakeForHuamiFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.alertTimePick(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$3(ScreenWakeForHuamiFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.alertTimePick(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$4(ScreenWakeForHuamiFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.alertWristSensitive();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setViewStatus() {
        String string;
        boolean z = false;
        ((qe6) getMBinding()).C.setEnabled(this.wristConfig.isEnable() && !this.wristConfig.isAllday());
        RightArrowTwoLineTextView rightArrowTwoLineTextView = ((qe6) getMBinding()).A;
        if (this.wristConfig.isEnable() && !this.wristConfig.isAllday()) {
            z = true;
        }
        rightArrowTwoLineTextView.setEnabled(z);
        ((qe6) getMBinding()).B.setEnabled(this.wristConfig.isEnable());
        if (this.wristConfig.isAllday()) {
            this.wristConfig.setStart(420);
            this.wristConfig.setStop(1320);
        }
        RightArrowTwoLineTextView rightArrowTwoLineTextView2 = ((qe6) getMBinding()).D;
        if (this.wristConfig.isEnable()) {
            string = this.wristConfig.isAllday() ? getString(wzi.ya) : getString(wzi.xa);
        } else {
            string = getString(wzi.va);
        }
        rightArrowTwoLineTextView2.setRemindText(string);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(this.wristConfig.getStart() / 60), Integer.valueOf(this.wristConfig.getStart() % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        ((qe6) getMBinding()).C.setRemindText(str);
        String str2 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(this.wristConfig.getStop() / 60), Integer.valueOf(this.wristConfig.getStop() % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        if (!startAndStopIsSameToday()) {
            str2 = getString(wzi.S5) + str2;
        }
        ((qe6) getMBinding()).A.setRemindText(str2);
        ((qe6) getMBinding()).B.setRemindText(this.wristConfig.getSensitivity() == 0 ? getString(wzi.Ca) : getString(wzi.Da));
    }

    private final boolean startAndStopIsSameToday() {
        if (this.wristConfig.getStop() / 60 > this.wristConfig.getStart() / 60) {
            return true;
        }
        return this.wristConfig.getStop() / 60 == this.wristConfig.getStart() / 60 && this.wristConfig.getStop() % 60 > this.wristConfig.getStart() % 60;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateLegalTime(boolean isStart) {
        if (ffp.a(this.wristConfig.getStart() / 60, this.wristConfig.getStart() % 60, this.wristConfig.getStop() / 60, this.wristConfig.getStop() % 60) < 3600000) {
            if (isStart) {
                LiftWristBrightView liftWristBrightView = this.wristConfig;
                liftWristBrightView.setStop(((((liftWristBrightView.getStart() / 60) + 1) % 24) * 60) + (this.wristConfig.getStart() % 60));
            } else {
                LiftWristBrightView liftWristBrightView2 = this.wristConfig;
                liftWristBrightView2.setStart(((((liftWristBrightView2.getStop() / 60) + 1) % 24) * 60) + (this.wristConfig.getStop() % 60));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateLiftWristBrightConfig() {
        setViewStatus();
        Logger.d(TAG, "updateLiftWristBrightConfig configJson=" + this.wristConfig);
        ((ScreenWakeForHuamiViewModel) getMViewModel()).syncLiftWristBrightConfig(this.wristConfig);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initActionBar();
        ((ScreenWakeForHuamiViewModel) getMViewModel()).getMHMLiftWristConfig().observe(getViewLifecycleOwner(), new Observer() { // from class: ohl
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ScreenWakeForHuamiFragment.onViewCreated$lambda$0(this.f29184a, (LiftWristBrightView) obj);
            }
        });
        ((ScreenWakeForHuamiViewModel) getMViewModel()).getScreenWakeConfig();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((qe6) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: phl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScreenWakeForHuamiFragment.setListener$lambda$1(this.f30401a, view);
            }
        });
        ((qe6) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: qhl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScreenWakeForHuamiFragment.setListener$lambda$2(this.f31528a, view);
            }
        });
        ((qe6) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: rhl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScreenWakeForHuamiFragment.setListener$lambda$3(this.f32552a, view);
            }
        });
        ((qe6) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: shl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScreenWakeForHuamiFragment.setListener$lambda$4(this.f33651a, view);
            }
        });
    }
}
