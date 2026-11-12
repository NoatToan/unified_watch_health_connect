package com.xiaomi.fitness.health.sleep.ui.holder;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.health.connect.client.records.OvulationTestRecord;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.interfere.SleepInterfereDetailFragment;
import com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportFragment;
import com.xiaomi.fitness.health.sleep.interfere.SleepInterfereSetFragment;
import com.xiaomi.fitness.health.sleep.interfere.net.CurrentTaskSummary;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterferePlan;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepInterfereBizHolder;
import defpackage.av6;
import defpackage.c0j;
import defpackage.eri;
import defpackage.qxi;
import defpackage.xbe;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J2\u0010\t\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepInterfereBizHolder;", "", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", OvulationTestRecord.Result.POSITIVE, "", "resultCallback", "showOpenSyncDialog", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterferePlan;", "plan", "updateSleepInterferePlan", "(Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterferePlan;)V", "Lxbe;", "binding", "Lxbe;", "Landroid/view/View;", "createEntry", "Landroid/view/View;", "<init>", "(Lxbe;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepInterfereBizHolder {

    @NotNull
    private final xbe binding;

    @NotNull
    private final View createEntry;

    public SleepInterfereBizHolder(@NotNull xbe binding, @NotNull View createEntry) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(createEntry, "createEntry");
        this.binding = binding;
        this.createEntry = createEntry;
    }

    private final void showOpenSyncDialog(final Function1<? super Boolean, Unit> resultCallback) {
        if (RegionPreference.INSTANCE.getSyncWeb()) {
            resultCallback.invoke2(Boolean.TRUE);
            return;
        }
        if (this.binding.getRoot().getContext() instanceof FragmentActivity) {
            Context context = this.binding.getRoot().getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            CommonDialog commonDialogCreate = (CommonDialog) supportFragmentManager.l0("open_sync_guide");
            if (commonDialogCreate == null || !commonDialogCreate.isShowing()) {
                if (commonDialogCreate == null) {
                    commonDialogCreate = new CommonDialog.c("open_sync_guide").setDialogTitle(c0j.Ol).setDialogDescription(c0j.og).setNegativeText(c0j.c).setPositiveText(c0j.Va).setCancelable(false).setCanceledOnBackPressed(false).setCanceledOnTouchOutside(false).create();
                    Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
                }
                commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.sleep.ui.holder.SleepInterfereBizHolder.showOpenSyncDialog.1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        super.onDialogClick(dialogName, dialog, which);
                        if (which != -1) {
                            resultCallback.invoke2(Boolean.FALSE);
                        } else {
                            RegionPreference.INSTANCE.setSyncWeb(true);
                            resultCallback.invoke2(Boolean.TRUE);
                        }
                    }
                });
                commonDialogCreate.showIfNeed(supportFragmentManager);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateSleepInterferePlan$lambda$4$lambda$0(SleepInterfereBizHolder this$0, SleepInterferePlan sleepInterferePlan, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepInterfereReportFragment.Companion companion = SleepInterfereReportFragment.INSTANCE;
        Context context = this$0.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        companion.launch(context, sleepInterferePlan.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateSleepInterferePlan$lambda$4$lambda$1(SleepInterfereBizHolder this$0, SleepInterferePlan sleepInterferePlan, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepInterfereDetailFragment.Companion companion = SleepInterfereDetailFragment.INSTANCE;
        Context context = this$0.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        companion.launch(context, sleepInterferePlan.getId(), sleepInterferePlan.getStartDate(), sleepInterferePlan.getEndDate(), sleepInterferePlan.getTargetBedtime(), sleepInterferePlan.getTargetWakeUpTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateSleepInterferePlan$lambda$4$lambda$3(final SleepInterfereBizHolder this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showOpenSyncDialog(new Function1() { // from class: enm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepInterfereBizHolder.updateSleepInterferePlan$lambda$4$lambda$3$lambda$2(this.f16848a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateSleepInterferePlan$lambda$4$lambda$3$lambda$2(SleepInterfereBizHolder this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            SleepInterfereSetFragment.Companion companion = SleepInterfereSetFragment.INSTANCE;
            Context context = this$0.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            companion.launch(context);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateSleepInterferePlan$lambda$7$lambda$6(final SleepInterfereBizHolder this_run, View view) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        this_run.showOpenSyncDialog(new Function1() { // from class: fnm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepInterfereBizHolder.updateSleepInterferePlan$lambda$7$lambda$6$lambda$5(this.f17963a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateSleepInterferePlan$lambda$7$lambda$6$lambda$5(SleepInterfereBizHolder this_run, boolean z) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        if (z) {
            SleepInterfereSetFragment.Companion companion = SleepInterfereSetFragment.INSTANCE;
            Context context = this_run.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            companion.launch(context);
        }
        return Unit.INSTANCE;
    }

    public final void updateSleepInterferePlan(@Nullable final SleepInterferePlan plan) {
        ViewExtKt.gone(this.createEntry);
        ((TextView) this.createEntry.findViewById(eri.sf)).setText(ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), qxi.B0, 21, 21));
        Logger.d("SleepInterfereBizHolder", "status:" + (plan != null ? Integer.valueOf(plan.getStatus()) : null) + " - " + (plan != null ? Boolean.valueOf(plan.isDisplay()) : null));
        if (plan == null) {
            View root = this.binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ViewExtKt.gone(root);
            ViewExtKt.visible(this.createEntry);
            this.createEntry.setOnClickListener(new View.OnClickListener() { // from class: dnm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepInterfereBizHolder.updateSleepInterferePlan$lambda$7$lambda$6(this.f15726a, view);
                }
            });
            return;
        }
        View root2 = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        ViewExtKt.visible(root2);
        LinearLayout viewInterfereReport = this.binding.G;
        Intrinsics.checkNotNullExpressionValue(viewInterfereReport, "viewInterfereReport");
        ViewExtKt.gone(viewInterfereReport);
        FrameLayout sleepInterfereEntryProgressLayout = this.binding.C;
        Intrinsics.checkNotNullExpressionValue(sleepInterfereEntryProgressLayout, "sleepInterfereEntryProgressLayout");
        ViewExtKt.gone(sleepInterfereEntryProgressLayout);
        if (plan.getStatus() == 1 && plan.isDisplay()) {
            LinearLayout viewInterfereReport2 = this.binding.G;
            Intrinsics.checkNotNullExpressionValue(viewInterfereReport2, "viewInterfereReport");
            ViewExtKt.visible(viewInterfereReport2);
            this.binding.E.setText(ApplicationExtKt.getApplication().getString(c0j.qg));
            this.binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: anm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepInterfereBizHolder.updateSleepInterferePlan$lambda$4$lambda$0(this.f3288a, plan, view);
                }
            });
            return;
        }
        if (plan.getStatus() != 0) {
            View root3 = this.binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root3, "getRoot(...)");
            ViewExtKt.gone(root3);
            ViewExtKt.visible(this.createEntry);
            this.createEntry.setOnClickListener(new View.OnClickListener() { // from class: cnm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepInterfereBizHolder.updateSleepInterferePlan$lambda$4$lambda$3(this.f5581a, view);
                }
            });
            return;
        }
        FrameLayout sleepInterfereEntryProgressLayout2 = this.binding.C;
        Intrinsics.checkNotNullExpressionValue(sleepInterfereEntryProgressLayout2, "sleepInterfereEntryProgressLayout");
        ViewExtKt.visible(sleepInterfereEntryProgressLayout2);
        CurrentTaskSummary currentTaskSummary = plan.getCurrentTaskSummary();
        int day = currentTaskSummary != null ? currentTaskSummary.getDay() : 1;
        this.binding.E.setText(ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), qxi.A0, day, Integer.valueOf(day)));
        CurrentTaskSummary currentTaskSummary2 = plan.getCurrentTaskSummary();
        int progress = currentTaskSummary2 != null ? currentTaskSummary2.getProgress() : 0;
        this.binding.B.updateProgress(progress / 100);
        this.binding.D.setText(progress + "%");
        this.binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: bnm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepInterfereBizHolder.updateSleepInterferePlan$lambda$4$lambda$1(this.f4403a, plan, view);
            }
        });
    }
}
