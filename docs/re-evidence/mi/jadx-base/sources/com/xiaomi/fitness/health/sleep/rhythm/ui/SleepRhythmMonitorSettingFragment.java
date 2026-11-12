package com.xiaomi.fitness.health.sleep.rhythm.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fit.fitness.export.data.project.SleepRhythmReport;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.rhythm.MonitorCycle;
import com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmMonitorViewModel;
import com.xiaomi.fitness.health.sleep.rhythm.SleepRhythmPreference;
import com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmMonitorSettingFragment;
import com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingFragment;
import defpackage.av6;
import defpackage.c0j;
import defpackage.iji;
import defpackage.jrk;
import defpackage.jui;
import defpackage.pni;
import defpackage.qxi;
import defpackage.v1c;
import defpackage.vt9;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0019\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J!\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/ui/SleepRhythmMonitorSettingFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/sleep/rhythm/SleepRhythmMonitorViewModel;", "Lv1c;", "", "initView", "()V", "registerObserver", "showOpenAssistDialog", "showCycleTipDialogIfNeed", "", "cycle", "updateMonitorView", "(I)V", "requestMonitorConfig", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "selectType", "I", "", "assistOpen", "Ljava/lang/Boolean;", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepRhythmMonitorSettingFragment extends Hilt_SleepRhythmMonitorSettingFragment<SleepRhythmMonitorViewModel, v1c> {
    public static final int RESULT_OPEN_MONITOR_SUCCESS = 200;

    @Nullable
    private Boolean assistOpen;
    private int selectType;

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((v1c) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: hum
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepRhythmMonitorSettingFragment.initView$lambda$0(this.f20479a, view);
            }
        });
        ((v1c) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: ium
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepRhythmMonitorSettingFragment.initView$lambda$1(this.f22109a, view);
            }
        });
        ((v1c) getMBinding()).L.setOnClickListener(new View.OnClickListener() { // from class: jum
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepRhythmMonitorSettingFragment.initView$lambda$2(this.f23153a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(SleepRhythmMonitorSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectType = 28;
        this$0.updateMonitorView(28);
        this$0.showCycleTipDialogIfNeed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(SleepRhythmMonitorSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectType = 14;
        this$0.updateMonitorView(14);
        this$0.showCycleTipDialogIfNeed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$2(SleepRhythmMonitorSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.selectType == 0) {
            Context context = this$0.getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, c0j.Gj);
                return;
            }
            return;
        }
        PageState.DefaultImpls.showLoading$default(this$0, null, 0, false, 3, null);
        SleepRhythmMonitorViewModel sleepRhythmMonitorViewModel = (SleepRhythmMonitorViewModel) this$0.getMViewModel();
        int i = this$0.selectType;
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        sleepRhythmMonitorViewModel.setSleepRhythmMonitor(new SleepRhythmReport(0, i, TimeDateUtil.changZeroOfTheDay(localDateNow)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void registerObserver() {
        ((SleepRhythmMonitorViewModel) getMViewModel()).getGetMonitorResultLiveData().observe(getViewLifecycleOwner(), new SleepRhythmMonitorSettingFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: eum
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepRhythmMonitorSettingFragment.registerObserver$lambda$3(this.f17081a, (Pair) obj);
            }
        }));
        ((SleepRhythmMonitorViewModel) getMViewModel()).getSetMonitorResultLiveData().observe(getViewLifecycleOwner(), new SleepRhythmMonitorSettingFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: fum
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepRhythmMonitorSettingFragment.registerObserver$lambda$4(this.f18259a, (Pair) obj);
            }
        }));
        ((SleepRhythmMonitorViewModel) getMViewModel()).getSleepAssistSwitchLiveData().observe(getViewLifecycleOwner(), new SleepRhythmMonitorSettingFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: gum
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepRhythmMonitorSettingFragment.registerObserver$lambda$5(this.f19347a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerObserver$lambda$3(SleepRhythmMonitorSettingFragment this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        int iIntValue = ((Number) pair.getFirst()).intValue();
        vt9 vt9Var = (vt9) pair.getSecond();
        int i = 0;
        if (iIntValue == 0) {
            boolean z = vt9Var != null ? vt9Var.c : false;
            Integer numValueOf = vt9Var != null ? Integer.valueOf(vt9Var.d) : null;
            if (z && numValueOf != null && numValueOf.intValue() == 28) {
                i = 28;
            } else if (z && numValueOf != null && numValueOf.intValue() == 14) {
                i = 14;
            }
        } else {
            Context context = this$0.getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, c0j.f4801r);
            }
        }
        this$0.selectType = i;
        this$0.updateMonitorView(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerObserver$lambda$4(SleepRhythmMonitorSettingFragment this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialogForce();
        int iIntValue = ((Number) pair.getFirst()).intValue();
        if (iIntValue == 0) {
            this$0.selectType = ((Number) pair.getSecond()).intValue();
            if (Intrinsics.areEqual(this$0.assistOpen, Boolean.TRUE)) {
                FragmentActivity mActivity = this$0.getMActivity();
                if (mActivity != null) {
                    mActivity.setResult(200);
                }
                FragmentActivity mActivity2 = this$0.getMActivity();
                if (mActivity2 != null) {
                    mActivity2.finish();
                }
            } else {
                this$0.showOpenAssistDialog();
            }
        } else if (iIntValue != 1000) {
            Context context = this$0.getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, c0j.f4801r);
            }
        } else {
            Context context2 = this$0.getContext();
            if (context2 != null) {
                ToastExtKt.toastShort(context2, c0j.Bj);
            }
        }
        this$0.updateMonitorView(this$0.selectType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerObserver$lambda$5(SleepRhythmMonitorSettingFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.assistOpen = bool;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestMonitorConfig() {
        ((SleepRhythmMonitorViewModel) getMViewModel()).requestSleepRhythmMonitor();
        ((SleepRhythmMonitorViewModel) getMViewModel()).requestShowSleepAssistStatus();
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
    }

    private final void showCycleTipDialogIfNeed() {
        if (SleepRhythmPreference.INSTANCE.isShowCycleSelectTip()) {
            return;
        }
        CommonDialog commonDialogCreate = (CommonDialog) getChildFragmentManager().l0("cycle_select_desc_dialog");
        if (commonDialogCreate == null || !commonDialogCreate.isShowing()) {
            if (commonDialogCreate == null) {
                commonDialogCreate = new CommonDialog.c("cycle_select_desc_dialog").setDialogDescription(c0j.si).setPositiveText(c0j.I7).setCancelable(false).setCanceledOnBackPressed(false).setCanceledOnTouchOutside(false).create();
                Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
            }
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmMonitorSettingFragment.showCycleTipDialogIfNeed.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    SleepRhythmPreference.INSTANCE.setShowCycleSelectTip(true);
                }
            });
            commonDialogCreate.showIfNeed(getChildFragmentManager());
        }
    }

    private final void showOpenAssistDialog() {
        CommonDialog commonDialogCreate = (CommonDialog) getChildFragmentManager().l0("open_assist_guide");
        if (commonDialogCreate == null || !commonDialogCreate.isShowing()) {
            if (commonDialogCreate == null) {
                commonDialogCreate = new CommonDialog.c("open_assist_guide").setDialogTitle(c0j.Zi).setDialogDescription(c0j.Wi).setNegativeText(c0j.Xi).setPositiveText(c0j.Yi).setCancelable(false).setCanceledOnBackPressed(false).setCanceledOnTouchOutside(false).create();
                Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
            }
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.sleep.rhythm.ui.SleepRhythmMonitorSettingFragment.showOpenAssistDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -1) {
                        BaseFragmentExKt.gotoPage(SleepRhythmMonitorSettingFragment.this, SleepSettingFragment.class, null);
                    }
                    FragmentActivity mActivity = SleepRhythmMonitorSettingFragment.this.getMActivity();
                    if (mActivity != null) {
                        mActivity.setResult(200);
                    }
                    SleepRhythmMonitorSettingFragment.this.finish();
                }
            });
            commonDialogCreate.showIfNeed(getChildFragmentManager());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateMonitorView(@MonitorCycle int cycle) {
        boolean z = cycle == 28;
        ((v1c) getMBinding()).A.setBackground(jrk.f(getResources(), z ? pni.q1 : pni.p1, null));
        AppCompatImageView ivSelectFirst = ((v1c) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(ivSelectFirst, "ivSelectFirst");
        ViewExtKt.setVisible(ivSelectFirst, z);
        ((v1c) getMBinding()).J.setTextColor(BaseFragmentExtKt.getColor(this, z ? iji.Y : iji.r3));
        ((v1c) getMBinding()).H.setTextColor(BaseFragmentExtKt.getColor(this, z ? iji.Y : iji.x3));
        boolean z2 = cycle == 14;
        ((v1c) getMBinding()).B.setBackground(jrk.f(getResources(), z2 ? pni.q1 : pni.p1, null));
        AppCompatImageView ivSelectSecond = ((v1c) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(ivSelectSecond, "ivSelectSecond");
        ViewExtKt.setVisible(ivSelectSecond, z2);
        ((v1c) getMBinding()).K.setTextColor(BaseFragmentExtKt.getColor(this, z2 ? iji.Y : iji.r3));
        ((v1c) getMBinding()).I.setTextColor(BaseFragmentExtKt.getColor(this, z2 ? iji.Y : iji.x3));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.w5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarExpandState(0);
        setActionBarResizeable(false);
        setTitle(c0j.wj);
        ((v1c) getMBinding()).J.setText(getResources().getQuantityString(qxi.common_unit_day_desc, 28, 28));
        ((v1c) getMBinding()).K.setText(getResources().getQuantityString(qxi.common_unit_day_desc, 14, 14));
        updateMonitorView(this.selectType);
        initView();
        registerObserver();
        requestMonitorConfig();
    }
}
